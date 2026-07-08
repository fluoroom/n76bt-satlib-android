package be;

import be.c3;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d1 implements rd.e {

    /* JADX INFO: renamed from: a */
    public static final a f3839a = new a(null);

    /* JADX INFO: renamed from: b */
    private static final Class f3840b = rd.h.class;

    /* JADX INFO: renamed from: c */
    private static final rg.o f3841c = new rg.o("<v#(\\d+)>");

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final rg.o a() {
            return d1.f3841c;
        }

        private a() {
        }
    }

    public abstract class b {

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ yd.j[] f3842c = {rd.c0.f(new rd.w(b.class, "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", 0))};

        /* JADX INFO: renamed from: a */
        private final c3.a f3843a;

        public b() {
            this.f3843a = c3.c(new e1(d1.this));
        }

        public static final me.k c(d1 d1Var) {
            return b3.a(d1Var.d());
        }

        public final me.k b() {
            Object objD = this.f3843a.d(this, f3842c[0]);
            rd.m.d(objD, "getValue(...)");
            return (me.k) objD;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a */
        private final List f3845a;

        /* JADX INFO: renamed from: b */
        private final Class f3846b;

        public c(List list, Class cls) {
            rd.m.e(list, "parameters");
            this.f3845a = list;
            this.f3846b = cls;
        }

        public final List a() {
            return this.f3845a;
        }

        public final Class b() {
            return this.f3846b;
        }
    }

    protected static final class d extends Enum {

        /* JADX INFO: renamed from: a */
        public static final d f3847a = new d("DECLARED", 0);

        /* JADX INFO: renamed from: b */
        public static final d f3848b = new d("INHERITED", 1);

        /* JADX INFO: renamed from: c */
        private static final /* synthetic */ d[] f3849c;

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ kd.a f3850d;

        static {
            d[] dVarArrA = a();
            f3849c = dVarArrA;
            f3850d = kd.b.a(dVarArrA);
        }

        private d(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f3847a, f3848b};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f3849c.clone();
        }

        public final boolean d(he.b bVar) {
            rd.m.e(bVar, "member");
            return bVar.j().a() == (this == f3847a);
        }
    }

    public static final class e extends j {
        e(d1 d1Var) {
            super(d1Var);
        }

        @Override // ke.o, he.o
        /* JADX INFO: renamed from: r */
        public z e(he.l lVar, dd.d0 d0Var) {
            rd.m.e(lVar, "descriptor");
            rd.m.e(d0Var, "data");
            throw new IllegalStateException("No constructors should appear here: " + lVar);
        }
    }

    private final Method D(Class cls, String str, Class[] clsArr, Class cls2, boolean z10) {
        String str2;
        Class[] clsArr2;
        Class cls3;
        boolean z11;
        if (z10) {
            clsArr[0] = cls;
        }
        Method methodH = H(cls, str, clsArr, cls2);
        if (methodH != null) {
            return methodH;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            Method methodD = D(superclass, str, clsArr, cls2, z10);
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z11 = z10;
            if (methodD != null) {
                return methodD;
            }
        } else {
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z11 = z10;
        }
        Iterator itA = rd.c.a(cls.getInterfaces());
        while (itA.hasNext()) {
            Class cls4 = (Class) itA.next();
            rd.m.b(cls4);
            Method methodD2 = D(cls4, str2, clsArr2, cls3, z11);
            if (methodD2 != null) {
                return methodD2;
            }
            if (z11) {
                Class clsA = me.e.a(ne.f.j(cls4), cls4.getName() + "$DefaultImpls");
                if (clsA != null) {
                    clsArr2[0] = cls4;
                    Method methodH2 = H(clsA, str2, clsArr2, cls3);
                    if (methodH2 != null) {
                        return methodH2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private final c E(String str, boolean z10) {
        String str2;
        int iB0;
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        while (true) {
            if (str.charAt(i10) == ')') {
                String str3 = str;
                return new c(arrayList, z10 ? F(str3, i10 + 1, str3.length()) : null);
            }
            int i11 = i10;
            while (str.charAt(i11) == '[') {
                i11++;
            }
            char cCharAt = str.charAt(i11);
            if (rg.q.O("VZCBSIFJD", cCharAt, false, 2, null)) {
                int i12 = i11 + 1;
                str2 = str;
                iB0 = i12;
            } else {
                if (cCharAt != 'L') {
                    throw new z2("Unknown type prefix in the method signature: " + str);
                }
                str2 = str;
                iB0 = rg.q.b0(str2, ';', i10, false, 4, null) + 1;
            }
            arrayList.add(F(str2, i10, iB0));
            i10 = iB0;
            str = str2;
        }
    }

    private final Class F(String str, int i10, int i11) throws ClassNotFoundException {
        char cCharAt = str.charAt(i10);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            ClassLoader classLoaderJ = ne.f.j(d());
            String strSubstring = str.substring(i10 + 1, i11 - 1);
            rd.m.d(strSubstring, "substring(...)");
            Class<?> clsLoadClass = classLoaderJ.loadClass(rg.q.E(strSubstring, '/', '.', false, 4, null));
            rd.m.d(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class cls = Void.TYPE;
            rd.m.d(cls, "TYPE");
            return cls;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            return l3.f(F(str, i10 + 1, i11));
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new z2("Unknown type prefix in the method signature: " + str);
        }
    }

    private final Constructor G(Class cls, List list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final Method H(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (rd.m.a(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            rd.m.d(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (rd.m.a(method.getName(), str) && rd.m.a(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    private final void k(List list, List list2, boolean z10) {
        if (rd.m.a(ed.q.m0(list2), f3840b)) {
            list2 = list2.subList(0, list2.size() - 1);
        }
        list.addAll(list2);
        int size = (list2.size() + 31) / 32;
        for (int i10 = 0; i10 < size; i10++) {
            Class cls = Integer.TYPE;
            rd.m.d(cls, "TYPE");
            list.add(cls);
        }
        Class cls2 = z10 ? f3840b : Object.class;
        rd.m.b(cls2);
        list.add(cls2);
    }

    public static final CharSequence r(he.z zVar) {
        rd.m.e(zVar, "descriptor");
        return pf.n.f24183k.M(zVar) + " | " + h3.f3881a.g(zVar).a();
    }

    public static final int u(he.u uVar, he.u uVar2) {
        Integer numD = he.t.d(uVar, uVar2);
        if (numD != null) {
            return numD.intValue();
        }
        return 0;
    }

    public static final int v(qd.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.s(obj, obj2)).intValue();
    }

    public static final CharSequence w(he.y0 y0Var) {
        rd.m.e(y0Var, "descriptor");
        return pf.n.f24183k.M(y0Var) + " | " + h3.f3881a.f(y0Var).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.util.Collection A(xf.k r8, be.d1.d r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            rd.m.e(r8, r0)
            java.lang.String r0 = "belonginess"
            rd.m.e(r9, r0)
            be.d1$e r0 = new be.d1$e
            r0.<init>(r7)
            r1 = 3
            r2 = 0
            java.util.Collection r8 = xf.n.a.a(r8, r2, r2, r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L1e:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L53
            java.lang.Object r3 = r8.next()
            he.m r3 = (he.m) r3
            boolean r4 = r3 instanceof he.b
            if (r4 == 0) goto L4c
            r4 = r3
            he.b r4 = (he.b) r4
            he.u r5 = r4.getVisibility()
            he.u r6 = he.t.f15312h
            boolean r5 = rd.m.a(r5, r6)
            if (r5 != 0) goto L4c
            boolean r4 = r9.d(r4)
            if (r4 == 0) goto L4c
            dd.d0 r4 = dd.d0.f10897a
            java.lang.Object r3 = r3.t0(r0, r4)
            be.z r3 = (be.z) r3
            goto L4d
        L4c:
            r3 = r2
        L4d:
            if (r3 == 0) goto L1e
            r1.add(r3)
            goto L1e
        L53:
            java.util.List r8 = ed.q.H0(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: be.d1.A(xf.k, be.d1$d):java.util.Collection");
    }

    protected Class B() {
        Class clsK = ne.f.k(d());
        return clsK == null ? d() : clsK;
    }

    public abstract Collection C(mf.f fVar);

    public final Constructor l(String str) {
        rd.m.e(str, "desc");
        return G(d(), E(str, false).a());
    }

    public final Constructor o(String str) {
        rd.m.e(str, "desc");
        Class clsD = d();
        ArrayList arrayList = new ArrayList();
        k(arrayList, E(str, false).a(), true);
        dd.d0 d0Var = dd.d0.f10897a;
        return G(clsD, arrayList);
    }

    public final Method p(String str, String str2, boolean z10) {
        rd.m.e(str, "name");
        rd.m.e(str2, "desc");
        if (rd.m.a(str, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z10) {
            arrayList.add(d());
        }
        c cVarE = E(str2, true);
        k(arrayList, cVarE.a(), false);
        Class clsB = B();
        String str3 = str + "$default";
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class clsB2 = cVarE.b();
        rd.m.b(clsB2);
        return D(clsB, str3, clsArr, clsB2, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final he.z q(java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: be.d1.q(java.lang.String, java.lang.String):he.z");
    }

    public final Method s(String str, String str2) {
        Method methodD;
        rd.m.e(str, "name");
        rd.m.e(str2, "desc");
        if (rd.m.a(str, "<init>")) {
            return null;
        }
        c cVarE = E(str2, true);
        Class[] clsArr = (Class[]) cVarE.a().toArray(new Class[0]);
        Class clsB = cVarE.b();
        rd.m.b(clsB);
        Method methodD2 = D(B(), str, clsArr, clsB, false);
        if (methodD2 != null) {
            return methodD2;
        }
        if (!B().isInterface() || (methodD = D(Object.class, str, clsArr, clsB, false)) == null) {
            return null;
        }
        return methodD;
    }

    public final he.y0 t(String str, String str2) {
        rd.m.e(str, "name");
        rd.m.e(str2, "signature");
        rg.l lVarB = f3841c.b(str2);
        if (lVarB != null) {
            String str3 = (String) lVarB.a().a().b().get(1);
            he.y0 y0VarZ = z(Integer.parseInt(str3));
            if (y0VarZ != null) {
                return y0VarZ;
            }
            throw new z2("Local property #" + str3 + " not found in " + d());
        }
        mf.f fVarH = mf.f.h(str);
        rd.m.d(fVarH, "identifier(...)");
        Collection collectionC = C(fVarH);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionC) {
            if (rd.m.a(h3.f3881a.f((he.y0) obj).a(), str2)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new z2("Property '" + str + "' (JVM signature: " + str2 + ") not resolved in " + this);
        }
        if (arrayList.size() == 1) {
            return (he.y0) ed.q.w0(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            he.u visibility = ((he.y0) obj2).getVisibility();
            Object arrayList2 = linkedHashMap.get(visibility);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(visibility, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        Collection collectionValues = ed.k0.h(linkedHashMap, new a1(z0.f4032a)).values();
        rd.m.d(collectionValues, "<get-values>(...)");
        List list = (List) ed.q.j0(collectionValues);
        if (list.size() == 1) {
            rd.m.b(list);
            return (he.y0) ed.q.Z(list);
        }
        mf.f fVarH2 = mf.f.h(str);
        rd.m.d(fVarH2, "identifier(...)");
        String strI0 = ed.q.i0(C(fVarH2), "\n", null, null, 0, null, b1.f3800a, 30, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Property '");
        sb2.append(str);
        sb2.append("' (JVM signature: ");
        sb2.append(str2);
        sb2.append(") not resolved in ");
        sb2.append(this);
        sb2.append(':');
        sb2.append(strI0.length() == 0 ? " no members found" : '\n' + strI0);
        throw new z2(sb2.toString());
    }

    public abstract Collection x();

    public abstract Collection y(mf.f fVar);

    public abstract he.y0 z(int i10);
}
