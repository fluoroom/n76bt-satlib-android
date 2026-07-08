package e7;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import d6.k;
import d6.p;
import d6.r;
import d6.s;
import g7.a0;
import g7.e0;
import g7.j0;
import g7.k0;
import g7.l0;
import g7.m0;
import g7.o0;
import g7.v;
import g7.w;
import g7.x;
import i7.b0;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import p6.c0;
import p6.d0;
import q6.g;
import r6.t;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends q implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final HashMap f11617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final HashMap f11618c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final t f11619a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f11621b;

        static {
            int[] iArr = new int[r.a.values().length];
            f11621b = iArr;
            try {
                iArr[r.a.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11621b[r.a.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11621b[r.a.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11621b[r.a.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11621b[r.a.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11621b[r.a.USE_DEFAULTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[k.c.values().length];
            f11620a = iArr2;
            try {
                iArr2[k.c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11620a[k.c.OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11620a[k.c.ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put(String.class.getName(), new j0());
        m0 m0Var = m0.f13613c;
        map2.put(StringBuffer.class.getName(), m0Var);
        map2.put(StringBuilder.class.getName(), m0Var);
        map2.put(Character.class.getName(), m0Var);
        map2.put(Character.TYPE.getName(), m0Var);
        w.a(map2);
        map2.put(Boolean.TYPE.getName(), new g7.e(true));
        map2.put(Boolean.class.getName(), new g7.e(false));
        map2.put(BigInteger.class.getName(), new v(BigInteger.class));
        map2.put(BigDecimal.class.getName(), new v(BigDecimal.class));
        map2.put(Calendar.class.getName(), g7.h.f13603f);
        map2.put(Date.class.getName(), g7.k.f13606f);
        for (Map.Entry entry : e0.a()) {
            Object value = entry.getValue();
            if (value instanceof p6.p) {
                map2.put(((Class) entry.getKey()).getName(), (p6.p) value);
            } else {
                map.put(((Class) entry.getKey()).getName(), (Class) value);
            }
        }
        map.put(b0.class.getName(), o0.class);
        f11617b = map2;
        f11618c = map;
    }

    protected b(t tVar) {
        this.f11619a = tVar == null ? new t() : tVar;
    }

    protected p6.p A(d0 d0Var, JavaType javaType, p6.c cVar, boolean z10) {
        return w6.k.f31324f.c(d0Var.k(), javaType, cVar);
    }

    public p6.p C(d0 d0Var, ReferenceType referenceType, p6.c cVar, boolean z10) {
        JavaType javaTypeK = referenceType.k();
        a7.h hVarC = (a7.h) javaTypeK.v();
        p6.b0 b0VarK = d0Var.k();
        if (hVarC == null) {
            hVarC = c(b0VarK, javaTypeK);
        }
        a7.h hVar = hVarC;
        p6.p pVar = (p6.p) javaTypeK.w();
        Iterator it = v().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        if (referenceType.Z(AtomicReference.class)) {
            return i(d0Var, referenceType, cVar, z10, hVar, pVar);
        }
        return null;
    }

    protected final p6.p D(p6.b0 b0Var, JavaType javaType, p6.c cVar, boolean z10) {
        Class clsR = javaType.r();
        if (Iterator.class.isAssignableFrom(clsR)) {
            JavaType[] javaTypeArrX = b0Var.D().X(javaType, Iterator.class);
            return r(b0Var, javaType, cVar, z10, (javaTypeArrX == null || javaTypeArrX.length != 1) ? com.fasterxml.jackson.databind.type.c.b0() : javaTypeArrX[0]);
        }
        if (Iterable.class.isAssignableFrom(clsR)) {
            JavaType[] javaTypeArrX2 = b0Var.D().X(javaType, Iterable.class);
            return q(b0Var, javaType, cVar, z10, (javaTypeArrX2 == null || javaTypeArrX2.length != 1) ? com.fasterxml.jackson.databind.type.c.b0() : javaTypeArrX2[0]);
        }
        if (CharSequence.class.isAssignableFrom(clsR)) {
            return m0.f13613c;
        }
        return null;
    }

    protected final p6.p G(d0 d0Var, JavaType javaType, p6.c cVar) {
        if (p6.o.class.isAssignableFrom(javaType.r())) {
            return a0.f13565c;
        }
        x6.k kVarJ = cVar.j();
        if (kVarJ == null) {
            return null;
        }
        if (d0Var.D()) {
            i7.h.g(kVarJ.n(), d0Var.x0(p6.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        JavaType javaTypeF = kVarJ.f();
        p6.p pVarL = L(d0Var, kVarJ);
        if (pVarL == null) {
            pVarL = (p6.p) javaTypeF.w();
        }
        a7.h hVarC = (a7.h) javaTypeF.v();
        if (hVarC == null) {
            hVarC = c(d0Var.k(), javaTypeF);
        }
        return new g7.s(kVarJ, hVarC, pVarL);
    }

    protected final p6.p H(JavaType javaType, p6.b0 b0Var, p6.c cVar, boolean z10) {
        Class cls;
        String name = javaType.r().getName();
        p6.p pVar = (p6.p) f11617b.get(name);
        return (pVar != null || (cls = (Class) f11618c.get(name)) == null) ? pVar : (p6.p) i7.h.l(cls, false);
    }

    protected final p6.p K(d0 d0Var, JavaType javaType, p6.c cVar, boolean z10) {
        if (javaType.O()) {
            return n(d0Var.k(), javaType, cVar);
        }
        Class clsR = javaType.r();
        p6.p pVarA = A(d0Var, javaType, cVar, z10);
        if (pVarA != null) {
            return pVarA;
        }
        if (Calendar.class.isAssignableFrom(clsR)) {
            return g7.h.f13603f;
        }
        if (Date.class.isAssignableFrom(clsR)) {
            return g7.k.f13606f;
        }
        if (Map.Entry.class.isAssignableFrom(clsR)) {
            JavaType javaTypeI = javaType.i(Map.Entry.class);
            return s(d0Var, javaType, cVar, z10, javaTypeI.h(0), javaTypeI.h(1));
        }
        if (ByteBuffer.class.isAssignableFrom(clsR)) {
            return new g7.g();
        }
        if (InetAddress.class.isAssignableFrom(clsR)) {
            return new g7.p();
        }
        if (InetSocketAddress.class.isAssignableFrom(clsR)) {
            return new g7.q();
        }
        if (TimeZone.class.isAssignableFrom(clsR)) {
            return new k0();
        }
        if (Charset.class.isAssignableFrom(clsR)) {
            return m0.f13613c;
        }
        if (!Number.class.isAssignableFrom(clsR)) {
            if (ClassLoader.class.isAssignableFrom(clsR)) {
                return new l0(javaType);
            }
            return null;
        }
        int i10 = a.f11620a[cVar.g(null).i().ordinal()];
        if (i10 == 1) {
            return m0.f13613c;
        }
        if (i10 == 2 || i10 == 3) {
            return null;
        }
        return v.f13643d;
    }

    protected p6.p L(d0 d0Var, x6.b bVar) {
        Object objL0 = d0Var.i0().l0(bVar);
        if (objL0 == null) {
            return null;
        }
        return x(d0Var, bVar, d0Var.G0(bVar, objL0));
    }

    protected boolean N(Class cls) {
        return RandomAccess.class.isAssignableFrom(cls);
    }

    protected boolean O(p6.b0 b0Var, p6.c cVar, a7.h hVar) {
        if (hVar != null) {
            return false;
        }
        g.b bVarK0 = b0Var.g().k0(cVar.s());
        return (bVarK0 == null || bVarK0 == g.b.DEFAULT_TYPING) ? b0Var.L(p6.r.USE_STATIC_TYPING) : bVarK0 == g.b.STATIC;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007b A[PHI: r2
      0x007b: PHI (r2v4 p6.p) = (r2v3 p6.p), (r2v6 p6.p) binds: [B:10:0x0032, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // e7.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p6.p a(p6.d0 r6, com.fasterxml.jackson.databind.JavaType r7, p6.p r8) {
        /*
            r5 = this;
            p6.b0 r0 = r6.k()
            p6.c r1 = r0.p0(r7)
            r6.t r2 = r5.f11619a
            boolean r2 = r2.a()
            r3 = 0
            if (r2 == 0) goto L2a
            r6.t r2 = r5.f11619a
            java.lang.Iterable r2 = r2.c()
            java.util.Iterator r2 = r2.iterator()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L22
            goto L2a
        L22:
            java.lang.Object r6 = r2.next()
            android.support.v4.media.session.b.a(r6)
            throw r3
        L2a:
            x6.d r2 = r1.s()
            p6.p r2 = r5.g(r6, r2)
            if (r2 != 0) goto L7b
            if (r8 != 0) goto L7c
            java.lang.Class r2 = r7.r()
            r4 = 0
            p6.p r2 = g7.g0.b(r0, r2, r4)
            if (r2 != 0) goto L7b
            x6.k r2 = r1.i()
            if (r2 != 0) goto L4b
            x6.k r2 = r1.j()
        L4b:
            if (r2 == 0) goto L6e
            com.fasterxml.jackson.databind.JavaType r7 = r2.f()
            p6.p r6 = r5.a(r6, r7, r8)
            boolean r7 = r0.b()
            if (r7 == 0) goto L68
            java.lang.reflect.Member r7 = r2.n()
            p6.r r8 = p6.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r8 = r0.L(r8)
            i7.h.g(r7, r8)
        L68:
            g7.s r8 = new g7.s
            r8.<init>(r2, r3, r6)
            goto L7c
        L6e:
            java.lang.Class r6 = r7.r()
            x6.d r7 = r1.s()
            p6.p r8 = g7.g0.a(r0, r6, r7)
            goto L7c
        L7b:
            r8 = r2
        L7c:
            r6.t r6 = r5.f11619a
            boolean r6 = r6.b()
            if (r6 == 0) goto L9d
            r6.t r6 = r5.f11619a
            java.lang.Iterable r6 = r6.d()
            java.util.Iterator r6 = r6.iterator()
            boolean r7 = r6.hasNext()
            if (r7 != 0) goto L95
            goto L9d
        L95:
            java.lang.Object r6 = r6.next()
            android.support.v4.media.session.b.a(r6)
            throw r3
        L9d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.b.a(p6.d0, com.fasterxml.jackson.databind.JavaType, p6.p):p6.p");
    }

    @Override // e7.q
    public a7.h c(p6.b0 b0Var, JavaType javaType) {
        Collection collectionA;
        x6.d dVarS = b0Var.H(javaType.r()).s();
        a7.g gVarP0 = b0Var.g().p0(b0Var, dVarS, javaType);
        if (gVarP0 == null) {
            gVarP0 = b0Var.t(javaType);
            collectionA = null;
        } else {
            collectionA = b0Var.h0().a(b0Var, dVarS);
        }
        if (gVarP0 == null) {
            return null;
        }
        return gVarP0.e(b0Var, javaType, collectionA);
    }

    protected g7.t d(d0 d0Var, p6.c cVar, g7.t tVar) {
        JavaType javaTypeR = tVar.R();
        r.b bVarF = f(d0Var, cVar, javaTypeR, Map.class);
        r.a aVarF = bVarF == null ? r.a.USE_DEFAULTS : bVarF.f();
        Object objB = null;
        boolean zW0 = true;
        if (aVarF == r.a.USE_DEFAULTS || aVarF == r.a.ALWAYS) {
            return !d0Var.y0(c0.WRITE_NULL_MAP_VALUES) ? tVar.c0(null, true) : tVar;
        }
        int i10 = a.f11621b[aVarF.ordinal()];
        if (i10 == 1) {
            objB = i7.e.b(javaTypeR);
            if (objB != null && objB.getClass().isArray()) {
                objB = i7.c.a(objB);
            }
        } else if (i10 != 2) {
            if (i10 == 3) {
                objB = g7.t.B;
            } else if (i10 == 4 && (objB = d0Var.v0(null, bVarF.e())) != null) {
                zW0 = d0Var.w0(objB);
            }
        } else if (javaTypeR.b()) {
            objB = g7.t.B;
        }
        return tVar.c0(objB, zW0);
    }

    protected p6.p e(d0 d0Var, x6.b bVar) {
        Object objG = d0Var.i0().g(bVar);
        if (objG != null) {
            return d0Var.G0(bVar, objG);
        }
        return null;
    }

    protected r.b f(d0 d0Var, p6.c cVar, JavaType javaType, Class cls) {
        p6.b0 b0VarK = d0Var.k();
        r.b bVarR = b0VarK.r(cls, cVar.o(b0VarK.d0()));
        r.b bVarR2 = b0VarK.r(javaType.r(), null);
        if (bVarR2 != null) {
            int i10 = a.f11621b[bVarR2.h().ordinal()];
            if (i10 == 4) {
                return bVarR.k(bVarR2.e());
            }
            if (i10 != 6) {
                return bVarR.l(bVarR2.h());
            }
        }
        return bVarR;
    }

    protected p6.p g(d0 d0Var, x6.b bVar) {
        Object objZ = d0Var.i0().z(bVar);
        if (objZ != null) {
            return d0Var.G0(bVar, objZ);
        }
        return null;
    }

    protected p6.p h(d0 d0Var, ArrayType arrayType, p6.c cVar, boolean z10, a7.h hVar, p6.p pVar) {
        d0Var.k();
        Iterator it = v().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        Class clsR = arrayType.r();
        p6.p pVarA = (pVar == null || i7.h.P(pVar)) ? String[].class == clsR ? f7.n.f12880g : g7.c0.a(clsR) : null;
        if (pVarA == null) {
            pVarA = new x(arrayType.k(), z10, hVar, pVar);
        }
        if (this.f11619a.b()) {
            Iterator it2 = this.f11619a.d().iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                throw null;
            }
        }
        return pVarA;
    }

    protected p6.p i(d0 d0Var, ReferenceType referenceType, p6.c cVar, boolean z10, a7.h hVar, p6.p pVar) {
        boolean zW0;
        JavaType javaTypeA = referenceType.a();
        r.b bVarF = f(d0Var, cVar, javaTypeA, AtomicReference.class);
        r.a aVarF = bVarF == null ? r.a.USE_DEFAULTS : bVarF.f();
        Object objB = null;
        if (aVarF == r.a.USE_DEFAULTS || aVarF == r.a.ALWAYS) {
            zW0 = false;
        } else {
            int i10 = a.f11621b[aVarF.ordinal()];
            zW0 = true;
            if (i10 == 1) {
                objB = i7.e.b(javaTypeA);
                if (objB != null && objB.getClass().isArray()) {
                    objB = i7.c.a(objB);
                }
            } else if (i10 != 2) {
                if (i10 == 3) {
                    objB = g7.t.B;
                } else if (i10 == 4 && (objB = d0Var.v0(null, bVarF.e())) != null) {
                    zW0 = d0Var.w0(objB);
                }
            } else if (javaTypeA.b()) {
                objB = g7.t.B;
            }
        }
        return new g7.c(referenceType, z10, hVar, pVar).H(objB, zW0);
    }

    public h j(JavaType javaType, boolean z10, a7.h hVar, p6.p pVar) {
        return new g7.j(javaType, z10, hVar, pVar);
    }

    protected p6.p k(d0 d0Var, CollectionType collectionType, p6.c cVar, boolean z10, a7.h hVar, p6.p pVar) {
        d0Var.k();
        Iterator it = v().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        p6.p pVarG = G(d0Var, collectionType, cVar);
        if (pVarG == null) {
            if (cVar.g(null).i() == k.c.OBJECT) {
                return null;
            }
            Class clsR = collectionType.r();
            if (EnumSet.class.isAssignableFrom(clsR)) {
                JavaType javaTypeK = collectionType.k();
                if (!javaTypeK.N()) {
                    javaTypeK = null;
                }
                pVarG = o(javaTypeK);
            } else {
                Class clsR2 = collectionType.k().r();
                if (N(clsR)) {
                    if (clsR2 != String.class) {
                        pVarG = p(collectionType.k(), z10, hVar, pVar);
                    } else if (i7.h.P(pVar)) {
                        pVarG = f7.f.f12835d;
                    }
                } else if (clsR2 == String.class && i7.h.P(pVar)) {
                    pVarG = f7.o.f12882d;
                }
                if (pVarG == null) {
                    pVarG = j(collectionType.k(), z10, hVar, pVar);
                }
            }
        }
        if (this.f11619a.b()) {
            Iterator it2 = this.f11619a.d().iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                throw null;
            }
        }
        return pVarG;
    }

    protected p6.p l(d0 d0Var, JavaType javaType, p6.c cVar, boolean z10) {
        p6.b0 b0VarK = d0Var.k();
        if (!z10 && javaType.c0() && (!javaType.L() || !javaType.k().S())) {
            z10 = true;
        }
        a7.h hVarC = c(b0VarK, javaType.k());
        boolean z11 = hVarC != null ? false : z10;
        p6.p pVarE = e(d0Var, cVar.s());
        if (javaType.T()) {
            MapLikeType mapLikeType = (MapLikeType) javaType;
            p6.p pVarG = g(d0Var, cVar.s());
            if (mapLikeType instanceof MapType) {
                return t(d0Var, (MapType) mapLikeType, cVar, z11, pVarG, hVarC, pVarE);
            }
            Iterator it = v().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
            p6.p pVarG2 = G(d0Var, javaType, cVar);
            if (pVarG2 == null || !this.f11619a.b()) {
                return pVarG2;
            }
            Iterator it2 = this.f11619a.d().iterator();
            if (!it2.hasNext()) {
                return pVarG2;
            }
            android.support.v4.media.session.b.a(it2.next());
            throw null;
        }
        if (!javaType.H()) {
            if (javaType.G()) {
                return h(d0Var, (ArrayType) javaType, cVar, z11, hVarC, pVarE);
            }
            return null;
        }
        CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
        if (collectionLikeType instanceof CollectionType) {
            return k(d0Var, (CollectionType) collectionLikeType, cVar, z11, hVarC, pVarE);
        }
        Iterator it3 = v().iterator();
        if (it3.hasNext()) {
            android.support.v4.media.session.b.a(it3.next());
            throw null;
        }
        p6.p pVarG3 = G(d0Var, javaType, cVar);
        if (pVarG3 == null || !this.f11619a.b()) {
            return pVarG3;
        }
        Iterator it4 = this.f11619a.d().iterator();
        if (!it4.hasNext()) {
            return pVarG3;
        }
        android.support.v4.media.session.b.a(it4.next());
        throw null;
    }

    protected p6.p n(p6.b0 b0Var, JavaType javaType, p6.c cVar) {
        k.d dVarG = cVar.g(null);
        if (dVarG.i() == k.c.OBJECT) {
            ((x6.s) cVar).O("declaringClass");
            return null;
        }
        g7.m mVarA = g7.m.A(javaType.r(), b0Var, cVar, dVarG);
        if (this.f11619a.b()) {
            Iterator it = this.f11619a.d().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        return mVarA;
    }

    public p6.p o(JavaType javaType) {
        return new g7.n(javaType);
    }

    public h p(JavaType javaType, boolean z10, a7.h hVar, p6.p pVar) {
        return new f7.e(javaType, z10, hVar, pVar);
    }

    protected p6.p q(p6.b0 b0Var, JavaType javaType, p6.c cVar, boolean z10, JavaType javaType2) {
        return new g7.r(javaType2, z10, c(b0Var, javaType2));
    }

    protected p6.p r(p6.b0 b0Var, JavaType javaType, p6.c cVar, boolean z10, JavaType javaType2) {
        return new f7.g(javaType2, z10, c(b0Var, javaType2));
    }

    protected p6.p s(d0 d0Var, JavaType javaType, p6.c cVar, boolean z10, JavaType javaType2, JavaType javaType3) {
        Object objB = null;
        if (k.d.q(cVar.g(null), d0Var.m0(Map.Entry.class)).i() == k.c.OBJECT) {
            return null;
        }
        f7.h hVar = new f7.h(javaType3, javaType2, javaType3, z10, c(d0Var.k(), javaType3), null);
        JavaType javaTypeD = hVar.D();
        r.b bVarF = f(d0Var, cVar, javaTypeD, Map.Entry.class);
        r.a aVarF = bVarF == null ? r.a.USE_DEFAULTS : bVarF.f();
        if (aVarF == r.a.USE_DEFAULTS || aVarF == r.a.ALWAYS) {
            return hVar;
        }
        int i10 = a.f11621b[aVarF.ordinal()];
        boolean zW0 = true;
        if (i10 == 1) {
            objB = i7.e.b(javaTypeD);
            if (objB != null && objB.getClass().isArray()) {
                objB = i7.c.a(objB);
            }
        } else if (i10 != 2) {
            if (i10 == 3) {
                objB = g7.t.B;
            } else if (i10 == 4 && (objB = d0Var.v0(null, bVarF.e())) != null) {
                zW0 = d0Var.w0(objB);
            }
        } else if (javaTypeD.b()) {
            objB = g7.t.B;
        }
        return hVar.N(objB, zW0);
    }

    protected p6.p t(d0 d0Var, MapType mapType, p6.c cVar, boolean z10, p6.p pVar, a7.h hVar, p6.p pVar2) {
        if (cVar.g(null).i() == k.c.OBJECT) {
            return null;
        }
        p6.b0 b0VarK = d0Var.k();
        Iterator it = v().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        p6.p pVarG = G(d0Var, mapType, cVar);
        if (pVarG == null) {
            Object objZ = z(b0VarK, cVar);
            p.a aVarC0 = b0VarK.c0(Map.class, cVar.s());
            Set setH = aVarC0 == null ? null : aVarC0.h();
            s.a aVarE0 = b0VarK.e0(Map.class, cVar.s());
            pVarG = d(d0Var, cVar, g7.t.Q(setH, aVarE0 == null ? null : aVarE0.e(), mapType, z10, hVar, pVar, pVar2, objZ));
        }
        if (this.f11619a.b()) {
            Iterator it2 = this.f11619a.d().iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                throw null;
            }
        }
        return pVarG;
    }

    protected abstract Iterable v();

    protected i7.j w(d0 d0Var, x6.b bVar) {
        Object objH0 = d0Var.i0().h0(bVar);
        if (objH0 == null) {
            return null;
        }
        return d0Var.j(bVar, objH0);
    }

    protected p6.p x(d0 d0Var, x6.b bVar, p6.p pVar) {
        i7.j jVarW = w(d0Var, bVar);
        return jVarW == null ? pVar : new g7.d0(jVarW, jVarW.b(d0Var.l()), pVar);
    }

    protected Object z(p6.b0 b0Var, p6.c cVar) {
        return b0Var.g().r(cVar.s());
    }
}
