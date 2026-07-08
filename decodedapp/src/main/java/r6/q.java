package r6;

import com.fasterxml.jackson.databind.JavaType;
import d6.b0;
import d6.k;
import d6.r;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;
import p6.z;
import x6.a;
import x6.d0;
import x6.l0;
import x6.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class q implements v.a, Serializable {

    /* JADX INFO: renamed from: c */
    protected static final r.b f25569c = r.b.c();

    /* JADX INFO: renamed from: d */
    protected static final k.d f25570d = k.d.b();

    /* JADX INFO: renamed from: a */
    protected final long f25571a;

    /* JADX INFO: renamed from: b */
    protected final a f25572b;

    protected q(a aVar, long j10) {
        this.f25572b = aVar;
        this.f25571a = j10;
    }

    public static int c(Class cls) {
        int iD = 0;
        for (Object obj : (Enum[]) cls.getEnumConstants()) {
            f fVar = (f) obj;
            if (fVar.a()) {
                iD |= fVar.d();
            }
        }
        return iD;
    }

    public final z A() {
        this.f25572b.i();
        return null;
    }

    public final TimeZone C() {
        return this.f25572b.j();
    }

    public final com.fasterxml.jackson.databind.type.c D() {
        return this.f25572b.k();
    }

    public p6.c G(JavaType javaType) {
        return i().a(this, javaType, this);
    }

    public p6.c H(Class cls) {
        return G(e(cls));
    }

    public final boolean K() {
        return L(p6.r.USE_ANNOTATIONS);
    }

    public final boolean L(p6.r rVar) {
        return rVar.f(this.f25571a);
    }

    public abstract boolean N(k kVar);

    public final boolean O() {
        return L(p6.r.SORT_PROPERTIES_ALPHABETICALLY);
    }

    public a7.f Q(x6.b bVar, Class cls) {
        w();
        return (a7.f) i7.h.l(cls, b());
    }

    public a7.g R(x6.b bVar, Class cls) {
        w();
        return (a7.g) i7.h.l(cls, b());
    }

    public final boolean b() {
        return L(p6.r.CAN_OVERRIDE_ACCESS_MODIFIERS);
    }

    public e6.p d(String str) {
        return new i6.l(str);
    }

    public final JavaType e(Class cls) {
        return D().R(cls);
    }

    public final a.AbstractC0427a f() {
        return this.f25572b.a();
    }

    public p6.b g() {
        return L(p6.r.USE_ANNOTATIONS) ? this.f25572b.b() : d0.f31681a;
    }

    public e6.a h() {
        return this.f25572b.c();
    }

    public v i() {
        return this.f25572b.d();
    }

    public abstract g j(Class cls);

    public final DateFormat k() {
        return this.f25572b.e();
    }

    public abstract r.b l(Class cls, Class cls2);

    public r.b n(Class cls, Class cls2, r.b bVar) {
        return r.b.j(bVar, j(cls).d(), j(cls2).e());
    }

    public abstract Boolean o();

    public abstract k.d p(Class cls);

    public abstract r.b q(Class cls);

    public r.b r(Class cls, r.b bVar) {
        r.b bVarD = j(cls).d();
        return bVarD != null ? bVarD : bVar;
    }

    public abstract b0.a s();

    public final a7.g t(JavaType javaType) {
        return this.f25572b.l();
    }

    public abstract l0 v(Class cls, x6.d dVar);

    public final o w() {
        this.f25572b.f();
        return null;
    }

    public final Locale x() {
        return this.f25572b.g();
    }

    public a7.c z() {
        a7.c cVarH = this.f25572b.h();
        return (cVarH == b7.m.f3704a && L(p6.r.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES)) ? new a7.a() : cVarH;
    }

    protected q(q qVar, long j10) {
        this.f25572b = qVar.f25572b;
        this.f25571a = j10;
    }
}
