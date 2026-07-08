package g6;

import e6.j;
import e6.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected transient j f13561b;

    protected c(j jVar, String str) {
        super(str, jVar == null ? null : jVar.H());
        this.f13561b = jVar;
    }

    @Override // e6.k, e6.d
    /* JADX INFO: renamed from: e */
    public j c() {
        return this.f13561b;
    }

    @Override // e6.k, java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }

    protected c(j jVar, String str, Throwable th2) {
        super(str, jVar == null ? null : jVar.H(), th2);
        this.f13561b = jVar;
    }
}
