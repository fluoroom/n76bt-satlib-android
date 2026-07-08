package w6;

import e6.m;
import g7.h0;
import java.nio.file.Path;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class j extends h0 {
    public j() {
        super(b.a());
    }

    @Override // g7.i0, p6.p
    public /* bridge */ /* synthetic */ void f(Object obj, e6.g gVar, d0 d0Var) {
        x(f.a(obj), gVar, d0Var);
    }

    @Override // g7.h0, p6.p
    public /* bridge */ /* synthetic */ void g(Object obj, e6.g gVar, d0 d0Var, a7.h hVar) {
        z(f.a(obj), gVar, d0Var, hVar);
    }

    public void x(Path path, e6.g gVar, d0 d0Var) {
        gVar.d1(path.toUri().toString());
    }

    public void z(Path path, e6.g gVar, d0 d0Var, a7.h hVar) {
        n6.c cVarG = hVar.g(gVar, hVar.f(path, b.a(), m.VALUE_STRING));
        x(path, gVar, d0Var);
        hVar.h(gVar, cVarG);
    }
}
