package com.lyc.outputstream;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

/**
 * @author lyc
 * @create 2021--05--30 15:37
 */
public class FileCopy {
    public static void main(String[] args) {
        //完成 文件拷贝 将e:\\demo.png 拷贝到c盘
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        String srcFilename = "e:\\demo.png";
        String destFilename = "d:\\demo.png";
        try {
            fileInputStream = new FileInputStream(srcFilename);
            fileOutputStream = new FileOutputStream(destFilename);
            byte[] buf = new byte[1024*8];
            int len;
            while ((len = fileInputStream.read(buf)) != -1){
                fileOutputStream.write(buf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileInputStream != null){
                    fileInputStream.close();
                }
                if (fileOutputStream != null){
                    fileOutputStream.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }


        }
    }
}
