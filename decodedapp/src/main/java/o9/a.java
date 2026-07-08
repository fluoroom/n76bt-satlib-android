package o9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.i;

/* JADX INFO: loaded from: classes3.dex */
public class a extends q0.a {
    public static final Parcelable.Creator<a> CREATOR = new C0315a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f23333a;

    /* JADX INFO: renamed from: o9.a$a, reason: collision with other inner class name */
    class C0315a implements Parcelable.ClassLoaderCreator {
        C0315a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C0315a c0315a) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f23333a + "}";
    }

    @Override // q0.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        int size = this.f23333a.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i11 = 0; i11 < size; i11++) {
            strArr[i11] = (String) this.f23333a.f(i11);
            bundleArr[i11] = (Bundle) this.f23333a.j(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f23333a = new i();
    }

    private a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i10 = parcel.readInt();
        String[] strArr = new String[i10];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i10];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f23333a = new i(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f23333a.put(strArr[i11], bundleArr[i11]);
        }
    }
}
