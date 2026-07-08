package be;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import me.l;
import sf.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l3 {

    /* JADX INFO: renamed from: a */
    private static final mf.c f3923a = new mf.c("kotlin.jvm.JvmStatic");

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3924a;

        static {
            int[] iArr = new int[ee.l.values().length];
            try {
                iArr[ee.l.f11807g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ee.l.f11808h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ee.l.f11809r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ee.l.f11810s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ee.l.f11811t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ee.l.f11812u.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ee.l.f11813v.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ee.l.f11814w.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f3924a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Object a(sf.b bVar, ClassLoader classLoader) {
        eg.r0 r0VarE;
        Class clsO;
        sf.z zVar = bVar instanceof sf.z ? (sf.z) bVar : null;
        if (zVar == null || (r0VarE = zVar.e()) == null) {
            return null;
        }
        Iterable iterable = (Iterable) bVar.b();
        ArrayList arrayList = new ArrayList(ed.q.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(r((sf.g) it.next(), classLoader));
        }
        ee.l lVarO = ee.i.O(r0VarE);
        int i10 = 0;
        switch (lVarO == null ? -1 : a.f3924a[lVarO.ordinal()]) {
            case -1:
                if (!ee.i.d0(r0VarE)) {
                    throw new IllegalStateException(("Not an array type: " + r0VarE).toString());
                }
                eg.r0 type = ((eg.a2) ed.q.w0(r0VarE.L0())).getType();
                rd.m.d(type, "getType(...)");
                he.h hVarQ = type.N0().q();
                he.e eVar = hVarQ instanceof he.e ? (he.e) hVarQ : null;
                if (eVar == null) {
                    throw new IllegalStateException(("Not a class type: " + type).toString());
                }
                if (ee.i.w0(type)) {
                    int size = ((List) bVar.b()).size();
                    String[] strArr = new String[size];
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        rd.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        strArr[i10] = obj;
                        i10++;
                    }
                    return strArr;
                }
                if (ee.i.m0(eVar)) {
                    int size2 = ((List) bVar.b()).size();
                    Class[] clsArr = new Class[size2];
                    while (i10 < size2) {
                        Object obj2 = arrayList.get(i10);
                        rd.m.c(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                        clsArr[i10] = obj2;
                        i10++;
                    }
                    return clsArr;
                }
                mf.b bVarN = uf.e.n(eVar);
                if (bVarN == null || (clsO = o(classLoader, bVarN, 0, 2, null)) == null) {
                    return null;
                }
                Object objNewInstance = Array.newInstance((Class<?>) clsO, ((List) bVar.b()).size());
                rd.m.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                Object[] objArr = (Object[]) objNewInstance;
                int size3 = arrayList.size();
                while (i10 < size3) {
                    objArr[i10] = arrayList.get(i10);
                    i10++;
                }
                return objArr;
            case 0:
            default:
                throw new dd.o();
            case 1:
                int size4 = ((List) bVar.b()).size();
                boolean[] zArr = new boolean[size4];
                while (i10 < size4) {
                    Object obj3 = arrayList.get(i10);
                    rd.m.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    zArr[i10] = ((Boolean) obj3).booleanValue();
                    i10++;
                }
                return zArr;
            case 2:
                int size5 = ((List) bVar.b()).size();
                char[] cArr = new char[size5];
                while (i10 < size5) {
                    Object obj4 = arrayList.get(i10);
                    rd.m.c(obj4, "null cannot be cast to non-null type kotlin.Char");
                    cArr[i10] = ((Character) obj4).charValue();
                    i10++;
                }
                return cArr;
            case 3:
                int size6 = ((List) bVar.b()).size();
                byte[] bArr = new byte[size6];
                while (i10 < size6) {
                    Object obj5 = arrayList.get(i10);
                    rd.m.c(obj5, "null cannot be cast to non-null type kotlin.Byte");
                    bArr[i10] = ((Byte) obj5).byteValue();
                    i10++;
                }
                return bArr;
            case 4:
                int size7 = ((List) bVar.b()).size();
                short[] sArr = new short[size7];
                while (i10 < size7) {
                    Object obj6 = arrayList.get(i10);
                    rd.m.c(obj6, "null cannot be cast to non-null type kotlin.Short");
                    sArr[i10] = ((Short) obj6).shortValue();
                    i10++;
                }
                return sArr;
            case 5:
                int size8 = ((List) bVar.b()).size();
                int[] iArr = new int[size8];
                while (i10 < size8) {
                    Object obj7 = arrayList.get(i10);
                    rd.m.c(obj7, "null cannot be cast to non-null type kotlin.Int");
                    iArr[i10] = ((Integer) obj7).intValue();
                    i10++;
                }
                return iArr;
            case 6:
                int size9 = ((List) bVar.b()).size();
                float[] fArr = new float[size9];
                while (i10 < size9) {
                    Object obj8 = arrayList.get(i10);
                    rd.m.c(obj8, "null cannot be cast to non-null type kotlin.Float");
                    fArr[i10] = ((Float) obj8).floatValue();
                    i10++;
                }
                return fArr;
            case 7:
                int size10 = ((List) bVar.b()).size();
                long[] jArr = new long[size10];
                while (i10 < size10) {
                    Object obj9 = arrayList.get(i10);
                    rd.m.c(obj9, "null cannot be cast to non-null type kotlin.Long");
                    jArr[i10] = ((Long) obj9).longValue();
                    i10++;
                }
                return jArr;
            case 8:
                int size11 = ((List) bVar.b()).size();
                double[] dArr = new double[size11];
                while (i10 < size11) {
                    Object obj10 = arrayList.get(i10);
                    rd.m.c(obj10, "null cannot be cast to non-null type kotlin.Double");
                    dArr[i10] = ((Double) obj10).doubleValue();
                    i10++;
                }
                return dArr;
        }
    }

    public static final z b(Object obj) {
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar != null) {
            return zVar;
        }
        i1 i1VarC = c(obj);
        return i1VarC != null ? i1VarC : d(obj);
    }

    public static final i1 c(Object obj) {
        i1 i1Var = obj instanceof i1 ? (i1) obj : null;
        if (i1Var != null) {
            return i1Var;
        }
        rd.k kVar = obj instanceof rd.k ? (rd.k) obj : null;
        yd.b bVarB = kVar != null ? kVar.b() : null;
        if (bVarB instanceof i1) {
            return (i1) bVarB;
        }
        return null;
    }

    public static final l2 d(Object obj) {
        l2 l2Var = obj instanceof l2 ? (l2) obj : null;
        if (l2Var != null) {
            return l2Var;
        }
        rd.x xVar = obj instanceof rd.x ? (rd.x) obj : null;
        yd.b bVarB = xVar != null ? xVar.b() : null;
        if (bVarB instanceof l2) {
            return (l2) bVarB;
        }
        return null;
    }

    public static final List e(ie.a aVar) {
        Annotation annotationP;
        rd.m.e(aVar, "<this>");
        ie.h<ie.c> annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (ie.c cVar : annotations) {
            he.g1 source = cVar.getSource();
            if (source instanceof me.b) {
                annotationP = ((me.b) source).d();
            } else if (source instanceof l.a) {
                ne.u uVarB = ((l.a) source).b();
                ne.g gVar = uVarB instanceof ne.g ? (ne.g) uVarB : null;
                annotationP = gVar != null ? gVar.P() : null;
            } else {
                annotationP = p(cVar);
            }
            if (annotationP != null) {
                arrayList.add(annotationP);
            }
        }
        return s(arrayList);
    }

    public static final Class f(Class cls) {
        rd.m.e(cls, "<this>");
        return Array.newInstance((Class<?>) cls, 0).getClass();
    }

    public static final Object g(Type type) {
        rd.m.e(type, "type");
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!cls.isPrimitive()) {
            return null;
        }
        if (rd.m.a(cls, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (rd.m.a(cls, Character.TYPE)) {
            return (char) 0;
        }
        if (rd.m.a(cls, Byte.TYPE)) {
            return (byte) 0;
        }
        if (rd.m.a(cls, Short.TYPE)) {
            return (short) 0;
        }
        if (rd.m.a(cls, Integer.TYPE)) {
            return 0;
        }
        if (rd.m.a(cls, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (rd.m.a(cls, Long.TYPE)) {
            return 0L;
        }
        if (rd.m.a(cls, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (rd.m.a(cls, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final he.a h(Class cls, of.p pVar, jf.d dVar, jf.h hVar, jf.a aVar, qd.p pVar2) {
        List listF1;
        rd.m.e(cls, "moduleAnchor");
        rd.m.e(pVar, "proto");
        rd.m.e(dVar, "nameResolver");
        rd.m.e(hVar, "typeTable");
        rd.m.e(aVar, "metadataVersion");
        rd.m.e(pVar2, "createDescriptor");
        me.k kVarA = b3.a(cls);
        if (pVar instanceof gf.j) {
            listF1 = ((gf.j) pVar).K0();
        } else {
            if (!(pVar instanceof gf.o)) {
                throw new IllegalStateException(("Unsupported message: " + pVar).toString());
            }
            listF1 = ((gf.o) pVar).f1();
        }
        List list = listF1;
        ag.n nVarA = kVarA.a();
        he.h0 h0VarB = kVarA.b();
        jf.j jVarB = jf.j.f18710b.b();
        rd.m.b(list);
        return (he.a) pVar2.s(new ag.k0(new ag.p(nVarA, dVar, h0VarB, hVar, jVarB, aVar, null, null, list)), pVar);
    }

    public static final he.b1 i(he.a aVar) {
        rd.m.e(aVar, "<this>");
        if (aVar.g0() == null) {
            return null;
        }
        he.m mVarB = aVar.b();
        rd.m.c(mVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((he.e) mVarB).J0();
    }

    public static final mf.c j() {
        return f3923a;
    }

    public static final boolean k(yd.m mVar) {
        eg.r0 r0VarN;
        rd.m.e(mVar, "<this>");
        v2 v2Var = mVar instanceof v2 ? (v2) mVar : null;
        return (v2Var == null || (r0VarN = v2Var.n()) == null || !qf.k.i(r0VarN)) ? false : true;
    }

    public static final boolean l(yd.m mVar) {
        eg.r0 r0VarN;
        rd.m.e(mVar, "<this>");
        v2 v2Var = mVar instanceof v2 ? (v2) mVar : null;
        return (v2Var == null || (r0VarN = v2Var.n()) == null || !qf.k.c(r0VarN)) ? false : true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final Class m(ClassLoader classLoader, String str, String str2, int i10) {
        if (rd.m.a(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (i10 > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("[");
            }
            sb2.append("L");
        }
        if (str.length() > 0) {
            sb2.append(str + '.');
        }
        sb2.append(rg.q.E(str2, '.', '$', false, 4, null));
        if (i10 > 0) {
            sb2.append(";");
        }
        return me.e.a(classLoader, sb2.toString());
    }

    public static final Class n(ClassLoader classLoader, mf.b bVar, int i10) {
        rd.m.e(classLoader, "<this>");
        rd.m.e(bVar, "kotlinClassId");
        mf.b bVarN = ge.c.f13796a.n(bVar.a().i());
        if (bVarN == null) {
            bVarN = bVar;
        }
        if (!rd.m.a(bVarN, bVar)) {
            classLoader = ne.f.j(dd.d0.class);
        }
        return m(classLoader, bVarN.f().a(), bVarN.g().a(), i10);
    }

    public static /* synthetic */ Class o(ClassLoader classLoader, mf.b bVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return n(classLoader, bVar, i10);
    }

    private static final Annotation p(ie.c cVar) {
        he.e eVarL = uf.e.l(cVar);
        Class clsQ = eVarL != null ? q(eVarL) : null;
        if (!d.h0.a(clsQ)) {
            clsQ = null;
        }
        if (clsQ == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = cVar.a().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            mf.f fVar = (mf.f) entry.getKey();
            sf.g gVar = (sf.g) entry.getValue();
            ClassLoader classLoader = clsQ.getClassLoader();
            rd.m.d(classLoader, "getClassLoader(...)");
            Object objR = r(gVar, classLoader);
            dd.q qVarA = objR != null ? dd.w.a(fVar.d(), objR) : null;
            if (qVarA != null) {
                arrayList.add(qVarA);
            }
        }
        return (Annotation) ce.f.h(clsQ, ed.k0.r(arrayList), null, 4, null);
    }

    public static final Class q(he.e eVar) {
        rd.m.e(eVar, "<this>");
        he.g1 source = eVar.getSource();
        rd.m.d(source, "getSource(...)");
        if (source instanceof ef.z) {
            ef.x xVarD = ((ef.z) source).d();
            rd.m.c(xVarD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((me.f) xVarD).d();
        }
        if (source instanceof l.a) {
            ne.u uVarB = ((l.a) source).b();
            rd.m.c(uVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((ne.q) uVarB).w();
        }
        mf.b bVarN = uf.e.n(eVar);
        if (bVarN == null) {
            return null;
        }
        return o(ne.f.j(eVar.getClass()), bVarN, 0, 2, null);
    }

    private static final Object r(sf.g gVar, ClassLoader classLoader) {
        if (gVar instanceof sf.a) {
            return p((ie.c) ((sf.a) gVar).b());
        }
        if (gVar instanceof sf.b) {
            return a((sf.b) gVar, classLoader);
        }
        if (gVar instanceof sf.k) {
            dd.q qVar = (dd.q) ((sf.k) gVar).b();
            mf.b bVar = (mf.b) qVar.a();
            mf.f fVar = (mf.f) qVar.b();
            Class clsO = o(classLoader, bVar, 0, 2, null);
            if (clsO != null) {
                return k3.a(clsO, fVar.d());
            }
            return null;
        }
        if (!(gVar instanceof sf.s)) {
            if ((gVar instanceof sf.l) || (gVar instanceof sf.u)) {
                return null;
            }
            return gVar.b();
        }
        s.b bVar2 = (s.b) ((sf.s) gVar).b();
        if (bVar2 instanceof s.b.C0378b) {
            s.b.C0378b c0378b = (s.b.C0378b) bVar2;
            return n(classLoader, c0378b.b(), c0378b.a());
        }
        if (!(bVar2 instanceof s.b.a)) {
            throw new dd.o();
        }
        he.h hVarQ = ((s.b.a) bVar2).a().N0().q();
        he.e eVar = hVarQ instanceof he.e ? (he.e) hVarQ : null;
        if (eVar != null) {
            return q(eVar);
        }
        return null;
    }

    public static final List s(List list) throws IllegalAccessException, InvocationTargetException {
        List listE;
        rd.m.e(list, "<this>");
        if (d.h0.a(list) && list.isEmpty()) {
            return list;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (rd.m.a(pd.a.b(pd.a.a((Annotation) it.next())).getSimpleName(), "Container")) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Annotation annotation = (Annotation) it2.next();
                    Class clsB = pd.a.b(pd.a.a(annotation));
                    if (!rd.m.a(clsB.getSimpleName(), "Container") || clsB.getAnnotation(rd.e0.class) == null) {
                        listE = ed.q.e(annotation);
                    } else {
                        Object objInvoke = clsB.getDeclaredMethod("value", null).invoke(annotation, null);
                        rd.m.c(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                        listE = ed.j.d((Annotation[]) objInvoke);
                    }
                    ed.q.A(arrayList, listE);
                }
                return arrayList;
            }
        }
        return list;
    }
}
