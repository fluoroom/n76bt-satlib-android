package net.openid.appauth;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public class RedirectUriReceiverActivity extends androidx.appcompat.app.d {
    @Override // androidx.fragment.app.p, d.q, a0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(AuthorizationManagementActivity.n1(this, getIntent().getData()));
        finish();
    }
}
