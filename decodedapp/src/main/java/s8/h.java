package s8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h extends w7.a implements t7.k {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f27020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27021b;

    public h(List list, String str) {
        this.f27020a = list;
        this.f27021b = str;
    }

    @Override // t7.k
    public final Status getStatus() {
        return this.f27021b != null ? Status.f7192f : Status.f7196s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f27020a;
        int iA = w7.c.a(parcel);
        w7.c.t(parcel, 1, list, false);
        w7.c.r(parcel, 2, this.f27021b, false);
        w7.c.b(parcel, iA);
    }
}
