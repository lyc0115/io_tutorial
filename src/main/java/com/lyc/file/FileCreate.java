package com.lyc.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author lyc
 * @create 2021--05--30 13:20
 */
public class FileCreate {
    public static void main(String[] args) {

    }

    //方式1 new File(String pathname)  根据路径构建一个File对象
    @Test
    public void create01(){
        String filepath = "e:\\news1.txt";
        File file = new File(filepath);
        try {
            boolean b = file.createNewFile();
            System.out.println("文件创建成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //方式2 new File(File parent, String child) 根据父目录文件+子路径构建
    //e:\\news2.txt
    @Test
    public void create02(){
        File file = new File("e:\\");
        String filename = "news2.txt";
        //file1对象，在java程序中，只是一个对象
        //只有执行了createNewFile方法，才会创建在磁盘
        File file1 = new File(file, filename);
        try {
            boolean b = file1.createNewFile();
            System.out.println("文件创建成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式3 new File(String parent, String child) 根据父目录+子路径创建
    //e:\\news3.txt
    @Test
    public void create03(){
        String parentPath = "e:\\";
        String filePath = "news3.txt";
        File file = new File(parentPath, filePath);
        try {
            boolean b = file.createNewFile();
            System.out.println("文件创建成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
