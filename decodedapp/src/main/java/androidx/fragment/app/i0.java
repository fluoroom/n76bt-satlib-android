package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class i0 extends o {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private ViewGroup f2305o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f2306p0;

    private void S3() {
        View view;
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f2305o0;
        if (viewGroup2 == null || viewGroup2 == (view = this.T) || view == null || (viewGroup = (ViewGroup) view.getParent()) == this.f2305o0) {
            return;
        }
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            this.f2305o0.setLayoutParams(layoutParams);
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.weight = 1.0f;
        view.setLayoutParams(layoutParams2);
        this.f2305o0.addView(view);
        ViewGroup viewGroup3 = this.f2305o0;
        this.T = viewGroup3;
        if (viewGroup != null) {
            viewGroup.addView(viewGroup3);
        }
        this.f2306p0 = true;
    }

    @Override // androidx.fragment.app.o
    public void Q2(View view, Bundle bundle) {
        super.Q2(view, bundle);
        S3();
    }

    @Override // androidx.fragment.app.o
    public void y2() {
        super.y2();
        if (this.f2306p0) {
            this.f2306p0 = false;
            this.f2305o0.removeViewAt(r0.getChildCount() - 1);
        }
    }
}
