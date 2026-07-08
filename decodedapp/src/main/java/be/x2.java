package be;

import be.c3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x2 implements yd.n, y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ yd.j[] f4019d = {rd.c0.f(new rd.w(x2.class, "upperBounds", "getUpperBounds()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final he.l1 f4020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c3.a f4021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y2 f4022c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4023a;

        static {
            int[] iArr = new int[eg.m2.values().length];
            try {
                iArr[eg.m2.f12140e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eg.m2.f12141f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[eg.m2.f12142g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4023a = iArr;
        }
    }

    public x2(y2 y2Var, he.l1 l1Var) {
        c0 c0VarH;
        Object objT0;
        rd.m.e(l1Var, "descriptor");
        this.f4020a = l1Var;
        this.f4021b = c3.c(new w2(this));
        if (y2Var == null) {
            he.m mVarB = e().b();
            rd.m.d(mVarB, "getContainingDeclaration(...)");
            if (mVarB instanceof he.e) {
                objT0 = h((he.e) mVarB);
            } else {
                if (!(mVarB instanceof he.b)) {
                    throw new z2("Unknown type parameter container: " + mVarB);
                }
                he.m mVarB2 = ((he.b) mVarB).b();
                rd.m.d(mVarB2, "getContainingDeclaration(...)");
                if (mVarB2 instanceof he.e) {
                    c0VarH = h((he.e) mVarB2);
                } else {
                    cg.t tVar = mVarB instanceof cg.t ? (cg.t) mVarB : null;
                    if (tVar == null) {
                        throw new z2("Non-class callable descriptor must be deserialized: " + mVarB);
                    }
                    yd.c cVarE = pd.a.e(f(tVar));
                    rd.m.c(cVarE, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                    c0VarH = (c0) cVarE;
                }
                objT0 = mVarB.t0(new j(c0VarH), dd.d0.f10897a);
            }
            y2Var = (y2) objT0;
        }
        this.f4022c = y2Var;
    }

    private final Class f(cg.t tVar) {
        Class clsD;
        cg.s sVarC0 = tVar.c0();
        ef.r rVar = sVarC0 instanceof ef.r ? (ef.r) sVarC0 : null;
        ef.x xVarG = rVar != null ? rVar.g() : null;
        me.f fVar = xVarG instanceof me.f ? (me.f) xVarG : null;
        if (fVar != null && (clsD = fVar.d()) != null) {
            return clsD;
        }
        throw new z2("Container of deserialized member is not resolved: " + tVar);
    }

    private final c0 h(he.e eVar) {
        Class clsQ = l3.q(eVar);
        c0 c0Var = (c0) (clsQ != null ? pd.a.e(clsQ) : null);
        if (c0Var != null) {
            return c0Var;
        }
        throw new z2("Type parameter container is not resolved: " + eVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List i(x2 x2Var) {
        List upperBounds = x2Var.e().getUpperBounds();
        rd.m.d(upperBounds, "getUpperBounds(...)");
        ArrayList arrayList = new ArrayList(ed.q.v(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(new v2((eg.r0) it.next(), null, 2, null));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return rd.m.a(this.f4022c, x2Var.f4022c) && rd.m.a(getName(), x2Var.getName());
    }

    @Override // be.y0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public he.l1 e() {
        return this.f4020a;
    }

    @Override // yd.n
    public String getName() {
        String strD = e().getName().d();
        rd.m.d(strD, "asString(...)");
        return strD;
    }

    @Override // yd.n
    public List getUpperBounds() {
        Object objD = this.f4021b.d(this, f4019d[0]);
        rd.m.d(objD, "getValue(...)");
        return (List) objD;
    }

    public int hashCode() {
        return (this.f4022c.hashCode() * 31) + getName().hashCode();
    }

    @Override // yd.n
    public yd.p n() {
        int i10 = a.f4023a[e().n().ordinal()];
        if (i10 == 1) {
            return yd.p.f32530a;
        }
        if (i10 == 2) {
            return yd.p.f32531b;
        }
        if (i10 == 3) {
            return yd.p.f32532c;
        }
        throw new dd.o();
    }

    public String toString() {
        return rd.i0.f25952a.a(this);
    }
}
