// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/META-INF/void.proto

package org.deephacks.westty.protobuf;

public final class VoidMessage {
  private VoidMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface VoidOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional uint32 protoType = 1001;
    boolean hasProtoType();
    int getProtoType();
  }
  public static final class Void extends
      com.google.protobuf.GeneratedMessage
      implements VoidOrBuilder {
    // Use Void.newBuilder() to construct.
    private Void(Builder builder) {
      super(builder);
    }
    private Void(boolean noInit) {}
    
    private static final Void defaultInstance;
    public static Void getDefaultInstance() {
      return defaultInstance;
    }
    
    public Void getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.deephacks.westty.protobuf.VoidMessage.internal_static_example_Void_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.deephacks.westty.protobuf.VoidMessage.internal_static_example_Void_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional uint32 protoType = 1001;
    public static final int PROTOTYPE_FIELD_NUMBER = 1001;
    private int protoType_;
    public boolean hasProtoType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getProtoType() {
      return protoType_;
    }
    
    private void initFields() {
      protoType_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt32(1001, protoType_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1001, protoType_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static org.deephacks.westty.protobuf.VoidMessage.Void parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.deephacks.westty.protobuf.VoidMessage.Void parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.deephacks.westty.protobuf.VoidMessage.Void parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.deephacks.westty.protobuf.VoidMessage.Void parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.deephacks.westty.protobuf.VoidMessage.Void parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.deephacks.westty.protobuf.VoidMessage.Void parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.deephacks.westty.protobuf.VoidMessage.Void parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.deephacks.westty.protobuf.VoidMessage.Void parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.deephacks.westty.protobuf.VoidMessage.Void parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.deephacks.westty.protobuf.VoidMessage.Void parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.deephacks.westty.protobuf.VoidMessage.Void prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.deephacks.westty.protobuf.VoidMessage.VoidOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.deephacks.westty.protobuf.VoidMessage.internal_static_example_Void_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.deephacks.westty.protobuf.VoidMessage.internal_static_example_Void_fieldAccessorTable;
      }
      
      // Construct using org.deephacks.westty.protobuf.VoidMessage.Void.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        protoType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.deephacks.westty.protobuf.VoidMessage.Void.getDescriptor();
      }
      
      public org.deephacks.westty.protobuf.VoidMessage.Void getDefaultInstanceForType() {
        return org.deephacks.westty.protobuf.VoidMessage.Void.getDefaultInstance();
      }
      
      public org.deephacks.westty.protobuf.VoidMessage.Void build() {
        org.deephacks.westty.protobuf.VoidMessage.Void result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private org.deephacks.westty.protobuf.VoidMessage.Void buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        org.deephacks.westty.protobuf.VoidMessage.Void result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public org.deephacks.westty.protobuf.VoidMessage.Void buildPartial() {
        org.deephacks.westty.protobuf.VoidMessage.Void result = new org.deephacks.westty.protobuf.VoidMessage.Void(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.protoType_ = protoType_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.deephacks.westty.protobuf.VoidMessage.Void) {
          return mergeFrom((org.deephacks.westty.protobuf.VoidMessage.Void)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.deephacks.westty.protobuf.VoidMessage.Void other) {
        if (other == org.deephacks.westty.protobuf.VoidMessage.Void.getDefaultInstance()) return this;
        if (other.hasProtoType()) {
          setProtoType(other.getProtoType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8008: {
              bitField0_ |= 0x00000001;
              protoType_ = input.readUInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional uint32 protoType = 1001;
      private int protoType_ ;
      public boolean hasProtoType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getProtoType() {
        return protoType_;
      }
      public Builder setProtoType(int value) {
        bitField0_ |= 0x00000001;
        protoType_ = value;
        onChanged();
        return this;
      }
      public Builder clearProtoType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        protoType_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:example.Void)
    }
    
    static {
      defaultInstance = new Void(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:example.Void)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_example_Void_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_example_Void_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&src/main/resources/META-INF/void.proto" +
      "\022\007example\"\032\n\004Void\022\022\n\tprotoType\030\351\007 \001(\rB,\n" +
      "\035org.deephacks.westty.protobufB\013VoidMess" +
      "age"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_example_Void_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_example_Void_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_example_Void_descriptor,
              new java.lang.String[] { "ProtoType", },
              org.deephacks.westty.protobuf.VoidMessage.Void.class,
              org.deephacks.westty.protobuf.VoidMessage.Void.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
