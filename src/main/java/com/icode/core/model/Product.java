package com.icode.core.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-17
 * Time: 下午9:38
 */
@Entity
@Table
public class Product extends AbstractEntity {

    private String number;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;

    public String getNumber() {
        return number;
    }

    public Shop getShop() {
        return shop;
    }
}
