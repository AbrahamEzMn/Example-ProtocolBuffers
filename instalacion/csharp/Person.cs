// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: person.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
/// <summary>Holder for reflection information generated from person.proto</summary>
public static partial class PersonReflection {

  #region Descriptor
  /// <summary>File descriptor for person.proto</summary>
  public static pbr::FileDescriptor Descriptor {
    get { return descriptor; }
  }
  private static pbr::FileDescriptor descriptor;

  static PersonReflection() {
    byte[] descriptorData = global::System.Convert.FromBase64String(
        string.Concat(
          "CgxwZXJzb24ucHJvdG8iwgEKBlBlcnNvbhIMCgRuYW1lGAEgASgJEgoKAmlk",
          "GAIgASgFEg0KBWVtYWlsGAMgASgJEiIKBXBob25lGAQgAygLMhMuUGVyc29u",
          "LlBob25lTnVtYmVyGj4KC1Bob25lTnVtYmVyEg4KBm51bWJlchgBIAEoCRIf",
          "CgR0eXBlGAIgASgOMhEuUGVyc29uLlBob25lVHlwZSIrCglQaG9uZVR5cGUS",
          "CgoGTU9CSUxFEAASCAoESE9NRRABEggKBFdPUksQAmIGcHJvdG8z"));
    descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
        new pbr::FileDescriptor[] { },
        new pbr::GeneratedClrTypeInfo(null, new pbr::GeneratedClrTypeInfo[] {
          new pbr::GeneratedClrTypeInfo(typeof(global::Person), global::Person.Parser, new[]{ "Name", "Id", "Email", "Phone" }, null, new[]{ typeof(global::Person.Types.PhoneType) }, new pbr::GeneratedClrTypeInfo[] { new pbr::GeneratedClrTypeInfo(typeof(global::Person.Types.PhoneNumber), global::Person.Types.PhoneNumber.Parser, new[]{ "Number", "Type" }, null, null, null)})
        }));
  }
  #endregion

}
#region Messages
public sealed partial class Person : pb::IMessage<Person> {
  private static readonly pb::MessageParser<Person> _parser = new pb::MessageParser<Person>(() => new Person());
  private pb::UnknownFieldSet _unknownFields;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pb::MessageParser<Person> Parser { get { return _parser; } }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static pbr::MessageDescriptor Descriptor {
    get { return global::PersonReflection.Descriptor.MessageTypes[0]; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  pbr::MessageDescriptor pb::IMessage.Descriptor {
    get { return Descriptor; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public Person() {
    OnConstruction();
  }

  partial void OnConstruction();

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public Person(Person other) : this() {
    name_ = other.name_;
    id_ = other.id_;
    email_ = other.email_;
    phone_ = other.phone_.Clone();
    _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public Person Clone() {
    return new Person(this);
  }

  /// <summary>Field number for the "name" field.</summary>
  public const int NameFieldNumber = 1;
  private string name_ = "";
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public string Name {
    get { return name_; }
    set {
      name_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
    }
  }

  /// <summary>Field number for the "id" field.</summary>
  public const int IdFieldNumber = 2;
  private int id_;
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public int Id {
    get { return id_; }
    set {
      id_ = value;
    }
  }

  /// <summary>Field number for the "email" field.</summary>
  public const int EmailFieldNumber = 3;
  private string email_ = "";
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public string Email {
    get { return email_; }
    set {
      email_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
    }
  }

  /// <summary>Field number for the "phone" field.</summary>
  public const int PhoneFieldNumber = 4;
  private static readonly pb::FieldCodec<global::Person.Types.PhoneNumber> _repeated_phone_codec
      = pb::FieldCodec.ForMessage(34, global::Person.Types.PhoneNumber.Parser);
  private readonly pbc::RepeatedField<global::Person.Types.PhoneNumber> phone_ = new pbc::RepeatedField<global::Person.Types.PhoneNumber>();
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public pbc::RepeatedField<global::Person.Types.PhoneNumber> Phone {
    get { return phone_; }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override bool Equals(object other) {
    return Equals(other as Person);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public bool Equals(Person other) {
    if (ReferenceEquals(other, null)) {
      return false;
    }
    if (ReferenceEquals(other, this)) {
      return true;
    }
    if (Name != other.Name) return false;
    if (Id != other.Id) return false;
    if (Email != other.Email) return false;
    if(!phone_.Equals(other.phone_)) return false;
    return Equals(_unknownFields, other._unknownFields);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override int GetHashCode() {
    int hash = 1;
    if (Name.Length != 0) hash ^= Name.GetHashCode();
    if (Id != 0) hash ^= Id.GetHashCode();
    if (Email.Length != 0) hash ^= Email.GetHashCode();
    hash ^= phone_.GetHashCode();
    if (_unknownFields != null) {
      hash ^= _unknownFields.GetHashCode();
    }
    return hash;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public override string ToString() {
    return pb::JsonFormatter.ToDiagnosticString(this);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void WriteTo(pb::CodedOutputStream output) {
    if (Name.Length != 0) {
      output.WriteRawTag(10);
      output.WriteString(Name);
    }
    if (Id != 0) {
      output.WriteRawTag(16);
      output.WriteInt32(Id);
    }
    if (Email.Length != 0) {
      output.WriteRawTag(26);
      output.WriteString(Email);
    }
    phone_.WriteTo(output, _repeated_phone_codec);
    if (_unknownFields != null) {
      _unknownFields.WriteTo(output);
    }
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public int CalculateSize() {
    int size = 0;
    if (Name.Length != 0) {
      size += 1 + pb::CodedOutputStream.ComputeStringSize(Name);
    }
    if (Id != 0) {
      size += 1 + pb::CodedOutputStream.ComputeInt32Size(Id);
    }
    if (Email.Length != 0) {
      size += 1 + pb::CodedOutputStream.ComputeStringSize(Email);
    }
    size += phone_.CalculateSize(_repeated_phone_codec);
    if (_unknownFields != null) {
      size += _unknownFields.CalculateSize();
    }
    return size;
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void MergeFrom(Person other) {
    if (other == null) {
      return;
    }
    if (other.Name.Length != 0) {
      Name = other.Name;
    }
    if (other.Id != 0) {
      Id = other.Id;
    }
    if (other.Email.Length != 0) {
      Email = other.Email;
    }
    phone_.Add(other.phone_);
    _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
  }

  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public void MergeFrom(pb::CodedInputStream input) {
    uint tag;
    while ((tag = input.ReadTag()) != 0) {
      switch(tag) {
        default:
          _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
          break;
        case 10: {
          Name = input.ReadString();
          break;
        }
        case 16: {
          Id = input.ReadInt32();
          break;
        }
        case 26: {
          Email = input.ReadString();
          break;
        }
        case 34: {
          phone_.AddEntriesFrom(input, _repeated_phone_codec);
          break;
        }
      }
    }
  }

  #region Nested types
  /// <summary>Container for nested types declared in the Person message type.</summary>
  [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
  public static partial class Types {
    public enum PhoneType {
      [pbr::OriginalName("MOBILE")] Mobile = 0,
      [pbr::OriginalName("HOME")] Home = 1,
      [pbr::OriginalName("WORK")] Work = 2,
    }

    public sealed partial class PhoneNumber : pb::IMessage<PhoneNumber> {
      private static readonly pb::MessageParser<PhoneNumber> _parser = new pb::MessageParser<PhoneNumber>(() => new PhoneNumber());
      private pb::UnknownFieldSet _unknownFields;
      [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
      public static pb::MessageParser<PhoneNumber> Parser { get { return _parser; } }

      [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
      public static pbr::MessageDescriptor Descriptor {
        get { return global::Person.Descriptor.NestedTypes[0]; }
      }

      [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
      pbr::MessageDescriptor pb::IMessage.Descriptor {
        get { return Descriptor; }
      }

      [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
      public PhoneNumber() {
        OnConstruction();
      }

      partial void OnConstruction();

      [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
      public PhoneNumber(PhoneNumber other) : this() {
        number_ = other.number_;
        type_ = other.type_;
        _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
      }

      [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
      public PhoneNumber Clone() {
        return new PhoneNumber(this);
      }

      /// <summary>Field number for the "number" field.</summary>
      public const int NumberFieldNumber = 1;
      private string number_ = "";
      [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
      public string Number {
        get { return number_; }
        set {
          number_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
        }
      }

      /// <summary>Field number for the "type" field.</summary>
      public const int TypeFieldNumber = 2;
      private global::Person.Types.PhoneType type_ = 0;
      [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
      public global::Person.Types.PhoneType Type {
        get { return type_; }
        set {
          type_ = value;
        }
      }

      [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
      public override bool Equals(object other) {
        return Equals(other as PhoneNumber);
      }

      [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
      public bool Equals(PhoneNumber other) {
        if (ReferenceEquals(other, null)) {
          return false;
        }
        if (ReferenceEquals(other, this)) {
          return true;
        }
        if (Number != other.Number) return false;
        if (Type != other.Type) return false;
        return Equals(_unknownFields, other._unknownFields);
      }

      [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
      public override int GetHashCode() {
        int hash = 1;
        if (Number.Length != 0) hash ^= Number.GetHashCode();
        if (Type != 0) hash ^= Type.GetHashCode();
        if (_unknownFields != null) {
          hash ^= _unknownFields.GetHashCode();
        }
        return hash;
      }

      [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
      public override string ToString() {
        return pb::JsonFormatter.ToDiagnosticString(this);
      }

      [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
      public void WriteTo(pb::CodedOutputStream output) {
        if (Number.Length != 0) {
          output.WriteRawTag(10);
          output.WriteString(Number);
        }
        if (Type != 0) {
          output.WriteRawTag(16);
          output.WriteEnum((int) Type);
        }
        if (_unknownFields != null) {
          _unknownFields.WriteTo(output);
        }
      }

      [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
      public int CalculateSize() {
        int size = 0;
        if (Number.Length != 0) {
          size += 1 + pb::CodedOutputStream.ComputeStringSize(Number);
        }
        if (Type != 0) {
          size += 1 + pb::CodedOutputStream.ComputeEnumSize((int) Type);
        }
        if (_unknownFields != null) {
          size += _unknownFields.CalculateSize();
        }
        return size;
      }

      [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
      public void MergeFrom(PhoneNumber other) {
        if (other == null) {
          return;
        }
        if (other.Number.Length != 0) {
          Number = other.Number;
        }
        if (other.Type != 0) {
          Type = other.Type;
        }
        _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
      }

      [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
      public void MergeFrom(pb::CodedInputStream input) {
        uint tag;
        while ((tag = input.ReadTag()) != 0) {
          switch(tag) {
            default:
              _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
              break;
            case 10: {
              Number = input.ReadString();
              break;
            }
            case 16: {
              type_ = (global::Person.Types.PhoneType) input.ReadEnum();
              break;
            }
          }
        }
      }

    }

  }
  #endregion

}

#endregion


#endregion Designer generated code
