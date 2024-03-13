package com.yunplant.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class shop {
        private Integer id;   //id（主键）
        private String name;  //姓名
        private String address;
        private String describe;

}
