// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cms.proto

package api.cms.service.v1;

/**
 * Protobuf type {@code api.cms.service.v1.GetArticleRequest}
 */
public final class GetArticleRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.cms.service.v1.GetArticleRequest)
    GetArticleRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetArticleRequest.newBuilder() to construct.
  private GetArticleRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetArticleRequest() {
    tenantId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetArticleRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetArticleRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            tenantId_ = s;
            break;
          }
          case 16: {

            id_ = input.readInt64();
            break;
          }
          case 26: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (showFieldMask_ != null) {
              subBuilder = showFieldMask_.toBuilder();
            }
            showFieldMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(showFieldMask_);
              showFieldMask_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return api.cms.service.v1.CmsOuterClass.internal_static_api_cms_service_v1_GetArticleRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return api.cms.service.v1.CmsOuterClass.internal_static_api_cms_service_v1_GetArticleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            api.cms.service.v1.GetArticleRequest.class, api.cms.service.v1.GetArticleRequest.Builder.class);
  }

  public static final int TENANT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object tenantId_;
  /**
   * <code>string tenant_id = 1;</code>
   * @return The tenantId.
   */
  @java.lang.Override
  public java.lang.String getTenantId() {
    java.lang.Object ref = tenantId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tenantId_ = s;
      return s;
    }
  }
  /**
   * <code>string tenant_id = 1;</code>
   * @return The bytes for tenantId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTenantIdBytes() {
    java.lang.Object ref = tenantId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tenantId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ID_FIELD_NUMBER = 2;
  private long id_;
  /**
   * <code>int64 id = 2;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int SHOW_FIELD_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.FieldMask showFieldMask_;
  /**
   * <code>.google.protobuf.FieldMask show_field_mask = 3;</code>
   * @return Whether the showFieldMask field is set.
   */
  @java.lang.Override
  public boolean hasShowFieldMask() {
    return showFieldMask_ != null;
  }
  /**
   * <code>.google.protobuf.FieldMask show_field_mask = 3;</code>
   * @return The showFieldMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getShowFieldMask() {
    return showFieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : showFieldMask_;
  }
  /**
   * <code>.google.protobuf.FieldMask show_field_mask = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getShowFieldMaskOrBuilder() {
    return getShowFieldMask();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tenantId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tenantId_);
    }
    if (id_ != 0L) {
      output.writeInt64(2, id_);
    }
    if (showFieldMask_ != null) {
      output.writeMessage(3, getShowFieldMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tenantId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tenantId_);
    }
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, id_);
    }
    if (showFieldMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getShowFieldMask());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof api.cms.service.v1.GetArticleRequest)) {
      return super.equals(obj);
    }
    api.cms.service.v1.GetArticleRequest other = (api.cms.service.v1.GetArticleRequest) obj;

    if (!getTenantId()
        .equals(other.getTenantId())) return false;
    if (getId()
        != other.getId()) return false;
    if (hasShowFieldMask() != other.hasShowFieldMask()) return false;
    if (hasShowFieldMask()) {
      if (!getShowFieldMask()
          .equals(other.getShowFieldMask())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TENANT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTenantId().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    if (hasShowFieldMask()) {
      hash = (37 * hash) + SHOW_FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getShowFieldMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static api.cms.service.v1.GetArticleRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.cms.service.v1.GetArticleRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.cms.service.v1.GetArticleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.cms.service.v1.GetArticleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.cms.service.v1.GetArticleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.cms.service.v1.GetArticleRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.cms.service.v1.GetArticleRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.cms.service.v1.GetArticleRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.cms.service.v1.GetArticleRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static api.cms.service.v1.GetArticleRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.cms.service.v1.GetArticleRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.cms.service.v1.GetArticleRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(api.cms.service.v1.GetArticleRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code api.cms.service.v1.GetArticleRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.cms.service.v1.GetArticleRequest)
      api.cms.service.v1.GetArticleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return api.cms.service.v1.CmsOuterClass.internal_static_api_cms_service_v1_GetArticleRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return api.cms.service.v1.CmsOuterClass.internal_static_api_cms_service_v1_GetArticleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              api.cms.service.v1.GetArticleRequest.class, api.cms.service.v1.GetArticleRequest.Builder.class);
    }

    // Construct using api.cms.service.v1.GetArticleRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      tenantId_ = "";

      id_ = 0L;

      if (showFieldMaskBuilder_ == null) {
        showFieldMask_ = null;
      } else {
        showFieldMask_ = null;
        showFieldMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return api.cms.service.v1.CmsOuterClass.internal_static_api_cms_service_v1_GetArticleRequest_descriptor;
    }

    @java.lang.Override
    public api.cms.service.v1.GetArticleRequest getDefaultInstanceForType() {
      return api.cms.service.v1.GetArticleRequest.getDefaultInstance();
    }

    @java.lang.Override
    public api.cms.service.v1.GetArticleRequest build() {
      api.cms.service.v1.GetArticleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public api.cms.service.v1.GetArticleRequest buildPartial() {
      api.cms.service.v1.GetArticleRequest result = new api.cms.service.v1.GetArticleRequest(this);
      result.tenantId_ = tenantId_;
      result.id_ = id_;
      if (showFieldMaskBuilder_ == null) {
        result.showFieldMask_ = showFieldMask_;
      } else {
        result.showFieldMask_ = showFieldMaskBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof api.cms.service.v1.GetArticleRequest) {
        return mergeFrom((api.cms.service.v1.GetArticleRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(api.cms.service.v1.GetArticleRequest other) {
      if (other == api.cms.service.v1.GetArticleRequest.getDefaultInstance()) return this;
      if (!other.getTenantId().isEmpty()) {
        tenantId_ = other.tenantId_;
        onChanged();
      }
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.hasShowFieldMask()) {
        mergeShowFieldMask(other.getShowFieldMask());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      api.cms.service.v1.GetArticleRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (api.cms.service.v1.GetArticleRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object tenantId_ = "";
    /**
     * <code>string tenant_id = 1;</code>
     * @return The tenantId.
     */
    public java.lang.String getTenantId() {
      java.lang.Object ref = tenantId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tenantId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string tenant_id = 1;</code>
     * @return The bytes for tenantId.
     */
    public com.google.protobuf.ByteString
        getTenantIdBytes() {
      java.lang.Object ref = tenantId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tenantId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string tenant_id = 1;</code>
     * @param value The tenantId to set.
     * @return This builder for chaining.
     */
    public Builder setTenantId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tenantId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string tenant_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTenantId() {
      
      tenantId_ = getDefaultInstance().getTenantId();
      onChanged();
      return this;
    }
    /**
     * <code>string tenant_id = 1;</code>
     * @param value The bytes for tenantId to set.
     * @return This builder for chaining.
     */
    public Builder setTenantIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tenantId_ = value;
      onChanged();
      return this;
    }

    private long id_ ;
    /**
     * <code>int64 id = 2;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 2;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.FieldMask showFieldMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> showFieldMaskBuilder_;
    /**
     * <code>.google.protobuf.FieldMask show_field_mask = 3;</code>
     * @return Whether the showFieldMask field is set.
     */
    public boolean hasShowFieldMask() {
      return showFieldMaskBuilder_ != null || showFieldMask_ != null;
    }
    /**
     * <code>.google.protobuf.FieldMask show_field_mask = 3;</code>
     * @return The showFieldMask.
     */
    public com.google.protobuf.FieldMask getShowFieldMask() {
      if (showFieldMaskBuilder_ == null) {
        return showFieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : showFieldMask_;
      } else {
        return showFieldMaskBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.FieldMask show_field_mask = 3;</code>
     */
    public Builder setShowFieldMask(com.google.protobuf.FieldMask value) {
      if (showFieldMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        showFieldMask_ = value;
        onChanged();
      } else {
        showFieldMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask show_field_mask = 3;</code>
     */
    public Builder setShowFieldMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (showFieldMaskBuilder_ == null) {
        showFieldMask_ = builderForValue.build();
        onChanged();
      } else {
        showFieldMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask show_field_mask = 3;</code>
     */
    public Builder mergeShowFieldMask(com.google.protobuf.FieldMask value) {
      if (showFieldMaskBuilder_ == null) {
        if (showFieldMask_ != null) {
          showFieldMask_ =
            com.google.protobuf.FieldMask.newBuilder(showFieldMask_).mergeFrom(value).buildPartial();
        } else {
          showFieldMask_ = value;
        }
        onChanged();
      } else {
        showFieldMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask show_field_mask = 3;</code>
     */
    public Builder clearShowFieldMask() {
      if (showFieldMaskBuilder_ == null) {
        showFieldMask_ = null;
        onChanged();
      } else {
        showFieldMask_ = null;
        showFieldMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask show_field_mask = 3;</code>
     */
    public com.google.protobuf.FieldMask.Builder getShowFieldMaskBuilder() {
      
      onChanged();
      return getShowFieldMaskFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.FieldMask show_field_mask = 3;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getShowFieldMaskOrBuilder() {
      if (showFieldMaskBuilder_ != null) {
        return showFieldMaskBuilder_.getMessageOrBuilder();
      } else {
        return showFieldMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : showFieldMask_;
      }
    }
    /**
     * <code>.google.protobuf.FieldMask show_field_mask = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getShowFieldMaskFieldBuilder() {
      if (showFieldMaskBuilder_ == null) {
        showFieldMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getShowFieldMask(),
                getParentForChildren(),
                isClean());
        showFieldMask_ = null;
      }
      return showFieldMaskBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api.cms.service.v1.GetArticleRequest)
  }

  // @@protoc_insertion_point(class_scope:api.cms.service.v1.GetArticleRequest)
  private static final api.cms.service.v1.GetArticleRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new api.cms.service.v1.GetArticleRequest();
  }

  public static api.cms.service.v1.GetArticleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetArticleRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetArticleRequest>() {
    @java.lang.Override
    public GetArticleRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetArticleRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetArticleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetArticleRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public api.cms.service.v1.GetArticleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

