// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGDiceSideType.proto

package emu.grasscutter.net.proto;

public final class GCGDiceSideTypeOuterClass {
  private GCGDiceSideTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Obf: CIIKACHFINK
   * </pre>
   *
   * Protobuf enum {@code GCGDiceSideType}
   */
  public enum GCGDiceSideType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GCG_DICE_SIDE_INVALID = 0;</code>
     */
    GCG_DICE_SIDE_INVALID(0),
    /**
     * <code>GCG_DICE_SIDE_CRYO = 1;</code>
     */
    GCG_DICE_SIDE_CRYO(1),
    /**
     * <code>GCG_DICE_SIDE_HYDRO = 2;</code>
     */
    GCG_DICE_SIDE_HYDRO(2),
    /**
     * <code>GCG_DICE_SIDE_PYRO = 3;</code>
     */
    GCG_DICE_SIDE_PYRO(3),
    /**
     * <code>GCG_DICE_SIDE_ELECTRO = 4;</code>
     */
    GCG_DICE_SIDE_ELECTRO(4),
    /**
     * <code>GCG_DICE_SIDE_GEO = 5;</code>
     */
    GCG_DICE_SIDE_GEO(5),
    /**
     * <code>GCG_DICE_SIDE_DENDRO = 6;</code>
     */
    GCG_DICE_SIDE_DENDRO(6),
    /**
     * <code>GCG_DICE_SIDE_ANEMO = 7;</code>
     */
    GCG_DICE_SIDE_ANEMO(7),
    /**
     * <code>GCG_DICE_SIDE_PAIMON = 8;</code>
     */
    GCG_DICE_SIDE_PAIMON(8),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GCG_DICE_SIDE_INVALID = 0;</code>
     */
    public static final int GCG_DICE_SIDE_INVALID_VALUE = 0;
    /**
     * <code>GCG_DICE_SIDE_CRYO = 1;</code>
     */
    public static final int GCG_DICE_SIDE_CRYO_VALUE = 1;
    /**
     * <code>GCG_DICE_SIDE_HYDRO = 2;</code>
     */
    public static final int GCG_DICE_SIDE_HYDRO_VALUE = 2;
    /**
     * <code>GCG_DICE_SIDE_PYRO = 3;</code>
     */
    public static final int GCG_DICE_SIDE_PYRO_VALUE = 3;
    /**
     * <code>GCG_DICE_SIDE_ELECTRO = 4;</code>
     */
    public static final int GCG_DICE_SIDE_ELECTRO_VALUE = 4;
    /**
     * <code>GCG_DICE_SIDE_GEO = 5;</code>
     */
    public static final int GCG_DICE_SIDE_GEO_VALUE = 5;
    /**
     * <code>GCG_DICE_SIDE_DENDRO = 6;</code>
     */
    public static final int GCG_DICE_SIDE_DENDRO_VALUE = 6;
    /**
     * <code>GCG_DICE_SIDE_ANEMO = 7;</code>
     */
    public static final int GCG_DICE_SIDE_ANEMO_VALUE = 7;
    /**
     * <code>GCG_DICE_SIDE_PAIMON = 8;</code>
     */
    public static final int GCG_DICE_SIDE_PAIMON_VALUE = 8;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static GCGDiceSideType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GCGDiceSideType forNumber(int value) {
      switch (value) {
        case 0: return GCG_DICE_SIDE_INVALID;
        case 1: return GCG_DICE_SIDE_CRYO;
        case 2: return GCG_DICE_SIDE_HYDRO;
        case 3: return GCG_DICE_SIDE_PYRO;
        case 4: return GCG_DICE_SIDE_ELECTRO;
        case 5: return GCG_DICE_SIDE_GEO;
        case 6: return GCG_DICE_SIDE_DENDRO;
        case 7: return GCG_DICE_SIDE_ANEMO;
        case 8: return GCG_DICE_SIDE_PAIMON;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GCGDiceSideType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GCGDiceSideType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GCGDiceSideType>() {
            public GCGDiceSideType findValueByNumber(int number) {
              return GCGDiceSideType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final GCGDiceSideType[] VALUES = values();

    public static GCGDiceSideType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private GCGDiceSideType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:GCGDiceSideType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025GCGDiceSideType.proto*\364\001\n\017GCGDiceSideT" +
      "ype\022\031\n\025GCG_DICE_SIDE_INVALID\020\000\022\026\n\022GCG_DI" +
      "CE_SIDE_CRYO\020\001\022\027\n\023GCG_DICE_SIDE_HYDRO\020\002\022" +
      "\026\n\022GCG_DICE_SIDE_PYRO\020\003\022\031\n\025GCG_DICE_SIDE" +
      "_ELECTRO\020\004\022\025\n\021GCG_DICE_SIDE_GEO\020\005\022\030\n\024GCG" +
      "_DICE_SIDE_DENDRO\020\006\022\027\n\023GCG_DICE_SIDE_ANE" +
      "MO\020\007\022\030\n\024GCG_DICE_SIDE_PAIMON\020\010B\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
