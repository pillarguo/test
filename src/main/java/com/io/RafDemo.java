package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RafDemo {

    public static void main(String[] args) throws IOException {
//        File demo =new File("demo");
//        if (!demo.exists()){
//            demo.mkdir();
//        }
//        File file=new File(demo,"raf.dat");
//        if (!file.exists()){
//            file.createNewFile();
//        }
//
//        RandomAccessFile raf=new RandomAccessFile(file,"rw");
//        System.out.println(raf.getFilePointer());
//        raf.write('A');
//        System.out.println(raf.getFilePointer());
//        raf.write('B');
//        System.out.println(raf.getFilePointer());
//        int i=0xfffffff;
////        raf.write(i>>>24);
////        raf.write(i>>>16);
////        raf.write(i>>>8);
////        raf.write(i);
////        System.out.println(raf.getFilePointer());
//        raf.writeInt(i);
//        System.out.println(raf.getFilePointer());
//        raf.write("中华".getBytes("utf-8"));
//        System.out.println(raf.getFilePointer());
//        raf.seek(0);
//        byte[] buf=new byte[(int) raf.length()];
//        raf.read(buf);
//        System.out.println(Arrays.toString(buf));
//        System.out.println(new String(buf));
//        raf.close();

    publish(new File("pom.xml"));

    }
    public static void publish(File file) throws IOException{
        FileInputStream in=new FileInputStream(file);
        int i=1;
        int b;
        while (( b=in.read())!=-1){
            System.out.print(Integer.toHexString(b)+" ");
            if(i++%10==0){
                System.out.println();
            }
        }
        in.close();
    }
}
