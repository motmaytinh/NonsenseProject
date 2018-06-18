/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package nonamespace;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-06-18")
public class NonsenseException extends org.apache.thrift.TException implements org.apache.thrift.TBase<NonsenseException, NonsenseException._Fields>, java.io.Serializable, Cloneable, Comparable<NonsenseException> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NonsenseException");

  private static final org.apache.thrift.protocol.TField ERROR_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("error_code", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ERROR_DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("error_description", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new NonsenseExceptionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new NonsenseExceptionTupleSchemeFactory();

  public int error_code; // required
  public java.lang.String error_description; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ERROR_CODE((short)1, "error_code"),
    ERROR_DESCRIPTION((short)2, "error_description");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ERROR_CODE
          return ERROR_CODE;
        case 2: // ERROR_DESCRIPTION
          return ERROR_DESCRIPTION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ERROR_CODE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERROR_CODE, new org.apache.thrift.meta_data.FieldMetaData("error_code", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.ERROR_DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("error_description", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NonsenseException.class, metaDataMap);
  }

  public NonsenseException() {
  }

  public NonsenseException(
    int error_code,
    java.lang.String error_description)
  {
    this();
    this.error_code = error_code;
    setError_codeIsSet(true);
    this.error_description = error_description;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NonsenseException(NonsenseException other) {
    __isset_bitfield = other.__isset_bitfield;
    this.error_code = other.error_code;
    if (other.isSetError_description()) {
      this.error_description = other.error_description;
    }
  }

  public NonsenseException deepCopy() {
    return new NonsenseException(this);
  }

  @Override
  public void clear() {
    setError_codeIsSet(false);
    this.error_code = 0;
    this.error_description = null;
  }

  public int getError_code() {
    return this.error_code;
  }

  public NonsenseException setError_code(int error_code) {
    this.error_code = error_code;
    setError_codeIsSet(true);
    return this;
  }

  public void unsetError_code() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ERROR_CODE_ISSET_ID);
  }

  /** Returns true if field error_code is set (has been assigned a value) and false otherwise */
  public boolean isSetError_code() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ERROR_CODE_ISSET_ID);
  }

  public void setError_codeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ERROR_CODE_ISSET_ID, value);
  }

  public java.lang.String getError_description() {
    return this.error_description;
  }

  public NonsenseException setError_description(java.lang.String error_description) {
    this.error_description = error_description;
    return this;
  }

  public void unsetError_description() {
    this.error_description = null;
  }

  /** Returns true if field error_description is set (has been assigned a value) and false otherwise */
  public boolean isSetError_description() {
    return this.error_description != null;
  }

  public void setError_descriptionIsSet(boolean value) {
    if (!value) {
      this.error_description = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ERROR_CODE:
      if (value == null) {
        unsetError_code();
      } else {
        setError_code((java.lang.Integer)value);
      }
      break;

    case ERROR_DESCRIPTION:
      if (value == null) {
        unsetError_description();
      } else {
        setError_description((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ERROR_CODE:
      return getError_code();

    case ERROR_DESCRIPTION:
      return getError_description();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ERROR_CODE:
      return isSetError_code();
    case ERROR_DESCRIPTION:
      return isSetError_description();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof NonsenseException)
      return this.equals((NonsenseException)that);
    return false;
  }

  public boolean equals(NonsenseException that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_error_code = true;
    boolean that_present_error_code = true;
    if (this_present_error_code || that_present_error_code) {
      if (!(this_present_error_code && that_present_error_code))
        return false;
      if (this.error_code != that.error_code)
        return false;
    }

    boolean this_present_error_description = true && this.isSetError_description();
    boolean that_present_error_description = true && that.isSetError_description();
    if (this_present_error_description || that_present_error_description) {
      if (!(this_present_error_description && that_present_error_description))
        return false;
      if (!this.error_description.equals(that.error_description))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + error_code;

    hashCode = hashCode * 8191 + ((isSetError_description()) ? 131071 : 524287);
    if (isSetError_description())
      hashCode = hashCode * 8191 + error_description.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(NonsenseException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetError_code()).compareTo(other.isSetError_code());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetError_code()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error_code, other.error_code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetError_description()).compareTo(other.isSetError_description());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetError_description()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error_description, other.error_description);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("NonsenseException(");
    boolean first = true;

    sb.append("error_code:");
    sb.append(this.error_code);
    first = false;
    if (!first) sb.append(", ");
    sb.append("error_description:");
    if (this.error_description == null) {
      sb.append("null");
    } else {
      sb.append(this.error_description);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class NonsenseExceptionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public NonsenseExceptionStandardScheme getScheme() {
      return new NonsenseExceptionStandardScheme();
    }
  }

  private static class NonsenseExceptionStandardScheme extends org.apache.thrift.scheme.StandardScheme<NonsenseException> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NonsenseException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERROR_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.error_code = iprot.readI32();
              struct.setError_codeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ERROR_DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.error_description = iprot.readString();
              struct.setError_descriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, NonsenseException struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
      oprot.writeI32(struct.error_code);
      oprot.writeFieldEnd();
      if (struct.error_description != null) {
        oprot.writeFieldBegin(ERROR_DESCRIPTION_FIELD_DESC);
        oprot.writeString(struct.error_description);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NonsenseExceptionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public NonsenseExceptionTupleScheme getScheme() {
      return new NonsenseExceptionTupleScheme();
    }
  }

  private static class NonsenseExceptionTupleScheme extends org.apache.thrift.scheme.TupleScheme<NonsenseException> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NonsenseException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetError_code()) {
        optionals.set(0);
      }
      if (struct.isSetError_description()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetError_code()) {
        oprot.writeI32(struct.error_code);
      }
      if (struct.isSetError_description()) {
        oprot.writeString(struct.error_description);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, NonsenseException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.error_code = iprot.readI32();
        struct.setError_codeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.error_description = iprot.readString();
        struct.setError_descriptionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
