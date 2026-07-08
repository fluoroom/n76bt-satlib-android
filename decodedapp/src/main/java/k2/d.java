package k2;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
final class d implements i2.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i2.f f18958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i2.f f18959c;

    d(i2.f fVar, i2.f fVar2) {
        this.f18958b = fVar;
        this.f18959c = fVar2;
    }

    @Override // i2.f
    public void a(MessageDigest messageDigest) {
        this.f18958b.a(messageDigest);
        this.f18959c.a(messageDigest);
    }

    @Override // i2.f
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f18958b.equals(dVar.f18958b) && this.f18959c.equals(dVar.f18959c)) {
                return true;
            }
        }
        return false;
    }

    @Override // i2.f
    public int hashCode() {
        return (this.f18958b.hashCode() * 31) + this.f18959c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f18958b + ", signature=" + this.f18959c + '}';
    }
}
