package nk;

import com.google.protobuf.a;
import com.google.protobuf.g2;
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
import com.google.protobuf.y;
import com.google.protobuf.z1;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r.b f22973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k0.f f22974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final r.b f22975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final k0.f f22976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final r.b f22977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final k0.f f22978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final r.b f22979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final k0.f f22980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static r.h f22981i = r.h.s(new String[]{"\n\u000fsatellite.proto\u0012\tsatellite\"ô\u0001\n\u0006RfInfo\u0012\u0012\n\nUplinkFreq\u0018\u0001 \u0001(\u0005\u0012\u0014\n\fDownlinkFreq\u0018\u0002 \u0001(\u0005\u0012\u0016\n\u000eUplinkSubAudio\u0018\u0003 \u0001(\u0005\u0012\u0018\n\u0010DownlinkSubAudio\u0018\u0004 \u0001(\u0005\u0012(\n\tUplinkMod\u0018\u0005 \u0001(\u000e2\u0015.satellite.Modulation\u0012*\n\u000bDownlinkMod\u0018\u0006 \u0001(\u000e2\u0015.satellite.Modulation\u0012\u0011\n\tBandwidth\u0018\u0007 \u0001(\u0005\u0012\f\n\u0004Name\u0018\t \u0001(\t\u0012\u0011\n\tUpdatedAt\u0018\n \u0001(\u0003J\u0004\b\b\u0010\t\"\u0088\u0001\n\u0002GP\u0012\f\n\u0004Name\u0018\u0001 \u0001(\t\u0012\u0012\n\nNoradCatID\u0018\u0002 \u0001(\u0005\u0012\u0010\n\bTLELine1\u0018\u0004 \u0001(\t\u0012\u0010\n\bTLELine2\u0018\u0005 \u0001(\t\u0012\u001d\n\u0002rf\u0018\u0006 \u0003(\u000b2\u0011.satellite.RfInfo\u0012\u0011\n\tUpdatedAt\u0018\b \u0001(\u0003J\u0004\b\u0003\u0010\u0004J\u0004\b\u0007\u0010\b\"\u001e\n\fGetGPRequest\u0012\u000e\n\u0006syncAt\u0018\u0001 \u0001(\u0003\"6\n\u000bGetGPResult\u0012\u0019\n\u0002gp\u0018\u0001 \u0003(\u000b2\r.satellite.GP\u0012\f\n\u0004time\u0018\u0002 \u0001(\u0003*%\n\nModulation\u0012\u0006\n\u0002FM\u0010\u0000\u0012\u0006\n\u0002AM\u0010\u0001\u0012\u0007\n\u0003DMR\u0010\u00022G\n\tSatellite\u0012:\n\u0005GetGP\u0012\u0017.satellite.GetGPRequest\u001a\u0016.satellite.GetGPResult\"\u0000B\u000eZ\f../satelliteb\u0006proto3"}, new r.h[0]);

    /* JADX INFO: renamed from: nk.b$b, reason: collision with other inner class name */
    public static final class C0305b extends k0 implements o1 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final C0305b f22982h = new C0305b();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final z1 f22983r = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile Object f22984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f22985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile Object f22986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile Object f22987d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f22988e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f22989f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f22990g;

        /* JADX INFO: renamed from: nk.b$b$a */
        class a extends com.google.protobuf.c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public C0305b parsePartialFrom(m mVar, y yVar) throws p0 {
                C0306b c0306bO = C0305b.O();
                try {
                    c0306bO.mergeFrom(mVar, yVar);
                    return c0306bO.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(c0306bO.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(c0306bO.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(c0306bO.buildPartial());
                }
            }
        }

        public static C0305b A() {
            return f22982h;
        }

        public static C0306b O() {
            return f22982h.toBuilder();
        }

        public static final r.b getDescriptor() {
            return b.f22975c;
        }

        public static z1 parser() {
            return f22983r;
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C0305b getDefaultInstanceForType() {
            return f22982h;
        }

        public int D() {
            return this.f22985b;
        }

        public int G() {
            return this.f22988e.size();
        }

        public List H() {
            return this.f22988e;
        }

        public String K() {
            Object obj = this.f22986c;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((l) obj).N();
            this.f22986c = strN;
            return strN;
        }

        public String L() {
            Object obj = this.f22987d;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((l) obj).N();
            this.f22987d = strN;
            return strN;
        }

        public long N() {
            return this.f22989f;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public C0306b newBuilderForType() {
            return O();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public C0306b newBuilderForType(k0.c cVar) {
            return new C0306b(cVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public C0306b toBuilder() {
            return this == f22982h ? new C0306b() : new C0306b().v(this);
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0305b)) {
                return super.equals(obj);
            }
            C0305b c0305b = (C0305b) obj;
            return getName().equals(c0305b.getName()) && D() == c0305b.D() && K().equals(c0305b.K()) && L().equals(c0305b.L()) && H().equals(c0305b.H()) && N() == c0305b.N() && getUnknownFields().equals(c0305b.getUnknownFields());
        }

        public String getName() {
            Object obj = this.f22984a;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((l) obj).N();
            this.f22984a = strN;
            return strN;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return f22983r;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !k0.isStringEmpty(this.f22984a) ? k0.computeStringSize(1, this.f22984a) : 0;
            int i11 = this.f22985b;
            if (i11 != 0) {
                iComputeStringSize += o.x(2, i11);
            }
            if (!k0.isStringEmpty(this.f22986c)) {
                iComputeStringSize += k0.computeStringSize(4, this.f22986c);
            }
            if (!k0.isStringEmpty(this.f22987d)) {
                iComputeStringSize += k0.computeStringSize(5, this.f22987d);
            }
            for (int i12 = 0; i12 < this.f22988e.size(); i12++) {
                iComputeStringSize += o.G(6, (l1) this.f22988e.get(i12));
            }
            long j10 = this.f22989f;
            if (j10 != 0) {
                iComputeStringSize += o.z(8, j10);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
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
            int iHashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + D()) * 37) + 4) * 53) + K().hashCode()) * 37) + 5) * 53) + L().hashCode();
            if (G() > 0) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + H().hashCode();
            }
            int i11 = (((((iHashCode * 37) + 8) * 53) + o0.i(N())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = i11;
            return i11;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return b.f22976d.d(C0305b.class, C0306b.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f22990g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f22990g = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new C0305b();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(o oVar) throws IOException {
            if (!k0.isStringEmpty(this.f22984a)) {
                k0.writeString(oVar, 1, this.f22984a);
            }
            int i10 = this.f22985b;
            if (i10 != 0) {
                oVar.D0(2, i10);
            }
            if (!k0.isStringEmpty(this.f22986c)) {
                k0.writeString(oVar, 4, this.f22986c);
            }
            if (!k0.isStringEmpty(this.f22987d)) {
                k0.writeString(oVar, 5, this.f22987d);
            }
            for (int i11 = 0; i11 < this.f22988e.size(); i11++) {
                oVar.H0(6, (l1) this.f22988e.get(i11));
            }
            long j10 = this.f22989f;
            if (j10 != 0) {
                oVar.F0(8, j10);
            }
            getUnknownFields().writeTo(oVar);
        }

        /* JADX INFO: renamed from: nk.b$b$b, reason: collision with other inner class name */
        public static final class C0306b extends k0.b implements o1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f22991a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Object f22992b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f22993c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Object f22994d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Object f22995e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private List f22996f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private g2 f22997g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private long f22998h;

            private void j(C0305b c0305b) {
                int i10 = this.f22991a;
                if ((i10 & 1) != 0) {
                    c0305b.f22984a = this.f22992b;
                }
                if ((i10 & 2) != 0) {
                    c0305b.f22985b = this.f22993c;
                }
                if ((i10 & 4) != 0) {
                    c0305b.f22986c = this.f22994d;
                }
                if ((i10 & 8) != 0) {
                    c0305b.f22987d = this.f22995e;
                }
                if ((i10 & 32) != 0) {
                    c0305b.f22989f = this.f22998h;
                }
            }

            private void k(C0305b c0305b) {
                g2 g2Var = this.f22997g;
                if (g2Var != null) {
                    c0305b.f22988e = g2Var.g();
                    return;
                }
                if ((this.f22991a & 16) != 0) {
                    this.f22996f = DesugarCollections.unmodifiableList(this.f22996f);
                    this.f22991a &= -17;
                }
                c0305b.f22988e = this.f22996f;
            }

            private void o() {
                if ((this.f22991a & 16) == 0) {
                    this.f22996f = new ArrayList(this.f22996f);
                    this.f22991a |= 16;
                }
            }

            private g2 r() {
                if (this.f22997g == null) {
                    this.f22997g = new g2(this.f22996f, (this.f22991a & 16) != 0, getParentForChildren(), isClean());
                    this.f22996f = null;
                }
                return this.f22997g;
            }

            public C0306b A(long j10) {
                this.f22998h = j10;
                this.f22991a |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C0306b addRepeatedField(r.g gVar, Object obj) {
                return (C0306b) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return b.f22975c;
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public C0305b build() {
                C0305b c0305bBuildPartial = buildPartial();
                if (c0305bBuildPartial.isInitialized()) {
                    return c0305bBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) c0305bBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public C0305b buildPartial() {
                C0305b c0305b = new C0305b(this);
                k(c0305b);
                if (this.f22991a != 0) {
                    j(c0305b);
                }
                onBuilt();
                return c0305b;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return b.f22976d.d(C0305b.class, C0306b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public C0306b m1140clearField(r.g gVar) {
                return (C0306b) super.m1140clearField(gVar);
            }

            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public C0306b clone() {
                return (C0306b) super.m1147clone();
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public C0305b getDefaultInstanceForType() {
                return C0305b.A();
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public C0306b mergeFrom(m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    this.f22992b = mVar.J();
                                    this.f22991a |= 1;
                                } else if (iK == 16) {
                                    this.f22993c = mVar.y();
                                    this.f22991a |= 2;
                                } else if (iK == 34) {
                                    this.f22994d = mVar.J();
                                    this.f22991a |= 4;
                                } else if (iK == 42) {
                                    this.f22995e = mVar.J();
                                    this.f22991a |= 8;
                                } else if (iK == 50) {
                                    f fVar = (f) mVar.A(f.parser(), yVar);
                                    g2 g2Var = this.f22997g;
                                    if (g2Var == null) {
                                        o();
                                        this.f22996f.add(fVar);
                                    } else {
                                        g2Var.f(fVar);
                                    }
                                } else if (iK == 64) {
                                    this.f22998h = mVar.z();
                                    this.f22991a |= 32;
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
            public C0306b mergeFrom(i1 i1Var) {
                if (i1Var instanceof C0305b) {
                    return v((C0305b) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public C0306b v(C0305b c0305b) {
                if (c0305b == C0305b.A()) {
                    return this;
                }
                if (!c0305b.getName().isEmpty()) {
                    this.f22992b = c0305b.f22984a;
                    this.f22991a |= 1;
                    onChanged();
                }
                if (c0305b.D() != 0) {
                    y(c0305b.D());
                }
                if (!c0305b.K().isEmpty()) {
                    this.f22994d = c0305b.f22986c;
                    this.f22991a |= 4;
                    onChanged();
                }
                if (!c0305b.L().isEmpty()) {
                    this.f22995e = c0305b.f22987d;
                    this.f22991a |= 8;
                    onChanged();
                }
                if (this.f22997g == null) {
                    if (!c0305b.f22988e.isEmpty()) {
                        if (this.f22996f.isEmpty()) {
                            this.f22996f = c0305b.f22988e;
                            this.f22991a &= -17;
                        } else {
                            o();
                            this.f22996f.addAll(c0305b.f22988e);
                        }
                        onChanged();
                    }
                } else if (!c0305b.f22988e.isEmpty()) {
                    if (this.f22997g.u()) {
                        this.f22997g.i();
                        this.f22997g = null;
                        this.f22996f = c0305b.f22988e;
                        this.f22991a &= -17;
                        this.f22997g = k0.alwaysUseFieldBuilders ? r() : null;
                    } else {
                        this.f22997g.b(c0305b.f22988e);
                    }
                }
                if (c0305b.N() != 0) {
                    A(c0305b.N());
                }
                m1148mergeUnknownFields(c0305b.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public final C0306b m1148mergeUnknownFields(t2 t2Var) {
                return (C0306b) super.m1148mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public C0306b setField(r.g gVar, Object obj) {
                return (C0306b) super.setField(gVar, obj);
            }

            public C0306b y(int i10) {
                this.f22993c = i10;
                this.f22991a |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public final C0306b setUnknownFields(t2 t2Var) {
                return (C0306b) super.setUnknownFields(t2Var);
            }

            private C0306b() {
                this.f22992b = "";
                this.f22994d = "";
                this.f22995e = "";
                this.f22996f = Collections.EMPTY_LIST;
            }

            private C0306b(k0.c cVar) {
                super(cVar);
                this.f22992b = "";
                this.f22994d = "";
                this.f22995e = "";
                this.f22996f = Collections.EMPTY_LIST;
            }
        }

        private C0305b(k0.b bVar) {
            super(bVar);
            this.f22984a = "";
            this.f22985b = 0;
            this.f22986c = "";
            this.f22987d = "";
            this.f22989f = 0L;
            this.f22990g = (byte) -1;
        }

        private C0305b() {
            this.f22984a = "";
            this.f22985b = 0;
            this.f22986c = "";
            this.f22987d = "";
            this.f22989f = 0L;
            this.f22990g = (byte) -1;
            this.f22984a = "";
            this.f22986c = "";
            this.f22987d = "";
            this.f22988e = Collections.EMPTY_LIST;
        }
    }

    public static final class c extends k0 implements o1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final c f22999c = new c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final z1 f23000d = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f23001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte f23002b;

        class a extends com.google.protobuf.c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public c parsePartialFrom(m mVar, y yVar) throws p0 {
                C0307b c0307bQ = c.q();
                try {
                    c0307bQ.mergeFrom(mVar, yVar);
                    return c0307bQ.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(c0307bQ.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(c0307bQ.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(c0307bQ.buildPartial());
                }
            }
        }

        public static final r.b getDescriptor() {
            return b.f22977e;
        }

        public static c o() {
            return f22999c;
        }

        public static C0307b q() {
            return f22999c.toBuilder();
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
            return getSyncAt() == cVar.getSyncAt() && getUnknownFields().equals(cVar.getUnknownFields());
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return f23000d;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.f23001a;
            int iZ = (j10 != 0 ? o.z(1, j10) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iZ;
            return iZ;
        }

        public long getSyncAt() {
            return this.f23001a;
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
            int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + o0.i(getSyncAt())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return b.f22978f.d(c.class, C0307b.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f23002b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f23002b = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new c();
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public c getDefaultInstanceForType() {
            return f22999c;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public C0307b newBuilderForType() {
            return q();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public C0307b newBuilderForType(k0.c cVar) {
            return new C0307b(cVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public C0307b toBuilder() {
            return this == f22999c ? new C0307b() : new C0307b().r(this);
        }

        @Override // com.google.protobuf.l1
        public void writeTo(o oVar) {
            long j10 = this.f23001a;
            if (j10 != 0) {
                oVar.F0(1, j10);
            }
            getUnknownFields().writeTo(oVar);
        }

        /* JADX INFO: renamed from: nk.b$c$b, reason: collision with other inner class name */
        public static final class C0307b extends k0.b implements o1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f23003a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f23004b;

            private void j(c cVar) {
                if ((this.f23003a & 1) != 0) {
                    cVar.f23001a = this.f23004b;
                }
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C0307b addRepeatedField(r.g gVar, Object obj) {
                return (C0307b) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return b.f22977e;
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public c build() {
                c cVarBuildPartial = buildPartial();
                if (cVarBuildPartial.isInitialized()) {
                    return cVarBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) cVarBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public c buildPartial() {
                c cVar = new c(this);
                if (this.f23003a != 0) {
                    j(cVar);
                }
                onBuilt();
                return cVar;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return b.f22978f.d(c.class, C0307b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public C0307b m1140clearField(r.g gVar) {
                return (C0307b) super.m1140clearField(gVar);
            }

            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public C0307b clone() {
                return (C0307b) super.m1147clone();
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public c getDefaultInstanceForType() {
                return c.o();
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public C0307b mergeFrom(m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    this.f23004b = mVar.z();
                                    this.f23003a |= 1;
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
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public C0307b mergeFrom(i1 i1Var) {
                if (i1Var instanceof c) {
                    return r((c) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public C0307b r(c cVar) {
                if (cVar == c.o()) {
                    return this;
                }
                if (cVar.getSyncAt() != 0) {
                    v(cVar.getSyncAt());
                }
                m1148mergeUnknownFields(cVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public final C0307b m1148mergeUnknownFields(t2 t2Var) {
                return (C0307b) super.m1148mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public C0307b setField(r.g gVar, Object obj) {
                return (C0307b) super.setField(gVar, obj);
            }

            public C0307b v(long j10) {
                this.f23004b = j10;
                this.f23003a |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public final C0307b setUnknownFields(t2 t2Var) {
                return (C0307b) super.setUnknownFields(t2Var);
            }

            private C0307b() {
            }

            private C0307b(k0.c cVar) {
                super(cVar);
            }
        }

        private c(k0.b bVar) {
            super(bVar);
            this.f23001a = 0L;
            this.f23002b = (byte) -1;
        }

        private c() {
            this.f23001a = 0L;
            this.f23002b = (byte) -1;
        }
    }

    public static final class d extends k0 implements o1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final d f23005d = new d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final z1 f23006e = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f23007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f23008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte f23009c;

        class a extends com.google.protobuf.c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public d parsePartialFrom(m mVar, y yVar) throws p0 {
                C0308b c0308bX = d.x();
                try {
                    c0308bX.mergeFrom(mVar, yVar);
                    return c0308bX.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(c0308bX.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(c0308bX.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(c0308bX.buildPartial());
                }
            }
        }

        public static final r.b getDescriptor() {
            return b.f22979g;
        }

        public static d r() {
            return f23005d;
        }

        public static C0308b x() {
            return f23005d.toBuilder();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public C0308b newBuilderForType(k0.c cVar) {
            return new C0308b(cVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C0308b toBuilder() {
            return this == f23005d ? new C0308b() : new C0308b().v(this);
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
            return v().equals(dVar.v()) && w() == dVar.w() && getUnknownFields().equals(dVar.getUnknownFields());
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return f23006e;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iZ = 0;
            for (int i11 = 0; i11 < this.f23007a.size(); i11++) {
                iZ += o.G(1, (l1) this.f23007a.get(i11));
            }
            long j10 = this.f23008b;
            if (j10 != 0) {
                iZ += o.z(2, j10);
            }
            int serializedSize = iZ + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
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
            int iHashCode = 779 + getDescriptor().hashCode();
            if (t() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + v().hashCode();
            }
            int i11 = (((((iHashCode * 37) + 2) * 53) + o0.i(w())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = i11;
            return i11;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return b.f22980h.d(d.class, C0308b.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f23009c;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f23009c = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new d();
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public d getDefaultInstanceForType() {
            return f23005d;
        }

        public int t() {
            return this.f23007a.size();
        }

        public List v() {
            return this.f23007a;
        }

        public long w() {
            return this.f23008b;
        }

        @Override // com.google.protobuf.l1
        public void writeTo(o oVar) {
            for (int i10 = 0; i10 < this.f23007a.size(); i10++) {
                oVar.H0(1, (l1) this.f23007a.get(i10));
            }
            long j10 = this.f23008b;
            if (j10 != 0) {
                oVar.F0(2, j10);
            }
            getUnknownFields().writeTo(oVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public C0308b newBuilderForType() {
            return x();
        }

        /* JADX INFO: renamed from: nk.b$d$b, reason: collision with other inner class name */
        public static final class C0308b extends k0.b implements o1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f23010a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private List f23011b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private g2 f23012c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private long f23013d;

            private void j(d dVar) {
                if ((this.f23010a & 2) != 0) {
                    dVar.f23008b = this.f23013d;
                }
            }

            private void k(d dVar) {
                g2 g2Var = this.f23012c;
                if (g2Var != null) {
                    dVar.f23007a = g2Var.g();
                    return;
                }
                if ((this.f23010a & 1) != 0) {
                    this.f23011b = DesugarCollections.unmodifiableList(this.f23011b);
                    this.f23010a &= -2;
                }
                dVar.f23007a = this.f23011b;
            }

            private void o() {
                if ((this.f23010a & 1) == 0) {
                    this.f23011b = new ArrayList(this.f23011b);
                    this.f23010a |= 1;
                }
            }

            private g2 r() {
                if (this.f23012c == null) {
                    this.f23012c = new g2(this.f23011b, (this.f23010a & 1) != 0, getParentForChildren(), isClean());
                    this.f23011b = null;
                }
                return this.f23012c;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C0308b addRepeatedField(r.g gVar, Object obj) {
                return (C0308b) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return b.f22979g;
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public d build() {
                d dVarBuildPartial = buildPartial();
                if (dVarBuildPartial.isInitialized()) {
                    return dVarBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((i1) dVarBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public d buildPartial() {
                d dVar = new d(this);
                k(dVar);
                if (this.f23010a != 0) {
                    j(dVar);
                }
                onBuilt();
                return dVar;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return b.f22980h.d(d.class, C0308b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public C0308b m1140clearField(r.g gVar) {
                return (C0308b) super.m1140clearField(gVar);
            }

            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public C0308b clone() {
                return (C0308b) super.m1147clone();
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public d getDefaultInstanceForType() {
                return d.r();
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public C0308b mergeFrom(m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    C0305b c0305b = (C0305b) mVar.A(C0305b.parser(), yVar);
                                    g2 g2Var = this.f23012c;
                                    if (g2Var == null) {
                                        o();
                                        this.f23011b.add(c0305b);
                                    } else {
                                        g2Var.f(c0305b);
                                    }
                                } else if (iK == 16) {
                                    this.f23013d = mVar.z();
                                    this.f23010a |= 2;
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
            public C0308b mergeFrom(i1 i1Var) {
                if (i1Var instanceof d) {
                    return v((d) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public C0308b v(d dVar) {
                if (dVar == d.r()) {
                    return this;
                }
                if (this.f23012c == null) {
                    if (!dVar.f23007a.isEmpty()) {
                        if (this.f23011b.isEmpty()) {
                            this.f23011b = dVar.f23007a;
                            this.f23010a &= -2;
                        } else {
                            o();
                            this.f23011b.addAll(dVar.f23007a);
                        }
                        onChanged();
                    }
                } else if (!dVar.f23007a.isEmpty()) {
                    if (this.f23012c.u()) {
                        this.f23012c.i();
                        this.f23012c = null;
                        this.f23011b = dVar.f23007a;
                        this.f23010a &= -2;
                        this.f23012c = k0.alwaysUseFieldBuilders ? r() : null;
                    } else {
                        this.f23012c.b(dVar.f23007a);
                    }
                }
                if (dVar.w() != 0) {
                    y(dVar.w());
                }
                m1148mergeUnknownFields(dVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public final C0308b m1148mergeUnknownFields(t2 t2Var) {
                return (C0308b) super.m1148mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public C0308b setField(r.g gVar, Object obj) {
                return (C0308b) super.setField(gVar, obj);
            }

            public C0308b y(long j10) {
                this.f23013d = j10;
                this.f23010a |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public final C0308b setUnknownFields(t2 t2Var) {
                return (C0308b) super.setUnknownFields(t2Var);
            }

            private C0308b() {
                this.f23011b = Collections.EMPTY_LIST;
            }

            private C0308b(k0.c cVar) {
                super(cVar);
                this.f23011b = Collections.EMPTY_LIST;
            }
        }

        private d(k0.b bVar) {
            super(bVar);
            this.f23008b = 0L;
            this.f23009c = (byte) -1;
        }

        private d() {
            this.f23008b = 0L;
            this.f23009c = (byte) -1;
            this.f23007a = Collections.EMPTY_LIST;
        }
    }

    public enum e implements o0.c {
        FM(0),
        AM(1),
        DMR(2),
        UNRECOGNIZED(-1);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final o0.d f23018f = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final e[] f23019g = values();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f23021a;

        class a implements o0.d {
            a() {
            }
        }

        e(int i10) {
            this.f23021a = i10;
        }

        public static e d(int i10) {
            if (i10 == 0) {
                return FM;
            }
            if (i10 == 1) {
                return AM;
            }
            if (i10 != 2) {
                return null;
            }
            return DMR;
        }

        @Override // com.google.protobuf.o0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f23021a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static final class f extends k0 implements o1 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final f f23022t = new f();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final z1 f23023u = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f23026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f23027d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f23028e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f23029f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f23030g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private volatile Object f23031h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private long f23032r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private byte f23033s;

        class a extends com.google.protobuf.c {
            a() {
            }

            @Override // com.google.protobuf.z1
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public f parsePartialFrom(m mVar, y yVar) throws p0 {
                C0309b c0309bT = f.T();
                try {
                    c0309bT.mergeFrom(mVar, yVar);
                    return c0309bT.buildPartial();
                } catch (p0 e10) {
                    throw e10.j(c0309bT.buildPartial());
                } catch (r2 e11) {
                    throw e11.a().j(c0309bT.buildPartial());
                } catch (IOException e12) {
                    throw new p0(e12).j(c0309bT.buildPartial());
                }
            }
        }

        public static f C() {
            return f23022t;
        }

        public static C0309b T() {
            return f23022t.toBuilder();
        }

        public static final r.b getDescriptor() {
            return b.f22973a;
        }

        public static z1 parser() {
            return f23023u;
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public f getDefaultInstanceForType() {
            return f23022t;
        }

        public int G() {
            return this.f23025b;
        }

        public e H() {
            e eVarD = e.d(this.f23029f);
            return eVarD == null ? e.UNRECOGNIZED : eVarD;
        }

        public int K() {
            return this.f23029f;
        }

        public int L() {
            return this.f23027d;
        }

        public long N() {
            return this.f23032r;
        }

        public int O() {
            return this.f23024a;
        }

        public e Q() {
            e eVarD = e.d(this.f23028e);
            return eVarD == null ? e.UNRECOGNIZED : eVarD;
        }

        public int R() {
            return this.f23028e;
        }

        public int S() {
            return this.f23026c;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public C0309b newBuilderForType() {
            return T();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public C0309b newBuilderForType(k0.c cVar) {
            return new C0309b(cVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public C0309b toBuilder() {
            return this == f23022t ? new C0309b() : new C0309b().r(this);
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
            return O() == fVar.O() && G() == fVar.G() && S() == fVar.S() && L() == fVar.L() && this.f23028e == fVar.f23028e && this.f23029f == fVar.f23029f && getBandwidth() == fVar.getBandwidth() && getName().equals(fVar.getName()) && N() == fVar.N() && getUnknownFields().equals(fVar.getUnknownFields());
        }

        public int getBandwidth() {
            return this.f23030g;
        }

        public String getName() {
            Object obj = this.f23031h;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((l) obj).N();
            this.f23031h = strN;
            return strN;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public z1 getParserForType() {
            return f23023u;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.f23024a;
            int iX = i11 != 0 ? o.x(1, i11) : 0;
            int i12 = this.f23025b;
            if (i12 != 0) {
                iX += o.x(2, i12);
            }
            int i13 = this.f23026c;
            if (i13 != 0) {
                iX += o.x(3, i13);
            }
            int i14 = this.f23027d;
            if (i14 != 0) {
                iX += o.x(4, i14);
            }
            int i15 = this.f23028e;
            e eVar = e.FM;
            if (i15 != eVar.getNumber()) {
                iX += o.l(5, this.f23028e);
            }
            if (this.f23029f != eVar.getNumber()) {
                iX += o.l(6, this.f23029f);
            }
            int i16 = this.f23030g;
            if (i16 != 0) {
                iX += o.x(7, i16);
            }
            if (!k0.isStringEmpty(this.f23031h)) {
                iX += k0.computeStringSize(9, this.f23031h);
            }
            long j10 = this.f23032r;
            if (j10 != 0) {
                iX += o.z(10, j10);
            }
            int serializedSize = iX + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
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
            int iHashCode = ((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + O()) * 37) + 2) * 53) + G()) * 37) + 3) * 53) + S()) * 37) + 4) * 53) + L()) * 37) + 5) * 53) + this.f23028e) * 37) + 6) * 53) + this.f23029f) * 37) + 7) * 53) + getBandwidth()) * 37) + 9) * 53) + getName().hashCode()) * 37) + 10) * 53) + o0.i(N())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return b.f22974b.d(f.class, C0309b.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f23033s;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f23033s = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new f();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(o oVar) throws IOException {
            int i10 = this.f23024a;
            if (i10 != 0) {
                oVar.D0(1, i10);
            }
            int i11 = this.f23025b;
            if (i11 != 0) {
                oVar.D0(2, i11);
            }
            int i12 = this.f23026c;
            if (i12 != 0) {
                oVar.D0(3, i12);
            }
            int i13 = this.f23027d;
            if (i13 != 0) {
                oVar.D0(4, i13);
            }
            int i14 = this.f23028e;
            e eVar = e.FM;
            if (i14 != eVar.getNumber()) {
                oVar.u0(5, this.f23028e);
            }
            if (this.f23029f != eVar.getNumber()) {
                oVar.u0(6, this.f23029f);
            }
            int i15 = this.f23030g;
            if (i15 != 0) {
                oVar.D0(7, i15);
            }
            if (!k0.isStringEmpty(this.f23031h)) {
                k0.writeString(oVar, 9, this.f23031h);
            }
            long j10 = this.f23032r;
            if (j10 != 0) {
                oVar.F0(10, j10);
            }
            getUnknownFields().writeTo(oVar);
        }

        /* JADX INFO: renamed from: nk.b$f$b, reason: collision with other inner class name */
        public static final class C0309b extends k0.b implements o1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f23034a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f23035b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f23036c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f23037d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f23038e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f23039f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f23040g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f23041h;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private Object f23042r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private long f23043s;

            private void j(f fVar) {
                int i10 = this.f23034a;
                if ((i10 & 1) != 0) {
                    fVar.f23024a = this.f23035b;
                }
                if ((i10 & 2) != 0) {
                    fVar.f23025b = this.f23036c;
                }
                if ((i10 & 4) != 0) {
                    fVar.f23026c = this.f23037d;
                }
                if ((i10 & 8) != 0) {
                    fVar.f23027d = this.f23038e;
                }
                if ((i10 & 16) != 0) {
                    fVar.f23028e = this.f23039f;
                }
                if ((i10 & 32) != 0) {
                    fVar.f23029f = this.f23040g;
                }
                if ((i10 & 64) != 0) {
                    fVar.f23030g = this.f23041h;
                }
                if ((i10 & 128) != 0) {
                    fVar.f23031h = this.f23042r;
                }
                if ((i10 & 256) != 0) {
                    fVar.f23032r = this.f23043s;
                }
            }

            public C0309b A(long j10) {
                this.f23043s = j10;
                this.f23034a |= 256;
                onChanged();
                return this;
            }

            public C0309b B(int i10) {
                this.f23035b = i10;
                this.f23034a |= 1;
                onChanged();
                return this;
            }

            public C0309b C(int i10) {
                this.f23039f = i10;
                this.f23034a |= 16;
                onChanged();
                return this;
            }

            public C0309b D(int i10) {
                this.f23037d = i10;
                this.f23034a |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public C0309b addRepeatedField(r.g gVar, Object obj) {
                return (C0309b) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return b.f22973a;
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
                f fVar = new f(this);
                if (this.f23034a != 0) {
                    j(fVar);
                }
                onBuilt();
                return fVar;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return b.f22974b.d(f.class, C0309b.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public C0309b m1140clearField(r.g gVar) {
                return (C0309b) super.m1140clearField(gVar);
            }

            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public C0309b clone() {
                return (C0309b) super.m1147clone();
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public f getDefaultInstanceForType() {
                return f.C();
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public C0309b mergeFrom(m mVar, y yVar) {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    this.f23035b = mVar.y();
                                    this.f23034a |= 1;
                                } else if (iK == 16) {
                                    this.f23036c = mVar.y();
                                    this.f23034a |= 2;
                                } else if (iK == 24) {
                                    this.f23037d = mVar.y();
                                    this.f23034a |= 4;
                                } else if (iK == 32) {
                                    this.f23038e = mVar.y();
                                    this.f23034a |= 8;
                                } else if (iK == 40) {
                                    this.f23039f = mVar.t();
                                    this.f23034a |= 16;
                                } else if (iK == 48) {
                                    this.f23040g = mVar.t();
                                    this.f23034a |= 32;
                                } else if (iK == 56) {
                                    this.f23041h = mVar.y();
                                    this.f23034a |= 64;
                                } else if (iK == 74) {
                                    this.f23042r = mVar.J();
                                    this.f23034a |= 128;
                                } else if (iK == 80) {
                                    this.f23043s = mVar.z();
                                    this.f23034a |= 256;
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
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public C0309b mergeFrom(i1 i1Var) {
                if (i1Var instanceof f) {
                    return r((f) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public C0309b r(f fVar) {
                if (fVar == f.C()) {
                    return this;
                }
                if (fVar.O() != 0) {
                    B(fVar.O());
                }
                if (fVar.G() != 0) {
                    v(fVar.G());
                }
                if (fVar.S() != 0) {
                    D(fVar.S());
                }
                if (fVar.L() != 0) {
                    x(fVar.L());
                }
                if (fVar.f23028e != 0) {
                    C(fVar.R());
                }
                if (fVar.f23029f != 0) {
                    w(fVar.K());
                }
                if (fVar.getBandwidth() != 0) {
                    u(fVar.getBandwidth());
                }
                if (!fVar.getName().isEmpty()) {
                    this.f23042r = fVar.f23031h;
                    this.f23034a |= 128;
                    onChanged();
                }
                if (fVar.N() != 0) {
                    A(fVar.N());
                }
                m1148mergeUnknownFields(fVar.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public final C0309b m1148mergeUnknownFields(t2 t2Var) {
                return (C0309b) super.m1148mergeUnknownFields(t2Var);
            }

            public C0309b u(int i10) {
                this.f23041h = i10;
                this.f23034a |= 64;
                onChanged();
                return this;
            }

            public C0309b v(int i10) {
                this.f23036c = i10;
                this.f23034a |= 2;
                onChanged();
                return this;
            }

            public C0309b w(int i10) {
                this.f23040g = i10;
                this.f23034a |= 32;
                onChanged();
                return this;
            }

            public C0309b x(int i10) {
                this.f23038e = i10;
                this.f23034a |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public C0309b setField(r.g gVar, Object obj) {
                return (C0309b) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.i1.a
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public final C0309b setUnknownFields(t2 t2Var) {
                return (C0309b) super.setUnknownFields(t2Var);
            }

            private C0309b() {
                this.f23039f = 0;
                this.f23040g = 0;
                this.f23042r = "";
            }

            private C0309b(k0.c cVar) {
                super(cVar);
                this.f23039f = 0;
                this.f23040g = 0;
                this.f23042r = "";
            }
        }

        private f(k0.b bVar) {
            super(bVar);
            this.f23024a = 0;
            this.f23025b = 0;
            this.f23026c = 0;
            this.f23027d = 0;
            this.f23028e = 0;
            this.f23029f = 0;
            this.f23030g = 0;
            this.f23031h = "";
            this.f23032r = 0L;
            this.f23033s = (byte) -1;
        }

        private f() {
            this.f23024a = 0;
            this.f23025b = 0;
            this.f23026c = 0;
            this.f23027d = 0;
            this.f23028e = 0;
            this.f23029f = 0;
            this.f23030g = 0;
            this.f23031h = "";
            this.f23032r = 0L;
            this.f23033s = (byte) -1;
            this.f23028e = 0;
            this.f23029f = 0;
            this.f23031h = "";
        }
    }

    static {
        r.b bVar = (r.b) i().l().get(0);
        f22973a = bVar;
        f22974b = new k0.f(bVar, new String[]{"UplinkFreq", "DownlinkFreq", "UplinkSubAudio", "DownlinkSubAudio", "UplinkMod", "DownlinkMod", "Bandwidth", "Name", "UpdatedAt"});
        r.b bVar2 = (r.b) i().l().get(1);
        f22975c = bVar2;
        f22976d = new k0.f(bVar2, new String[]{"Name", "NoradCatID", "TLELine1", "TLELine2", "Rf", "UpdatedAt"});
        r.b bVar3 = (r.b) i().l().get(2);
        f22977e = bVar3;
        f22978f = new k0.f(bVar3, new String[]{"SyncAt"});
        r.b bVar4 = (r.b) i().l().get(3);
        f22979g = bVar4;
        f22980h = new k0.f(bVar4, new String[]{"Gp", "Time"});
    }

    public static r.h i() {
        return f22981i;
    }
}
