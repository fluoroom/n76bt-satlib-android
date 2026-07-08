package r6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f25493c = e.values().length;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final b[] f25495b = new b[f25493c];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Boolean f25494a = null;

    public b a(e eVar) {
        return this.f25495b[eVar.ordinal()];
    }

    public Boolean b() {
        return this.f25494a;
    }
}
