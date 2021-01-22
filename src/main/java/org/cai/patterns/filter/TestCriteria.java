package org.cai.patterns.filter;

import lombok.extern.slf4j.Slf4j;
import org.cai.patterns.filter.beans.Person;
import org.cai.patterns.filter.service.Criteria;
import org.cai.patterns.filter.service.impl.*;
import org.cai.patterns.prototype.beans.Circle;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器模式：就是定义一个接口，多个实现。对数据进行过滤
 * @Author: caisijun
 * @Date: 2021/1/22 0022
 */
public class TestCriteria {

    /**
     * results:
     * Males:
     * Person(name=Robert, gender=Male, maritalStatus=Single)
     * Person(name=John, gender=Male, maritalStatus=Married)
     * Person(name=Mike, gender=Male, maritalStatus=Single)
     * Person(name=Bobby, gender=Male, maritalStatus=Single)
     * Females:
     * Person(name=Laura, gender=Female, maritalStatus=Married)
     * Person(name=Diana, gender=Female, maritalStatus=Single)
     * Single Males:
     * Person(name=Robert, gender=Male, maritalStatus=Single)
     * Person(name=Mike, gender=Male, maritalStatus=Single)
     * Person(name=Bobby, gender=Male, maritalStatus=Single)
     * Single Or Females:
     * Person(name=Robert, gender=Male, maritalStatus=Single)
     * Person(name=Diana, gender=Female, maritalStatus=Single)
     * Person(name=Mike, gender=Male, maritalStatus=Single)
     * Person(name=Bobby, gender=Male, maritalStatus=Single)
     * Person(name=Laura, gender=Female, maritalStatus=Married)
     *
     */
    @Test
    public void TestOne(){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria male=new CriteriaMale();
        Criteria female=new CriteriaFemale();
        Criteria singer=new CriteriaSingle();
        Criteria singerMale=new AndCriteria(singer,male);
        Criteria singerOrFemale=new OrCriteria(singer,female);

        System.out.println("Males:");
        male.meetCriteria(persons).stream().forEach(System.out::println);
        System.out.println("Females:");
        female.meetCriteria(persons).stream().forEach(System.out::println);
        System.out.println("Single Males:");
        singerMale.meetCriteria(persons).stream().forEach(System.out::println);
        System.out.println("Single Or Females:");
        singerOrFemale.meetCriteria(persons).stream().forEach(System.out::println);
    }
}
