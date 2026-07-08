package xc;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static int a(int i10) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i10 - 1));
    }
}
