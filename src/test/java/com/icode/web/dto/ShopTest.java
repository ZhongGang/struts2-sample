package com.icode.web.dto;

import com.icode.core.model.Product;
import com.icode.core.model.Shop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

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
    @Rollback(value = false)
    public void testShop() throws Exception {
        Session session = sessionFactory.openSession();
        for (int i = 1; i < 2; i++) {
            Shop shop = new Shop("Shop" + i, "The description of shop " + i);
            for (int j = 1; j < 4; j++) {
                Product product = new Product("Product" + j + " in shop " + i);
                shop.add(product);
            }
            session.saveOrUpdate(shop);
        }

        session.flush();
        session.clear();

        Shop shop = (Shop) session.byId(Shop.class).getReference(1);

//        session.close();
//
//        session = sessionFactory.openSession();

        System.out.println("~~~~~~~~~~~~~" + shop.getClass() + "~~~~~~~~~~");
//        Assert.assertEquals(shop, shop);

        shop = (Shop) session.byId(Shop.class).load(1);

        shop = (Shop) session.byId(Shop.class).load(1);

        session.refresh(shop);

        System.out.println("~~~~~~~~~~~~~" + shop.getClass() + "~~~~~~~~~~");

    }

}
