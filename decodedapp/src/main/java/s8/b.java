package s8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class b extends w7.a implements t7.k {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f27017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Intent f27019c;

    b(int i10, int i11, Intent intent) {
        this.f27017a = i10;
        this.f27018b = i11;
        this.f27019c = intent;
    }

    @Override // t7.k
    public final Status getStatus() {
        return this.f27018b == 0 ? Status.f7192f : Status.f7196s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f27017a;
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 1, i11);
        w7.c.k(parcel, 2, this.f27018b);
        w7.c.p(parcel, 3, this.f27019c, i10, false);
        w7.c.b(parcel, iA);
    }
}
