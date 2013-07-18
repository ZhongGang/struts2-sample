package com.icode.core.model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-17
 * Time: 下午9:38
 */
@Entity
@SecondaryTables({
        @SecondaryTable(name = "product1"),
        @SecondaryTable(name = "product2")
})
public class Product extends AbstractEntity {

    @Column(table = "product1")
    private String number;

    @ManyToOne
    @JoinColumn(name = "shop_id", table = "product2")
    private Shop shop;

    public Product() {
    }

    public Product(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public Shop getShop() {
        return shop;
    }
}
