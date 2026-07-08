package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.appcompat.widget.ActivityChooserView;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f8003o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static boolean f8004p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static Constructor f8005q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static Object f8006r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f8007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextPaint f8008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8009c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8011e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f8018l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private i f8020n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8010d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Layout.Alignment f8012f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8013g = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f8014h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f8015i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8016j = f8003o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f8017k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextUtils.TruncateAt f8019m = null;

    public static class a extends Exception {
        a(Throwable th2) {
            super("Error thrown initializing StaticLayout " + th2.getMessage(), th2);
        }
    }

    static {
        f8003o = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    private h(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f8007a = charSequence;
        this.f8008b = textPaint;
        this.f8009c = i10;
        this.f8011e = charSequence.length();
    }

    private void b() throws a {
        if (f8004p) {
            return;
        }
        try {
            f8006r = this.f8018l && Build.VERSION.SDK_INT >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            f8005q = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f8004p = true;
        } catch (Exception e10) {
            throw new a(e10);
        }
    }

    public static h c(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new h(charSequence, textPaint, i10);
    }

    public StaticLayout a() throws a {
        if (this.f8007a == null) {
            this.f8007a = "";
        }
        int iMax = Math.max(0, this.f8009c);
        CharSequence charSequenceEllipsize = this.f8007a;
        if (this.f8013g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f8008b, iMax, this.f8019m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f8011e);
        this.f8011e = iMin;
        if (Build.VERSION.SDK_INT < 23) {
            b();
            try {
                return (StaticLayout) ((Constructor) l0.g.g(f8005q)).newInstance(charSequenceEllipsize, Integer.valueOf(this.f8010d), Integer.valueOf(this.f8011e), this.f8008b, Integer.valueOf(iMax), this.f8012f, l0.g.g(f8006r), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f8017k), null, Integer.valueOf(iMax), Integer.valueOf(this.f8013g));
            } catch (Exception e10) {
                throw new a(e10);
            }
        }
        if (this.f8018l && this.f8013g == 1) {
            this.f8012f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f8010d, iMin, this.f8008b, iMax);
        builderObtain.setAlignment(this.f8012f);
        builderObtain.setIncludePad(this.f8017k);
        builderObtain.setTextDirection(this.f8018l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f8019m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f8013g);
        float f10 = this.f8014h;
        if (f10 != 0.0f || this.f8015i != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f8015i);
        }
        if (this.f8013g > 1) {
            builderObtain.setHyphenationFrequency(this.f8016j);
        }
        i iVar = this.f8020n;
        if (iVar != null) {
            iVar.a(builderObtain);
        }
        return builderObtain.build();
    }

    public h d(Layout.Alignment alignment) {
        this.f8012f = alignment;
        return this;
    }

    public h e(TextUtils.TruncateAt truncateAt) {
        this.f8019m = truncateAt;
        return this;
    }

    public h f(int i10) {
        this.f8016j = i10;
        return this;
    }

    public h g(boolean z10) {
        this.f8017k = z10;
        return this;
    }

    public h h(boolean z10) {
        this.f8018l = z10;
        return this;
    }

    public h i(float f10, float f11) {
        this.f8014h = f10;
        this.f8015i = f11;
        return this;
    }

    public h j(int i10) {
        this.f8013g = i10;
        return this;
    }

    public h k(i iVar) {
        this.f8020n = iVar;
        return this;
    }
}
