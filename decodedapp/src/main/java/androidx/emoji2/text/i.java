package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f2098b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint.FontMetricsInt f2097a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private short f2099c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private short f2100d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f2101e = 1.0f;

    i(o oVar) {
        l0.g.h(oVar, "rasterizer cannot be null");
        this.f2098b = oVar;
    }

    public final o a() {
        return this.f2098b;
    }

    final int b() {
        return this.f2099c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f2097a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f2097a;
        this.f2101e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f2098b.e();
        this.f2100d = (short) (this.f2098b.e() * this.f2101e);
        short sI = (short) (this.f2098b.i() * this.f2101e);
        this.f2099c = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f2097a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
