package com.ushan.MyApp;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    public void build(){
        System.out.println("Hey, Working on Awesome project.");
    }

}
