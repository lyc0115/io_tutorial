package com.lyc.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author lyc
 * @create 2021--05--30 16:59
 */
public class FileWriter_ {
    public static void main(String[] args) {
        String filePath = "e:\\a.txt";

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath, true);
            //write(int): 写入单个字符
            fileWriter.write('H');
            //write(char []): 写入指定数组
            String str1 = "hello world";
            fileWriter.write(str1.toCharArray());
            //write(string): 写入整个字符串
            String str = "风雨过后才见彩虹";
            fileWriter.write(str);
            //write(string, off, len): 写入字符串的指定部分
            String str3 = "spark";
            fileWriter.write(str3, 1, 2);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
