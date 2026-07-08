package vh;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class o extends o0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o0 f30838f;

    public o(o0 o0Var) {
        rd.m.e(o0Var, "delegate");
        this.f30838f = o0Var;
    }

    @Override // vh.o0
    public o0 a() {
        return this.f30838f.a();
    }

    @Override // vh.o0
    public o0 b() {
        return this.f30838f.b();
    }

    @Override // vh.o0
    public long c() {
        return this.f30838f.c();
    }

    @Override // vh.o0
    public o0 d(long j10) {
        return this.f30838f.d(j10);
    }

    @Override // vh.o0
    public boolean e() {
        return this.f30838f.e();
    }

    @Override // vh.o0
    public void f() throws InterruptedIOException {
        this.f30838f.f();
    }

    @Override // vh.o0
    public o0 g(long j10, TimeUnit timeUnit) {
        rd.m.e(timeUnit, "unit");
        return this.f30838f.g(j10, timeUnit);
    }

    public final o0 i() {
        return this.f30838f;
    }

    public final o j(o0 o0Var) {
        rd.m.e(o0Var, "delegate");
        this.f30838f = o0Var;
        return this;
    }
}
