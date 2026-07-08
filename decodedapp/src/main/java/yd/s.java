package yd;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32540a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.f32531b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.f32530a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.f32532c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f32540a = iArr;
        }
    }

    static final /* synthetic */ class b extends rd.l implements qd.l {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f32541s = new b();

        b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // qd.l
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Class l(Class cls) {
            rd.m.e(cls, "p0");
            return cls.getComponentType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type c(m mVar, boolean z10) {
        d dVarF = mVar.f();
        if (dVarF instanceof n) {
            return new r((n) dVarF);
        }
        if (!(dVarF instanceof c)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + mVar);
        }
        c cVar = (c) dVarF;
        Class clsC = z10 ? pd.a.c(cVar) : pd.a.b(cVar);
        List listC = mVar.c();
        if (listC.isEmpty()) {
            return clsC;
        }
        if (!clsC.isArray()) {
            return e(clsC, listC);
        }
        if (clsC.getComponentType().isPrimitive()) {
            return clsC;
        }
        o oVar = (o) ed.q.y0(listC);
        if (oVar == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + mVar);
        }
        p pVarA = oVar.a();
        m mVarB = oVar.b();
        int i10 = pVarA == null ? -1 : a.f32540a[pVarA.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return clsC;
        }
        if (i10 != 2 && i10 != 3) {
            throw new dd.o();
        }
        rd.m.b(mVarB);
        Type typeD = d(mVarB, false, 1, null);
        return typeD instanceof Class ? clsC : new yd.a(typeD);
    }

    static /* synthetic */ Type d(m mVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(mVar, z10);
    }

    private static final Type e(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(ed.q.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(g((o) it.next()));
            }
            return new q(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(ed.q.v(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g((o) it2.next()));
            }
            return new q(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeE = e(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(ed.q.v(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(g((o) it3.next()));
        }
        return new q(cls, typeE, arrayList3);
    }

    public static final Type f(m mVar) {
        Type typeA;
        rd.m.e(mVar, "<this>");
        return (!(mVar instanceof rd.n) || (typeA = ((rd.n) mVar).a()) == null) ? d(mVar, false, 1, null) : typeA;
    }

    private static final Type g(o oVar) {
        p pVarD = oVar.d();
        if (pVarD == null) {
            return t.f32542c.a();
        }
        m mVarC = oVar.c();
        rd.m.b(mVarC);
        int i10 = a.f32540a[pVarD.ordinal()];
        if (i10 == 1) {
            return new t(null, c(mVarC, true));
        }
        if (i10 == 2) {
            return c(mVarC, true);
        }
        if (i10 == 3) {
            return new t(c(mVarC, true), null);
        }
        throw new dd.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            String name = cls.getName();
            rd.m.d(name, "getName(...)");
            return name;
        }
        qg.h hVarN = qg.k.n(type, b.f32541s);
        return ((Class) qg.k.G(hVarN)).getName() + rg.q.B("[]", qg.k.v(hVarN));
    }
}
