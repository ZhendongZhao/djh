package com.springboot.zzd.djh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: zhendong.Z
 * @date: 2019-11-07 10:42
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket creatRestfulApi(){

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("djh")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/djh/**"))
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("springboot利用swagger构建api文档")
                .contact(new Contact("djh", "localhost:8080", "zhaozhendong1026@163.com"))
                .version("1.0")
                .build();
    }
}
