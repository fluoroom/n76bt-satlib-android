package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f8538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f8539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f8540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f8541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f8542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f8543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f8544g;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(int i10, int i11, int i12, int i13) {
        this.f8541d = i10;
        this.f8542e = i11;
        this.f8543f = i12;
        this.f8540c = i13;
        this.f8544g = e(i10);
        this.f8538a = new b(59);
        this.f8539b = new b(i13 == 1 ? 23 : 12);
    }

    public static String b(Resources resources, CharSequence charSequence) {
        return c(resources, charSequence, "%02d");
    }

    public static String c(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int e(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f8541d == eVar.f8541d && this.f8542e == eVar.f8542e && this.f8540c == eVar.f8540c && this.f8543f == eVar.f8543f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8540c), Integer.valueOf(this.f8541d), Integer.valueOf(this.f8542e), Integer.valueOf(this.f8543f)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f8541d);
        parcel.writeInt(this.f8542e);
        parcel.writeInt(this.f8543f);
        parcel.writeInt(this.f8540c);
    }

    protected e(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
