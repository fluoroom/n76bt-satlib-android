package g7;

import com.fasterxml.jackson.databind.JavaType;
import d6.k;
import d6.r;
import f7.k;
import i7.o;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class t extends e7.h implements e7.i {
    protected static final JavaType A = com.fasterxml.jackson.databind.type.c.b0();
    public static final Object B = r.a.NON_EMPTY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final p6.d f13626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final boolean f13627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final JavaType f13628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final JavaType f13629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected p6.p f13630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected p6.p f13631h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final a7.h f13632r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected f7.k f13633s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final Set f13634t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected final Set f13635u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final Object f13636v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected final Object f13637w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected final boolean f13638x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected final o.a f13639y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected final boolean f13640z;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13641a;

        static {
            int[] iArr = new int[r.a.values().length];
            f13641a = iArr;
            try {
                iArr[r.a.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13641a[r.a.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13641a[r.a.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13641a[r.a.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13641a[r.a.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13641a[r.a.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    protected t(Set set, Set set2, JavaType javaType, JavaType javaType2, boolean z10, a7.h hVar, p6.p pVar, p6.p pVar2) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this.f13634t = set;
        this.f13635u = set2;
        this.f13628e = javaType;
        this.f13629f = javaType2;
        this.f13627d = z10;
        this.f13632r = hVar;
        this.f13630g = pVar;
        this.f13631h = pVar2;
        this.f13633s = f7.k.c();
        this.f13626c = null;
        this.f13636v = null;
        this.f13640z = false;
        this.f13637w = null;
        this.f13638x = false;
        this.f13639y = i7.o.a(set, set2);
    }

    private final p6.p G(p6.d0 d0Var, Object obj) {
        Class<?> cls = obj.getClass();
        p6.p pVarJ = this.f13633s.j(cls);
        return pVarJ != null ? pVarJ : this.f13629f.z() ? C(this.f13633s, d0Var.G(this.f13629f, cls), d0Var) : D(this.f13633s, cls, d0Var);
    }

    public static t O(Set set, JavaType javaType, boolean z10, a7.h hVar, p6.p pVar, p6.p pVar2, Object obj) {
        return Q(set, null, javaType, z10, hVar, pVar, pVar2, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static g7.t Q(java.util.Set r11, java.util.Set r12, com.fasterxml.jackson.databind.JavaType r13, boolean r14, a7.h r15, p6.p r16, p6.p r17, java.lang.Object r18) {
        /*
            r0 = r18
            if (r13 != 0) goto L9
            com.fasterxml.jackson.databind.JavaType r13 = g7.t.A
            r5 = r13
            r6 = r5
            goto L21
        L9:
            com.fasterxml.jackson.databind.JavaType r1 = r13.q()
            java.lang.Class<java.util.Properties> r2 = java.util.Properties.class
            boolean r2 = r13.C(r2)
            if (r2 == 0) goto L1c
            com.fasterxml.jackson.databind.JavaType r13 = com.fasterxml.jackson.databind.type.c.b0()
        L19:
            r6 = r13
            r5 = r1
            goto L21
        L1c:
            com.fasterxml.jackson.databind.JavaType r13 = r13.k()
            goto L19
        L21:
            r13 = 0
            if (r14 != 0) goto L32
            if (r6 == 0) goto L2f
            boolean r14 = r6.Q()
            if (r14 == 0) goto L2f
            r13 = 1
            r14 = 1
            goto L30
        L2f:
            r14 = 0
        L30:
            r7 = r14
            goto L3b
        L32:
            java.lang.Class r1 = r6.r()
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r1 != r2) goto L30
            r7 = 0
        L3b:
            g7.t r2 = new g7.t
            r3 = r11
            r4 = r12
            r8 = r15
            r9 = r16
            r10 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 == 0) goto L4e
            g7.t r11 = r2.d0(r0)
            return r11
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.t.Q(java.util.Set, java.util.Set, com.fasterxml.jackson.databind.JavaType, boolean, a7.h, p6.p, p6.p, java.lang.Object):g7.t");
    }

    protected void A(String str) {
        i7.h.o0(t.class, this, str);
    }

    protected final p6.p C(f7.k kVar, JavaType javaType, p6.d0 d0Var) {
        k.d dVarG = kVar.g(javaType, d0Var, this.f13626c);
        f7.k kVar2 = dVarG.f12864b;
        if (kVar != kVar2) {
            this.f13633s = kVar2;
        }
        return dVarG.f12863a;
    }

    protected final p6.p D(f7.k kVar, Class cls, p6.d0 d0Var) {
        k.d dVarH = kVar.h(cls, d0Var, this.f13626c);
        f7.k kVar2 = dVarH.f12864b;
        if (kVar != kVar2) {
            this.f13633s = kVar2;
        }
        return dVarH.f12863a;
    }

    protected boolean H(Map map) {
        return (map instanceof HashMap) && map.containsKey(null);
    }

    protected Map K(Map map, e6.g gVar, p6.d0 d0Var) throws IOException {
        if (map instanceof SortedMap) {
            return map;
        }
        if (!H(map)) {
            return new TreeMap(map);
        }
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                N(gVar, d0Var, entry.getValue());
            } else {
                treeMap.put(key, entry.getValue());
            }
        }
        return treeMap;
    }

    @Override // e7.h
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public t x(a7.h hVar) {
        if (this.f13632r == hVar) {
            return this;
        }
        A("_withValueTypeSerializer");
        return new t(this, hVar, this.f13637w, this.f13638x);
    }

    protected void N(e6.g gVar, p6.d0 d0Var, Object obj) throws IOException {
        p6.p pVarG;
        p6.p pVarW = d0Var.W(this.f13628e, this.f13626c);
        if (obj != null) {
            pVarG = this.f13631h;
            if (pVarG == null) {
                pVarG = G(d0Var, obj);
            }
            Object obj2 = this.f13637w;
            if (obj2 == B) {
                if (pVarG.d(d0Var, obj)) {
                    return;
                }
            } else if (obj2 != null && obj2.equals(obj)) {
                return;
            }
        } else if (this.f13638x) {
            return;
        } else {
            pVarG = d0Var.l0();
        }
        try {
            pVarW.f(null, gVar, d0Var);
            pVarG.f(obj, gVar, d0Var);
        } catch (Exception e10) {
            w(d0Var, e10, obj, "");
        }
    }

    public JavaType R() {
        return this.f13629f;
    }

    @Override // p6.p
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public boolean d(p6.d0 d0Var, Map map) {
        p6.p pVarG;
        if (map.isEmpty()) {
            return true;
        }
        Object obj = this.f13637w;
        if (obj == null && !this.f13638x) {
            return false;
        }
        p6.p pVar = this.f13631h;
        boolean z10 = B == obj;
        if (pVar != null) {
            for (Object obj2 : map.values()) {
                if (obj2 == null) {
                    if (!this.f13638x) {
                        return false;
                    }
                } else if (z10) {
                    if (!pVar.d(d0Var, obj2)) {
                        return false;
                    }
                } else if (obj == null || !obj.equals(map)) {
                    return false;
                }
            }
            return true;
        }
        for (Object obj3 : map.values()) {
            if (obj3 != null) {
                try {
                    pVarG = G(d0Var, obj3);
                } catch (p6.f unused) {
                }
                if (z10) {
                    if (!pVarG.d(d0Var, obj3)) {
                        return false;
                    }
                } else if (obj == null || !obj.equals(map)) {
                    return false;
                }
            } else if (!this.f13638x) {
                return false;
            }
        }
        return true;
    }

    @Override // g7.i0, p6.p
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void f(Map map, e6.g gVar, p6.d0 d0Var) throws IOException {
        gVar.a1(map);
        b0(map, gVar, d0Var);
        gVar.A0();
    }

    public void W(Map map, e6.g gVar, p6.d0 d0Var) throws IOException {
        Object obj = null;
        if (this.f13632r != null) {
            Z(map, gVar, d0Var, null);
            return;
        }
        p6.p pVar = this.f13630g;
        try {
            Object key = null;
            for (Map.Entry entry : map.entrySet()) {
                try {
                    Object value = entry.getValue();
                    key = entry.getKey();
                    if (key == null) {
                        d0Var.W(this.f13628e, this.f13626c).f(null, gVar, d0Var);
                    } else {
                        o.a aVar = this.f13639y;
                        if (aVar == null || !aVar.b(key)) {
                            pVar.f(key, gVar, d0Var);
                        }
                    }
                    if (value == null) {
                        d0Var.N(gVar);
                    } else {
                        p6.p pVarG = this.f13631h;
                        if (pVarG == null) {
                            pVarG = G(d0Var, value);
                        }
                        pVarG.f(value, gVar, d0Var);
                    }
                } catch (Exception e10) {
                    e = e10;
                    obj = key;
                    w(d0Var, e, map, String.valueOf(obj));
                    return;
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public void X(Map map, e6.g gVar, p6.d0 d0Var, p6.p pVar) throws IOException {
        p6.p pVar2 = this.f13630g;
        a7.h hVar = this.f13632r;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            o.a aVar = this.f13639y;
            if (aVar == null || !aVar.b(key)) {
                if (key == null) {
                    d0Var.W(this.f13628e, this.f13626c).f(null, gVar, d0Var);
                } else {
                    pVar2.f(key, gVar, d0Var);
                }
                Object value = entry.getValue();
                if (value == null) {
                    d0Var.N(gVar);
                } else if (hVar == null) {
                    try {
                        pVar.f(value, gVar, d0Var);
                    } catch (Exception e10) {
                        w(d0Var, e10, map, String.valueOf(key));
                    }
                } else {
                    pVar.g(value, gVar, d0Var, hVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0069 A[EXC_TOP_SPLITTER, PHI: r5
      0x0069: PHI (r5v3 p6.p) = (r5v2 p6.p), (r5v5 p6.p), (r5v5 p6.p), (r5v5 p6.p) binds: [B:27:0x004a, B:33:0x005d, B:35:0x0060, B:37:0x0066] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Y(java.util.Map r8, e6.g r9, p6.d0 r10, java.lang.Object r11) throws java.io.IOException {
        /*
            r7 = this;
            a7.h r0 = r7.f13632r
            if (r0 == 0) goto L8
            r7.Z(r8, r9, r10, r11)
            return
        L8:
            java.lang.Object r0 = g7.t.B
            if (r0 != r11) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            java.util.Set r1 = r8.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L79
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            if (r3 != 0) goto L32
            com.fasterxml.jackson.databind.JavaType r4 = r7.f13628e
            p6.d r5 = r7.f13626c
            p6.p r4 = r10.W(r4, r5)
            goto L3f
        L32:
            i7.o$a r4 = r7.f13639y
            if (r4 == 0) goto L3d
            boolean r4 = r4.b(r3)
            if (r4 == 0) goto L3d
            goto L17
        L3d:
            p6.p r4 = r7.f13630g
        L3f:
            java.lang.Object r2 = r2.getValue()
            if (r2 != 0) goto L4f
            boolean r5 = r7.f13638x
            if (r5 == 0) goto L4a
            goto L17
        L4a:
            p6.p r5 = r10.l0()
            goto L69
        L4f:
            p6.p r5 = r7.f13631h
            if (r5 != 0) goto L57
            p6.p r5 = r7.G(r10, r2)
        L57:
            if (r0 == 0) goto L60
            boolean r6 = r5.d(r10, r2)
            if (r6 == 0) goto L69
            goto L17
        L60:
            if (r11 == 0) goto L69
            boolean r6 = r11.equals(r2)
            if (r6 == 0) goto L69
            goto L17
        L69:
            r4.f(r3, r9, r10)     // Catch: java.lang.Exception -> L70
            r5.f(r2, r9, r10)     // Catch: java.lang.Exception -> L70
            goto L17
        L70:
            r2 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r7.w(r10, r2, r8, r3)
            goto L17
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.t.Y(java.util.Map, e6.g, p6.d0, java.lang.Object):void");
    }

    public void Z(Map map, e6.g gVar, p6.d0 d0Var, Object obj) throws IOException {
        p6.p pVarW;
        p6.p pVarL0;
        boolean z10 = B == obj;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                pVarW = d0Var.W(this.f13628e, this.f13626c);
            } else {
                o.a aVar = this.f13639y;
                if (aVar == null || !aVar.b(key)) {
                    pVarW = this.f13630g;
                }
            }
            Object value = entry.getValue();
            if (value != null) {
                pVarL0 = this.f13631h;
                if (pVarL0 == null) {
                    pVarL0 = G(d0Var, value);
                }
                if (z10) {
                    if (!pVarL0.d(d0Var, value)) {
                        pVarW.f(key, gVar, d0Var);
                        pVarL0.g(value, gVar, d0Var, this.f13632r);
                    }
                } else if (obj == null || !obj.equals(value)) {
                    pVarW.f(key, gVar, d0Var);
                    pVarL0.g(value, gVar, d0Var, this.f13632r);
                }
            } else if (!this.f13638x) {
                pVarL0 = d0Var.l0();
                pVarW.f(key, gVar, d0Var);
                try {
                    pVarL0.g(value, gVar, d0Var, this.f13632r);
                } catch (Exception e10) {
                    w(d0Var, e10, map, String.valueOf(key));
                }
            }
        }
    }

    @Override // e7.i
    public p6.p a(p6.d0 d0Var, p6.d dVar) {
        p6.p pVarG0;
        p6.p pVarG02;
        boolean zBooleanValue;
        r.a aVarF;
        Object objR;
        Boolean boolE;
        p6.b bVarI0 = d0Var.i0();
        Object objB = null;
        x6.k kVarH = dVar == null ? null : dVar.h();
        if (i0.j(kVarH, bVarI0)) {
            Object objZ = bVarI0.z(kVarH);
            pVarG0 = objZ != null ? d0Var.G0(kVarH, objZ) : null;
            Object objG = bVarI0.g(kVarH);
            pVarG02 = objG != null ? d0Var.G0(kVarH, objG) : null;
        } else {
            pVarG0 = null;
            pVarG02 = null;
        }
        if (pVarG02 == null) {
            pVarG02 = this.f13631h;
        }
        p6.p pVarN = n(d0Var, dVar, pVarG02);
        if (pVarN == null && this.f13627d && !this.f13629f.S()) {
            pVarN = d0Var.Q(this.f13629f, dVar);
        }
        p6.p pVar = pVarN;
        if (pVarG0 == null) {
            pVarG0 = this.f13630g;
        }
        p6.p pVarS = pVarG0 == null ? d0Var.S(this.f13628e, dVar) : d0Var.u0(pVarG0, dVar);
        Set hashSet = this.f13634t;
        Set hashSet2 = this.f13635u;
        boolean zW0 = false;
        if (i0.j(kVarH, bVarI0)) {
            p6.b0 b0VarK = d0Var.k();
            Set setH = bVarI0.X(b0VarK, kVarH).h();
            if (i0.k(setH)) {
                hashSet = hashSet == null ? new HashSet() : new HashSet(hashSet);
                Iterator it = setH.iterator();
                while (it.hasNext()) {
                    hashSet.add((String) it.next());
                }
            }
            Set setE = bVarI0.a0(b0VarK, kVarH).e();
            if (setE != null) {
                hashSet2 = hashSet2 == null ? new HashSet() : new HashSet(hashSet2);
                Iterator it2 = setE.iterator();
                while (it2.hasNext()) {
                    hashSet2.add((String) it2.next());
                }
            }
            zBooleanValue = Boolean.TRUE.equals(bVarI0.j0(kVarH));
        } else {
            zBooleanValue = false;
        }
        Set set = hashSet;
        Set set2 = hashSet2;
        k.d dVarQ = q(d0Var, dVar, Map.class);
        if (dVarQ != null && (boolE = dVarQ.e(k.a.WRITE_SORTED_MAP_ENTRIES)) != null) {
            zBooleanValue = boolE.booleanValue();
        }
        t tVarE0 = e0(dVar, pVarS, pVar, set, set2, zBooleanValue);
        if (kVarH != null && (objR = bVarI0.r(kVarH)) != null) {
            tVarE0 = tVarE0.d0(objR);
        }
        r.b bVarR = r(d0Var, dVar, Map.class);
        if (bVarR == null || (aVarF = bVarR.f()) == r.a.USE_DEFAULTS) {
            return tVarE0;
        }
        int i10 = a.f13641a[aVarF.ordinal()];
        if (i10 == 1) {
            objB = i7.e.b(this.f13629f);
            if (objB != null && objB.getClass().isArray()) {
                objB = i7.c.a(objB);
            }
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    objB = d0Var.v0(null, bVarR.e());
                    if (objB != null) {
                        zW0 = d0Var.w0(objB);
                    }
                } else if (i10 == 5) {
                }
                return tVarE0.c0(objB, zW0);
            }
            objB = B;
        } else if (this.f13629f.b()) {
            objB = B;
        }
        zW0 = true;
        return tVarE0.c0(objB, zW0);
    }

    @Override // p6.p
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void g(Map map, e6.g gVar, p6.d0 d0Var, a7.h hVar) throws IOException {
        gVar.H(map);
        n6.c cVarG = hVar.g(gVar, hVar.d(map, e6.m.START_OBJECT));
        b0(map, gVar, d0Var);
        hVar.h(gVar, cVarG);
    }

    public void b0(Map map, e6.g gVar, p6.d0 d0Var) throws IOException {
        if (map.isEmpty()) {
            return;
        }
        if (this.f13640z || d0Var.y0(p6.c0.ORDER_MAP_ENTRIES_BY_KEYS)) {
            map = K(map, gVar, d0Var);
        }
        Object obj = this.f13636v;
        if (obj != null) {
            s(d0Var, obj, map);
        }
        Object obj2 = this.f13637w;
        if (obj2 != null || this.f13638x) {
            Y(map, gVar, d0Var, obj2);
            return;
        }
        p6.p pVar = this.f13631h;
        if (pVar != null) {
            X(map, gVar, d0Var, pVar);
        } else {
            W(map, gVar, d0Var);
        }
    }

    public t c0(Object obj, boolean z10) {
        if (obj == this.f13637w && z10 == this.f13638x) {
            return this;
        }
        A("withContentInclusion");
        return new t(this, this.f13632r, obj, z10);
    }

    public t d0(Object obj) {
        if (this.f13636v == obj) {
            return this;
        }
        A("withFilterId");
        return new t(this, obj, this.f13640z);
    }

    public t e0(p6.d dVar, p6.p pVar, p6.p pVar2, Set set, Set set2, boolean z10) {
        A("withResolved");
        t tVar = new t(this, dVar, pVar, pVar2, set, set2);
        return z10 != tVar.f13640z ? new t(tVar, this.f13636v, z10) : tVar;
    }

    protected t(t tVar, p6.d dVar, p6.p pVar, p6.p pVar2, Set set, Set set2) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this.f13634t = set;
        this.f13635u = set2;
        this.f13628e = tVar.f13628e;
        this.f13629f = tVar.f13629f;
        this.f13627d = tVar.f13627d;
        this.f13632r = tVar.f13632r;
        this.f13630g = pVar;
        this.f13631h = pVar2;
        this.f13633s = f7.k.c();
        this.f13626c = dVar;
        this.f13636v = tVar.f13636v;
        this.f13640z = tVar.f13640z;
        this.f13637w = tVar.f13637w;
        this.f13638x = tVar.f13638x;
        this.f13639y = i7.o.a(set, set2);
    }

    protected t(t tVar, a7.h hVar, Object obj, boolean z10) {
        super(Map.class, false);
        this.f13634t = tVar.f13634t;
        this.f13635u = tVar.f13635u;
        this.f13628e = tVar.f13628e;
        this.f13629f = tVar.f13629f;
        this.f13627d = tVar.f13627d;
        this.f13632r = hVar;
        this.f13630g = tVar.f13630g;
        this.f13631h = tVar.f13631h;
        this.f13633s = tVar.f13633s;
        this.f13626c = tVar.f13626c;
        this.f13636v = tVar.f13636v;
        this.f13640z = tVar.f13640z;
        this.f13637w = obj;
        this.f13638x = z10;
        this.f13639y = tVar.f13639y;
    }

    protected t(t tVar, Object obj, boolean z10) {
        super(Map.class, false);
        this.f13634t = tVar.f13634t;
        this.f13635u = tVar.f13635u;
        this.f13628e = tVar.f13628e;
        this.f13629f = tVar.f13629f;
        this.f13627d = tVar.f13627d;
        this.f13632r = tVar.f13632r;
        this.f13630g = tVar.f13630g;
        this.f13631h = tVar.f13631h;
        this.f13633s = f7.k.c();
        this.f13626c = tVar.f13626c;
        this.f13636v = obj;
        this.f13640z = z10;
        this.f13637w = tVar.f13637w;
        this.f13638x = tVar.f13638x;
        this.f13639y = tVar.f13639y;
    }
}
