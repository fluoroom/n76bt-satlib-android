package w1;

import d6.r;
import java.io.IOException;
import p6.c0;
import p6.u;
import p6.v;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: c */
    private static final u f31048c;

    /* JADX INFO: renamed from: d */
    private static final v f31049d;

    /* JADX INFO: renamed from: e */
    private static final v f31050e;

    /* JADX INFO: renamed from: a */
    private final v f31051a = f31049d;

    /* JADX INFO: renamed from: b */
    private final v f31052b = f31050e;

    static {
        u uVarB = b();
        f31048c = uVarB;
        f31049d = uVarB.z(x1.d.class);
        f31050e = uVarB.z(x1.c.class);
    }

    static void a(u uVar) {
        c7.b bVar = new c7.b();
        bVar.g(x1.d.class, new e());
        bVar.g(x1.c.class, new b());
        uVar.A(bVar);
    }

    private static u b() {
        u uVar = new u();
        uVar.r(c0.FAIL_ON_EMPTY_BEANS);
        uVar.H(r.a.NON_EMPTY);
        a(uVar);
        return uVar;
    }

    private static v1.a c() {
        return d(null);
    }

    private static v1.a d(String str) {
        return new v1.a(String.format("The string '%s' doesn't have a valid JSON format.", str));
    }

    public x1.c e(String str) {
        if (str == null) {
            throw c();
        }
        try {
            return (x1.c) this.f31052b.w(str);
        } catch (IOException unused) {
            throw d(str);
        }
    }

    public x1.d f(String str) {
        if (str == null) {
            throw c();
        }
        try {
            return (x1.d) this.f31051a.w(str);
        } catch (IOException unused) {
            throw d(str);
        }
    }
}
