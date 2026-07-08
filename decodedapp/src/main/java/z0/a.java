package z0;

import androidx.fragment.app.o;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32834b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(o oVar, String str) {
        super(oVar, "Attempting to reuse fragment " + oVar + " with previous ID " + str);
        m.e(oVar, "fragment");
        m.e(str, "previousFragmentId");
        this.f32834b = str;
    }
}
