package gk;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0208a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f14735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f14736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14737c;

    /* JADX INFO: renamed from: gk.a$a, reason: collision with other inner class name */
    static class C0208a implements Parcelable.Creator {
        C0208a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (C0208a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, C0208a c0208a) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14735a);
        parcel.writeStringList(this.f14736b);
        parcel.writeInt(this.f14737c);
    }

    private a(Parcel parcel) {
        this.f14735a = "";
        this.f14736b = new ArrayList();
        this.f14737c = 0;
        this.f14735a = parcel.readString();
        this.f14736b = parcel.createStringArrayList();
        this.f14737c = parcel.readInt();
    }

    public a(String str, List list) {
        this.f14735a = "";
        new ArrayList();
        this.f14737c = 0;
        this.f14735a = str;
        this.f14736b = list;
        this.f14737c = list.size();
    }
}
