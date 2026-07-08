package a0;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Configuration f131b;

    public s(boolean z10) {
        this.f130a = z10;
    }

    public final boolean a() {
        return this.f130a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(boolean z10, Configuration configuration) {
        this(z10);
        rd.m.e(configuration, "newConfig");
        this.f131b = configuration;
    }
}
