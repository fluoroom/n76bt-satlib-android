package x6;

import com.fasterxml.jackson.databind.JavaType;
import d6.r;
import d6.w;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;
import p6.b;

/* JADX INFO: loaded from: classes.dex */
public class h0 extends u implements Comparable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final b.a f31728v = b.a.e("");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final boolean f31729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final r6.q f31730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final p6.b f31731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final p6.y f31732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final p6.y f31733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected g f31734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected g f31735h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected g f31736r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected g f31737s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected transient p6.x f31738t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected transient b.a f31739u;

    class a implements i {
        a() {
        }

        @Override // x6.h0.i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Class[] a(k kVar) {
            return h0.this.f31731d.s0(kVar);
        }
    }

    class b implements i {
        b() {
        }

        @Override // x6.h0.i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b.a a(k kVar) {
            return h0.this.f31731d.d0(kVar);
        }
    }

    class c implements i {
        c() {
        }

        @Override // x6.h0.i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(k kVar) {
            return h0.this.f31731d.F0(kVar);
        }
    }

    class d implements i {
        d() {
        }

        @Override // x6.h0.i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e0 a(k kVar) {
            e0 e0VarK = h0.this.f31731d.K(kVar);
            return e0VarK != null ? h0.this.f31731d.L(kVar, e0VarK) : e0VarK;
        }
    }

    class e implements i {
        e() {
        }

        @Override // x6.h0.i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public w.a a(k kVar) {
            return h0.this.f31731d.Q(kVar);
        }
    }

    static /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31745a;

        static {
            int[] iArr = new int[w.a.values().length];
            f31745a = iArr;
            try {
                iArr[w.a.READ_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31745a[w.a.READ_WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31745a[w.a.WRITE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31745a[w.a.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    protected static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f31746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f31747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p6.y f31748c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f31749d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f31750e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f31751f;

        public g(Object obj, g gVar, p6.y yVar, boolean z10, boolean z11, boolean z12) {
            this.f31746a = obj;
            this.f31747b = gVar;
            p6.y yVar2 = (yVar == null || yVar.h()) ? null : yVar;
            this.f31748c = yVar2;
            if (z10) {
                if (yVar2 == null) {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                }
                if (!yVar.e()) {
                    z10 = false;
                }
            }
            this.f31749d = z10;
            this.f31750e = z11;
            this.f31751f = z12;
        }

        protected g a(g gVar) {
            g gVar2 = this.f31747b;
            return gVar2 == null ? c(gVar) : c(gVar2.a(gVar));
        }

        public g b() {
            g gVar = this.f31747b;
            if (gVar == null) {
                return this;
            }
            g gVarB = gVar.b();
            if (this.f31748c != null) {
                return gVarB.f31748c == null ? c(null) : c(gVarB);
            }
            if (gVarB.f31748c != null) {
                return gVarB;
            }
            boolean z10 = this.f31750e;
            return z10 == gVarB.f31750e ? c(gVarB) : z10 ? c(null) : gVarB;
        }

        public g c(g gVar) {
            return gVar == this.f31747b ? this : new g(this.f31746a, gVar, this.f31748c, this.f31749d, this.f31750e, this.f31751f);
        }

        public g d(Object obj) {
            return obj == this.f31746a ? this : new g(obj, this.f31747b, this.f31748c, this.f31749d, this.f31750e, this.f31751f);
        }

        public g e() {
            g gVarE;
            if (!this.f31751f) {
                g gVar = this.f31747b;
                return (gVar == null || (gVarE = gVar.e()) == this.f31747b) ? this : c(gVarE);
            }
            g gVar2 = this.f31747b;
            if (gVar2 == null) {
                return null;
            }
            return gVar2.e();
        }

        public g f() {
            return this.f31747b == null ? this : new g(this.f31746a, null, this.f31748c, this.f31749d, this.f31750e, this.f31751f);
        }

        public g g() {
            g gVar = this.f31747b;
            g gVarG = gVar == null ? null : gVar.g();
            return this.f31750e ? c(gVarG) : gVarG;
        }

        public String toString() {
            String str = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", this.f31746a.toString(), Boolean.valueOf(this.f31750e), Boolean.valueOf(this.f31751f), Boolean.valueOf(this.f31749d));
            if (this.f31747b == null) {
                return str;
            }
            return str + ", " + this.f31747b.toString();
        }
    }

    protected static class h implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g f31752a;

        public h(g gVar) {
            this.f31752a = gVar;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k next() {
            g gVar = this.f31752a;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            k kVar = (k) gVar.f31746a;
            this.f31752a = gVar.f31747b;
            return kVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31752a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private interface i {
        Object a(k kVar);
    }

    public h0(r6.q qVar, p6.b bVar, boolean z10, p6.y yVar) {
        this(qVar, bVar, z10, yVar, yVar);
    }

    private boolean L(g gVar) {
        while (gVar != null) {
            if (gVar.f31748c != null && gVar.f31749d) {
                return true;
            }
            gVar = gVar.f31747b;
        }
        return false;
    }

    private boolean M(g gVar) {
        while (gVar != null) {
            if (!gVar.f31751f && gVar.f31748c != null && gVar.f31749d) {
                return true;
            }
            gVar = gVar.f31747b;
        }
        return false;
    }

    private boolean N(g gVar) {
        while (gVar != null) {
            p6.y yVar = gVar.f31748c;
            if (yVar != null && yVar.e()) {
                return true;
            }
            gVar = gVar.f31747b;
        }
        return false;
    }

    private boolean O(g gVar) {
        p6.y yVar;
        while (gVar != null) {
            if (!gVar.f31751f && (yVar = gVar.f31748c) != null && yVar.e()) {
                return true;
            }
            gVar = gVar.f31747b;
        }
        return false;
    }

    private boolean P(g gVar) {
        while (gVar != null) {
            if (gVar.f31751f) {
                return true;
            }
            gVar = gVar.f31747b;
        }
        return false;
    }

    private boolean Q(g gVar) {
        while (gVar != null) {
            if (gVar.f31750e) {
                return true;
            }
            gVar = gVar.f31747b;
        }
        return false;
    }

    private g R(g gVar, r rVar) {
        k kVar = (k) ((k) gVar.f31746a).q(rVar);
        g gVar2 = gVar.f31747b;
        if (gVar2 != null) {
            gVar = gVar.c(R(gVar2, rVar));
        }
        return gVar.d(kVar);
    }

    private void S(Collection collection, Map map, g gVar) {
        for (g gVar2 = gVar; gVar2 != null; gVar2 = gVar2.f31747b) {
            p6.y yVar = gVar2.f31748c;
            if (gVar2.f31749d && yVar != null) {
                h0 h0Var = (h0) map.get(yVar);
                if (h0Var == null) {
                    h0Var = new h0(this.f31730c, this.f31731d, this.f31729b, this.f31733f, yVar);
                    map.put(yVar, h0Var);
                }
                if (gVar == this.f31734g) {
                    h0Var.f31734g = gVar2.c(h0Var.f31734g);
                } else if (gVar == this.f31736r) {
                    h0Var.f31736r = gVar2.c(h0Var.f31736r);
                } else if (gVar == this.f31737s) {
                    h0Var.f31737s = gVar2.c(h0Var.f31737s);
                } else {
                    if (gVar != this.f31735h) {
                        throw new IllegalStateException("Internal error: mismatched accessors, property: " + this);
                    }
                    h0Var.f31735h = gVar2.c(h0Var.f31735h);
                }
            } else if (gVar2.f31750e) {
                throw new IllegalStateException("Conflicting/ambiguous property name definitions (implicit name " + i7.h.W(this.f31732e) + "): found multiple explicit names: " + collection + ", but also implicit accessor: " + gVar2);
            }
        }
    }

    private Set T(g gVar, Set set) {
        while (gVar != null) {
            if (gVar.f31749d && gVar.f31748c != null) {
                if (set == null) {
                    set = new HashSet();
                }
                set.add(gVar.f31748c);
            }
            gVar = gVar.f31747b;
        }
        return set;
    }

    private r U(g gVar) {
        r rVarJ = ((k) gVar.f31746a).j();
        g gVar2 = gVar.f31747b;
        return gVar2 != null ? r.f(rVarJ, U(gVar2)) : rVarJ;
    }

    private r X(int i10, g... gVarArr) {
        r rVarU = U(gVarArr[i10]);
        do {
            i10++;
            if (i10 >= gVarArr.length) {
                return rVarU;
            }
        } while (gVarArr[i10] == null);
        return r.f(rVarU, X(i10, gVarArr));
    }

    private g Z(g gVar) {
        return gVar == null ? gVar : gVar.e();
    }

    private g a0(g gVar) {
        return gVar == null ? gVar : gVar.g();
    }

    private g e0(g gVar) {
        return gVar == null ? gVar : gVar.b();
    }

    private static g v0(g gVar, g gVar2) {
        return gVar == null ? gVar2 : gVar2 == null ? gVar : gVar.a(gVar2);
    }

    @Override // x6.u
    public JavaType A() {
        if (this.f31729b) {
            x6.b bVarV = v();
            return (bVarV == null && (bVarV = u()) == null) ? com.fasterxml.jackson.databind.type.c.b0() : bVarV.f();
        }
        x6.b bVarR = r();
        if (bVarR == null) {
            l lVarC = C();
            if (lVarC != null) {
                return lVarC.z(0);
            }
            bVarR = u();
        }
        return (bVarR == null && (bVarR = v()) == null) ? com.fasterxml.jackson.databind.type.c.b0() : bVarR.f();
    }

    public void A0() {
        this.f31734g = e0(this.f31734g);
        this.f31736r = e0(this.f31736r);
        this.f31737s = e0(this.f31737s);
        this.f31735h = e0(this.f31735h);
    }

    @Override // x6.u
    public Class B() {
        return A().r();
    }

    public h0 B0(p6.y yVar) {
        return new h0(this, yVar);
    }

    @Override // x6.u
    public l C() {
        g gVar = this.f31737s;
        if (gVar == null) {
            return null;
        }
        g gVar2 = gVar.f31747b;
        if (gVar2 == null) {
            return (l) gVar.f31746a;
        }
        while (gVar2 != null) {
            l lVarB0 = b0((l) gVar.f31746a, (l) gVar2.f31746a);
            if (lVarB0 != gVar.f31746a) {
                if (lVarB0 != gVar2.f31746a) {
                    return c0(gVar, gVar2);
                }
                gVar = gVar2;
            }
            gVar2 = gVar2.f31747b;
        }
        this.f31737s = gVar.f();
        return (l) gVar.f31746a;
    }

    @Override // x6.u
    public p6.y D() {
        p6.b bVar;
        k kVarY = y();
        if (kVarY == null || (bVar = this.f31731d) == null) {
            return null;
        }
        return bVar.t0(kVarY);
    }

    @Override // x6.u
    public boolean E() {
        return this.f31735h != null;
    }

    @Override // x6.u
    public boolean F() {
        return this.f31734g != null;
    }

    @Override // x6.u
    public boolean G(p6.y yVar) {
        return this.f31732e.equals(yVar);
    }

    @Override // x6.u
    public boolean H() {
        return this.f31737s != null;
    }

    @Override // x6.u
    public boolean I() {
        return N(this.f31734g) || N(this.f31736r) || N(this.f31737s) || L(this.f31735h);
    }

    @Override // x6.u
    public boolean J() {
        return L(this.f31734g) || L(this.f31736r) || L(this.f31737s) || L(this.f31735h);
    }

    @Override // x6.u
    public boolean K() {
        Boolean bool = (Boolean) r0(new c());
        return bool != null && bool.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035 A[PHI: r1 r7
      0x0035: PHI (r1v3 boolean) = (r1v0 boolean), (r1v6 boolean) binds: [B:5:0x000b, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r7v5 p6.x) = (r7v0 p6.x), (r7v9 p6.x) binds: [B:5:0x000b, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected p6.x V(p6.x r7, x6.k r8) {
        /*
            r6 = this;
            x6.k r0 = r6.q()
            r1 = 1
            r2 = 0
            if (r8 == 0) goto L72
            p6.b r3 = r6.f31731d
            r4 = 0
            if (r3 == 0) goto L35
            if (r0 == 0) goto L24
            java.lang.Boolean r3 = r3.A(r8)
            if (r3 == 0) goto L24
            boolean r1 = r3.booleanValue()
            if (r1 == 0) goto L23
            p6.x$a r1 = p6.x.a.b(r0)
            p6.x r7 = r7.i(r1)
        L23:
            r1 = 0
        L24:
            p6.b r3 = r6.f31731d
            d6.b0$a r3 = r3.m0(r8)
            if (r3 == 0) goto L35
            d6.j0 r2 = r3.g()
            d6.j0 r3 = r3.f()
            goto L36
        L35:
            r3 = r2
        L36:
            if (r1 != 0) goto L3c
            if (r2 == 0) goto L3c
            if (r3 != 0) goto L73
        L3c:
            java.lang.Class r8 = r6.Y(r8)
            r6.q r5 = r6.f31730c
            r6.g r8 = r5.j(r8)
            d6.b0$a r5 = r8.h()
            if (r5 == 0) goto L58
            if (r2 != 0) goto L52
            d6.j0 r2 = r5.g()
        L52:
            if (r3 != 0) goto L58
            d6.j0 r3 = r5.f()
        L58:
            if (r1 == 0) goto L73
            if (r0 == 0) goto L73
            java.lang.Boolean r8 = r8.g()
            if (r8 == 0) goto L73
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L70
            p6.x$a r8 = p6.x.a.c(r0)
            p6.x r7 = r7.i(r8)
        L70:
            r1 = 0
            goto L73
        L72:
            r3 = r2
        L73:
            if (r1 != 0) goto L79
            if (r2 == 0) goto L79
            if (r3 != 0) goto La5
        L79:
            r6.q r8 = r6.f31730c
            d6.b0$a r8 = r8.s()
            if (r2 != 0) goto L85
            d6.j0 r2 = r8.g()
        L85:
            if (r3 != 0) goto L8b
            d6.j0 r3 = r8.f()
        L8b:
            if (r1 == 0) goto La5
            r6.q r8 = r6.f31730c
            java.lang.Boolean r8 = r8.o()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto La5
            if (r0 == 0) goto La5
            p6.x$a r8 = p6.x.a.a(r0)
            p6.x r7 = r7.i(r8)
        La5:
            if (r2 != 0) goto Lab
            if (r3 == 0) goto Laa
            goto Lab
        Laa:
            return r7
        Lab:
            p6.x r7 = r7.j(r2, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.h0.V(p6.x, x6.k):p6.x");
    }

    protected int W(l lVar) {
        String strD = lVar.d();
        if (!strD.startsWith("get") || strD.length() <= 3) {
            return (!strD.startsWith("is") || strD.length() <= 2) ? 3 : 2;
        }
        return 1;
    }

    protected Class Y(k kVar) {
        if (kVar instanceof l) {
            l lVar = (l) kVar;
            if (lVar.x() > 0) {
                return lVar.z(0).r();
            }
        }
        return kVar.f().r();
    }

    @Override // x6.u
    public p6.y a() {
        return this.f31732e;
    }

    protected l b0(l lVar, l lVar2) {
        Class<?> clsK = lVar.k();
        Class<?> clsK2 = lVar2.k();
        if (clsK != clsK2) {
            if (!clsK.isAssignableFrom(clsK2)) {
                if (!clsK2.isAssignableFrom(clsK)) {
                }
            }
        }
        int iD0 = d0(lVar2);
        int iD02 = d0(lVar);
        if (iD0 != iD02) {
            return iD0 < iD02 ? lVar2 : lVar;
        }
        p6.b bVar = this.f31731d;
        if (bVar == null) {
            return null;
        }
        return bVar.J0(this.f31730c, lVar, lVar2);
    }

    protected l c0(g gVar, g gVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(gVar.f31746a);
        arrayList.add(gVar2.f31746a);
        for (g gVar3 = gVar2.f31747b; gVar3 != null; gVar3 = gVar3.f31747b) {
            l lVarB0 = b0((l) gVar.f31746a, (l) gVar3.f31746a);
            if (lVarB0 != gVar.f31746a) {
                Object obj = gVar3.f31746a;
                if (lVarB0 == obj) {
                    arrayList.clear();
                    gVar = gVar3;
                } else {
                    arrayList.add(obj);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s", getName(), (String) Collection.EL.stream(arrayList).map(new Function() { // from class: x6.g0
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return ((l) obj2).l();
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining(" vs "))));
        }
        this.f31737s = gVar.f();
        return (l) gVar.f31746a;
    }

    @Override // x6.u
    public p6.x d() {
        if (this.f31738t == null) {
            k kVarU0 = u0();
            if (kVarU0 == null) {
                this.f31738t = p6.x.f24069s;
            } else {
                Boolean boolC0 = this.f31731d.C0(kVarU0);
                String strW = this.f31731d.W(kVarU0);
                Integer numB0 = this.f31731d.b0(kVarU0);
                String strT = this.f31731d.T(kVarU0);
                if (boolC0 == null && numB0 == null && strT == null) {
                    p6.x xVarH = p6.x.f24069s;
                    if (strW != null) {
                        xVarH = xVarH.h(strW);
                    }
                    this.f31738t = xVarH;
                } else {
                    this.f31738t = p6.x.a(boolC0, strW, numB0, strT);
                }
                if (!this.f31729b) {
                    this.f31738t = V(this.f31738t, kVarU0);
                }
            }
        }
        return this.f31738t;
    }

    protected int d0(l lVar) {
        String strD = lVar.d();
        return (!strD.startsWith("set") || strD.length() <= 3) ? 2 : 1;
    }

    public void f0(h0 h0Var) {
        this.f31734g = v0(this.f31734g, h0Var.f31734g);
        this.f31735h = v0(this.f31735h, h0Var.f31735h);
        this.f31736r = v0(this.f31736r, h0Var.f31736r);
        this.f31737s = v0(this.f31737s, h0Var.f31737s);
    }

    @Override // x6.u
    public boolean g() {
        return (this.f31735h == null && this.f31737s == null && this.f31734g == null) ? false : true;
    }

    public void g0(o oVar, p6.y yVar, boolean z10, boolean z11, boolean z12) {
        this.f31735h = new g(oVar, this.f31735h, yVar, z10, z11, z12);
    }

    @Override // x6.u, i7.t
    public String getName() {
        p6.y yVar = this.f31732e;
        if (yVar == null) {
            return null;
        }
        return yVar.c();
    }

    public void h0(x6.i iVar, p6.y yVar, boolean z10, boolean z11, boolean z12) {
        this.f31734g = new g(iVar, this.f31734g, yVar, z10, z11, z12);
    }

    @Override // x6.u
    public boolean i() {
        return (this.f31736r == null && this.f31734g == null) ? false : true;
    }

    public void i0(l lVar, p6.y yVar, boolean z10, boolean z11, boolean z12) {
        this.f31736r = new g(lVar, this.f31736r, yVar, z10, z11, z12);
    }

    @Override // x6.u
    public r.b j() {
        k kVarQ = q();
        p6.b bVar = this.f31731d;
        r.b bVarZ = bVar == null ? null : bVar.Z(kVarQ);
        return bVarZ == null ? r.b.c() : bVarZ;
    }

    public void j0(l lVar, p6.y yVar, boolean z10, boolean z11, boolean z12) {
        this.f31737s = new g(lVar, this.f31737s, yVar, z10, z11, z12);
    }

    @Override // x6.u
    public e0 k() {
        return (e0) r0(new d());
    }

    public boolean k0() {
        return O(this.f31734g) || O(this.f31736r) || O(this.f31737s) || M(this.f31735h);
    }

    public boolean l0() {
        return P(this.f31734g) || P(this.f31736r) || P(this.f31737s) || P(this.f31735h);
    }

    @Override // x6.u
    public b.a m() {
        b.a aVar = this.f31739u;
        if (aVar != null) {
            if (aVar == f31728v) {
                return null;
            }
            return aVar;
        }
        b.a aVar2 = (b.a) r0(new b());
        this.f31739u = aVar2 == null ? f31728v : aVar2;
        return aVar2;
    }

    public boolean m0() {
        return Q(this.f31734g) || Q(this.f31736r) || Q(this.f31737s) || Q(this.f31735h);
    }

    @Override // x6.u
    public Class[] n() {
        return (Class[]) r0(new a());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public int compareTo(h0 h0Var) {
        if (this.f31735h != null) {
            if (h0Var.f31735h == null) {
                return -1;
            }
        } else if (h0Var.f31735h != null) {
            return 1;
        }
        return getName().compareTo(h0Var.getName());
    }

    public java.util.Collection o0(java.util.Collection collection) {
        HashMap map = new HashMap();
        S(collection, map, this.f31734g);
        S(collection, map, this.f31736r);
        S(collection, map, this.f31737s);
        S(collection, map, this.f31735h);
        return map.values();
    }

    public w.a p0() {
        return (w.a) s0(new e(), w.a.AUTO);
    }

    public Set q0() {
        Set setT = T(this.f31735h, T(this.f31737s, T(this.f31736r, T(this.f31734g, null))));
        return setT == null ? Collections.EMPTY_SET : setT;
    }

    @Override // x6.u
    public o r() {
        g gVar = this.f31735h;
        if (gVar == null) {
            return null;
        }
        while (!(((o) gVar.f31746a).s() instanceof x6.f)) {
            gVar = gVar.f31747b;
            if (gVar == null) {
                return (o) this.f31735h.f31746a;
            }
        }
        return (o) gVar.f31746a;
    }

    protected Object r0(i iVar) {
        g gVar;
        g gVar2;
        if (this.f31731d != null) {
            if (this.f31729b) {
                g gVar3 = this.f31736r;
                if (gVar3 != null) {
                    objA = iVar.a((k) gVar3.f31746a);
                }
            } else {
                g gVar4 = this.f31735h;
                objA = gVar4 != null ? iVar.a((k) gVar4.f31746a) : null;
                if (objA == null && (gVar = this.f31737s) != null) {
                    objA = iVar.a((k) gVar.f31746a);
                }
            }
            if (objA == null && (gVar2 = this.f31734g) != null) {
                return iVar.a((k) gVar2.f31746a);
            }
        }
        return objA;
    }

    @Override // x6.u
    public Iterator s() {
        g gVar = this.f31735h;
        return gVar == null ? i7.h.n() : new h(gVar);
    }

    protected Object s0(i iVar, Object obj) {
        Object objA;
        Object objA2;
        Object objA3;
        Object objA4;
        Object objA5;
        Object objA6;
        Object objA7;
        Object objA8;
        if (this.f31731d == null) {
            return null;
        }
        if (this.f31729b) {
            g gVar = this.f31736r;
            if (gVar != null && (objA8 = iVar.a((k) gVar.f31746a)) != null && objA8 != obj) {
                return objA8;
            }
            g gVar2 = this.f31734g;
            if (gVar2 != null && (objA7 = iVar.a((k) gVar2.f31746a)) != null && objA7 != obj) {
                return objA7;
            }
            g gVar3 = this.f31735h;
            if (gVar3 != null && (objA6 = iVar.a((k) gVar3.f31746a)) != null && objA6 != obj) {
                return objA6;
            }
            g gVar4 = this.f31737s;
            if (gVar4 == null || (objA5 = iVar.a((k) gVar4.f31746a)) == null || objA5 == obj) {
                return null;
            }
            return objA5;
        }
        g gVar5 = this.f31735h;
        if (gVar5 != null && (objA4 = iVar.a((k) gVar5.f31746a)) != null && objA4 != obj) {
            return objA4;
        }
        g gVar6 = this.f31737s;
        if (gVar6 != null && (objA3 = iVar.a((k) gVar6.f31746a)) != null && objA3 != obj) {
            return objA3;
        }
        g gVar7 = this.f31734g;
        if (gVar7 != null && (objA2 = iVar.a((k) gVar7.f31746a)) != null && objA2 != obj) {
            return objA2;
        }
        g gVar8 = this.f31736r;
        if (gVar8 == null || (objA = iVar.a((k) gVar8.f31746a)) == null || objA == obj) {
            return null;
        }
        return objA;
    }

    public String t0() {
        return this.f31733f.c();
    }

    public String toString() {
        return "[Property '" + this.f31732e + "'; ctors: " + this.f31735h + ", field(s): " + this.f31734g + ", getter(s): " + this.f31736r + ", setter(s): " + this.f31737s + "]";
    }

    @Override // x6.u
    public x6.i u() {
        g gVar = this.f31734g;
        if (gVar == null) {
            return null;
        }
        x6.i iVar = (x6.i) gVar.f31746a;
        for (g gVar2 = gVar.f31747b; gVar2 != null; gVar2 = gVar2.f31747b) {
            x6.i iVar2 = (x6.i) gVar2.f31746a;
            Class<?> clsK = iVar.k();
            Class clsK2 = iVar2.k();
            if (clsK != clsK2) {
                if (clsK.isAssignableFrom(clsK2)) {
                    iVar = iVar2;
                } else if (clsK2.isAssignableFrom(clsK)) {
                }
            }
            throw new IllegalArgumentException("Multiple fields representing property \"" + getName() + "\": " + iVar.l() + " vs " + iVar2.l());
        }
        return iVar;
    }

    protected k u0() {
        if (this.f31729b) {
            g gVar = this.f31736r;
            if (gVar != null) {
                return (k) gVar.f31746a;
            }
            g gVar2 = this.f31734g;
            if (gVar2 != null) {
                return (k) gVar2.f31746a;
            }
            return null;
        }
        g gVar3 = this.f31735h;
        if (gVar3 != null) {
            return (k) gVar3.f31746a;
        }
        g gVar4 = this.f31737s;
        if (gVar4 != null) {
            return (k) gVar4.f31746a;
        }
        g gVar5 = this.f31734g;
        if (gVar5 != null) {
            return (k) gVar5.f31746a;
        }
        g gVar6 = this.f31736r;
        if (gVar6 != null) {
            return (k) gVar6.f31746a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    @Override // x6.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public x6.l v() {
        /*
            r5 = this;
            x6.h0$g r0 = r5.f31736r
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            x6.h0$g r1 = r0.f31747b
            if (r1 != 0) goto Lf
            java.lang.Object r0 = r0.f31746a
            x6.l r0 = (x6.l) r0
            return r0
        Lf:
            if (r1 == 0) goto L84
            java.lang.Object r2 = r0.f31746a
            x6.l r2 = (x6.l) r2
            java.lang.Class r2 = r2.k()
            java.lang.Object r3 = r1.f31746a
            x6.l r3 = (x6.l) r3
            java.lang.Class r3 = r3.k()
            if (r2 == r3) goto L31
            boolean r4 = r2.isAssignableFrom(r3)
            if (r4 == 0) goto L2a
            goto L45
        L2a:
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto L31
            goto L46
        L31:
            java.lang.Object r2 = r1.f31746a
            x6.l r2 = (x6.l) r2
            int r2 = r5.W(r2)
            java.lang.Object r3 = r0.f31746a
            x6.l r3 = (x6.l) r3
            int r3 = r5.W(r3)
            if (r2 == r3) goto L49
            if (r2 >= r3) goto L46
        L45:
            r0 = r1
        L46:
            x6.h0$g r1 = r1.f31747b
            goto Lf
        L49:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Conflicting getter definitions for property \""
            r3.append(r4)
            java.lang.String r4 = r5.getName()
            r3.append(r4)
            java.lang.String r4 = "\": "
            r3.append(r4)
            java.lang.Object r0 = r0.f31746a
            x6.l r0 = (x6.l) r0
            java.lang.String r0 = r0.l()
            r3.append(r0)
            java.lang.String r0 = " vs "
            r3.append(r0)
            java.lang.Object r0 = r1.f31746a
            x6.l r0 = (x6.l) r0
            java.lang.String r0 = r0.l()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L84:
            x6.h0$g r1 = r0.f()
            r5.f31736r = r1
            java.lang.Object r0 = r0.f31746a
            x6.l r0 = (x6.l) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.h0.v():x6.l");
    }

    public void w0(boolean z10) {
        if (z10) {
            g gVar = this.f31736r;
            if (gVar != null) {
                this.f31736r = R(this.f31736r, X(0, gVar, this.f31734g, this.f31735h, this.f31737s));
                return;
            }
            g gVar2 = this.f31734g;
            if (gVar2 != null) {
                this.f31734g = R(this.f31734g, X(0, gVar2, this.f31735h, this.f31737s));
                return;
            }
            return;
        }
        g gVar3 = this.f31735h;
        if (gVar3 != null) {
            this.f31735h = R(this.f31735h, X(0, gVar3, this.f31737s, this.f31734g, this.f31736r));
            return;
        }
        g gVar4 = this.f31737s;
        if (gVar4 != null) {
            this.f31737s = R(this.f31737s, X(0, gVar4, this.f31734g, this.f31736r));
            return;
        }
        g gVar5 = this.f31734g;
        if (gVar5 != null) {
            this.f31734g = R(this.f31734g, X(0, gVar5, this.f31736r));
        }
    }

    public void x0() {
        this.f31735h = null;
    }

    @Override // x6.u
    public k y() {
        if (this.f31729b) {
            return q();
        }
        k kVarW = w();
        return kVarW == null ? q() : kVarW;
    }

    public void y0() {
        this.f31734g = Z(this.f31734g);
        this.f31736r = Z(this.f31736r);
        this.f31737s = Z(this.f31737s);
        this.f31735h = Z(this.f31735h);
    }

    public w.a z0(boolean z10, f0 f0Var) {
        w.a aVarP0 = p0();
        if (aVarP0 == null) {
            aVarP0 = w.a.AUTO;
        }
        int i10 = f.f31745a[aVarP0.ordinal()];
        if (i10 == 1) {
            if (f0Var != null) {
                f0Var.k(getName());
                Iterator it = q0().iterator();
                while (it.hasNext()) {
                    f0Var.k(((p6.y) it.next()).c());
                }
            }
            this.f31737s = null;
            this.f31735h = null;
            if (!this.f31729b) {
                this.f31734g = null;
            }
        } else if (i10 != 2) {
            if (i10 != 3) {
                this.f31736r = a0(this.f31736r);
                this.f31735h = a0(this.f31735h);
                if (!z10 || this.f31736r == null) {
                    this.f31734g = a0(this.f31734g);
                    this.f31737s = a0(this.f31737s);
                    return aVarP0;
                }
            } else {
                this.f31736r = null;
                if (this.f31729b) {
                    this.f31734g = null;
                    return aVarP0;
                }
            }
        }
        return aVarP0;
    }

    protected h0(r6.q qVar, p6.b bVar, boolean z10, p6.y yVar, p6.y yVar2) {
        this.f31730c = qVar;
        this.f31731d = bVar;
        this.f31733f = yVar;
        this.f31732e = yVar2;
        this.f31729b = z10;
    }

    protected h0(h0 h0Var, p6.y yVar) {
        this.f31730c = h0Var.f31730c;
        this.f31731d = h0Var.f31731d;
        this.f31733f = h0Var.f31733f;
        this.f31732e = yVar;
        this.f31734g = h0Var.f31734g;
        this.f31735h = h0Var.f31735h;
        this.f31736r = h0Var.f31736r;
        this.f31737s = h0Var.f31737s;
        this.f31729b = h0Var.f31729b;
    }
}
