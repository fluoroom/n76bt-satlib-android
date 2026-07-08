package fe;

import dd.d0;
import dg.n;
import ed.j0;
import ed.q;
import ee.o;
import eg.c2;
import eg.m2;
import eg.q1;
import eg.u0;
import eg.u1;
import fe.f;
import he.e0;
import he.g1;
import he.h0;
import he.j1;
import he.l1;
import he.n0;
import he.t;
import he.u;
import he.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ke.t0;
import rd.h;
import rd.m;
import xf.k;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends ke.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f12980w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final mf.b f12981x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final mf.b f12982y;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n f12983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n0 f12984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f f12985h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f12986r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final C0181b f12987s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final d f12988t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final List f12989u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final c f12990v;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: fe.b$b, reason: collision with other inner class name */
    private final class C0181b extends eg.b {
        public C0181b() {
            super(b.this.f12983f);
        }

        @Override // eg.v, eg.u1
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public b q() {
            return b.this;
        }

        @Override // eg.u1
        public List getParameters() {
            return b.this.f12989u;
        }

        @Override // eg.p
        protected Collection m() {
            List<mf.b> listN;
            f fVarU0 = b.this.U0();
            f.a aVar = f.a.f13005f;
            if (m.a(fVarU0, aVar)) {
                listN = q.e(b.f12981x);
            } else if (m.a(fVarU0, f.b.f13006f)) {
                listN = q.n(b.f12982y, new mf.b(o.B, aVar.c(b.this.Q0())));
            } else {
                f.d dVar = f.d.f13008f;
                if (m.a(fVarU0, dVar)) {
                    listN = q.e(b.f12981x);
                } else {
                    if (!m.a(fVarU0, f.c.f13007f)) {
                        pg.a.b(null, 1, null);
                        throw new dd.f();
                    }
                    listN = q.n(b.f12982y, new mf.b(o.f11853s, dVar.c(b.this.Q0())));
                }
            }
            h0 h0VarB = b.this.f12984g.b();
            ArrayList arrayList = new ArrayList(q.v(listN, 10));
            for (mf.b bVar : listN) {
                he.e eVarB = y.b(h0VarB, bVar);
                if (eVarB == null) {
                    throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
                }
                List listD0 = q.D0(getParameters(), eVarB.k().getParameters().size());
                ArrayList arrayList2 = new ArrayList(q.v(listD0, 10));
                Iterator it = listD0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new c2(((l1) it.next()).s()));
                }
                arrayList.add(u0.h(q1.f12167b.k(), eVarB, arrayList2));
            }
            return q.H0(arrayList);
        }

        @Override // eg.u1
        public boolean r() {
            return true;
        }

        public String toString() {
            return q().toString();
        }

        @Override // eg.p
        protected j1 v() {
            return j1.a.f15286a;
        }
    }

    static {
        mf.c cVar = o.B;
        mf.f fVarH = mf.f.h("Function");
        m.d(fVarH, "identifier(...)");
        f12981x = new mf.b(cVar, fVarH);
        mf.c cVar2 = o.f11859y;
        mf.f fVarH2 = mf.f.h("KFunction");
        m.d(fVarH2, "identifier(...)");
        f12982y = new mf.b(cVar2, fVarH2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, n0 n0Var, f fVar, int i10) {
        super(nVar, fVar.c(i10));
        m.e(nVar, "storageManager");
        m.e(n0Var, "containingDeclaration");
        m.e(fVar, "functionTypeKind");
        this.f12983f = nVar;
        this.f12984g = n0Var;
        this.f12985h = fVar;
        this.f12986r = i10;
        this.f12987s = new C0181b();
        this.f12988t = new d(nVar, this);
        ArrayList arrayList = new ArrayList();
        xd.c cVar = new xd.c(1, i10);
        ArrayList arrayList2 = new ArrayList(q.v(cVar, 10));
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            int iNextInt = ((j0) it).nextInt();
            m2 m2Var = m2.f12141f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('P');
            sb2.append(iNextInt);
            K0(arrayList, this, m2Var, sb2.toString());
            arrayList2.add(d0.f10897a);
        }
        K0(arrayList, this, m2.f12142g, "R");
        this.f12989u = q.H0(arrayList);
        this.f12990v = c.f12992a.a(this.f12985h);
    }

    private static final void K0(ArrayList arrayList, b bVar, m2 m2Var, String str) {
        arrayList.add(t0.R0(bVar, ie.h.f16054l.b(), false, m2Var, mf.f.h(str), arrayList.size(), bVar.f12983f));
    }

    @Override // he.d0
    public boolean A() {
        return false;
    }

    @Override // he.e
    public boolean B() {
        return false;
    }

    @Override // he.d0
    public boolean F0() {
        return false;
    }

    @Override // he.e
    public boolean G() {
        return false;
    }

    @Override // he.d0
    public boolean M() {
        return false;
    }

    @Override // he.i
    public boolean N() {
        return false;
    }

    public final int Q0() {
        return this.f12986r;
    }

    public Void R0() {
        return null;
    }

    @Override // he.e
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public List getConstructors() {
        return q.k();
    }

    @Override // he.e
    public /* bridge */ /* synthetic */ he.d T() {
        return (he.d) X0();
    }

    @Override // he.e, he.n, he.m
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public n0 b() {
        return this.f12984g;
    }

    public final f U0() {
        return this.f12985h;
    }

    @Override // he.e
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public k.b U() {
        return k.b.f32079b;
    }

    @Override // he.e
    public /* bridge */ /* synthetic */ he.e W() {
        return (he.e) R0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ke.z
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public d f0(fg.g gVar) {
        m.e(gVar, "kotlinTypeRefiner");
        return this.f12988t;
    }

    public Void X0() {
        return null;
    }

    @Override // ie.a
    public ie.h getAnnotations() {
        return ie.h.f16054l.b();
    }

    @Override // he.p
    public g1 getSource() {
        g1 g1Var = g1.f15281a;
        m.d(g1Var, "NO_SOURCE");
        return g1Var;
    }

    @Override // he.e, he.d0, he.q
    public u getVisibility() {
        u uVar = t.f15309e;
        m.d(uVar, "PUBLIC");
        return uVar;
    }

    @Override // he.e
    public boolean isData() {
        return false;
    }

    @Override // he.e
    public boolean isInline() {
        return false;
    }

    @Override // he.e
    public he.f j() {
        return he.f.f15272c;
    }

    @Override // he.h
    public u1 k() {
        return this.f12987s;
    }

    @Override // he.e, he.d0
    public e0 l() {
        return e0.f15262e;
    }

    @Override // he.e
    public boolean m() {
        return false;
    }

    public String toString() {
        String strD = getName().d();
        m.d(strD, "asString(...)");
        return strD;
    }

    @Override // he.e, he.i
    public List v() {
        return this.f12989u;
    }

    @Override // he.e
    public he.q1 z0() {
        return null;
    }
}
