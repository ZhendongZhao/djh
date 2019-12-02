package com.springboot.zzd.djh.entity;

import com.springboot.zzd.djh.User;
import org.hibernate.validator.internal.util.privilegedactions.GetDeclaredMethods;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

/**
 * @author: zhendong.Z
 * @date: 2019-11-20 16:15
 */
public class Customer {

    @Value("${name}")
    private String name;
}
