package p8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends l8.a implements b {
    e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // p8.b
    public final void A0(q0 q0Var) {
        Parcel parcelQ = q();
        l8.r.e(parcelQ, q0Var);
        x(83, parcelQ);
    }

    @Override // p8.b
    public final float D() {
        Parcel parcelJ = j(3, q());
        float f10 = parcelJ.readFloat();
        parcelJ.recycle();
        return f10;
    }

    @Override // p8.b
    public final void E0(int i10) {
        Parcel parcelQ = q();
        parcelQ.writeInt(i10);
        x(16, parcelQ);
    }

    @Override // p8.b
    public final l8.j H0(q8.o oVar) {
        Parcel parcelQ = q();
        l8.r.c(parcelQ, oVar);
        Parcel parcelJ = j(9, parcelQ);
        l8.j jVarQ = l8.i.q(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return jVarQ;
    }

    @Override // p8.b
    public final boolean I(boolean z10) {
        Parcel parcelQ = q();
        int i10 = l8.r.f20510b;
        parcelQ.writeInt(z10 ? 1 : 0);
        Parcel parcelJ = j(20, parcelQ);
        boolean zF = l8.r.f(parcelJ);
        parcelJ.recycle();
        return zF;
    }

    @Override // p8.b
    public final void L0(x xVar) {
        Parcel parcelQ = q();
        l8.r.e(parcelQ, xVar);
        x(87, parcelQ);
    }

    @Override // p8.b
    public final void M(i iVar) {
        Parcel parcelQ = q();
        l8.r.e(parcelQ, iVar);
        x(32, parcelQ);
    }

    @Override // p8.b
    public final f R0() {
        f zVar;
        Parcel parcelJ = j(25, q());
        IBinder strongBinder = parcelJ.readStrongBinder();
        if (strongBinder == null) {
            zVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            zVar = iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new z(strongBinder);
        }
        parcelJ.recycle();
        return zVar;
    }

    @Override // p8.b
    public final void S0(c8.b bVar) {
        Parcel parcelQ = q();
        l8.r.e(parcelQ, bVar);
        x(4, parcelQ);
    }

    @Override // p8.b
    public final void X0(m0 m0Var) {
        Parcel parcelQ = q();
        l8.r.e(parcelQ, m0Var);
        x(98, parcelQ);
    }

    @Override // p8.b
    public final l8.m Y(q8.x xVar) {
        Parcel parcelQ = q();
        l8.r.c(parcelQ, xVar);
        Parcel parcelJ = j(13, parcelQ);
        l8.m mVarQ = l8.l.q(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return mVarQ;
    }

    @Override // p8.b
    public final void b1(o0 o0Var) {
        Parcel parcelQ = q();
        l8.r.e(parcelQ, o0Var);
        x(96, parcelQ);
    }

    @Override // p8.b
    public final void c1(g0 g0Var) {
        Parcel parcelQ = q();
        l8.r.e(parcelQ, g0Var);
        x(33, parcelQ);
    }

    @Override // p8.b
    public final l8.d d1(q8.j jVar) {
        Parcel parcelQ = q();
        l8.r.c(parcelQ, jVar);
        Parcel parcelJ = j(11, parcelQ);
        l8.d dVarQ = l8.c.q(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return dVarQ;
    }

    @Override // p8.b
    public final void e0(v vVar) {
        Parcel parcelQ = q();
        l8.r.e(parcelQ, vVar);
        x(85, parcelQ);
    }

    @Override // p8.b
    public final CameraPosition f0() {
        Parcel parcelJ = j(1, q());
        CameraPosition cameraPosition = (CameraPosition) l8.r.a(parcelJ, CameraPosition.CREATOR);
        parcelJ.recycle();
        return cameraPosition;
    }

    @Override // p8.b
    public final float h1() {
        Parcel parcelJ = j(2, q());
        float f10 = parcelJ.readFloat();
        parcelJ.recycle();
        return f10;
    }

    @Override // p8.b
    public final void i1(boolean z10) {
        Parcel parcelQ = q();
        int i10 = l8.r.f20510b;
        parcelQ.writeInt(z10 ? 1 : 0);
        x(22, parcelQ);
    }

    @Override // p8.b
    public final void o1(k0 k0Var) {
        Parcel parcelQ = q();
        l8.r.e(parcelQ, k0Var);
        x(99, parcelQ);
    }

    @Override // p8.b
    public final l8.g p0(q8.m mVar) {
        Parcel parcelQ = q();
        l8.r.c(parcelQ, mVar);
        Parcel parcelJ = j(10, parcelQ);
        l8.g gVarQ = l8.f.q(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return gVarQ;
    }

    @Override // p8.b
    public final void q0(s sVar) {
        Parcel parcelQ = q();
        l8.r.e(parcelQ, sVar);
        x(31, parcelQ);
    }

    @Override // p8.b
    public final l8.x q1(q8.h hVar) {
        Parcel parcelQ = q();
        l8.r.c(parcelQ, hVar);
        Parcel parcelJ = j(12, parcelQ);
        l8.x xVarQ = l8.w.q(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return xVarQ;
    }

    @Override // p8.b
    public final e s() {
        e yVar;
        Parcel parcelJ = j(26, q());
        IBinder strongBinder = parcelJ.readStrongBinder();
        if (strongBinder == null) {
            yVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            yVar = iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new y(strongBinder);
        }
        parcelJ.recycle();
        return yVar;
    }

    @Override // p8.b
    public final void s1(c8.b bVar) {
        Parcel parcelQ = q();
        l8.r.e(parcelQ, bVar);
        x(5, parcelQ);
    }

    @Override // p8.b
    public final void t1(k kVar) {
        Parcel parcelQ = q();
        l8.r.e(parcelQ, kVar);
        x(84, parcelQ);
    }

    @Override // p8.b
    public final void u0(q qVar) {
        Parcel parcelQ = q();
        l8.r.e(parcelQ, qVar);
        x(30, parcelQ);
    }

    @Override // p8.b
    public final void u1(c cVar) {
        Parcel parcelQ = q();
        l8.r.e(parcelQ, cVar);
        x(24, parcelQ);
    }

    @Override // p8.b
    public final void y(boolean z10) {
        Parcel parcelQ = q();
        int i10 = l8.r.f20510b;
        parcelQ.writeInt(z10 ? 1 : 0);
        x(41, parcelQ);
    }

    @Override // p8.b
    public final void z0(boolean z10) {
        Parcel parcelQ = q();
        int i10 = l8.r.f20510b;
        parcelQ.writeInt(z10 ? 1 : 0);
        x(18, parcelQ);
    }
}
