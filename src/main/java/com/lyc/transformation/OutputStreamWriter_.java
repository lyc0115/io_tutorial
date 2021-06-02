package com.lyc.transformation;

import java.io.*;

/**
 * @author lyc
 * @create 2021--06--02 15:35
 * 把FileOutputStream 字节流，转换成OutputStreamWriter
 * 指定处理的编码gbk/utf-8/utf8
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("e:\\d.txt"), "gbk");
        outputStreamWriter.write("hello 世界！");
        outputStreamWriter.close();
    }
}
