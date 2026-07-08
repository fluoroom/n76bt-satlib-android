package ad;

/* JADX INFO: loaded from: classes3.dex */
public class a extends Error {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Exception f424a;

    public a(String str, Exception exc) {
        super(str);
        this.f424a = exc;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        Exception exc;
        String message = super.getMessage();
        if (message != null || (exc = this.f424a) == null) {
            return message;
        }
        String message2 = exc.getMessage();
        return message2 == null ? this.f424a.getClass().toString() : message2;
    }
}
