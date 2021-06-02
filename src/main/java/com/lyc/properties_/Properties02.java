package com.lyc.properties_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author lyc
 * @create 2021--06--02 16:04
 */
public class Properties02 {
    public static void main(String[] args) throws IOException {
        //1.创建properties对象
        Properties pro = new Properties();
        //2.读取配置文件(将文件数据->内存pro)
        pro.load(new FileReader("src\\main\\resources\\mysql.properties"));
        //3.遍历，全部显示
        pro.list(System.out);
        //根据键值对获取
//        String ip = pro.getProperty("ip");
//        String user = pro.getProperty("user");
//        String pwd = pro.getProperty("pwd");
//        System.out.println(ip + "\n" + user + "\n" + pwd);

    }
}
