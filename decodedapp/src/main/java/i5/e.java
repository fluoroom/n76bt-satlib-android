package i5;

import android.content.Context;
import android.content.res.AssetManager;
import gj.g;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f15771a = new e();

    private e() {
    }

    public static final void a(Context context) {
        m.e(context, "context");
        g gVarB = gj.c.a().b();
        AssetManager assets = context.getAssets();
        m.d(assets, "getAssets(...)");
        gVarB.c(new d(assets, null, 2, null));
    }
}
