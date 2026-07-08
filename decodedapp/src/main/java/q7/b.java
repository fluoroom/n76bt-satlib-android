package q7;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24377a = 1;

    public b a(Object obj) {
        this.f24377a = (this.f24377a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.f24377a;
    }

    public final b c(boolean z10) {
        this.f24377a = (this.f24377a * 31) + (z10 ? 1 : 0);
        return this;
    }
}
