package com.yunplant.Service;

import com.yunplant.Dao.shopMapper;
import com.yunplant.Entity.shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService {
    @Autowired
    private shopMapper shopMapper;
    public List<shop> getShopList() {
        return shopMapper.selectAll();
    }
}
