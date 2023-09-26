package pers.bol.base.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.function.Predicate;


@Configuration
@EnableSwagger2
public class Swagger2Config {

    // swagger2 后台管理api
    @Bean
    public Docket adminApiConfig() {
        // 访问地址：swagger-ui.html
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("adminApi")
                .apiInfo(adminApiInfo())
                .select()
                .paths(Predicates.and(PathSelectors.regex("/admin/.*")))
                .build();
    }

    // swagger 中的简介
    public ApiInfo adminApiInfo() {
        return  new ApiInfoBuilder()
                .title("远见金融宝后台AdminAPI")
                .description("远见金融宝后台AdminAPI详细描述")
                .version("1.0")
                .contact(new Contact("zhg","www.baidu.com","1314520@qq.com")) // 联系人
                .build();
    }

    // swagger2 前台管理api

    @Bean
    public Docket webApiConfig() {
        // 访问地址：swagger-ui.html
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("webApi")
                .apiInfo(webApiInfo())
                .select()
                .paths(Predicates.and(PathSelectors.regex("/web/.*")))
                .build();
    }

    // swagger 中的简介
    public ApiInfo webApiInfo() {
        return  new ApiInfoBuilder()
                .title("远见金融宝前台AdminAPI")
                .description("远见金融宝后台AdminAPI详细描述")
                .version("1.0")
                .contact(new Contact("zhg","www.baidu.com","1314520@qq.com")) // 联系人
                .build();
    }
}
