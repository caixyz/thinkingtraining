package org.cai.patterns.filter.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 人
 * @Author: caisijun
 * @Date: 2021/1/22 0022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
    /**
     * 名称
     */
    private String name;
    /**
     * 性别
     */
    private String gender;
    /**
     * 婚姻状态
     */
    private String maritalStatus;
}
