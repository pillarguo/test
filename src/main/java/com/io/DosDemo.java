package com.io;
import sun.nio.ch.IOUtil;

import java.io.*;

public class DosDemo {
    public static void main(String[] args) throws IOException {
        String file="doc.dat";
        DataOutputStream dos=new DataOutputStream(new FileOutputStream(file));
        dos.writeInt(10);
        dos.write(-11);
        dos.writeLong(10l);
        dos.writeDouble(10.2);
        dos.writeUTF("中国");
        //dos.writeChars("人民");
        dos.close();

        DataInputStream dataInputStream=new DataInputStream(new FileInputStream(file));
        int i=dataInputStream.readInt();
        System.out.println(i);
        i=dataInputStream.readInt();
        System.out.println(i);
        long l=dataInputStream.readLong();
        System.out.println(l);
        double d=dataInputStream.readDouble();
        System.out.println(d);
//        String s=dataInputStream.readUTF();
//        System.out.println(s);
        dataInputStream.close();
    }
}
