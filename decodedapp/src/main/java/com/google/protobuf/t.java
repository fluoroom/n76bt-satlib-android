package com.google.protobuf;

import com.google.protobuf.a;
import com.google.protobuf.e0;
import com.google.protobuf.i1;
import com.google.protobuf.r;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends com.google.protobuf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r.b f10093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0 f10094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r.g[] f10095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t2 f10096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10097e = -1;

    class a extends com.google.protobuf.c {
        a() {
        }

        @Override // com.google.protobuf.z1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public t parsePartialFrom(m mVar, y yVar) throws p0 {
            c cVarO = t.o(t.this.f10093a);
            try {
                cVarO.mergeFrom(mVar, yVar);
                return cVarO.buildPartial();
            } catch (p0 e10) {
                throw e10.j(cVarO.buildPartial());
            } catch (IOException e11) {
                throw new p0(e11).j(cVarO.buildPartial());
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

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10099a;

        static {
            int[] iArr = new int[r.g.c.values().length];
            f10099a = iArr;
            try {
                iArr[r.g.c.f10031x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10099a[r.g.c.f10028u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final class c extends a.AbstractC0131a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r.b f10100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e0.b f10101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final r.g[] f10102c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private t2 f10103d;

        /* synthetic */ c(r.b bVar, a aVar) {
            this(bVar);
        }

        private static i1.a p(Object obj) {
            if (obj instanceof i1.a) {
                return (i1.a) obj;
            }
            if (obj instanceof s0) {
                obj = ((s0) obj).d();
            }
            if (obj instanceof i1) {
                return ((i1) obj).toBuilder();
            }
            throw new IllegalArgumentException(String.format("Cannot convert %s to Message.Builder", obj.getClass()));
        }

        private void r(r.g gVar) {
            if (gVar.m() != this.f10100a) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }

        private void t(r.g gVar, Object obj) {
            int i10 = b.f10099a[gVar.y().ordinal()];
            if (i10 != 1) {
                if (i10 == 2 && (obj instanceof i1.a)) {
                    throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(gVar.getNumber()), gVar.c().a(), obj.getClass().getName()));
                }
            } else {
                o0.a(obj);
                if (!(obj instanceof r.f)) {
                    throw new IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
                }
            }
        }

        private void u(r.g gVar, Object obj) {
            if (!gVar.b()) {
                t(gVar, obj);
                return;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                t(gVar, it.next());
            }
        }

        @Override // com.google.protobuf.i1.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c addRepeatedField(r.g gVar, Object obj) {
            r(gVar);
            t(gVar, obj);
            this.f10101b.a(gVar, obj);
            return this;
        }

        @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public t build() {
            if (isInitialized()) {
                return buildPartial();
            }
            r.b bVar = this.f10100a;
            e0 e0VarB = this.f10101b.b();
            r.g[] gVarArr = this.f10102c;
            throw a.AbstractC0131a.newUninitializedMessageException((i1) new t(bVar, e0VarB, (r.g[]) Arrays.copyOf(gVarArr, gVarArr.length), this.f10103d));
        }

        @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public t buildPartial() {
            if (this.f10100a.q().Q()) {
                for (r.g gVar : this.f10100a.l()) {
                    if (gVar.E() && !this.f10101b.m(gVar)) {
                        if (gVar.u() == r.g.b.MESSAGE) {
                            this.f10101b.u(gVar, t.k(gVar.v()));
                        } else {
                            this.f10101b.u(gVar, gVar.n());
                        }
                    }
                }
            }
            r.b bVar = this.f10100a;
            e0 e0VarD = this.f10101b.d();
            r.g[] gVarArr = this.f10102c;
            return new t(bVar, e0VarD, (r.g[]) Arrays.copyOf(gVarArr, gVarArr.length), this.f10103d);
        }

        @Override // com.google.protobuf.o1
        public Map getAllFields() {
            return this.f10101b.g();
        }

        @Override // com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public r.b getDescriptorForType() {
            return this.f10100a;
        }

        @Override // com.google.protobuf.o1
        public Object getField(r.g gVar) {
            r(gVar);
            Object objH = this.f10101b.h(gVar);
            return objH == null ? gVar.b() ? Collections.EMPTY_LIST : gVar.u() == r.g.b.MESSAGE ? t.k(gVar.v()) : gVar.n() : objH;
        }

        @Override // com.google.protobuf.i1.a
        public i1.a getFieldBuilder(r.g gVar) {
            r(gVar);
            if (gVar.D()) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }
            if (gVar.u() != r.g.b.MESSAGE) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }
            Object objI = this.f10101b.i(gVar);
            i1.a cVar = objI == null ? new c(gVar.v()) : p(objI);
            this.f10101b.u(gVar, cVar);
            return cVar;
        }

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public t2 getUnknownFields() {
            return this.f10103d;
        }

        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public c clone() {
            c cVar = new c(this.f10100a);
            cVar.f10101b.o(this.f10101b.b());
            cVar.m1148mergeUnknownFields(this.f10103d);
            r.g[] gVarArr = this.f10102c;
            System.arraycopy(gVarArr, 0, cVar.f10102c, 0, gVarArr.length);
            return cVar;
        }

        @Override // com.google.protobuf.o1
        public boolean hasField(r.g gVar) {
            r(gVar);
            return this.f10101b.m(gVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public t getDefaultInstanceForType() {
            return t.k(this.f10100a);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public boolean isInitialized() {
            for (r.g gVar : this.f10100a.l()) {
                if (gVar.G() && !this.f10101b.m(gVar)) {
                    return false;
                }
            }
            return this.f10101b.n();
        }

        @Override // com.google.protobuf.i1.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public c mergeFrom(i1 i1Var) {
            if (!(i1Var instanceof t)) {
                return (c) super.mergeFrom(i1Var);
            }
            t tVar = (t) i1Var;
            if (tVar.f10093a != this.f10100a) {
                throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
            }
            this.f10101b.o(tVar.f10094b);
            m1148mergeUnknownFields(tVar.f10096d);
            int i10 = 0;
            while (true) {
                r.g[] gVarArr = this.f10102c;
                if (i10 >= gVarArr.length) {
                    return this;
                }
                if (gVarArr[i10] == null) {
                    gVarArr[i10] = tVar.f10095c[i10];
                } else if (tVar.f10095c[i10] != null && this.f10102c[i10] != tVar.f10095c[i10]) {
                    this.f10101b.e(this.f10102c[i10]);
                    this.f10102c[i10] = tVar.f10095c[i10];
                }
                i10++;
            }
        }

        @Override // com.google.protobuf.a.AbstractC0131a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public c m1148mergeUnknownFields(t2 t2Var) {
            this.f10103d = t2.g(this.f10103d).r(t2Var).build();
            return this;
        }

        @Override // com.google.protobuf.i1.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public c newBuilderForField(r.g gVar) {
            r(gVar);
            if (gVar.u() == r.g.b.MESSAGE) {
                return new c(gVar.v());
            }
            throw new IllegalArgumentException("newBuilderForField is only valid for fields with message type.");
        }

        @Override // com.google.protobuf.i1.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public c setField(r.g gVar, Object obj) {
            r(gVar);
            u(gVar, obj);
            r.l lVarL = gVar.l();
            if (lVarL != null) {
                int iN = lVarL.n();
                r.g gVar2 = this.f10102c[iN];
                if (gVar2 != null && gVar2 != gVar) {
                    this.f10101b.e(gVar2);
                }
                this.f10102c[iN] = gVar;
            } else if (!gVar.B() && !gVar.b() && obj.equals(gVar.n())) {
                this.f10101b.e(gVar);
                return this;
            }
            this.f10101b.u(gVar, obj);
            return this;
        }

        @Override // com.google.protobuf.i1.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public c setUnknownFields(t2 t2Var) {
            this.f10103d = t2Var;
            return this;
        }

        private c(r.b bVar) {
            this.f10100a = bVar;
            this.f10101b = e0.I();
            this.f10103d = t2.c();
            this.f10102c = new r.g[bVar.f().k0()];
        }
    }

    t(r.b bVar, e0 e0Var, r.g[] gVarArr, t2 t2Var) {
        this.f10093a = bVar;
        this.f10094b = e0Var;
        this.f10095c = gVarArr;
        this.f10096d = t2Var;
    }

    public static t k(r.b bVar) {
        return new t(bVar, e0.o(), new r.g[bVar.f().k0()], t2.c());
    }

    static boolean n(r.b bVar, e0 e0Var) {
        for (r.g gVar : bVar.l()) {
            if (gVar.G() && !e0Var.x(gVar)) {
                return false;
            }
        }
        return e0Var.A();
    }

    public static c o(r.b bVar) {
        return new c(bVar, null);
    }

    private void r(r.g gVar) {
        if (gVar.m() != this.f10093a) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    @Override // com.google.protobuf.o1
    public Map getAllFields() {
        return this.f10094b.p();
    }

    @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
    public r.b getDescriptorForType() {
        return this.f10093a;
    }

    @Override // com.google.protobuf.o1
    public Object getField(r.g gVar) {
        r(gVar);
        Object objQ = this.f10094b.q(gVar);
        return objQ == null ? gVar.b() ? Collections.EMPTY_LIST : gVar.u() == r.g.b.MESSAGE ? k(gVar.v()) : gVar.n() : objQ;
    }

    @Override // com.google.protobuf.l1, com.google.protobuf.i1
    public z1 getParserForType() {
        return new a();
    }

    @Override // com.google.protobuf.l1
    public int getSerializedSize() {
        int iV;
        int serializedSize;
        int i10 = this.f10097e;
        if (i10 != -1) {
            return i10;
        }
        if (this.f10093a.q().R()) {
            iV = this.f10094b.r();
            serializedSize = this.f10096d.e();
        } else {
            iV = this.f10094b.v();
            serializedSize = this.f10096d.getSerializedSize();
        }
        int i11 = iV + serializedSize;
        this.f10097e = i11;
        return i11;
    }

    @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
    public t2 getUnknownFields() {
        return this.f10096d;
    }

    @Override // com.google.protobuf.o1
    public boolean hasField(r.g gVar) {
        r(gVar);
        return this.f10094b.x(gVar);
    }

    @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
    public boolean isInitialized() {
        return n(this.f10093a, this.f10094b);
    }

    @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public t getDefaultInstanceForType() {
        return k(this.f10093a);
    }

    @Override // com.google.protobuf.l1, com.google.protobuf.i1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public c newBuilderForType() {
        return new c(this.f10093a, null);
    }

    @Override // com.google.protobuf.l1, com.google.protobuf.i1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public c toBuilder() {
        return newBuilderForType().mergeFrom(this);
    }

    @Override // com.google.protobuf.l1
    public void writeTo(o oVar) {
        if (this.f10093a.q().R()) {
            this.f10094b.P(oVar);
            this.f10096d.k(oVar);
        } else {
            this.f10094b.R(oVar);
            this.f10096d.writeTo(oVar);
        }
    }
}
