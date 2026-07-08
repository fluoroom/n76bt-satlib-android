package qe;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, Throwable th2) {
        super(str, th2);
        rd.m.e(str, "message");
    }

    public /* synthetic */ c(String str, Throwable th2, int i10, rd.h hVar) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }
}
