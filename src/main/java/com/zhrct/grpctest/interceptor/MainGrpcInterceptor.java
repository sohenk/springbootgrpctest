//package com.zhrct.grpctest.interceptor;
//
//import lombok.extern.slf4j.Slf4j;
//import io.grpc.Metadata;
//import io.grpc.ServerCall;
//import io.grpc.ServerCallHandler;
//import io.grpc.ServerInterceptor;
//
//@Slf4j
//public class MainGrpcInterceptor implements ServerInterceptor {
//
//    @Override
//    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> serverCall, Metadata metadata,
//                                                                 ServerCallHandler<ReqT, RespT> serverCallHandler) {
//        log.info(serverCall.getMethodDescriptor().getFullMethodName());
//        return serverCallHandler.startCall(serverCall, metadata);
//    }
//}