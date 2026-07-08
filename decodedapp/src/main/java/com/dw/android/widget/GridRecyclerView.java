package com.dw.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dw.ht.l0;

/* JADX INFO: loaded from: classes.dex */
public class GridRecyclerView extends RecyclerView {
    private GridLayoutManager X0;
    private int Y0;

    public GridRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y0 = -1;
        O1(context, attributeSet, 0);
    }

    private void O1(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l0.I0, i10, 0);
        try {
            setColumnWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1));
            typedArrayObtainStyledAttributes.recycle();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 1, 1, false);
            this.X0 = gridLayoutManager;
            setLayoutManager(gridLayoutManager);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.Y0 > 0) {
            this.X0.u3(Math.max(1, getMeasuredWidth() / this.Y0));
        }
    }

    public void setColumnWidth(int i10) {
        this.Y0 = i10;
    }
}
