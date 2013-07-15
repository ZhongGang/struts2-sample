package com.icode.core.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-15
 * Time: 下午11:39
 */
@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue
    private Integer id;

}
