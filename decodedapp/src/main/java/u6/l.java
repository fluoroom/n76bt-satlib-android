package u6;

import d6.k;
import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public class l extends g0 implements s6.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Object[] f28270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Enum f28271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final i7.i f28272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected volatile i7.i f28273h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final Boolean f28274r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Boolean f28275s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Boolean f28276t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected final boolean f28277u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final i7.i f28278v;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28279a;

        static {
            int[] iArr = new int[r6.b.values().length];
            f28279a = iArr;
            try {
                iArr[r6.b.AsNull.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28279a[r6.b.AsEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28279a[r6.b.TryConvert.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(i7.k kVar, boolean z10, i7.k kVar2) {
        super(kVar.r());
        this.f28272g = kVar.k();
        this.f28270e = kVar.t();
        this.f28271f = kVar.q();
        this.f28274r = Boolean.valueOf(z10);
        this.f28277u = kVar.v();
        this.f28278v = kVar2 == null ? null : kVar2.k();
    }

    private final Object e1(e6.j jVar, p6.h hVar, i7.i iVar, String str) throws v6.c {
        char cCharAt;
        Object objD;
        p6.h hVar2;
        r6.b bVarX;
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            if (n1(hVar)) {
                return this.f28271f;
            }
            if (o1(hVar)) {
                return null;
            }
            if (str.isEmpty()) {
                hVar2 = hVar;
                bVarX = x(hVar2, c0(hVar), p(), str, "empty String (\"\")");
            } else {
                hVar2 = hVar;
                bVarX = x(hVar2, a0(hVar2), p(), str, "blank String (all whitespace)");
            }
            int i10 = a.f28279a[bVarX.ordinal()];
            if (i10 == 2 || i10 == 3) {
                return k(hVar2);
            }
            return null;
        }
        if (Boolean.TRUE.equals(this.f28274r) && (objD = iVar.d(strTrim)) != null) {
            return objD;
        }
        if (!hVar.D0(p6.i.FAIL_ON_NUMBERS_FOR_ENUMS) && !this.f28277u && (cCharAt = strTrim.charAt(0)) >= '0' && cCharAt <= '9') {
            try {
                int i11 = Integer.parseInt(strTrim);
                if (!hVar.E0(p6.r.ALLOW_COERCION_OF_SCALARS)) {
                    return hVar.z0(g1(), strTrim, "value looks like quoted Enum index, but `MapperFeature.ALLOW_COERCION_OF_SCALARS` prevents use", new Object[0]);
                }
                if (i11 >= 0) {
                    Object[] objArr = this.f28270e;
                    if (i11 < objArr.length) {
                        return objArr[i11];
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (n1(hVar)) {
            return this.f28271f;
        }
        if (o1(hVar)) {
            return null;
        }
        return hVar.z0(g1(), strTrim, "not one of the values accepted for Enum class: %s", iVar.f());
    }

    private i7.i k1(p6.h hVar) {
        i7.i iVar = this.f28278v;
        return iVar != null ? iVar : hVar.D0(p6.i.READ_ENUMS_USING_TO_STRING) ? j1(hVar) : this.f28272g;
    }

    public static p6.l l1(p6.g gVar, Class cls, x6.l lVar, s6.w wVar, s6.u[] uVarArr) {
        if (gVar.b()) {
            i7.h.g(lVar.n(), gVar.L(p6.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new o(cls, lVar, lVar.z(0), wVar, uVarArr);
    }

    public static p6.l m1(p6.g gVar, Class cls, x6.l lVar) {
        if (gVar.b()) {
            i7.h.g(lVar.n(), gVar.L(p6.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new o(cls, lVar);
    }

    @Override // s6.i
    public p6.l d(p6.h hVar, p6.d dVar) {
        return p1((Boolean) Optional.ofNullable(T0(hVar, dVar, p(), k.a.ACCEPT_CASE_INSENSITIVE_PROPERTIES)).orElse(this.f28274r), (Boolean) Optional.ofNullable(T0(hVar, dVar, p(), k.a.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)).orElse(this.f28275s), (Boolean) Optional.ofNullable(T0(hVar, dVar, p(), k.a.READ_UNKNOWN_ENUM_VALUES_AS_NULL)).orElse(this.f28276t));
    }

    @Override // p6.l
    public Object e(e6.j jVar, p6.h hVar) {
        return jVar.N0(e6.m.VALUE_STRING) ? i1(jVar, hVar, jVar.C0()) : jVar.N0(e6.m.VALUE_NUMBER_INT) ? this.f28277u ? i1(jVar, hVar, jVar.C0()) : h1(jVar, hVar, jVar.t0()) : jVar.T0() ? i1(jVar, hVar, hVar.K(jVar, this, this.f28200a)) : f1(jVar, hVar);
    }

    protected Object f1(e6.j jVar, p6.h hVar) {
        return jVar.N0(e6.m.START_ARRAY) ? W(jVar, hVar) : hVar.s0(g1(), jVar);
    }

    protected Class g1() {
        return p();
    }

    protected Object h1(e6.j jVar, p6.h hVar, int i10) throws v6.c {
        l lVar;
        p6.h hVar2;
        r6.b bVarN = hVar.N(r(), p(), r6.e.Integer);
        if (bVarN != r6.b.Fail) {
            lVar = this;
            hVar2 = hVar;
        } else {
            if (hVar.D0(p6.i.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                return hVar.y0(g1(), Integer.valueOf(i10), "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow", new Object[0]);
            }
            lVar = this;
            hVar2 = hVar;
            lVar.x(hVar2, bVarN, p(), Integer.valueOf(i10), "Integer value (" + i10 + ")");
        }
        int i11 = a.f28279a[bVarN.ordinal()];
        if (i11 == 1) {
            return null;
        }
        if (i11 == 2) {
            return k(hVar2);
        }
        if (i10 >= 0) {
            Object[] objArr = lVar.f28270e;
            if (i10 < objArr.length) {
                return objArr[i10];
            }
        }
        if (n1(hVar2)) {
            return lVar.f28271f;
        }
        if (o1(hVar2)) {
            return null;
        }
        return hVar2.y0(g1(), Integer.valueOf(i10), "index value outside legal index range [0..%s]", Integer.valueOf(lVar.f28270e.length - 1));
    }

    protected Object i1(e6.j jVar, p6.h hVar, String str) {
        Object objC;
        i7.i iVarK1 = k1(hVar);
        Object objC2 = iVarK1.c(str);
        if (objC2 != null) {
            return objC2;
        }
        String strTrim = str.trim();
        return (strTrim == str || (objC = iVarK1.c(strTrim)) == null) ? e1(jVar, hVar, iVarK1, strTrim) : objC;
    }

    protected i7.i j1(p6.h hVar) {
        i7.i iVarK;
        i7.i iVar = this.f28273h;
        if (iVar != null) {
            return iVar;
        }
        synchronized (this) {
            try {
                iVarK = this.f28273h;
                if (iVarK == null) {
                    iVarK = i7.k.o(hVar.k(), g1()).k();
                    this.f28273h = iVarK;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVarK;
    }

    @Override // p6.l
    public Object k(p6.h hVar) {
        return this.f28271f;
    }

    protected boolean n1(p6.h hVar) {
        if (this.f28271f != null) {
            return Boolean.TRUE.equals(this.f28275s) || hVar.D0(p6.i.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE);
        }
        return false;
    }

    protected boolean o1(p6.h hVar) {
        return Boolean.TRUE.equals(this.f28276t) || hVar.D0(p6.i.READ_UNKNOWN_ENUM_VALUES_AS_NULL);
    }

    public l p1(Boolean bool, Boolean bool2, Boolean bool3) {
        return (Objects.equals(this.f28274r, bool) && Objects.equals(this.f28275s, bool2) && Objects.equals(this.f28276t, bool3)) ? this : new l(this, bool, bool2, bool3);
    }

    @Override // p6.l
    public boolean q() {
        return true;
    }

    @Override // u6.g0, p6.l
    public h7.c r() {
        return h7.c.Enum;
    }

    protected l(l lVar, Boolean bool, Boolean bool2, Boolean bool3) {
        super(lVar);
        this.f28272g = lVar.f28272g;
        this.f28270e = lVar.f28270e;
        this.f28271f = lVar.f28271f;
        this.f28274r = bool;
        this.f28277u = lVar.f28277u;
        this.f28275s = bool2;
        this.f28276t = bool3;
        this.f28278v = lVar.f28278v;
    }
}
