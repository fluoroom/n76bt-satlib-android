package a6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f326a;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(int i10) {
        this.f326a = i10;
    }

    public int b() {
        return this.f326a;
    }

    public c c(int i10) {
        if (i10 < 0 || i10 > 31) {
            throw new IllegalArgumentException("index mast in [0,31]");
        }
        this.f326a = (1 << i10) | this.f326a;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(int i10) {
        this.f326a = i10;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof c) && ((c) obj).f326a == this.f326a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f326a);
    }

    protected c(Parcel parcel) {
        this.f326a = parcel.readInt();
    }
}
