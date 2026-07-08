package c2;

import e2.r;

/* JADX INFO: loaded from: classes.dex */
public class b extends r {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final a f4285s;

    public interface a extends r.a {
        void l(byte[] bArr);
    }

    public b(a aVar) {
        super(aVar);
        this.f4285s = aVar;
    }

    public void Y() {
        R();
    }

    @Override // e2.r
    protected void i(byte[] bArr) {
        if (this.f11398l) {
            return;
        }
        this.f4285s.l(bArr);
    }
}
