package org.cai;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * JDK8_Function action
 * @Author: caisijun
 * @Date: 2020/12/7 0007
 */
public class JDK8_Function {
    /**
     * 1.函数式编程，即吧方法当成argument .
     * type->Consumer（消费型）、supplier（供给型）、predicate（谓词型）、function（功能性）
     * eg. test(r -> r%2 ==0) ，就是一个集合{0,1,2,3,4,5,6,7,8,9,10} 将输出所有 能被2整除的 数据。
     */

    /**
     * 根据 Predicate（函数），过滤相关数据
     *
     * @param list
     * @param predicate
     */
    public void getIntegerPredicate(List<Integer> list, Predicate<Integer> predicate) {
        list.stream().forEach(
                i -> {
                    if (predicate.test(i))
                        System.out.println(i);
                }
        );
    }

    /**
     * （一）predicate
     * results:
     * 0
     * 2
     * 4
     * 6
     * 8
     * 10
     */
    @Test
    public void predicate() {
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        getIntegerPredicate(list, i -> i % 2 == 0);
    }

    /**
     * （二）consumer
     * results:
     * consumer:0
     * consumer:1
     * consumer:2
     * consumer:3
     * consumer:4
     * consumer:5
     * consumer:6
     * consumer:7
     * consumer:8
     * consumer:9
     * consumer:10
     */
    @Test
    public void consumer() {
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Consumer<Integer> integerConsumer = (t) -> System.out.println("consumer:" + t);
        list.stream().forEach(integerConsumer);
    }


    /**
     * （三）supplier
     * results:
     * 0.3491623118118432
     * 0.3730111232621013
     */
    @Test
    public void supplier() {
        Supplier<Double> supplier1 = () -> Math.random();
        System.out.println(supplier1.get());
        Supplier<Double> supplier2 = Math::random;
        System.out.println(supplier2.get());
    }

    /**
     * （四）function
     * results:
     f0
     f1
     f2
     f3
     f4
     f5
     f6
     f7
     f8
     f9
     f10
     */
    @Test
    public void function() {
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Function<Integer, String> function = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return "f" + integer;
            }
        };
        Function<Integer, String> function2 = (t)->"fun"+t;

        List<String> newList = list.stream().map(function2).collect(Collectors.toList());
        newList.stream().forEach(System.out::println);
    }
}
