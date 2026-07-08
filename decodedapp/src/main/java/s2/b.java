package s2;

import e3.k;
import k2.v;

/* JADX INFO: loaded from: classes.dex */
public class b implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f26315a;

    public b(byte[] bArr) {
        this.f26315a = (byte[]) k.e(bArr);
    }

    @Override // k2.v
    public int a() {
        return this.f26315a.length;
    }

    @Override // k2.v
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f26315a;
    }

    @Override // k2.v
    public Class d() {
        return byte[].class;
    }

    @Override // k2.v
    public void c() {
    }
}
