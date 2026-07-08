package tb;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final vh.h f27701d = vh.h.f(":status");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final vh.h f27702e = vh.h.f(":method");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final vh.h f27703f = vh.h.f(":path");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final vh.h f27704g = vh.h.f(":scheme");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final vh.h f27705h = vh.h.f(":authority");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final vh.h f27706i = vh.h.f(":host");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final vh.h f27707j = vh.h.f(":version");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vh.h f27708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vh.h f27709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f27710c;

    public d(String str, String str2) {
        this(vh.h.f(str), vh.h.f(str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f27708a.equals(dVar.f27708a) && this.f27709b.equals(dVar.f27709b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f27708a.hashCode()) * 31) + this.f27709b.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", this.f27708a.Z(), this.f27709b.Z());
    }

    public d(vh.h hVar, String str) {
        this(hVar, vh.h.f(str));
    }

    public d(vh.h hVar, vh.h hVar2) {
        this.f27708a = hVar;
        this.f27709b = hVar2;
        this.f27710c = hVar.Q() + 32 + hVar2.Q();
    }
}
