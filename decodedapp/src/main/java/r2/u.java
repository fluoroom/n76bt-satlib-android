package r2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class u implements i2.l {

    /* JADX INFO: renamed from: b */
    private final i2.l f25407b;

    /* JADX INFO: renamed from: c */
    private final boolean f25408c;

    public u(i2.l lVar, boolean z10) {
        this.f25407b = lVar;
        this.f25408c = z10;
    }

    private k2.v d(Context context, k2.v vVar) {
        return d0.f(context.getResources(), vVar);
    }

    @Override // i2.f
    public void a(MessageDigest messageDigest) {
        this.f25407b.a(messageDigest);
    }

    @Override // i2.l
    public k2.v b(Context context, k2.v vVar, int i10, int i11) {
        l2.d dVarF = com.bumptech.glide.c.c(context).f();
        Drawable drawable = (Drawable) vVar.get();
        k2.v vVarA = t.a(dVarF, drawable, i10, i11);
        if (vVarA != null) {
            k2.v vVarB = this.f25407b.b(context, vVarA, i10, i11);
            if (!vVarB.equals(vVarA)) {
                return d(context, vVarB);
            }
            vVarB.c();
            return vVar;
        }
        if (!this.f25408c) {
            return vVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // i2.f
    public boolean equals(Object obj) {
        if (obj instanceof u) {
            return this.f25407b.equals(((u) obj).f25407b);
        }
        return false;
    }

    @Override // i2.f
    public int hashCode() {
        return this.f25407b.hashCode();
    }

    public i2.l c() {
        return this;
    }
}
