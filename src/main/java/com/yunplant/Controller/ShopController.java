package com.yunplant.Controller;

import com.yunplant.Entity.shop;
import com.yunplant.Service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/shop")
@ResponseBody
public class ShopController {
    @Autowired
    private ShopService shopService;

    @GetMapping("/shoplist")
    public List<shop> getShop() {
        return shopService.getShopList();
    }
}
