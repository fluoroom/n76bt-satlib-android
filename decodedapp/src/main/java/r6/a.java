package r6;

import j$.util.DesugarTimeZone;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;
import p6.z;
import x6.a;
import x6.v;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final TimeZone f25477t = DesugarTimeZone.getTimeZone("UTC");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.fasterxml.jackson.databind.type.c f25478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final v f25479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final p6.b f25480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final a.AbstractC0427a f25481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final a7.g f25482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final a7.c f25483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final DateFormat f25484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final Locale f25485h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final TimeZone f25486r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final e6.a f25487s;

    public a(v vVar, p6.b bVar, z zVar, com.fasterxml.jackson.databind.type.c cVar, a7.g gVar, DateFormat dateFormat, o oVar, Locale locale, TimeZone timeZone, e6.a aVar, a7.c cVar2, a.AbstractC0427a abstractC0427a) {
        this.f25479b = vVar;
        this.f25480c = bVar;
        this.f25478a = cVar;
        this.f25482e = gVar;
        this.f25484g = dateFormat;
        this.f25485h = locale;
        this.f25486r = timeZone;
        this.f25487s = aVar;
        this.f25483f = cVar2;
        this.f25481d = abstractC0427a;
    }

    public a.AbstractC0427a a() {
        return this.f25481d;
    }

    public p6.b b() {
        return this.f25480c;
    }

    public e6.a c() {
        return this.f25487s;
    }

    public v d() {
        return this.f25479b;
    }

    public DateFormat e() {
        return this.f25484g;
    }

    public o f() {
        return null;
    }

    public Locale g() {
        return this.f25485h;
    }

    public a7.c h() {
        return this.f25483f;
    }

    public z i() {
        return null;
    }

    public TimeZone j() {
        TimeZone timeZone = this.f25486r;
        return timeZone == null ? f25477t : timeZone;
    }

    public com.fasterxml.jackson.databind.type.c k() {
        return this.f25478a;
    }

    public a7.g l() {
        return this.f25482e;
    }

    public a n(v vVar) {
        return this.f25479b == vVar ? this : new a(vVar, this.f25480c, null, this.f25478a, this.f25482e, this.f25484g, null, this.f25485h, this.f25486r, this.f25487s, this.f25483f, this.f25481d);
    }
}
