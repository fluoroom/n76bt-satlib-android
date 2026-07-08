package g7;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import d6.r;
import q6.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class z extends i0 implements e7.i {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f13659t = r.a.NON_EMPTY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final JavaType f13660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final p6.d f13661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final a7.h f13662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final p6.p f13663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final i7.s f13664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected transient f7.k f13665h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final Object f13666r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final boolean f13667s;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13668a;

        static {
            int[] iArr = new int[r.a.values().length];
            f13668a = iArr;
            try {
                iArr[r.a.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13668a[r.a.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13668a[r.a.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13668a[r.a.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13668a[r.a.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13668a[r.a.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public z(ReferenceType referenceType, boolean z10, a7.h hVar, p6.p pVar) {
        super(referenceType);
        this.f13660c = referenceType.a();
        this.f13661d = null;
        this.f13662e = hVar;
        this.f13663f = pVar;
        this.f13664g = null;
        this.f13666r = null;
        this.f13667s = false;
        this.f13665h = f7.k.c();
    }

    private final p6.p x(p6.d0 d0Var, Class cls) {
        p6.p pVarJ = this.f13665h.j(cls);
        if (pVarJ != null) {
            return pVarJ;
        }
        p6.p pVarZ = this.f13660c.z() ? d0Var.Z(d0Var.G(this.f13660c, cls), this.f13661d) : d0Var.a0(cls, this.f13661d);
        i7.s sVar = this.f13664g;
        if (sVar != null) {
            pVarZ = pVarZ.h(sVar);
        }
        this.f13665h = this.f13665h.i(cls, pVarZ);
        return pVarZ;
    }

    private final p6.p z(p6.d0 d0Var, JavaType javaType, p6.d dVar) {
        return d0Var.Z(javaType, dVar);
    }

    protected abstract Object A(Object obj);

    protected abstract Object C(Object obj);

    protected abstract boolean D(Object obj);

    protected boolean G(p6.d0 d0Var, p6.d dVar, JavaType javaType) {
        if (javaType.S()) {
            return false;
        }
        if (javaType.Q() || javaType.c0()) {
            return true;
        }
        p6.b bVarI0 = d0Var.i0();
        if (bVarI0 != null && dVar != null && dVar.h() != null) {
            g.b bVarK0 = bVarI0.k0(dVar.h());
            if (bVarK0 == g.b.STATIC) {
                return true;
            }
            if (bVarK0 == g.b.DYNAMIC) {
                return false;
            }
        }
        return d0Var.x0(p6.r.USE_STATIC_TYPING);
    }

    public abstract z H(Object obj, boolean z10);

    protected abstract z K(p6.d dVar, a7.h hVar, p6.p pVar, i7.s sVar);

    @Override // e7.i
    public p6.p a(p6.d0 d0Var, p6.d dVar) {
        r.b bVarE;
        r.a aVarF;
        Object objB;
        a7.h hVarA = this.f13662e;
        if (hVarA != null) {
            hVarA = hVarA.a(dVar);
        }
        p6.p pVarL = l(d0Var, dVar);
        if (pVarL == null) {
            pVarL = this.f13663f;
            if (pVarL != null) {
                pVarL = d0Var.t0(pVarL, dVar);
            } else if (G(d0Var, dVar, this.f13660c)) {
                pVarL = z(d0Var, this.f13660c, dVar);
            }
        }
        z zVarK = (this.f13661d == dVar && this.f13662e == hVarA && this.f13663f == pVarL) ? this : K(dVar, hVarA, pVarL, this.f13664g);
        if (dVar != null && (bVarE = dVar.e(d0Var.k(), c())) != null && (aVarF = bVarE.f()) != r.a.USE_DEFAULTS) {
            int i10 = a.f13668a[aVarF.ordinal()];
            boolean zW0 = true;
            if (i10 != 1) {
                objB = null;
                if (i10 != 2) {
                    if (i10 == 3) {
                        objB = f13659t;
                    } else if (i10 == 4) {
                        objB = d0Var.v0(null, bVarE.e());
                        if (objB != null) {
                            zW0 = d0Var.w0(objB);
                        }
                    } else if (i10 != 5) {
                        zW0 = false;
                    }
                } else if (this.f13660c.b()) {
                    objB = f13659t;
                }
            } else {
                objB = i7.e.b(this.f13660c);
                if (objB != null && objB.getClass().isArray()) {
                    objB = i7.c.a(objB);
                }
            }
            if (this.f13666r != objB || this.f13667s != zW0) {
                return zVarK.H(objB, zW0);
            }
        }
        return zVarK;
    }

    @Override // p6.p
    public boolean d(p6.d0 d0Var, Object obj) {
        if (!D(obj)) {
            return true;
        }
        Object objA = A(obj);
        if (objA == null) {
            return this.f13667s;
        }
        if (this.f13666r == null) {
            return false;
        }
        p6.p pVarX = this.f13663f;
        if (pVarX == null) {
            try {
                pVarX = x(d0Var, objA.getClass());
            } catch (p6.m e10) {
                throw new p6.a0(e10);
            }
        }
        Object obj2 = this.f13666r;
        return obj2 == f13659t ? pVarX.d(d0Var, objA) : obj2.equals(objA);
    }

    @Override // p6.p
    public boolean e() {
        return this.f13664g != null;
    }

    @Override // g7.i0, p6.p
    public void f(Object obj, e6.g gVar, p6.d0 d0Var) {
        Object objC = C(obj);
        if (objC == null) {
            if (this.f13664g == null) {
                d0Var.N(gVar);
                return;
            }
            return;
        }
        p6.p pVarX = this.f13663f;
        if (pVarX == null) {
            pVarX = x(d0Var, objC.getClass());
        }
        a7.h hVar = this.f13662e;
        if (hVar != null) {
            pVarX.g(objC, gVar, d0Var, hVar);
        } else {
            pVarX.f(objC, gVar, d0Var);
        }
    }

    @Override // p6.p
    public void g(Object obj, e6.g gVar, p6.d0 d0Var, a7.h hVar) {
        Object objC = C(obj);
        if (objC == null) {
            if (this.f13664g == null) {
                d0Var.N(gVar);
            }
        } else {
            p6.p pVarX = this.f13663f;
            if (pVarX == null) {
                pVarX = x(d0Var, objC.getClass());
            }
            pVarX.g(objC, gVar, d0Var, hVar);
        }
    }

    @Override // p6.p
    public p6.p h(i7.s sVar) {
        p6.p pVarH = this.f13663f;
        if (pVarH == null || (pVarH = pVarH.h(sVar)) != this.f13663f) {
            i7.s sVar2 = this.f13664g;
            if (sVar2 != null) {
                sVar = i7.s.a(sVar, sVar2);
            }
            if (this.f13663f != pVarH || this.f13664g != sVar) {
                return K(this.f13661d, this.f13662e, pVarH, sVar);
            }
        }
        return this;
    }

    protected z(z zVar, p6.d dVar, a7.h hVar, p6.p pVar, i7.s sVar, Object obj, boolean z10) {
        super(zVar);
        this.f13660c = zVar.f13660c;
        this.f13665h = f7.k.c();
        this.f13661d = dVar;
        this.f13662e = hVar;
        this.f13663f = pVar;
        this.f13664g = sVar;
        this.f13666r = obj;
        this.f13667s = z10;
    }
}
