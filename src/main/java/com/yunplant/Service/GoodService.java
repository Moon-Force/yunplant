package com.yunplant.Service;

import com.yunplant.Dao.GoodsMapper;
import com.yunplant.Entity.goods;
import com.yunplant.Entity.shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import static com.yunplant.Util.imgsrc_uuid.imgsrc_uuid;


@Service
public class GoodService {
    @Autowired
    private GoodsMapper goodsMapper;
    public List<goods> getGoodsList(int id) {
        List<goods> GoodList = goodsMapper.selectById(id);
        for(goods good:GoodList){
            good.setImgsrc("http://localhost:8080/static/goodimg/"+imgsrc_uuid(good.getGood_name(),good.getGood_id())+".jpg");
        }
        return GoodList;
    }
}
