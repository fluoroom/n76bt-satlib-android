package mh;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f22089a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b bVar) {
        super("stream was reset: " + bVar);
        rd.m.e(bVar, "errorCode");
        this.f22089a = bVar;
    }
}
