package com.lyc.properties_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author lyc
 * @create 2021--06--02 16:11
 */
public class Properties03 {
    public static void main(String[] args) throws IOException {
        //1.创建Properties集合对象
        Properties pro = new Properties();
        //2.向Properties中添加键值对信息
        pro.setProperty("charset", "utf-8");
        pro.setProperty("prot","3306");
        pro.setProperty("name", "西安");
        //3.存储到文件中(pro->文件)
        //store:将Properties中的键值对存储到配置文件中，在idea中，保存信息到配置文件，如果含有中文，会存储为unicode码
        pro.store(new FileOutputStream("src\\main\\resources\\mysql.properties"), null);

    }
}
