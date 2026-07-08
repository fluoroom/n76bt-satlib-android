package f1;

import androidx.lifecycle.k;
import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import androidx.lifecycle.y0;
import e1.a;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a */
    public static final h f12772a = new h();

    private h() {
    }

    public final e1.a a(y0 y0Var) {
        m.e(y0Var, "owner");
        return y0Var instanceof k ? ((k) y0Var).B() : a.b.f11336c;
    }

    public final v0.c b(y0 y0Var) {
        m.e(y0Var, "owner");
        return y0Var instanceof k ? ((k) y0Var).A() : d.f12766a;
    }

    public final String c(yd.c cVar) {
        m.e(cVar, "modelClass");
        String strA = a.a(cVar);
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + strA;
    }

    public final s0 d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
