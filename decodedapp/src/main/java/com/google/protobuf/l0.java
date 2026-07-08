package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.k0;
import com.google.protobuf.r;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends k0 implements m0 {

    /* JADX INFO: renamed from: c */
    private static final l0 f9131c = new l0();

    /* JADX INFO: renamed from: d */
    private static final z1 f9132d = new a();

    /* JADX INFO: renamed from: a */
    private int f9133a;

    /* JADX INFO: renamed from: b */
    private byte f9134b;

    class a extends c {
        a() {
        }

        @Override // com.google.protobuf.z1
        /* JADX INFO: renamed from: c */
        public l0 parsePartialFrom(m mVar, y yVar) throws p0 {
            b bVarR = l0.r();
            try {
                bVarR.mergeFrom(mVar, yVar);
                return bVarR.buildPartial();
            } catch (p0 e10) {
                throw e10.j(bVarR.buildPartial());
            } catch (r2 e11) {
                throw e11.a().j(bVarR.buildPartial());
            } catch (IOException e12) {
                throw new p0(e12).j(bVarR.buildPartial());
            }
        }

        @Override // com.google.protobuf.c, com.google.protobuf.z1
        public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
            return super.parseDelimitedFrom(inputStream);
        }

        @Override // com.google.protobuf.c, com.google.protobuf.z1
        public /* bridge */ /* synthetic */ Object parseFrom(l lVar) {
            return super.parseFrom(lVar);
        }

        @Override // com.google.protobuf.c
        /* JADX INFO: renamed from: parsePartialDelimitedFrom */
        public /* bridge */ /* synthetic */ Object mo1183parsePartialDelimitedFrom(InputStream inputStream) {
            return super.mo1183parsePartialDelimitedFrom(inputStream);
        }

        @Override // com.google.protobuf.c
        /* JADX INFO: renamed from: parsePartialFrom */
        public /* bridge */ /* synthetic */ Object mo1185parsePartialFrom(l lVar) {
            return super.mo1185parsePartialFrom(lVar);
        }

        @Override // com.google.protobuf.c, com.google.protobuf.z1
        public /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, y yVar) {
            return super.parseDelimitedFrom(inputStream, yVar);
        }

        @Override // com.google.protobuf.c, com.google.protobuf.z1
        public /* bridge */ /* synthetic */ Object parseFrom(l lVar, y yVar) {
            return super.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.c
        /* JADX INFO: renamed from: parsePartialDelimitedFrom */
        public /* bridge */ /* synthetic */ Object mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) {
            return super.mo1184parsePartialDelimitedFrom(inputStream, yVar);
        }

        @Override // com.google.protobuf.c
        /* JADX INFO: renamed from: parsePartialFrom */
        public /* bridge */ /* synthetic */ Object mo1186parsePartialFrom(l lVar, y yVar) {
            return super.mo1186parsePartialFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.c, com.google.protobuf.z1
        public /* bridge */ /* synthetic */ Object parseFrom(m mVar) {
            return super.parseFrom(mVar);
        }

        @Override // com.google.protobuf.c
        /* JADX INFO: renamed from: parsePartialFrom */
        public /* bridge */ /* synthetic */ Object mo1187parsePartialFrom(m mVar) {
            return super.mo1187parsePartialFrom(mVar);
        }

        @Override // com.google.protobuf.c, com.google.protobuf.z1
        public /* bridge */ /* synthetic */ Object parseFrom(m mVar, y yVar) {
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

    public static final class b extends k0.b implements m0 {

        /* JADX INFO: renamed from: a */
        private int f9135a;

        /* JADX INFO: renamed from: b */
        private int f9136b;

        /* synthetic */ b(k0.c cVar, a aVar) {
            this(cVar);
        }

        private void j(l0 l0Var) {
            if ((this.f9135a & 1) != 0) {
                l0Var.f9133a = this.f9136b;
            }
        }

        @Override // com.google.protobuf.i1.a
        /* JADX INFO: renamed from: g */
        public b addRepeatedField(r.g gVar, Object obj) {
            return (b) super.addRepeatedField(gVar, obj);
        }

        @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public r.b getDescriptorForType() {
            return b3.f8910i;
        }

        @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
        /* JADX INFO: renamed from: h */
        public l0 build() {
            l0 l0VarBuildPartial = buildPartial();
            if (l0VarBuildPartial.isInitialized()) {
                return l0VarBuildPartial;
            }
            throw a.AbstractC0131a.newUninitializedMessageException((i1) l0VarBuildPartial);
        }

        @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
        /* JADX INFO: renamed from: i */
        public l0 buildPartial() {
            l0 l0Var = new l0(this, null);
            if (this.f9135a != 0) {
                j(l0Var);
            }
            onBuilt();
            return l0Var;
        }

        @Override // com.google.protobuf.k0.b
        protected k0.f internalGetFieldAccessorTable() {
            return b3.f8911j.d(l0.class, b.class);
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
        public l0 getDefaultInstanceForType() {
            return l0.o();
        }

        @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
        /* JADX INFO: renamed from: o */
        public b mergeFrom(m mVar, y yVar) {
            yVar.getClass();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = mVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f9136b = mVar.y();
                                this.f9135a |= 1;
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

        public b p(l0 l0Var) {
            if (l0Var == l0.o()) {
                return this;
            }
            if (l0Var.q() != 0) {
                w(l0Var.q());
            }
            m141mergeUnknownFields(l0Var.getUnknownFields());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.i1.a
        /* JADX INFO: renamed from: r */
        public b mergeFrom(i1 i1Var) {
            if (i1Var instanceof l0) {
                return p((l0) i1Var);
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

        @Override // com.google.protobuf.i1.a
        /* JADX INFO: renamed from: v */
        public final b setUnknownFields(t2 t2Var) {
            return (b) super.setUnknownFields(t2Var);
        }

        public b w(int i10) {
            this.f9136b = i10;
            this.f9135a |= 1;
            onChanged();
            return this;
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
        }

        private b(k0.c cVar) {
            super(cVar);
        }
    }

    /* synthetic */ l0(k0.b bVar, a aVar) {
        this(bVar);
    }

    public static final r.b getDescriptor() {
        return b3.f8910i;
    }

    public static l0 o() {
        return f9131c;
    }

    public static b r() {
        return f9131c.toBuilder();
    }

    @Override // com.google.protobuf.a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return super.equals(obj);
        }
        l0 l0Var = (l0) obj;
        return q() == l0Var.q() && getUnknownFields().equals(l0Var.getUnknownFields());
    }

    @Override // com.google.protobuf.l1, com.google.protobuf.i1
    public z1 getParserForType() {
        return f9132d;
    }

    @Override // com.google.protobuf.l1
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.f9133a;
        int iX = (i11 != 0 ? o.x(1, i11) : 0) + getUnknownFields().getSerializedSize();
        this.memoizedSize = iX;
        return iX;
    }

    @Override // com.google.protobuf.a
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + q()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.k0
    protected k0.f internalGetFieldAccessorTable() {
        return b3.f8911j.d(l0.class, b.class);
    }

    @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f9134b;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f9134b = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.k0
    protected Object newInstance(k0.g gVar) {
        return new l0();
    }

    @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
    /* JADX INFO: renamed from: p */
    public l0 getDefaultInstanceForType() {
        return f9131c;
    }

    public int q() {
        return this.f9133a;
    }

    @Override // com.google.protobuf.l1, com.google.protobuf.i1
    /* JADX INFO: renamed from: s */
    public b newBuilderForType() {
        return r();
    }

    @Override // com.google.protobuf.k0
    /* JADX INFO: renamed from: t */
    public b newBuilderForType(k0.c cVar) {
        return new b(cVar, null);
    }

    @Override // com.google.protobuf.l1, com.google.protobuf.i1
    /* JADX INFO: renamed from: v */
    public b toBuilder() {
        return this == f9131c ? new b((a) null) : new b((a) null).p(this);
    }

    @Override // com.google.protobuf.l1
    public void writeTo(o oVar) {
        int i10 = this.f9133a;
        if (i10 != 0) {
            oVar.D0(1, i10);
        }
        getUnknownFields().writeTo(oVar);
    }

    private l0(k0.b bVar) {
        super(bVar);
        this.f9133a = 0;
        this.f9134b = (byte) -1;
    }

    private l0() {
        this.f9133a = 0;
        this.f9134b = (byte) -1;
    }
}
