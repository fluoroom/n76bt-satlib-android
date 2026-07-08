package n7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import v7.q;

/* JADX INFO: loaded from: classes.dex */
public final class b extends w7.a {
    public static final Parcelable.Creator<b> CREATOR = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingIntent f22603a;

    public b(PendingIntent pendingIntent) {
        this.f22603a = (PendingIntent) q.i(pendingIntent);
    }

    public PendingIntent b() {
        return this.f22603a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.p(parcel, 1, b(), i10, false);
        w7.c.b(parcel, iA);
    }
}
