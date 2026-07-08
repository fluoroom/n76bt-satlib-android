package s6;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import d6.b;
import d6.b0;
import d6.h;
import d6.j0;
import i7.z;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;
import p6.d;
import p6.y;
import r6.i;
import u6.f0;
import u6.i0;
import u6.k0;
import u6.m0;
import u6.o0;
import x6.h0;
import x6.l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends n implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class f26885c = Object.class;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Class f26886d = String.class;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Class f26887e = CharSequence.class;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Class f26888f = Iterable.class;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Class f26889g = Map.Entry.class;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Class f26890h = Serializable.class;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected static final y f26891r = new y("@JsonUnwrapped");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final r6.m f26892b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f26894b;

        static {
            int[] iArr = new int[i.a.values().length];
            f26894b = iArr;
            try {
                iArr[i.a.DELEGATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26894b[i.a.PROPERTIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26894b[i.a.REQUIRE_MODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26894b[i.a.HEURISTIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[h.a.values().length];
            f26893a = iArr2;
            try {
                iArr2[h.a.DELEGATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26893a[h.a.PROPERTIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26893a[h.a.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: s6.b$b, reason: collision with other inner class name */
    protected static class C0369b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final HashMap f26895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final HashMap f26896b;

        static {
            HashMap map = new HashMap();
            map.put(Collection.class.getName(), ArrayList.class);
            map.put(List.class.getName(), ArrayList.class);
            map.put(Set.class.getName(), HashSet.class);
            map.put(SortedSet.class.getName(), TreeSet.class);
            map.put(Queue.class.getName(), LinkedList.class);
            map.put(AbstractList.class.getName(), ArrayList.class);
            map.put(AbstractSet.class.getName(), HashSet.class);
            map.put(Deque.class.getName(), LinkedList.class);
            map.put(NavigableSet.class.getName(), TreeSet.class);
            f26895a = map;
            HashMap map2 = new HashMap();
            map2.put(Map.class.getName(), LinkedHashMap.class);
            map2.put(AbstractMap.class.getName(), LinkedHashMap.class);
            map2.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
            map2.put(SortedMap.class.getName(), TreeMap.class);
            map2.put(NavigableMap.class.getName(), TreeMap.class);
            map2.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
            f26896b = map2;
        }

        public static Class a(JavaType javaType) {
            return (Class) f26895a.get(javaType.r().getName());
        }

        public static Class b(JavaType javaType) {
            return (Class) f26896b.get(javaType.r().getName());
        }
    }

    protected static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p6.h f26897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p6.c f26898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l0 f26899c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final t6.e f26900d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Map f26901e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f26902f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f26903g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List f26904h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f26905i;

        public c(p6.h hVar, p6.c cVar, l0 l0Var, t6.e eVar, Map map) {
            this.f26897a = hVar;
            this.f26898b = cVar;
            this.f26899c = l0Var;
            this.f26900d = eVar;
            this.f26901e = map;
        }

        public void a(t6.d dVar) {
            if (this.f26904h == null) {
                this.f26904h = new LinkedList();
            }
            this.f26904h.add(dVar);
        }

        public void b(t6.d dVar) {
            if (this.f26902f == null) {
                this.f26902f = new LinkedList();
            }
            this.f26902f.add(dVar);
        }

        public p6.b c() {
            return this.f26897a.Z();
        }

        public boolean d() {
            return this.f26905i > 0;
        }

        public boolean e() {
            return this.f26903g > 0;
        }

        public boolean f() {
            return this.f26904h != null;
        }

        public boolean g() {
            return this.f26902f != null;
        }

        public List h() {
            return this.f26904h;
        }

        public List i() {
            return this.f26902f;
        }

        public void j() {
            this.f26905i++;
        }

        public void k() {
            this.f26903g++;
        }
    }

    protected b(r6.m mVar) {
        this.f26892b = mVar;
    }

    private p6.q C(p6.h hVar, JavaType javaType) {
        p6.g gVarK = hVar.k();
        Class clsR = javaType.r();
        p6.c cVarU0 = gVarK.u0(javaType);
        p6.q qVarM0 = m0(hVar, cVarU0.s());
        if (qVarM0 != null) {
            return qVarM0;
        }
        p6.l lVarN = N(clsR, gVarK, cVarU0);
        if (lVarN != null) {
            return f0.f(gVarK, javaType, lVarN);
        }
        p6.l lVarL0 = l0(hVar, cVarU0.s());
        if (lVarL0 != null) {
            return f0.f(gVarK, javaType, lVarL0);
        }
        i7.k kVarI0 = i0(clsR, gVarK, cVarU0);
        i7.k kVarH0 = h0(gVarK, clsR, cVarU0.s());
        for (x6.l lVar : cVarU0.v()) {
            if (Z(hVar, lVar)) {
                if (lVar.x() != 1 || !lVar.L().isAssignableFrom(clsR)) {
                    throw new IllegalArgumentException("Unsuitable method (" + lVar + ") decorated with @JsonCreator (for Enum type " + clsR.getName() + ")");
                }
                if (lVar.A(0) == String.class) {
                    if (gVarK.b()) {
                        i7.h.g(lVar.n(), hVar.E0(p6.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return f0.h(kVarI0, lVar, kVarH0);
                }
            }
        }
        return f0.g(kVarI0, kVarH0);
    }

    private y T(x6.o oVar, p6.b bVar) {
        if (bVar == null) {
            return null;
        }
        y yVarC = bVar.C(oVar);
        if (yVarC != null && !yVarC.h()) {
            return yVarC;
        }
        String strT = bVar.t(oVar);
        if (strT == null || strT.isEmpty()) {
            return null;
        }
        return y.a(strT);
    }

    private JavaType c0(p6.g gVar, JavaType javaType) {
        javaType.r();
        if (this.f26892b.d()) {
            Iterator it = this.f26892b.a().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        return null;
    }

    private boolean x(p6.c cVar, p6.b bVar, x6.p pVar, x6.u uVar) {
        if (uVar != null && uVar.J()) {
            return true;
        }
        if (cVar.j() != null) {
            return false;
        }
        if (bVar.v(pVar.v(0)) != null) {
            return true;
        }
        if (uVar != null) {
            String name = uVar.getName();
            if (name != null && !name.isEmpty() && uVar.i()) {
                return true;
            }
            if (!uVar.J() && cVar.D()) {
                return true;
            }
        }
        return false;
    }

    private void z(p6.h hVar, p6.c cVar, l0 l0Var, p6.b bVar, t6.e eVar, List list) {
        int i10;
        Iterator it = list.iterator();
        x6.p pVar = null;
        x6.p pVar2 = null;
        u[] uVarArr = null;
        while (true) {
            if (!it.hasNext()) {
                pVar = pVar2;
                break;
            }
            x6.p pVar3 = (x6.p) it.next();
            if (l0Var.a(pVar3)) {
                int iX = pVar3.x();
                u[] uVarArr2 = new u[iX];
                int i11 = 0;
                while (true) {
                    if (i11 < iX) {
                        x6.o oVarV = pVar3.v(i11);
                        y yVarT = T(oVarV, bVar);
                        if (yVarT == null || yVarT.h()) {
                            break;
                        }
                        uVarArr2[i11] = g0(hVar, cVar, yVarT, oVarV.r(), oVarV, null);
                        i11++;
                    } else {
                        if (pVar2 != null) {
                            break;
                        }
                        pVar2 = pVar3;
                        uVarArr = uVarArr2;
                    }
                }
            }
        }
        if (pVar != null) {
            eVar.l(pVar, false, uVarArr);
            x6.s sVar = (x6.s) cVar;
            for (u uVar : uVarArr) {
                y yVarA = uVar.a();
                if (!sVar.M(yVarA)) {
                    sVar.G(z.L(hVar.k(), uVar.h(), yVarA));
                }
            }
        }
    }

    protected w A(p6.h hVar, p6.c cVar) throws p6.m {
        p6.g gVarK = hVar.k();
        l0 l0VarV = gVarK.v(cVar.q(), cVar.s());
        r6.i iVarO0 = gVarK.o0();
        c cVar2 = new c(hVar, cVar, l0VarV, new t6.e(cVar, gVarK), D(hVar, cVar));
        s(hVar, cVar2, !iVarO0.a());
        if (cVar.z().K() && !cVar.C()) {
            q(hVar, cVar2, iVarO0.b(cVar.q()));
            if (cVar2.f() && !cVar2.d()) {
                v(hVar, cVar2, cVar2.h());
            }
        }
        if (cVar2.g() && !cVar2.e() && !cVar2.d()) {
            w(hVar, cVar2, cVar2.i());
        }
        return cVar2.f26900d.n(hVar);
    }

    protected Map D(p6.h hVar, p6.c cVar) throws v6.b {
        Map linkedHashMap = Collections.EMPTY_MAP;
        for (x6.u uVar : cVar.n()) {
            Iterator itS = uVar.s();
            while (itS.hasNext()) {
                x6.o oVar = (x6.o) itS.next();
                x6.p pVarS = oVar.s();
                x6.u[] uVarArr = (x6.u[]) linkedHashMap.get(pVarS);
                int iR = oVar.r();
                if (uVarArr == null) {
                    if (linkedHashMap.isEmpty()) {
                        linkedHashMap = new LinkedHashMap();
                    }
                    uVarArr = new x6.u[pVarS.x()];
                    linkedHashMap.put(pVarS, uVarArr);
                } else if (uVarArr[iR] != null) {
                    hVar.O0(cVar, "Conflict: parameter #%d of %s bound to more than one property; %s vs %s", Integer.valueOf(iR), pVarS, uVarArr[iR], uVar);
                }
                uVarArr[iR] = uVar;
            }
        }
        return linkedHashMap;
    }

    protected p6.l G(ArrayType arrayType, p6.g gVar, p6.c cVar, a7.e eVar, p6.l lVar) {
        Iterator it = this.f26892b.c().iterator();
        while (it.hasNext()) {
            ArrayType arrayType2 = arrayType;
            p6.g gVar2 = gVar;
            p6.c cVar2 = cVar;
            a7.e eVar2 = eVar;
            p6.l lVar2 = lVar;
            p6.l lVarE = ((o) it.next()).e(arrayType2, gVar2, cVar2, eVar2, lVar2);
            if (lVarE != null) {
                return lVarE;
            }
            arrayType = arrayType2;
            gVar = gVar2;
            cVar = cVar2;
            eVar = eVar2;
            lVar = lVar2;
        }
        return null;
    }

    protected p6.l H(JavaType javaType, p6.g gVar, p6.c cVar) {
        Iterator it = this.f26892b.c().iterator();
        while (it.hasNext()) {
            p6.l lVarC = ((o) it.next()).c(javaType, gVar, cVar);
            if (lVarC != null) {
                return lVarC;
            }
        }
        return null;
    }

    protected p6.l K(CollectionType collectionType, p6.g gVar, p6.c cVar, a7.e eVar, p6.l lVar) {
        Iterator it = this.f26892b.c().iterator();
        while (it.hasNext()) {
            CollectionType collectionType2 = collectionType;
            p6.g gVar2 = gVar;
            p6.c cVar2 = cVar;
            a7.e eVar2 = eVar;
            p6.l lVar2 = lVar;
            p6.l lVarA = ((o) it.next()).a(collectionType2, gVar2, cVar2, eVar2, lVar2);
            if (lVarA != null) {
                return lVarA;
            }
            collectionType = collectionType2;
            gVar = gVar2;
            cVar = cVar2;
            eVar = eVar2;
            lVar = lVar2;
        }
        return null;
    }

    protected p6.l L(CollectionLikeType collectionLikeType, p6.g gVar, p6.c cVar, a7.e eVar, p6.l lVar) {
        Iterator it = this.f26892b.c().iterator();
        while (it.hasNext()) {
            CollectionLikeType collectionLikeType2 = collectionLikeType;
            p6.g gVar2 = gVar;
            p6.c cVar2 = cVar;
            a7.e eVar2 = eVar;
            p6.l lVar2 = lVar;
            p6.l lVarG = ((o) it.next()).g(collectionLikeType2, gVar2, cVar2, eVar2, lVar2);
            if (lVarG != null) {
                return lVarG;
            }
            collectionLikeType = collectionLikeType2;
            gVar = gVar2;
            cVar = cVar2;
            eVar = eVar2;
            lVar = lVar2;
        }
        return null;
    }

    protected p6.l N(Class cls, p6.g gVar, p6.c cVar) {
        Iterator it = this.f26892b.c().iterator();
        while (it.hasNext()) {
            p6.l lVarB = ((o) it.next()).b(cls, gVar, cVar);
            if (lVarB != null) {
                return lVarB;
            }
        }
        return null;
    }

    protected p6.l O(MapType mapType, p6.g gVar, p6.c cVar, p6.q qVar, a7.e eVar, p6.l lVar) {
        Iterator it = this.f26892b.c().iterator();
        while (it.hasNext()) {
            MapType mapType2 = mapType;
            p6.g gVar2 = gVar;
            p6.c cVar2 = cVar;
            p6.q qVar2 = qVar;
            a7.e eVar2 = eVar;
            p6.l lVar2 = lVar;
            p6.l lVarH = ((o) it.next()).h(mapType2, gVar2, cVar2, qVar2, eVar2, lVar2);
            if (lVarH != null) {
                return lVarH;
            }
            mapType = mapType2;
            gVar = gVar2;
            cVar = cVar2;
            qVar = qVar2;
            eVar = eVar2;
            lVar = lVar2;
        }
        return null;
    }

    protected p6.l Q(MapLikeType mapLikeType, p6.g gVar, p6.c cVar, p6.q qVar, a7.e eVar, p6.l lVar) {
        Iterator it = this.f26892b.c().iterator();
        while (it.hasNext()) {
            MapLikeType mapLikeType2 = mapLikeType;
            p6.g gVar2 = gVar;
            p6.c cVar2 = cVar;
            p6.q qVar2 = qVar;
            a7.e eVar2 = eVar;
            p6.l lVar2 = lVar;
            p6.l lVarI = ((o) it.next()).i(mapLikeType2, gVar2, cVar2, qVar2, eVar2, lVar2);
            if (lVarI != null) {
                return lVarI;
            }
            mapLikeType = mapLikeType2;
            gVar = gVar2;
            cVar = cVar2;
            qVar = qVar2;
            eVar = eVar2;
            lVar = lVar2;
        }
        return null;
    }

    protected p6.l R(ReferenceType referenceType, p6.g gVar, p6.c cVar, a7.e eVar, p6.l lVar) {
        Iterator it = this.f26892b.c().iterator();
        while (it.hasNext()) {
            ReferenceType referenceType2 = referenceType;
            p6.g gVar2 = gVar;
            p6.c cVar2 = cVar;
            a7.e eVar2 = eVar;
            p6.l lVar2 = lVar;
            p6.l lVarD = ((o) it.next()).d(referenceType2, gVar2, cVar2, eVar2, lVar2);
            if (lVarD != null) {
                return lVarD;
            }
            referenceType = referenceType2;
            gVar = gVar2;
            cVar = cVar2;
            eVar = eVar2;
            lVar = lVar2;
        }
        return null;
    }

    protected p6.l S(Class cls, p6.g gVar, p6.c cVar) {
        Iterator it = this.f26892b.c().iterator();
        while (it.hasNext()) {
            p6.l lVarF = ((o) it.next()).f(cls, gVar, cVar);
            if (lVarF != null) {
                return lVarF;
            }
        }
        return null;
    }

    protected JavaType W(p6.g gVar, Class cls) {
        JavaType javaTypeN = n(gVar, gVar.e(cls));
        if (javaTypeN == null || javaTypeN.C(cls)) {
            return null;
        }
        return javaTypeN;
    }

    protected p6.x X(p6.h hVar, p6.d dVar, p6.x xVar) {
        j0 j0VarF;
        b0.a aVarM0;
        p6.b bVarZ = hVar.Z();
        p6.g gVarK = hVar.k();
        x6.k kVarH = dVar.h();
        j0 j0VarG = null;
        if (kVarH != null) {
            if (bVarZ == null || (aVarM0 = bVarZ.m0(kVarH)) == null) {
                j0VarF = null;
            } else {
                j0VarG = aVarM0.g();
                j0VarF = aVarM0.f();
            }
            b0.a aVarH = gVarK.j(dVar.getType().r()).h();
            if (aVarH != null) {
                if (j0VarG == null) {
                    j0VarG = aVarH.g();
                }
                if (j0VarF == null) {
                    j0VarF = aVarH.f();
                }
            }
        } else {
            j0VarF = null;
        }
        b0.a aVarS = gVarK.s();
        if (j0VarG == null) {
            j0VarG = aVarS.g();
        }
        if (j0VarF == null) {
            j0VarF = aVarS.f();
        }
        return (j0VarG == null && j0VarF == null) ? xVar : xVar.j(j0VarG, j0VarF);
    }

    protected boolean Y(t6.e eVar, x6.p pVar, boolean z10, boolean z11) {
        Class clsA = pVar.A(0);
        if (clsA == String.class || clsA == f26887e) {
            if (z10 || z11) {
                eVar.m(pVar, z10);
            }
            return true;
        }
        if (clsA == Integer.TYPE || clsA == Integer.class) {
            if (z10 || z11) {
                eVar.j(pVar, z10);
            }
            return true;
        }
        if (clsA == Long.TYPE || clsA == Long.class) {
            if (z10 || z11) {
                eVar.k(pVar, z10);
            }
            return true;
        }
        if (clsA == Double.TYPE || clsA == Double.class) {
            if (z10 || z11) {
                eVar.i(pVar, z10);
            }
            return true;
        }
        if (clsA == Boolean.TYPE || clsA == Boolean.class) {
            if (z10 || z11) {
                eVar.g(pVar, z10);
            }
            return true;
        }
        if (clsA == BigInteger.class && (z10 || z11)) {
            eVar.f(pVar, z10);
        }
        if (clsA == BigDecimal.class && (z10 || z11)) {
            eVar.e(pVar, z10);
        }
        if (!z10) {
            return false;
        }
        eVar.h(pVar, z10, null, 0);
        return true;
    }

    protected boolean Z(p6.h hVar, x6.b bVar) {
        h.a aVarH;
        p6.b bVarZ = hVar.Z();
        return (bVarZ == null || (aVarH = bVarZ.h(hVar.k(), bVar)) == null || aVarH == h.a.DISABLED) ? false : true;
    }

    @Override // s6.n
    public p6.l a(p6.h hVar, ArrayType arrayType, p6.c cVar) throws p6.m {
        p6.g gVarK = hVar.k();
        JavaType javaTypeK = arrayType.k();
        p6.l lVar = (p6.l) javaTypeK.w();
        a7.e eVarL = (a7.e) javaTypeK.v();
        if (eVarL == null) {
            eVarL = l(gVarK, javaTypeK);
        }
        a7.e eVar = eVarL;
        p6.l lVarG = G(arrayType, gVarK, cVar, eVar, lVar);
        if (lVarG == null) {
            if (lVar == null) {
                Class clsR = javaTypeK.r();
                if (javaTypeK.W()) {
                    return u6.y.g1(clsR);
                }
                if (clsR == String.class) {
                    return i0.f28251s;
                }
            }
            lVarG = new u6.x(arrayType, lVar, eVar);
        }
        if (this.f26892b.e()) {
            Iterator it = this.f26892b.b().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        return lVarG;
    }

    protected CollectionType a0(JavaType javaType, p6.g gVar) {
        Class clsA = C0369b.a(javaType);
        if (clsA != null) {
            return (CollectionType) gVar.D().Q(javaType, clsA, true);
        }
        return null;
    }

    protected MapType b0(JavaType javaType, p6.g gVar) {
        Class clsB = C0369b.b(javaType);
        if (clsB != null) {
            return (MapType) gVar.D().Q(javaType, clsB, true);
        }
        return null;
    }

    @Override // s6.n
    public p6.l d(p6.h hVar, CollectionType collectionType, p6.c cVar) throws p6.m {
        JavaType javaTypeK = collectionType.k();
        p6.l lVar = (p6.l) javaTypeK.w();
        p6.g gVarK = hVar.k();
        a7.e eVarL = (a7.e) javaTypeK.v();
        if (eVarL == null) {
            eVarL = l(gVarK, javaTypeK);
        }
        CollectionType collectionType2 = collectionType;
        p6.c cVarW0 = cVar;
        a7.e eVar = eVarL;
        p6.l lVarK = K(collectionType2, gVarK, cVarW0, eVar, lVar);
        if (lVarK == null) {
            Class clsR = collectionType2.r();
            if (lVar == null && EnumSet.class.isAssignableFrom(clsR)) {
                lVarK = new u6.n(javaTypeK, null);
            }
        }
        if (lVarK == null) {
            if (collectionType2.R() || collectionType2.D()) {
                CollectionType collectionTypeA0 = a0(collectionType2, gVarK);
                if (collectionTypeA0 != null) {
                    cVarW0 = gVarK.w0(collectionTypeA0);
                    collectionType2 = collectionTypeA0;
                } else {
                    if (collectionType2.v() == null) {
                        throw new IllegalArgumentException("Cannot find a deserializer for non-concrete Collection type " + collectionType2);
                    }
                    lVarK = s6.a.x(cVarW0);
                }
            }
            if (lVarK == null) {
                w wVarQ0 = q0(hVar, cVarW0);
                if (!wVarQ0.j()) {
                    if (collectionType2.C(ArrayBlockingQueue.class)) {
                        return new u6.a(collectionType2, lVar, eVar, wVarQ0);
                    }
                    p6.l lVarH = t6.l.h(hVar, collectionType2);
                    if (lVarH != null) {
                        return lVarH;
                    }
                }
                lVarK = javaTypeK.C(String.class) ? new u6.j0(collectionType2, lVar, wVarQ0) : new u6.i(collectionType2, lVar, eVar, wVarQ0);
            }
        }
        if (this.f26892b.e()) {
            Iterator it = this.f26892b.b().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        return lVarK;
    }

    protected void d0(p6.h hVar, p6.c cVar, x6.o oVar) throws v6.b {
        hVar.O0(cVar, "Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported", Integer.valueOf(oVar.r()));
    }

    @Override // s6.n
    public p6.l e(p6.h hVar, CollectionLikeType collectionLikeType, p6.c cVar) throws p6.m {
        JavaType javaTypeK = collectionLikeType.k();
        p6.l lVar = (p6.l) javaTypeK.w();
        p6.g gVarK = hVar.k();
        a7.e eVarL = (a7.e) javaTypeK.v();
        if (eVarL == null) {
            eVarL = l(gVarK, javaTypeK);
        }
        p6.l lVarL = L(collectionLikeType, gVarK, cVar, eVarL, lVar);
        if (lVarL == null || !this.f26892b.e()) {
            return lVarL;
        }
        Iterator it = this.f26892b.b().iterator();
        if (!it.hasNext()) {
            return lVarL;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    protected void e0(p6.h hVar, p6.c cVar, t6.d dVar, int i10, y yVar, b.a aVar) throws v6.b {
        if (yVar == null && aVar == null) {
            hVar.O0(cVar, "Argument #%d of constructor %s has no property name (and is not Injectable): can not use as property-based Creator", Integer.valueOf(i10), dVar);
        }
    }

    @Override // s6.n
    public p6.l f(p6.h hVar, JavaType javaType, p6.c cVar) throws p6.m {
        p6.g gVarK = hVar.k();
        Class clsR = javaType.r();
        p6.l lVarN = N(clsR, gVarK, cVar);
        if (lVarN == null) {
            if (clsR == Enum.class) {
                return s6.a.x(cVar);
            }
            w wVarA = A(hVar, cVar);
            u[] uVarArrO = wVarA == null ? null : wVarA.O(hVar.k());
            Iterator it = cVar.v().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                x6.l lVar = (x6.l) it.next();
                if (Z(hVar, lVar)) {
                    if (lVar.x() == 0) {
                        lVarN = u6.l.m1(gVarK, clsR, lVar);
                    } else {
                        if (!lVar.L().isAssignableFrom(clsR)) {
                            hVar.q(javaType, String.format("Invalid `@JsonCreator` annotated Enum factory method [%s]: needs to return compatible type", lVar.toString()));
                        }
                        lVarN = u6.l.l1(gVarK, clsR, lVar, wVarA, uVarArrO);
                    }
                }
            }
            if (lVarN == null) {
                lVarN = new u6.l(i0(clsR, gVarK, cVar), gVarK.L(p6.r.ACCEPT_CASE_INSENSITIVE_ENUMS), h0(gVarK, clsR, cVar.s()));
            }
        }
        if (this.f26892b.e()) {
            Iterator it2 = this.f26892b.b().iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                throw null;
            }
        }
        return lVarN;
    }

    public w f0(p6.g gVar, x6.b bVar, Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof w) {
            return (w) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
        }
        Class cls = (Class) obj;
        if (i7.h.J(cls)) {
            return null;
        }
        if (w.class.isAssignableFrom(cls)) {
            gVar.w();
            return (w) i7.h.l(cls, gVar.b());
        }
        throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<ValueInstantiator>");
    }

    @Override // s6.n
    public p6.q g(p6.h hVar, JavaType javaType) {
        p6.c cVarH;
        p6.q qVarM0;
        p6.g gVarK = hVar.k();
        if (this.f26892b.f()) {
            cVarH = gVarK.G(javaType);
            Iterator it = this.f26892b.h().iterator();
            qVarM0 = null;
            while (it.hasNext() && (qVarM0 = ((p) it.next()).a(javaType, gVarK, cVarH)) == null) {
            }
        } else {
            cVarH = null;
            qVarM0 = null;
        }
        if (qVarM0 == null) {
            if (cVarH == null) {
                cVarH = gVarK.H(javaType.r());
            }
            qVarM0 = m0(hVar, cVarH.s());
            if (qVarM0 == null) {
                qVarM0 = javaType.O() ? C(hVar, javaType) : f0.i(gVarK, javaType);
            }
        }
        if (qVarM0 == null || !this.f26892b.e()) {
            return qVarM0;
        }
        Iterator it2 = this.f26892b.b().iterator();
        if (!it2.hasNext()) {
            return qVarM0;
        }
        android.support.v4.media.session.b.a(it2.next());
        throw null;
    }

    protected u g0(p6.h hVar, p6.c cVar, y yVar, int i10, x6.o oVar, b.a aVar) throws p6.m {
        y yVarT0;
        p6.x xVar;
        p6.g gVarK = hVar.k();
        p6.b bVarZ = hVar.Z();
        if (bVarZ == null) {
            xVar = p6.x.f24069s;
            yVarT0 = null;
        } else {
            p6.x xVarA = p6.x.a(bVarZ.C0(oVar), bVarZ.W(oVar), bVarZ.b0(oVar), bVarZ.T(oVar));
            yVarT0 = bVarZ.t0(oVar);
            xVar = xVarA;
        }
        JavaType javaTypeR0 = r0(hVar, oVar, oVar.f());
        d.a aVar2 = new d.a(yVar, javaTypeR0, yVarT0, oVar, xVar);
        a7.e eVarL = (a7.e) javaTypeR0.v();
        if (eVarL == null) {
            eVarL = l(gVarK, javaTypeR0);
        }
        j jVarB0 = j.b0(yVar, javaTypeR0, aVar2.b(), eVarL, cVar.r(), oVar, i10, aVar, X(hVar, aVar2, xVar));
        p6.l lVarL0 = l0(hVar, oVar);
        if (lVarL0 == null) {
            lVarL0 = (p6.l) javaTypeR0.w();
        }
        return lVarL0 != null ? jVarB0.Y(hVar.o0(lVarL0, jVarB0, javaTypeR0)) : jVarB0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Type inference failed for: r9v0, types: [p6.l] */
    /* JADX WARN: Type inference failed for: r9v1, types: [p6.l] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [u6.t] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // s6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p6.l h(p6.h r18, com.fasterxml.jackson.databind.type.MapType r19, p6.c r20) throws p6.m {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.b.h(p6.h, com.fasterxml.jackson.databind.type.MapType, p6.c):p6.l");
    }

    protected i7.k h0(p6.g gVar, Class cls, x6.d dVar) {
        x6.z.a(gVar.g().p(gVar, dVar), gVar.b());
        return null;
    }

    @Override // s6.n
    public p6.l i(p6.h hVar, MapLikeType mapLikeType, p6.c cVar) throws p6.m {
        JavaType javaTypeQ = mapLikeType.q();
        JavaType javaTypeK = mapLikeType.k();
        p6.g gVarK = hVar.k();
        p6.l lVar = (p6.l) javaTypeK.w();
        p6.q qVar = (p6.q) javaTypeQ.w();
        a7.e eVarL = (a7.e) javaTypeK.v();
        if (eVarL == null) {
            eVarL = l(gVarK, javaTypeK);
        }
        p6.l lVarQ = Q(mapLikeType, gVarK, cVar, qVar, eVarL, lVar);
        if (lVarQ == null || !this.f26892b.e()) {
            return lVarQ;
        }
        Iterator it = this.f26892b.b().iterator();
        if (!it.hasNext()) {
            return lVarQ;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    protected i7.k i0(Class cls, p6.g gVar, p6.c cVar) {
        x6.k kVarJ = cVar.j();
        if (kVarJ == null) {
            return i7.k.j(gVar, cls);
        }
        if (gVar.b()) {
            i7.h.g(kVarJ.n(), gVar.L(p6.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return i7.k.n(gVar, cls, kVarJ);
    }

    @Override // s6.n
    public p6.l j(p6.h hVar, ReferenceType referenceType, p6.c cVar) throws p6.m {
        JavaType javaTypeK = referenceType.k();
        p6.l lVar = (p6.l) javaTypeK.w();
        p6.g gVarK = hVar.k();
        a7.e eVarL = (a7.e) javaTypeK.v();
        if (eVarL == null) {
            eVarL = l(gVarK, javaTypeK);
        }
        a7.e eVar = eVarL;
        p6.l lVarR = R(referenceType, gVarK, cVar, eVar, lVar);
        if (lVarR == null && referenceType.Z(AtomicReference.class)) {
            return new u6.e(referenceType, referenceType.r() != AtomicReference.class ? q0(hVar, cVar) : null, eVar, lVar);
        }
        if (lVarR == null || !this.f26892b.e()) {
            return lVarR;
        }
        Iterator it = this.f26892b.b().iterator();
        if (!it.hasNext()) {
            return lVarR;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    protected p6.l j0(p6.h hVar, x6.b bVar) {
        Object objF;
        p6.b bVarZ = hVar.Z();
        if (bVarZ == null || (objF = bVarZ.f(bVar)) == null) {
            return null;
        }
        return hVar.H(bVar, objF);
    }

    @Override // s6.n
    public p6.l k(p6.g gVar, JavaType javaType, p6.c cVar) {
        Class clsR = javaType.r();
        p6.l lVarS = S(clsR, gVar, cVar);
        return lVarS != null ? lVarS : u6.s.s1(clsR);
    }

    public p6.l k0(p6.h hVar, JavaType javaType, p6.c cVar) {
        JavaType javaTypeW;
        JavaType javaTypeW2;
        Class clsR = javaType.r();
        if (clsR == f26885c || clsR == f26890h) {
            p6.g gVarK = hVar.k();
            if (this.f26892b.d()) {
                javaTypeW = W(gVarK, List.class);
                javaTypeW2 = W(gVarK, Map.class);
            } else {
                javaTypeW = null;
                javaTypeW2 = null;
            }
            return new o0(javaTypeW, javaTypeW2);
        }
        if (clsR == f26886d || clsR == f26887e) {
            return k0.f28269e;
        }
        Class cls = f26888f;
        if (clsR == cls) {
            com.fasterxml.jackson.databind.type.c cVarL = hVar.l();
            JavaType[] javaTypeArrX = cVarL.X(javaType, cls);
            return d(hVar, cVarL.C(Collection.class, (javaTypeArrX == null || javaTypeArrX.length != 1) ? com.fasterxml.jackson.databind.type.c.b0() : javaTypeArrX[0]), cVar);
        }
        if (clsR == f26889g) {
            JavaType javaTypeH = javaType.h(0);
            JavaType javaTypeH2 = javaType.h(1);
            a7.e eVarL = (a7.e) javaTypeH2.v();
            if (eVarL == null) {
                eVarL = l(hVar.k(), javaTypeH2);
            }
            return new u6.u(javaType, (p6.q) javaTypeH.w(), (p6.l) javaTypeH2.w(), eVarL);
        }
        String name = clsR.getName();
        if (clsR.isPrimitive() || name.startsWith("java.")) {
            p6.l lVarA = u6.w.a(clsR, name);
            if (lVarA == null) {
                lVarA = u6.k.a(clsR, name);
            }
            if (lVarA != null) {
                return lVarA;
            }
        }
        if (clsR == i7.b0.class) {
            return new m0();
        }
        p6.l lVarN0 = n0(hVar, javaType, cVar);
        return lVarN0 != null ? lVarN0 : u6.q.a(hVar, clsR, name);
    }

    @Override // s6.n
    public a7.e l(p6.g gVar, JavaType javaType) throws p6.m {
        JavaType javaTypeN;
        x6.d dVarS = gVar.H(javaType.r()).s();
        a7.g gVarP0 = gVar.g().p0(gVar, dVarS, javaType);
        if (gVarP0 == null && (gVarP0 = gVar.t(javaType)) == null) {
            return null;
        }
        Collection collectionC = gVar.h0().c(gVar, dVarS);
        if (gVarP0.i() == null && javaType.D() && (javaTypeN = n(gVar, javaType)) != null && !javaTypeN.C(javaType.r())) {
            gVarP0 = gVarP0.f(javaTypeN.r());
        }
        try {
            return gVarP0.b(gVar, javaType, collectionC);
        } catch (IllegalArgumentException | IllegalStateException e10) {
            throw v6.b.x(null, i7.h.o(e10), javaType).q(e10);
        }
    }

    protected p6.l l0(p6.h hVar, x6.b bVar) {
        Object objN;
        p6.b bVarZ = hVar.Z();
        if (bVarZ == null || (objN = bVarZ.n(bVar)) == null) {
            return null;
        }
        return hVar.H(bVar, objN);
    }

    protected p6.q m0(p6.h hVar, x6.b bVar) {
        Object objX;
        p6.b bVarZ = hVar.Z();
        if (bVarZ == null || (objX = bVarZ.x(bVar)) == null) {
            return null;
        }
        return hVar.G0(bVar, objX);
    }

    @Override // s6.n
    public JavaType n(p6.g gVar, JavaType javaType) {
        JavaType javaTypeC0;
        while (true) {
            javaTypeC0 = c0(gVar, javaType);
            if (javaTypeC0 == null) {
                return javaType;
            }
            Class clsR = javaType.r();
            Class<?> clsR2 = javaTypeC0.r();
            if (clsR == clsR2 || !clsR.isAssignableFrom(clsR2)) {
                break;
            }
            javaType = javaTypeC0;
        }
        throw new IllegalArgumentException("Invalid abstract type resolution from " + javaType + " to " + javaTypeC0 + ": latter is not a subtype of former");
    }

    protected p6.l n0(p6.h hVar, JavaType javaType, p6.c cVar) {
        return w6.k.f31324f.b(javaType, hVar.k(), cVar);
    }

    @Override // s6.n
    public final n o(o oVar) {
        return s0(this.f26892b.j(oVar));
    }

    public a7.e o0(p6.g gVar, JavaType javaType, x6.k kVar) {
        a7.g gVarS = gVar.g().S(gVar, kVar, javaType);
        JavaType javaTypeK = javaType.k();
        return gVarS == null ? l(gVar, javaTypeK) : gVarS.b(gVar, javaTypeK, gVar.h0().d(gVar, kVar, javaTypeK));
    }

    protected void p(p6.h hVar, p6.c cVar, t6.e eVar, t6.d dVar, r6.i iVar) throws v6.b {
        y yVar;
        boolean z10;
        int iE;
        if (1 != dVar.g()) {
            if (iVar.d() || (iE = dVar.e()) < 0 || !(iVar.c() || dVar.h(iE) == null)) {
                t(hVar, cVar, eVar, dVar);
                return;
            } else {
                r(hVar, cVar, eVar, dVar);
                return;
            }
        }
        x6.o oVarI = dVar.i(0);
        b.a aVarF = dVar.f(0);
        int i10 = a.f26894b[iVar.e().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                y yVarH = dVar.h(0);
                if (yVarH == null) {
                    e0(hVar, cVar, dVar, 0, yVarH, aVarF);
                }
                yVar = yVarH;
            } else {
                if (i10 == 3) {
                    hVar.O0(cVar, "Single-argument constructor (%s) is annotated but no 'mode' defined; `CreatorDetector`configured with `SingleArgConstructor.REQUIRE_MODE`", dVar.b());
                    return;
                }
                x6.u uVarJ = dVar.j(0);
                y yVarC = dVar.c(0);
                z10 = yVarC != null;
                if (!z10 && cVar.j() == null) {
                    if (aVarF != null) {
                        yVar = yVarC;
                    } else if (uVarJ != null) {
                        yVarC = dVar.h(0);
                        z10 = yVarC != null && uVarJ.i();
                    }
                }
                yVar = yVarC;
            }
            z10 = true;
        } else {
            yVar = null;
            z10 = false;
        }
        if (z10) {
            eVar.l(dVar.b(), true, new u[]{g0(hVar, cVar, yVar, 0, oVarI, aVarF)});
            return;
        }
        Y(eVar, dVar.b(), true, true);
        x6.u uVarJ2 = dVar.j(0);
        if (uVarJ2 != null) {
            ((h0) uVarJ2).x0();
        }
    }

    public a7.e p0(p6.g gVar, JavaType javaType, x6.k kVar) throws p6.m {
        a7.g gVarC0 = gVar.g().c0(gVar, kVar, javaType);
        if (gVarC0 == null) {
            return l(gVar, javaType);
        }
        try {
            return gVarC0.b(gVar, javaType, gVar.h0().d(gVar, kVar, javaType));
        } catch (IllegalArgumentException | IllegalStateException e10) {
            throw v6.b.x(null, i7.h.o(e10), javaType).q(e10);
        }
    }

    protected void q(p6.h hVar, c cVar, boolean z10) throws v6.b {
        p6.h hVar2;
        p6.c cVar2 = cVar.f26898b;
        t6.e eVar = cVar.f26900d;
        p6.b bVarC = cVar.c();
        l0 l0Var = cVar.f26899c;
        Map map = cVar.f26901e;
        x6.f fVarD = cVar2.d();
        if (fVarD != null && (!eVar.o() || Z(hVar, fVarD))) {
            eVar.r(fVarD);
        }
        for (x6.f fVar : cVar2.t()) {
            h.a aVarH = bVarC.h(hVar.k(), fVar);
            if (h.a.DISABLED != aVarH) {
                if (aVarH != null) {
                    int i10 = a.f26893a[aVarH.ordinal()];
                    if (i10 == 1) {
                        hVar2 = hVar;
                        r(hVar2, cVar2, eVar, t6.d.a(bVarC, fVar, null));
                    } else if (i10 != 2) {
                        hVar2 = hVar;
                        p(hVar2, cVar2, eVar, t6.d.a(bVarC, fVar, (x6.u[]) map.get(fVar)), hVar.k().o0());
                    } else {
                        hVar2 = hVar;
                        t(hVar2, cVar2, eVar, t6.d.a(bVarC, fVar, (x6.u[]) map.get(fVar)));
                    }
                    cVar.j();
                    hVar = hVar2;
                } else if (z10 && l0Var.a(fVar)) {
                    cVar.a(t6.d.a(bVarC, fVar, (x6.u[]) map.get(fVar)));
                }
            }
        }
    }

    public w q0(p6.h hVar, p6.c cVar) {
        p6.g gVarK = hVar.k();
        x6.d dVarS = cVar.s();
        Object objR0 = hVar.Z().r0(dVarS);
        w wVarF0 = objR0 != null ? f0(gVarK, dVarS, objR0) : null;
        if (wVarF0 == null && (wVarF0 = t6.k.a(gVarK, cVar.q())) == null) {
            wVarF0 = A(hVar, cVar);
        }
        if (this.f26892b.g()) {
            Iterator it = this.f26892b.i().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        return wVarF0 != null ? wVarF0.n(hVar, cVar) : wVarF0;
    }

    protected void r(p6.h hVar, p6.c cVar, t6.e eVar, t6.d dVar) throws v6.b {
        p6.h hVar2;
        p6.c cVar2;
        int iG = dVar.g();
        u[] uVarArr = new u[iG];
        int i10 = -1;
        int i11 = 0;
        while (i11 < iG) {
            x6.o oVarI = dVar.i(i11);
            b.a aVarF = dVar.f(i11);
            if (aVarF != null) {
                hVar2 = hVar;
                cVar2 = cVar;
                uVarArr[i11] = g0(hVar2, cVar2, null, i11, oVarI, aVarF);
            } else {
                hVar2 = hVar;
                cVar2 = cVar;
                if (i10 < 0) {
                    i10 = i11;
                } else {
                    hVar2.O0(cVar2, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", Integer.valueOf(i10), Integer.valueOf(i11), dVar);
                }
            }
            i11++;
            hVar = hVar2;
            cVar = cVar2;
        }
        p6.h hVar3 = hVar;
        p6.c cVar3 = cVar;
        if (i10 < 0) {
            hVar3.O0(cVar3, "No argument left as delegating for Creator %s: exactly one required", dVar);
        }
        if (iG != 1) {
            eVar.h(dVar.b(), true, uVarArr, i10);
            return;
        }
        Y(eVar, dVar.b(), true, true);
        x6.u uVarJ = dVar.j(0);
        if (uVarJ != null) {
            ((h0) uVarJ).x0();
        }
    }

    protected JavaType r0(p6.h hVar, x6.k kVar, JavaType javaType) {
        p6.q qVarG0;
        p6.b bVarZ = hVar.Z();
        if (bVarZ == null) {
            return javaType;
        }
        if (javaType.T() && javaType.q() != null && (qVarG0 = hVar.G0(kVar, bVarZ.x(kVar))) != null) {
            javaType = ((MapLikeType) javaType).q0(qVarG0);
            javaType.q();
        }
        if (javaType.x()) {
            p6.l lVarH = hVar.H(kVar, bVarZ.f(kVar));
            if (lVarH != null) {
                javaType = javaType.o0(lVarH);
            }
            a7.e eVarO0 = o0(hVar.k(), javaType, kVar);
            if (eVarO0 != null) {
                javaType = javaType.e0(eVarO0);
            }
        }
        a7.e eVarP0 = p0(hVar.k(), javaType, kVar);
        if (eVarP0 != null) {
            javaType = javaType.q0(eVarP0);
        }
        return bVarZ.H0(hVar.k(), kVar, javaType);
    }

    protected void s(p6.h hVar, c cVar, boolean z10) throws v6.b {
        p6.h hVar2;
        p6.c cVar2 = cVar.f26898b;
        t6.e eVar = cVar.f26900d;
        p6.b bVarC = cVar.c();
        l0 l0Var = cVar.f26899c;
        Map map = cVar.f26901e;
        for (x6.l lVar : cVar2.v()) {
            h.a aVarH = bVarC.h(hVar.k(), lVar);
            int iX = lVar.x();
            if (aVarH == null) {
                if (z10 && iX == 1 && l0Var.a(lVar)) {
                    cVar.b(t6.d.a(bVarC, lVar, null));
                }
            } else if (aVarH != h.a.DISABLED) {
                if (iX == 0) {
                    eVar.r(lVar);
                } else {
                    int i10 = a.f26893a[aVarH.ordinal()];
                    if (i10 == 1) {
                        hVar2 = hVar;
                        r(hVar2, cVar2, eVar, t6.d.a(bVarC, lVar, null));
                    } else if (i10 != 2) {
                        hVar2 = hVar;
                        p(hVar2, cVar2, eVar, t6.d.a(bVarC, lVar, (x6.u[]) map.get(lVar)), r6.i.f25527d);
                    } else {
                        hVar2 = hVar;
                        t(hVar2, cVar2, eVar, t6.d.a(bVarC, lVar, (x6.u[]) map.get(lVar)));
                    }
                    cVar.k();
                    hVar = hVar2;
                }
            }
        }
    }

    protected abstract n s0(r6.m mVar);

    protected void t(p6.h hVar, p6.c cVar, t6.e eVar, t6.d dVar) throws v6.b {
        p6.h hVar2;
        t6.d dVar2;
        p6.c cVar2;
        y yVar;
        x6.o oVar;
        b bVar;
        int iG = dVar.g();
        u[] uVarArr = new u[iG];
        int i10 = 0;
        while (i10 < iG) {
            b.a aVarF = dVar.f(i10);
            x6.o oVarI = dVar.i(i10);
            y yVarH = dVar.h(i10);
            if (yVarH == null) {
                if (hVar.Z().q0(oVarI) != null) {
                    d0(hVar, cVar, oVarI);
                }
                y yVarD = dVar.d(i10);
                bVar = this;
                hVar2 = hVar;
                cVar2 = cVar;
                t6.d dVar3 = dVar;
                bVar.e0(hVar2, cVar2, dVar3, i10, yVarD, aVarF);
                dVar2 = dVar3;
                yVar = yVarD;
                oVar = oVarI;
            } else {
                hVar2 = hVar;
                dVar2 = dVar;
                cVar2 = cVar;
                yVar = yVarH;
                oVar = oVarI;
                bVar = this;
            }
            uVarArr[i10] = bVar.g0(hVar2, cVar2, yVar, i10, oVar, aVarF);
            i10++;
            dVar = dVar2;
            hVar = hVar2;
            cVar = cVar2;
        }
        eVar.l(dVar.b(), true, uVarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [s6.b] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v2, types: [t6.d] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v6, types: [t6.d] */
    /* JADX WARN: Type inference failed for: r1v7, types: [t6.d] */
    /* JADX WARN: Type inference failed for: r23v0, types: [p6.h] */
    /* JADX WARN: Type inference failed for: r7v0, types: [t6.e] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void v(p6.h r23, s6.b.c r24, java.util.List r25) throws p6.m {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.b.v(p6.h, s6.b$c, java.util.List):void");
    }

    protected void w(p6.h hVar, c cVar, List list) throws v6.b {
        u[] uVarArr;
        l0 l0Var;
        b bVar = this;
        p6.c cVar2 = cVar.f26898b;
        t6.e eVar = cVar.f26900d;
        p6.b bVarC = cVar.c();
        l0 l0Var2 = cVar.f26899c;
        Map map = cVar.f26901e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t6.d dVar = (t6.d) it.next();
            int iG = dVar.g();
            x6.p pVarB = dVar.b();
            x6.u[] uVarArr2 = (x6.u[]) map.get(pVarB);
            if (iG == 1) {
                x6.u uVarJ = dVar.j(0);
                if (bVar.x(cVar2, bVarC, pVarB, uVarJ)) {
                    u[] uVarArr3 = new u[iG];
                    x6.o oVar = null;
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    while (i10 < iG) {
                        x6.o oVarV = pVarB.v(i10);
                        x6.u uVar = uVarArr2 == null ? null : uVarArr2[i10];
                        b.a aVarV = bVarC.v(oVarV);
                        y yVarA = uVar == null ? null : uVar.a();
                        if (uVar == null || !uVar.J()) {
                            uVarArr = uVarArr3;
                            y yVar = yVarA;
                            l0Var = l0Var2;
                            if (aVarV != null) {
                                i12++;
                                bVar = this;
                                uVarArr[i10] = bVar.g0(hVar, cVar2, yVar, i10, oVarV, aVarV);
                            } else {
                                bVar = this;
                                if (bVarC.q0(oVarV) != null) {
                                    bVar.d0(hVar, cVar2, oVarV);
                                } else if (oVar == null) {
                                    oVar = oVarV;
                                }
                            }
                        } else {
                            i11++;
                            uVarArr = uVarArr3;
                            l0Var = l0Var2;
                            uVarArr[i10] = bVar.g0(hVar, cVar2, yVarA, i10, oVarV, aVarV);
                            bVar = this;
                        }
                        i10++;
                        uVarArr3 = uVarArr;
                        l0Var2 = l0Var;
                    }
                    u[] uVarArr4 = uVarArr3;
                    l0 l0Var3 = l0Var2;
                    if (i11 > 0 || i12 > 0) {
                        if (i11 + i12 == iG) {
                            eVar.l(pVarB, false, uVarArr4);
                        } else if (i11 == 0 && i12 + 1 == iG) {
                            eVar.h(pVarB, false, uVarArr4, 0);
                        } else {
                            hVar.O0(cVar2, "Argument #%d of factory method %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", Integer.valueOf(oVar == null ? -1 : oVar.r()), pVarB);
                        }
                    }
                    l0Var2 = l0Var3;
                } else {
                    bVar.Y(eVar, pVarB, false, l0Var2.a(pVarB));
                    if (uVarJ != null) {
                        ((h0) uVarJ).x0();
                    }
                }
            }
        }
    }
}
