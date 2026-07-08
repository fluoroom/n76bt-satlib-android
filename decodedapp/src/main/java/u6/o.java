package u6;

import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class o extends c0 implements s6.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final JavaType f28293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final x6.l f28294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final p6.l f28295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final s6.w f28296h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final s6.u[] f28297r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final boolean f28298s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile transient t6.v f28299t;

    public o(Class cls, x6.l lVar, JavaType javaType, s6.w wVar, s6.u[] uVarArr) {
        super(cls);
        this.f28294f = lVar;
        this.f28298s = true;
        this.f28293e = (javaType.C(String.class) || javaType.C(CharSequence.class)) ? null : javaType;
        this.f28295g = null;
        this.f28296h = wVar;
        this.f28297r = uVarArr;
    }

    private Throwable g1(Throwable th2, p6.h hVar) throws IOException {
        Throwable thF = i7.h.F(th2);
        i7.h.i0(thF);
        boolean z10 = hVar == null || hVar.D0(p6.i.WRAP_EXCEPTIONS);
        if (thF instanceof IOException) {
            if (!z10 || !(thF instanceof e6.d)) {
                throw ((IOException) thF);
            }
        } else if (!z10) {
            i7.h.k0(thF);
        }
        return thF;
    }

    @Override // u6.c0
    public s6.w W0() {
        return this.f28296h;
    }

    @Override // s6.i
    public p6.l d(p6.h hVar, p6.d dVar) {
        JavaType javaType;
        return (this.f28295g == null && (javaType = this.f28293e) != null && this.f28297r == null) ? new o(this, hVar.Q(javaType, dVar)) : this;
    }

    @Override // p6.l
    public Object e(e6.j jVar, p6.h hVar) throws p6.m {
        String strK0;
        Object objE;
        p6.l lVar = this.f28295g;
        if (lVar != null) {
            objE = lVar.e(jVar, hVar);
        } else {
            if (!this.f28298s) {
                jVar.f1();
                try {
                    return this.f28294f.r();
                } catch (Exception e10) {
                    return hVar.l0(this.f28200a, null, i7.h.l0(e10));
                }
            }
            if (this.f28297r != null) {
                if (jVar.T0()) {
                    t6.v vVarC = this.f28299t;
                    if (vVarC == null) {
                        vVarC = t6.v.c(hVar, this.f28296h, this.f28297r, hVar.E0(p6.r.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                        this.f28299t = vVarC;
                    }
                    jVar.X0();
                    return f1(jVar, hVar, vVarC);
                }
                if (!this.f28296h.h()) {
                    JavaType javaTypeY0 = Y0(hVar);
                    hVar.P0(javaTypeY0, "Input mismatch reading Enum %s: properties-based `@JsonCreator` (%s) expects JSON Object (JsonToken.START_OBJECT), got JsonToken.%s", i7.h.G(javaTypeY0), this.f28294f, jVar.n());
                }
            }
            e6.m mVarN = jVar.n();
            boolean z10 = mVarN == e6.m.START_ARRAY && hVar.D0(p6.i.UNWRAP_SINGLE_VALUE_ARRAYS);
            if (z10) {
                mVarN = jVar.X0();
            }
            if (mVarN == null || !mVarN.g()) {
                jVar.f1();
                strK0 = "";
            } else {
                strK0 = jVar.K0();
            }
            if (z10 && jVar.X0() != e6.m.END_ARRAY) {
                Z0(jVar, hVar);
            }
            objE = strK0;
        }
        try {
            return this.f28294f.D(this.f28200a, objE);
        } catch (Exception e11) {
            Throwable thL0 = i7.h.l0(e11);
            if ((thL0 instanceof IllegalArgumentException) && hVar.D0(p6.i.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            return hVar.l0(this.f28200a, objE, thL0);
        }
    }

    protected final Object e1(e6.j jVar, p6.h hVar, s6.u uVar) {
        try {
            return uVar.l(jVar, hVar);
        } catch (Exception e10) {
            return h1(e10, p(), uVar.getName(), hVar);
        }
    }

    protected Object f1(e6.j jVar, p6.h hVar, t6.v vVar) {
        t6.y yVarE = vVar.e(jVar, hVar, null);
        e6.m mVarN = jVar.n();
        while (mVarN == e6.m.FIELD_NAME) {
            String strL = jVar.l();
            jVar.X0();
            s6.u uVarD = vVar.d(strL);
            if (!yVarE.i(strL) || uVarD != null) {
                if (uVarD != null) {
                    yVarE.b(uVarD, e1(jVar, hVar, uVarD));
                } else {
                    jVar.f1();
                }
            }
            mVarN = jVar.X0();
        }
        return vVar.a(hVar, yVarE);
    }

    @Override // u6.c0, p6.l
    public Object g(e6.j jVar, p6.h hVar, a7.e eVar) {
        return eVar.c(jVar, hVar);
    }

    protected Object h1(Throwable th2, Object obj, String str, p6.h hVar) throws p6.m {
        throw p6.m.s(g1(th2, hVar), obj, str);
    }

    @Override // p6.l
    public boolean q() {
        return true;
    }

    @Override // p6.l
    public h7.c r() {
        return h7.c.Enum;
    }

    @Override // p6.l
    public Boolean s(p6.g gVar) {
        return Boolean.FALSE;
    }

    public o(Class cls, x6.l lVar) {
        super(cls);
        this.f28294f = lVar;
        this.f28298s = false;
        this.f28293e = null;
        this.f28295g = null;
        this.f28296h = null;
        this.f28297r = null;
    }

    protected o(o oVar, p6.l lVar) {
        super(oVar.f28200a);
        this.f28293e = oVar.f28293e;
        this.f28294f = oVar.f28294f;
        this.f28298s = oVar.f28298s;
        this.f28296h = oVar.f28296h;
        this.f28297r = oVar.f28297r;
        this.f28295g = lVar;
    }
}
