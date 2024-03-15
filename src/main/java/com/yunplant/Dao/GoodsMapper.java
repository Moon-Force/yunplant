package com.yunplant.Dao;


import com.yunplant.Entity.goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface GoodsMapper {
    List<goods> selectById(@Param("id") int id);
}

