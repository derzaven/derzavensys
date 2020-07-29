package com.accp.cfg;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration   //配置类元注解
@MapperScan(basePackages = { "com.accp.dao" }) //非常重要  阿斯顿撒大所
public class BeansConfig {
	

}
