package ve;

import ee.o;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f30545c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f30546d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f30547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f30548b;

    private static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (c cVar : c.values()) {
            String strD = cVar.d();
            if (linkedHashMap.get(strD) == null) {
                linkedHashMap.put(strD, cVar);
            }
        }
        f30546d = linkedHashMap;
    }

    public b(e0 e0Var) {
        rd.m.e(e0Var, "javaTypeEnhancementState");
        this.f30547a = e0Var;
        this.f30548b = new ConcurrentHashMap();
    }

    private final Set b(Set set) {
        return set.contains(c.f30560e) ? ed.r0.j(ed.r0.i(ed.j.w0(c.values()), c.f30561f), set) : set;
    }

    private final w e(Object obj) {
        df.l lVarI;
        w wVarU = u(obj);
        if (wVarU != null) {
            return wVarU;
        }
        dd.q qVarW = w(obj);
        if (qVarW == null) {
            return null;
        }
        Object objA = qVarW.a();
        Set set = (Set) qVarW.b();
        p0 p0VarT = t(obj);
        if (p0VarT == null) {
            p0VarT = s(objA);
        }
        if (p0VarT.e() || (lVarI = i(objA, ve.a.f30544a)) == null) {
            return null;
        }
        return new w(df.l.b(lVarI, null, p0VarT.f(), 1, null), set, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Object obj) {
        rd.m.e(obj, "$this$extractNullability");
        return false;
    }

    private final df.l i(Object obj, qd.l lVar) {
        df.l lVarQ;
        df.l lVarQ2 = q(obj, ((Boolean) lVar.l(obj)).booleanValue());
        if (lVarQ2 != null) {
            return lVarQ2;
        }
        Object objV = v(obj);
        if (objV == null) {
            return null;
        }
        p0 p0VarS = s(obj);
        if (p0VarS.e() || (lVarQ = q(objV, ((Boolean) lVar.l(objV)).booleanValue())) == null) {
            return null;
        }
        return df.l.b(lVarQ, null, p0VarS.f(), 1, null);
    }

    private final Object j(Object obj, mf.c cVar) {
        for (Object obj2 : m(obj)) {
            if (rd.m.a(k(obj2), cVar)) {
                return obj2;
            }
        }
        return null;
    }

    private final boolean n(Object obj, mf.c cVar) {
        Iterable iterableM = m(obj);
        if ((iterableM instanceof Collection) && ((Collection) iterableM).isEmpty()) {
            return false;
        }
        Iterator it = iterableM.iterator();
        while (it.hasNext()) {
            if (rd.m.a(k(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r6.equals("NEVER") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (r6.equals("MAYBE") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        r6 = df.k.f10998b;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final df.l q(java.lang.Object r6, boolean r7) {
        /*
            r5 = this;
            mf.c r0 = r5.k(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            ve.e0 r2 = r5.f30547a
            qd.l r2 = r2.b()
            java.lang.Object r2 = r2.l(r0)
            ve.p0 r2 = (ve.p0) r2
            boolean r3 = r2.e()
            if (r3 == 0) goto L1b
            return r1
        L1b:
            java.util.Set r3 = ve.k0.m()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L29
            df.k r6 = df.k.f10999c
            goto L8d
        L29:
            java.util.Set r3 = ve.k0.n()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L36
            df.k r6 = df.k.f10998b
            goto L8d
        L36:
            java.util.Set r3 = ve.k0.b()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L43
            df.k r6 = df.k.f10997a
            goto L8d
        L43:
            mf.c r3 = ve.k0.c()
            boolean r0 = rd.m.a(r0, r3)
            if (r0 == 0) goto L9c
            java.lang.Iterable r6 = r5.c(r6, r4)
            java.lang.Object r6 = ed.q.a0(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L8b
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L7f;
                case 74175084: goto L76;
                case 433141802: goto L6a;
                case 1933739535: goto L61;
                default: goto L60;
            }
        L60:
            goto L87
        L61:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L87
            goto L8b
        L6a:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L73
            goto L87
        L73:
            df.k r6 = df.k.f10997a
            goto L8d
        L76:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
            goto L87
        L7f:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
        L87:
            return r1
        L88:
            df.k r6 = df.k.f10998b
            goto L8d
        L8b:
            df.k r6 = df.k.f10999c
        L8d:
            df.l r0 = new df.l
            boolean r1 = r2.f()
            if (r1 != 0) goto L97
            if (r7 == 0) goto L98
        L97:
            r4 = 1
        L98:
            r0.<init>(r6, r4)
            return r0
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ve.b.q(java.lang.Object, boolean):df.l");
    }

    private final p0 r(Object obj) {
        mf.c cVarK = k(obj);
        return (cVarK == null || !x.b().containsKey(cVarK)) ? s(obj) : (p0) this.f30547a.b().l(cVarK);
    }

    private final p0 s(Object obj) {
        p0 p0VarT = t(obj);
        return p0VarT != null ? p0VarT : this.f30547a.c().c();
    }

    private final p0 t(Object obj) {
        Iterable iterableC;
        String str;
        p0 p0Var = (p0) this.f30547a.c().e().get(k(obj));
        if (p0Var != null) {
            return p0Var;
        }
        Object objJ = j(obj, k0.p());
        if (objJ == null || (iterableC = c(objJ, false)) == null || (str = (String) ed.q.a0(iterableC)) == null) {
            return null;
        }
        p0 p0VarD = this.f30547a.c().d();
        if (p0VarD != null) {
            return p0VarD;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -2137067054) {
            if (iHashCode != -1838656823) {
                if (iHashCode == 2656902 && str.equals("WARN")) {
                    return p0.f30660d;
                }
            } else if (str.equals("STRICT")) {
                return p0.f30661e;
            }
        } else if (str.equals("IGNORE")) {
            return p0.f30659c;
        }
        return null;
    }

    private final w u(Object obj) {
        w wVar;
        if (this.f30547a.a() || (wVar = (w) x.a().get(k(obj))) == null) {
            return null;
        }
        p0 p0VarR = r(obj);
        if (p0VarR == p0.f30659c) {
            p0VarR = null;
        }
        if (p0VarR == null) {
            return null;
        }
        return w.b(wVar, df.l.b(wVar.d(), null, p0VarR.f(), 1, null), null, false, 6, null);
    }

    private final dd.q w(Object obj) {
        Object objJ;
        Object next;
        if (this.f30547a.c().f() || (objJ = j(obj, k0.g())) == null) {
            return null;
        }
        Iterator it = m(obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (v(next) != null) {
                break;
            }
        }
        if (next == null) {
            return null;
        }
        Iterable iterableC = c(objJ, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = iterableC.iterator();
        while (it2.hasNext()) {
            c cVar = (c) f30546d.get((String) it2.next());
            if (cVar != null) {
                linkedHashSet.add(cVar);
            }
        }
        return new dd.q(next, b(linkedHashSet));
    }

    protected abstract Iterable c(Object obj, boolean z10);

    public final f0 d(f0 f0Var, Iterable iterable) {
        EnumMap enumMapB;
        rd.m.e(iterable, "annotations");
        if (!this.f30547a.a()) {
            ArrayList<w> arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                w wVarE = e(it.next());
                if (wVarE != null) {
                    arrayList.add(wVarE);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(c.class);
                for (w wVar : arrayList) {
                    for (c cVar : wVar.e()) {
                        if (enumMap.containsKey(cVar) && o()) {
                            w wVar2 = (w) enumMap.get(cVar);
                            if (wVar2 != null) {
                                df.l lVarD = wVar2.d();
                                df.l lVarD2 = wVar.d();
                                if (!rd.m.a(lVarD2, lVarD) && (!lVarD2.d() || lVarD.d())) {
                                    wVar2 = (lVarD2.d() || !lVarD.d()) ? null : wVar;
                                }
                                enumMap.put(cVar, wVar2);
                            }
                        } else {
                            enumMap.put(cVar, wVar);
                        }
                    }
                }
                EnumMap enumMap2 = (f0Var == null || (enumMapB = f0Var.b()) == null) ? new EnumMap(c.class) : new EnumMap(enumMapB);
                boolean z10 = false;
                for (Map.Entry entry : enumMap.entrySet()) {
                    c cVar2 = (c) entry.getKey();
                    w wVar3 = (w) entry.getValue();
                    if (wVar3 != null) {
                        enumMap2.put(cVar2, wVar3);
                        z10 = true;
                    }
                }
                if (z10) {
                    return new f0(enumMap2);
                }
            }
        }
        return f0Var;
    }

    public final df.i g(Iterable iterable) {
        df.i iVar;
        rd.m.e(iterable, "annotations");
        Iterator it = iterable.iterator();
        df.i iVar2 = null;
        while (it.hasNext()) {
            mf.c cVarK = k(it.next());
            if (ed.q.T(k0.o(), cVarK)) {
                iVar = df.i.f10988a;
            } else if (ed.q.T(k0.l(), cVarK)) {
                iVar = df.i.f10989b;
            } else {
                continue;
            }
            if (iVar2 != null && iVar2 != iVar) {
                return null;
            }
            iVar2 = iVar;
        }
        return iVar2;
    }

    public final df.l h(Iterable iterable, qd.l lVar) {
        rd.m.e(iterable, "annotations");
        rd.m.e(lVar, "forceWarning");
        Iterator it = iterable.iterator();
        df.l lVar2 = null;
        while (it.hasNext()) {
            df.l lVarI = i(it.next(), lVar);
            if (lVar2 != null) {
                if (lVarI != null && !rd.m.a(lVarI, lVar2) && (!lVarI.d() || lVar2.d())) {
                    if (lVarI.d() || !lVar2.d()) {
                        return null;
                    }
                }
            }
            lVar2 = lVarI;
        }
        return lVar2;
    }

    protected abstract mf.c k(Object obj);

    protected abstract Object l(Object obj);

    protected abstract Iterable m(Object obj);

    public abstract boolean o();

    public final boolean p(Object obj) {
        rd.m.e(obj, "annotation");
        Object objJ = j(obj, o.a.H);
        if (objJ == null) {
            return false;
        }
        Iterable iterableC = c(objJ, false);
        if ((iterableC instanceof Collection) && ((Collection) iterableC).isEmpty()) {
            return false;
        }
        Iterator it = iterableC.iterator();
        while (it.hasNext()) {
            if (rd.m.a((String) it.next(), "TYPE")) {
                return true;
            }
        }
        return false;
    }

    public final Object v(Object obj) {
        Object objV;
        rd.m.e(obj, "annotation");
        if (this.f30547a.c().f()) {
            return null;
        }
        if (ed.q.T(k0.a(), k(obj)) || n(obj, k0.f())) {
            return obj;
        }
        if (!n(obj, k0.h())) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f30548b;
        Object objL = l(obj);
        V v10 = concurrentHashMap.get(objL);
        if (v10 != 0) {
            return v10;
        }
        Iterator it = m(obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                objV = null;
                break;
            }
            objV = v(it.next());
            if (objV != null) {
                break;
            }
        }
        if (objV == null) {
            return null;
        }
        V vPutIfAbsent = concurrentHashMap.putIfAbsent(objL, objV);
        return vPutIfAbsent == 0 ? objV : vPutIfAbsent;
    }
}
