package w4;

import v4.p0;
import v4.q0;

/* JADX INFO: loaded from: classes.dex */
public class e implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31148a;

    public e(int i10) {
        this.f31148a = i10 & 65535;
    }

    @Override // v4.q0
    public /* synthetic */ byte[] a(int i10) {
        return p0.b(this, i10);
    }

    @Override // v4.q0
    public byte[] b() {
        int i10 = this.f31148a;
        return new byte[]{(byte) (i10 >> 8), (byte) i10};
    }
}
