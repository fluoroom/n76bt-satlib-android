package q8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import c8.b;

/* JADX INFO: loaded from: classes.dex */
public class e extends w7.a {
    public static final Parcelable.Creator<e> CREATOR = new i0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f24397d = "e";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f24399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Float f24400c;

    protected e(int i10) {
        this(i10, (b) null, (Float) null);
    }

    final e b() {
        int i10 = this.f24398a;
        if (i10 == 0) {
            return new d();
        }
        if (i10 == 1) {
            return new r();
        }
        if (i10 == 2) {
            return new p();
        }
        if (i10 == 3) {
            b bVar = this.f24399b;
            v7.q.l(bVar != null, "bitmapDescriptor must not be null");
            Float f10 = this.f24400c;
            v7.q.l(f10 != null, "bitmapRefWidth must not be null");
            return new f(bVar, f10.floatValue());
        }
        Log.w(f24397d, "Unknown Cap type: " + i10);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f24398a == eVar.f24398a && v7.o.a(this.f24399b, eVar.f24399b) && v7.o.a(this.f24400c, eVar.f24400c);
    }

    public int hashCode() {
        return v7.o.b(Integer.valueOf(this.f24398a), this.f24399b, this.f24400c);
    }

    public String toString() {
        return "[Cap: type=" + this.f24398a + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f24398a;
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 2, i11);
        b bVar = this.f24399b;
        w7.c.j(parcel, 3, bVar == null ? null : bVar.a().asBinder(), false);
        w7.c.i(parcel, 4, this.f24400c, false);
        w7.c.b(parcel, iA);
    }

    e(int i10, IBinder iBinder, Float f10) {
        this(i10, iBinder == null ? null : new b(b.a.q(iBinder)), f10);
    }

    private e(int i10, b bVar, Float f10) {
        boolean z10;
        boolean z11 = f10 != null && f10.floatValue() > 0.0f;
        if (i10 != 3) {
            z10 = true;
        } else if (bVar == null || !z11) {
            i10 = 3;
            z10 = false;
        } else {
            i10 = 3;
            z10 = true;
        }
        v7.q.b(z10, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i10), bVar, f10));
        this.f24398a = i10;
        this.f24399b = bVar;
        this.f24400c = f10;
    }

    protected e(b bVar, float f10) {
        this(3, bVar, Float.valueOf(f10));
    }
}
