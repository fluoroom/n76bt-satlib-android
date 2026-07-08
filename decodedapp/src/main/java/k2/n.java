package k2;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class n implements i2.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f19080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class f19083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Class f19084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i2.f f19085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f19086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final i2.h f19087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19088j;

    n(Object obj, i2.f fVar, int i10, int i11, Map map, Class cls, Class cls2, i2.h hVar) {
        this.f19080b = e3.k.e(obj);
        this.f19085g = (i2.f) e3.k.f(fVar, "Signature must not be null");
        this.f19081c = i10;
        this.f19082d = i11;
        this.f19086h = (Map) e3.k.e(map);
        this.f19083e = (Class) e3.k.f(cls, "Resource class must not be null");
        this.f19084f = (Class) e3.k.f(cls2, "Transcode class must not be null");
        this.f19087i = (i2.h) e3.k.e(hVar);
    }

    @Override // i2.f
    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // i2.f
    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f19080b.equals(nVar.f19080b) && this.f19085g.equals(nVar.f19085g) && this.f19082d == nVar.f19082d && this.f19081c == nVar.f19081c && this.f19086h.equals(nVar.f19086h) && this.f19083e.equals(nVar.f19083e) && this.f19084f.equals(nVar.f19084f) && this.f19087i.equals(nVar.f19087i)) {
                return true;
            }
        }
        return false;
    }

    @Override // i2.f
    public int hashCode() {
        if (this.f19088j == 0) {
            int iHashCode = this.f19080b.hashCode();
            this.f19088j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f19085g.hashCode()) * 31) + this.f19081c) * 31) + this.f19082d;
            this.f19088j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f19086h.hashCode();
            this.f19088j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f19083e.hashCode();
            this.f19088j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f19084f.hashCode();
            this.f19088j = iHashCode5;
            this.f19088j = (iHashCode5 * 31) + this.f19087i.hashCode();
        }
        return this.f19088j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f19080b + ", width=" + this.f19081c + ", height=" + this.f19082d + ", resourceClass=" + this.f19083e + ", transcodeClass=" + this.f19084f + ", signature=" + this.f19085g + ", hashCode=" + this.f19088j + ", transformations=" + this.f19086h + ", options=" + this.f19087i + '}';
    }
}
