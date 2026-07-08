package c5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Parcelable {
    public static final a CREATOR = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f4371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LatLng f4372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f4373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z4.j f4374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private x f4375e;

    public static final class a implements Parcelable.Creator {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public y createFromParcel(Parcel parcel) {
            rd.m.e(parcel, "parcel");
            return new y(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public y[] newArray(int i10) {
            return new y[i10];
        }

        private a() {
        }
    }

    public y() {
        this.f4374d = z4.j.f32938b;
        this.f4375e = x.NORMAL;
    }

    public final LatLng b() {
        return this.f4372b;
    }

    public final long c() {
        return this.f4373c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final x e() {
        return this.f4375e;
    }

    public final z4.j f() {
        return this.f4374d;
    }

    public final float g() {
        return this.f4371a;
    }

    public final void h(LatLng latLng) {
        this.f4372b = latLng;
    }

    public final void i(long j10) {
        this.f4373c = j10;
    }

    public final void j(x xVar) {
        rd.m.e(xVar, "<set-?>");
        this.f4375e = xVar;
    }

    public final void k(z4.j jVar) {
        rd.m.e(jVar, "<set-?>");
        this.f4374d = jVar;
    }

    public final void l(float f10) {
        this.f4371a = f10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        rd.m.e(parcel, "parcel");
        parcel.writeFloat(this.f4371a);
        parcel.writeParcelable(this.f4372b, i10);
        parcel.writeLong(this.f4373c);
        parcel.writeInt(this.f4374d.ordinal());
        parcel.writeInt(this.f4375e.ordinal());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(Parcel parcel) {
        this();
        rd.m.e(parcel, "parcel");
        this.f4371a = parcel.readFloat();
        this.f4372b = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.f4373c = parcel.readLong();
        this.f4374d = z4.j.f32937a.a(parcel.readInt());
        x xVarE = x.e(parcel.readInt());
        rd.m.d(xVarE, "valueOf(...)");
        this.f4375e = xVarE;
    }
}
