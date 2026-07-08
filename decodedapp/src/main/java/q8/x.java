package q8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class x extends w7.a {
    public static final Parcelable.Creator<x> CREATOR = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l8.p f24481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y f24482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f24484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f24486f;

    public x() {
        this.f24483c = true;
        this.f24485e = true;
        this.f24486f = 0.0f;
    }

    public boolean b() {
        return this.f24485e;
    }

    public y c() {
        return this.f24482b;
    }

    public float e() {
        return this.f24486f;
    }

    public float f() {
        return this.f24484d;
    }

    public boolean g() {
        return this.f24483c;
    }

    public x h(y yVar) {
        this.f24482b = (y) v7.q.j(yVar, "tileProvider must not be null.");
        this.f24481a = new f0(this, yVar);
        return this;
    }

    public x i(float f10) {
        this.f24484d = f10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        l8.p pVar = this.f24481a;
        w7.c.j(parcel, 2, pVar == null ? null : pVar.asBinder(), false);
        w7.c.c(parcel, 3, g());
        w7.c.h(parcel, 4, f());
        w7.c.c(parcel, 5, b());
        w7.c.h(parcel, 6, e());
        w7.c.b(parcel, iA);
    }

    x(IBinder iBinder, boolean z10, float f10, boolean z11, float f11) {
        this.f24483c = true;
        this.f24485e = true;
        this.f24486f = 0.0f;
        l8.p pVarQ = l8.o.q(iBinder);
        this.f24481a = pVarQ;
        this.f24482b = pVarQ == null ? null : new e0(this);
        this.f24483c = z10;
        this.f24484d = f10;
        this.f24485e = z11;
        this.f24486f = f11;
    }
}
