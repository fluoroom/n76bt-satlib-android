package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f3193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f3194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f3195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f3196e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f3199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f3200i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f3192a = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f3197f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f3198g = 0;

    f() {
    }

    boolean a(RecyclerView.b0 b0Var) {
        int i10 = this.f3194c;
        return i10 >= 0 && i10 < b0Var.b();
    }

    View b(RecyclerView.w wVar) {
        View viewO = wVar.o(this.f3194c);
        this.f3194c += this.f3195d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f3193b + ", mCurrentPosition=" + this.f3194c + ", mItemDirection=" + this.f3195d + ", mLayoutDirection=" + this.f3196e + ", mStartLine=" + this.f3197f + ", mEndLine=" + this.f3198g + '}';
    }
}
