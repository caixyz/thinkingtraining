package org.cai.patterns.composite;

import lombok.Data;
import lombok.ToString;
import java.util.ArrayList;
import java.util.List;

/**
 * 雇员表
 * 对象包含子对象集合
 * @Author: caisijun
 * @Date: 2021/1/22 0022
 */
@Data
@ToString
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subList;

    public void add(Employee e){
        subList.add(e);
    }
    public void remove(Employee e){
        subList.remove(e);
    }

    //构造函数
    public Employee(String name,String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subList = new ArrayList<Employee>();
    }
}
