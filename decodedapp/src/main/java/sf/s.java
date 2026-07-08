package sf;

import ee.o;
import eg.a2;
import eg.c1;
import eg.c2;
import eg.m2;
import eg.q1;
import eg.r0;
import eg.u0;
import eg.v0;
import he.h0;
import he.l1;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends g {

    /* JADX INFO: renamed from: b */
    public static final a f27353b = new a(null);

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final g a(r0 r0Var) {
            rd.m.e(r0Var, "argumentType");
            if (v0.a(r0Var)) {
                return null;
            }
            r0 type = r0Var;
            int i10 = 0;
            while (ee.i.d0(type)) {
                type = ((a2) ed.q.w0(type.L0())).getType();
                rd.m.d(type, "getType(...)");
                i10++;
            }
            he.h hVarQ = type.N0().q();
            if (hVarQ instanceof he.e) {
                mf.b bVarN = uf.e.n(hVarQ);
                return bVarN == null ? new s(new b.a(r0Var)) : new s(bVarN, i10);
            }
            if (hVarQ instanceof l1) {
                return new s(mf.b.f21989d.c(o.a.f11863b.m()), 0);
            }
            return null;
        }

        private a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a */
            private final r0 f27354a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(r0 r0Var) {
                super(null);
                rd.m.e(r0Var, "type");
                this.f27354a = r0Var;
            }

            public final r0 a() {
                return this.f27354a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && rd.m.a(this.f27354a, ((a) obj).f27354a);
            }

            public int hashCode() {
                return this.f27354a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f27354a + ')';
            }
        }

        /* JADX INFO: renamed from: sf.s$b$b */
        public static final class C0378b extends b {

            /* JADX INFO: renamed from: a */
            private final f f27355a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0378b(f fVar) {
                super(null);
                rd.m.e(fVar, "value");
                this.f27355a = fVar;
            }

            public final int a() {
                return this.f27355a.c();
            }

            public final mf.b b() {
                return this.f27355a.d();
            }

            public final f c() {
                return this.f27355a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0378b) && rd.m.a(this.f27355a, ((C0378b) obj).f27355a);
            }

            public int hashCode() {
                return this.f27355a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.f27355a + ')';
            }
        }

        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(b bVar) {
        super(bVar);
        rd.m.e(bVar, "value");
    }

    @Override // sf.g
    public r0 a(h0 h0Var) {
        rd.m.e(h0Var, "module");
        q1 q1VarK = q1.f12167b.k();
        he.e eVarF = h0Var.o().F();
        rd.m.d(eVarF, "getKClass(...)");
        return u0.h(q1VarK, eVarF, ed.q.e(new c2(c(h0Var))));
    }

    public final r0 c(h0 h0Var) {
        rd.m.e(h0Var, "module");
        b bVar = (b) b();
        if (bVar instanceof b.a) {
            return ((b.a) b()).a();
        }
        if (!(bVar instanceof b.C0378b)) {
            throw new dd.o();
        }
        f fVarC = ((b.C0378b) b()).c();
        mf.b bVarA = fVarC.a();
        int iB = fVarC.b();
        he.e eVarB = he.y.b(h0Var, bVarA);
        if (eVarB == null) {
            return gg.l.d(gg.k.f14470h, bVarA.toString(), String.valueOf(iB));
        }
        c1 c1VarS = eVarB.s();
        rd.m.d(c1VarS, "getDefaultType(...)");
        r0 r0VarD = jg.d.D(c1VarS);
        for (int i10 = 0; i10 < iB; i10++) {
            r0VarD = h0Var.o().m(m2.f12140e, r0VarD);
            rd.m.d(r0VarD, "getArrayType(...)");
        }
        return r0VarD;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(f fVar) {
        this(new b.C0378b(fVar));
        rd.m.e(fVar, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(mf.b bVar, int i10) {
        this(new f(bVar, i10));
        rd.m.e(bVar, "classId");
    }
}
