package jh;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class t {
    public static /* synthetic */ boolean a(u uVar, n nVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hasNext");
        }
        if ((i10 & 1) != 0) {
            nVar = null;
        }
        return uVar.a(nVar);
    }
}
