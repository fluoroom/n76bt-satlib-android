package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.internal.m;
import com.google.android.material.internal.p;
import com.google.android.material.navigation.h;
import com.google.android.material.navigation.l;
import m0.i1;
import u8.k;

/* JADX INFO: loaded from: classes3.dex */
public class BottomNavigationView extends l {

    class a implements p.c {
        a() {
        }

        @Override // com.google.android.material.internal.p.c
        public i1 a(View view, i1 i1Var, p.d dVar) {
            dVar.f8041d += i1Var.i();
            boolean z10 = view.getLayoutDirection() == 1;
            int iJ = i1Var.j();
            int iK = i1Var.k();
            dVar.f8038a += z10 ? iK : iJ;
            int i10 = dVar.f8040c;
            if (!z10) {
                iJ = iK;
            }
            dVar.f8040c = i10 + iJ;
            dVar.a(view);
            return i1Var;
        }
    }

    public interface b extends l.b {
    }

    public interface c extends l.c {
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u8.b.f28546c);
    }

    private void h() {
        p.b(this, new a());
    }

    private int i(int i10) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i10) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i10;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), RtlSpacingHelper.UNDEFINED);
    }

    @Override // com.google.android.material.navigation.l
    protected h c(Context context) {
        return new com.google.android.material.bottomnavigation.b(context);
    }

    @Override // com.google.android.material.navigation.l
    public int getMaxItemCount() {
        return 6;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i(i11));
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom()));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        com.google.android.material.bottomnavigation.b bVar = (com.google.android.material.bottomnavigation.b) getMenuView();
        if (bVar.q() != z10) {
            bVar.setItemHorizontalTranslationEnabled(z10);
            getPresenter().updateMenuView(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(b bVar) {
        setOnItemReselectedListener(bVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(c cVar) {
        setOnItemSelectedListener(cVar);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, k.f28730f);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TintTypedArray tintTypedArrayJ = m.j(getContext(), attributeSet, u8.l.U, i10, i11, new int[0]);
        setItemHorizontalTranslationEnabled(tintTypedArrayJ.getBoolean(u8.l.W, true));
        int i12 = u8.l.V;
        if (tintTypedArrayJ.hasValue(i12)) {
            setMinimumHeight(tintTypedArrayJ.getDimensionPixelSize(i12, 0));
        }
        tintTypedArrayJ.recycle();
        h();
    }
}
