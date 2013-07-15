package com.icode.core.service.impl;

import com.icode.core.dao.ShopDao;
import com.icode.core.model.Shop;
import com.icode.core.service.ShopService;
import com.icode.web.dto.ShopDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-15
 * Time: 下午11:41
 */
@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopDao shopDao;

    @Override
    public void persist(ShopDTO shopDTO) {
        Shop shop = shopDTO.toShop();
        shopDao.saveOrUpdate(shop);
    }
}
