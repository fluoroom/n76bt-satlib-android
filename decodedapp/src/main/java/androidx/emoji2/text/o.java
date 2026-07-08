package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f2127d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f2129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f2130c = 0;

    o(m mVar, int i10) {
        this.f2129b = mVar;
        this.f2128a = i10;
    }

    private u0.a g() {
        ThreadLocal threadLocal = f2127d;
        u0.a aVar = (u0.a) threadLocal.get();
        if (aVar == null) {
            aVar = new u0.a();
            threadLocal.set(aVar);
        }
        this.f2129b.d().j(aVar, this.f2128a);
        return aVar;
    }

    public void a(Canvas canvas, float f10, float f11, Paint paint) {
        Typeface typefaceG = this.f2129b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceG);
        canvas.drawText(this.f2129b.c(), this.f2128a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i10) {
        return g().h(i10);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f2130c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        return (this.f2130c & 4) > 0;
    }

    public void l(boolean z10) {
        int iD = d();
        if (z10) {
            this.f2130c = iD | 4;
        } else {
            this.f2130c = iD;
        }
    }

    public void m(boolean z10) {
        int i10 = this.f2130c & 4;
        this.f2130c = z10 ? i10 | 2 : i10 | 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(f()));
        sb2.append(", codepoints:");
        int iC = c();
        for (int i10 = 0; i10 < iC; i10++) {
            sb2.append(Integer.toHexString(b(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
