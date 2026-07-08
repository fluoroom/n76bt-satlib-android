package io.grpc.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f16394a = new ArrayList();

    public c1 a(Object obj) {
        this.f16394a.add(String.valueOf(obj));
        return this;
    }

    public c1 b(String str, Object obj) {
        this.f16394a.add(str + "=" + obj);
        return this;
    }

    public String toString() {
        return this.f16394a.toString();
    }
}
