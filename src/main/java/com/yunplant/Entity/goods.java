package com.yunplant.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class goods {
    private int good_id;
    private String good_name;
    private String category_id;
    private String description;
    private Float price;
    private int stock;
    private int shop_id;
    private String imgsrc;
}
