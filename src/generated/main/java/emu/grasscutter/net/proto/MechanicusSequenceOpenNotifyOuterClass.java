// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MechanicusSequenceOpenNotify.proto

package emu.grasscutter.net.proto;

public final class MechanicusSequenceOpenNotifyOuterClass {
  private MechanicusSequenceOpenNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MechanicusSequenceOpenNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MechanicusSequenceOpenNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 mechanicus_id = 1;</code>
     * @return The mechanicusId.
     */
    int getMechanicusId();

    /**
     * <code>uint32 sequence_id = 11;</code>
     * @return The sequenceId.
     */
    int getSequenceId();
  }
  /**
   * <pre>
   * CmdId: 3902
   * Obf: JKINALBHPOK
   * </pre>
   *
   * Protobuf type {@code MechanicusSequenceOpenNotify}
   */
  public static final class MechanicusSequenceOpenNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MechanicusSequenceOpenNotify)
      MechanicusSequenceOpenNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MechanicusSequenceOpenNotify.newBuilder() to construct.
    private MechanicusSequenceOpenNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MechanicusSequenceOpenNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MechanicusSequenceOpenNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MechanicusSequenceOpenNotify(
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
            case 8: {

              mechanicusId_ = input.readUInt32();
              break;
            }
            case 88: {

              sequenceId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.internal_static_MechanicusSequenceOpenNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.internal_static_MechanicusSequenceOpenNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify.class, emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify.Builder.class);
    }

    public static final int MECHANICUS_ID_FIELD_NUMBER = 1;
    private int mechanicusId_;
    /**
     * <code>uint32 mechanicus_id = 1;</code>
     * @return The mechanicusId.
     */
    @java.lang.Override
    public int getMechanicusId() {
      return mechanicusId_;
    }

    public static final int SEQUENCE_ID_FIELD_NUMBER = 11;
    private int sequenceId_;
    /**
     * <code>uint32 sequence_id = 11;</code>
     * @return The sequenceId.
     */
    @java.lang.Override
    public int getSequenceId() {
      return sequenceId_;
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
      if (mechanicusId_ != 0) {
        output.writeUInt32(1, mechanicusId_);
      }
      if (sequenceId_ != 0) {
        output.writeUInt32(11, sequenceId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mechanicusId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, mechanicusId_);
      }
      if (sequenceId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, sequenceId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify other = (emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify) obj;

      if (getMechanicusId()
          != other.getMechanicusId()) return false;
      if (getSequenceId()
          != other.getSequenceId()) return false;
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
      hash = (37 * hash) + MECHANICUS_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMechanicusId();
      hash = (37 * hash) + SEQUENCE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSequenceId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify prototype) {
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
     * <pre>
     * CmdId: 3902
     * Obf: JKINALBHPOK
     * </pre>
     *
     * Protobuf type {@code MechanicusSequenceOpenNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MechanicusSequenceOpenNotify)
        emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.internal_static_MechanicusSequenceOpenNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.internal_static_MechanicusSequenceOpenNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify.class, emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify.newBuilder()
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
        mechanicusId_ = 0;

        sequenceId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.internal_static_MechanicusSequenceOpenNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify build() {
        emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify buildPartial() {
        emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify result = new emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify(this);
        result.mechanicusId_ = mechanicusId_;
        result.sequenceId_ = sequenceId_;
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
        if (other instanceof emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify) {
          return mergeFrom((emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify other) {
        if (other == emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify.getDefaultInstance()) return this;
        if (other.getMechanicusId() != 0) {
          setMechanicusId(other.getMechanicusId());
        }
        if (other.getSequenceId() != 0) {
          setSequenceId(other.getSequenceId());
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
        emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int mechanicusId_ ;
      /**
       * <code>uint32 mechanicus_id = 1;</code>
       * @return The mechanicusId.
       */
      @java.lang.Override
      public int getMechanicusId() {
        return mechanicusId_;
      }
      /**
       * <code>uint32 mechanicus_id = 1;</code>
       * @param value The mechanicusId to set.
       * @return This builder for chaining.
       */
      public Builder setMechanicusId(int value) {
        
        mechanicusId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mechanicus_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMechanicusId() {
        
        mechanicusId_ = 0;
        onChanged();
        return this;
      }

      private int sequenceId_ ;
      /**
       * <code>uint32 sequence_id = 11;</code>
       * @return The sequenceId.
       */
      @java.lang.Override
      public int getSequenceId() {
        return sequenceId_;
      }
      /**
       * <code>uint32 sequence_id = 11;</code>
       * @param value The sequenceId to set.
       * @return This builder for chaining.
       */
      public Builder setSequenceId(int value) {
        
        sequenceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 sequence_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearSequenceId() {
        
        sequenceId_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:MechanicusSequenceOpenNotify)
    }

    // @@protoc_insertion_point(class_scope:MechanicusSequenceOpenNotify)
    private static final emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify();
    }

    public static emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MechanicusSequenceOpenNotify>
        PARSER = new com.google.protobuf.AbstractParser<MechanicusSequenceOpenNotify>() {
      @java.lang.Override
      public MechanicusSequenceOpenNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MechanicusSequenceOpenNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MechanicusSequenceOpenNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MechanicusSequenceOpenNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MechanicusSequenceOpenNotifyOuterClass.MechanicusSequenceOpenNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MechanicusSequenceOpenNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MechanicusSequenceOpenNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"MechanicusSequenceOpenNotify.proto\"J\n\034" +
      "MechanicusSequenceOpenNotify\022\025\n\rmechanic" +
      "us_id\030\001 \001(\r\022\023\n\013sequence_id\030\013 \001(\rB\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MechanicusSequenceOpenNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MechanicusSequenceOpenNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MechanicusSequenceOpenNotify_descriptor,
        new java.lang.String[] { "MechanicusId", "SequenceId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
