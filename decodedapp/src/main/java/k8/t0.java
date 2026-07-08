package k8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends w7.a implements t7.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Status f19524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t0 f19523b = new t0(Status.f7192f);
    public static final Parcelable.Creator<t0> CREATOR = new u0();

    public t0(Status status) {
        this.f19524a = status;
    }

    @Override // t7.k
    public final Status getStatus() {
        return this.f19524a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.p(parcel, 1, this.f19524a, i10, false);
        w7.c.b(parcel, iA);
    }
}
