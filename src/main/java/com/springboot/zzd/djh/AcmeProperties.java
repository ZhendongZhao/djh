package com.springboot.zzd.djh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Profile;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: zhendong.Z
 * @date: 2019-11-19 14:13
 */
@ConstructorBinding
@Data
@Profile("production")
public class AcmeProperties {

    private boolean enabled;

    @JsonProperty()
    private InetAddress remoteAddress;

    private final Security security = new Security();


    @Data
    public static class Security {

        private String username;

        private String password;

        private List<String> roles = new ArrayList<>(Collections.singleton("USER"));

    }

}
