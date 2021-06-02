package com.lyc.file;

import java.io.File;
import java.io.IOException;

/**
 * @author lyc
 * @create 2021--05--30 13:47
 */
public class FileInformation {

    public static void main(String[] args) throws IOException {

        File file = new File("E:\\news4.txt");
        file.createNewFile();
        //获取file对象信息
        //获取文件名称
        System.out.println(file.getName());
        //获取文件绝对路径
        System.out.println(file.getAbsolutePath());
        //获取文件父目录
        System.out.println(file.getParent());
        //获取文件大小（按字节大小）
        System.out.println(file.length());
        //判断
        //判断文件是否存在
        System.out.println(file.exists());
        //判断是不是文件
        System.out.println(file.isFile());
        //判断是不是目录
        System.out.println(file.isDirectory());
    }


}
