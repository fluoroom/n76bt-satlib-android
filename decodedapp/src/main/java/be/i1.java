package be;

import be.c3;
import be.m;
import ce.a;
import ce.i;
import ce.n;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends z implements rd.j, yd.f, qd.a, qd.l, qd.b, qd.c, qd.d, qd.e, qd.f, qd.g, qd.h, qd.i, qd.j, qd.k, qd.p, qd.m, qd.n, qd.o, qd.q, qd.r, qd.s, qd.t, qd.u, qd.v, qd.w, yd.b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final /* synthetic */ yd.j[] f3886v = {rd.c0.f(new rd.w(i1.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d1 f3887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f3888h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f3889r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final c3.a f3890s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final dd.j f3891t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final dd.j f3892u;

    /* synthetic */ i1(d1 d1Var, String str, String str2, he.z zVar, Object obj, int i10, rd.h hVar) {
        this(d1Var, str, str2, zVar, (i10 & 16) != 0 ? rd.d.f25938g : obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ce.h T(i1 i1Var) {
        Object objD;
        ce.h hVarV;
        m mVarG = h3.f3881a.g(i1Var.Q());
        if (mVarG instanceof m.d) {
            if (i1Var.N()) {
                Class clsD = i1Var.I().d();
                List listM = i1Var.M();
                ArrayList arrayList = new ArrayList(ed.q.v(listM, 10));
                Iterator it = listM.iterator();
                while (it.hasNext()) {
                    String name = ((yd.i) it.next()).getName();
                    rd.m.b(name);
                    arrayList.add(name);
                }
                return new ce.a(clsD, arrayList, a.EnumC0070a.f4719b, a.b.f4723b, null, 16, null);
            }
            objD = i1Var.I().l(((m.d) mVarG).b());
        } else if (mVarG instanceof m.e) {
            he.z zVarQ = i1Var.Q();
            he.m mVarB = zVarQ.b();
            rd.m.d(mVarB, "getContainingDeclaration(...)");
            if (qf.k.d(mVarB) && (zVarQ instanceof he.l) && ((he.l) zVarQ).D()) {
                he.z zVarQ2 = i1Var.Q();
                d1 d1VarI = i1Var.I();
                String strB = ((m.e) mVarG).b();
                List listI = i1Var.Q().i();
                rd.m.d(listI, "getValueParameters(...)");
                return new n.b(zVarQ2, d1VarI, strB, listI);
            }
            m.e eVar = (m.e) mVarG;
            objD = i1Var.I().s(eVar.c(), eVar.b());
        } else if (mVarG instanceof m.c) {
            objD = ((m.c) mVarG).b();
            rd.m.c(objD, "null cannot be cast to non-null type java.lang.reflect.Member");
        } else {
            if (!(mVarG instanceof m.b)) {
                if (!(mVarG instanceof m.a)) {
                    throw new dd.o();
                }
                List listD = ((m.a) mVarG).d();
                Class clsD2 = i1Var.I().d();
                ArrayList arrayList2 = new ArrayList(ed.q.v(listD, 10));
                Iterator it2 = listD.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new ce.a(clsD2, arrayList2, a.EnumC0070a.f4719b, a.b.f4722a, listD);
            }
            objD = ((m.b) mVarG).d();
            rd.m.c(objD, "null cannot be cast to non-null type java.lang.reflect.Member");
        }
        if (objD instanceof Constructor) {
            hVarV = i1Var.U((Constructor) objD, i1Var.Q(), false);
        } else {
            if (!(objD instanceof Method)) {
                throw new z2("Could not compute caller for function: " + i1Var.Q() + " (member = " + objD + ')');
            }
            Method method = (Method) objD;
            hVarV = !Modifier.isStatic(method.getModifiers()) ? i1Var.V(method) : i1Var.Q().getAnnotations().a(l3.j()) != null ? i1Var.W(method) : i1Var.X(method, false);
        }
        return ce.o.j(hVarV, i1Var.Q(), false, 2, null);
    }

    private final ce.i U(Constructor constructor, he.z zVar, boolean z10) {
        return (z10 || !vf.b.f(zVar)) ? O() ? new i.c(constructor, e0()) : new i.e(constructor) : O() ? new i.a(constructor, e0()) : new i.b(constructor);
    }

    private final i.h V(Method method) {
        return O() ? new i.h.a(method, e0()) : new i.h.e(method);
    }

    private final i.h W(Method method) {
        return O() ? new i.h.b(method) : new i.h.f(method);
    }

    private final ce.h X(Method method, boolean z10) {
        if (O()) {
            return new i.h.c(method, z10, h0(method) ? this.f3889r : e0());
        }
        return new i.h.g(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final ce.h c0(be.i1 r11) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: be.i1.c0(be.i1):ce.h");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.z d0(i1 i1Var, String str) {
        return i1Var.I().q(str, i1Var.f3888h);
    }

    private final Object e0() {
        return ce.o.h(this.f3889r, Q());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final he.z g0(he.z r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.i()
            java.lang.String r1 = "getValueParameters(...)"
            rd.m.d(r0, r1)
            boolean r2 = d.h0.a(r0)
            r3 = 0
            if (r2 == 0) goto L17
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L17
            goto L2e
        L17:
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r0.next()
            he.s1 r2 = (he.s1) r2
            boolean r2 = r2.u0()
            if (r2 == 0) goto L1b
            goto L9b
        L2e:
            he.m r0 = r6.b()
            java.lang.String r2 = "getContainingDeclaration(...)"
            rd.m.d(r0, r2)
            boolean r0 = qf.k.g(r0)
            if (r0 == 0) goto L9b
            ce.h r0 = r5.H()
            java.lang.reflect.Member r0 = r0.h()
            rd.m.b(r0)
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L9b
            r0 = 0
            qg.h r6 = uf.e.z(r6, r0)
            java.util.Iterator r6 = r6.iterator()
        L5b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L93
            java.lang.Object r0 = r6.next()
            r2 = r0
            he.b r2 = (he.b) r2
            java.util.List r2 = r2.i()
            rd.m.d(r2, r1)
            boolean r4 = d.h0.a(r2)
            if (r4 == 0) goto L7c
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L7c
            goto L5b
        L7c:
            java.util.Iterator r2 = r2.iterator()
        L80:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5b
            java.lang.Object r4 = r2.next()
            he.s1 r4 = (he.s1) r4
            boolean r4 = r4.u0()
            if (r4 == 0) goto L80
            goto L94
        L93:
            r0 = r3
        L94:
            boolean r6 = r0 instanceof he.z
            if (r6 == 0) goto L9b
            he.z r0 = (he.z) r0
            return r0
        L9b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: be.i1.g0(he.z):he.z");
    }

    private final boolean h0(Method method) {
        eg.r0 type;
        he.b1 b1VarG0 = Q().g0();
        if (b1VarG0 == null || (type = b1VarG0.getType()) == null || !qf.k.c(type)) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        rd.m.d(parameterTypes, "getParameterTypes(...)");
        Class cls = (Class) ed.j.E(parameterTypes);
        return cls != null && cls.isInterface();
    }

    @Override // be.z
    public ce.h H() {
        return (ce.h) this.f3891t.getValue();
    }

    @Override // be.z
    public d1 I() {
        return this.f3887g;
    }

    @Override // be.z
    public ce.h J() {
        return (ce.h) this.f3892u.getValue();
    }

    @Override // be.z
    public boolean O() {
        return this.f3889r != rd.d.f25938g;
    }

    public Object Y() {
        return i(new Object[0]);
    }

    public Object Z(Object obj) {
        return i(obj);
    }

    @Override // qd.a
    public Object a() {
        return Y();
    }

    public Object a0(Object obj, Object obj2) {
        return i(obj, obj2);
    }

    public Object b0(Object obj, Object obj2, Object obj3) {
        return i(obj, obj2, obj3);
    }

    @Override // rd.j
    public int c() {
        return ce.j.a(H());
    }

    public boolean equals(Object obj) {
        i1 i1VarC = l3.c(obj);
        return i1VarC != null && rd.m.a(I(), i1VarC.I()) && rd.m.a(getName(), i1VarC.getName()) && rd.m.a(this.f3888h, i1VarC.f3888h) && rd.m.a(this.f3889r, i1VarC.f3889r);
    }

    @Override // be.z
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public he.z Q() {
        Object objD = this.f3890s.d(this, f3886v[0]);
        rd.m.d(objD, "getValue(...)");
        return (he.z) objD;
    }

    @Override // yd.b
    public String getName() {
        String strD = Q().getName().d();
        rd.m.d(strD, "asString(...)");
        return strD;
    }

    public int hashCode() {
        return (((I().hashCode() * 31) + getName().hashCode()) * 31) + this.f3888h.hashCode();
    }

    @Override // qd.q
    public Object k(Object obj, Object obj2, Object obj3) {
        return b0(obj, obj2, obj3);
    }

    @Override // qd.l
    public Object l(Object obj) {
        return Z(obj);
    }

    @Override // qd.p
    public Object s(Object obj, Object obj2) {
        return a0(obj, obj2);
    }

    @Override // yd.b
    public boolean t() {
        return Q().t();
    }

    public String toString() {
        return g3.f3870a.f(Q());
    }

    private i1(d1 d1Var, String str, String str2, he.z zVar, Object obj) {
        this.f3887g = d1Var;
        this.f3888h = str2;
        this.f3889r = obj;
        this.f3890s = c3.b(zVar, new f1(this, str));
        dd.n nVar = dd.n.f10910b;
        this.f3891t = dd.k.a(nVar, new g1(this));
        this.f3892u = dd.k.a(nVar, new h1(this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i1(d1 d1Var, String str, String str2, Object obj) {
        this(d1Var, str, str2, null, obj);
        rd.m.e(d1Var, "container");
        rd.m.e(str, "name");
        rd.m.e(str2, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i1(d1 d1Var, he.z zVar) {
        rd.m.e(d1Var, "container");
        rd.m.e(zVar, "descriptor");
        String strD = zVar.getName().d();
        rd.m.d(strD, "asString(...)");
        this(d1Var, strD, h3.f3881a.g(zVar).a(), zVar, null, 16, null);
    }
}
