package com.lyc.transformation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author lyc
 * @create 2021--06--02 15:24
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        //inputStreamReader充当转换流作用（字符->字节） 指定读取文件编码格式
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("e:\\d.txt"),
                "gbk"));
        String str;
        while ((str = br.readLine()) != null){
            System.out.println(str);
        }
        br.close();
    }
}
