package me;

import ag.n;
import dd.d0;
import ef.k;
import he.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f21975c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f21976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final me.a f21977b;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final k a(ClassLoader classLoader) {
            rd.m.e(classLoader, "classLoader");
            g gVar = new g(classLoader);
            k.a aVar = ef.k.f12015b;
            ClassLoader classLoader2 = d0.class.getClassLoader();
            rd.m.d(classLoader2, "getClassLoader(...)");
            k.a.C0163a c0163aA = aVar.a(gVar, new g(classLoader2), new d(classLoader), "runtime module for " + classLoader, j.f21974b, l.f21978a);
            return new k(c0163aA.a().a(), new me.a(c0163aA.b(), gVar), null);
        }

        private a() {
        }
    }

    public /* synthetic */ k(n nVar, me.a aVar, rd.h hVar) {
        this(nVar, aVar);
    }

    public final n a() {
        return this.f21976a;
    }

    public final h0 b() {
        return this.f21976a.q();
    }

    public final me.a c() {
        return this.f21977b;
    }

    private k(n nVar, me.a aVar) {
        this.f21976a = nVar;
        this.f21977b = aVar;
    }
}
