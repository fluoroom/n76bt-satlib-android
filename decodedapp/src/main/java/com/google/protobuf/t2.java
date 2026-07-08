package com.google.protobuf;

import com.google.protobuf.l1;
import com.google.protobuf.p0;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class t2 implements l1 {

    /* JADX INFO: renamed from: b */
    private static final t2 f10104b = new t2(new TreeMap());

    /* JADX INFO: renamed from: c */
    private static final d f10105c = new d();

    /* JADX INFO: renamed from: a */
    private final TreeMap f10106a;

    public static final class b implements l1.a {

        /* JADX INFO: renamed from: a */
        private TreeMap f10107a = new TreeMap();

        private b() {
        }

        public static b h() {
            return new b();
        }

        private c.a i(int i10) {
            if (i10 == 0) {
                return null;
            }
            c.a aVar = (c.a) this.f10107a.get(Integer.valueOf(i10));
            if (aVar != null) {
                return aVar;
            }
            c.a aVarS = c.s();
            this.f10107a.put(Integer.valueOf(i10), aVarS);
            return aVarS;
        }

        public b b(int i10, c cVar) {
            if (i10 > 0) {
                this.f10107a.put(Integer.valueOf(i10), c.t(cVar));
                return this;
            }
            throw new IllegalArgumentException(i10 + " is not a valid field number.");
        }

        @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
        /* JADX INFO: renamed from: d */
        public t2 build() {
            if (this.f10107a.isEmpty()) {
                return t2.c();
            }
            TreeMap treeMap = new TreeMap();
            for (Map.Entry entry : this.f10107a.entrySet()) {
                treeMap.put((Integer) entry.getKey(), ((c.a) entry.getValue()).g());
            }
            return new t2(treeMap);
        }

        @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
        /* JADX INFO: renamed from: f */
        public t2 buildPartial() {
            return build();
        }

        /* JADX INFO: renamed from: g */
        public b clone() {
            b bVarF = t2.f();
            for (Map.Entry entry : this.f10107a.entrySet()) {
                bVarF.f10107a.put((Integer) entry.getKey(), ((c.a) entry.getValue()).clone());
            }
            return bVarF;
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public boolean isInitialized() {
            return true;
        }

        public boolean j(int i10) {
            return this.f10107a.containsKey(Integer.valueOf(i10));
        }

        public b k(int i10, c cVar) {
            if (i10 <= 0) {
                throw new IllegalArgumentException(i10 + " is not a valid field number.");
            }
            if (j(i10)) {
                i(i10).j(cVar);
                return this;
            }
            b(i10, cVar);
            return this;
        }

        public boolean m(int i10, m mVar) throws p0.a {
            int iA = a3.a(i10);
            int iB = a3.b(i10);
            if (iB == 0) {
                i(iA).f(mVar.z());
                return true;
            }
            if (iB == 1) {
                i(iA).c(mVar.v());
                return true;
            }
            if (iB == 2) {
                i(iA).e(mVar.r());
                return true;
            }
            if (iB == 3) {
                b bVarF = t2.f();
                mVar.x(iA, bVarF, w.e());
                i(iA).d(bVarF.build());
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw p0.d();
            }
            i(iA).b(mVar.u());
            return true;
        }

        public b n(l lVar) throws p0 {
            try {
                m mVarS = lVar.s();
                o(mVarS);
                mVarS.a(0);
                return this;
            } catch (p0 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", e11);
            }
        }

        public b o(m mVar) {
            int iK;
            do {
                iK = mVar.K();
                if (iK == 0) {
                    break;
                }
            } while (m(iK, mVar));
            return this;
        }

        @Override // com.google.protobuf.l1.a
        /* JADX INFO: renamed from: p */
        public b mergeFrom(m mVar, y yVar) {
            return o(mVar);
        }

        public b r(t2 t2Var) {
            if (t2Var != t2.c()) {
                for (Map.Entry entry : t2Var.f10106a.entrySet()) {
                    k(((Integer) entry.getKey()).intValue(), (c) entry.getValue());
                }
            }
            return this;
        }

        public b t(int i10, l lVar) {
            if (i10 > 0) {
                i(i10).e(lVar);
                return this;
            }
            throw new IllegalArgumentException(i10 + " is not a valid field number.");
        }

        public b u(int i10, int i11) {
            if (i10 > 0) {
                i(i10).f(i11);
                return this;
            }
            throw new IllegalArgumentException(i10 + " is not a valid field number.");
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: f */
        private static final c f10108f = s().g();

        /* JADX INFO: renamed from: a */
        private List f10109a;

        /* JADX INFO: renamed from: b */
        private List f10110b;

        /* JADX INFO: renamed from: c */
        private List f10111c;

        /* JADX INFO: renamed from: d */
        private List f10112d;

        /* JADX INFO: renamed from: e */
        private List f10113e;

        public static final class a {

            /* JADX INFO: renamed from: a */
            private c f10114a = new c();

            private a() {
            }

            public static a i() {
                return new a();
            }

            public a b(int i10) {
                if (this.f10114a.f10110b == null) {
                    this.f10114a.f10110b = new ArrayList();
                }
                this.f10114a.f10110b.add(Integer.valueOf(i10));
                return this;
            }

            public a c(long j10) {
                if (this.f10114a.f10111c == null) {
                    this.f10114a.f10111c = new ArrayList();
                }
                this.f10114a.f10111c.add(Long.valueOf(j10));
                return this;
            }

            public a d(t2 t2Var) {
                if (this.f10114a.f10113e == null) {
                    this.f10114a.f10113e = new ArrayList();
                }
                this.f10114a.f10113e.add(t2Var);
                return this;
            }

            public a e(l lVar) {
                if (this.f10114a.f10112d == null) {
                    this.f10114a.f10112d = new ArrayList();
                }
                this.f10114a.f10112d.add(lVar);
                return this;
            }

            public a f(long j10) {
                if (this.f10114a.f10109a == null) {
                    this.f10114a.f10109a = new ArrayList();
                }
                this.f10114a.f10109a.add(Long.valueOf(j10));
                return this;
            }

            public c g() {
                c cVar = new c();
                if (this.f10114a.f10109a == null) {
                    cVar.f10109a = Collections.EMPTY_LIST;
                } else {
                    cVar.f10109a = DesugarCollections.unmodifiableList(new ArrayList(this.f10114a.f10109a));
                }
                if (this.f10114a.f10110b == null) {
                    cVar.f10110b = Collections.EMPTY_LIST;
                } else {
                    cVar.f10110b = DesugarCollections.unmodifiableList(new ArrayList(this.f10114a.f10110b));
                }
                if (this.f10114a.f10111c == null) {
                    cVar.f10111c = Collections.EMPTY_LIST;
                } else {
                    cVar.f10111c = DesugarCollections.unmodifiableList(new ArrayList(this.f10114a.f10111c));
                }
                if (this.f10114a.f10112d == null) {
                    cVar.f10112d = Collections.EMPTY_LIST;
                } else {
                    cVar.f10112d = DesugarCollections.unmodifiableList(new ArrayList(this.f10114a.f10112d));
                }
                if (this.f10114a.f10113e == null) {
                    cVar.f10113e = Collections.EMPTY_LIST;
                    return cVar;
                }
                cVar.f10113e = DesugarCollections.unmodifiableList(new ArrayList(this.f10114a.f10113e));
                return cVar;
            }

            /* JADX INFO: renamed from: h */
            public a clone() {
                c cVar = new c();
                if (this.f10114a.f10109a == null) {
                    cVar.f10109a = null;
                } else {
                    cVar.f10109a = new ArrayList(this.f10114a.f10109a);
                }
                if (this.f10114a.f10110b == null) {
                    cVar.f10110b = null;
                } else {
                    cVar.f10110b = new ArrayList(this.f10114a.f10110b);
                }
                if (this.f10114a.f10111c == null) {
                    cVar.f10111c = null;
                } else {
                    cVar.f10111c = new ArrayList(this.f10114a.f10111c);
                }
                if (this.f10114a.f10112d == null) {
                    cVar.f10112d = null;
                } else {
                    cVar.f10112d = new ArrayList(this.f10114a.f10112d);
                }
                if (this.f10114a.f10113e == null) {
                    cVar.f10113e = null;
                } else {
                    cVar.f10113e = new ArrayList(this.f10114a.f10113e);
                }
                a aVar = new a();
                aVar.f10114a = cVar;
                return aVar;
            }

            public a j(c cVar) {
                if (!cVar.f10109a.isEmpty()) {
                    if (this.f10114a.f10109a == null) {
                        this.f10114a.f10109a = new ArrayList();
                    }
                    this.f10114a.f10109a.addAll(cVar.f10109a);
                }
                if (!cVar.f10110b.isEmpty()) {
                    if (this.f10114a.f10110b == null) {
                        this.f10114a.f10110b = new ArrayList();
                    }
                    this.f10114a.f10110b.addAll(cVar.f10110b);
                }
                if (!cVar.f10111c.isEmpty()) {
                    if (this.f10114a.f10111c == null) {
                        this.f10114a.f10111c = new ArrayList();
                    }
                    this.f10114a.f10111c.addAll(cVar.f10111c);
                }
                if (!cVar.f10112d.isEmpty()) {
                    if (this.f10114a.f10112d == null) {
                        this.f10114a.f10112d = new ArrayList();
                    }
                    this.f10114a.f10112d.addAll(cVar.f10112d);
                }
                if (!cVar.f10113e.isEmpty()) {
                    if (this.f10114a.f10113e == null) {
                        this.f10114a.f10113e = new ArrayList();
                    }
                    this.f10114a.f10113e.addAll(cVar.f10113e);
                }
                return this;
            }
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        private Object[] n() {
            return new Object[]{this.f10109a, this.f10110b, this.f10111c, this.f10112d, this.f10113e};
        }

        public static a s() {
            return a.i();
        }

        public static a t(c cVar) {
            return s().j(cVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return Arrays.equals(n(), ((c) obj).n());
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(n());
        }

        public List k() {
            return this.f10110b;
        }

        public List l() {
            return this.f10111c;
        }

        public List m() {
            return this.f10113e;
        }

        public List o() {
            return this.f10112d;
        }

        public int p(int i10) {
            Iterator it = this.f10109a.iterator();
            int iT = 0;
            while (it.hasNext()) {
                iT += o.Z(i10, ((Long) it.next()).longValue());
            }
            Iterator it2 = this.f10110b.iterator();
            while (it2.hasNext()) {
                iT += o.n(i10, ((Integer) it2.next()).intValue());
            }
            Iterator it3 = this.f10111c.iterator();
            while (it3.hasNext()) {
                iT += o.p(i10, ((Long) it3.next()).longValue());
            }
            Iterator it4 = this.f10112d.iterator();
            while (it4.hasNext()) {
                iT += o.h(i10, (l) it4.next());
            }
            Iterator it5 = this.f10113e.iterator();
            while (it5.hasNext()) {
                iT += o.t(i10, (t2) it5.next());
            }
            return iT;
        }

        public int q(int i10) {
            Iterator it = this.f10112d.iterator();
            int iL = 0;
            while (it.hasNext()) {
                iL += o.L(i10, (l) it.next());
            }
            return iL;
        }

        public List r() {
            return this.f10109a;
        }

        public void u(int i10, o oVar) {
            Iterator it = this.f10112d.iterator();
            while (it.hasNext()) {
                oVar.K0(i10, (l) it.next());
            }
        }

        public void v(int i10, o oVar) {
            Iterator it = this.f10109a.iterator();
            while (it.hasNext()) {
                oVar.U0(i10, ((Long) it.next()).longValue());
            }
            Iterator it2 = this.f10110b.iterator();
            while (it2.hasNext()) {
                oVar.w0(i10, ((Integer) it2.next()).intValue());
            }
            Iterator it3 = this.f10111c.iterator();
            while (it3.hasNext()) {
                oVar.y0(i10, ((Long) it3.next()).longValue());
            }
            Iterator it4 = this.f10112d.iterator();
            while (it4.hasNext()) {
                oVar.q0(i10, (l) it4.next());
            }
            Iterator it5 = this.f10113e.iterator();
            while (it5.hasNext()) {
                oVar.B0(i10, (t2) it5.next());
            }
        }

        private c() {
        }
    }

    public static final class d extends com.google.protobuf.c {
        @Override // com.google.protobuf.z1
        /* JADX INFO: renamed from: c */
        public t2 parsePartialFrom(m mVar, y yVar) throws p0 {
            b bVarF = t2.f();
            try {
                bVarF.o(mVar);
                return bVarF.buildPartial();
            } catch (p0 e10) {
                throw e10.j(bVarF.buildPartial());
            } catch (IOException e11) {
                throw new p0(e11).j(bVarF.buildPartial());
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

    /* synthetic */ t2(TreeMap treeMap, a aVar) {
        this(treeMap);
    }

    public static t2 c() {
        return f10104b;
    }

    public static b f() {
        return b.h();
    }

    public static b g(t2 t2Var) {
        return f().r(t2Var);
    }

    public static t2 i(l lVar) {
        return f().n(lVar).build();
    }

    public Map b() {
        return (Map) this.f10106a.clone();
    }

    @Override // com.google.protobuf.l1, com.google.protobuf.i1
    /* JADX INFO: renamed from: d */
    public final d getParserForType() {
        return f10105c;
    }

    public int e() {
        int iQ = 0;
        for (Map.Entry entry : this.f10106a.entrySet()) {
            iQ += ((c) entry.getValue()).q(((Integer) entry.getKey()).intValue());
        }
        return iQ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t2) && this.f10106a.equals(((t2) obj).f10106a);
    }

    @Override // com.google.protobuf.l1
    public int getSerializedSize() {
        int iP = 0;
        if (!this.f10106a.isEmpty()) {
            for (Map.Entry entry : this.f10106a.entrySet()) {
                iP += ((c) entry.getValue()).p(((Integer) entry.getKey()).intValue());
            }
        }
        return iP;
    }

    @Override // com.google.protobuf.l1, com.google.protobuf.i1
    /* JADX INFO: renamed from: h */
    public b newBuilderForType() {
        return f();
    }

    public int hashCode() {
        if (this.f10106a.isEmpty()) {
            return 0;
        }
        return this.f10106a.hashCode();
    }

    @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
    public boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.l1, com.google.protobuf.i1
    /* JADX INFO: renamed from: j */
    public b toBuilder() {
        return f().r(this);
    }

    public void k(o oVar) {
        for (Map.Entry entry : this.f10106a.entrySet()) {
            ((c) entry.getValue()).u(((Integer) entry.getKey()).intValue(), oVar);
        }
    }

    @Override // com.google.protobuf.l1
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            o oVarI0 = o.i0(bArr);
            writeTo(oVarI0);
            oVarI0.d();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e10);
        }
    }

    public String toString() {
        return n2.o().k(this);
    }

    @Override // com.google.protobuf.l1
    public void writeTo(o oVar) {
        for (Map.Entry entry : this.f10106a.entrySet()) {
            ((c) entry.getValue()).v(((Integer) entry.getKey()).intValue(), oVar);
        }
    }

    private t2(TreeMap treeMap) {
        this.f10106a = treeMap;
    }

    @Override // com.google.protobuf.l1
    public void writeTo(OutputStream outputStream) {
        o oVarG0 = o.g0(outputStream);
        writeTo(oVarG0);
        oVarG0.d0();
    }
}
