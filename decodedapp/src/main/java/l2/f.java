package l2;

/* JADX INFO: loaded from: classes.dex */
public final class f implements a {
    @Override // l2.a
    public String a() {
        return "ByteArrayPool";
    }

    @Override // l2.a
    public int b() {
        return 1;
    }

    @Override // l2.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int c(byte[] bArr) {
        return bArr.length;
    }

    @Override // l2.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i10) {
        return new byte[i10];
    }
}
