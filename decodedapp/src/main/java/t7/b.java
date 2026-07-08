package t7;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public class b extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Status f27573a;

    public b(Status status) {
        super(status.c() + ": " + (status.e() != null ? status.e() : ""));
        this.f27573a = status;
    }

    public Status a() {
        return this.f27573a;
    }

    public int b() {
        return this.f27573a.c();
    }
}
