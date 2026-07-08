package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    OverScroller f1983a;

    i(Context context, Interpolator interpolator) {
        this.f1983a = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    public static i b(Context context) {
        return c(context, null);
    }

    public static i c(Context context, Interpolator interpolator) {
        return new i(context, interpolator);
    }

    public boolean a() {
        return this.f1983a.computeScrollOffset();
    }

    public void d(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f1983a.fling(i10, i11, i12, i13, i14, i15, i16, i17);
    }

    public void e(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f1983a.fling(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19);
    }

    public int f() {
        return this.f1983a.getCurrX();
    }

    public int g() {
        return this.f1983a.getCurrY();
    }

    public boolean h() {
        return this.f1983a.isFinished();
    }
}
