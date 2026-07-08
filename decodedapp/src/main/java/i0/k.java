package i0;

/* JADX INFO: loaded from: classes.dex */
public class k extends RuntimeException {
    public k() {
        this(null);
    }

    public k(String str) {
        super(l0.b.e(str, "The operation has been canceled."));
    }
}
