package p6;

import com.fasterxml.jackson.databind.JavaType;
import d6.k;
import d6.k0;
import d6.o0;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends e implements Serializable {

    /* JADX INFO: renamed from: a */
    protected final s6.m f23975a;

    /* JADX INFO: renamed from: b */
    protected final s6.n f23976b;

    /* JADX INFO: renamed from: c */
    protected final g f23977c;

    /* JADX INFO: renamed from: d */
    protected final int f23978d;

    /* JADX INFO: renamed from: e */
    protected final o6.i f23979e;

    /* JADX INFO: renamed from: f */
    protected final Class f23980f;

    /* JADX INFO: renamed from: g */
    protected transient e6.j f23981g;

    /* JADX INFO: renamed from: h */
    protected transient i7.c f23982h;

    /* JADX INFO: renamed from: r */
    protected transient i7.v f23983r;

    /* JADX INFO: renamed from: s */
    protected transient DateFormat f23984s;

    /* JADX INFO: renamed from: t */
    protected transient r6.j f23985t;

    /* JADX INFO: renamed from: u */
    protected i7.q f23986u;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f23987a;

        static {
            int[] iArr = new int[e6.m.values().length];
            f23987a = iArr;
            try {
                iArr[e6.m.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23987a[e6.m.END_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23987a[e6.m.FIELD_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23987a[e6.m.START_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23987a[e6.m.END_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23987a[e6.m.VALUE_FALSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23987a[e6.m.VALUE_TRUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23987a[e6.m.VALUE_EMBEDDED_OBJECT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23987a[e6.m.VALUE_NUMBER_FLOAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23987a[e6.m.VALUE_NUMBER_INT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f23987a[e6.m.VALUE_STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f23987a[e6.m.VALUE_NULL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f23987a[e6.m.NOT_AVAILABLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    protected h(s6.n nVar, s6.m mVar) {
        if (nVar == null) {
            throw new NullPointerException("Cannot pass null DeserializerFactory");
        }
        this.f23976b = nVar;
        this.f23975a = mVar == null ? new s6.m() : mVar;
        this.f23978d = 0;
        this.f23979e = null;
        this.f23977c = null;
        this.f23980f = null;
        this.f23985t = null;
    }

    public final boolean A() {
        return this.f23977c.b();
    }

    public final boolean A0(int i10) {
        return (i10 & this.f23978d) != 0;
    }

    public m B0(Class cls, Throwable th2) {
        String strO;
        if (th2 == null) {
            strO = "N/A";
        } else {
            strO = i7.h.o(th2);
            if (strO == null) {
                strO = i7.h.Y(th2.getClass());
            }
        }
        return v6.i.v(this.f23981g, String.format("Cannot construct instance of %s, problem: %s", i7.h.Y(cls), strO), G(cls), th2);
    }

    public Calendar C(Date date) {
        Calendar calendar = Calendar.getInstance(j0());
        calendar.setTime(date);
        return calendar;
    }

    public final boolean C0(e6.q qVar) {
        return this.f23979e.b(qVar);
    }

    public JavaType D(JavaType javaType, Class cls) {
        return javaType.C(cls) ? javaType : k().D().Q(javaType, cls, false);
    }

    public final boolean D0(i iVar) {
        return (iVar.d() & this.f23978d) != 0;
    }

    public final boolean E0(r rVar) {
        return this.f23977c.L(rVar);
    }

    public final boolean F0(r6.k kVar) {
        return this.f23977c.N(kVar);
    }

    public final JavaType G(Class cls) {
        if (cls == null) {
            return null;
        }
        return this.f23977c.e(cls);
    }

    public abstract q G0(x6.b bVar, Object obj);

    public abstract l H(x6.b bVar, Object obj);

    public final i7.v H0() {
        i7.v vVar = this.f23983r;
        if (vVar == null) {
            return new i7.v();
        }
        this.f23983r = null;
        return vVar;
    }

    public m I0(JavaType javaType, String str) {
        return v6.e.z(this.f23981g, a(String.format("Could not resolve subtype of %s", javaType), str), javaType, null);
    }

    public Date J0(String str) {
        try {
            return t().parse(str);
        } catch (ParseException e10) {
            throw new IllegalArgumentException(String.format("Failed to parse Date value '%s': %s", str, i7.h.o(e10)));
        }
    }

    public String K(e6.j jVar, l lVar, Class cls) {
        return (String) s0(cls, jVar);
    }

    public Object K0(e6.j jVar, JavaType javaType) {
        l lVarX = X(javaType);
        if (lVarX != null) {
            return lVarX.e(jVar, this);
        }
        return q(javaType, "Could not find JsonDeserializer for type " + i7.h.G(javaType));
    }

    public Class L(String str) {
        return l().W(str);
    }

    public Object L0(e6.j jVar, Class cls) {
        return K0(jVar, l().R(cls));
    }

    public Object M0(l lVar, Class cls, Object obj, String str, Object... objArr) throws v6.c {
        throw v6.c.z(i0(), b(str, objArr), obj, cls);
    }

    public r6.b N(h7.c cVar, Class cls, r6.e eVar) {
        return this.f23977c.l0(cVar, cls, eVar);
    }

    public Object N0(c cVar, x6.u uVar, String str, Object... objArr) throws v6.b {
        throw v6.b.z(this.f23981g, String.format("Invalid definition for property %s (of type %s): %s", i7.h.X(uVar), i7.h.Y(cVar.q()), b(str, objArr)), cVar, uVar);
    }

    public r6.b O(h7.c cVar, Class cls, r6.b bVar) {
        return this.f23977c.m0(cVar, cls, bVar);
    }

    public Object O0(c cVar, String str, Object... objArr) throws v6.b {
        throw v6.b.z(this.f23981g, String.format("Invalid type definition for type %s: %s", i7.h.Y(cVar.q()), b(str, objArr)), cVar, null);
    }

    public Object P0(JavaType javaType, String str, Object... objArr) throws v6.f {
        throw v6.f.v(i0(), javaType, b(str, objArr));
    }

    public final l Q(JavaType javaType, d dVar) {
        l lVarO = this.f23975a.o(this, this.f23976b, javaType);
        return lVarO != null ? p0(lVarO, dVar, javaType) : lVarO;
    }

    public Object Q0(Class cls, String str, Object... objArr) throws v6.f {
        throw v6.f.w(i0(), cls, b(str, objArr));
    }

    public final Object R(Object obj, d dVar, Object obj2) {
        return r(i7.h.i(obj), String.format("No 'injectableValues' configured, cannot inject value with id [%s]", obj));
    }

    public Object R0(d dVar, String str, Object... objArr) throws v6.f {
        x6.k kVarH;
        v6.f fVarV = v6.f.v(i0(), dVar == null ? null : dVar.getType(), b(str, objArr));
        if (dVar == null || (kVarH = dVar.h()) == null) {
            throw fVarV;
        }
        fVarV.e(kVarH.k(), dVar.getName());
        throw fVarV;
    }

    public final q S(JavaType javaType, d dVar) throws v6.b {
        try {
            return this.f23975a.n(this, this.f23976b, javaType);
        } catch (IllegalArgumentException e10) {
            q(javaType, i7.h.o(e10));
            return null;
        }
    }

    public Object S0(l lVar, String str, Object... objArr) throws v6.f {
        throw v6.f.w(i0(), lVar.p(), b(str, objArr));
    }

    public final l T(JavaType javaType) {
        return this.f23975a.o(this, this.f23976b, javaType);
    }

    public Object T0(JavaType javaType, String str, String str2, Object... objArr) {
        return U0(javaType.r(), str, str2, objArr);
    }

    public Object U0(Class cls, String str, String str2, Object... objArr) throws v6.f {
        v6.f fVarW = v6.f.w(i0(), cls, b(str2, objArr));
        if (str == null) {
            throw fVarW;
        }
        fVarW.e(cls, str);
        throw fVarW;
    }

    public Object V0(Class cls, e6.j jVar, e6.m mVar) throws v6.f {
        throw v6.f.w(jVar, cls, String.format("Trailing token (of type %s) found after value (bound as %s): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`", mVar, i7.h.Y(cls)));
    }

    public abstract t6.z W(Object obj, k0 k0Var, o0 o0Var);

    public Object W0(t6.s sVar, Object obj) {
        return R0(sVar.f27540e, String.format("No Object Id found for an instance of %s, to assign to property '%s'", i7.h.h(obj), sVar.f27537b), new Object[0]);
    }

    public final l X(JavaType javaType) {
        l lVarO = this.f23975a.o(this, this.f23976b, javaType);
        if (lVarO == null) {
            return null;
        }
        l lVarP0 = p0(lVarO, null, javaType);
        a7.e eVarL = this.f23976b.l(this.f23977c, javaType);
        return eVarL != null ? new t6.b0(eVarL.g(null), lVarP0) : lVarP0;
    }

    public void X0(JavaType javaType, e6.m mVar, String str, Object... objArr) throws m {
        throw f1(i0(), javaType, mVar, b(str, objArr));
    }

    public final Class Y() {
        return this.f23980f;
    }

    public void Y0(Class cls, e6.m mVar, String str, Object... objArr) throws m {
        throw g1(i0(), cls, mVar, b(str, objArr));
    }

    public final b Z() {
        return this.f23977c.g();
    }

    public void Z0(l lVar, e6.m mVar, String str, Object... objArr) throws m {
        throw g1(i0(), lVar.p(), mVar, b(str, objArr));
    }

    public final i7.c a0() {
        if (this.f23982h == null) {
            this.f23982h = new i7.c();
        }
        return this.f23982h;
    }

    public final void a1(i7.v vVar) {
        if (this.f23983r == null || vVar.h() >= this.f23983r.h()) {
            this.f23983r = vVar;
        }
    }

    public final e6.a b0() {
        return this.f23977c.h();
    }

    public m b1(Class cls, String str, String str2) {
        return v6.c.z(this.f23981g, String.format("Cannot deserialize Map key of type %s from String %s: %s", i7.h.Y(cls), c(str), str2), str, cls);
    }

    @Override // p6.e
    /* JADX INFO: renamed from: c0 */
    public g k() {
        return this.f23977c;
    }

    public m c1(Object obj, Class cls) {
        return v6.c.z(this.f23981g, String.format("Cannot deserialize value of type %s from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type %s: incompatible types", i7.h.Y(cls), i7.h.h(obj)), obj, cls);
    }

    public final r6.l d0() {
        return this.f23977c.Z();
    }

    public m d1(Number number, Class cls, String str) {
        return v6.c.z(this.f23981g, String.format("Cannot deserialize value of type %s from number %s: %s", i7.h.Y(cls), String.valueOf(number), str), number, cls);
    }

    public final k.d e0(Class cls) {
        return this.f23977c.p(cls);
    }

    public m e1(String str, Class cls, String str2) {
        return v6.c.z(this.f23981g, String.format("Cannot deserialize value of type %s from String %s: %s", i7.h.Y(cls), c(str), str2), str, cls);
    }

    public final int f0() {
        return this.f23978d;
    }

    public m f1(e6.j jVar, JavaType javaType, e6.m mVar, String str) {
        return v6.f.v(jVar, javaType, a(String.format("Unexpected token (%s), expected %s", jVar.n(), mVar), str));
    }

    public Locale g0() {
        return this.f23977c.x();
    }

    public m g1(e6.j jVar, Class cls, e6.m mVar, String str) {
        return v6.f.w(jVar, cls, a(String.format("Unexpected token (%s), expected %s", jVar.n(), mVar), str));
    }

    public final d7.l h0() {
        return this.f23977c.q0();
    }

    public final e6.j i0() {
        return this.f23981g;
    }

    public TimeZone j0() {
        return this.f23977c.C();
    }

    public void k0(l lVar) throws v6.b {
        if (E0(r.IGNORE_MERGE_FOR_UNMERGEABLE)) {
            return;
        }
        JavaType javaTypeG = G(lVar.p());
        throw v6.b.x(i0(), String.format("Invalid configuration: values of type %s cannot be merged", i7.h.G(javaTypeG)), javaTypeG);
    }

    @Override // p6.e
    public final com.fasterxml.jackson.databind.type.c l() {
        return this.f23977c.D();
    }

    public Object l0(Class cls, Object obj, Throwable th2) throws IOException {
        i7.q qVarR0 = this.f23977c.r0();
        if (qVarR0 != null) {
            android.support.v4.media.session.b.a(qVarR0.c());
            throw null;
        }
        i7.h.j0(th2);
        if (!D0(i.WRAP_EXCEPTIONS)) {
            i7.h.k0(th2);
        }
        throw B0(cls, th2);
    }

    public Object m0(Class cls, s6.w wVar, e6.j jVar, String str, Object... objArr) {
        if (jVar == null) {
            i0();
        }
        String strB = b(str, objArr);
        i7.q qVarR0 = this.f23977c.r0();
        if (qVarR0 == null) {
            return wVar == null ? r(cls, String.format("Cannot construct instance of %s: %s", i7.h.Y(cls), strB)) : !wVar.l() ? r(cls, String.format("Cannot construct instance of %s (no Creators, like default constructor, exist): %s", i7.h.Y(cls), strB)) : Q0(cls, String.format("Cannot construct instance of %s (although at least one Creator exists): %s", i7.h.Y(cls), strB), new Object[0]);
        }
        android.support.v4.media.session.b.a(qVarR0.c());
        throw null;
    }

    @Override // p6.e
    public m n(JavaType javaType, String str, String str2) {
        return v6.e.z(this.f23981g, a(String.format("Could not resolve type id '%s' as a subtype of %s", str, i7.h.G(javaType)), str2), javaType, str);
    }

    public JavaType n0(JavaType javaType, a7.f fVar, String str) throws m {
        i7.q qVarR0 = this.f23977c.r0();
        if (qVarR0 == null) {
            throw I0(javaType, str);
        }
        android.support.v4.media.session.b.a(qVarR0.c());
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l o0(l lVar, d dVar, JavaType javaType) {
        if (!(lVar instanceof s6.i)) {
            return lVar;
        }
        this.f23986u = new i7.q(javaType, this.f23986u);
        try {
            return ((s6.i) lVar).d(this, dVar);
        } finally {
            this.f23986u = this.f23986u.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l p0(l lVar, d dVar, JavaType javaType) {
        if (!(lVar instanceof s6.i)) {
            return lVar;
        }
        this.f23986u = new i7.q(javaType, this.f23986u);
        try {
            return ((s6.i) lVar).d(this, dVar);
        } finally {
            this.f23986u = this.f23986u.b();
        }
    }

    @Override // p6.e
    public Object q(JavaType javaType, String str) throws v6.b {
        throw v6.b.x(this.f23981g, str, javaType);
    }

    public Object q0(JavaType javaType, e6.j jVar) {
        return r0(javaType, jVar.n(), jVar, null, new Object[0]);
    }

    public Object r0(JavaType javaType, e6.m mVar, e6.j jVar, String str, Object... objArr) throws v6.f {
        String strB = b(str, objArr);
        i7.q qVarR0 = this.f23977c.r0();
        if (qVarR0 != null) {
            android.support.v4.media.session.b.a(qVarR0.c());
            throw null;
        }
        if (strB == null) {
            String strG = i7.h.G(javaType);
            strB = mVar == null ? String.format("Unexpected end-of-input when trying read value of type %s", strG) : String.format("Cannot deserialize value of type %s from %s (token `JsonToken.%s`)", strG, v(mVar), mVar);
        }
        if (mVar != null && mVar.g()) {
            jVar.C0();
        }
        P0(javaType, strB, new Object[0]);
        return null;
    }

    public Object s0(Class cls, e6.j jVar) {
        return r0(G(cls), jVar.n(), jVar, null, new Object[0]);
    }

    protected DateFormat t() {
        DateFormat dateFormat = this.f23984s;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this.f23977c.k().clone();
        this.f23984s = dateFormat2;
        return dateFormat2;
    }

    public Object t0(Class cls, e6.m mVar, e6.j jVar, String str, Object... objArr) {
        return r0(G(cls), mVar, jVar, str, objArr);
    }

    public boolean u0(e6.j jVar, l lVar, Object obj, String str) throws v6.h {
        i7.q qVarR0 = this.f23977c.r0();
        if (qVarR0 != null) {
            android.support.v4.media.session.b.a(qVarR0.c());
            throw null;
        }
        if (D0(i.FAIL_ON_UNKNOWN_PROPERTIES)) {
            throw v6.h.z(this.f23981g, obj, str, lVar != null ? lVar.l() : null);
        }
        jVar.f1();
        return true;
    }

    protected String v(e6.m mVar) {
        if (mVar == null) {
            return "<end of input>";
        }
        switch (a.f23987a[mVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return "Object value";
            case 4:
            case 5:
                return "Array value";
            case 6:
            case 7:
                return "Boolean value";
            case 8:
                return "Embedded Object";
            case 9:
                return "Floating-point value";
            case 10:
                return "Integer value";
            case 11:
                return "String value";
            case 12:
                return "Null value";
            default:
                return "[Unavailable value]";
        }
    }

    public JavaType v0(JavaType javaType, String str, a7.f fVar, String str2) throws m {
        i7.q qVarR0 = this.f23977c.r0();
        if (qVarR0 != null) {
            android.support.v4.media.session.b.a(qVarR0.c());
            throw null;
        }
        if (D0(i.FAIL_ON_INVALID_SUBTYPE)) {
            throw n(javaType, str, str2);
        }
        return null;
    }

    public i7.b0 w(e6.j jVar) {
        i7.b0 b0VarZ = z(jVar);
        b0VarZ.z1(jVar);
        return b0VarZ;
    }

    public Object w0(Class cls, String str, String str2, Object... objArr) throws m {
        String strB = b(str2, objArr);
        i7.q qVarR0 = this.f23977c.r0();
        if (qVarR0 == null) {
            throw b1(cls, str, strB);
        }
        android.support.v4.media.session.b.a(qVarR0.c());
        throw null;
    }

    public final i7.b0 x() {
        return z(i0());
    }

    public Object x0(JavaType javaType, Object obj, e6.j jVar) throws m {
        i7.q qVarR0 = this.f23977c.r0();
        Class clsR = javaType.r();
        if (qVarR0 == null) {
            throw c1(obj, clsR);
        }
        android.support.v4.media.session.b.a(qVarR0.c());
        throw null;
    }

    public Object y0(Class cls, Number number, String str, Object... objArr) throws m {
        String strB = b(str, objArr);
        i7.q qVarR0 = this.f23977c.r0();
        if (qVarR0 == null) {
            throw d1(number, cls, strB);
        }
        android.support.v4.media.session.b.a(qVarR0.c());
        throw null;
    }

    public i7.b0 z(e6.j jVar) {
        return new i7.b0(jVar, this);
    }

    public Object z0(Class cls, String str, String str2, Object... objArr) throws m {
        String strB = b(str2, objArr);
        i7.q qVarR0 = this.f23977c.r0();
        if (qVarR0 == null) {
            throw e1(str, cls, strB);
        }
        android.support.v4.media.session.b.a(qVarR0.c());
        throw null;
    }

    protected h(h hVar, s6.n nVar) {
        this.f23975a = hVar.f23975a;
        this.f23976b = nVar;
        this.f23977c = hVar.f23977c;
        this.f23978d = hVar.f23978d;
        this.f23979e = hVar.f23979e;
        this.f23980f = hVar.f23980f;
        this.f23981g = hVar.f23981g;
        this.f23985t = hVar.f23985t;
    }

    protected h(h hVar, g gVar, e6.j jVar, k kVar) {
        this.f23975a = hVar.f23975a;
        this.f23976b = hVar.f23976b;
        this.f23979e = jVar == null ? null : jVar.A0();
        this.f23977c = gVar;
        this.f23978d = gVar.p0();
        this.f23980f = gVar.X();
        this.f23981g = jVar;
        this.f23985t = gVar.Y();
    }

    protected h(h hVar, g gVar) {
        this.f23975a = hVar.f23975a;
        this.f23976b = hVar.f23976b;
        this.f23979e = null;
        this.f23977c = gVar;
        this.f23978d = gVar.p0();
        this.f23980f = null;
        this.f23981g = null;
        this.f23985t = null;
    }
}
