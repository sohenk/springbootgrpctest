// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cms.proto

package api.cms.service.v1;

public interface GetArticleDataRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.cms.service.v1.GetArticleDataRequest)
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
   * <code>int64 id = 2;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>.google.protobuf.FieldMask show_field_mask = 3;</code>
   * @return Whether the showFieldMask field is set.
   */
  boolean hasShowFieldMask();
  /**
   * <code>.google.protobuf.FieldMask show_field_mask = 3;</code>
   * @return The showFieldMask.
   */
  com.google.protobuf.FieldMask getShowFieldMask();
  /**
   * <code>.google.protobuf.FieldMask show_field_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getShowFieldMaskOrBuilder();
}
