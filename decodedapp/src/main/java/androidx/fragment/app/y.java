package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.w;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList f2503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList f2504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    b[] f2505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f2506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f2507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList f2508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList f2509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ArrayList f2510h;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public y createFromParcel(Parcel parcel) {
            return new y(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public y[] newArray(int i10) {
            return new y[i10];
        }
    }

    public y() {
        this.f2507e = null;
        this.f2508f = new ArrayList();
        this.f2509g = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f2503a);
        parcel.writeStringList(this.f2504b);
        parcel.writeTypedArray(this.f2505c, i10);
        parcel.writeInt(this.f2506d);
        parcel.writeString(this.f2507e);
        parcel.writeStringList(this.f2508f);
        parcel.writeTypedList(this.f2509g);
        parcel.writeTypedList(this.f2510h);
    }

    public y(Parcel parcel) {
        this.f2507e = null;
        this.f2508f = new ArrayList();
        this.f2509g = new ArrayList();
        this.f2503a = parcel.createStringArrayList();
        this.f2504b = parcel.createStringArrayList();
        this.f2505c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f2506d = parcel.readInt();
        this.f2507e = parcel.readString();
        this.f2508f = parcel.createStringArrayList();
        this.f2509g = parcel.createTypedArrayList(c.CREATOR);
        this.f2510h = parcel.createTypedArrayList(w.k.CREATOR);
    }
}
