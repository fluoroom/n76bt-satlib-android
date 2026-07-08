package v7;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30415b;

    public j(String str) {
        this(str, null);
    }

    public j(String str, String str2) {
        q.j(str, "log tag cannot be null");
        q.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f30414a = str;
        this.f30415b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
