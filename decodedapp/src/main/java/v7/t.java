package v7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class t extends w7.a {
    public static final Parcelable.Creator<t> CREATOR = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f30481b;

    public t(int i10, List list) {
        this.f30480a = i10;
        this.f30481b = list;
    }

    public final int b() {
        return this.f30480a;
    }

    public final List c() {
        return this.f30481b;
    }

    public final void e(n nVar) {
        if (this.f30481b == null) {
            this.f30481b = new ArrayList();
        }
        this.f30481b.add(nVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 1, this.f30480a);
        w7.c.v(parcel, 2, this.f30481b, false);
        w7.c.b(parcel, iA);
    }
}
