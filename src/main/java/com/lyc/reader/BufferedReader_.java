package com.lyc.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author lyc
 * @create 2021--06--01 16:10
 */
public class BufferedReader_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("e:\\b.txt"));
        String line;
        //读取一行
        //readLine()当返回为null时，读取完毕
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
        //只需要关闭BufferedReader，底层会自动去关闭节点流
        br.close();
    }
}
