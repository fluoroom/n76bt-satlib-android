package c8;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class g implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f4480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f4481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Bundle f4482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ a f4483d;

    g(a aVar, Activity activity, Bundle bundle, Bundle bundle2) {
        this.f4483d = aVar;
        this.f4480a = activity;
        this.f4481b = bundle;
        this.f4482c = bundle2;
    }

    @Override // c8.m
    public final void a(c cVar) {
        this.f4483d.f4474a.x(this.f4480a, this.f4481b, this.f4482c);
    }

    @Override // c8.m
    public final int b() {
        return 0;
    }
}
