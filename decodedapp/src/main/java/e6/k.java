package e6;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected h f11557a;

    protected k(String str, h hVar, Throwable th2) {
        super(str, th2);
        this.f11557a = hVar;
    }

    @Override // e6.d
    public h a() {
        return this.f11557a;
    }

    @Override // e6.d
    public String b() {
        return super.getMessage();
    }

    @Override // e6.d
    public Object c() {
        return null;
    }

    protected String d() {
        return null;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        h hVarA = a();
        String strD = d();
        if (hVarA == null && strD == null) {
            return message;
        }
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(message);
        if (strD != null) {
            sb2.append(strD);
        }
        if (hVarA != null) {
            sb2.append('\n');
            sb2.append(" at ");
            sb2.append(hVarA.toString());
        }
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    protected k(String str) {
        super(str);
    }

    protected k(String str, h hVar) {
        this(str, hVar, null);
    }
}
