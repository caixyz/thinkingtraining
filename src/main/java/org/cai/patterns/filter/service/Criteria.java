package org.cai.patterns.filter.service;

import org.cai.patterns.filter.beans.Person;

import java.util.List;

/**
 * 标准接口
 * AndCriteria
 * @Author: caisijun
 * @Date: 2021/1/22 0022
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> personList);
}
