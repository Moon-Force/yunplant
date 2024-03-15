package com.yunplant.Util;

import java.util.UUID;

public class imgsrc_uuid {
   public static String imgsrc_uuid(String name,int id) {
      String imgsrc_uuid = name+String.valueOf(id);
      UUID uuid= UUID.nameUUIDFromBytes(imgsrc_uuid.getBytes());
      System.out.println("生成的UUID2为：" + uuid.toString());
      return uuid.toString();
   }
}
