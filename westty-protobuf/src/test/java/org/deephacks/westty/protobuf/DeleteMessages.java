// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/test/resources/META-INF/delete.proto

package org.deephacks.westty.protobuf;

public final class DeleteMessages {
  private DeleteMessages() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface DeleteRequestOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional uint32 protoType = 200;
    boolean hasProtoType();
    int getProtoType();
    
    // required string msg = 1;
    boolean hasMsg();
    String getMsg();
  }
  public static final class DeleteRequest extends
      com.google.protobuf.GeneratedMessage
      implements DeleteRequestOrBuilder {
    // Use DeleteRequest.newBuilder() to construct.
    private DeleteRequest(Builder builder) {
      super(builder);
    }
    private DeleteRequest(boolean noInit) {}
    
    private static final DeleteRequest defaultInstance;
    public static DeleteRequest getDefaultInstance() {
      return defaultInstance;
    }
    
    public DeleteRequest getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.deephacks.westty.protobuf.DeleteMessages.internal_static_westty_protobuf_DeleteRequest_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.deephacks.westty.protobuf.DeleteMessages.internal_static_westty_protobuf_DeleteRequest_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional uint32 protoType = 200;
    public static final int PROTOTYPE_FIELD_NUMBER = 200;
    private int protoType_;
    public boolean hasProtoType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getProtoType() {
      return protoType_;
    }
    
    // required string msg = 1;
    public static final int MSG_FIELD_NUMBER = 1;
    private java.lang.Object msg_;
    public boolean hasMsg() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getMsg() {
      java.lang.Object ref = msg_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          msg_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      protoType_ = 0;
      msg_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasMsg()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(1, getMsgBytes());
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt32(200, protoType_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getMsgBytes());
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(200, protoType_);
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
    
    public static org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest parseDelimitedFrom(
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
    public static org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest prototype) {
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
       implements org.deephacks.westty.protobuf.DeleteMessages.DeleteRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.deephacks.westty.protobuf.DeleteMessages.internal_static_westty_protobuf_DeleteRequest_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.deephacks.westty.protobuf.DeleteMessages.internal_static_westty_protobuf_DeleteRequest_fieldAccessorTable;
      }
      
      // Construct using org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest.newBuilder()
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
        msg_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest.getDescriptor();
      }
      
      public org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest getDefaultInstanceForType() {
        return org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest.getDefaultInstance();
      }
      
      public org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest build() {
        org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest buildPartial() {
        org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest result = new org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.protoType_ = protoType_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.msg_ = msg_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest) {
          return mergeFrom((org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest other) {
        if (other == org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest.getDefaultInstance()) return this;
        if (other.hasProtoType()) {
          setProtoType(other.getProtoType());
        }
        if (other.hasMsg()) {
          setMsg(other.getMsg());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasMsg()) {
          
          return false;
        }
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
            case 10: {
              bitField0_ |= 0x00000002;
              msg_ = input.readBytes();
              break;
            }
            case 1600: {
              bitField0_ |= 0x00000001;
              protoType_ = input.readUInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional uint32 protoType = 200;
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
      
      // required string msg = 1;
      private java.lang.Object msg_ = "";
      public boolean hasMsg() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getMsg() {
        java.lang.Object ref = msg_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          msg_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setMsg(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        msg_ = value;
        onChanged();
        return this;
      }
      public Builder clearMsg() {
        bitField0_ = (bitField0_ & ~0x00000002);
        msg_ = getDefaultInstance().getMsg();
        onChanged();
        return this;
      }
      void setMsg(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        msg_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:westty.protobuf.DeleteRequest)
    }
    
    static {
      defaultInstance = new DeleteRequest(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:westty.protobuf.DeleteRequest)
  }
  
  public interface DeleteResponseOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional uint32 protoType = 201;
    boolean hasProtoType();
    int getProtoType();
    
    // required string msg = 1;
    boolean hasMsg();
    String getMsg();
  }
  public static final class DeleteResponse extends
      com.google.protobuf.GeneratedMessage
      implements DeleteResponseOrBuilder {
    // Use DeleteResponse.newBuilder() to construct.
    private DeleteResponse(Builder builder) {
      super(builder);
    }
    private DeleteResponse(boolean noInit) {}
    
    private static final DeleteResponse defaultInstance;
    public static DeleteResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public DeleteResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.deephacks.westty.protobuf.DeleteMessages.internal_static_westty_protobuf_DeleteResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.deephacks.westty.protobuf.DeleteMessages.internal_static_westty_protobuf_DeleteResponse_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional uint32 protoType = 201;
    public static final int PROTOTYPE_FIELD_NUMBER = 201;
    private int protoType_;
    public boolean hasProtoType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getProtoType() {
      return protoType_;
    }
    
    // required string msg = 1;
    public static final int MSG_FIELD_NUMBER = 1;
    private java.lang.Object msg_;
    public boolean hasMsg() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getMsg() {
      java.lang.Object ref = msg_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          msg_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      protoType_ = 0;
      msg_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasMsg()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(1, getMsgBytes());
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt32(201, protoType_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getMsgBytes());
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(201, protoType_);
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
    
    public static org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse parseDelimitedFrom(
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
    public static org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse prototype) {
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
       implements org.deephacks.westty.protobuf.DeleteMessages.DeleteResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.deephacks.westty.protobuf.DeleteMessages.internal_static_westty_protobuf_DeleteResponse_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.deephacks.westty.protobuf.DeleteMessages.internal_static_westty_protobuf_DeleteResponse_fieldAccessorTable;
      }
      
      // Construct using org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse.newBuilder()
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
        msg_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse.getDescriptor();
      }
      
      public org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse getDefaultInstanceForType() {
        return org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse.getDefaultInstance();
      }
      
      public org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse build() {
        org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse buildPartial() {
        org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse result = new org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.protoType_ = protoType_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.msg_ = msg_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse) {
          return mergeFrom((org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse other) {
        if (other == org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse.getDefaultInstance()) return this;
        if (other.hasProtoType()) {
          setProtoType(other.getProtoType());
        }
        if (other.hasMsg()) {
          setMsg(other.getMsg());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasMsg()) {
          
          return false;
        }
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
            case 10: {
              bitField0_ |= 0x00000002;
              msg_ = input.readBytes();
              break;
            }
            case 1608: {
              bitField0_ |= 0x00000001;
              protoType_ = input.readUInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional uint32 protoType = 201;
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
      
      // required string msg = 1;
      private java.lang.Object msg_ = "";
      public boolean hasMsg() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getMsg() {
        java.lang.Object ref = msg_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          msg_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setMsg(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        msg_ = value;
        onChanged();
        return this;
      }
      public Builder clearMsg() {
        bitField0_ = (bitField0_ & ~0x00000002);
        msg_ = getDefaultInstance().getMsg();
        onChanged();
        return this;
      }
      void setMsg(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        msg_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:westty.protobuf.DeleteResponse)
    }
    
    static {
      defaultInstance = new DeleteResponse(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:westty.protobuf.DeleteResponse)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_westty_protobuf_DeleteRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_westty_protobuf_DeleteRequest_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_westty_protobuf_DeleteResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_westty_protobuf_DeleteResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(src/test/resources/META-INF/delete.pro" +
      "to\022\017westty.protobuf\"0\n\rDeleteRequest\022\022\n\t" +
      "protoType\030\310\001 \001(\r\022\013\n\003msg\030\001 \002(\t\"1\n\016DeleteR" +
      "esponse\022\022\n\tprotoType\030\311\001 \001(\r\022\013\n\003msg\030\001 \002(\t" +
      "B/\n\035org.deephacks.westty.protobufB\016Delet" +
      "eMessages"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_westty_protobuf_DeleteRequest_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_westty_protobuf_DeleteRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_westty_protobuf_DeleteRequest_descriptor,
              new java.lang.String[] { "ProtoType", "Msg", },
              org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest.class,
              org.deephacks.westty.protobuf.DeleteMessages.DeleteRequest.Builder.class);
          internal_static_westty_protobuf_DeleteResponse_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_westty_protobuf_DeleteResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_westty_protobuf_DeleteResponse_descriptor,
              new java.lang.String[] { "ProtoType", "Msg", },
              org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse.class,
              org.deephacks.westty.protobuf.DeleteMessages.DeleteResponse.Builder.class);
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
