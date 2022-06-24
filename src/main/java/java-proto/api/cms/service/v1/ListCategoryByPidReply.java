// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cms.proto

package api.cms.service.v1;

/**
 * Protobuf type {@code api.cms.service.v1.ListCategoryByPidReply}
 */
public final class ListCategoryByPidReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.cms.service.v1.ListCategoryByPidReply)
    ListCategoryByPidReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListCategoryByPidReply.newBuilder() to construct.
  private ListCategoryByPidReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListCategoryByPidReply() {
    list_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListCategoryByPidReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListCategoryByPidReply(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 8: {

            pageNo_ = input.readInt64();
            break;
          }
          case 16: {

            pageSize_ = input.readInt64();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              list_ = new java.util.ArrayList<api.cms.service.v1.Category>();
              mutable_bitField0_ |= 0x00000001;
            }
            list_.add(
                input.readMessage(api.cms.service.v1.Category.parser(), extensionRegistry));
            break;
          }
          case 32: {

            totalSize_ = input.readInt64();
            break;
          }
          case 40: {

            totalPage_ = input.readUInt64();
            break;
          }
          case 50: {
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        list_ = java.util.Collections.unmodifiableList(list_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return api.cms.service.v1.CmsOuterClass.internal_static_api_cms_service_v1_ListCategoryByPidReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return api.cms.service.v1.CmsOuterClass.internal_static_api_cms_service_v1_ListCategoryByPidReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            api.cms.service.v1.ListCategoryByPidReply.class, api.cms.service.v1.ListCategoryByPidReply.Builder.class);
  }

  public static final int PAGE_NO_FIELD_NUMBER = 1;
  private long pageNo_;
  /**
   * <code>int64 page_no = 1;</code>
   * @return The pageNo.
   */
  @java.lang.Override
  public long getPageNo() {
    return pageNo_;
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 2;
  private long pageSize_;
  /**
   * <code>int64 page_size = 2;</code>
   * @return The pageSize.
   */
  @java.lang.Override
  public long getPageSize() {
    return pageSize_;
  }

  public static final int LIST_FIELD_NUMBER = 3;
  private java.util.List<api.cms.service.v1.Category> list_;
  /**
   * <code>repeated .api.cms.service.v1.Category list = 3;</code>
   */
  @java.lang.Override
  public java.util.List<api.cms.service.v1.Category> getListList() {
    return list_;
  }
  /**
   * <code>repeated .api.cms.service.v1.Category list = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends api.cms.service.v1.CategoryOrBuilder> 
      getListOrBuilderList() {
    return list_;
  }
  /**
   * <code>repeated .api.cms.service.v1.Category list = 3;</code>
   */
  @java.lang.Override
  public int getListCount() {
    return list_.size();
  }
  /**
   * <code>repeated .api.cms.service.v1.Category list = 3;</code>
   */
  @java.lang.Override
  public api.cms.service.v1.Category getList(int index) {
    return list_.get(index);
  }
  /**
   * <code>repeated .api.cms.service.v1.Category list = 3;</code>
   */
  @java.lang.Override
  public api.cms.service.v1.CategoryOrBuilder getListOrBuilder(
      int index) {
    return list_.get(index);
  }

  public static final int TOTAL_SIZE_FIELD_NUMBER = 4;
  private long totalSize_;
  /**
   * <code>int64 total_size = 4;</code>
   * @return The totalSize.
   */
  @java.lang.Override
  public long getTotalSize() {
    return totalSize_;
  }

  public static final int TOTAL_PAGE_FIELD_NUMBER = 5;
  private long totalPage_;
  /**
   * <code>uint64 total_page = 5;</code>
   * @return The totalPage.
   */
  @java.lang.Override
  public long getTotalPage() {
    return totalPage_;
  }

  public static final int SHOW_FIELD_MASK_FIELD_NUMBER = 6;
  private com.google.protobuf.FieldMask showFieldMask_;
  /**
   * <code>.google.protobuf.FieldMask show_field_mask = 6;</code>
   * @return Whether the showFieldMask field is set.
   */
  @java.lang.Override
  public boolean hasShowFieldMask() {
    return showFieldMask_ != null;
  }
  /**
   * <code>.google.protobuf.FieldMask show_field_mask = 6;</code>
   * @return The showFieldMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getShowFieldMask() {
    return showFieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : showFieldMask_;
  }
  /**
   * <code>.google.protobuf.FieldMask show_field_mask = 6;</code>
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
    if (pageNo_ != 0L) {
      output.writeInt64(1, pageNo_);
    }
    if (pageSize_ != 0L) {
      output.writeInt64(2, pageSize_);
    }
    for (int i = 0; i < list_.size(); i++) {
      output.writeMessage(3, list_.get(i));
    }
    if (totalSize_ != 0L) {
      output.writeInt64(4, totalSize_);
    }
    if (totalPage_ != 0L) {
      output.writeUInt64(5, totalPage_);
    }
    if (showFieldMask_ != null) {
      output.writeMessage(6, getShowFieldMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pageNo_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, pageNo_);
    }
    if (pageSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, pageSize_);
    }
    for (int i = 0; i < list_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, list_.get(i));
    }
    if (totalSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, totalSize_);
    }
    if (totalPage_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, totalPage_);
    }
    if (showFieldMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getShowFieldMask());
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
    if (!(obj instanceof api.cms.service.v1.ListCategoryByPidReply)) {
      return super.equals(obj);
    }
    api.cms.service.v1.ListCategoryByPidReply other = (api.cms.service.v1.ListCategoryByPidReply) obj;

    if (getPageNo()
        != other.getPageNo()) return false;
    if (getPageSize()
        != other.getPageSize()) return false;
    if (!getListList()
        .equals(other.getListList())) return false;
    if (getTotalSize()
        != other.getTotalSize()) return false;
    if (getTotalPage()
        != other.getTotalPage()) return false;
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
    hash = (37 * hash) + PAGE_NO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageNo());
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageSize());
    if (getListCount() > 0) {
      hash = (37 * hash) + LIST_FIELD_NUMBER;
      hash = (53 * hash) + getListList().hashCode();
    }
    hash = (37 * hash) + TOTAL_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalSize());
    hash = (37 * hash) + TOTAL_PAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalPage());
    if (hasShowFieldMask()) {
      hash = (37 * hash) + SHOW_FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getShowFieldMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static api.cms.service.v1.ListCategoryByPidReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.cms.service.v1.ListCategoryByPidReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.cms.service.v1.ListCategoryByPidReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.cms.service.v1.ListCategoryByPidReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.cms.service.v1.ListCategoryByPidReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.cms.service.v1.ListCategoryByPidReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.cms.service.v1.ListCategoryByPidReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.cms.service.v1.ListCategoryByPidReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.cms.service.v1.ListCategoryByPidReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static api.cms.service.v1.ListCategoryByPidReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.cms.service.v1.ListCategoryByPidReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.cms.service.v1.ListCategoryByPidReply parseFrom(
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
  public static Builder newBuilder(api.cms.service.v1.ListCategoryByPidReply prototype) {
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
   * Protobuf type {@code api.cms.service.v1.ListCategoryByPidReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.cms.service.v1.ListCategoryByPidReply)
      api.cms.service.v1.ListCategoryByPidReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return api.cms.service.v1.CmsOuterClass.internal_static_api_cms_service_v1_ListCategoryByPidReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return api.cms.service.v1.CmsOuterClass.internal_static_api_cms_service_v1_ListCategoryByPidReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              api.cms.service.v1.ListCategoryByPidReply.class, api.cms.service.v1.ListCategoryByPidReply.Builder.class);
    }

    // Construct using api.cms.service.v1.ListCategoryByPidReply.newBuilder()
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
        getListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      pageNo_ = 0L;

      pageSize_ = 0L;

      if (listBuilder_ == null) {
        list_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        listBuilder_.clear();
      }
      totalSize_ = 0L;

      totalPage_ = 0L;

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
      return api.cms.service.v1.CmsOuterClass.internal_static_api_cms_service_v1_ListCategoryByPidReply_descriptor;
    }

    @java.lang.Override
    public api.cms.service.v1.ListCategoryByPidReply getDefaultInstanceForType() {
      return api.cms.service.v1.ListCategoryByPidReply.getDefaultInstance();
    }

    @java.lang.Override
    public api.cms.service.v1.ListCategoryByPidReply build() {
      api.cms.service.v1.ListCategoryByPidReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public api.cms.service.v1.ListCategoryByPidReply buildPartial() {
      api.cms.service.v1.ListCategoryByPidReply result = new api.cms.service.v1.ListCategoryByPidReply(this);
      int from_bitField0_ = bitField0_;
      result.pageNo_ = pageNo_;
      result.pageSize_ = pageSize_;
      if (listBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          list_ = java.util.Collections.unmodifiableList(list_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.list_ = list_;
      } else {
        result.list_ = listBuilder_.build();
      }
      result.totalSize_ = totalSize_;
      result.totalPage_ = totalPage_;
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
      if (other instanceof api.cms.service.v1.ListCategoryByPidReply) {
        return mergeFrom((api.cms.service.v1.ListCategoryByPidReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(api.cms.service.v1.ListCategoryByPidReply other) {
      if (other == api.cms.service.v1.ListCategoryByPidReply.getDefaultInstance()) return this;
      if (other.getPageNo() != 0L) {
        setPageNo(other.getPageNo());
      }
      if (other.getPageSize() != 0L) {
        setPageSize(other.getPageSize());
      }
      if (listBuilder_ == null) {
        if (!other.list_.isEmpty()) {
          if (list_.isEmpty()) {
            list_ = other.list_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureListIsMutable();
            list_.addAll(other.list_);
          }
          onChanged();
        }
      } else {
        if (!other.list_.isEmpty()) {
          if (listBuilder_.isEmpty()) {
            listBuilder_.dispose();
            listBuilder_ = null;
            list_ = other.list_;
            bitField0_ = (bitField0_ & ~0x00000001);
            listBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getListFieldBuilder() : null;
          } else {
            listBuilder_.addAllMessages(other.list_);
          }
        }
      }
      if (other.getTotalSize() != 0L) {
        setTotalSize(other.getTotalSize());
      }
      if (other.getTotalPage() != 0L) {
        setTotalPage(other.getTotalPage());
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
      api.cms.service.v1.ListCategoryByPidReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (api.cms.service.v1.ListCategoryByPidReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long pageNo_ ;
    /**
     * <code>int64 page_no = 1;</code>
     * @return The pageNo.
     */
    @java.lang.Override
    public long getPageNo() {
      return pageNo_;
    }
    /**
     * <code>int64 page_no = 1;</code>
     * @param value The pageNo to set.
     * @return This builder for chaining.
     */
    public Builder setPageNo(long value) {
      
      pageNo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 page_no = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageNo() {
      
      pageNo_ = 0L;
      onChanged();
      return this;
    }

    private long pageSize_ ;
    /**
     * <code>int64 page_size = 2;</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public long getPageSize() {
      return pageSize_;
    }
    /**
     * <code>int64 page_size = 2;</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(long value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 page_size = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<api.cms.service.v1.Category> list_ =
      java.util.Collections.emptyList();
    private void ensureListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        list_ = new java.util.ArrayList<api.cms.service.v1.Category>(list_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        api.cms.service.v1.Category, api.cms.service.v1.Category.Builder, api.cms.service.v1.CategoryOrBuilder> listBuilder_;

    /**
     * <code>repeated .api.cms.service.v1.Category list = 3;</code>
     */
    public java.util.List<api.cms.service.v1.Category> getListList() {
      if (listBuilder_ == null) {
        return java.util.Collections.unmodifiableList(list_);
      } else {
        return listBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.cms.service.v1.Category list = 3;</code>
     */
    public int getListCount() {
      if (listBuilder_ == null) {
        return list_.size();
      } else {
        return listBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.cms.service.v1.Category list = 3;</code>
     */
    public api.cms.service.v1.Category getList(int index) {
      if (listBuilder_ == null) {
        return list_.get(index);
      } else {
        return listBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.cms.service.v1.Category list = 3;</code>
     */
    public Builder setList(
        int index, api.cms.service.v1.Category value) {
      if (listBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListIsMutable();
        list_.set(index, value);
        onChanged();
      } else {
        listBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.cms.service.v1.Category list = 3;</code>
     */
    public Builder setList(
        int index, api.cms.service.v1.Category.Builder builderForValue) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        list_.set(index, builderForValue.build());
        onChanged();
      } else {
        listBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.cms.service.v1.Category list = 3;</code>
     */
    public Builder addList(api.cms.service.v1.Category value) {
      if (listBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListIsMutable();
        list_.add(value);
        onChanged();
      } else {
        listBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.cms.service.v1.Category list = 3;</code>
     */
    public Builder addList(
        int index, api.cms.service.v1.Category value) {
      if (listBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListIsMutable();
        list_.add(index, value);
        onChanged();
      } else {
        listBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.cms.service.v1.Category list = 3;</code>
     */
    public Builder addList(
        api.cms.service.v1.Category.Builder builderForValue) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        list_.add(builderForValue.build());
        onChanged();
      } else {
        listBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.cms.service.v1.Category list = 3;</code>
     */
    public Builder addList(
        int index, api.cms.service.v1.Category.Builder builderForValue) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        list_.add(index, builderForValue.build());
        onChanged();
      } else {
        listBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.cms.service.v1.Category list = 3;</code>
     */
    public Builder addAllList(
        java.lang.Iterable<? extends api.cms.service.v1.Category> values) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, list_);
        onChanged();
      } else {
        listBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.cms.service.v1.Category list = 3;</code>
     */
    public Builder clearList() {
      if (listBuilder_ == null) {
        list_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        listBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.cms.service.v1.Category list = 3;</code>
     */
    public Builder removeList(int index) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        list_.remove(index);
        onChanged();
      } else {
        listBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.cms.service.v1.Category list = 3;</code>
     */
    public api.cms.service.v1.Category.Builder getListBuilder(
        int index) {
      return getListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.cms.service.v1.Category list = 3;</code>
     */
    public api.cms.service.v1.CategoryOrBuilder getListOrBuilder(
        int index) {
      if (listBuilder_ == null) {
        return list_.get(index);  } else {
        return listBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.cms.service.v1.Category list = 3;</code>
     */
    public java.util.List<? extends api.cms.service.v1.CategoryOrBuilder> 
         getListOrBuilderList() {
      if (listBuilder_ != null) {
        return listBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(list_);
      }
    }
    /**
     * <code>repeated .api.cms.service.v1.Category list = 3;</code>
     */
    public api.cms.service.v1.Category.Builder addListBuilder() {
      return getListFieldBuilder().addBuilder(
          api.cms.service.v1.Category.getDefaultInstance());
    }
    /**
     * <code>repeated .api.cms.service.v1.Category list = 3;</code>
     */
    public api.cms.service.v1.Category.Builder addListBuilder(
        int index) {
      return getListFieldBuilder().addBuilder(
          index, api.cms.service.v1.Category.getDefaultInstance());
    }
    /**
     * <code>repeated .api.cms.service.v1.Category list = 3;</code>
     */
    public java.util.List<api.cms.service.v1.Category.Builder> 
         getListBuilderList() {
      return getListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        api.cms.service.v1.Category, api.cms.service.v1.Category.Builder, api.cms.service.v1.CategoryOrBuilder> 
        getListFieldBuilder() {
      if (listBuilder_ == null) {
        listBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            api.cms.service.v1.Category, api.cms.service.v1.Category.Builder, api.cms.service.v1.CategoryOrBuilder>(
                list_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        list_ = null;
      }
      return listBuilder_;
    }

    private long totalSize_ ;
    /**
     * <code>int64 total_size = 4;</code>
     * @return The totalSize.
     */
    @java.lang.Override
    public long getTotalSize() {
      return totalSize_;
    }
    /**
     * <code>int64 total_size = 4;</code>
     * @param value The totalSize to set.
     * @return This builder for chaining.
     */
    public Builder setTotalSize(long value) {
      
      totalSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 total_size = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalSize() {
      
      totalSize_ = 0L;
      onChanged();
      return this;
    }

    private long totalPage_ ;
    /**
     * <code>uint64 total_page = 5;</code>
     * @return The totalPage.
     */
    @java.lang.Override
    public long getTotalPage() {
      return totalPage_;
    }
    /**
     * <code>uint64 total_page = 5;</code>
     * @param value The totalPage to set.
     * @return This builder for chaining.
     */
    public Builder setTotalPage(long value) {
      
      totalPage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 total_page = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalPage() {
      
      totalPage_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.FieldMask showFieldMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> showFieldMaskBuilder_;
    /**
     * <code>.google.protobuf.FieldMask show_field_mask = 6;</code>
     * @return Whether the showFieldMask field is set.
     */
    public boolean hasShowFieldMask() {
      return showFieldMaskBuilder_ != null || showFieldMask_ != null;
    }
    /**
     * <code>.google.protobuf.FieldMask show_field_mask = 6;</code>
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
     * <code>.google.protobuf.FieldMask show_field_mask = 6;</code>
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
     * <code>.google.protobuf.FieldMask show_field_mask = 6;</code>
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
     * <code>.google.protobuf.FieldMask show_field_mask = 6;</code>
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
     * <code>.google.protobuf.FieldMask show_field_mask = 6;</code>
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
     * <code>.google.protobuf.FieldMask show_field_mask = 6;</code>
     */
    public com.google.protobuf.FieldMask.Builder getShowFieldMaskBuilder() {
      
      onChanged();
      return getShowFieldMaskFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.FieldMask show_field_mask = 6;</code>
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
     * <code>.google.protobuf.FieldMask show_field_mask = 6;</code>
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


    // @@protoc_insertion_point(builder_scope:api.cms.service.v1.ListCategoryByPidReply)
  }

  // @@protoc_insertion_point(class_scope:api.cms.service.v1.ListCategoryByPidReply)
  private static final api.cms.service.v1.ListCategoryByPidReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new api.cms.service.v1.ListCategoryByPidReply();
  }

  public static api.cms.service.v1.ListCategoryByPidReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCategoryByPidReply>
      PARSER = new com.google.protobuf.AbstractParser<ListCategoryByPidReply>() {
    @java.lang.Override
    public ListCategoryByPidReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListCategoryByPidReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListCategoryByPidReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCategoryByPidReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public api.cms.service.v1.ListCategoryByPidReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
