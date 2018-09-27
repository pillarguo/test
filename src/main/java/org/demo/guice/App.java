package org.demo.guice;

import org.demo.guice.helloworlddemo.Configuration;

public class App {

    public static  void  main(String[] args){
        MyApplet mainApplet=Configuration.getMainApplet();
        mainApplet.run();
    }




}
