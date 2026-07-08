package com.google.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j0 extends com.google.protobuf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map f9041a = new ConcurrentHashMap();

    public static class a extends v {
    }

    protected static final class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f9042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f9044c;

        b(l1 l1Var) {
            this.f9042a = l1Var.getClass();
            this.f9043b = l1Var.getClass().getName();
            this.f9044c = l1Var.toByteArray();
        }
    }

    static j0 b(Class cls) {
        android.support.v4.media.session.b.a(f9041a.get(cls));
        try {
            Class.forName(cls.getName(), true, cls.getClassLoader());
            android.support.v4.media.session.b.a(f9041a.get(cls));
            android.support.v4.media.session.b.a(y2.l(cls));
            throw null;
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException("Class initialization cannot fail.", e10);
        }
    }
}
