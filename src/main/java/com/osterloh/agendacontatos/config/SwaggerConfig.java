package com.osterloh.agendacontatos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket productApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.osterloh.agendacontatos"))
                .paths(regex("/api.*"))
                .build()
                .apiInfo(metaIfo());
    }

    private ApiInfo metaIfo(){
        ApiInfo apiInfo = new ApiInfo(
                "Contatos API REST",
                "API REST de cadastro de contatos",
                "1.0",
                "Terms of Service",
                new Contact("Johnatan", "https://www.test.com.br",
                        "johnatan@test.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/license.html", new ArrayList<VendorExtension>()
        );
        return apiInfo;
    }
}
