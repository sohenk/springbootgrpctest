// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cms.proto

package api.cms.service.v1;

public interface ListArticleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.cms.service.v1.ListArticleRequest)
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
   * <code>.google.protobuf.FieldMask show_field_mask = 2;</code>
   * @return Whether the showFieldMask field is set.
   */
  boolean hasShowFieldMask();
  /**
   * <code>.google.protobuf.FieldMask show_field_mask = 2;</code>
   * @return The showFieldMask.
   */
  com.google.protobuf.FieldMask getShowFieldMask();
  /**
   * <code>.google.protobuf.FieldMask show_field_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getShowFieldMaskOrBuilder();
}
