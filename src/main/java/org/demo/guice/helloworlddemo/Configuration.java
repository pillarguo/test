package org.demo.guice.helloworlddemo;

import org.demo.guice.MyApplet;
import org.demo.guice.PrintStreamWriter;
import org.demo.guice.StringProvider;

public class Configuration {


    public static MyApplet getMainApplet(){
        return  new StringWritingApplet(new PrintStreamWriter(System.out),new StringProvider(){
            @Override
            public String get(){
                return "Hello World";
            }
        });
    }
}
