package com.lyc.outputstream;

import com.lyc.Dog;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author lyc
 * @create 2021--06--02 10:29
 */
public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException {
        //序列化后文件保存的文件，不是纯文本，而是按照它的格式进行存储
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\data.dat"));
        //序列化数据到src\\data.dat
        oos.writeInt(100);
        oos.writeBoolean(true);
        oos.writeChar('a');
        oos.writeDouble(9.4);
        oos.writeUTF("hello spark");
        oos.writeObject(new Dog("tom", 10));
        oos.close();
        System.out.println("数据保存（序列化形式）");
    }
}
