package x6;

import com.fasterxml.jackson.databind.JavaType;
import d6.b;
import d6.h;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final r6.q f31702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final a f31703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f31704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JavaType f31705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final d f31706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final l0 f31707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final p6.b f31708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final boolean f31709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final boolean f31710i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected boolean f31711j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected LinkedHashMap f31712k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected LinkedList f31713l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected Map f31714m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected LinkedList f31715n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected LinkedList f31716o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected LinkedList f31717p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected LinkedList f31718q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected LinkedList f31719r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected LinkedList f31720s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected HashSet f31721t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected LinkedHashMap f31722u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final boolean f31723v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected String f31724w = "set";

    protected f0(r6.q qVar, boolean z10, JavaType javaType, d dVar, a aVar) {
        this.f31702a = qVar;
        this.f31704c = z10;
        this.f31705d = javaType;
        this.f31706e = dVar;
        this.f31710i = javaType.X();
        if (qVar.K()) {
            this.f31709h = true;
            this.f31708g = qVar.g();
        } else {
            this.f31709h = false;
            this.f31708g = p6.b.G0();
        }
        this.f31707f = qVar.v(javaType.r(), dVar);
        this.f31703b = aVar;
        this.f31723v = qVar.L(p6.r.USE_STD_BEAN_NAMING);
    }

    private void b(Map map, o oVar, String str) {
        String strT;
        if (str != null) {
            strT = str;
        } else {
            strT = this.f31708g.t(oVar);
            if (strT == null) {
                strT = "";
            }
        }
        p6.y yVarC = this.f31708g.C(oVar);
        boolean z10 = (yVarC == null || yVarC.h()) ? false : true;
        if (!z10) {
            if (strT.isEmpty()) {
                return;
            }
            h.a aVarH = this.f31708g.h(this.f31702a, oVar.s());
            boolean z11 = str != null;
            if ((aVarH == null || aVarH == h.a.DISABLED) && !z11) {
                return;
            } else {
                yVarC = p6.y.a(strT);
            }
        }
        p6.y yVar = yVarC;
        String strJ = j(strT);
        h0 h0VarP = (z10 && strJ.isEmpty()) ? p(map, yVar) : o(map, strJ);
        h0VarP.g0(oVar, yVar, z10, true, false);
        this.f31713l.add(h0VarP);
    }

    private boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((h0) it.next()).d().f()) {
                return true;
            }
        }
        return false;
    }

    private String j(String str) {
        p6.y yVar;
        Map map = this.f31714m;
        return (map == null || (yVar = (p6.y) map.get(n(str))) == null) ? str : yVar.c();
    }

    private p6.z m() {
        Object objG = this.f31708g.G(this.f31706e);
        if (objG == null) {
            this.f31702a.A();
            return null;
        }
        if (!(objG instanceof Class)) {
            N("AnnotationIntrospector returned PropertyNamingStrategy definition of type %s; expected type `PropertyNamingStrategy` or `Class<PropertyNamingStrategy>` instead", i7.h.h(objG));
        }
        Class cls = (Class) objG;
        if (cls == p6.z.class) {
            return null;
        }
        if (!p6.z.class.isAssignableFrom(cls)) {
            N("AnnotationIntrospector returned Class %s; expected `Class<PropertyNamingStrategy>`", i7.h.h(cls));
        }
        this.f31702a.w();
        android.support.v4.media.session.b.a(i7.h.l(cls, this.f31702a.b()));
        return null;
    }

    private p6.y n(String str) {
        return p6.y.b(str, null);
    }

    public k A() {
        if (!this.f31711j) {
            x();
        }
        LinkedList linkedList = this.f31718q;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            N("Multiple 'any-setter' fields defined (%s vs %s)", this.f31718q.get(0), this.f31718q.get(1));
        }
        return (k) this.f31718q.getFirst();
    }

    public l B() {
        if (!this.f31711j) {
            x();
        }
        LinkedList linkedList = this.f31717p;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            N("Multiple 'any-setter' methods defined (%s vs %s)", this.f31717p.get(0), this.f31717p.get(1));
        }
        return (l) this.f31717p.getFirst();
    }

    public d C() {
        return this.f31706e;
    }

    public r6.q D() {
        return this.f31702a;
    }

    public Set E() {
        return this.f31721t;
    }

    public Map F() {
        if (!this.f31711j) {
            x();
        }
        return this.f31722u;
    }

    public k G() {
        if (!this.f31711j) {
            x();
        }
        LinkedList linkedList = this.f31719r;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1 && !v(this.f31719r)) {
            N("Multiple 'as-key' properties defined (%s vs %s)", this.f31719r.get(0), this.f31719r.get(1));
        }
        return (k) this.f31719r.get(0);
    }

    public k H() {
        if (!this.f31711j) {
            x();
        }
        LinkedList linkedList = this.f31720s;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1 && !v(this.f31720s)) {
            N("Multiple 'as-value' properties defined (%s vs %s)", this.f31720s.get(0), this.f31720s.get(1));
        }
        return (k) this.f31720s.get(0);
    }

    public e0 I() {
        e0 e0VarK = this.f31708g.K(this.f31706e);
        return e0VarK != null ? this.f31708g.L(this.f31706e, e0VarK) : e0VarK;
    }

    public List J() {
        return new ArrayList(K().values());
    }

    protected Map K() {
        if (!this.f31711j) {
            x();
        }
        return this.f31712k;
    }

    public JavaType L() {
        return this.f31705d;
    }

    public boolean M() {
        return this.f31710i;
    }

    protected void N(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new IllegalArgumentException("Problem with definition of " + this.f31706e + ": " + str);
    }

    protected void a(Map map, o oVar) {
        b(map, oVar, null);
    }

    protected void c(Map map) {
        ArrayList arrayList;
        f fVarA;
        if (this.f31709h) {
            for (f fVar : this.f31706e.q()) {
                if (this.f31713l == null) {
                    this.f31713l = new LinkedList();
                }
                int iX = fVar.x();
                for (int i10 = 0; i10 < iX; i10++) {
                    a(map, fVar.v(i10));
                }
            }
            for (l lVar : this.f31706e.s()) {
                if (this.f31713l == null) {
                    this.f31713l = new LinkedList();
                }
                int iX2 = lVar.x();
                for (int i11 = 0; i11 < iX2; i11++) {
                    a(map, lVar.v(i11));
                }
            }
        }
        if (!M() || (fVarA = y6.a.a(this.f31706e, this.f31708g, this.f31702a, (arrayList = new ArrayList()))) == null) {
            return;
        }
        if (this.f31713l == null) {
            this.f31713l = new LinkedList();
        }
        HashSet hashSet = new HashSet();
        Iterator it = this.f31713l.iterator();
        while (it.hasNext()) {
            Iterator itS = ((h0) it.next()).s();
            while (itS.hasNext()) {
                o oVar = (o) itS.next();
                if (oVar.s().equals(fVarA)) {
                    hashSet.add(oVar);
                }
            }
        }
        if (this.f31713l.isEmpty() || !hashSet.isEmpty()) {
            for (int i12 = 0; i12 < fVarA.x(); i12++) {
                o oVarV = fVarA.v(i12);
                if (!hashSet.contains(oVarV)) {
                    b(map, oVarV, (String) arrayList.get(i12));
                }
            }
        }
    }

    protected void d(Map map) {
        boolean z10;
        p6.b bVar = this.f31708g;
        boolean z11 = (this.f31704c || this.f31702a.L(p6.r.ALLOW_FINAL_FIELDS_AS_MUTATORS)) ? false : true;
        boolean zL = this.f31702a.L(p6.r.PROPAGATE_TRANSIENT_MARKER);
        for (i iVar : this.f31706e.l()) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(bVar.x0(this.f31702a, iVar))) {
                if (this.f31719r == null) {
                    this.f31719r = new LinkedList();
                }
                this.f31719r.add(iVar);
            }
            if (bool.equals(bVar.y0(iVar))) {
                if (this.f31720s == null) {
                    this.f31720s = new LinkedList();
                }
                this.f31720s.add(iVar);
            } else {
                boolean zEquals = bool.equals(bVar.u0(iVar));
                boolean zEquals2 = bool.equals(bVar.w0(iVar));
                if (zEquals || zEquals2) {
                    if (zEquals) {
                        if (this.f31716o == null) {
                            this.f31716o = new LinkedList();
                        }
                        this.f31716o.add(iVar);
                    }
                    if (zEquals2) {
                        if (this.f31718q == null) {
                            this.f31718q = new LinkedList();
                        }
                        this.f31718q.add(iVar);
                    }
                } else {
                    String strT = bVar.t(iVar);
                    if (strT == null) {
                        strT = iVar.d();
                    }
                    String strD = this.f31703b.d(iVar, strT);
                    if (strD != null) {
                        p6.y yVarN = n(strD);
                        p6.y yVarE0 = bVar.e0(this.f31702a, iVar, yVarN);
                        if (yVarE0 != null && !yVarE0.equals(yVarN)) {
                            if (this.f31714m == null) {
                                this.f31714m = new HashMap();
                            }
                            this.f31714m.put(yVarE0, yVarN);
                        }
                        p6.y yVarD = this.f31704c ? bVar.D(iVar) : bVar.C(iVar);
                        boolean z12 = yVarD != null;
                        if (z12 && yVarD.h()) {
                            yVarD = n(strD);
                            z10 = false;
                        } else {
                            z10 = z12;
                        }
                        boolean zB = yVarD != null;
                        if (!zB) {
                            zB = this.f31707f.b(iVar);
                        }
                        boolean zB0 = bVar.B0(iVar);
                        if (iVar.t() && !z12) {
                            if (zL) {
                                zB0 = true;
                            }
                        }
                        if (!z11 || yVarD != null || zB0 || !Modifier.isFinal(iVar.s())) {
                            o(map, strD).h0(iVar, yVarD, z10, zB, zB0);
                        }
                    }
                }
            }
        }
    }

    protected void e(Map map, l lVar, p6.b bVar) {
        p6.y yVar;
        boolean z10;
        String strT;
        boolean z11;
        boolean zF;
        Class clsL = lVar.L();
        if (clsL != Void.TYPE) {
            if (clsL != Void.class || this.f31702a.L(p6.r.ALLOW_VOID_VALUED_PROPERTIES)) {
                Boolean bool = Boolean.TRUE;
                if (bool.equals(bVar.u0(lVar))) {
                    if (this.f31715n == null) {
                        this.f31715n = new LinkedList();
                    }
                    this.f31715n.add(lVar);
                    return;
                }
                if (bool.equals(bVar.x0(this.f31702a, lVar))) {
                    if (this.f31719r == null) {
                        this.f31719r = new LinkedList();
                    }
                    this.f31719r.add(lVar);
                    return;
                }
                if (bool.equals(bVar.y0(lVar))) {
                    if (this.f31720s == null) {
                        this.f31720s = new LinkedList();
                    }
                    this.f31720s.add(lVar);
                    return;
                }
                p6.y yVarD = bVar.D(lVar);
                boolean z12 = false;
                boolean z13 = yVarD != null;
                if (z13) {
                    String strT2 = bVar.t(lVar);
                    if (strT2 == null && (strT2 = this.f31703b.c(lVar, lVar.d())) == null) {
                        strT2 = this.f31703b.a(lVar, lVar.d());
                    }
                    if (strT2 == null) {
                        strT2 = lVar.d();
                    }
                    if (yVarD.h()) {
                        yVarD = n(strT2);
                    } else {
                        z12 = z13;
                    }
                    yVar = yVarD;
                    z10 = z12;
                    strT = strT2;
                    z11 = true;
                } else {
                    strT = bVar.t(lVar);
                    if (strT == null) {
                        strT = this.f31703b.c(lVar, lVar.d());
                    }
                    if (strT == null) {
                        strT = this.f31703b.a(lVar, lVar.d());
                        if (strT == null) {
                            return;
                        } else {
                            zF = this.f31707f.d(lVar);
                        }
                    } else {
                        zF = this.f31707f.f(lVar);
                    }
                    yVar = yVarD;
                    z11 = zF;
                    z10 = z13;
                }
                o(map, j(strT)).i0(lVar, yVar, z10, z11, bVar.B0(lVar));
            }
        }
    }

    protected void f(Map map) {
        for (k kVar : this.f31706e.l()) {
            l(this.f31708g.v(kVar), kVar);
        }
        for (l lVar : this.f31706e.w()) {
            if (lVar.x() == 1) {
                l(this.f31708g.v(lVar), lVar);
            }
        }
    }

    protected void g(Map map) {
        for (l lVar : this.f31706e.w()) {
            int iX = lVar.x();
            if (iX == 0) {
                e(map, lVar, this.f31708g);
            } else if (iX == 1) {
                h(map, lVar, this.f31708g);
            } else if (iX == 2 && Boolean.TRUE.equals(this.f31708g.w0(lVar))) {
                if (this.f31717p == null) {
                    this.f31717p = new LinkedList();
                }
                this.f31717p.add(lVar);
            }
        }
    }

    protected void h(Map map, l lVar, p6.b bVar) {
        boolean z10;
        String strT;
        boolean zG;
        p6.y yVarC = bVar.C(lVar);
        boolean z11 = false;
        boolean z12 = yVarC != null;
        if (z12) {
            String strT2 = bVar.t(lVar);
            if (strT2 == null) {
                strT2 = this.f31703b.b(lVar, lVar.d());
            }
            if (strT2 == null) {
                strT2 = lVar.d();
            }
            if (yVarC.h()) {
                yVarC = n(strT2);
            } else {
                z11 = z12;
            }
            z10 = z11;
            strT = strT2;
            zG = true;
        } else {
            strT = bVar.t(lVar);
            if (strT == null) {
                strT = this.f31703b.b(lVar, lVar.d());
            }
            if (strT == null) {
                return;
            }
            zG = this.f31707f.g(lVar);
            z10 = z12;
        }
        p6.y yVar = yVarC;
        o(map, j(strT)).j0(lVar, yVar, z10, zG, bVar.B0(lVar));
    }

    protected void k(String str) {
        if (this.f31704c || str == null) {
            return;
        }
        if (this.f31721t == null) {
            this.f31721t = new HashSet();
        }
        this.f31721t.add(str);
    }

    protected void l(b.a aVar, k kVar) {
        if (aVar == null) {
            return;
        }
        Object objE = aVar.e();
        if (this.f31722u == null) {
            this.f31722u = new LinkedHashMap();
        }
        k kVar2 = (k) this.f31722u.put(objE, kVar);
        if (kVar2 == null || kVar2.getClass() != kVar.getClass()) {
            return;
        }
        N("Duplicate injectable value with id '%s' (of type %s)", objE, i7.h.h(objE));
    }

    protected h0 o(Map map, String str) {
        h0 h0Var = (h0) map.get(str);
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0Var2 = new h0(this.f31702a, this.f31708g, this.f31704c, p6.y.a(str));
        map.put(str, h0Var2);
        return h0Var2;
    }

    protected h0 p(Map map, p6.y yVar) {
        String strC = yVar.c();
        h0 h0Var = (h0) map.get(strC);
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0Var2 = new h0(this.f31702a, this.f31708g, this.f31704c, yVar);
        map.put(strC, h0Var2);
        return h0Var2;
    }

    protected void q(Map map) {
        boolean z10 = !M() && this.f31702a.L(p6.r.INFER_PROPERTY_MUTATORS);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((h0) it.next()).z0(z10, this.f31704c ? null : this);
        }
    }

    protected void r(Map map) {
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            h0 h0Var = (h0) it.next();
            if (!h0Var.m0()) {
                it.remove();
            } else if (h0Var.l0()) {
                if (M()) {
                    h0Var.y0();
                    k(h0Var.getName());
                } else if (h0Var.k0()) {
                    h0Var.y0();
                    if (!h0Var.g()) {
                        k(h0Var.getName());
                    }
                } else {
                    it.remove();
                    k(h0Var.getName());
                }
            }
        }
    }

    protected void s(Map map) {
        HashSet hashSet;
        Iterator it = map.entrySet().iterator();
        LinkedList<h0> linkedList = null;
        while (it.hasNext()) {
            h0 h0Var = (h0) ((Map.Entry) it.next()).getValue();
            Set setQ0 = h0Var.q0();
            if (!setQ0.isEmpty()) {
                it.remove();
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                if (setQ0.size() == 1) {
                    linkedList.add(h0Var.B0((p6.y) setQ0.iterator().next()));
                } else {
                    linkedList.addAll(h0Var.o0(setQ0));
                }
            }
        }
        if (linkedList != null) {
            for (h0 h0Var2 : linkedList) {
                String name = h0Var2.getName();
                h0 h0Var3 = (h0) map.get(name);
                if (h0Var3 == null) {
                    map.put(name, h0Var2);
                } else {
                    h0Var3.f0(h0Var2);
                }
                if (u(h0Var2, this.f31713l) && (hashSet = this.f31721t) != null) {
                    hashSet.remove(name);
                }
            }
        }
    }

    protected void t(Map map) {
        p6.y yVarT0;
        Iterator it = map.entrySet().iterator();
        LinkedList<h0> linkedList = null;
        while (it.hasNext()) {
            h0 h0Var = (h0) ((Map.Entry) it.next()).getValue();
            k kVarY = h0Var.y();
            if (kVarY != null && (yVarT0 = this.f31708g.t0(kVarY)) != null && yVarT0.e() && !yVarT0.equals(h0Var.a())) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(h0Var.B0(yVarT0));
                it.remove();
            }
        }
        if (linkedList != null) {
            for (h0 h0Var2 : linkedList) {
                String name = h0Var2.getName();
                h0 h0Var3 = (h0) map.get(name);
                if (h0Var3 == null) {
                    map.put(name, h0Var2);
                } else {
                    h0Var3.f0(h0Var2);
                }
            }
        }
    }

    protected boolean u(h0 h0Var, List list) {
        if (list != null) {
            String strT0 = h0Var.t0();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((h0) list.get(i10)).t0().equals(strT0)) {
                    list.set(i10, h0Var);
                    return true;
                }
            }
        }
        return false;
    }

    protected boolean v(List list) {
        do {
            k kVar = (k) list.get(0);
            k kVar2 = (k) list.get(1);
            if (kVar instanceof i) {
                if (!(kVar2 instanceof l)) {
                    return false;
                }
                list.remove(0);
            } else {
                if (!(kVar instanceof l) || !(kVar2 instanceof i)) {
                    return false;
                }
                list.remove(1);
            }
        } while (list.size() > 1);
        return true;
    }

    protected void w(Map map) {
        Collection<h0> collectionValues;
        p6.b bVar = this.f31708g;
        Boolean boolJ0 = bVar.j0(this.f31706e);
        boolean zO = boolJ0 == null ? this.f31702a.O() : boolJ0.booleanValue();
        boolean zI = i(map.values());
        String[] strArrI0 = bVar.i0(this.f31706e);
        if (zO || zI || this.f31713l != null || strArrI0 != null) {
            int size = map.size();
            Map treeMap = zO ? new TreeMap() : new LinkedHashMap(size + size);
            for (h0 h0Var : map.values()) {
                treeMap.put(h0Var.getName(), h0Var);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(size + size);
            if (strArrI0 != null) {
                for (String name : strArrI0) {
                    h0 h0Var2 = (h0) treeMap.remove(name);
                    if (h0Var2 == null) {
                        Iterator it = map.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            h0 h0Var3 = (h0) it.next();
                            if (name.equals(h0Var3.t0())) {
                                name = h0Var3.getName();
                                h0Var2 = h0Var3;
                                break;
                            }
                        }
                    }
                    if (h0Var2 != null) {
                        linkedHashMap.put(name, h0Var2);
                    }
                }
            }
            if (zI) {
                TreeMap treeMap2 = new TreeMap();
                Iterator it2 = treeMap.entrySet().iterator();
                while (it2.hasNext()) {
                    h0 h0Var4 = (h0) ((Map.Entry) it2.next()).getValue();
                    Integer numC = h0Var4.d().c();
                    if (numC != null) {
                        treeMap2.put(numC, h0Var4);
                        it2.remove();
                    }
                }
                for (h0 h0Var5 : treeMap2.values()) {
                    linkedHashMap.put(h0Var5.getName(), h0Var5);
                }
            }
            if (this.f31713l != null && (!zO || this.f31702a.L(p6.r.SORT_CREATOR_PROPERTIES_FIRST))) {
                if (zO) {
                    TreeMap treeMap3 = new TreeMap();
                    for (h0 h0Var6 : this.f31713l) {
                        treeMap3.put(h0Var6.getName(), h0Var6);
                    }
                    collectionValues = treeMap3.values();
                } else {
                    collectionValues = this.f31713l;
                }
                for (h0 h0Var7 : collectionValues) {
                    String name2 = h0Var7.getName();
                    if (treeMap.containsKey(name2)) {
                        linkedHashMap.put(name2, h0Var7);
                    }
                }
            }
            linkedHashMap.putAll(treeMap);
            map.clear();
            map.putAll(linkedHashMap);
        }
    }

    protected void x() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!M() || this.f31704c) {
            d(linkedHashMap);
        }
        g(linkedHashMap);
        if (!this.f31706e.v()) {
            c(linkedHashMap);
        }
        r(linkedHashMap);
        q(linkedHashMap);
        s(linkedHashMap);
        f(linkedHashMap);
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((h0) it.next()).w0(this.f31704c);
        }
        m();
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            ((h0) it2.next()).A0();
        }
        if (this.f31702a.L(p6.r.USE_WRAPPER_NAME_AS_PROPERTY_NAME)) {
            t(linkedHashMap);
        }
        w(linkedHashMap);
        this.f31712k = linkedHashMap;
        this.f31711j = true;
    }

    public k y() {
        if (!this.f31711j) {
            x();
        }
        LinkedList linkedList = this.f31716o;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            N("Multiple 'any-getter' fields defined (%s vs %s)", this.f31716o.get(0), this.f31716o.get(1));
        }
        return (k) this.f31716o.getFirst();
    }

    public k z() {
        if (!this.f31711j) {
            x();
        }
        LinkedList linkedList = this.f31715n;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            N("Multiple 'any-getter' methods defined (%s vs %s)", this.f31715n.get(0), this.f31715n.get(1));
        }
        return (k) this.f31715n.getFirst();
    }
}
