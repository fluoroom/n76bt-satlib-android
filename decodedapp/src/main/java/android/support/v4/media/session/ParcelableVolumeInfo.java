package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f730e;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f726a = parcel.readInt();
        this.f728c = parcel.readInt();
        this.f729d = parcel.readInt();
        this.f730e = parcel.readInt();
        this.f727b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f726a);
        parcel.writeInt(this.f728c);
        parcel.writeInt(this.f729d);
        parcel.writeInt(this.f730e);
        parcel.writeInt(this.f727b);
    }
}
