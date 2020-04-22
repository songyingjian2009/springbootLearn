package com.destiny.mute.swagger2;

import org.springframework.beans.factory.annotation.Value;
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

@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Value("${system.name}")
    String systemName;
    @Value("${system.version}")
    String systemVersion;
    @Value("${swagger.scan-path}")
    String swaggerScanPath;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage(swaggerScanPath))
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(systemName)
                .description(systemName + "接口信息")
                .version(systemVersion)
                .contact(new Contact("DESTINY", "https://github.com/songyingjian2009", "songyingjian2009@163.com"))
//                        .license("The Apache License")
//                        .licenseUrl("http://www.baidu.com")
                .build();
    }

}
