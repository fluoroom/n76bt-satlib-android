package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.app.a;
import g1.c;
import j$.util.Objects;
import q7.g;

/* JADX INFO: loaded from: classes.dex */
final class a implements a.InterfaceC0037a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ SignInHubActivity f7186a;

    /* synthetic */ a(SignInHubActivity signInHubActivity, byte[] bArr) {
        Objects.requireNonNull(signInHubActivity);
        this.f7186a = signInHubActivity;
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    public final /* bridge */ /* synthetic */ void K(c cVar, Object obj) {
        SignInHubActivity signInHubActivity = this.f7186a;
        signInHubActivity.setResult(signInHubActivity.X0(), signInHubActivity.Y0());
        signInHubActivity.finish();
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    public final c S(int i10, Bundle bundle) {
        return new g(this.f7186a, t7.g.b());
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    public final void t0(c cVar) {
    }
}
