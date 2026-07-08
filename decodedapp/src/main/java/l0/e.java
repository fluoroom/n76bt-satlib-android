package l0;

import rd.m;

/* JADX INFO: loaded from: classes.dex */
public class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f20318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20319b;

    public e(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f20318a = new Object[i10];
    }

    private final boolean c(Object obj) {
        int i10 = this.f20319b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f20318a[i11] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // l0.d
    public boolean a(Object obj) {
        m.e(obj, "instance");
        if (c(obj)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i10 = this.f20319b;
        Object[] objArr = this.f20318a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = obj;
        this.f20319b = i10 + 1;
        return true;
    }

    @Override // l0.d
    public Object b() {
        int i10 = this.f20319b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = this.f20318a[i11];
        m.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f20318a[i11] = null;
        this.f20319b--;
        return obj;
    }
}
