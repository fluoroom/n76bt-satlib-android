package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c8.b;

/* JADX INFO: loaded from: classes.dex */
public final class m extends i8.a implements IInterface {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final c8.b A1(c8.b bVar, String str, boolean z10, long j10) {
        Parcel parcelQ = q();
        i8.e.c(parcelQ, bVar);
        parcelQ.writeString(str);
        parcelQ.writeInt(z10 ? 1 : 0);
        parcelQ.writeLong(j10);
        Parcel parcelJ = j(7, parcelQ);
        c8.b bVarQ = b.a.q(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return bVarQ;
    }

    public final int v1(c8.b bVar, String str, boolean z10) {
        Parcel parcelQ = q();
        i8.e.c(parcelQ, bVar);
        parcelQ.writeString(str);
        parcelQ.writeInt(z10 ? 1 : 0);
        Parcel parcelJ = j(3, parcelQ);
        int i10 = parcelJ.readInt();
        parcelJ.recycle();
        return i10;
    }

    public final int w1(c8.b bVar, String str, boolean z10) {
        Parcel parcelQ = q();
        i8.e.c(parcelQ, bVar);
        parcelQ.writeString(str);
        parcelQ.writeInt(z10 ? 1 : 0);
        Parcel parcelJ = j(5, parcelQ);
        int i10 = parcelJ.readInt();
        parcelJ.recycle();
        return i10;
    }

    public final int x() {
        Parcel parcelJ = j(6, q());
        int i10 = parcelJ.readInt();
        parcelJ.recycle();
        return i10;
    }

    public final c8.b x1(c8.b bVar, String str, int i10) {
        Parcel parcelQ = q();
        i8.e.c(parcelQ, bVar);
        parcelQ.writeString(str);
        parcelQ.writeInt(i10);
        Parcel parcelJ = j(2, parcelQ);
        c8.b bVarQ = b.a.q(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return bVarQ;
    }

    public final c8.b y1(c8.b bVar, String str, int i10, c8.b bVar2) {
        Parcel parcelQ = q();
        i8.e.c(parcelQ, bVar);
        parcelQ.writeString(str);
        parcelQ.writeInt(i10);
        i8.e.c(parcelQ, bVar2);
        Parcel parcelJ = j(8, parcelQ);
        c8.b bVarQ = b.a.q(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return bVarQ;
    }

    public final c8.b z1(c8.b bVar, String str, int i10) {
        Parcel parcelQ = q();
        i8.e.c(parcelQ, bVar);
        parcelQ.writeString(str);
        parcelQ.writeInt(i10);
        Parcel parcelJ = j(4, parcelQ);
        c8.b bVarQ = b.a.q(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return bVarQ;
    }
}
