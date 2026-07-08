package v7;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class d0 extends e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f30358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ u7.i f30359b;

    d0(Intent intent, u7.i iVar, int i10) {
        this.f30358a = intent;
        this.f30359b = iVar;
    }

    @Override // v7.e0
    public final void a() {
        Intent intent = this.f30358a;
        if (intent != null) {
            this.f30359b.startActivityForResult(intent, 2);
        }
    }
}
