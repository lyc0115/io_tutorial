package com.lyc.file;

import org.junit.Test;

import java.io.File;
import java.io.InputStream;

/**
 * @author lyc
 * @create 2021--05--30 13:58
 */
public class Directory_ {
    public static void main(String[] args) {

    }

    //判断e:\\news4.txt是否存在，如果存在就删除
    @Test
    public void m1(){
        String filePath = "e:\\news4.txt";
        File file = new File(filePath);
        if (file.exists()){
            if (file.delete()) {
                System.out.println("文件删除成功！");
            }else{
                System.out.println("文件删除失败！");
            }

        }else{
            System.out.println("文件不存在！");
        }
    }

    //判断e:\\demo 是否存在，存在就删除，否则提示不存在
    //在java编程中目录也是文件
    @Test
    public void m2(){
        String dirPath = "e:\\demo";
        File file = new File(dirPath);
        if (file.exists()){
            if (file.delete()) {
                System.out.println("目录删除成功！");
            }else{
                System.out.println("目录删除失败！");
            }

        }else{
            System.out.println("该目录不存在！");
        }
    }

    //判断 e:\\demo\\a\\b\\c 目录是否存在， 如果存在就提示已经存在，否则就创建
    @Test
    public void m3(){
        String filePath = "e:\\demo\\a\\b\\c";
        File file = new File(filePath);
        if (file.exists()){
            System.out.println("该目录已经存在！");
        }else{
            //创建一级目录使用mkdir(), 创建多级目录使用mkdirs()
            if (file.mkdirs()) {
                System.out.println("该目录创建成功！");
            }else{
                System.out.println("该目录创建失败！");
            }

        }
    }

}
