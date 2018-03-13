package com.hzgroup.lionframework;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Lion Web程序启动类
 *
 * @author fengshuonan
 * @date 2017-05-21 9:43
 */
public class LionServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(LionApplication.class);
    }

}
