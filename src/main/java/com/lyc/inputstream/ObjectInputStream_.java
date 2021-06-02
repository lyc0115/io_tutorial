package com.lyc.inputstream;

import com.lyc.Dog;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * @author lyc
 * @create 2021--06--02 10:39
 */
public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\data.dat"));
        //读取，注意序列化顺序
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        //System.out.println(ois.readObject().toString());
        //1.如果我们希望调用Dog的方法，需要向下转型
        Object dog = ois.readObject();
        Dog dog1 = (Dog) dog;
        System.out.println(dog1.getName());

        ois.close();
    }
}
