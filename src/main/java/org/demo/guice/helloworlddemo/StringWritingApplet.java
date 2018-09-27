package org.demo.guice.helloworlddemo;

import org.demo.guice.MyApplet;
import org.demo.guice.MyDestination;
import org.demo.guice.StringProvider;

import javax.inject.Inject;

public class StringWritingApplet implements MyApplet {

    private MyDestination destination;
    private StringProvider stringProvider;

    @Inject
    public StringWritingApplet(MyDestination destination, StringProvider outPutString){
        super();
        this.destination=destination;
        this.stringProvider=outPutString;
    }

    private  void writeString(){

        destination.write(stringProvider.get());
    }
    public void run(){
        writeString();
    }
}
