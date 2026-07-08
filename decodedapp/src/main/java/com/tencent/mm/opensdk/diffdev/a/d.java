package com.tencent.mm.opensdk.diffdev.a;

import com.facebook.stetho.server.http.HttpStatus;

/* JADX INFO: loaded from: classes3.dex */
public enum d {
    UUID_EXPIRED(402),
    UUID_CANCELED(403),
    UUID_SCANED(HttpStatus.HTTP_NOT_FOUND),
    UUID_CONFIRM(405),
    UUID_KEEP_CONNECT(408),
    UUID_ERROR(HttpStatus.HTTP_INTERNAL_SERVER_ERROR);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10312a;

    d(int i10) {
        this.f10312a = i10;
    }

    public int a() {
        return this.f10312a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "UUIDStatusCode:" + this.f10312a;
    }
}
