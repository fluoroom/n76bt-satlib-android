package x6;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import d6.b;
import d6.b0;
import d6.c0;
import d6.e0;
import d6.h;
import d6.k;
import d6.m0;
import d6.p;
import d6.r;
import d6.s;
import d6.w;
import i7.j;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p6.b;
import p6.l;
import p6.p;
import p6.q;
import q6.c;
import q6.f;
import q6.g;

/* JADX INFO: loaded from: classes.dex */
public class a0 extends p6.b implements Serializable {

    /* JADX INFO: renamed from: c */
    private static final Class[] f31653c = {q6.g.class, d6.i0.class, d6.k.class, d6.e0.class, d6.z.class, d6.g0.class, d6.g.class, d6.u.class};

    /* JADX INFO: renamed from: d */
    private static final Class[] f31654d = {q6.d.class, d6.i0.class, d6.k.class, d6.e0.class, d6.g0.class, d6.g.class, d6.u.class, d6.v.class};

    /* JADX INFO: renamed from: a */
    protected transient i7.p f31655a = new i7.p(48, 48);

    /* JADX INFO: renamed from: b */
    protected boolean f31656b = true;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f31657a;

        static {
            int[] iArr = new int[g.a.values().length];
            f31657a = iArr;
            try {
                iArr[g.a.ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31657a[g.a.NON_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31657a[g.a.NON_DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31657a[g.a.NON_EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31657a[g.a.DEFAULT_INCLUSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        try {
            w6.d.a();
        } catch (Throwable th2) {
            i7.n.c(th2);
        }
    }

    private p6.m Q0(String str) {
        return new p6.m(null, str);
    }

    private p6.m R0(Throwable th2, String str) {
        return new p6.m((Closeable) null, str, th2);
    }

    private final Boolean T0(b bVar) {
        d6.y yVar = (d6.y) a(bVar, d6.y.class);
        if (yVar == null || !yVar.alphabetic()) {
            return null;
        }
        return Boolean.TRUE;
    }

    private boolean W0(JavaType javaType, Class cls) {
        return javaType.W() ? javaType.C(i7.h.c0(cls)) : cls.isPrimitive() && cls == i7.h.c0(javaType.r());
    }

    private boolean X0(Class cls, Class cls2) {
        return cls.isPrimitive() ? cls == i7.h.c0(cls2) : cls2.isPrimitive() && cls2 == i7.h.c0(cls);
    }

    private r.b Z0(b bVar, r.b bVar2) {
        q6.g gVar = (q6.g) a(bVar, q6.g.class);
        if (gVar != null) {
            int i10 = a.f31657a[gVar.include().ordinal()];
            if (i10 == 1) {
                return bVar2.o(r.a.ALWAYS);
            }
            if (i10 == 2) {
                return bVar2.o(r.a.NON_NULL);
            }
            if (i10 == 3) {
                return bVar2.o(r.a.NON_DEFAULT);
            }
            if (i10 == 4) {
                return bVar2.o(r.a.NON_EMPTY);
            }
        }
        return bVar2;
    }

    private List a1(String str, c0.a[] aVarArr) {
        ArrayList arrayList = new ArrayList(aVarArr.length);
        HashSet hashSet = new HashSet();
        for (c0.a aVar : aVarArr) {
            String strName = aVar.name();
            if (!strName.isEmpty() && hashSet.contains(strName)) {
                throw new IllegalArgumentException("Annotated type [" + str + "] got repeated subtype name [" + strName + "]");
            }
            hashSet.add(strName);
            arrayList.add(new a7.b(aVar.value(), strName));
            for (String str2 : aVar.names()) {
                if (!str2.isEmpty() && hashSet.contains(str2)) {
                    throw new IllegalArgumentException("Annotated type [" + str + "] got repeated subtype name [" + str2 + "]");
                }
                hashSet.add(str2);
                arrayList.add(new a7.b(aVar.value(), str2));
            }
        }
        return arrayList;
    }

    @Override // p6.b
    public Boolean A(b bVar) {
        d6.v vVar = (d6.v) a(bVar, d6.v.class);
        if (vVar == null) {
            return null;
        }
        return vVar.value().a();
    }

    @Override // p6.b
    public boolean A0(b bVar) {
        d6.h hVar = (d6.h) a(bVar, d6.h.class);
        return (hVar == null || hVar.mode() == h.a.DISABLED) ? false : true;
    }

    @Override // p6.b
    public boolean B0(k kVar) {
        return V0(kVar);
    }

    @Override // p6.b
    public p6.y C(b bVar) {
        boolean z10;
        d6.b0 b0Var = (d6.b0) a(bVar, d6.b0.class);
        if (b0Var != null) {
            String strValue = b0Var.value();
            if (!strValue.isEmpty()) {
                return p6.y.a(strValue);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        d6.w wVar = (d6.w) a(bVar, d6.w.class);
        if (wVar != null) {
            String strNamespace = wVar.namespace();
            return p6.y.b(wVar.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
        }
        if (z10 || c(bVar, f31654d)) {
            return p6.y.f24079d;
        }
        return null;
    }

    @Override // p6.b
    public Boolean C0(k kVar) {
        d6.w wVar = (d6.w) a(kVar, d6.w.class);
        if (wVar != null) {
            return Boolean.valueOf(wVar.required());
        }
        return null;
    }

    @Override // p6.b
    public p6.y D(b bVar) {
        boolean z10;
        d6.l lVar = (d6.l) a(bVar, d6.l.class);
        if (lVar != null) {
            String strValue = lVar.value();
            if (!strValue.isEmpty()) {
                return p6.y.a(strValue);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        d6.w wVar = (d6.w) a(bVar, d6.w.class);
        if (wVar != null) {
            String strNamespace = wVar.namespace();
            return p6.y.b(wVar.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
        }
        if (z10 || c(bVar, f31653c)) {
            return p6.y.f24079d;
        }
        return null;
    }

    @Override // p6.b
    public boolean D0(Annotation annotation) {
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        String name = clsAnnotationType.getName();
        Boolean boolValueOf = (Boolean) this.f31655a.get(name);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(clsAnnotationType.getAnnotation(d6.a.class) != null);
            this.f31655a.putIfAbsent(name, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    @Override // p6.b
    public Boolean E0(d dVar) {
        d6.q qVar = (d6.q) a(dVar, d6.q.class);
        if (qVar == null) {
            return null;
        }
        return Boolean.valueOf(qVar.value());
    }

    @Override // p6.b
    public Boolean F0(k kVar) {
        return Boolean.valueOf(b(kVar, d6.d0.class));
    }

    @Override // p6.b
    public Object G(d dVar) {
        q6.e eVar = (q6.e) a(dVar, q6.e.class);
        if (eVar == null) {
            return null;
        }
        return eVar.value();
    }

    @Override // p6.b
    public Object H(b bVar) {
        Class clsNullsUsing;
        q6.g gVar = (q6.g) a(bVar, q6.g.class);
        if (gVar == null || (clsNullsUsing = gVar.nullsUsing()) == p.a.class) {
            return null;
        }
        return clsNullsUsing;
    }

    @Override // p6.b
    public JavaType H0(r6.q qVar, b bVar, JavaType javaType) throws p6.m {
        com.fasterxml.jackson.databind.type.c cVarD = qVar.D();
        q6.d dVar = (q6.d) a(bVar, q6.d.class);
        Class clsK0 = dVar == null ? null : K0(dVar.as());
        if (clsK0 != null && !javaType.C(clsK0) && !W0(javaType, clsK0)) {
            try {
                javaType = cVarD.O(javaType, clsK0);
            } catch (IllegalArgumentException e10) {
                throw R0(e10, String.format("Failed to narrow type %s with annotation (value %s), from '%s': %s", javaType, clsK0.getName(), bVar.d(), e10.getMessage()));
            }
        }
        if (javaType.T()) {
            JavaType javaTypeQ = javaType.q();
            Class clsK02 = dVar == null ? null : K0(dVar.keyAs());
            if (clsK02 != null && !W0(javaTypeQ, clsK02)) {
                try {
                    javaType = ((MapLikeType) javaType).p0(cVarD.O(javaTypeQ, clsK02));
                } catch (IllegalArgumentException e11) {
                    throw R0(e11, String.format("Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, clsK02.getName(), bVar.d(), e11.getMessage()));
                }
            }
        }
        JavaType javaTypeK = javaType.k();
        if (javaTypeK != null) {
            Class clsK03 = dVar != null ? K0(dVar.contentAs()) : null;
            if (clsK03 != null && !W0(javaTypeK, clsK03)) {
                try {
                    return javaType.d0(cVarD.O(javaTypeK, clsK03));
                } catch (IllegalArgumentException e12) {
                    throw R0(e12, String.format("Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, clsK03.getName(), bVar.d(), e12.getMessage()));
                }
            }
        }
        return javaType;
    }

    @Override // p6.b
    public JavaType I0(r6.q qVar, b bVar, JavaType javaType) throws p6.m {
        JavaType javaTypeP0;
        JavaType javaTypeP02;
        com.fasterxml.jackson.databind.type.c cVarD = qVar.D();
        q6.g gVar = (q6.g) a(bVar, q6.g.class);
        Class<?> clsK0 = gVar == null ? null : K0(gVar.as());
        if (clsK0 != null) {
            if (javaType.C(clsK0)) {
                javaType = javaType.p0();
            } else {
                Class<?> clsR = javaType.r();
                try {
                    if (clsK0.isAssignableFrom(clsR)) {
                        javaType = cVarD.H(javaType, clsK0);
                    } else if (clsR.isAssignableFrom(clsK0)) {
                        javaType = cVarD.O(javaType, clsK0);
                    } else {
                        if (!X0(clsR, clsK0)) {
                            throw Q0(String.format("Cannot refine serialization type %s into %s; types not related", javaType, clsK0.getName()));
                        }
                        javaType = javaType.p0();
                    }
                } catch (IllegalArgumentException e10) {
                    throw R0(e10, String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", javaType, clsK0.getName(), bVar.d(), e10.getMessage()));
                }
            }
        }
        if (javaType.T()) {
            JavaType javaTypeQ = javaType.q();
            Class<?> clsK02 = gVar == null ? null : K0(gVar.keyAs());
            if (clsK02 != null) {
                if (javaTypeQ.C(clsK02)) {
                    javaTypeP02 = javaTypeQ.p0();
                } else {
                    Class<?> clsR2 = javaTypeQ.r();
                    try {
                        if (clsK02.isAssignableFrom(clsR2)) {
                            javaTypeP02 = cVarD.H(javaTypeQ, clsK02);
                        } else if (clsR2.isAssignableFrom(clsK02)) {
                            javaTypeP02 = cVarD.O(javaTypeQ, clsK02);
                        } else {
                            if (!X0(clsR2, clsK02)) {
                                throw Q0(String.format("Cannot refine serialization key type %s into %s; types not related", javaTypeQ, clsK02.getName()));
                            }
                            javaTypeP02 = javaTypeQ.p0();
                        }
                    } catch (IllegalArgumentException e11) {
                        throw R0(e11, String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, clsK02.getName(), bVar.d(), e11.getMessage()));
                    }
                }
                javaType = ((MapLikeType) javaType).p0(javaTypeP02);
            }
        }
        JavaType javaTypeK = javaType.k();
        if (javaTypeK != null) {
            Class<?> clsK03 = gVar != null ? K0(gVar.contentAs()) : null;
            if (clsK03 != null) {
                if (javaTypeK.C(clsK03)) {
                    javaTypeP0 = javaTypeK.p0();
                } else {
                    Class<?> clsR3 = javaTypeK.r();
                    try {
                        if (clsK03.isAssignableFrom(clsR3)) {
                            javaTypeP0 = cVarD.H(javaTypeK, clsK03);
                        } else if (clsR3.isAssignableFrom(clsK03)) {
                            javaTypeP0 = cVarD.O(javaTypeK, clsK03);
                        } else {
                            if (!X0(clsR3, clsK03)) {
                                throw Q0(String.format("Cannot refine serialization content type %s into %s; types not related", javaTypeK, clsK03.getName()));
                            }
                            javaTypeP0 = javaTypeK.p0();
                        }
                    } catch (IllegalArgumentException e12) {
                        throw R0(e12, String.format("Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, clsK03.getName(), bVar.d(), e12.getMessage()));
                    }
                }
                return javaType.d0(javaTypeP0);
            }
        }
        return javaType;
    }

    @Override // p6.b
    public l J0(r6.q qVar, l lVar, l lVar2) {
        Class clsA = lVar.A(0);
        Class clsA2 = lVar2.A(0);
        if (!clsA.isPrimitive()) {
            if (!clsA2.isPrimitive()) {
                if (clsA == String.class) {
                    if (clsA2 != String.class) {
                    }
                } else if (clsA2 == String.class) {
                }
                return null;
            }
            return lVar2;
        }
        if (clsA2.isPrimitive()) {
            return null;
        }
        return lVar;
    }

    @Override // p6.b
    public e0 K(b bVar) {
        d6.m mVar = (d6.m) a(bVar, d6.m.class);
        if (mVar == null || mVar.generator() == m0.class) {
            return null;
        }
        return new e0(p6.y.a(mVar.property()), mVar.scope(), mVar.generator(), mVar.resolver());
    }

    protected Class K0(Class cls) {
        if (cls == null || i7.h.J(cls)) {
            return null;
        }
        return cls;
    }

    @Override // p6.b
    public e0 L(b bVar, e0 e0Var) {
        d6.n nVar = (d6.n) a(bVar, d6.n.class);
        if (nVar == null) {
            return e0Var;
        }
        if (e0Var == null) {
            e0Var = e0.a();
        }
        return e0Var.g(nVar.alwaysAsId());
    }

    protected Class L0(Class cls, Class cls2) {
        Class clsK0 = K0(cls);
        if (clsK0 == null || clsK0 == cls2) {
            return null;
        }
        return clsK0;
    }

    protected b7.p M0() {
        return b7.p.r();
    }

    @Override // p6.b
    public Class N(d dVar) {
        q6.d dVar2 = (q6.d) a(dVar, q6.d.class);
        if (dVar2 == null) {
            return null;
        }
        return K0(dVar2.builder());
    }

    protected b7.p N0() {
        return new b7.p();
    }

    @Override // p6.b
    public f.a O(d dVar) {
        q6.f fVar = (q6.f) a(dVar, q6.f.class);
        if (fVar == null) {
            return null;
        }
        return new f.a(fVar);
    }

    protected e7.c O0(c.a aVar, r6.q qVar, d dVar, JavaType javaType) {
        p6.x xVar = aVar.required() ? p6.x.f24067h : p6.x.f24068r;
        String strValue = aVar.value();
        p6.y yVarY0 = Y0(aVar.propName(), aVar.propNamespace());
        if (!yVarY0.e()) {
            yVarY0 = p6.y.a(strValue);
        }
        return f7.a.R(strValue, i7.z.M(qVar, new k0(dVar, dVar.e(), strValue, javaType), yVarY0, xVar, aVar.include()), dVar.p(), javaType);
    }

    protected e7.c P0(c.b bVar, r6.q qVar, d dVar) {
        p6.x xVar = bVar.required() ? p6.x.f24067h : p6.x.f24068r;
        p6.y yVarY0 = Y0(bVar.name(), bVar.namespace());
        JavaType javaTypeE = qVar.e(bVar.type());
        i7.z zVarM = i7.z.M(qVar, new k0(dVar, dVar.e(), yVarY0.c(), javaTypeE), yVarY0, xVar, bVar.include());
        Class clsValue = bVar.value();
        qVar.w();
        return ((e7.s) i7.h.l(clsValue, qVar.b())).Q(qVar, dVar, zVarM, javaTypeE);
    }

    @Override // p6.b
    public w.a Q(b bVar) {
        d6.w wVar = (d6.w) a(bVar, d6.w.class);
        if (wVar != null) {
            return wVar.access();
        }
        return null;
    }

    @Override // p6.b
    public List R(b bVar) {
        d6.c cVar = (d6.c) a(bVar, d6.c.class);
        if (cVar == null) {
            return null;
        }
        String[] strArrValue = cVar.value();
        int length = strArrValue.length;
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (String str : strArrValue) {
            arrayList.add(p6.y.a(str));
        }
        return arrayList;
    }

    @Override // p6.b
    public a7.g S(r6.q qVar, k kVar, JavaType javaType) {
        if (javaType.k() != null) {
            return U0(qVar, kVar, javaType);
        }
        throw new IllegalArgumentException("Must call method with a container or reference type (got " + javaType + ")");
    }

    protected p6.y S0(b bVar) {
        if (!(bVar instanceof o)) {
            return null;
        }
        ((o) bVar).s();
        return null;
    }

    @Override // p6.b
    public String T(b bVar) {
        d6.w wVar = (d6.w) a(bVar, d6.w.class);
        if (wVar == null) {
            return null;
        }
        String strDefaultValue = wVar.defaultValue();
        if (strDefaultValue.isEmpty()) {
            return null;
        }
        return strDefaultValue;
    }

    protected a7.g U0(r6.q qVar, b bVar, JavaType javaType) {
        a7.g gVarN0;
        d6.e0 e0Var = (d6.e0) a(bVar, d6.e0.class);
        q6.i iVar = (q6.i) a(bVar, q6.i.class);
        if (iVar != null) {
            if (e0Var == null) {
                return null;
            }
            gVarN0 = qVar.R(bVar, iVar.value());
        } else {
            if (e0Var == null) {
                return null;
            }
            if (e0Var.use() == e0.b.NONE) {
                return M0();
            }
            gVarN0 = N0();
        }
        q6.h hVar = (q6.h) a(bVar, q6.h.class);
        a7.f fVarQ = hVar != null ? qVar.Q(bVar, hVar.value()) : null;
        if (fVarQ != null) {
            fVarQ.c(javaType);
        }
        a7.g gVarH = gVarN0.h(e0Var.use(), fVarQ);
        e0.a aVarInclude = e0Var.include();
        if (aVarInclude == e0.a.EXTERNAL_PROPERTY && (bVar instanceof d)) {
            aVarInclude = e0.a.PROPERTY;
        }
        a7.g gVarC = gVarH.g(aVarInclude).c(e0Var.property());
        Class clsDefaultImpl = e0Var.defaultImpl();
        if (clsDefaultImpl != e0.c.class && !clsDefaultImpl.isAnnotation()) {
            gVarC = gVarC.d(clsDefaultImpl);
        }
        return gVarC.a(e0Var.visible());
    }

    protected boolean V0(b bVar) {
        d6.o oVar = (d6.o) a(bVar, d6.o.class);
        if (oVar != null) {
            return oVar.value();
        }
        return false;
    }

    @Override // p6.b
    public String W(b bVar) {
        d6.x xVar = (d6.x) a(bVar, d6.x.class);
        if (xVar == null) {
            return null;
        }
        return xVar.value();
    }

    @Override // p6.b
    public p.a X(r6.q qVar, b bVar) {
        d6.p pVar = (d6.p) a(bVar, d6.p.class);
        return pVar == null ? p.a.f() : p.a.i(pVar);
    }

    @Override // p6.b
    public p.a Y(b bVar) {
        return X(null, bVar);
    }

    protected p6.y Y0(String str, String str2) {
        return str.isEmpty() ? p6.y.f24079d : (str2 == null || str2.isEmpty()) ? p6.y.a(str) : p6.y.b(str, str2);
    }

    @Override // p6.b
    public r.b Z(b bVar) {
        d6.r rVar = (d6.r) a(bVar, d6.r.class);
        r.b bVarC = rVar == null ? r.b.c() : r.b.d(rVar);
        return bVarC.h() == r.a.USE_DEFAULTS ? Z0(bVar, bVarC) : bVarC;
    }

    @Override // p6.b
    public s.a a0(r6.q qVar, b bVar) {
        d6.s sVar = (d6.s) a(bVar, d6.s.class);
        return sVar == null ? s.a.c() : s.a.d(sVar);
    }

    @Override // p6.b
    public Integer b0(b bVar) {
        int iIndex;
        d6.w wVar = (d6.w) a(bVar, d6.w.class);
        if (wVar == null || (iIndex = wVar.index()) == -1) {
            return null;
        }
        return Integer.valueOf(iIndex);
    }

    @Override // p6.b
    public a7.g c0(r6.q qVar, k kVar, JavaType javaType) {
        if (javaType.L() || javaType.b()) {
            return null;
        }
        return U0(qVar, kVar, javaType);
    }

    @Override // p6.b
    public void d(r6.q qVar, d dVar, List list) {
        q6.c cVar = (q6.c) a(dVar, q6.c.class);
        if (cVar == null) {
            return;
        }
        boolean zPrepend = cVar.prepend();
        c.a[] aVarArrAttrs = cVar.attrs();
        int length = aVarArrAttrs.length;
        JavaType javaTypeE = null;
        for (int i10 = 0; i10 < length; i10++) {
            if (javaTypeE == null) {
                javaTypeE = qVar.e(Object.class);
            }
            e7.c cVarO0 = O0(aVarArrAttrs[i10], qVar, dVar, javaTypeE);
            if (zPrepend) {
                list.add(i10, cVarO0);
            } else {
                list.add(cVarO0);
            }
        }
        c.b[] bVarArrProps = cVar.props();
        int length2 = bVarArrProps.length;
        for (int i11 = 0; i11 < length2; i11++) {
            e7.c cVarP0 = P0(bVarArrProps[i11], qVar, dVar);
            if (zPrepend) {
                list.add(i11, cVarP0);
            } else {
                list.add(cVarP0);
            }
        }
    }

    @Override // p6.b
    public b.a d0(k kVar) {
        d6.u uVar = (d6.u) a(kVar, d6.u.class);
        if (uVar != null) {
            return b.a.e(uVar.value());
        }
        d6.g gVar = (d6.g) a(kVar, d6.g.class);
        if (gVar != null) {
            return b.a.a(gVar.value());
        }
        return null;
    }

    @Override // p6.b
    public l0 e(d dVar, l0 l0Var) {
        d6.f fVar = (d6.f) a(dVar, d6.f.class);
        return fVar == null ? l0Var : l0Var.l(fVar);
    }

    @Override // p6.b
    public p6.y e0(r6.q qVar, i iVar, p6.y yVar) {
        return null;
    }

    @Override // p6.b
    public Object f(b bVar) {
        Class clsContentUsing;
        q6.d dVar = (q6.d) a(bVar, q6.d.class);
        if (dVar == null || (clsContentUsing = dVar.contentUsing()) == l.a.class) {
            return null;
        }
        return clsContentUsing;
    }

    @Override // p6.b
    public p6.y f0(d dVar) {
        d6.a0 a0Var = (d6.a0) a(dVar, d6.a0.class);
        if (a0Var == null) {
            return null;
        }
        String strNamespace = a0Var.namespace();
        return p6.y.b(a0Var.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
    }

    @Override // p6.b
    public Object g(b bVar) {
        Class clsContentUsing;
        q6.g gVar = (q6.g) a(bVar, q6.g.class);
        if (gVar == null || (clsContentUsing = gVar.contentUsing()) == p.a.class) {
            return null;
        }
        return clsContentUsing;
    }

    @Override // p6.b
    public Object g0(k kVar) {
        q6.g gVar = (q6.g) a(kVar, q6.g.class);
        if (gVar == null) {
            return null;
        }
        return L0(gVar.contentConverter(), j.a.class);
    }

    @Override // p6.b
    public h.a h(r6.q qVar, b bVar) {
        d6.h hVar = (d6.h) a(bVar, d6.h.class);
        if (hVar != null) {
            return hVar.mode();
        }
        if (!this.f31656b) {
            return null;
        }
        qVar.L(p6.r.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES);
        return null;
    }

    @Override // p6.b
    public Object h0(b bVar) {
        q6.g gVar = (q6.g) a(bVar, q6.g.class);
        if (gVar == null) {
            return null;
        }
        return L0(gVar.converter(), j.a.class);
    }

    @Override // p6.b
    public h.a i(b bVar) {
        d6.h hVar = (d6.h) a(bVar, d6.h.class);
        if (hVar == null) {
            return null;
        }
        return hVar.mode();
    }

    @Override // p6.b
    public String[] i0(d dVar) {
        d6.y yVar = (d6.y) a(dVar, d6.y.class);
        if (yVar == null) {
            return null;
        }
        return yVar.value();
    }

    @Override // p6.b
    public Enum j(Class cls) {
        return i7.h.v(cls, d6.i.class);
    }

    @Override // p6.b
    public Boolean j0(b bVar) {
        return T0(bVar);
    }

    @Override // p6.b
    public Object k(k kVar) {
        q6.d dVar = (q6.d) a(kVar, q6.d.class);
        if (dVar == null) {
            return null;
        }
        return L0(dVar.contentConverter(), j.a.class);
    }

    @Override // p6.b
    public g.b k0(b bVar) {
        q6.g gVar = (q6.g) a(bVar, q6.g.class);
        if (gVar == null) {
            return null;
        }
        return gVar.typing();
    }

    @Override // p6.b
    public Object l(b bVar) {
        q6.d dVar = (q6.d) a(bVar, q6.d.class);
        if (dVar == null) {
            return null;
        }
        return L0(dVar.converter(), j.a.class);
    }

    @Override // p6.b
    public Object l0(b bVar) {
        Class clsUsing;
        q6.g gVar = (q6.g) a(bVar, q6.g.class);
        if (gVar != null && (clsUsing = gVar.using()) != p.a.class) {
            return clsUsing;
        }
        d6.z zVar = (d6.z) a(bVar, d6.z.class);
        if (zVar == null || !zVar.value()) {
            return null;
        }
        return new g7.y(bVar.e());
    }

    @Override // p6.b
    public b0.a m0(b bVar) {
        return b0.a.d((d6.b0) a(bVar, d6.b0.class));
    }

    @Override // p6.b
    public Object n(b bVar) {
        Class clsUsing;
        q6.d dVar = (q6.d) a(bVar, q6.d.class);
        if (dVar == null || (clsUsing = dVar.using()) == l.a.class) {
            return null;
        }
        return clsUsing;
    }

    @Override // p6.b
    public List n0(b bVar) {
        d6.c0 c0Var = (d6.c0) a(bVar, d6.c0.class);
        if (c0Var == null) {
            return null;
        }
        c0.a[] aVarArrValue = c0Var.value();
        if (c0Var.failOnRepeatedNames()) {
            return a1(bVar.d(), aVarArrValue);
        }
        ArrayList arrayList = new ArrayList(aVarArrValue.length);
        for (c0.a aVar : aVarArrValue) {
            arrayList.add(new a7.b(aVar.value(), aVar.name()));
            for (String str : aVar.names()) {
                arrayList.add(new a7.b(aVar.value(), str));
            }
        }
        return arrayList;
    }

    @Override // p6.b
    public void o(Class cls, Enum[] enumArr, String[][] strArr) {
        d6.c cVar;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (cVar = (d6.c) field.getAnnotation(d6.c.class)) != null) {
                String[] strArrValue = cVar.value();
                if (strArrValue.length != 0) {
                    String name = field.getName();
                    int length = enumArr.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        if (name.equals(enumArr[i10].name())) {
                            strArr[i10] = strArrValue;
                        }
                    }
                }
            }
        }
    }

    @Override // p6.b
    public String o0(d dVar) {
        d6.f0 f0Var = (d6.f0) a(dVar, d6.f0.class);
        if (f0Var == null) {
            return null;
        }
        return f0Var.value();
    }

    @Override // p6.b
    public Object p(r6.q qVar, d dVar) {
        q6.a aVar = (q6.a) a(dVar, q6.a.class);
        if (aVar == null) {
            return null;
        }
        return aVar.value();
    }

    @Override // p6.b
    public a7.g p0(r6.q qVar, d dVar, JavaType javaType) {
        return U0(qVar, dVar, javaType);
    }

    @Override // p6.b
    public String[] q(Class cls, Enum[] enumArr, String[] strArr) {
        d6.w wVar;
        HashMap map = null;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (wVar = (d6.w) field.getAnnotation(d6.w.class)) != null) {
                String strValue = wVar.value();
                if (!strValue.isEmpty()) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.put(field.getName(), strValue);
                }
            }
        }
        if (map != null) {
            int length = enumArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                String str = (String) map.get(enumArr[i10].name());
                if (str != null) {
                    strArr[i10] = str;
                }
            }
        }
        return strArr;
    }

    @Override // p6.b
    public i7.s q0(k kVar) {
        d6.g0 g0Var = (d6.g0) a(kVar, d6.g0.class);
        if (g0Var == null || !g0Var.enabled()) {
            return null;
        }
        return i7.s.b(g0Var.prefix(), g0Var.suffix());
    }

    @Override // p6.b
    public Object r(b bVar) {
        d6.j jVar = (d6.j) a(bVar, d6.j.class);
        if (jVar == null) {
            return null;
        }
        String strValue = jVar.value();
        if (strValue.isEmpty()) {
            return null;
        }
        return strValue;
    }

    @Override // p6.b
    public Object r0(d dVar) {
        q6.j jVar = (q6.j) a(dVar, q6.j.class);
        if (jVar == null) {
            return null;
        }
        return jVar.value();
    }

    @Override // p6.b
    public k.d s(b bVar) {
        d6.k kVar = (d6.k) a(bVar, d6.k.class);
        if (kVar == null) {
            return null;
        }
        return k.d.d(kVar);
    }

    @Override // p6.b
    public Class[] s0(b bVar) {
        d6.i0 i0Var = (d6.i0) a(bVar, d6.i0.class);
        if (i0Var == null) {
            return null;
        }
        return i0Var.value();
    }

    @Override // p6.b
    public String t(k kVar) {
        p6.y yVarS0 = S0(kVar);
        if (yVarS0 == null) {
            return null;
        }
        return yVarS0.c();
    }

    @Override // p6.b
    public Boolean u0(b bVar) {
        d6.d dVar = (d6.d) a(bVar, d6.d.class);
        if (dVar == null) {
            return null;
        }
        return Boolean.valueOf(dVar.enabled());
    }

    @Override // p6.b
    public b.a v(k kVar) {
        String name;
        d6.b bVar = (d6.b) a(kVar, d6.b.class);
        if (bVar == null) {
            return null;
        }
        b.a aVarD = b.a.d(bVar);
        if (aVarD.f()) {
            return aVarD;
        }
        if (kVar instanceof l) {
            l lVar = (l) kVar;
            name = lVar.x() == 0 ? kVar.e().getName() : lVar.A(0).getName();
        } else {
            name = kVar.e().getName();
        }
        return aVarD.h(name);
    }

    @Override // p6.b
    public boolean v0(l lVar) {
        return b(lVar, d6.d.class);
    }

    @Override // p6.b
    public Object w(k kVar) {
        b.a aVarV = v(kVar);
        if (aVarV == null) {
            return null;
        }
        return aVarV.e();
    }

    @Override // p6.b
    public Boolean w0(b bVar) {
        d6.e eVar = (d6.e) a(bVar, d6.e.class);
        if (eVar == null) {
            return null;
        }
        return Boolean.valueOf(eVar.enabled());
    }

    @Override // p6.b
    public Object x(b bVar) {
        Class clsKeyUsing;
        q6.d dVar = (q6.d) a(bVar, q6.d.class);
        if (dVar == null || (clsKeyUsing = dVar.keyUsing()) == q.a.class) {
            return null;
        }
        return clsKeyUsing;
    }

    @Override // p6.b
    public Boolean x0(r6.q qVar, b bVar) {
        d6.t tVar = (d6.t) a(bVar, d6.t.class);
        if (tVar == null) {
            return null;
        }
        return Boolean.valueOf(tVar.value());
    }

    @Override // p6.b
    public Boolean y0(b bVar) {
        d6.h0 h0Var = (d6.h0) a(bVar, d6.h0.class);
        if (h0Var == null) {
            return null;
        }
        return Boolean.valueOf(h0Var.value());
    }

    @Override // p6.b
    public Object z(b bVar) {
        Class clsKeyUsing;
        q6.g gVar = (q6.g) a(bVar, q6.g.class);
        if (gVar == null || (clsKeyUsing = gVar.keyUsing()) == p.a.class) {
            return null;
        }
        return clsKeyUsing;
    }

    @Override // p6.b
    public boolean z0(l lVar) {
        d6.h0 h0Var = (d6.h0) a(lVar, d6.h0.class);
        return h0Var != null && h0Var.value();
    }
}
