// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cms.proto

package api.cms.service.v1;

/**
 * Protobuf type {@code api.cms.service.v1.GetArticleDataReply}
 */
public final class GetArticleDataReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.cms.service.v1.GetArticleDataReply)
    GetArticleDataReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetArticleDataReply.newBuilder() to construct.
  private GetArticleDataReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetArticleDataReply() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetArticleDataReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetArticleDataReply(
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
            api.cms.service.v1.ArticleData.Builder subBuilder = null;
            if (articleData_ != null) {
              subBuilder = articleData_.toBuilder();
            }
            articleData_ = input.readMessage(api.cms.service.v1.ArticleData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(articleData_);
              articleData_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
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
    return api.cms.service.v1.CmsOuterClass.internal_static_api_cms_service_v1_GetArticleDataReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return api.cms.service.v1.CmsOuterClass.internal_static_api_cms_service_v1_GetArticleDataReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            api.cms.service.v1.GetArticleDataReply.class, api.cms.service.v1.GetArticleDataReply.Builder.class);
  }

  public static final int ARTICLE_DATA_FIELD_NUMBER = 1;
  private api.cms.service.v1.ArticleData articleData_;
  /**
   * <code>.api.cms.service.v1.ArticleData article_data = 1;</code>
   * @return Whether the articleData field is set.
   */
  @java.lang.Override
  public boolean hasArticleData() {
    return articleData_ != null;
  }
  /**
   * <code>.api.cms.service.v1.ArticleData article_data = 1;</code>
   * @return The articleData.
   */
  @java.lang.Override
  public api.cms.service.v1.ArticleData getArticleData() {
    return articleData_ == null ? api.cms.service.v1.ArticleData.getDefaultInstance() : articleData_;
  }
  /**
   * <code>.api.cms.service.v1.ArticleData article_data = 1;</code>
   */
  @java.lang.Override
  public api.cms.service.v1.ArticleDataOrBuilder getArticleDataOrBuilder() {
    return getArticleData();
  }

  public static final int SHOW_FIELD_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask showFieldMask_;
  /**
   * <code>.google.protobuf.FieldMask show_field_mask = 2;</code>
   * @return Whether the showFieldMask field is set.
   */
  @java.lang.Override
  public boolean hasShowFieldMask() {
    return showFieldMask_ != null;
  }
  /**
   * <code>.google.protobuf.FieldMask show_field_mask = 2;</code>
   * @return The showFieldMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getShowFieldMask() {
    return showFieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : showFieldMask_;
  }
  /**
   * <code>.google.protobuf.FieldMask show_field_mask = 2;</code>
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
    if (articleData_ != null) {
      output.writeMessage(1, getArticleData());
    }
    if (showFieldMask_ != null) {
      output.writeMessage(2, getShowFieldMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (articleData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getArticleData());
    }
    if (showFieldMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getShowFieldMask());
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
    if (!(obj instanceof api.cms.service.v1.GetArticleDataReply)) {
      return super.equals(obj);
    }
    api.cms.service.v1.GetArticleDataReply other = (api.cms.service.v1.GetArticleDataReply) obj;

    if (hasArticleData() != other.hasArticleData()) return false;
    if (hasArticleData()) {
      if (!getArticleData()
          .equals(other.getArticleData())) return false;
    }
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
    if (hasArticleData()) {
      hash = (37 * hash) + ARTICLE_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getArticleData().hashCode();
    }
    if (hasShowFieldMask()) {
      hash = (37 * hash) + SHOW_FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getShowFieldMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static api.cms.service.v1.GetArticleDataReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.cms.service.v1.GetArticleDataReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.cms.service.v1.GetArticleDataReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.cms.service.v1.GetArticleDataReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.cms.service.v1.GetArticleDataReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.cms.service.v1.GetArticleDataReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.cms.service.v1.GetArticleDataReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.cms.service.v1.GetArticleDataReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.cms.service.v1.GetArticleDataReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static api.cms.service.v1.GetArticleDataReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.cms.service.v1.GetArticleDataReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.cms.service.v1.GetArticleDataReply parseFrom(
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
  public static Builder newBuilder(api.cms.service.v1.GetArticleDataReply prototype) {
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
   * Protobuf type {@code api.cms.service.v1.GetArticleDataReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.cms.service.v1.GetArticleDataReply)
      api.cms.service.v1.GetArticleDataReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return api.cms.service.v1.CmsOuterClass.internal_static_api_cms_service_v1_GetArticleDataReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return api.cms.service.v1.CmsOuterClass.internal_static_api_cms_service_v1_GetArticleDataReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              api.cms.service.v1.GetArticleDataReply.class, api.cms.service.v1.GetArticleDataReply.Builder.class);
    }

    // Construct using api.cms.service.v1.GetArticleDataReply.newBuilder()
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
      if (articleDataBuilder_ == null) {
        articleData_ = null;
      } else {
        articleData_ = null;
        articleDataBuilder_ = null;
      }
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
      return api.cms.service.v1.CmsOuterClass.internal_static_api_cms_service_v1_GetArticleDataReply_descriptor;
    }

    @java.lang.Override
    public api.cms.service.v1.GetArticleDataReply getDefaultInstanceForType() {
      return api.cms.service.v1.GetArticleDataReply.getDefaultInstance();
    }

    @java.lang.Override
    public api.cms.service.v1.GetArticleDataReply build() {
      api.cms.service.v1.GetArticleDataReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public api.cms.service.v1.GetArticleDataReply buildPartial() {
      api.cms.service.v1.GetArticleDataReply result = new api.cms.service.v1.GetArticleDataReply(this);
      if (articleDataBuilder_ == null) {
        result.articleData_ = articleData_;
      } else {
        result.articleData_ = articleDataBuilder_.build();
      }
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
      if (other instanceof api.cms.service.v1.GetArticleDataReply) {
        return mergeFrom((api.cms.service.v1.GetArticleDataReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(api.cms.service.v1.GetArticleDataReply other) {
      if (other == api.cms.service.v1.GetArticleDataReply.getDefaultInstance()) return this;
      if (other.hasArticleData()) {
        mergeArticleData(other.getArticleData());
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
      api.cms.service.v1.GetArticleDataReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (api.cms.service.v1.GetArticleDataReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private api.cms.service.v1.ArticleData articleData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        api.cms.service.v1.ArticleData, api.cms.service.v1.ArticleData.Builder, api.cms.service.v1.ArticleDataOrBuilder> articleDataBuilder_;
    /**
     * <code>.api.cms.service.v1.ArticleData article_data = 1;</code>
     * @return Whether the articleData field is set.
     */
    public boolean hasArticleData() {
      return articleDataBuilder_ != null || articleData_ != null;
    }
    /**
     * <code>.api.cms.service.v1.ArticleData article_data = 1;</code>
     * @return The articleData.
     */
    public api.cms.service.v1.ArticleData getArticleData() {
      if (articleDataBuilder_ == null) {
        return articleData_ == null ? api.cms.service.v1.ArticleData.getDefaultInstance() : articleData_;
      } else {
        return articleDataBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.cms.service.v1.ArticleData article_data = 1;</code>
     */
    public Builder setArticleData(api.cms.service.v1.ArticleData value) {
      if (articleDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        articleData_ = value;
        onChanged();
      } else {
        articleDataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.api.cms.service.v1.ArticleData article_data = 1;</code>
     */
    public Builder setArticleData(
        api.cms.service.v1.ArticleData.Builder builderForValue) {
      if (articleDataBuilder_ == null) {
        articleData_ = builderForValue.build();
        onChanged();
      } else {
        articleDataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.api.cms.service.v1.ArticleData article_data = 1;</code>
     */
    public Builder mergeArticleData(api.cms.service.v1.ArticleData value) {
      if (articleDataBuilder_ == null) {
        if (articleData_ != null) {
          articleData_ =
            api.cms.service.v1.ArticleData.newBuilder(articleData_).mergeFrom(value).buildPartial();
        } else {
          articleData_ = value;
        }
        onChanged();
      } else {
        articleDataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.api.cms.service.v1.ArticleData article_data = 1;</code>
     */
    public Builder clearArticleData() {
      if (articleDataBuilder_ == null) {
        articleData_ = null;
        onChanged();
      } else {
        articleData_ = null;
        articleDataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.api.cms.service.v1.ArticleData article_data = 1;</code>
     */
    public api.cms.service.v1.ArticleData.Builder getArticleDataBuilder() {
      
      onChanged();
      return getArticleDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.cms.service.v1.ArticleData article_data = 1;</code>
     */
    public api.cms.service.v1.ArticleDataOrBuilder getArticleDataOrBuilder() {
      if (articleDataBuilder_ != null) {
        return articleDataBuilder_.getMessageOrBuilder();
      } else {
        return articleData_ == null ?
            api.cms.service.v1.ArticleData.getDefaultInstance() : articleData_;
      }
    }
    /**
     * <code>.api.cms.service.v1.ArticleData article_data = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        api.cms.service.v1.ArticleData, api.cms.service.v1.ArticleData.Builder, api.cms.service.v1.ArticleDataOrBuilder> 
        getArticleDataFieldBuilder() {
      if (articleDataBuilder_ == null) {
        articleDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            api.cms.service.v1.ArticleData, api.cms.service.v1.ArticleData.Builder, api.cms.service.v1.ArticleDataOrBuilder>(
                getArticleData(),
                getParentForChildren(),
                isClean());
        articleData_ = null;
      }
      return articleDataBuilder_;
    }

    private com.google.protobuf.FieldMask showFieldMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> showFieldMaskBuilder_;
    /**
     * <code>.google.protobuf.FieldMask show_field_mask = 2;</code>
     * @return Whether the showFieldMask field is set.
     */
    public boolean hasShowFieldMask() {
      return showFieldMaskBuilder_ != null || showFieldMask_ != null;
    }
    /**
     * <code>.google.protobuf.FieldMask show_field_mask = 2;</code>
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
     * <code>.google.protobuf.FieldMask show_field_mask = 2;</code>
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
     * <code>.google.protobuf.FieldMask show_field_mask = 2;</code>
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
     * <code>.google.protobuf.FieldMask show_field_mask = 2;</code>
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
     * <code>.google.protobuf.FieldMask show_field_mask = 2;</code>
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
     * <code>.google.protobuf.FieldMask show_field_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getShowFieldMaskBuilder() {
      
      onChanged();
      return getShowFieldMaskFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.FieldMask show_field_mask = 2;</code>
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
     * <code>.google.protobuf.FieldMask show_field_mask = 2;</code>
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


    // @@protoc_insertion_point(builder_scope:api.cms.service.v1.GetArticleDataReply)
  }

  // @@protoc_insertion_point(class_scope:api.cms.service.v1.GetArticleDataReply)
  private static final api.cms.service.v1.GetArticleDataReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new api.cms.service.v1.GetArticleDataReply();
  }

  public static api.cms.service.v1.GetArticleDataReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetArticleDataReply>
      PARSER = new com.google.protobuf.AbstractParser<GetArticleDataReply>() {
    @java.lang.Override
    public GetArticleDataReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetArticleDataReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetArticleDataReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetArticleDataReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public api.cms.service.v1.GetArticleDataReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
