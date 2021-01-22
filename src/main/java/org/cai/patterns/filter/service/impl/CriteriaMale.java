package org.cai.patterns.filter.service.impl;

import org.cai.patterns.filter.beans.Person;
import org.cai.patterns.filter.service.Criteria;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 过滤male数据
 * @Author: caisijun
 * @Date: 2021/1/22 0022
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        return personList.stream().filter(person -> person.getGender().equalsIgnoreCase("MALE")).collect(Collectors.toList());
    }
}
