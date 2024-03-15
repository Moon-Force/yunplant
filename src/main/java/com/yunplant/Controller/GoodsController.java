package com.yunplant.Controller;

import com.yunplant.Entity.goods;
import com.yunplant.Service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/goods")
@ResponseBody
public class GoodsController {
    @Autowired
    private GoodService goodService;

    @GetMapping("/goodlist/{id}")
    public List<goods> getgoods(@PathVariable int id) {
        return goodService.getGoodsList(id);
    }
}
