package com.lyc.writer;

import java.io.*;

/**
 * @author lyc
 * @create 2021--06--01 21:14
 */
public class BufferedCopy_ {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("e:\\a.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("e:\\c.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}

