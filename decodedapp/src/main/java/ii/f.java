package ii;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class f extends ji.a implements d {
    /* JADX WARN: Illegal instructions before constructor call */
    public f(hi.e eVar) {
        byte[] bArr = d.f16174b;
        super(eVar, bArr.length);
        if (!hi.c.a(bArr, a(), 0)) {
            throw new IllegalArgumentException("Invalid type, not a Opus Header");
        }
    }

    @Override // ji.a
    protected int e() {
        return 8;
    }

    @Override // ji.a
    protected boolean g() {
        return false;
    }

    @Override // ji.a
    protected void j(byte[] bArr, int i10) {
        byte[] bArr2 = d.f16174b;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
    }

    public f() {
    }

    @Override // ji.a
    protected void i(OutputStream outputStream) {
    }
}
