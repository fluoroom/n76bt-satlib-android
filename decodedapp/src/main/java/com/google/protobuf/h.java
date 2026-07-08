package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.k0;
import com.google.protobuf.r;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends k0 implements i {

    /* JADX INFO: renamed from: c */
    private static final h f9026c = new h();

    /* JADX INFO: renamed from: d */
    private static final z1 f9027d = new a();

    /* JADX INFO: renamed from: a */
    private boolean f9028a;

    /* JADX INFO: renamed from: b */
    private byte f9029b;

    class a extends c {
        a() {
        }

        @Override // com.google.protobuf.z1
        /* JADX INFO: renamed from: c */
        public h parsePartialFrom(m mVar, y yVar) throws p0 {
            b bVarR = h.r();
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

    public static final class b extends k0.b implements i {

        /* JADX INFO: renamed from: a */
        private int f9030a;

        /* JADX INFO: renamed from: b */
        private boolean f9031b;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void j(h hVar) {
            if ((this.f9030a & 1) != 0) {
                hVar.f9028a = this.f9031b;
            }
        }

        @Override // com.google.protobuf.i1.a
        /* JADX INFO: renamed from: g */
        public b addRepeatedField(r.g gVar, Object obj) {
            return (b) super.addRepeatedField(gVar, obj);
        }

        @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public r.b getDescriptorForType() {
            return b3.f8914m;
        }

        @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
        /* JADX INFO: renamed from: h */
        public h build() {
            h hVarBuildPartial = buildPartial();
            if (hVarBuildPartial.isInitialized()) {
                return hVarBuildPartial;
            }
            throw a.AbstractC0131a.newUninitializedMessageException((i1) hVarBuildPartial);
        }

        @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
        /* JADX INFO: renamed from: i */
        public h buildPartial() {
            h hVar = new h(this, null);
            if (this.f9030a != 0) {
                j(hVar);
            }
            onBuilt();
            return hVar;
        }

        @Override // com.google.protobuf.k0.b
        protected k0.f internalGetFieldAccessorTable() {
            return b3.f8915n.d(h.class, b.class);
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
        public h getDefaultInstanceForType() {
            return h.o();
        }

        public b o(h hVar) {
            if (hVar == h.o()) {
                return this;
            }
            if (hVar.q()) {
                w(hVar.q());
            }
            m141mergeUnknownFields(hVar.getUnknownFields());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
        /* JADX INFO: renamed from: p */
        public b mergeFrom(m mVar, y yVar) {
            yVar.getClass();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = mVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f9031b = mVar.q();
                                this.f9030a |= 1;
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

        @Override // com.google.protobuf.i1.a
        /* JADX INFO: renamed from: r */
        public b mergeFrom(i1 i1Var) {
            if (i1Var instanceof h) {
                return o((h) i1Var);
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

        public b w(boolean z10) {
            this.f9031b = z10;
            this.f9030a |= 1;
            onChanged();
            return this;
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

    /* synthetic */ h(k0.b bVar, a aVar) {
        this(bVar);
    }

    public static final r.b getDescriptor() {
        return b3.f8914m;
    }

    public static h o() {
        return f9026c;
    }

    public static b r() {
        return f9026c.toBuilder();
    }

    public static h v(boolean z10) {
        return r().w(z10).build();
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
        return q() == hVar.q() && getUnknownFields().equals(hVar.getUnknownFields());
    }

    @Override // com.google.protobuf.l1, com.google.protobuf.i1
    public z1 getParserForType() {
        return f9027d;
    }

    @Override // com.google.protobuf.l1
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        boolean z10 = this.f9028a;
        int iE = (z10 ? o.e(1, z10) : 0) + getUnknownFields().getSerializedSize();
        this.memoizedSize = iE;
        return iE;
    }

    @Override // com.google.protobuf.a
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + o0.d(q())) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.k0
    protected k0.f internalGetFieldAccessorTable() {
        return b3.f8915n.d(h.class, b.class);
    }

    @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f9029b;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f9029b = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.k0
    protected Object newInstance(k0.g gVar) {
        return new h();
    }

    @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
    /* JADX INFO: renamed from: p */
    public h getDefaultInstanceForType() {
        return f9026c;
    }

    public boolean q() {
        return this.f9028a;
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
    /* JADX INFO: renamed from: w */
    public b toBuilder() {
        return this == f9026c ? new b((a) null) : new b((a) null).o(this);
    }

    @Override // com.google.protobuf.l1
    public void writeTo(o oVar) {
        boolean z10 = this.f9028a;
        if (z10) {
            oVar.m0(1, z10);
        }
        getUnknownFields().writeTo(oVar);
    }

    private h(k0.b bVar) {
        super(bVar);
        this.f9028a = false;
        this.f9029b = (byte) -1;
    }

    private h() {
        this.f9028a = false;
        this.f9029b = (byte) -1;
    }
}
