package t7;

/* JADX INFO: loaded from: classes.dex */
public final class l extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s7.c f27602a;

    public l(s7.c cVar) {
        this.f27602a = cVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f27602a));
    }
}
