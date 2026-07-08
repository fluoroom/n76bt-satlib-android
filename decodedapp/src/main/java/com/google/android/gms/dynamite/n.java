package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c8.b;

/* JADX INFO: loaded from: classes.dex */
public final class n extends i8.a implements IInterface {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final c8.b v1(c8.b bVar, String str, int i10, c8.b bVar2) {
        Parcel parcelQ = q();
        i8.e.c(parcelQ, bVar);
        parcelQ.writeString(str);
        parcelQ.writeInt(i10);
        i8.e.c(parcelQ, bVar2);
        Parcel parcelJ = j(3, parcelQ);
        c8.b bVarQ = b.a.q(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return bVarQ;
    }

    public final c8.b x(c8.b bVar, String str, int i10, c8.b bVar2) {
        Parcel parcelQ = q();
        i8.e.c(parcelQ, bVar);
        parcelQ.writeString(str);
        parcelQ.writeInt(i10);
        i8.e.c(parcelQ, bVar2);
        Parcel parcelJ = j(2, parcelQ);
        c8.b bVarQ = b.a.q(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return bVarQ;
    }
}
