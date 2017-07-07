package com.muyundefeng.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**Spring mvc配置
 * Created by lisheng on 17-7-7.
 */
@Configuration
@ComponentScan(basePackages = {"com.muyundefeng.controller",
"com.muyundefeng.mapper"})
@EnableWebMvc
public class MvcConfig extends WebMvcConfigurerAdapter {
    //还需要配置静态资源解析器
}
