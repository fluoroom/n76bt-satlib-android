package e1;

import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import f1.f;
import f1.h;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a */
    private final x0 f11338a;

    /* JADX INFO: renamed from: b */
    private final v0.c f11339b;

    /* JADX INFO: renamed from: c */
    private final a f11340c;

    /* JADX INFO: renamed from: d */
    private final f f11341d;

    public d(x0 x0Var, v0.c cVar, a aVar) {
        m.e(x0Var, "store");
        m.e(cVar, "factory");
        m.e(aVar, "defaultExtras");
        this.f11338a = x0Var;
        this.f11339b = cVar;
        this.f11340c = aVar;
        this.f11341d = new f();
    }

    public static /* synthetic */ s0 e(d dVar, yd.c cVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = h.f12772a.c(cVar);
        }
        return dVar.d(cVar, str);
    }

    public final s0 d(yd.c cVar, String str) {
        s0 s0VarB;
        m.e(cVar, "modelClass");
        m.e(str, "key");
        synchronized (this.f11341d) {
            try {
                s0VarB = this.f11338a.b(str);
                if (cVar.c(s0VarB)) {
                    if (this.f11339b instanceof v0.e) {
                        v0.e eVar = (v0.e) this.f11339b;
                        m.b(s0VarB);
                        eVar.d(s0VarB);
                    }
                    m.c(s0VarB, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    b bVar = new b(this.f11340c);
                    bVar.c(v0.f2698c, str);
                    s0VarB = e.a(this.f11339b, cVar, bVar);
                    this.f11338a.d(str, s0VarB);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return s0VarB;
    }
}
