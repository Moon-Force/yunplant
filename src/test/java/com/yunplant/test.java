package com.yunplant;

import com.yunplant.Entity.shop;
import com.yunplant.Dao.shopMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.UUID;

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
    @Test
    public void testuuid(){
        UUID uuid2 = UUID.nameUUIDFromBytes("example_name".getBytes());
        System.out.println("生成的UUID2为：" + uuid2.toString());
        UUID uuid3 = UUID.nameUUIDFromBytes("example_name".getBytes());
        System.out.println("生成的UUID2为：" + uuid3.toString());
    }
}
