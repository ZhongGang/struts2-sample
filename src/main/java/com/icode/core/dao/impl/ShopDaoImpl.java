package com.icode.core.dao.impl;

import com.icode.core.dao.ShopDao;
import com.icode.core.model.Shop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-15
 * Time: 下午11:41
 */
@Repository
public class ShopDaoImpl implements ShopDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveOrUpdate(Shop shop) {
        Session session = sessionFactory.openSession();
        session.saveOrUpdate(shop);
    }
}
