package q4;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f24296a;

    public a(long j10) {
        this.f24296a = j10;
    }

    public final byte[] a() {
        byte[] bArr = new byte[8];
        new a6.v(bArr).o((this.f24296a >> 16) & 255, 16).o(this.f24296a, 16).o((this.f24296a >> 24) & 255, 16).o(this.f24296a >> 32, 16);
        return bArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(byte[] bArr) {
        this(new a6.v(bArr).k(48));
        rd.m.e(bArr, "addr");
    }
}
