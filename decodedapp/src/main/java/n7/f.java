package n7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import v7.q;

/* JADX INFO: loaded from: classes.dex */
public final class f extends w7.a {
    public static final Parcelable.Creator<f> CREATOR = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f22609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uri f22610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f22611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f22612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f22613h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final e8.h f22614r;

    f(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, e8.h hVar) {
        this.f22606a = (String) q.i(str);
        this.f22607b = str2;
        this.f22608c = str3;
        this.f22609d = str4;
        this.f22610e = uri;
        this.f22611f = str5;
        this.f22612g = str6;
        this.f22613h = str7;
        this.f22614r = hVar;
    }

    public String b() {
        return this.f22607b;
    }

    public String c() {
        return this.f22609d;
    }

    public String e() {
        return this.f22608c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return v7.o.a(this.f22606a, fVar.f22606a) && v7.o.a(this.f22607b, fVar.f22607b) && v7.o.a(this.f22608c, fVar.f22608c) && v7.o.a(this.f22609d, fVar.f22609d) && v7.o.a(this.f22610e, fVar.f22610e) && v7.o.a(this.f22611f, fVar.f22611f) && v7.o.a(this.f22612g, fVar.f22612g) && v7.o.a(this.f22613h, fVar.f22613h) && v7.o.a(this.f22614r, fVar.f22614r);
    }

    public String f() {
        return this.f22612g;
    }

    public String g() {
        return this.f22606a;
    }

    public String h() {
        return this.f22611f;
    }

    public int hashCode() {
        return v7.o.b(this.f22606a, this.f22607b, this.f22608c, this.f22609d, this.f22610e, this.f22611f, this.f22612g, this.f22613h, this.f22614r);
    }

    public String i() {
        return this.f22613h;
    }

    public Uri j() {
        return this.f22610e;
    }

    public e8.h k() {
        return this.f22614r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.r(parcel, 1, g(), false);
        w7.c.r(parcel, 2, b(), false);
        w7.c.r(parcel, 3, e(), false);
        w7.c.r(parcel, 4, c(), false);
        w7.c.p(parcel, 5, j(), i10, false);
        w7.c.r(parcel, 6, h(), false);
        w7.c.r(parcel, 7, f(), false);
        w7.c.r(parcel, 8, i(), false);
        w7.c.p(parcel, 9, k(), i10, false);
        w7.c.b(parcel, iA);
    }
}
