// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package messages;

public final class PersonOuterClass {
  private PersonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PersonOrBuilder extends
      // @@protoc_insertion_point(interface_extends:messages.Person)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <code>string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>int32 id = 2;</code>
     */
    int getId();

    /**
     * <code>string email = 3;</code>
     */
    java.lang.String getEmail();
    /**
     * <code>string email = 3;</code>
     */
    com.google.protobuf.ByteString
        getEmailBytes();

    /**
     * <code>repeated .messages.PhoneNumber phone = 4;</code>
     */
    java.util.List<messages.PhoneNumberOuterClass.PhoneNumber> 
        getPhoneList();
    /**
     * <code>repeated .messages.PhoneNumber phone = 4;</code>
     */
    messages.PhoneNumberOuterClass.PhoneNumber getPhone(int index);
    /**
     * <code>repeated .messages.PhoneNumber phone = 4;</code>
     */
    int getPhoneCount();
    /**
     * <code>repeated .messages.PhoneNumber phone = 4;</code>
     */
    java.util.List<? extends messages.PhoneNumberOuterClass.PhoneNumberOrBuilder> 
        getPhoneOrBuilderList();
    /**
     * <code>repeated .messages.PhoneNumber phone = 4;</code>
     */
    messages.PhoneNumberOuterClass.PhoneNumberOrBuilder getPhoneOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code messages.Person}
   */
  public  static final class Person extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:messages.Person)
      PersonOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Person.newBuilder() to construct.
    private Person(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Person() {
      name_ = "";
      email_ = "";
      phone_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Person(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 16: {

              id_ = input.readInt32();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              email_ = s;
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000008) != 0)) {
                phone_ = new java.util.ArrayList<messages.PhoneNumberOuterClass.PhoneNumber>();
                mutable_bitField0_ |= 0x00000008;
              }
              phone_.add(
                  input.readMessage(messages.PhoneNumberOuterClass.PhoneNumber.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000008) != 0)) {
          phone_ = java.util.Collections.unmodifiableList(phone_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return messages.PersonOuterClass.internal_static_messages_Person_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return messages.PersonOuterClass.internal_static_messages_Person_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              messages.PersonOuterClass.Person.class, messages.PersonOuterClass.Person.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ID_FIELD_NUMBER = 2;
    private int id_;
    /**
     * <code>int32 id = 2;</code>
     */
    public int getId() {
      return id_;
    }

    public static final int EMAIL_FIELD_NUMBER = 3;
    private volatile java.lang.Object email_;
    /**
     * <code>string email = 3;</code>
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      }
    }
    /**
     * <code>string email = 3;</code>
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PHONE_FIELD_NUMBER = 4;
    private java.util.List<messages.PhoneNumberOuterClass.PhoneNumber> phone_;
    /**
     * <code>repeated .messages.PhoneNumber phone = 4;</code>
     */
    public java.util.List<messages.PhoneNumberOuterClass.PhoneNumber> getPhoneList() {
      return phone_;
    }
    /**
     * <code>repeated .messages.PhoneNumber phone = 4;</code>
     */
    public java.util.List<? extends messages.PhoneNumberOuterClass.PhoneNumberOrBuilder> 
        getPhoneOrBuilderList() {
      return phone_;
    }
    /**
     * <code>repeated .messages.PhoneNumber phone = 4;</code>
     */
    public int getPhoneCount() {
      return phone_.size();
    }
    /**
     * <code>repeated .messages.PhoneNumber phone = 4;</code>
     */
    public messages.PhoneNumberOuterClass.PhoneNumber getPhone(int index) {
      return phone_.get(index);
    }
    /**
     * <code>repeated .messages.PhoneNumber phone = 4;</code>
     */
    public messages.PhoneNumberOuterClass.PhoneNumberOrBuilder getPhoneOrBuilder(
        int index) {
      return phone_.get(index);
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
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (id_ != 0) {
        output.writeInt32(2, id_);
      }
      if (!getEmailBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, email_);
      }
      for (int i = 0; i < phone_.size(); i++) {
        output.writeMessage(4, phone_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, id_);
      }
      if (!getEmailBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, email_);
      }
      for (int i = 0; i < phone_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, phone_.get(i));
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
      if (!(obj instanceof messages.PersonOuterClass.Person)) {
        return super.equals(obj);
      }
      messages.PersonOuterClass.Person other = (messages.PersonOuterClass.Person) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (getId()
          != other.getId()) return false;
      if (!getEmail()
          .equals(other.getEmail())) return false;
      if (!getPhoneList()
          .equals(other.getPhoneList())) return false;
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
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + EMAIL_FIELD_NUMBER;
      hash = (53 * hash) + getEmail().hashCode();
      if (getPhoneCount() > 0) {
        hash = (37 * hash) + PHONE_FIELD_NUMBER;
        hash = (53 * hash) + getPhoneList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static messages.PersonOuterClass.Person parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static messages.PersonOuterClass.Person parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static messages.PersonOuterClass.Person parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static messages.PersonOuterClass.Person parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static messages.PersonOuterClass.Person parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static messages.PersonOuterClass.Person parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static messages.PersonOuterClass.Person parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static messages.PersonOuterClass.Person parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static messages.PersonOuterClass.Person parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static messages.PersonOuterClass.Person parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static messages.PersonOuterClass.Person parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static messages.PersonOuterClass.Person parseFrom(
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
    public static Builder newBuilder(messages.PersonOuterClass.Person prototype) {
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
     * Protobuf type {@code messages.Person}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:messages.Person)
        messages.PersonOuterClass.PersonOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return messages.PersonOuterClass.internal_static_messages_Person_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return messages.PersonOuterClass.internal_static_messages_Person_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                messages.PersonOuterClass.Person.class, messages.PersonOuterClass.Person.Builder.class);
      }

      // Construct using messages.PersonOuterClass.Person.newBuilder()
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
          getPhoneFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";

        id_ = 0;

        email_ = "";

        if (phoneBuilder_ == null) {
          phone_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          phoneBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return messages.PersonOuterClass.internal_static_messages_Person_descriptor;
      }

      @java.lang.Override
      public messages.PersonOuterClass.Person getDefaultInstanceForType() {
        return messages.PersonOuterClass.Person.getDefaultInstance();
      }

      @java.lang.Override
      public messages.PersonOuterClass.Person build() {
        messages.PersonOuterClass.Person result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public messages.PersonOuterClass.Person buildPartial() {
        messages.PersonOuterClass.Person result = new messages.PersonOuterClass.Person(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.name_ = name_;
        result.id_ = id_;
        result.email_ = email_;
        if (phoneBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0)) {
            phone_ = java.util.Collections.unmodifiableList(phone_);
            bitField0_ = (bitField0_ & ~0x00000008);
          }
          result.phone_ = phone_;
        } else {
          result.phone_ = phoneBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof messages.PersonOuterClass.Person) {
          return mergeFrom((messages.PersonOuterClass.Person)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(messages.PersonOuterClass.Person other) {
        if (other == messages.PersonOuterClass.Person.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (!other.getEmail().isEmpty()) {
          email_ = other.email_;
          onChanged();
        }
        if (phoneBuilder_ == null) {
          if (!other.phone_.isEmpty()) {
            if (phone_.isEmpty()) {
              phone_ = other.phone_;
              bitField0_ = (bitField0_ & ~0x00000008);
            } else {
              ensurePhoneIsMutable();
              phone_.addAll(other.phone_);
            }
            onChanged();
          }
        } else {
          if (!other.phone_.isEmpty()) {
            if (phoneBuilder_.isEmpty()) {
              phoneBuilder_.dispose();
              phoneBuilder_ = null;
              phone_ = other.phone_;
              bitField0_ = (bitField0_ & ~0x00000008);
              phoneBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPhoneFieldBuilder() : null;
            } else {
              phoneBuilder_.addAllMessages(other.phone_);
            }
          }
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
        messages.PersonOuterClass.Person parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (messages.PersonOuterClass.Person) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>int32 id = 2;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>int32 id = 2;</code>
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 id = 2;</code>
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object email_ = "";
      /**
       * <code>string email = 3;</code>
       */
      public java.lang.String getEmail() {
        java.lang.Object ref = email_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          email_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string email = 3;</code>
       */
      public com.google.protobuf.ByteString
          getEmailBytes() {
        java.lang.Object ref = email_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          email_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string email = 3;</code>
       */
      public Builder setEmail(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        email_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string email = 3;</code>
       */
      public Builder clearEmail() {
        
        email_ = getDefaultInstance().getEmail();
        onChanged();
        return this;
      }
      /**
       * <code>string email = 3;</code>
       */
      public Builder setEmailBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        email_ = value;
        onChanged();
        return this;
      }

      private java.util.List<messages.PhoneNumberOuterClass.PhoneNumber> phone_ =
        java.util.Collections.emptyList();
      private void ensurePhoneIsMutable() {
        if (!((bitField0_ & 0x00000008) != 0)) {
          phone_ = new java.util.ArrayList<messages.PhoneNumberOuterClass.PhoneNumber>(phone_);
          bitField0_ |= 0x00000008;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          messages.PhoneNumberOuterClass.PhoneNumber, messages.PhoneNumberOuterClass.PhoneNumber.Builder, messages.PhoneNumberOuterClass.PhoneNumberOrBuilder> phoneBuilder_;

      /**
       * <code>repeated .messages.PhoneNumber phone = 4;</code>
       */
      public java.util.List<messages.PhoneNumberOuterClass.PhoneNumber> getPhoneList() {
        if (phoneBuilder_ == null) {
          return java.util.Collections.unmodifiableList(phone_);
        } else {
          return phoneBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .messages.PhoneNumber phone = 4;</code>
       */
      public int getPhoneCount() {
        if (phoneBuilder_ == null) {
          return phone_.size();
        } else {
          return phoneBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .messages.PhoneNumber phone = 4;</code>
       */
      public messages.PhoneNumberOuterClass.PhoneNumber getPhone(int index) {
        if (phoneBuilder_ == null) {
          return phone_.get(index);
        } else {
          return phoneBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .messages.PhoneNumber phone = 4;</code>
       */
      public Builder setPhone(
          int index, messages.PhoneNumberOuterClass.PhoneNumber value) {
        if (phoneBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePhoneIsMutable();
          phone_.set(index, value);
          onChanged();
        } else {
          phoneBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .messages.PhoneNumber phone = 4;</code>
       */
      public Builder setPhone(
          int index, messages.PhoneNumberOuterClass.PhoneNumber.Builder builderForValue) {
        if (phoneBuilder_ == null) {
          ensurePhoneIsMutable();
          phone_.set(index, builderForValue.build());
          onChanged();
        } else {
          phoneBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .messages.PhoneNumber phone = 4;</code>
       */
      public Builder addPhone(messages.PhoneNumberOuterClass.PhoneNumber value) {
        if (phoneBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePhoneIsMutable();
          phone_.add(value);
          onChanged();
        } else {
          phoneBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .messages.PhoneNumber phone = 4;</code>
       */
      public Builder addPhone(
          int index, messages.PhoneNumberOuterClass.PhoneNumber value) {
        if (phoneBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePhoneIsMutable();
          phone_.add(index, value);
          onChanged();
        } else {
          phoneBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .messages.PhoneNumber phone = 4;</code>
       */
      public Builder addPhone(
          messages.PhoneNumberOuterClass.PhoneNumber.Builder builderForValue) {
        if (phoneBuilder_ == null) {
          ensurePhoneIsMutable();
          phone_.add(builderForValue.build());
          onChanged();
        } else {
          phoneBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .messages.PhoneNumber phone = 4;</code>
       */
      public Builder addPhone(
          int index, messages.PhoneNumberOuterClass.PhoneNumber.Builder builderForValue) {
        if (phoneBuilder_ == null) {
          ensurePhoneIsMutable();
          phone_.add(index, builderForValue.build());
          onChanged();
        } else {
          phoneBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .messages.PhoneNumber phone = 4;</code>
       */
      public Builder addAllPhone(
          java.lang.Iterable<? extends messages.PhoneNumberOuterClass.PhoneNumber> values) {
        if (phoneBuilder_ == null) {
          ensurePhoneIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, phone_);
          onChanged();
        } else {
          phoneBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .messages.PhoneNumber phone = 4;</code>
       */
      public Builder clearPhone() {
        if (phoneBuilder_ == null) {
          phone_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
        } else {
          phoneBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .messages.PhoneNumber phone = 4;</code>
       */
      public Builder removePhone(int index) {
        if (phoneBuilder_ == null) {
          ensurePhoneIsMutable();
          phone_.remove(index);
          onChanged();
        } else {
          phoneBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .messages.PhoneNumber phone = 4;</code>
       */
      public messages.PhoneNumberOuterClass.PhoneNumber.Builder getPhoneBuilder(
          int index) {
        return getPhoneFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .messages.PhoneNumber phone = 4;</code>
       */
      public messages.PhoneNumberOuterClass.PhoneNumberOrBuilder getPhoneOrBuilder(
          int index) {
        if (phoneBuilder_ == null) {
          return phone_.get(index);  } else {
          return phoneBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .messages.PhoneNumber phone = 4;</code>
       */
      public java.util.List<? extends messages.PhoneNumberOuterClass.PhoneNumberOrBuilder> 
           getPhoneOrBuilderList() {
        if (phoneBuilder_ != null) {
          return phoneBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(phone_);
        }
      }
      /**
       * <code>repeated .messages.PhoneNumber phone = 4;</code>
       */
      public messages.PhoneNumberOuterClass.PhoneNumber.Builder addPhoneBuilder() {
        return getPhoneFieldBuilder().addBuilder(
            messages.PhoneNumberOuterClass.PhoneNumber.getDefaultInstance());
      }
      /**
       * <code>repeated .messages.PhoneNumber phone = 4;</code>
       */
      public messages.PhoneNumberOuterClass.PhoneNumber.Builder addPhoneBuilder(
          int index) {
        return getPhoneFieldBuilder().addBuilder(
            index, messages.PhoneNumberOuterClass.PhoneNumber.getDefaultInstance());
      }
      /**
       * <code>repeated .messages.PhoneNumber phone = 4;</code>
       */
      public java.util.List<messages.PhoneNumberOuterClass.PhoneNumber.Builder> 
           getPhoneBuilderList() {
        return getPhoneFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          messages.PhoneNumberOuterClass.PhoneNumber, messages.PhoneNumberOuterClass.PhoneNumber.Builder, messages.PhoneNumberOuterClass.PhoneNumberOrBuilder> 
          getPhoneFieldBuilder() {
        if (phoneBuilder_ == null) {
          phoneBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              messages.PhoneNumberOuterClass.PhoneNumber, messages.PhoneNumberOuterClass.PhoneNumber.Builder, messages.PhoneNumberOuterClass.PhoneNumberOrBuilder>(
                  phone_,
                  ((bitField0_ & 0x00000008) != 0),
                  getParentForChildren(),
                  isClean());
          phone_ = null;
        }
        return phoneBuilder_;
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


      // @@protoc_insertion_point(builder_scope:messages.Person)
    }

    // @@protoc_insertion_point(class_scope:messages.Person)
    private static final messages.PersonOuterClass.Person DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new messages.PersonOuterClass.Person();
    }

    public static messages.PersonOuterClass.Person getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Person>
        PARSER = new com.google.protobuf.AbstractParser<Person>() {
      @java.lang.Override
      public Person parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Person(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Person> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Person> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public messages.PersonOuterClass.Person getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messages_Person_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messages_Person_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014person.proto\022\010messages\032\021phoneNumber.pr" +
      "oto\"W\n\006Person\022\014\n\004name\030\001 \001(\t\022\n\n\002id\030\002 \001(\005\022" +
      "\r\n\005email\030\003 \001(\t\022$\n\005phone\030\004 \003(\0132\025.messages" +
      ".PhoneNumberb\006proto3"
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
          messages.PhoneNumberOuterClass.getDescriptor(),
        }, assigner);
    internal_static_messages_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_messages_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messages_Person_descriptor,
        new java.lang.String[] { "Name", "Id", "Email", "Phone", });
    messages.PhoneNumberOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
