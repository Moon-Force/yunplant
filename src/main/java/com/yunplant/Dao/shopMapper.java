package com.yunplant.Dao;

import com.yunplant.Entity.shop;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface shopMapper {
    List<shop> selectAll();
    List<shop> selectById(@Param("id") int id);
}
