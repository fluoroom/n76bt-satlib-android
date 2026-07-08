package mh;

import vh.h;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f22108d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final vh.h f22109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final vh.h f22110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final vh.h f22111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final vh.h f22112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final vh.h f22113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final vh.h f22114j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vh.h f22115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vh.h f22116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22117c;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    static {
        h.a aVar = vh.h.f30792d;
        f22109e = aVar.d(":");
        f22110f = aVar.d(":status");
        f22111g = aVar.d(":method");
        f22112h = aVar.d(":path");
        f22113i = aVar.d(":scheme");
        f22114j = aVar.d(":authority");
    }

    public d(vh.h hVar, vh.h hVar2) {
        rd.m.e(hVar, "name");
        rd.m.e(hVar2, "value");
        this.f22115a = hVar;
        this.f22116b = hVar2;
        this.f22117c = hVar.Q() + 32 + hVar2.Q();
    }

    public final vh.h a() {
        return this.f22115a;
    }

    public final vh.h b() {
        return this.f22116b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return rd.m.a(this.f22115a, dVar.f22115a) && rd.m.a(this.f22116b, dVar.f22116b);
    }

    public int hashCode() {
        return (this.f22115a.hashCode() * 31) + this.f22116b.hashCode();
    }

    public String toString() {
        return this.f22115a.Z() + ": " + this.f22116b.Z();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(String str, String str2) {
        rd.m.e(str, "name");
        rd.m.e(str2, "value");
        h.a aVar = vh.h.f30792d;
        this(aVar.d(str), aVar.d(str2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(vh.h hVar, String str) {
        this(hVar, vh.h.f30792d.d(str));
        rd.m.e(hVar, "name");
        rd.m.e(str, "value");
    }
}
