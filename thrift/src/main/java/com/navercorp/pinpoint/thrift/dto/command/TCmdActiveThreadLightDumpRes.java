/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.navercorp.pinpoint.thrift.dto.command;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2018-10-19")
public class TCmdActiveThreadLightDumpRes implements org.apache.thrift.TBase<TCmdActiveThreadLightDumpRes, TCmdActiveThreadLightDumpRes._Fields>, java.io.Serializable, Cloneable, Comparable<TCmdActiveThreadLightDumpRes> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCmdActiveThreadLightDumpRes");

  private static final org.apache.thrift.protocol.TField THREAD_DUMPS_FIELD_DESC = new org.apache.thrift.protocol.TField("threadDumps", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SUB_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("subType", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TCmdActiveThreadLightDumpResStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TCmdActiveThreadLightDumpResTupleSchemeFactory();

  private java.util.List<TActiveThreadLightDump> threadDumps; // required
  private java.lang.String type; // optional
  private java.lang.String subType; // optional
  private java.lang.String version; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    THREAD_DUMPS((short)1, "threadDumps"),
    TYPE((short)2, "type"),
    SUB_TYPE((short)3, "subType"),
    VERSION((short)4, "version");

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
        case 1: // THREAD_DUMPS
          return THREAD_DUMPS;
        case 2: // TYPE
          return TYPE;
        case 3: // SUB_TYPE
          return SUB_TYPE;
        case 4: // VERSION
          return VERSION;
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
  private static final _Fields optionals[] = {_Fields.TYPE,_Fields.SUB_TYPE,_Fields.VERSION};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.THREAD_DUMPS, new org.apache.thrift.meta_data.FieldMetaData("threadDumps", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TActiveThreadLightDump.class))));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SUB_TYPE, new org.apache.thrift.meta_data.FieldMetaData("subType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCmdActiveThreadLightDumpRes.class, metaDataMap);
  }

  public TCmdActiveThreadLightDumpRes() {
  }

  public TCmdActiveThreadLightDumpRes(
    java.util.List<TActiveThreadLightDump> threadDumps)
  {
    this();
    this.threadDumps = threadDumps;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCmdActiveThreadLightDumpRes(TCmdActiveThreadLightDumpRes other) {
    if (other.isSetThreadDumps()) {
      java.util.List<TActiveThreadLightDump> __this__threadDumps = new java.util.ArrayList<TActiveThreadLightDump>(other.threadDumps.size());
      for (TActiveThreadLightDump other_element : other.threadDumps) {
        __this__threadDumps.add(new TActiveThreadLightDump(other_element));
      }
      this.threadDumps = __this__threadDumps;
    }
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetSubType()) {
      this.subType = other.subType;
    }
    if (other.isSetVersion()) {
      this.version = other.version;
    }
  }

  public TCmdActiveThreadLightDumpRes deepCopy() {
    return new TCmdActiveThreadLightDumpRes(this);
  }

  @Override
  public void clear() {
    this.threadDumps = null;
    this.type = null;
    this.subType = null;
    this.version = null;
  }

  public int getThreadDumpsSize() {
    return (this.threadDumps == null) ? 0 : this.threadDumps.size();
  }

  public java.util.Iterator<TActiveThreadLightDump> getThreadDumpsIterator() {
    return (this.threadDumps == null) ? null : this.threadDumps.iterator();
  }

  public void addToThreadDumps(TActiveThreadLightDump elem) {
    if (this.threadDumps == null) {
      this.threadDumps = new java.util.ArrayList<TActiveThreadLightDump>();
    }
    this.threadDumps.add(elem);
  }

  public java.util.List<TActiveThreadLightDump> getThreadDumps() {
    return this.threadDumps;
  }

  public void setThreadDumps(java.util.List<TActiveThreadLightDump> threadDumps) {
    this.threadDumps = threadDumps;
  }

  public void unsetThreadDumps() {
    this.threadDumps = null;
  }

  /** Returns true if field threadDumps is set (has been assigned a value) and false otherwise */
  public boolean isSetThreadDumps() {
    return this.threadDumps != null;
  }

  public void setThreadDumpsIsSet(boolean value) {
    if (!value) {
      this.threadDumps = null;
    }
  }

  public java.lang.String getType() {
    return this.type;
  }

  public void setType(java.lang.String type) {
    this.type = type;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public java.lang.String getSubType() {
    return this.subType;
  }

  public void setSubType(java.lang.String subType) {
    this.subType = subType;
  }

  public void unsetSubType() {
    this.subType = null;
  }

  /** Returns true if field subType is set (has been assigned a value) and false otherwise */
  public boolean isSetSubType() {
    return this.subType != null;
  }

  public void setSubTypeIsSet(boolean value) {
    if (!value) {
      this.subType = null;
    }
  }

  public java.lang.String getVersion() {
    return this.version;
  }

  public void setVersion(java.lang.String version) {
    this.version = version;
  }

  public void unsetVersion() {
    this.version = null;
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return this.version != null;
  }

  public void setVersionIsSet(boolean value) {
    if (!value) {
      this.version = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case THREAD_DUMPS:
      if (value == null) {
        unsetThreadDumps();
      } else {
        setThreadDumps((java.util.List<TActiveThreadLightDump>)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((java.lang.String)value);
      }
      break;

    case SUB_TYPE:
      if (value == null) {
        unsetSubType();
      } else {
        setSubType((java.lang.String)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case THREAD_DUMPS:
      return getThreadDumps();

    case TYPE:
      return getType();

    case SUB_TYPE:
      return getSubType();

    case VERSION:
      return getVersion();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case THREAD_DUMPS:
      return isSetThreadDumps();
    case TYPE:
      return isSetType();
    case SUB_TYPE:
      return isSetSubType();
    case VERSION:
      return isSetVersion();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TCmdActiveThreadLightDumpRes)
      return this.equals((TCmdActiveThreadLightDumpRes)that);
    return false;
  }

  public boolean equals(TCmdActiveThreadLightDumpRes that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_threadDumps = true && this.isSetThreadDumps();
    boolean that_present_threadDumps = true && that.isSetThreadDumps();
    if (this_present_threadDumps || that_present_threadDumps) {
      if (!(this_present_threadDumps && that_present_threadDumps))
        return false;
      if (!this.threadDumps.equals(that.threadDumps))
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_subType = true && this.isSetSubType();
    boolean that_present_subType = true && that.isSetSubType();
    if (this_present_subType || that_present_subType) {
      if (!(this_present_subType && that_present_subType))
        return false;
      if (!this.subType.equals(that.subType))
        return false;
    }

    boolean this_present_version = true && this.isSetVersion();
    boolean that_present_version = true && that.isSetVersion();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (!this.version.equals(that.version))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetThreadDumps()) ? 131071 : 524287);
    if (isSetThreadDumps())
      hashCode = hashCode * 8191 + threadDumps.hashCode();

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.hashCode();

    hashCode = hashCode * 8191 + ((isSetSubType()) ? 131071 : 524287);
    if (isSetSubType())
      hashCode = hashCode * 8191 + subType.hashCode();

    hashCode = hashCode * 8191 + ((isSetVersion()) ? 131071 : 524287);
    if (isSetVersion())
      hashCode = hashCode * 8191 + version.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TCmdActiveThreadLightDumpRes other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetThreadDumps()).compareTo(other.isSetThreadDumps());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThreadDumps()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.threadDumps, other.threadDumps);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSubType()).compareTo(other.isSetSubType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.subType, other.subType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetVersion()).compareTo(other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TCmdActiveThreadLightDumpRes(");
    boolean first = true;

    sb.append("threadDumps:");
    if (this.threadDumps == null) {
      sb.append("null");
    } else {
      sb.append(this.threadDumps);
    }
    first = false;
    if (isSetType()) {
      if (!first) sb.append(", ");
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    if (isSetSubType()) {
      if (!first) sb.append(", ");
      sb.append("subType:");
      if (this.subType == null) {
        sb.append("null");
      } else {
        sb.append(this.subType);
      }
      first = false;
    }
    if (isSetVersion()) {
      if (!first) sb.append(", ");
      sb.append("version:");
      if (this.version == null) {
        sb.append("null");
      } else {
        sb.append(this.version);
      }
      first = false;
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TCmdActiveThreadLightDumpResStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCmdActiveThreadLightDumpResStandardScheme getScheme() {
      return new TCmdActiveThreadLightDumpResStandardScheme();
    }
  }

  private static class TCmdActiveThreadLightDumpResStandardScheme extends org.apache.thrift.scheme.StandardScheme<TCmdActiveThreadLightDumpRes> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCmdActiveThreadLightDumpRes struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // THREAD_DUMPS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list80 = iprot.readListBegin();
                struct.threadDumps = new java.util.ArrayList<TActiveThreadLightDump>(_list80.size);
                TActiveThreadLightDump _elem81;
                for (int _i82 = 0; _i82 < _list80.size; ++_i82)
                {
                  _elem81 = new TActiveThreadLightDump();
                  _elem81.read(iprot);
                  struct.threadDumps.add(_elem81);
                }
                iprot.readListEnd();
              }
              struct.setThreadDumpsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.type = iprot.readString();
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SUB_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.subType = iprot.readString();
              struct.setSubTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.version = iprot.readString();
              struct.setVersionIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCmdActiveThreadLightDumpRes struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.threadDumps != null) {
        oprot.writeFieldBegin(THREAD_DUMPS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.threadDumps.size()));
          for (TActiveThreadLightDump _iter83 : struct.threadDumps)
          {
            _iter83.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.type != null) {
        if (struct.isSetType()) {
          oprot.writeFieldBegin(TYPE_FIELD_DESC);
          oprot.writeString(struct.type);
          oprot.writeFieldEnd();
        }
      }
      if (struct.subType != null) {
        if (struct.isSetSubType()) {
          oprot.writeFieldBegin(SUB_TYPE_FIELD_DESC);
          oprot.writeString(struct.subType);
          oprot.writeFieldEnd();
        }
      }
      if (struct.version != null) {
        if (struct.isSetVersion()) {
          oprot.writeFieldBegin(VERSION_FIELD_DESC);
          oprot.writeString(struct.version);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCmdActiveThreadLightDumpResTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TCmdActiveThreadLightDumpResTupleScheme getScheme() {
      return new TCmdActiveThreadLightDumpResTupleScheme();
    }
  }

  private static class TCmdActiveThreadLightDumpResTupleScheme extends org.apache.thrift.scheme.TupleScheme<TCmdActiveThreadLightDumpRes> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCmdActiveThreadLightDumpRes struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetThreadDumps()) {
        optionals.set(0);
      }
      if (struct.isSetType()) {
        optionals.set(1);
      }
      if (struct.isSetSubType()) {
        optionals.set(2);
      }
      if (struct.isSetVersion()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetThreadDumps()) {
        {
          oprot.writeI32(struct.threadDumps.size());
          for (TActiveThreadLightDump _iter84 : struct.threadDumps)
          {
            _iter84.write(oprot);
          }
        }
      }
      if (struct.isSetType()) {
        oprot.writeString(struct.type);
      }
      if (struct.isSetSubType()) {
        oprot.writeString(struct.subType);
      }
      if (struct.isSetVersion()) {
        oprot.writeString(struct.version);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCmdActiveThreadLightDumpRes struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list85 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.threadDumps = new java.util.ArrayList<TActiveThreadLightDump>(_list85.size);
          TActiveThreadLightDump _elem86;
          for (int _i87 = 0; _i87 < _list85.size; ++_i87)
          {
            _elem86 = new TActiveThreadLightDump();
            _elem86.read(iprot);
            struct.threadDumps.add(_elem86);
          }
        }
        struct.setThreadDumpsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.type = iprot.readString();
        struct.setTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.subType = iprot.readString();
        struct.setSubTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.version = iprot.readString();
        struct.setVersionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

