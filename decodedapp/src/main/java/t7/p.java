package t7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
final class p implements Parcelable.Creator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p f27604b = new p(new q());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Parcelable.Creator f27605a;

    private p(Parcelable.Creator creator) {
        this.f27605a = creator;
    }

    public static p a() {
        return f27604b;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        if (parcel.readInt() == -204102970) {
            return q.a(parcel);
        }
        parcel.setDataPosition(iDataPosition - 4);
        return c.c();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
