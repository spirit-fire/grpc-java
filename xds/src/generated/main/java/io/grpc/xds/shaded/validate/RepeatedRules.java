// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: validate/validate.proto

package io.grpc.xds.shaded.validate;

/**
 * <pre>
 * RepeatedRules describe the constraints applied to `repeated` values
 * </pre>
 *
 * Protobuf type {@code validate.RepeatedRules}
 */
public  final class RepeatedRules extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:validate.RepeatedRules)
    RepeatedRulesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RepeatedRules.newBuilder() to construct.
  private RepeatedRules(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RepeatedRules() {
    minItems_ = 0L;
    maxItems_ = 0L;
    unique_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RepeatedRules(
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
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            bitField0_ |= 0x00000001;
            minItems_ = input.readUInt64();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            maxItems_ = input.readUInt64();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            unique_ = input.readBool();
            break;
          }
          case 34: {
            io.grpc.xds.shaded.validate.FieldRules.Builder subBuilder = null;
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
              subBuilder = items_.toBuilder();
            }
            items_ = input.readMessage(io.grpc.xds.shaded.validate.FieldRules.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(items_);
              items_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000008;
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
    return io.grpc.xds.shaded.validate.Validate.internal_static_validate_RepeatedRules_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.xds.shaded.validate.Validate.internal_static_validate_RepeatedRules_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.xds.shaded.validate.RepeatedRules.class, io.grpc.xds.shaded.validate.RepeatedRules.Builder.class);
  }

  private int bitField0_;
  public static final int MIN_ITEMS_FIELD_NUMBER = 1;
  private long minItems_;
  /**
   * <pre>
   * MinItems specifies that this field must have the specified number of
   * items at a minimum
   * </pre>
   *
   * <code>optional uint64 min_items = 1;</code>
   */
  public boolean hasMinItems() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * MinItems specifies that this field must have the specified number of
   * items at a minimum
   * </pre>
   *
   * <code>optional uint64 min_items = 1;</code>
   */
  public long getMinItems() {
    return minItems_;
  }

  public static final int MAX_ITEMS_FIELD_NUMBER = 2;
  private long maxItems_;
  /**
   * <pre>
   * MaxItems specifies that this field must have the specified number of
   * items at a maximum
   * </pre>
   *
   * <code>optional uint64 max_items = 2;</code>
   */
  public boolean hasMaxItems() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   * MaxItems specifies that this field must have the specified number of
   * items at a maximum
   * </pre>
   *
   * <code>optional uint64 max_items = 2;</code>
   */
  public long getMaxItems() {
    return maxItems_;
  }

  public static final int UNIQUE_FIELD_NUMBER = 3;
  private boolean unique_;
  /**
   * <pre>
   * Unique specifies that all elements in this field must be unique. This
   * contraint is only applicable to scalar and enum types (messages are not
   * supported).
   * </pre>
   *
   * <code>optional bool unique = 3;</code>
   */
  public boolean hasUnique() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <pre>
   * Unique specifies that all elements in this field must be unique. This
   * contraint is only applicable to scalar and enum types (messages are not
   * supported).
   * </pre>
   *
   * <code>optional bool unique = 3;</code>
   */
  public boolean getUnique() {
    return unique_;
  }

  public static final int ITEMS_FIELD_NUMBER = 4;
  private io.grpc.xds.shaded.validate.FieldRules items_;
  /**
   * <pre>
   * Items specifies the contraints to be applied to each item in the field.
   * Repeated message fields will still execute validation against each item
   * unless skip is specified here.
   * </pre>
   *
   * <code>optional .validate.FieldRules items = 4;</code>
   */
  public boolean hasItems() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <pre>
   * Items specifies the contraints to be applied to each item in the field.
   * Repeated message fields will still execute validation against each item
   * unless skip is specified here.
   * </pre>
   *
   * <code>optional .validate.FieldRules items = 4;</code>
   */
  public io.grpc.xds.shaded.validate.FieldRules getItems() {
    return items_ == null ? io.grpc.xds.shaded.validate.FieldRules.getDefaultInstance() : items_;
  }
  /**
   * <pre>
   * Items specifies the contraints to be applied to each item in the field.
   * Repeated message fields will still execute validation against each item
   * unless skip is specified here.
   * </pre>
   *
   * <code>optional .validate.FieldRules items = 4;</code>
   */
  public io.grpc.xds.shaded.validate.FieldRulesOrBuilder getItemsOrBuilder() {
    return items_ == null ? io.grpc.xds.shaded.validate.FieldRules.getDefaultInstance() : items_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeUInt64(1, minItems_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeUInt64(2, maxItems_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBool(3, unique_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeMessage(4, getItems());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, minItems_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, maxItems_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, unique_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getItems());
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
    if (!(obj instanceof io.grpc.xds.shaded.validate.RepeatedRules)) {
      return super.equals(obj);
    }
    io.grpc.xds.shaded.validate.RepeatedRules other = (io.grpc.xds.shaded.validate.RepeatedRules) obj;

    boolean result = true;
    result = result && (hasMinItems() == other.hasMinItems());
    if (hasMinItems()) {
      result = result && (getMinItems()
          == other.getMinItems());
    }
    result = result && (hasMaxItems() == other.hasMaxItems());
    if (hasMaxItems()) {
      result = result && (getMaxItems()
          == other.getMaxItems());
    }
    result = result && (hasUnique() == other.hasUnique());
    if (hasUnique()) {
      result = result && (getUnique()
          == other.getUnique());
    }
    result = result && (hasItems() == other.hasItems());
    if (hasItems()) {
      result = result && getItems()
          .equals(other.getItems());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasMinItems()) {
      hash = (37 * hash) + MIN_ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMinItems());
    }
    if (hasMaxItems()) {
      hash = (37 * hash) + MAX_ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMaxItems());
    }
    if (hasUnique()) {
      hash = (37 * hash) + UNIQUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnique());
    }
    if (hasItems()) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItems().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.xds.shaded.validate.RepeatedRules parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.validate.RepeatedRules parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.validate.RepeatedRules parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.validate.RepeatedRules parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.validate.RepeatedRules parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.validate.RepeatedRules parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.validate.RepeatedRules parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.validate.RepeatedRules parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.xds.shaded.validate.RepeatedRules parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.validate.RepeatedRules parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.xds.shaded.validate.RepeatedRules parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.validate.RepeatedRules parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.xds.shaded.validate.RepeatedRules prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * RepeatedRules describe the constraints applied to `repeated` values
   * </pre>
   *
   * Protobuf type {@code validate.RepeatedRules}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:validate.RepeatedRules)
      io.grpc.xds.shaded.validate.RepeatedRulesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.xds.shaded.validate.Validate.internal_static_validate_RepeatedRules_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.xds.shaded.validate.Validate.internal_static_validate_RepeatedRules_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.xds.shaded.validate.RepeatedRules.class, io.grpc.xds.shaded.validate.RepeatedRules.Builder.class);
    }

    // Construct using io.grpc.xds.shaded.validate.RepeatedRules.newBuilder()
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
        getItemsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      minItems_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      maxItems_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      unique_ = false;
      bitField0_ = (bitField0_ & ~0x00000004);
      if (itemsBuilder_ == null) {
        items_ = null;
      } else {
        itemsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.xds.shaded.validate.Validate.internal_static_validate_RepeatedRules_descriptor;
    }

    public io.grpc.xds.shaded.validate.RepeatedRules getDefaultInstanceForType() {
      return io.grpc.xds.shaded.validate.RepeatedRules.getDefaultInstance();
    }

    public io.grpc.xds.shaded.validate.RepeatedRules build() {
      io.grpc.xds.shaded.validate.RepeatedRules result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.xds.shaded.validate.RepeatedRules buildPartial() {
      io.grpc.xds.shaded.validate.RepeatedRules result = new io.grpc.xds.shaded.validate.RepeatedRules(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.minItems_ = minItems_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.maxItems_ = maxItems_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.unique_ = unique_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      if (itemsBuilder_ == null) {
        result.items_ = items_;
      } else {
        result.items_ = itemsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.xds.shaded.validate.RepeatedRules) {
        return mergeFrom((io.grpc.xds.shaded.validate.RepeatedRules)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.xds.shaded.validate.RepeatedRules other) {
      if (other == io.grpc.xds.shaded.validate.RepeatedRules.getDefaultInstance()) return this;
      if (other.hasMinItems()) {
        setMinItems(other.getMinItems());
      }
      if (other.hasMaxItems()) {
        setMaxItems(other.getMaxItems());
      }
      if (other.hasUnique()) {
        setUnique(other.getUnique());
      }
      if (other.hasItems()) {
        mergeItems(other.getItems());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.xds.shaded.validate.RepeatedRules parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.xds.shaded.validate.RepeatedRules) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long minItems_ ;
    /**
     * <pre>
     * MinItems specifies that this field must have the specified number of
     * items at a minimum
     * </pre>
     *
     * <code>optional uint64 min_items = 1;</code>
     */
    public boolean hasMinItems() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     * MinItems specifies that this field must have the specified number of
     * items at a minimum
     * </pre>
     *
     * <code>optional uint64 min_items = 1;</code>
     */
    public long getMinItems() {
      return minItems_;
    }
    /**
     * <pre>
     * MinItems specifies that this field must have the specified number of
     * items at a minimum
     * </pre>
     *
     * <code>optional uint64 min_items = 1;</code>
     */
    public Builder setMinItems(long value) {
      bitField0_ |= 0x00000001;
      minItems_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MinItems specifies that this field must have the specified number of
     * items at a minimum
     * </pre>
     *
     * <code>optional uint64 min_items = 1;</code>
     */
    public Builder clearMinItems() {
      bitField0_ = (bitField0_ & ~0x00000001);
      minItems_ = 0L;
      onChanged();
      return this;
    }

    private long maxItems_ ;
    /**
     * <pre>
     * MaxItems specifies that this field must have the specified number of
     * items at a maximum
     * </pre>
     *
     * <code>optional uint64 max_items = 2;</code>
     */
    public boolean hasMaxItems() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     * MaxItems specifies that this field must have the specified number of
     * items at a maximum
     * </pre>
     *
     * <code>optional uint64 max_items = 2;</code>
     */
    public long getMaxItems() {
      return maxItems_;
    }
    /**
     * <pre>
     * MaxItems specifies that this field must have the specified number of
     * items at a maximum
     * </pre>
     *
     * <code>optional uint64 max_items = 2;</code>
     */
    public Builder setMaxItems(long value) {
      bitField0_ |= 0x00000002;
      maxItems_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MaxItems specifies that this field must have the specified number of
     * items at a maximum
     * </pre>
     *
     * <code>optional uint64 max_items = 2;</code>
     */
    public Builder clearMaxItems() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxItems_ = 0L;
      onChanged();
      return this;
    }

    private boolean unique_ ;
    /**
     * <pre>
     * Unique specifies that all elements in this field must be unique. This
     * contraint is only applicable to scalar and enum types (messages are not
     * supported).
     * </pre>
     *
     * <code>optional bool unique = 3;</code>
     */
    public boolean hasUnique() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <pre>
     * Unique specifies that all elements in this field must be unique. This
     * contraint is only applicable to scalar and enum types (messages are not
     * supported).
     * </pre>
     *
     * <code>optional bool unique = 3;</code>
     */
    public boolean getUnique() {
      return unique_;
    }
    /**
     * <pre>
     * Unique specifies that all elements in this field must be unique. This
     * contraint is only applicable to scalar and enum types (messages are not
     * supported).
     * </pre>
     *
     * <code>optional bool unique = 3;</code>
     */
    public Builder setUnique(boolean value) {
      bitField0_ |= 0x00000004;
      unique_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique specifies that all elements in this field must be unique. This
     * contraint is only applicable to scalar and enum types (messages are not
     * supported).
     * </pre>
     *
     * <code>optional bool unique = 3;</code>
     */
    public Builder clearUnique() {
      bitField0_ = (bitField0_ & ~0x00000004);
      unique_ = false;
      onChanged();
      return this;
    }

    private io.grpc.xds.shaded.validate.FieldRules items_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.xds.shaded.validate.FieldRules, io.grpc.xds.shaded.validate.FieldRules.Builder, io.grpc.xds.shaded.validate.FieldRulesOrBuilder> itemsBuilder_;
    /**
     * <pre>
     * Items specifies the contraints to be applied to each item in the field.
     * Repeated message fields will still execute validation against each item
     * unless skip is specified here.
     * </pre>
     *
     * <code>optional .validate.FieldRules items = 4;</code>
     */
    public boolean hasItems() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <pre>
     * Items specifies the contraints to be applied to each item in the field.
     * Repeated message fields will still execute validation against each item
     * unless skip is specified here.
     * </pre>
     *
     * <code>optional .validate.FieldRules items = 4;</code>
     */
    public io.grpc.xds.shaded.validate.FieldRules getItems() {
      if (itemsBuilder_ == null) {
        return items_ == null ? io.grpc.xds.shaded.validate.FieldRules.getDefaultInstance() : items_;
      } else {
        return itemsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Items specifies the contraints to be applied to each item in the field.
     * Repeated message fields will still execute validation against each item
     * unless skip is specified here.
     * </pre>
     *
     * <code>optional .validate.FieldRules items = 4;</code>
     */
    public Builder setItems(io.grpc.xds.shaded.validate.FieldRules value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        items_ = value;
        onChanged();
      } else {
        itemsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <pre>
     * Items specifies the contraints to be applied to each item in the field.
     * Repeated message fields will still execute validation against each item
     * unless skip is specified here.
     * </pre>
     *
     * <code>optional .validate.FieldRules items = 4;</code>
     */
    public Builder setItems(
        io.grpc.xds.shaded.validate.FieldRules.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        items_ = builderForValue.build();
        onChanged();
      } else {
        itemsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <pre>
     * Items specifies the contraints to be applied to each item in the field.
     * Repeated message fields will still execute validation against each item
     * unless skip is specified here.
     * </pre>
     *
     * <code>optional .validate.FieldRules items = 4;</code>
     */
    public Builder mergeItems(io.grpc.xds.shaded.validate.FieldRules value) {
      if (itemsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008) &&
            items_ != null &&
            items_ != io.grpc.xds.shaded.validate.FieldRules.getDefaultInstance()) {
          items_ =
            io.grpc.xds.shaded.validate.FieldRules.newBuilder(items_).mergeFrom(value).buildPartial();
        } else {
          items_ = value;
        }
        onChanged();
      } else {
        itemsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <pre>
     * Items specifies the contraints to be applied to each item in the field.
     * Repeated message fields will still execute validation against each item
     * unless skip is specified here.
     * </pre>
     *
     * <code>optional .validate.FieldRules items = 4;</code>
     */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = null;
        onChanged();
      } else {
        itemsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }
    /**
     * <pre>
     * Items specifies the contraints to be applied to each item in the field.
     * Repeated message fields will still execute validation against each item
     * unless skip is specified here.
     * </pre>
     *
     * <code>optional .validate.FieldRules items = 4;</code>
     */
    public io.grpc.xds.shaded.validate.FieldRules.Builder getItemsBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getItemsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Items specifies the contraints to be applied to each item in the field.
     * Repeated message fields will still execute validation against each item
     * unless skip is specified here.
     * </pre>
     *
     * <code>optional .validate.FieldRules items = 4;</code>
     */
    public io.grpc.xds.shaded.validate.FieldRulesOrBuilder getItemsOrBuilder() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilder();
      } else {
        return items_ == null ?
            io.grpc.xds.shaded.validate.FieldRules.getDefaultInstance() : items_;
      }
    }
    /**
     * <pre>
     * Items specifies the contraints to be applied to each item in the field.
     * Repeated message fields will still execute validation against each item
     * unless skip is specified here.
     * </pre>
     *
     * <code>optional .validate.FieldRules items = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.xds.shaded.validate.FieldRules, io.grpc.xds.shaded.validate.FieldRules.Builder, io.grpc.xds.shaded.validate.FieldRulesOrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grpc.xds.shaded.validate.FieldRules, io.grpc.xds.shaded.validate.FieldRules.Builder, io.grpc.xds.shaded.validate.FieldRulesOrBuilder>(
                getItems(),
                getParentForChildren(),
                isClean());
        items_ = null;
      }
      return itemsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:validate.RepeatedRules)
  }

  // @@protoc_insertion_point(class_scope:validate.RepeatedRules)
  private static final io.grpc.xds.shaded.validate.RepeatedRules DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.xds.shaded.validate.RepeatedRules();
  }

  public static io.grpc.xds.shaded.validate.RepeatedRules getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<RepeatedRules>
      PARSER = new com.google.protobuf.AbstractParser<RepeatedRules>() {
    public RepeatedRules parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RepeatedRules(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RepeatedRules> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RepeatedRules> getParserForType() {
    return PARSER;
  }

  public io.grpc.xds.shaded.validate.RepeatedRules getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

