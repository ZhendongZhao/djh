package com.springboot.zzd.djh;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.stereotype.Component;

/**
 * @author: zhendong.Z
 * @date: 2019-11-14 16:25
 */
@Component
@Data
@JsonComponent
public class User {


//    @Value("${userid}")
    private int id;

}
