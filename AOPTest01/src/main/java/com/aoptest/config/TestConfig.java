package com.aoptest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"com.aoptest.sevrice","com.aoptest.msg"})
@EnableAspectJAutoProxy
public class TestConfig {
}
