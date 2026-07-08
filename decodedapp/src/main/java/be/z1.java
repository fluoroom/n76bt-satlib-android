package be;

import be.c3;
import ce.n;
import he.b;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import yd.i;

/* JADX INFO: loaded from: classes3.dex */
public final class z1 implements yd.i {

    /* JADX INFO: renamed from: f */
    static final /* synthetic */ yd.j[] f4033f = {rd.c0.f(new rd.w(z1.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0)), rd.c0.f(new rd.w(z1.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a */
    private final z f4034a;

    /* JADX INFO: renamed from: b */
    private final int f4035b;

    /* JADX INFO: renamed from: c */
    private final i.a f4036c;

    /* JADX INFO: renamed from: d */
    private final c3.a f4037d;

    /* JADX INFO: renamed from: e */
    private final c3.a f4038e;

    private static final class a implements Type {

        /* JADX INFO: renamed from: a */
        private final Type[] f4039a;

        /* JADX INFO: renamed from: b */
        private final int f4040b;

        public a(Type[] typeArr) {
            rd.m.e(typeArr, "types");
            this.f4039a = typeArr;
            this.f4040b = Arrays.hashCode(typeArr);
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Arrays.equals(this.f4039a, ((a) obj).f4039a);
        }

        @Override // java.lang.reflect.Type
        public String getTypeName() {
            return ed.j.S(this.f4039a, ", ", "[", "]", 0, null, null, 56, null);
        }

        public int hashCode() {
            return this.f4040b;
        }

        public String toString() {
            return getTypeName();
        }
    }

    public z1(z zVar, int i10, i.a aVar, qd.a aVar2) {
        rd.m.e(zVar, "callable");
        rd.m.e(aVar, "kind");
        rd.m.e(aVar2, "computeDescriptor");
        this.f4034a = zVar;
        this.f4035b = i10;
        this.f4036c = aVar;
        this.f4037d = c3.c(aVar2);
        this.f4038e = c3.c(new x1(this));
    }

    public static final Type c(z1 z1Var) {
        List listZ0;
        he.v0 v0VarI = z1Var.i();
        if ((v0VarI instanceof he.b1) && rd.m.a(l3.i(z1Var.f4034a.Q()), v0VarI) && z1Var.f4034a.Q().j() == b.a.FAKE_OVERRIDE) {
            he.m mVarB = z1Var.f4034a.Q().b();
            rd.m.c(mVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class clsQ = l3.q((he.e) mVarB);
            if (clsQ != null) {
                return clsQ;
            }
            throw new z2("Cannot determine receiver Java type of inherited declaration: " + v0VarI);
        }
        ce.h hVarH = z1Var.f4034a.H();
        if (!(hVarH instanceof ce.n)) {
            if (!(hVarH instanceof n.b)) {
                return (Type) hVarH.j().get(z1Var.getIndex());
            }
            Class[] clsArr = (Class[]) ((Collection) ((n.b) hVarH).c().get(z1Var.getIndex())).toArray(new Class[0]);
            return z1Var.g((Type[]) Arrays.copyOf(clsArr, clsArr.length));
        }
        if (z1Var.f4034a.O()) {
            ce.n nVar = (ce.n) hVarH;
            xd.c cVarC = nVar.c(z1Var.getIndex() + 1);
            int iC = nVar.c(0).c() + 1;
            listZ0 = ed.q.z0(nVar.j(), new xd.c(cVarC.b() - iC, cVarC.c() - iC));
        } else {
            ce.n nVar2 = (ce.n) hVarH;
            listZ0 = ed.q.z0(nVar2.j(), nVar2.c(z1Var.getIndex()));
        }
        Type[] typeArr = (Type[]) listZ0.toArray(new Type[0]);
        return z1Var.g((Type[]) Arrays.copyOf(typeArr, typeArr.length));
    }

    public static final List f(z1 z1Var) {
        return l3.e(z1Var.i());
    }

    private final Type g(Type... typeArr) {
        int length = typeArr.length;
        if (length != 0) {
            return length != 1 ? new a(typeArr) : (Type) ed.j.X(typeArr);
        }
        throw new pd.b("Expected at least 1 type for compound type");
    }

    private final he.v0 i() {
        Object objD = this.f4037d.d(this, f4033f[0]);
        rd.m.d(objD, "getValue(...)");
        return (he.v0) objD;
    }

    @Override // yd.i
    public boolean a() {
        he.v0 v0VarI = i();
        he.s1 s1Var = v0VarI instanceof he.s1 ? (he.s1) v0VarI : null;
        if (s1Var != null) {
            return uf.e.f(s1Var);
        }
        return false;
    }

    @Override // yd.i
    public boolean b() {
        he.v0 v0VarI = i();
        return (v0VarI instanceof he.s1) && ((he.s1) v0VarI).k0() != null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return rd.m.a(this.f4034a, z1Var.f4034a) && getIndex() == z1Var.getIndex();
    }

    @Override // yd.i
    public int getIndex() {
        return this.f4035b;
    }

    @Override // yd.i
    public String getName() {
        he.v0 v0VarI = i();
        he.s1 s1Var = v0VarI instanceof he.s1 ? (he.s1) v0VarI : null;
        if (s1Var == null || s1Var.b().J()) {
            return null;
        }
        mf.f name = s1Var.getName();
        rd.m.d(name, "getName(...)");
        if (name.i()) {
            return null;
        }
        return name.d();
    }

    @Override // yd.i
    public yd.m getType() {
        eg.r0 type = i().getType();
        rd.m.d(type, "getType(...)");
        return new v2(type, new y1(this));
    }

    public final z h() {
        return this.f4034a;
    }

    public int hashCode() {
        return (this.f4034a.hashCode() * 31) + getIndex();
    }

    @Override // yd.i
    public i.a j() {
        return this.f4036c;
    }

    public String toString() {
        return g3.f3870a.j(this);
    }
}
