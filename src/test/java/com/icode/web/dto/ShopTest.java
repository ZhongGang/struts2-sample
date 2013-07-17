package com.icode.web.dto;

import com.icode.core.model.Product;
import com.icode.core.model.Shop;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-17
 * Time: 下午9:42
 */
@ContextConfiguration(value = "classpath:testApplicationContext.xml")
public class ShopTest extends AbstractTransactionalTestNGSpringContextTests {

    @Autowired
    private SessionFactory sessionFactory;

    @Test
    public void testShop() throws Exception {
        Session session = sessionFactory.openSession();
        for (int i = 1; i < 2; i++) {
            Shop shop = new Shop();
            for (int j = 1; j < 4; j++) {
                Product product = new Product();
                shop.add(product);
            }
            session.saveOrUpdate(shop);
        }

        session.flush();
        session.clear();

        Query query = session.createQuery("from Shop");
        List<Shop> shops = query.list();
        Assert.assertEquals(shops.size(), 99);
    }

}
