package k8;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes.dex */
final class w extends n8.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f19527c;

    w(s sVar) {
        this.f19527c = sVar;
    }

    @Override // n8.p
    public final void K(LocationResult locationResult) {
        this.f19527c.k().c(new t(this, locationResult));
    }

    @Override // n8.p
    public final void e() {
        this.f19527c.k().c(new v(this));
    }

    @Override // n8.p
    public final void i0(LocationAvailability locationAvailability) {
        this.f19527c.k().c(new u(this, locationAvailability));
    }

    final void v1() {
        this.f19527c.k().a();
    }

    final /* synthetic */ s w1() {
        return this.f19527c;
    }

    final w x(u7.j jVar) {
        this.f19527c.j(jVar);
        return this;
    }
}
