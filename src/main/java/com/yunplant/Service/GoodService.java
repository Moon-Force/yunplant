package com.yunplant.Service;

import com.yunplant.Dao.GoodsMapper;
import com.yunplant.Entity.goods;
import com.yunplant.Entity.shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class GoodService {
    @Autowired
    private GoodsMapper goodsMapper;
    public List<goods> getGoodsList(int id) {
        List<goods> GoodList = goodsMapper.selectById(id);
        return GoodList;
//        for(shop shop:shopList){
//            shop.setImagesrc("http://localhost:8080/static/shopimg/"+imgsrc_uuid(shop.getName(),shop.getId())+".png");
//        }
//        return shopList;
    }
}
