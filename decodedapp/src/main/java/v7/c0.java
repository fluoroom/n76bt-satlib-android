package v7;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class c0 extends e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f30351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f30352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f30353c;

    c0(Intent intent, Activity activity, int i10) {
        this.f30351a = intent;
        this.f30352b = activity;
        this.f30353c = i10;
    }

    @Override // v7.e0
    public final void a() {
        Intent intent = this.f30351a;
        if (intent != null) {
            this.f30352b.startActivityForResult(intent, this.f30353c);
        }
    }
}
