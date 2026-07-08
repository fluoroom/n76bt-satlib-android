package e8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class h extends w7.a {
    public static final Parcelable.Creator<h> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f11693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f11694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f11695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e f11696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f11697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f11698h;

    h(String str, String str2, byte[] bArr, d dVar, c cVar, e eVar, a aVar, String str3) {
        boolean z10 = true;
        if ((dVar == null || cVar != null || eVar != null) && ((dVar != null || cVar == null || eVar != null) && (dVar != null || cVar != null || eVar == null))) {
            z10 = false;
        }
        v7.q.a(z10);
        this.f11691a = str;
        this.f11692b = str2;
        this.f11693c = bArr;
        this.f11694d = dVar;
        this.f11695e = cVar;
        this.f11696f = eVar;
        this.f11697g = aVar;
        this.f11698h = str3;
    }

    public String b() {
        return this.f11698h;
    }

    public a c() {
        return this.f11697g;
    }

    public String e() {
        return this.f11691a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return v7.o.a(this.f11691a, hVar.f11691a) && v7.o.a(this.f11692b, hVar.f11692b) && Arrays.equals(this.f11693c, hVar.f11693c) && v7.o.a(this.f11694d, hVar.f11694d) && v7.o.a(this.f11695e, hVar.f11695e) && v7.o.a(this.f11696f, hVar.f11696f) && v7.o.a(this.f11697g, hVar.f11697g) && v7.o.a(this.f11698h, hVar.f11698h);
    }

    public byte[] f() {
        return this.f11693c;
    }

    public String g() {
        return this.f11692b;
    }

    public int hashCode() {
        return v7.o.b(this.f11691a, this.f11692b, this.f11693c, this.f11695e, this.f11694d, this.f11696f, this.f11697g, this.f11698h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.r(parcel, 1, e(), false);
        w7.c.r(parcel, 2, g(), false);
        w7.c.f(parcel, 3, f(), false);
        w7.c.p(parcel, 4, this.f11694d, i10, false);
        w7.c.p(parcel, 5, this.f11695e, i10, false);
        w7.c.p(parcel, 6, this.f11696f, i10, false);
        w7.c.p(parcel, 7, c(), i10, false);
        w7.c.r(parcel, 8, b(), false);
        w7.c.b(parcel, iA);
    }
}
