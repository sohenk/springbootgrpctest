package api.cms.service.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *cms服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.46.0)",
    comments = "Source: cms.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CmsGrpc {

  private CmsGrpc() {}

  public static final String SERVICE_NAME = "api.cms.service.v1.Cms";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.cms.service.v1.CreateCategoryRequest,
      api.cms.service.v1.CreateCategoryReply> getCreateCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCategory",
      requestType = api.cms.service.v1.CreateCategoryRequest.class,
      responseType = api.cms.service.v1.CreateCategoryReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.cms.service.v1.CreateCategoryRequest,
      api.cms.service.v1.CreateCategoryReply> getCreateCategoryMethod() {
    io.grpc.MethodDescriptor<api.cms.service.v1.CreateCategoryRequest, api.cms.service.v1.CreateCategoryReply> getCreateCategoryMethod;
    if ((getCreateCategoryMethod = CmsGrpc.getCreateCategoryMethod) == null) {
      synchronized (CmsGrpc.class) {
        if ((getCreateCategoryMethod = CmsGrpc.getCreateCategoryMethod) == null) {
          CmsGrpc.getCreateCategoryMethod = getCreateCategoryMethod =
              io.grpc.MethodDescriptor.<api.cms.service.v1.CreateCategoryRequest, api.cms.service.v1.CreateCategoryReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.CreateCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.CreateCategoryReply.getDefaultInstance()))
              .setSchemaDescriptor(new CmsMethodDescriptorSupplier("CreateCategory"))
              .build();
        }
      }
    }
    return getCreateCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.cms.service.v1.UpdateCategoryRequest,
      api.cms.service.v1.UpdateCategoryReply> getUpdateCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCategory",
      requestType = api.cms.service.v1.UpdateCategoryRequest.class,
      responseType = api.cms.service.v1.UpdateCategoryReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.cms.service.v1.UpdateCategoryRequest,
      api.cms.service.v1.UpdateCategoryReply> getUpdateCategoryMethod() {
    io.grpc.MethodDescriptor<api.cms.service.v1.UpdateCategoryRequest, api.cms.service.v1.UpdateCategoryReply> getUpdateCategoryMethod;
    if ((getUpdateCategoryMethod = CmsGrpc.getUpdateCategoryMethod) == null) {
      synchronized (CmsGrpc.class) {
        if ((getUpdateCategoryMethod = CmsGrpc.getUpdateCategoryMethod) == null) {
          CmsGrpc.getUpdateCategoryMethod = getUpdateCategoryMethod =
              io.grpc.MethodDescriptor.<api.cms.service.v1.UpdateCategoryRequest, api.cms.service.v1.UpdateCategoryReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.UpdateCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.UpdateCategoryReply.getDefaultInstance()))
              .setSchemaDescriptor(new CmsMethodDescriptorSupplier("UpdateCategory"))
              .build();
        }
      }
    }
    return getUpdateCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.cms.service.v1.DeleteCategoryRequest,
      api.cms.service.v1.DeleteCategoryReply> getDeleteCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCategory",
      requestType = api.cms.service.v1.DeleteCategoryRequest.class,
      responseType = api.cms.service.v1.DeleteCategoryReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.cms.service.v1.DeleteCategoryRequest,
      api.cms.service.v1.DeleteCategoryReply> getDeleteCategoryMethod() {
    io.grpc.MethodDescriptor<api.cms.service.v1.DeleteCategoryRequest, api.cms.service.v1.DeleteCategoryReply> getDeleteCategoryMethod;
    if ((getDeleteCategoryMethod = CmsGrpc.getDeleteCategoryMethod) == null) {
      synchronized (CmsGrpc.class) {
        if ((getDeleteCategoryMethod = CmsGrpc.getDeleteCategoryMethod) == null) {
          CmsGrpc.getDeleteCategoryMethod = getDeleteCategoryMethod =
              io.grpc.MethodDescriptor.<api.cms.service.v1.DeleteCategoryRequest, api.cms.service.v1.DeleteCategoryReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.DeleteCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.DeleteCategoryReply.getDefaultInstance()))
              .setSchemaDescriptor(new CmsMethodDescriptorSupplier("DeleteCategory"))
              .build();
        }
      }
    }
    return getDeleteCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.cms.service.v1.GetCategoryRequest,
      api.cms.service.v1.GetCategoryReply> getGetCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCategory",
      requestType = api.cms.service.v1.GetCategoryRequest.class,
      responseType = api.cms.service.v1.GetCategoryReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.cms.service.v1.GetCategoryRequest,
      api.cms.service.v1.GetCategoryReply> getGetCategoryMethod() {
    io.grpc.MethodDescriptor<api.cms.service.v1.GetCategoryRequest, api.cms.service.v1.GetCategoryReply> getGetCategoryMethod;
    if ((getGetCategoryMethod = CmsGrpc.getGetCategoryMethod) == null) {
      synchronized (CmsGrpc.class) {
        if ((getGetCategoryMethod = CmsGrpc.getGetCategoryMethod) == null) {
          CmsGrpc.getGetCategoryMethod = getGetCategoryMethod =
              io.grpc.MethodDescriptor.<api.cms.service.v1.GetCategoryRequest, api.cms.service.v1.GetCategoryReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.GetCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.GetCategoryReply.getDefaultInstance()))
              .setSchemaDescriptor(new CmsMethodDescriptorSupplier("GetCategory"))
              .build();
        }
      }
    }
    return getGetCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.cms.service.v1.ListCategoryRequest,
      api.cms.service.v1.ListCategoryReply> getListCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCategory",
      requestType = api.cms.service.v1.ListCategoryRequest.class,
      responseType = api.cms.service.v1.ListCategoryReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.cms.service.v1.ListCategoryRequest,
      api.cms.service.v1.ListCategoryReply> getListCategoryMethod() {
    io.grpc.MethodDescriptor<api.cms.service.v1.ListCategoryRequest, api.cms.service.v1.ListCategoryReply> getListCategoryMethod;
    if ((getListCategoryMethod = CmsGrpc.getListCategoryMethod) == null) {
      synchronized (CmsGrpc.class) {
        if ((getListCategoryMethod = CmsGrpc.getListCategoryMethod) == null) {
          CmsGrpc.getListCategoryMethod = getListCategoryMethod =
              io.grpc.MethodDescriptor.<api.cms.service.v1.ListCategoryRequest, api.cms.service.v1.ListCategoryReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.ListCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.ListCategoryReply.getDefaultInstance()))
              .setSchemaDescriptor(new CmsMethodDescriptorSupplier("ListCategory"))
              .build();
        }
      }
    }
    return getListCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.cms.service.v1.ListCategoryByPidRequest,
      api.cms.service.v1.ListCategoryByPidReply> getListCategoryByPidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCategoryByPid",
      requestType = api.cms.service.v1.ListCategoryByPidRequest.class,
      responseType = api.cms.service.v1.ListCategoryByPidReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.cms.service.v1.ListCategoryByPidRequest,
      api.cms.service.v1.ListCategoryByPidReply> getListCategoryByPidMethod() {
    io.grpc.MethodDescriptor<api.cms.service.v1.ListCategoryByPidRequest, api.cms.service.v1.ListCategoryByPidReply> getListCategoryByPidMethod;
    if ((getListCategoryByPidMethod = CmsGrpc.getListCategoryByPidMethod) == null) {
      synchronized (CmsGrpc.class) {
        if ((getListCategoryByPidMethod = CmsGrpc.getListCategoryByPidMethod) == null) {
          CmsGrpc.getListCategoryByPidMethod = getListCategoryByPidMethod =
              io.grpc.MethodDescriptor.<api.cms.service.v1.ListCategoryByPidRequest, api.cms.service.v1.ListCategoryByPidReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCategoryByPid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.ListCategoryByPidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.ListCategoryByPidReply.getDefaultInstance()))
              .setSchemaDescriptor(new CmsMethodDescriptorSupplier("ListCategoryByPid"))
              .build();
        }
      }
    }
    return getListCategoryByPidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.cms.service.v1.CreateArticleRequest,
      api.cms.service.v1.CreateArticleReply> getCreateArticleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateArticle",
      requestType = api.cms.service.v1.CreateArticleRequest.class,
      responseType = api.cms.service.v1.CreateArticleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.cms.service.v1.CreateArticleRequest,
      api.cms.service.v1.CreateArticleReply> getCreateArticleMethod() {
    io.grpc.MethodDescriptor<api.cms.service.v1.CreateArticleRequest, api.cms.service.v1.CreateArticleReply> getCreateArticleMethod;
    if ((getCreateArticleMethod = CmsGrpc.getCreateArticleMethod) == null) {
      synchronized (CmsGrpc.class) {
        if ((getCreateArticleMethod = CmsGrpc.getCreateArticleMethod) == null) {
          CmsGrpc.getCreateArticleMethod = getCreateArticleMethod =
              io.grpc.MethodDescriptor.<api.cms.service.v1.CreateArticleRequest, api.cms.service.v1.CreateArticleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateArticle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.CreateArticleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.CreateArticleReply.getDefaultInstance()))
              .setSchemaDescriptor(new CmsMethodDescriptorSupplier("CreateArticle"))
              .build();
        }
      }
    }
    return getCreateArticleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.cms.service.v1.UpdateArticleRequest,
      api.cms.service.v1.UpdateArticleReply> getUpdateArticleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateArticle",
      requestType = api.cms.service.v1.UpdateArticleRequest.class,
      responseType = api.cms.service.v1.UpdateArticleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.cms.service.v1.UpdateArticleRequest,
      api.cms.service.v1.UpdateArticleReply> getUpdateArticleMethod() {
    io.grpc.MethodDescriptor<api.cms.service.v1.UpdateArticleRequest, api.cms.service.v1.UpdateArticleReply> getUpdateArticleMethod;
    if ((getUpdateArticleMethod = CmsGrpc.getUpdateArticleMethod) == null) {
      synchronized (CmsGrpc.class) {
        if ((getUpdateArticleMethod = CmsGrpc.getUpdateArticleMethod) == null) {
          CmsGrpc.getUpdateArticleMethod = getUpdateArticleMethod =
              io.grpc.MethodDescriptor.<api.cms.service.v1.UpdateArticleRequest, api.cms.service.v1.UpdateArticleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateArticle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.UpdateArticleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.UpdateArticleReply.getDefaultInstance()))
              .setSchemaDescriptor(new CmsMethodDescriptorSupplier("UpdateArticle"))
              .build();
        }
      }
    }
    return getUpdateArticleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.cms.service.v1.DeleteArticleRequest,
      api.cms.service.v1.DeleteArticleReply> getDeleteArticleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteArticle",
      requestType = api.cms.service.v1.DeleteArticleRequest.class,
      responseType = api.cms.service.v1.DeleteArticleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.cms.service.v1.DeleteArticleRequest,
      api.cms.service.v1.DeleteArticleReply> getDeleteArticleMethod() {
    io.grpc.MethodDescriptor<api.cms.service.v1.DeleteArticleRequest, api.cms.service.v1.DeleteArticleReply> getDeleteArticleMethod;
    if ((getDeleteArticleMethod = CmsGrpc.getDeleteArticleMethod) == null) {
      synchronized (CmsGrpc.class) {
        if ((getDeleteArticleMethod = CmsGrpc.getDeleteArticleMethod) == null) {
          CmsGrpc.getDeleteArticleMethod = getDeleteArticleMethod =
              io.grpc.MethodDescriptor.<api.cms.service.v1.DeleteArticleRequest, api.cms.service.v1.DeleteArticleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteArticle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.DeleteArticleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.DeleteArticleReply.getDefaultInstance()))
              .setSchemaDescriptor(new CmsMethodDescriptorSupplier("DeleteArticle"))
              .build();
        }
      }
    }
    return getDeleteArticleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.cms.service.v1.GetArticleRequest,
      api.cms.service.v1.GetArticleReply> getGetArticleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetArticle",
      requestType = api.cms.service.v1.GetArticleRequest.class,
      responseType = api.cms.service.v1.GetArticleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.cms.service.v1.GetArticleRequest,
      api.cms.service.v1.GetArticleReply> getGetArticleMethod() {
    io.grpc.MethodDescriptor<api.cms.service.v1.GetArticleRequest, api.cms.service.v1.GetArticleReply> getGetArticleMethod;
    if ((getGetArticleMethod = CmsGrpc.getGetArticleMethod) == null) {
      synchronized (CmsGrpc.class) {
        if ((getGetArticleMethod = CmsGrpc.getGetArticleMethod) == null) {
          CmsGrpc.getGetArticleMethod = getGetArticleMethod =
              io.grpc.MethodDescriptor.<api.cms.service.v1.GetArticleRequest, api.cms.service.v1.GetArticleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetArticle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.GetArticleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.GetArticleReply.getDefaultInstance()))
              .setSchemaDescriptor(new CmsMethodDescriptorSupplier("GetArticle"))
              .build();
        }
      }
    }
    return getGetArticleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.cms.service.v1.GetArticleDataRequest,
      api.cms.service.v1.GetArticleDataReply> getGetArticleDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetArticleData",
      requestType = api.cms.service.v1.GetArticleDataRequest.class,
      responseType = api.cms.service.v1.GetArticleDataReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.cms.service.v1.GetArticleDataRequest,
      api.cms.service.v1.GetArticleDataReply> getGetArticleDataMethod() {
    io.grpc.MethodDescriptor<api.cms.service.v1.GetArticleDataRequest, api.cms.service.v1.GetArticleDataReply> getGetArticleDataMethod;
    if ((getGetArticleDataMethod = CmsGrpc.getGetArticleDataMethod) == null) {
      synchronized (CmsGrpc.class) {
        if ((getGetArticleDataMethod = CmsGrpc.getGetArticleDataMethod) == null) {
          CmsGrpc.getGetArticleDataMethod = getGetArticleDataMethod =
              io.grpc.MethodDescriptor.<api.cms.service.v1.GetArticleDataRequest, api.cms.service.v1.GetArticleDataReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetArticleData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.GetArticleDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.GetArticleDataReply.getDefaultInstance()))
              .setSchemaDescriptor(new CmsMethodDescriptorSupplier("GetArticleData"))
              .build();
        }
      }
    }
    return getGetArticleDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.cms.service.v1.ListArticleRequest,
      api.cms.service.v1.ListArticleReply> getListArticleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListArticle",
      requestType = api.cms.service.v1.ListArticleRequest.class,
      responseType = api.cms.service.v1.ListArticleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.cms.service.v1.ListArticleRequest,
      api.cms.service.v1.ListArticleReply> getListArticleMethod() {
    io.grpc.MethodDescriptor<api.cms.service.v1.ListArticleRequest, api.cms.service.v1.ListArticleReply> getListArticleMethod;
    if ((getListArticleMethod = CmsGrpc.getListArticleMethod) == null) {
      synchronized (CmsGrpc.class) {
        if ((getListArticleMethod = CmsGrpc.getListArticleMethod) == null) {
          CmsGrpc.getListArticleMethod = getListArticleMethod =
              io.grpc.MethodDescriptor.<api.cms.service.v1.ListArticleRequest, api.cms.service.v1.ListArticleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListArticle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.ListArticleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.ListArticleReply.getDefaultInstance()))
              .setSchemaDescriptor(new CmsMethodDescriptorSupplier("ListArticle"))
              .build();
        }
      }
    }
    return getListArticleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.cms.service.v1.ListArticleByCidRequest,
      api.cms.service.v1.ListArticleByCidReply> getListArticleByCidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListArticleByCid",
      requestType = api.cms.service.v1.ListArticleByCidRequest.class,
      responseType = api.cms.service.v1.ListArticleByCidReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.cms.service.v1.ListArticleByCidRequest,
      api.cms.service.v1.ListArticleByCidReply> getListArticleByCidMethod() {
    io.grpc.MethodDescriptor<api.cms.service.v1.ListArticleByCidRequest, api.cms.service.v1.ListArticleByCidReply> getListArticleByCidMethod;
    if ((getListArticleByCidMethod = CmsGrpc.getListArticleByCidMethod) == null) {
      synchronized (CmsGrpc.class) {
        if ((getListArticleByCidMethod = CmsGrpc.getListArticleByCidMethod) == null) {
          CmsGrpc.getListArticleByCidMethod = getListArticleByCidMethod =
              io.grpc.MethodDescriptor.<api.cms.service.v1.ListArticleByCidRequest, api.cms.service.v1.ListArticleByCidReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListArticleByCid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.ListArticleByCidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.cms.service.v1.ListArticleByCidReply.getDefaultInstance()))
              .setSchemaDescriptor(new CmsMethodDescriptorSupplier("ListArticleByCid"))
              .build();
        }
      }
    }
    return getListArticleByCidMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CmsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CmsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CmsStub>() {
        @java.lang.Override
        public CmsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CmsStub(channel, callOptions);
        }
      };
    return CmsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CmsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CmsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CmsBlockingStub>() {
        @java.lang.Override
        public CmsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CmsBlockingStub(channel, callOptions);
        }
      };
    return CmsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CmsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CmsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CmsFutureStub>() {
        @java.lang.Override
        public CmsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CmsFutureStub(channel, callOptions);
        }
      };
    return CmsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *cms服务
   * </pre>
   */
  public static abstract class CmsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *创建栏目
     * </pre>
     */
    public void createCategory(api.cms.service.v1.CreateCategoryRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.CreateCategoryReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCategoryMethod(), responseObserver);
    }

    /**
     * <pre>
     *更新栏目
     * </pre>
     */
    public void updateCategory(api.cms.service.v1.UpdateCategoryRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.UpdateCategoryReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCategoryMethod(), responseObserver);
    }

    /**
     * <pre>
     *删除栏目
     * </pre>
     */
    public void deleteCategory(api.cms.service.v1.DeleteCategoryRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.DeleteCategoryReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCategoryMethod(), responseObserver);
    }

    /**
     * <pre>
     *查询栏目
     * </pre>
     */
    public void getCategory(api.cms.service.v1.GetCategoryRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.GetCategoryReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCategoryMethod(), responseObserver);
    }

    /**
     * <pre>
     *查询栏目列表
     * </pre>
     */
    public void listCategory(api.cms.service.v1.ListCategoryRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.ListCategoryReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCategoryMethod(), responseObserver);
    }

    /**
     * <pre>
     *根据父节点获取栏目列表
     * </pre>
     */
    public void listCategoryByPid(api.cms.service.v1.ListCategoryByPidRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.ListCategoryByPidReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCategoryByPidMethod(), responseObserver);
    }

    /**
     * <pre>
     *创建文章
     * </pre>
     */
    public void createArticle(api.cms.service.v1.CreateArticleRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.CreateArticleReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateArticleMethod(), responseObserver);
    }

    /**
     * <pre>
     *更新文章
     * </pre>
     */
    public void updateArticle(api.cms.service.v1.UpdateArticleRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.UpdateArticleReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateArticleMethod(), responseObserver);
    }

    /**
     * <pre>
     *删除文章
     * </pre>
     */
    public void deleteArticle(api.cms.service.v1.DeleteArticleRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.DeleteArticleReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteArticleMethod(), responseObserver);
    }

    /**
     * <pre>
     *查询文章
     * </pre>
     */
    public void getArticle(api.cms.service.v1.GetArticleRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.GetArticleReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetArticleMethod(), responseObserver);
    }

    /**
     * <pre>
     *查询文章内容
     * </pre>
     */
    public void getArticleData(api.cms.service.v1.GetArticleDataRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.GetArticleDataReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetArticleDataMethod(), responseObserver);
    }

    /**
     * <pre>
     *查询文章列表
     * </pre>
     */
    public void listArticle(api.cms.service.v1.ListArticleRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.ListArticleReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListArticleMethod(), responseObserver);
    }

    /**
     * <pre>
     *根据栏目获取文章列表
     * </pre>
     */
    public void listArticleByCid(api.cms.service.v1.ListArticleByCidRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.ListArticleByCidReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListArticleByCidMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCategoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.cms.service.v1.CreateCategoryRequest,
                api.cms.service.v1.CreateCategoryReply>(
                  this, METHODID_CREATE_CATEGORY)))
          .addMethod(
            getUpdateCategoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.cms.service.v1.UpdateCategoryRequest,
                api.cms.service.v1.UpdateCategoryReply>(
                  this, METHODID_UPDATE_CATEGORY)))
          .addMethod(
            getDeleteCategoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.cms.service.v1.DeleteCategoryRequest,
                api.cms.service.v1.DeleteCategoryReply>(
                  this, METHODID_DELETE_CATEGORY)))
          .addMethod(
            getGetCategoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.cms.service.v1.GetCategoryRequest,
                api.cms.service.v1.GetCategoryReply>(
                  this, METHODID_GET_CATEGORY)))
          .addMethod(
            getListCategoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.cms.service.v1.ListCategoryRequest,
                api.cms.service.v1.ListCategoryReply>(
                  this, METHODID_LIST_CATEGORY)))
          .addMethod(
            getListCategoryByPidMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.cms.service.v1.ListCategoryByPidRequest,
                api.cms.service.v1.ListCategoryByPidReply>(
                  this, METHODID_LIST_CATEGORY_BY_PID)))
          .addMethod(
            getCreateArticleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.cms.service.v1.CreateArticleRequest,
                api.cms.service.v1.CreateArticleReply>(
                  this, METHODID_CREATE_ARTICLE)))
          .addMethod(
            getUpdateArticleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.cms.service.v1.UpdateArticleRequest,
                api.cms.service.v1.UpdateArticleReply>(
                  this, METHODID_UPDATE_ARTICLE)))
          .addMethod(
            getDeleteArticleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.cms.service.v1.DeleteArticleRequest,
                api.cms.service.v1.DeleteArticleReply>(
                  this, METHODID_DELETE_ARTICLE)))
          .addMethod(
            getGetArticleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.cms.service.v1.GetArticleRequest,
                api.cms.service.v1.GetArticleReply>(
                  this, METHODID_GET_ARTICLE)))
          .addMethod(
            getGetArticleDataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.cms.service.v1.GetArticleDataRequest,
                api.cms.service.v1.GetArticleDataReply>(
                  this, METHODID_GET_ARTICLE_DATA)))
          .addMethod(
            getListArticleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.cms.service.v1.ListArticleRequest,
                api.cms.service.v1.ListArticleReply>(
                  this, METHODID_LIST_ARTICLE)))
          .addMethod(
            getListArticleByCidMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.cms.service.v1.ListArticleByCidRequest,
                api.cms.service.v1.ListArticleByCidReply>(
                  this, METHODID_LIST_ARTICLE_BY_CID)))
          .build();
    }
  }

  /**
   * <pre>
   *cms服务
   * </pre>
   */
  public static final class CmsStub extends io.grpc.stub.AbstractAsyncStub<CmsStub> {
    private CmsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CmsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CmsStub(channel, callOptions);
    }

    /**
     * <pre>
     *创建栏目
     * </pre>
     */
    public void createCategory(api.cms.service.v1.CreateCategoryRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.CreateCategoryReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *更新栏目
     * </pre>
     */
    public void updateCategory(api.cms.service.v1.UpdateCategoryRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.UpdateCategoryReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *删除栏目
     * </pre>
     */
    public void deleteCategory(api.cms.service.v1.DeleteCategoryRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.DeleteCategoryReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *查询栏目
     * </pre>
     */
    public void getCategory(api.cms.service.v1.GetCategoryRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.GetCategoryReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *查询栏目列表
     * </pre>
     */
    public void listCategory(api.cms.service.v1.ListCategoryRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.ListCategoryReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据父节点获取栏目列表
     * </pre>
     */
    public void listCategoryByPid(api.cms.service.v1.ListCategoryByPidRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.ListCategoryByPidReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCategoryByPidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *创建文章
     * </pre>
     */
    public void createArticle(api.cms.service.v1.CreateArticleRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.CreateArticleReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateArticleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *更新文章
     * </pre>
     */
    public void updateArticle(api.cms.service.v1.UpdateArticleRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.UpdateArticleReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateArticleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *删除文章
     * </pre>
     */
    public void deleteArticle(api.cms.service.v1.DeleteArticleRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.DeleteArticleReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteArticleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *查询文章
     * </pre>
     */
    public void getArticle(api.cms.service.v1.GetArticleRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.GetArticleReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetArticleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *查询文章内容
     * </pre>
     */
    public void getArticleData(api.cms.service.v1.GetArticleDataRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.GetArticleDataReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetArticleDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *查询文章列表
     * </pre>
     */
    public void listArticle(api.cms.service.v1.ListArticleRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.ListArticleReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListArticleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据栏目获取文章列表
     * </pre>
     */
    public void listArticleByCid(api.cms.service.v1.ListArticleByCidRequest request,
        io.grpc.stub.StreamObserver<api.cms.service.v1.ListArticleByCidReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListArticleByCidMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *cms服务
   * </pre>
   */
  public static final class CmsBlockingStub extends io.grpc.stub.AbstractBlockingStub<CmsBlockingStub> {
    private CmsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CmsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CmsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *创建栏目
     * </pre>
     */
    public api.cms.service.v1.CreateCategoryReply createCategory(api.cms.service.v1.CreateCategoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCategoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *更新栏目
     * </pre>
     */
    public api.cms.service.v1.UpdateCategoryReply updateCategory(api.cms.service.v1.UpdateCategoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCategoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *删除栏目
     * </pre>
     */
    public api.cms.service.v1.DeleteCategoryReply deleteCategory(api.cms.service.v1.DeleteCategoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCategoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *查询栏目
     * </pre>
     */
    public api.cms.service.v1.GetCategoryReply getCategory(api.cms.service.v1.GetCategoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCategoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *查询栏目列表
     * </pre>
     */
    public api.cms.service.v1.ListCategoryReply listCategory(api.cms.service.v1.ListCategoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCategoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *根据父节点获取栏目列表
     * </pre>
     */
    public api.cms.service.v1.ListCategoryByPidReply listCategoryByPid(api.cms.service.v1.ListCategoryByPidRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCategoryByPidMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *创建文章
     * </pre>
     */
    public api.cms.service.v1.CreateArticleReply createArticle(api.cms.service.v1.CreateArticleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateArticleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *更新文章
     * </pre>
     */
    public api.cms.service.v1.UpdateArticleReply updateArticle(api.cms.service.v1.UpdateArticleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateArticleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *删除文章
     * </pre>
     */
    public api.cms.service.v1.DeleteArticleReply deleteArticle(api.cms.service.v1.DeleteArticleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteArticleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *查询文章
     * </pre>
     */
    public api.cms.service.v1.GetArticleReply getArticle(api.cms.service.v1.GetArticleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetArticleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *查询文章内容
     * </pre>
     */
    public api.cms.service.v1.GetArticleDataReply getArticleData(api.cms.service.v1.GetArticleDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetArticleDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *查询文章列表
     * </pre>
     */
    public api.cms.service.v1.ListArticleReply listArticle(api.cms.service.v1.ListArticleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListArticleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *根据栏目获取文章列表
     * </pre>
     */
    public api.cms.service.v1.ListArticleByCidReply listArticleByCid(api.cms.service.v1.ListArticleByCidRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListArticleByCidMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *cms服务
   * </pre>
   */
  public static final class CmsFutureStub extends io.grpc.stub.AbstractFutureStub<CmsFutureStub> {
    private CmsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CmsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CmsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *创建栏目
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.cms.service.v1.CreateCategoryReply> createCategory(
        api.cms.service.v1.CreateCategoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCategoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *更新栏目
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.cms.service.v1.UpdateCategoryReply> updateCategory(
        api.cms.service.v1.UpdateCategoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCategoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *删除栏目
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.cms.service.v1.DeleteCategoryReply> deleteCategory(
        api.cms.service.v1.DeleteCategoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCategoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *查询栏目
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.cms.service.v1.GetCategoryReply> getCategory(
        api.cms.service.v1.GetCategoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCategoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *查询栏目列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.cms.service.v1.ListCategoryReply> listCategory(
        api.cms.service.v1.ListCategoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCategoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *根据父节点获取栏目列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.cms.service.v1.ListCategoryByPidReply> listCategoryByPid(
        api.cms.service.v1.ListCategoryByPidRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCategoryByPidMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *创建文章
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.cms.service.v1.CreateArticleReply> createArticle(
        api.cms.service.v1.CreateArticleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateArticleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *更新文章
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.cms.service.v1.UpdateArticleReply> updateArticle(
        api.cms.service.v1.UpdateArticleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateArticleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *删除文章
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.cms.service.v1.DeleteArticleReply> deleteArticle(
        api.cms.service.v1.DeleteArticleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteArticleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *查询文章
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.cms.service.v1.GetArticleReply> getArticle(
        api.cms.service.v1.GetArticleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetArticleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *查询文章内容
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.cms.service.v1.GetArticleDataReply> getArticleData(
        api.cms.service.v1.GetArticleDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetArticleDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *查询文章列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.cms.service.v1.ListArticleReply> listArticle(
        api.cms.service.v1.ListArticleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListArticleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *根据栏目获取文章列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.cms.service.v1.ListArticleByCidReply> listArticleByCid(
        api.cms.service.v1.ListArticleByCidRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListArticleByCidMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CATEGORY = 0;
  private static final int METHODID_UPDATE_CATEGORY = 1;
  private static final int METHODID_DELETE_CATEGORY = 2;
  private static final int METHODID_GET_CATEGORY = 3;
  private static final int METHODID_LIST_CATEGORY = 4;
  private static final int METHODID_LIST_CATEGORY_BY_PID = 5;
  private static final int METHODID_CREATE_ARTICLE = 6;
  private static final int METHODID_UPDATE_ARTICLE = 7;
  private static final int METHODID_DELETE_ARTICLE = 8;
  private static final int METHODID_GET_ARTICLE = 9;
  private static final int METHODID_GET_ARTICLE_DATA = 10;
  private static final int METHODID_LIST_ARTICLE = 11;
  private static final int METHODID_LIST_ARTICLE_BY_CID = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CmsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CmsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CATEGORY:
          serviceImpl.createCategory((api.cms.service.v1.CreateCategoryRequest) request,
              (io.grpc.stub.StreamObserver<api.cms.service.v1.CreateCategoryReply>) responseObserver);
          break;
        case METHODID_UPDATE_CATEGORY:
          serviceImpl.updateCategory((api.cms.service.v1.UpdateCategoryRequest) request,
              (io.grpc.stub.StreamObserver<api.cms.service.v1.UpdateCategoryReply>) responseObserver);
          break;
        case METHODID_DELETE_CATEGORY:
          serviceImpl.deleteCategory((api.cms.service.v1.DeleteCategoryRequest) request,
              (io.grpc.stub.StreamObserver<api.cms.service.v1.DeleteCategoryReply>) responseObserver);
          break;
        case METHODID_GET_CATEGORY:
          serviceImpl.getCategory((api.cms.service.v1.GetCategoryRequest) request,
              (io.grpc.stub.StreamObserver<api.cms.service.v1.GetCategoryReply>) responseObserver);
          break;
        case METHODID_LIST_CATEGORY:
          serviceImpl.listCategory((api.cms.service.v1.ListCategoryRequest) request,
              (io.grpc.stub.StreamObserver<api.cms.service.v1.ListCategoryReply>) responseObserver);
          break;
        case METHODID_LIST_CATEGORY_BY_PID:
          serviceImpl.listCategoryByPid((api.cms.service.v1.ListCategoryByPidRequest) request,
              (io.grpc.stub.StreamObserver<api.cms.service.v1.ListCategoryByPidReply>) responseObserver);
          break;
        case METHODID_CREATE_ARTICLE:
          serviceImpl.createArticle((api.cms.service.v1.CreateArticleRequest) request,
              (io.grpc.stub.StreamObserver<api.cms.service.v1.CreateArticleReply>) responseObserver);
          break;
        case METHODID_UPDATE_ARTICLE:
          serviceImpl.updateArticle((api.cms.service.v1.UpdateArticleRequest) request,
              (io.grpc.stub.StreamObserver<api.cms.service.v1.UpdateArticleReply>) responseObserver);
          break;
        case METHODID_DELETE_ARTICLE:
          serviceImpl.deleteArticle((api.cms.service.v1.DeleteArticleRequest) request,
              (io.grpc.stub.StreamObserver<api.cms.service.v1.DeleteArticleReply>) responseObserver);
          break;
        case METHODID_GET_ARTICLE:
          serviceImpl.getArticle((api.cms.service.v1.GetArticleRequest) request,
              (io.grpc.stub.StreamObserver<api.cms.service.v1.GetArticleReply>) responseObserver);
          break;
        case METHODID_GET_ARTICLE_DATA:
          serviceImpl.getArticleData((api.cms.service.v1.GetArticleDataRequest) request,
              (io.grpc.stub.StreamObserver<api.cms.service.v1.GetArticleDataReply>) responseObserver);
          break;
        case METHODID_LIST_ARTICLE:
          serviceImpl.listArticle((api.cms.service.v1.ListArticleRequest) request,
              (io.grpc.stub.StreamObserver<api.cms.service.v1.ListArticleReply>) responseObserver);
          break;
        case METHODID_LIST_ARTICLE_BY_CID:
          serviceImpl.listArticleByCid((api.cms.service.v1.ListArticleByCidRequest) request,
              (io.grpc.stub.StreamObserver<api.cms.service.v1.ListArticleByCidReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CmsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CmsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return api.cms.service.v1.CmsOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Cms");
    }
  }

  private static final class CmsFileDescriptorSupplier
      extends CmsBaseDescriptorSupplier {
    CmsFileDescriptorSupplier() {}
  }

  private static final class CmsMethodDescriptorSupplier
      extends CmsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CmsMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CmsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CmsFileDescriptorSupplier())
              .addMethod(getCreateCategoryMethod())
              .addMethod(getUpdateCategoryMethod())
              .addMethod(getDeleteCategoryMethod())
              .addMethod(getGetCategoryMethod())
              .addMethod(getListCategoryMethod())
              .addMethod(getListCategoryByPidMethod())
              .addMethod(getCreateArticleMethod())
              .addMethod(getUpdateArticleMethod())
              .addMethod(getDeleteArticleMethod())
              .addMethod(getGetArticleMethod())
              .addMethod(getGetArticleDataMethod())
              .addMethod(getListArticleMethod())
              .addMethod(getListArticleByCidMethod())
              .build();
        }
      }
    }
    return result;
  }
}
