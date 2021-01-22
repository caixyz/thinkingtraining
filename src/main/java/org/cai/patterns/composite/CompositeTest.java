package org.cai.patterns.composite;

import org.junit.Test;

/**
 * 组合模式
 * 多个对象组成对象树
 * 其优点 方便增加子节点
 * 其缺点 使用起来太费劲，得实例化一个对象再加入到摸个节点的子节点
 *
 * @Author: caisijun
 * @Date: 2021/1/22 0022
 */
public class CompositeTest {


    /**
     * result:
     * Employee(name=Robert, dept=Head Sales, salary=20000, subList=[Employee(name=Laura, dept=Marketing, salary=10000, subList=[]), Employee(name=Bob, dept=Marketing, salary=10000, subList=[])])
     * Employee(name=Laura, dept=Marketing, salary=10000, subList=[])
     * Employee(name=Bob, dept=Marketing, salary=10000, subList=[])
     * Employee(name=Michel, dept=Head Marketing, salary=20000, subList=[Employee(name=Richard, dept=Sales, salary=10000, subList=[]), Employee(name=Rob, dept=Sales, salary=10000, subList=[])])
     *
     */
    @Test
    public void TestComposite(){
        Employee CEO = new Employee("John","CEO", 30000);
        Employee headSales = new Employee("Robert","Head Sales", 20000);
        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);
        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);
        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(clerk1);
        headSales.add(clerk2);

        headMarketing.add(salesExecutive1);
        headMarketing.add(salesExecutive2);

        CEO.getSubList().stream().forEach(c->{
            System.out.println(c);
            c.getSubList().stream().forEach(System.out::println);
        });

    }
}
