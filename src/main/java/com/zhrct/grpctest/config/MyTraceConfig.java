package com.zhrct.grpctest.config;

import io.opentracing.Tracer;
import io.opentracing.contrib.grpc.TracingClientInterceptor;
import io.opentracing.contrib.grpc.TracingServerInterceptor;
import net.devh.boot.grpc.client.interceptor.GrpcGlobalClientInterceptor;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@ConditionalOnProperty(value = "opentracing.jaeger.enabled", havingValue = "false", matchIfMissing = false)
@Configuration
public class MyTraceConfig {
//    @Bean
//    public io.opentracing.Tracer jaegerTracer() {
//        return io.opentracing.noop.NoopTracerFactory.create();
//    }

    @GrpcGlobalClientInterceptor
    TracingClientInterceptor tracingInterceptor(Tracer tracer) {
        return TracingClientInterceptor
                .newBuilder()
                .withTracer(tracer)
                .build();
    }

    @GrpcGlobalServerInterceptor
    TracingServerInterceptor tracingServerInterceptor(Tracer tracer){
        return TracingServerInterceptor
                .newBuilder()
                .withTracer(tracer)
                .build();
    }
}
