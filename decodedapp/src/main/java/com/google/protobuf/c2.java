package com.google.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
final class c2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c2 f8925c = new c2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f8927b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i2 f8926a = new y0();

    private c2() {
    }

    public static c2 a() {
        return f8925c;
    }

    public h2 b(Class cls, h2 h2Var) {
        o0.b(cls, "messageType");
        o0.b(h2Var, "schema");
        return (h2) this.f8927b.putIfAbsent(cls, h2Var);
    }

    public h2 c(Class cls) {
        h2 h2VarB;
        o0.b(cls, "messageType");
        h2 h2VarA = (h2) this.f8927b.get(cls);
        return (h2VarA != null || (h2VarB = b(cls, (h2VarA = this.f8926a.a(cls)))) == null) ? h2VarA : h2VarB;
    }

    public h2 d(Object obj) {
        return c(obj.getClass());
    }
}
