package com.muyundefeng.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by lisheng on 17-7-7.
 */
public class MyAppConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
