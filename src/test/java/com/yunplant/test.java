package com.yunplant;

import com.yunplant.Entity.shop;
import com.yunplant.Dao.shopMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class test {
    @Autowired
    shopMapper shopMapper1;

    @Test
    public void testList(){
        List<shop> userList = shopMapper1.selectAll();
        for (shop user : userList) {
            System.out.println(user);
        }
    }
}
