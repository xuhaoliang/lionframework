package com.hzgroup.lionframework.core.util;

import com.hzgroup.lionframework.config.properties.LionProperties;

/**
 * 验证码工具类
 */
public class KaptchaUtil {

    /**
     * 获取验证码开关
     *
     * @author
     * @Date 2017/5/23 22:34
     */
    public static Boolean getKaptchaOnOff() {
        return SpringContextHolder.getBean(LionProperties.class).getKaptchaOpen();
    }
}