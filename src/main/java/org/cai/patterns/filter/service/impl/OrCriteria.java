package org.cai.patterns.filter.service.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cai.patterns.filter.beans.Person;
import org.cai.patterns.filter.service.Criteria;

import java.util.List;

/**
 * 对两个数据源
 * @Author: caisijun
 * @Date: 2021/1/22 0022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaList = criteria.meetCriteria(personList);
        List<Person> otherCriteriaList = otherCriteria.meetCriteria(personList);

        for(Person person:otherCriteriaList)
        {
            if(!firstCriteriaList.contains(person)){
                firstCriteriaList.add(person);
            }
        }
        return firstCriteriaList;
    }
}
