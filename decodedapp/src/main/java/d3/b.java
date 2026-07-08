package d3;

import e3.k;
import i2.f;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f10560b;

    public b(Object obj) {
        this.f10560b = k.e(obj);
    }

    @Override // i2.f
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.f10560b.toString().getBytes(f.f15750a));
    }

    @Override // i2.f
    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f10560b.equals(((b) obj).f10560b);
        }
        return false;
    }

    @Override // i2.f
    public int hashCode() {
        return this.f10560b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f10560b + '}';
    }
}
