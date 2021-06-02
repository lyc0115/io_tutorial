package com.lyc.properties_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author lyc
 * @create 2021--06--02 15:50
 */
public class Properties01 {
    public static void main(String[] args) throws IOException {
        //读取mysql.properties文件，并得到ip，user和pwd
        BufferedReader br = new BufferedReader(new FileReader("src\\main\\resources\\mysql.properties"));
        String str = "";
        while ((str = br.readLine()) != null){
            String s = str.split("=")[1];
            System.out.println(s);
        }
        br.close();
    }

}
