package com.lyc.outputstream;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lyc
 * @create 2021--05--30 15:19
 */
public class FileOutputStream_ {
    public static void main(String[] args) {

    }


    /**
     * 演示使用FileOutputStream 将数据写到文件中
     * 如果文件不存在，则创建该文件
     */
    @Test
    public void writeFile(){
        //创建FileOutputStream对象
        String filePath = "e:\\a.txt";
        FileOutputStream fileOutputStream = null;

        try {
            //1. new FileOutputStream(filePath) 创建方式，当写入内容时，会覆盖原来的内容
            //2. new FileOutputStream(filePath, true)创建方式，当写入内容时，会追加到文件末尾
            fileOutputStream = new FileOutputStream(filePath);
            //写入一个字节
            //fileOutputStream.write('a');
            //写入字符串
            //String str = "hello scala";
            //fileOutputStream.write(str.getBytes());
            //write(byte[] b, int off, int len)   将 len字节从位于偏移量 off的指定 byte阵列写入此输出流
            String str = "hello kitty";
            fileOutputStream.write(str.getBytes(), 1, 3);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
