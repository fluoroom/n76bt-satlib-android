package com.google.android.material.search;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes3.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8139h;

    public SearchBar$ScrollingViewBehavior() {
        this.f8139h = false;
    }

    private void U(AppBarLayout appBarLayout) {
        appBarLayout.setBackgroundColor(0);
        if (Build.VERSION.SDK_INT == 21) {
            appBarLayout.setOutlineProvider(null);
        } else {
            appBarLayout.setTargetElevation(0.0f);
        }
    }

    @Override // com.google.android.material.appbar.d
    protected boolean P() {
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean zH = super.h(coordinatorLayout, view, view2);
        if (!this.f8139h && (view2 instanceof AppBarLayout)) {
            this.f8139h = true;
            U((AppBarLayout) view2);
        }
        return zH;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8139h = false;
    }
}
