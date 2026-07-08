package s7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class t extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f27007d;

    t(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f27007d = bArr;
    }

    @Override // s7.s
    final byte[] x() {
        return this.f27007d;
    }
}
