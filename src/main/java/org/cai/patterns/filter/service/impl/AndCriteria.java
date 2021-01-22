package org.cai.patterns.filter.service.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cai.patterns.filter.beans.Person;
import org.cai.patterns.filter.service.Criteria;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 一个数据源 两次 and 过滤数据
 * @Author: caisijun
 * @Date: 2021/1/22 0022
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> personList1= criteria.meetCriteria(personList);
        return otherCriteria.meetCriteria(personList1);
    }
}
