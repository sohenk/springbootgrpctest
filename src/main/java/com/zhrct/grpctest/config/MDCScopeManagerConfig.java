//package com.zhrct.grpctest.config;
//
//
//import io.jaegertracing.internal.JaegerTracer;
//import io.jaegertracing.internal.MDCScopeManager;
//import io.opentracing.contrib.java.spring.jaeger.starter.TracerBuilderCustomizer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class MDCScopeManagerConfig {
//
//    /**
//     * 推荐此种方式配置，这样可以使用JaegerAutoConfiguration进行自动配置
//     *
//     * @return
//     */
//    @Bean
//    public TracerBuilderCustomizer mdcBuilderCustomizer() {
//        // 1.8新特性，函数式接口
//        return builder -> builder.withScopeManager(new MDCScopeManager.Builder().build());
//    }
//
////    /**
////     * 这是官网示例配置，但是无法使用JaegerAutoConfiguration进行自动配置，个人不推荐
////     */
////    @Bean
////    public JaegerTracer mdcBuilderCustomizer2() {
////        MDCScopeManager scopeManager = new MDCScopeManager.Builder().build();
////        JaegerTracer tracer = new JaegerTracer.Builder("demo1").withTraceId128Bit()
////                .withScopeManager(scopeManager).build();
////        return tracer;
////    }
//}