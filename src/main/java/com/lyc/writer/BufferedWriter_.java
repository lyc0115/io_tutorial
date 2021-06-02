package com.lyc.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author lyc
 * @create 2021--06--01 16:21
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        //BufferedWriter若想向文件中追加内容，则设置FileWriter构造器中的布尔值为true
        BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
        bw.write("你好，汤姆猫！");
        //插入一个和系统相关的换行符
        bw.newLine();
        bw.write("hello java");
        //关闭外层流即可
        bw.close();
    }
}
