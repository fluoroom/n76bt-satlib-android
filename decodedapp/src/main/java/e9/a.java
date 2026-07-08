package e9;

import android.content.Context;
import android.graphics.Color;
import j9.b;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f11707f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f11708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f11711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f11712e;

    public a(Context context) {
        this(b.b(context, u8.b.f28556l, false), c9.a.b(context, u8.b.f28555k, 0), c9.a.b(context, u8.b.f28554j, 0), c9.a.b(context, u8.b.f28552h, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean e(int i10) {
        return d0.a.k(i10, 255) == this.f11711d;
    }

    public float a(float f10) {
        if (this.f11712e <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        int i11;
        float fA = a(f10);
        int iAlpha = Color.alpha(i10);
        int iK = c9.a.k(d0.a.k(i10, 255), this.f11709b, fA);
        if (fA > 0.0f && (i11 = this.f11710c) != 0) {
            iK = c9.a.j(iK, d0.a.k(i11, f11707f));
        }
        return d0.a.k(iK, iAlpha);
    }

    public int c(int i10, float f10) {
        return (this.f11708a && e(i10)) ? b(i10, f10) : i10;
    }

    public boolean d() {
        return this.f11708a;
    }

    public a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f11708a = z10;
        this.f11709b = i10;
        this.f11710c = i11;
        this.f11711d = i12;
        this.f11712e = f10;
    }
}
