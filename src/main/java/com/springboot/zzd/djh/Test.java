package com.springboot.zzd.djh;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: zhendong.Z
 * @date: 2019-11-06 10:08
 */

@Slf4j
public class Test {

    @Autowired
    private User user;

    public static void main(String[] args) {
        log.info("slf4j日志打印*************");
        log.info(Thread.currentThread().getName());

    }
}
