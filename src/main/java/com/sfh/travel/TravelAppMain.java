package com.sfh.travel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TravelAppMain 
{
    public static void main( String[] args ) {
        SpringApplication.run(TravelAppMain.class, args);
        System.out.println("Application is up and running");
    }
}
