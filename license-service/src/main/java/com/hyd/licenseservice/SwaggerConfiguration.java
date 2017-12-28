package com.hyd.licenseservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author 黄耀东 【 huangyaodong@meituan.com 】
 * @Date 17/12/28 下午9:02
 * @Description
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {


    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hyd"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("spring microservice in action test")
                .description("spring microservice in action test")
                .termsOfServiceUrl("http://localhost:8080/")
                .contact("hyd")
                .version("0.0.1")
                .build();
    }
}
