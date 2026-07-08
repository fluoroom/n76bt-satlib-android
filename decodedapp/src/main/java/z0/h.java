package z0;

import androidx.fragment.app.o;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f32855a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, String str) {
        super(str);
        m.e(oVar, "fragment");
        this.f32855a = oVar;
    }

    public final o a() {
        return this.f32855a;
    }
}
