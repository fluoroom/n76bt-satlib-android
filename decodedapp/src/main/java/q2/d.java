package q2;

import e3.k;
import k2.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f24291a;

    public d(Object obj) {
        this.f24291a = k.e(obj);
    }

    @Override // k2.v
    public final int a() {
        return 1;
    }

    @Override // k2.v
    public Class d() {
        return this.f24291a.getClass();
    }

    @Override // k2.v
    public final Object get() {
        return this.f24291a;
    }

    @Override // k2.v
    public void c() {
    }
}
