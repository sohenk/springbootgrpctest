// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cms.proto

package api.cms.service.v1;

public interface UpdateCategoryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.cms.service.v1.UpdateCategoryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string tenant_id = 1;</code>
   * @return The tenantId.
   */
  java.lang.String getTenantId();
  /**
   * <code>string tenant_id = 1;</code>
   * @return The bytes for tenantId.
   */
  com.google.protobuf.ByteString
      getTenantIdBytes();

  /**
   * <code>.api.cms.service.v1.Category category = 2;</code>
   * @return Whether the category field is set.
   */
  boolean hasCategory();
  /**
   * <code>.api.cms.service.v1.Category category = 2;</code>
   * @return The category.
   */
  api.cms.service.v1.Category getCategory();
  /**
   * <code>.api.cms.service.v1.Category category = 2;</code>
   */
  api.cms.service.v1.CategoryOrBuilder getCategoryOrBuilder();

  /**
   * <code>.google.protobuf.FieldMask field_mask = 3;</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <code>.google.protobuf.FieldMask field_mask = 3;</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <code>.google.protobuf.FieldMask field_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();
}
