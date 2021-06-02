package com.lyc.inputstream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author lyc
 * @create 2021--05--30 14:46
 */
public class FileInputStream_ {
    public static void main(String[] args) throws FileNotFoundException {

    }

    //1.一个一个字节读取
    @Test
    public void m1() throws IOException {
        FileInputStream inputStream = new FileInputStream("e:\\news1.txt");
        int read;
        while((read = inputStream.read())!=-1){
            System.out.print((char)read);
        }
        inputStream.close();
    }

    //2.read(byte[] b) 功能：读取多个字节到byte[] b，返回读取到的字节个数，如果文件到末尾，返回-1
    @Test
    public void m2() throws IOException {
        FileInputStream inputStream = new FileInputStream("e:\\news1.txt");
        byte[] b =new byte[1024*8];
        int len;
        while ((len = inputStream.read(b))!=-1){
            //将读取到的字节的0-len，转成String输出
            System.out.println(new String(b, 0, len));
        }
        inputStream.close();
    }
}
