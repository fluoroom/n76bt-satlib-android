package jb;

import jb.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile int f18586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f18587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f18588c;

    public b() {
        this(e.f18609a, true, i.f18627a);
    }

    public void a(int i10) {
        this.f18586a = i10;
    }

    public void b(int i10, Thread thread, long j10, String str, String str2, Throwable th2) {
        if (e() && f.a.a(this.f18586a, i10)) {
            f(i10, thread, j10, str, str2, th2);
        }
    }

    public void c(i iVar) {
        this.f18588c = iVar;
    }

    public void d(boolean z10) {
        this.f18587b = z10;
    }

    public boolean e() {
        return this.f18587b;
    }

    protected abstract void f(int i10, Thread thread, long j10, String str, String str2, Throwable th2);

    public i g() {
        return this.f18588c;
    }

    public b(int i10, boolean z10, i iVar) {
        this.f18586a = e.f18609a;
        this.f18587b = true;
        this.f18588c = i.f18627a;
        a(i10);
        d(z10);
        c(iVar);
    }
}
