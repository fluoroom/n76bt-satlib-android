package com.dw.grpc;

import com.google.protobuf.a;
import com.google.protobuf.c;
import com.google.protobuf.i1;
import com.google.protobuf.k0;
import com.google.protobuf.l;
import com.google.protobuf.l1;
import com.google.protobuf.m;
import com.google.protobuf.o;
import com.google.protobuf.o0;
import com.google.protobuf.o1;
import com.google.protobuf.p0;
import com.google.protobuf.r;
import com.google.protobuf.r2;
import com.google.protobuf.t2;
import com.google.protobuf.w;
import com.google.protobuf.y;
import com.google.protobuf.z1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Error {
    private static r.h descriptor = r.h.s(new String[]{"\n\u000berror.proto\u0012\u0007dw.grpc\"#\n\u0004Info\u0012\u001b\n\u0004code\u0018\u0001 \u0001(\u000e2\r.dw.grpc.Code*Í\u0001\n\u0004Code\u0012\u0006\n\u0002OK\u0010\u0000\u0012\u001c\n\u000fInvalidArgument\u0010ÿÿÿÿÿÿÿÿÿ\u0001\u0012\u0018\n\u000bUnavailable\u0010þÿÿÿÿÿÿÿÿ\u0001\u0012\u001c\n\u000fUnauthenticated\u0010ýÿÿÿÿÿÿÿÿ\u0001\u0012\u001d\n\u0010PermissionDenied\u0010üÿÿÿÿÿÿÿÿ\u0001\u0012\u0015\n\bInternal\u0010ûÿÿÿÿÿÿÿÿ\u0001\u0012\u001a\n\rAlreadyExists\u0010úÿÿÿÿÿÿÿÿ\u0001\u0012\u0015\n\bNotFound\u0010ùÿÿÿÿÿÿÿÿ\u0001B \n\u000bcom.dw.grpcZ\u0011dw/grpc/exceptionb\u0006proto3"}, new r.h[0]);
    private static final r.b internal_static_dw_grpc_Info_descriptor;
    private static final k0.f internal_static_dw_grpc_Info_fieldAccessorTable;

    public enum Code implements o0.c {
        OK(0),
        InvalidArgument(-1),
        Unavailable(-2),
        Unauthenticated(-3),
        PermissionDenied(-4),
        Internal(-5),
        AlreadyExists(-6),
        NotFound(-7),
        UNRECOGNIZED(-1);

        public static final int AlreadyExists_VALUE = -6;
        public static final int Internal_VALUE = -5;
        public static final int InvalidArgument_VALUE = -1;
        public static final int NotFound_VALUE = -7;
        public static final int OK_VALUE = 0;
        public static final int PermissionDenied_VALUE = -4;
        public static final int Unauthenticated_VALUE = -3;
        public static final int Unavailable_VALUE = -2;
        private final int value;
        private static final o0.d internalValueMap = new a();
        private static final Code[] VALUES = values();

        class a implements o0.d {
            a() {
            }
        }

        Code(int i10) {
            this.value = i10;
        }

        public static Code forNumber(int i10) {
            switch (i10) {
                case NotFound_VALUE:
                    return NotFound;
                case -6:
                    return AlreadyExists;
                case -5:
                    return Internal;
                case -4:
                    return PermissionDenied;
                case -3:
                    return Unauthenticated;
                case -2:
                    return Unavailable;
                case -1:
                    return InvalidArgument;
                case 0:
                    return OK;
                default:
                    return null;
            }
        }

        public static final r.e getDescriptor() {
            return (r.e) Error.getDescriptor().k().get(0);
        }

        public static o0.d internalGetValueMap() {
            return internalValueMap;
        }

        public final r.e getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.o0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final r.f getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return (r.f) getDescriptor().k().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static Code valueOf(int i10) {
            return forNumber(i10);
        }

        public static Code valueOf(r.f fVar) {
            if (fVar.h() == getDescriptor()) {
                if (fVar.g() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[fVar.g()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class Info extends k0 implements InfoOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final Info DEFAULT_INSTANCE = new Info();
        private static final z1 PARSER = new a();
        private static final long serialVersionUID = 0;
        private int code_;
        private byte memoizedIsInitialized;

        class a extends c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Info parsePartialFrom(m mVar, y yVar) throws p0 {
                Builder builderNewBuilder = Info.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        }

        public static Info getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Error.internal_static_dw_grpc_Info_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Info parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Info) k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Info parseFrom(ByteBuffer byteBuffer) throws p0 {
            return (Info) PARSER.parseFrom(byteBuffer);
        }

        public static z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return super.equals(obj);
            }
            Info info2 = (Info) obj;
            return this.code_ == info2.code_ && getUnknownFields().equals(info2.getUnknownFields());
        }

        @Override // com.dw.grpc.Error.InfoOrBuilder
        public Code getCode() {
            Code codeForNumber = Code.forNumber(this.code_);
            return codeForNumber == null ? Code.UNRECOGNIZED : codeForNumber;
        }

        @Override // com.dw.grpc.Error.InfoOrBuilder
        public int getCodeValue() {
            return this.code_;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iL = (this.code_ != Code.OK.getNumber() ? o.l(1, this.code_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iL;
            return iL;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.code_) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Error.internal_static_dw_grpc_Info_fieldAccessorTable.d(Info.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new Info();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(o oVar) throws IOException {
            if (this.code_ != Code.OK.getNumber()) {
                oVar.u0(1, this.code_);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements InfoOrBuilder {
            private int bitField0_;
            private int code_;

            private void buildPartial0(Info info2) {
                if ((this.bitField0_ & 1) != 0) {
                    info2.code_ = this.code_;
                }
            }

            public static final r.b getDescriptor() {
                return Error.internal_static_dw_grpc_Info_descriptor;
            }

            public Builder clearCode() {
                this.bitField0_ &= -2;
                this.code_ = 0;
                onChanged();
                return this;
            }

            @Override // com.dw.grpc.Error.InfoOrBuilder
            public Code getCode() {
                Code codeForNumber = Code.forNumber(this.code_);
                return codeForNumber == null ? Code.UNRECOGNIZED : codeForNumber;
            }

            @Override // com.dw.grpc.Error.InfoOrBuilder
            public int getCodeValue() {
                return this.code_;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Error.internal_static_dw_grpc_Info_descriptor;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Error.internal_static_dw_grpc_Info_fieldAccessorTable.d(Info.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setCode(Code code) {
                code.getClass();
                this.bitField0_ |= 1;
                this.code_ = code.getNumber();
                onChanged();
                return this;
            }

            public Builder setCodeValue(int i10) {
                this.code_ = i10;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                this.code_ = 0;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public Info build() {
                Info infoBuildPartial = buildPartial();
                if (infoBuildPartial.isInitialized()) {
                    return infoBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) infoBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public Info buildPartial() {
                Info info2 = new Info(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(info2);
                }
                onBuilt();
                return info2;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m1154clearField(r.g gVar) {
                return (Builder) super.m1154clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public Info getDefaultInstanceForType() {
                return Info.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m1163setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m1163setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1156clearOneof(r.l lVar) {
                return (Builder) super.m1156clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m1162mergeUnknownFields(t2 t2Var) {
                return (Builder) super.m1162mergeUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.code_ = 0;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1153clear() {
                super.m1153clear();
                this.bitField0_ = 0;
                this.code_ = 0;
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1161clone() {
                return (Builder) super.m1161clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(i1 i1Var) {
                if (i1Var instanceof Info) {
                    return mergeFrom((Info) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(Info info2) {
                if (info2 == Info.getDefaultInstance()) {
                    return this;
                }
                if (info2.code_ != 0) {
                    setCodeValue(info2.getCodeValue());
                }
                m1162mergeUnknownFields(info2.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(m mVar, y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK != 8) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.code_ = mVar.t();
                                    this.bitField0_ |= 1;
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
        }

        private Info(k0.b bVar) {
            super(bVar);
            this.code_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(Info info2) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(info2);
        }

        public static Info parseFrom(ByteBuffer byteBuffer, y yVar) throws p0 {
            return (Info) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static Info parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (Info) k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static Info parseFrom(l lVar) throws p0 {
            return (Info) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public Info getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Info parseFrom(l lVar, y yVar) throws p0 {
            return (Info) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Info() {
            this.memoizedIsInitialized = (byte) -1;
            this.code_ = 0;
        }

        public static Info parseFrom(byte[] bArr) throws p0 {
            return (Info) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static Info parseFrom(byte[] bArr, y yVar) throws p0 {
            return (Info) PARSER.parseFrom(bArr, yVar);
        }

        public static Info parseFrom(InputStream inputStream) throws IOException {
            return (Info) k0.parseWithIOException(PARSER, inputStream);
        }

        public static Info parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (Info) k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static Info parseFrom(m mVar) throws IOException {
            return (Info) k0.parseWithIOException(PARSER, mVar);
        }

        public static Info parseFrom(m mVar, y yVar) throws IOException {
            return (Info) k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface InfoOrBuilder extends o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        Code getCode();

        int getCodeValue();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    static {
        r.b bVar = (r.b) getDescriptor().l().get(0);
        internal_static_dw_grpc_Info_descriptor = bVar;
        internal_static_dw_grpc_Info_fieldAccessorTable = new k0.f(bVar, new String[]{"Code"});
    }

    private Error() {
    }

    public static r.h getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(y yVar) {
    }

    public static void registerAllExtensions(w wVar) {
        registerAllExtensions((y) wVar);
    }
}
