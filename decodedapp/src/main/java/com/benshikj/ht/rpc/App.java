package com.benshikj.ht.rpc;

import com.google.protobuf.a;
import com.google.protobuf.k0;
import com.google.protobuf.r;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class App {
    private static r.h descriptor = r.h.s(new String[]{"\n\tapp.proto\u0012\bbenshikj\"J\n\u0012CheckUpdateRequest\u0012\u0013\n\u000bpackageName\u0018\u0001 \u0001(\t\u0012\u0013\n\u000bversionCode\u0018\u0002 \u0001(\u0005\u0012\n\n\u0002hl\u0018\u0003 \u0001(\t\"^\n\u0011CheckUpdateResult\u0012\u0014\n\fdownloadLink\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007changes\u0018\u0002 \u0001(\t\u0012\r\n\u0005title\u0018\u0003 \u0001(\t\u0012\u0013\n\u000bversionCode\u0018\u0004 \u0001(\u00052Q\n\u0003APP\u0012J\n\u000bCheckUpdate\u0012\u001c.benshikj.CheckUpdateRequest\u001a\u001b.benshikj.CheckUpdateResult\"\u0000B!\n\u0013com.benshikj.ht.rpcZ\n./benshikjb\u0006proto3"}, new r.h[0]);
    private static final r.b internal_static_benshikj_CheckUpdateRequest_descriptor;
    private static final k0.f internal_static_benshikj_CheckUpdateRequest_fieldAccessorTable;
    private static final r.b internal_static_benshikj_CheckUpdateResult_descriptor;
    private static final k0.f internal_static_benshikj_CheckUpdateResult_fieldAccessorTable;

    public static final class CheckUpdateRequest extends com.google.protobuf.k0 implements CheckUpdateRequestOrBuilder {
        public static final int HL_FIELD_NUMBER = 3;
        public static final int PACKAGENAME_FIELD_NUMBER = 1;
        public static final int VERSIONCODE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private volatile Object hl_;
        private byte memoizedIsInitialized;
        private volatile Object packageName_;
        private int versionCode_;
        private static final CheckUpdateRequest DEFAULT_INSTANCE = new CheckUpdateRequest();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.App.CheckUpdateRequest.1
            @Override // com.google.protobuf.z1
            public CheckUpdateRequest parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = CheckUpdateRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };

        public static CheckUpdateRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return App.internal_static_benshikj_CheckUpdateRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CheckUpdateRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CheckUpdateRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CheckUpdateRequest parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (CheckUpdateRequest) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CheckUpdateRequest)) {
                return super.equals(obj);
            }
            CheckUpdateRequest checkUpdateRequest = (CheckUpdateRequest) obj;
            return getPackageName().equals(checkUpdateRequest.getPackageName()) && getVersionCode() == checkUpdateRequest.getVersionCode() && getHl().equals(checkUpdateRequest.getHl()) && getUnknownFields().equals(checkUpdateRequest.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public String getHl() {
            Object obj = this.hl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.hl_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public com.google.protobuf.l getHlBytes() {
            Object obj = this.hl_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.hl_ = lVarI;
            return lVarI;
        }

        @Override // com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public String getPackageName() {
            Object obj = this.packageName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.packageName_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public com.google.protobuf.l getPackageNameBytes() {
            Object obj = this.packageName_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.packageName_ = lVarI;
            return lVarI;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !com.google.protobuf.k0.isStringEmpty(this.packageName_) ? com.google.protobuf.k0.computeStringSize(1, this.packageName_) : 0;
            int i11 = this.versionCode_;
            if (i11 != 0) {
                iComputeStringSize += com.google.protobuf.o.x(2, i11);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.hl_)) {
                iComputeStringSize += com.google.protobuf.k0.computeStringSize(3, this.hl_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public int getVersionCode() {
            return this.versionCode_;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getPackageName().hashCode()) * 37) + 2) * 53) + getVersionCode()) * 37) + 3) * 53) + getHl().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return App.internal_static_benshikj_CheckUpdateRequest_fieldAccessorTable.d(CheckUpdateRequest.class, Builder.class);
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
            return new CheckUpdateRequest();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if (!com.google.protobuf.k0.isStringEmpty(this.packageName_)) {
                com.google.protobuf.k0.writeString(oVar, 1, this.packageName_);
            }
            int i10 = this.versionCode_;
            if (i10 != 0) {
                oVar.D0(2, i10);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.hl_)) {
                com.google.protobuf.k0.writeString(oVar, 3, this.hl_);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements CheckUpdateRequestOrBuilder {
            private int bitField0_;
            private Object hl_;
            private Object packageName_;
            private int versionCode_;

            private void buildPartial0(CheckUpdateRequest checkUpdateRequest) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    checkUpdateRequest.packageName_ = this.packageName_;
                }
                if ((i10 & 2) != 0) {
                    checkUpdateRequest.versionCode_ = this.versionCode_;
                }
                if ((i10 & 4) != 0) {
                    checkUpdateRequest.hl_ = this.hl_;
                }
            }

            public static final r.b getDescriptor() {
                return App.internal_static_benshikj_CheckUpdateRequest_descriptor;
            }

            public Builder clearHl() {
                this.hl_ = CheckUpdateRequest.getDefaultInstance().getHl();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearPackageName() {
                this.packageName_ = CheckUpdateRequest.getDefaultInstance().getPackageName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearVersionCode() {
                this.bitField0_ &= -3;
                this.versionCode_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return App.internal_static_benshikj_CheckUpdateRequest_descriptor;
            }

            @Override // com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public String getHl() {
                Object obj = this.hl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.hl_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public com.google.protobuf.l getHlBytes() {
                Object obj = this.hl_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.hl_ = lVarI;
                return lVarI;
            }

            @Override // com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public String getPackageName() {
                Object obj = this.packageName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.packageName_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public com.google.protobuf.l getPackageNameBytes() {
                Object obj = this.packageName_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.packageName_ = lVarI;
                return lVarI;
            }

            @Override // com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public int getVersionCode() {
                return this.versionCode_;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return App.internal_static_benshikj_CheckUpdateRequest_fieldAccessorTable.d(CheckUpdateRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setHl(String str) {
                str.getClass();
                this.hl_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setHlBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.hl_ = lVar;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPackageName(String str) {
                str.getClass();
                this.packageName_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPackageNameBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.packageName_ = lVar;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setVersionCode(int i10) {
                this.versionCode_ = i10;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            private Builder() {
                this.packageName_ = "";
                this.hl_ = "";
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public CheckUpdateRequest build() {
                CheckUpdateRequest checkUpdateRequestBuildPartial = buildPartial();
                if (checkUpdateRequestBuildPartial.isInitialized()) {
                    return checkUpdateRequestBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) checkUpdateRequestBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public CheckUpdateRequest buildPartial() {
                CheckUpdateRequest checkUpdateRequest = new CheckUpdateRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(checkUpdateRequest);
                }
                onBuilt();
                return checkUpdateRequest;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m16clearField(r.g gVar) {
                return (Builder) super.m16clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public CheckUpdateRequest getDefaultInstanceForType() {
                return CheckUpdateRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m25setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m25setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m18clearOneof(r.l lVar) {
                return (Builder) super.m18clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m24mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m24mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m2clear() {
                super.m15clear();
                this.bitField0_ = 0;
                this.packageName_ = "";
                this.versionCode_ = 0;
                this.hl_ = "";
                return this;
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.packageName_ = "";
                this.hl_ = "";
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m10clone() {
                return (Builder) super.m23clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof CheckUpdateRequest) {
                    return mergeFrom((CheckUpdateRequest) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(CheckUpdateRequest checkUpdateRequest) {
                if (checkUpdateRequest == CheckUpdateRequest.getDefaultInstance()) {
                    return this;
                }
                if (!checkUpdateRequest.getPackageName().isEmpty()) {
                    this.packageName_ = checkUpdateRequest.packageName_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (checkUpdateRequest.getVersionCode() != 0) {
                    setVersionCode(checkUpdateRequest.getVersionCode());
                }
                if (!checkUpdateRequest.getHl().isEmpty()) {
                    this.hl_ = checkUpdateRequest.hl_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                m24mergeUnknownFields(checkUpdateRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    this.packageName_ = mVar.J();
                                    this.bitField0_ |= 1;
                                } else if (iK == 16) {
                                    this.versionCode_ = mVar.y();
                                    this.bitField0_ |= 2;
                                } else if (iK != 26) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.hl_ = mVar.J();
                                    this.bitField0_ |= 4;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
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

        private CheckUpdateRequest(k0.b bVar) {
            super(bVar);
            this.packageName_ = "";
            this.versionCode_ = 0;
            this.hl_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(CheckUpdateRequest checkUpdateRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(checkUpdateRequest);
        }

        public static CheckUpdateRequest parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (CheckUpdateRequest) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static CheckUpdateRequest parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (CheckUpdateRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static CheckUpdateRequest parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (CheckUpdateRequest) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public CheckUpdateRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static CheckUpdateRequest parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (CheckUpdateRequest) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CheckUpdateRequest parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (CheckUpdateRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static CheckUpdateRequest parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (CheckUpdateRequest) PARSER.parseFrom(bArr, yVar);
        }

        private CheckUpdateRequest() {
            this.packageName_ = "";
            this.versionCode_ = 0;
            this.hl_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.packageName_ = "";
            this.hl_ = "";
        }

        public static CheckUpdateRequest parseFrom(InputStream inputStream) throws IOException {
            return (CheckUpdateRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static CheckUpdateRequest parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (CheckUpdateRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static CheckUpdateRequest parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (CheckUpdateRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static CheckUpdateRequest parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (CheckUpdateRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface CheckUpdateRequestOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        String getHl();

        com.google.protobuf.l getHlBytes();

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        String getPackageName();

        com.google.protobuf.l getPackageNameBytes();

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        int getVersionCode();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        /* synthetic */ boolean isInitialized();
    }

    public static final class CheckUpdateResult extends com.google.protobuf.k0 implements CheckUpdateResultOrBuilder {
        public static final int CHANGES_FIELD_NUMBER = 2;
        public static final int DOWNLOADLINK_FIELD_NUMBER = 1;
        public static final int TITLE_FIELD_NUMBER = 3;
        public static final int VERSIONCODE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private volatile Object changes_;
        private volatile Object downloadLink_;
        private byte memoizedIsInitialized;
        private volatile Object title_;
        private int versionCode_;
        private static final CheckUpdateResult DEFAULT_INSTANCE = new CheckUpdateResult();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.App.CheckUpdateResult.1
            @Override // com.google.protobuf.z1
            public CheckUpdateResult parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = CheckUpdateResult.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };

        public static CheckUpdateResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return App.internal_static_benshikj_CheckUpdateResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CheckUpdateResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CheckUpdateResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CheckUpdateResult parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (CheckUpdateResult) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CheckUpdateResult)) {
                return super.equals(obj);
            }
            CheckUpdateResult checkUpdateResult = (CheckUpdateResult) obj;
            return getDownloadLink().equals(checkUpdateResult.getDownloadLink()) && getChanges().equals(checkUpdateResult.getChanges()) && getTitle().equals(checkUpdateResult.getTitle()) && getVersionCode() == checkUpdateResult.getVersionCode() && getUnknownFields().equals(checkUpdateResult.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.App.CheckUpdateResultOrBuilder
        public String getChanges() {
            Object obj = this.changes_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.changes_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.App.CheckUpdateResultOrBuilder
        public com.google.protobuf.l getChangesBytes() {
            Object obj = this.changes_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.changes_ = lVarI;
            return lVarI;
        }

        @Override // com.benshikj.ht.rpc.App.CheckUpdateResultOrBuilder
        public String getDownloadLink() {
            Object obj = this.downloadLink_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.downloadLink_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.App.CheckUpdateResultOrBuilder
        public com.google.protobuf.l getDownloadLinkBytes() {
            Object obj = this.downloadLink_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.downloadLink_ = lVarI;
            return lVarI;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !com.google.protobuf.k0.isStringEmpty(this.downloadLink_) ? com.google.protobuf.k0.computeStringSize(1, this.downloadLink_) : 0;
            if (!com.google.protobuf.k0.isStringEmpty(this.changes_)) {
                iComputeStringSize += com.google.protobuf.k0.computeStringSize(2, this.changes_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.title_)) {
                iComputeStringSize += com.google.protobuf.k0.computeStringSize(3, this.title_);
            }
            int i11 = this.versionCode_;
            if (i11 != 0) {
                iComputeStringSize += com.google.protobuf.o.x(4, i11);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.benshikj.ht.rpc.App.CheckUpdateResultOrBuilder
        public String getTitle() {
            Object obj = this.title_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.title_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.App.CheckUpdateResultOrBuilder
        public com.google.protobuf.l getTitleBytes() {
            Object obj = this.title_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.title_ = lVarI;
            return lVarI;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.benshikj.ht.rpc.App.CheckUpdateResultOrBuilder
        public int getVersionCode() {
            return this.versionCode_;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getDownloadLink().hashCode()) * 37) + 2) * 53) + getChanges().hashCode()) * 37) + 3) * 53) + getTitle().hashCode()) * 37) + 4) * 53) + getVersionCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return App.internal_static_benshikj_CheckUpdateResult_fieldAccessorTable.d(CheckUpdateResult.class, Builder.class);
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
            return new CheckUpdateResult();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if (!com.google.protobuf.k0.isStringEmpty(this.downloadLink_)) {
                com.google.protobuf.k0.writeString(oVar, 1, this.downloadLink_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.changes_)) {
                com.google.protobuf.k0.writeString(oVar, 2, this.changes_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.title_)) {
                com.google.protobuf.k0.writeString(oVar, 3, this.title_);
            }
            int i10 = this.versionCode_;
            if (i10 != 0) {
                oVar.D0(4, i10);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements CheckUpdateResultOrBuilder {
            private int bitField0_;
            private Object changes_;
            private Object downloadLink_;
            private Object title_;
            private int versionCode_;

            private void buildPartial0(CheckUpdateResult checkUpdateResult) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    checkUpdateResult.downloadLink_ = this.downloadLink_;
                }
                if ((i10 & 2) != 0) {
                    checkUpdateResult.changes_ = this.changes_;
                }
                if ((i10 & 4) != 0) {
                    checkUpdateResult.title_ = this.title_;
                }
                if ((i10 & 8) != 0) {
                    checkUpdateResult.versionCode_ = this.versionCode_;
                }
            }

            public static final r.b getDescriptor() {
                return App.internal_static_benshikj_CheckUpdateResult_descriptor;
            }

            public Builder clearChanges() {
                this.changes_ = CheckUpdateResult.getDefaultInstance().getChanges();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearDownloadLink() {
                this.downloadLink_ = CheckUpdateResult.getDefaultInstance().getDownloadLink();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearTitle() {
                this.title_ = CheckUpdateResult.getDefaultInstance().getTitle();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearVersionCode() {
                this.bitField0_ &= -9;
                this.versionCode_ = 0;
                onChanged();
                return this;
            }

            @Override // com.benshikj.ht.rpc.App.CheckUpdateResultOrBuilder
            public String getChanges() {
                Object obj = this.changes_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.changes_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.App.CheckUpdateResultOrBuilder
            public com.google.protobuf.l getChangesBytes() {
                Object obj = this.changes_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.changes_ = lVarI;
                return lVarI;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return App.internal_static_benshikj_CheckUpdateResult_descriptor;
            }

            @Override // com.benshikj.ht.rpc.App.CheckUpdateResultOrBuilder
            public String getDownloadLink() {
                Object obj = this.downloadLink_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.downloadLink_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.App.CheckUpdateResultOrBuilder
            public com.google.protobuf.l getDownloadLinkBytes() {
                Object obj = this.downloadLink_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.downloadLink_ = lVarI;
                return lVarI;
            }

            @Override // com.benshikj.ht.rpc.App.CheckUpdateResultOrBuilder
            public String getTitle() {
                Object obj = this.title_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.title_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.App.CheckUpdateResultOrBuilder
            public com.google.protobuf.l getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.title_ = lVarI;
                return lVarI;
            }

            @Override // com.benshikj.ht.rpc.App.CheckUpdateResultOrBuilder
            public int getVersionCode() {
                return this.versionCode_;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return App.internal_static_benshikj_CheckUpdateResult_fieldAccessorTable.d(CheckUpdateResult.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setChanges(String str) {
                str.getClass();
                this.changes_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setChangesBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.changes_ = lVar;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setDownloadLink(String str) {
                str.getClass();
                this.downloadLink_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDownloadLinkBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.downloadLink_ = lVar;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTitle(String str) {
                str.getClass();
                this.title_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTitleBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.title_ = lVar;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setVersionCode(int i10) {
                this.versionCode_ = i10;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            private Builder() {
                this.downloadLink_ = "";
                this.changes_ = "";
                this.title_ = "";
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public CheckUpdateResult build() {
                CheckUpdateResult checkUpdateResultBuildPartial = buildPartial();
                if (checkUpdateResultBuildPartial.isInitialized()) {
                    return checkUpdateResultBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) checkUpdateResultBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public CheckUpdateResult buildPartial() {
                CheckUpdateResult checkUpdateResult = new CheckUpdateResult(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(checkUpdateResult);
                }
                onBuilt();
                return checkUpdateResult;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m16clearField(r.g gVar) {
                return (Builder) super.m16clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public CheckUpdateResult getDefaultInstanceForType() {
                return CheckUpdateResult.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m25setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m25setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m18clearOneof(r.l lVar) {
                return (Builder) super.m18clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m24mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m24mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m15clear() {
                super.m15clear();
                this.bitField0_ = 0;
                this.downloadLink_ = "";
                this.changes_ = "";
                this.title_ = "";
                this.versionCode_ = 0;
                return this;
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.downloadLink_ = "";
                this.changes_ = "";
                this.title_ = "";
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m23clone() {
                return (Builder) super.m23clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof CheckUpdateResult) {
                    return mergeFrom((CheckUpdateResult) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(CheckUpdateResult checkUpdateResult) {
                if (checkUpdateResult == CheckUpdateResult.getDefaultInstance()) {
                    return this;
                }
                if (!checkUpdateResult.getDownloadLink().isEmpty()) {
                    this.downloadLink_ = checkUpdateResult.downloadLink_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!checkUpdateResult.getChanges().isEmpty()) {
                    this.changes_ = checkUpdateResult.changes_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!checkUpdateResult.getTitle().isEmpty()) {
                    this.title_ = checkUpdateResult.title_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (checkUpdateResult.getVersionCode() != 0) {
                    setVersionCode(checkUpdateResult.getVersionCode());
                }
                m24mergeUnknownFields(checkUpdateResult.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    this.downloadLink_ = mVar.J();
                                    this.bitField0_ |= 1;
                                } else if (iK == 18) {
                                    this.changes_ = mVar.J();
                                    this.bitField0_ |= 2;
                                } else if (iK == 26) {
                                    this.title_ = mVar.J();
                                    this.bitField0_ |= 4;
                                } else if (iK != 32) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.versionCode_ = mVar.y();
                                    this.bitField0_ |= 8;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
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

        private CheckUpdateResult(k0.b bVar) {
            super(bVar);
            this.downloadLink_ = "";
            this.changes_ = "";
            this.title_ = "";
            this.versionCode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(CheckUpdateResult checkUpdateResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(checkUpdateResult);
        }

        public static CheckUpdateResult parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (CheckUpdateResult) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static CheckUpdateResult parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (CheckUpdateResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static CheckUpdateResult parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (CheckUpdateResult) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public CheckUpdateResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static CheckUpdateResult parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (CheckUpdateResult) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CheckUpdateResult parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (CheckUpdateResult) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static CheckUpdateResult parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (CheckUpdateResult) PARSER.parseFrom(bArr, yVar);
        }

        public static CheckUpdateResult parseFrom(InputStream inputStream) throws IOException {
            return (CheckUpdateResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        private CheckUpdateResult() {
            this.downloadLink_ = "";
            this.changes_ = "";
            this.title_ = "";
            this.versionCode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.downloadLink_ = "";
            this.changes_ = "";
            this.title_ = "";
        }

        public static CheckUpdateResult parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (CheckUpdateResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static CheckUpdateResult parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (CheckUpdateResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static CheckUpdateResult parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (CheckUpdateResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface CheckUpdateResultOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        String getChanges();

        com.google.protobuf.l getChangesBytes();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        String getDownloadLink();

        com.google.protobuf.l getDownloadLinkBytes();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        String getTitle();

        com.google.protobuf.l getTitleBytes();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        int getVersionCode();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    static {
        r.b bVar = (r.b) getDescriptor().l().get(0);
        internal_static_benshikj_CheckUpdateRequest_descriptor = bVar;
        internal_static_benshikj_CheckUpdateRequest_fieldAccessorTable = new k0.f(bVar, new String[]{"PackageName", "VersionCode", "Hl"});
        r.b bVar2 = (r.b) getDescriptor().l().get(1);
        internal_static_benshikj_CheckUpdateResult_descriptor = bVar2;
        internal_static_benshikj_CheckUpdateResult_fieldAccessorTable = new k0.f(bVar2, new String[]{"DownloadLink", "Changes", "Title", "VersionCode"});
    }

    private App() {
    }

    public static r.h getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(com.google.protobuf.y yVar) {
    }

    public static void registerAllExtensions(com.google.protobuf.w wVar) {
        registerAllExtensions((com.google.protobuf.y) wVar);
    }
}
