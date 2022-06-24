package com.zhrct.grpctest.internal.service;

import api.cms.service.v1.Category;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import api.cms.service.v1.CreateCategoryRequest;
import api.cms.service.v1.CmsGrpc;

import java.util.ArrayList;
import java.util.List;

@GrpcService
public class CmsService extends CmsGrpc.CmsImplBase  {
    @Override
    public void createCategory(CreateCategoryRequest request, StreamObserver<api.cms.service.v1.CreateCategoryReply> responseObserver) {
        api.cms.service.v1.CreateCategoryReply reply = api.cms.service.v1.CreateCategoryReply.newBuilder()
                .setOk(true).build();

        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
    @Override
    public void listCategory(api.cms.service.v1.ListCategoryRequest request, StreamObserver<api.cms.service.v1.ListCategoryReply> responseObserver) {

        List<api.cms.service.v1.Category> cl = new ArrayList<>();
        for(int i =0;i<10;i++){
            api.cms.service.v1.Category.Builder b = api.cms.service.v1.Category.newBuilder();
            b.setCreatedAt("123");
            cl.add(b.build());
        }
        api.cms.service.v1.ListCategoryReply reply= api.cms.service.v1.ListCategoryReply.newBuilder().addAllList(cl).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
