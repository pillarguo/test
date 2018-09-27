package com.io;

import java.io.File;

public class FileDemo {

    public static void main(String[] args) throws Exception{
        File file =new File("E:\\workspace");
//        if (file.exists()&&file.isDirectory()){
//            for (String fi:file.list()){
//                System.out.println(fi);
//            }
//            for (File f:file.listFiles()){
//                System.out.println(f);
//            }
//        }
        listDir(file);



//        System.out.println(file.exists());
//        System.out.println(file.isDirectory());
//        if(!file.exists()){
//            file.mkdir();
//        }else{
//            file.delete();
//        }
//        File file2 =new File("E:\\workspace\\newfile");
//        if(file2.exists()){
//            file2.delete();
//        }else {
//            file2.createNewFile();
//        }

    }
    public static void listDir(File file){
        if (file.isDirectory()){
            for(File fi:file.listFiles()){
                if(fi.isDirectory()){
                    listDir(fi);
                }else{
                    System.out.println(fi);
                }

            }

        }else{
            System.out.println(file);
        }

    }

}
