package v2;

import android.content.Context;
import android.graphics.Bitmap;
import e3.k;
import i2.l;
import java.security.MessageDigest;
import k2.v;

/* JADX INFO: loaded from: classes.dex */
public class f implements l {

    /* JADX INFO: renamed from: b */
    private final l f29506b;

    public f(l lVar) {
        this.f29506b = (l) k.e(lVar);
    }

    @Override // i2.f
    public void a(MessageDigest messageDigest) {
        this.f29506b.a(messageDigest);
    }

    @Override // i2.l
    public v b(Context context, v vVar, int i10, int i11) {
        c cVar = (c) vVar.get();
        v fVar = new r2.f(cVar.e(), com.bumptech.glide.c.c(context).f());
        v vVarB = this.f29506b.b(context, fVar, i10, i11);
        if (!fVar.equals(vVarB)) {
            fVar.c();
        }
        cVar.m(this.f29506b, (Bitmap) vVarB.get());
        return vVar;
    }

    @Override // i2.f
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f29506b.equals(((f) obj).f29506b);
        }
        return false;
    }

    @Override // i2.f
    public int hashCode() {
        return this.f29506b.hashCode();
    }
}
