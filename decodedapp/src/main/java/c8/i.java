package c8;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
final class i implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ FrameLayout f4486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ LayoutInflater f4487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ViewGroup f4488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Bundle f4489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ a f4490e;

    i(a aVar, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f4490e = aVar;
        this.f4486a = frameLayout;
        this.f4487b = layoutInflater;
        this.f4488c = viewGroup;
        this.f4489d = bundle;
    }

    @Override // c8.m
    public final void a(c cVar) {
        this.f4486a.removeAllViews();
        this.f4486a.addView(this.f4490e.f4474a.y(this.f4487b, this.f4488c, this.f4489d));
    }

    @Override // c8.m
    public final int b() {
        return 2;
    }
}
