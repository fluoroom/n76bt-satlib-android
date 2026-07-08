package t8;

/* JADX INFO: loaded from: classes.dex */
public final class b extends IllegalStateException {
    private b(String str, Throwable th2) {
        super(str, th2);
    }

    public static IllegalStateException a(g gVar) {
        if (!gVar.i()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excF = gVar.f();
        return new b("Complete with: ".concat(excF != null ? "failure" : gVar.j() ? "result ".concat(String.valueOf(gVar.g())) : gVar.h() ? "cancellation" : "unknown issue"), excF);
    }
}
