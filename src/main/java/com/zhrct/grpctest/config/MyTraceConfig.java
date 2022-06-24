package com.zhrct.grpctest.config;

import io.opentracing.Tracer;
import io.opentracing.contrib.grpc.TracingClientInterceptor;
import io.opentracing.contrib.grpc.TracingServerInterceptor;
import net.devh.boot.grpc.client.interceptor.GrpcGlobalClientInterceptor;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyTraceConfig {

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
