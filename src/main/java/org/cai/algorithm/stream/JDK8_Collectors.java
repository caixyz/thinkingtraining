package org.cai.algorithm.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Collectors
 * @Author: caisijun
 * @Date: 2020/12/9 0009
 */
public class JDK8_Collectors {
    List<Apple> appleList=null;

    @Before
    public void inid(){
        appleList = Arrays.asList(
                new Apple(null, 10),
                new Apple("green", 20),
                new Apple("red", 30),
                new Apple("green", 9),
                new Apple("red", 6),
                new Apple("green", 50)
        );
    }

    /**
     * Collectors.groupingBy 字段分组
     * 定义： public static <T, K> Collector<T, ?, Map<K, List<T>>>
     *     groupingBy(Function<? super T, ? extends K> classifier)
     *
     *  results:
     *  {red=[Apple(color=red, weight=30), Apple(color=red, weight=6)], =[Apple(color=, weight=10)],
     *  green=[Apple(color=green, weight=20), Apple(color=green, weight=9), Apple(color=green, weight=50)]}
     *
     *  other：Optional.ofNullable 过滤null数据 key
     */
    @Test
    public void groupingBy(){
      Map<Optional<String>,List<Apple>> listMap= appleList.stream().collect(Collectors.groupingBy(k-> Optional.ofNullable(k.getColor())));
      System.out.println(listMap);

        final Map<Character, List<String>> names = Stream.of("Alex", "Bob", "David", "Amy")
                .collect(Collectors.groupingBy(v -> v.charAt(0)));
        System.out.println(names);
    }

    /**
     * partitioningBy 根据字段内容分组，but 只能分2组，就是true一组，false一组
     * 定义：public static <T> Collector<T, ?, Map<Boolean, List<T>>> partitioningBy(Predicate<? super T> predicate)
     * results：
     * {false=[1, 3, 5, 7, 9], true=[2, 4, 6, 8]}
     * {false=[Apple(color=null, weight=10), Apple(color=green, weight=9), Apple(color=red, weight=6)], true=[Apple(color=green, weight=20), Apple(color=red, weight=30), Apple(color=green, weight=50)]}
     */
    @Test
    public void partitioningBy(){
        List<Integer> integers =Arrays.asList(1,2,3,4,5,6,7,8,9);
        Map<Boolean,List<Integer>> map=integers.stream().collect(Collectors.partitioningBy(p->p%2==0));
        System.out.println(map);
        Map<Boolean,List<Apple>> listMap=appleList.stream().collect(Collectors.partitioningBy(p->p.getWeight()>10));
        System.out.println(listMap);

    }

    /**
     * 测试 自定义高阶函数
     * 函数定义：static <T> Predicate<T> notEqual(T t)
     *
     * results：
     * 2
     * 3
     * 4
     * 3
     * ===========================================
     * asdf
     * asd
     * sdf
     */
    @Test
    public void highOrderFunctionTest(){
        List<Integer> list=Arrays.asList(1,2,3,4,3);
        list.stream().filter(notEqual(1)).forEach(System.out::println);
        System.out.println("===========================================");
        List<String> list2=Arrays.asList("asdf","asd","sdf");
        list2.stream().filter(notEqual("sd")).forEach(System.out::println);

    }

    /**
     * 自定义 不相等 谓词
     * @param t 入参
     * @param <T> 出参
     * @return
     */
    public static <T> Predicate<T> notEqual(T t) {
        return (v) -> !Objects.equals(v, t);
    }

    /**
     * toSet() 返回 Set<R> 数据
     * results:
     * Alex
     * Bob
     * David
     * Amy
     */
    @Test
    public void toSet(){
     Set<String> strings = Stream.of("Alex", "Bob", "David", "Amy", "Amy")
                .collect(Collectors.toSet());
        strings.stream().forEach(System.out::println);
    }


}
