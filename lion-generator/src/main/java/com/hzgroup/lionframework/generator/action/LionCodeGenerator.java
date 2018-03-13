package com.hzgroup.lionframework.generator.action;


import com.hzgroup.lionframework.generator.action.config.LionGeneratorConfig;

/**
 * 代码生成器,可以生成实体,dao,service,controller,html,js
 *
 * @author
 * @Date 2017/5/21 12:38
 */
public class LionCodeGenerator {

    public static void main(String[] args) {

        /**
         * Mybatis-Plus的代码生成器:
         *      mp的代码生成器可以生成实体,mapper,mapper对应的xml,service
         */
        LionGeneratorConfig lionGeneratorConfig = new LionGeneratorConfig();
        lionGeneratorConfig.doMpGeneration();

        /**
         * lion的生成器:
         *      lion的代码生成器可以生成controller,html页面,页面对应的js
         */
        lionGeneratorConfig.doLionGeneration();
    }

}