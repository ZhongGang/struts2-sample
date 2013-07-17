package com.icode.core.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    @Basic(fetch = FetchType.LAZY)
    private String description;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "shop_id")
    private List<Product> products = new ArrayList<Product>();

    public Shop() {
    }

    public Shop(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(Product product) {
        this.products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}
