package a0;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f28a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Configuration f29b;

    public h(boolean z10) {
        this.f28a = z10;
    }

    public final boolean a() {
        return this.f28a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(boolean z10, Configuration configuration) {
        this(z10);
        rd.m.e(configuration, "newConfig");
        this.f29b = configuration;
    }
}
