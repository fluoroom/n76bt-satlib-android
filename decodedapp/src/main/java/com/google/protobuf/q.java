package com.google.protobuf;

import com.facebook.stetho.websocket.CloseCodes;
import com.google.protobuf.a;
import com.google.protobuf.k0;
import com.google.protobuf.o0;
import com.google.protobuf.r;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q {
    private static final r.b A;
    private static final k0.f B;
    private static final r.b C;
    private static final k0.f D;
    private static final r.b E;
    private static final k0.f F;
    private static final r.b G;
    private static final k0.f H;
    private static final r.b I;
    private static final k0.f J;
    private static final r.b K;
    private static final k0.f L;
    private static final r.b M;
    private static final k0.f N;
    private static final r.b O;
    private static final k0.f P;
    private static final r.b Q;
    private static final k0.f R;
    private static final r.b S;
    private static final k0.f T;
    private static final r.b U;
    private static final k0.f V;
    private static final r.b W;
    private static final k0.f X;
    private static final r.b Y;
    private static final k0.f Z;

    /* JADX INFO: renamed from: a */
    private static final r.b f9284a;

    /* JADX INFO: renamed from: a0 */
    private static final r.b f9285a0;

    /* JADX INFO: renamed from: b */
    private static final k0.f f9286b;

    /* JADX INFO: renamed from: b0 */
    private static final k0.f f9287b0;

    /* JADX INFO: renamed from: c */
    private static final r.b f9288c;

    /* JADX INFO: renamed from: c0 */
    private static final r.b f9289c0;

    /* JADX INFO: renamed from: d */
    private static final k0.f f9290d;

    /* JADX INFO: renamed from: d0 */
    private static final k0.f f9291d0;

    /* JADX INFO: renamed from: e */
    private static final r.b f9292e;

    /* JADX INFO: renamed from: e0 */
    private static final r.b f9293e0;

    /* JADX INFO: renamed from: f */
    private static final k0.f f9294f;

    /* JADX INFO: renamed from: f0 */
    private static final k0.f f9295f0;

    /* JADX INFO: renamed from: g */
    private static final r.b f9296g;

    /* JADX INFO: renamed from: g0 */
    private static final r.b f9297g0;

    /* JADX INFO: renamed from: h */
    private static final k0.f f9298h;

    /* JADX INFO: renamed from: h0 */
    private static final k0.f f9299h0;

    /* JADX INFO: renamed from: i */
    private static final r.b f9300i;

    /* JADX INFO: renamed from: i0 */
    private static final r.b f9301i0;

    /* JADX INFO: renamed from: j */
    private static final k0.f f9302j;

    /* JADX INFO: renamed from: j0 */
    private static final k0.f f9303j0;

    /* JADX INFO: renamed from: k */
    private static final r.b f9304k;

    /* JADX INFO: renamed from: k0 */
    private static final r.b f9305k0;

    /* JADX INFO: renamed from: l */
    private static final k0.f f9306l;

    /* JADX INFO: renamed from: l0 */
    private static final k0.f f9307l0;

    /* JADX INFO: renamed from: m */
    private static final r.b f9308m;

    /* JADX INFO: renamed from: m0 */
    private static r.h f9309m0 = r.h.s(new String[]{"\n google/protobuf/descriptor.proto\u0012\u000fgoogle.protobuf\"M\n\u0011FileDescriptorSet\u00128\n\u0004file\u0018\u0001 \u0003(\u000b2$.google.protobuf.FileDescriptorProtoR\u0004file\"\u0098\u0005\n\u0013FileDescriptorProto\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012\u0018\n\u0007package\u0018\u0002 \u0001(\tR\u0007package\u0012\u001e\n\ndependency\u0018\u0003 \u0003(\tR\ndependency\u0012+\n\u0011public_dependency\u0018\n \u0003(\u0005R\u0010publicDependency\u0012'\n\u000fweak_dependency\u0018\u000b \u0003(\u0005R\u000eweakDependency\u0012C\n\fmessage_type\u0018\u0004 \u0003(\u000b2 .google.protobuf.DescriptorProtoR\u000bmessageType\u0012A\n\tenum_type\u0018\u0005 \u0003(\u000b2$.google.protobuf.EnumDescriptorProtoR\benumType\u0012A\n\u0007service\u0018\u0006 \u0003(\u000b2'.google.protobuf.ServiceDescriptorProtoR\u0007service\u0012C\n\textension\u0018\u0007 \u0003(\u000b2%.google.protobuf.FieldDescriptorProtoR\textension\u00126\n\u0007options\u0018\b \u0001(\u000b2\u001c.google.protobuf.FileOptionsR\u0007options\u0012I\n\u0010source_code_info\u0018\t \u0001(\u000b2\u001f.google.protobuf.SourceCodeInfoR\u000esourceCodeInfo\u0012\u0016\n\u0006syntax\u0018\f \u0001(\tR\u0006syntax\u00122\n\u0007edition\u0018\u000e \u0001(\u000e2\u0018.google.protobuf.EditionR\u0007edition\"¹\u0006\n\u000fDescriptorProto\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012;\n\u0005field\u0018\u0002 \u0003(\u000b2%.google.protobuf.FieldDescriptorProtoR\u0005field\u0012C\n\textension\u0018\u0006 \u0003(\u000b2%.google.protobuf.FieldDescriptorProtoR\textension\u0012A\n\u000bnested_type\u0018\u0003 \u0003(\u000b2 .google.protobuf.DescriptorProtoR\nnestedType\u0012A\n\tenum_type\u0018\u0004 \u0003(\u000b2$.google.protobuf.EnumDescriptorProtoR\benumType\u0012X\n\u000fextension_range\u0018\u0005 \u0003(\u000b2/.google.protobuf.DescriptorProto.ExtensionRangeR\u000eextensionRange\u0012D\n\noneof_decl\u0018\b \u0003(\u000b2%.google.protobuf.OneofDescriptorProtoR\toneofDecl\u00129\n\u0007options\u0018\u0007 \u0001(\u000b2\u001f.google.protobuf.MessageOptionsR\u0007options\u0012U\n\u000ereserved_range\u0018\t \u0003(\u000b2..google.protobuf.DescriptorProto.ReservedRangeR\rreservedRange\u0012#\n\rreserved_name\u0018\n \u0003(\tR\freservedName\u001az\n\u000eExtensionRange\u0012\u0014\n\u0005start\u0018\u0001 \u0001(\u0005R\u0005start\u0012\u0010\n\u0003end\u0018\u0002 \u0001(\u0005R\u0003end\u0012@\n\u0007options\u0018\u0003 \u0001(\u000b2&.google.protobuf.ExtensionRangeOptionsR\u0007options\u001a7\n\rReservedRange\u0012\u0014\n\u0005start\u0018\u0001 \u0001(\u0005R\u0005start\u0012\u0010\n\u0003end\u0018\u0002 \u0001(\u0005R\u0003end\"Ç\u0004\n\u0015ExtensionRangeOptions\u0012X\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOptionR\u0013uninterpretedOption\u0012Y\n\u000bdeclaration\u0018\u0002 \u0003(\u000b22.google.protobuf.ExtensionRangeOptions.DeclarationB\u0003\u0088\u0001\u0002R\u000bdeclaration\u00127\n\bfeatures\u00182 \u0001(\u000b2\u001b.google.protobuf.FeatureSetR\bfeatures\u0012h\n\fverification\u0018\u0003 \u0001(\u000e28.google.protobuf.ExtensionRangeOptions.VerificationState:\nUNVERIFIEDR\fverification\u001a\u0094\u0001\n\u000bDeclaration\u0012\u0016\n\u0006number\u0018\u0001 \u0001(\u0005R\u0006number\u0012\u001b\n\tfull_name\u0018\u0002 \u0001(\tR\bfullName\u0012\u0012\n\u0004type\u0018\u0003 \u0001(\tR\u0004type\u0012\u001a\n\breserved\u0018\u0005 \u0001(\bR\breserved\u0012\u001a\n\brepeated\u0018\u0006 \u0001(\bR\brepeatedJ\u0004\b\u0004\u0010\u0005\"4\n\u0011VerificationState\u0012\u000f\n\u000bDECLARATION\u0010\u0000\u0012\u000e\n\nUNVERIFIED\u0010\u0001*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"Á\u0006\n\u0014FieldDescriptorProto\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012\u0016\n\u0006number\u0018\u0003 \u0001(\u0005R\u0006number\u0012A\n\u0005label\u0018\u0004 \u0001(\u000e2+.google.protobuf.FieldDescriptorProto.LabelR\u0005label\u0012>\n\u0004type\u0018\u0005 \u0001(\u000e2*.google.protobuf.FieldDescriptorProto.TypeR\u0004type\u0012\u001b\n\ttype_name\u0018\u0006 \u0001(\tR\btypeName\u0012\u001a\n\bextendee\u0018\u0002 \u0001(\tR\bextendee\u0012#\n\rdefault_value\u0018\u0007 \u0001(\tR\fdefaultValue\u0012\u001f\n\u000boneof_index\u0018\t \u0001(\u0005R\noneofIndex\u0012\u001b\n\tjson_name\u0018\n \u0001(\tR\bjsonName\u00127\n\u0007options\u0018\b \u0001(\u000b2\u001d.google.protobuf.FieldOptionsR\u0007options\u0012'\n\u000fproto3_optional\u0018\u0011 \u0001(\bR\u000eproto3Optional\"¶\u0002\n\u0004Type\u0012\u000f\n\u000bTYPE_DOUBLE\u0010\u0001\u0012\u000e\n\nTYPE_FLOAT\u0010\u0002\u0012\u000e\n\nTYPE_INT64\u0010\u0003\u0012\u000f\n\u000bTYPE_UINT64\u0010\u0004\u0012\u000e\n\nTYPE_INT32\u0010\u0005\u0012\u0010\n\fTYPE_FIXED64\u0010\u0006\u0012\u0010\n\fTYPE_FIXED32\u0010\u0007\u0012\r\n\tTYPE_BOOL\u0010\b\u0012\u000f\n\u000bTYPE_STRING\u0010\t\u0012\u000e\n\nTYPE_GROUP\u0010\n\u0012\u0010\n\fTYPE_MESSAGE\u0010\u000b\u0012\u000e\n\nTYPE_BYTES\u0010\f\u0012\u000f\n\u000bTYPE_UINT32\u0010\r\u0012\r\n\tTYPE_ENUM\u0010\u000e\u0012\u0011\n\rTYPE_SFIXED32\u0010\u000f\u0012\u0011\n\rTYPE_SFIXED64\u0010\u0010\u0012\u000f\n\u000bTYPE_SINT32\u0010\u0011\u0012\u000f\n\u000bTYPE_SINT64\u0010\u0012\"C\n\u0005Label\u0012\u0012\n\u000eLABEL_OPTIONAL\u0010\u0001\u0012\u0012\n\u000eLABEL_REPEATED\u0010\u0003\u0012\u0012\n\u000eLABEL_REQUIRED\u0010\u0002\"c\n\u0014OneofDescriptorProto\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u00127\n\u0007options\u0018\u0002 \u0001(\u000b2\u001d.google.protobuf.OneofOptionsR\u0007options\"ã\u0002\n\u0013EnumDescriptorProto\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012?\n\u0005value\u0018\u0002 \u0003(\u000b2).google.protobuf.EnumValueDescriptorProtoR\u0005value\u00126\n\u0007options\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.EnumOptionsR\u0007options\u0012]\n\u000ereserved_range\u0018\u0004 \u0003(\u000b26.google.protobuf.EnumDescriptorProto.EnumReservedRangeR\rreservedRange\u0012#\n\rreserved_name\u0018\u0005 \u0003(\tR\freservedName\u001a;\n\u0011EnumReservedRange\u0012\u0014\n\u0005start\u0018\u0001 \u0001(\u0005R\u0005start\u0012\u0010\n\u0003end\u0018\u0002 \u0001(\u0005R\u0003end\"\u0083\u0001\n\u0018EnumValueDescriptorProto\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012\u0016\n\u0006number\u0018\u0002 \u0001(\u0005R\u0006number\u0012;\n\u0007options\u0018\u0003 \u0001(\u000b2!.google.protobuf.EnumValueOptionsR\u0007options\"§\u0001\n\u0016ServiceDescriptorProto\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012>\n\u0006method\u0018\u0002 \u0003(\u000b2&.google.protobuf.MethodDescriptorProtoR\u0006method\u00129\n\u0007options\u0018\u0003 \u0001(\u000b2\u001f.google.protobuf.ServiceOptionsR\u0007options\"\u0089\u0002\n\u0015MethodDescriptorProto\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012\u001d\n\ninput_type\u0018\u0002 \u0001(\tR\tinputType\u0012\u001f\n\u000boutput_type\u0018\u0003 \u0001(\tR\noutputType\u00128\n\u0007options\u0018\u0004 \u0001(\u000b2\u001e.google.protobuf.MethodOptionsR\u0007options\u00120\n\u0010client_streaming\u0018\u0005 \u0001(\b:\u0005falseR\u000fclientStreaming\u00120\n\u0010server_streaming\u0018\u0006 \u0001(\b:\u0005falseR\u000fserverStreaming\"Ê\t\n\u000bFileOptions\u0012!\n\fjava_package\u0018\u0001 \u0001(\tR\u000bjavaPackage\u00120\n\u0014java_outer_classname\u0018\b \u0001(\tR\u0012javaOuterClassname\u00125\n\u0013java_multiple_files\u0018\n \u0001(\b:\u0005falseR\u0011javaMultipleFiles\u0012D\n\u001djava_generate_equals_and_hash\u0018\u0014 \u0001(\bB\u0002\u0018\u0001R\u0019javaGenerateEqualsAndHash\u0012:\n\u0016java_string_check_utf8\u0018\u001b \u0001(\b:\u0005falseR\u0013javaStringCheckUtf8\u0012S\n\foptimize_for\u0018\t \u0001(\u000e2).google.protobuf.FileOptions.OptimizeMode:\u0005SPEEDR\u000boptimizeFor\u0012\u001d\n\ngo_package\u0018\u000b \u0001(\tR\tgoPackage\u00125\n\u0013cc_generic_services\u0018\u0010 \u0001(\b:\u0005falseR\u0011ccGenericServices\u00129\n\u0015java_generic_services\u0018\u0011 \u0001(\b:\u0005falseR\u0013javaGenericServices\u00125\n\u0013py_generic_services\u0018\u0012 \u0001(\b:\u0005falseR\u0011pyGenericServices\u00127\n\u0014php_generic_services\u0018* \u0001(\b:\u0005falseR\u0012phpGenericServices\u0012%\n\ndeprecated\u0018\u0017 \u0001(\b:\u0005falseR\ndeprecated\u0012.\n\u0010cc_enable_arenas\u0018\u001f \u0001(\b:\u0004trueR\u000eccEnableArenas\u0012*\n\u0011objc_class_prefix\u0018$ \u0001(\tR\u000fobjcClassPrefix\u0012)\n\u0010csharp_namespace\u0018% \u0001(\tR\u000fcsharpNamespace\u0012!\n\fswift_prefix\u0018' \u0001(\tR\u000bswiftPrefix\u0012(\n\u0010php_class_prefix\u0018( \u0001(\tR\u000ephpClassPrefix\u0012#\n\rphp_namespace\u0018) \u0001(\tR\fphpNamespace\u00124\n\u0016php_metadata_namespace\u0018, \u0001(\tR\u0014phpMetadataNamespace\u0012!\n\fruby_package\u0018- \u0001(\tR\u000brubyPackage\u00127\n\bfeatures\u00182 \u0001(\u000b2\u001b.google.protobuf.FeatureSetR\bfeatures\u0012X\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOptionR\u0013uninterpretedOption\":\n\fOptimizeMode\u0012\t\n\u0005SPEED\u0010\u0001\u0012\r\n\tCODE_SIZE\u0010\u0002\u0012\u0010\n\fLITE_RUNTIME\u0010\u0003*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b&\u0010'\"ô\u0003\n\u000eMessageOptions\u0012<\n\u0017message_set_wire_format\u0018\u0001 \u0001(\b:\u0005falseR\u0014messageSetWireFormat\u0012L\n\u001fno_standard_descriptor_accessor\u0018\u0002 \u0001(\b:\u0005falseR\u001cnoStandardDescriptorAccessor\u0012%\n\ndeprecated\u0018\u0003 \u0001(\b:\u0005falseR\ndeprecated\u0012\u001b\n\tmap_entry\u0018\u0007 \u0001(\bR\bmapEntry\u0012V\n&deprecated_legacy_json_field_conflicts\u0018\u000b \u0001(\bB\u0002\u0018\u0001R\"deprecatedLegacyJsonFieldConflicts\u00127\n\bfeatures\u0018\f \u0001(\u000b2\u001b.google.protobuf.FeatureSetR\bfeatures\u0012X\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOptionR\u0013uninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b\u0004\u0010\u0005J\u0004\b\u0005\u0010\u0006J\u0004\b\u0006\u0010\u0007J\u0004\b\b\u0010\tJ\u0004\b\t\u0010\n\"\u00ad\n\n\fFieldOptions\u0012A\n\u0005ctype\u0018\u0001 \u0001(\u000e2#.google.protobuf.FieldOptions.CType:\u0006STRINGR\u0005ctype\u0012\u0016\n\u0006packed\u0018\u0002 \u0001(\bR\u0006packed\u0012G\n\u0006jstype\u0018\u0006 \u0001(\u000e2$.google.protobuf.FieldOptions.JSType:\tJS_NORMALR\u0006jstype\u0012\u0019\n\u0004lazy\u0018\u0005 \u0001(\b:\u0005falseR\u0004lazy\u0012.\n\u000funverified_lazy\u0018\u000f \u0001(\b:\u0005falseR\u000eunverifiedLazy\u0012%\n\ndeprecated\u0018\u0003 \u0001(\b:\u0005falseR\ndeprecated\u0012\u0019\n\u0004weak\u0018\n \u0001(\b:\u0005falseR\u0004weak\u0012(\n\fdebug_redact\u0018\u0010 \u0001(\b:\u0005falseR\u000bdebugRedact\u0012K\n\tretention\u0018\u0011 \u0001(\u000e2-.google.protobuf.FieldOptions.OptionRetentionR\tretention\u0012H\n\u0007targets\u0018\u0013 \u0003(\u000e2..google.protobuf.FieldOptions.OptionTargetTypeR\u0007targets\u0012W\n\u0010edition_defaults\u0018\u0014 \u0003(\u000b2,.google.protobuf.FieldOptions.EditionDefaultR\u000feditionDefaults\u00127\n\bfeatures\u0018\u0015 \u0001(\u000b2\u001b.google.protobuf.FeatureSetR\bfeatures\u0012X\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOptionR\u0013uninterpretedOption\u001aZ\n\u000eEditionDefault\u00122\n\u0007edition\u0018\u0003 \u0001(\u000e2\u0018.google.protobuf.EditionR\u0007edition\u0012\u0014\n\u0005value\u0018\u0002 \u0001(\tR\u0005value\"/\n\u0005CType\u0012\n\n\u0006STRING\u0010\u0000\u0012\b\n\u0004CORD\u0010\u0001\u0012\u0010\n\fSTRING_PIECE\u0010\u0002\"5\n\u0006JSType\u0012\r\n\tJS_NORMAL\u0010\u0000\u0012\r\n\tJS_STRING\u0010\u0001\u0012\r\n\tJS_NUMBER\u0010\u0002\"U\n\u000fOptionRetention\u0012\u0015\n\u0011RETENTION_UNKNOWN\u0010\u0000\u0012\u0015\n\u0011RETENTION_RUNTIME\u0010\u0001\u0012\u0014\n\u0010RETENTION_SOURCE\u0010\u0002\"\u008c\u0002\n\u0010OptionTargetType\u0012\u0017\n\u0013TARGET_TYPE_UNKNOWN\u0010\u0000\u0012\u0014\n\u0010TARGET_TYPE_FILE\u0010\u0001\u0012\u001f\n\u001bTARGET_TYPE_EXTENSION_RANGE\u0010\u0002\u0012\u0017\n\u0013TARGET_TYPE_MESSAGE\u0010\u0003\u0012\u0015\n\u0011TARGET_TYPE_FIELD\u0010\u0004\u0012\u0015\n\u0011TARGET_TYPE_ONEOF\u0010\u0005\u0012\u0014\n\u0010TARGET_TYPE_ENUM\u0010\u0006\u0012\u001a\n\u0016TARGET_TYPE_ENUM_ENTRY\u0010\u0007\u0012\u0017\n\u0013TARGET_TYPE_SERVICE\u0010\b\u0012\u0016\n\u0012TARGET_TYPE_METHOD\u0010\t*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b\u0004\u0010\u0005J\u0004\b\u0012\u0010\u0013\"¬\u0001\n\fOneofOptions\u00127\n\bfeatures\u0018\u0001 \u0001(\u000b2\u001b.google.protobuf.FeatureSetR\bfeatures\u0012X\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOptionR\u0013uninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"Ñ\u0002\n\u000bEnumOptions\u0012\u001f\n\u000ballow_alias\u0018\u0002 \u0001(\bR\nallowAlias\u0012%\n\ndeprecated\u0018\u0003 \u0001(\b:\u0005falseR\ndeprecated\u0012V\n&deprecated_legacy_json_field_conflicts\u0018\u0006 \u0001(\bB\u0002\u0018\u0001R\"deprecatedLegacyJsonFieldConflicts\u00127\n\bfeatures\u0018\u0007 \u0001(\u000b2\u001b.google.protobuf.FeatureSetR\bfeatures\u0012X\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOptionR\u0013uninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b\u0005\u0010\u0006\"\u0081\u0002\n\u0010EnumValueOptions\u0012%\n\ndeprecated\u0018\u0001 \u0001(\b:\u0005falseR\ndeprecated\u00127\n\bfeatures\u0018\u0002 \u0001(\u000b2\u001b.google.protobuf.FeatureSetR\bfeatures\u0012(\n\fdebug_redact\u0018\u0003 \u0001(\b:\u0005falseR\u000bdebugRedact\u0012X\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOptionR\u0013uninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"Õ\u0001\n\u000eServiceOptions\u00127\n\bfeatures\u0018\" \u0001(\u000b2\u001b.google.protobuf.FeatureSetR\bfeatures\u0012%\n\ndeprecated\u0018! \u0001(\b:\u0005falseR\ndeprecated\u0012X\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOptionR\u0013uninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"\u0099\u0003\n\rMethodOptions\u0012%\n\ndeprecated\u0018! \u0001(\b:\u0005falseR\ndeprecated\u0012q\n\u0011idempotency_level\u0018\" \u0001(\u000e2/.google.protobuf.MethodOptions.IdempotencyLevel:\u0013IDEMPOTENCY_UNKNOWNR\u0010idempotencyLevel\u00127\n\bfeatures\u0018# \u0001(\u000b2\u001b.google.protobuf.FeatureSetR\bfeatures\u0012X\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOptionR\u0013uninterpretedOption\"P\n\u0010IdempotencyLevel\u0012\u0017\n\u0013IDEMPOTENCY_UNKNOWN\u0010\u0000\u0012\u0013\n\u000fNO_SIDE_EFFECTS\u0010\u0001\u0012\u000e\n\nIDEMPOTENT\u0010\u0002*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"\u009a\u0003\n\u0013UninterpretedOption\u0012A\n\u0004name\u0018\u0002 \u0003(\u000b2-.google.protobuf.UninterpretedOption.NamePartR\u0004name\u0012)\n\u0010identifier_value\u0018\u0003 \u0001(\tR\u000fidentifierValue\u0012,\n\u0012positive_int_value\u0018\u0004 \u0001(\u0004R\u0010positiveIntValue\u0012,\n\u0012negative_int_value\u0018\u0005 \u0001(\u0003R\u0010negativeIntValue\u0012!\n\fdouble_value\u0018\u0006 \u0001(\u0001R\u000bdoubleValue\u0012!\n\fstring_value\u0018\u0007 \u0001(\fR\u000bstringValue\u0012'\n\u000faggregate_value\u0018\b \u0001(\tR\u000eaggregateValue\u001aJ\n\bNamePart\u0012\u001b\n\tname_part\u0018\u0001 \u0002(\tR\bnamePart\u0012!\n\fis_extension\u0018\u0002 \u0002(\bR\u000bisExtension\"ü\t\n\nFeatureSet\u0012\u008b\u0001\n\u000efield_presence\u0018\u0001 \u0001(\u000e2).google.protobuf.FeatureSet.FieldPresenceB9\u0088\u0001\u0001\u0098\u0001\u0004\u0098\u0001\u0001¢\u0001\r\u0012\bEXPLICIT\u0018æ\u0007¢\u0001\r\u0012\bIMPLICIT\u0018ç\u0007¢\u0001\r\u0012\bEXPLICIT\u0018è\u0007R\rfieldPresence\u0012f\n\tenum_type\u0018\u0002 \u0001(\u000e2$.google.protobuf.FeatureSet.EnumTypeB#\u0088\u0001\u0001\u0098\u0001\u0006\u0098\u0001\u0001¢\u0001\u000b\u0012\u0006CLOSED\u0018æ\u0007¢\u0001\t\u0012\u0004OPEN\u0018ç\u0007R\benumType\u0012\u0092\u0001\n\u0017repeated_field_encoding\u0018\u0003 \u0001(\u000e21.google.protobuf.FeatureSet.RepeatedFieldEncodingB'\u0088\u0001\u0001\u0098\u0001\u0004\u0098\u0001\u0001¢\u0001\r\u0012\bEXPANDED\u0018æ\u0007¢\u0001\u000b\u0012\u0006PACKED\u0018ç\u0007R\u0015repeatedFieldEncoding\u0012x\n\u000futf8_validation\u0018\u0004 \u0001(\u000e2*.google.protobuf.FeatureSet.Utf8ValidationB#\u0088\u0001\u0001\u0098\u0001\u0004\u0098\u0001\u0001¢\u0001\t\u0012\u0004NONE\u0018æ\u0007¢\u0001\u000b\u0012\u0006VERIFY\u0018ç\u0007R\u000eutf8Validation\u0012x\n\u0010message_encoding\u0018\u0005 \u0001(\u000e2+.google.protobuf.FeatureSet.MessageEncodingB \u0088\u0001\u0001\u0098\u0001\u0004\u0098\u0001\u0001¢\u0001\u0014\u0012\u000fLENGTH_PREFIXED\u0018æ\u0007R\u000fmessageEncoding\u0012|\n\u000bjson_format\u0018\u0006 \u0001(\u000e2&.google.protobuf.FeatureSet.JsonFormatB3\u0088\u0001\u0001\u0098\u0001\u0003\u0098\u0001\u0006\u0098\u0001\u0001¢\u0001\u0017\u0012\u0012LEGACY_BEST_EFFORT\u0018æ\u0007¢\u0001\n\u0012\u0005ALLOW\u0018ç\u0007R\njsonFormat\"\\\n\rFieldPresence\u0012\u001a\n\u0016FIELD_PRESENCE_UNKNOWN\u0010\u0000\u0012\f\n\bEXPLICIT\u0010\u0001\u0012\f\n\bIMPLICIT\u0010\u0002\u0012\u0013\n\u000fLEGACY_REQUIRED\u0010\u0003\"7\n\bEnumType\u0012\u0015\n\u0011ENUM_TYPE_UNKNOWN\u0010\u0000\u0012\b\n\u0004OPEN\u0010\u0001\u0012\n\n\u0006CLOSED\u0010\u0002\"V\n\u0015RepeatedFieldEncoding\u0012#\n\u001fREPEATED_FIELD_ENCODING_UNKNOWN\u0010\u0000\u0012\n\n\u0006PACKED\u0010\u0001\u0012\f\n\bEXPANDED\u0010\u0002\"C\n\u000eUtf8Validation\u0012\u001b\n\u0017UTF8_VALIDATION_UNKNOWN\u0010\u0000\u0012\b\n\u0004NONE\u0010\u0001\u0012\n\n\u0006VERIFY\u0010\u0002\"S\n\u000fMessageEncoding\u0012\u001c\n\u0018MESSAGE_ENCODING_UNKNOWN\u0010\u0000\u0012\u0013\n\u000fLENGTH_PREFIXED\u0010\u0001\u0012\r\n\tDELIMITED\u0010\u0002\"H\n\nJsonFormat\u0012\u0017\n\u0013JSON_FORMAT_UNKNOWN\u0010\u0000\u0012\t\n\u0005ALLOW\u0010\u0001\u0012\u0016\n\u0012LEGACY_BEST_EFFORT\u0010\u0002*\u0006\bè\u0007\u0010é\u0007*\u0006\bé\u0007\u0010ê\u0007*\u0006\b\u008bN\u0010\u0090NJ\u0006\bç\u0007\u0010è\u0007\"þ\u0002\n\u0012FeatureSetDefaults\u0012X\n\bdefaults\u0018\u0001 \u0003(\u000b2<.google.protobuf.FeatureSetDefaults.FeatureSetEditionDefaultR\bdefaults\u0012A\n\u000fminimum_edition\u0018\u0004 \u0001(\u000e2\u0018.google.protobuf.EditionR\u000eminimumEdition\u0012A\n\u000fmaximum_edition\u0018\u0005 \u0001(\u000e2\u0018.google.protobuf.EditionR\u000emaximumEdition\u001a\u0087\u0001\n\u0018FeatureSetEditionDefault\u00122\n\u0007edition\u0018\u0003 \u0001(\u000e2\u0018.google.protobuf.EditionR\u0007edition\u00127\n\bfeatures\u0018\u0002 \u0001(\u000b2\u001b.google.protobuf.FeatureSetR\bfeatures\"§\u0002\n\u000eSourceCodeInfo\u0012D\n\blocation\u0018\u0001 \u0003(\u000b2(.google.protobuf.SourceCodeInfo.LocationR\blocation\u001aÎ\u0001\n\bLocation\u0012\u0016\n\u0004path\u0018\u0001 \u0003(\u0005B\u0002\u0010\u0001R\u0004path\u0012\u0016\n\u0004span\u0018\u0002 \u0003(\u0005B\u0002\u0010\u0001R\u0004span\u0012)\n\u0010leading_comments\u0018\u0003 \u0001(\tR\u000fleadingComments\u0012+\n\u0011trailing_comments\u0018\u0004 \u0001(\tR\u0010trailingComments\u0012:\n\u0019leading_detached_comments\u0018\u0006 \u0003(\tR\u0017leadingDetachedComments\"Ð\u0002\n\u0011GeneratedCodeInfo\u0012M\n\nannotation\u0018\u0001 \u0003(\u000b2-.google.protobuf.GeneratedCodeInfo.AnnotationR\nannotation\u001aë\u0001\n\nAnnotation\u0012\u0016\n\u0004path\u0018\u0001 \u0003(\u0005B\u0002\u0010\u0001R\u0004path\u0012\u001f\n\u000bsource_file\u0018\u0002 \u0001(\tR\nsourceFile\u0012\u0014\n\u0005begin\u0018\u0003 \u0001(\u0005R\u0005begin\u0012\u0010\n\u0003end\u0018\u0004 \u0001(\u0005R\u0003end\u0012R\n\bsemantic\u0018\u0005 \u0001(\u000e26.google.protobuf.GeneratedCodeInfo.Annotation.SemanticR\bsemantic\"(\n\bSemantic\u0012\b\n\u0004NONE\u0010\u0000\u0012\u0007\n\u0003SET\u0010\u0001\u0012\t\n\u0005ALIAS\u0010\u0002*ê\u0001\n\u0007Edition\u0012\u0013\n\u000fEDITION_UNKNOWN\u0010\u0000\u0012\u0013\n\u000eEDITION_PROTO2\u0010æ\u0007\u0012\u0013\n\u000eEDITION_PROTO3\u0010ç\u0007\u0012\u0011\n\fEDITION_2023\u0010è\u0007\u0012\u0017\n\u0013EDITION_1_TEST_ONLY\u0010\u0001\u0012\u0017\n\u0013EDITION_2_TEST_ONLY\u0010\u0002\u0012\u001d\n\u0017EDITION_99997_TEST_ONLY\u0010\u009d\u008d\u0006\u0012\u001d\n\u0017EDITION_99998_TEST_ONLY\u0010\u009e\u008d\u0006\u0012\u001d\n\u0017EDITION_99999_TEST_ONLY\u0010\u009f\u008d\u0006B~\n\u0013com.google.protobufB\u0010DescriptorProtosH\u0001Z-google.golang.org/protobuf/types/descriptorpbø\u0001\u0001¢\u0002\u0003GPBª\u0002\u001aGoogle.Protobuf.Reflection"}, new r.h[0]);

    /* JADX INFO: renamed from: n */
    private static final k0.f f9310n;

    /* JADX INFO: renamed from: o */
    private static final r.b f9311o;

    /* JADX INFO: renamed from: p */
    private static final k0.f f9312p;

    /* JADX INFO: renamed from: q */
    private static final r.b f9313q;

    /* JADX INFO: renamed from: r */
    private static final k0.f f9314r;

    /* JADX INFO: renamed from: s */
    private static final r.b f9315s;

    /* JADX INFO: renamed from: t */
    private static final k0.f f9316t;

    /* JADX INFO: renamed from: u */
    private static final r.b f9317u;

    /* JADX INFO: renamed from: v */
    private static final k0.f f9318v;

    /* JADX INFO: renamed from: w */
    private static final r.b f9319w;

    /* JADX INFO: renamed from: x */
    private static final k0.f f9320x;

    /* JADX INFO: renamed from: y */
    private static final r.b f9321y;

    /* JADX INFO: renamed from: z */
    private static final k0.f f9322z;

    public static final class b extends k0 implements o1 {

        /* JADX INFO: renamed from: v */
        private static final b f9323v = new b();

        /* JADX INFO: renamed from: w */
        public static final z1 f9324w = new a();

        /* JADX INFO: renamed from: a */
        private int f9325a;

        /* JADX INFO: renamed from: b */
        private volatile Object f9326b;

        /* JADX INFO: renamed from: c */
        private List f9327c;

        /* JADX INFO: renamed from: d */
        private List f9328d;

        /* JADX INFO: renamed from: e */
        private List f9329e;

        /* JADX INFO: renamed from: f */
        private List f9330f;

        /* JADX INFO: renamed from: g */
        private List f9331g;

        /* JADX INFO: renamed from: h */
        private List f9332h;

        /* JADX INFO: renamed from: r */
        private n f9333r;

        /* JADX INFO: renamed from: s */
        private List f9334s;

        /* JADX INFO: renamed from: t */
        private u0 f9335t;

        /* JADX INFO: renamed from: u */
        private byte f9336u;

        class a extends com.google.protobuf.c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c */
            public b parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                C0137b c0137bT0 = b.t0();
                try {
                    c0137bT0.mergeFrom(mVar, yVar);
                    return c0137bT0.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(c0137bT0.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(c0137bT0.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(c0137bT0.buildPartial());
                }
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                return super.parseDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                return super.parseFrom(lVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                return super.mo1183parsePartialDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                return super.mo1185parsePartialFrom(lVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                return super.parseDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                return super.parseFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                return super.mo1186parsePartialFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                return super.parseFrom(mVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                return super.mo1187parsePartialFrom(mVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                return super.parseFrom(mVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                return super.parseFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                return super.mo1188parsePartialFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                return super.parseFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                return super.mo1189parsePartialFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                return super.parseFrom(byteBuffer);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                return super.mo1190parsePartialFrom(bArr);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                return super.parseFrom(byteBuffer, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                return super.mo1191parsePartialFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                return super.mo1181parseFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                return super.mo1193parsePartialFrom(bArr, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1182parseFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                return super.parseFrom(bArr, yVar);
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.q$b$b */
        public static final class C0137b extends k0.b implements o1 {
            private g2 A;
            private u0 B;

            /* JADX INFO: renamed from: a */
            private int f9337a;

            /* JADX INFO: renamed from: b */
            private Object f9338b;

            /* JADX INFO: renamed from: c */
            private List f9339c;

            /* JADX INFO: renamed from: d */
            private g2 f9340d;

            /* JADX INFO: renamed from: e */
            private List f9341e;

            /* JADX INFO: renamed from: f */
            private g2 f9342f;

            /* JADX INFO: renamed from: g */
            private List f9343g;

            /* JADX INFO: renamed from: h */
            private g2 f9344h;

            /* JADX INFO: renamed from: r */
            private List f9345r;

            /* JADX INFO: renamed from: s */
            private g2 f9346s;

            /* JADX INFO: renamed from: t */
            private List f9347t;

            /* JADX INFO: renamed from: u */
            private g2 f9348u;

            /* JADX INFO: renamed from: v */
            private List f9349v;

            /* JADX INFO: renamed from: w */
            private g2 f9350w;

            /* JADX INFO: renamed from: x */
            private n f9351x;

            /* JADX INFO: renamed from: y */
            private k2 f9352y;

            /* JADX INFO: renamed from: z */
            private List f9353z;

            /* synthetic */ C0137b(a aVar) {
                this();
            }

            private g2 C() {
                if (this.f9346s == null) {
                    this.f9346s = new g2(this.f9345r, (this.f9337a & 16) != 0, getParentForChildren(), isClean());
                    this.f9345r = null;
                }
                return this.f9346s;
            }

            private g2 F() {
                if (this.f9342f == null) {
                    this.f9342f = new g2(this.f9341e, (this.f9337a & 4) != 0, getParentForChildren(), isClean());
                    this.f9341e = null;
                }
                return this.f9342f;
            }

            private g2 I() {
                if (this.f9348u == null) {
                    this.f9348u = new g2(this.f9347t, (this.f9337a & 32) != 0, getParentForChildren(), isClean());
                    this.f9347t = null;
                }
                return this.f9348u;
            }

            private g2 L() {
                if (this.f9340d == null) {
                    this.f9340d = new g2(this.f9339c, (this.f9337a & 2) != 0, getParentForChildren(), isClean());
                    this.f9339c = null;
                }
                return this.f9340d;
            }

            private g2 O() {
                if (this.f9344h == null) {
                    this.f9344h = new g2(this.f9343g, (this.f9337a & 8) != 0, getParentForChildren(), isClean());
                    this.f9343g = null;
                }
                return this.f9344h;
            }

            private g2 R() {
                if (this.f9350w == null) {
                    this.f9350w = new g2(this.f9349v, (this.f9337a & 64) != 0, getParentForChildren(), isClean());
                    this.f9349v = null;
                }
                return this.f9350w;
            }

            private k2 V() {
                if (this.f9352y == null) {
                    this.f9352y = new k2(T(), getParentForChildren(), isClean());
                    this.f9351x = null;
                }
                return this.f9352y;
            }

            private g2 W() {
                if (this.A == null) {
                    this.A = new g2(this.f9353z, (this.f9337a & 256) != 0, getParentForChildren(), isClean());
                    this.f9353z = null;
                }
                return this.A;
            }

            private void Y() {
                if (k0.alwaysUseFieldBuilders) {
                    L();
                    F();
                    O();
                    C();
                    I();
                    R();
                    V();
                    W();
                }
            }

            private void k(b bVar) {
                int i10;
                int i11 = this.f9337a;
                if ((i11 & 1) != 0) {
                    bVar.f9326b = this.f9338b;
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 128) != 0) {
                    k2 k2Var = this.f9352y;
                    bVar.f9333r = k2Var == null ? this.f9351x : (n) k2Var.b();
                    i10 |= 2;
                }
                if ((i11 & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0) {
                    this.B.r();
                    bVar.f9335t = this.B;
                }
                b.O(bVar, i10);
            }

            private void m(b bVar) {
                g2 g2Var = this.f9340d;
                if (g2Var == null) {
                    if ((this.f9337a & 2) != 0) {
                        this.f9339c = DesugarCollections.unmodifiableList(this.f9339c);
                        this.f9337a &= -3;
                    }
                    bVar.f9327c = this.f9339c;
                } else {
                    bVar.f9327c = g2Var.g();
                }
                g2 g2Var2 = this.f9342f;
                if (g2Var2 == null) {
                    if ((this.f9337a & 4) != 0) {
                        this.f9341e = DesugarCollections.unmodifiableList(this.f9341e);
                        this.f9337a &= -5;
                    }
                    bVar.f9328d = this.f9341e;
                } else {
                    bVar.f9328d = g2Var2.g();
                }
                g2 g2Var3 = this.f9344h;
                if (g2Var3 == null) {
                    if ((this.f9337a & 8) != 0) {
                        this.f9343g = DesugarCollections.unmodifiableList(this.f9343g);
                        this.f9337a &= -9;
                    }
                    bVar.f9329e = this.f9343g;
                } else {
                    bVar.f9329e = g2Var3.g();
                }
                g2 g2Var4 = this.f9346s;
                if (g2Var4 == null) {
                    if ((this.f9337a & 16) != 0) {
                        this.f9345r = DesugarCollections.unmodifiableList(this.f9345r);
                        this.f9337a &= -17;
                    }
                    bVar.f9330f = this.f9345r;
                } else {
                    bVar.f9330f = g2Var4.g();
                }
                g2 g2Var5 = this.f9348u;
                if (g2Var5 == null) {
                    if ((this.f9337a & 32) != 0) {
                        this.f9347t = DesugarCollections.unmodifiableList(this.f9347t);
                        this.f9337a &= -33;
                    }
                    bVar.f9331g = this.f9347t;
                } else {
                    bVar.f9331g = g2Var5.g();
                }
                g2 g2Var6 = this.f9350w;
                if (g2Var6 == null) {
                    if ((this.f9337a & 64) != 0) {
                        this.f9349v = DesugarCollections.unmodifiableList(this.f9349v);
                        this.f9337a &= -65;
                    }
                    bVar.f9332h = this.f9349v;
                } else {
                    bVar.f9332h = g2Var6.g();
                }
                g2 g2Var7 = this.A;
                if (g2Var7 != null) {
                    bVar.f9334s = g2Var7.g();
                    return;
                }
                if ((this.f9337a & 256) != 0) {
                    this.f9353z = DesugarCollections.unmodifiableList(this.f9353z);
                    this.f9337a &= -257;
                }
                bVar.f9334s = this.f9353z;
            }

            private void p() {
                if ((this.f9337a & 16) == 0) {
                    this.f9345r = new ArrayList(this.f9345r);
                    this.f9337a |= 16;
                }
            }

            private void r() {
                if ((this.f9337a & 4) == 0) {
                    this.f9341e = new ArrayList(this.f9341e);
                    this.f9337a |= 4;
                }
            }

            private void t() {
                if ((this.f9337a & 32) == 0) {
                    this.f9347t = new ArrayList(this.f9347t);
                    this.f9337a |= 32;
                }
            }

            private void u() {
                if ((this.f9337a & 2) == 0) {
                    this.f9339c = new ArrayList(this.f9339c);
                    this.f9337a |= 2;
                }
            }

            private void v() {
                if ((this.f9337a & 8) == 0) {
                    this.f9343g = new ArrayList(this.f9343g);
                    this.f9337a |= 8;
                }
            }

            private void w() {
                if ((this.f9337a & 64) == 0) {
                    this.f9349v = new ArrayList(this.f9349v);
                    this.f9337a |= 64;
                }
            }

            private void x() {
                if (!this.B.p0()) {
                    this.B = new u0(this.B);
                }
                this.f9337a |= WXMediaMessage.TITLE_LENGTH_LIMIT;
            }

            private void y() {
                if ((this.f9337a & 256) == 0) {
                    this.f9353z = new ArrayList(this.f9353z);
                    this.f9337a |= 256;
                }
            }

            public d A(int i10) {
                g2 g2Var = this.f9346s;
                return g2Var == null ? (d) this.f9345r.get(i10) : (d) g2Var.o(i10);
            }

            public int B() {
                g2 g2Var = this.f9346s;
                return g2Var == null ? this.f9345r.size() : g2Var.n();
            }

            public j D(int i10) {
                g2 g2Var = this.f9342f;
                return g2Var == null ? (j) this.f9341e.get(i10) : (j) g2Var.o(i10);
            }

            public int E() {
                g2 g2Var = this.f9342f;
                return g2Var == null ? this.f9341e.size() : g2Var.n();
            }

            public c G(int i10) {
                g2 g2Var = this.f9348u;
                return g2Var == null ? (c) this.f9347t.get(i10) : (c) g2Var.o(i10);
            }

            public int H() {
                g2 g2Var = this.f9348u;
                return g2Var == null ? this.f9347t.size() : g2Var.n();
            }

            public j J(int i10) {
                g2 g2Var = this.f9340d;
                return g2Var == null ? (j) this.f9339c.get(i10) : (j) g2Var.o(i10);
            }

            public int K() {
                g2 g2Var = this.f9340d;
                return g2Var == null ? this.f9339c.size() : g2Var.n();
            }

            public b M(int i10) {
                g2 g2Var = this.f9344h;
                return g2Var == null ? (b) this.f9343g.get(i10) : (b) g2Var.o(i10);
            }

            public int N() {
                g2 g2Var = this.f9344h;
                return g2Var == null ? this.f9343g.size() : g2Var.n();
            }

            public C0140q P(int i10) {
                g2 g2Var = this.f9350w;
                return g2Var == null ? (C0140q) this.f9349v.get(i10) : (C0140q) g2Var.o(i10);
            }

            public int Q() {
                g2 g2Var = this.f9350w;
                return g2Var == null ? this.f9349v.size() : g2Var.n();
            }

            public n T() {
                k2 k2Var = this.f9352y;
                if (k2Var != null) {
                    return (n) k2Var.f();
                }
                n nVar = this.f9351x;
                return nVar == null ? n.H() : nVar;
            }

            public n.b U() {
                this.f9337a |= 128;
                onChanged();
                return (n.b) V().e();
            }

            public boolean X() {
                return (this.f9337a & 128) != 0;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: Z */
            public C0137b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            switch (iK) {
                                case 0:
                                    z10 = true;
                                    break;
                                case 10:
                                    this.f9338b = mVar.r();
                                    this.f9337a |= 1;
                                    break;
                                case 18:
                                    j jVar = (j) mVar.A(j.f9557x, yVar);
                                    g2 g2Var = this.f9340d;
                                    if (g2Var == null) {
                                        u();
                                        this.f9339c.add(jVar);
                                    } else {
                                        g2Var.f(jVar);
                                    }
                                    break;
                                case 26:
                                    b bVar = (b) mVar.A(b.f9324w, yVar);
                                    g2 g2Var2 = this.f9344h;
                                    if (g2Var2 == null) {
                                        v();
                                        this.f9343g.add(bVar);
                                    } else {
                                        g2Var2.f(bVar);
                                    }
                                    break;
                                case 34:
                                    d dVar = (d) mVar.A(d.f9389r, yVar);
                                    g2 g2Var3 = this.f9346s;
                                    if (g2Var3 == null) {
                                        p();
                                        this.f9345r.add(dVar);
                                    } else {
                                        g2Var3.f(dVar);
                                    }
                                    break;
                                case 42:
                                    c cVar = (c) mVar.A(c.f9355g, yVar);
                                    g2 g2Var4 = this.f9348u;
                                    if (g2Var4 == null) {
                                        t();
                                        this.f9347t.add(cVar);
                                    } else {
                                        g2Var4.f(cVar);
                                    }
                                    break;
                                case 50:
                                    j jVar2 = (j) mVar.A(j.f9557x, yVar);
                                    g2 g2Var5 = this.f9342f;
                                    if (g2Var5 == null) {
                                        r();
                                        this.f9341e.add(jVar2);
                                    } else {
                                        g2Var5.f(jVar2);
                                    }
                                    break;
                                case 58:
                                    mVar.B(V().e(), yVar);
                                    this.f9337a |= 128;
                                    break;
                                case 66:
                                    C0140q c0140q = (C0140q) mVar.A(C0140q.f9819f, yVar);
                                    g2 g2Var6 = this.f9350w;
                                    if (g2Var6 == null) {
                                        w();
                                        this.f9349v.add(c0140q);
                                    } else {
                                        g2Var6.f(c0140q);
                                    }
                                    break;
                                case 74:
                                    d dVar2 = (d) mVar.A(d.f9367f, yVar);
                                    g2 g2Var7 = this.A;
                                    if (g2Var7 == null) {
                                        y();
                                        this.f9353z.add(dVar2);
                                    } else {
                                        g2Var7.f(dVar2);
                                    }
                                    break;
                                case 82:
                                    com.google.protobuf.l lVarR = mVar.r();
                                    x();
                                    this.B.w(lVarR);
                                    break;
                                default:
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                        z10 = true;
                                    }
                                    break;
                            }
                        } catch (p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }

            public C0137b a0(b bVar) {
                if (bVar == b.Q()) {
                    return this;
                }
                if (bVar.r0()) {
                    this.f9338b = bVar.f9326b;
                    this.f9337a |= 1;
                    onChanged();
                }
                if (this.f9340d == null) {
                    if (!bVar.f9327c.isEmpty()) {
                        if (this.f9339c.isEmpty()) {
                            this.f9339c = bVar.f9327c;
                            this.f9337a &= -3;
                        } else {
                            u();
                            this.f9339c.addAll(bVar.f9327c);
                        }
                        onChanged();
                    }
                } else if (!bVar.f9327c.isEmpty()) {
                    if (this.f9340d.u()) {
                        this.f9340d.i();
                        this.f9340d = null;
                        this.f9339c = bVar.f9327c;
                        this.f9337a &= -3;
                        this.f9340d = k0.alwaysUseFieldBuilders ? L() : null;
                    } else {
                        this.f9340d.b(bVar.f9327c);
                    }
                }
                if (this.f9342f == null) {
                    if (!bVar.f9328d.isEmpty()) {
                        if (this.f9341e.isEmpty()) {
                            this.f9341e = bVar.f9328d;
                            this.f9337a &= -5;
                        } else {
                            r();
                            this.f9341e.addAll(bVar.f9328d);
                        }
                        onChanged();
                    }
                } else if (!bVar.f9328d.isEmpty()) {
                    if (this.f9342f.u()) {
                        this.f9342f.i();
                        this.f9342f = null;
                        this.f9341e = bVar.f9328d;
                        this.f9337a &= -5;
                        this.f9342f = k0.alwaysUseFieldBuilders ? F() : null;
                    } else {
                        this.f9342f.b(bVar.f9328d);
                    }
                }
                if (this.f9344h == null) {
                    if (!bVar.f9329e.isEmpty()) {
                        if (this.f9343g.isEmpty()) {
                            this.f9343g = bVar.f9329e;
                            this.f9337a &= -9;
                        } else {
                            v();
                            this.f9343g.addAll(bVar.f9329e);
                        }
                        onChanged();
                    }
                } else if (!bVar.f9329e.isEmpty()) {
                    if (this.f9344h.u()) {
                        this.f9344h.i();
                        this.f9344h = null;
                        this.f9343g = bVar.f9329e;
                        this.f9337a &= -9;
                        this.f9344h = k0.alwaysUseFieldBuilders ? O() : null;
                    } else {
                        this.f9344h.b(bVar.f9329e);
                    }
                }
                if (this.f9346s == null) {
                    if (!bVar.f9330f.isEmpty()) {
                        if (this.f9345r.isEmpty()) {
                            this.f9345r = bVar.f9330f;
                            this.f9337a &= -17;
                        } else {
                            p();
                            this.f9345r.addAll(bVar.f9330f);
                        }
                        onChanged();
                    }
                } else if (!bVar.f9330f.isEmpty()) {
                    if (this.f9346s.u()) {
                        this.f9346s.i();
                        this.f9346s = null;
                        this.f9345r = bVar.f9330f;
                        this.f9337a &= -17;
                        this.f9346s = k0.alwaysUseFieldBuilders ? C() : null;
                    } else {
                        this.f9346s.b(bVar.f9330f);
                    }
                }
                if (this.f9348u == null) {
                    if (!bVar.f9331g.isEmpty()) {
                        if (this.f9347t.isEmpty()) {
                            this.f9347t = bVar.f9331g;
                            this.f9337a &= -33;
                        } else {
                            t();
                            this.f9347t.addAll(bVar.f9331g);
                        }
                        onChanged();
                    }
                } else if (!bVar.f9331g.isEmpty()) {
                    if (this.f9348u.u()) {
                        this.f9348u.i();
                        this.f9348u = null;
                        this.f9347t = bVar.f9331g;
                        this.f9337a &= -33;
                        this.f9348u = k0.alwaysUseFieldBuilders ? I() : null;
                    } else {
                        this.f9348u.b(bVar.f9331g);
                    }
                }
                if (this.f9350w == null) {
                    if (!bVar.f9332h.isEmpty()) {
                        if (this.f9349v.isEmpty()) {
                            this.f9349v = bVar.f9332h;
                            this.f9337a &= -65;
                        } else {
                            w();
                            this.f9349v.addAll(bVar.f9332h);
                        }
                        onChanged();
                    }
                } else if (!bVar.f9332h.isEmpty()) {
                    if (this.f9350w.u()) {
                        this.f9350w.i();
                        this.f9350w = null;
                        this.f9349v = bVar.f9332h;
                        this.f9337a &= -65;
                        this.f9350w = k0.alwaysUseFieldBuilders ? R() : null;
                    } else {
                        this.f9350w.b(bVar.f9332h);
                    }
                }
                if (bVar.s0()) {
                    c0(bVar.m0());
                }
                if (this.A == null) {
                    if (!bVar.f9334s.isEmpty()) {
                        if (this.f9353z.isEmpty()) {
                            this.f9353z = bVar.f9334s;
                            this.f9337a &= -257;
                        } else {
                            y();
                            this.f9353z.addAll(bVar.f9334s);
                        }
                        onChanged();
                    }
                } else if (!bVar.f9334s.isEmpty()) {
                    if (this.A.u()) {
                        this.A.i();
                        this.A = null;
                        this.f9353z = bVar.f9334s;
                        this.f9337a &= -257;
                        this.A = k0.alwaysUseFieldBuilders ? W() : null;
                    } else {
                        this.A.b(bVar.f9334s);
                    }
                }
                if (!bVar.f9335t.isEmpty()) {
                    if (this.B.isEmpty()) {
                        this.B = bVar.f9335t;
                        this.f9337a |= WXMediaMessage.TITLE_LENGTH_LIMIT;
                    } else {
                        x();
                        this.B.addAll(bVar.f9335t);
                    }
                    onChanged();
                }
                m141mergeUnknownFields(bVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: b0 */
            public C0137b mergeFrom(i1 i1Var) {
                if (i1Var instanceof b) {
                    return a0((b) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public C0137b c0(n nVar) {
                n nVar2;
                k2 k2Var = this.f9352y;
                if (k2Var != null) {
                    k2Var.h(nVar);
                } else if ((this.f9337a & 128) == 0 || (nVar2 = this.f9351x) == null || nVar2 == n.H()) {
                    this.f9351x = nVar;
                } else {
                    U().L(nVar);
                }
                if (this.f9351x != null) {
                    this.f9337a |= 128;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
            public final C0137b m1148mergeUnknownFields(t2 t2Var) {
                return (C0137b) super.m1148mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: e0 */
            public C0137b setField(r.g gVar, Object obj) {
                return (C0137b) super.setField(gVar, obj);
            }

            public C0137b f0(String str) {
                str.getClass();
                this.f9338b = str;
                this.f9337a |= 1;
                onChanged();
                return this;
            }

            public C0137b g(c cVar) {
                g2 g2Var = this.f9348u;
                if (g2Var != null) {
                    g2Var.f(cVar);
                    return this;
                }
                cVar.getClass();
                t();
                this.f9347t.add(cVar);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: g0 */
            public final C0137b setUnknownFields(t2 t2Var) {
                return (C0137b) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return q.f9292e;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: h */
            public C0137b addRepeatedField(r.g gVar, Object obj) {
                return (C0137b) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: i */
            public b build() {
                b bVarBuildPartial = buildPartial();
                if (bVarBuildPartial.isInitialized()) {
                    return bVarBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) bVarBuildPartial);
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return q.f9294f.d(b.class, C0137b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < K(); i10++) {
                    if (!J(i10).isInitialized()) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < E(); i11++) {
                    if (!D(i11).isInitialized()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < N(); i12++) {
                    if (!M(i12).isInitialized()) {
                        return false;
                    }
                }
                for (int i13 = 0; i13 < B(); i13++) {
                    if (!A(i13).isInitialized()) {
                        return false;
                    }
                }
                for (int i14 = 0; i14 < H(); i14++) {
                    if (!G(i14).isInitialized()) {
                        return false;
                    }
                }
                for (int i15 = 0; i15 < Q(); i15++) {
                    if (!P(i15).isInitialized()) {
                        return false;
                    }
                }
                return !X() || T().isInitialized();
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: j */
            public b buildPartial() {
                b bVar = new b(this);
                m(bVar);
                if (this.f9337a != 0) {
                    k(bVar);
                }
                onBuilt();
                return bVar;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public C0137b m1140clearField(r.g gVar) {
                return (C0137b) super.m1140clearField(gVar);
            }

            /* JADX INFO: renamed from: o */
            public C0137b clone() {
                return (C0137b) super.m1147clone();
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: z */
            public b getDefaultInstanceForType() {
                return b.Q();
            }

            /* synthetic */ C0137b(k0.c cVar, a aVar) {
                this(cVar);
            }

            private C0137b() {
                this.f9338b = "";
                List list = Collections.EMPTY_LIST;
                this.f9339c = list;
                this.f9341e = list;
                this.f9343g = list;
                this.f9345r = list;
                this.f9347t = list;
                this.f9349v = list;
                this.f9353z = list;
                this.B = u0.e();
                Y();
            }

            private C0137b(k0.c cVar) {
                super(cVar);
                this.f9338b = "";
                List list = Collections.EMPTY_LIST;
                this.f9339c = list;
                this.f9341e = list;
                this.f9343g = list;
                this.f9345r = list;
                this.f9347t = list;
                this.f9349v = list;
                this.f9353z = list;
                this.B = u0.e();
                Y();
            }
        }

        public static final class c extends k0 implements o1 {

            /* JADX INFO: renamed from: f */
            private static final c f9354f = new c();

            /* JADX INFO: renamed from: g */
            public static final z1 f9355g = new a();

            /* JADX INFO: renamed from: a */
            private int f9356a;

            /* JADX INFO: renamed from: b */
            private int f9357b;

            /* JADX INFO: renamed from: c */
            private int f9358c;

            /* JADX INFO: renamed from: d */
            private h f9359d;

            /* JADX INFO: renamed from: e */
            private byte f9360e;

            class a extends com.google.protobuf.c {
                a() {
                }

                @Override // com.google.protobuf.z1
                /* JADX INFO: renamed from: c */
                public c parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                    C0138b c0138bC = c.C();
                    try {
                        c0138bC.mergeFrom(mVar, yVar);
                        return c0138bC.buildPartial();
                    } catch (p0 e10) {
                        throw e10.j(c0138bC.buildPartial());
                    } catch (r2 e11) {
                        throw e11.a().j(c0138bC.buildPartial());
                    } catch (IOException e12) {
                        throw new p0(e12).j(c0138bC.buildPartial());
                    }
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                    return super.parseDelimitedFrom(inputStream);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                    return super.parseFrom(lVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialDelimitedFrom */
                public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                    return super.mo1183parsePartialDelimitedFrom(inputStream);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                    return super.mo1185parsePartialFrom(lVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                    return super.parseDelimitedFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                    return super.parseFrom(lVar, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialDelimitedFrom */
                public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                    return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                    return super.mo1186parsePartialFrom(lVar, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                    return super.parseFrom(mVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                    return super.mo1187parsePartialFrom(mVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                    return super.parseFrom(mVar, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                    return super.parseFrom(inputStream);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                    return super.mo1188parsePartialFrom(inputStream);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                    return super.parseFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                    return super.mo1189parsePartialFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                    return super.parseFrom(byteBuffer);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                    return super.mo1190parsePartialFrom(bArr);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                    return super.parseFrom(byteBuffer, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                    return super.mo1191parsePartialFrom(bArr, i10, i11);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                    return super.parseFrom(bArr);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                    return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parseFrom */
                public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                    return super.mo1181parseFrom(bArr, i10, i11);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                    return super.mo1193parsePartialFrom(bArr, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parseFrom */
                public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                    return super.mo1182parseFrom(bArr, i10, i11, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                    return super.parseFrom(bArr, yVar);
                }
            }

            /* JADX INFO: renamed from: com.google.protobuf.q$b$c$b */
            public static final class C0138b extends k0.b implements o1 {

                /* JADX INFO: renamed from: a */
                private int f9361a;

                /* JADX INFO: renamed from: b */
                private int f9362b;

                /* JADX INFO: renamed from: c */
                private int f9363c;

                /* JADX INFO: renamed from: d */
                private h f9364d;

                /* JADX INFO: renamed from: e */
                private k2 f9365e;

                /* synthetic */ C0138b(a aVar) {
                    this();
                }

                private void j(c cVar) {
                    int i10;
                    int i11 = this.f9361a;
                    if ((i11 & 1) != 0) {
                        cVar.f9357b = this.f9362b;
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if ((i11 & 2) != 0) {
                        cVar.f9358c = this.f9363c;
                        i10 |= 2;
                    }
                    if ((i11 & 4) != 0) {
                        k2 k2Var = this.f9365e;
                        cVar.f9359d = k2Var == null ? this.f9364d : (h) k2Var.b();
                        i10 |= 4;
                    }
                    c.q(cVar, i10);
                }

                private k2 r() {
                    if (this.f9365e == null) {
                        this.f9365e = new k2(o(), getParentForChildren(), isClean());
                        this.f9364d = null;
                    }
                    return this.f9365e;
                }

                private void u() {
                    if (k0.alwaysUseFieldBuilders) {
                        r();
                    }
                }

                public C0138b A(int i10) {
                    this.f9363c = i10;
                    this.f9361a |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: B */
                public C0138b setField(r.g gVar, Object obj) {
                    return (C0138b) super.setField(gVar, obj);
                }

                public C0138b C(int i10) {
                    this.f9362b = i10;
                    this.f9361a |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: D */
                public final C0138b setUnknownFields(t2 t2Var) {
                    return (C0138b) super.setUnknownFields(t2Var);
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: g */
                public C0138b addRepeatedField(r.g gVar, Object obj) {
                    return (C0138b) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                public r.b getDescriptorForType() {
                    return q.f9296g;
                }

                @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
                /* JADX INFO: renamed from: h */
                public c build() {
                    c cVarBuildPartial = buildPartial();
                    if (cVarBuildPartial.isInitialized()) {
                        return cVarBuildPartial;
                    }
                    throw a.AbstractC0131a.newUninitializedMessageException((i1) cVarBuildPartial);
                }

                @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
                /* JADX INFO: renamed from: i */
                public c buildPartial() {
                    c cVar = new c(this);
                    if (this.f9361a != 0) {
                        j(cVar);
                    }
                    onBuilt();
                    return cVar;
                }

                @Override // com.google.protobuf.k0.b
                protected k0.f internalGetFieldAccessorTable() {
                    return q.f9298h.d(c.class, C0138b.class);
                }

                @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                public final boolean isInitialized() {
                    return !t() || o().isInitialized();
                }

                @Override // com.google.protobuf.k0.b
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public C0138b m1140clearField(r.g gVar) {
                    return (C0138b) super.m1140clearField(gVar);
                }

                /* JADX INFO: renamed from: m */
                public C0138b clone() {
                    return (C0138b) super.m1147clone();
                }

                @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                /* JADX INFO: renamed from: n */
                public c getDefaultInstanceForType() {
                    return c.r();
                }

                public h o() {
                    k2 k2Var = this.f9365e;
                    if (k2Var != null) {
                        return (h) k2Var.f();
                    }
                    h hVar = this.f9364d;
                    return hVar == null ? h.H() : hVar;
                }

                public h.b p() {
                    this.f9361a |= 4;
                    onChanged();
                    return (h.b) r().e();
                }

                public boolean t() {
                    return (this.f9361a & 4) != 0;
                }

                @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
                /* JADX INFO: renamed from: v */
                public C0138b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                    yVar.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int iK = mVar.K();
                                if (iK != 0) {
                                    if (iK == 8) {
                                        this.f9362b = mVar.y();
                                        this.f9361a |= 1;
                                    } else if (iK == 16) {
                                        this.f9363c = mVar.y();
                                        this.f9361a |= 2;
                                    } else if (iK == 26) {
                                        mVar.B(r().e(), yVar);
                                        this.f9361a |= 4;
                                    } else if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                }
                                z10 = true;
                            } catch (p0 e10) {
                                throw e10.n();
                            }
                        } catch (Throwable th2) {
                            onChanged();
                            throw th2;
                        }
                    }
                    onChanged();
                    return this;
                }

                public C0138b w(c cVar) {
                    if (cVar == c.r()) {
                        return this;
                    }
                    if (cVar.A()) {
                        C(cVar.w());
                    }
                    if (cVar.x()) {
                        A(cVar.t());
                    }
                    if (cVar.z()) {
                        y(cVar.v());
                    }
                    m141mergeUnknownFields(cVar.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: x */
                public C0138b mergeFrom(i1 i1Var) {
                    if (i1Var instanceof c) {
                        return w((c) i1Var);
                    }
                    super.mergeFrom(i1Var);
                    return this;
                }

                public C0138b y(h hVar) {
                    h hVar2;
                    k2 k2Var = this.f9365e;
                    if (k2Var != null) {
                        k2Var.h(hVar);
                    } else if ((this.f9361a & 4) == 0 || (hVar2 = this.f9364d) == null || hVar2 == h.H()) {
                        this.f9364d = hVar;
                    } else {
                        p().N(hVar);
                    }
                    if (this.f9364d != null) {
                        this.f9361a |= 4;
                        onChanged();
                    }
                    return this;
                }

                @Override // com.google.protobuf.a.AbstractC0131a
                /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
                public final C0138b m1148mergeUnknownFields(t2 t2Var) {
                    return (C0138b) super.m1148mergeUnknownFields(t2Var);
                }

                /* synthetic */ C0138b(k0.c cVar, a aVar) {
                    this(cVar);
                }

                private C0138b() {
                    u();
                }

                private C0138b(k0.c cVar) {
                    super(cVar);
                    u();
                }
            }

            /* synthetic */ c(k0.b bVar, a aVar) {
                this(bVar);
            }

            public static C0138b C() {
                return f9354f.toBuilder();
            }

            public static final r.b getDescriptor() {
                return q.f9296g;
            }

            static /* synthetic */ int q(c cVar, int i10) {
                int i11 = i10 | cVar.f9356a;
                cVar.f9356a = i11;
                return i11;
            }

            public static c r() {
                return f9354f;
            }

            public boolean A() {
                return (this.f9356a & 1) != 0;
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            /* JADX INFO: renamed from: D */
            public C0138b newBuilderForType() {
                return C();
            }

            @Override // com.google.protobuf.k0
            /* JADX INFO: renamed from: G */
            public C0138b newBuilderForType(k0.c cVar) {
                return new C0138b(cVar);
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            /* JADX INFO: renamed from: H */
            public C0138b toBuilder() {
                return this == f9354f ? new C0138b() : new C0138b().w(this);
            }

            @Override // com.google.protobuf.a
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return super.equals(obj);
                }
                c cVar = (c) obj;
                if (A() != cVar.A()) {
                    return false;
                }
                if ((A() && w() != cVar.w()) || x() != cVar.x()) {
                    return false;
                }
                if ((!x() || t() == cVar.t()) && z() == cVar.z()) {
                    return (!z() || v().equals(cVar.v())) && getUnknownFields().equals(cVar.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            public z1 getParserForType() {
                return f9355g;
            }

            @Override // com.google.protobuf.l1
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iX = (this.f9356a & 1) != 0 ? com.google.protobuf.o.x(1, this.f9357b) : 0;
                if ((this.f9356a & 2) != 0) {
                    iX += com.google.protobuf.o.x(2, this.f9358c);
                }
                if ((this.f9356a & 4) != 0) {
                    iX += com.google.protobuf.o.G(3, v());
                }
                int serializedSize = iX + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.a
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (A()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + w();
                }
                if (x()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + t();
                }
                if (z()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + v().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.k0
            protected k0.f internalGetFieldAccessorTable() {
                return q.f9298h.d(c.class, C0138b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9360e;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (!z() || v().isInitialized()) {
                    this.f9360e = (byte) 1;
                    return true;
                }
                this.f9360e = (byte) 0;
                return false;
            }

            @Override // com.google.protobuf.k0
            protected Object newInstance(k0.g gVar) {
                return new c();
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: s */
            public c getDefaultInstanceForType() {
                return f9354f;
            }

            public int t() {
                return this.f9358c;
            }

            public h v() {
                h hVar = this.f9359d;
                return hVar == null ? h.H() : hVar;
            }

            public int w() {
                return this.f9357b;
            }

            @Override // com.google.protobuf.l1
            public void writeTo(com.google.protobuf.o oVar) {
                if ((this.f9356a & 1) != 0) {
                    oVar.D0(1, this.f9357b);
                }
                if ((this.f9356a & 2) != 0) {
                    oVar.D0(2, this.f9358c);
                }
                if ((this.f9356a & 4) != 0) {
                    oVar.H0(3, v());
                }
                getUnknownFields().writeTo(oVar);
            }

            public boolean x() {
                return (this.f9356a & 2) != 0;
            }

            public boolean z() {
                return (this.f9356a & 4) != 0;
            }

            private c(k0.b bVar) {
                super(bVar);
                this.f9357b = 0;
                this.f9358c = 0;
                this.f9360e = (byte) -1;
            }

            private c() {
                this.f9357b = 0;
                this.f9358c = 0;
                this.f9360e = (byte) -1;
            }
        }

        public static final class d extends k0 implements o1 {

            /* JADX INFO: renamed from: e */
            private static final d f9366e = new d();

            /* JADX INFO: renamed from: f */
            public static final z1 f9367f = new a();

            /* JADX INFO: renamed from: a */
            private int f9368a;

            /* JADX INFO: renamed from: b */
            private int f9369b;

            /* JADX INFO: renamed from: c */
            private int f9370c;

            /* JADX INFO: renamed from: d */
            private byte f9371d;

            class a extends com.google.protobuf.c {
                a() {
                }

                @Override // com.google.protobuf.z1
                /* JADX INFO: renamed from: c */
                public d parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                    C0139b c0139bX = d.x();
                    try {
                        c0139bX.mergeFrom(mVar, yVar);
                        return c0139bX.buildPartial();
                    } catch (p0 e10) {
                        throw e10.j(c0139bX.buildPartial());
                    } catch (r2 e11) {
                        throw e11.a().j(c0139bX.buildPartial());
                    } catch (IOException e12) {
                        throw new p0(e12).j(c0139bX.buildPartial());
                    }
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                    return super.parseDelimitedFrom(inputStream);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                    return super.parseFrom(lVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialDelimitedFrom */
                public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                    return super.mo1183parsePartialDelimitedFrom(inputStream);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                    return super.mo1185parsePartialFrom(lVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                    return super.parseDelimitedFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                    return super.parseFrom(lVar, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialDelimitedFrom */
                public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                    return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                    return super.mo1186parsePartialFrom(lVar, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                    return super.parseFrom(mVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                    return super.mo1187parsePartialFrom(mVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                    return super.parseFrom(mVar, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                    return super.parseFrom(inputStream);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                    return super.mo1188parsePartialFrom(inputStream);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                    return super.parseFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                    return super.mo1189parsePartialFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                    return super.parseFrom(byteBuffer);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                    return super.mo1190parsePartialFrom(bArr);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                    return super.parseFrom(byteBuffer, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                    return super.mo1191parsePartialFrom(bArr, i10, i11);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                    return super.parseFrom(bArr);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                    return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parseFrom */
                public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                    return super.mo1181parseFrom(bArr, i10, i11);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                    return super.mo1193parsePartialFrom(bArr, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parseFrom */
                public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                    return super.mo1182parseFrom(bArr, i10, i11, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                    return super.parseFrom(bArr, yVar);
                }
            }

            /* JADX INFO: renamed from: com.google.protobuf.q$b$d$b */
            public static final class C0139b extends k0.b implements o1 {

                /* JADX INFO: renamed from: a */
                private int f9372a;

                /* JADX INFO: renamed from: b */
                private int f9373b;

                /* JADX INFO: renamed from: c */
                private int f9374c;

                /* synthetic */ C0139b(a aVar) {
                    this();
                }

                private void j(d dVar) {
                    int i10;
                    int i11 = this.f9372a;
                    if ((i11 & 1) != 0) {
                        dVar.f9369b = this.f9373b;
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if ((i11 & 2) != 0) {
                        dVar.f9370c = this.f9374c;
                        i10 |= 2;
                    }
                    d.p(dVar, i10);
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: g */
                public C0139b addRepeatedField(r.g gVar, Object obj) {
                    return (C0139b) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                public r.b getDescriptorForType() {
                    return q.f9300i;
                }

                @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
                /* JADX INFO: renamed from: h */
                public d build() {
                    d dVarBuildPartial = buildPartial();
                    if (dVarBuildPartial.isInitialized()) {
                        return dVarBuildPartial;
                    }
                    throw a.AbstractC0131a.newUninitializedMessageException((i1) dVarBuildPartial);
                }

                @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
                /* JADX INFO: renamed from: i */
                public d buildPartial() {
                    d dVar = new d(this);
                    if (this.f9372a != 0) {
                        j(dVar);
                    }
                    onBuilt();
                    return dVar;
                }

                @Override // com.google.protobuf.k0.b
                protected k0.f internalGetFieldAccessorTable() {
                    return q.f9302j.d(d.class, C0139b.class);
                }

                @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.k0.b
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public C0139b m1140clearField(r.g gVar) {
                    return (C0139b) super.m1140clearField(gVar);
                }

                /* JADX INFO: renamed from: m */
                public C0139b clone() {
                    return (C0139b) super.m1147clone();
                }

                @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                /* JADX INFO: renamed from: n */
                public d getDefaultInstanceForType() {
                    return d.q();
                }

                @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
                /* JADX INFO: renamed from: o */
                public C0139b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                    yVar.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int iK = mVar.K();
                                if (iK != 0) {
                                    if (iK == 8) {
                                        this.f9373b = mVar.y();
                                        this.f9372a |= 1;
                                    } else if (iK == 16) {
                                        this.f9374c = mVar.y();
                                        this.f9372a |= 2;
                                    } else if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                }
                                z10 = true;
                            } catch (p0 e10) {
                                throw e10.n();
                            }
                        } catch (Throwable th2) {
                            onChanged();
                            throw th2;
                        }
                    }
                    onChanged();
                    return this;
                }

                public C0139b p(d dVar) {
                    if (dVar == d.q()) {
                        return this;
                    }
                    if (dVar.w()) {
                        w(dVar.t());
                    }
                    if (dVar.v()) {
                        u(dVar.s());
                    }
                    m141mergeUnknownFields(dVar.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: r */
                public C0139b mergeFrom(i1 i1Var) {
                    if (i1Var instanceof d) {
                        return p((d) i1Var);
                    }
                    super.mergeFrom(i1Var);
                    return this;
                }

                @Override // com.google.protobuf.a.AbstractC0131a
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public final C0139b m1148mergeUnknownFields(t2 t2Var) {
                    return (C0139b) super.m1148mergeUnknownFields(t2Var);
                }

                public C0139b u(int i10) {
                    this.f9374c = i10;
                    this.f9372a |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: v */
                public C0139b setField(r.g gVar, Object obj) {
                    return (C0139b) super.setField(gVar, obj);
                }

                public C0139b w(int i10) {
                    this.f9373b = i10;
                    this.f9372a |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: x */
                public final C0139b setUnknownFields(t2 t2Var) {
                    return (C0139b) super.setUnknownFields(t2Var);
                }

                /* synthetic */ C0139b(k0.c cVar, a aVar) {
                    this(cVar);
                }

                private C0139b() {
                }

                private C0139b(k0.c cVar) {
                    super(cVar);
                }
            }

            /* synthetic */ d(k0.b bVar, a aVar) {
                this(bVar);
            }

            public static final r.b getDescriptor() {
                return q.f9300i;
            }

            static /* synthetic */ int p(d dVar, int i10) {
                int i11 = i10 | dVar.f9368a;
                dVar.f9368a = i11;
                return i11;
            }

            public static d q() {
                return f9366e;
            }

            public static C0139b x() {
                return f9366e.toBuilder();
            }

            @Override // com.google.protobuf.k0
            /* JADX INFO: renamed from: A */
            public C0139b newBuilderForType(k0.c cVar) {
                return new C0139b(cVar);
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            /* JADX INFO: renamed from: C */
            public C0139b toBuilder() {
                return this == f9366e ? new C0139b() : new C0139b().p(this);
            }

            @Override // com.google.protobuf.a
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return super.equals(obj);
                }
                d dVar = (d) obj;
                if (w() != dVar.w()) {
                    return false;
                }
                if ((!w() || t() == dVar.t()) && v() == dVar.v()) {
                    return (!v() || s() == dVar.s()) && getUnknownFields().equals(dVar.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            public z1 getParserForType() {
                return f9367f;
            }

            @Override // com.google.protobuf.l1
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iX = (this.f9368a & 1) != 0 ? com.google.protobuf.o.x(1, this.f9369b) : 0;
                if ((this.f9368a & 2) != 0) {
                    iX += com.google.protobuf.o.x(2, this.f9370c);
                }
                int serializedSize = iX + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.a
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (w()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + t();
                }
                if (v()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + s();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.k0
            protected k0.f internalGetFieldAccessorTable() {
                return q.f9302j.d(d.class, C0139b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9371d;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9371d = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.k0
            protected Object newInstance(k0.g gVar) {
                return new d();
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: r */
            public d getDefaultInstanceForType() {
                return f9366e;
            }

            public int s() {
                return this.f9370c;
            }

            public int t() {
                return this.f9369b;
            }

            public boolean v() {
                return (this.f9368a & 2) != 0;
            }

            public boolean w() {
                return (this.f9368a & 1) != 0;
            }

            @Override // com.google.protobuf.l1
            public void writeTo(com.google.protobuf.o oVar) {
                if ((this.f9368a & 1) != 0) {
                    oVar.D0(1, this.f9369b);
                }
                if ((this.f9368a & 2) != 0) {
                    oVar.D0(2, this.f9370c);
                }
                getUnknownFields().writeTo(oVar);
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            /* JADX INFO: renamed from: z */
            public C0139b newBuilderForType() {
                return x();
            }

            private d(k0.b bVar) {
                super(bVar);
                this.f9369b = 0;
                this.f9370c = 0;
                this.f9371d = (byte) -1;
            }

            private d() {
                this.f9369b = 0;
                this.f9370c = 0;
                this.f9371d = (byte) -1;
            }
        }

        /* synthetic */ b(k0.b bVar, a aVar) {
            this(bVar);
        }

        static /* synthetic */ int O(b bVar, int i10) {
            int i11 = i10 | bVar.f9325a;
            bVar.f9325a = i11;
            return i11;
        }

        public static b Q() {
            return f9323v;
        }

        public static final r.b getDescriptor() {
            return q.f9292e;
        }

        public static C0137b t0() {
            return f9323v.toBuilder();
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: R */
        public b getDefaultInstanceForType() {
            return f9323v;
        }

        public d S(int i10) {
            return (d) this.f9330f.get(i10);
        }

        public int T() {
            return this.f9330f.size();
        }

        public List W() {
            return this.f9330f;
        }

        public j X(int i10) {
            return (j) this.f9328d.get(i10);
        }

        public int Y() {
            return this.f9328d.size();
        }

        public List Z() {
            return this.f9328d;
        }

        public c a0(int i10) {
            return (c) this.f9331g.get(i10);
        }

        public int b0() {
            return this.f9331g.size();
        }

        public List c0() {
            return this.f9331g;
        }

        public j d0(int i10) {
            return (j) this.f9327c.get(i10);
        }

        public int e0() {
            return this.f9327c.size();
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return super.equals(obj);
            }
            b bVar = (b) obj;
            if (r0() != bVar.r0()) {
                return false;
            }
            if ((!r0() || getName().equals(bVar.getName())) && f0().equals(bVar.f0()) && Z().equals(bVar.Z()) && i0().equals(bVar.i0()) && W().equals(bVar.W()) && c0().equals(bVar.c0()) && l0().equals(bVar.l0()) && s0() == bVar.s0()) {
                return (!s0() || m0().equals(bVar.m0())) && q0().equals(bVar.q0()) && o0().equals(bVar.o0()) && getUnknownFields().equals(bVar.getUnknownFields());
            }
            return false;
        }

        public List f0() {
            return this.f9327c;
        }

        public b g0(int i10) {
            return (b) this.f9329e.get(i10);
        }

        public String getName() {
            Object obj = this.f9326b;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f9326b = strN;
            }
            return strN;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return f9324w;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = (this.f9325a & 1) != 0 ? k0.computeStringSize(1, this.f9326b) : 0;
            for (int i11 = 0; i11 < this.f9327c.size(); i11++) {
                iComputeStringSize += com.google.protobuf.o.G(2, (l1) this.f9327c.get(i11));
            }
            for (int i12 = 0; i12 < this.f9329e.size(); i12++) {
                iComputeStringSize += com.google.protobuf.o.G(3, (l1) this.f9329e.get(i12));
            }
            for (int i13 = 0; i13 < this.f9330f.size(); i13++) {
                iComputeStringSize += com.google.protobuf.o.G(4, (l1) this.f9330f.get(i13));
            }
            for (int i14 = 0; i14 < this.f9331g.size(); i14++) {
                iComputeStringSize += com.google.protobuf.o.G(5, (l1) this.f9331g.get(i14));
            }
            for (int i15 = 0; i15 < this.f9328d.size(); i15++) {
                iComputeStringSize += com.google.protobuf.o.G(6, (l1) this.f9328d.get(i15));
            }
            if ((this.f9325a & 2) != 0) {
                iComputeStringSize += com.google.protobuf.o.G(7, m0());
            }
            for (int i16 = 0; i16 < this.f9332h.size(); i16++) {
                iComputeStringSize += com.google.protobuf.o.G(8, (l1) this.f9332h.get(i16));
            }
            for (int i17 = 0; i17 < this.f9334s.size(); i17++) {
                iComputeStringSize += com.google.protobuf.o.G(9, (l1) this.f9334s.get(i17));
            }
            int iComputeStringSizeNoTag = 0;
            for (int i18 = 0; i18 < this.f9335t.size(); i18++) {
                iComputeStringSizeNoTag += k0.computeStringSizeNoTag(this.f9335t.h0(i18));
            }
            int size = iComputeStringSize + iComputeStringSizeNoTag + o0().size() + getUnknownFields().getSerializedSize();
            this.memoizedSize = size;
            return size;
        }

        public int h0() {
            return this.f9329e.size();
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (r0()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (e0() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + f0().hashCode();
            }
            if (Y() > 0) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + Z().hashCode();
            }
            if (h0() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + i0().hashCode();
            }
            if (T() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + W().hashCode();
            }
            if (b0() > 0) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + c0().hashCode();
            }
            if (k0() > 0) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + l0().hashCode();
            }
            if (s0()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + m0().hashCode();
            }
            if (p0() > 0) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + q0().hashCode();
            }
            if (n0() > 0) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + o0().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        public List i0() {
            return this.f9329e;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return q.f9294f.d(b.class, C0137b.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9336u;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < e0(); i10++) {
                if (!d0(i10).isInitialized()) {
                    this.f9336u = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < Y(); i11++) {
                if (!X(i11).isInitialized()) {
                    this.f9336u = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < h0(); i12++) {
                if (!g0(i12).isInitialized()) {
                    this.f9336u = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < T(); i13++) {
                if (!S(i13).isInitialized()) {
                    this.f9336u = (byte) 0;
                    return false;
                }
            }
            for (int i14 = 0; i14 < b0(); i14++) {
                if (!a0(i14).isInitialized()) {
                    this.f9336u = (byte) 0;
                    return false;
                }
            }
            for (int i15 = 0; i15 < k0(); i15++) {
                if (!j0(i15).isInitialized()) {
                    this.f9336u = (byte) 0;
                    return false;
                }
            }
            if (!s0() || m0().isInitialized()) {
                this.f9336u = (byte) 1;
                return true;
            }
            this.f9336u = (byte) 0;
            return false;
        }

        public C0140q j0(int i10) {
            return (C0140q) this.f9332h.get(i10);
        }

        public int k0() {
            return this.f9332h.size();
        }

        public List l0() {
            return this.f9332h;
        }

        public n m0() {
            n nVar = this.f9333r;
            return nVar == null ? n.H() : nVar;
        }

        public int n0() {
            return this.f9335t.size();
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new b();
        }

        public e2 o0() {
            return this.f9335t;
        }

        public int p0() {
            return this.f9334s.size();
        }

        public List q0() {
            return this.f9334s;
        }

        public boolean r0() {
            return (this.f9325a & 1) != 0;
        }

        public boolean s0() {
            return (this.f9325a & 2) != 0;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: u0 */
        public C0137b newBuilderForType() {
            return t0();
        }

        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: v0 */
        public C0137b newBuilderForType(k0.c cVar) {
            return new C0137b(cVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: w0 */
        public C0137b toBuilder() {
            return this == f9323v ? new C0137b() : new C0137b().a0(this);
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if ((this.f9325a & 1) != 0) {
                k0.writeString(oVar, 1, this.f9326b);
            }
            for (int i10 = 0; i10 < this.f9327c.size(); i10++) {
                oVar.H0(2, (l1) this.f9327c.get(i10));
            }
            for (int i11 = 0; i11 < this.f9329e.size(); i11++) {
                oVar.H0(3, (l1) this.f9329e.get(i11));
            }
            for (int i12 = 0; i12 < this.f9330f.size(); i12++) {
                oVar.H0(4, (l1) this.f9330f.get(i12));
            }
            for (int i13 = 0; i13 < this.f9331g.size(); i13++) {
                oVar.H0(5, (l1) this.f9331g.get(i13));
            }
            for (int i14 = 0; i14 < this.f9328d.size(); i14++) {
                oVar.H0(6, (l1) this.f9328d.get(i14));
            }
            if ((this.f9325a & 2) != 0) {
                oVar.H0(7, m0());
            }
            for (int i15 = 0; i15 < this.f9332h.size(); i15++) {
                oVar.H0(8, (l1) this.f9332h.get(i15));
            }
            for (int i16 = 0; i16 < this.f9334s.size(); i16++) {
                oVar.H0(9, (l1) this.f9334s.get(i16));
            }
            for (int i17 = 0; i17 < this.f9335t.size(); i17++) {
                k0.writeString(oVar, 10, this.f9335t.h0(i17));
            }
            getUnknownFields().writeTo(oVar);
        }

        private b(k0.b bVar) {
            super(bVar);
            this.f9326b = "";
            this.f9335t = u0.e();
            this.f9336u = (byte) -1;
        }

        private b() {
            this.f9326b = "";
            this.f9335t = u0.e();
            this.f9336u = (byte) -1;
            this.f9326b = "";
            List list = Collections.EMPTY_LIST;
            this.f9327c = list;
            this.f9328d = list;
            this.f9329e = list;
            this.f9330f = list;
            this.f9331g = list;
            this.f9332h = list;
            this.f9334s = list;
            this.f9335t = u0.e();
        }
    }

    public enum c implements o0.c {
        EDITION_UNKNOWN(0),
        EDITION_PROTO2(998),
        EDITION_PROTO3(999),
        EDITION_2023(CloseCodes.NORMAL_CLOSURE),
        EDITION_1_TEST_ONLY(1),
        EDITION_2_TEST_ONLY(2),
        EDITION_99997_TEST_ONLY(99997),
        EDITION_99998_TEST_ONLY(99998),
        EDITION_99999_TEST_ONLY(99999);


        /* JADX INFO: renamed from: t */
        private static final o0.d f9384t = new a();

        /* JADX INFO: renamed from: u */
        private static final c[] f9385u = values();

        /* JADX INFO: renamed from: a */
        private final int f9387a;

        class a implements o0.d {
            a() {
            }
        }

        c(int i10) {
            this.f9387a = i10;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return EDITION_UNKNOWN;
            }
            if (i10 == 1) {
                return EDITION_1_TEST_ONLY;
            }
            if (i10 == 2) {
                return EDITION_2_TEST_ONLY;
            }
            switch (i10) {
                case 998:
                    return EDITION_PROTO2;
                case 999:
                    return EDITION_PROTO3;
                case CloseCodes.NORMAL_CLOSURE /* 1000 */:
                    return EDITION_2023;
                default:
                    switch (i10) {
                        case 99997:
                            return EDITION_99997_TEST_ONLY;
                        case 99998:
                            return EDITION_99998_TEST_ONLY;
                        case 99999:
                            return EDITION_99999_TEST_ONLY;
                        default:
                            return null;
                    }
            }
        }

        @Override // com.google.protobuf.o0.c
        public final int getNumber() {
            return this.f9387a;
        }
    }

    public static final class d extends k0 implements o1 {

        /* JADX INFO: renamed from: h */
        private static final d f9388h = new d();

        /* JADX INFO: renamed from: r */
        public static final z1 f9389r = new a();

        /* JADX INFO: renamed from: a */
        private int f9390a;

        /* JADX INFO: renamed from: b */
        private volatile Object f9391b;

        /* JADX INFO: renamed from: c */
        private List f9392c;

        /* JADX INFO: renamed from: d */
        private e f9393d;

        /* JADX INFO: renamed from: e */
        private List f9394e;

        /* JADX INFO: renamed from: f */
        private u0 f9395f;

        /* JADX INFO: renamed from: g */
        private byte f9396g;

        class a extends com.google.protobuf.c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c */
            public d parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                b bVarS = d.S();
                try {
                    bVarS.mergeFrom(mVar, yVar);
                    return bVarS.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(bVarS.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(bVarS.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(bVarS.buildPartial());
                }
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                return super.parseDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                return super.parseFrom(lVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                return super.mo1183parsePartialDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                return super.mo1185parsePartialFrom(lVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                return super.parseDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                return super.parseFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                return super.mo1186parsePartialFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                return super.parseFrom(mVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                return super.mo1187parsePartialFrom(mVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                return super.parseFrom(mVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                return super.parseFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                return super.mo1188parsePartialFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                return super.parseFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                return super.mo1189parsePartialFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                return super.parseFrom(byteBuffer);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                return super.mo1190parsePartialFrom(bArr);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                return super.parseFrom(byteBuffer, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                return super.mo1191parsePartialFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                return super.mo1181parseFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                return super.mo1193parsePartialFrom(bArr, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1182parseFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                return super.parseFrom(bArr, yVar);
            }
        }

        public static final class b extends k0.b implements o1 {

            /* JADX INFO: renamed from: a */
            private int f9397a;

            /* JADX INFO: renamed from: b */
            private Object f9398b;

            /* JADX INFO: renamed from: c */
            private List f9399c;

            /* JADX INFO: renamed from: d */
            private g2 f9400d;

            /* JADX INFO: renamed from: e */
            private e f9401e;

            /* JADX INFO: renamed from: f */
            private k2 f9402f;

            /* JADX INFO: renamed from: g */
            private List f9403g;

            /* JADX INFO: renamed from: h */
            private g2 f9404h;

            /* JADX INFO: renamed from: r */
            private u0 f9405r;

            /* synthetic */ b(a aVar) {
                this();
            }

            private g2 A() {
                if (this.f9400d == null) {
                    this.f9400d = new g2(this.f9399c, (this.f9397a & 2) != 0, getParentForChildren(), isClean());
                    this.f9399c = null;
                }
                return this.f9400d;
            }

            private void C() {
                if (k0.alwaysUseFieldBuilders) {
                    A();
                    w();
                    x();
                }
            }

            private void j(d dVar) {
                int i10;
                int i11 = this.f9397a;
                if ((i11 & 1) != 0) {
                    dVar.f9391b = this.f9398b;
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 4) != 0) {
                    k2 k2Var = this.f9402f;
                    dVar.f9393d = k2Var == null ? this.f9401e : (e) k2Var.b();
                    i10 |= 2;
                }
                if ((i11 & 16) != 0) {
                    this.f9405r.r();
                    dVar.f9395f = this.f9405r;
                }
                d.x(dVar, i10);
            }

            private void k(d dVar) {
                g2 g2Var = this.f9400d;
                if (g2Var == null) {
                    if ((this.f9397a & 2) != 0) {
                        this.f9399c = DesugarCollections.unmodifiableList(this.f9399c);
                        this.f9397a &= -3;
                    }
                    dVar.f9392c = this.f9399c;
                } else {
                    dVar.f9392c = g2Var.g();
                }
                g2 g2Var2 = this.f9404h;
                if (g2Var2 != null) {
                    dVar.f9394e = g2Var2.g();
                    return;
                }
                if ((this.f9397a & 8) != 0) {
                    this.f9403g = DesugarCollections.unmodifiableList(this.f9403g);
                    this.f9397a &= -9;
                }
                dVar.f9394e = this.f9403g;
            }

            private void o() {
                if (!this.f9405r.p0()) {
                    this.f9405r = new u0(this.f9405r);
                }
                this.f9397a |= 16;
            }

            private void p() {
                if ((this.f9397a & 8) == 0) {
                    this.f9403g = new ArrayList(this.f9403g);
                    this.f9397a |= 8;
                }
            }

            private void r() {
                if ((this.f9397a & 2) == 0) {
                    this.f9399c = new ArrayList(this.f9399c);
                    this.f9397a |= 2;
                }
            }

            private k2 w() {
                if (this.f9402f == null) {
                    this.f9402f = new k2(u(), getParentForChildren(), isClean());
                    this.f9401e = null;
                }
                return this.f9402f;
            }

            private g2 x() {
                if (this.f9404h == null) {
                    this.f9404h = new g2(this.f9403g, (this.f9397a & 8) != 0, getParentForChildren(), isClean());
                    this.f9403g = null;
                }
                return this.f9404h;
            }

            public boolean B() {
                return (this.f9397a & 4) != 0;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: D */
            public b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    this.f9398b = mVar.r();
                                    this.f9397a |= 1;
                                } else if (iK == 18) {
                                    f fVar = (f) mVar.A(f.f9433g, yVar);
                                    g2 g2Var = this.f9400d;
                                    if (g2Var == null) {
                                        r();
                                        this.f9399c.add(fVar);
                                    } else {
                                        g2Var.f(fVar);
                                    }
                                } else if (iK == 26) {
                                    mVar.B(w().e(), yVar);
                                    this.f9397a |= 4;
                                } else if (iK == 34) {
                                    c cVar = (c) mVar.A(c.f9407f, yVar);
                                    g2 g2Var2 = this.f9404h;
                                    if (g2Var2 == null) {
                                        p();
                                        this.f9403g.add(cVar);
                                    } else {
                                        g2Var2.f(cVar);
                                    }
                                } else if (iK == 42) {
                                    com.google.protobuf.l lVarR = mVar.r();
                                    o();
                                    this.f9405r.w(lVarR);
                                } else if (!super.parseUnknownField(mVar, yVar, iK)) {
                                }
                            }
                            z10 = true;
                        } catch (p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }

            public b E(d dVar) {
                if (dVar == d.z()) {
                    return this;
                }
                if (dVar.Q()) {
                    this.f9398b = dVar.f9391b;
                    this.f9397a |= 1;
                    onChanged();
                }
                if (this.f9400d == null) {
                    if (!dVar.f9392c.isEmpty()) {
                        if (this.f9399c.isEmpty()) {
                            this.f9399c = dVar.f9392c;
                            this.f9397a &= -3;
                        } else {
                            r();
                            this.f9399c.addAll(dVar.f9392c);
                        }
                        onChanged();
                    }
                } else if (!dVar.f9392c.isEmpty()) {
                    if (this.f9400d.u()) {
                        this.f9400d.i();
                        this.f9400d = null;
                        this.f9399c = dVar.f9392c;
                        this.f9397a &= -3;
                        this.f9400d = k0.alwaysUseFieldBuilders ? A() : null;
                    } else {
                        this.f9400d.b(dVar.f9392c);
                    }
                }
                if (dVar.R()) {
                    G(dVar.C());
                }
                if (this.f9404h == null) {
                    if (!dVar.f9394e.isEmpty()) {
                        if (this.f9403g.isEmpty()) {
                            this.f9403g = dVar.f9394e;
                            this.f9397a &= -9;
                        } else {
                            p();
                            this.f9403g.addAll(dVar.f9394e);
                        }
                        onChanged();
                    }
                } else if (!dVar.f9394e.isEmpty()) {
                    if (this.f9404h.u()) {
                        this.f9404h.i();
                        this.f9404h = null;
                        this.f9403g = dVar.f9394e;
                        this.f9397a &= -9;
                        this.f9404h = k0.alwaysUseFieldBuilders ? x() : null;
                    } else {
                        this.f9404h.b(dVar.f9394e);
                    }
                }
                if (!dVar.f9395f.isEmpty()) {
                    if (this.f9405r.isEmpty()) {
                        this.f9405r = dVar.f9395f;
                        this.f9397a |= 16;
                    } else {
                        o();
                        this.f9405r.addAll(dVar.f9395f);
                    }
                    onChanged();
                }
                m141mergeUnknownFields(dVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: F */
            public b mergeFrom(i1 i1Var) {
                if (i1Var instanceof d) {
                    return E((d) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public b G(e eVar) {
                e eVar2;
                k2 k2Var = this.f9402f;
                if (k2Var != null) {
                    k2Var.h(eVar);
                } else if ((this.f9397a & 4) == 0 || (eVar2 = this.f9401e) == null || eVar2 == e.G()) {
                    this.f9401e = eVar;
                } else {
                    v().L(eVar);
                }
                if (this.f9401e != null) {
                    this.f9397a |= 4;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final b m1148mergeUnknownFields(t2 t2Var) {
                return (b) super.m1148mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: I */
            public b setField(r.g gVar, Object obj) {
                return (b) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: J */
            public final b setUnknownFields(t2 t2Var) {
                return (b) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: g */
            public b addRepeatedField(r.g gVar, Object obj) {
                return (b) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return q.f9315s;
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: h */
            public d build() {
                d dVarBuildPartial = buildPartial();
                if (dVarBuildPartial.isInitialized()) {
                    return dVarBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) dVarBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: i */
            public d buildPartial() {
                d dVar = new d(this);
                k(dVar);
                if (this.f9397a != 0) {
                    j(dVar);
                }
                onBuilt();
                return dVar;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return q.f9316t.d(d.class, b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < z(); i10++) {
                    if (!y(i10).isInitialized()) {
                        return false;
                    }
                }
                return !B() || u().isInitialized();
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public b m1140clearField(r.g gVar) {
                return (b) super.m1140clearField(gVar);
            }

            /* JADX INFO: renamed from: n */
            public b clone() {
                return (b) super.m1147clone();
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: t */
            public d getDefaultInstanceForType() {
                return d.z();
            }

            public e u() {
                k2 k2Var = this.f9402f;
                if (k2Var != null) {
                    return (e) k2Var.f();
                }
                e eVar = this.f9401e;
                return eVar == null ? e.G() : eVar;
            }

            public e.b v() {
                this.f9397a |= 4;
                onChanged();
                return (e.b) w().e();
            }

            public f y(int i10) {
                g2 g2Var = this.f9400d;
                return g2Var == null ? (f) this.f9399c.get(i10) : (f) g2Var.o(i10);
            }

            public int z() {
                g2 g2Var = this.f9400d;
                return g2Var == null ? this.f9399c.size() : g2Var.n();
            }

            /* synthetic */ b(k0.c cVar, a aVar) {
                this(cVar);
            }

            private b() {
                this.f9398b = "";
                List list = Collections.EMPTY_LIST;
                this.f9399c = list;
                this.f9403g = list;
                this.f9405r = u0.e();
                C();
            }

            private b(k0.c cVar) {
                super(cVar);
                this.f9398b = "";
                List list = Collections.EMPTY_LIST;
                this.f9399c = list;
                this.f9403g = list;
                this.f9405r = u0.e();
                C();
            }
        }

        public static final class c extends k0 implements o1 {

            /* JADX INFO: renamed from: e */
            private static final c f9406e = new c();

            /* JADX INFO: renamed from: f */
            public static final z1 f9407f = new a();

            /* JADX INFO: renamed from: a */
            private int f9408a;

            /* JADX INFO: renamed from: b */
            private int f9409b;

            /* JADX INFO: renamed from: c */
            private int f9410c;

            /* JADX INFO: renamed from: d */
            private byte f9411d;

            class a extends com.google.protobuf.c {
                a() {
                }

                @Override // com.google.protobuf.z1
                /* JADX INFO: renamed from: c */
                public c parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                    b bVarX = c.x();
                    try {
                        bVarX.mergeFrom(mVar, yVar);
                        return bVarX.buildPartial();
                    } catch (p0 e10) {
                        throw e10.j(bVarX.buildPartial());
                    } catch (r2 e11) {
                        throw e11.a().j(bVarX.buildPartial());
                    } catch (IOException e12) {
                        throw new p0(e12).j(bVarX.buildPartial());
                    }
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                    return super.parseDelimitedFrom(inputStream);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                    return super.parseFrom(lVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialDelimitedFrom */
                public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                    return super.mo1183parsePartialDelimitedFrom(inputStream);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                    return super.mo1185parsePartialFrom(lVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                    return super.parseDelimitedFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                    return super.parseFrom(lVar, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialDelimitedFrom */
                public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                    return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                    return super.mo1186parsePartialFrom(lVar, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                    return super.parseFrom(mVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                    return super.mo1187parsePartialFrom(mVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                    return super.parseFrom(mVar, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                    return super.parseFrom(inputStream);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                    return super.mo1188parsePartialFrom(inputStream);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                    return super.parseFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                    return super.mo1189parsePartialFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                    return super.parseFrom(byteBuffer);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                    return super.mo1190parsePartialFrom(bArr);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                    return super.parseFrom(byteBuffer, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                    return super.mo1191parsePartialFrom(bArr, i10, i11);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                    return super.parseFrom(bArr);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                    return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parseFrom */
                public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                    return super.mo1181parseFrom(bArr, i10, i11);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                    return super.mo1193parsePartialFrom(bArr, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parseFrom */
                public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                    return super.mo1182parseFrom(bArr, i10, i11, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                    return super.parseFrom(bArr, yVar);
                }
            }

            public static final class b extends k0.b implements o1 {

                /* JADX INFO: renamed from: a */
                private int f9412a;

                /* JADX INFO: renamed from: b */
                private int f9413b;

                /* JADX INFO: renamed from: c */
                private int f9414c;

                /* synthetic */ b(a aVar) {
                    this();
                }

                private void j(c cVar) {
                    int i10;
                    int i11 = this.f9412a;
                    if ((i11 & 1) != 0) {
                        cVar.f9409b = this.f9413b;
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if ((i11 & 2) != 0) {
                        cVar.f9410c = this.f9414c;
                        i10 |= 2;
                    }
                    c.p(cVar, i10);
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: g */
                public b addRepeatedField(r.g gVar, Object obj) {
                    return (b) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                public r.b getDescriptorForType() {
                    return q.f9317u;
                }

                @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
                /* JADX INFO: renamed from: h */
                public c build() {
                    c cVarBuildPartial = buildPartial();
                    if (cVarBuildPartial.isInitialized()) {
                        return cVarBuildPartial;
                    }
                    throw a.AbstractC0131a.newUninitializedMessageException((i1) cVarBuildPartial);
                }

                @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
                /* JADX INFO: renamed from: i */
                public c buildPartial() {
                    c cVar = new c(this);
                    if (this.f9412a != 0) {
                        j(cVar);
                    }
                    onBuilt();
                    return cVar;
                }

                @Override // com.google.protobuf.k0.b
                protected k0.f internalGetFieldAccessorTable() {
                    return q.f9318v.d(c.class, b.class);
                }

                @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.k0.b
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public b m1140clearField(r.g gVar) {
                    return (b) super.m1140clearField(gVar);
                }

                /* JADX INFO: renamed from: m */
                public b clone() {
                    return (b) super.m1147clone();
                }

                @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                /* JADX INFO: renamed from: n */
                public c getDefaultInstanceForType() {
                    return c.q();
                }

                @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
                /* JADX INFO: renamed from: o */
                public b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                    yVar.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int iK = mVar.K();
                                if (iK != 0) {
                                    if (iK == 8) {
                                        this.f9413b = mVar.y();
                                        this.f9412a |= 1;
                                    } else if (iK == 16) {
                                        this.f9414c = mVar.y();
                                        this.f9412a |= 2;
                                    } else if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                }
                                z10 = true;
                            } catch (p0 e10) {
                                throw e10.n();
                            }
                        } catch (Throwable th2) {
                            onChanged();
                            throw th2;
                        }
                    }
                    onChanged();
                    return this;
                }

                public b p(c cVar) {
                    if (cVar == c.q()) {
                        return this;
                    }
                    if (cVar.w()) {
                        w(cVar.t());
                    }
                    if (cVar.v()) {
                        u(cVar.s());
                    }
                    m141mergeUnknownFields(cVar.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: r */
                public b mergeFrom(i1 i1Var) {
                    if (i1Var instanceof c) {
                        return p((c) i1Var);
                    }
                    super.mergeFrom(i1Var);
                    return this;
                }

                @Override // com.google.protobuf.a.AbstractC0131a
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public final b m1148mergeUnknownFields(t2 t2Var) {
                    return (b) super.m1148mergeUnknownFields(t2Var);
                }

                public b u(int i10) {
                    this.f9414c = i10;
                    this.f9412a |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: v */
                public b setField(r.g gVar, Object obj) {
                    return (b) super.setField(gVar, obj);
                }

                public b w(int i10) {
                    this.f9413b = i10;
                    this.f9412a |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: x */
                public final b setUnknownFields(t2 t2Var) {
                    return (b) super.setUnknownFields(t2Var);
                }

                /* synthetic */ b(k0.c cVar, a aVar) {
                    this(cVar);
                }

                private b() {
                }

                private b(k0.c cVar) {
                    super(cVar);
                }
            }

            /* synthetic */ c(k0.b bVar, a aVar) {
                this(bVar);
            }

            public static final r.b getDescriptor() {
                return q.f9317u;
            }

            static /* synthetic */ int p(c cVar, int i10) {
                int i11 = i10 | cVar.f9408a;
                cVar.f9408a = i11;
                return i11;
            }

            public static c q() {
                return f9406e;
            }

            public static b x() {
                return f9406e.toBuilder();
            }

            @Override // com.google.protobuf.k0
            /* JADX INFO: renamed from: A */
            public b newBuilderForType(k0.c cVar) {
                return new b(cVar);
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            /* JADX INFO: renamed from: C */
            public b toBuilder() {
                return this == f9406e ? new b() : new b().p(this);
            }

            @Override // com.google.protobuf.a
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return super.equals(obj);
                }
                c cVar = (c) obj;
                if (w() != cVar.w()) {
                    return false;
                }
                if ((!w() || t() == cVar.t()) && v() == cVar.v()) {
                    return (!v() || s() == cVar.s()) && getUnknownFields().equals(cVar.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            public z1 getParserForType() {
                return f9407f;
            }

            @Override // com.google.protobuf.l1
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iX = (this.f9408a & 1) != 0 ? com.google.protobuf.o.x(1, this.f9409b) : 0;
                if ((this.f9408a & 2) != 0) {
                    iX += com.google.protobuf.o.x(2, this.f9410c);
                }
                int serializedSize = iX + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.a
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (w()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + t();
                }
                if (v()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + s();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.k0
            protected k0.f internalGetFieldAccessorTable() {
                return q.f9318v.d(c.class, b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9411d;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9411d = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.k0
            protected Object newInstance(k0.g gVar) {
                return new c();
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: r */
            public c getDefaultInstanceForType() {
                return f9406e;
            }

            public int s() {
                return this.f9410c;
            }

            public int t() {
                return this.f9409b;
            }

            public boolean v() {
                return (this.f9408a & 2) != 0;
            }

            public boolean w() {
                return (this.f9408a & 1) != 0;
            }

            @Override // com.google.protobuf.l1
            public void writeTo(com.google.protobuf.o oVar) {
                if ((this.f9408a & 1) != 0) {
                    oVar.D0(1, this.f9409b);
                }
                if ((this.f9408a & 2) != 0) {
                    oVar.D0(2, this.f9410c);
                }
                getUnknownFields().writeTo(oVar);
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            /* JADX INFO: renamed from: z */
            public b newBuilderForType() {
                return x();
            }

            private c(k0.b bVar) {
                super(bVar);
                this.f9409b = 0;
                this.f9410c = 0;
                this.f9411d = (byte) -1;
            }

            private c() {
                this.f9409b = 0;
                this.f9410c = 0;
                this.f9411d = (byte) -1;
            }
        }

        /* synthetic */ d(k0.b bVar, a aVar) {
            this(bVar);
        }

        public static b S() {
            return f9388h.toBuilder();
        }

        public static final r.b getDescriptor() {
            return q.f9315s;
        }

        static /* synthetic */ int x(d dVar, int i10) {
            int i11 = i10 | dVar.f9390a;
            dVar.f9390a = i11;
            return i11;
        }

        public static d z() {
            return f9388h;
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: A */
        public d getDefaultInstanceForType() {
            return f9388h;
        }

        public e C() {
            e eVar = this.f9393d;
            return eVar == null ? e.G() : eVar;
        }

        public int D() {
            return this.f9395f.size();
        }

        public e2 G() {
            return this.f9395f;
        }

        public int H() {
            return this.f9394e.size();
        }

        public List K() {
            return this.f9394e;
        }

        public f L(int i10) {
            return (f) this.f9392c.get(i10);
        }

        public int N() {
            return this.f9392c.size();
        }

        public List O() {
            return this.f9392c;
        }

        public boolean Q() {
            return (this.f9390a & 1) != 0;
        }

        public boolean R() {
            return (this.f9390a & 2) != 0;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: T */
        public b newBuilderForType() {
            return S();
        }

        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: W */
        public b newBuilderForType(k0.c cVar) {
            return new b(cVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: X */
        public b toBuilder() {
            return this == f9388h ? new b() : new b().E(this);
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return super.equals(obj);
            }
            d dVar = (d) obj;
            if (Q() != dVar.Q()) {
                return false;
            }
            if ((!Q() || getName().equals(dVar.getName())) && O().equals(dVar.O()) && R() == dVar.R()) {
                return (!R() || C().equals(dVar.C())) && K().equals(dVar.K()) && G().equals(dVar.G()) && getUnknownFields().equals(dVar.getUnknownFields());
            }
            return false;
        }

        public String getName() {
            Object obj = this.f9391b;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f9391b = strN;
            }
            return strN;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return f9389r;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = (this.f9390a & 1) != 0 ? k0.computeStringSize(1, this.f9391b) : 0;
            for (int i11 = 0; i11 < this.f9392c.size(); i11++) {
                iComputeStringSize += com.google.protobuf.o.G(2, (l1) this.f9392c.get(i11));
            }
            if ((this.f9390a & 2) != 0) {
                iComputeStringSize += com.google.protobuf.o.G(3, C());
            }
            for (int i12 = 0; i12 < this.f9394e.size(); i12++) {
                iComputeStringSize += com.google.protobuf.o.G(4, (l1) this.f9394e.get(i12));
            }
            int iComputeStringSizeNoTag = 0;
            for (int i13 = 0; i13 < this.f9395f.size(); i13++) {
                iComputeStringSizeNoTag += k0.computeStringSizeNoTag(this.f9395f.h0(i13));
            }
            int size = iComputeStringSize + iComputeStringSizeNoTag + G().size() + getUnknownFields().getSerializedSize();
            this.memoizedSize = size;
            return size;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (Q()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (N() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + O().hashCode();
            }
            if (R()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + C().hashCode();
            }
            if (H() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + K().hashCode();
            }
            if (D() > 0) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + G().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return q.f9316t.d(d.class, b.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9396g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < N(); i10++) {
                if (!L(i10).isInitialized()) {
                    this.f9396g = (byte) 0;
                    return false;
                }
            }
            if (!R() || C().isInitialized()) {
                this.f9396g = (byte) 1;
                return true;
            }
            this.f9396g = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new d();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if ((this.f9390a & 1) != 0) {
                k0.writeString(oVar, 1, this.f9391b);
            }
            for (int i10 = 0; i10 < this.f9392c.size(); i10++) {
                oVar.H0(2, (l1) this.f9392c.get(i10));
            }
            if ((this.f9390a & 2) != 0) {
                oVar.H0(3, C());
            }
            for (int i11 = 0; i11 < this.f9394e.size(); i11++) {
                oVar.H0(4, (l1) this.f9394e.get(i11));
            }
            for (int i12 = 0; i12 < this.f9395f.size(); i12++) {
                k0.writeString(oVar, 5, this.f9395f.h0(i12));
            }
            getUnknownFields().writeTo(oVar);
        }

        private d(k0.b bVar) {
            super(bVar);
            this.f9391b = "";
            this.f9395f = u0.e();
            this.f9396g = (byte) -1;
        }

        private d() {
            this.f9391b = "";
            this.f9395f = u0.e();
            this.f9396g = (byte) -1;
            this.f9391b = "";
            List list = Collections.EMPTY_LIST;
            this.f9392c = list;
            this.f9394e = list;
            this.f9395f = u0.e();
        }
    }

    public static final class e extends k0.e implements o1 {

        /* JADX INFO: renamed from: r */
        private static final e f9415r = new e();

        /* JADX INFO: renamed from: s */
        public static final z1 f9416s = new a();

        /* JADX INFO: renamed from: b */
        private int f9417b;

        /* JADX INFO: renamed from: c */
        private boolean f9418c;

        /* JADX INFO: renamed from: d */
        private boolean f9419d;

        /* JADX INFO: renamed from: e */
        private boolean f9420e;

        /* JADX INFO: renamed from: f */
        private i f9421f;

        /* JADX INFO: renamed from: g */
        private List f9422g;

        /* JADX INFO: renamed from: h */
        private byte f9423h;

        class a extends com.google.protobuf.c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c */
            public e parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                b bVarY = e.Y();
                try {
                    bVarY.mergeFrom(mVar, yVar);
                    return bVarY.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(bVarY.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(bVarY.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(bVarY.buildPartial());
                }
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                return super.parseDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                return super.parseFrom(lVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                return super.mo1183parsePartialDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                return super.mo1185parsePartialFrom(lVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                return super.parseDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                return super.parseFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                return super.mo1186parsePartialFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                return super.parseFrom(mVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                return super.mo1187parsePartialFrom(mVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                return super.parseFrom(mVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                return super.parseFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                return super.mo1188parsePartialFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                return super.parseFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                return super.mo1189parsePartialFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                return super.parseFrom(byteBuffer);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                return super.mo1190parsePartialFrom(bArr);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                return super.parseFrom(byteBuffer, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                return super.mo1191parsePartialFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                return super.mo1181parseFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                return super.mo1193parsePartialFrom(bArr, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1182parseFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                return super.parseFrom(bArr, yVar);
            }
        }

        public static final class b extends k0.d implements o1 {

            /* JADX INFO: renamed from: b */
            private int f9424b;

            /* JADX INFO: renamed from: c */
            private boolean f9425c;

            /* JADX INFO: renamed from: d */
            private boolean f9426d;

            /* JADX INFO: renamed from: e */
            private boolean f9427e;

            /* JADX INFO: renamed from: f */
            private i f9428f;

            /* JADX INFO: renamed from: g */
            private k2 f9429g;

            /* JADX INFO: renamed from: h */
            private List f9430h;

            /* JADX INFO: renamed from: r */
            private g2 f9431r;

            /* synthetic */ b(a aVar) {
                this();
            }

            private k2 D() {
                if (this.f9429g == null) {
                    this.f9429g = new k2(B(), getParentForChildren(), isClean());
                    this.f9428f = null;
                }
                return this.f9429g;
            }

            private g2 G() {
                if (this.f9431r == null) {
                    this.f9431r = new g2(this.f9430h, (this.f9424b & 16) != 0, getParentForChildren(), isClean());
                    this.f9430h = null;
                }
                return this.f9431r;
            }

            private void I() {
                if (k0.alwaysUseFieldBuilders) {
                    D();
                    G();
                }
            }

            private void v(e eVar) {
                int i10;
                int i11 = this.f9424b;
                if ((i11 & 1) != 0) {
                    eVar.f9418c = this.f9425c;
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 2) != 0) {
                    eVar.f9419d = this.f9426d;
                    i10 |= 2;
                }
                if ((i11 & 4) != 0) {
                    eVar.f9420e = this.f9427e;
                    i10 |= 4;
                }
                if ((i11 & 8) != 0) {
                    k2 k2Var = this.f9429g;
                    eVar.f9421f = k2Var == null ? this.f9428f : (i) k2Var.b();
                    i10 |= 8;
                }
                e.C(eVar, i10);
            }

            private void w(e eVar) {
                g2 g2Var = this.f9431r;
                if (g2Var != null) {
                    eVar.f9422g = g2Var.g();
                    return;
                }
                if ((this.f9424b & 16) != 0) {
                    this.f9430h = DesugarCollections.unmodifiableList(this.f9430h);
                    this.f9424b &= -17;
                }
                eVar.f9422g = this.f9430h;
            }

            private void z() {
                if ((this.f9424b & 16) == 0) {
                    this.f9430h = new ArrayList(this.f9430h);
                    this.f9424b |= 16;
                }
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: A */
            public e getDefaultInstanceForType() {
                return e.G();
            }

            public i B() {
                k2 k2Var = this.f9429g;
                if (k2Var != null) {
                    return (i) k2Var.f();
                }
                i iVar = this.f9428f;
                return iVar == null ? i.D() : iVar;
            }

            public i.b C() {
                this.f9424b |= 8;
                onChanged();
                return (i.b) D().e();
            }

            public v E(int i10) {
                g2 g2Var = this.f9431r;
                return g2Var == null ? (v) this.f9430h.get(i10) : (v) g2Var.o(i10);
            }

            public int F() {
                g2 g2Var = this.f9431r;
                return g2Var == null ? this.f9430h.size() : g2Var.n();
            }

            public boolean H() {
                return (this.f9424b & 8) != 0;
            }

            public b J(i iVar) {
                i iVar2;
                k2 k2Var = this.f9429g;
                if (k2Var != null) {
                    k2Var.h(iVar);
                } else if ((this.f9424b & 8) == 0 || (iVar2 = this.f9428f) == null || iVar2 == i.D()) {
                    this.f9428f = iVar;
                } else {
                    C().A(iVar);
                }
                if (this.f9428f != null) {
                    this.f9424b |= 8;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: K */
            public b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 16) {
                                    this.f9425c = mVar.q();
                                    this.f9424b |= 1;
                                } else if (iK == 24) {
                                    this.f9426d = mVar.q();
                                    this.f9424b |= 2;
                                } else if (iK == 48) {
                                    this.f9427e = mVar.q();
                                    this.f9424b |= 4;
                                } else if (iK == 58) {
                                    mVar.B(D().e(), yVar);
                                    this.f9424b |= 8;
                                } else if (iK == 7994) {
                                    v vVar = (v) mVar.A(v.f9890t, yVar);
                                    g2 g2Var = this.f9431r;
                                    if (g2Var == null) {
                                        z();
                                        this.f9430h.add(vVar);
                                    } else {
                                        g2Var.f(vVar);
                                    }
                                } else if (!super.parseUnknownField(mVar, yVar, iK)) {
                                }
                            }
                            z10 = true;
                        } catch (p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }

            public b L(e eVar) {
                if (eVar == e.G()) {
                    return this;
                }
                if (eVar.S()) {
                    O(eVar.D());
                }
                if (eVar.T()) {
                    P(eVar.K());
                }
                if (eVar.W()) {
                    Q(eVar.L());
                }
                if (eVar.X()) {
                    J(eVar.N());
                }
                if (this.f9431r == null) {
                    if (!eVar.f9422g.isEmpty()) {
                        if (this.f9430h.isEmpty()) {
                            this.f9430h = eVar.f9422g;
                            this.f9424b &= -17;
                        } else {
                            z();
                            this.f9430h.addAll(eVar.f9422g);
                        }
                        onChanged();
                    }
                } else if (!eVar.f9422g.isEmpty()) {
                    if (this.f9431r.u()) {
                        this.f9431r.i();
                        this.f9431r = null;
                        this.f9430h = eVar.f9422g;
                        this.f9424b &= -17;
                        this.f9431r = k0.alwaysUseFieldBuilders ? G() : null;
                    } else {
                        this.f9431r.b(eVar.f9422g);
                    }
                }
                n(eVar);
                m141mergeUnknownFields(eVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: M */
            public b mergeFrom(i1 i1Var) {
                if (i1Var instanceof e) {
                    return L((e) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final b m1148mergeUnknownFields(t2 t2Var) {
                return (b) super.m1148mergeUnknownFields(t2Var);
            }

            public b O(boolean z10) {
                this.f9425c = z10;
                this.f9424b |= 1;
                onChanged();
                return this;
            }

            public b P(boolean z10) {
                this.f9426d = z10;
                this.f9424b |= 2;
                onChanged();
                return this;
            }

            public b Q(boolean z10) {
                this.f9427e = z10;
                this.f9424b |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: R */
            public b setField(r.g gVar, Object obj) {
                return (b) super.o(gVar, obj);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: T */
            public final b setUnknownFields(t2 t2Var) {
                return (b) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return q.M;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return q.N.d(e.class, b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                if (H() && !B().isInitialized()) {
                    return false;
                }
                for (int i10 = 0; i10 < F(); i10++) {
                    if (!E(i10).isInitialized()) {
                        return false;
                    }
                }
                return m();
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: r */
            public b addRepeatedField(r.g gVar, Object obj) {
                return (b) super.h(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: t */
            public e build() {
                e eVarBuildPartial = buildPartial();
                if (eVarBuildPartial.isInitialized()) {
                    return eVarBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) eVarBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: u */
            public e buildPartial() {
                e eVar = new e(this);
                w(eVar);
                if (this.f9424b != 0) {
                    v(eVar);
                }
                onBuilt();
                return eVar;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b m1140clearField(r.g gVar) {
                return (b) super.j(gVar);
            }

            /* JADX INFO: renamed from: y */
            public b clone() {
                return (b) super.m1147clone();
            }

            /* synthetic */ b(k0.c cVar, a aVar) {
                this(cVar);
            }

            private b() {
                this.f9430h = Collections.EMPTY_LIST;
                I();
            }

            private b(k0.c cVar) {
                super(cVar);
                this.f9430h = Collections.EMPTY_LIST;
                I();
            }
        }

        /* synthetic */ e(k0.d dVar, a aVar) {
            this(dVar);
        }

        static /* synthetic */ int C(e eVar, int i10) {
            int i11 = i10 | eVar.f9417b;
            eVar.f9417b = i11;
            return i11;
        }

        public static e G() {
            return f9415r;
        }

        public static b Y() {
            return f9415r.toBuilder();
        }

        public static final r.b getDescriptor() {
            return q.M;
        }

        public boolean D() {
            return this.f9418c;
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: H */
        public e getDefaultInstanceForType() {
            return f9415r;
        }

        public boolean K() {
            return this.f9419d;
        }

        public boolean L() {
            return this.f9420e;
        }

        public i N() {
            i iVar = this.f9421f;
            return iVar == null ? i.D() : iVar;
        }

        public v O(int i10) {
            return (v) this.f9422g.get(i10);
        }

        public int Q() {
            return this.f9422g.size();
        }

        public List R() {
            return this.f9422g;
        }

        public boolean S() {
            return (this.f9417b & 1) != 0;
        }

        public boolean T() {
            return (this.f9417b & 2) != 0;
        }

        public boolean W() {
            return (this.f9417b & 4) != 0;
        }

        public boolean X() {
            return (this.f9417b & 8) != 0;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: Z */
        public b newBuilderForType() {
            return Y();
        }

        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: a0 */
        public b newBuilderForType(k0.c cVar) {
            return new b(cVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: b0 */
        public b toBuilder() {
            return this == f9415r ? new b() : new b().L(this);
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e)) {
                return super.equals(obj);
            }
            e eVar = (e) obj;
            if (S() != eVar.S()) {
                return false;
            }
            if ((S() && D() != eVar.D()) || T() != eVar.T()) {
                return false;
            }
            if ((T() && K() != eVar.K()) || W() != eVar.W()) {
                return false;
            }
            if ((!W() || L() == eVar.L()) && X() == eVar.X()) {
                return (!X() || N().equals(eVar.N())) && R().equals(eVar.R()) && getUnknownFields().equals(eVar.getUnknownFields()) && q().equals(eVar.q());
            }
            return false;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return f9416s;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iE = (this.f9417b & 1) != 0 ? com.google.protobuf.o.e(2, this.f9418c) : 0;
            if ((2 & this.f9417b) != 0) {
                iE += com.google.protobuf.o.e(3, this.f9419d);
            }
            if ((this.f9417b & 4) != 0) {
                iE += com.google.protobuf.o.e(6, this.f9420e);
            }
            if ((this.f9417b & 8) != 0) {
                iE += com.google.protobuf.o.G(7, N());
            }
            for (int i11 = 0; i11 < this.f9422g.size(); i11++) {
                iE += com.google.protobuf.o.G(999, (l1) this.f9422g.get(i11));
            }
            int iP = iE + p() + getUnknownFields().getSerializedSize();
            this.memoizedSize = iP;
            return iP;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (S()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + o0.d(D());
            }
            if (T()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + o0.d(K());
            }
            if (W()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + o0.d(L());
            }
            if (X()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + N().hashCode();
            }
            if (Q() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + R().hashCode();
            }
            int iHashFields = (com.google.protobuf.a.hashFields(iHashCode, q()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return q.N.d(e.class, b.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9423h;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (X() && !N().isInitialized()) {
                this.f9423h = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < Q(); i10++) {
                if (!O(i10).isInitialized()) {
                    this.f9423h = (byte) 0;
                    return false;
                }
            }
            if (o()) {
                this.f9423h = (byte) 1;
                return true;
            }
            this.f9423h = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new e();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) {
            k0.e.a aVarR = r();
            if ((this.f9417b & 1) != 0) {
                oVar.m0(2, this.f9418c);
            }
            if ((this.f9417b & 2) != 0) {
                oVar.m0(3, this.f9419d);
            }
            if ((this.f9417b & 4) != 0) {
                oVar.m0(6, this.f9420e);
            }
            if ((this.f9417b & 8) != 0) {
                oVar.H0(7, N());
            }
            for (int i10 = 0; i10 < this.f9422g.size(); i10++) {
                oVar.H0(999, (l1) this.f9422g.get(i10));
            }
            aVarR.a(536870912, oVar);
            getUnknownFields().writeTo(oVar);
        }

        private e(k0.d dVar) {
            super(dVar);
            this.f9418c = false;
            this.f9419d = false;
            this.f9420e = false;
            this.f9423h = (byte) -1;
        }

        private e() {
            this.f9418c = false;
            this.f9419d = false;
            this.f9420e = false;
            this.f9423h = (byte) -1;
            this.f9422g = Collections.EMPTY_LIST;
        }
    }

    public static final class f extends k0 implements o1 {

        /* JADX INFO: renamed from: f */
        private static final f f9432f = new f();

        /* JADX INFO: renamed from: g */
        public static final z1 f9433g = new a();

        /* JADX INFO: renamed from: a */
        private int f9434a;

        /* JADX INFO: renamed from: b */
        private volatile Object f9435b;

        /* JADX INFO: renamed from: c */
        private int f9436c;

        /* JADX INFO: renamed from: d */
        private g f9437d;

        /* JADX INFO: renamed from: e */
        private byte f9438e;

        class a extends com.google.protobuf.c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c */
            public f parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                b bVarC = f.C();
                try {
                    bVarC.mergeFrom(mVar, yVar);
                    return bVarC.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(bVarC.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(bVarC.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(bVarC.buildPartial());
                }
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                return super.parseDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                return super.parseFrom(lVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                return super.mo1183parsePartialDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                return super.mo1185parsePartialFrom(lVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                return super.parseDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                return super.parseFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                return super.mo1186parsePartialFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                return super.parseFrom(mVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                return super.mo1187parsePartialFrom(mVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                return super.parseFrom(mVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                return super.parseFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                return super.mo1188parsePartialFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                return super.parseFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                return super.mo1189parsePartialFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                return super.parseFrom(byteBuffer);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                return super.mo1190parsePartialFrom(bArr);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                return super.parseFrom(byteBuffer, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                return super.mo1191parsePartialFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                return super.mo1181parseFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                return super.mo1193parsePartialFrom(bArr, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1182parseFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                return super.parseFrom(bArr, yVar);
            }
        }

        public static final class b extends k0.b implements o1 {

            /* JADX INFO: renamed from: a */
            private int f9439a;

            /* JADX INFO: renamed from: b */
            private Object f9440b;

            /* JADX INFO: renamed from: c */
            private int f9441c;

            /* JADX INFO: renamed from: d */
            private g f9442d;

            /* JADX INFO: renamed from: e */
            private k2 f9443e;

            /* synthetic */ b(a aVar) {
                this();
            }

            private void j(f fVar) {
                int i10;
                int i11 = this.f9439a;
                if ((i11 & 1) != 0) {
                    fVar.f9435b = this.f9440b;
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 2) != 0) {
                    fVar.f9436c = this.f9441c;
                    i10 |= 2;
                }
                if ((i11 & 4) != 0) {
                    k2 k2Var = this.f9443e;
                    fVar.f9437d = k2Var == null ? this.f9442d : (g) k2Var.b();
                    i10 |= 4;
                }
                f.r(fVar, i10);
            }

            private k2 r() {
                if (this.f9443e == null) {
                    this.f9443e = new k2(o(), getParentForChildren(), isClean());
                    this.f9442d = null;
                }
                return this.f9443e;
            }

            private void u() {
                if (k0.alwaysUseFieldBuilders) {
                    r();
                }
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: A */
            public b setField(r.g gVar, Object obj) {
                return (b) super.setField(gVar, obj);
            }

            public b B(String str) {
                str.getClass();
                this.f9440b = str;
                this.f9439a |= 1;
                onChanged();
                return this;
            }

            public b C(int i10) {
                this.f9441c = i10;
                this.f9439a |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: D */
            public final b setUnknownFields(t2 t2Var) {
                return (b) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: g */
            public b addRepeatedField(r.g gVar, Object obj) {
                return (b) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return q.f9319w;
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: h */
            public f build() {
                f fVarBuildPartial = buildPartial();
                if (fVarBuildPartial.isInitialized()) {
                    return fVarBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) fVarBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: i */
            public f buildPartial() {
                f fVar = new f(this);
                if (this.f9439a != 0) {
                    j(fVar);
                }
                onBuilt();
                return fVar;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return q.f9320x.d(f.class, b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return !t() || o().isInitialized();
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public b m1140clearField(r.g gVar) {
                return (b) super.m1140clearField(gVar);
            }

            /* JADX INFO: renamed from: m */
            public b clone() {
                return (b) super.m1147clone();
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: n */
            public f getDefaultInstanceForType() {
                return f.s();
            }

            public g o() {
                k2 k2Var = this.f9443e;
                if (k2Var != null) {
                    return (g) k2Var.f();
                }
                g gVar = this.f9442d;
                return gVar == null ? g.D() : gVar;
            }

            public g.b p() {
                this.f9439a |= 4;
                onChanged();
                return (g.b) r().e();
            }

            public boolean t() {
                return (this.f9439a & 4) != 0;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: v */
            public b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    this.f9440b = mVar.r();
                                    this.f9439a |= 1;
                                } else if (iK == 16) {
                                    this.f9441c = mVar.y();
                                    this.f9439a |= 2;
                                } else if (iK == 26) {
                                    mVar.B(r().e(), yVar);
                                    this.f9439a |= 4;
                                } else if (!super.parseUnknownField(mVar, yVar, iK)) {
                                }
                            }
                            z10 = true;
                        } catch (p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }

            public b w(f fVar) {
                if (fVar == f.s()) {
                    return this;
                }
                if (fVar.x()) {
                    this.f9440b = fVar.f9435b;
                    this.f9439a |= 1;
                    onChanged();
                }
                if (fVar.z()) {
                    C(fVar.v());
                }
                if (fVar.A()) {
                    y(fVar.w());
                }
                m141mergeUnknownFields(fVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: x */
            public b mergeFrom(i1 i1Var) {
                if (i1Var instanceof f) {
                    return w((f) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public b y(g gVar) {
                g gVar2;
                k2 k2Var = this.f9443e;
                if (k2Var != null) {
                    k2Var.h(gVar);
                } else if ((this.f9439a & 4) == 0 || (gVar2 = this.f9442d) == null || gVar2 == g.D()) {
                    this.f9442d = gVar;
                } else {
                    p().L(gVar);
                }
                if (this.f9442d != null) {
                    this.f9439a |= 4;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public final b m1148mergeUnknownFields(t2 t2Var) {
                return (b) super.m1148mergeUnknownFields(t2Var);
            }

            /* synthetic */ b(k0.c cVar, a aVar) {
                this(cVar);
            }

            private b() {
                this.f9440b = "";
                u();
            }

            private b(k0.c cVar) {
                super(cVar);
                this.f9440b = "";
                u();
            }
        }

        /* synthetic */ f(k0.b bVar, a aVar) {
            this(bVar);
        }

        public static b C() {
            return f9432f.toBuilder();
        }

        public static final r.b getDescriptor() {
            return q.f9319w;
        }

        static /* synthetic */ int r(f fVar, int i10) {
            int i11 = i10 | fVar.f9434a;
            fVar.f9434a = i11;
            return i11;
        }

        public static f s() {
            return f9432f;
        }

        public boolean A() {
            return (this.f9434a & 4) != 0;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: D */
        public b newBuilderForType() {
            return C();
        }

        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: G */
        public b newBuilderForType(k0.c cVar) {
            return new b(cVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: H */
        public b toBuilder() {
            return this == f9432f ? new b() : new b().w(this);
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return super.equals(obj);
            }
            f fVar = (f) obj;
            if (x() != fVar.x()) {
                return false;
            }
            if ((x() && !getName().equals(fVar.getName())) || z() != fVar.z()) {
                return false;
            }
            if ((!z() || v() == fVar.v()) && A() == fVar.A()) {
                return (!A() || w().equals(fVar.w())) && getUnknownFields().equals(fVar.getUnknownFields());
            }
            return false;
        }

        public String getName() {
            Object obj = this.f9435b;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f9435b = strN;
            }
            return strN;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return f9433g;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = (this.f9434a & 1) != 0 ? k0.computeStringSize(1, this.f9435b) : 0;
            if ((this.f9434a & 2) != 0) {
                iComputeStringSize += com.google.protobuf.o.x(2, this.f9436c);
            }
            if ((this.f9434a & 4) != 0) {
                iComputeStringSize += com.google.protobuf.o.G(3, w());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (x()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (z()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + v();
            }
            if (A()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + w().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return q.f9320x.d(f.class, b.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9438e;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!A() || w().isInitialized()) {
                this.f9438e = (byte) 1;
                return true;
            }
            this.f9438e = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new f();
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: t */
        public f getDefaultInstanceForType() {
            return f9432f;
        }

        public int v() {
            return this.f9436c;
        }

        public g w() {
            g gVar = this.f9437d;
            return gVar == null ? g.D() : gVar;
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if ((this.f9434a & 1) != 0) {
                k0.writeString(oVar, 1, this.f9435b);
            }
            if ((this.f9434a & 2) != 0) {
                oVar.D0(2, this.f9436c);
            }
            if ((this.f9434a & 4) != 0) {
                oVar.H0(3, w());
            }
            getUnknownFields().writeTo(oVar);
        }

        public boolean x() {
            return (this.f9434a & 1) != 0;
        }

        public boolean z() {
            return (this.f9434a & 2) != 0;
        }

        private f(k0.b bVar) {
            super(bVar);
            this.f9435b = "";
            this.f9436c = 0;
            this.f9438e = (byte) -1;
        }

        private f() {
            this.f9435b = "";
            this.f9436c = 0;
            this.f9438e = (byte) -1;
            this.f9435b = "";
        }
    }

    public static final class g extends k0.e implements o1 {

        /* JADX INFO: renamed from: h */
        private static final g f9444h = new g();

        /* JADX INFO: renamed from: r */
        public static final z1 f9445r = new a();

        /* JADX INFO: renamed from: b */
        private int f9446b;

        /* JADX INFO: renamed from: c */
        private boolean f9447c;

        /* JADX INFO: renamed from: d */
        private i f9448d;

        /* JADX INFO: renamed from: e */
        private boolean f9449e;

        /* JADX INFO: renamed from: f */
        private List f9450f;

        /* JADX INFO: renamed from: g */
        private byte f9451g;

        class a extends com.google.protobuf.c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c */
            public g parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                b bVarT = g.T();
                try {
                    bVarT.mergeFrom(mVar, yVar);
                    return bVarT.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(bVarT.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(bVarT.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(bVarT.buildPartial());
                }
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                return super.parseDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                return super.parseFrom(lVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                return super.mo1183parsePartialDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                return super.mo1185parsePartialFrom(lVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                return super.parseDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                return super.parseFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                return super.mo1186parsePartialFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                return super.parseFrom(mVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                return super.mo1187parsePartialFrom(mVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                return super.parseFrom(mVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                return super.parseFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                return super.mo1188parsePartialFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                return super.parseFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                return super.mo1189parsePartialFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                return super.parseFrom(byteBuffer);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                return super.mo1190parsePartialFrom(bArr);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                return super.parseFrom(byteBuffer, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                return super.mo1191parsePartialFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                return super.mo1181parseFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                return super.mo1193parsePartialFrom(bArr, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1182parseFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                return super.parseFrom(bArr, yVar);
            }
        }

        public static final class b extends k0.d implements o1 {

            /* JADX INFO: renamed from: b */
            private int f9452b;

            /* JADX INFO: renamed from: c */
            private boolean f9453c;

            /* JADX INFO: renamed from: d */
            private i f9454d;

            /* JADX INFO: renamed from: e */
            private k2 f9455e;

            /* JADX INFO: renamed from: f */
            private boolean f9456f;

            /* JADX INFO: renamed from: g */
            private List f9457g;

            /* JADX INFO: renamed from: h */
            private g2 f9458h;

            /* synthetic */ b(a aVar) {
                this();
            }

            private k2 D() {
                if (this.f9455e == null) {
                    this.f9455e = new k2(B(), getParentForChildren(), isClean());
                    this.f9454d = null;
                }
                return this.f9455e;
            }

            private g2 G() {
                if (this.f9458h == null) {
                    this.f9458h = new g2(this.f9457g, (this.f9452b & 8) != 0, getParentForChildren(), isClean());
                    this.f9457g = null;
                }
                return this.f9458h;
            }

            private void I() {
                if (k0.alwaysUseFieldBuilders) {
                    D();
                    G();
                }
            }

            private void v(g gVar) {
                int i10;
                int i11 = this.f9452b;
                if ((i11 & 1) != 0) {
                    gVar.f9447c = this.f9453c;
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 2) != 0) {
                    k2 k2Var = this.f9455e;
                    gVar.f9448d = k2Var == null ? this.f9454d : (i) k2Var.b();
                    i10 |= 2;
                }
                if ((i11 & 4) != 0) {
                    gVar.f9449e = this.f9456f;
                    i10 |= 4;
                }
                g.A(gVar, i10);
            }

            private void w(g gVar) {
                g2 g2Var = this.f9458h;
                if (g2Var != null) {
                    gVar.f9450f = g2Var.g();
                    return;
                }
                if ((this.f9452b & 8) != 0) {
                    this.f9457g = DesugarCollections.unmodifiableList(this.f9457g);
                    this.f9452b &= -9;
                }
                gVar.f9450f = this.f9457g;
            }

            private void z() {
                if ((this.f9452b & 8) == 0) {
                    this.f9457g = new ArrayList(this.f9457g);
                    this.f9452b |= 8;
                }
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: A */
            public g getDefaultInstanceForType() {
                return g.D();
            }

            public i B() {
                k2 k2Var = this.f9455e;
                if (k2Var != null) {
                    return (i) k2Var.f();
                }
                i iVar = this.f9454d;
                return iVar == null ? i.D() : iVar;
            }

            public i.b C() {
                this.f9452b |= 2;
                onChanged();
                return (i.b) D().e();
            }

            public v E(int i10) {
                g2 g2Var = this.f9458h;
                return g2Var == null ? (v) this.f9457g.get(i10) : (v) g2Var.o(i10);
            }

            public int F() {
                g2 g2Var = this.f9458h;
                return g2Var == null ? this.f9457g.size() : g2Var.n();
            }

            public boolean H() {
                return (this.f9452b & 2) != 0;
            }

            public b J(i iVar) {
                i iVar2;
                k2 k2Var = this.f9455e;
                if (k2Var != null) {
                    k2Var.h(iVar);
                } else if ((this.f9452b & 2) == 0 || (iVar2 = this.f9454d) == null || iVar2 == i.D()) {
                    this.f9454d = iVar;
                } else {
                    C().A(iVar);
                }
                if (this.f9454d != null) {
                    this.f9452b |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: K */
            public b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    this.f9453c = mVar.q();
                                    this.f9452b |= 1;
                                } else if (iK == 18) {
                                    mVar.B(D().e(), yVar);
                                    this.f9452b |= 2;
                                } else if (iK == 24) {
                                    this.f9456f = mVar.q();
                                    this.f9452b |= 4;
                                } else if (iK == 7994) {
                                    v vVar = (v) mVar.A(v.f9890t, yVar);
                                    g2 g2Var = this.f9458h;
                                    if (g2Var == null) {
                                        z();
                                        this.f9457g.add(vVar);
                                    } else {
                                        g2Var.f(vVar);
                                    }
                                } else if (!super.parseUnknownField(mVar, yVar, iK)) {
                                }
                            }
                            z10 = true;
                        } catch (p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }

            public b L(g gVar) {
                if (gVar == g.D()) {
                    return this;
                }
                if (gVar.R()) {
                    P(gVar.H());
                }
                if (gVar.S()) {
                    J(gVar.K());
                }
                if (gVar.Q()) {
                    O(gVar.C());
                }
                if (this.f9458h == null) {
                    if (!gVar.f9450f.isEmpty()) {
                        if (this.f9457g.isEmpty()) {
                            this.f9457g = gVar.f9450f;
                            this.f9452b &= -9;
                        } else {
                            z();
                            this.f9457g.addAll(gVar.f9450f);
                        }
                        onChanged();
                    }
                } else if (!gVar.f9450f.isEmpty()) {
                    if (this.f9458h.u()) {
                        this.f9458h.i();
                        this.f9458h = null;
                        this.f9457g = gVar.f9450f;
                        this.f9452b &= -9;
                        this.f9458h = k0.alwaysUseFieldBuilders ? G() : null;
                    } else {
                        this.f9458h.b(gVar.f9450f);
                    }
                }
                n(gVar);
                m141mergeUnknownFields(gVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: M */
            public b mergeFrom(i1 i1Var) {
                if (i1Var instanceof g) {
                    return L((g) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final b m1148mergeUnknownFields(t2 t2Var) {
                return (b) super.m1148mergeUnknownFields(t2Var);
            }

            public b O(boolean z10) {
                this.f9456f = z10;
                this.f9452b |= 4;
                onChanged();
                return this;
            }

            public b P(boolean z10) {
                this.f9453c = z10;
                this.f9452b |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: Q */
            public b setField(r.g gVar, Object obj) {
                return (b) super.o(gVar, obj);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: R */
            public final b setUnknownFields(t2 t2Var) {
                return (b) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return q.O;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return q.P.d(g.class, b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                if (H() && !B().isInitialized()) {
                    return false;
                }
                for (int i10 = 0; i10 < F(); i10++) {
                    if (!E(i10).isInitialized()) {
                        return false;
                    }
                }
                return m();
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: r */
            public b addRepeatedField(r.g gVar, Object obj) {
                return (b) super.h(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: t */
            public g build() {
                g gVarBuildPartial = buildPartial();
                if (gVarBuildPartial.isInitialized()) {
                    return gVarBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) gVarBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: u */
            public g buildPartial() {
                g gVar = new g(this);
                w(gVar);
                if (this.f9452b != 0) {
                    v(gVar);
                }
                onBuilt();
                return gVar;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b m1140clearField(r.g gVar) {
                return (b) super.j(gVar);
            }

            /* JADX INFO: renamed from: y */
            public b clone() {
                return (b) super.m1147clone();
            }

            /* synthetic */ b(k0.c cVar, a aVar) {
                this(cVar);
            }

            private b() {
                this.f9457g = Collections.EMPTY_LIST;
                I();
            }

            private b(k0.c cVar) {
                super(cVar);
                this.f9457g = Collections.EMPTY_LIST;
                I();
            }
        }

        /* synthetic */ g(k0.d dVar, a aVar) {
            this(dVar);
        }

        static /* synthetic */ int A(g gVar, int i10) {
            int i11 = i10 | gVar.f9446b;
            gVar.f9446b = i11;
            return i11;
        }

        public static g D() {
            return f9444h;
        }

        public static b T() {
            return f9444h.toBuilder();
        }

        public static final r.b getDescriptor() {
            return q.O;
        }

        public boolean C() {
            return this.f9449e;
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: G */
        public g getDefaultInstanceForType() {
            return f9444h;
        }

        public boolean H() {
            return this.f9447c;
        }

        public i K() {
            i iVar = this.f9448d;
            return iVar == null ? i.D() : iVar;
        }

        public v L(int i10) {
            return (v) this.f9450f.get(i10);
        }

        public int N() {
            return this.f9450f.size();
        }

        public List O() {
            return this.f9450f;
        }

        public boolean Q() {
            return (this.f9446b & 4) != 0;
        }

        public boolean R() {
            return (this.f9446b & 1) != 0;
        }

        public boolean S() {
            return (this.f9446b & 2) != 0;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: W */
        public b newBuilderForType() {
            return T();
        }

        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: X */
        public b newBuilderForType(k0.c cVar) {
            return new b(cVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: Y */
        public b toBuilder() {
            return this == f9444h ? new b() : new b().L(this);
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g)) {
                return super.equals(obj);
            }
            g gVar = (g) obj;
            if (R() != gVar.R()) {
                return false;
            }
            if ((R() && H() != gVar.H()) || S() != gVar.S()) {
                return false;
            }
            if ((!S() || K().equals(gVar.K())) && Q() == gVar.Q()) {
                return (!Q() || C() == gVar.C()) && O().equals(gVar.O()) && getUnknownFields().equals(gVar.getUnknownFields()) && q().equals(gVar.q());
            }
            return false;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return f9445r;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iE = (this.f9446b & 1) != 0 ? com.google.protobuf.o.e(1, this.f9447c) : 0;
            if ((this.f9446b & 2) != 0) {
                iE += com.google.protobuf.o.G(2, K());
            }
            if ((this.f9446b & 4) != 0) {
                iE += com.google.protobuf.o.e(3, this.f9449e);
            }
            for (int i11 = 0; i11 < this.f9450f.size(); i11++) {
                iE += com.google.protobuf.o.G(999, (l1) this.f9450f.get(i11));
            }
            int iP = iE + p() + getUnknownFields().getSerializedSize();
            this.memoizedSize = iP;
            return iP;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (R()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + o0.d(H());
            }
            if (S()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + K().hashCode();
            }
            if (Q()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + o0.d(C());
            }
            if (N() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + O().hashCode();
            }
            int iHashFields = (com.google.protobuf.a.hashFields(iHashCode, q()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return q.P.d(g.class, b.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9451g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (S() && !K().isInitialized()) {
                this.f9451g = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < N(); i10++) {
                if (!L(i10).isInitialized()) {
                    this.f9451g = (byte) 0;
                    return false;
                }
            }
            if (o()) {
                this.f9451g = (byte) 1;
                return true;
            }
            this.f9451g = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new g();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) {
            k0.e.a aVarR = r();
            if ((this.f9446b & 1) != 0) {
                oVar.m0(1, this.f9447c);
            }
            if ((this.f9446b & 2) != 0) {
                oVar.H0(2, K());
            }
            if ((this.f9446b & 4) != 0) {
                oVar.m0(3, this.f9449e);
            }
            for (int i10 = 0; i10 < this.f9450f.size(); i10++) {
                oVar.H0(999, (l1) this.f9450f.get(i10));
            }
            aVarR.a(536870912, oVar);
            getUnknownFields().writeTo(oVar);
        }

        private g(k0.d dVar) {
            super(dVar);
            this.f9447c = false;
            this.f9449e = false;
            this.f9451g = (byte) -1;
        }

        private g() {
            this.f9447c = false;
            this.f9449e = false;
            this.f9451g = (byte) -1;
            this.f9450f = Collections.EMPTY_LIST;
        }
    }

    public static final class h extends k0.e implements o1 {

        /* JADX INFO: renamed from: h */
        private static final h f9459h = new h();

        /* JADX INFO: renamed from: r */
        public static final z1 f9460r = new a();

        /* JADX INFO: renamed from: b */
        private int f9461b;

        /* JADX INFO: renamed from: c */
        private List f9462c;

        /* JADX INFO: renamed from: d */
        private List f9463d;

        /* JADX INFO: renamed from: e */
        private i f9464e;

        /* JADX INFO: renamed from: f */
        private int f9465f;

        /* JADX INFO: renamed from: g */
        private byte f9466g;

        class a extends com.google.protobuf.c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c */
            public h parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                b bVarW = h.W();
                try {
                    bVarW.mergeFrom(mVar, yVar);
                    return bVarW.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(bVarW.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(bVarW.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(bVarW.buildPartial());
                }
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                return super.parseDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                return super.parseFrom(lVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                return super.mo1183parsePartialDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                return super.mo1185parsePartialFrom(lVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                return super.parseDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                return super.parseFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                return super.mo1186parsePartialFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                return super.parseFrom(mVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                return super.mo1187parsePartialFrom(mVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                return super.parseFrom(mVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                return super.parseFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                return super.mo1188parsePartialFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                return super.parseFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                return super.mo1189parsePartialFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                return super.parseFrom(byteBuffer);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                return super.mo1190parsePartialFrom(bArr);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                return super.parseFrom(byteBuffer, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                return super.mo1191parsePartialFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                return super.mo1181parseFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                return super.mo1193parsePartialFrom(bArr, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1182parseFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                return super.parseFrom(bArr, yVar);
            }
        }

        public static final class b extends k0.d implements o1 {

            /* JADX INFO: renamed from: b */
            private int f9467b;

            /* JADX INFO: renamed from: c */
            private List f9468c;

            /* JADX INFO: renamed from: d */
            private g2 f9469d;

            /* JADX INFO: renamed from: e */
            private List f9470e;

            /* JADX INFO: renamed from: f */
            private g2 f9471f;

            /* JADX INFO: renamed from: g */
            private i f9472g;

            /* JADX INFO: renamed from: h */
            private k2 f9473h;

            /* JADX INFO: renamed from: r */
            private int f9474r;

            /* synthetic */ b(a aVar) {
                this();
            }

            private void A() {
                if ((this.f9467b & 1) == 0) {
                    this.f9468c = new ArrayList(this.f9468c);
                    this.f9467b |= 1;
                }
            }

            private g2 B() {
                if (this.f9471f == null) {
                    this.f9471f = new g2(this.f9470e, (this.f9467b & 2) != 0, getParentForChildren(), isClean());
                    this.f9470e = null;
                }
                return this.f9471f;
            }

            private k2 F() {
                if (this.f9473h == null) {
                    this.f9473h = new k2(D(), getParentForChildren(), isClean());
                    this.f9472g = null;
                }
                return this.f9473h;
            }

            private g2 I() {
                if (this.f9469d == null) {
                    this.f9469d = new g2(this.f9468c, (this.f9467b & 1) != 0, getParentForChildren(), isClean());
                    this.f9468c = null;
                }
                return this.f9469d;
            }

            private void K() {
                if (k0.alwaysUseFieldBuilders) {
                    I();
                    B();
                    F();
                }
            }

            private void v(h hVar) {
                int i10;
                int i11 = this.f9467b;
                if ((i11 & 4) != 0) {
                    k2 k2Var = this.f9473h;
                    hVar.f9464e = k2Var == null ? this.f9472g : (i) k2Var.b();
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 8) != 0) {
                    hVar.f9465f = this.f9474r;
                    i10 |= 2;
                }
                h.C(hVar, i10);
            }

            private void w(h hVar) {
                g2 g2Var = this.f9469d;
                if (g2Var == null) {
                    if ((this.f9467b & 1) != 0) {
                        this.f9468c = DesugarCollections.unmodifiableList(this.f9468c);
                        this.f9467b &= -2;
                    }
                    hVar.f9462c = this.f9468c;
                } else {
                    hVar.f9462c = g2Var.g();
                }
                g2 g2Var2 = this.f9471f;
                if (g2Var2 != null) {
                    hVar.f9463d = g2Var2.g();
                    return;
                }
                if ((this.f9467b & 2) != 0) {
                    this.f9470e = DesugarCollections.unmodifiableList(this.f9470e);
                    this.f9467b &= -3;
                }
                hVar.f9463d = this.f9470e;
            }

            private void z() {
                if ((this.f9467b & 2) == 0) {
                    this.f9470e = new ArrayList(this.f9470e);
                    this.f9467b |= 2;
                }
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: C */
            public h getDefaultInstanceForType() {
                return h.H();
            }

            public i D() {
                k2 k2Var = this.f9473h;
                if (k2Var != null) {
                    return (i) k2Var.f();
                }
                i iVar = this.f9472g;
                return iVar == null ? i.D() : iVar;
            }

            public i.b E() {
                this.f9467b |= 4;
                onChanged();
                return (i.b) F().e();
            }

            public v G(int i10) {
                g2 g2Var = this.f9469d;
                return g2Var == null ? (v) this.f9468c.get(i10) : (v) g2Var.o(i10);
            }

            public int H() {
                g2 g2Var = this.f9469d;
                return g2Var == null ? this.f9468c.size() : g2Var.n();
            }

            public boolean J() {
                return (this.f9467b & 4) != 0;
            }

            public b L(i iVar) {
                i iVar2;
                k2 k2Var = this.f9473h;
                if (k2Var != null) {
                    k2Var.h(iVar);
                } else if ((this.f9467b & 4) == 0 || (iVar2 = this.f9472g) == null || iVar2 == i.D()) {
                    this.f9472g = iVar;
                } else {
                    E().A(iVar);
                }
                if (this.f9472g != null) {
                    this.f9467b |= 4;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: M */
            public b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 18) {
                                    c cVar = (c) mVar.A(c.f9476r, yVar);
                                    g2 g2Var = this.f9471f;
                                    if (g2Var == null) {
                                        z();
                                        this.f9470e.add(cVar);
                                    } else {
                                        g2Var.f(cVar);
                                    }
                                } else if (iK == 24) {
                                    int iT = mVar.t();
                                    if (d.a(iT) == null) {
                                        mergeUnknownVarintField(3, iT);
                                    } else {
                                        this.f9474r = iT;
                                        this.f9467b |= 8;
                                    }
                                } else if (iK == 402) {
                                    mVar.B(F().e(), yVar);
                                    this.f9467b |= 4;
                                } else if (iK == 7994) {
                                    v vVar = (v) mVar.A(v.f9890t, yVar);
                                    g2 g2Var2 = this.f9469d;
                                    if (g2Var2 == null) {
                                        A();
                                        this.f9468c.add(vVar);
                                    } else {
                                        g2Var2.f(vVar);
                                    }
                                } else if (!super.parseUnknownField(mVar, yVar, iK)) {
                                }
                            }
                            z10 = true;
                        } catch (p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }

            public b N(h hVar) {
                if (hVar == h.H()) {
                    return this;
                }
                if (this.f9469d == null) {
                    if (!hVar.f9462c.isEmpty()) {
                        if (this.f9468c.isEmpty()) {
                            this.f9468c = hVar.f9462c;
                            this.f9467b &= -2;
                        } else {
                            A();
                            this.f9468c.addAll(hVar.f9462c);
                        }
                        onChanged();
                    }
                } else if (!hVar.f9462c.isEmpty()) {
                    if (this.f9469d.u()) {
                        this.f9469d.i();
                        this.f9469d = null;
                        this.f9468c = hVar.f9462c;
                        this.f9467b &= -2;
                        this.f9469d = k0.alwaysUseFieldBuilders ? I() : null;
                    } else {
                        this.f9469d.b(hVar.f9462c);
                    }
                }
                if (this.f9471f == null) {
                    if (!hVar.f9463d.isEmpty()) {
                        if (this.f9470e.isEmpty()) {
                            this.f9470e = hVar.f9463d;
                            this.f9467b &= -3;
                        } else {
                            z();
                            this.f9470e.addAll(hVar.f9463d);
                        }
                        onChanged();
                    }
                } else if (!hVar.f9463d.isEmpty()) {
                    if (this.f9471f.u()) {
                        this.f9471f.i();
                        this.f9471f = null;
                        this.f9470e = hVar.f9463d;
                        this.f9467b &= -3;
                        this.f9471f = k0.alwaysUseFieldBuilders ? B() : null;
                    } else {
                        this.f9471f.b(hVar.f9463d);
                    }
                }
                if (hVar.S()) {
                    L(hVar.L());
                }
                if (hVar.T()) {
                    T(hVar.R());
                }
                n(hVar);
                m141mergeUnknownFields(hVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: O */
            public b mergeFrom(i1 i1Var) {
                if (i1Var instanceof h) {
                    return N((h) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
            public final b m1148mergeUnknownFields(t2 t2Var) {
                return (b) super.m1148mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: Q */
            public b setField(r.g gVar, Object obj) {
                return (b) super.o(gVar, obj);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: R */
            public final b setUnknownFields(t2 t2Var) {
                return (b) super.setUnknownFields(t2Var);
            }

            public b T(d dVar) {
                dVar.getClass();
                this.f9467b |= 8;
                this.f9474r = dVar.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return q.f9304k;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return q.f9306l.d(h.class, b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < H(); i10++) {
                    if (!G(i10).isInitialized()) {
                        return false;
                    }
                }
                return (!J() || D().isInitialized()) && m();
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: r */
            public b addRepeatedField(r.g gVar, Object obj) {
                return (b) super.h(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: t */
            public h build() {
                h hVarBuildPartial = buildPartial();
                if (hVarBuildPartial.isInitialized()) {
                    return hVarBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) hVarBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: u */
            public h buildPartial() {
                h hVar = new h(this);
                w(hVar);
                if (this.f9467b != 0) {
                    v(hVar);
                }
                onBuilt();
                return hVar;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b m1140clearField(r.g gVar) {
                return (b) super.j(gVar);
            }

            /* JADX INFO: renamed from: y */
            public b clone() {
                return (b) super.m1147clone();
            }

            /* synthetic */ b(k0.c cVar, a aVar) {
                this(cVar);
            }

            private b() {
                List list = Collections.EMPTY_LIST;
                this.f9468c = list;
                this.f9470e = list;
                this.f9474r = 1;
                K();
            }

            private b(k0.c cVar) {
                super(cVar);
                List list = Collections.EMPTY_LIST;
                this.f9468c = list;
                this.f9470e = list;
                this.f9474r = 1;
                K();
            }
        }

        public static final class c extends k0 implements o1 {

            /* JADX INFO: renamed from: h */
            private static final c f9475h = new c();

            /* JADX INFO: renamed from: r */
            public static final z1 f9476r = new a();

            /* JADX INFO: renamed from: a */
            private int f9477a;

            /* JADX INFO: renamed from: b */
            private int f9478b;

            /* JADX INFO: renamed from: c */
            private volatile Object f9479c;

            /* JADX INFO: renamed from: d */
            private volatile Object f9480d;

            /* JADX INFO: renamed from: e */
            private boolean f9481e;

            /* JADX INFO: renamed from: f */
            private boolean f9482f;

            /* JADX INFO: renamed from: g */
            private byte f9483g;

            class a extends com.google.protobuf.c {
                a() {
                }

                @Override // com.google.protobuf.z1
                /* JADX INFO: renamed from: c */
                public c parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                    b bVarQ = c.Q();
                    try {
                        bVarQ.mergeFrom(mVar, yVar);
                        return bVarQ.buildPartial();
                    } catch (p0 e10) {
                        throw e10.j(bVarQ.buildPartial());
                    } catch (r2 e11) {
                        throw e11.a().j(bVarQ.buildPartial());
                    } catch (IOException e12) {
                        throw new p0(e12).j(bVarQ.buildPartial());
                    }
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                    return super.parseDelimitedFrom(inputStream);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                    return super.parseFrom(lVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialDelimitedFrom */
                public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                    return super.mo1183parsePartialDelimitedFrom(inputStream);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                    return super.mo1185parsePartialFrom(lVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                    return super.parseDelimitedFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                    return super.parseFrom(lVar, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialDelimitedFrom */
                public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                    return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                    return super.mo1186parsePartialFrom(lVar, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                    return super.parseFrom(mVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                    return super.mo1187parsePartialFrom(mVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                    return super.parseFrom(mVar, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                    return super.parseFrom(inputStream);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                    return super.mo1188parsePartialFrom(inputStream);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                    return super.parseFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                    return super.mo1189parsePartialFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                    return super.parseFrom(byteBuffer);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                    return super.mo1190parsePartialFrom(bArr);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                    return super.parseFrom(byteBuffer, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                    return super.mo1191parsePartialFrom(bArr, i10, i11);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                    return super.parseFrom(bArr);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                    return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parseFrom */
                public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                    return super.mo1181parseFrom(bArr, i10, i11);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                    return super.mo1193parsePartialFrom(bArr, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parseFrom */
                public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                    return super.mo1182parseFrom(bArr, i10, i11, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                    return super.parseFrom(bArr, yVar);
                }
            }

            public static final class b extends k0.b implements o1 {

                /* JADX INFO: renamed from: a */
                private int f9484a;

                /* JADX INFO: renamed from: b */
                private int f9485b;

                /* JADX INFO: renamed from: c */
                private Object f9486c;

                /* JADX INFO: renamed from: d */
                private Object f9487d;

                /* JADX INFO: renamed from: e */
                private boolean f9488e;

                /* JADX INFO: renamed from: f */
                private boolean f9489f;

                /* synthetic */ b(a aVar) {
                    this();
                }

                private void j(c cVar) {
                    int i10;
                    int i11 = this.f9484a;
                    if ((i11 & 1) != 0) {
                        cVar.f9478b = this.f9485b;
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if ((i11 & 2) != 0) {
                        cVar.f9479c = this.f9486c;
                        i10 |= 2;
                    }
                    if ((i11 & 4) != 0) {
                        cVar.f9480d = this.f9487d;
                        i10 |= 4;
                    }
                    if ((i11 & 8) != 0) {
                        cVar.f9481e = this.f9488e;
                        i10 |= 8;
                    }
                    if ((i11 & 16) != 0) {
                        cVar.f9482f = this.f9489f;
                        i10 |= 16;
                    }
                    c.v(cVar, i10);
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: g */
                public b addRepeatedField(r.g gVar, Object obj) {
                    return (b) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                public r.b getDescriptorForType() {
                    return q.f9308m;
                }

                @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
                /* JADX INFO: renamed from: h */
                public c build() {
                    c cVarBuildPartial = buildPartial();
                    if (cVarBuildPartial.isInitialized()) {
                        return cVarBuildPartial;
                    }
                    throw a.AbstractC0131a.newUninitializedMessageException((i1) cVarBuildPartial);
                }

                @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
                /* JADX INFO: renamed from: i */
                public c buildPartial() {
                    c cVar = new c(this);
                    if (this.f9484a != 0) {
                        j(cVar);
                    }
                    onBuilt();
                    return cVar;
                }

                @Override // com.google.protobuf.k0.b
                protected k0.f internalGetFieldAccessorTable() {
                    return q.f9310n.d(c.class, b.class);
                }

                @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.k0.b
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public b m1140clearField(r.g gVar) {
                    return (b) super.m1140clearField(gVar);
                }

                /* JADX INFO: renamed from: m */
                public b clone() {
                    return (b) super.m1147clone();
                }

                @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                /* JADX INFO: renamed from: n */
                public c getDefaultInstanceForType() {
                    return c.w();
                }

                @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
                /* JADX INFO: renamed from: o */
                public b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                    yVar.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int iK = mVar.K();
                                if (iK != 0) {
                                    if (iK == 8) {
                                        this.f9485b = mVar.y();
                                        this.f9484a |= 1;
                                    } else if (iK == 18) {
                                        this.f9486c = mVar.r();
                                        this.f9484a |= 2;
                                    } else if (iK == 26) {
                                        this.f9487d = mVar.r();
                                        this.f9484a |= 4;
                                    } else if (iK == 40) {
                                        this.f9488e = mVar.q();
                                        this.f9484a |= 8;
                                    } else if (iK == 48) {
                                        this.f9489f = mVar.q();
                                        this.f9484a |= 16;
                                    } else if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                }
                                z10 = true;
                            } catch (p0 e10) {
                                throw e10.n();
                            }
                        } catch (Throwable th2) {
                            onChanged();
                            throw th2;
                        }
                    }
                    onChanged();
                    return this;
                }

                public b p(c cVar) {
                    if (cVar == c.w()) {
                        return this;
                    }
                    if (cVar.K()) {
                        v(cVar.A());
                    }
                    if (cVar.H()) {
                        this.f9486c = cVar.f9479c;
                        this.f9484a |= 2;
                        onChanged();
                    }
                    if (cVar.O()) {
                        this.f9487d = cVar.f9480d;
                        this.f9484a |= 4;
                        onChanged();
                    }
                    if (cVar.N()) {
                        x(cVar.D());
                    }
                    if (cVar.L()) {
                        w(cVar.C());
                    }
                    m141mergeUnknownFields(cVar.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: r */
                public b mergeFrom(i1 i1Var) {
                    if (i1Var instanceof c) {
                        return p((c) i1Var);
                    }
                    super.mergeFrom(i1Var);
                    return this;
                }

                @Override // com.google.protobuf.a.AbstractC0131a
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public final b m1148mergeUnknownFields(t2 t2Var) {
                    return (b) super.m1148mergeUnknownFields(t2Var);
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: u */
                public b setField(r.g gVar, Object obj) {
                    return (b) super.setField(gVar, obj);
                }

                public b v(int i10) {
                    this.f9485b = i10;
                    this.f9484a |= 1;
                    onChanged();
                    return this;
                }

                public b w(boolean z10) {
                    this.f9489f = z10;
                    this.f9484a |= 16;
                    onChanged();
                    return this;
                }

                public b x(boolean z10) {
                    this.f9488e = z10;
                    this.f9484a |= 8;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: y */
                public final b setUnknownFields(t2 t2Var) {
                    return (b) super.setUnknownFields(t2Var);
                }

                /* synthetic */ b(k0.c cVar, a aVar) {
                    this(cVar);
                }

                private b() {
                    this.f9486c = "";
                    this.f9487d = "";
                }

                private b(k0.c cVar) {
                    super(cVar);
                    this.f9486c = "";
                    this.f9487d = "";
                }
            }

            /* synthetic */ c(k0.b bVar, a aVar) {
                this(bVar);
            }

            public static b Q() {
                return f9475h.toBuilder();
            }

            public static final r.b getDescriptor() {
                return q.f9308m;
            }

            static /* synthetic */ int v(c cVar, int i10) {
                int i11 = i10 | cVar.f9477a;
                cVar.f9477a = i11;
                return i11;
            }

            public static c w() {
                return f9475h;
            }

            public int A() {
                return this.f9478b;
            }

            public boolean C() {
                return this.f9482f;
            }

            public boolean D() {
                return this.f9481e;
            }

            public String G() {
                Object obj = this.f9480d;
                if (obj instanceof String) {
                    return (String) obj;
                }
                com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
                String strN = lVar.N();
                if (lVar.o()) {
                    this.f9480d = strN;
                }
                return strN;
            }

            public boolean H() {
                return (this.f9477a & 2) != 0;
            }

            public boolean K() {
                return (this.f9477a & 1) != 0;
            }

            public boolean L() {
                return (this.f9477a & 16) != 0;
            }

            public boolean N() {
                return (this.f9477a & 8) != 0;
            }

            public boolean O() {
                return (this.f9477a & 4) != 0;
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            /* JADX INFO: renamed from: R */
            public b newBuilderForType() {
                return Q();
            }

            @Override // com.google.protobuf.k0
            /* JADX INFO: renamed from: S */
            public b newBuilderForType(k0.c cVar) {
                return new b(cVar);
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            /* JADX INFO: renamed from: T */
            public b toBuilder() {
                return this == f9475h ? new b() : new b().p(this);
            }

            @Override // com.google.protobuf.a
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return super.equals(obj);
                }
                c cVar = (c) obj;
                if (K() != cVar.K()) {
                    return false;
                }
                if ((K() && A() != cVar.A()) || H() != cVar.H()) {
                    return false;
                }
                if ((H() && !z().equals(cVar.z())) || O() != cVar.O()) {
                    return false;
                }
                if ((O() && !G().equals(cVar.G())) || N() != cVar.N()) {
                    return false;
                }
                if ((!N() || D() == cVar.D()) && L() == cVar.L()) {
                    return (!L() || C() == cVar.C()) && getUnknownFields().equals(cVar.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            public z1 getParserForType() {
                return f9476r;
            }

            @Override // com.google.protobuf.l1
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iX = (this.f9477a & 1) != 0 ? com.google.protobuf.o.x(1, this.f9478b) : 0;
                if ((this.f9477a & 2) != 0) {
                    iX += k0.computeStringSize(2, this.f9479c);
                }
                if ((this.f9477a & 4) != 0) {
                    iX += k0.computeStringSize(3, this.f9480d);
                }
                if ((this.f9477a & 8) != 0) {
                    iX += com.google.protobuf.o.e(5, this.f9481e);
                }
                if ((this.f9477a & 16) != 0) {
                    iX += com.google.protobuf.o.e(6, this.f9482f);
                }
                int serializedSize = iX + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.a
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (K()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + A();
                }
                if (H()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + z().hashCode();
                }
                if (O()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + G().hashCode();
                }
                if (N()) {
                    iHashCode = (((iHashCode * 37) + 5) * 53) + o0.d(D());
                }
                if (L()) {
                    iHashCode = (((iHashCode * 37) + 6) * 53) + o0.d(C());
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.k0
            protected k0.f internalGetFieldAccessorTable() {
                return q.f9310n.d(c.class, b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9483g;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9483g = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.k0
            protected Object newInstance(k0.g gVar) {
                return new c();
            }

            @Override // com.google.protobuf.l1
            public void writeTo(com.google.protobuf.o oVar) throws IOException {
                if ((this.f9477a & 1) != 0) {
                    oVar.D0(1, this.f9478b);
                }
                if ((this.f9477a & 2) != 0) {
                    k0.writeString(oVar, 2, this.f9479c);
                }
                if ((this.f9477a & 4) != 0) {
                    k0.writeString(oVar, 3, this.f9480d);
                }
                if ((this.f9477a & 8) != 0) {
                    oVar.m0(5, this.f9481e);
                }
                if ((this.f9477a & 16) != 0) {
                    oVar.m0(6, this.f9482f);
                }
                getUnknownFields().writeTo(oVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: x */
            public c getDefaultInstanceForType() {
                return f9475h;
            }

            public String z() {
                Object obj = this.f9479c;
                if (obj instanceof String) {
                    return (String) obj;
                }
                com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
                String strN = lVar.N();
                if (lVar.o()) {
                    this.f9479c = strN;
                }
                return strN;
            }

            private c(k0.b bVar) {
                super(bVar);
                this.f9478b = 0;
                this.f9479c = "";
                this.f9480d = "";
                this.f9481e = false;
                this.f9482f = false;
                this.f9483g = (byte) -1;
            }

            private c() {
                this.f9478b = 0;
                this.f9479c = "";
                this.f9480d = "";
                this.f9481e = false;
                this.f9482f = false;
                this.f9483g = (byte) -1;
                this.f9479c = "";
                this.f9480d = "";
            }
        }

        public enum d implements o0.c {
            DECLARATION(0),
            UNVERIFIED(1);


            /* JADX INFO: renamed from: d */
            private static final o0.d f9492d = new a();

            /* JADX INFO: renamed from: e */
            private static final d[] f9493e = values();

            /* JADX INFO: renamed from: a */
            private final int f9495a;

            class a implements o0.d {
                a() {
                }
            }

            d(int i10) {
                this.f9495a = i10;
            }

            public static d a(int i10) {
                if (i10 == 0) {
                    return DECLARATION;
                }
                if (i10 != 1) {
                    return null;
                }
                return UNVERIFIED;
            }

            @Override // com.google.protobuf.o0.c
            public final int getNumber() {
                return this.f9495a;
            }
        }

        /* synthetic */ h(k0.d dVar, a aVar) {
            this(dVar);
        }

        static /* synthetic */ int C(h hVar, int i10) {
            int i11 = i10 | hVar.f9461b;
            hVar.f9461b = i11;
            return i11;
        }

        public static h H() {
            return f9459h;
        }

        public static b W() {
            return f9459h.toBuilder();
        }

        public static final r.b getDescriptor() {
            return q.f9304k;
        }

        public int D() {
            return this.f9463d.size();
        }

        public List G() {
            return this.f9463d;
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: K */
        public h getDefaultInstanceForType() {
            return f9459h;
        }

        public i L() {
            i iVar = this.f9464e;
            return iVar == null ? i.D() : iVar;
        }

        public v N(int i10) {
            return (v) this.f9462c.get(i10);
        }

        public int O() {
            return this.f9462c.size();
        }

        public List Q() {
            return this.f9462c;
        }

        public d R() {
            d dVarA = d.a(this.f9465f);
            return dVarA == null ? d.UNVERIFIED : dVarA;
        }

        public boolean S() {
            return (this.f9461b & 1) != 0;
        }

        public boolean T() {
            return (this.f9461b & 2) != 0;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: X */
        public b newBuilderForType() {
            return W();
        }

        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: Y */
        public b newBuilderForType(k0.c cVar) {
            return new b(cVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: Z */
        public b toBuilder() {
            return this == f9459h ? new b() : new b().N(this);
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h)) {
                return super.equals(obj);
            }
            h hVar = (h) obj;
            if (!Q().equals(hVar.Q()) || !G().equals(hVar.G()) || S() != hVar.S()) {
                return false;
            }
            if ((!S() || L().equals(hVar.L())) && T() == hVar.T()) {
                return (!T() || this.f9465f == hVar.f9465f) && getUnknownFields().equals(hVar.getUnknownFields()) && q().equals(hVar.q());
            }
            return false;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return f9460r;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = 0;
            for (int i11 = 0; i11 < this.f9463d.size(); i11++) {
                iG += com.google.protobuf.o.G(2, (l1) this.f9463d.get(i11));
            }
            if ((this.f9461b & 2) != 0) {
                iG += com.google.protobuf.o.l(3, this.f9465f);
            }
            if ((this.f9461b & 1) != 0) {
                iG += com.google.protobuf.o.G(50, L());
            }
            for (int i12 = 0; i12 < this.f9462c.size(); i12++) {
                iG += com.google.protobuf.o.G(999, (l1) this.f9462c.get(i12));
            }
            int iP = iG + p() + getUnknownFields().getSerializedSize();
            this.memoizedSize = iP;
            return iP;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (O() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + Q().hashCode();
            }
            if (D() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + G().hashCode();
            }
            if (S()) {
                iHashCode = (((iHashCode * 37) + 50) * 53) + L().hashCode();
            }
            if (T()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + this.f9465f;
            }
            int iHashFields = (com.google.protobuf.a.hashFields(iHashCode, q()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return q.f9306l.d(h.class, b.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9466g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < O(); i10++) {
                if (!N(i10).isInitialized()) {
                    this.f9466g = (byte) 0;
                    return false;
                }
            }
            if (S() && !L().isInitialized()) {
                this.f9466g = (byte) 0;
                return false;
            }
            if (o()) {
                this.f9466g = (byte) 1;
                return true;
            }
            this.f9466g = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new h();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) {
            k0.e.a aVarR = r();
            for (int i10 = 0; i10 < this.f9463d.size(); i10++) {
                oVar.H0(2, (l1) this.f9463d.get(i10));
            }
            if ((this.f9461b & 2) != 0) {
                oVar.u0(3, this.f9465f);
            }
            if ((this.f9461b & 1) != 0) {
                oVar.H0(50, L());
            }
            for (int i11 = 0; i11 < this.f9462c.size(); i11++) {
                oVar.H0(999, (l1) this.f9462c.get(i11));
            }
            aVarR.a(536870912, oVar);
            getUnknownFields().writeTo(oVar);
        }

        private h(k0.d dVar) {
            super(dVar);
            this.f9465f = 1;
            this.f9466g = (byte) -1;
        }

        private h() {
            this.f9465f = 1;
            this.f9466g = (byte) -1;
            List list = Collections.EMPTY_LIST;
            this.f9462c = list;
            this.f9463d = list;
            this.f9465f = 1;
        }
    }

    public static final class i extends k0.e implements o1 {

        /* JADX INFO: renamed from: s */
        private static final i f9496s = new i();

        /* JADX INFO: renamed from: t */
        public static final z1 f9497t = new a();

        /* JADX INFO: renamed from: b */
        private int f9498b;

        /* JADX INFO: renamed from: c */
        private int f9499c;

        /* JADX INFO: renamed from: d */
        private int f9500d;

        /* JADX INFO: renamed from: e */
        private int f9501e;

        /* JADX INFO: renamed from: f */
        private int f9502f;

        /* JADX INFO: renamed from: g */
        private int f9503g;

        /* JADX INFO: renamed from: h */
        private int f9504h;

        /* JADX INFO: renamed from: r */
        private byte f9505r;

        class a extends com.google.protobuf.c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c */
            public i parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                b bVarZ = i.Z();
                try {
                    bVarZ.mergeFrom(mVar, yVar);
                    return bVarZ.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(bVarZ.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(bVarZ.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(bVarZ.buildPartial());
                }
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                return super.parseDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                return super.parseFrom(lVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                return super.mo1183parsePartialDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                return super.mo1185parsePartialFrom(lVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                return super.parseDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                return super.parseFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                return super.mo1186parsePartialFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                return super.parseFrom(mVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                return super.mo1187parsePartialFrom(mVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                return super.parseFrom(mVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                return super.parseFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                return super.mo1188parsePartialFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                return super.parseFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                return super.mo1189parsePartialFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                return super.parseFrom(byteBuffer);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                return super.mo1190parsePartialFrom(bArr);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                return super.parseFrom(byteBuffer, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                return super.mo1191parsePartialFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                return super.mo1181parseFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                return super.mo1193parsePartialFrom(bArr, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1182parseFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                return super.parseFrom(bArr, yVar);
            }
        }

        public static final class b extends k0.d implements o1 {

            /* JADX INFO: renamed from: b */
            private int f9506b;

            /* JADX INFO: renamed from: c */
            private int f9507c;

            /* JADX INFO: renamed from: d */
            private int f9508d;

            /* JADX INFO: renamed from: e */
            private int f9509e;

            /* JADX INFO: renamed from: f */
            private int f9510f;

            /* JADX INFO: renamed from: g */
            private int f9511g;

            /* JADX INFO: renamed from: h */
            private int f9512h;

            /* synthetic */ b(a aVar) {
                this();
            }

            private void v(i iVar) {
                int i10;
                int i11 = this.f9506b;
                if ((i11 & 1) != 0) {
                    iVar.f9499c = this.f9507c;
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 2) != 0) {
                    iVar.f9500d = this.f9508d;
                    i10 |= 2;
                }
                if ((i11 & 4) != 0) {
                    iVar.f9501e = this.f9509e;
                    i10 |= 4;
                }
                if ((i11 & 8) != 0) {
                    iVar.f9502f = this.f9510f;
                    i10 |= 8;
                }
                if ((i11 & 16) != 0) {
                    iVar.f9503g = this.f9511g;
                    i10 |= 16;
                }
                if ((i11 & 32) != 0) {
                    iVar.f9504h = this.f9512h;
                    i10 |= 32;
                }
                i.C(iVar, i10);
            }

            public b A(i iVar) {
                if (iVar == i.D()) {
                    return this;
                }
                if (iVar.S()) {
                    F(iVar.K());
                }
                if (iVar.R()) {
                    D(iVar.H());
                }
                if (iVar.X()) {
                    I(iVar.O());
                }
                if (iVar.Y()) {
                    K(iVar.Q());
                }
                if (iVar.W()) {
                    H(iVar.N());
                }
                if (iVar.T()) {
                    G(iVar.L());
                }
                n(iVar);
                m141mergeUnknownFields(iVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: B */
            public b mergeFrom(i1 i1Var) {
                if (i1Var instanceof i) {
                    return A((i) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
            public final b m1148mergeUnknownFields(t2 t2Var) {
                return (b) super.m1148mergeUnknownFields(t2Var);
            }

            public b D(c cVar) {
                cVar.getClass();
                this.f9506b |= 2;
                this.f9508d = cVar.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: E */
            public b setField(r.g gVar, Object obj) {
                return (b) super.o(gVar, obj);
            }

            public b F(d dVar) {
                dVar.getClass();
                this.f9506b |= 1;
                this.f9507c = dVar.getNumber();
                onChanged();
                return this;
            }

            public b G(e eVar) {
                eVar.getClass();
                this.f9506b |= 32;
                this.f9512h = eVar.getNumber();
                onChanged();
                return this;
            }

            public b H(f fVar) {
                fVar.getClass();
                this.f9506b |= 16;
                this.f9511g = fVar.getNumber();
                onChanged();
                return this;
            }

            public b I(g gVar) {
                gVar.getClass();
                this.f9506b |= 4;
                this.f9509e = gVar.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: J */
            public final b setUnknownFields(t2 t2Var) {
                return (b) super.setUnknownFields(t2Var);
            }

            public b K(h hVar) {
                hVar.getClass();
                this.f9506b |= 8;
                this.f9510f = hVar.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return q.Y;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return q.Z.d(i.class, b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return m();
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: r */
            public b addRepeatedField(r.g gVar, Object obj) {
                return (b) super.h(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: t */
            public i build() {
                i iVarBuildPartial = buildPartial();
                if (iVarBuildPartial.isInitialized()) {
                    return iVarBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) iVarBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: u */
            public i buildPartial() {
                i iVar = new i(this);
                if (this.f9506b != 0) {
                    v(iVar);
                }
                onBuilt();
                return iVar;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public b m1140clearField(r.g gVar) {
                return (b) super.j(gVar);
            }

            /* JADX INFO: renamed from: x */
            public b clone() {
                return (b) super.m1147clone();
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: y */
            public i getDefaultInstanceForType() {
                return i.D();
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: z */
            public b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    int iT = mVar.t();
                                    if (d.a(iT) == null) {
                                        mergeUnknownVarintField(1, iT);
                                    } else {
                                        this.f9507c = iT;
                                        this.f9506b |= 1;
                                    }
                                } else if (iK == 16) {
                                    int iT2 = mVar.t();
                                    if (c.a(iT2) == null) {
                                        mergeUnknownVarintField(2, iT2);
                                    } else {
                                        this.f9508d = iT2;
                                        this.f9506b |= 2;
                                    }
                                } else if (iK == 24) {
                                    int iT3 = mVar.t();
                                    if (g.a(iT3) == null) {
                                        mergeUnknownVarintField(3, iT3);
                                    } else {
                                        this.f9509e = iT3;
                                        this.f9506b |= 4;
                                    }
                                } else if (iK == 32) {
                                    int iT4 = mVar.t();
                                    if (h.a(iT4) == null) {
                                        mergeUnknownVarintField(4, iT4);
                                    } else {
                                        this.f9510f = iT4;
                                        this.f9506b |= 8;
                                    }
                                } else if (iK == 40) {
                                    int iT5 = mVar.t();
                                    if (f.a(iT5) == null) {
                                        mergeUnknownVarintField(5, iT5);
                                    } else {
                                        this.f9511g = iT5;
                                        this.f9506b |= 16;
                                    }
                                } else if (iK == 48) {
                                    int iT6 = mVar.t();
                                    if (e.a(iT6) == null) {
                                        mergeUnknownVarintField(6, iT6);
                                    } else {
                                        this.f9512h = iT6;
                                        this.f9506b |= 32;
                                    }
                                } else if (!super.parseUnknownField(mVar, yVar, iK)) {
                                }
                            }
                            z10 = true;
                        } catch (p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }

            /* synthetic */ b(k0.c cVar, a aVar) {
                this(cVar);
            }

            private b() {
                this.f9507c = 0;
                this.f9508d = 0;
                this.f9509e = 0;
                this.f9510f = 0;
                this.f9511g = 0;
                this.f9512h = 0;
            }

            private b(k0.c cVar) {
                super(cVar);
                this.f9507c = 0;
                this.f9508d = 0;
                this.f9509e = 0;
                this.f9510f = 0;
                this.f9511g = 0;
                this.f9512h = 0;
            }
        }

        public enum c implements o0.c {
            ENUM_TYPE_UNKNOWN(0),
            OPEN(1),
            CLOSED(2);


            /* JADX INFO: renamed from: e */
            private static final o0.d f9516e = new a();

            /* JADX INFO: renamed from: f */
            private static final c[] f9517f = values();

            /* JADX INFO: renamed from: a */
            private final int f9519a;

            class a implements o0.d {
                a() {
                }
            }

            c(int i10) {
                this.f9519a = i10;
            }

            public static c a(int i10) {
                if (i10 == 0) {
                    return ENUM_TYPE_UNKNOWN;
                }
                if (i10 == 1) {
                    return OPEN;
                }
                if (i10 != 2) {
                    return null;
                }
                return CLOSED;
            }

            @Override // com.google.protobuf.o0.c
            public final int getNumber() {
                return this.f9519a;
            }
        }

        public enum d implements o0.c {
            FIELD_PRESENCE_UNKNOWN(0),
            EXPLICIT(1),
            IMPLICIT(2),
            LEGACY_REQUIRED(3);


            /* JADX INFO: renamed from: f */
            private static final o0.d f9524f = new a();

            /* JADX INFO: renamed from: g */
            private static final d[] f9525g = values();

            /* JADX INFO: renamed from: a */
            private final int f9527a;

            class a implements o0.d {
                a() {
                }
            }

            d(int i10) {
                this.f9527a = i10;
            }

            public static d a(int i10) {
                if (i10 == 0) {
                    return FIELD_PRESENCE_UNKNOWN;
                }
                if (i10 == 1) {
                    return EXPLICIT;
                }
                if (i10 == 2) {
                    return IMPLICIT;
                }
                if (i10 != 3) {
                    return null;
                }
                return LEGACY_REQUIRED;
            }

            @Override // com.google.protobuf.o0.c
            public final int getNumber() {
                return this.f9527a;
            }
        }

        public enum e implements o0.c {
            JSON_FORMAT_UNKNOWN(0),
            ALLOW(1),
            LEGACY_BEST_EFFORT(2);


            /* JADX INFO: renamed from: e */
            private static final o0.d f9531e = new a();

            /* JADX INFO: renamed from: f */
            private static final e[] f9532f = values();

            /* JADX INFO: renamed from: a */
            private final int f9534a;

            class a implements o0.d {
                a() {
                }
            }

            e(int i10) {
                this.f9534a = i10;
            }

            public static e a(int i10) {
                if (i10 == 0) {
                    return JSON_FORMAT_UNKNOWN;
                }
                if (i10 == 1) {
                    return ALLOW;
                }
                if (i10 != 2) {
                    return null;
                }
                return LEGACY_BEST_EFFORT;
            }

            @Override // com.google.protobuf.o0.c
            public final int getNumber() {
                return this.f9534a;
            }
        }

        public enum f implements o0.c {
            MESSAGE_ENCODING_UNKNOWN(0),
            LENGTH_PREFIXED(1),
            DELIMITED(2);


            /* JADX INFO: renamed from: e */
            private static final o0.d f9538e = new a();

            /* JADX INFO: renamed from: f */
            private static final f[] f9539f = values();

            /* JADX INFO: renamed from: a */
            private final int f9541a;

            class a implements o0.d {
                a() {
                }
            }

            f(int i10) {
                this.f9541a = i10;
            }

            public static f a(int i10) {
                if (i10 == 0) {
                    return MESSAGE_ENCODING_UNKNOWN;
                }
                if (i10 == 1) {
                    return LENGTH_PREFIXED;
                }
                if (i10 != 2) {
                    return null;
                }
                return DELIMITED;
            }

            @Override // com.google.protobuf.o0.c
            public final int getNumber() {
                return this.f9541a;
            }
        }

        public enum g implements o0.c {
            REPEATED_FIELD_ENCODING_UNKNOWN(0),
            PACKED(1),
            EXPANDED(2);


            /* JADX INFO: renamed from: e */
            private static final o0.d f9545e = new a();

            /* JADX INFO: renamed from: f */
            private static final g[] f9546f = values();

            /* JADX INFO: renamed from: a */
            private final int f9548a;

            class a implements o0.d {
                a() {
                }
            }

            g(int i10) {
                this.f9548a = i10;
            }

            public static g a(int i10) {
                if (i10 == 0) {
                    return REPEATED_FIELD_ENCODING_UNKNOWN;
                }
                if (i10 == 1) {
                    return PACKED;
                }
                if (i10 != 2) {
                    return null;
                }
                return EXPANDED;
            }

            @Override // com.google.protobuf.o0.c
            public final int getNumber() {
                return this.f9548a;
            }
        }

        public enum h implements o0.c {
            UTF8_VALIDATION_UNKNOWN(0),
            NONE(1),
            VERIFY(2);


            /* JADX INFO: renamed from: e */
            private static final o0.d f9552e = new a();

            /* JADX INFO: renamed from: f */
            private static final h[] f9553f = values();

            /* JADX INFO: renamed from: a */
            private final int f9555a;

            class a implements o0.d {
                a() {
                }
            }

            h(int i10) {
                this.f9555a = i10;
            }

            public static h a(int i10) {
                if (i10 == 0) {
                    return UTF8_VALIDATION_UNKNOWN;
                }
                if (i10 == 1) {
                    return NONE;
                }
                if (i10 != 2) {
                    return null;
                }
                return VERIFY;
            }

            @Override // com.google.protobuf.o0.c
            public final int getNumber() {
                return this.f9555a;
            }
        }

        /* synthetic */ i(k0.d dVar, a aVar) {
            this(dVar);
        }

        static /* synthetic */ int C(i iVar, int i10) {
            int i11 = i10 | iVar.f9498b;
            iVar.f9498b = i11;
            return i11;
        }

        public static i D() {
            return f9496s;
        }

        public static b Z() {
            return f9496s.toBuilder();
        }

        public static final r.b getDescriptor() {
            return q.Y;
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: G */
        public i getDefaultInstanceForType() {
            return f9496s;
        }

        public c H() {
            c cVarA = c.a(this.f9500d);
            return cVarA == null ? c.ENUM_TYPE_UNKNOWN : cVarA;
        }

        public d K() {
            d dVarA = d.a(this.f9499c);
            return dVarA == null ? d.FIELD_PRESENCE_UNKNOWN : dVarA;
        }

        public e L() {
            e eVarA = e.a(this.f9504h);
            return eVarA == null ? e.JSON_FORMAT_UNKNOWN : eVarA;
        }

        public f N() {
            f fVarA = f.a(this.f9503g);
            return fVarA == null ? f.MESSAGE_ENCODING_UNKNOWN : fVarA;
        }

        public g O() {
            g gVarA = g.a(this.f9501e);
            return gVarA == null ? g.REPEATED_FIELD_ENCODING_UNKNOWN : gVarA;
        }

        public h Q() {
            h hVarA = h.a(this.f9502f);
            return hVarA == null ? h.UTF8_VALIDATION_UNKNOWN : hVarA;
        }

        public boolean R() {
            return (this.f9498b & 2) != 0;
        }

        public boolean S() {
            return (this.f9498b & 1) != 0;
        }

        public boolean T() {
            return (this.f9498b & 32) != 0;
        }

        public boolean W() {
            return (this.f9498b & 16) != 0;
        }

        public boolean X() {
            return (this.f9498b & 4) != 0;
        }

        public boolean Y() {
            return (this.f9498b & 8) != 0;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: a0 */
        public b newBuilderForType() {
            return Z();
        }

        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: b0 */
        public b newBuilderForType(k0.c cVar) {
            return new b(cVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: c0 */
        public b toBuilder() {
            return this == f9496s ? new b() : new b().A(this);
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return super.equals(obj);
            }
            i iVar = (i) obj;
            if (S() != iVar.S()) {
                return false;
            }
            if ((S() && this.f9499c != iVar.f9499c) || R() != iVar.R()) {
                return false;
            }
            if ((R() && this.f9500d != iVar.f9500d) || X() != iVar.X()) {
                return false;
            }
            if ((X() && this.f9501e != iVar.f9501e) || Y() != iVar.Y()) {
                return false;
            }
            if ((Y() && this.f9502f != iVar.f9502f) || W() != iVar.W()) {
                return false;
            }
            if ((!W() || this.f9503g == iVar.f9503g) && T() == iVar.T()) {
                return (!T() || this.f9504h == iVar.f9504h) && getUnknownFields().equals(iVar.getUnknownFields()) && q().equals(iVar.q());
            }
            return false;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return f9497t;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iL = (this.f9498b & 1) != 0 ? com.google.protobuf.o.l(1, this.f9499c) : 0;
            if ((this.f9498b & 2) != 0) {
                iL += com.google.protobuf.o.l(2, this.f9500d);
            }
            if ((this.f9498b & 4) != 0) {
                iL += com.google.protobuf.o.l(3, this.f9501e);
            }
            if ((this.f9498b & 8) != 0) {
                iL += com.google.protobuf.o.l(4, this.f9502f);
            }
            if ((this.f9498b & 16) != 0) {
                iL += com.google.protobuf.o.l(5, this.f9503g);
            }
            if ((this.f9498b & 32) != 0) {
                iL += com.google.protobuf.o.l(6, this.f9504h);
            }
            int iP = iL + p() + getUnknownFields().getSerializedSize();
            this.memoizedSize = iP;
            return iP;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (S()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.f9499c;
            }
            if (R()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + this.f9500d;
            }
            if (X()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + this.f9501e;
            }
            if (Y()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + this.f9502f;
            }
            if (W()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + this.f9503g;
            }
            if (T()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + this.f9504h;
            }
            int iHashFields = (com.google.protobuf.a.hashFields(iHashCode, q()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return q.Z.d(i.class, b.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9505r;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (o()) {
                this.f9505r = (byte) 1;
                return true;
            }
            this.f9505r = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new i();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) {
            k0.e.a aVarR = r();
            if ((this.f9498b & 1) != 0) {
                oVar.u0(1, this.f9499c);
            }
            if ((this.f9498b & 2) != 0) {
                oVar.u0(2, this.f9500d);
            }
            if ((this.f9498b & 4) != 0) {
                oVar.u0(3, this.f9501e);
            }
            if ((this.f9498b & 8) != 0) {
                oVar.u0(4, this.f9502f);
            }
            if ((this.f9498b & 16) != 0) {
                oVar.u0(5, this.f9503g);
            }
            if ((this.f9498b & 32) != 0) {
                oVar.u0(6, this.f9504h);
            }
            aVarR.a(10000, oVar);
            getUnknownFields().writeTo(oVar);
        }

        private i(k0.d dVar) {
            super(dVar);
            this.f9499c = 0;
            this.f9500d = 0;
            this.f9501e = 0;
            this.f9502f = 0;
            this.f9503g = 0;
            this.f9504h = 0;
            this.f9505r = (byte) -1;
        }

        private i() {
            this.f9505r = (byte) -1;
            this.f9499c = 0;
            this.f9500d = 0;
            this.f9501e = 0;
            this.f9502f = 0;
            this.f9503g = 0;
            this.f9504h = 0;
        }
    }

    public static final class j extends k0 implements o1 {

        /* JADX INFO: renamed from: w */
        private static final j f9556w = new j();

        /* JADX INFO: renamed from: x */
        public static final z1 f9557x = new a();

        /* JADX INFO: renamed from: a */
        private int f9558a;

        /* JADX INFO: renamed from: b */
        private volatile Object f9559b;

        /* JADX INFO: renamed from: c */
        private int f9560c;

        /* JADX INFO: renamed from: d */
        private int f9561d;

        /* JADX INFO: renamed from: e */
        private int f9562e;

        /* JADX INFO: renamed from: f */
        private volatile Object f9563f;

        /* JADX INFO: renamed from: g */
        private volatile Object f9564g;

        /* JADX INFO: renamed from: h */
        private volatile Object f9565h;

        /* JADX INFO: renamed from: r */
        private int f9566r;

        /* JADX INFO: renamed from: s */
        private volatile Object f9567s;

        /* JADX INFO: renamed from: t */
        private k f9568t;

        /* JADX INFO: renamed from: u */
        private boolean f9569u;

        /* JADX INFO: renamed from: v */
        private byte f9570v;

        class a extends com.google.protobuf.c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c */
            public j parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                b bVarM0 = j.m0();
                try {
                    bVarM0.mergeFrom(mVar, yVar);
                    return bVarM0.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(bVarM0.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(bVarM0.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(bVarM0.buildPartial());
                }
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                return super.parseDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                return super.parseFrom(lVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                return super.mo1183parsePartialDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                return super.mo1185parsePartialFrom(lVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                return super.parseDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                return super.parseFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                return super.mo1186parsePartialFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                return super.parseFrom(mVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                return super.mo1187parsePartialFrom(mVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                return super.parseFrom(mVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                return super.parseFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                return super.mo1188parsePartialFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                return super.parseFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                return super.mo1189parsePartialFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                return super.parseFrom(byteBuffer);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                return super.mo1190parsePartialFrom(bArr);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                return super.parseFrom(byteBuffer, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                return super.mo1191parsePartialFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                return super.mo1181parseFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                return super.mo1193parsePartialFrom(bArr, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1182parseFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                return super.parseFrom(bArr, yVar);
            }
        }

        public static final class b extends k0.b implements o1 {

            /* JADX INFO: renamed from: a */
            private int f9571a;

            /* JADX INFO: renamed from: b */
            private Object f9572b;

            /* JADX INFO: renamed from: c */
            private int f9573c;

            /* JADX INFO: renamed from: d */
            private int f9574d;

            /* JADX INFO: renamed from: e */
            private int f9575e;

            /* JADX INFO: renamed from: f */
            private Object f9576f;

            /* JADX INFO: renamed from: g */
            private Object f9577g;

            /* JADX INFO: renamed from: h */
            private Object f9578h;

            /* JADX INFO: renamed from: r */
            private int f9579r;

            /* JADX INFO: renamed from: s */
            private Object f9580s;

            /* JADX INFO: renamed from: t */
            private k f9581t;

            /* JADX INFO: renamed from: u */
            private k2 f9582u;

            /* JADX INFO: renamed from: v */
            private boolean f9583v;

            /* synthetic */ b(a aVar) {
                this();
            }

            private void j(j jVar) {
                int i10;
                int i11 = this.f9571a;
                if ((i11 & 1) != 0) {
                    jVar.f9559b = this.f9572b;
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 2) != 0) {
                    jVar.f9560c = this.f9573c;
                    i10 |= 2;
                }
                if ((i11 & 4) != 0) {
                    jVar.f9561d = this.f9574d;
                    i10 |= 4;
                }
                if ((i11 & 8) != 0) {
                    jVar.f9562e = this.f9575e;
                    i10 |= 8;
                }
                if ((i11 & 16) != 0) {
                    jVar.f9563f = this.f9576f;
                    i10 |= 16;
                }
                if ((i11 & 32) != 0) {
                    jVar.f9564g = this.f9577g;
                    i10 |= 32;
                }
                if ((i11 & 64) != 0) {
                    jVar.f9565h = this.f9578h;
                    i10 |= 64;
                }
                if ((i11 & 128) != 0) {
                    jVar.f9566r = this.f9579r;
                    i10 |= 128;
                }
                if ((i11 & 256) != 0) {
                    jVar.f9567s = this.f9580s;
                    i10 |= 256;
                }
                if ((i11 & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0) {
                    k2 k2Var = this.f9582u;
                    jVar.f9568t = k2Var == null ? this.f9581t : (k) k2Var.b();
                    i10 |= WXMediaMessage.TITLE_LENGTH_LIMIT;
                }
                if ((i11 & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0) {
                    jVar.f9569u = this.f9583v;
                    i10 |= WXMediaMessage.DESCRIPTION_LENGTH_LIMIT;
                }
                j.K(jVar, i10);
            }

            private k2 r() {
                if (this.f9582u == null) {
                    this.f9582u = new k2(o(), getParentForChildren(), isClean());
                    this.f9581t = null;
                }
                return this.f9582u;
            }

            private void u() {
                if (k0.alwaysUseFieldBuilders) {
                    r();
                }
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: A */
            public b setField(r.g gVar, Object obj) {
                return (b) super.setField(gVar, obj);
            }

            public b B(c cVar) {
                cVar.getClass();
                this.f9571a |= 4;
                this.f9574d = cVar.getNumber();
                onChanged();
                return this;
            }

            public b C(int i10) {
                this.f9573c = i10;
                this.f9571a |= 2;
                onChanged();
                return this;
            }

            public b D(int i10) {
                this.f9579r = i10;
                this.f9571a |= 128;
                onChanged();
                return this;
            }

            public b E(boolean z10) {
                this.f9583v = z10;
                this.f9571a |= WXMediaMessage.DESCRIPTION_LENGTH_LIMIT;
                onChanged();
                return this;
            }

            public b F(d dVar) {
                dVar.getClass();
                this.f9571a |= 8;
                this.f9575e = dVar.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: G */
            public final b setUnknownFields(t2 t2Var) {
                return (b) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: g */
            public b addRepeatedField(r.g gVar, Object obj) {
                return (b) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return q.f9311o;
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: h */
            public j build() {
                j jVarBuildPartial = buildPartial();
                if (jVarBuildPartial.isInitialized()) {
                    return jVarBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) jVarBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: i */
            public j buildPartial() {
                j jVar = new j(this);
                if (this.f9571a != 0) {
                    j(jVar);
                }
                onBuilt();
                return jVar;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return q.f9312p.d(j.class, b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return !t() || o().isInitialized();
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public b m1140clearField(r.g gVar) {
                return (b) super.m1140clearField(gVar);
            }

            /* JADX INFO: renamed from: m */
            public b clone() {
                return (b) super.m1147clone();
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: n */
            public j getDefaultInstanceForType() {
                return j.L();
            }

            public k o() {
                k2 k2Var = this.f9582u;
                if (k2Var != null) {
                    return (k) k2Var.f();
                }
                k kVar = this.f9581t;
                return kVar == null ? k.X() : kVar;
            }

            public k.c p() {
                this.f9571a |= WXMediaMessage.TITLE_LENGTH_LIMIT;
                onChanged();
                return (k.c) r().e();
            }

            public boolean t() {
                return (this.f9571a & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: v */
            public b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            switch (iK) {
                                case 0:
                                    z10 = true;
                                    break;
                                case 10:
                                    this.f9572b = mVar.r();
                                    this.f9571a |= 1;
                                    break;
                                case 18:
                                    this.f9577g = mVar.r();
                                    this.f9571a |= 32;
                                    break;
                                case 24:
                                    this.f9573c = mVar.y();
                                    this.f9571a |= 2;
                                    break;
                                case 32:
                                    int iT = mVar.t();
                                    if (c.a(iT) == null) {
                                        mergeUnknownVarintField(4, iT);
                                    } else {
                                        this.f9574d = iT;
                                        this.f9571a |= 4;
                                    }
                                    break;
                                case 40:
                                    int iT2 = mVar.t();
                                    if (d.a(iT2) == null) {
                                        mergeUnknownVarintField(5, iT2);
                                    } else {
                                        this.f9575e = iT2;
                                        this.f9571a |= 8;
                                    }
                                    break;
                                case 50:
                                    this.f9576f = mVar.r();
                                    this.f9571a |= 16;
                                    break;
                                case 58:
                                    this.f9578h = mVar.r();
                                    this.f9571a |= 64;
                                    break;
                                case 66:
                                    mVar.B(r().e(), yVar);
                                    this.f9571a |= WXMediaMessage.TITLE_LENGTH_LIMIT;
                                    break;
                                case 72:
                                    this.f9579r = mVar.y();
                                    this.f9571a |= 128;
                                    break;
                                case 82:
                                    this.f9580s = mVar.r();
                                    this.f9571a |= 256;
                                    break;
                                case 136:
                                    this.f9583v = mVar.q();
                                    this.f9571a |= WXMediaMessage.DESCRIPTION_LENGTH_LIMIT;
                                    break;
                                default:
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                        z10 = true;
                                    }
                                    break;
                            }
                        } catch (p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }

            public b w(j jVar) {
                if (jVar == j.L()) {
                    return this;
                }
                if (jVar.f0()) {
                    this.f9572b = jVar.f9559b;
                    this.f9571a |= 1;
                    onChanged();
                }
                if (jVar.g0()) {
                    C(jVar.T());
                }
                if (jVar.e0()) {
                    B(jVar.S());
                }
                if (jVar.k0()) {
                    F(jVar.Z());
                }
                if (jVar.l0()) {
                    this.f9576f = jVar.f9563f;
                    this.f9571a |= 16;
                    onChanged();
                }
                if (jVar.c0()) {
                    this.f9577g = jVar.f9564g;
                    this.f9571a |= 32;
                    onChanged();
                }
                if (jVar.b0()) {
                    this.f9578h = jVar.f9565h;
                    this.f9571a |= 64;
                    onChanged();
                }
                if (jVar.h0()) {
                    D(jVar.W());
                }
                if (jVar.d0()) {
                    this.f9580s = jVar.f9567s;
                    this.f9571a |= 256;
                    onChanged();
                }
                if (jVar.i0()) {
                    y(jVar.X());
                }
                if (jVar.j0()) {
                    E(jVar.Y());
                }
                m141mergeUnknownFields(jVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: x */
            public b mergeFrom(i1 i1Var) {
                if (i1Var instanceof j) {
                    return w((j) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public b y(k kVar) {
                k kVar2;
                k2 k2Var = this.f9582u;
                if (k2Var != null) {
                    k2Var.h(kVar);
                } else if ((this.f9571a & WXMediaMessage.TITLE_LENGTH_LIMIT) == 0 || (kVar2 = this.f9581t) == null || kVar2 == k.X()) {
                    this.f9581t = kVar;
                } else {
                    p().O(kVar);
                }
                if (this.f9581t != null) {
                    this.f9571a |= WXMediaMessage.TITLE_LENGTH_LIMIT;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public final b m1148mergeUnknownFields(t2 t2Var) {
                return (b) super.m1148mergeUnknownFields(t2Var);
            }

            /* synthetic */ b(k0.c cVar, a aVar) {
                this(cVar);
            }

            private b() {
                this.f9572b = "";
                this.f9574d = 1;
                this.f9575e = 1;
                this.f9576f = "";
                this.f9577g = "";
                this.f9578h = "";
                this.f9580s = "";
                u();
            }

            private b(k0.c cVar) {
                super(cVar);
                this.f9572b = "";
                this.f9574d = 1;
                this.f9575e = 1;
                this.f9576f = "";
                this.f9577g = "";
                this.f9578h = "";
                this.f9580s = "";
                u();
            }
        }

        public enum c implements o0.c {
            LABEL_OPTIONAL(1),
            LABEL_REPEATED(3),
            LABEL_REQUIRED(2);


            /* JADX INFO: renamed from: e */
            private static final o0.d f9587e = new a();

            /* JADX INFO: renamed from: f */
            private static final c[] f9588f = values();

            /* JADX INFO: renamed from: a */
            private final int f9590a;

            class a implements o0.d {
                a() {
                }
            }

            c(int i10) {
                this.f9590a = i10;
            }

            public static c a(int i10) {
                if (i10 == 1) {
                    return LABEL_OPTIONAL;
                }
                if (i10 == 2) {
                    return LABEL_REQUIRED;
                }
                if (i10 != 3) {
                    return null;
                }
                return LABEL_REPEATED;
            }

            @Override // com.google.protobuf.o0.c
            public final int getNumber() {
                return this.f9590a;
            }
        }

        public enum d implements o0.c {
            TYPE_DOUBLE(1),
            TYPE_FLOAT(2),
            TYPE_INT64(3),
            TYPE_UINT64(4),
            TYPE_INT32(5),
            TYPE_FIXED64(6),
            TYPE_FIXED32(7),
            TYPE_BOOL(8),
            TYPE_STRING(9),
            TYPE_GROUP(10),
            TYPE_MESSAGE(11),
            TYPE_BYTES(12),
            TYPE_UINT32(13),
            TYPE_ENUM(14),
            TYPE_SFIXED32(15),
            TYPE_SFIXED64(16),
            TYPE_SINT32(17),
            TYPE_SINT64(18);

            private static final o0.d C = new a();
            private static final d[] D = values();

            /* JADX INFO: renamed from: a */
            private final int f9607a;

            class a implements o0.d {
                a() {
                }
            }

            d(int i10) {
                this.f9607a = i10;
            }

            public static d a(int i10) {
                switch (i10) {
                    case 1:
                        return TYPE_DOUBLE;
                    case 2:
                        return TYPE_FLOAT;
                    case 3:
                        return TYPE_INT64;
                    case 4:
                        return TYPE_UINT64;
                    case 5:
                        return TYPE_INT32;
                    case 6:
                        return TYPE_FIXED64;
                    case 7:
                        return TYPE_FIXED32;
                    case 8:
                        return TYPE_BOOL;
                    case 9:
                        return TYPE_STRING;
                    case 10:
                        return TYPE_GROUP;
                    case 11:
                        return TYPE_MESSAGE;
                    case 12:
                        return TYPE_BYTES;
                    case 13:
                        return TYPE_UINT32;
                    case 14:
                        return TYPE_ENUM;
                    case 15:
                        return TYPE_SFIXED32;
                    case 16:
                        return TYPE_SFIXED64;
                    case 17:
                        return TYPE_SINT32;
                    case 18:
                        return TYPE_SINT64;
                    default:
                        return null;
                }
            }

            @Override // com.google.protobuf.o0.c
            public final int getNumber() {
                return this.f9607a;
            }
        }

        /* synthetic */ j(k0.b bVar, a aVar) {
            this(bVar);
        }

        static /* synthetic */ int K(j jVar, int i10) {
            int i11 = i10 | jVar.f9558a;
            jVar.f9558a = i11;
            return i11;
        }

        public static j L() {
            return f9556w;
        }

        public static final r.b getDescriptor() {
            return q.f9311o;
        }

        public static b m0() {
            return f9556w.toBuilder();
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: N */
        public j getDefaultInstanceForType() {
            return f9556w;
        }

        public String O() {
            Object obj = this.f9565h;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f9565h = strN;
            }
            return strN;
        }

        public String Q() {
            Object obj = this.f9564g;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f9564g = strN;
            }
            return strN;
        }

        public String R() {
            Object obj = this.f9567s;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f9567s = strN;
            }
            return strN;
        }

        public c S() {
            c cVarA = c.a(this.f9561d);
            return cVarA == null ? c.LABEL_OPTIONAL : cVarA;
        }

        public int T() {
            return this.f9560c;
        }

        public int W() {
            return this.f9566r;
        }

        public k X() {
            k kVar = this.f9568t;
            return kVar == null ? k.X() : kVar;
        }

        public boolean Y() {
            return this.f9569u;
        }

        public d Z() {
            d dVarA = d.a(this.f9562e);
            return dVarA == null ? d.TYPE_DOUBLE : dVarA;
        }

        public String a0() {
            Object obj = this.f9563f;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f9563f = strN;
            }
            return strN;
        }

        public boolean b0() {
            return (this.f9558a & 64) != 0;
        }

        public boolean c0() {
            return (this.f9558a & 32) != 0;
        }

        public boolean d0() {
            return (this.f9558a & 256) != 0;
        }

        public boolean e0() {
            return (this.f9558a & 4) != 0;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof j)) {
                return super.equals(obj);
            }
            j jVar = (j) obj;
            if (f0() != jVar.f0()) {
                return false;
            }
            if ((f0() && !getName().equals(jVar.getName())) || g0() != jVar.g0()) {
                return false;
            }
            if ((g0() && T() != jVar.T()) || e0() != jVar.e0()) {
                return false;
            }
            if ((e0() && this.f9561d != jVar.f9561d) || k0() != jVar.k0()) {
                return false;
            }
            if ((k0() && this.f9562e != jVar.f9562e) || l0() != jVar.l0()) {
                return false;
            }
            if ((l0() && !a0().equals(jVar.a0())) || c0() != jVar.c0()) {
                return false;
            }
            if ((c0() && !Q().equals(jVar.Q())) || b0() != jVar.b0()) {
                return false;
            }
            if ((b0() && !O().equals(jVar.O())) || h0() != jVar.h0()) {
                return false;
            }
            if ((h0() && W() != jVar.W()) || d0() != jVar.d0()) {
                return false;
            }
            if ((d0() && !R().equals(jVar.R())) || i0() != jVar.i0()) {
                return false;
            }
            if ((!i0() || X().equals(jVar.X())) && j0() == jVar.j0()) {
                return (!j0() || Y() == jVar.Y()) && getUnknownFields().equals(jVar.getUnknownFields());
            }
            return false;
        }

        public boolean f0() {
            return (this.f9558a & 1) != 0;
        }

        public boolean g0() {
            return (this.f9558a & 2) != 0;
        }

        public String getName() {
            Object obj = this.f9559b;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f9559b = strN;
            }
            return strN;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return f9557x;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = (this.f9558a & 1) != 0 ? k0.computeStringSize(1, this.f9559b) : 0;
            if ((this.f9558a & 32) != 0) {
                iComputeStringSize += k0.computeStringSize(2, this.f9564g);
            }
            if ((this.f9558a & 2) != 0) {
                iComputeStringSize += com.google.protobuf.o.x(3, this.f9560c);
            }
            if ((this.f9558a & 4) != 0) {
                iComputeStringSize += com.google.protobuf.o.l(4, this.f9561d);
            }
            if ((this.f9558a & 8) != 0) {
                iComputeStringSize += com.google.protobuf.o.l(5, this.f9562e);
            }
            if ((this.f9558a & 16) != 0) {
                iComputeStringSize += k0.computeStringSize(6, this.f9563f);
            }
            if ((this.f9558a & 64) != 0) {
                iComputeStringSize += k0.computeStringSize(7, this.f9565h);
            }
            if ((this.f9558a & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0) {
                iComputeStringSize += com.google.protobuf.o.G(8, X());
            }
            if ((this.f9558a & 128) != 0) {
                iComputeStringSize += com.google.protobuf.o.x(9, this.f9566r);
            }
            if ((this.f9558a & 256) != 0) {
                iComputeStringSize += k0.computeStringSize(10, this.f9567s);
            }
            if ((this.f9558a & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0) {
                iComputeStringSize += com.google.protobuf.o.e(17, this.f9569u);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean h0() {
            return (this.f9558a & 128) != 0;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (f0()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (g0()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + T();
            }
            if (e0()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + this.f9561d;
            }
            if (k0()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + this.f9562e;
            }
            if (l0()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + a0().hashCode();
            }
            if (c0()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + Q().hashCode();
            }
            if (b0()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + O().hashCode();
            }
            if (h0()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + W();
            }
            if (d0()) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + R().hashCode();
            }
            if (i0()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + X().hashCode();
            }
            if (j0()) {
                iHashCode = (((iHashCode * 37) + 17) * 53) + o0.d(Y());
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        public boolean i0() {
            return (this.f9558a & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return q.f9312p.d(j.class, b.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9570v;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!i0() || X().isInitialized()) {
                this.f9570v = (byte) 1;
                return true;
            }
            this.f9570v = (byte) 0;
            return false;
        }

        public boolean j0() {
            return (this.f9558a & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0;
        }

        public boolean k0() {
            return (this.f9558a & 8) != 0;
        }

        public boolean l0() {
            return (this.f9558a & 16) != 0;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: n0 */
        public b newBuilderForType() {
            return m0();
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new j();
        }

        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: o0 */
        public b newBuilderForType(k0.c cVar) {
            return new b(cVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: p0 */
        public b toBuilder() {
            return this == f9556w ? new b() : new b().w(this);
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if ((this.f9558a & 1) != 0) {
                k0.writeString(oVar, 1, this.f9559b);
            }
            if ((this.f9558a & 32) != 0) {
                k0.writeString(oVar, 2, this.f9564g);
            }
            if ((this.f9558a & 2) != 0) {
                oVar.D0(3, this.f9560c);
            }
            if ((this.f9558a & 4) != 0) {
                oVar.u0(4, this.f9561d);
            }
            if ((this.f9558a & 8) != 0) {
                oVar.u0(5, this.f9562e);
            }
            if ((this.f9558a & 16) != 0) {
                k0.writeString(oVar, 6, this.f9563f);
            }
            if ((this.f9558a & 64) != 0) {
                k0.writeString(oVar, 7, this.f9565h);
            }
            if ((this.f9558a & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0) {
                oVar.H0(8, X());
            }
            if ((this.f9558a & 128) != 0) {
                oVar.D0(9, this.f9566r);
            }
            if ((this.f9558a & 256) != 0) {
                k0.writeString(oVar, 10, this.f9567s);
            }
            if ((this.f9558a & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0) {
                oVar.m0(17, this.f9569u);
            }
            getUnknownFields().writeTo(oVar);
        }

        private j(k0.b bVar) {
            super(bVar);
            this.f9559b = "";
            this.f9560c = 0;
            this.f9561d = 1;
            this.f9562e = 1;
            this.f9563f = "";
            this.f9564g = "";
            this.f9565h = "";
            this.f9566r = 0;
            this.f9567s = "";
            this.f9569u = false;
            this.f9570v = (byte) -1;
        }

        private j() {
            this.f9559b = "";
            this.f9560c = 0;
            this.f9561d = 1;
            this.f9562e = 1;
            this.f9563f = "";
            this.f9564g = "";
            this.f9565h = "";
            this.f9566r = 0;
            this.f9567s = "";
            this.f9569u = false;
            this.f9570v = (byte) -1;
            this.f9559b = "";
            this.f9561d = 1;
            this.f9562e = 1;
            this.f9563f = "";
            this.f9564g = "";
            this.f9565h = "";
            this.f9567s = "";
        }
    }

    public static final class k extends k0.e implements o1 {

        /* JADX INFO: renamed from: b */
        private int f9609b;

        /* JADX INFO: renamed from: c */
        private int f9610c;

        /* JADX INFO: renamed from: d */
        private boolean f9611d;

        /* JADX INFO: renamed from: e */
        private int f9612e;

        /* JADX INFO: renamed from: f */
        private boolean f9613f;

        /* JADX INFO: renamed from: g */
        private boolean f9614g;

        /* JADX INFO: renamed from: h */
        private boolean f9615h;

        /* JADX INFO: renamed from: r */
        private boolean f9616r;

        /* JADX INFO: renamed from: s */
        private boolean f9617s;

        /* JADX INFO: renamed from: t */
        private int f9618t;

        /* JADX INFO: renamed from: u */
        private List f9619u;

        /* JADX INFO: renamed from: v */
        private List f9620v;

        /* JADX INFO: renamed from: w */
        private i f9621w;

        /* JADX INFO: renamed from: x */
        private List f9622x;

        /* JADX INFO: renamed from: y */
        private byte f9623y;

        /* JADX INFO: renamed from: z */
        private static final o0.h.a f9608z = new a();
        private static final k A = new k();
        public static final z1 B = new b();

        class a implements o0.h.a {
            a() {
            }

            @Override // com.google.protobuf.o0.h.a
            /* JADX INFO: renamed from: a */
            public h convert(Integer num) {
                h hVarA = h.a(num.intValue());
                return hVarA == null ? h.TARGET_TYPE_UNKNOWN : hVarA;
            }
        }

        class b extends com.google.protobuf.c {
            b() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c */
            public k parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                c cVarX0 = k.x0();
                try {
                    cVarX0.mergeFrom(mVar, yVar);
                    return cVarX0.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(cVarX0.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(cVarX0.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(cVarX0.buildPartial());
                }
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                return super.parseDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                return super.parseFrom(lVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                return super.mo1183parsePartialDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                return super.mo1185parsePartialFrom(lVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                return super.parseDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                return super.parseFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                return super.mo1186parsePartialFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                return super.parseFrom(mVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                return super.mo1187parsePartialFrom(mVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                return super.parseFrom(mVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                return super.parseFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                return super.mo1188parsePartialFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                return super.parseFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                return super.mo1189parsePartialFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                return super.parseFrom(byteBuffer);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                return super.mo1190parsePartialFrom(bArr);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                return super.parseFrom(byteBuffer, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                return super.mo1191parsePartialFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                return super.mo1181parseFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                return super.mo1193parsePartialFrom(bArr, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1182parseFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                return super.parseFrom(bArr, yVar);
            }
        }

        public static final class c extends k0.d implements o1 {
            private g2 A;

            /* JADX INFO: renamed from: b */
            private int f9624b;

            /* JADX INFO: renamed from: c */
            private int f9625c;

            /* JADX INFO: renamed from: d */
            private boolean f9626d;

            /* JADX INFO: renamed from: e */
            private int f9627e;

            /* JADX INFO: renamed from: f */
            private boolean f9628f;

            /* JADX INFO: renamed from: g */
            private boolean f9629g;

            /* JADX INFO: renamed from: h */
            private boolean f9630h;

            /* JADX INFO: renamed from: r */
            private boolean f9631r;

            /* JADX INFO: renamed from: s */
            private boolean f9632s;

            /* JADX INFO: renamed from: t */
            private int f9633t;

            /* JADX INFO: renamed from: u */
            private List f9634u;

            /* JADX INFO: renamed from: v */
            private List f9635v;

            /* JADX INFO: renamed from: w */
            private g2 f9636w;

            /* JADX INFO: renamed from: x */
            private i f9637x;

            /* JADX INFO: renamed from: y */
            private k2 f9638y;

            /* JADX INFO: renamed from: z */
            private List f9639z;

            /* synthetic */ c(a aVar) {
                this();
            }

            private void A() {
                if ((this.f9624b & WXMediaMessage.TITLE_LENGTH_LIMIT) == 0) {
                    this.f9634u = new ArrayList(this.f9634u);
                    this.f9624b |= WXMediaMessage.TITLE_LENGTH_LIMIT;
                }
            }

            private void B() {
                if ((this.f9624b & 4096) == 0) {
                    this.f9639z = new ArrayList(this.f9639z);
                    this.f9624b |= 4096;
                }
            }

            private g2 D() {
                if (this.f9636w == null) {
                    this.f9636w = new g2(this.f9635v, (this.f9624b & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0, getParentForChildren(), isClean());
                    this.f9635v = null;
                }
                return this.f9636w;
            }

            private k2 G() {
                if (this.f9638y == null) {
                    this.f9638y = new k2(E(), getParentForChildren(), isClean());
                    this.f9637x = null;
                }
                return this.f9638y;
            }

            private g2 J() {
                if (this.A == null) {
                    this.A = new g2(this.f9639z, (this.f9624b & 4096) != 0, getParentForChildren(), isClean());
                    this.f9639z = null;
                }
                return this.A;
            }

            private void L() {
                if (k0.alwaysUseFieldBuilders) {
                    D();
                    G();
                    J();
                }
            }

            private void v(k kVar) {
                int i10;
                int i11 = this.f9624b;
                if ((i11 & 1) != 0) {
                    kVar.f9610c = this.f9625c;
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 2) != 0) {
                    kVar.f9611d = this.f9626d;
                    i10 |= 2;
                }
                if ((i11 & 4) != 0) {
                    kVar.f9612e = this.f9627e;
                    i10 |= 4;
                }
                if ((i11 & 8) != 0) {
                    kVar.f9613f = this.f9628f;
                    i10 |= 8;
                }
                if ((i11 & 16) != 0) {
                    kVar.f9614g = this.f9629g;
                    i10 |= 16;
                }
                if ((i11 & 32) != 0) {
                    kVar.f9615h = this.f9630h;
                    i10 |= 32;
                }
                if ((i11 & 64) != 0) {
                    kVar.f9616r = this.f9631r;
                    i10 |= 64;
                }
                if ((i11 & 128) != 0) {
                    kVar.f9617s = this.f9632s;
                    i10 |= 128;
                }
                if ((i11 & 256) != 0) {
                    kVar.f9618t = this.f9633t;
                    i10 |= 256;
                }
                if ((i11 & 2048) != 0) {
                    k2 k2Var = this.f9638y;
                    kVar.f9621w = k2Var == null ? this.f9637x : (i) k2Var.b();
                    i10 |= WXMediaMessage.TITLE_LENGTH_LIMIT;
                }
                k.S(kVar, i10);
            }

            private void w(k kVar) {
                if ((this.f9624b & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0) {
                    this.f9634u = DesugarCollections.unmodifiableList(this.f9634u);
                    this.f9624b &= -513;
                }
                kVar.f9619u = this.f9634u;
                g2 g2Var = this.f9636w;
                if (g2Var == null) {
                    if ((this.f9624b & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0) {
                        this.f9635v = DesugarCollections.unmodifiableList(this.f9635v);
                        this.f9624b &= -1025;
                    }
                    kVar.f9620v = this.f9635v;
                } else {
                    kVar.f9620v = g2Var.g();
                }
                g2 g2Var2 = this.A;
                if (g2Var2 != null) {
                    kVar.f9622x = g2Var2.g();
                    return;
                }
                if ((this.f9624b & 4096) != 0) {
                    this.f9639z = DesugarCollections.unmodifiableList(this.f9639z);
                    this.f9624b &= -4097;
                }
                kVar.f9622x = this.f9639z;
            }

            private void z() {
                if ((this.f9624b & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) == 0) {
                    this.f9635v = new ArrayList(this.f9635v);
                    this.f9624b |= WXMediaMessage.DESCRIPTION_LENGTH_LIMIT;
                }
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: C */
            public k getDefaultInstanceForType() {
                return k.X();
            }

            public i E() {
                k2 k2Var = this.f9638y;
                if (k2Var != null) {
                    return (i) k2Var.f();
                }
                i iVar = this.f9637x;
                return iVar == null ? i.D() : iVar;
            }

            public i.b F() {
                this.f9624b |= 2048;
                onChanged();
                return (i.b) G().e();
            }

            public v H(int i10) {
                g2 g2Var = this.A;
                return g2Var == null ? (v) this.f9639z.get(i10) : (v) g2Var.o(i10);
            }

            public int I() {
                g2 g2Var = this.A;
                return g2Var == null ? this.f9639z.size() : g2Var.n();
            }

            public boolean K() {
                return (this.f9624b & 2048) != 0;
            }

            public c M(i iVar) {
                i iVar2;
                k2 k2Var = this.f9638y;
                if (k2Var != null) {
                    k2Var.h(iVar);
                } else if ((this.f9624b & 2048) == 0 || (iVar2 = this.f9637x) == null || iVar2 == i.D()) {
                    this.f9637x = iVar;
                } else {
                    F().A(iVar);
                }
                if (this.f9637x != null) {
                    this.f9624b |= 2048;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: N */
            public c mergeFrom(com.google.protobuf.m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            switch (iK) {
                                case 0:
                                    z10 = true;
                                    break;
                                case 8:
                                    int iT = mVar.t();
                                    if (d.a(iT) == null) {
                                        mergeUnknownVarintField(1, iT);
                                    } else {
                                        this.f9625c = iT;
                                        this.f9624b |= 1;
                                    }
                                    break;
                                case 16:
                                    this.f9626d = mVar.q();
                                    this.f9624b |= 2;
                                    break;
                                case 24:
                                    this.f9630h = mVar.q();
                                    this.f9624b |= 32;
                                    break;
                                case 40:
                                    this.f9628f = mVar.q();
                                    this.f9624b |= 8;
                                    break;
                                case 48:
                                    int iT2 = mVar.t();
                                    if (f.a(iT2) == null) {
                                        mergeUnknownVarintField(6, iT2);
                                    } else {
                                        this.f9627e = iT2;
                                        this.f9624b |= 4;
                                    }
                                    break;
                                case 80:
                                    this.f9631r = mVar.q();
                                    this.f9624b |= 64;
                                    break;
                                case 120:
                                    this.f9629g = mVar.q();
                                    this.f9624b |= 16;
                                    break;
                                case 128:
                                    this.f9632s = mVar.q();
                                    this.f9624b |= 128;
                                    break;
                                case 136:
                                    int iT3 = mVar.t();
                                    if (g.a(iT3) == null) {
                                        mergeUnknownVarintField(17, iT3);
                                    } else {
                                        this.f9633t = iT3;
                                        this.f9624b |= 256;
                                    }
                                    break;
                                case 152:
                                    int iT4 = mVar.t();
                                    if (h.a(iT4) == null) {
                                        mergeUnknownVarintField(19, iT4);
                                    } else {
                                        A();
                                        this.f9634u.add(Integer.valueOf(iT4));
                                    }
                                    break;
                                case 154:
                                    int iP = mVar.p(mVar.C());
                                    while (mVar.e() > 0) {
                                        int iT5 = mVar.t();
                                        if (h.a(iT5) == null) {
                                            mergeUnknownVarintField(19, iT5);
                                        } else {
                                            A();
                                            this.f9634u.add(Integer.valueOf(iT5));
                                        }
                                    }
                                    mVar.o(iP);
                                    break;
                                case 162:
                                    e eVar = (e) mVar.A(e.f9648f, yVar);
                                    g2 g2Var = this.f9636w;
                                    if (g2Var == null) {
                                        z();
                                        this.f9635v.add(eVar);
                                    } else {
                                        g2Var.f(eVar);
                                    }
                                    break;
                                case 170:
                                    mVar.B(G().e(), yVar);
                                    this.f9624b |= 2048;
                                    break;
                                case 7994:
                                    v vVar = (v) mVar.A(v.f9890t, yVar);
                                    g2 g2Var2 = this.A;
                                    if (g2Var2 == null) {
                                        B();
                                        this.f9639z.add(vVar);
                                    } else {
                                        g2Var2.f(vVar);
                                    }
                                    break;
                                default:
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                        z10 = true;
                                    }
                                    break;
                            }
                        } catch (p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }

            public c O(k kVar) {
                if (kVar == k.X()) {
                    return this;
                }
                if (kVar.n0()) {
                    R(kVar.T());
                }
                if (kVar.t0()) {
                    Y(kVar.f0());
                }
                if (kVar.r0()) {
                    W(kVar.d0());
                }
                if (kVar.s0()) {
                    X(kVar.e0());
                }
                if (kVar.v0()) {
                    b0(kVar.l0());
                }
                if (kVar.p0()) {
                    U(kVar.Z());
                }
                if (kVar.w0()) {
                    c0(kVar.m0());
                }
                if (kVar.o0()) {
                    T(kVar.W());
                }
                if (kVar.u0()) {
                    Z(kVar.g0());
                }
                if (!kVar.f9619u.isEmpty()) {
                    if (this.f9634u.isEmpty()) {
                        this.f9634u = kVar.f9619u;
                        this.f9624b &= -513;
                    } else {
                        A();
                        this.f9634u.addAll(kVar.f9619u);
                    }
                    onChanged();
                }
                if (this.f9636w == null) {
                    if (!kVar.f9620v.isEmpty()) {
                        if (this.f9635v.isEmpty()) {
                            this.f9635v = kVar.f9620v;
                            this.f9624b &= -1025;
                        } else {
                            z();
                            this.f9635v.addAll(kVar.f9620v);
                        }
                        onChanged();
                    }
                } else if (!kVar.f9620v.isEmpty()) {
                    if (this.f9636w.u()) {
                        this.f9636w.i();
                        this.f9636w = null;
                        this.f9635v = kVar.f9620v;
                        this.f9624b &= -1025;
                        this.f9636w = k0.alwaysUseFieldBuilders ? D() : null;
                    } else {
                        this.f9636w.b(kVar.f9620v);
                    }
                }
                if (kVar.q0()) {
                    M(kVar.c0());
                }
                if (this.A == null) {
                    if (!kVar.f9622x.isEmpty()) {
                        if (this.f9639z.isEmpty()) {
                            this.f9639z = kVar.f9622x;
                            this.f9624b &= -4097;
                        } else {
                            B();
                            this.f9639z.addAll(kVar.f9622x);
                        }
                        onChanged();
                    }
                } else if (!kVar.f9622x.isEmpty()) {
                    if (this.A.u()) {
                        this.A.i();
                        this.A = null;
                        this.f9639z = kVar.f9622x;
                        this.f9624b &= -4097;
                        this.A = k0.alwaysUseFieldBuilders ? J() : null;
                    } else {
                        this.A.b(kVar.f9622x);
                    }
                }
                n(kVar);
                m141mergeUnknownFields(kVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: P */
            public c mergeFrom(i1 i1Var) {
                if (i1Var instanceof k) {
                    return O((k) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
            public final c m1148mergeUnknownFields(t2 t2Var) {
                return (c) super.m1148mergeUnknownFields(t2Var);
            }

            public c R(d dVar) {
                dVar.getClass();
                this.f9624b |= 1;
                this.f9625c = dVar.getNumber();
                onChanged();
                return this;
            }

            public c T(boolean z10) {
                this.f9632s = z10;
                this.f9624b |= 128;
                onChanged();
                return this;
            }

            public c U(boolean z10) {
                this.f9630h = z10;
                this.f9624b |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: V */
            public c setField(r.g gVar, Object obj) {
                return (c) super.o(gVar, obj);
            }

            public c W(f fVar) {
                fVar.getClass();
                this.f9624b |= 4;
                this.f9627e = fVar.getNumber();
                onChanged();
                return this;
            }

            public c X(boolean z10) {
                this.f9628f = z10;
                this.f9624b |= 8;
                onChanged();
                return this;
            }

            public c Y(boolean z10) {
                this.f9626d = z10;
                this.f9624b |= 2;
                onChanged();
                return this;
            }

            public c Z(g gVar) {
                gVar.getClass();
                this.f9624b |= 256;
                this.f9633t = gVar.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: a0 */
            public final c setUnknownFields(t2 t2Var) {
                return (c) super.setUnknownFields(t2Var);
            }

            public c b0(boolean z10) {
                this.f9629g = z10;
                this.f9624b |= 16;
                onChanged();
                return this;
            }

            public c c0(boolean z10) {
                this.f9631r = z10;
                this.f9624b |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return q.G;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return q.H.d(k.class, c.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                if (K() && !E().isInitialized()) {
                    return false;
                }
                for (int i10 = 0; i10 < I(); i10++) {
                    if (!H(i10).isInitialized()) {
                        return false;
                    }
                }
                return m();
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: r */
            public c addRepeatedField(r.g gVar, Object obj) {
                return (c) super.h(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: t */
            public k build() {
                k kVarBuildPartial = buildPartial();
                if (kVarBuildPartial.isInitialized()) {
                    return kVarBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) kVarBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: u */
            public k buildPartial() {
                k kVar = new k(this);
                w(kVar);
                if (this.f9624b != 0) {
                    v(kVar);
                }
                onBuilt();
                return kVar;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public c m1140clearField(r.g gVar) {
                return (c) super.j(gVar);
            }

            /* JADX INFO: renamed from: y */
            public c clone() {
                return (c) super.m1147clone();
            }

            /* synthetic */ c(k0.c cVar, a aVar) {
                this(cVar);
            }

            private c() {
                this.f9625c = 0;
                this.f9627e = 0;
                this.f9633t = 0;
                List list = Collections.EMPTY_LIST;
                this.f9634u = list;
                this.f9635v = list;
                this.f9639z = list;
                L();
            }

            private c(k0.c cVar) {
                super(cVar);
                this.f9625c = 0;
                this.f9627e = 0;
                this.f9633t = 0;
                List list = Collections.EMPTY_LIST;
                this.f9634u = list;
                this.f9635v = list;
                this.f9639z = list;
                L();
            }
        }

        public enum d implements o0.c {
            STRING(0),
            CORD(1),
            STRING_PIECE(2);


            /* JADX INFO: renamed from: e */
            private static final o0.d f9643e = new a();

            /* JADX INFO: renamed from: f */
            private static final d[] f9644f = values();

            /* JADX INFO: renamed from: a */
            private final int f9646a;

            class a implements o0.d {
                a() {
                }
            }

            d(int i10) {
                this.f9646a = i10;
            }

            public static d a(int i10) {
                if (i10 == 0) {
                    return STRING;
                }
                if (i10 == 1) {
                    return CORD;
                }
                if (i10 != 2) {
                    return null;
                }
                return STRING_PIECE;
            }

            @Override // com.google.protobuf.o0.c
            public final int getNumber() {
                return this.f9646a;
            }
        }

        public static final class e extends k0 implements o1 {

            /* JADX INFO: renamed from: e */
            private static final e f9647e = new e();

            /* JADX INFO: renamed from: f */
            public static final z1 f9648f = new a();

            /* JADX INFO: renamed from: a */
            private int f9649a;

            /* JADX INFO: renamed from: b */
            private int f9650b;

            /* JADX INFO: renamed from: c */
            private volatile Object f9651c;

            /* JADX INFO: renamed from: d */
            private byte f9652d;

            class a extends com.google.protobuf.c {
                a() {
                }

                @Override // com.google.protobuf.z1
                /* JADX INFO: renamed from: c */
                public e parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                    b bVarZ = e.z();
                    try {
                        bVarZ.mergeFrom(mVar, yVar);
                        return bVarZ.buildPartial();
                    } catch (p0 e10) {
                        throw e10.j(bVarZ.buildPartial());
                    } catch (r2 e11) {
                        throw e11.a().j(bVarZ.buildPartial());
                    } catch (IOException e12) {
                        throw new p0(e12).j(bVarZ.buildPartial());
                    }
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                    return super.parseDelimitedFrom(inputStream);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                    return super.parseFrom(lVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialDelimitedFrom */
                public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                    return super.mo1183parsePartialDelimitedFrom(inputStream);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                    return super.mo1185parsePartialFrom(lVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                    return super.parseDelimitedFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                    return super.parseFrom(lVar, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialDelimitedFrom */
                public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                    return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                    return super.mo1186parsePartialFrom(lVar, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                    return super.parseFrom(mVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                    return super.mo1187parsePartialFrom(mVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                    return super.parseFrom(mVar, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                    return super.parseFrom(inputStream);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                    return super.mo1188parsePartialFrom(inputStream);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                    return super.parseFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                    return super.mo1189parsePartialFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                    return super.parseFrom(byteBuffer);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                    return super.mo1190parsePartialFrom(bArr);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                    return super.parseFrom(byteBuffer, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                    return super.mo1191parsePartialFrom(bArr, i10, i11);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                    return super.parseFrom(bArr);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                    return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parseFrom */
                public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                    return super.mo1181parseFrom(bArr, i10, i11);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                    return super.mo1193parsePartialFrom(bArr, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parseFrom */
                public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                    return super.mo1182parseFrom(bArr, i10, i11, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                    return super.parseFrom(bArr, yVar);
                }
            }

            public static final class b extends k0.b implements o1 {

                /* JADX INFO: renamed from: a */
                private int f9653a;

                /* JADX INFO: renamed from: b */
                private int f9654b;

                /* JADX INFO: renamed from: c */
                private Object f9655c;

                /* synthetic */ b(a aVar) {
                    this();
                }

                private void j(e eVar) {
                    int i10;
                    int i11 = this.f9653a;
                    if ((i11 & 1) != 0) {
                        eVar.f9650b = this.f9654b;
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if ((i11 & 2) != 0) {
                        eVar.f9651c = this.f9655c;
                        i10 |= 2;
                    }
                    e.q(eVar, i10);
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: g */
                public b addRepeatedField(r.g gVar, Object obj) {
                    return (b) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                public r.b getDescriptorForType() {
                    return q.I;
                }

                @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
                /* JADX INFO: renamed from: h */
                public e build() {
                    e eVarBuildPartial = buildPartial();
                    if (eVarBuildPartial.isInitialized()) {
                        return eVarBuildPartial;
                    }
                    throw a.AbstractC0131a.newUninitializedMessageException((i1) eVarBuildPartial);
                }

                @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
                /* JADX INFO: renamed from: i */
                public e buildPartial() {
                    e eVar = new e(this);
                    if (this.f9653a != 0) {
                        j(eVar);
                    }
                    onBuilt();
                    return eVar;
                }

                @Override // com.google.protobuf.k0.b
                protected k0.f internalGetFieldAccessorTable() {
                    return q.J.d(e.class, b.class);
                }

                @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.k0.b
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public b m1140clearField(r.g gVar) {
                    return (b) super.m1140clearField(gVar);
                }

                /* JADX INFO: renamed from: m */
                public b clone() {
                    return (b) super.m1147clone();
                }

                @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                /* JADX INFO: renamed from: n */
                public e getDefaultInstanceForType() {
                    return e.r();
                }

                @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
                /* JADX INFO: renamed from: o */
                public b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                    yVar.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int iK = mVar.K();
                                if (iK != 0) {
                                    if (iK == 18) {
                                        this.f9655c = mVar.r();
                                        this.f9653a |= 2;
                                    } else if (iK == 24) {
                                        int iT = mVar.t();
                                        if (c.a(iT) == null) {
                                            mergeUnknownVarintField(3, iT);
                                        } else {
                                            this.f9654b = iT;
                                            this.f9653a |= 1;
                                        }
                                    } else if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                }
                                z10 = true;
                            } catch (p0 e10) {
                                throw e10.n();
                            }
                        } catch (Throwable th2) {
                            onChanged();
                            throw th2;
                        }
                    }
                    onChanged();
                    return this;
                }

                public b p(e eVar) {
                    if (eVar == e.r()) {
                        return this;
                    }
                    if (eVar.w()) {
                        u(eVar.t());
                    }
                    if (eVar.x()) {
                        this.f9655c = eVar.f9651c;
                        this.f9653a |= 2;
                        onChanged();
                    }
                    m141mergeUnknownFields(eVar.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: r */
                public b mergeFrom(i1 i1Var) {
                    if (i1Var instanceof e) {
                        return p((e) i1Var);
                    }
                    super.mergeFrom(i1Var);
                    return this;
                }

                @Override // com.google.protobuf.a.AbstractC0131a
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public final b m1148mergeUnknownFields(t2 t2Var) {
                    return (b) super.m1148mergeUnknownFields(t2Var);
                }

                public b u(c cVar) {
                    cVar.getClass();
                    this.f9653a |= 1;
                    this.f9654b = cVar.getNumber();
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: v */
                public b setField(r.g gVar, Object obj) {
                    return (b) super.setField(gVar, obj);
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: w */
                public final b setUnknownFields(t2 t2Var) {
                    return (b) super.setUnknownFields(t2Var);
                }

                /* synthetic */ b(k0.c cVar, a aVar) {
                    this(cVar);
                }

                private b() {
                    this.f9654b = 0;
                    this.f9655c = "";
                }

                private b(k0.c cVar) {
                    super(cVar);
                    this.f9654b = 0;
                    this.f9655c = "";
                }
            }

            /* synthetic */ e(k0.b bVar, a aVar) {
                this(bVar);
            }

            public static final r.b getDescriptor() {
                return q.I;
            }

            static /* synthetic */ int q(e eVar, int i10) {
                int i11 = i10 | eVar.f9649a;
                eVar.f9649a = i11;
                return i11;
            }

            public static e r() {
                return f9647e;
            }

            public static b z() {
                return f9647e.toBuilder();
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            /* JADX INFO: renamed from: A */
            public b newBuilderForType() {
                return z();
            }

            @Override // com.google.protobuf.k0
            /* JADX INFO: renamed from: C */
            public b newBuilderForType(k0.c cVar) {
                return new b(cVar);
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            /* JADX INFO: renamed from: D */
            public b toBuilder() {
                return this == f9647e ? new b() : new b().p(this);
            }

            @Override // com.google.protobuf.a
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return super.equals(obj);
                }
                e eVar = (e) obj;
                if (w() != eVar.w()) {
                    return false;
                }
                if ((!w() || this.f9650b == eVar.f9650b) && x() == eVar.x()) {
                    return (!x() || v().equals(eVar.v())) && getUnknownFields().equals(eVar.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            public z1 getParserForType() {
                return f9648f;
            }

            @Override // com.google.protobuf.l1
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = (this.f9649a & 2) != 0 ? k0.computeStringSize(2, this.f9651c) : 0;
                if ((this.f9649a & 1) != 0) {
                    iComputeStringSize += com.google.protobuf.o.l(3, this.f9650b);
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.a
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (w()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + this.f9650b;
                }
                if (x()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + v().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.k0
            protected k0.f internalGetFieldAccessorTable() {
                return q.J.d(e.class, b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9652d;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9652d = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.k0
            protected Object newInstance(k0.g gVar) {
                return new e();
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: s */
            public e getDefaultInstanceForType() {
                return f9647e;
            }

            public c t() {
                c cVarA = c.a(this.f9650b);
                return cVarA == null ? c.EDITION_UNKNOWN : cVarA;
            }

            public String v() {
                Object obj = this.f9651c;
                if (obj instanceof String) {
                    return (String) obj;
                }
                com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
                String strN = lVar.N();
                if (lVar.o()) {
                    this.f9651c = strN;
                }
                return strN;
            }

            public boolean w() {
                return (this.f9649a & 1) != 0;
            }

            @Override // com.google.protobuf.l1
            public void writeTo(com.google.protobuf.o oVar) throws IOException {
                if ((this.f9649a & 2) != 0) {
                    k0.writeString(oVar, 2, this.f9651c);
                }
                if ((this.f9649a & 1) != 0) {
                    oVar.u0(3, this.f9650b);
                }
                getUnknownFields().writeTo(oVar);
            }

            public boolean x() {
                return (this.f9649a & 2) != 0;
            }

            private e(k0.b bVar) {
                super(bVar);
                this.f9650b = 0;
                this.f9651c = "";
                this.f9652d = (byte) -1;
            }

            private e() {
                this.f9650b = 0;
                this.f9651c = "";
                this.f9652d = (byte) -1;
                this.f9650b = 0;
                this.f9651c = "";
            }
        }

        public enum f implements o0.c {
            JS_NORMAL(0),
            JS_STRING(1),
            JS_NUMBER(2);


            /* JADX INFO: renamed from: e */
            private static final o0.d f9659e = new a();

            /* JADX INFO: renamed from: f */
            private static final f[] f9660f = values();

            /* JADX INFO: renamed from: a */
            private final int f9662a;

            class a implements o0.d {
                a() {
                }
            }

            f(int i10) {
                this.f9662a = i10;
            }

            public static f a(int i10) {
                if (i10 == 0) {
                    return JS_NORMAL;
                }
                if (i10 == 1) {
                    return JS_STRING;
                }
                if (i10 != 2) {
                    return null;
                }
                return JS_NUMBER;
            }

            @Override // com.google.protobuf.o0.c
            public final int getNumber() {
                return this.f9662a;
            }
        }

        public enum g implements o0.c {
            RETENTION_UNKNOWN(0),
            RETENTION_RUNTIME(1),
            RETENTION_SOURCE(2);


            /* JADX INFO: renamed from: e */
            private static final o0.d f9666e = new a();

            /* JADX INFO: renamed from: f */
            private static final g[] f9667f = values();

            /* JADX INFO: renamed from: a */
            private final int f9669a;

            class a implements o0.d {
                a() {
                }
            }

            g(int i10) {
                this.f9669a = i10;
            }

            public static g a(int i10) {
                if (i10 == 0) {
                    return RETENTION_UNKNOWN;
                }
                if (i10 == 1) {
                    return RETENTION_RUNTIME;
                }
                if (i10 != 2) {
                    return null;
                }
                return RETENTION_SOURCE;
            }

            @Override // com.google.protobuf.o0.c
            public final int getNumber() {
                return this.f9669a;
            }
        }

        public enum h implements o0.c {
            TARGET_TYPE_UNKNOWN(0),
            TARGET_TYPE_FILE(1),
            TARGET_TYPE_EXTENSION_RANGE(2),
            TARGET_TYPE_MESSAGE(3),
            TARGET_TYPE_FIELD(4),
            TARGET_TYPE_ONEOF(5),
            TARGET_TYPE_ENUM(6),
            TARGET_TYPE_ENUM_ENTRY(7),
            TARGET_TYPE_SERVICE(8),
            TARGET_TYPE_METHOD(9);


            /* JADX INFO: renamed from: u */
            private static final o0.d f9680u = new a();

            /* JADX INFO: renamed from: v */
            private static final h[] f9681v = values();

            /* JADX INFO: renamed from: a */
            private final int f9683a;

            class a implements o0.d {
                a() {
                }
            }

            h(int i10) {
                this.f9683a = i10;
            }

            public static h a(int i10) {
                switch (i10) {
                    case 0:
                        return TARGET_TYPE_UNKNOWN;
                    case 1:
                        return TARGET_TYPE_FILE;
                    case 2:
                        return TARGET_TYPE_EXTENSION_RANGE;
                    case 3:
                        return TARGET_TYPE_MESSAGE;
                    case 4:
                        return TARGET_TYPE_FIELD;
                    case 5:
                        return TARGET_TYPE_ONEOF;
                    case 6:
                        return TARGET_TYPE_ENUM;
                    case 7:
                        return TARGET_TYPE_ENUM_ENTRY;
                    case 8:
                        return TARGET_TYPE_SERVICE;
                    case 9:
                        return TARGET_TYPE_METHOD;
                    default:
                        return null;
                }
            }

            @Override // com.google.protobuf.o0.c
            public final int getNumber() {
                return this.f9683a;
            }
        }

        /* synthetic */ k(k0.d dVar, a aVar) {
            this(dVar);
        }

        static /* synthetic */ int S(k kVar, int i10) {
            int i11 = i10 | kVar.f9609b;
            kVar.f9609b = i11;
            return i11;
        }

        public static k X() {
            return A;
        }

        public static final r.b getDescriptor() {
            return q.G;
        }

        public static c x0() {
            return A.toBuilder();
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: A0 */
        public c toBuilder() {
            return this == A ? new c() : new c().O(this);
        }

        public d T() {
            d dVarA = d.a(this.f9610c);
            return dVarA == null ? d.STRING : dVarA;
        }

        public boolean W() {
            return this.f9617s;
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: Y */
        public k getDefaultInstanceForType() {
            return A;
        }

        public boolean Z() {
            return this.f9615h;
        }

        public int a0() {
            return this.f9620v.size();
        }

        public List b0() {
            return this.f9620v;
        }

        public i c0() {
            i iVar = this.f9621w;
            return iVar == null ? i.D() : iVar;
        }

        public f d0() {
            f fVarA = f.a(this.f9612e);
            return fVarA == null ? f.JS_NORMAL : fVarA;
        }

        public boolean e0() {
            return this.f9613f;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof k)) {
                return super.equals(obj);
            }
            k kVar = (k) obj;
            if (n0() != kVar.n0()) {
                return false;
            }
            if ((n0() && this.f9610c != kVar.f9610c) || t0() != kVar.t0()) {
                return false;
            }
            if ((t0() && f0() != kVar.f0()) || r0() != kVar.r0()) {
                return false;
            }
            if ((r0() && this.f9612e != kVar.f9612e) || s0() != kVar.s0()) {
                return false;
            }
            if ((s0() && e0() != kVar.e0()) || v0() != kVar.v0()) {
                return false;
            }
            if ((v0() && l0() != kVar.l0()) || p0() != kVar.p0()) {
                return false;
            }
            if ((p0() && Z() != kVar.Z()) || w0() != kVar.w0()) {
                return false;
            }
            if ((w0() && m0() != kVar.m0()) || o0() != kVar.o0()) {
                return false;
            }
            if ((o0() && W() != kVar.W()) || u0() != kVar.u0()) {
                return false;
            }
            if ((!u0() || this.f9618t == kVar.f9618t) && this.f9619u.equals(kVar.f9619u) && b0().equals(kVar.b0()) && q0() == kVar.q0()) {
                return (!q0() || c0().equals(kVar.c0())) && k0().equals(kVar.k0()) && getUnknownFields().equals(kVar.getUnknownFields()) && q().equals(kVar.q());
            }
            return false;
        }

        public boolean f0() {
            return this.f9611d;
        }

        public g g0() {
            g gVarA = g.a(this.f9618t);
            return gVarA == null ? g.RETENTION_UNKNOWN : gVarA;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return B;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iL = (this.f9609b & 1) != 0 ? com.google.protobuf.o.l(1, this.f9610c) : 0;
            if ((this.f9609b & 2) != 0) {
                iL += com.google.protobuf.o.e(2, this.f9611d);
            }
            if ((this.f9609b & 32) != 0) {
                iL += com.google.protobuf.o.e(3, this.f9615h);
            }
            if ((this.f9609b & 8) != 0) {
                iL += com.google.protobuf.o.e(5, this.f9613f);
            }
            if ((this.f9609b & 4) != 0) {
                iL += com.google.protobuf.o.l(6, this.f9612e);
            }
            if ((this.f9609b & 64) != 0) {
                iL += com.google.protobuf.o.e(10, this.f9616r);
            }
            if ((this.f9609b & 16) != 0) {
                iL += com.google.protobuf.o.e(15, this.f9614g);
            }
            if ((this.f9609b & 128) != 0) {
                iL += com.google.protobuf.o.e(16, this.f9617s);
            }
            if ((this.f9609b & 256) != 0) {
                iL += com.google.protobuf.o.l(17, this.f9618t);
            }
            int iM = 0;
            for (int i11 = 0; i11 < this.f9619u.size(); i11++) {
                iM += com.google.protobuf.o.m(((Integer) this.f9619u.get(i11)).intValue());
            }
            int size = iL + iM + (this.f9619u.size() * 2);
            for (int i12 = 0; i12 < this.f9620v.size(); i12++) {
                size += com.google.protobuf.o.G(20, (l1) this.f9620v.get(i12));
            }
            if ((this.f9609b & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0) {
                size += com.google.protobuf.o.G(21, c0());
            }
            for (int i13 = 0; i13 < this.f9622x.size(); i13++) {
                size += com.google.protobuf.o.G(999, (l1) this.f9622x.get(i13));
            }
            int iP = size + p() + getUnknownFields().getSerializedSize();
            this.memoizedSize = iP;
            return iP;
        }

        public int h0() {
            return this.f9619u.size();
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (n0()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.f9610c;
            }
            if (t0()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + o0.d(f0());
            }
            if (r0()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + this.f9612e;
            }
            if (s0()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + o0.d(e0());
            }
            if (v0()) {
                iHashCode = (((iHashCode * 37) + 15) * 53) + o0.d(l0());
            }
            if (p0()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + o0.d(Z());
            }
            if (w0()) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + o0.d(m0());
            }
            if (o0()) {
                iHashCode = (((iHashCode * 37) + 16) * 53) + o0.d(W());
            }
            if (u0()) {
                iHashCode = (((iHashCode * 37) + 17) * 53) + this.f9618t;
            }
            if (h0() > 0) {
                iHashCode = (((iHashCode * 37) + 19) * 53) + this.f9619u.hashCode();
            }
            if (a0() > 0) {
                iHashCode = (((iHashCode * 37) + 20) * 53) + b0().hashCode();
            }
            if (q0()) {
                iHashCode = (((iHashCode * 37) + 21) * 53) + c0().hashCode();
            }
            if (j0() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + k0().hashCode();
            }
            int iHashFields = (com.google.protobuf.a.hashFields(iHashCode, q()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        public v i0(int i10) {
            return (v) this.f9622x.get(i10);
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return q.H.d(k.class, c.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9623y;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (q0() && !c0().isInitialized()) {
                this.f9623y = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < j0(); i10++) {
                if (!i0(i10).isInitialized()) {
                    this.f9623y = (byte) 0;
                    return false;
                }
            }
            if (o()) {
                this.f9623y = (byte) 1;
                return true;
            }
            this.f9623y = (byte) 0;
            return false;
        }

        public int j0() {
            return this.f9622x.size();
        }

        public List k0() {
            return this.f9622x;
        }

        public boolean l0() {
            return this.f9614g;
        }

        public boolean m0() {
            return this.f9616r;
        }

        public boolean n0() {
            return (this.f9609b & 1) != 0;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new k();
        }

        public boolean o0() {
            return (this.f9609b & 128) != 0;
        }

        public boolean p0() {
            return (this.f9609b & 32) != 0;
        }

        public boolean q0() {
            return (this.f9609b & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0;
        }

        public boolean r0() {
            return (this.f9609b & 4) != 0;
        }

        public boolean s0() {
            return (this.f9609b & 8) != 0;
        }

        public boolean t0() {
            return (this.f9609b & 2) != 0;
        }

        public boolean u0() {
            return (this.f9609b & 256) != 0;
        }

        public boolean v0() {
            return (this.f9609b & 16) != 0;
        }

        public boolean w0() {
            return (this.f9609b & 64) != 0;
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) {
            k0.e.a aVarR = r();
            if ((this.f9609b & 1) != 0) {
                oVar.u0(1, this.f9610c);
            }
            if ((this.f9609b & 2) != 0) {
                oVar.m0(2, this.f9611d);
            }
            if ((this.f9609b & 32) != 0) {
                oVar.m0(3, this.f9615h);
            }
            if ((this.f9609b & 8) != 0) {
                oVar.m0(5, this.f9613f);
            }
            if ((this.f9609b & 4) != 0) {
                oVar.u0(6, this.f9612e);
            }
            if ((this.f9609b & 64) != 0) {
                oVar.m0(10, this.f9616r);
            }
            if ((this.f9609b & 16) != 0) {
                oVar.m0(15, this.f9614g);
            }
            if ((this.f9609b & 128) != 0) {
                oVar.m0(16, this.f9617s);
            }
            if ((this.f9609b & 256) != 0) {
                oVar.u0(17, this.f9618t);
            }
            for (int i10 = 0; i10 < this.f9619u.size(); i10++) {
                oVar.u0(19, ((Integer) this.f9619u.get(i10)).intValue());
            }
            for (int i11 = 0; i11 < this.f9620v.size(); i11++) {
                oVar.H0(20, (l1) this.f9620v.get(i11));
            }
            if ((this.f9609b & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0) {
                oVar.H0(21, c0());
            }
            for (int i12 = 0; i12 < this.f9622x.size(); i12++) {
                oVar.H0(999, (l1) this.f9622x.get(i12));
            }
            aVarR.a(536870912, oVar);
            getUnknownFields().writeTo(oVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: y0 */
        public c newBuilderForType() {
            return x0();
        }

        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: z0 */
        public c newBuilderForType(k0.c cVar) {
            return new c(cVar);
        }

        private k(k0.d dVar) {
            super(dVar);
            this.f9610c = 0;
            this.f9611d = false;
            this.f9612e = 0;
            this.f9613f = false;
            this.f9614g = false;
            this.f9615h = false;
            this.f9616r = false;
            this.f9617s = false;
            this.f9618t = 0;
            this.f9623y = (byte) -1;
        }

        private k() {
            this.f9611d = false;
            this.f9613f = false;
            this.f9614g = false;
            this.f9615h = false;
            this.f9616r = false;
            this.f9617s = false;
            this.f9623y = (byte) -1;
            this.f9610c = 0;
            this.f9612e = 0;
            this.f9618t = 0;
            List list = Collections.EMPTY_LIST;
            this.f9619u = list;
            this.f9620v = list;
            this.f9622x = list;
        }
    }

    public static final class l extends k0 implements o1 {

        /* JADX INFO: renamed from: y */
        private static final l f9684y = new l();

        /* JADX INFO: renamed from: z */
        public static final z1 f9685z = new a();

        /* JADX INFO: renamed from: a */
        private int f9686a;

        /* JADX INFO: renamed from: b */
        private volatile Object f9687b;

        /* JADX INFO: renamed from: c */
        private volatile Object f9688c;

        /* JADX INFO: renamed from: d */
        private u0 f9689d;

        /* JADX INFO: renamed from: e */
        private o0.g f9690e;

        /* JADX INFO: renamed from: f */
        private o0.g f9691f;

        /* JADX INFO: renamed from: g */
        private List f9692g;

        /* JADX INFO: renamed from: h */
        private List f9693h;

        /* JADX INFO: renamed from: r */
        private List f9694r;

        /* JADX INFO: renamed from: s */
        private List f9695s;

        /* JADX INFO: renamed from: t */
        private m f9696t;

        /* JADX INFO: renamed from: u */
        private u f9697u;

        /* JADX INFO: renamed from: v */
        private volatile Object f9698v;

        /* JADX INFO: renamed from: w */
        private int f9699w;

        /* JADX INFO: renamed from: x */
        private byte f9700x;

        class a extends com.google.protobuf.c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c */
            public l parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                b bVarD0 = l.D0();
                try {
                    bVarD0.mergeFrom(mVar, yVar);
                    return bVarD0.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(bVarD0.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(bVarD0.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(bVarD0.buildPartial());
                }
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                return super.parseDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                return super.parseFrom(lVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                return super.mo1183parsePartialDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                return super.mo1185parsePartialFrom(lVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                return super.parseDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                return super.parseFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                return super.mo1186parsePartialFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                return super.parseFrom(mVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                return super.mo1187parsePartialFrom(mVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                return super.parseFrom(mVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                return super.parseFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                return super.mo1188parsePartialFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                return super.parseFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                return super.mo1189parsePartialFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                return super.parseFrom(byteBuffer);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                return super.mo1190parsePartialFrom(bArr);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                return super.parseFrom(byteBuffer, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                return super.mo1191parsePartialFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                return super.mo1181parseFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                return super.mo1193parsePartialFrom(bArr, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1182parseFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                return super.parseFrom(bArr, yVar);
            }
        }

        public static final class b extends k0.b implements o1 {
            private k2 A;
            private Object B;
            private int C;

            /* JADX INFO: renamed from: a */
            private int f9701a;

            /* JADX INFO: renamed from: b */
            private Object f9702b;

            /* JADX INFO: renamed from: c */
            private Object f9703c;

            /* JADX INFO: renamed from: d */
            private u0 f9704d;

            /* JADX INFO: renamed from: e */
            private o0.g f9705e;

            /* JADX INFO: renamed from: f */
            private o0.g f9706f;

            /* JADX INFO: renamed from: g */
            private List f9707g;

            /* JADX INFO: renamed from: h */
            private g2 f9708h;

            /* JADX INFO: renamed from: r */
            private List f9709r;

            /* JADX INFO: renamed from: s */
            private g2 f9710s;

            /* JADX INFO: renamed from: t */
            private List f9711t;

            /* JADX INFO: renamed from: u */
            private g2 f9712u;

            /* JADX INFO: renamed from: v */
            private List f9713v;

            /* JADX INFO: renamed from: w */
            private g2 f9714w;

            /* JADX INFO: renamed from: x */
            private m f9715x;

            /* JADX INFO: renamed from: y */
            private k2 f9716y;

            /* JADX INFO: renamed from: z */
            private u f9717z;

            /* synthetic */ b(a aVar) {
                this();
            }

            private g2 B() {
                if (this.f9710s == null) {
                    this.f9710s = new g2(this.f9709r, (this.f9701a & 64) != 0, getParentForChildren(), isClean());
                    this.f9709r = null;
                }
                return this.f9710s;
            }

            private g2 E() {
                if (this.f9714w == null) {
                    this.f9714w = new g2(this.f9713v, (this.f9701a & 256) != 0, getParentForChildren(), isClean());
                    this.f9713v = null;
                }
                return this.f9714w;
            }

            private g2 H() {
                if (this.f9708h == null) {
                    this.f9708h = new g2(this.f9707g, (this.f9701a & 32) != 0, getParentForChildren(), isClean());
                    this.f9707g = null;
                }
                return this.f9708h;
            }

            private k2 K() {
                if (this.f9716y == null) {
                    this.f9716y = new k2(I(), getParentForChildren(), isClean());
                    this.f9715x = null;
                }
                return this.f9716y;
            }

            private g2 N() {
                if (this.f9712u == null) {
                    this.f9712u = new g2(this.f9711t, (this.f9701a & 128) != 0, getParentForChildren(), isClean());
                    this.f9711t = null;
                }
                return this.f9712u;
            }

            private k2 Q() {
                if (this.A == null) {
                    this.A = new k2(O(), getParentForChildren(), isClean());
                    this.f9717z = null;
                }
                return this.A;
            }

            private void T() {
                if (k0.alwaysUseFieldBuilders) {
                    H();
                    B();
                    N();
                    E();
                    K();
                    Q();
                }
            }

            private void k(l lVar) {
                int i10;
                int i11 = this.f9701a;
                if ((i11 & 1) != 0) {
                    lVar.f9687b = this.f9702b;
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 2) != 0) {
                    lVar.f9688c = this.f9703c;
                    i10 |= 2;
                }
                if ((i11 & 4) != 0) {
                    this.f9704d.r();
                    lVar.f9689d = this.f9704d;
                }
                if ((i11 & 8) != 0) {
                    this.f9705e.r();
                    lVar.f9690e = this.f9705e;
                }
                if ((i11 & 16) != 0) {
                    this.f9706f.r();
                    lVar.f9691f = this.f9706f;
                }
                if ((i11 & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0) {
                    k2 k2Var = this.f9716y;
                    lVar.f9696t = k2Var == null ? this.f9715x : (m) k2Var.b();
                    i10 |= 4;
                }
                if ((i11 & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0) {
                    k2 k2Var2 = this.A;
                    lVar.f9697u = k2Var2 == null ? this.f9717z : (u) k2Var2.b();
                    i10 |= 8;
                }
                if ((i11 & 2048) != 0) {
                    lVar.f9698v = this.B;
                    i10 |= 16;
                }
                if ((i11 & 4096) != 0) {
                    lVar.f9699w = this.C;
                    i10 |= 32;
                }
                l.T(lVar, i10);
            }

            private void m(l lVar) {
                g2 g2Var = this.f9708h;
                if (g2Var == null) {
                    if ((this.f9701a & 32) != 0) {
                        this.f9707g = DesugarCollections.unmodifiableList(this.f9707g);
                        this.f9701a &= -33;
                    }
                    lVar.f9692g = this.f9707g;
                } else {
                    lVar.f9692g = g2Var.g();
                }
                g2 g2Var2 = this.f9710s;
                if (g2Var2 == null) {
                    if ((this.f9701a & 64) != 0) {
                        this.f9709r = DesugarCollections.unmodifiableList(this.f9709r);
                        this.f9701a &= -65;
                    }
                    lVar.f9693h = this.f9709r;
                } else {
                    lVar.f9693h = g2Var2.g();
                }
                g2 g2Var3 = this.f9712u;
                if (g2Var3 == null) {
                    if ((this.f9701a & 128) != 0) {
                        this.f9711t = DesugarCollections.unmodifiableList(this.f9711t);
                        this.f9701a &= -129;
                    }
                    lVar.f9694r = this.f9711t;
                } else {
                    lVar.f9694r = g2Var3.g();
                }
                g2 g2Var4 = this.f9714w;
                if (g2Var4 != null) {
                    lVar.f9695s = g2Var4.g();
                    return;
                }
                if ((this.f9701a & 256) != 0) {
                    this.f9713v = DesugarCollections.unmodifiableList(this.f9713v);
                    this.f9701a &= -257;
                }
                lVar.f9695s = this.f9713v;
            }

            private void p() {
                if (!this.f9704d.p0()) {
                    this.f9704d = new u0(this.f9704d);
                }
                this.f9701a |= 4;
            }

            private void r() {
                if ((this.f9701a & 64) == 0) {
                    this.f9709r = new ArrayList(this.f9709r);
                    this.f9701a |= 64;
                }
            }

            private void t() {
                if ((this.f9701a & 256) == 0) {
                    this.f9713v = new ArrayList(this.f9713v);
                    this.f9701a |= 256;
                }
            }

            private void u() {
                if ((this.f9701a & 32) == 0) {
                    this.f9707g = new ArrayList(this.f9707g);
                    this.f9701a |= 32;
                }
            }

            private void v() {
                if (!this.f9705e.p0()) {
                    this.f9705e = (o0.g) k0.makeMutableCopy(this.f9705e);
                }
                this.f9701a |= 8;
            }

            private void w() {
                if ((this.f9701a & 128) == 0) {
                    this.f9711t = new ArrayList(this.f9711t);
                    this.f9701a |= 128;
                }
            }

            private void x() {
                if (!this.f9706f.p0()) {
                    this.f9706f = (o0.g) k0.makeMutableCopy(this.f9706f);
                }
                this.f9701a |= 16;
            }

            public int A() {
                g2 g2Var = this.f9710s;
                return g2Var == null ? this.f9709r.size() : g2Var.n();
            }

            public j C(int i10) {
                g2 g2Var = this.f9714w;
                return g2Var == null ? (j) this.f9713v.get(i10) : (j) g2Var.o(i10);
            }

            public int D() {
                g2 g2Var = this.f9714w;
                return g2Var == null ? this.f9713v.size() : g2Var.n();
            }

            public b F(int i10) {
                g2 g2Var = this.f9708h;
                return g2Var == null ? (b) this.f9707g.get(i10) : (b) g2Var.o(i10);
            }

            public int G() {
                g2 g2Var = this.f9708h;
                return g2Var == null ? this.f9707g.size() : g2Var.n();
            }

            public m I() {
                k2 k2Var = this.f9716y;
                if (k2Var != null) {
                    return (m) k2Var.f();
                }
                m mVar = this.f9715x;
                return mVar == null ? m.p0() : mVar;
            }

            public m.b J() {
                this.f9701a |= WXMediaMessage.TITLE_LENGTH_LIMIT;
                onChanged();
                return (m.b) K().e();
            }

            public s L(int i10) {
                g2 g2Var = this.f9712u;
                return g2Var == null ? (s) this.f9711t.get(i10) : (s) g2Var.o(i10);
            }

            public int M() {
                g2 g2Var = this.f9712u;
                return g2Var == null ? this.f9711t.size() : g2Var.n();
            }

            public u O() {
                k2 k2Var = this.A;
                if (k2Var != null) {
                    return (u) k2Var.f();
                }
                u uVar = this.f9717z;
                return uVar == null ? u.p() : uVar;
            }

            public u.b P() {
                this.f9701a |= WXMediaMessage.DESCRIPTION_LENGTH_LIMIT;
                onChanged();
                return (u.b) Q().e();
            }

            public boolean R() {
                return (this.f9701a & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: U */
            public b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            switch (iK) {
                                case 0:
                                    z10 = true;
                                    break;
                                case 10:
                                    this.f9702b = mVar.r();
                                    this.f9701a |= 1;
                                    break;
                                case 18:
                                    this.f9703c = mVar.r();
                                    this.f9701a |= 2;
                                    break;
                                case 26:
                                    com.google.protobuf.l lVarR = mVar.r();
                                    p();
                                    this.f9704d.w(lVarR);
                                    break;
                                case 34:
                                    b bVar = (b) mVar.A(b.f9324w, yVar);
                                    g2 g2Var = this.f9708h;
                                    if (g2Var == null) {
                                        u();
                                        this.f9707g.add(bVar);
                                    } else {
                                        g2Var.f(bVar);
                                    }
                                    break;
                                case 42:
                                    d dVar = (d) mVar.A(d.f9389r, yVar);
                                    g2 g2Var2 = this.f9710s;
                                    if (g2Var2 == null) {
                                        r();
                                        this.f9709r.add(dVar);
                                    } else {
                                        g2Var2.f(dVar);
                                    }
                                    break;
                                case 50:
                                    s sVar = (s) mVar.A(s.f9840g, yVar);
                                    g2 g2Var3 = this.f9712u;
                                    if (g2Var3 == null) {
                                        w();
                                        this.f9711t.add(sVar);
                                    } else {
                                        g2Var3.f(sVar);
                                    }
                                    break;
                                case 58:
                                    j jVar = (j) mVar.A(j.f9557x, yVar);
                                    g2 g2Var4 = this.f9714w;
                                    if (g2Var4 == null) {
                                        t();
                                        this.f9713v.add(jVar);
                                    } else {
                                        g2Var4.f(jVar);
                                    }
                                    break;
                                case 66:
                                    mVar.B(K().e(), yVar);
                                    this.f9701a |= WXMediaMessage.TITLE_LENGTH_LIMIT;
                                    break;
                                case 74:
                                    mVar.B(Q().e(), yVar);
                                    this.f9701a |= WXMediaMessage.DESCRIPTION_LENGTH_LIMIT;
                                    break;
                                case 80:
                                    int iY = mVar.y();
                                    v();
                                    this.f9705e.x(iY);
                                    break;
                                case 82:
                                    int iP = mVar.p(mVar.C());
                                    v();
                                    while (mVar.e() > 0) {
                                        this.f9705e.x(mVar.y());
                                    }
                                    mVar.o(iP);
                                    break;
                                case 88:
                                    int iY2 = mVar.y();
                                    x();
                                    this.f9706f.x(iY2);
                                    break;
                                case 90:
                                    int iP2 = mVar.p(mVar.C());
                                    x();
                                    while (mVar.e() > 0) {
                                        this.f9706f.x(mVar.y());
                                    }
                                    mVar.o(iP2);
                                    break;
                                case 98:
                                    this.B = mVar.r();
                                    this.f9701a |= 2048;
                                    break;
                                case 112:
                                    int iT = mVar.t();
                                    if (c.a(iT) == null) {
                                        mergeUnknownVarintField(14, iT);
                                    } else {
                                        this.C = iT;
                                        this.f9701a |= 4096;
                                    }
                                    break;
                                default:
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                        z10 = true;
                                    }
                                    break;
                            }
                        } catch (p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }

            public b V(l lVar) {
                if (lVar == l.W()) {
                    return this;
                }
                if (lVar.y0()) {
                    this.f9702b = lVar.f9687b;
                    this.f9701a |= 1;
                    onChanged();
                }
                if (lVar.A0()) {
                    this.f9703c = lVar.f9688c;
                    this.f9701a |= 2;
                    onChanged();
                }
                if (!lVar.f9689d.isEmpty()) {
                    if (this.f9704d.isEmpty()) {
                        this.f9704d = lVar.f9689d;
                        this.f9701a |= 4;
                    } else {
                        p();
                        this.f9704d.addAll(lVar.f9689d);
                    }
                    onChanged();
                }
                if (!lVar.f9690e.isEmpty()) {
                    if (this.f9705e.isEmpty()) {
                        o0.g gVar = lVar.f9690e;
                        this.f9705e = gVar;
                        gVar.r();
                        this.f9701a |= 8;
                    } else {
                        v();
                        this.f9705e.addAll(lVar.f9690e);
                    }
                    onChanged();
                }
                if (!lVar.f9691f.isEmpty()) {
                    if (this.f9706f.isEmpty()) {
                        o0.g gVar2 = lVar.f9691f;
                        this.f9706f = gVar2;
                        gVar2.r();
                        this.f9701a |= 16;
                    } else {
                        x();
                        this.f9706f.addAll(lVar.f9691f);
                    }
                    onChanged();
                }
                if (this.f9708h == null) {
                    if (!lVar.f9692g.isEmpty()) {
                        if (this.f9707g.isEmpty()) {
                            this.f9707g = lVar.f9692g;
                            this.f9701a &= -33;
                        } else {
                            u();
                            this.f9707g.addAll(lVar.f9692g);
                        }
                        onChanged();
                    }
                } else if (!lVar.f9692g.isEmpty()) {
                    if (this.f9708h.u()) {
                        this.f9708h.i();
                        this.f9708h = null;
                        this.f9707g = lVar.f9692g;
                        this.f9701a &= -33;
                        this.f9708h = k0.alwaysUseFieldBuilders ? H() : null;
                    } else {
                        this.f9708h.b(lVar.f9692g);
                    }
                }
                if (this.f9710s == null) {
                    if (!lVar.f9693h.isEmpty()) {
                        if (this.f9709r.isEmpty()) {
                            this.f9709r = lVar.f9693h;
                            this.f9701a &= -65;
                        } else {
                            r();
                            this.f9709r.addAll(lVar.f9693h);
                        }
                        onChanged();
                    }
                } else if (!lVar.f9693h.isEmpty()) {
                    if (this.f9710s.u()) {
                        this.f9710s.i();
                        this.f9710s = null;
                        this.f9709r = lVar.f9693h;
                        this.f9701a &= -65;
                        this.f9710s = k0.alwaysUseFieldBuilders ? B() : null;
                    } else {
                        this.f9710s.b(lVar.f9693h);
                    }
                }
                if (this.f9712u == null) {
                    if (!lVar.f9694r.isEmpty()) {
                        if (this.f9711t.isEmpty()) {
                            this.f9711t = lVar.f9694r;
                            this.f9701a &= -129;
                        } else {
                            w();
                            this.f9711t.addAll(lVar.f9694r);
                        }
                        onChanged();
                    }
                } else if (!lVar.f9694r.isEmpty()) {
                    if (this.f9712u.u()) {
                        this.f9712u.i();
                        this.f9712u = null;
                        this.f9711t = lVar.f9694r;
                        this.f9701a &= -129;
                        this.f9712u = k0.alwaysUseFieldBuilders ? N() : null;
                    } else {
                        this.f9712u.b(lVar.f9694r);
                    }
                }
                if (this.f9714w == null) {
                    if (!lVar.f9695s.isEmpty()) {
                        if (this.f9713v.isEmpty()) {
                            this.f9713v = lVar.f9695s;
                            this.f9701a &= -257;
                        } else {
                            t();
                            this.f9713v.addAll(lVar.f9695s);
                        }
                        onChanged();
                    }
                } else if (!lVar.f9695s.isEmpty()) {
                    if (this.f9714w.u()) {
                        this.f9714w.i();
                        this.f9714w = null;
                        this.f9713v = lVar.f9695s;
                        this.f9701a &= -257;
                        this.f9714w = k0.alwaysUseFieldBuilders ? E() : null;
                    } else {
                        this.f9714w.b(lVar.f9695s);
                    }
                }
                if (lVar.z0()) {
                    X(lVar.l0());
                }
                if (lVar.B0()) {
                    Y(lVar.t0());
                }
                if (lVar.C0()) {
                    this.B = lVar.f9698v;
                    this.f9701a |= 2048;
                    onChanged();
                }
                if (lVar.x0()) {
                    a0(lVar.b0());
                }
                m141mergeUnknownFields(lVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: W */
            public b mergeFrom(i1 i1Var) {
                if (i1Var instanceof l) {
                    return V((l) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public b X(m mVar) {
                m mVar2;
                k2 k2Var = this.f9716y;
                if (k2Var != null) {
                    k2Var.h(mVar);
                } else if ((this.f9701a & WXMediaMessage.TITLE_LENGTH_LIMIT) == 0 || (mVar2 = this.f9715x) == null || mVar2 == m.p0()) {
                    this.f9715x = mVar;
                } else {
                    J().L(mVar);
                }
                if (this.f9715x != null) {
                    this.f9701a |= WXMediaMessage.TITLE_LENGTH_LIMIT;
                    onChanged();
                }
                return this;
            }

            public b Y(u uVar) {
                u uVar2;
                k2 k2Var = this.A;
                if (k2Var != null) {
                    k2Var.h(uVar);
                } else if ((this.f9701a & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) == 0 || (uVar2 = this.f9717z) == null || uVar2 == u.p()) {
                    this.f9717z = uVar;
                } else {
                    P().u(uVar);
                }
                if (this.f9717z != null) {
                    this.f9701a |= WXMediaMessage.DESCRIPTION_LENGTH_LIMIT;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
            public final b m1148mergeUnknownFields(t2 t2Var) {
                return (b) super.m1148mergeUnknownFields(t2Var);
            }

            public b a0(c cVar) {
                cVar.getClass();
                this.f9701a |= 4096;
                this.C = cVar.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: b0 */
            public b setField(r.g gVar, Object obj) {
                return (b) super.setField(gVar, obj);
            }

            public b c0(String str) {
                str.getClass();
                this.f9702b = str;
                this.f9701a |= 1;
                onChanged();
                return this;
            }

            public b d0(String str) {
                str.getClass();
                this.f9703c = str;
                this.f9701a |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: e0 */
            public final b setUnknownFields(t2 t2Var) {
                return (b) super.setUnknownFields(t2Var);
            }

            public b g(b bVar) {
                g2 g2Var = this.f9708h;
                if (g2Var != null) {
                    g2Var.f(bVar);
                    return this;
                }
                bVar.getClass();
                u();
                this.f9707g.add(bVar);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return q.f9288c;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: h */
            public b addRepeatedField(r.g gVar, Object obj) {
                return (b) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: i */
            public l build() {
                l lVarBuildPartial = buildPartial();
                if (lVarBuildPartial.isInitialized()) {
                    return lVarBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) lVarBuildPartial);
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return q.f9290d.d(l.class, b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < G(); i10++) {
                    if (!F(i10).isInitialized()) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < A(); i11++) {
                    if (!z(i11).isInitialized()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < M(); i12++) {
                    if (!L(i12).isInitialized()) {
                        return false;
                    }
                }
                for (int i13 = 0; i13 < D(); i13++) {
                    if (!C(i13).isInitialized()) {
                        return false;
                    }
                }
                return !R() || I().isInitialized();
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: j */
            public l buildPartial() {
                l lVar = new l(this);
                m(lVar);
                if (this.f9701a != 0) {
                    k(lVar);
                }
                onBuilt();
                return lVar;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public b m1140clearField(r.g gVar) {
                return (b) super.m1140clearField(gVar);
            }

            /* JADX INFO: renamed from: o */
            public b clone() {
                return (b) super.m1147clone();
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: y */
            public l getDefaultInstanceForType() {
                return l.W();
            }

            public d z(int i10) {
                g2 g2Var = this.f9710s;
                return g2Var == null ? (d) this.f9709r.get(i10) : (d) g2Var.o(i10);
            }

            /* synthetic */ b(k0.c cVar, a aVar) {
                this(cVar);
            }

            private b() {
                this.f9702b = "";
                this.f9703c = "";
                this.f9704d = u0.e();
                this.f9705e = k0.emptyIntList();
                this.f9706f = k0.emptyIntList();
                List list = Collections.EMPTY_LIST;
                this.f9707g = list;
                this.f9709r = list;
                this.f9711t = list;
                this.f9713v = list;
                this.B = "";
                this.C = 0;
                T();
            }

            private b(k0.c cVar) {
                super(cVar);
                this.f9702b = "";
                this.f9703c = "";
                this.f9704d = u0.e();
                this.f9705e = k0.emptyIntList();
                this.f9706f = k0.emptyIntList();
                List list = Collections.EMPTY_LIST;
                this.f9707g = list;
                this.f9709r = list;
                this.f9711t = list;
                this.f9713v = list;
                this.B = "";
                this.C = 0;
                T();
            }
        }

        /* synthetic */ l(k0.b bVar, a aVar) {
            this(bVar);
        }

        public static b D0() {
            return f9684y.toBuilder();
        }

        public static l G0(byte[] bArr) {
            return (l) f9685z.parseFrom(bArr);
        }

        static /* synthetic */ int T(l lVar, int i10) {
            int i11 = i10 | lVar.f9686a;
            lVar.f9686a = i11;
            return i11;
        }

        public static l W() {
            return f9684y;
        }

        public static final r.b getDescriptor() {
            return q.f9288c;
        }

        public boolean A0() {
            return (this.f9686a & 2) != 0;
        }

        public boolean B0() {
            return (this.f9686a & 8) != 0;
        }

        public boolean C0() {
            return (this.f9686a & 16) != 0;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: E0 */
        public b newBuilderForType() {
            return D0();
        }

        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: F0 */
        public b newBuilderForType(k0.c cVar) {
            return new b(cVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: H0 */
        public b toBuilder() {
            return this == f9684y ? new b() : new b().V(this);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: X */
        public l getDefaultInstanceForType() {
            return f9684y;
        }

        public String Y(int i10) {
            return this.f9689d.get(i10);
        }

        public int Z() {
            return this.f9689d.size();
        }

        public e2 a0() {
            return this.f9689d;
        }

        public c b0() {
            c cVarA = c.a(this.f9699w);
            return cVarA == null ? c.EDITION_UNKNOWN : cVarA;
        }

        public d c0(int i10) {
            return (d) this.f9693h.get(i10);
        }

        public int d0() {
            return this.f9693h.size();
        }

        public List e0() {
            return this.f9693h;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof l)) {
                return super.equals(obj);
            }
            l lVar = (l) obj;
            if (y0() != lVar.y0()) {
                return false;
            }
            if ((y0() && !getName().equals(lVar.getName())) || A0() != lVar.A0()) {
                return false;
            }
            if ((A0() && !m0().equals(lVar.m0())) || !a0().equals(lVar.a0()) || !p0().equals(lVar.p0()) || !w0().equals(lVar.w0()) || !k0().equals(lVar.k0()) || !e0().equals(lVar.e0()) || !s0().equals(lVar.s0()) || !h0().equals(lVar.h0()) || z0() != lVar.z0()) {
                return false;
            }
            if ((z0() && !l0().equals(lVar.l0())) || B0() != lVar.B0()) {
                return false;
            }
            if ((B0() && !t0().equals(lVar.t0())) || C0() != lVar.C0()) {
                return false;
            }
            if ((!C0() || u0().equals(lVar.u0())) && x0() == lVar.x0()) {
                return (!x0() || this.f9699w == lVar.f9699w) && getUnknownFields().equals(lVar.getUnknownFields());
            }
            return false;
        }

        public j f0(int i10) {
            return (j) this.f9695s.get(i10);
        }

        public int g0() {
            return this.f9695s.size();
        }

        public String getName() {
            Object obj = this.f9687b;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f9687b = strN;
            }
            return strN;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return f9685z;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = (this.f9686a & 1) != 0 ? k0.computeStringSize(1, this.f9687b) : 0;
            if ((this.f9686a & 2) != 0) {
                iComputeStringSize += k0.computeStringSize(2, this.f9688c);
            }
            int iComputeStringSizeNoTag = 0;
            for (int i11 = 0; i11 < this.f9689d.size(); i11++) {
                iComputeStringSizeNoTag += k0.computeStringSizeNoTag(this.f9689d.h0(i11));
            }
            int size = iComputeStringSize + iComputeStringSizeNoTag + a0().size();
            for (int i12 = 0; i12 < this.f9692g.size(); i12++) {
                size += com.google.protobuf.o.G(4, (l1) this.f9692g.get(i12));
            }
            for (int i13 = 0; i13 < this.f9693h.size(); i13++) {
                size += com.google.protobuf.o.G(5, (l1) this.f9693h.get(i13));
            }
            for (int i14 = 0; i14 < this.f9694r.size(); i14++) {
                size += com.google.protobuf.o.G(6, (l1) this.f9694r.get(i14));
            }
            for (int i15 = 0; i15 < this.f9695s.size(); i15++) {
                size += com.google.protobuf.o.G(7, (l1) this.f9695s.get(i15));
            }
            if ((this.f9686a & 4) != 0) {
                size += com.google.protobuf.o.G(8, l0());
            }
            if ((this.f9686a & 8) != 0) {
                size += com.google.protobuf.o.G(9, t0());
            }
            int iY = 0;
            for (int i16 = 0; i16 < this.f9690e.size(); i16++) {
                iY += com.google.protobuf.o.y(this.f9690e.getInt(i16));
            }
            int size2 = size + iY + p0().size();
            int iY2 = 0;
            for (int i17 = 0; i17 < this.f9691f.size(); i17++) {
                iY2 += com.google.protobuf.o.y(this.f9691f.getInt(i17));
            }
            int size3 = size2 + iY2 + w0().size();
            if ((this.f9686a & 16) != 0) {
                size3 += k0.computeStringSize(12, this.f9698v);
            }
            if ((this.f9686a & 32) != 0) {
                size3 += com.google.protobuf.o.l(14, this.f9699w);
            }
            int serializedSize = size3 + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public List h0() {
            return this.f9695s;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (y0()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (A0()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + m0().hashCode();
            }
            if (Z() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + a0().hashCode();
            }
            if (o0() > 0) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + p0().hashCode();
            }
            if (v0() > 0) {
                iHashCode = (((iHashCode * 37) + 11) * 53) + w0().hashCode();
            }
            if (j0() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + k0().hashCode();
            }
            if (d0() > 0) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + e0().hashCode();
            }
            if (r0() > 0) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + s0().hashCode();
            }
            if (g0() > 0) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + h0().hashCode();
            }
            if (z0()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + l0().hashCode();
            }
            if (B0()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + t0().hashCode();
            }
            if (C0()) {
                iHashCode = (((iHashCode * 37) + 12) * 53) + u0().hashCode();
            }
            if (x0()) {
                iHashCode = (((iHashCode * 37) + 14) * 53) + this.f9699w;
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        public b i0(int i10) {
            return (b) this.f9692g.get(i10);
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return q.f9290d.d(l.class, b.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9700x;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < j0(); i10++) {
                if (!i0(i10).isInitialized()) {
                    this.f9700x = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < d0(); i11++) {
                if (!c0(i11).isInitialized()) {
                    this.f9700x = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < r0(); i12++) {
                if (!q0(i12).isInitialized()) {
                    this.f9700x = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < g0(); i13++) {
                if (!f0(i13).isInitialized()) {
                    this.f9700x = (byte) 0;
                    return false;
                }
            }
            if (!z0() || l0().isInitialized()) {
                this.f9700x = (byte) 1;
                return true;
            }
            this.f9700x = (byte) 0;
            return false;
        }

        public int j0() {
            return this.f9692g.size();
        }

        public List k0() {
            return this.f9692g;
        }

        public m l0() {
            m mVar = this.f9696t;
            return mVar == null ? m.p0() : mVar;
        }

        public String m0() {
            Object obj = this.f9688c;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f9688c = strN;
            }
            return strN;
        }

        public int n0(int i10) {
            return this.f9690e.getInt(i10);
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new l();
        }

        public int o0() {
            return this.f9690e.size();
        }

        public List p0() {
            return this.f9690e;
        }

        public s q0(int i10) {
            return (s) this.f9694r.get(i10);
        }

        public int r0() {
            return this.f9694r.size();
        }

        public List s0() {
            return this.f9694r;
        }

        public u t0() {
            u uVar = this.f9697u;
            return uVar == null ? u.p() : uVar;
        }

        public String u0() {
            Object obj = this.f9698v;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f9698v = strN;
            }
            return strN;
        }

        public int v0() {
            return this.f9691f.size();
        }

        public List w0() {
            return this.f9691f;
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if ((this.f9686a & 1) != 0) {
                k0.writeString(oVar, 1, this.f9687b);
            }
            if ((this.f9686a & 2) != 0) {
                k0.writeString(oVar, 2, this.f9688c);
            }
            for (int i10 = 0; i10 < this.f9689d.size(); i10++) {
                k0.writeString(oVar, 3, this.f9689d.h0(i10));
            }
            for (int i11 = 0; i11 < this.f9692g.size(); i11++) {
                oVar.H0(4, (l1) this.f9692g.get(i11));
            }
            for (int i12 = 0; i12 < this.f9693h.size(); i12++) {
                oVar.H0(5, (l1) this.f9693h.get(i12));
            }
            for (int i13 = 0; i13 < this.f9694r.size(); i13++) {
                oVar.H0(6, (l1) this.f9694r.get(i13));
            }
            for (int i14 = 0; i14 < this.f9695s.size(); i14++) {
                oVar.H0(7, (l1) this.f9695s.get(i14));
            }
            if ((this.f9686a & 4) != 0) {
                oVar.H0(8, l0());
            }
            if ((this.f9686a & 8) != 0) {
                oVar.H0(9, t0());
            }
            for (int i15 = 0; i15 < this.f9690e.size(); i15++) {
                oVar.D0(10, this.f9690e.getInt(i15));
            }
            for (int i16 = 0; i16 < this.f9691f.size(); i16++) {
                oVar.D0(11, this.f9691f.getInt(i16));
            }
            if ((this.f9686a & 16) != 0) {
                k0.writeString(oVar, 12, this.f9698v);
            }
            if ((this.f9686a & 32) != 0) {
                oVar.u0(14, this.f9699w);
            }
            getUnknownFields().writeTo(oVar);
        }

        public boolean x0() {
            return (this.f9686a & 32) != 0;
        }

        public boolean y0() {
            return (this.f9686a & 1) != 0;
        }

        public boolean z0() {
            return (this.f9686a & 4) != 0;
        }

        private l(k0.b bVar) {
            super(bVar);
            this.f9687b = "";
            this.f9688c = "";
            this.f9689d = u0.e();
            this.f9690e = k0.emptyIntList();
            this.f9691f = k0.emptyIntList();
            this.f9698v = "";
            this.f9699w = 0;
            this.f9700x = (byte) -1;
        }

        private l() {
            this.f9687b = "";
            this.f9688c = "";
            this.f9689d = u0.e();
            this.f9690e = k0.emptyIntList();
            this.f9691f = k0.emptyIntList();
            this.f9698v = "";
            this.f9699w = 0;
            this.f9700x = (byte) -1;
            this.f9687b = "";
            this.f9688c = "";
            this.f9689d = u0.e();
            this.f9690e = k0.emptyIntList();
            this.f9691f = k0.emptyIntList();
            List list = Collections.EMPTY_LIST;
            this.f9692g = list;
            this.f9693h = list;
            this.f9694r = list;
            this.f9695s = list;
            this.f9698v = "";
            this.f9699w = 0;
        }
    }

    public static final class m extends k0.e implements o1 {
        private static final m I = new m();
        public static final z1 J = new a();
        private volatile Object A;
        private volatile Object B;
        private volatile Object C;
        private volatile Object D;
        private volatile Object E;
        private i F;
        private List G;
        private byte H;

        /* JADX INFO: renamed from: b */
        private int f9718b;

        /* JADX INFO: renamed from: c */
        private volatile Object f9719c;

        /* JADX INFO: renamed from: d */
        private volatile Object f9720d;

        /* JADX INFO: renamed from: e */
        private boolean f9721e;

        /* JADX INFO: renamed from: f */
        private boolean f9722f;

        /* JADX INFO: renamed from: g */
        private boolean f9723g;

        /* JADX INFO: renamed from: h */
        private int f9724h;

        /* JADX INFO: renamed from: r */
        private volatile Object f9725r;

        /* JADX INFO: renamed from: s */
        private boolean f9726s;

        /* JADX INFO: renamed from: t */
        private boolean f9727t;

        /* JADX INFO: renamed from: u */
        private boolean f9728u;

        /* JADX INFO: renamed from: v */
        private boolean f9729v;

        /* JADX INFO: renamed from: w */
        private boolean f9730w;

        /* JADX INFO: renamed from: x */
        private boolean f9731x;

        /* JADX INFO: renamed from: y */
        private volatile Object f9732y;

        /* JADX INFO: renamed from: z */
        private volatile Object f9733z;

        class a extends com.google.protobuf.c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c */
            public m parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                b bVarH1 = m.h1();
                try {
                    bVarH1.mergeFrom(mVar, yVar);
                    return bVarH1.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(bVarH1.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(bVarH1.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(bVarH1.buildPartial());
                }
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                return super.parseDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                return super.parseFrom(lVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                return super.mo1183parsePartialDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                return super.mo1185parsePartialFrom(lVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                return super.parseDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                return super.parseFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                return super.mo1186parsePartialFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                return super.parseFrom(mVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                return super.mo1187parsePartialFrom(mVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                return super.parseFrom(mVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                return super.parseFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                return super.mo1188parsePartialFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                return super.parseFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                return super.mo1189parsePartialFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                return super.parseFrom(byteBuffer);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                return super.mo1190parsePartialFrom(bArr);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                return super.parseFrom(byteBuffer, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                return super.mo1191parsePartialFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                return super.mo1181parseFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                return super.mo1193parsePartialFrom(bArr, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1182parseFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                return super.parseFrom(bArr, yVar);
            }
        }

        public static final class b extends k0.d implements o1 {
            private Object A;
            private Object B;
            private Object C;
            private Object D;
            private Object E;
            private i F;
            private k2 G;
            private List H;
            private g2 I;

            /* JADX INFO: renamed from: b */
            private int f9734b;

            /* JADX INFO: renamed from: c */
            private Object f9735c;

            /* JADX INFO: renamed from: d */
            private Object f9736d;

            /* JADX INFO: renamed from: e */
            private boolean f9737e;

            /* JADX INFO: renamed from: f */
            private boolean f9738f;

            /* JADX INFO: renamed from: g */
            private boolean f9739g;

            /* JADX INFO: renamed from: h */
            private int f9740h;

            /* JADX INFO: renamed from: r */
            private Object f9741r;

            /* JADX INFO: renamed from: s */
            private boolean f9742s;

            /* JADX INFO: renamed from: t */
            private boolean f9743t;

            /* JADX INFO: renamed from: u */
            private boolean f9744u;

            /* JADX INFO: renamed from: v */
            private boolean f9745v;

            /* JADX INFO: renamed from: w */
            private boolean f9746w;

            /* JADX INFO: renamed from: x */
            private boolean f9747x;

            /* JADX INFO: renamed from: y */
            private Object f9748y;

            /* JADX INFO: renamed from: z */
            private Object f9749z;

            /* synthetic */ b(a aVar) {
                this();
            }

            private k2 D() {
                if (this.G == null) {
                    this.G = new k2(B(), getParentForChildren(), isClean());
                    this.F = null;
                }
                return this.G;
            }

            private g2 G() {
                if (this.I == null) {
                    this.I = new g2(this.H, (this.f9734b & 2097152) != 0, getParentForChildren(), isClean());
                    this.H = null;
                }
                return this.I;
            }

            private void I() {
                if (k0.alwaysUseFieldBuilders) {
                    D();
                    G();
                }
            }

            private void v(m mVar) {
                int i10;
                int i11 = this.f9734b;
                if ((i11 & 1) != 0) {
                    mVar.f9719c = this.f9735c;
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 2) != 0) {
                    mVar.f9720d = this.f9736d;
                    i10 |= 2;
                }
                if ((i11 & 4) != 0) {
                    mVar.f9721e = this.f9737e;
                    i10 |= 4;
                }
                if ((i11 & 8) != 0) {
                    mVar.f9722f = this.f9738f;
                    i10 |= 8;
                }
                if ((i11 & 16) != 0) {
                    mVar.f9723g = this.f9739g;
                    i10 |= 16;
                }
                if ((i11 & 32) != 0) {
                    mVar.f9724h = this.f9740h;
                    i10 |= 32;
                }
                if ((i11 & 64) != 0) {
                    mVar.f9725r = this.f9741r;
                    i10 |= 64;
                }
                if ((i11 & 128) != 0) {
                    mVar.f9726s = this.f9742s;
                    i10 |= 128;
                }
                if ((i11 & 256) != 0) {
                    mVar.f9727t = this.f9743t;
                    i10 |= 256;
                }
                if ((i11 & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0) {
                    mVar.f9728u = this.f9744u;
                    i10 |= WXMediaMessage.TITLE_LENGTH_LIMIT;
                }
                if ((i11 & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0) {
                    mVar.f9729v = this.f9745v;
                    i10 |= WXMediaMessage.DESCRIPTION_LENGTH_LIMIT;
                }
                if ((i11 & 2048) != 0) {
                    mVar.f9730w = this.f9746w;
                    i10 |= 2048;
                }
                if ((i11 & 4096) != 0) {
                    mVar.f9731x = this.f9747x;
                    i10 |= 4096;
                }
                if ((i11 & 8192) != 0) {
                    mVar.f9732y = this.f9748y;
                    i10 |= 8192;
                }
                if ((i11 & 16384) != 0) {
                    mVar.f9733z = this.f9749z;
                    i10 |= 16384;
                }
                if ((i11 & 32768) != 0) {
                    mVar.A = this.A;
                    i10 |= 32768;
                }
                if ((i11 & WXMediaMessage.THUMB_LENGTH_LIMIT) != 0) {
                    mVar.B = this.B;
                    i10 |= WXMediaMessage.THUMB_LENGTH_LIMIT;
                }
                if ((i11 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
                    mVar.C = this.C;
                    i10 |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                }
                if ((i11 & 262144) != 0) {
                    mVar.D = this.D;
                    i10 |= 262144;
                }
                if ((i11 & 524288) != 0) {
                    mVar.E = this.E;
                    i10 |= 524288;
                }
                if ((i11 & 1048576) != 0) {
                    k2 k2Var = this.G;
                    mVar.F = k2Var == null ? this.F : (i) k2Var.b();
                    i10 |= 1048576;
                }
                m.l0(mVar, i10);
            }

            private void w(m mVar) {
                g2 g2Var = this.I;
                if (g2Var != null) {
                    mVar.G = g2Var.g();
                    return;
                }
                if ((this.f9734b & 2097152) != 0) {
                    this.H = DesugarCollections.unmodifiableList(this.H);
                    this.f9734b &= -2097153;
                }
                mVar.G = this.H;
            }

            private void z() {
                if ((this.f9734b & 2097152) == 0) {
                    this.H = new ArrayList(this.H);
                    this.f9734b |= 2097152;
                }
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: A */
            public m getDefaultInstanceForType() {
                return m.p0();
            }

            public i B() {
                k2 k2Var = this.G;
                if (k2Var != null) {
                    return (i) k2Var.f();
                }
                i iVar = this.F;
                return iVar == null ? i.D() : iVar;
            }

            public i.b C() {
                this.f9734b |= 1048576;
                onChanged();
                return (i.b) D().e();
            }

            public v E(int i10) {
                g2 g2Var = this.I;
                return g2Var == null ? (v) this.H.get(i10) : (v) g2Var.o(i10);
            }

            public int F() {
                g2 g2Var = this.I;
                return g2Var == null ? this.H.size() : g2Var.n();
            }

            public boolean H() {
                return (this.f9734b & 1048576) != 0;
            }

            public b J(i iVar) {
                i iVar2;
                k2 k2Var = this.G;
                if (k2Var != null) {
                    k2Var.h(iVar);
                } else if ((this.f9734b & 1048576) == 0 || (iVar2 = this.F) == null || iVar2 == i.D()) {
                    this.F = iVar;
                } else {
                    C().A(iVar);
                }
                if (this.F != null) {
                    this.f9734b |= 1048576;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: K */
            public b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            switch (iK) {
                                case 0:
                                    z10 = true;
                                    break;
                                case 10:
                                    this.f9735c = mVar.r();
                                    this.f9734b |= 1;
                                    break;
                                case 66:
                                    this.f9736d = mVar.r();
                                    this.f9734b |= 2;
                                    break;
                                case 72:
                                    int iT = mVar.t();
                                    if (c.a(iT) == null) {
                                        mergeUnknownVarintField(9, iT);
                                    } else {
                                        this.f9740h = iT;
                                        this.f9734b |= 32;
                                    }
                                    break;
                                case 80:
                                    this.f9737e = mVar.q();
                                    this.f9734b |= 4;
                                    break;
                                case 90:
                                    this.f9741r = mVar.r();
                                    this.f9734b |= 64;
                                    break;
                                case 128:
                                    this.f9742s = mVar.q();
                                    this.f9734b |= 128;
                                    break;
                                case 136:
                                    this.f9743t = mVar.q();
                                    this.f9734b |= 256;
                                    break;
                                case 144:
                                    this.f9744u = mVar.q();
                                    this.f9734b |= WXMediaMessage.TITLE_LENGTH_LIMIT;
                                    break;
                                case 160:
                                    this.f9738f = mVar.q();
                                    this.f9734b |= 8;
                                    break;
                                case 184:
                                    this.f9746w = mVar.q();
                                    this.f9734b |= 2048;
                                    break;
                                case 216:
                                    this.f9739g = mVar.q();
                                    this.f9734b |= 16;
                                    break;
                                case 248:
                                    this.f9747x = mVar.q();
                                    this.f9734b |= 4096;
                                    break;
                                case 290:
                                    this.f9748y = mVar.r();
                                    this.f9734b |= 8192;
                                    break;
                                case 298:
                                    this.f9749z = mVar.r();
                                    this.f9734b |= 16384;
                                    break;
                                case 314:
                                    this.A = mVar.r();
                                    this.f9734b |= 32768;
                                    break;
                                case 322:
                                    this.B = mVar.r();
                                    this.f9734b |= WXMediaMessage.THUMB_LENGTH_LIMIT;
                                    break;
                                case 330:
                                    this.C = mVar.r();
                                    this.f9734b |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                                    break;
                                case 336:
                                    this.f9745v = mVar.q();
                                    this.f9734b |= WXMediaMessage.DESCRIPTION_LENGTH_LIMIT;
                                    break;
                                case 354:
                                    this.D = mVar.r();
                                    this.f9734b |= 262144;
                                    break;
                                case 362:
                                    this.E = mVar.r();
                                    this.f9734b |= 524288;
                                    break;
                                case 402:
                                    mVar.B(D().e(), yVar);
                                    this.f9734b |= 1048576;
                                    break;
                                case 7994:
                                    v vVar = (v) mVar.A(v.f9890t, yVar);
                                    g2 g2Var = this.I;
                                    if (g2Var == null) {
                                        z();
                                        this.H.add(vVar);
                                    } else {
                                        g2Var.f(vVar);
                                    }
                                    break;
                                default:
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                        z10 = true;
                                    }
                                    break;
                            }
                        } catch (p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }

            public b L(m mVar) {
                if (mVar == m.p0()) {
                    return this;
                }
                if (mVar.W0()) {
                    this.f9735c = mVar.f9719c;
                    this.f9734b |= 1;
                    onChanged();
                }
                if (mVar.V0()) {
                    this.f9736d = mVar.f9720d;
                    this.f9734b |= 2;
                    onChanged();
                }
                if (mVar.U0()) {
                    V(mVar.w0());
                }
                if (mVar.S0()) {
                    T(mVar.u0());
                }
                if (mVar.X0()) {
                    W(mVar.z0());
                }
                if (mVar.Z0()) {
                    X(mVar.B0());
                }
                if (mVar.R0()) {
                    this.f9741r = mVar.f9725r;
                    this.f9734b |= 64;
                    onChanged();
                }
                if (mVar.N0()) {
                    P(mVar.n0());
                }
                if (mVar.T0()) {
                    U(mVar.v0());
                }
                if (mVar.e1()) {
                    Z(mVar.G0());
                }
                if (mVar.b1()) {
                    Y(mVar.D0());
                }
                if (mVar.P0()) {
                    Q(mVar.r0());
                }
                if (mVar.M0()) {
                    O(mVar.m0());
                }
                if (mVar.Y0()) {
                    this.f9748y = mVar.f9732y;
                    this.f9734b |= 8192;
                    onChanged();
                }
                if (mVar.O0()) {
                    this.f9749z = mVar.f9733z;
                    this.f9734b |= 16384;
                    onChanged();
                }
                if (mVar.g1()) {
                    this.A = mVar.A;
                    this.f9734b |= 32768;
                    onChanged();
                }
                if (mVar.a1()) {
                    this.B = mVar.B;
                    this.f9734b |= WXMediaMessage.THUMB_LENGTH_LIMIT;
                    onChanged();
                }
                if (mVar.d1()) {
                    this.C = mVar.C;
                    this.f9734b |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                    onChanged();
                }
                if (mVar.c1()) {
                    this.D = mVar.D;
                    this.f9734b |= 262144;
                    onChanged();
                }
                if (mVar.f1()) {
                    this.E = mVar.E;
                    this.f9734b |= 524288;
                    onChanged();
                }
                if (mVar.Q0()) {
                    J(mVar.s0());
                }
                if (this.I == null) {
                    if (!mVar.G.isEmpty()) {
                        if (this.H.isEmpty()) {
                            this.H = mVar.G;
                            this.f9734b &= -2097153;
                        } else {
                            z();
                            this.H.addAll(mVar.G);
                        }
                        onChanged();
                    }
                } else if (!mVar.G.isEmpty()) {
                    if (this.I.u()) {
                        this.I.i();
                        this.I = null;
                        this.H = mVar.G;
                        this.f9734b = (-2097153) & this.f9734b;
                        this.I = k0.alwaysUseFieldBuilders ? G() : null;
                    } else {
                        this.I.b(mVar.G);
                    }
                }
                n(mVar);
                m141mergeUnknownFields(mVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: M */
            public b mergeFrom(i1 i1Var) {
                if (i1Var instanceof m) {
                    return L((m) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final b m1148mergeUnknownFields(t2 t2Var) {
                return (b) super.m1148mergeUnknownFields(t2Var);
            }

            public b O(boolean z10) {
                this.f9747x = z10;
                this.f9734b |= 4096;
                onChanged();
                return this;
            }

            public b P(boolean z10) {
                this.f9742s = z10;
                this.f9734b |= 128;
                onChanged();
                return this;
            }

            public b Q(boolean z10) {
                this.f9746w = z10;
                this.f9734b |= 2048;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: R */
            public b setField(r.g gVar, Object obj) {
                return (b) super.o(gVar, obj);
            }

            public b T(boolean z10) {
                this.f9738f = z10;
                this.f9734b |= 8;
                onChanged();
                return this;
            }

            public b U(boolean z10) {
                this.f9743t = z10;
                this.f9734b |= 256;
                onChanged();
                return this;
            }

            public b V(boolean z10) {
                this.f9737e = z10;
                this.f9734b |= 4;
                onChanged();
                return this;
            }

            public b W(boolean z10) {
                this.f9739g = z10;
                this.f9734b |= 16;
                onChanged();
                return this;
            }

            public b X(c cVar) {
                cVar.getClass();
                this.f9734b |= 32;
                this.f9740h = cVar.getNumber();
                onChanged();
                return this;
            }

            public b Y(boolean z10) {
                this.f9745v = z10;
                this.f9734b |= WXMediaMessage.DESCRIPTION_LENGTH_LIMIT;
                onChanged();
                return this;
            }

            public b Z(boolean z10) {
                this.f9744u = z10;
                this.f9734b |= WXMediaMessage.TITLE_LENGTH_LIMIT;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: a0 */
            public final b setUnknownFields(t2 t2Var) {
                return (b) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return q.C;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return q.D.d(m.class, b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                if (H() && !B().isInitialized()) {
                    return false;
                }
                for (int i10 = 0; i10 < F(); i10++) {
                    if (!E(i10).isInitialized()) {
                        return false;
                    }
                }
                return m();
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: r */
            public b addRepeatedField(r.g gVar, Object obj) {
                return (b) super.h(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: t */
            public m build() {
                m mVarBuildPartial = buildPartial();
                if (mVarBuildPartial.isInitialized()) {
                    return mVarBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) mVarBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: u */
            public m buildPartial() {
                m mVar = new m(this);
                w(mVar);
                if (this.f9734b != 0) {
                    v(mVar);
                }
                onBuilt();
                return mVar;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b m1140clearField(r.g gVar) {
                return (b) super.j(gVar);
            }

            /* JADX INFO: renamed from: y */
            public b clone() {
                return (b) super.m1147clone();
            }

            /* synthetic */ b(k0.c cVar, a aVar) {
                this(cVar);
            }

            private b() {
                this.f9735c = "";
                this.f9736d = "";
                this.f9740h = 1;
                this.f9741r = "";
                this.f9747x = true;
                this.f9748y = "";
                this.f9749z = "";
                this.A = "";
                this.B = "";
                this.C = "";
                this.D = "";
                this.E = "";
                this.H = Collections.EMPTY_LIST;
                I();
            }

            private b(k0.c cVar) {
                super(cVar);
                this.f9735c = "";
                this.f9736d = "";
                this.f9740h = 1;
                this.f9741r = "";
                this.f9747x = true;
                this.f9748y = "";
                this.f9749z = "";
                this.A = "";
                this.B = "";
                this.C = "";
                this.D = "";
                this.E = "";
                this.H = Collections.EMPTY_LIST;
                I();
            }
        }

        public enum c implements o0.c {
            SPEED(1),
            CODE_SIZE(2),
            LITE_RUNTIME(3);


            /* JADX INFO: renamed from: e */
            private static final o0.d f9753e = new a();

            /* JADX INFO: renamed from: f */
            private static final c[] f9754f = values();

            /* JADX INFO: renamed from: a */
            private final int f9756a;

            class a implements o0.d {
                a() {
                }
            }

            c(int i10) {
                this.f9756a = i10;
            }

            public static c a(int i10) {
                if (i10 == 1) {
                    return SPEED;
                }
                if (i10 == 2) {
                    return CODE_SIZE;
                }
                if (i10 != 3) {
                    return null;
                }
                return LITE_RUNTIME;
            }

            @Override // com.google.protobuf.o0.c
            public final int getNumber() {
                return this.f9756a;
            }
        }

        /* synthetic */ m(k0.d dVar, a aVar) {
            this(dVar);
        }

        public static final r.b getDescriptor() {
            return q.C;
        }

        public static b h1() {
            return I.toBuilder();
        }

        static /* synthetic */ int l0(m mVar, int i10) {
            int i11 = i10 | mVar.f9718b;
            mVar.f9718b = i11;
            return i11;
        }

        public static m p0() {
            return I;
        }

        public String A0() {
            Object obj = this.f9732y;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f9732y = strN;
            }
            return strN;
        }

        public c B0() {
            c cVarA = c.a(this.f9724h);
            return cVarA == null ? c.SPEED : cVarA;
        }

        public String C0() {
            Object obj = this.B;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.B = strN;
            }
            return strN;
        }

        public boolean D0() {
            return this.f9729v;
        }

        public String E0() {
            Object obj = this.D;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.D = strN;
            }
            return strN;
        }

        public String F0() {
            Object obj = this.C;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.C = strN;
            }
            return strN;
        }

        public boolean G0() {
            return this.f9728u;
        }

        public String H0() {
            Object obj = this.E;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.E = strN;
            }
            return strN;
        }

        public String I0() {
            Object obj = this.A;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.A = strN;
            }
            return strN;
        }

        public v J0(int i10) {
            return (v) this.G.get(i10);
        }

        public int K0() {
            return this.G.size();
        }

        public List L0() {
            return this.G;
        }

        public boolean M0() {
            return (this.f9718b & 4096) != 0;
        }

        public boolean N0() {
            return (this.f9718b & 128) != 0;
        }

        public boolean O0() {
            return (this.f9718b & 16384) != 0;
        }

        public boolean P0() {
            return (this.f9718b & 2048) != 0;
        }

        public boolean Q0() {
            return (this.f9718b & 1048576) != 0;
        }

        public boolean R0() {
            return (this.f9718b & 64) != 0;
        }

        public boolean S0() {
            return (this.f9718b & 8) != 0;
        }

        public boolean T0() {
            return (this.f9718b & 256) != 0;
        }

        public boolean U0() {
            return (this.f9718b & 4) != 0;
        }

        public boolean V0() {
            return (this.f9718b & 2) != 0;
        }

        public boolean W0() {
            return (this.f9718b & 1) != 0;
        }

        public boolean X0() {
            return (this.f9718b & 16) != 0;
        }

        public boolean Y0() {
            return (this.f9718b & 8192) != 0;
        }

        public boolean Z0() {
            return (this.f9718b & 32) != 0;
        }

        public boolean a1() {
            return (this.f9718b & WXMediaMessage.THUMB_LENGTH_LIMIT) != 0;
        }

        public boolean b1() {
            return (this.f9718b & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0;
        }

        public boolean c1() {
            return (this.f9718b & 262144) != 0;
        }

        public boolean d1() {
            return (this.f9718b & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0;
        }

        public boolean e1() {
            return (this.f9718b & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof m)) {
                return super.equals(obj);
            }
            m mVar = (m) obj;
            if (W0() != mVar.W0()) {
                return false;
            }
            if ((W0() && !y0().equals(mVar.y0())) || V0() != mVar.V0()) {
                return false;
            }
            if ((V0() && !x0().equals(mVar.x0())) || U0() != mVar.U0()) {
                return false;
            }
            if ((U0() && w0() != mVar.w0()) || S0() != mVar.S0()) {
                return false;
            }
            if ((S0() && u0() != mVar.u0()) || X0() != mVar.X0()) {
                return false;
            }
            if ((X0() && z0() != mVar.z0()) || Z0() != mVar.Z0()) {
                return false;
            }
            if ((Z0() && this.f9724h != mVar.f9724h) || R0() != mVar.R0()) {
                return false;
            }
            if ((R0() && !t0().equals(mVar.t0())) || N0() != mVar.N0()) {
                return false;
            }
            if ((N0() && n0() != mVar.n0()) || T0() != mVar.T0()) {
                return false;
            }
            if ((T0() && v0() != mVar.v0()) || e1() != mVar.e1()) {
                return false;
            }
            if ((e1() && G0() != mVar.G0()) || b1() != mVar.b1()) {
                return false;
            }
            if ((b1() && D0() != mVar.D0()) || P0() != mVar.P0()) {
                return false;
            }
            if ((P0() && r0() != mVar.r0()) || M0() != mVar.M0()) {
                return false;
            }
            if ((M0() && m0() != mVar.m0()) || Y0() != mVar.Y0()) {
                return false;
            }
            if ((Y0() && !A0().equals(mVar.A0())) || O0() != mVar.O0()) {
                return false;
            }
            if ((O0() && !o0().equals(mVar.o0())) || g1() != mVar.g1()) {
                return false;
            }
            if ((g1() && !I0().equals(mVar.I0())) || a1() != mVar.a1()) {
                return false;
            }
            if ((a1() && !C0().equals(mVar.C0())) || d1() != mVar.d1()) {
                return false;
            }
            if ((d1() && !F0().equals(mVar.F0())) || c1() != mVar.c1()) {
                return false;
            }
            if ((c1() && !E0().equals(mVar.E0())) || f1() != mVar.f1()) {
                return false;
            }
            if ((!f1() || H0().equals(mVar.H0())) && Q0() == mVar.Q0()) {
                return (!Q0() || s0().equals(mVar.s0())) && L0().equals(mVar.L0()) && getUnknownFields().equals(mVar.getUnknownFields()) && q().equals(mVar.q());
            }
            return false;
        }

        public boolean f1() {
            return (this.f9718b & 524288) != 0;
        }

        public boolean g1() {
            return (this.f9718b & 32768) != 0;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return J;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = (this.f9718b & 1) != 0 ? k0.computeStringSize(1, this.f9719c) : 0;
            if ((this.f9718b & 2) != 0) {
                iComputeStringSize += k0.computeStringSize(8, this.f9720d);
            }
            if ((this.f9718b & 32) != 0) {
                iComputeStringSize += com.google.protobuf.o.l(9, this.f9724h);
            }
            if ((this.f9718b & 4) != 0) {
                iComputeStringSize += com.google.protobuf.o.e(10, this.f9721e);
            }
            if ((this.f9718b & 64) != 0) {
                iComputeStringSize += k0.computeStringSize(11, this.f9725r);
            }
            if ((this.f9718b & 128) != 0) {
                iComputeStringSize += com.google.protobuf.o.e(16, this.f9726s);
            }
            if ((this.f9718b & 256) != 0) {
                iComputeStringSize += com.google.protobuf.o.e(17, this.f9727t);
            }
            if ((this.f9718b & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0) {
                iComputeStringSize += com.google.protobuf.o.e(18, this.f9728u);
            }
            if ((this.f9718b & 8) != 0) {
                iComputeStringSize += com.google.protobuf.o.e(20, this.f9722f);
            }
            if ((this.f9718b & 2048) != 0) {
                iComputeStringSize += com.google.protobuf.o.e(23, this.f9730w);
            }
            if ((this.f9718b & 16) != 0) {
                iComputeStringSize += com.google.protobuf.o.e(27, this.f9723g);
            }
            if ((this.f9718b & 4096) != 0) {
                iComputeStringSize += com.google.protobuf.o.e(31, this.f9731x);
            }
            if ((this.f9718b & 8192) != 0) {
                iComputeStringSize += k0.computeStringSize(36, this.f9732y);
            }
            if ((this.f9718b & 16384) != 0) {
                iComputeStringSize += k0.computeStringSize(37, this.f9733z);
            }
            if ((this.f9718b & 32768) != 0) {
                iComputeStringSize += k0.computeStringSize(39, this.A);
            }
            if ((this.f9718b & WXMediaMessage.THUMB_LENGTH_LIMIT) != 0) {
                iComputeStringSize += k0.computeStringSize(40, this.B);
            }
            if ((this.f9718b & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
                iComputeStringSize += k0.computeStringSize(41, this.C);
            }
            if ((this.f9718b & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0) {
                iComputeStringSize += com.google.protobuf.o.e(42, this.f9729v);
            }
            if ((this.f9718b & 262144) != 0) {
                iComputeStringSize += k0.computeStringSize(44, this.D);
            }
            if ((this.f9718b & 524288) != 0) {
                iComputeStringSize += k0.computeStringSize(45, this.E);
            }
            if ((this.f9718b & 1048576) != 0) {
                iComputeStringSize += com.google.protobuf.o.G(50, s0());
            }
            for (int i11 = 0; i11 < this.G.size(); i11++) {
                iComputeStringSize += com.google.protobuf.o.G(999, (l1) this.G.get(i11));
            }
            int iP = iComputeStringSize + p() + getUnknownFields().getSerializedSize();
            this.memoizedSize = iP;
            return iP;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (W0()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + y0().hashCode();
            }
            if (V0()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + x0().hashCode();
            }
            if (U0()) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + o0.d(w0());
            }
            if (S0()) {
                iHashCode = (((iHashCode * 37) + 20) * 53) + o0.d(u0());
            }
            if (X0()) {
                iHashCode = (((iHashCode * 37) + 27) * 53) + o0.d(z0());
            }
            if (Z0()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + this.f9724h;
            }
            if (R0()) {
                iHashCode = (((iHashCode * 37) + 11) * 53) + t0().hashCode();
            }
            if (N0()) {
                iHashCode = (((iHashCode * 37) + 16) * 53) + o0.d(n0());
            }
            if (T0()) {
                iHashCode = (((iHashCode * 37) + 17) * 53) + o0.d(v0());
            }
            if (e1()) {
                iHashCode = (((iHashCode * 37) + 18) * 53) + o0.d(G0());
            }
            if (b1()) {
                iHashCode = (((iHashCode * 37) + 42) * 53) + o0.d(D0());
            }
            if (P0()) {
                iHashCode = (((iHashCode * 37) + 23) * 53) + o0.d(r0());
            }
            if (M0()) {
                iHashCode = (((iHashCode * 37) + 31) * 53) + o0.d(m0());
            }
            if (Y0()) {
                iHashCode = (((iHashCode * 37) + 36) * 53) + A0().hashCode();
            }
            if (O0()) {
                iHashCode = (((iHashCode * 37) + 37) * 53) + o0().hashCode();
            }
            if (g1()) {
                iHashCode = (((iHashCode * 37) + 39) * 53) + I0().hashCode();
            }
            if (a1()) {
                iHashCode = (((iHashCode * 37) + 40) * 53) + C0().hashCode();
            }
            if (d1()) {
                iHashCode = (((iHashCode * 37) + 41) * 53) + F0().hashCode();
            }
            if (c1()) {
                iHashCode = (((iHashCode * 37) + 44) * 53) + E0().hashCode();
            }
            if (f1()) {
                iHashCode = (((iHashCode * 37) + 45) * 53) + H0().hashCode();
            }
            if (Q0()) {
                iHashCode = (((iHashCode * 37) + 50) * 53) + s0().hashCode();
            }
            if (K0() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + L0().hashCode();
            }
            int iHashFields = (com.google.protobuf.a.hashFields(iHashCode, q()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: i1 */
        public b newBuilderForType() {
            return h1();
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return q.D.d(m.class, b.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.H;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (Q0() && !s0().isInitialized()) {
                this.H = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < K0(); i10++) {
                if (!J0(i10).isInitialized()) {
                    this.H = (byte) 0;
                    return false;
                }
            }
            if (o()) {
                this.H = (byte) 1;
                return true;
            }
            this.H = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: j1 */
        public b newBuilderForType(k0.c cVar) {
            return new b(cVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: k1 */
        public b toBuilder() {
            return this == I ? new b() : new b().L(this);
        }

        public boolean m0() {
            return this.f9731x;
        }

        public boolean n0() {
            return this.f9726s;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new m();
        }

        public String o0() {
            Object obj = this.f9733z;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f9733z = strN;
            }
            return strN;
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: q0 */
        public m getDefaultInstanceForType() {
            return I;
        }

        public boolean r0() {
            return this.f9730w;
        }

        public i s0() {
            i iVar = this.F;
            return iVar == null ? i.D() : iVar;
        }

        public String t0() {
            Object obj = this.f9725r;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f9725r = strN;
            }
            return strN;
        }

        public boolean u0() {
            return this.f9722f;
        }

        public boolean v0() {
            return this.f9727t;
        }

        public boolean w0() {
            return this.f9721e;
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            k0.e.a aVarR = r();
            if ((this.f9718b & 1) != 0) {
                k0.writeString(oVar, 1, this.f9719c);
            }
            if ((this.f9718b & 2) != 0) {
                k0.writeString(oVar, 8, this.f9720d);
            }
            if ((this.f9718b & 32) != 0) {
                oVar.u0(9, this.f9724h);
            }
            if ((this.f9718b & 4) != 0) {
                oVar.m0(10, this.f9721e);
            }
            if ((this.f9718b & 64) != 0) {
                k0.writeString(oVar, 11, this.f9725r);
            }
            if ((this.f9718b & 128) != 0) {
                oVar.m0(16, this.f9726s);
            }
            if ((this.f9718b & 256) != 0) {
                oVar.m0(17, this.f9727t);
            }
            if ((this.f9718b & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0) {
                oVar.m0(18, this.f9728u);
            }
            if ((this.f9718b & 8) != 0) {
                oVar.m0(20, this.f9722f);
            }
            if ((this.f9718b & 2048) != 0) {
                oVar.m0(23, this.f9730w);
            }
            if ((this.f9718b & 16) != 0) {
                oVar.m0(27, this.f9723g);
            }
            if ((this.f9718b & 4096) != 0) {
                oVar.m0(31, this.f9731x);
            }
            if ((this.f9718b & 8192) != 0) {
                k0.writeString(oVar, 36, this.f9732y);
            }
            if ((this.f9718b & 16384) != 0) {
                k0.writeString(oVar, 37, this.f9733z);
            }
            if ((this.f9718b & 32768) != 0) {
                k0.writeString(oVar, 39, this.A);
            }
            if ((this.f9718b & WXMediaMessage.THUMB_LENGTH_LIMIT) != 0) {
                k0.writeString(oVar, 40, this.B);
            }
            if ((this.f9718b & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
                k0.writeString(oVar, 41, this.C);
            }
            if ((this.f9718b & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0) {
                oVar.m0(42, this.f9729v);
            }
            if ((this.f9718b & 262144) != 0) {
                k0.writeString(oVar, 44, this.D);
            }
            if ((this.f9718b & 524288) != 0) {
                k0.writeString(oVar, 45, this.E);
            }
            if ((this.f9718b & 1048576) != 0) {
                oVar.H0(50, s0());
            }
            for (int i10 = 0; i10 < this.G.size(); i10++) {
                oVar.H0(999, (l1) this.G.get(i10));
            }
            aVarR.a(536870912, oVar);
            getUnknownFields().writeTo(oVar);
        }

        public String x0() {
            Object obj = this.f9720d;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f9720d = strN;
            }
            return strN;
        }

        public String y0() {
            Object obj = this.f9719c;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f9719c = strN;
            }
            return strN;
        }

        public boolean z0() {
            return this.f9723g;
        }

        private m(k0.d dVar) {
            super(dVar);
            this.f9719c = "";
            this.f9720d = "";
            this.f9721e = false;
            this.f9722f = false;
            this.f9723g = false;
            this.f9724h = 1;
            this.f9725r = "";
            this.f9726s = false;
            this.f9727t = false;
            this.f9728u = false;
            this.f9729v = false;
            this.f9730w = false;
            this.f9731x = true;
            this.f9732y = "";
            this.f9733z = "";
            this.A = "";
            this.B = "";
            this.C = "";
            this.D = "";
            this.E = "";
            this.H = (byte) -1;
        }

        private m() {
            this.f9719c = "";
            this.f9720d = "";
            this.f9721e = false;
            this.f9722f = false;
            this.f9723g = false;
            this.f9724h = 1;
            this.f9725r = "";
            this.f9726s = false;
            this.f9727t = false;
            this.f9728u = false;
            this.f9729v = false;
            this.f9730w = false;
            this.f9731x = true;
            this.f9732y = "";
            this.f9733z = "";
            this.A = "";
            this.B = "";
            this.C = "";
            this.D = "";
            this.E = "";
            this.H = (byte) -1;
            this.f9719c = "";
            this.f9720d = "";
            this.f9724h = 1;
            this.f9725r = "";
            this.f9731x = true;
            this.f9732y = "";
            this.f9733z = "";
            this.A = "";
            this.B = "";
            this.C = "";
            this.D = "";
            this.E = "";
            this.G = Collections.EMPTY_LIST;
        }
    }

    public static final class n extends k0.e implements o1 {

        /* JADX INFO: renamed from: t */
        private static final n f9757t = new n();

        /* JADX INFO: renamed from: u */
        public static final z1 f9758u = new a();

        /* JADX INFO: renamed from: b */
        private int f9759b;

        /* JADX INFO: renamed from: c */
        private boolean f9760c;

        /* JADX INFO: renamed from: d */
        private boolean f9761d;

        /* JADX INFO: renamed from: e */
        private boolean f9762e;

        /* JADX INFO: renamed from: f */
        private boolean f9763f;

        /* JADX INFO: renamed from: g */
        private boolean f9764g;

        /* JADX INFO: renamed from: h */
        private i f9765h;

        /* JADX INFO: renamed from: r */
        private List f9766r;

        /* JADX INFO: renamed from: s */
        private byte f9767s;

        class a extends com.google.protobuf.c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c */
            public n parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                b bVarE0 = n.e0();
                try {
                    bVarE0.mergeFrom(mVar, yVar);
                    return bVarE0.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(bVarE0.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(bVarE0.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(bVarE0.buildPartial());
                }
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                return super.parseDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                return super.parseFrom(lVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                return super.mo1183parsePartialDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                return super.mo1185parsePartialFrom(lVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                return super.parseDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                return super.parseFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                return super.mo1186parsePartialFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                return super.parseFrom(mVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                return super.mo1187parsePartialFrom(mVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                return super.parseFrom(mVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                return super.parseFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                return super.mo1188parsePartialFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                return super.parseFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                return super.mo1189parsePartialFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                return super.parseFrom(byteBuffer);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                return super.mo1190parsePartialFrom(bArr);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                return super.parseFrom(byteBuffer, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                return super.mo1191parsePartialFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                return super.mo1181parseFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                return super.mo1193parsePartialFrom(bArr, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1182parseFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                return super.parseFrom(bArr, yVar);
            }
        }

        public static final class b extends k0.d implements o1 {

            /* JADX INFO: renamed from: b */
            private int f9768b;

            /* JADX INFO: renamed from: c */
            private boolean f9769c;

            /* JADX INFO: renamed from: d */
            private boolean f9770d;

            /* JADX INFO: renamed from: e */
            private boolean f9771e;

            /* JADX INFO: renamed from: f */
            private boolean f9772f;

            /* JADX INFO: renamed from: g */
            private boolean f9773g;

            /* JADX INFO: renamed from: h */
            private i f9774h;

            /* JADX INFO: renamed from: r */
            private k2 f9775r;

            /* JADX INFO: renamed from: s */
            private List f9776s;

            /* JADX INFO: renamed from: t */
            private g2 f9777t;

            /* synthetic */ b(a aVar) {
                this();
            }

            private k2 D() {
                if (this.f9775r == null) {
                    this.f9775r = new k2(B(), getParentForChildren(), isClean());
                    this.f9774h = null;
                }
                return this.f9775r;
            }

            private g2 G() {
                if (this.f9777t == null) {
                    this.f9777t = new g2(this.f9776s, (this.f9768b & 64) != 0, getParentForChildren(), isClean());
                    this.f9776s = null;
                }
                return this.f9777t;
            }

            private void I() {
                if (k0.alwaysUseFieldBuilders) {
                    D();
                    G();
                }
            }

            private void v(n nVar) {
                int i10;
                int i11 = this.f9768b;
                if ((i11 & 1) != 0) {
                    nVar.f9760c = this.f9769c;
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 2) != 0) {
                    nVar.f9761d = this.f9770d;
                    i10 |= 2;
                }
                if ((i11 & 4) != 0) {
                    nVar.f9762e = this.f9771e;
                    i10 |= 4;
                }
                if ((i11 & 8) != 0) {
                    nVar.f9763f = this.f9772f;
                    i10 |= 8;
                }
                if ((i11 & 16) != 0) {
                    nVar.f9764g = this.f9773g;
                    i10 |= 16;
                }
                if ((i11 & 32) != 0) {
                    k2 k2Var = this.f9775r;
                    nVar.f9765h = k2Var == null ? this.f9774h : (i) k2Var.b();
                    i10 |= 32;
                }
                n.G(nVar, i10);
            }

            private void w(n nVar) {
                g2 g2Var = this.f9777t;
                if (g2Var != null) {
                    nVar.f9766r = g2Var.g();
                    return;
                }
                if ((this.f9768b & 64) != 0) {
                    this.f9776s = DesugarCollections.unmodifiableList(this.f9776s);
                    this.f9768b &= -65;
                }
                nVar.f9766r = this.f9776s;
            }

            private void z() {
                if ((this.f9768b & 64) == 0) {
                    this.f9776s = new ArrayList(this.f9776s);
                    this.f9768b |= 64;
                }
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: A */
            public n getDefaultInstanceForType() {
                return n.H();
            }

            public i B() {
                k2 k2Var = this.f9775r;
                if (k2Var != null) {
                    return (i) k2Var.f();
                }
                i iVar = this.f9774h;
                return iVar == null ? i.D() : iVar;
            }

            public i.b C() {
                this.f9768b |= 32;
                onChanged();
                return (i.b) D().e();
            }

            public v E(int i10) {
                g2 g2Var = this.f9777t;
                return g2Var == null ? (v) this.f9776s.get(i10) : (v) g2Var.o(i10);
            }

            public int F() {
                g2 g2Var = this.f9777t;
                return g2Var == null ? this.f9776s.size() : g2Var.n();
            }

            public boolean H() {
                return (this.f9768b & 32) != 0;
            }

            public b J(i iVar) {
                i iVar2;
                k2 k2Var = this.f9775r;
                if (k2Var != null) {
                    k2Var.h(iVar);
                } else if ((this.f9768b & 32) == 0 || (iVar2 = this.f9774h) == null || iVar2 == i.D()) {
                    this.f9774h = iVar;
                } else {
                    C().A(iVar);
                }
                if (this.f9774h != null) {
                    this.f9768b |= 32;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: K */
            public b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    this.f9769c = mVar.q();
                                    this.f9768b |= 1;
                                } else if (iK == 16) {
                                    this.f9770d = mVar.q();
                                    this.f9768b |= 2;
                                } else if (iK == 24) {
                                    this.f9771e = mVar.q();
                                    this.f9768b |= 4;
                                } else if (iK == 56) {
                                    this.f9772f = mVar.q();
                                    this.f9768b |= 8;
                                } else if (iK == 88) {
                                    this.f9773g = mVar.q();
                                    this.f9768b |= 16;
                                } else if (iK == 98) {
                                    mVar.B(D().e(), yVar);
                                    this.f9768b |= 32;
                                } else if (iK == 7994) {
                                    v vVar = (v) mVar.A(v.f9890t, yVar);
                                    g2 g2Var = this.f9777t;
                                    if (g2Var == null) {
                                        z();
                                        this.f9776s.add(vVar);
                                    } else {
                                        g2Var.f(vVar);
                                    }
                                } else if (!super.parseUnknownField(mVar, yVar, iK)) {
                                }
                            }
                            z10 = true;
                        } catch (p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }

            public b L(n nVar) {
                if (nVar == n.H()) {
                    return this;
                }
                if (nVar.c0()) {
                    T(nVar.R());
                }
                if (nVar.d0()) {
                    U(nVar.S());
                }
                if (nVar.Y()) {
                    O(nVar.L());
                }
                if (nVar.b0()) {
                    R(nVar.Q());
                }
                if (nVar.Z()) {
                    P(nVar.N());
                }
                if (nVar.a0()) {
                    J(nVar.O());
                }
                if (this.f9777t == null) {
                    if (!nVar.f9766r.isEmpty()) {
                        if (this.f9776s.isEmpty()) {
                            this.f9776s = nVar.f9766r;
                            this.f9768b &= -65;
                        } else {
                            z();
                            this.f9776s.addAll(nVar.f9766r);
                        }
                        onChanged();
                    }
                } else if (!nVar.f9766r.isEmpty()) {
                    if (this.f9777t.u()) {
                        this.f9777t.i();
                        this.f9777t = null;
                        this.f9776s = nVar.f9766r;
                        this.f9768b &= -65;
                        this.f9777t = k0.alwaysUseFieldBuilders ? G() : null;
                    } else {
                        this.f9777t.b(nVar.f9766r);
                    }
                }
                n(nVar);
                m141mergeUnknownFields(nVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: M */
            public b mergeFrom(i1 i1Var) {
                if (i1Var instanceof n) {
                    return L((n) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final b m1148mergeUnknownFields(t2 t2Var) {
                return (b) super.m1148mergeUnknownFields(t2Var);
            }

            public b O(boolean z10) {
                this.f9771e = z10;
                this.f9768b |= 4;
                onChanged();
                return this;
            }

            public b P(boolean z10) {
                this.f9773g = z10;
                this.f9768b |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: Q */
            public b setField(r.g gVar, Object obj) {
                return (b) super.o(gVar, obj);
            }

            public b R(boolean z10) {
                this.f9772f = z10;
                this.f9768b |= 8;
                onChanged();
                return this;
            }

            public b T(boolean z10) {
                this.f9769c = z10;
                this.f9768b |= 1;
                onChanged();
                return this;
            }

            public b U(boolean z10) {
                this.f9770d = z10;
                this.f9768b |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: V */
            public final b setUnknownFields(t2 t2Var) {
                return (b) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return q.E;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return q.F.d(n.class, b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                if (H() && !B().isInitialized()) {
                    return false;
                }
                for (int i10 = 0; i10 < F(); i10++) {
                    if (!E(i10).isInitialized()) {
                        return false;
                    }
                }
                return m();
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: r */
            public b addRepeatedField(r.g gVar, Object obj) {
                return (b) super.h(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: t */
            public n build() {
                n nVarBuildPartial = buildPartial();
                if (nVarBuildPartial.isInitialized()) {
                    return nVarBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) nVarBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: u */
            public n buildPartial() {
                n nVar = new n(this);
                w(nVar);
                if (this.f9768b != 0) {
                    v(nVar);
                }
                onBuilt();
                return nVar;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b m1140clearField(r.g gVar) {
                return (b) super.j(gVar);
            }

            /* JADX INFO: renamed from: y */
            public b clone() {
                return (b) super.m1147clone();
            }

            /* synthetic */ b(k0.c cVar, a aVar) {
                this(cVar);
            }

            private b() {
                this.f9776s = Collections.EMPTY_LIST;
                I();
            }

            private b(k0.c cVar) {
                super(cVar);
                this.f9776s = Collections.EMPTY_LIST;
                I();
            }
        }

        /* synthetic */ n(k0.d dVar, a aVar) {
            this(dVar);
        }

        static /* synthetic */ int G(n nVar, int i10) {
            int i11 = i10 | nVar.f9759b;
            nVar.f9759b = i11;
            return i11;
        }

        public static n H() {
            return f9757t;
        }

        public static b e0() {
            return f9757t.toBuilder();
        }

        public static final r.b getDescriptor() {
            return q.E;
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: K */
        public n getDefaultInstanceForType() {
            return f9757t;
        }

        public boolean L() {
            return this.f9762e;
        }

        public boolean N() {
            return this.f9764g;
        }

        public i O() {
            i iVar = this.f9765h;
            return iVar == null ? i.D() : iVar;
        }

        public boolean Q() {
            return this.f9763f;
        }

        public boolean R() {
            return this.f9760c;
        }

        public boolean S() {
            return this.f9761d;
        }

        public v T(int i10) {
            return (v) this.f9766r.get(i10);
        }

        public int W() {
            return this.f9766r.size();
        }

        public List X() {
            return this.f9766r;
        }

        public boolean Y() {
            return (this.f9759b & 4) != 0;
        }

        public boolean Z() {
            return (this.f9759b & 16) != 0;
        }

        public boolean a0() {
            return (this.f9759b & 32) != 0;
        }

        public boolean b0() {
            return (this.f9759b & 8) != 0;
        }

        public boolean c0() {
            return (this.f9759b & 1) != 0;
        }

        public boolean d0() {
            return (this.f9759b & 2) != 0;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof n)) {
                return super.equals(obj);
            }
            n nVar = (n) obj;
            if (c0() != nVar.c0()) {
                return false;
            }
            if ((c0() && R() != nVar.R()) || d0() != nVar.d0()) {
                return false;
            }
            if ((d0() && S() != nVar.S()) || Y() != nVar.Y()) {
                return false;
            }
            if ((Y() && L() != nVar.L()) || b0() != nVar.b0()) {
                return false;
            }
            if ((b0() && Q() != nVar.Q()) || Z() != nVar.Z()) {
                return false;
            }
            if ((!Z() || N() == nVar.N()) && a0() == nVar.a0()) {
                return (!a0() || O().equals(nVar.O())) && X().equals(nVar.X()) && getUnknownFields().equals(nVar.getUnknownFields()) && q().equals(nVar.q());
            }
            return false;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: f0 */
        public b newBuilderForType() {
            return e0();
        }

        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: g0 */
        public b newBuilderForType(k0.c cVar) {
            return new b(cVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return f9758u;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iE = (this.f9759b & 1) != 0 ? com.google.protobuf.o.e(1, this.f9760c) : 0;
            if ((this.f9759b & 2) != 0) {
                iE += com.google.protobuf.o.e(2, this.f9761d);
            }
            if ((this.f9759b & 4) != 0) {
                iE += com.google.protobuf.o.e(3, this.f9762e);
            }
            if ((this.f9759b & 8) != 0) {
                iE += com.google.protobuf.o.e(7, this.f9763f);
            }
            if ((this.f9759b & 16) != 0) {
                iE += com.google.protobuf.o.e(11, this.f9764g);
            }
            if ((this.f9759b & 32) != 0) {
                iE += com.google.protobuf.o.G(12, O());
            }
            for (int i11 = 0; i11 < this.f9766r.size(); i11++) {
                iE += com.google.protobuf.o.G(999, (l1) this.f9766r.get(i11));
            }
            int iP = iE + p() + getUnknownFields().getSerializedSize();
            this.memoizedSize = iP;
            return iP;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: h0 */
        public b toBuilder() {
            return this == f9757t ? new b() : new b().L(this);
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (c0()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + o0.d(R());
            }
            if (d0()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + o0.d(S());
            }
            if (Y()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + o0.d(L());
            }
            if (b0()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + o0.d(Q());
            }
            if (Z()) {
                iHashCode = (((iHashCode * 37) + 11) * 53) + o0.d(N());
            }
            if (a0()) {
                iHashCode = (((iHashCode * 37) + 12) * 53) + O().hashCode();
            }
            if (W() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + X().hashCode();
            }
            int iHashFields = (com.google.protobuf.a.hashFields(iHashCode, q()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return q.F.d(n.class, b.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9767s;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (a0() && !O().isInitialized()) {
                this.f9767s = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < W(); i10++) {
                if (!T(i10).isInitialized()) {
                    this.f9767s = (byte) 0;
                    return false;
                }
            }
            if (o()) {
                this.f9767s = (byte) 1;
                return true;
            }
            this.f9767s = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new n();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) {
            k0.e.a aVarR = r();
            if ((this.f9759b & 1) != 0) {
                oVar.m0(1, this.f9760c);
            }
            if ((this.f9759b & 2) != 0) {
                oVar.m0(2, this.f9761d);
            }
            if ((this.f9759b & 4) != 0) {
                oVar.m0(3, this.f9762e);
            }
            if ((this.f9759b & 8) != 0) {
                oVar.m0(7, this.f9763f);
            }
            if ((this.f9759b & 16) != 0) {
                oVar.m0(11, this.f9764g);
            }
            if ((this.f9759b & 32) != 0) {
                oVar.H0(12, O());
            }
            for (int i10 = 0; i10 < this.f9766r.size(); i10++) {
                oVar.H0(999, (l1) this.f9766r.get(i10));
            }
            aVarR.a(536870912, oVar);
            getUnknownFields().writeTo(oVar);
        }

        private n(k0.d dVar) {
            super(dVar);
            this.f9760c = false;
            this.f9761d = false;
            this.f9762e = false;
            this.f9763f = false;
            this.f9764g = false;
            this.f9767s = (byte) -1;
        }

        private n() {
            this.f9760c = false;
            this.f9761d = false;
            this.f9762e = false;
            this.f9763f = false;
            this.f9764g = false;
            this.f9767s = (byte) -1;
            this.f9766r = Collections.EMPTY_LIST;
        }
    }

    public static final class o extends k0 implements o1 {

        /* JADX INFO: renamed from: r */
        private static final o f9778r = new o();

        /* JADX INFO: renamed from: s */
        public static final z1 f9779s = new a();

        /* JADX INFO: renamed from: a */
        private int f9780a;

        /* JADX INFO: renamed from: b */
        private volatile Object f9781b;

        /* JADX INFO: renamed from: c */
        private volatile Object f9782c;

        /* JADX INFO: renamed from: d */
        private volatile Object f9783d;

        /* JADX INFO: renamed from: e */
        private p f9784e;

        /* JADX INFO: renamed from: f */
        private boolean f9785f;

        /* JADX INFO: renamed from: g */
        private boolean f9786g;

        /* JADX INFO: renamed from: h */
        private byte f9787h;

        class a extends com.google.protobuf.c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c */
            public o parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                b bVarT = o.T();
                try {
                    bVarT.mergeFrom(mVar, yVar);
                    return bVarT.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(bVarT.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(bVarT.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(bVarT.buildPartial());
                }
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                return super.parseDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                return super.parseFrom(lVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                return super.mo1183parsePartialDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                return super.mo1185parsePartialFrom(lVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                return super.parseDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                return super.parseFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                return super.mo1186parsePartialFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                return super.parseFrom(mVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                return super.mo1187parsePartialFrom(mVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                return super.parseFrom(mVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                return super.parseFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                return super.mo1188parsePartialFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                return super.parseFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                return super.mo1189parsePartialFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                return super.parseFrom(byteBuffer);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                return super.mo1190parsePartialFrom(bArr);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                return super.parseFrom(byteBuffer, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                return super.mo1191parsePartialFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                return super.mo1181parseFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                return super.mo1193parsePartialFrom(bArr, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1182parseFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                return super.parseFrom(bArr, yVar);
            }
        }

        public static final class b extends k0.b implements o1 {

            /* JADX INFO: renamed from: a */
            private int f9788a;

            /* JADX INFO: renamed from: b */
            private Object f9789b;

            /* JADX INFO: renamed from: c */
            private Object f9790c;

            /* JADX INFO: renamed from: d */
            private Object f9791d;

            /* JADX INFO: renamed from: e */
            private p f9792e;

            /* JADX INFO: renamed from: f */
            private k2 f9793f;

            /* JADX INFO: renamed from: g */
            private boolean f9794g;

            /* JADX INFO: renamed from: h */
            private boolean f9795h;

            /* synthetic */ b(a aVar) {
                this();
            }

            private void j(o oVar) {
                int i10;
                int i11 = this.f9788a;
                if ((i11 & 1) != 0) {
                    oVar.f9781b = this.f9789b;
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 2) != 0) {
                    oVar.f9782c = this.f9790c;
                    i10 |= 2;
                }
                if ((i11 & 4) != 0) {
                    oVar.f9783d = this.f9791d;
                    i10 |= 4;
                }
                if ((i11 & 8) != 0) {
                    k2 k2Var = this.f9793f;
                    oVar.f9784e = k2Var == null ? this.f9792e : (p) k2Var.b();
                    i10 |= 8;
                }
                if ((i11 & 16) != 0) {
                    oVar.f9785f = this.f9794g;
                    i10 |= 16;
                }
                if ((i11 & 32) != 0) {
                    oVar.f9786g = this.f9795h;
                    i10 |= 32;
                }
                o.x(oVar, i10);
            }

            private k2 r() {
                if (this.f9793f == null) {
                    this.f9793f = new k2(o(), getParentForChildren(), isClean());
                    this.f9792e = null;
                }
                return this.f9793f;
            }

            private void u() {
                if (k0.alwaysUseFieldBuilders) {
                    r();
                }
            }

            public b A(boolean z10) {
                this.f9794g = z10;
                this.f9788a |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: B */
            public b setField(r.g gVar, Object obj) {
                return (b) super.setField(gVar, obj);
            }

            public b C(boolean z10) {
                this.f9795h = z10;
                this.f9788a |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: D */
            public final b setUnknownFields(t2 t2Var) {
                return (b) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: g */
            public b addRepeatedField(r.g gVar, Object obj) {
                return (b) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return q.A;
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: h */
            public o build() {
                o oVarBuildPartial = buildPartial();
                if (oVarBuildPartial.isInitialized()) {
                    return oVarBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) oVarBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: i */
            public o buildPartial() {
                o oVar = new o(this);
                if (this.f9788a != 0) {
                    j(oVar);
                }
                onBuilt();
                return oVar;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return q.B.d(o.class, b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return !t() || o().isInitialized();
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public b m1140clearField(r.g gVar) {
                return (b) super.m1140clearField(gVar);
            }

            /* JADX INFO: renamed from: m */
            public b clone() {
                return (b) super.m1147clone();
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: n */
            public o getDefaultInstanceForType() {
                return o.A();
            }

            public p o() {
                k2 k2Var = this.f9793f;
                if (k2Var != null) {
                    return (p) k2Var.f();
                }
                p pVar = this.f9792e;
                return pVar == null ? p.C() : pVar;
            }

            public p.b p() {
                this.f9788a |= 8;
                onChanged();
                return (p.b) r().e();
            }

            public boolean t() {
                return (this.f9788a & 8) != 0;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: v */
            public b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    this.f9789b = mVar.r();
                                    this.f9788a |= 1;
                                } else if (iK == 18) {
                                    this.f9790c = mVar.r();
                                    this.f9788a |= 2;
                                } else if (iK == 26) {
                                    this.f9791d = mVar.r();
                                    this.f9788a |= 4;
                                } else if (iK == 34) {
                                    mVar.B(r().e(), yVar);
                                    this.f9788a |= 8;
                                } else if (iK == 40) {
                                    this.f9794g = mVar.q();
                                    this.f9788a |= 16;
                                } else if (iK == 48) {
                                    this.f9795h = mVar.q();
                                    this.f9788a |= 32;
                                } else if (!super.parseUnknownField(mVar, yVar, iK)) {
                                }
                            }
                            z10 = true;
                        } catch (p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }

            public b w(o oVar) {
                if (oVar == o.A()) {
                    return this;
                }
                if (oVar.O()) {
                    this.f9789b = oVar.f9781b;
                    this.f9788a |= 1;
                    onChanged();
                }
                if (oVar.N()) {
                    this.f9790c = oVar.f9782c;
                    this.f9788a |= 2;
                    onChanged();
                }
                if (oVar.R()) {
                    this.f9791d = oVar.f9783d;
                    this.f9788a |= 4;
                    onChanged();
                }
                if (oVar.Q()) {
                    y(oVar.G());
                }
                if (oVar.L()) {
                    A(oVar.z());
                }
                if (oVar.S()) {
                    C(oVar.K());
                }
                m141mergeUnknownFields(oVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: x */
            public b mergeFrom(i1 i1Var) {
                if (i1Var instanceof o) {
                    return w((o) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public b y(p pVar) {
                p pVar2;
                k2 k2Var = this.f9793f;
                if (k2Var != null) {
                    k2Var.h(pVar);
                } else if ((this.f9788a & 8) == 0 || (pVar2 = this.f9792e) == null || pVar2 == p.C()) {
                    this.f9792e = pVar;
                } else {
                    p().L(pVar);
                }
                if (this.f9792e != null) {
                    this.f9788a |= 8;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public final b m1148mergeUnknownFields(t2 t2Var) {
                return (b) super.m1148mergeUnknownFields(t2Var);
            }

            /* synthetic */ b(k0.c cVar, a aVar) {
                this(cVar);
            }

            private b() {
                this.f9789b = "";
                this.f9790c = "";
                this.f9791d = "";
                u();
            }

            private b(k0.c cVar) {
                super(cVar);
                this.f9789b = "";
                this.f9790c = "";
                this.f9791d = "";
                u();
            }
        }

        /* synthetic */ o(k0.b bVar, a aVar) {
            this(bVar);
        }

        public static o A() {
            return f9778r;
        }

        public static b T() {
            return f9778r.toBuilder();
        }

        public static final r.b getDescriptor() {
            return q.A;
        }

        static /* synthetic */ int x(o oVar, int i10) {
            int i11 = i10 | oVar.f9780a;
            oVar.f9780a = i11;
            return i11;
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: C */
        public o getDefaultInstanceForType() {
            return f9778r;
        }

        public String D() {
            Object obj = this.f9782c;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f9782c = strN;
            }
            return strN;
        }

        public p G() {
            p pVar = this.f9784e;
            return pVar == null ? p.C() : pVar;
        }

        public String H() {
            Object obj = this.f9783d;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f9783d = strN;
            }
            return strN;
        }

        public boolean K() {
            return this.f9786g;
        }

        public boolean L() {
            return (this.f9780a & 16) != 0;
        }

        public boolean N() {
            return (this.f9780a & 2) != 0;
        }

        public boolean O() {
            return (this.f9780a & 1) != 0;
        }

        public boolean Q() {
            return (this.f9780a & 8) != 0;
        }

        public boolean R() {
            return (this.f9780a & 4) != 0;
        }

        public boolean S() {
            return (this.f9780a & 32) != 0;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: W */
        public b newBuilderForType() {
            return T();
        }

        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: X */
        public b newBuilderForType(k0.c cVar) {
            return new b(cVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: Y */
        public b toBuilder() {
            return this == f9778r ? new b() : new b().w(this);
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof o)) {
                return super.equals(obj);
            }
            o oVar = (o) obj;
            if (O() != oVar.O()) {
                return false;
            }
            if ((O() && !getName().equals(oVar.getName())) || N() != oVar.N()) {
                return false;
            }
            if ((N() && !D().equals(oVar.D())) || R() != oVar.R()) {
                return false;
            }
            if ((R() && !H().equals(oVar.H())) || Q() != oVar.Q()) {
                return false;
            }
            if ((Q() && !G().equals(oVar.G())) || L() != oVar.L()) {
                return false;
            }
            if ((!L() || z() == oVar.z()) && S() == oVar.S()) {
                return (!S() || K() == oVar.K()) && getUnknownFields().equals(oVar.getUnknownFields());
            }
            return false;
        }

        public String getName() {
            Object obj = this.f9781b;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f9781b = strN;
            }
            return strN;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return f9779s;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = (this.f9780a & 1) != 0 ? k0.computeStringSize(1, this.f9781b) : 0;
            if ((this.f9780a & 2) != 0) {
                iComputeStringSize += k0.computeStringSize(2, this.f9782c);
            }
            if ((this.f9780a & 4) != 0) {
                iComputeStringSize += k0.computeStringSize(3, this.f9783d);
            }
            if ((this.f9780a & 8) != 0) {
                iComputeStringSize += com.google.protobuf.o.G(4, G());
            }
            if ((this.f9780a & 16) != 0) {
                iComputeStringSize += com.google.protobuf.o.e(5, this.f9785f);
            }
            if ((this.f9780a & 32) != 0) {
                iComputeStringSize += com.google.protobuf.o.e(6, this.f9786g);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (O()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (N()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + D().hashCode();
            }
            if (R()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + H().hashCode();
            }
            if (Q()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + G().hashCode();
            }
            if (L()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + o0.d(z());
            }
            if (S()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + o0.d(K());
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return q.B.d(o.class, b.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9787h;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!Q() || G().isInitialized()) {
                this.f9787h = (byte) 1;
                return true;
            }
            this.f9787h = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new o();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if ((this.f9780a & 1) != 0) {
                k0.writeString(oVar, 1, this.f9781b);
            }
            if ((this.f9780a & 2) != 0) {
                k0.writeString(oVar, 2, this.f9782c);
            }
            if ((this.f9780a & 4) != 0) {
                k0.writeString(oVar, 3, this.f9783d);
            }
            if ((this.f9780a & 8) != 0) {
                oVar.H0(4, G());
            }
            if ((this.f9780a & 16) != 0) {
                oVar.m0(5, this.f9785f);
            }
            if ((this.f9780a & 32) != 0) {
                oVar.m0(6, this.f9786g);
            }
            getUnknownFields().writeTo(oVar);
        }

        public boolean z() {
            return this.f9785f;
        }

        private o(k0.b bVar) {
            super(bVar);
            this.f9781b = "";
            this.f9782c = "";
            this.f9783d = "";
            this.f9785f = false;
            this.f9786g = false;
            this.f9787h = (byte) -1;
        }

        private o() {
            this.f9781b = "";
            this.f9782c = "";
            this.f9783d = "";
            this.f9785f = false;
            this.f9786g = false;
            this.f9787h = (byte) -1;
            this.f9781b = "";
            this.f9782c = "";
            this.f9783d = "";
        }
    }

    public static final class p extends k0.e implements o1 {

        /* JADX INFO: renamed from: h */
        private static final p f9796h = new p();

        /* JADX INFO: renamed from: r */
        public static final z1 f9797r = new a();

        /* JADX INFO: renamed from: b */
        private int f9798b;

        /* JADX INFO: renamed from: c */
        private boolean f9799c;

        /* JADX INFO: renamed from: d */
        private int f9800d;

        /* JADX INFO: renamed from: e */
        private i f9801e;

        /* JADX INFO: renamed from: f */
        private List f9802f;

        /* JADX INFO: renamed from: g */
        private byte f9803g;

        class a extends com.google.protobuf.c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c */
            public p parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                b bVarT = p.T();
                try {
                    bVarT.mergeFrom(mVar, yVar);
                    return bVarT.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(bVarT.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(bVarT.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(bVarT.buildPartial());
                }
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                return super.parseDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                return super.parseFrom(lVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                return super.mo1183parsePartialDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                return super.mo1185parsePartialFrom(lVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                return super.parseDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                return super.parseFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                return super.mo1186parsePartialFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                return super.parseFrom(mVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                return super.mo1187parsePartialFrom(mVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                return super.parseFrom(mVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                return super.parseFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                return super.mo1188parsePartialFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                return super.parseFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                return super.mo1189parsePartialFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                return super.parseFrom(byteBuffer);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                return super.mo1190parsePartialFrom(bArr);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                return super.parseFrom(byteBuffer, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                return super.mo1191parsePartialFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                return super.mo1181parseFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                return super.mo1193parsePartialFrom(bArr, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1182parseFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                return super.parseFrom(bArr, yVar);
            }
        }

        public static final class b extends k0.d implements o1 {

            /* JADX INFO: renamed from: b */
            private int f9804b;

            /* JADX INFO: renamed from: c */
            private boolean f9805c;

            /* JADX INFO: renamed from: d */
            private int f9806d;

            /* JADX INFO: renamed from: e */
            private i f9807e;

            /* JADX INFO: renamed from: f */
            private k2 f9808f;

            /* JADX INFO: renamed from: g */
            private List f9809g;

            /* JADX INFO: renamed from: h */
            private g2 f9810h;

            /* synthetic */ b(a aVar) {
                this();
            }

            private k2 D() {
                if (this.f9808f == null) {
                    this.f9808f = new k2(B(), getParentForChildren(), isClean());
                    this.f9807e = null;
                }
                return this.f9808f;
            }

            private g2 G() {
                if (this.f9810h == null) {
                    this.f9810h = new g2(this.f9809g, (this.f9804b & 8) != 0, getParentForChildren(), isClean());
                    this.f9809g = null;
                }
                return this.f9810h;
            }

            private void I() {
                if (k0.alwaysUseFieldBuilders) {
                    D();
                    G();
                }
            }

            private void v(p pVar) {
                int i10;
                int i11 = this.f9804b;
                if ((i11 & 1) != 0) {
                    pVar.f9799c = this.f9805c;
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 2) != 0) {
                    pVar.f9800d = this.f9806d;
                    i10 |= 2;
                }
                if ((i11 & 4) != 0) {
                    k2 k2Var = this.f9808f;
                    pVar.f9801e = k2Var == null ? this.f9807e : (i) k2Var.b();
                    i10 |= 4;
                }
                p.A(pVar, i10);
            }

            private void w(p pVar) {
                g2 g2Var = this.f9810h;
                if (g2Var != null) {
                    pVar.f9802f = g2Var.g();
                    return;
                }
                if ((this.f9804b & 8) != 0) {
                    this.f9809g = DesugarCollections.unmodifiableList(this.f9809g);
                    this.f9804b &= -9;
                }
                pVar.f9802f = this.f9809g;
            }

            private void z() {
                if ((this.f9804b & 8) == 0) {
                    this.f9809g = new ArrayList(this.f9809g);
                    this.f9804b |= 8;
                }
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: A */
            public p getDefaultInstanceForType() {
                return p.C();
            }

            public i B() {
                k2 k2Var = this.f9808f;
                if (k2Var != null) {
                    return (i) k2Var.f();
                }
                i iVar = this.f9807e;
                return iVar == null ? i.D() : iVar;
            }

            public i.b C() {
                this.f9804b |= 4;
                onChanged();
                return (i.b) D().e();
            }

            public v E(int i10) {
                g2 g2Var = this.f9810h;
                return g2Var == null ? (v) this.f9809g.get(i10) : (v) g2Var.o(i10);
            }

            public int F() {
                g2 g2Var = this.f9810h;
                return g2Var == null ? this.f9809g.size() : g2Var.n();
            }

            public boolean H() {
                return (this.f9804b & 4) != 0;
            }

            public b J(i iVar) {
                i iVar2;
                k2 k2Var = this.f9808f;
                if (k2Var != null) {
                    k2Var.h(iVar);
                } else if ((this.f9804b & 4) == 0 || (iVar2 = this.f9807e) == null || iVar2 == i.D()) {
                    this.f9807e = iVar;
                } else {
                    C().A(iVar);
                }
                if (this.f9807e != null) {
                    this.f9804b |= 4;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: K */
            public b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 264) {
                                    this.f9805c = mVar.q();
                                    this.f9804b |= 1;
                                } else if (iK == 272) {
                                    int iT = mVar.t();
                                    if (c.a(iT) == null) {
                                        mergeUnknownVarintField(34, iT);
                                    } else {
                                        this.f9806d = iT;
                                        this.f9804b |= 2;
                                    }
                                } else if (iK == 282) {
                                    mVar.B(D().e(), yVar);
                                    this.f9804b |= 4;
                                } else if (iK == 7994) {
                                    v vVar = (v) mVar.A(v.f9890t, yVar);
                                    g2 g2Var = this.f9810h;
                                    if (g2Var == null) {
                                        z();
                                        this.f9809g.add(vVar);
                                    } else {
                                        g2Var.f(vVar);
                                    }
                                } else if (!super.parseUnknownField(mVar, yVar, iK)) {
                                }
                            }
                            z10 = true;
                        } catch (p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }

            public b L(p pVar) {
                if (pVar == p.C()) {
                    return this;
                }
                if (pVar.Q()) {
                    O(pVar.G());
                }
                if (pVar.S()) {
                    Q(pVar.K());
                }
                if (pVar.R()) {
                    J(pVar.H());
                }
                if (this.f9810h == null) {
                    if (!pVar.f9802f.isEmpty()) {
                        if (this.f9809g.isEmpty()) {
                            this.f9809g = pVar.f9802f;
                            this.f9804b &= -9;
                        } else {
                            z();
                            this.f9809g.addAll(pVar.f9802f);
                        }
                        onChanged();
                    }
                } else if (!pVar.f9802f.isEmpty()) {
                    if (this.f9810h.u()) {
                        this.f9810h.i();
                        this.f9810h = null;
                        this.f9809g = pVar.f9802f;
                        this.f9804b &= -9;
                        this.f9810h = k0.alwaysUseFieldBuilders ? G() : null;
                    } else {
                        this.f9810h.b(pVar.f9802f);
                    }
                }
                n(pVar);
                m141mergeUnknownFields(pVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: M */
            public b mergeFrom(i1 i1Var) {
                if (i1Var instanceof p) {
                    return L((p) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final b m1148mergeUnknownFields(t2 t2Var) {
                return (b) super.m1148mergeUnknownFields(t2Var);
            }

            public b O(boolean z10) {
                this.f9805c = z10;
                this.f9804b |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: P */
            public b setField(r.g gVar, Object obj) {
                return (b) super.o(gVar, obj);
            }

            public b Q(c cVar) {
                cVar.getClass();
                this.f9804b |= 2;
                this.f9806d = cVar.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: R */
            public final b setUnknownFields(t2 t2Var) {
                return (b) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return q.S;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return q.T.d(p.class, b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                if (H() && !B().isInitialized()) {
                    return false;
                }
                for (int i10 = 0; i10 < F(); i10++) {
                    if (!E(i10).isInitialized()) {
                        return false;
                    }
                }
                return m();
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: r */
            public b addRepeatedField(r.g gVar, Object obj) {
                return (b) super.h(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: t */
            public p build() {
                p pVarBuildPartial = buildPartial();
                if (pVarBuildPartial.isInitialized()) {
                    return pVarBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) pVarBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: u */
            public p buildPartial() {
                p pVar = new p(this);
                w(pVar);
                if (this.f9804b != 0) {
                    v(pVar);
                }
                onBuilt();
                return pVar;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b m1140clearField(r.g gVar) {
                return (b) super.j(gVar);
            }

            /* JADX INFO: renamed from: y */
            public b clone() {
                return (b) super.m1147clone();
            }

            /* synthetic */ b(k0.c cVar, a aVar) {
                this(cVar);
            }

            private b() {
                this.f9806d = 0;
                this.f9809g = Collections.EMPTY_LIST;
                I();
            }

            private b(k0.c cVar) {
                super(cVar);
                this.f9806d = 0;
                this.f9809g = Collections.EMPTY_LIST;
                I();
            }
        }

        public enum c implements o0.c {
            IDEMPOTENCY_UNKNOWN(0),
            NO_SIDE_EFFECTS(1),
            IDEMPOTENT(2);


            /* JADX INFO: renamed from: e */
            private static final o0.d f9814e = new a();

            /* JADX INFO: renamed from: f */
            private static final c[] f9815f = values();

            /* JADX INFO: renamed from: a */
            private final int f9817a;

            class a implements o0.d {
                a() {
                }
            }

            c(int i10) {
                this.f9817a = i10;
            }

            public static c a(int i10) {
                if (i10 == 0) {
                    return IDEMPOTENCY_UNKNOWN;
                }
                if (i10 == 1) {
                    return NO_SIDE_EFFECTS;
                }
                if (i10 != 2) {
                    return null;
                }
                return IDEMPOTENT;
            }

            @Override // com.google.protobuf.o0.c
            public final int getNumber() {
                return this.f9817a;
            }
        }

        /* synthetic */ p(k0.d dVar, a aVar) {
            this(dVar);
        }

        static /* synthetic */ int A(p pVar, int i10) {
            int i11 = i10 | pVar.f9798b;
            pVar.f9798b = i11;
            return i11;
        }

        public static p C() {
            return f9796h;
        }

        public static b T() {
            return f9796h.toBuilder();
        }

        public static final r.b getDescriptor() {
            return q.S;
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: D */
        public p getDefaultInstanceForType() {
            return f9796h;
        }

        public boolean G() {
            return this.f9799c;
        }

        public i H() {
            i iVar = this.f9801e;
            return iVar == null ? i.D() : iVar;
        }

        public c K() {
            c cVarA = c.a(this.f9800d);
            return cVarA == null ? c.IDEMPOTENCY_UNKNOWN : cVarA;
        }

        public v L(int i10) {
            return (v) this.f9802f.get(i10);
        }

        public int N() {
            return this.f9802f.size();
        }

        public List O() {
            return this.f9802f;
        }

        public boolean Q() {
            return (this.f9798b & 1) != 0;
        }

        public boolean R() {
            return (this.f9798b & 4) != 0;
        }

        public boolean S() {
            return (this.f9798b & 2) != 0;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: W */
        public b newBuilderForType() {
            return T();
        }

        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: X */
        public b newBuilderForType(k0.c cVar) {
            return new b(cVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: Y */
        public b toBuilder() {
            return this == f9796h ? new b() : new b().L(this);
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof p)) {
                return super.equals(obj);
            }
            p pVar = (p) obj;
            if (Q() != pVar.Q()) {
                return false;
            }
            if ((Q() && G() != pVar.G()) || S() != pVar.S()) {
                return false;
            }
            if ((!S() || this.f9800d == pVar.f9800d) && R() == pVar.R()) {
                return (!R() || H().equals(pVar.H())) && O().equals(pVar.O()) && getUnknownFields().equals(pVar.getUnknownFields()) && q().equals(pVar.q());
            }
            return false;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return f9797r;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iE = (this.f9798b & 1) != 0 ? com.google.protobuf.o.e(33, this.f9799c) : 0;
            if ((this.f9798b & 2) != 0) {
                iE += com.google.protobuf.o.l(34, this.f9800d);
            }
            if ((this.f9798b & 4) != 0) {
                iE += com.google.protobuf.o.G(35, H());
            }
            for (int i11 = 0; i11 < this.f9802f.size(); i11++) {
                iE += com.google.protobuf.o.G(999, (l1) this.f9802f.get(i11));
            }
            int iP = iE + p() + getUnknownFields().getSerializedSize();
            this.memoizedSize = iP;
            return iP;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (Q()) {
                iHashCode = (((iHashCode * 37) + 33) * 53) + o0.d(G());
            }
            if (S()) {
                iHashCode = (((iHashCode * 37) + 34) * 53) + this.f9800d;
            }
            if (R()) {
                iHashCode = (((iHashCode * 37) + 35) * 53) + H().hashCode();
            }
            if (N() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + O().hashCode();
            }
            int iHashFields = (com.google.protobuf.a.hashFields(iHashCode, q()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return q.T.d(p.class, b.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9803g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (R() && !H().isInitialized()) {
                this.f9803g = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < N(); i10++) {
                if (!L(i10).isInitialized()) {
                    this.f9803g = (byte) 0;
                    return false;
                }
            }
            if (o()) {
                this.f9803g = (byte) 1;
                return true;
            }
            this.f9803g = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new p();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) {
            k0.e.a aVarR = r();
            if ((this.f9798b & 1) != 0) {
                oVar.m0(33, this.f9799c);
            }
            if ((this.f9798b & 2) != 0) {
                oVar.u0(34, this.f9800d);
            }
            if ((this.f9798b & 4) != 0) {
                oVar.H0(35, H());
            }
            for (int i10 = 0; i10 < this.f9802f.size(); i10++) {
                oVar.H0(999, (l1) this.f9802f.get(i10));
            }
            aVarR.a(536870912, oVar);
            getUnknownFields().writeTo(oVar);
        }

        private p(k0.d dVar) {
            super(dVar);
            this.f9799c = false;
            this.f9800d = 0;
            this.f9803g = (byte) -1;
        }

        private p() {
            this.f9799c = false;
            this.f9803g = (byte) -1;
            this.f9800d = 0;
            this.f9802f = Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.q$q */
    public static final class C0140q extends k0 implements o1 {

        /* JADX INFO: renamed from: e */
        private static final C0140q f9818e = new C0140q();

        /* JADX INFO: renamed from: f */
        public static final z1 f9819f = new a();

        /* JADX INFO: renamed from: a */
        private int f9820a;

        /* JADX INFO: renamed from: b */
        private volatile Object f9821b;

        /* JADX INFO: renamed from: c */
        private r f9822c;

        /* JADX INFO: renamed from: d */
        private byte f9823d;

        /* JADX INFO: renamed from: com.google.protobuf.q$q$a */
        class a extends com.google.protobuf.c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c */
            public C0140q parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                b bVarX = C0140q.x();
                try {
                    bVarX.mergeFrom(mVar, yVar);
                    return bVarX.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(bVarX.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(bVarX.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(bVarX.buildPartial());
                }
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                return super.parseDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                return super.parseFrom(lVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                return super.mo1183parsePartialDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                return super.mo1185parsePartialFrom(lVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                return super.parseDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                return super.parseFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                return super.mo1186parsePartialFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                return super.parseFrom(mVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                return super.mo1187parsePartialFrom(mVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                return super.parseFrom(mVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                return super.parseFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                return super.mo1188parsePartialFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                return super.parseFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                return super.mo1189parsePartialFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                return super.parseFrom(byteBuffer);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                return super.mo1190parsePartialFrom(bArr);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                return super.parseFrom(byteBuffer, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                return super.mo1191parsePartialFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                return super.mo1181parseFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                return super.mo1193parsePartialFrom(bArr, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1182parseFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                return super.parseFrom(bArr, yVar);
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.q$q$b */
        public static final class b extends k0.b implements o1 {

            /* JADX INFO: renamed from: a */
            private int f9824a;

            /* JADX INFO: renamed from: b */
            private Object f9825b;

            /* JADX INFO: renamed from: c */
            private r f9826c;

            /* JADX INFO: renamed from: d */
            private k2 f9827d;

            /* synthetic */ b(a aVar) {
                this();
            }

            private void j(C0140q c0140q) {
                int i10;
                int i11 = this.f9824a;
                if ((i11 & 1) != 0) {
                    c0140q.f9821b = this.f9825b;
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 2) != 0) {
                    k2 k2Var = this.f9827d;
                    c0140q.f9822c = k2Var == null ? this.f9826c : (r) k2Var.b();
                    i10 |= 2;
                }
                C0140q.q(c0140q, i10);
            }

            private k2 r() {
                if (this.f9827d == null) {
                    this.f9827d = new k2(o(), getParentForChildren(), isClean());
                    this.f9826c = null;
                }
                return this.f9827d;
            }

            private void u() {
                if (k0.alwaysUseFieldBuilders) {
                    r();
                }
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: A */
            public b setField(r.g gVar, Object obj) {
                return (b) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: B */
            public final b setUnknownFields(t2 t2Var) {
                return (b) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: g */
            public b addRepeatedField(r.g gVar, Object obj) {
                return (b) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return q.f9313q;
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: h */
            public C0140q build() {
                C0140q c0140qBuildPartial = buildPartial();
                if (c0140qBuildPartial.isInitialized()) {
                    return c0140qBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) c0140qBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: i */
            public C0140q buildPartial() {
                C0140q c0140q = new C0140q(this);
                if (this.f9824a != 0) {
                    j(c0140q);
                }
                onBuilt();
                return c0140q;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return q.f9314r.d(C0140q.class, b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return !t() || o().isInitialized();
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public b m1140clearField(r.g gVar) {
                return (b) super.m1140clearField(gVar);
            }

            /* JADX INFO: renamed from: m */
            public b clone() {
                return (b) super.m1147clone();
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: n */
            public C0140q getDefaultInstanceForType() {
                return C0140q.r();
            }

            public r o() {
                k2 k2Var = this.f9827d;
                if (k2Var != null) {
                    return (r) k2Var.f();
                }
                r rVar = this.f9826c;
                return rVar == null ? r.z() : rVar;
            }

            public r.b p() {
                this.f9824a |= 2;
                onChanged();
                return (r.b) r().e();
            }

            public boolean t() {
                return (this.f9824a & 2) != 0;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: v */
            public b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    this.f9825b = mVar.r();
                                    this.f9824a |= 1;
                                } else if (iK == 18) {
                                    mVar.B(r().e(), yVar);
                                    this.f9824a |= 2;
                                } else if (!super.parseUnknownField(mVar, yVar, iK)) {
                                }
                            }
                            z10 = true;
                        } catch (p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }

            public b w(C0140q c0140q) {
                if (c0140q == C0140q.r()) {
                    return this;
                }
                if (c0140q.v()) {
                    this.f9825b = c0140q.f9821b;
                    this.f9824a |= 1;
                    onChanged();
                }
                if (c0140q.w()) {
                    y(c0140q.t());
                }
                m141mergeUnknownFields(c0140q.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: x */
            public b mergeFrom(i1 i1Var) {
                if (i1Var instanceof C0140q) {
                    return w((C0140q) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public b y(r rVar) {
                r rVar2;
                k2 k2Var = this.f9827d;
                if (k2Var != null) {
                    k2Var.h(rVar);
                } else if ((this.f9824a & 2) == 0 || (rVar2 = this.f9826c) == null || rVar2 == r.z()) {
                    this.f9826c = rVar;
                } else {
                    p().L(rVar);
                }
                if (this.f9826c != null) {
                    this.f9824a |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public final b m1148mergeUnknownFields(t2 t2Var) {
                return (b) super.m1148mergeUnknownFields(t2Var);
            }

            /* synthetic */ b(k0.c cVar, a aVar) {
                this(cVar);
            }

            private b() {
                this.f9825b = "";
                u();
            }

            private b(k0.c cVar) {
                super(cVar);
                this.f9825b = "";
                u();
            }
        }

        /* synthetic */ C0140q(k0.b bVar, a aVar) {
            this(bVar);
        }

        public static final r.b getDescriptor() {
            return q.f9313q;
        }

        static /* synthetic */ int q(C0140q c0140q, int i10) {
            int i11 = i10 | c0140q.f9820a;
            c0140q.f9820a = i11;
            return i11;
        }

        public static C0140q r() {
            return f9818e;
        }

        public static b x() {
            return f9818e.toBuilder();
        }

        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: A */
        public b newBuilderForType(k0.c cVar) {
            return new b(cVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: C */
        public b toBuilder() {
            return this == f9818e ? new b() : new b().w(this);
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0140q)) {
                return super.equals(obj);
            }
            C0140q c0140q = (C0140q) obj;
            if (v() != c0140q.v()) {
                return false;
            }
            if ((!v() || getName().equals(c0140q.getName())) && w() == c0140q.w()) {
                return (!w() || t().equals(c0140q.t())) && getUnknownFields().equals(c0140q.getUnknownFields());
            }
            return false;
        }

        public String getName() {
            Object obj = this.f9821b;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f9821b = strN;
            }
            return strN;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return f9819f;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = (this.f9820a & 1) != 0 ? k0.computeStringSize(1, this.f9821b) : 0;
            if ((this.f9820a & 2) != 0) {
                iComputeStringSize += com.google.protobuf.o.G(2, t());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (v()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (w()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + t().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return q.f9314r.d(C0140q.class, b.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9823d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!w() || t().isInitialized()) {
                this.f9823d = (byte) 1;
                return true;
            }
            this.f9823d = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new C0140q();
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: s */
        public C0140q getDefaultInstanceForType() {
            return f9818e;
        }

        public r t() {
            r rVar = this.f9822c;
            return rVar == null ? r.z() : rVar;
        }

        public boolean v() {
            return (this.f9820a & 1) != 0;
        }

        public boolean w() {
            return (this.f9820a & 2) != 0;
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if ((this.f9820a & 1) != 0) {
                k0.writeString(oVar, 1, this.f9821b);
            }
            if ((this.f9820a & 2) != 0) {
                oVar.H0(2, t());
            }
            getUnknownFields().writeTo(oVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: z */
        public b newBuilderForType() {
            return x();
        }

        private C0140q(k0.b bVar) {
            super(bVar);
            this.f9821b = "";
            this.f9823d = (byte) -1;
        }

        private C0140q() {
            this.f9821b = "";
            this.f9823d = (byte) -1;
            this.f9821b = "";
        }
    }

    public static final class r extends k0.e implements o1 {

        /* JADX INFO: renamed from: f */
        private static final r f9828f = new r();

        /* JADX INFO: renamed from: g */
        public static final z1 f9829g = new a();

        /* JADX INFO: renamed from: b */
        private int f9830b;

        /* JADX INFO: renamed from: c */
        private i f9831c;

        /* JADX INFO: renamed from: d */
        private List f9832d;

        /* JADX INFO: renamed from: e */
        private byte f9833e;

        class a extends com.google.protobuf.c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c */
            public r parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                b bVarL = r.L();
                try {
                    bVarL.mergeFrom(mVar, yVar);
                    return bVarL.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(bVarL.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(bVarL.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(bVarL.buildPartial());
                }
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                return super.parseDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                return super.parseFrom(lVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                return super.mo1183parsePartialDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                return super.mo1185parsePartialFrom(lVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                return super.parseDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                return super.parseFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                return super.mo1186parsePartialFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                return super.parseFrom(mVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                return super.mo1187parsePartialFrom(mVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                return super.parseFrom(mVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                return super.parseFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                return super.mo1188parsePartialFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                return super.parseFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                return super.mo1189parsePartialFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                return super.parseFrom(byteBuffer);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                return super.mo1190parsePartialFrom(bArr);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                return super.parseFrom(byteBuffer, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                return super.mo1191parsePartialFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                return super.mo1181parseFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                return super.mo1193parsePartialFrom(bArr, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1182parseFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                return super.parseFrom(bArr, yVar);
            }
        }

        public static final class b extends k0.d implements o1 {

            /* JADX INFO: renamed from: b */
            private int f9834b;

            /* JADX INFO: renamed from: c */
            private i f9835c;

            /* JADX INFO: renamed from: d */
            private k2 f9836d;

            /* JADX INFO: renamed from: e */
            private List f9837e;

            /* JADX INFO: renamed from: f */
            private g2 f9838f;

            /* synthetic */ b(a aVar) {
                this();
            }

            private k2 D() {
                if (this.f9836d == null) {
                    this.f9836d = new k2(B(), getParentForChildren(), isClean());
                    this.f9835c = null;
                }
                return this.f9836d;
            }

            private g2 G() {
                if (this.f9838f == null) {
                    this.f9838f = new g2(this.f9837e, (this.f9834b & 2) != 0, getParentForChildren(), isClean());
                    this.f9837e = null;
                }
                return this.f9838f;
            }

            private void I() {
                if (k0.alwaysUseFieldBuilders) {
                    D();
                    G();
                }
            }

            private void v(r rVar) {
                int i10 = 1;
                if ((this.f9834b & 1) != 0) {
                    k2 k2Var = this.f9836d;
                    rVar.f9831c = k2Var == null ? this.f9835c : (i) k2Var.b();
                } else {
                    i10 = 0;
                }
                r.x(rVar, i10);
            }

            private void w(r rVar) {
                g2 g2Var = this.f9838f;
                if (g2Var != null) {
                    rVar.f9832d = g2Var.g();
                    return;
                }
                if ((this.f9834b & 2) != 0) {
                    this.f9837e = DesugarCollections.unmodifiableList(this.f9837e);
                    this.f9834b &= -3;
                }
                rVar.f9832d = this.f9837e;
            }

            private void z() {
                if ((this.f9834b & 2) == 0) {
                    this.f9837e = new ArrayList(this.f9837e);
                    this.f9834b |= 2;
                }
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: A */
            public r getDefaultInstanceForType() {
                return r.z();
            }

            public i B() {
                k2 k2Var = this.f9836d;
                if (k2Var != null) {
                    return (i) k2Var.f();
                }
                i iVar = this.f9835c;
                return iVar == null ? i.D() : iVar;
            }

            public i.b C() {
                this.f9834b |= 1;
                onChanged();
                return (i.b) D().e();
            }

            public v E(int i10) {
                g2 g2Var = this.f9838f;
                return g2Var == null ? (v) this.f9837e.get(i10) : (v) g2Var.o(i10);
            }

            public int F() {
                g2 g2Var = this.f9838f;
                return g2Var == null ? this.f9837e.size() : g2Var.n();
            }

            public boolean H() {
                return (this.f9834b & 1) != 0;
            }

            public b J(i iVar) {
                i iVar2;
                k2 k2Var = this.f9836d;
                if (k2Var != null) {
                    k2Var.h(iVar);
                } else if ((this.f9834b & 1) == 0 || (iVar2 = this.f9835c) == null || iVar2 == i.D()) {
                    this.f9835c = iVar;
                } else {
                    C().A(iVar);
                }
                if (this.f9835c != null) {
                    this.f9834b |= 1;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: K */
            public b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    mVar.B(D().e(), yVar);
                                    this.f9834b |= 1;
                                } else if (iK == 7994) {
                                    v vVar = (v) mVar.A(v.f9890t, yVar);
                                    g2 g2Var = this.f9838f;
                                    if (g2Var == null) {
                                        z();
                                        this.f9837e.add(vVar);
                                    } else {
                                        g2Var.f(vVar);
                                    }
                                } else if (!super.parseUnknownField(mVar, yVar, iK)) {
                                }
                            }
                            z10 = true;
                        } catch (p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }

            public b L(r rVar) {
                if (rVar == r.z()) {
                    return this;
                }
                if (rVar.K()) {
                    J(rVar.C());
                }
                if (this.f9838f == null) {
                    if (!rVar.f9832d.isEmpty()) {
                        if (this.f9837e.isEmpty()) {
                            this.f9837e = rVar.f9832d;
                            this.f9834b &= -3;
                        } else {
                            z();
                            this.f9837e.addAll(rVar.f9832d);
                        }
                        onChanged();
                    }
                } else if (!rVar.f9832d.isEmpty()) {
                    if (this.f9838f.u()) {
                        this.f9838f.i();
                        this.f9838f = null;
                        this.f9837e = rVar.f9832d;
                        this.f9834b &= -3;
                        this.f9838f = k0.alwaysUseFieldBuilders ? G() : null;
                    } else {
                        this.f9838f.b(rVar.f9832d);
                    }
                }
                n(rVar);
                m141mergeUnknownFields(rVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: M */
            public b mergeFrom(i1 i1Var) {
                if (i1Var instanceof r) {
                    return L((r) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final b m1148mergeUnknownFields(t2 t2Var) {
                return (b) super.m1148mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: O */
            public b setField(r.g gVar, Object obj) {
                return (b) super.o(gVar, obj);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: P */
            public final b setUnknownFields(t2 t2Var) {
                return (b) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return q.K;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return q.L.d(r.class, b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                if (H() && !B().isInitialized()) {
                    return false;
                }
                for (int i10 = 0; i10 < F(); i10++) {
                    if (!E(i10).isInitialized()) {
                        return false;
                    }
                }
                return m();
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: r */
            public b addRepeatedField(r.g gVar, Object obj) {
                return (b) super.h(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: t */
            public r build() {
                r rVarBuildPartial = buildPartial();
                if (rVarBuildPartial.isInitialized()) {
                    return rVarBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) rVarBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: u */
            public r buildPartial() {
                r rVar = new r(this);
                w(rVar);
                if (this.f9834b != 0) {
                    v(rVar);
                }
                onBuilt();
                return rVar;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b m1140clearField(r.g gVar) {
                return (b) super.j(gVar);
            }

            /* JADX INFO: renamed from: y */
            public b clone() {
                return (b) super.m1147clone();
            }

            /* synthetic */ b(k0.c cVar, a aVar) {
                this(cVar);
            }

            private b() {
                this.f9837e = Collections.EMPTY_LIST;
                I();
            }

            private b(k0.c cVar) {
                super(cVar);
                this.f9837e = Collections.EMPTY_LIST;
                I();
            }
        }

        /* synthetic */ r(k0.d dVar, a aVar) {
            this(dVar);
        }

        public static b L() {
            return f9828f.toBuilder();
        }

        public static final r.b getDescriptor() {
            return q.K;
        }

        static /* synthetic */ int x(r rVar, int i10) {
            int i11 = i10 | rVar.f9830b;
            rVar.f9830b = i11;
            return i11;
        }

        public static r z() {
            return f9828f;
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: A */
        public r getDefaultInstanceForType() {
            return f9828f;
        }

        public i C() {
            i iVar = this.f9831c;
            return iVar == null ? i.D() : iVar;
        }

        public v D(int i10) {
            return (v) this.f9832d.get(i10);
        }

        public int G() {
            return this.f9832d.size();
        }

        public List H() {
            return this.f9832d;
        }

        public boolean K() {
            return (this.f9830b & 1) != 0;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: N */
        public b newBuilderForType() {
            return L();
        }

        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: O */
        public b newBuilderForType(k0.c cVar) {
            return new b(cVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: Q */
        public b toBuilder() {
            return this == f9828f ? new b() : new b().L(this);
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof r)) {
                return super.equals(obj);
            }
            r rVar = (r) obj;
            if (K() != rVar.K()) {
                return false;
            }
            return (!K() || C().equals(rVar.C())) && H().equals(rVar.H()) && getUnknownFields().equals(rVar.getUnknownFields()) && q().equals(rVar.q());
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return f9829g;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = (this.f9830b & 1) != 0 ? com.google.protobuf.o.G(1, C()) : 0;
            for (int i11 = 0; i11 < this.f9832d.size(); i11++) {
                iG += com.google.protobuf.o.G(999, (l1) this.f9832d.get(i11));
            }
            int iP = iG + p() + getUnknownFields().getSerializedSize();
            this.memoizedSize = iP;
            return iP;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (K()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + C().hashCode();
            }
            if (G() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + H().hashCode();
            }
            int iHashFields = (com.google.protobuf.a.hashFields(iHashCode, q()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return q.L.d(r.class, b.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9833e;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (K() && !C().isInitialized()) {
                this.f9833e = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < G(); i10++) {
                if (!D(i10).isInitialized()) {
                    this.f9833e = (byte) 0;
                    return false;
                }
            }
            if (o()) {
                this.f9833e = (byte) 1;
                return true;
            }
            this.f9833e = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new r();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) {
            k0.e.a aVarR = r();
            if ((this.f9830b & 1) != 0) {
                oVar.H0(1, C());
            }
            for (int i10 = 0; i10 < this.f9832d.size(); i10++) {
                oVar.H0(999, (l1) this.f9832d.get(i10));
            }
            aVarR.a(536870912, oVar);
            getUnknownFields().writeTo(oVar);
        }

        private r(k0.d dVar) {
            super(dVar);
            this.f9833e = (byte) -1;
        }

        private r() {
            this.f9833e = (byte) -1;
            this.f9832d = Collections.EMPTY_LIST;
        }
    }

    public static final class s extends k0 implements o1 {

        /* JADX INFO: renamed from: f */
        private static final s f9839f = new s();

        /* JADX INFO: renamed from: g */
        public static final z1 f9840g = new a();

        /* JADX INFO: renamed from: a */
        private int f9841a;

        /* JADX INFO: renamed from: b */
        private volatile Object f9842b;

        /* JADX INFO: renamed from: c */
        private List f9843c;

        /* JADX INFO: renamed from: d */
        private t f9844d;

        /* JADX INFO: renamed from: e */
        private byte f9845e;

        class a extends com.google.protobuf.c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c */
            public s parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                b bVarG = s.G();
                try {
                    bVarG.mergeFrom(mVar, yVar);
                    return bVarG.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(bVarG.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(bVarG.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(bVarG.buildPartial());
                }
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                return super.parseDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                return super.parseFrom(lVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                return super.mo1183parsePartialDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                return super.mo1185parsePartialFrom(lVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                return super.parseDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                return super.parseFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                return super.mo1186parsePartialFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                return super.parseFrom(mVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                return super.mo1187parsePartialFrom(mVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                return super.parseFrom(mVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                return super.parseFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                return super.mo1188parsePartialFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                return super.parseFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                return super.mo1189parsePartialFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                return super.parseFrom(byteBuffer);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                return super.mo1190parsePartialFrom(bArr);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                return super.parseFrom(byteBuffer, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                return super.mo1191parsePartialFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                return super.mo1181parseFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                return super.mo1193parsePartialFrom(bArr, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1182parseFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                return super.parseFrom(bArr, yVar);
            }
        }

        public static final class b extends k0.b implements o1 {

            /* JADX INFO: renamed from: a */
            private int f9846a;

            /* JADX INFO: renamed from: b */
            private Object f9847b;

            /* JADX INFO: renamed from: c */
            private List f9848c;

            /* JADX INFO: renamed from: d */
            private g2 f9849d;

            /* JADX INFO: renamed from: e */
            private t f9850e;

            /* JADX INFO: renamed from: f */
            private k2 f9851f;

            /* synthetic */ b(a aVar) {
                this();
            }

            private void j(s sVar) {
                int i10;
                int i11 = this.f9846a;
                if ((i11 & 1) != 0) {
                    sVar.f9842b = this.f9847b;
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 4) != 0) {
                    k2 k2Var = this.f9851f;
                    sVar.f9844d = k2Var == null ? this.f9850e : (t) k2Var.b();
                    i10 |= 2;
                }
                s.s(sVar, i10);
            }

            private void k(s sVar) {
                g2 g2Var = this.f9849d;
                if (g2Var != null) {
                    sVar.f9843c = g2Var.g();
                    return;
                }
                if ((this.f9846a & 2) != 0) {
                    this.f9848c = DesugarCollections.unmodifiableList(this.f9848c);
                    this.f9846a &= -3;
                }
                sVar.f9843c = this.f9848c;
            }

            private void o() {
                if ((this.f9846a & 2) == 0) {
                    this.f9848c = new ArrayList(this.f9848c);
                    this.f9846a |= 2;
                }
            }

            private g2 u() {
                if (this.f9849d == null) {
                    this.f9849d = new g2(this.f9848c, (this.f9846a & 2) != 0, getParentForChildren(), isClean());
                    this.f9848c = null;
                }
                return this.f9849d;
            }

            private k2 x() {
                if (this.f9851f == null) {
                    this.f9851f = new k2(v(), getParentForChildren(), isClean());
                    this.f9850e = null;
                }
                return this.f9851f;
            }

            private void z() {
                if (k0.alwaysUseFieldBuilders) {
                    u();
                    x();
                }
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: A */
            public b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    this.f9847b = mVar.r();
                                    this.f9846a |= 1;
                                } else if (iK == 18) {
                                    o oVar = (o) mVar.A(o.f9779s, yVar);
                                    g2 g2Var = this.f9849d;
                                    if (g2Var == null) {
                                        o();
                                        this.f9848c.add(oVar);
                                    } else {
                                        g2Var.f(oVar);
                                    }
                                } else if (iK == 26) {
                                    mVar.B(x().e(), yVar);
                                    this.f9846a |= 4;
                                } else if (!super.parseUnknownField(mVar, yVar, iK)) {
                                }
                            }
                            z10 = true;
                        } catch (p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }

            public b B(s sVar) {
                if (sVar == s.t()) {
                    return this;
                }
                if (sVar.C()) {
                    this.f9847b = sVar.f9842b;
                    this.f9846a |= 1;
                    onChanged();
                }
                if (this.f9849d == null) {
                    if (!sVar.f9843c.isEmpty()) {
                        if (this.f9848c.isEmpty()) {
                            this.f9848c = sVar.f9843c;
                            this.f9846a &= -3;
                        } else {
                            o();
                            this.f9848c.addAll(sVar.f9843c);
                        }
                        onChanged();
                    }
                } else if (!sVar.f9843c.isEmpty()) {
                    if (this.f9849d.u()) {
                        this.f9849d.i();
                        this.f9849d = null;
                        this.f9848c = sVar.f9843c;
                        this.f9846a &= -3;
                        this.f9849d = k0.alwaysUseFieldBuilders ? u() : null;
                    } else {
                        this.f9849d.b(sVar.f9843c);
                    }
                }
                if (sVar.D()) {
                    D(sVar.A());
                }
                m141mergeUnknownFields(sVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: C */
            public b mergeFrom(i1 i1Var) {
                if (i1Var instanceof s) {
                    return B((s) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public b D(t tVar) {
                t tVar2;
                k2 k2Var = this.f9851f;
                if (k2Var != null) {
                    k2Var.h(tVar);
                } else if ((this.f9846a & 4) == 0 || (tVar2 = this.f9850e) == null || tVar2 == t.A()) {
                    this.f9850e = tVar;
                } else {
                    w().L(tVar);
                }
                if (this.f9850e != null) {
                    this.f9846a |= 4;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
            public final b m1148mergeUnknownFields(t2 t2Var) {
                return (b) super.m1148mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: F */
            public b setField(r.g gVar, Object obj) {
                return (b) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: G */
            public final b setUnknownFields(t2 t2Var) {
                return (b) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: g */
            public b addRepeatedField(r.g gVar, Object obj) {
                return (b) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return q.f9321y;
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: h */
            public s build() {
                s sVarBuildPartial = buildPartial();
                if (sVarBuildPartial.isInitialized()) {
                    return sVarBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) sVarBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: i */
            public s buildPartial() {
                s sVar = new s(this);
                k(sVar);
                if (this.f9846a != 0) {
                    j(sVar);
                }
                onBuilt();
                return sVar;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return q.f9322z.d(s.class, b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < t(); i10++) {
                    if (!r(i10).isInitialized()) {
                        return false;
                    }
                }
                return !y() || v().isInitialized();
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public b m1140clearField(r.g gVar) {
                return (b) super.m1140clearField(gVar);
            }

            /* JADX INFO: renamed from: n */
            public b clone() {
                return (b) super.m1147clone();
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: p */
            public s getDefaultInstanceForType() {
                return s.t();
            }

            public o r(int i10) {
                g2 g2Var = this.f9849d;
                return g2Var == null ? (o) this.f9848c.get(i10) : (o) g2Var.o(i10);
            }

            public int t() {
                g2 g2Var = this.f9849d;
                return g2Var == null ? this.f9848c.size() : g2Var.n();
            }

            public t v() {
                k2 k2Var = this.f9851f;
                if (k2Var != null) {
                    return (t) k2Var.f();
                }
                t tVar = this.f9850e;
                return tVar == null ? t.A() : tVar;
            }

            public t.b w() {
                this.f9846a |= 4;
                onChanged();
                return (t.b) x().e();
            }

            public boolean y() {
                return (this.f9846a & 4) != 0;
            }

            /* synthetic */ b(k0.c cVar, a aVar) {
                this(cVar);
            }

            private b() {
                this.f9847b = "";
                this.f9848c = Collections.EMPTY_LIST;
                z();
            }

            private b(k0.c cVar) {
                super(cVar);
                this.f9847b = "";
                this.f9848c = Collections.EMPTY_LIST;
                z();
            }
        }

        /* synthetic */ s(k0.b bVar, a aVar) {
            this(bVar);
        }

        public static b G() {
            return f9839f.toBuilder();
        }

        public static final r.b getDescriptor() {
            return q.f9321y;
        }

        static /* synthetic */ int s(s sVar, int i10) {
            int i11 = i10 | sVar.f9841a;
            sVar.f9841a = i11;
            return i11;
        }

        public static s t() {
            return f9839f;
        }

        public t A() {
            t tVar = this.f9844d;
            return tVar == null ? t.A() : tVar;
        }

        public boolean C() {
            return (this.f9841a & 1) != 0;
        }

        public boolean D() {
            return (this.f9841a & 2) != 0;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: H */
        public b newBuilderForType() {
            return G();
        }

        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: K */
        public b newBuilderForType(k0.c cVar) {
            return new b(cVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: L */
        public b toBuilder() {
            return this == f9839f ? new b() : new b().B(this);
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof s)) {
                return super.equals(obj);
            }
            s sVar = (s) obj;
            if (C() != sVar.C()) {
                return false;
            }
            if ((!C() || getName().equals(sVar.getName())) && z().equals(sVar.z()) && D() == sVar.D()) {
                return (!D() || A().equals(sVar.A())) && getUnknownFields().equals(sVar.getUnknownFields());
            }
            return false;
        }

        public String getName() {
            Object obj = this.f9842b;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f9842b = strN;
            }
            return strN;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return f9840g;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = (this.f9841a & 1) != 0 ? k0.computeStringSize(1, this.f9842b) : 0;
            for (int i11 = 0; i11 < this.f9843c.size(); i11++) {
                iComputeStringSize += com.google.protobuf.o.G(2, (l1) this.f9843c.get(i11));
            }
            if ((this.f9841a & 2) != 0) {
                iComputeStringSize += com.google.protobuf.o.G(3, A());
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (C()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (x() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + z().hashCode();
            }
            if (D()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + A().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return q.f9322z.d(s.class, b.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9845e;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < x(); i10++) {
                if (!w(i10).isInitialized()) {
                    this.f9845e = (byte) 0;
                    return false;
                }
            }
            if (!D() || A().isInitialized()) {
                this.f9845e = (byte) 1;
                return true;
            }
            this.f9845e = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new s();
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: v */
        public s getDefaultInstanceForType() {
            return f9839f;
        }

        public o w(int i10) {
            return (o) this.f9843c.get(i10);
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if ((this.f9841a & 1) != 0) {
                k0.writeString(oVar, 1, this.f9842b);
            }
            for (int i10 = 0; i10 < this.f9843c.size(); i10++) {
                oVar.H0(2, (l1) this.f9843c.get(i10));
            }
            if ((this.f9841a & 2) != 0) {
                oVar.H0(3, A());
            }
            getUnknownFields().writeTo(oVar);
        }

        public int x() {
            return this.f9843c.size();
        }

        public List z() {
            return this.f9843c;
        }

        private s(k0.b bVar) {
            super(bVar);
            this.f9842b = "";
            this.f9845e = (byte) -1;
        }

        private s() {
            this.f9842b = "";
            this.f9845e = (byte) -1;
            this.f9842b = "";
            this.f9843c = Collections.EMPTY_LIST;
        }
    }

    public static final class t extends k0.e implements o1 {

        /* JADX INFO: renamed from: g */
        private static final t f9852g = new t();

        /* JADX INFO: renamed from: h */
        public static final z1 f9853h = new a();

        /* JADX INFO: renamed from: b */
        private int f9854b;

        /* JADX INFO: renamed from: c */
        private i f9855c;

        /* JADX INFO: renamed from: d */
        private boolean f9856d;

        /* JADX INFO: renamed from: e */
        private List f9857e;

        /* JADX INFO: renamed from: f */
        private byte f9858f;

        class a extends com.google.protobuf.c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c */
            public t parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                b bVarQ = t.Q();
                try {
                    bVarQ.mergeFrom(mVar, yVar);
                    return bVarQ.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(bVarQ.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(bVarQ.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(bVarQ.buildPartial());
                }
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                return super.parseDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                return super.parseFrom(lVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                return super.mo1183parsePartialDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                return super.mo1185parsePartialFrom(lVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                return super.parseDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                return super.parseFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                return super.mo1186parsePartialFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                return super.parseFrom(mVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                return super.mo1187parsePartialFrom(mVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                return super.parseFrom(mVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                return super.parseFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                return super.mo1188parsePartialFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                return super.parseFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                return super.mo1189parsePartialFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                return super.parseFrom(byteBuffer);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                return super.mo1190parsePartialFrom(bArr);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                return super.parseFrom(byteBuffer, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                return super.mo1191parsePartialFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                return super.mo1181parseFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                return super.mo1193parsePartialFrom(bArr, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1182parseFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                return super.parseFrom(bArr, yVar);
            }
        }

        public static final class b extends k0.d implements o1 {

            /* JADX INFO: renamed from: b */
            private int f9859b;

            /* JADX INFO: renamed from: c */
            private i f9860c;

            /* JADX INFO: renamed from: d */
            private k2 f9861d;

            /* JADX INFO: renamed from: e */
            private boolean f9862e;

            /* JADX INFO: renamed from: f */
            private List f9863f;

            /* JADX INFO: renamed from: g */
            private g2 f9864g;

            /* synthetic */ b(a aVar) {
                this();
            }

            private k2 D() {
                if (this.f9861d == null) {
                    this.f9861d = new k2(B(), getParentForChildren(), isClean());
                    this.f9860c = null;
                }
                return this.f9861d;
            }

            private g2 G() {
                if (this.f9864g == null) {
                    this.f9864g = new g2(this.f9863f, (this.f9859b & 4) != 0, getParentForChildren(), isClean());
                    this.f9863f = null;
                }
                return this.f9864g;
            }

            private void I() {
                if (k0.alwaysUseFieldBuilders) {
                    D();
                    G();
                }
            }

            private void v(t tVar) {
                int i10;
                int i11 = this.f9859b;
                if ((i11 & 1) != 0) {
                    k2 k2Var = this.f9861d;
                    tVar.f9855c = k2Var == null ? this.f9860c : (i) k2Var.b();
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 2) != 0) {
                    tVar.f9856d = this.f9862e;
                    i10 |= 2;
                }
                t.z(tVar, i10);
            }

            private void w(t tVar) {
                g2 g2Var = this.f9864g;
                if (g2Var != null) {
                    tVar.f9857e = g2Var.g();
                    return;
                }
                if ((this.f9859b & 4) != 0) {
                    this.f9863f = DesugarCollections.unmodifiableList(this.f9863f);
                    this.f9859b &= -5;
                }
                tVar.f9857e = this.f9863f;
            }

            private void z() {
                if ((this.f9859b & 4) == 0) {
                    this.f9863f = new ArrayList(this.f9863f);
                    this.f9859b |= 4;
                }
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: A */
            public t getDefaultInstanceForType() {
                return t.A();
            }

            public i B() {
                k2 k2Var = this.f9861d;
                if (k2Var != null) {
                    return (i) k2Var.f();
                }
                i iVar = this.f9860c;
                return iVar == null ? i.D() : iVar;
            }

            public i.b C() {
                this.f9859b |= 1;
                onChanged();
                return (i.b) D().e();
            }

            public v E(int i10) {
                g2 g2Var = this.f9864g;
                return g2Var == null ? (v) this.f9863f.get(i10) : (v) g2Var.o(i10);
            }

            public int F() {
                g2 g2Var = this.f9864g;
                return g2Var == null ? this.f9863f.size() : g2Var.n();
            }

            public boolean H() {
                return (this.f9859b & 1) != 0;
            }

            public b J(i iVar) {
                i iVar2;
                k2 k2Var = this.f9861d;
                if (k2Var != null) {
                    k2Var.h(iVar);
                } else if ((this.f9859b & 1) == 0 || (iVar2 = this.f9860c) == null || iVar2 == i.D()) {
                    this.f9860c = iVar;
                } else {
                    C().A(iVar);
                }
                if (this.f9860c != null) {
                    this.f9859b |= 1;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: K */
            public b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 264) {
                                    this.f9862e = mVar.q();
                                    this.f9859b |= 2;
                                } else if (iK == 274) {
                                    mVar.B(D().e(), yVar);
                                    this.f9859b |= 1;
                                } else if (iK == 7994) {
                                    v vVar = (v) mVar.A(v.f9890t, yVar);
                                    g2 g2Var = this.f9864g;
                                    if (g2Var == null) {
                                        z();
                                        this.f9863f.add(vVar);
                                    } else {
                                        g2Var.f(vVar);
                                    }
                                } else if (!super.parseUnknownField(mVar, yVar, iK)) {
                                }
                            }
                            z10 = true;
                        } catch (p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }

            public b L(t tVar) {
                if (tVar == t.A()) {
                    return this;
                }
                if (tVar.O()) {
                    J(tVar.G());
                }
                if (tVar.N()) {
                    O(tVar.D());
                }
                if (this.f9864g == null) {
                    if (!tVar.f9857e.isEmpty()) {
                        if (this.f9863f.isEmpty()) {
                            this.f9863f = tVar.f9857e;
                            this.f9859b &= -5;
                        } else {
                            z();
                            this.f9863f.addAll(tVar.f9857e);
                        }
                        onChanged();
                    }
                } else if (!tVar.f9857e.isEmpty()) {
                    if (this.f9864g.u()) {
                        this.f9864g.i();
                        this.f9864g = null;
                        this.f9863f = tVar.f9857e;
                        this.f9859b &= -5;
                        this.f9864g = k0.alwaysUseFieldBuilders ? G() : null;
                    } else {
                        this.f9864g.b(tVar.f9857e);
                    }
                }
                n(tVar);
                m141mergeUnknownFields(tVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: M */
            public b mergeFrom(i1 i1Var) {
                if (i1Var instanceof t) {
                    return L((t) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final b m1148mergeUnknownFields(t2 t2Var) {
                return (b) super.m1148mergeUnknownFields(t2Var);
            }

            public b O(boolean z10) {
                this.f9862e = z10;
                this.f9859b |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: P */
            public b setField(r.g gVar, Object obj) {
                return (b) super.o(gVar, obj);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: Q */
            public final b setUnknownFields(t2 t2Var) {
                return (b) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return q.Q;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return q.R.d(t.class, b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                if (H() && !B().isInitialized()) {
                    return false;
                }
                for (int i10 = 0; i10 < F(); i10++) {
                    if (!E(i10).isInitialized()) {
                        return false;
                    }
                }
                return m();
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: r */
            public b addRepeatedField(r.g gVar, Object obj) {
                return (b) super.h(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: t */
            public t build() {
                t tVarBuildPartial = buildPartial();
                if (tVarBuildPartial.isInitialized()) {
                    return tVarBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) tVarBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: u */
            public t buildPartial() {
                t tVar = new t(this);
                w(tVar);
                if (this.f9859b != 0) {
                    v(tVar);
                }
                onBuilt();
                return tVar;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b m1140clearField(r.g gVar) {
                return (b) super.j(gVar);
            }

            /* JADX INFO: renamed from: y */
            public b clone() {
                return (b) super.m1147clone();
            }

            /* synthetic */ b(k0.c cVar, a aVar) {
                this(cVar);
            }

            private b() {
                this.f9863f = Collections.EMPTY_LIST;
                I();
            }

            private b(k0.c cVar) {
                super(cVar);
                this.f9863f = Collections.EMPTY_LIST;
                I();
            }
        }

        /* synthetic */ t(k0.d dVar, a aVar) {
            this(dVar);
        }

        public static t A() {
            return f9852g;
        }

        public static b Q() {
            return f9852g.toBuilder();
        }

        public static final r.b getDescriptor() {
            return q.Q;
        }

        static /* synthetic */ int z(t tVar, int i10) {
            int i11 = i10 | tVar.f9854b;
            tVar.f9854b = i11;
            return i11;
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: C */
        public t getDefaultInstanceForType() {
            return f9852g;
        }

        public boolean D() {
            return this.f9856d;
        }

        public i G() {
            i iVar = this.f9855c;
            return iVar == null ? i.D() : iVar;
        }

        public v H(int i10) {
            return (v) this.f9857e.get(i10);
        }

        public int K() {
            return this.f9857e.size();
        }

        public List L() {
            return this.f9857e;
        }

        public boolean N() {
            return (this.f9854b & 2) != 0;
        }

        public boolean O() {
            return (this.f9854b & 1) != 0;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: R */
        public b newBuilderForType() {
            return Q();
        }

        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: S */
        public b newBuilderForType(k0.c cVar) {
            return new b(cVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: T */
        public b toBuilder() {
            return this == f9852g ? new b() : new b().L(this);
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof t)) {
                return super.equals(obj);
            }
            t tVar = (t) obj;
            if (O() != tVar.O()) {
                return false;
            }
            if ((!O() || G().equals(tVar.G())) && N() == tVar.N()) {
                return (!N() || D() == tVar.D()) && L().equals(tVar.L()) && getUnknownFields().equals(tVar.getUnknownFields()) && q().equals(tVar.q());
            }
            return false;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return f9853h;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iE = (this.f9854b & 2) != 0 ? com.google.protobuf.o.e(33, this.f9856d) : 0;
            if ((this.f9854b & 1) != 0) {
                iE += com.google.protobuf.o.G(34, G());
            }
            for (int i11 = 0; i11 < this.f9857e.size(); i11++) {
                iE += com.google.protobuf.o.G(999, (l1) this.f9857e.get(i11));
            }
            int iP = iE + p() + getUnknownFields().getSerializedSize();
            this.memoizedSize = iP;
            return iP;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (O()) {
                iHashCode = (((iHashCode * 37) + 34) * 53) + G().hashCode();
            }
            if (N()) {
                iHashCode = (((iHashCode * 37) + 33) * 53) + o0.d(D());
            }
            if (K() > 0) {
                iHashCode = (((iHashCode * 37) + 999) * 53) + L().hashCode();
            }
            int iHashFields = (com.google.protobuf.a.hashFields(iHashCode, q()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashFields;
            return iHashFields;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return q.R.d(t.class, b.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9858f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (O() && !G().isInitialized()) {
                this.f9858f = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < K(); i10++) {
                if (!H(i10).isInitialized()) {
                    this.f9858f = (byte) 0;
                    return false;
                }
            }
            if (o()) {
                this.f9858f = (byte) 1;
                return true;
            }
            this.f9858f = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new t();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) {
            k0.e.a aVarR = r();
            if ((this.f9854b & 2) != 0) {
                oVar.m0(33, this.f9856d);
            }
            if ((this.f9854b & 1) != 0) {
                oVar.H0(34, G());
            }
            for (int i10 = 0; i10 < this.f9857e.size(); i10++) {
                oVar.H0(999, (l1) this.f9857e.get(i10));
            }
            aVarR.a(536870912, oVar);
            getUnknownFields().writeTo(oVar);
        }

        private t(k0.d dVar) {
            super(dVar);
            this.f9856d = false;
            this.f9858f = (byte) -1;
        }

        private t() {
            this.f9856d = false;
            this.f9858f = (byte) -1;
            this.f9857e = Collections.EMPTY_LIST;
        }
    }

    public static final class u extends k0 implements o1 {

        /* JADX INFO: renamed from: c */
        private static final u f9865c = new u();

        /* JADX INFO: renamed from: d */
        public static final z1 f9866d = new a();

        /* JADX INFO: renamed from: a */
        private List f9867a;

        /* JADX INFO: renamed from: b */
        private byte f9868b;

        class a extends com.google.protobuf.c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c */
            public u parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                b bVarT = u.t();
                try {
                    bVarT.mergeFrom(mVar, yVar);
                    return bVarT.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(bVarT.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(bVarT.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(bVarT.buildPartial());
                }
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                return super.parseDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                return super.parseFrom(lVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                return super.mo1183parsePartialDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                return super.mo1185parsePartialFrom(lVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                return super.parseDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                return super.parseFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                return super.mo1186parsePartialFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                return super.parseFrom(mVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                return super.mo1187parsePartialFrom(mVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                return super.parseFrom(mVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                return super.parseFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                return super.mo1188parsePartialFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                return super.parseFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                return super.mo1189parsePartialFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                return super.parseFrom(byteBuffer);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                return super.mo1190parsePartialFrom(bArr);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                return super.parseFrom(byteBuffer, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                return super.mo1191parsePartialFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                return super.mo1181parseFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                return super.mo1193parsePartialFrom(bArr, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1182parseFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                return super.parseFrom(bArr, yVar);
            }
        }

        public static final class b extends k0.b implements o1 {

            /* JADX INFO: renamed from: a */
            private int f9869a;

            /* JADX INFO: renamed from: b */
            private List f9870b;

            /* JADX INFO: renamed from: c */
            private g2 f9871c;

            /* synthetic */ b(a aVar) {
                this();
            }

            private void j(u uVar) {
            }

            private void k(u uVar) {
                g2 g2Var = this.f9871c;
                if (g2Var != null) {
                    uVar.f9867a = g2Var.g();
                    return;
                }
                if ((this.f9869a & 1) != 0) {
                    this.f9870b = DesugarCollections.unmodifiableList(this.f9870b);
                    this.f9869a &= -2;
                }
                uVar.f9867a = this.f9870b;
            }

            private void o() {
                if ((this.f9869a & 1) == 0) {
                    this.f9870b = new ArrayList(this.f9870b);
                    this.f9869a |= 1;
                }
            }

            private g2 r() {
                if (this.f9871c == null) {
                    this.f9871c = new g2(this.f9870b, (this.f9869a & 1) != 0, getParentForChildren(), isClean());
                    this.f9870b = null;
                }
                return this.f9871c;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: g */
            public b addRepeatedField(r.g gVar, Object obj) {
                return (b) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return q.f9293e0;
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: h */
            public u build() {
                u uVarBuildPartial = buildPartial();
                if (uVarBuildPartial.isInitialized()) {
                    return uVarBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) uVarBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: i */
            public u buildPartial() {
                u uVar = new u(this);
                k(uVar);
                if (this.f9869a != 0) {
                    j(uVar);
                }
                onBuilt();
                return uVar;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return q.f9295f0.d(u.class, b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public b m1140clearField(r.g gVar) {
                return (b) super.m1140clearField(gVar);
            }

            /* JADX INFO: renamed from: n */
            public b clone() {
                return (b) super.m1147clone();
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: p */
            public u getDefaultInstanceForType() {
                return u.p();
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: t */
            public b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    c cVar = (c) mVar.A(c.f9873t, yVar);
                                    g2 g2Var = this.f9871c;
                                    if (g2Var == null) {
                                        o();
                                        this.f9870b.add(cVar);
                                    } else {
                                        g2Var.f(cVar);
                                    }
                                } else if (!super.parseUnknownField(mVar, yVar, iK)) {
                                }
                            }
                            z10 = true;
                        } catch (p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }

            public b u(u uVar) {
                if (uVar == u.p()) {
                    return this;
                }
                if (this.f9871c == null) {
                    if (!uVar.f9867a.isEmpty()) {
                        if (this.f9870b.isEmpty()) {
                            this.f9870b = uVar.f9867a;
                            this.f9869a &= -2;
                        } else {
                            o();
                            this.f9870b.addAll(uVar.f9867a);
                        }
                        onChanged();
                    }
                } else if (!uVar.f9867a.isEmpty()) {
                    if (this.f9871c.u()) {
                        this.f9871c.i();
                        this.f9871c = null;
                        this.f9870b = uVar.f9867a;
                        this.f9869a &= -2;
                        this.f9871c = k0.alwaysUseFieldBuilders ? r() : null;
                    } else {
                        this.f9871c.b(uVar.f9867a);
                    }
                }
                m141mergeUnknownFields(uVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: v */
            public b mergeFrom(i1 i1Var) {
                if (i1Var instanceof u) {
                    return u((u) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public final b m1148mergeUnknownFields(t2 t2Var) {
                return (b) super.m1148mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: x */
            public b setField(r.g gVar, Object obj) {
                return (b) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: y */
            public final b setUnknownFields(t2 t2Var) {
                return (b) super.setUnknownFields(t2Var);
            }

            /* synthetic */ b(k0.c cVar, a aVar) {
                this(cVar);
            }

            private b() {
                this.f9870b = Collections.EMPTY_LIST;
            }

            private b(k0.c cVar) {
                super(cVar);
                this.f9870b = Collections.EMPTY_LIST;
            }
        }

        public static final class c extends k0 implements o1 {

            /* JADX INFO: renamed from: s */
            private static final c f9872s = new c();

            /* JADX INFO: renamed from: t */
            public static final z1 f9873t = new a();

            /* JADX INFO: renamed from: a */
            private int f9874a;

            /* JADX INFO: renamed from: b */
            private o0.g f9875b;

            /* JADX INFO: renamed from: c */
            private int f9876c;

            /* JADX INFO: renamed from: d */
            private o0.g f9877d;

            /* JADX INFO: renamed from: e */
            private int f9878e;

            /* JADX INFO: renamed from: f */
            private volatile Object f9879f;

            /* JADX INFO: renamed from: g */
            private volatile Object f9880g;

            /* JADX INFO: renamed from: h */
            private u0 f9881h;

            /* JADX INFO: renamed from: r */
            private byte f9882r;

            class a extends com.google.protobuf.c {
                a() {
                }

                @Override // com.google.protobuf.z1
                /* JADX INFO: renamed from: c */
                public c parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                    b bVarT = c.T();
                    try {
                        bVarT.mergeFrom(mVar, yVar);
                        return bVarT.buildPartial();
                    } catch (p0 e10) {
                        throw e10.j(bVarT.buildPartial());
                    } catch (r2 e11) {
                        throw e11.a().j(bVarT.buildPartial());
                    } catch (IOException e12) {
                        throw new p0(e12).j(bVarT.buildPartial());
                    }
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                    return super.parseDelimitedFrom(inputStream);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                    return super.parseFrom(lVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialDelimitedFrom */
                public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                    return super.mo1183parsePartialDelimitedFrom(inputStream);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                    return super.mo1185parsePartialFrom(lVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                    return super.parseDelimitedFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                    return super.parseFrom(lVar, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialDelimitedFrom */
                public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                    return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                    return super.mo1186parsePartialFrom(lVar, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                    return super.parseFrom(mVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                    return super.mo1187parsePartialFrom(mVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                    return super.parseFrom(mVar, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                    return super.parseFrom(inputStream);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                    return super.mo1188parsePartialFrom(inputStream);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                    return super.parseFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                    return super.mo1189parsePartialFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                    return super.parseFrom(byteBuffer);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                    return super.mo1190parsePartialFrom(bArr);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                    return super.parseFrom(byteBuffer, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                    return super.mo1191parsePartialFrom(bArr, i10, i11);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                    return super.parseFrom(bArr);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                    return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parseFrom */
                public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                    return super.mo1181parseFrom(bArr, i10, i11);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                    return super.mo1193parsePartialFrom(bArr, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parseFrom */
                public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                    return super.mo1182parseFrom(bArr, i10, i11, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                    return super.parseFrom(bArr, yVar);
                }
            }

            public static final class b extends k0.b implements o1 {

                /* JADX INFO: renamed from: a */
                private int f9883a;

                /* JADX INFO: renamed from: b */
                private o0.g f9884b;

                /* JADX INFO: renamed from: c */
                private o0.g f9885c;

                /* JADX INFO: renamed from: d */
                private Object f9886d;

                /* JADX INFO: renamed from: e */
                private Object f9887e;

                /* JADX INFO: renamed from: f */
                private u0 f9888f;

                /* synthetic */ b(a aVar) {
                    this();
                }

                private void j(c cVar) {
                    int i10;
                    int i11 = this.f9883a;
                    if ((i11 & 1) != 0) {
                        this.f9884b.r();
                        cVar.f9875b = this.f9884b;
                    }
                    if ((i11 & 2) != 0) {
                        this.f9885c.r();
                        cVar.f9877d = this.f9885c;
                    }
                    if ((i11 & 4) != 0) {
                        cVar.f9879f = this.f9886d;
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if ((i11 & 8) != 0) {
                        cVar.f9880g = this.f9887e;
                        i10 |= 2;
                    }
                    if ((i11 & 16) != 0) {
                        this.f9888f.r();
                        cVar.f9881h = this.f9888f;
                    }
                    c.z(cVar, i10);
                }

                private void n() {
                    if (!this.f9888f.p0()) {
                        this.f9888f = new u0(this.f9888f);
                    }
                    this.f9883a |= 16;
                }

                private void o() {
                    if (!this.f9884b.p0()) {
                        this.f9884b = (o0.g) k0.makeMutableCopy(this.f9884b);
                    }
                    this.f9883a |= 1;
                }

                private void p() {
                    if (!this.f9885c.p0()) {
                        this.f9885c = (o0.g) k0.makeMutableCopy(this.f9885c);
                    }
                    this.f9883a |= 2;
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: g */
                public b addRepeatedField(r.g gVar, Object obj) {
                    return (b) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                public r.b getDescriptorForType() {
                    return q.f9297g0;
                }

                @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
                /* JADX INFO: renamed from: h */
                public c build() {
                    c cVarBuildPartial = buildPartial();
                    if (cVarBuildPartial.isInitialized()) {
                        return cVarBuildPartial;
                    }
                    throw a.AbstractC0131a.newUninitializedMessageException((i1) cVarBuildPartial);
                }

                @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
                /* JADX INFO: renamed from: i */
                public c buildPartial() {
                    c cVar = new c(this);
                    if (this.f9883a != 0) {
                        j(cVar);
                    }
                    onBuilt();
                    return cVar;
                }

                @Override // com.google.protobuf.k0.b
                protected k0.f internalGetFieldAccessorTable() {
                    return q.f9299h0.d(c.class, b.class);
                }

                @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.k0.b
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public b m1140clearField(r.g gVar) {
                    return (b) super.m1140clearField(gVar);
                }

                /* JADX INFO: renamed from: m */
                public b clone() {
                    return (b) super.m1147clone();
                }

                @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                /* JADX INFO: renamed from: r */
                public c getDefaultInstanceForType() {
                    return c.A();
                }

                @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
                /* JADX INFO: renamed from: t */
                public b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                    yVar.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int iK = mVar.K();
                                if (iK != 0) {
                                    if (iK == 8) {
                                        int iY = mVar.y();
                                        o();
                                        this.f9884b.x(iY);
                                    } else if (iK == 10) {
                                        int iP = mVar.p(mVar.C());
                                        o();
                                        while (mVar.e() > 0) {
                                            this.f9884b.x(mVar.y());
                                        }
                                        mVar.o(iP);
                                    } else if (iK == 16) {
                                        int iY2 = mVar.y();
                                        p();
                                        this.f9885c.x(iY2);
                                    } else if (iK == 18) {
                                        int iP2 = mVar.p(mVar.C());
                                        p();
                                        while (mVar.e() > 0) {
                                            this.f9885c.x(mVar.y());
                                        }
                                        mVar.o(iP2);
                                    } else if (iK == 26) {
                                        this.f9886d = mVar.r();
                                        this.f9883a |= 4;
                                    } else if (iK == 34) {
                                        this.f9887e = mVar.r();
                                        this.f9883a |= 8;
                                    } else if (iK == 50) {
                                        com.google.protobuf.l lVarR = mVar.r();
                                        n();
                                        this.f9888f.w(lVarR);
                                    } else if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                }
                                z10 = true;
                            } catch (p0 e10) {
                                throw e10.n();
                            }
                        } catch (Throwable th2) {
                            onChanged();
                            throw th2;
                        }
                    }
                    onChanged();
                    return this;
                }

                public b u(c cVar) {
                    if (cVar == c.A()) {
                        return this;
                    }
                    if (!cVar.f9875b.isEmpty()) {
                        if (this.f9884b.isEmpty()) {
                            o0.g gVar = cVar.f9875b;
                            this.f9884b = gVar;
                            gVar.r();
                            this.f9883a |= 1;
                        } else {
                            o();
                            this.f9884b.addAll(cVar.f9875b);
                        }
                        onChanged();
                    }
                    if (!cVar.f9877d.isEmpty()) {
                        if (this.f9885c.isEmpty()) {
                            o0.g gVar2 = cVar.f9877d;
                            this.f9885c = gVar2;
                            gVar2.r();
                            this.f9883a |= 2;
                        } else {
                            p();
                            this.f9885c.addAll(cVar.f9877d);
                        }
                        onChanged();
                    }
                    if (cVar.R()) {
                        this.f9886d = cVar.f9879f;
                        this.f9883a |= 4;
                        onChanged();
                    }
                    if (cVar.S()) {
                        this.f9887e = cVar.f9880g;
                        this.f9883a |= 8;
                        onChanged();
                    }
                    if (!cVar.f9881h.isEmpty()) {
                        if (this.f9888f.isEmpty()) {
                            this.f9888f = cVar.f9881h;
                            this.f9883a |= 16;
                        } else {
                            n();
                            this.f9888f.addAll(cVar.f9881h);
                        }
                        onChanged();
                    }
                    m141mergeUnknownFields(cVar.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: v */
                public b mergeFrom(i1 i1Var) {
                    if (i1Var instanceof c) {
                        return u((c) i1Var);
                    }
                    super.mergeFrom(i1Var);
                    return this;
                }

                @Override // com.google.protobuf.a.AbstractC0131a
                /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
                public final b m1148mergeUnknownFields(t2 t2Var) {
                    return (b) super.m1148mergeUnknownFields(t2Var);
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: x */
                public b setField(r.g gVar, Object obj) {
                    return (b) super.setField(gVar, obj);
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: y */
                public final b setUnknownFields(t2 t2Var) {
                    return (b) super.setUnknownFields(t2Var);
                }

                /* synthetic */ b(k0.c cVar, a aVar) {
                    this(cVar);
                }

                private b() {
                    this.f9884b = k0.emptyIntList();
                    this.f9885c = k0.emptyIntList();
                    this.f9886d = "";
                    this.f9887e = "";
                    this.f9888f = u0.e();
                }

                private b(k0.c cVar) {
                    super(cVar);
                    this.f9884b = k0.emptyIntList();
                    this.f9885c = k0.emptyIntList();
                    this.f9886d = "";
                    this.f9887e = "";
                    this.f9888f = u0.e();
                }
            }

            /* synthetic */ c(k0.b bVar, a aVar) {
                this(bVar);
            }

            public static c A() {
                return f9872s;
            }

            public static b T() {
                return f9872s.toBuilder();
            }

            public static final r.b getDescriptor() {
                return q.f9297g0;
            }

            static /* synthetic */ int z(c cVar, int i10) {
                int i11 = i10 | cVar.f9874a;
                cVar.f9874a = i11;
                return i11;
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: C */
            public c getDefaultInstanceForType() {
                return f9872s;
            }

            public String D() {
                Object obj = this.f9879f;
                if (obj instanceof String) {
                    return (String) obj;
                }
                com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
                String strN = lVar.N();
                if (lVar.o()) {
                    this.f9879f = strN;
                }
                return strN;
            }

            public int G() {
                return this.f9881h.size();
            }

            public e2 H() {
                return this.f9881h;
            }

            public int K() {
                return this.f9875b.size();
            }

            public List L() {
                return this.f9875b;
            }

            public int N() {
                return this.f9877d.size();
            }

            public List O() {
                return this.f9877d;
            }

            public String Q() {
                Object obj = this.f9880g;
                if (obj instanceof String) {
                    return (String) obj;
                }
                com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
                String strN = lVar.N();
                if (lVar.o()) {
                    this.f9880g = strN;
                }
                return strN;
            }

            public boolean R() {
                return (this.f9874a & 1) != 0;
            }

            public boolean S() {
                return (this.f9874a & 2) != 0;
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            /* JADX INFO: renamed from: W */
            public b newBuilderForType() {
                return T();
            }

            @Override // com.google.protobuf.k0
            /* JADX INFO: renamed from: X */
            public b newBuilderForType(k0.c cVar) {
                return new b(cVar);
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            /* JADX INFO: renamed from: Y */
            public b toBuilder() {
                return this == f9872s ? new b() : new b().u(this);
            }

            @Override // com.google.protobuf.a
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return super.equals(obj);
                }
                c cVar = (c) obj;
                if (!L().equals(cVar.L()) || !O().equals(cVar.O()) || R() != cVar.R()) {
                    return false;
                }
                if ((!R() || D().equals(cVar.D())) && S() == cVar.S()) {
                    return (!S() || Q().equals(cVar.Q())) && H().equals(cVar.H()) && getUnknownFields().equals(cVar.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            public z1 getParserForType() {
                return f9873t;
            }

            @Override // com.google.protobuf.l1
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iY = 0;
                for (int i11 = 0; i11 < this.f9875b.size(); i11++) {
                    iY += com.google.protobuf.o.y(this.f9875b.getInt(i11));
                }
                int iY2 = !L().isEmpty() ? iY + 1 + com.google.protobuf.o.y(iY) : iY;
                this.f9876c = iY;
                int iY3 = 0;
                for (int i12 = 0; i12 < this.f9877d.size(); i12++) {
                    iY3 += com.google.protobuf.o.y(this.f9877d.getInt(i12));
                }
                int iComputeStringSize = iY2 + iY3;
                if (!O().isEmpty()) {
                    iComputeStringSize = iComputeStringSize + 1 + com.google.protobuf.o.y(iY3);
                }
                this.f9878e = iY3;
                if ((this.f9874a & 1) != 0) {
                    iComputeStringSize += k0.computeStringSize(3, this.f9879f);
                }
                if ((this.f9874a & 2) != 0) {
                    iComputeStringSize += k0.computeStringSize(4, this.f9880g);
                }
                int iComputeStringSizeNoTag = 0;
                for (int i13 = 0; i13 < this.f9881h.size(); i13++) {
                    iComputeStringSizeNoTag += k0.computeStringSizeNoTag(this.f9881h.h0(i13));
                }
                int size = iComputeStringSize + iComputeStringSizeNoTag + H().size() + getUnknownFields().getSerializedSize();
                this.memoizedSize = size;
                return size;
            }

            @Override // com.google.protobuf.a
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (K() > 0) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + L().hashCode();
                }
                if (N() > 0) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + O().hashCode();
                }
                if (R()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + D().hashCode();
                }
                if (S()) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + Q().hashCode();
                }
                if (G() > 0) {
                    iHashCode = (((iHashCode * 37) + 6) * 53) + H().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.k0
            protected k0.f internalGetFieldAccessorTable() {
                return q.f9299h0.d(c.class, b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9882r;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9882r = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.k0
            protected Object newInstance(k0.g gVar) {
                return new c();
            }

            @Override // com.google.protobuf.l1
            public void writeTo(com.google.protobuf.o oVar) throws IOException {
                getSerializedSize();
                if (L().size() > 0) {
                    oVar.T0(10);
                    oVar.T0(this.f9876c);
                }
                for (int i10 = 0; i10 < this.f9875b.size(); i10++) {
                    oVar.E0(this.f9875b.getInt(i10));
                }
                if (O().size() > 0) {
                    oVar.T0(18);
                    oVar.T0(this.f9878e);
                }
                for (int i11 = 0; i11 < this.f9877d.size(); i11++) {
                    oVar.E0(this.f9877d.getInt(i11));
                }
                if ((this.f9874a & 1) != 0) {
                    k0.writeString(oVar, 3, this.f9879f);
                }
                if ((this.f9874a & 2) != 0) {
                    k0.writeString(oVar, 4, this.f9880g);
                }
                for (int i12 = 0; i12 < this.f9881h.size(); i12++) {
                    k0.writeString(oVar, 6, this.f9881h.h0(i12));
                }
                getUnknownFields().writeTo(oVar);
            }

            private c(k0.b bVar) {
                super(bVar);
                this.f9875b = k0.emptyIntList();
                this.f9876c = -1;
                this.f9877d = k0.emptyIntList();
                this.f9878e = -1;
                this.f9879f = "";
                this.f9880g = "";
                this.f9881h = u0.e();
                this.f9882r = (byte) -1;
            }

            private c() {
                this.f9875b = k0.emptyIntList();
                this.f9876c = -1;
                this.f9877d = k0.emptyIntList();
                this.f9878e = -1;
                this.f9879f = "";
                this.f9880g = "";
                this.f9881h = u0.e();
                this.f9882r = (byte) -1;
                this.f9875b = k0.emptyIntList();
                this.f9877d = k0.emptyIntList();
                this.f9879f = "";
                this.f9880g = "";
                this.f9881h = u0.e();
            }
        }

        /* synthetic */ u(k0.b bVar, a aVar) {
            this(bVar);
        }

        public static final r.b getDescriptor() {
            return q.f9293e0;
        }

        public static u p() {
            return f9865c;
        }

        public static b t() {
            return f9865c.toBuilder();
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof u)) {
                return super.equals(obj);
            }
            u uVar = (u) obj;
            return s().equals(uVar.s()) && getUnknownFields().equals(uVar.getUnknownFields());
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return f9866d;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = 0;
            for (int i11 = 0; i11 < this.f9867a.size(); i11++) {
                iG += com.google.protobuf.o.G(1, (l1) this.f9867a.get(i11));
            }
            int serializedSize = iG + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (r() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + s().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return q.f9295f0.d(u.class, b.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9868b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9868b = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new u();
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: q */
        public u getDefaultInstanceForType() {
            return f9865c;
        }

        public int r() {
            return this.f9867a.size();
        }

        public List s() {
            return this.f9867a;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: v */
        public b newBuilderForType() {
            return t();
        }

        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: w */
        public b newBuilderForType(k0.c cVar) {
            return new b(cVar);
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) {
            for (int i10 = 0; i10 < this.f9867a.size(); i10++) {
                oVar.H0(1, (l1) this.f9867a.get(i10));
            }
            getUnknownFields().writeTo(oVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: x */
        public b toBuilder() {
            return this == f9865c ? new b() : new b().u(this);
        }

        private u(k0.b bVar) {
            super(bVar);
            this.f9868b = (byte) -1;
        }

        private u() {
            this.f9868b = (byte) -1;
            this.f9867a = Collections.EMPTY_LIST;
        }
    }

    public static final class v extends k0 implements o1 {

        /* JADX INFO: renamed from: s */
        private static final v f9889s = new v();

        /* JADX INFO: renamed from: t */
        public static final z1 f9890t = new a();

        /* JADX INFO: renamed from: a */
        private int f9891a;

        /* JADX INFO: renamed from: b */
        private List f9892b;

        /* JADX INFO: renamed from: c */
        private volatile Object f9893c;

        /* JADX INFO: renamed from: d */
        private long f9894d;

        /* JADX INFO: renamed from: e */
        private long f9895e;

        /* JADX INFO: renamed from: f */
        private double f9896f;

        /* JADX INFO: renamed from: g */
        private com.google.protobuf.l f9897g;

        /* JADX INFO: renamed from: h */
        private volatile Object f9898h;

        /* JADX INFO: renamed from: r */
        private byte f9899r;

        class a extends com.google.protobuf.c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c */
            public v parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                b bVarA0 = v.a0();
                try {
                    bVarA0.mergeFrom(mVar, yVar);
                    return bVarA0.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(bVarA0.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(bVarA0.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(bVarA0.buildPartial());
                }
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                return super.parseDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                return super.parseFrom(lVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                return super.mo1183parsePartialDelimitedFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                return super.mo1185parsePartialFrom(lVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                return super.parseDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                return super.parseFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialDelimitedFrom */
            public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                return super.mo1186parsePartialFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                return super.parseFrom(mVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                return super.mo1187parsePartialFrom(mVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                return super.parseFrom(mVar, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                return super.parseFrom(inputStream);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                return super.mo1188parsePartialFrom(inputStream);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                return super.parseFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                return super.mo1189parsePartialFrom(inputStream, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                return super.parseFrom(byteBuffer);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                return super.mo1190parsePartialFrom(bArr);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                return super.parseFrom(byteBuffer, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                return super.mo1191parsePartialFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                return super.parseFrom(bArr);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                return super.mo1181parseFrom(bArr, i10, i11);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parsePartialFrom */
            public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                return super.mo1193parsePartialFrom(bArr, yVar);
            }

            @Override // com.google.protobuf.c
            /* JADX INFO: renamed from: parseFrom */
            public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                return super.mo1182parseFrom(bArr, i10, i11, yVar);
            }

            @Override // com.google.protobuf.c, com.google.protobuf.z1
            public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                return super.parseFrom(bArr, yVar);
            }
        }

        public static final class b extends k0.b implements o1 {

            /* JADX INFO: renamed from: a */
            private int f9900a;

            /* JADX INFO: renamed from: b */
            private List f9901b;

            /* JADX INFO: renamed from: c */
            private g2 f9902c;

            /* JADX INFO: renamed from: d */
            private Object f9903d;

            /* JADX INFO: renamed from: e */
            private long f9904e;

            /* JADX INFO: renamed from: f */
            private long f9905f;

            /* JADX INFO: renamed from: g */
            private double f9906g;

            /* JADX INFO: renamed from: h */
            private com.google.protobuf.l f9907h;

            /* JADX INFO: renamed from: r */
            private Object f9908r;

            /* synthetic */ b(a aVar) {
                this();
            }

            private void j(v vVar) {
                int i10;
                int i11 = this.f9900a;
                if ((i11 & 2) != 0) {
                    vVar.f9893c = this.f9903d;
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 4) != 0) {
                    vVar.f9894d = this.f9904e;
                    i10 |= 2;
                }
                if ((i11 & 8) != 0) {
                    vVar.f9895e = this.f9905f;
                    i10 |= 4;
                }
                if ((i11 & 16) != 0) {
                    vVar.f9896f = this.f9906g;
                    i10 |= 8;
                }
                if ((i11 & 32) != 0) {
                    vVar.f9897g = this.f9907h;
                    i10 |= 16;
                }
                if ((i11 & 64) != 0) {
                    vVar.f9898h = this.f9908r;
                    i10 |= 32;
                }
                v.z(vVar, i10);
            }

            private void k(v vVar) {
                g2 g2Var = this.f9902c;
                if (g2Var != null) {
                    vVar.f9892b = g2Var.g();
                    return;
                }
                if ((this.f9900a & 1) != 0) {
                    this.f9901b = DesugarCollections.unmodifiableList(this.f9901b);
                    this.f9900a &= -2;
                }
                vVar.f9892b = this.f9901b;
            }

            private void o() {
                if ((this.f9900a & 1) == 0) {
                    this.f9901b = new ArrayList(this.f9901b);
                    this.f9900a |= 1;
                }
            }

            private g2 u() {
                if (this.f9902c == null) {
                    this.f9902c = new g2(this.f9901b, (this.f9900a & 1) != 0, getParentForChildren(), isClean());
                    this.f9901b = null;
                }
                return this.f9902c;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: A */
            public b setField(r.g gVar, Object obj) {
                return (b) super.setField(gVar, obj);
            }

            public b B(long j10) {
                this.f9905f = j10;
                this.f9900a |= 8;
                onChanged();
                return this;
            }

            public b C(long j10) {
                this.f9904e = j10;
                this.f9900a |= 4;
                onChanged();
                return this;
            }

            public b D(com.google.protobuf.l lVar) {
                lVar.getClass();
                this.f9907h = lVar;
                this.f9900a |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: E */
            public final b setUnknownFields(t2 t2Var) {
                return (b) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: g */
            public b addRepeatedField(r.g gVar, Object obj) {
                return (b) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return q.U;
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: h */
            public v build() {
                v vVarBuildPartial = buildPartial();
                if (vVarBuildPartial.isInitialized()) {
                    return vVarBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) vVarBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: i */
            public v buildPartial() {
                v vVar = new v(this);
                k(vVar);
                if (this.f9900a != 0) {
                    j(vVar);
                }
                onBuilt();
                return vVar;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return q.V.d(v.class, b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < t(); i10++) {
                    if (!r(i10).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public b m1140clearField(r.g gVar) {
                return (b) super.m1140clearField(gVar);
            }

            /* JADX INFO: renamed from: n */
            public b clone() {
                return (b) super.m1147clone();
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: p */
            public v getDefaultInstanceForType() {
                return v.C();
            }

            public c r(int i10) {
                g2 g2Var = this.f9902c;
                return g2Var == null ? (c) this.f9901b.get(i10) : (c) g2Var.o(i10);
            }

            public int t() {
                g2 g2Var = this.f9902c;
                return g2Var == null ? this.f9901b.size() : g2Var.n();
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: v */
            public b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 18) {
                                    c cVar = (c) mVar.A(c.f9910f, yVar);
                                    g2 g2Var = this.f9902c;
                                    if (g2Var == null) {
                                        o();
                                        this.f9901b.add(cVar);
                                    } else {
                                        g2Var.f(cVar);
                                    }
                                } else if (iK == 26) {
                                    this.f9903d = mVar.r();
                                    this.f9900a |= 2;
                                } else if (iK == 32) {
                                    this.f9904e = mVar.M();
                                    this.f9900a |= 4;
                                } else if (iK == 40) {
                                    this.f9905f = mVar.z();
                                    this.f9900a |= 8;
                                } else if (iK == 49) {
                                    this.f9906g = mVar.s();
                                    this.f9900a |= 16;
                                } else if (iK == 58) {
                                    this.f9907h = mVar.r();
                                    this.f9900a |= 32;
                                } else if (iK == 66) {
                                    this.f9908r = mVar.r();
                                    this.f9900a |= 64;
                                } else if (!super.parseUnknownField(mVar, yVar, iK)) {
                                }
                            }
                            z10 = true;
                        } catch (p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }

            public b w(v vVar) {
                if (vVar == v.C()) {
                    return this;
                }
                if (this.f9902c == null) {
                    if (!vVar.f9892b.isEmpty()) {
                        if (this.f9901b.isEmpty()) {
                            this.f9901b = vVar.f9892b;
                            this.f9900a &= -2;
                        } else {
                            o();
                            this.f9901b.addAll(vVar.f9892b);
                        }
                        onChanged();
                    }
                } else if (!vVar.f9892b.isEmpty()) {
                    if (this.f9902c.u()) {
                        this.f9902c.i();
                        this.f9902c = null;
                        this.f9901b = vVar.f9892b;
                        this.f9900a &= -2;
                        this.f9902c = k0.alwaysUseFieldBuilders ? u() : null;
                    } else {
                        this.f9902c.b(vVar.f9892b);
                    }
                }
                if (vVar.W()) {
                    this.f9903d = vVar.f9893c;
                    this.f9900a |= 2;
                    onChanged();
                }
                if (vVar.Y()) {
                    C(vVar.Q());
                }
                if (vVar.X()) {
                    B(vVar.O());
                }
                if (vVar.T()) {
                    z(vVar.G());
                }
                if (vVar.Z()) {
                    D(vVar.R());
                }
                if (vVar.S()) {
                    this.f9908r = vVar.f9898h;
                    this.f9900a |= 64;
                    onChanged();
                }
                m141mergeUnknownFields(vVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: x */
            public b mergeFrom(i1 i1Var) {
                if (i1Var instanceof v) {
                    return w((v) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public final b m1148mergeUnknownFields(t2 t2Var) {
                return (b) super.m1148mergeUnknownFields(t2Var);
            }

            public b z(double d10) {
                this.f9906g = d10;
                this.f9900a |= 16;
                onChanged();
                return this;
            }

            /* synthetic */ b(k0.c cVar, a aVar) {
                this(cVar);
            }

            private b() {
                this.f9901b = Collections.EMPTY_LIST;
                this.f9903d = "";
                this.f9907h = com.google.protobuf.l.f9119b;
                this.f9908r = "";
            }

            private b(k0.c cVar) {
                super(cVar);
                this.f9901b = Collections.EMPTY_LIST;
                this.f9903d = "";
                this.f9907h = com.google.protobuf.l.f9119b;
                this.f9908r = "";
            }
        }

        public static final class c extends k0 implements o1 {

            /* JADX INFO: renamed from: e */
            private static final c f9909e = new c();

            /* JADX INFO: renamed from: f */
            public static final z1 f9910f = new a();

            /* JADX INFO: renamed from: a */
            private int f9911a;

            /* JADX INFO: renamed from: b */
            private volatile Object f9912b;

            /* JADX INFO: renamed from: c */
            private boolean f9913c;

            /* JADX INFO: renamed from: d */
            private byte f9914d;

            class a extends com.google.protobuf.c {
                a() {
                }

                @Override // com.google.protobuf.z1
                /* JADX INFO: renamed from: c */
                public c parsePartialFrom(com.google.protobuf.m mVar, y yVar) throws p0 {
                    b bVarZ = c.z();
                    try {
                        bVarZ.mergeFrom(mVar, yVar);
                        return bVarZ.buildPartial();
                    } catch (p0 e10) {
                        throw e10.j(bVarZ.buildPartial());
                    } catch (r2 e11) {
                        throw e11.a().j(bVarZ.buildPartial());
                    } catch (IOException e12) {
                        throw new p0(e12).j(bVarZ.buildPartial());
                    }
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
                    return super.parseDelimitedFrom(inputStream);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar) {
                    return super.parseFrom(lVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialDelimitedFrom */
                public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
                    return super.mo1183parsePartialDelimitedFrom(inputStream);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(com.google.protobuf.l lVar) {
                    return super.mo1185parsePartialFrom(lVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
                    return super.parseDelimitedFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.l lVar, y yVar) {
                    return super.parseFrom(lVar, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialDelimitedFrom */
                public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
                    return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(com.google.protobuf.l lVar, y yVar) {
                    return super.mo1186parsePartialFrom(lVar, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar) {
                    return super.parseFrom(mVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(com.google.protobuf.m mVar) {
                    return super.mo1187parsePartialFrom(mVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(com.google.protobuf.m mVar, y yVar) {
                    return super.parseFrom(mVar, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
                    return super.parseFrom(inputStream);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1188parsePartialFrom(InputStream inputStream) {
                    return super.mo1188parsePartialFrom(inputStream);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, y yVar) {
                    return super.parseFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1189parsePartialFrom(InputStream inputStream, y yVar) {
                    return super.mo1189parsePartialFrom(inputStream, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
                    return super.parseFrom(byteBuffer);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1190parsePartialFrom(byte[] bArr) {
                    return super.mo1190parsePartialFrom(bArr);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, y yVar) {
                    return super.parseFrom(byteBuffer, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1191parsePartialFrom(byte[] bArr, int i10, int i11) {
                    return super.mo1191parsePartialFrom(bArr, i10, i11);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
                    return super.parseFrom(bArr);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) {
                    return super.mo1192parsePartialFrom(bArr, i10, i11, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parseFrom */
                public /* bridge */ /* synthetic */ Object mo1181parseFrom(byte[] bArr, int i10, int i11) {
                    return super.mo1181parseFrom(bArr, i10, i11);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parsePartialFrom */
                public /* bridge */ /* synthetic */ Object mo1193parsePartialFrom(byte[] bArr, y yVar) {
                    return super.mo1193parsePartialFrom(bArr, yVar);
                }

                @Override // com.google.protobuf.c
                /* JADX INFO: renamed from: parseFrom */
                public /* bridge */ /* synthetic */ Object mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) {
                    return super.mo1182parseFrom(bArr, i10, i11, yVar);
                }

                @Override // com.google.protobuf.c, com.google.protobuf.z1
                public /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, y yVar) {
                    return super.parseFrom(bArr, yVar);
                }
            }

            public static final class b extends k0.b implements o1 {

                /* JADX INFO: renamed from: a */
                private int f9915a;

                /* JADX INFO: renamed from: b */
                private Object f9916b;

                /* JADX INFO: renamed from: c */
                private boolean f9917c;

                /* synthetic */ b(a aVar) {
                    this();
                }

                private void j(c cVar) {
                    int i10;
                    int i11 = this.f9915a;
                    if ((i11 & 1) != 0) {
                        cVar.f9912b = this.f9916b;
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if ((i11 & 2) != 0) {
                        cVar.f9913c = this.f9917c;
                        i10 |= 2;
                    }
                    c.q(cVar, i10);
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: g */
                public b addRepeatedField(r.g gVar, Object obj) {
                    return (b) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                public r.b getDescriptorForType() {
                    return q.W;
                }

                @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
                /* JADX INFO: renamed from: h */
                public c build() {
                    c cVarBuildPartial = buildPartial();
                    if (cVarBuildPartial.isInitialized()) {
                        return cVarBuildPartial;
                    }
                    throw a.AbstractC0131a.newUninitializedMessageException((i1) cVarBuildPartial);
                }

                @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
                /* JADX INFO: renamed from: i */
                public c buildPartial() {
                    c cVar = new c(this);
                    if (this.f9915a != 0) {
                        j(cVar);
                    }
                    onBuilt();
                    return cVar;
                }

                @Override // com.google.protobuf.k0.b
                protected k0.f internalGetFieldAccessorTable() {
                    return q.X.d(c.class, b.class);
                }

                @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                public final boolean isInitialized() {
                    return p() && o();
                }

                @Override // com.google.protobuf.k0.b
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public b m1140clearField(r.g gVar) {
                    return (b) super.m1140clearField(gVar);
                }

                /* JADX INFO: renamed from: m */
                public b clone() {
                    return (b) super.m1147clone();
                }

                @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                /* JADX INFO: renamed from: n */
                public c getDefaultInstanceForType() {
                    return c.r();
                }

                public boolean o() {
                    return (this.f9915a & 2) != 0;
                }

                public boolean p() {
                    return (this.f9915a & 1) != 0;
                }

                @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
                /* JADX INFO: renamed from: r */
                public b mergeFrom(com.google.protobuf.m mVar, y yVar) {
                    yVar.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int iK = mVar.K();
                                if (iK != 0) {
                                    if (iK == 10) {
                                        this.f9916b = mVar.r();
                                        this.f9915a |= 1;
                                    } else if (iK == 16) {
                                        this.f9917c = mVar.q();
                                        this.f9915a |= 2;
                                    } else if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                }
                                z10 = true;
                            } catch (p0 e10) {
                                throw e10.n();
                            }
                        } catch (Throwable th2) {
                            onChanged();
                            throw th2;
                        }
                    }
                    onChanged();
                    return this;
                }

                public b t(c cVar) {
                    if (cVar == c.r()) {
                        return this;
                    }
                    if (cVar.x()) {
                        this.f9916b = cVar.f9912b;
                        this.f9915a |= 1;
                        onChanged();
                    }
                    if (cVar.w()) {
                        x(cVar.t());
                    }
                    m141mergeUnknownFields(cVar.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: u */
                public b mergeFrom(i1 i1Var) {
                    if (i1Var instanceof c) {
                        return t((c) i1Var);
                    }
                    super.mergeFrom(i1Var);
                    return this;
                }

                @Override // com.google.protobuf.a.AbstractC0131a
                /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
                public final b m1148mergeUnknownFields(t2 t2Var) {
                    return (b) super.m1148mergeUnknownFields(t2Var);
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: w */
                public b setField(r.g gVar, Object obj) {
                    return (b) super.setField(gVar, obj);
                }

                public b x(boolean z10) {
                    this.f9917c = z10;
                    this.f9915a |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.i1.a
                /* JADX INFO: renamed from: y */
                public final b setUnknownFields(t2 t2Var) {
                    return (b) super.setUnknownFields(t2Var);
                }

                /* synthetic */ b(k0.c cVar, a aVar) {
                    this(cVar);
                }

                private b() {
                    this.f9916b = "";
                }

                private b(k0.c cVar) {
                    super(cVar);
                    this.f9916b = "";
                }
            }

            /* synthetic */ c(k0.b bVar, a aVar) {
                this(bVar);
            }

            public static final r.b getDescriptor() {
                return q.W;
            }

            static /* synthetic */ int q(c cVar, int i10) {
                int i11 = i10 | cVar.f9911a;
                cVar.f9911a = i11;
                return i11;
            }

            public static c r() {
                return f9909e;
            }

            public static b z() {
                return f9909e.toBuilder();
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            /* JADX INFO: renamed from: A */
            public b newBuilderForType() {
                return z();
            }

            @Override // com.google.protobuf.k0
            /* JADX INFO: renamed from: C */
            public b newBuilderForType(k0.c cVar) {
                return new b(cVar);
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            /* JADX INFO: renamed from: D */
            public b toBuilder() {
                return this == f9909e ? new b() : new b().t(this);
            }

            @Override // com.google.protobuf.a
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return super.equals(obj);
                }
                c cVar = (c) obj;
                if (x() != cVar.x()) {
                    return false;
                }
                if ((!x() || v().equals(cVar.v())) && w() == cVar.w()) {
                    return (!w() || t() == cVar.t()) && getUnknownFields().equals(cVar.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            public z1 getParserForType() {
                return f9910f;
            }

            @Override // com.google.protobuf.l1
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = (this.f9911a & 1) != 0 ? k0.computeStringSize(1, this.f9912b) : 0;
                if ((this.f9911a & 2) != 0) {
                    iComputeStringSize += com.google.protobuf.o.e(2, this.f9913c);
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.a
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (x()) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + v().hashCode();
                }
                if (w()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + o0.d(t());
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.k0
            protected k0.f internalGetFieldAccessorTable() {
                return q.X.d(c.class, b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9914d;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (!x()) {
                    this.f9914d = (byte) 0;
                    return false;
                }
                if (w()) {
                    this.f9914d = (byte) 1;
                    return true;
                }
                this.f9914d = (byte) 0;
                return false;
            }

            @Override // com.google.protobuf.k0
            protected Object newInstance(k0.g gVar) {
                return new c();
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: s */
            public c getDefaultInstanceForType() {
                return f9909e;
            }

            public boolean t() {
                return this.f9913c;
            }

            public String v() {
                Object obj = this.f9912b;
                if (obj instanceof String) {
                    return (String) obj;
                }
                com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
                String strN = lVar.N();
                if (lVar.o()) {
                    this.f9912b = strN;
                }
                return strN;
            }

            public boolean w() {
                return (this.f9911a & 2) != 0;
            }

            @Override // com.google.protobuf.l1
            public void writeTo(com.google.protobuf.o oVar) throws IOException {
                if ((this.f9911a & 1) != 0) {
                    k0.writeString(oVar, 1, this.f9912b);
                }
                if ((this.f9911a & 2) != 0) {
                    oVar.m0(2, this.f9913c);
                }
                getUnknownFields().writeTo(oVar);
            }

            public boolean x() {
                return (this.f9911a & 1) != 0;
            }

            private c(k0.b bVar) {
                super(bVar);
                this.f9912b = "";
                this.f9913c = false;
                this.f9914d = (byte) -1;
            }

            private c() {
                this.f9912b = "";
                this.f9913c = false;
                this.f9914d = (byte) -1;
                this.f9912b = "";
            }
        }

        /* synthetic */ v(k0.b bVar, a aVar) {
            this(bVar);
        }

        public static v C() {
            return f9889s;
        }

        public static b a0() {
            return f9889s.toBuilder();
        }

        public static final r.b getDescriptor() {
            return q.U;
        }

        static /* synthetic */ int z(v vVar, int i10) {
            int i11 = i10 | vVar.f9891a;
            vVar.f9891a = i11;
            return i11;
        }

        public String A() {
            Object obj = this.f9898h;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f9898h = strN;
            }
            return strN;
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: D */
        public v getDefaultInstanceForType() {
            return f9889s;
        }

        public double G() {
            return this.f9896f;
        }

        public String H() {
            Object obj = this.f9893c;
            if (obj instanceof String) {
                return (String) obj;
            }
            com.google.protobuf.l lVar = (com.google.protobuf.l) obj;
            String strN = lVar.N();
            if (lVar.o()) {
                this.f9893c = strN;
            }
            return strN;
        }

        public c K(int i10) {
            return (c) this.f9892b.get(i10);
        }

        public int L() {
            return this.f9892b.size();
        }

        public List N() {
            return this.f9892b;
        }

        public long O() {
            return this.f9895e;
        }

        public long Q() {
            return this.f9894d;
        }

        public com.google.protobuf.l R() {
            return this.f9897g;
        }

        public boolean S() {
            return (this.f9891a & 32) != 0;
        }

        public boolean T() {
            return (this.f9891a & 8) != 0;
        }

        public boolean W() {
            return (this.f9891a & 1) != 0;
        }

        public boolean X() {
            return (this.f9891a & 4) != 0;
        }

        public boolean Y() {
            return (this.f9891a & 2) != 0;
        }

        public boolean Z() {
            return (this.f9891a & 16) != 0;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: b0 */
        public b newBuilderForType() {
            return a0();
        }

        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: c0 */
        public b newBuilderForType(k0.c cVar) {
            return new b(cVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: d0 */
        public b toBuilder() {
            return this == f9889s ? new b() : new b().w(this);
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof v)) {
                return super.equals(obj);
            }
            v vVar = (v) obj;
            if (!N().equals(vVar.N()) || W() != vVar.W()) {
                return false;
            }
            if ((W() && !H().equals(vVar.H())) || Y() != vVar.Y()) {
                return false;
            }
            if ((Y() && Q() != vVar.Q()) || X() != vVar.X()) {
                return false;
            }
            if ((X() && O() != vVar.O()) || T() != vVar.T()) {
                return false;
            }
            if ((T() && Double.doubleToLongBits(G()) != Double.doubleToLongBits(vVar.G())) || Z() != vVar.Z()) {
                return false;
            }
            if ((!Z() || R().equals(vVar.R())) && S() == vVar.S()) {
                return (!S() || A().equals(vVar.A())) && getUnknownFields().equals(vVar.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return f9890t;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = 0;
            for (int i11 = 0; i11 < this.f9892b.size(); i11++) {
                iComputeStringSize += com.google.protobuf.o.G(2, (l1) this.f9892b.get(i11));
            }
            if ((this.f9891a & 1) != 0) {
                iComputeStringSize += k0.computeStringSize(3, this.f9893c);
            }
            if ((this.f9891a & 2) != 0) {
                iComputeStringSize += com.google.protobuf.o.Z(4, this.f9894d);
            }
            if ((this.f9891a & 4) != 0) {
                iComputeStringSize += com.google.protobuf.o.z(5, this.f9895e);
            }
            if ((this.f9891a & 8) != 0) {
                iComputeStringSize += com.google.protobuf.o.j(6, this.f9896f);
            }
            if ((this.f9891a & 16) != 0) {
                iComputeStringSize += com.google.protobuf.o.h(7, this.f9897g);
            }
            if ((this.f9891a & 32) != 0) {
                iComputeStringSize += k0.computeStringSize(8, this.f9898h);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (L() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + N().hashCode();
            }
            if (W()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + H().hashCode();
            }
            if (Y()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + o0.i(Q());
            }
            if (X()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + o0.i(O());
            }
            if (T()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + o0.i(Double.doubleToLongBits(G()));
            }
            if (Z()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + R().hashCode();
            }
            if (S()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + A().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return q.V.d(v.class, b.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9899r;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < L(); i10++) {
                if (!K(i10).isInitialized()) {
                    this.f9899r = (byte) 0;
                    return false;
                }
            }
            this.f9899r = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new v();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            for (int i10 = 0; i10 < this.f9892b.size(); i10++) {
                oVar.H0(2, (l1) this.f9892b.get(i10));
            }
            if ((this.f9891a & 1) != 0) {
                k0.writeString(oVar, 3, this.f9893c);
            }
            if ((this.f9891a & 2) != 0) {
                oVar.U0(4, this.f9894d);
            }
            if ((this.f9891a & 4) != 0) {
                oVar.F0(5, this.f9895e);
            }
            if ((this.f9891a & 8) != 0) {
                oVar.s0(6, this.f9896f);
            }
            if ((this.f9891a & 16) != 0) {
                oVar.q0(7, this.f9897g);
            }
            if ((this.f9891a & 32) != 0) {
                k0.writeString(oVar, 8, this.f9898h);
            }
            getUnknownFields().writeTo(oVar);
        }

        private v(k0.b bVar) {
            super(bVar);
            this.f9893c = "";
            this.f9894d = 0L;
            this.f9895e = 0L;
            this.f9896f = 0.0d;
            this.f9897g = com.google.protobuf.l.f9119b;
            this.f9898h = "";
            this.f9899r = (byte) -1;
        }

        private v() {
            this.f9893c = "";
            this.f9894d = 0L;
            this.f9895e = 0L;
            this.f9896f = 0.0d;
            com.google.protobuf.l lVar = com.google.protobuf.l.f9119b;
            this.f9897g = lVar;
            this.f9898h = "";
            this.f9899r = (byte) -1;
            this.f9892b = Collections.EMPTY_LIST;
            this.f9893c = "";
            this.f9897g = lVar;
            this.f9898h = "";
        }
    }

    static {
        r.b bVar = (r.b) c0().l().get(0);
        f9284a = bVar;
        f9286b = new k0.f(bVar, new String[]{"File"});
        r.b bVar2 = (r.b) c0().l().get(1);
        f9288c = bVar2;
        f9290d = new k0.f(bVar2, new String[]{"Name", "Package", "Dependency", "PublicDependency", "WeakDependency", "MessageType", "EnumType", "Service", "Extension", "Options", "SourceCodeInfo", "Syntax", "Edition"});
        r.b bVar3 = (r.b) c0().l().get(2);
        f9292e = bVar3;
        f9294f = new k0.f(bVar3, new String[]{"Name", "Field", "Extension", "NestedType", "EnumType", "ExtensionRange", "OneofDecl", "Options", "ReservedRange", "ReservedName"});
        r.b bVar4 = (r.b) bVar3.m().get(0);
        f9296g = bVar4;
        f9298h = new k0.f(bVar4, new String[]{"Start", "End", "Options"});
        r.b bVar5 = (r.b) bVar3.m().get(1);
        f9300i = bVar5;
        f9302j = new k0.f(bVar5, new String[]{"Start", "End"});
        r.b bVar6 = (r.b) c0().l().get(3);
        f9304k = bVar6;
        f9306l = new k0.f(bVar6, new String[]{"UninterpretedOption", "Declaration", "Features", "Verification"});
        r.b bVar7 = (r.b) bVar6.m().get(0);
        f9308m = bVar7;
        f9310n = new k0.f(bVar7, new String[]{"Number", "FullName", "Type", "Reserved", "Repeated"});
        r.b bVar8 = (r.b) c0().l().get(4);
        f9311o = bVar8;
        f9312p = new k0.f(bVar8, new String[]{"Name", "Number", "Label", "Type", "TypeName", "Extendee", "DefaultValue", "OneofIndex", "JsonName", "Options", "Proto3Optional"});
        r.b bVar9 = (r.b) c0().l().get(5);
        f9313q = bVar9;
        f9314r = new k0.f(bVar9, new String[]{"Name", "Options"});
        r.b bVar10 = (r.b) c0().l().get(6);
        f9315s = bVar10;
        f9316t = new k0.f(bVar10, new String[]{"Name", "Value", "Options", "ReservedRange", "ReservedName"});
        r.b bVar11 = (r.b) bVar10.m().get(0);
        f9317u = bVar11;
        f9318v = new k0.f(bVar11, new String[]{"Start", "End"});
        r.b bVar12 = (r.b) c0().l().get(7);
        f9319w = bVar12;
        f9320x = new k0.f(bVar12, new String[]{"Name", "Number", "Options"});
        r.b bVar13 = (r.b) c0().l().get(8);
        f9321y = bVar13;
        f9322z = new k0.f(bVar13, new String[]{"Name", "Method", "Options"});
        r.b bVar14 = (r.b) c0().l().get(9);
        A = bVar14;
        B = new k0.f(bVar14, new String[]{"Name", "InputType", "OutputType", "Options", "ClientStreaming", "ServerStreaming"});
        r.b bVar15 = (r.b) c0().l().get(10);
        C = bVar15;
        D = new k0.f(bVar15, new String[]{"JavaPackage", "JavaOuterClassname", "JavaMultipleFiles", "JavaGenerateEqualsAndHash", "JavaStringCheckUtf8", "OptimizeFor", "GoPackage", "CcGenericServices", "JavaGenericServices", "PyGenericServices", "PhpGenericServices", "Deprecated", "CcEnableArenas", "ObjcClassPrefix", "CsharpNamespace", "SwiftPrefix", "PhpClassPrefix", "PhpNamespace", "PhpMetadataNamespace", "RubyPackage", "Features", "UninterpretedOption"});
        r.b bVar16 = (r.b) c0().l().get(11);
        E = bVar16;
        F = new k0.f(bVar16, new String[]{"MessageSetWireFormat", "NoStandardDescriptorAccessor", "Deprecated", "MapEntry", "DeprecatedLegacyJsonFieldConflicts", "Features", "UninterpretedOption"});
        r.b bVar17 = (r.b) c0().l().get(12);
        G = bVar17;
        H = new k0.f(bVar17, new String[]{"Ctype", "Packed", "Jstype", "Lazy", "UnverifiedLazy", "Deprecated", "Weak", "DebugRedact", "Retention", "Targets", "EditionDefaults", "Features", "UninterpretedOption"});
        r.b bVar18 = (r.b) bVar17.m().get(0);
        I = bVar18;
        J = new k0.f(bVar18, new String[]{"Edition", "Value"});
        r.b bVar19 = (r.b) c0().l().get(13);
        K = bVar19;
        L = new k0.f(bVar19, new String[]{"Features", "UninterpretedOption"});
        r.b bVar20 = (r.b) c0().l().get(14);
        M = bVar20;
        N = new k0.f(bVar20, new String[]{"AllowAlias", "Deprecated", "DeprecatedLegacyJsonFieldConflicts", "Features", "UninterpretedOption"});
        r.b bVar21 = (r.b) c0().l().get(15);
        O = bVar21;
        P = new k0.f(bVar21, new String[]{"Deprecated", "Features", "DebugRedact", "UninterpretedOption"});
        r.b bVar22 = (r.b) c0().l().get(16);
        Q = bVar22;
        R = new k0.f(bVar22, new String[]{"Features", "Deprecated", "UninterpretedOption"});
        r.b bVar23 = (r.b) c0().l().get(17);
        S = bVar23;
        T = new k0.f(bVar23, new String[]{"Deprecated", "IdempotencyLevel", "Features", "UninterpretedOption"});
        r.b bVar24 = (r.b) c0().l().get(18);
        U = bVar24;
        V = new k0.f(bVar24, new String[]{"Name", "IdentifierValue", "PositiveIntValue", "NegativeIntValue", "DoubleValue", "StringValue", "AggregateValue"});
        r.b bVar25 = (r.b) bVar24.m().get(0);
        W = bVar25;
        X = new k0.f(bVar25, new String[]{"NamePart", "IsExtension"});
        r.b bVar26 = (r.b) c0().l().get(19);
        Y = bVar26;
        Z = new k0.f(bVar26, new String[]{"FieldPresence", "EnumType", "RepeatedFieldEncoding", "Utf8Validation", "MessageEncoding", "JsonFormat"});
        r.b bVar27 = (r.b) c0().l().get(20);
        f9285a0 = bVar27;
        f9287b0 = new k0.f(bVar27, new String[]{"Defaults", "MinimumEdition", "MaximumEdition"});
        r.b bVar28 = (r.b) bVar27.m().get(0);
        f9289c0 = bVar28;
        f9291d0 = new k0.f(bVar28, new String[]{"Edition", "Features"});
        r.b bVar29 = (r.b) c0().l().get(21);
        f9293e0 = bVar29;
        f9295f0 = new k0.f(bVar29, new String[]{"Location"});
        r.b bVar30 = (r.b) bVar29.m().get(0);
        f9297g0 = bVar30;
        f9299h0 = new k0.f(bVar30, new String[]{"Path", "Span", "LeadingComments", "TrailingComments", "LeadingDetachedComments"});
        r.b bVar31 = (r.b) c0().l().get(22);
        f9301i0 = bVar31;
        f9303j0 = new k0.f(bVar31, new String[]{"Annotation"});
        r.b bVar32 = (r.b) bVar31.m().get(0);
        f9305k0 = bVar32;
        f9307l0 = new k0.f(bVar32, new String[]{"Path", "SourceFile", "Begin", "End", "Semantic"});
    }

    public static r.h c0() {
        return f9309m0;
    }
}
