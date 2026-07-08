package com.dw.multimon;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f6894a;

    static {
        System.loadLibrary("demod");
    }

    protected void a() {
        if (this.f6894a == 0) {
            throw new IllegalStateException("对象已经释放");
        }
    }

    public abstract void b();

    protected void finalize() throws Throwable {
        try {
            b();
        } finally {
            super.finalize();
        }
    }
}
