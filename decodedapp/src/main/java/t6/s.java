package t6;

import com.fasterxml.jackson.databind.JavaType;
import d6.k0;
import d6.o0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class s implements Serializable {

    /* JADX INFO: renamed from: a */
    protected final JavaType f27536a;

    /* JADX INFO: renamed from: b */
    public final p6.y f27537b;

    /* JADX INFO: renamed from: c */
    public final k0 f27538c;

    /* JADX INFO: renamed from: d */
    protected final p6.l f27539d;

    /* JADX INFO: renamed from: e */
    public final s6.u f27540e;

    protected s(JavaType javaType, p6.y yVar, k0 k0Var, p6.l lVar, s6.u uVar, o0 o0Var) {
        this.f27536a = javaType;
        this.f27537b = yVar;
        this.f27538c = k0Var;
        this.f27539d = lVar;
        this.f27540e = uVar;
    }

    public static s a(JavaType javaType, p6.y yVar, k0 k0Var, p6.l lVar, s6.u uVar, o0 o0Var) {
        return new s(javaType, yVar, k0Var, lVar, uVar, o0Var);
    }

    public p6.l b() {
        return this.f27539d;
    }

    public JavaType c() {
        return this.f27536a;
    }

    public boolean d(String str, e6.j jVar) {
        return this.f27538c.e(str, jVar);
    }

    public boolean e() {
        return this.f27538c.g();
    }

    public Object f(e6.j jVar, p6.h hVar) {
        return this.f27539d.e(jVar, hVar);
    }
}
