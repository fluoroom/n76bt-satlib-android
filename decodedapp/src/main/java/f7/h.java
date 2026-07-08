package f7;

import com.fasterxml.jackson.databind.JavaType;
import d6.r;
import f7.k;
import java.io.IOException;
import java.util.Map;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class h extends e7.h implements e7.i {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Object f12836w = r.a.NON_EMPTY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final p6.d f12837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final boolean f12838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final JavaType f12839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final JavaType f12840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final JavaType f12841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected p6.p f12842h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected p6.p f12843r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final a7.h f12844s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected k f12845t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected final Object f12846u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final boolean f12847v;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12848a;

        static {
            int[] iArr = new int[r.a.values().length];
            f12848a = iArr;
            try {
                iArr[r.a.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12848a[r.a.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12848a[r.a.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12848a[r.a.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12848a[r.a.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12848a[r.a.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public h(JavaType javaType, JavaType javaType2, JavaType javaType3, boolean z10, a7.h hVar, p6.d dVar) {
        super(javaType);
        this.f12839e = javaType;
        this.f12840f = javaType2;
        this.f12841g = javaType3;
        this.f12838d = z10;
        this.f12844s = hVar;
        this.f12837c = dVar;
        this.f12845t = k.c();
        this.f12846u = null;
        this.f12847v = false;
    }

    protected final p6.p A(k kVar, JavaType javaType, d0 d0Var) {
        k.d dVarG = kVar.g(javaType, d0Var, this.f12837c);
        k kVar2 = dVarG.f12864b;
        if (kVar != kVar2) {
            this.f12845t = kVar2;
        }
        return dVarG.f12863a;
    }

    protected final p6.p C(k kVar, Class cls, d0 d0Var) {
        k.d dVarH = kVar.h(cls, d0Var, this.f12837c);
        k kVar2 = dVarH.f12864b;
        if (kVar != kVar2) {
            this.f12845t = kVar2;
        }
        return dVarH.f12863a;
    }

    public JavaType D() {
        return this.f12841g;
    }

    @Override // p6.p
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public boolean d(d0 d0Var, Map.Entry entry) {
        Object value = entry.getValue();
        if (value == null) {
            return this.f12847v;
        }
        if (this.f12846u == null) {
            return false;
        }
        p6.p pVarC = this.f12843r;
        if (pVarC == null) {
            Class<?> cls = value.getClass();
            p6.p pVarJ = this.f12845t.j(cls);
            if (pVarJ == null) {
                try {
                    pVarC = C(this.f12845t, cls, d0Var);
                } catch (p6.m unused) {
                    return false;
                }
            } else {
                pVarC = pVarJ;
            }
        }
        Object obj = this.f12846u;
        return obj == f12836w ? pVarC.d(d0Var, value) : obj.equals(value);
    }

    @Override // g7.i0, p6.p
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void f(Map.Entry entry, e6.g gVar, d0 d0Var) throws IOException {
        gVar.a1(entry);
        K(entry, gVar, d0Var);
        gVar.A0();
    }

    protected void K(Map.Entry entry, e6.g gVar, d0 d0Var) throws IOException {
        p6.p pVarA;
        a7.h hVar = this.f12844s;
        Object key = entry.getKey();
        p6.p pVarW = key == null ? d0Var.W(this.f12840f, this.f12837c) : this.f12842h;
        Object value = entry.getValue();
        if (value != null) {
            pVarA = this.f12843r;
            if (pVarA == null) {
                Class<?> cls = value.getClass();
                p6.p pVarJ = this.f12845t.j(cls);
                pVarA = pVarJ == null ? this.f12841g.z() ? A(this.f12845t, d0Var.G(this.f12841g, cls), d0Var) : C(this.f12845t, cls, d0Var) : pVarJ;
            }
            Object obj = this.f12846u;
            if (obj != null && ((obj == f12836w && pVarA.d(d0Var, value)) || this.f12846u.equals(value))) {
                return;
            }
        } else if (this.f12847v) {
            return;
        } else {
            pVarA = d0Var.l0();
        }
        pVarW.f(key, gVar, d0Var);
        try {
            if (hVar == null) {
                pVarA.f(value, gVar, d0Var);
            } else {
                pVarA.g(value, gVar, d0Var, hVar);
            }
        } catch (Exception e10) {
            w(d0Var, e10, entry, "" + key);
        }
    }

    @Override // p6.p
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void g(Map.Entry entry, e6.g gVar, d0 d0Var, a7.h hVar) throws IOException {
        gVar.H(entry);
        n6.c cVarG = hVar.g(gVar, hVar.d(entry, e6.m.START_OBJECT));
        K(entry, gVar, d0Var);
        hVar.h(gVar, cVarG);
    }

    public h N(Object obj, boolean z10) {
        return (this.f12846u == obj && this.f12847v == z10) ? this : new h(this, this.f12837c, this.f12844s, this.f12842h, this.f12843r, obj, z10);
    }

    public h O(p6.d dVar, p6.p pVar, p6.p pVar2, Object obj, boolean z10) {
        return new h(this, dVar, this.f12844s, pVar, pVar2, obj, z10);
    }

    @Override // e7.i
    public p6.p a(d0 d0Var, p6.d dVar) {
        p6.p pVarG0;
        p6.p pVarG02;
        h hVar;
        p6.d dVar2;
        Object obj;
        boolean z10;
        r.b bVarE;
        r.a aVarF;
        p6.b bVarI0 = d0Var.i0();
        Object objB = null;
        x6.k kVarH = dVar == null ? null : dVar.h();
        if (kVarH == null || bVarI0 == null) {
            pVarG0 = null;
            pVarG02 = null;
        } else {
            Object objZ = bVarI0.z(kVarH);
            pVarG02 = objZ != null ? d0Var.G0(kVarH, objZ) : null;
            Object objG = bVarI0.g(kVarH);
            pVarG0 = objG != null ? d0Var.G0(kVarH, objG) : null;
        }
        if (pVarG0 == null) {
            pVarG0 = this.f12843r;
        }
        p6.p pVarN = n(d0Var, dVar, pVarG0);
        if (pVarN == null && this.f12838d && !this.f12841g.S()) {
            pVarN = d0Var.Q(this.f12841g, dVar);
        }
        p6.p pVar = pVarN;
        if (pVarG02 == null) {
            pVarG02 = this.f12842h;
        }
        p6.p pVarS = pVarG02 == null ? d0Var.S(this.f12840f, dVar) : d0Var.u0(pVarG02, dVar);
        Object obj2 = this.f12846u;
        boolean zW0 = this.f12847v;
        if (dVar != null && (bVarE = dVar.e(d0Var.k(), null)) != null && (aVarF = bVarE.f()) != r.a.USE_DEFAULTS) {
            int i10 = a.f12848a[aVarF.ordinal()];
            if (i10 == 1) {
                objB = i7.e.b(this.f12841g);
                if (objB != null && objB.getClass().isArray()) {
                    objB = i7.c.a(objB);
                }
            } else if (i10 != 2) {
                if (i10 == 3) {
                    objB = f12836w;
                } else {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            hVar = this;
                            dVar2 = dVar;
                            obj = null;
                            z10 = false;
                        }
                        return hVar.O(dVar2, pVarS, pVar, obj, z10);
                    }
                    objB = d0Var.v0(null, bVarE.e());
                    if (objB != null) {
                        zW0 = d0Var.w0(objB);
                        hVar = this;
                        dVar2 = dVar;
                        obj = objB;
                    }
                }
            } else if (this.f12841g.b()) {
                objB = f12836w;
            }
            hVar = this;
            dVar2 = dVar;
            obj = objB;
            z10 = true;
            return hVar.O(dVar2, pVarS, pVar, obj, z10);
        }
        hVar = this;
        dVar2 = dVar;
        obj = obj2;
        z10 = zW0;
        return hVar.O(dVar2, pVarS, pVar, obj, z10);
    }

    @Override // e7.h
    public e7.h x(a7.h hVar) {
        return new h(this, this.f12837c, hVar, this.f12842h, this.f12843r, this.f12846u, this.f12847v);
    }

    protected h(h hVar, p6.d dVar, a7.h hVar2, p6.p pVar, p6.p pVar2, Object obj, boolean z10) {
        super(Map.class, false);
        this.f12839e = hVar.f12839e;
        this.f12840f = hVar.f12840f;
        this.f12841g = hVar.f12841g;
        this.f12838d = hVar.f12838d;
        this.f12844s = hVar.f12844s;
        this.f12842h = pVar;
        this.f12843r = pVar2;
        this.f12845t = k.c();
        this.f12837c = hVar.f12837c;
        this.f12846u = obj;
        this.f12847v = z10;
    }
}
