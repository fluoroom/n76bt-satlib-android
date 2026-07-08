package l2;

/* JADX INFO: loaded from: classes.dex */
public final class h implements a {
    @Override // l2.a
    public String a() {
        return "IntegerArrayPool";
    }

    @Override // l2.a
    public int b() {
        return 4;
    }

    @Override // l2.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int c(int[] iArr) {
        return iArr.length;
    }

    @Override // l2.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int[] newArray(int i10) {
        return new int[i10];
    }
}
