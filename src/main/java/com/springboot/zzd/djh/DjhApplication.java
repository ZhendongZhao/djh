package com.springboot.zzd.djh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhaozhendong
 */
@SpringBootApplication
public class DjhApplication {

    public static void main(String[] args) throws InterruptedException{
        try {
            SpringApplication.run(DjhApplication.class, args);
        }catch (Exception e) {
            Thread.sleep(1000);
        }

    }

}
