package com.io;

public class EncodeDemo {

    public static void main(String[] args) throws Exception{
        String s="慕课ABC";
        byte[] byte1=s.getBytes("gbk");
        for(byte b:byte1){
            //System.out.println(Integer.toHexString(b&0xff)+" ");
            System.out.println("old"+b);
            System.out.println(Integer.toHexString(b));
        }
        System.out.println("++++++++++");
        byte[] byte2=s.getBytes("utf-8");
        for(byte c:byte2){
            //System.out.println(Integer.toHexString(b&0xff)+" ");
            System.out.println("old"+c);
            System.out.println(Integer.toHexString(c));
        }

    }


}
