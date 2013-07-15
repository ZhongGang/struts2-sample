package com.icode.web.action.shop;

import com.icode.core.service.ShopService;
import com.icode.web.dto.ShopDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: ZhongGang
 * Date: 13-7-15
 * Time: 下午11:43
 */
@Component
public class ShopAction {

    private ShopDTO shop;

    @Autowired
    private ShopService shopService;

    public String show() {
        return "show";
    }

    public String persist() {
        shopService.persist(shop);
        return "persist";
    }

    public void setShop(ShopDTO shop) {
        this.shop = shop;
    }
}
