package com.lyc.reader;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author lyc
 * @create 2021--05--30 16:43
 */
public class FileReader_ {
    public static void main(String[] args) {
        //创建流对象
        String filePath = "e:\\b.txt";
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
            //read：每次读取单个字符，如果到文件末尾，返回-1
//            int data;
//            while ((data = fileReader.read()) != -1){
//                System.out.print((char)data);
//            }
            //read(char []): 批量读取多个字符到char[], 返回读到的实际字符个数，如果读到末尾，返回-1
            char[] buffer = new char[5];
            int data;
            while((data = fileReader.read(buffer)) != -1){
                System.out.println(new String(buffer, 0, data));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
