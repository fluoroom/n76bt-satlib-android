package u6;

import com.fasterxml.jackson.databind.JavaType;
import d6.p;
import d6.s;
import i7.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t6.z;

/* JADX INFO: loaded from: classes.dex */
public class t extends j implements s6.i, s6.s {
    protected Set A;
    protected o.a B;
    protected boolean C;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final p6.q f28323r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f28324s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final p6.l f28325t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected final a7.e f28326u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final s6.w f28327v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected p6.l f28328w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected t6.v f28329x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected final boolean f28330y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected Set f28331z;

    static class a extends z.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f28332c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map f28333d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f28334e;

        a(b bVar, s6.v vVar, Class cls, Object obj) {
            super(vVar, cls);
            this.f28333d = new LinkedHashMap();
            this.f28332c = bVar;
            this.f28334e = obj;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f28335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f28336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f28337c = new ArrayList();

        public b(Class cls, Map map) {
            this.f28335a = cls;
            this.f28336b = map;
        }

        public z.a a(s6.v vVar, Object obj) {
            a aVar = new a(this, vVar, this.f28335a, obj);
            this.f28337c.add(aVar);
            return aVar;
        }

        public void b(Object obj, Object obj2) {
            if (this.f28337c.isEmpty()) {
                this.f28336b.put(obj, obj2);
            } else {
                ((a) this.f28337c.get(r0.size() - 1)).f28333d.put(obj, obj2);
            }
        }
    }

    public t(JavaType javaType, s6.w wVar, p6.q qVar, p6.l lVar, a7.e eVar) {
        super(javaType, (s6.r) null, (Boolean) null);
        this.f28323r = qVar;
        this.f28325t = lVar;
        this.f28326u = eVar;
        this.f28327v = wVar;
        this.f28330y = wVar.j();
        this.f28328w = null;
        this.f28329x = null;
        this.f28324s = h1(javaType, qVar);
        this.B = null;
        this.C = javaType.k().C(Object.class);
    }

    private void q1(p6.h hVar, b bVar, Object obj, s6.v vVar) throws v6.f {
        if (bVar == null) {
            hVar.S0(this, "Unresolved forward reference but no identity info: " + vVar, new Object[0]);
        }
        vVar.w().a(bVar.a(vVar, obj));
    }

    @Override // u6.c0
    public s6.w W0() {
        return this.f28327v;
    }

    @Override // u6.j, u6.c0
    public JavaType X0() {
        return this.f28256e;
    }

    @Override // s6.s
    public void c(p6.h hVar) throws v6.b {
        if (this.f28327v.k()) {
            JavaType javaTypeN = this.f28327v.N(hVar.k());
            if (javaTypeN == null) {
                JavaType javaType = this.f28256e;
                hVar.q(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, this.f28327v.getClass().getName()));
            }
            this.f28328w = S0(hVar, javaTypeN, null);
        } else if (this.f28327v.i()) {
            JavaType javaTypeH = this.f28327v.H(hVar.k());
            if (javaTypeH == null) {
                JavaType javaType2 = this.f28256e;
                hVar.q(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType2, this.f28327v.getClass().getName()));
            }
            this.f28328w = S0(hVar, javaTypeH, null);
        }
        if (this.f28327v.g()) {
            this.f28329x = t6.v.c(hVar, this.f28327v, this.f28327v.O(hVar.k()), hVar.E0(p6.r.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
        }
        this.f28324s = h1(this.f28256e, this.f28323r);
    }

    @Override // s6.i
    public p6.l d(p6.h hVar, p6.d dVar) throws v6.b {
        x6.k kVarH;
        Set<String> setE;
        p6.q qVarS = this.f28323r;
        if (qVarS == null) {
            qVarS = hVar.S(this.f28256e.q(), dVar);
        }
        p6.q qVar = qVarS;
        p6.l lVarR0 = this.f28325t;
        if (dVar != null) {
            lVarR0 = R0(hVar, dVar, lVarR0);
        }
        JavaType javaTypeK = this.f28256e.k();
        p6.l lVarQ = lVarR0 == null ? hVar.Q(javaTypeK, dVar) : hVar.p0(lVarR0, dVar, javaTypeK);
        a7.e eVarG = this.f28326u;
        if (eVarG != null) {
            eVarG = eVarG.g(dVar);
        }
        a7.e eVar = eVarG;
        Set hashSet = this.f28331z;
        Set hashSet2 = this.A;
        p6.b bVarZ = hVar.Z();
        if (c0.n0(bVarZ, dVar) && (kVarH = dVar.h()) != null) {
            p6.g gVarK = hVar.k();
            p.a aVarX = bVarZ.X(gVarK, kVarH);
            if (aVarX != null) {
                Set setG = aVarX.g();
                if (!setG.isEmpty()) {
                    hashSet = hashSet == null ? new HashSet() : new HashSet(hashSet);
                    Iterator it = setG.iterator();
                    while (it.hasNext()) {
                        hashSet.add((String) it.next());
                    }
                }
            }
            s.a aVarA0 = bVarZ.a0(gVarK, kVarH);
            if (aVarA0 != null && (setE = aVarA0.e()) != null) {
                HashSet hashSet3 = new HashSet();
                if (hashSet2 == null) {
                    hashSet2 = new HashSet(setE);
                } else {
                    for (String str : setE) {
                        if (hashSet2.contains(str)) {
                            hashSet3.add(str);
                        }
                    }
                    hashSet2 = hashSet3;
                }
            }
        }
        return t1(qVar, eVar, lVarQ, P0(hVar, dVar, lVarQ), hashSet, hashSet2);
    }

    @Override // u6.j
    public p6.l e1() {
        return this.f28325t;
    }

    @Override // u6.c0, p6.l
    public Object g(e6.j jVar, p6.h hVar, a7.e eVar) {
        return eVar.e(jVar, hVar);
    }

    public Map g1(e6.j jVar, p6.h hVar) throws IOException {
        Object objE;
        t6.v vVar = this.f28329x;
        t6.y yVarE = vVar.e(jVar, hVar, null);
        p6.l lVar = this.f28325t;
        a7.e eVar = this.f28326u;
        String strV0 = jVar.T0() ? jVar.V0() : jVar.N0(e6.m.FIELD_NAME) ? jVar.l() : null;
        while (strV0 != null) {
            e6.m mVarX0 = jVar.X0();
            o.a aVar = this.B;
            if (aVar == null || !aVar.b(strV0)) {
                s6.u uVarD = vVar.d(strV0);
                if (uVarD == null) {
                    Object objA = this.f28323r.a(strV0, hVar);
                    try {
                        if (mVarX0 != e6.m.VALUE_NULL) {
                            objE = eVar == null ? lVar.e(jVar, hVar) : lVar.g(jVar, hVar, eVar);
                        } else if (!this.f28258g) {
                            objE = this.f28257f.a(hVar);
                        }
                        yVarE.d(objA, objE);
                    } catch (Exception e10) {
                        f1(hVar, e10, this.f28256e.r(), strV0);
                        return null;
                    }
                } else if (yVarE.b(uVarD, uVarD.l(jVar, hVar))) {
                    jVar.X0();
                    try {
                        return i1(jVar, hVar, (Map) vVar.a(hVar, yVarE));
                    } catch (Exception e11) {
                        return (Map) f1(hVar, e11, this.f28256e.r(), strV0);
                    }
                }
            } else {
                jVar.f1();
            }
            strV0 = jVar.V0();
        }
        try {
            return (Map) vVar.a(hVar, yVarE);
        } catch (Exception e12) {
            f1(hVar, e12, this.f28256e.r(), strV0);
            return null;
        }
    }

    protected final boolean h1(JavaType javaType, p6.q qVar) {
        JavaType javaTypeQ;
        if (qVar == null || (javaTypeQ = javaType.q()) == null) {
            return true;
        }
        Class clsR = javaTypeQ.r();
        return (clsR == String.class || clsR == Object.class) && d1(qVar);
    }

    protected final Map i1(e6.j jVar, p6.h hVar, Map map) throws IOException {
        String strL;
        Object objE;
        p6.q qVar = this.f28323r;
        p6.l lVar = this.f28325t;
        a7.e eVar = this.f28326u;
        boolean z10 = lVar.o() != null;
        b bVar = z10 ? new b(this.f28256e.k().r(), map) : null;
        if (jVar.T0()) {
            strL = jVar.V0();
        } else {
            e6.m mVarN = jVar.n();
            e6.m mVar = e6.m.FIELD_NAME;
            if (mVarN != mVar) {
                if (mVarN != e6.m.END_OBJECT) {
                    hVar.Z0(this, mVar, null, new Object[0]);
                }
                return map;
            }
            strL = jVar.l();
        }
        String strV0 = strL;
        while (strV0 != null) {
            Object objA = qVar.a(strV0, hVar);
            e6.m mVarX0 = jVar.X0();
            o.a aVar = this.B;
            if (aVar == null || !aVar.b(strV0)) {
                try {
                    if (mVarX0 != e6.m.VALUE_NULL) {
                        objE = eVar == null ? lVar.e(jVar, hVar) : lVar.g(jVar, hVar, eVar);
                    } else if (!this.f28258g) {
                        objE = this.f28257f.a(hVar);
                    }
                    Object obj = objE;
                    if (z10) {
                        bVar.b(objA, obj);
                    } else {
                        Object objPut = map.put(objA, obj);
                        if (objPut != null) {
                            m1(hVar, map, objA, objPut, obj);
                        }
                    }
                } catch (s6.v e10) {
                    q1(hVar, bVar, objA, e10);
                } catch (Exception e11) {
                    f1(hVar, e11, map, strV0);
                }
            } else {
                jVar.f1();
            }
            strV0 = jVar.V0();
        }
        return map;
    }

    protected final Map j1(e6.j jVar, p6.h hVar, Map map) throws IOException {
        String strL;
        p6.h hVar2;
        Map map2;
        Object objE;
        Object obj;
        p6.l lVar = this.f28325t;
        a7.e eVar = this.f28326u;
        boolean z10 = lVar.o() != null;
        b bVar = z10 ? new b(this.f28256e.k().r(), map) : null;
        if (!jVar.T0()) {
            e6.m mVarN = jVar.n();
            if (mVarN != e6.m.END_OBJECT) {
                e6.m mVar = e6.m.FIELD_NAME;
                if (mVarN != mVar) {
                    hVar.Z0(this, mVar, null, new Object[0]);
                }
                strL = jVar.l();
            }
            return map;
        }
        strL = jVar.V0();
        String strV0 = strL;
        while (strV0 != null) {
            e6.m mVarX0 = jVar.X0();
            o.a aVar = this.B;
            if (aVar == null || !aVar.b(strV0)) {
                try {
                    if (mVarX0 != e6.m.VALUE_NULL) {
                        objE = eVar == null ? lVar.e(jVar, hVar) : lVar.g(jVar, hVar, eVar);
                    } else if (!this.f28258g) {
                        objE = this.f28257f.a(hVar);
                    }
                    obj = objE;
                } catch (s6.v e10) {
                    e = e10;
                    hVar2 = hVar;
                    map2 = map;
                } catch (Exception e11) {
                    e = e11;
                    hVar2 = hVar;
                    map2 = map;
                }
                if (z10) {
                    bVar.b(strV0, obj);
                } else {
                    Object objPut = map.put(strV0, obj);
                    if (objPut != null) {
                        hVar2 = hVar;
                        map2 = map;
                        try {
                            m1(hVar2, map2, strV0, objPut, obj);
                        } catch (s6.v e12) {
                            e = e12;
                            q1(hVar2, bVar, strV0, e);
                        } catch (Exception e13) {
                            e = e13;
                            f1(hVar2, e, map2, strV0);
                        }
                    }
                    strV0 = jVar.V0();
                    hVar = hVar2;
                    map = map2;
                }
            } else {
                jVar.f1();
            }
            hVar2 = hVar;
            map2 = map;
            strV0 = jVar.V0();
            hVar = hVar2;
            map = map2;
        }
        return map;
    }

    protected final void k1(e6.j jVar, p6.h hVar, Map map) throws IOException {
        String strL;
        p6.q qVar = this.f28323r;
        p6.l lVar = this.f28325t;
        a7.e eVar = this.f28326u;
        if (jVar.T0()) {
            strL = jVar.V0();
        } else {
            e6.m mVarN = jVar.n();
            if (mVarN == e6.m.END_OBJECT) {
                return;
            }
            e6.m mVar = e6.m.FIELD_NAME;
            if (mVarN != mVar) {
                hVar.Z0(this, mVar, null, new Object[0]);
            }
            strL = jVar.l();
        }
        while (strL != null) {
            Object objA = qVar.a(strL, hVar);
            e6.m mVarX0 = jVar.X0();
            o.a aVar = this.B;
            if (aVar == null || !aVar.b(strL)) {
                try {
                    if (mVarX0 != e6.m.VALUE_NULL) {
                        Object obj = map.get(objA);
                        Object objF = obj != null ? eVar == null ? lVar.f(jVar, hVar, obj) : lVar.h(jVar, hVar, eVar, obj) : eVar == null ? lVar.e(jVar, hVar) : lVar.g(jVar, hVar, eVar);
                        if (objF != obj) {
                            map.put(objA, objF);
                        }
                    } else if (!this.f28258g) {
                        map.put(objA, this.f28257f.a(hVar));
                    }
                } catch (Exception e10) {
                    f1(hVar, e10, map, strL);
                }
            } else {
                jVar.f1();
            }
            strL = jVar.V0();
        }
    }

    protected final void l1(e6.j jVar, p6.h hVar, Map map) throws IOException {
        String strL;
        p6.l lVar = this.f28325t;
        a7.e eVar = this.f28326u;
        if (jVar.T0()) {
            strL = jVar.V0();
        } else {
            e6.m mVarN = jVar.n();
            if (mVarN == e6.m.END_OBJECT) {
                return;
            }
            e6.m mVar = e6.m.FIELD_NAME;
            if (mVarN != mVar) {
                hVar.Z0(this, mVar, null, new Object[0]);
            }
            strL = jVar.l();
        }
        while (strL != null) {
            e6.m mVarX0 = jVar.X0();
            o.a aVar = this.B;
            if (aVar == null || !aVar.b(strL)) {
                try {
                    if (mVarX0 != e6.m.VALUE_NULL) {
                        Object obj = map.get(strL);
                        Object objF = obj != null ? eVar == null ? lVar.f(jVar, hVar, obj) : lVar.h(jVar, hVar, eVar, obj) : eVar == null ? lVar.e(jVar, hVar) : lVar.g(jVar, hVar, eVar);
                        if (objF != obj) {
                            map.put(strL, objF);
                        }
                    } else if (!this.f28258g) {
                        map.put(strL, this.f28257f.a(hVar));
                    }
                } catch (Exception e10) {
                    f1(hVar, e10, map, strL);
                }
            } else {
                jVar.f1();
            }
            strL = jVar.V0();
        }
    }

    protected void m1(p6.h hVar, Map map, Object obj, Object obj2, Object obj3) {
        if (this.C && hVar.C0(e6.q.DUPLICATE_PROPERTIES)) {
            if (obj2 instanceof List) {
                ((List) obj2).add(obj3);
                map.put(obj, obj2);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj2);
                arrayList.add(obj3);
                map.put(obj, arrayList);
            }
        }
    }

    @Override // p6.l
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public Map e(e6.j jVar, p6.h hVar) {
        if (this.f28329x != null) {
            return g1(jVar, hVar);
        }
        p6.l lVar = this.f28328w;
        if (lVar != null) {
            return (Map) this.f28327v.D(hVar, lVar.e(jVar, hVar));
        }
        if (!this.f28330y) {
            return (Map) hVar.m0(p1(), W0(), jVar, "no default constructor found", new Object[0]);
        }
        int iQ = jVar.q();
        if (iQ != 1 && iQ != 2) {
            if (iQ == 3) {
                return (Map) W(jVar, hVar);
            }
            if (iQ != 5) {
                return iQ != 6 ? (Map) hVar.q0(Y0(hVar), jVar) : (Map) Y(jVar, hVar);
            }
        }
        Map map = (Map) this.f28327v.A(hVar);
        return this.f28324s ? j1(jVar, hVar, map) : i1(jVar, hVar, map);
    }

    @Override // p6.l
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public Map f(e6.j jVar, p6.h hVar, Map map) throws IOException {
        jVar.c1(map);
        e6.m mVarN = jVar.n();
        if (mVarN != e6.m.START_OBJECT && mVarN != e6.m.FIELD_NAME) {
            return (Map) hVar.s0(p1(), jVar);
        }
        if (this.f28324s) {
            l1(jVar, hVar, map);
            return map;
        }
        k1(jVar, hVar, map);
        return map;
    }

    public final Class p1() {
        return this.f28256e.r();
    }

    @Override // p6.l
    public boolean q() {
        return this.f28325t == null && this.f28323r == null && this.f28326u == null && this.f28331z == null && this.A == null;
    }

    @Override // p6.l
    public h7.c r() {
        return h7.c.Map;
    }

    public void r1(Set set) {
        if (set == null || set.isEmpty()) {
            set = null;
        }
        this.f28331z = set;
        this.B = i7.o.a(set, this.A);
    }

    public void s1(Set set) {
        this.A = set;
        this.B = i7.o.a(this.f28331z, set);
    }

    protected t t1(p6.q qVar, a7.e eVar, p6.l lVar, s6.r rVar, Set set, Set set2) {
        return (this.f28323r == qVar && this.f28325t == lVar && this.f28326u == eVar && this.f28257f == rVar && this.f28331z == set && this.A == set2) ? this : new t(this, qVar, lVar, eVar, rVar, set, set2);
    }

    protected t(t tVar, p6.q qVar, p6.l lVar, a7.e eVar, s6.r rVar, Set set, Set set2) {
        super(tVar, rVar, tVar.f28259h);
        this.f28323r = qVar;
        this.f28325t = lVar;
        this.f28326u = eVar;
        this.f28327v = tVar.f28327v;
        this.f28329x = tVar.f28329x;
        this.f28328w = tVar.f28328w;
        this.f28330y = tVar.f28330y;
        this.f28331z = set;
        this.A = set2;
        this.B = i7.o.a(set, set2);
        this.f28324s = h1(this.f28256e, qVar);
        this.C = tVar.C;
    }
}
