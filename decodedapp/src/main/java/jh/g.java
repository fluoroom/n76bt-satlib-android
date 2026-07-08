package jh;

import eh.j0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f18749a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g f18750b = new a();

    public static final class a extends g {
        a() {
        }
    }

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        public final g a() {
            return g.f18750b;
        }

        private b() {
        }
    }

    public void b(eh.k kVar, j0 j0Var, eh.e eVar) {
        rd.m.e(kVar, "connection");
        rd.m.e(j0Var, "route");
        rd.m.e(eVar, "call");
    }

    public void c(j0 j0Var, eh.e eVar, IOException iOException) {
        rd.m.e(j0Var, "route");
        rd.m.e(eVar, "call");
        rd.m.e(iOException, "failure");
    }

    public void d(j0 j0Var, eh.e eVar) {
        rd.m.e(j0Var, "route");
        rd.m.e(eVar, "call");
    }

    public void e(eh.k kVar, eh.e eVar) {
        rd.m.e(kVar, "connection");
        rd.m.e(eVar, "call");
    }

    public void f(eh.k kVar) {
        rd.m.e(kVar, "connection");
    }

    public void g(eh.k kVar, eh.e eVar) {
        rd.m.e(kVar, "connection");
        rd.m.e(eVar, "call");
    }

    public void h(eh.k kVar) {
        rd.m.e(kVar, "connection");
    }
}
