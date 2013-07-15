package com.icode.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-15
 * Time: 下午11:39
 */
@Entity
@Table
public class Shop extends AbstractEntity {

    private String name;

    @Column(columnDefinition = "text")
    private String description;

    public Shop() {
    }

    public Shop(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
