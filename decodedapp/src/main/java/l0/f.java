package l0;

import rd.m;

/* JADX INFO: loaded from: classes.dex */
public class f extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f20320c;

    public f(int i10) {
        super(i10);
        this.f20320c = new Object();
    }

    @Override // l0.e, l0.d
    public boolean a(Object obj) {
        boolean zA;
        m.e(obj, "instance");
        synchronized (this.f20320c) {
            zA = super.a(obj);
        }
        return zA;
    }

    @Override // l0.e, l0.d
    public Object b() {
        Object objB;
        synchronized (this.f20320c) {
            objB = super.b();
        }
        return objB;
    }
}
