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
public final class Dm {
    private static r.h descriptor = r.h.s(new String[]{"\n\bdm.proto\u0012\bbenshikj\"N\n\u0018GetDeviceRegTimesRequest\u0012\u0011\n\tproductId\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005devId\u0018\u0002 \u0001(\f\u0012\u0010\n\breqDevID\u0018\u0003 \u0001(\b\"2\n\bDeviceID\u0012\u000b\n\u0003DID\u0018\u0001 \u0001(\u0004\u0012\u000b\n\u0003PID\u0018\u0002 \u0001(\r\u0012\f\n\u0004Date\u0018\u0003 \u0001(\t\"B\n\u000eDeviceRegTimes\u0012\u0010\n\bregTimes\u0018\u0001 \u0001(\u0005\u0012\u001e\n\u0002ID\u0018\u0002 \u0001(\u000b2\u0012.benshikj.DeviceID\"\u0084\u0001\n\u0018SetDeviceRegTimesRequest\u0012\u0011\n\tproductId\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005devId\u0018\u0002 \u0001(\f\u0012\u0010\n\bvendorId\u0018\u0003 \u0001(\u0005\u0012\u0010\n\bregTimes\u0018\u0004 \u0001(\u0005\u0012\u0012\n\nclientName\u0018\u0005 \u0001(\t\u0012\u000e\n\u0006userId\u0018\u0006 \u0001(\u0003\"z\n\u001aCheckFirmwareUpdateRequest\u0012\u0011\n\tproductId\u0018\u0001 \u0001(\u0005\u0012\u0017\n\u000ffirmwareVersion\u0018\u0002 \u0001(\u0005\u0012\f\n\u0004beta\u0018\u0003 \u0001(\b\u0012\u000e\n\u0006userId\u0018\u0004 \u0001(\u0003\u0012\u0012\n\ninviteCode\u0018\u0005 \u0001(\u0005\"d\n\fFirmwareInfo\u0012\u000f\n\u0007version\u0018\u0001 \u0001(\u0005\u0012\u000b\n\u0003url\u0018\u0002 \u0001(\t\u0012\u000b\n\u0003md5\u0018\u0003 \u0001(\t\u0012\u0014\n\freleaseNotes\u0018\u0004 \u0001(\t\u0012\u0013\n\u000breleaseDate\u0018\u0005 \u0001(\u0003\"k\n\u0019CheckFirmwareUpdateResult\u0012(\n\bfirmware\u0018\u0001 \u0001(\u000b2\u0016.benshikj.FirmwareInfo\u0012$\n\u0004base\u0018\u0002 \u0001(\u000b2\u0016.benshikj.FirmwareInfo\"!\n\u0010GetIDInfoRequest\u0012\r\n\u0005devId\u0018\u0001 \u0001(\f\"\u001f\n\u000fGetIDInfoResult\u0012\f\n\u0004info\u0018\u0001 \u0001(\t2\u0094\u0002\n\u0010DeviceManagement\u0012M\n\u000bGetRegTimes\u0012\".benshikj.GetDeviceRegTimesRequest\u001a\u0018.benshikj.DeviceRegTimes\"\u0000\u0012M\n\u000bSetRegTimes\u0012\".benshikj.SetDeviceRegTimesRequest\u001a\u0018.benshikj.DeviceRegTimes\"\u0000\u0012b\n\u0013CheckFirmwareUpdate\u0012$.benshikj.CheckFirmwareUpdateRequest\u001a#.benshikj.CheckFirmwareUpdateResult\"\u0000B!\n\u0013com.benshikj.ht.rpcZ\n./benshikjb\u0006proto3"}, new r.h[0]);
    private static final r.b internal_static_benshikj_CheckFirmwareUpdateRequest_descriptor;
    private static final k0.f internal_static_benshikj_CheckFirmwareUpdateRequest_fieldAccessorTable;
    private static final r.b internal_static_benshikj_CheckFirmwareUpdateResult_descriptor;
    private static final k0.f internal_static_benshikj_CheckFirmwareUpdateResult_fieldAccessorTable;
    private static final r.b internal_static_benshikj_DeviceID_descriptor;
    private static final k0.f internal_static_benshikj_DeviceID_fieldAccessorTable;
    private static final r.b internal_static_benshikj_DeviceRegTimes_descriptor;
    private static final k0.f internal_static_benshikj_DeviceRegTimes_fieldAccessorTable;
    private static final r.b internal_static_benshikj_FirmwareInfo_descriptor;
    private static final k0.f internal_static_benshikj_FirmwareInfo_fieldAccessorTable;
    private static final r.b internal_static_benshikj_GetDeviceRegTimesRequest_descriptor;
    private static final k0.f internal_static_benshikj_GetDeviceRegTimesRequest_fieldAccessorTable;
    private static final r.b internal_static_benshikj_GetIDInfoRequest_descriptor;
    private static final k0.f internal_static_benshikj_GetIDInfoRequest_fieldAccessorTable;
    private static final r.b internal_static_benshikj_GetIDInfoResult_descriptor;
    private static final k0.f internal_static_benshikj_GetIDInfoResult_fieldAccessorTable;
    private static final r.b internal_static_benshikj_SetDeviceRegTimesRequest_descriptor;
    private static final k0.f internal_static_benshikj_SetDeviceRegTimesRequest_fieldAccessorTable;

    public static final class CheckFirmwareUpdateRequest extends com.google.protobuf.k0 implements CheckFirmwareUpdateRequestOrBuilder {
        public static final int BETA_FIELD_NUMBER = 3;
        public static final int FIRMWAREVERSION_FIELD_NUMBER = 2;
        public static final int INVITECODE_FIELD_NUMBER = 5;
        public static final int PRODUCTID_FIELD_NUMBER = 1;
        public static final int USERID_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private boolean beta_;
        private int firmwareVersion_;
        private int inviteCode_;
        private byte memoizedIsInitialized;
        private int productId_;
        private long userId_;
        private static final CheckFirmwareUpdateRequest DEFAULT_INSTANCE = new CheckFirmwareUpdateRequest();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateRequest.1
            @Override // com.google.protobuf.z1
            public CheckFirmwareUpdateRequest parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = CheckFirmwareUpdateRequest.newBuilder();
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

        public static CheckFirmwareUpdateRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Dm.internal_static_benshikj_CheckFirmwareUpdateRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CheckFirmwareUpdateRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CheckFirmwareUpdateRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CheckFirmwareUpdateRequest parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (CheckFirmwareUpdateRequest) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CheckFirmwareUpdateRequest)) {
                return super.equals(obj);
            }
            CheckFirmwareUpdateRequest checkFirmwareUpdateRequest = (CheckFirmwareUpdateRequest) obj;
            return getProductId() == checkFirmwareUpdateRequest.getProductId() && getFirmwareVersion() == checkFirmwareUpdateRequest.getFirmwareVersion() && getBeta() == checkFirmwareUpdateRequest.getBeta() && getUserId() == checkFirmwareUpdateRequest.getUserId() && getInviteCode() == checkFirmwareUpdateRequest.getInviteCode() && getUnknownFields().equals(checkFirmwareUpdateRequest.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateRequestOrBuilder
        public boolean getBeta() {
            return this.beta_;
        }

        @Override // com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateRequestOrBuilder
        public int getFirmwareVersion() {
            return this.firmwareVersion_;
        }

        @Override // com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateRequestOrBuilder
        public int getInviteCode() {
            return this.inviteCode_;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateRequestOrBuilder
        public int getProductId() {
            return this.productId_;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.productId_;
            int iX = i11 != 0 ? com.google.protobuf.o.x(1, i11) : 0;
            int i12 = this.firmwareVersion_;
            if (i12 != 0) {
                iX += com.google.protobuf.o.x(2, i12);
            }
            boolean z10 = this.beta_;
            if (z10) {
                iX += com.google.protobuf.o.e(3, z10);
            }
            long j10 = this.userId_;
            if (j10 != 0) {
                iX += com.google.protobuf.o.z(4, j10);
            }
            int i13 = this.inviteCode_;
            if (i13 != 0) {
                iX += com.google.protobuf.o.x(5, i13);
            }
            int serializedSize = iX + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateRequestOrBuilder
        public long getUserId() {
            return this.userId_;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getProductId()) * 37) + 2) * 53) + getFirmwareVersion()) * 37) + 3) * 53) + com.google.protobuf.o0.d(getBeta())) * 37) + 4) * 53) + com.google.protobuf.o0.i(getUserId())) * 37) + 5) * 53) + getInviteCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Dm.internal_static_benshikj_CheckFirmwareUpdateRequest_fieldAccessorTable.d(CheckFirmwareUpdateRequest.class, Builder.class);
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
            return new CheckFirmwareUpdateRequest();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            int i10 = this.productId_;
            if (i10 != 0) {
                oVar.D0(1, i10);
            }
            int i11 = this.firmwareVersion_;
            if (i11 != 0) {
                oVar.D0(2, i11);
            }
            boolean z10 = this.beta_;
            if (z10) {
                oVar.m0(3, z10);
            }
            long j10 = this.userId_;
            if (j10 != 0) {
                oVar.F0(4, j10);
            }
            int i12 = this.inviteCode_;
            if (i12 != 0) {
                oVar.D0(5, i12);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements CheckFirmwareUpdateRequestOrBuilder {
            private boolean beta_;
            private int bitField0_;
            private int firmwareVersion_;
            private int inviteCode_;
            private int productId_;
            private long userId_;

            private void buildPartial0(CheckFirmwareUpdateRequest checkFirmwareUpdateRequest) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    checkFirmwareUpdateRequest.productId_ = this.productId_;
                }
                if ((i10 & 2) != 0) {
                    checkFirmwareUpdateRequest.firmwareVersion_ = this.firmwareVersion_;
                }
                if ((i10 & 4) != 0) {
                    checkFirmwareUpdateRequest.beta_ = this.beta_;
                }
                if ((i10 & 8) != 0) {
                    checkFirmwareUpdateRequest.userId_ = this.userId_;
                }
                if ((i10 & 16) != 0) {
                    checkFirmwareUpdateRequest.inviteCode_ = this.inviteCode_;
                }
            }

            public static final r.b getDescriptor() {
                return Dm.internal_static_benshikj_CheckFirmwareUpdateRequest_descriptor;
            }

            public Builder clearBeta() {
                this.bitField0_ &= -5;
                this.beta_ = false;
                onChanged();
                return this;
            }

            public Builder clearFirmwareVersion() {
                this.bitField0_ &= -3;
                this.firmwareVersion_ = 0;
                onChanged();
                return this;
            }

            public Builder clearInviteCode() {
                this.bitField0_ &= -17;
                this.inviteCode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearProductId() {
                this.bitField0_ &= -2;
                this.productId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUserId() {
                this.bitField0_ &= -9;
                this.userId_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateRequestOrBuilder
            public boolean getBeta() {
                return this.beta_;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Dm.internal_static_benshikj_CheckFirmwareUpdateRequest_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateRequestOrBuilder
            public int getFirmwareVersion() {
                return this.firmwareVersion_;
            }

            @Override // com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateRequestOrBuilder
            public int getInviteCode() {
                return this.inviteCode_;
            }

            @Override // com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateRequestOrBuilder
            public int getProductId() {
                return this.productId_;
            }

            @Override // com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateRequestOrBuilder
            public long getUserId() {
                return this.userId_;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Dm.internal_static_benshikj_CheckFirmwareUpdateRequest_fieldAccessorTable.d(CheckFirmwareUpdateRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setBeta(boolean z10) {
                this.beta_ = z10;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setFirmwareVersion(int i10) {
                this.firmwareVersion_ = i10;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setInviteCode(int i10) {
                this.inviteCode_ = i10;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setProductId(int i10) {
                this.productId_ = i10;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUserId(long j10) {
                this.userId_ = j10;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            private Builder() {
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public CheckFirmwareUpdateRequest build() {
                CheckFirmwareUpdateRequest checkFirmwareUpdateRequestBuildPartial = buildPartial();
                if (checkFirmwareUpdateRequestBuildPartial.isInitialized()) {
                    return checkFirmwareUpdateRequestBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) checkFirmwareUpdateRequestBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public CheckFirmwareUpdateRequest buildPartial() {
                CheckFirmwareUpdateRequest checkFirmwareUpdateRequest = new CheckFirmwareUpdateRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(checkFirmwareUpdateRequest);
                }
                onBuilt();
                return checkFirmwareUpdateRequest;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public CheckFirmwareUpdateRequest getDefaultInstanceForType() {
                return CheckFirmwareUpdateRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m28clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.productId_ = 0;
                this.firmwareVersion_ = 0;
                this.beta_ = false;
                this.userId_ = 0L;
                this.inviteCode_ = 0;
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m36clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof CheckFirmwareUpdateRequest) {
                    return mergeFrom((CheckFirmwareUpdateRequest) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(CheckFirmwareUpdateRequest checkFirmwareUpdateRequest) {
                if (checkFirmwareUpdateRequest == CheckFirmwareUpdateRequest.getDefaultInstance()) {
                    return this;
                }
                if (checkFirmwareUpdateRequest.getProductId() != 0) {
                    setProductId(checkFirmwareUpdateRequest.getProductId());
                }
                if (checkFirmwareUpdateRequest.getFirmwareVersion() != 0) {
                    setFirmwareVersion(checkFirmwareUpdateRequest.getFirmwareVersion());
                }
                if (checkFirmwareUpdateRequest.getBeta()) {
                    setBeta(checkFirmwareUpdateRequest.getBeta());
                }
                if (checkFirmwareUpdateRequest.getUserId() != 0) {
                    setUserId(checkFirmwareUpdateRequest.getUserId());
                }
                if (checkFirmwareUpdateRequest.getInviteCode() != 0) {
                    setInviteCode(checkFirmwareUpdateRequest.getInviteCode());
                }
                m141mergeUnknownFields(checkFirmwareUpdateRequest.getUnknownFields());
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
                                if (iK == 8) {
                                    this.productId_ = mVar.y();
                                    this.bitField0_ |= 1;
                                } else if (iK == 16) {
                                    this.firmwareVersion_ = mVar.y();
                                    this.bitField0_ |= 2;
                                } else if (iK == 24) {
                                    this.beta_ = mVar.q();
                                    this.bitField0_ |= 4;
                                } else if (iK == 32) {
                                    this.userId_ = mVar.z();
                                    this.bitField0_ |= 8;
                                } else if (iK != 40) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.inviteCode_ = mVar.y();
                                    this.bitField0_ |= 16;
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

        private CheckFirmwareUpdateRequest(k0.b bVar) {
            super(bVar);
            this.productId_ = 0;
            this.firmwareVersion_ = 0;
            this.beta_ = false;
            this.userId_ = 0L;
            this.inviteCode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(CheckFirmwareUpdateRequest checkFirmwareUpdateRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(checkFirmwareUpdateRequest);
        }

        public static CheckFirmwareUpdateRequest parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (CheckFirmwareUpdateRequest) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static CheckFirmwareUpdateRequest parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (CheckFirmwareUpdateRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static CheckFirmwareUpdateRequest parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (CheckFirmwareUpdateRequest) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public CheckFirmwareUpdateRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static CheckFirmwareUpdateRequest parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (CheckFirmwareUpdateRequest) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CheckFirmwareUpdateRequest parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (CheckFirmwareUpdateRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static CheckFirmwareUpdateRequest parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (CheckFirmwareUpdateRequest) PARSER.parseFrom(bArr, yVar);
        }

        public static CheckFirmwareUpdateRequest parseFrom(InputStream inputStream) throws IOException {
            return (CheckFirmwareUpdateRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        private CheckFirmwareUpdateRequest() {
            this.productId_ = 0;
            this.firmwareVersion_ = 0;
            this.beta_ = false;
            this.userId_ = 0L;
            this.inviteCode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CheckFirmwareUpdateRequest parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (CheckFirmwareUpdateRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static CheckFirmwareUpdateRequest parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (CheckFirmwareUpdateRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static CheckFirmwareUpdateRequest parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (CheckFirmwareUpdateRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface CheckFirmwareUpdateRequestOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        boolean getBeta();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        int getFirmwareVersion();

        /* synthetic */ String getInitializationErrorString();

        int getInviteCode();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        int getProductId();

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        long getUserId();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class CheckFirmwareUpdateResult extends com.google.protobuf.k0 implements CheckFirmwareUpdateResultOrBuilder {
        public static final int BASE_FIELD_NUMBER = 2;
        public static final int FIRMWARE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private FirmwareInfo base_;
        private FirmwareInfo firmware_;
        private byte memoizedIsInitialized;
        private static final CheckFirmwareUpdateResult DEFAULT_INSTANCE = new CheckFirmwareUpdateResult();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateResult.1
            @Override // com.google.protobuf.z1
            public CheckFirmwareUpdateResult parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = CheckFirmwareUpdateResult.newBuilder();
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

        public static CheckFirmwareUpdateResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Dm.internal_static_benshikj_CheckFirmwareUpdateResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CheckFirmwareUpdateResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CheckFirmwareUpdateResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CheckFirmwareUpdateResult parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (CheckFirmwareUpdateResult) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CheckFirmwareUpdateResult)) {
                return super.equals(obj);
            }
            CheckFirmwareUpdateResult checkFirmwareUpdateResult = (CheckFirmwareUpdateResult) obj;
            if (hasFirmware() != checkFirmwareUpdateResult.hasFirmware()) {
                return false;
            }
            if ((!hasFirmware() || getFirmware().equals(checkFirmwareUpdateResult.getFirmware())) && hasBase() == checkFirmwareUpdateResult.hasBase()) {
                return (!hasBase() || getBase().equals(checkFirmwareUpdateResult.getBase())) && getUnknownFields().equals(checkFirmwareUpdateResult.getUnknownFields());
            }
            return false;
        }

        @Override // com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateResultOrBuilder
        public FirmwareInfo getBase() {
            FirmwareInfo firmwareInfo = this.base_;
            return firmwareInfo == null ? FirmwareInfo.getDefaultInstance() : firmwareInfo;
        }

        @Override // com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateResultOrBuilder
        public FirmwareInfoOrBuilder getBaseOrBuilder() {
            FirmwareInfo firmwareInfo = this.base_;
            return firmwareInfo == null ? FirmwareInfo.getDefaultInstance() : firmwareInfo;
        }

        @Override // com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateResultOrBuilder
        public FirmwareInfo getFirmware() {
            FirmwareInfo firmwareInfo = this.firmware_;
            return firmwareInfo == null ? FirmwareInfo.getDefaultInstance() : firmwareInfo;
        }

        @Override // com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateResultOrBuilder
        public FirmwareInfoOrBuilder getFirmwareOrBuilder() {
            FirmwareInfo firmwareInfo = this.firmware_;
            return firmwareInfo == null ? FirmwareInfo.getDefaultInstance() : firmwareInfo;
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
            int iG = this.firmware_ != null ? com.google.protobuf.o.G(1, getFirmware()) : 0;
            if (this.base_ != null) {
                iG += com.google.protobuf.o.G(2, getBase());
            }
            int serializedSize = iG + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateResultOrBuilder
        public boolean hasBase() {
            return this.base_ != null;
        }

        @Override // com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateResultOrBuilder
        public boolean hasFirmware() {
            return this.firmware_ != null;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasFirmware()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getFirmware().hashCode();
            }
            if (hasBase()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getBase().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Dm.internal_static_benshikj_CheckFirmwareUpdateResult_fieldAccessorTable.d(CheckFirmwareUpdateResult.class, Builder.class);
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
            return new CheckFirmwareUpdateResult();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if (this.firmware_ != null) {
                oVar.H0(1, getFirmware());
            }
            if (this.base_ != null) {
                oVar.H0(2, getBase());
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements CheckFirmwareUpdateResultOrBuilder {
            private com.google.protobuf.k2 baseBuilder_;
            private FirmwareInfo base_;
            private int bitField0_;
            private com.google.protobuf.k2 firmwareBuilder_;
            private FirmwareInfo firmware_;

            private void buildPartial0(CheckFirmwareUpdateResult checkFirmwareUpdateResult) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    com.google.protobuf.k2 k2Var = this.firmwareBuilder_;
                    checkFirmwareUpdateResult.firmware_ = k2Var == null ? this.firmware_ : (FirmwareInfo) k2Var.b();
                }
                if ((i10 & 2) != 0) {
                    com.google.protobuf.k2 k2Var2 = this.baseBuilder_;
                    checkFirmwareUpdateResult.base_ = k2Var2 == null ? this.base_ : (FirmwareInfo) k2Var2.b();
                }
            }

            private com.google.protobuf.k2 getBaseFieldBuilder() {
                if (this.baseBuilder_ == null) {
                    this.baseBuilder_ = new com.google.protobuf.k2(getBase(), getParentForChildren(), isClean());
                    this.base_ = null;
                }
                return this.baseBuilder_;
            }

            public static final r.b getDescriptor() {
                return Dm.internal_static_benshikj_CheckFirmwareUpdateResult_descriptor;
            }

            private com.google.protobuf.k2 getFirmwareFieldBuilder() {
                if (this.firmwareBuilder_ == null) {
                    this.firmwareBuilder_ = new com.google.protobuf.k2(getFirmware(), getParentForChildren(), isClean());
                    this.firmware_ = null;
                }
                return this.firmwareBuilder_;
            }

            public Builder clearBase() {
                this.bitField0_ &= -3;
                this.base_ = null;
                com.google.protobuf.k2 k2Var = this.baseBuilder_;
                if (k2Var != null) {
                    k2Var.d();
                    this.baseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearFirmware() {
                this.bitField0_ &= -2;
                this.firmware_ = null;
                com.google.protobuf.k2 k2Var = this.firmwareBuilder_;
                if (k2Var != null) {
                    k2Var.d();
                    this.firmwareBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateResultOrBuilder
            public FirmwareInfo getBase() {
                com.google.protobuf.k2 k2Var = this.baseBuilder_;
                if (k2Var != null) {
                    return (FirmwareInfo) k2Var.f();
                }
                FirmwareInfo firmwareInfo = this.base_;
                return firmwareInfo == null ? FirmwareInfo.getDefaultInstance() : firmwareInfo;
            }

            public FirmwareInfo.Builder getBaseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (FirmwareInfo.Builder) getBaseFieldBuilder().e();
            }

            @Override // com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateResultOrBuilder
            public FirmwareInfoOrBuilder getBaseOrBuilder() {
                com.google.protobuf.k2 k2Var = this.baseBuilder_;
                if (k2Var != null) {
                    return (FirmwareInfoOrBuilder) k2Var.g();
                }
                FirmwareInfo firmwareInfo = this.base_;
                return firmwareInfo == null ? FirmwareInfo.getDefaultInstance() : firmwareInfo;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Dm.internal_static_benshikj_CheckFirmwareUpdateResult_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateResultOrBuilder
            public FirmwareInfo getFirmware() {
                com.google.protobuf.k2 k2Var = this.firmwareBuilder_;
                if (k2Var != null) {
                    return (FirmwareInfo) k2Var.f();
                }
                FirmwareInfo firmwareInfo = this.firmware_;
                return firmwareInfo == null ? FirmwareInfo.getDefaultInstance() : firmwareInfo;
            }

            public FirmwareInfo.Builder getFirmwareBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (FirmwareInfo.Builder) getFirmwareFieldBuilder().e();
            }

            @Override // com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateResultOrBuilder
            public FirmwareInfoOrBuilder getFirmwareOrBuilder() {
                com.google.protobuf.k2 k2Var = this.firmwareBuilder_;
                if (k2Var != null) {
                    return (FirmwareInfoOrBuilder) k2Var.g();
                }
                FirmwareInfo firmwareInfo = this.firmware_;
                return firmwareInfo == null ? FirmwareInfo.getDefaultInstance() : firmwareInfo;
            }

            @Override // com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateResultOrBuilder
            public boolean hasBase() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.benshikj.ht.rpc.Dm.CheckFirmwareUpdateResultOrBuilder
            public boolean hasFirmware() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Dm.internal_static_benshikj_CheckFirmwareUpdateResult_fieldAccessorTable.d(CheckFirmwareUpdateResult.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeBase(FirmwareInfo firmwareInfo) {
                FirmwareInfo firmwareInfo2;
                com.google.protobuf.k2 k2Var = this.baseBuilder_;
                if (k2Var != null) {
                    k2Var.h(firmwareInfo);
                } else if ((this.bitField0_ & 2) == 0 || (firmwareInfo2 = this.base_) == null || firmwareInfo2 == FirmwareInfo.getDefaultInstance()) {
                    this.base_ = firmwareInfo;
                } else {
                    getBaseBuilder().mergeFrom(firmwareInfo);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeFirmware(FirmwareInfo firmwareInfo) {
                FirmwareInfo firmwareInfo2;
                com.google.protobuf.k2 k2Var = this.firmwareBuilder_;
                if (k2Var != null) {
                    k2Var.h(firmwareInfo);
                } else if ((this.bitField0_ & 1) == 0 || (firmwareInfo2 = this.firmware_) == null || firmwareInfo2 == FirmwareInfo.getDefaultInstance()) {
                    this.firmware_ = firmwareInfo;
                } else {
                    getFirmwareBuilder().mergeFrom(firmwareInfo);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setBase(FirmwareInfo firmwareInfo) {
                com.google.protobuf.k2 k2Var = this.baseBuilder_;
                if (k2Var == null) {
                    firmwareInfo.getClass();
                    this.base_ = firmwareInfo;
                } else {
                    k2Var.j(firmwareInfo);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setFirmware(FirmwareInfo firmwareInfo) {
                com.google.protobuf.k2 k2Var = this.firmwareBuilder_;
                if (k2Var == null) {
                    firmwareInfo.getClass();
                    this.firmware_ = firmwareInfo;
                } else {
                    k2Var.j(firmwareInfo);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public CheckFirmwareUpdateResult build() {
                CheckFirmwareUpdateResult checkFirmwareUpdateResultBuildPartial = buildPartial();
                if (checkFirmwareUpdateResultBuildPartial.isInitialized()) {
                    return checkFirmwareUpdateResultBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) checkFirmwareUpdateResultBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public CheckFirmwareUpdateResult buildPartial() {
                CheckFirmwareUpdateResult checkFirmwareUpdateResult = new CheckFirmwareUpdateResult(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(checkFirmwareUpdateResult);
                }
                onBuilt();
                return checkFirmwareUpdateResult;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public CheckFirmwareUpdateResult getDefaultInstanceForType() {
                return CheckFirmwareUpdateResult.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m41clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.firmware_ = null;
                com.google.protobuf.k2 k2Var = this.firmwareBuilder_;
                if (k2Var != null) {
                    k2Var.d();
                    this.firmwareBuilder_ = null;
                }
                this.base_ = null;
                com.google.protobuf.k2 k2Var2 = this.baseBuilder_;
                if (k2Var2 != null) {
                    k2Var2.d();
                    this.baseBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m49clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof CheckFirmwareUpdateResult) {
                    return mergeFrom((CheckFirmwareUpdateResult) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder setBase(FirmwareInfo.Builder builder) {
                com.google.protobuf.k2 k2Var = this.baseBuilder_;
                if (k2Var == null) {
                    this.base_ = builder.build();
                } else {
                    k2Var.j(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setFirmware(FirmwareInfo.Builder builder) {
                com.google.protobuf.k2 k2Var = this.firmwareBuilder_;
                if (k2Var == null) {
                    this.firmware_ = builder.build();
                } else {
                    k2Var.j(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder mergeFrom(CheckFirmwareUpdateResult checkFirmwareUpdateResult) {
                if (checkFirmwareUpdateResult == CheckFirmwareUpdateResult.getDefaultInstance()) {
                    return this;
                }
                if (checkFirmwareUpdateResult.hasFirmware()) {
                    mergeFirmware(checkFirmwareUpdateResult.getFirmware());
                }
                if (checkFirmwareUpdateResult.hasBase()) {
                    mergeBase(checkFirmwareUpdateResult.getBase());
                }
                m141mergeUnknownFields(checkFirmwareUpdateResult.getUnknownFields());
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
                                    mVar.B(getFirmwareFieldBuilder().e(), yVar);
                                    this.bitField0_ |= 1;
                                } else if (iK != 18) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    mVar.B(getBaseFieldBuilder().e(), yVar);
                                    this.bitField0_ |= 2;
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

        private CheckFirmwareUpdateResult(k0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(CheckFirmwareUpdateResult checkFirmwareUpdateResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(checkFirmwareUpdateResult);
        }

        public static CheckFirmwareUpdateResult parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (CheckFirmwareUpdateResult) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static CheckFirmwareUpdateResult parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (CheckFirmwareUpdateResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static CheckFirmwareUpdateResult parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (CheckFirmwareUpdateResult) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public CheckFirmwareUpdateResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private CheckFirmwareUpdateResult() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CheckFirmwareUpdateResult parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (CheckFirmwareUpdateResult) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CheckFirmwareUpdateResult parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (CheckFirmwareUpdateResult) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static CheckFirmwareUpdateResult parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (CheckFirmwareUpdateResult) PARSER.parseFrom(bArr, yVar);
        }

        public static CheckFirmwareUpdateResult parseFrom(InputStream inputStream) throws IOException {
            return (CheckFirmwareUpdateResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static CheckFirmwareUpdateResult parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (CheckFirmwareUpdateResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static CheckFirmwareUpdateResult parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (CheckFirmwareUpdateResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static CheckFirmwareUpdateResult parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (CheckFirmwareUpdateResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface CheckFirmwareUpdateResultOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        FirmwareInfo getBase();

        FirmwareInfoOrBuilder getBaseOrBuilder();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        FirmwareInfo getFirmware();

        FirmwareInfoOrBuilder getFirmwareOrBuilder();

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        boolean hasBase();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        boolean hasFirmware();

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class DeviceID extends com.google.protobuf.k0 implements DeviceIDOrBuilder {
        public static final int DATE_FIELD_NUMBER = 3;
        public static final int DID_FIELD_NUMBER = 1;
        public static final int PID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private long dID_;
        private volatile Object date_;
        private byte memoizedIsInitialized;
        private int pID_;
        private static final DeviceID DEFAULT_INSTANCE = new DeviceID();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Dm.DeviceID.1
            @Override // com.google.protobuf.z1
            public DeviceID parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = DeviceID.newBuilder();
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

        public static DeviceID getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Dm.internal_static_benshikj_DeviceID_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeviceID parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeviceID) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeviceID parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (DeviceID) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeviceID)) {
                return super.equals(obj);
            }
            DeviceID deviceID = (DeviceID) obj;
            return getDID() == deviceID.getDID() && getPID() == deviceID.getPID() && getDate().equals(deviceID.getDate()) && getUnknownFields().equals(deviceID.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Dm.DeviceIDOrBuilder
        public long getDID() {
            return this.dID_;
        }

        @Override // com.benshikj.ht.rpc.Dm.DeviceIDOrBuilder
        public String getDate() {
            Object obj = this.date_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.date_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Dm.DeviceIDOrBuilder
        public com.google.protobuf.l getDateBytes() {
            Object obj = this.date_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.date_ = lVarI;
            return lVarI;
        }

        @Override // com.benshikj.ht.rpc.Dm.DeviceIDOrBuilder
        public int getPID() {
            return this.pID_;
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
            long j10 = this.dID_;
            int iZ = j10 != 0 ? com.google.protobuf.o.Z(1, j10) : 0;
            int i11 = this.pID_;
            if (i11 != 0) {
                iZ += com.google.protobuf.o.X(2, i11);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.date_)) {
                iZ += com.google.protobuf.k0.computeStringSize(3, this.date_);
            }
            int serializedSize = iZ + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + com.google.protobuf.o0.i(getDID())) * 37) + 2) * 53) + getPID()) * 37) + 3) * 53) + getDate().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Dm.internal_static_benshikj_DeviceID_fieldAccessorTable.d(DeviceID.class, Builder.class);
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
            return new DeviceID();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            long j10 = this.dID_;
            if (j10 != 0) {
                oVar.U0(1, j10);
            }
            int i10 = this.pID_;
            if (i10 != 0) {
                oVar.S0(2, i10);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.date_)) {
                com.google.protobuf.k0.writeString(oVar, 3, this.date_);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements DeviceIDOrBuilder {
            private int bitField0_;
            private long dID_;
            private Object date_;
            private int pID_;

            private void buildPartial0(DeviceID deviceID) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    deviceID.dID_ = this.dID_;
                }
                if ((i10 & 2) != 0) {
                    deviceID.pID_ = this.pID_;
                }
                if ((i10 & 4) != 0) {
                    deviceID.date_ = this.date_;
                }
            }

            public static final r.b getDescriptor() {
                return Dm.internal_static_benshikj_DeviceID_descriptor;
            }

            public Builder clearDID() {
                this.bitField0_ &= -2;
                this.dID_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearDate() {
                this.date_ = DeviceID.getDefaultInstance().getDate();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearPID() {
                this.bitField0_ &= -3;
                this.pID_ = 0;
                onChanged();
                return this;
            }

            @Override // com.benshikj.ht.rpc.Dm.DeviceIDOrBuilder
            public long getDID() {
                return this.dID_;
            }

            @Override // com.benshikj.ht.rpc.Dm.DeviceIDOrBuilder
            public String getDate() {
                Object obj = this.date_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.date_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Dm.DeviceIDOrBuilder
            public com.google.protobuf.l getDateBytes() {
                Object obj = this.date_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.date_ = lVarI;
                return lVarI;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Dm.internal_static_benshikj_DeviceID_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Dm.DeviceIDOrBuilder
            public int getPID() {
                return this.pID_;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Dm.internal_static_benshikj_DeviceID_fieldAccessorTable.d(DeviceID.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setDID(long j10) {
                this.dID_ = j10;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDate(String str) {
                str.getClass();
                this.date_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setDateBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.date_ = lVar;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPID(int i10) {
                this.pID_ = i10;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            private Builder() {
                this.date_ = "";
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public DeviceID build() {
                DeviceID deviceIDBuildPartial = buildPartial();
                if (deviceIDBuildPartial.isInitialized()) {
                    return deviceIDBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) deviceIDBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public DeviceID buildPartial() {
                DeviceID deviceID = new DeviceID(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(deviceID);
                }
                onBuilt();
                return deviceID;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public DeviceID getDefaultInstanceForType() {
                return DeviceID.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.date_ = "";
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m54clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.dID_ = 0L;
                this.pID_ = 0;
                this.date_ = "";
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m62clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof DeviceID) {
                    return mergeFrom((DeviceID) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(DeviceID deviceID) {
                if (deviceID == DeviceID.getDefaultInstance()) {
                    return this;
                }
                if (deviceID.getDID() != 0) {
                    setDID(deviceID.getDID());
                }
                if (deviceID.getPID() != 0) {
                    setPID(deviceID.getPID());
                }
                if (!deviceID.getDate().isEmpty()) {
                    this.date_ = deviceID.date_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                m141mergeUnknownFields(deviceID.getUnknownFields());
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
                                if (iK == 8) {
                                    this.dID_ = mVar.M();
                                    this.bitField0_ |= 1;
                                } else if (iK == 16) {
                                    this.pID_ = mVar.L();
                                    this.bitField0_ |= 2;
                                } else if (iK != 26) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.date_ = mVar.J();
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

        private DeviceID(k0.b bVar) {
            super(bVar);
            this.dID_ = 0L;
            this.pID_ = 0;
            this.date_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(DeviceID deviceID) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceID);
        }

        public static DeviceID parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (DeviceID) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static DeviceID parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (DeviceID) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static DeviceID parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (DeviceID) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public DeviceID getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static DeviceID parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (DeviceID) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DeviceID parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (DeviceID) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static DeviceID parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (DeviceID) PARSER.parseFrom(bArr, yVar);
        }

        private DeviceID() {
            this.dID_ = 0L;
            this.pID_ = 0;
            this.date_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.date_ = "";
        }

        public static DeviceID parseFrom(InputStream inputStream) throws IOException {
            return (DeviceID) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static DeviceID parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (DeviceID) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static DeviceID parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (DeviceID) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static DeviceID parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (DeviceID) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface DeviceIDOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        long getDID();

        String getDate();

        com.google.protobuf.l getDateBytes();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        int getPID();

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class DeviceRegTimes extends com.google.protobuf.k0 implements DeviceRegTimesOrBuilder {
        public static final int ID_FIELD_NUMBER = 2;
        public static final int REGTIMES_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private DeviceID iD_;
        private byte memoizedIsInitialized;
        private int regTimes_;
        private static final DeviceRegTimes DEFAULT_INSTANCE = new DeviceRegTimes();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Dm.DeviceRegTimes.1
            @Override // com.google.protobuf.z1
            public DeviceRegTimes parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = DeviceRegTimes.newBuilder();
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

        public static DeviceRegTimes getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Dm.internal_static_benshikj_DeviceRegTimes_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeviceRegTimes parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeviceRegTimes) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeviceRegTimes parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (DeviceRegTimes) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeviceRegTimes)) {
                return super.equals(obj);
            }
            DeviceRegTimes deviceRegTimes = (DeviceRegTimes) obj;
            if (getRegTimes() == deviceRegTimes.getRegTimes() && hasID() == deviceRegTimes.hasID()) {
                return (!hasID() || getID().equals(deviceRegTimes.getID())) && getUnknownFields().equals(deviceRegTimes.getUnknownFields());
            }
            return false;
        }

        @Override // com.benshikj.ht.rpc.Dm.DeviceRegTimesOrBuilder
        public DeviceID getID() {
            DeviceID deviceID = this.iD_;
            return deviceID == null ? DeviceID.getDefaultInstance() : deviceID;
        }

        @Override // com.benshikj.ht.rpc.Dm.DeviceRegTimesOrBuilder
        public DeviceIDOrBuilder getIDOrBuilder() {
            DeviceID deviceID = this.iD_;
            return deviceID == null ? DeviceID.getDefaultInstance() : deviceID;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.benshikj.ht.rpc.Dm.DeviceRegTimesOrBuilder
        public int getRegTimes() {
            return this.regTimes_;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.regTimes_;
            int iX = i11 != 0 ? com.google.protobuf.o.x(1, i11) : 0;
            if (this.iD_ != null) {
                iX += com.google.protobuf.o.G(2, getID());
            }
            int serializedSize = iX + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.benshikj.ht.rpc.Dm.DeviceRegTimesOrBuilder
        public boolean hasID() {
            return this.iD_ != null;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getRegTimes();
            if (hasID()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getID().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Dm.internal_static_benshikj_DeviceRegTimes_fieldAccessorTable.d(DeviceRegTimes.class, Builder.class);
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
            return new DeviceRegTimes();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            int i10 = this.regTimes_;
            if (i10 != 0) {
                oVar.D0(1, i10);
            }
            if (this.iD_ != null) {
                oVar.H0(2, getID());
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements DeviceRegTimesOrBuilder {
            private int bitField0_;
            private com.google.protobuf.k2 iDBuilder_;
            private DeviceID iD_;
            private int regTimes_;

            private void buildPartial0(DeviceRegTimes deviceRegTimes) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    deviceRegTimes.regTimes_ = this.regTimes_;
                }
                if ((i10 & 2) != 0) {
                    com.google.protobuf.k2 k2Var = this.iDBuilder_;
                    deviceRegTimes.iD_ = k2Var == null ? this.iD_ : (DeviceID) k2Var.b();
                }
            }

            public static final r.b getDescriptor() {
                return Dm.internal_static_benshikj_DeviceRegTimes_descriptor;
            }

            private com.google.protobuf.k2 getIDFieldBuilder() {
                if (this.iDBuilder_ == null) {
                    this.iDBuilder_ = new com.google.protobuf.k2(getID(), getParentForChildren(), isClean());
                    this.iD_ = null;
                }
                return this.iDBuilder_;
            }

            public Builder clearID() {
                this.bitField0_ &= -3;
                this.iD_ = null;
                com.google.protobuf.k2 k2Var = this.iDBuilder_;
                if (k2Var != null) {
                    k2Var.d();
                    this.iDBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRegTimes() {
                this.bitField0_ &= -2;
                this.regTimes_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Dm.internal_static_benshikj_DeviceRegTimes_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Dm.DeviceRegTimesOrBuilder
            public DeviceID getID() {
                com.google.protobuf.k2 k2Var = this.iDBuilder_;
                if (k2Var != null) {
                    return (DeviceID) k2Var.f();
                }
                DeviceID deviceID = this.iD_;
                return deviceID == null ? DeviceID.getDefaultInstance() : deviceID;
            }

            public DeviceID.Builder getIDBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (DeviceID.Builder) getIDFieldBuilder().e();
            }

            @Override // com.benshikj.ht.rpc.Dm.DeviceRegTimesOrBuilder
            public DeviceIDOrBuilder getIDOrBuilder() {
                com.google.protobuf.k2 k2Var = this.iDBuilder_;
                if (k2Var != null) {
                    return (DeviceIDOrBuilder) k2Var.g();
                }
                DeviceID deviceID = this.iD_;
                return deviceID == null ? DeviceID.getDefaultInstance() : deviceID;
            }

            @Override // com.benshikj.ht.rpc.Dm.DeviceRegTimesOrBuilder
            public int getRegTimes() {
                return this.regTimes_;
            }

            @Override // com.benshikj.ht.rpc.Dm.DeviceRegTimesOrBuilder
            public boolean hasID() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Dm.internal_static_benshikj_DeviceRegTimes_fieldAccessorTable.d(DeviceRegTimes.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeID(DeviceID deviceID) {
                DeviceID deviceID2;
                com.google.protobuf.k2 k2Var = this.iDBuilder_;
                if (k2Var != null) {
                    k2Var.h(deviceID);
                } else if ((this.bitField0_ & 2) == 0 || (deviceID2 = this.iD_) == null || deviceID2 == DeviceID.getDefaultInstance()) {
                    this.iD_ = deviceID;
                } else {
                    getIDBuilder().mergeFrom(deviceID);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setID(DeviceID deviceID) {
                com.google.protobuf.k2 k2Var = this.iDBuilder_;
                if (k2Var == null) {
                    deviceID.getClass();
                    this.iD_ = deviceID;
                } else {
                    k2Var.j(deviceID);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setRegTimes(int i10) {
                this.regTimes_ = i10;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public DeviceRegTimes build() {
                DeviceRegTimes deviceRegTimesBuildPartial = buildPartial();
                if (deviceRegTimesBuildPartial.isInitialized()) {
                    return deviceRegTimesBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) deviceRegTimesBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public DeviceRegTimes buildPartial() {
                DeviceRegTimes deviceRegTimes = new DeviceRegTimes(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(deviceRegTimes);
                }
                onBuilt();
                return deviceRegTimes;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public DeviceRegTimes getDefaultInstanceForType() {
                return DeviceRegTimes.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m67clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.regTimes_ = 0;
                this.iD_ = null;
                com.google.protobuf.k2 k2Var = this.iDBuilder_;
                if (k2Var != null) {
                    k2Var.d();
                    this.iDBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m75clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof DeviceRegTimes) {
                    return mergeFrom((DeviceRegTimes) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder setID(DeviceID.Builder builder) {
                com.google.protobuf.k2 k2Var = this.iDBuilder_;
                if (k2Var == null) {
                    this.iD_ = builder.build();
                } else {
                    k2Var.j(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeFrom(DeviceRegTimes deviceRegTimes) {
                if (deviceRegTimes == DeviceRegTimes.getDefaultInstance()) {
                    return this;
                }
                if (deviceRegTimes.getRegTimes() != 0) {
                    setRegTimes(deviceRegTimes.getRegTimes());
                }
                if (deviceRegTimes.hasID()) {
                    mergeID(deviceRegTimes.getID());
                }
                m141mergeUnknownFields(deviceRegTimes.getUnknownFields());
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
                                if (iK == 8) {
                                    this.regTimes_ = mVar.y();
                                    this.bitField0_ |= 1;
                                } else if (iK != 18) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    mVar.B(getIDFieldBuilder().e(), yVar);
                                    this.bitField0_ |= 2;
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

        private DeviceRegTimes(k0.b bVar) {
            super(bVar);
            this.regTimes_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(DeviceRegTimes deviceRegTimes) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceRegTimes);
        }

        public static DeviceRegTimes parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (DeviceRegTimes) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static DeviceRegTimes parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (DeviceRegTimes) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static DeviceRegTimes parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (DeviceRegTimes) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public DeviceRegTimes getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static DeviceRegTimes parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (DeviceRegTimes) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private DeviceRegTimes() {
            this.regTimes_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceRegTimes parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (DeviceRegTimes) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static DeviceRegTimes parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (DeviceRegTimes) PARSER.parseFrom(bArr, yVar);
        }

        public static DeviceRegTimes parseFrom(InputStream inputStream) throws IOException {
            return (DeviceRegTimes) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static DeviceRegTimes parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (DeviceRegTimes) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static DeviceRegTimes parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (DeviceRegTimes) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static DeviceRegTimes parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (DeviceRegTimes) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface DeviceRegTimesOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        DeviceID getID();

        DeviceIDOrBuilder getIDOrBuilder();

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        int getRegTimes();

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        boolean hasID();

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class FirmwareInfo extends com.google.protobuf.k0 implements FirmwareInfoOrBuilder {
        public static final int MD5_FIELD_NUMBER = 3;
        public static final int RELEASEDATE_FIELD_NUMBER = 5;
        public static final int RELEASENOTES_FIELD_NUMBER = 4;
        public static final int URL_FIELD_NUMBER = 2;
        public static final int VERSION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object md5_;
        private byte memoizedIsInitialized;
        private long releaseDate_;
        private volatile Object releaseNotes_;
        private volatile Object url_;
        private int version_;
        private static final FirmwareInfo DEFAULT_INSTANCE = new FirmwareInfo();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Dm.FirmwareInfo.1
            @Override // com.google.protobuf.z1
            public FirmwareInfo parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = FirmwareInfo.newBuilder();
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

        public static FirmwareInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Dm.internal_static_benshikj_FirmwareInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FirmwareInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FirmwareInfo) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FirmwareInfo parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (FirmwareInfo) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FirmwareInfo)) {
                return super.equals(obj);
            }
            FirmwareInfo firmwareInfo = (FirmwareInfo) obj;
            return getVersion() == firmwareInfo.getVersion() && getUrl().equals(firmwareInfo.getUrl()) && getMd5().equals(firmwareInfo.getMd5()) && getReleaseNotes().equals(firmwareInfo.getReleaseNotes()) && getReleaseDate() == firmwareInfo.getReleaseDate() && getUnknownFields().equals(firmwareInfo.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Dm.FirmwareInfoOrBuilder
        public String getMd5() {
            Object obj = this.md5_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.md5_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Dm.FirmwareInfoOrBuilder
        public com.google.protobuf.l getMd5Bytes() {
            Object obj = this.md5_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.md5_ = lVarI;
            return lVarI;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.benshikj.ht.rpc.Dm.FirmwareInfoOrBuilder
        public long getReleaseDate() {
            return this.releaseDate_;
        }

        @Override // com.benshikj.ht.rpc.Dm.FirmwareInfoOrBuilder
        public String getReleaseNotes() {
            Object obj = this.releaseNotes_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.releaseNotes_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Dm.FirmwareInfoOrBuilder
        public com.google.protobuf.l getReleaseNotesBytes() {
            Object obj = this.releaseNotes_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.releaseNotes_ = lVarI;
            return lVarI;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.version_;
            int iX = i11 != 0 ? com.google.protobuf.o.x(1, i11) : 0;
            if (!com.google.protobuf.k0.isStringEmpty(this.url_)) {
                iX += com.google.protobuf.k0.computeStringSize(2, this.url_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.md5_)) {
                iX += com.google.protobuf.k0.computeStringSize(3, this.md5_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.releaseNotes_)) {
                iX += com.google.protobuf.k0.computeStringSize(4, this.releaseNotes_);
            }
            long j10 = this.releaseDate_;
            if (j10 != 0) {
                iX += com.google.protobuf.o.z(5, j10);
            }
            int serializedSize = iX + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.benshikj.ht.rpc.Dm.FirmwareInfoOrBuilder
        public String getUrl() {
            Object obj = this.url_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.url_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Dm.FirmwareInfoOrBuilder
        public com.google.protobuf.l getUrlBytes() {
            Object obj = this.url_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.url_ = lVarI;
            return lVarI;
        }

        @Override // com.benshikj.ht.rpc.Dm.FirmwareInfoOrBuilder
        public int getVersion() {
            return this.version_;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getVersion()) * 37) + 2) * 53) + getUrl().hashCode()) * 37) + 3) * 53) + getMd5().hashCode()) * 37) + 4) * 53) + getReleaseNotes().hashCode()) * 37) + 5) * 53) + com.google.protobuf.o0.i(getReleaseDate())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Dm.internal_static_benshikj_FirmwareInfo_fieldAccessorTable.d(FirmwareInfo.class, Builder.class);
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
            return new FirmwareInfo();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            int i10 = this.version_;
            if (i10 != 0) {
                oVar.D0(1, i10);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.url_)) {
                com.google.protobuf.k0.writeString(oVar, 2, this.url_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.md5_)) {
                com.google.protobuf.k0.writeString(oVar, 3, this.md5_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.releaseNotes_)) {
                com.google.protobuf.k0.writeString(oVar, 4, this.releaseNotes_);
            }
            long j10 = this.releaseDate_;
            if (j10 != 0) {
                oVar.F0(5, j10);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements FirmwareInfoOrBuilder {
            private int bitField0_;
            private Object md5_;
            private long releaseDate_;
            private Object releaseNotes_;
            private Object url_;
            private int version_;

            private void buildPartial0(FirmwareInfo firmwareInfo) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    firmwareInfo.version_ = this.version_;
                }
                if ((i10 & 2) != 0) {
                    firmwareInfo.url_ = this.url_;
                }
                if ((i10 & 4) != 0) {
                    firmwareInfo.md5_ = this.md5_;
                }
                if ((i10 & 8) != 0) {
                    firmwareInfo.releaseNotes_ = this.releaseNotes_;
                }
                if ((i10 & 16) != 0) {
                    firmwareInfo.releaseDate_ = this.releaseDate_;
                }
            }

            public static final r.b getDescriptor() {
                return Dm.internal_static_benshikj_FirmwareInfo_descriptor;
            }

            public Builder clearMd5() {
                this.md5_ = FirmwareInfo.getDefaultInstance().getMd5();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearReleaseDate() {
                this.bitField0_ &= -17;
                this.releaseDate_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearReleaseNotes() {
                this.releaseNotes_ = FirmwareInfo.getDefaultInstance().getReleaseNotes();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearUrl() {
                this.url_ = FirmwareInfo.getDefaultInstance().getUrl();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearVersion() {
                this.bitField0_ &= -2;
                this.version_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Dm.internal_static_benshikj_FirmwareInfo_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Dm.FirmwareInfoOrBuilder
            public String getMd5() {
                Object obj = this.md5_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.md5_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Dm.FirmwareInfoOrBuilder
            public com.google.protobuf.l getMd5Bytes() {
                Object obj = this.md5_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.md5_ = lVarI;
                return lVarI;
            }

            @Override // com.benshikj.ht.rpc.Dm.FirmwareInfoOrBuilder
            public long getReleaseDate() {
                return this.releaseDate_;
            }

            @Override // com.benshikj.ht.rpc.Dm.FirmwareInfoOrBuilder
            public String getReleaseNotes() {
                Object obj = this.releaseNotes_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.releaseNotes_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Dm.FirmwareInfoOrBuilder
            public com.google.protobuf.l getReleaseNotesBytes() {
                Object obj = this.releaseNotes_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.releaseNotes_ = lVarI;
                return lVarI;
            }

            @Override // com.benshikj.ht.rpc.Dm.FirmwareInfoOrBuilder
            public String getUrl() {
                Object obj = this.url_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.url_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Dm.FirmwareInfoOrBuilder
            public com.google.protobuf.l getUrlBytes() {
                Object obj = this.url_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.url_ = lVarI;
                return lVarI;
            }

            @Override // com.benshikj.ht.rpc.Dm.FirmwareInfoOrBuilder
            public int getVersion() {
                return this.version_;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Dm.internal_static_benshikj_FirmwareInfo_fieldAccessorTable.d(FirmwareInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setMd5(String str) {
                str.getClass();
                this.md5_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMd5Bytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.md5_ = lVar;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setReleaseDate(long j10) {
                this.releaseDate_ = j10;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setReleaseNotes(String str) {
                str.getClass();
                this.releaseNotes_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setReleaseNotesBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.releaseNotes_ = lVar;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setUrl(String str) {
                str.getClass();
                this.url_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUrlBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.url_ = lVar;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setVersion(int i10) {
                this.version_ = i10;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                this.url_ = "";
                this.md5_ = "";
                this.releaseNotes_ = "";
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public FirmwareInfo build() {
                FirmwareInfo firmwareInfoBuildPartial = buildPartial();
                if (firmwareInfoBuildPartial.isInitialized()) {
                    return firmwareInfoBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) firmwareInfoBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public FirmwareInfo buildPartial() {
                FirmwareInfo firmwareInfo = new FirmwareInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(firmwareInfo);
                }
                onBuilt();
                return firmwareInfo;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public FirmwareInfo getDefaultInstanceForType() {
                return FirmwareInfo.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m80clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.version_ = 0;
                this.url_ = "";
                this.md5_ = "";
                this.releaseNotes_ = "";
                this.releaseDate_ = 0L;
                return this;
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.url_ = "";
                this.md5_ = "";
                this.releaseNotes_ = "";
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m88clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof FirmwareInfo) {
                    return mergeFrom((FirmwareInfo) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(FirmwareInfo firmwareInfo) {
                if (firmwareInfo == FirmwareInfo.getDefaultInstance()) {
                    return this;
                }
                if (firmwareInfo.getVersion() != 0) {
                    setVersion(firmwareInfo.getVersion());
                }
                if (!firmwareInfo.getUrl().isEmpty()) {
                    this.url_ = firmwareInfo.url_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!firmwareInfo.getMd5().isEmpty()) {
                    this.md5_ = firmwareInfo.md5_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (!firmwareInfo.getReleaseNotes().isEmpty()) {
                    this.releaseNotes_ = firmwareInfo.releaseNotes_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (firmwareInfo.getReleaseDate() != 0) {
                    setReleaseDate(firmwareInfo.getReleaseDate());
                }
                m141mergeUnknownFields(firmwareInfo.getUnknownFields());
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
                                if (iK == 8) {
                                    this.version_ = mVar.y();
                                    this.bitField0_ |= 1;
                                } else if (iK == 18) {
                                    this.url_ = mVar.J();
                                    this.bitField0_ |= 2;
                                } else if (iK == 26) {
                                    this.md5_ = mVar.J();
                                    this.bitField0_ |= 4;
                                } else if (iK == 34) {
                                    this.releaseNotes_ = mVar.J();
                                    this.bitField0_ |= 8;
                                } else if (iK != 40) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.releaseDate_ = mVar.z();
                                    this.bitField0_ |= 16;
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

        private FirmwareInfo(k0.b bVar) {
            super(bVar);
            this.version_ = 0;
            this.url_ = "";
            this.md5_ = "";
            this.releaseNotes_ = "";
            this.releaseDate_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(FirmwareInfo firmwareInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(firmwareInfo);
        }

        public static FirmwareInfo parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (FirmwareInfo) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static FirmwareInfo parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (FirmwareInfo) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static FirmwareInfo parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (FirmwareInfo) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public FirmwareInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static FirmwareInfo parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (FirmwareInfo) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FirmwareInfo parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (FirmwareInfo) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static FirmwareInfo parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (FirmwareInfo) PARSER.parseFrom(bArr, yVar);
        }

        public static FirmwareInfo parseFrom(InputStream inputStream) throws IOException {
            return (FirmwareInfo) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        private FirmwareInfo() {
            this.version_ = 0;
            this.url_ = "";
            this.md5_ = "";
            this.releaseNotes_ = "";
            this.releaseDate_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
            this.url_ = "";
            this.md5_ = "";
            this.releaseNotes_ = "";
        }

        public static FirmwareInfo parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (FirmwareInfo) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static FirmwareInfo parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (FirmwareInfo) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static FirmwareInfo parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (FirmwareInfo) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface FirmwareInfoOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        String getMd5();

        com.google.protobuf.l getMd5Bytes();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        long getReleaseDate();

        String getReleaseNotes();

        com.google.protobuf.l getReleaseNotesBytes();

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        String getUrl();

        com.google.protobuf.l getUrlBytes();

        int getVersion();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class GetDeviceRegTimesRequest extends com.google.protobuf.k0 implements GetDeviceRegTimesRequestOrBuilder {
        public static final int DEVID_FIELD_NUMBER = 2;
        public static final int PRODUCTID_FIELD_NUMBER = 1;
        public static final int REQDEVID_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private com.google.protobuf.l devId_;
        private byte memoizedIsInitialized;
        private int productId_;
        private boolean reqDevID_;
        private static final GetDeviceRegTimesRequest DEFAULT_INSTANCE = new GetDeviceRegTimesRequest();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Dm.GetDeviceRegTimesRequest.1
            @Override // com.google.protobuf.z1
            public GetDeviceRegTimesRequest parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = GetDeviceRegTimesRequest.newBuilder();
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

        public static GetDeviceRegTimesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Dm.internal_static_benshikj_GetDeviceRegTimesRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetDeviceRegTimesRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetDeviceRegTimesRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetDeviceRegTimesRequest parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (GetDeviceRegTimesRequest) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetDeviceRegTimesRequest)) {
                return super.equals(obj);
            }
            GetDeviceRegTimesRequest getDeviceRegTimesRequest = (GetDeviceRegTimesRequest) obj;
            return getProductId() == getDeviceRegTimesRequest.getProductId() && getDevId().equals(getDeviceRegTimesRequest.getDevId()) && getReqDevID() == getDeviceRegTimesRequest.getReqDevID() && getUnknownFields().equals(getDeviceRegTimesRequest.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Dm.GetDeviceRegTimesRequestOrBuilder
        public com.google.protobuf.l getDevId() {
            return this.devId_;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.benshikj.ht.rpc.Dm.GetDeviceRegTimesRequestOrBuilder
        public int getProductId() {
            return this.productId_;
        }

        @Override // com.benshikj.ht.rpc.Dm.GetDeviceRegTimesRequestOrBuilder
        public boolean getReqDevID() {
            return this.reqDevID_;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.productId_;
            int iX = i11 != 0 ? com.google.protobuf.o.x(1, i11) : 0;
            if (!this.devId_.isEmpty()) {
                iX += com.google.protobuf.o.h(2, this.devId_);
            }
            boolean z10 = this.reqDevID_;
            if (z10) {
                iX += com.google.protobuf.o.e(3, z10);
            }
            int serializedSize = iX + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getProductId()) * 37) + 2) * 53) + getDevId().hashCode()) * 37) + 3) * 53) + com.google.protobuf.o0.d(getReqDevID())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Dm.internal_static_benshikj_GetDeviceRegTimesRequest_fieldAccessorTable.d(GetDeviceRegTimesRequest.class, Builder.class);
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
            return new GetDeviceRegTimesRequest();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            int i10 = this.productId_;
            if (i10 != 0) {
                oVar.D0(1, i10);
            }
            if (!this.devId_.isEmpty()) {
                oVar.q0(2, this.devId_);
            }
            boolean z10 = this.reqDevID_;
            if (z10) {
                oVar.m0(3, z10);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements GetDeviceRegTimesRequestOrBuilder {
            private int bitField0_;
            private com.google.protobuf.l devId_;
            private int productId_;
            private boolean reqDevID_;

            private void buildPartial0(GetDeviceRegTimesRequest getDeviceRegTimesRequest) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    getDeviceRegTimesRequest.productId_ = this.productId_;
                }
                if ((i10 & 2) != 0) {
                    getDeviceRegTimesRequest.devId_ = this.devId_;
                }
                if ((i10 & 4) != 0) {
                    getDeviceRegTimesRequest.reqDevID_ = this.reqDevID_;
                }
            }

            public static final r.b getDescriptor() {
                return Dm.internal_static_benshikj_GetDeviceRegTimesRequest_descriptor;
            }

            public Builder clearDevId() {
                this.bitField0_ &= -3;
                this.devId_ = GetDeviceRegTimesRequest.getDefaultInstance().getDevId();
                onChanged();
                return this;
            }

            public Builder clearProductId() {
                this.bitField0_ &= -2;
                this.productId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearReqDevID() {
                this.bitField0_ &= -5;
                this.reqDevID_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Dm.internal_static_benshikj_GetDeviceRegTimesRequest_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Dm.GetDeviceRegTimesRequestOrBuilder
            public com.google.protobuf.l getDevId() {
                return this.devId_;
            }

            @Override // com.benshikj.ht.rpc.Dm.GetDeviceRegTimesRequestOrBuilder
            public int getProductId() {
                return this.productId_;
            }

            @Override // com.benshikj.ht.rpc.Dm.GetDeviceRegTimesRequestOrBuilder
            public boolean getReqDevID() {
                return this.reqDevID_;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Dm.internal_static_benshikj_GetDeviceRegTimesRequest_fieldAccessorTable.d(GetDeviceRegTimesRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setDevId(com.google.protobuf.l lVar) {
                lVar.getClass();
                this.devId_ = lVar;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setProductId(int i10) {
                this.productId_ = i10;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setReqDevID(boolean z10) {
                this.reqDevID_ = z10;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            private Builder() {
                this.devId_ = com.google.protobuf.l.f9119b;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetDeviceRegTimesRequest build() {
                GetDeviceRegTimesRequest getDeviceRegTimesRequestBuildPartial = buildPartial();
                if (getDeviceRegTimesRequestBuildPartial.isInitialized()) {
                    return getDeviceRegTimesRequestBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) getDeviceRegTimesRequestBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetDeviceRegTimesRequest buildPartial() {
                GetDeviceRegTimesRequest getDeviceRegTimesRequest = new GetDeviceRegTimesRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(getDeviceRegTimesRequest);
                }
                onBuilt();
                return getDeviceRegTimesRequest;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public GetDeviceRegTimesRequest getDefaultInstanceForType() {
                return GetDeviceRegTimesRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.devId_ = com.google.protobuf.l.f9119b;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m93clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.productId_ = 0;
                this.devId_ = com.google.protobuf.l.f9119b;
                this.reqDevID_ = false;
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m101clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof GetDeviceRegTimesRequest) {
                    return mergeFrom((GetDeviceRegTimesRequest) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(GetDeviceRegTimesRequest getDeviceRegTimesRequest) {
                if (getDeviceRegTimesRequest == GetDeviceRegTimesRequest.getDefaultInstance()) {
                    return this;
                }
                if (getDeviceRegTimesRequest.getProductId() != 0) {
                    setProductId(getDeviceRegTimesRequest.getProductId());
                }
                if (getDeviceRegTimesRequest.getDevId() != com.google.protobuf.l.f9119b) {
                    setDevId(getDeviceRegTimesRequest.getDevId());
                }
                if (getDeviceRegTimesRequest.getReqDevID()) {
                    setReqDevID(getDeviceRegTimesRequest.getReqDevID());
                }
                m141mergeUnknownFields(getDeviceRegTimesRequest.getUnknownFields());
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
                                if (iK == 8) {
                                    this.productId_ = mVar.y();
                                    this.bitField0_ |= 1;
                                } else if (iK == 18) {
                                    this.devId_ = mVar.r();
                                    this.bitField0_ |= 2;
                                } else if (iK != 24) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.reqDevID_ = mVar.q();
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

        private GetDeviceRegTimesRequest(k0.b bVar) {
            super(bVar);
            this.productId_ = 0;
            this.devId_ = com.google.protobuf.l.f9119b;
            this.reqDevID_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(GetDeviceRegTimesRequest getDeviceRegTimesRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getDeviceRegTimesRequest);
        }

        public static GetDeviceRegTimesRequest parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetDeviceRegTimesRequest) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static GetDeviceRegTimesRequest parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetDeviceRegTimesRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static GetDeviceRegTimesRequest parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (GetDeviceRegTimesRequest) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public GetDeviceRegTimesRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static GetDeviceRegTimesRequest parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetDeviceRegTimesRequest) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetDeviceRegTimesRequest parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (GetDeviceRegTimesRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static GetDeviceRegTimesRequest parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetDeviceRegTimesRequest) PARSER.parseFrom(bArr, yVar);
        }

        private GetDeviceRegTimesRequest() {
            this.productId_ = 0;
            com.google.protobuf.l lVar = com.google.protobuf.l.f9119b;
            this.reqDevID_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.devId_ = lVar;
        }

        public static GetDeviceRegTimesRequest parseFrom(InputStream inputStream) throws IOException {
            return (GetDeviceRegTimesRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static GetDeviceRegTimesRequest parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetDeviceRegTimesRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static GetDeviceRegTimesRequest parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (GetDeviceRegTimesRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static GetDeviceRegTimesRequest parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (GetDeviceRegTimesRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface GetDeviceRegTimesRequestOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        com.google.protobuf.l getDevId();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        int getProductId();

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        boolean getReqDevID();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class GetIDInfoRequest extends com.google.protobuf.k0 implements GetIDInfoRequestOrBuilder {
        public static final int DEVID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private com.google.protobuf.l devId_;
        private byte memoizedIsInitialized;
        private static final GetIDInfoRequest DEFAULT_INSTANCE = new GetIDInfoRequest();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Dm.GetIDInfoRequest.1
            @Override // com.google.protobuf.z1
            public GetIDInfoRequest parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = GetIDInfoRequest.newBuilder();
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

        public static GetIDInfoRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Dm.internal_static_benshikj_GetIDInfoRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetIDInfoRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetIDInfoRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetIDInfoRequest parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (GetIDInfoRequest) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetIDInfoRequest)) {
                return super.equals(obj);
            }
            GetIDInfoRequest getIDInfoRequest = (GetIDInfoRequest) obj;
            return getDevId().equals(getIDInfoRequest.getDevId()) && getUnknownFields().equals(getIDInfoRequest.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Dm.GetIDInfoRequestOrBuilder
        public com.google.protobuf.l getDevId() {
            return this.devId_;
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
            int iH = (!this.devId_.isEmpty() ? com.google.protobuf.o.h(1, this.devId_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iH;
            return iH;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getDevId().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Dm.internal_static_benshikj_GetIDInfoRequest_fieldAccessorTable.d(GetIDInfoRequest.class, Builder.class);
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
            return new GetIDInfoRequest();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if (!this.devId_.isEmpty()) {
                oVar.q0(1, this.devId_);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements GetIDInfoRequestOrBuilder {
            private int bitField0_;
            private com.google.protobuf.l devId_;

            private void buildPartial0(GetIDInfoRequest getIDInfoRequest) {
                if ((this.bitField0_ & 1) != 0) {
                    getIDInfoRequest.devId_ = this.devId_;
                }
            }

            public static final r.b getDescriptor() {
                return Dm.internal_static_benshikj_GetIDInfoRequest_descriptor;
            }

            public Builder clearDevId() {
                this.bitField0_ &= -2;
                this.devId_ = GetIDInfoRequest.getDefaultInstance().getDevId();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Dm.internal_static_benshikj_GetIDInfoRequest_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Dm.GetIDInfoRequestOrBuilder
            public com.google.protobuf.l getDevId() {
                return this.devId_;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Dm.internal_static_benshikj_GetIDInfoRequest_fieldAccessorTable.d(GetIDInfoRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setDevId(com.google.protobuf.l lVar) {
                lVar.getClass();
                this.devId_ = lVar;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                this.devId_ = com.google.protobuf.l.f9119b;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetIDInfoRequest build() {
                GetIDInfoRequest getIDInfoRequestBuildPartial = buildPartial();
                if (getIDInfoRequestBuildPartial.isInitialized()) {
                    return getIDInfoRequestBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) getIDInfoRequestBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetIDInfoRequest buildPartial() {
                GetIDInfoRequest getIDInfoRequest = new GetIDInfoRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(getIDInfoRequest);
                }
                onBuilt();
                return getIDInfoRequest;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public GetIDInfoRequest getDefaultInstanceForType() {
                return GetIDInfoRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.devId_ = com.google.protobuf.l.f9119b;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m106clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.devId_ = com.google.protobuf.l.f9119b;
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m114clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof GetIDInfoRequest) {
                    return mergeFrom((GetIDInfoRequest) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(GetIDInfoRequest getIDInfoRequest) {
                if (getIDInfoRequest == GetIDInfoRequest.getDefaultInstance()) {
                    return this;
                }
                if (getIDInfoRequest.getDevId() != com.google.protobuf.l.f9119b) {
                    setDevId(getIDInfoRequest.getDevId());
                }
                m141mergeUnknownFields(getIDInfoRequest.getUnknownFields());
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
                                if (iK != 10) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.devId_ = mVar.r();
                                    this.bitField0_ |= 1;
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

        private GetIDInfoRequest(k0.b bVar) {
            super(bVar);
            this.devId_ = com.google.protobuf.l.f9119b;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(GetIDInfoRequest getIDInfoRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getIDInfoRequest);
        }

        public static GetIDInfoRequest parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetIDInfoRequest) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static GetIDInfoRequest parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetIDInfoRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static GetIDInfoRequest parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (GetIDInfoRequest) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public GetIDInfoRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static GetIDInfoRequest parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetIDInfoRequest) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private GetIDInfoRequest() {
            com.google.protobuf.l lVar = com.google.protobuf.l.f9119b;
            this.memoizedIsInitialized = (byte) -1;
            this.devId_ = lVar;
        }

        public static GetIDInfoRequest parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (GetIDInfoRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static GetIDInfoRequest parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetIDInfoRequest) PARSER.parseFrom(bArr, yVar);
        }

        public static GetIDInfoRequest parseFrom(InputStream inputStream) throws IOException {
            return (GetIDInfoRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static GetIDInfoRequest parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetIDInfoRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static GetIDInfoRequest parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (GetIDInfoRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static GetIDInfoRequest parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (GetIDInfoRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface GetIDInfoRequestOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        com.google.protobuf.l getDevId();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class GetIDInfoResult extends com.google.protobuf.k0 implements GetIDInfoResultOrBuilder {
        public static final int INFO_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object info_;
        private byte memoizedIsInitialized;
        private static final GetIDInfoResult DEFAULT_INSTANCE = new GetIDInfoResult();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Dm.GetIDInfoResult.1
            @Override // com.google.protobuf.z1
            public GetIDInfoResult parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = GetIDInfoResult.newBuilder();
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

        public static GetIDInfoResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Dm.internal_static_benshikj_GetIDInfoResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetIDInfoResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetIDInfoResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetIDInfoResult parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (GetIDInfoResult) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetIDInfoResult)) {
                return super.equals(obj);
            }
            GetIDInfoResult getIDInfoResult = (GetIDInfoResult) obj;
            return getInfo().equals(getIDInfoResult.getInfo()) && getUnknownFields().equals(getIDInfoResult.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Dm.GetIDInfoResultOrBuilder
        public String getInfo() {
            Object obj = this.info_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.info_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Dm.GetIDInfoResultOrBuilder
        public com.google.protobuf.l getInfoBytes() {
            Object obj = this.info_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.info_ = lVarI;
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
            int iComputeStringSize = (!com.google.protobuf.k0.isStringEmpty(this.info_) ? com.google.protobuf.k0.computeStringSize(1, this.info_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeStringSize;
            return iComputeStringSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getInfo().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Dm.internal_static_benshikj_GetIDInfoResult_fieldAccessorTable.d(GetIDInfoResult.class, Builder.class);
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
            return new GetIDInfoResult();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if (!com.google.protobuf.k0.isStringEmpty(this.info_)) {
                com.google.protobuf.k0.writeString(oVar, 1, this.info_);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements GetIDInfoResultOrBuilder {
            private int bitField0_;
            private Object info_;

            private void buildPartial0(GetIDInfoResult getIDInfoResult) {
                if ((this.bitField0_ & 1) != 0) {
                    getIDInfoResult.info_ = this.info_;
                }
            }

            public static final r.b getDescriptor() {
                return Dm.internal_static_benshikj_GetIDInfoResult_descriptor;
            }

            public Builder clearInfo() {
                this.info_ = GetIDInfoResult.getDefaultInstance().getInfo();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Dm.internal_static_benshikj_GetIDInfoResult_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Dm.GetIDInfoResultOrBuilder
            public String getInfo() {
                Object obj = this.info_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.info_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Dm.GetIDInfoResultOrBuilder
            public com.google.protobuf.l getInfoBytes() {
                Object obj = this.info_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.info_ = lVarI;
                return lVarI;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Dm.internal_static_benshikj_GetIDInfoResult_fieldAccessorTable.d(GetIDInfoResult.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setInfo(String str) {
                str.getClass();
                this.info_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setInfoBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.info_ = lVar;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                this.info_ = "";
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetIDInfoResult build() {
                GetIDInfoResult getIDInfoResultBuildPartial = buildPartial();
                if (getIDInfoResultBuildPartial.isInitialized()) {
                    return getIDInfoResultBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) getIDInfoResultBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetIDInfoResult buildPartial() {
                GetIDInfoResult getIDInfoResult = new GetIDInfoResult(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(getIDInfoResult);
                }
                onBuilt();
                return getIDInfoResult;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public GetIDInfoResult getDefaultInstanceForType() {
                return GetIDInfoResult.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.info_ = "";
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m119clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.info_ = "";
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m127clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof GetIDInfoResult) {
                    return mergeFrom((GetIDInfoResult) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(GetIDInfoResult getIDInfoResult) {
                if (getIDInfoResult == GetIDInfoResult.getDefaultInstance()) {
                    return this;
                }
                if (!getIDInfoResult.getInfo().isEmpty()) {
                    this.info_ = getIDInfoResult.info_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                m141mergeUnknownFields(getIDInfoResult.getUnknownFields());
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
                                if (iK != 10) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.info_ = mVar.J();
                                    this.bitField0_ |= 1;
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

        private GetIDInfoResult(k0.b bVar) {
            super(bVar);
            this.info_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(GetIDInfoResult getIDInfoResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getIDInfoResult);
        }

        public static GetIDInfoResult parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetIDInfoResult) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static GetIDInfoResult parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetIDInfoResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static GetIDInfoResult parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (GetIDInfoResult) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public GetIDInfoResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static GetIDInfoResult parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetIDInfoResult) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private GetIDInfoResult() {
            this.info_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.info_ = "";
        }

        public static GetIDInfoResult parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (GetIDInfoResult) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static GetIDInfoResult parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetIDInfoResult) PARSER.parseFrom(bArr, yVar);
        }

        public static GetIDInfoResult parseFrom(InputStream inputStream) throws IOException {
            return (GetIDInfoResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static GetIDInfoResult parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetIDInfoResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static GetIDInfoResult parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (GetIDInfoResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static GetIDInfoResult parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (GetIDInfoResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface GetIDInfoResultOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        String getInfo();

        com.google.protobuf.l getInfoBytes();

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class SetDeviceRegTimesRequest extends com.google.protobuf.k0 implements SetDeviceRegTimesRequestOrBuilder {
        public static final int CLIENTNAME_FIELD_NUMBER = 5;
        public static final int DEVID_FIELD_NUMBER = 2;
        public static final int PRODUCTID_FIELD_NUMBER = 1;
        public static final int REGTIMES_FIELD_NUMBER = 4;
        public static final int USERID_FIELD_NUMBER = 6;
        public static final int VENDORID_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private volatile Object clientName_;
        private com.google.protobuf.l devId_;
        private byte memoizedIsInitialized;
        private int productId_;
        private int regTimes_;
        private long userId_;
        private int vendorId_;
        private static final SetDeviceRegTimesRequest DEFAULT_INSTANCE = new SetDeviceRegTimesRequest();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Dm.SetDeviceRegTimesRequest.1
            @Override // com.google.protobuf.z1
            public SetDeviceRegTimesRequest parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = SetDeviceRegTimesRequest.newBuilder();
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

        public static SetDeviceRegTimesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Dm.internal_static_benshikj_SetDeviceRegTimesRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SetDeviceRegTimesRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SetDeviceRegTimesRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SetDeviceRegTimesRequest parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (SetDeviceRegTimesRequest) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetDeviceRegTimesRequest)) {
                return super.equals(obj);
            }
            SetDeviceRegTimesRequest setDeviceRegTimesRequest = (SetDeviceRegTimesRequest) obj;
            return getProductId() == setDeviceRegTimesRequest.getProductId() && getDevId().equals(setDeviceRegTimesRequest.getDevId()) && getVendorId() == setDeviceRegTimesRequest.getVendorId() && getRegTimes() == setDeviceRegTimesRequest.getRegTimes() && getClientName().equals(setDeviceRegTimesRequest.getClientName()) && getUserId() == setDeviceRegTimesRequest.getUserId() && getUnknownFields().equals(setDeviceRegTimesRequest.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Dm.SetDeviceRegTimesRequestOrBuilder
        public String getClientName() {
            Object obj = this.clientName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.clientName_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Dm.SetDeviceRegTimesRequestOrBuilder
        public com.google.protobuf.l getClientNameBytes() {
            Object obj = this.clientName_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.clientName_ = lVarI;
            return lVarI;
        }

        @Override // com.benshikj.ht.rpc.Dm.SetDeviceRegTimesRequestOrBuilder
        public com.google.protobuf.l getDevId() {
            return this.devId_;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.benshikj.ht.rpc.Dm.SetDeviceRegTimesRequestOrBuilder
        public int getProductId() {
            return this.productId_;
        }

        @Override // com.benshikj.ht.rpc.Dm.SetDeviceRegTimesRequestOrBuilder
        public int getRegTimes() {
            return this.regTimes_;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.productId_;
            int iX = i11 != 0 ? com.google.protobuf.o.x(1, i11) : 0;
            if (!this.devId_.isEmpty()) {
                iX += com.google.protobuf.o.h(2, this.devId_);
            }
            int i12 = this.vendorId_;
            if (i12 != 0) {
                iX += com.google.protobuf.o.x(3, i12);
            }
            int i13 = this.regTimes_;
            if (i13 != 0) {
                iX += com.google.protobuf.o.x(4, i13);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.clientName_)) {
                iX += com.google.protobuf.k0.computeStringSize(5, this.clientName_);
            }
            long j10 = this.userId_;
            if (j10 != 0) {
                iX += com.google.protobuf.o.z(6, j10);
            }
            int serializedSize = iX + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.benshikj.ht.rpc.Dm.SetDeviceRegTimesRequestOrBuilder
        public long getUserId() {
            return this.userId_;
        }

        @Override // com.benshikj.ht.rpc.Dm.SetDeviceRegTimesRequestOrBuilder
        public int getVendorId() {
            return this.vendorId_;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getProductId()) * 37) + 2) * 53) + getDevId().hashCode()) * 37) + 3) * 53) + getVendorId()) * 37) + 4) * 53) + getRegTimes()) * 37) + 5) * 53) + getClientName().hashCode()) * 37) + 6) * 53) + com.google.protobuf.o0.i(getUserId())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Dm.internal_static_benshikj_SetDeviceRegTimesRequest_fieldAccessorTable.d(SetDeviceRegTimesRequest.class, Builder.class);
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
            return new SetDeviceRegTimesRequest();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            int i10 = this.productId_;
            if (i10 != 0) {
                oVar.D0(1, i10);
            }
            if (!this.devId_.isEmpty()) {
                oVar.q0(2, this.devId_);
            }
            int i11 = this.vendorId_;
            if (i11 != 0) {
                oVar.D0(3, i11);
            }
            int i12 = this.regTimes_;
            if (i12 != 0) {
                oVar.D0(4, i12);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.clientName_)) {
                com.google.protobuf.k0.writeString(oVar, 5, this.clientName_);
            }
            long j10 = this.userId_;
            if (j10 != 0) {
                oVar.F0(6, j10);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements SetDeviceRegTimesRequestOrBuilder {
            private int bitField0_;
            private Object clientName_;
            private com.google.protobuf.l devId_;
            private int productId_;
            private int regTimes_;
            private long userId_;
            private int vendorId_;

            private void buildPartial0(SetDeviceRegTimesRequest setDeviceRegTimesRequest) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    setDeviceRegTimesRequest.productId_ = this.productId_;
                }
                if ((i10 & 2) != 0) {
                    setDeviceRegTimesRequest.devId_ = this.devId_;
                }
                if ((i10 & 4) != 0) {
                    setDeviceRegTimesRequest.vendorId_ = this.vendorId_;
                }
                if ((i10 & 8) != 0) {
                    setDeviceRegTimesRequest.regTimes_ = this.regTimes_;
                }
                if ((i10 & 16) != 0) {
                    setDeviceRegTimesRequest.clientName_ = this.clientName_;
                }
                if ((i10 & 32) != 0) {
                    setDeviceRegTimesRequest.userId_ = this.userId_;
                }
            }

            public static final r.b getDescriptor() {
                return Dm.internal_static_benshikj_SetDeviceRegTimesRequest_descriptor;
            }

            public Builder clearClientName() {
                this.clientName_ = SetDeviceRegTimesRequest.getDefaultInstance().getClientName();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearDevId() {
                this.bitField0_ &= -3;
                this.devId_ = SetDeviceRegTimesRequest.getDefaultInstance().getDevId();
                onChanged();
                return this;
            }

            public Builder clearProductId() {
                this.bitField0_ &= -2;
                this.productId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRegTimes() {
                this.bitField0_ &= -9;
                this.regTimes_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUserId() {
                this.bitField0_ &= -33;
                this.userId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearVendorId() {
                this.bitField0_ &= -5;
                this.vendorId_ = 0;
                onChanged();
                return this;
            }

            @Override // com.benshikj.ht.rpc.Dm.SetDeviceRegTimesRequestOrBuilder
            public String getClientName() {
                Object obj = this.clientName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.clientName_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Dm.SetDeviceRegTimesRequestOrBuilder
            public com.google.protobuf.l getClientNameBytes() {
                Object obj = this.clientName_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.clientName_ = lVarI;
                return lVarI;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Dm.internal_static_benshikj_SetDeviceRegTimesRequest_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Dm.SetDeviceRegTimesRequestOrBuilder
            public com.google.protobuf.l getDevId() {
                return this.devId_;
            }

            @Override // com.benshikj.ht.rpc.Dm.SetDeviceRegTimesRequestOrBuilder
            public int getProductId() {
                return this.productId_;
            }

            @Override // com.benshikj.ht.rpc.Dm.SetDeviceRegTimesRequestOrBuilder
            public int getRegTimes() {
                return this.regTimes_;
            }

            @Override // com.benshikj.ht.rpc.Dm.SetDeviceRegTimesRequestOrBuilder
            public long getUserId() {
                return this.userId_;
            }

            @Override // com.benshikj.ht.rpc.Dm.SetDeviceRegTimesRequestOrBuilder
            public int getVendorId() {
                return this.vendorId_;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Dm.internal_static_benshikj_SetDeviceRegTimesRequest_fieldAccessorTable.d(SetDeviceRegTimesRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setClientName(String str) {
                str.getClass();
                this.clientName_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setClientNameBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.clientName_ = lVar;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setDevId(com.google.protobuf.l lVar) {
                lVar.getClass();
                this.devId_ = lVar;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setProductId(int i10) {
                this.productId_ = i10;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setRegTimes(int i10) {
                this.regTimes_ = i10;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setUserId(long j10) {
                this.userId_ = j10;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setVendorId(int i10) {
                this.vendorId_ = i10;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            private Builder() {
                this.devId_ = com.google.protobuf.l.f9119b;
                this.clientName_ = "";
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public SetDeviceRegTimesRequest build() {
                SetDeviceRegTimesRequest setDeviceRegTimesRequestBuildPartial = buildPartial();
                if (setDeviceRegTimesRequestBuildPartial.isInitialized()) {
                    return setDeviceRegTimesRequestBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) setDeviceRegTimesRequestBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public SetDeviceRegTimesRequest buildPartial() {
                SetDeviceRegTimesRequest setDeviceRegTimesRequest = new SetDeviceRegTimesRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(setDeviceRegTimesRequest);
                }
                onBuilt();
                return setDeviceRegTimesRequest;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public SetDeviceRegTimesRequest getDefaultInstanceForType() {
                return SetDeviceRegTimesRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m132clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.productId_ = 0;
                this.devId_ = com.google.protobuf.l.f9119b;
                this.vendorId_ = 0;
                this.regTimes_ = 0;
                this.clientName_ = "";
                this.userId_ = 0L;
                return this;
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.devId_ = com.google.protobuf.l.f9119b;
                this.clientName_ = "";
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m140clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof SetDeviceRegTimesRequest) {
                    return mergeFrom((SetDeviceRegTimesRequest) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(SetDeviceRegTimesRequest setDeviceRegTimesRequest) {
                if (setDeviceRegTimesRequest == SetDeviceRegTimesRequest.getDefaultInstance()) {
                    return this;
                }
                if (setDeviceRegTimesRequest.getProductId() != 0) {
                    setProductId(setDeviceRegTimesRequest.getProductId());
                }
                if (setDeviceRegTimesRequest.getDevId() != com.google.protobuf.l.f9119b) {
                    setDevId(setDeviceRegTimesRequest.getDevId());
                }
                if (setDeviceRegTimesRequest.getVendorId() != 0) {
                    setVendorId(setDeviceRegTimesRequest.getVendorId());
                }
                if (setDeviceRegTimesRequest.getRegTimes() != 0) {
                    setRegTimes(setDeviceRegTimesRequest.getRegTimes());
                }
                if (!setDeviceRegTimesRequest.getClientName().isEmpty()) {
                    this.clientName_ = setDeviceRegTimesRequest.clientName_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                if (setDeviceRegTimesRequest.getUserId() != 0) {
                    setUserId(setDeviceRegTimesRequest.getUserId());
                }
                m141mergeUnknownFields(setDeviceRegTimesRequest.getUnknownFields());
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
                                if (iK == 8) {
                                    this.productId_ = mVar.y();
                                    this.bitField0_ |= 1;
                                } else if (iK == 18) {
                                    this.devId_ = mVar.r();
                                    this.bitField0_ |= 2;
                                } else if (iK == 24) {
                                    this.vendorId_ = mVar.y();
                                    this.bitField0_ |= 4;
                                } else if (iK == 32) {
                                    this.regTimes_ = mVar.y();
                                    this.bitField0_ |= 8;
                                } else if (iK == 42) {
                                    this.clientName_ = mVar.J();
                                    this.bitField0_ |= 16;
                                } else if (iK != 48) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.userId_ = mVar.z();
                                    this.bitField0_ |= 32;
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

        private SetDeviceRegTimesRequest(k0.b bVar) {
            super(bVar);
            this.productId_ = 0;
            this.devId_ = com.google.protobuf.l.f9119b;
            this.vendorId_ = 0;
            this.regTimes_ = 0;
            this.clientName_ = "";
            this.userId_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SetDeviceRegTimesRequest setDeviceRegTimesRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(setDeviceRegTimesRequest);
        }

        public static SetDeviceRegTimesRequest parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (SetDeviceRegTimesRequest) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static SetDeviceRegTimesRequest parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (SetDeviceRegTimesRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static SetDeviceRegTimesRequest parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (SetDeviceRegTimesRequest) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public SetDeviceRegTimesRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SetDeviceRegTimesRequest parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (SetDeviceRegTimesRequest) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SetDeviceRegTimesRequest parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (SetDeviceRegTimesRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static SetDeviceRegTimesRequest parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (SetDeviceRegTimesRequest) PARSER.parseFrom(bArr, yVar);
        }

        public static SetDeviceRegTimesRequest parseFrom(InputStream inputStream) throws IOException {
            return (SetDeviceRegTimesRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static SetDeviceRegTimesRequest parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (SetDeviceRegTimesRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        private SetDeviceRegTimesRequest() {
            this.productId_ = 0;
            com.google.protobuf.l lVar = com.google.protobuf.l.f9119b;
            this.devId_ = lVar;
            this.vendorId_ = 0;
            this.regTimes_ = 0;
            this.clientName_ = "";
            this.userId_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
            this.devId_ = lVar;
            this.clientName_ = "";
        }

        public static SetDeviceRegTimesRequest parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (SetDeviceRegTimesRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static SetDeviceRegTimesRequest parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (SetDeviceRegTimesRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface SetDeviceRegTimesRequestOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        String getClientName();

        com.google.protobuf.l getClientNameBytes();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        com.google.protobuf.l getDevId();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        int getProductId();

        int getRegTimes();

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        long getUserId();

        int getVendorId();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    static {
        r.b bVar = (r.b) getDescriptor().l().get(0);
        internal_static_benshikj_GetDeviceRegTimesRequest_descriptor = bVar;
        internal_static_benshikj_GetDeviceRegTimesRequest_fieldAccessorTable = new k0.f(bVar, new String[]{"ProductId", "DevId", "ReqDevID"});
        r.b bVar2 = (r.b) getDescriptor().l().get(1);
        internal_static_benshikj_DeviceID_descriptor = bVar2;
        internal_static_benshikj_DeviceID_fieldAccessorTable = new k0.f(bVar2, new String[]{"DID", "PID", "Date"});
        r.b bVar3 = (r.b) getDescriptor().l().get(2);
        internal_static_benshikj_DeviceRegTimes_descriptor = bVar3;
        internal_static_benshikj_DeviceRegTimes_fieldAccessorTable = new k0.f(bVar3, new String[]{"RegTimes", "ID"});
        r.b bVar4 = (r.b) getDescriptor().l().get(3);
        internal_static_benshikj_SetDeviceRegTimesRequest_descriptor = bVar4;
        internal_static_benshikj_SetDeviceRegTimesRequest_fieldAccessorTable = new k0.f(bVar4, new String[]{"ProductId", "DevId", "VendorId", "RegTimes", "ClientName", "UserId"});
        r.b bVar5 = (r.b) getDescriptor().l().get(4);
        internal_static_benshikj_CheckFirmwareUpdateRequest_descriptor = bVar5;
        internal_static_benshikj_CheckFirmwareUpdateRequest_fieldAccessorTable = new k0.f(bVar5, new String[]{"ProductId", "FirmwareVersion", "Beta", "UserId", "InviteCode"});
        r.b bVar6 = (r.b) getDescriptor().l().get(5);
        internal_static_benshikj_FirmwareInfo_descriptor = bVar6;
        internal_static_benshikj_FirmwareInfo_fieldAccessorTable = new k0.f(bVar6, new String[]{"Version", "Url", "Md5", "ReleaseNotes", "ReleaseDate"});
        r.b bVar7 = (r.b) getDescriptor().l().get(6);
        internal_static_benshikj_CheckFirmwareUpdateResult_descriptor = bVar7;
        internal_static_benshikj_CheckFirmwareUpdateResult_fieldAccessorTable = new k0.f(bVar7, new String[]{"Firmware", "Base"});
        r.b bVar8 = (r.b) getDescriptor().l().get(7);
        internal_static_benshikj_GetIDInfoRequest_descriptor = bVar8;
        internal_static_benshikj_GetIDInfoRequest_fieldAccessorTable = new k0.f(bVar8, new String[]{"DevId"});
        r.b bVar9 = (r.b) getDescriptor().l().get(8);
        internal_static_benshikj_GetIDInfoResult_descriptor = bVar9;
        internal_static_benshikj_GetIDInfoResult_fieldAccessorTable = new k0.f(bVar9, new String[]{"Info"});
    }

    private Dm() {
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
