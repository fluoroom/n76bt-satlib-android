package e7;

import com.fasterxml.jackson.databind.JavaType;
import d6.r;
import p6.b0;
import p6.c0;
import p6.d0;
import q6.g;
import x6.u;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f11650g = Boolean.FALSE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final b0 f11651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final p6.c f11652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final p6.b f11653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Object f11654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final r.b f11655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final boolean f11656f;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11657a;

        static {
            int[] iArr = new int[r.a.values().length];
            f11657a = iArr;
            try {
                iArr[r.a.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11657a[r.a.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11657a[r.a.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11657a[r.a.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11657a[r.a.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11657a[r.a.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public l(b0 b0Var, p6.c cVar) {
        this.f11651a = b0Var;
        this.f11652b = cVar;
        r.b bVarI = r.b.i(cVar.o(r.b.c()), b0Var.r(cVar.q(), r.b.c()));
        this.f11655e = r.b.i(b0Var.d0(), bVarI);
        this.f11656f = bVarI.h() == r.a.NON_DEFAULT;
        this.f11653c = b0Var.g();
    }

    protected c a(u uVar, x6.k kVar, i7.b bVar, JavaType javaType, p6.p pVar, a7.h hVar, JavaType javaType2, boolean z10, Object obj, Class[] clsArr) {
        return new c(uVar, kVar, bVar, javaType, pVar, hVar, javaType2, z10, obj, clsArr);
    }

    protected Object b(Exception exc, String str, Object obj) {
        Throwable cause = exc;
        while (cause.getCause() != null) {
            cause = cause.getCause();
        }
        i7.h.i0(cause);
        i7.h.k0(cause);
        throw new IllegalArgumentException("Failed to get property '" + str + "' of default " + obj.getClass().getName() + " instance");
    }

    protected c c(d0 d0Var, u uVar, JavaType javaType, p6.p pVar, a7.h hVar, a7.h hVar2, x6.k kVar, boolean z10) throws v6.b {
        Object objE;
        Object objV0;
        boolean z11;
        try {
            JavaType javaTypeD = d(kVar, z10, javaType);
            if (hVar2 != null) {
                if (javaTypeD == null) {
                    javaTypeD = javaType;
                }
                if (javaTypeD.k() == null) {
                    d0Var.C0(this.f11652b, uVar, "serialization type " + javaTypeD + " has no content", new Object[0]);
                }
                javaTypeD = javaTypeD.e0(hVar2);
                javaTypeD.k();
            }
            JavaType javaType2 = javaTypeD;
            JavaType javaType3 = javaType2 == null ? javaType : javaType2;
            x6.k kVarQ = uVar.q();
            if (kVarQ == null) {
                return (c) d0Var.C0(this.f11652b, uVar, "could not determine property type", new Object[0]);
            }
            r.b bVarN = this.f11651a.n(javaType3.r(), kVarQ.e(), this.f11655e).n(uVar.j());
            r.a aVarH = bVarN.h();
            if (aVarH == r.a.USE_DEFAULTS) {
                aVarH = r.a.ALWAYS;
            }
            int i10 = a.f11657a[aVarH.ordinal()];
            Object objB = null;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        objB = c.C;
                    } else if (i10 != 4) {
                        z = i10 == 5;
                        c0 c0Var = c0.WRITE_EMPTY_JSON_ARRAYS;
                        if (javaType3.L() && !this.f11651a.q0(c0Var)) {
                            objB = c.C;
                        }
                        z11 = z;
                        objV0 = objB;
                    } else {
                        objV0 = d0Var.v0(uVar, bVarN.g());
                        z11 = false;
                    }
                } else if (javaType3.b()) {
                    objB = c.C;
                }
                objV0 = objB;
                z11 = true;
            } else {
                if (!this.f11656f || (objE = e()) == null) {
                    objB = i7.e.b(javaType3);
                    z = true;
                } else {
                    if (d0Var.x0(p6.r.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                        kVar.i(this.f11651a.L(p6.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    try {
                        objB = kVar.o(objE);
                    } catch (Exception e10) {
                        b(e10, uVar.getName(), objE);
                    }
                }
                if (objB != null) {
                    if (objB.getClass().isArray()) {
                        objB = i7.c.a(objB);
                    }
                    z11 = z;
                    objV0 = objB;
                }
                objV0 = objB;
                z11 = true;
            }
            Class[] clsArrN = uVar.n();
            if (clsArrN == null) {
                clsArrN = this.f11652b.e();
            }
            c cVarA = a(uVar, kVar, this.f11652b.r(), javaType, pVar, hVar, javaType2, z11, objV0, clsArrN);
            Object objH = this.f11653c.H(kVar);
            if (objH != null) {
                cVarA.k(d0Var.G0(kVar, objH));
            }
            i7.s sVarQ0 = this.f11653c.q0(kVar);
            return sVarQ0 != null ? cVarA.G(sVarQ0) : cVarA;
        } catch (p6.m e11) {
            return uVar == null ? (c) d0Var.q(javaType, i7.h.o(e11)) : (c) d0Var.C0(this.f11652b, uVar, i7.h.o(e11), new Object[0]);
        }
    }

    protected JavaType d(x6.b bVar, boolean z10, JavaType javaType) {
        JavaType javaTypeI0 = this.f11653c.I0(this.f11651a, bVar, javaType);
        if (javaTypeI0 != javaType) {
            Class<?> clsR = javaTypeI0.r();
            Class<?> clsR2 = javaType.r();
            if (!clsR.isAssignableFrom(clsR2) && !clsR2.isAssignableFrom(clsR)) {
                throw new IllegalArgumentException("Illegal concrete-type annotation for method '" + bVar.d() + "': class " + clsR.getName() + " not a super-type of (declared) class " + clsR2.getName());
            }
            javaType = javaTypeI0;
            z10 = true;
        }
        g.b bVarK0 = this.f11653c.k0(bVar);
        if (bVarK0 != null && bVarK0 != g.b.DEFAULT_TYPING) {
            z10 = bVarK0 == g.b.STATIC;
        }
        if (z10) {
            return javaType.p0();
        }
        return null;
    }

    protected Object e() {
        Object objB = this.f11654d;
        if (objB == null) {
            objB = this.f11652b.B(this.f11651a.b());
            if (objB == null) {
                objB = f11650g;
            }
            this.f11654d = objB;
        }
        if (objB == f11650g) {
            return null;
        }
        return this.f11654d;
    }
}
