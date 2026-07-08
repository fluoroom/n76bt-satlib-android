package kh;

import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f19940a = new f();

    private f() {
    }

    public static final boolean a(String str) {
        m.e(str, "method");
        return m.a(str, "POST") || m.a(str, "PATCH") || m.a(str, "PUT") || m.a(str, "DELETE") || m.a(str, "MOVE");
    }

    public static final boolean c(String str) {
        m.e(str, "method");
        return (m.a(str, "GET") || m.a(str, "HEAD")) ? false : true;
    }

    public static final boolean f(String str) {
        m.e(str, "method");
        return m.a(str, "POST") || m.a(str, "PUT") || m.a(str, "PATCH") || m.a(str, "PROPPATCH") || m.a(str, "QUERY") || m.a(str, "REPORT");
    }

    public final boolean b(String str) {
        m.e(str, "requestMethod");
        return m.a(str, "GET") || m.a(str, "QUERY");
    }

    public final boolean d(String str) {
        m.e(str, "method");
        return !m.a(str, "PROPFIND");
    }

    public final boolean e(String str) {
        m.e(str, "method");
        return m.a(str, "PROPFIND");
    }
}
