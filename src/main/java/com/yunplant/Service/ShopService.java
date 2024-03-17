package com.yunplant.Service;

import com.yunplant.Dao.shopMapper;
import com.yunplant.Entity.shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.yunplant.Util.imgsrc_uuid.imgsrc_uuid;

@Service
public class ShopService {
    @Autowired
    private shopMapper shopMapper;
    public List<shop> getShopList() {
        List<shop> shopList= shopMapper.selectAll();
        for(shop shop:shopList){
            shop.setImagesrc("http://localhost:8080/static/shopimg/"+imgsrc_uuid(shop.getName(),shop.getId())+".jpg");
        }
        return shopList;
    }
}
