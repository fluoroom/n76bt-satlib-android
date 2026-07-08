package com.auth0.android.jwt;

import com.google.gson.k;

/* JADX INFO: loaded from: classes.dex */
class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f4929a;

    c(k kVar) {
        this.f4929a = kVar;
    }

    @Override // com.auth0.android.jwt.a, com.auth0.android.jwt.b
    public Long asLong() {
        if (this.f4929a.j()) {
            return Long.valueOf(this.f4929a.e());
        }
        return null;
    }
}
