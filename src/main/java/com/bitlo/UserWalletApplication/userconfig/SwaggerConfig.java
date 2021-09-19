package com.bitlo.UserWalletApplication.userconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket swaggerUserApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Users")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.bitlo.UserWalletApplication.controller"))
                .paths(PathSelectors.ant("/api/user/*"))
                .build();

    }

    @Bean
    public Docket swaggerWalletApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Wallets")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.bitlo.UserWalletApplication.controller"))
                .paths(PathSelectors.ant("/api/wallet/*"))
                .build();

    }
    /*@Bean
    public Docket swaggerSettingsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.bitlo.UserWalletApplication.controller"))
                .paths(PathSelectors.regex(("/api/v1/settings/.*")))
                .build()
                .apiInfo(new ApiInfoBuilder().version("1.0").title("Settings API").build())
                .globalOperationParameters(operationParameters());
    }

    @Bean
    public Docket swaggerProductApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Product")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xyz.modules.v1"))
                .paths(productPaths())
                .build()
                .apiInfo(new ApiInfoBuilder().version("1.0").title("Product API").build())
                .globalOperationParameters(operationParameters());}*/
}
