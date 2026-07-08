package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.k0;
import com.google.protobuf.r;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends k0 implements o1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final f f8959e = new f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final z1 f8960f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile i1 f8961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f8962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l f8963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f8964d;

    class a extends c {
        a() {
        }

        @Override // com.google.protobuf.z1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public f parsePartialFrom(m mVar, y yVar) throws p0 {
            b bVarX = f.x();
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

    public static final class b extends k0.b implements o1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f8966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private l f8967c;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void j(f fVar) {
            int i10 = this.f8965a;
            if ((i10 & 1) != 0) {
                fVar.f8962b = this.f8966b;
            }
            if ((i10 & 2) != 0) {
                fVar.f8963c = this.f8967c;
            }
        }

        @Override // com.google.protobuf.i1.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(r.g gVar, Object obj) {
            return (b) super.addRepeatedField(gVar, obj);
        }

        @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public r.b getDescriptorForType() {
            return g.f9009a;
        }

        @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public f build() {
            f fVarBuildPartial = buildPartial();
            if (fVarBuildPartial.isInitialized()) {
                return fVarBuildPartial;
            }
            throw a.AbstractC0131a.newUninitializedMessageException((i1) fVarBuildPartial);
        }

        @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public f buildPartial() {
            f fVar = new f(this, null);
            if (this.f8965a != 0) {
                j(fVar);
            }
            onBuilt();
            return fVar;
        }

        @Override // com.google.protobuf.k0.b
        protected k0.f internalGetFieldAccessorTable() {
            return g.f9010b.d(f.class, b.class);
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

        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return (b) super.m1147clone();
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public f getDefaultInstanceForType() {
            return f.q();
        }

        public b o(f fVar) {
            if (fVar == f.q()) {
                return this;
            }
            if (!fVar.t().isEmpty()) {
                this.f8966b = fVar.f8962b;
                this.f8965a |= 1;
                onChanged();
            }
            if (fVar.v() != l.f9119b) {
                w(fVar.v());
            }
            m1148mergeUnknownFields(fVar.getUnknownFields());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(m mVar, y yVar) {
            yVar.getClass();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = mVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                this.f8966b = mVar.J();
                                this.f8965a |= 1;
                            } else if (iK == 18) {
                                this.f8967c = mVar.r();
                                this.f8965a |= 2;
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
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(i1 i1Var) {
            if (i1Var instanceof f) {
                return o((f) i1Var);
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
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b setField(r.g gVar, Object obj) {
            return (b) super.setField(gVar, obj);
        }

        @Override // com.google.protobuf.i1.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final b setUnknownFields(t2 t2Var) {
            return (b) super.setUnknownFields(t2Var);
        }

        public b w(l lVar) {
            lVar.getClass();
            this.f8967c = lVar;
            this.f8965a |= 2;
            onChanged();
            return this;
        }

        /* synthetic */ b(k0.c cVar, a aVar) {
            this(cVar);
        }

        private b() {
            this.f8966b = "";
            this.f8967c = l.f9119b;
        }

        private b(k0.c cVar) {
            super(cVar);
            this.f8966b = "";
            this.f8967c = l.f9119b;
        }
    }

    /* synthetic */ f(k0.b bVar, a aVar) {
        this(bVar);
    }

    public static final r.b getDescriptor() {
        return g.f9009a;
    }

    public static z1 parser() {
        return f8960f;
    }

    public static f q() {
        return f8959e;
    }

    private static String s(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? "" : str.substring(iLastIndexOf + 1);
    }

    public static b x() {
        return f8959e.toBuilder();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.k0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType(k0.c cVar) {
        return new b(cVar, null);
    }

    @Override // com.google.protobuf.l1, com.google.protobuf.i1
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        a aVar = null;
        return this == f8959e ? new b(aVar) : new b(aVar).o(this);
    }

    public i1 D(Class cls) throws p0 {
        if (this.f8961a != null) {
            if (this.f8961a.getClass() == cls) {
                return this.f8961a;
            }
        } else if (w(cls)) {
            i1 i1Var = (i1) ((i1) o0.c(cls)).getParserForType().parseFrom(v());
            this.f8961a = i1Var;
            return i1Var;
        }
        throw new p0("Type of the Any message does not match the given class.");
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
        return t().equals(fVar.t()) && v().equals(fVar.v()) && getUnknownFields().equals(fVar.getUnknownFields());
    }

    @Override // com.google.protobuf.l1, com.google.protobuf.i1
    public z1 getParserForType() {
        return f8960f;
    }

    @Override // com.google.protobuf.l1
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !k0.isStringEmpty(this.f8962b) ? k0.computeStringSize(1, this.f8962b) : 0;
        if (!this.f8963c.isEmpty()) {
            iComputeStringSize += o.h(2, this.f8963c);
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
        int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + t().hashCode()) * 37) + 2) * 53) + v().hashCode()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.k0
    protected k0.f internalGetFieldAccessorTable() {
        return g.f9010b.d(f.class, b.class);
    }

    @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f8964d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f8964d = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.k0
    protected Object newInstance(k0.g gVar) {
        return new f();
    }

    @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public f getDefaultInstanceForType() {
        return f8959e;
    }

    public String t() {
        Object obj = this.f8962b;
        if (obj instanceof String) {
            return (String) obj;
        }
        String strN = ((l) obj).N();
        this.f8962b = strN;
        return strN;
    }

    public l v() {
        return this.f8963c;
    }

    public boolean w(Class cls) {
        return s(t()).equals(((i1) o0.c(cls)).getDescriptorForType().d());
    }

    @Override // com.google.protobuf.l1
    public void writeTo(o oVar) throws IOException {
        if (!k0.isStringEmpty(this.f8962b)) {
            k0.writeString(oVar, 1, this.f8962b);
        }
        if (!this.f8963c.isEmpty()) {
            oVar.q0(2, this.f8963c);
        }
        getUnknownFields().writeTo(oVar);
    }

    @Override // com.google.protobuf.l1, com.google.protobuf.i1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return x();
    }

    private f(k0.b bVar) {
        super(bVar);
        this.f8962b = "";
        this.f8963c = l.f9119b;
        this.f8964d = (byte) -1;
    }

    private f() {
        this.f8962b = "";
        l lVar = l.f9119b;
        this.f8963c = lVar;
        this.f8964d = (byte) -1;
        this.f8962b = "";
        this.f8963c = lVar;
    }
}
