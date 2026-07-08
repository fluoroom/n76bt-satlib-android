package pa;

import com.google.protobuf.a;
import com.google.protobuf.c;
import com.google.protobuf.f;
import com.google.protobuf.g2;
import com.google.protobuf.i1;
import com.google.protobuf.k0;
import com.google.protobuf.l;
import com.google.protobuf.l1;
import com.google.protobuf.m;
import com.google.protobuf.o;
import com.google.protobuf.o1;
import com.google.protobuf.p0;
import com.google.protobuf.r;
import com.google.protobuf.r2;
import com.google.protobuf.t2;
import com.google.protobuf.y;
import com.google.protobuf.z1;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends k0 implements o1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f24088e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final z1 f24089f = new C0330a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f24091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f24092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f24093d;

    /* JADX INFO: renamed from: pa.a$a, reason: collision with other inner class name */
    class C0330a extends c {
        C0330a() {
        }

        @Override // com.google.protobuf.z1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a parsePartialFrom(m mVar, y yVar) throws p0 {
            b bVarA = a.A();
            try {
                bVarA.mergeFrom(mVar, yVar);
                return bVarA.buildPartial();
            } catch (p0 e10) {
                throw e10.j(bVarA.buildPartial());
            } catch (r2 e11) {
                throw e11.a().j(bVarA.buildPartial());
            } catch (IOException e12) {
                throw new p0(e12).j(bVarA.buildPartial());
            }
        }
    }

    public static final class b extends k0.b implements o1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f24094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f24095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f24096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List f24097d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private g2 f24098e;

        /* synthetic */ b(k0.c cVar, C0330a c0330a) {
            this(cVar);
        }

        private void j(a aVar) {
            int i10 = this.f24094a;
            if ((i10 & 1) != 0) {
                aVar.f24090a = this.f24095b;
            }
            if ((i10 & 2) != 0) {
                aVar.f24091b = this.f24096c;
            }
        }

        private void k(a aVar) {
            g2 g2Var = this.f24098e;
            if (g2Var != null) {
                aVar.f24092c = g2Var.g();
                return;
            }
            if ((this.f24094a & 4) != 0) {
                this.f24097d = DesugarCollections.unmodifiableList(this.f24097d);
                this.f24094a &= -5;
            }
            aVar.f24092c = this.f24097d;
        }

        private void o() {
            if ((this.f24094a & 4) == 0) {
                this.f24097d = new ArrayList(this.f24097d);
                this.f24094a |= 4;
            }
        }

        private g2 r() {
            if (this.f24098e == null) {
                this.f24098e = new g2(this.f24097d, (this.f24094a & 4) != 0, getParentForChildren(), isClean());
                this.f24097d = null;
            }
            return this.f24098e;
        }

        @Override // com.google.protobuf.i1.a
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public final b setUnknownFields(t2 t2Var) {
            return (b) super.setUnknownFields(t2Var);
        }

        @Override // com.google.protobuf.i1.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b addRepeatedField(r.g gVar, Object obj) {
            return (b) super.addRepeatedField(gVar, obj);
        }

        @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public r.b getDescriptorForType() {
            return pa.b.f24099a;
        }

        @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a build() {
            a aVarBuildPartial = buildPartial();
            if (aVarBuildPartial.isInitialized()) {
                return aVarBuildPartial;
            }
            throw a.AbstractC0131a.newUninitializedMessageException((i1) aVarBuildPartial);
        }

        @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a buildPartial() {
            a aVar = new a(this, null);
            k(aVar);
            if (this.f24094a != 0) {
                j(aVar);
            }
            onBuilt();
            return aVar;
        }

        @Override // com.google.protobuf.k0.b
        protected k0.f internalGetFieldAccessorTable() {
            return pa.b.f24100b.d(a.class, b.class);
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

        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return (b) super.m1147clone();
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public a getDefaultInstanceForType() {
            return a.v();
        }

        @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(m mVar, y yVar) {
            yVar.getClass();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = mVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f24095b = mVar.y();
                                this.f24094a |= 1;
                            } else if (iK == 18) {
                                this.f24096c = mVar.J();
                                this.f24094a |= 2;
                            } else if (iK == 26) {
                                f fVar = (f) mVar.A(f.parser(), yVar);
                                g2 g2Var = this.f24098e;
                                if (g2Var == null) {
                                    o();
                                    this.f24097d.add(fVar);
                                } else {
                                    g2Var.f(fVar);
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

        @Override // com.google.protobuf.i1.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public b mergeFrom(i1 i1Var) {
            if (i1Var instanceof a) {
                return v((a) i1Var);
            }
            super.mergeFrom(i1Var);
            return this;
        }

        public b v(a aVar) {
            if (aVar == a.v()) {
                return this;
            }
            if (aVar.t() != 0) {
                x(aVar.t());
            }
            if (!aVar.getMessage().isEmpty()) {
                this.f24096c = aVar.f24091b;
                this.f24094a |= 2;
                onChanged();
            }
            if (this.f24098e == null) {
                if (!aVar.f24092c.isEmpty()) {
                    if (this.f24097d.isEmpty()) {
                        this.f24097d = aVar.f24092c;
                        this.f24094a &= -5;
                    } else {
                        o();
                        this.f24097d.addAll(aVar.f24092c);
                    }
                    onChanged();
                }
            } else if (!aVar.f24092c.isEmpty()) {
                if (this.f24098e.u()) {
                    this.f24098e.i();
                    this.f24098e = null;
                    this.f24097d = aVar.f24092c;
                    this.f24094a &= -5;
                    this.f24098e = k0.alwaysUseFieldBuilders ? r() : null;
                } else {
                    this.f24098e.b(aVar.f24092c);
                }
            }
            m1148mergeUnknownFields(aVar.getUnknownFields());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.a.AbstractC0131a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public final b m1148mergeUnknownFields(t2 t2Var) {
            return (b) super.m1148mergeUnknownFields(t2Var);
        }

        public b x(int i10) {
            this.f24095b = i10;
            this.f24094a |= 1;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.i1.a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b setField(r.g gVar, Object obj) {
            return (b) super.setField(gVar, obj);
        }

        public b z(String str) {
            str.getClass();
            this.f24096c = str;
            this.f24094a |= 2;
            onChanged();
            return this;
        }

        /* synthetic */ b(C0330a c0330a) {
            this();
        }

        private b() {
            this.f24096c = "";
            this.f24097d = Collections.EMPTY_LIST;
        }

        private b(k0.c cVar) {
            super(cVar);
            this.f24096c = "";
            this.f24097d = Collections.EMPTY_LIST;
        }
    }

    /* synthetic */ a(k0.b bVar, C0330a c0330a) {
        this(bVar);
    }

    public static b A() {
        return f24088e.toBuilder();
    }

    public static final r.b getDescriptor() {
        return pa.b.f24099a;
    }

    public static a v() {
        return f24088e;
    }

    @Override // com.google.protobuf.l1, com.google.protobuf.i1
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType() {
        return A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.k0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public b newBuilderForType(k0.c cVar) {
        return new b(cVar, null);
    }

    @Override // com.google.protobuf.l1, com.google.protobuf.i1
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public b toBuilder() {
        C0330a c0330a = null;
        return this == f24088e ? new b(c0330a) : new b(c0330a).v(this);
    }

    @Override // com.google.protobuf.a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return super.equals(obj);
        }
        a aVar = (a) obj;
        return t() == aVar.t() && getMessage().equals(aVar.getMessage()) && z().equals(aVar.z()) && getUnknownFields().equals(aVar.getUnknownFields());
    }

    public String getMessage() {
        Object obj = this.f24091b;
        if (obj instanceof String) {
            return (String) obj;
        }
        String strN = ((l) obj).N();
        this.f24091b = strN;
        return strN;
    }

    @Override // com.google.protobuf.l1, com.google.protobuf.i1
    public z1 getParserForType() {
        return f24089f;
    }

    @Override // com.google.protobuf.l1
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.f24090a;
        int iX = i11 != 0 ? o.x(1, i11) : 0;
        if (!k0.isStringEmpty(this.f24091b)) {
            iX += k0.computeStringSize(2, this.f24091b);
        }
        for (int i12 = 0; i12 < this.f24092c.size(); i12++) {
            iX += o.G(3, (l1) this.f24092c.get(i12));
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
        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + t()) * 37) + 2) * 53) + getMessage().hashCode();
        if (x() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + z().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.k0
    protected k0.f internalGetFieldAccessorTable() {
        return pa.b.f24100b.d(a.class, b.class);
    }

    @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f24093d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f24093d = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.k0
    protected Object newInstance(k0.g gVar) {
        return new a();
    }

    public int t() {
        return this.f24090a;
    }

    @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public a getDefaultInstanceForType() {
        return f24088e;
    }

    @Override // com.google.protobuf.l1
    public void writeTo(o oVar) throws IOException {
        int i10 = this.f24090a;
        if (i10 != 0) {
            oVar.D0(1, i10);
        }
        if (!k0.isStringEmpty(this.f24091b)) {
            k0.writeString(oVar, 2, this.f24091b);
        }
        for (int i11 = 0; i11 < this.f24092c.size(); i11++) {
            oVar.H0(3, (l1) this.f24092c.get(i11));
        }
        getUnknownFields().writeTo(oVar);
    }

    public int x() {
        return this.f24092c.size();
    }

    public List z() {
        return this.f24092c;
    }

    private a(k0.b bVar) {
        super(bVar);
        this.f24090a = 0;
        this.f24091b = "";
        this.f24093d = (byte) -1;
    }

    private a() {
        this.f24090a = 0;
        this.f24091b = "";
        this.f24093d = (byte) -1;
        this.f24091b = "";
        this.f24092c = Collections.EMPTY_LIST;
    }
}
