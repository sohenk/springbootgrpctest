// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cms.proto

package api.cms.service.v1;

public interface GetArticleDataReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.cms.service.v1.GetArticleDataReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.cms.service.v1.ArticleData article_data = 1;</code>
   * @return Whether the articleData field is set.
   */
  boolean hasArticleData();
  /**
   * <code>.api.cms.service.v1.ArticleData article_data = 1;</code>
   * @return The articleData.
   */
  api.cms.service.v1.ArticleData getArticleData();
  /**
   * <code>.api.cms.service.v1.ArticleData article_data = 1;</code>
   */
  api.cms.service.v1.ArticleDataOrBuilder getArticleDataOrBuilder();

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