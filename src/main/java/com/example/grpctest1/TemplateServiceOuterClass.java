// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: templateService.proto

package com.example.grpctest1;

public final class TemplateServiceOuterClass {
  private TemplateServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpctest1_TemplateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpctest1_TemplateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpctest1_TemplateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpctest1_TemplateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025templateService.proto\022\025com.example.grp" +
      "ctest1\"c\n\017TemplateRequest\022\024\n\014templateCod" +
      "e\030\001 \001(\t\022\025\n\rstudentUserid\030\002 \001(\003\022\023\n\013staffU" +
      "serid\030\003 \001(\003\022\016\n\006option\030\004 \001(\t\";\n\020TemplateR" +
      "esponse\022\017\n\007content\030\001 \001(\t\022\026\n\016notification" +
      "To\030\002 \001(\t2\346\001\n\017TemplateService\022e\n\020getEmail" +
      "Template\022&.com.example.grpctest1.Templat" +
      "eRequest\032\'.com.example.grpctest1.Templat" +
      "eResponse\"\000\022l\n\027getNotificationTemplate\022&" +
      ".com.example.grpctest1.TemplateRequest\032\'" +
      ".com.example.grpctest1.TemplateResponse\"" +
      "\000B\031\n\025com.example.grpctest1P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_example_grpctest1_TemplateRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_grpctest1_TemplateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpctest1_TemplateRequest_descriptor,
        new java.lang.String[] { "TemplateCode", "StudentUserid", "StaffUserid", "Option", });
    internal_static_com_example_grpctest1_TemplateResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_grpctest1_TemplateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpctest1_TemplateResponse_descriptor,
        new java.lang.String[] { "Content", "NotificationTo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
