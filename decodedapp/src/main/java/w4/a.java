package w4;

import a6.v;
import ed.j;
import java.security.InvalidParameterException;
import java.util.Arrays;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f31088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31089b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31090c;

    public final boolean a() {
        return this.f31090c;
    }

    protected abstract int b();

    protected abstract int c();

    protected abstract void d(v vVar);

    public final boolean e(byte[] bArr, int i10, int i11) {
        m.e(bArr, "data");
        if (c() + i10 > i11) {
            return false;
        }
        this.f31088a = j.n(bArr, i10, i11);
        try {
            d(new v(bArr, i10 * 8));
        } catch (InvalidParameterException unused) {
        }
        this.f31090c = true;
        return true;
    }

    public final boolean f(byte[] bArr) {
        m.e(bArr, "payload");
        return e(bArr, 1, bArr.length);
    }

    protected abstract void g(v vVar);

    public final byte[] h() {
        byte[] bArr = this.f31088a;
        if (bArr == null || bArr.length < b()) {
            bArr = new byte[b()];
        }
        g(new v(bArr, 0));
        byte[] bArr2 = this.f31088a;
        if (bArr2 == null) {
            return bArr;
        }
        m.b(bArr2);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr2.length);
        m.b(bArrCopyOfRange);
        return bArrCopyOfRange;
    }
}
