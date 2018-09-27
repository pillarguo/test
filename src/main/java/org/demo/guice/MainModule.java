package org.demo.guice;

import com.google.inject.AbstractModule;
import org.demo.guice.helloworlddemo.StringWritingApplet;

public class MainModule extends AbstractModule {
    @Override
    protected void configure(){
        bind(MyApplet.class).to(StringWritingApplet.class);
        bind(MyDestination.class).to(PrintStreamWriter.class);
        //bind(PrintStream.)

    }
}
