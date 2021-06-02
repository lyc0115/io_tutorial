package com.lyc.transformation;

import java.io.*;

/**
 * @author lyc
 * @create 2021--06--02 15:07
 * 中文乱码问题
 */
public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("e:\\d.txt"));
        //默认情况下，读取文件是按照utf-8编码
        String str;
        while ((str = br.readLine()) != null){
            System.out.println(str);
        }
        br.close();
    }
}
