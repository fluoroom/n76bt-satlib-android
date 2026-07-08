package c5;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0066a();
    public String A;

    /* JADX INFO: renamed from: a */
    public long f4288a;

    /* JADX INFO: renamed from: b */
    public Location f4289b;

    /* JADX INFO: renamed from: c */
    public String f4290c;

    /* JADX INFO: renamed from: d */
    public String f4291d;

    /* JADX INFO: renamed from: e */
    public Bitmap f4292e;

    /* JADX INFO: renamed from: f */
    public long f4293f;

    /* JADX INFO: renamed from: g */
    public boolean f4294g;

    /* JADX INFO: renamed from: h */
    public boolean f4295h;

    /* JADX INFO: renamed from: r */
    public boolean f4296r;

    /* JADX INFO: renamed from: s */
    public boolean f4297s;

    /* JADX INFO: renamed from: t */
    public float f4298t;

    /* JADX INFO: renamed from: u */
    private int f4299u;

    /* JADX INFO: renamed from: v */
    private int f4300v;

    /* JADX INFO: renamed from: w */
    public double f4301w;

    /* JADX INFO: renamed from: x */
    public int[] f4302x;

    /* JADX INFO: renamed from: y */
    public int f4303y;

    /* JADX INFO: renamed from: z */
    public boolean f4304z;

    /* JADX INFO: renamed from: c5.a$a */
    class C0066a implements Parcelable.Creator {
        C0066a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a() {
        this.f4295h = false;
        this.f4296r = false;
        this.f4297s = true;
        this.f4298t = Float.NaN;
        this.f4299u = -1;
        this.f4300v = -1;
        this.f4301w = Double.NaN;
        this.f4304z = true;
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("args", this);
        return bundle;
    }

    public com.dw.ht.fragments.j c() {
        try {
            com.dw.ht.fragments.j jVar = (com.dw.ht.fragments.j) z4.m.e().newInstance();
            jVar.E3(b());
            return jVar;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double e() {
        return this.f4301w;
    }

    public x f() {
        int i10 = this.f4299u;
        if (i10 < 0 || i10 >= x.values().length) {
            return null;
        }
        return x.values()[this.f4299u];
    }

    public z4.j g() {
        int i10 = this.f4300v;
        if (i10 < 0 || i10 >= z4.j.values().length) {
            return null;
        }
        return z4.j.values()[this.f4300v];
    }

    public a h(String str) {
        this.A = str;
        return this;
    }

    public a i(Location location, String str, String str2) {
        this.f4289b = location;
        this.f4290c = str;
        this.f4291d = str2;
        return this;
    }

    public a j(long j10) {
        this.f4293f = j10;
        return this;
    }

    public a k(boolean z10) {
        this.f4294g = z10;
        return this;
    }

    public a l(x xVar) {
        if (xVar == null) {
            this.f4299u = -1;
            return this;
        }
        this.f4299u = xVar.ordinal();
        return this;
    }

    public a m(boolean z10) {
        this.f4304z = z10;
        return this;
    }

    public a n(z4.j jVar) {
        if (jVar == null) {
            this.f4300v = -1;
            return this;
        }
        this.f4300v = jVar.ordinal();
        return this;
    }

    public a o(double d10) {
        this.f4301w = d10;
        return this;
    }

    public a p(boolean z10) {
        this.f4295h = z10;
        return this;
    }

    public a q(boolean z10) {
        this.f4296r = z10;
        return this;
    }

    public a r(boolean z10) {
        this.f4297s = z10;
        return this;
    }

    public a s(long j10) {
        this.f4288a = j10;
        return this;
    }

    public a t(float f10) {
        this.f4298t = f10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f4288a);
        parcel.writeParcelable(this.f4289b, i10);
        parcel.writeString(this.f4290c);
        parcel.writeString(this.f4291d);
        parcel.writeParcelable(this.f4292e, i10);
        parcel.writeLong(this.f4293f);
        parcel.writeByte(this.f4294g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4295h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4296r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4297s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4304z ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.f4298t);
        parcel.writeInt(this.f4299u);
        parcel.writeInt(this.f4300v);
        parcel.writeDouble(this.f4301w);
        parcel.writeIntArray(this.f4302x);
        parcel.writeInt(this.f4303y);
        parcel.writeString(this.A);
    }

    protected a(Parcel parcel) {
        this.f4295h = false;
        this.f4296r = false;
        this.f4297s = true;
        this.f4298t = Float.NaN;
        this.f4299u = -1;
        this.f4300v = -1;
        this.f4301w = Double.NaN;
        this.f4304z = true;
        this.f4288a = parcel.readLong();
        this.f4289b = (Location) parcel.readParcelable(Location.class.getClassLoader());
        this.f4290c = parcel.readString();
        this.f4291d = parcel.readString();
        this.f4292e = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f4293f = parcel.readLong();
        this.f4294g = parcel.readByte() != 0;
        this.f4295h = parcel.readByte() != 0;
        this.f4296r = parcel.readByte() != 0;
        this.f4297s = parcel.readByte() != 0;
        this.f4304z = parcel.readByte() != 0;
        this.f4298t = parcel.readFloat();
        this.f4299u = parcel.readInt();
        this.f4300v = parcel.readInt();
        this.f4301w = parcel.readDouble();
        this.f4302x = parcel.createIntArray();
        this.f4303y = parcel.readInt();
        this.A = parcel.readString();
    }
}
