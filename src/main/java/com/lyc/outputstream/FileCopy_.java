package com.lyc.outputstream;

import sun.security.util.Length;

import java.io.*;

/**
 * @author lyc
 * @create 2021--06--01 21:36
 */
public class FileCopy_ {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("e:\\news1.txt"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("e:\\news4.txt"));
        byte[] b = new byte[10];
        int len;
//        while ((len = bufferedInputStream.read()) != -1){
//            bufferedOutputStream.write(len);
//            System.out.print((char)len);
//        }

        while((len = bufferedInputStream.read(b)) != -1){
            bufferedOutputStream.write(b, 0, len);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
