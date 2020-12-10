package org.cai;

import lombok.Data;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * stream action
 * @Author: caisijun
 * @Date: 2020/12/8 0008
 */
public class JDK8_Stream {
    List<Apple> appleList=null;

    @Before
    public void inid(){
        appleList = Arrays.asList(
                new Apple("", 1),
                new Apple("green", 2),
                new Apple("red", 3),
                new Apple("green", 4),
                new Apple("red", 5),

                new Apple("green", 6),
                new Apple("green", 7),
                new Apple("red", 8),
                new Apple("green", 9),
                new Apple("red", 10),

                new Apple("green", 11),
                new Apple("green", 12),
                new Apple("red", 13),
                new Apple("green", 14),
                new Apple("red", 15),

                new Apple("green", 16),
                new Apple("green", 17),
                new Apple("red", 18),
                new Apple("green", 19),
                new Apple("red", 20),

                new Apple("green", 21),
                new Apple("green", 22),
                new Apple("red", 23),
                new Apple("green", 24),
                new Apple("red", 5)
        );
    }


    /**
     * （一）filter 过滤器，结合谓词Predicate（断言某个字段值）
     *  接口定义： Stream<T> filter(Predicate<? super T> predicate);
     *
     *  result:36
     */
    @Test
    public void filter() {

        /**
         * 给定数据集合，求某个字段的和。涉及如下：
         * a.Optional.ofNullable ....orElse 就是传一个对象（可以为空）不为空则处理业务逻辑，为空则返回默认对象
         * b.stream.filter过滤数据
         * c.mapToInt 就是 IntStream 流
         * 其他：对集合和集合里的对象某个字段做非空判断
         */
        int sum = Optional.ofNullable(appleList).map(l -> l.stream().filter(t -> Optional.ofNullable(t.getColor()).map(c -> c.equals("red")).orElse(false)).mapToInt(Apple::getWeight).sum()).orElse(0);
        System.out.println(sum);
    }

    /**
     * （二）map 1:1 映射
     *  flatMap 1：n 映射
     *  mapToInt 1:1 映射 顾名思义 是数值类型的映射
     *  mapToLong 同上
     *  mapToDouble 同上
     * 接口定义<R> Stream<R> map(Function<? super T, ? extends R> mapper);
     * results:
     * 10
     * 20
     * 30
     * 9
     * 6
     * 50
     */
    @Test
    public void map(){
       Stream<Integer> intStream= appleList.stream().map(m->m.getWeight());
        intStream.forEach(System.out::println);
    }

    /**
     * flatMap 合并多个stream
     * 定义： <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);
     * 就是这句 Stream.of(appleList, apples);
     * flatMapToInt 映射 顾名思义 是数值类型的映射
     * flatMapToLong 同上
     * flatMapToDouble 同上
     *
     *
     * results：
     * Apple(color=null, weight=10)
     * Apple(color=green, weight=20)
     * Apple(color=red, weight=30)
     * Apple(color=green, weight=9)
     * Apple(color=red, weight=6)
     * Apple(color=green, weight=50)
     * Apple(color=te, weight=33)
     */
    @Test
    public void flatMap() {
        List<Apple> apples = Arrays.asList(new Apple("te", 33));
        Stream<List<Apple>> listStream = Stream.of(appleList, apples);
        Stream<Apple> appleStream = listStream.flatMap((childList) -> childList.stream());
        appleStream.forEach(System.out::println);
    }

    /**
     * （三）peek 循环处理 并 返回 new stream
     *  定义：Stream<T> peek(Consumer<? super T> action);
     * 配合 collect(Collectors.toList()
     * results:
     * Apple(color=青色, weight=20)
     * Apple(color=青色, weight=9)
     * Apple(color=青色, weight=50)
     */
    @Test
    public void peek() {
        List<Apple> apples = appleList.stream().filter(e -> e.getColor().equals("green")).peek(p -> p.setColor("青色")).collect(Collectors.toList());
        apples.stream().forEach(System.out::println);
    }

    /**
     * （四）reduce（减少）组合数据
     * 定义：T reduce(T identity, BinaryOperator<T> accumulator);
     * results:
     * 开始abc
     * sum:758
     * min:1
     * max:515
     * 125
     */
    @Test
    public void reduce() {
        Stream<String> stringStream = Stream.of("a", "b", "c");
        String re = stringStream.reduce("开始", String::concat);
        System.out.println(re);

        Stream<Integer> integerStream = Stream.of(1, 1, 51, 15, 56, 85, 34, 515);
        int sum = integerStream.reduce(Integer::sum).get();
        System.out.println("sum:" + sum);
        integerStream = Stream.of(1, 1, 51, 15, 56, 85, 34, 515);
        int min = integerStream.reduce(Integer::min).get();
        System.out.println("min:" + min);
        integerStream = Stream.of(1, 1, 51, 15, 56, 85, 34, 515);
        int max = integerStream.reduce(Integer::max).get();
        System.out.println("max:" + max);

        int weight_sum = appleList.stream().map(Apple::getWeight).reduce(Integer::sum).get();
        System.out.println(weight_sum);
    }

    /**
     * （五）limit 返回 前n个数据
     *  定义： Stream<T> skip(long n);
     */
    @Test
    public void limit(){
        appleList.stream().limit(3).forEach(System.out::println);
    }

    /**
     * （六）skip 跳过 n 个数据
     * 模拟分页
      */
    @Test
    public void skip(){
        int current=0;
        int size=10;
        appleList.stream().skip(current*10).limit(size).forEach(System.out::println);
    }

    /**
     * （七）sorted 排序
     *  定义：Stream<T> sorted(Comparator<? super T> comparator);
     * 实现 compareTo
     */
    @Test
    public void sorted() {
        List<Apple> list = appleList.stream().sorted((a, b) -> a.getWeight().compareTo(b.getWeight())).collect(Collectors.toList());
        list.stream().forEach(System.out::println);
    }

    /**
     * （八）collect 收集
     * 定义：
     * <R, A> R collect(Collector<? super T, A, R> collector);
     *
     *  results:
     *  Apple(color=red, weight=30)
     *  Apple(color=red, weight=6)
     */
    @Test
    public void collect(){
        List<Apple> list=appleList.stream().filter(f->f.getColor()=="red").collect(Collectors.toList());
        list.stream().forEach(System.out::println);
    }


}

@Data
class Apple {
    private String color;
    private Integer weight;

    public Apple(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }
}
