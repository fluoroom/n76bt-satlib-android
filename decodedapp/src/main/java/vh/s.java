package vh;

import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RandomAccessFile f30861e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z10, RandomAccessFile randomAccessFile) {
        super(z10);
        rd.m.e(randomAccessFile, "randomAccessFile");
        this.f30861e = randomAccessFile;
    }

    @Override // vh.i
    protected synchronized void n() {
        this.f30861e.close();
    }

    @Override // vh.i
    protected synchronized int q(long j10, byte[] bArr, int i10, int i11) {
        rd.m.e(bArr, "array");
        this.f30861e.seek(j10);
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i13 = this.f30861e.read(bArr, i10, i11 - i12);
            if (i13 != -1) {
                i12 += i13;
            } else if (i12 == 0) {
                return -1;
            }
        }
        return i12;
    }

    @Override // vh.i
    protected synchronized long r() {
        return this.f30861e.length();
    }
}
