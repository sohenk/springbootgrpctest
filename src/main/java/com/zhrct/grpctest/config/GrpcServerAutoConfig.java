//package com.zhrct.grpctest.config;
//
//import com.zhrct.grpctest.interceptor.MainGrpcInterceptor;
//import net.devh.boot.grpc.server.interceptor.GlobalServerInterceptorConfigurer;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//
//@Configuration
////@EnableDiscoveryClient
//public class GrpcServerAutoConfig {
//
//    @Bean
//    public GlobalServerInterceptorConfigurer globalInterceptorConfigurerAdapter() {
//        return registry -> registry.add(new MainGrpcInterceptor());
//    }
//
//}