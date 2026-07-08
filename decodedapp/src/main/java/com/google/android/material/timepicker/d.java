package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m9.h;
import m9.j;
import u8.l;

/* JADX INFO: loaded from: classes3.dex */
abstract class d extends ConstraintLayout {
    private final Runnable I;
    private int J;
    private h K;

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(u8.h.f28684m, this);
        setBackground(y());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f28767b5, i10, 0);
        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f28776c5, 0);
        this.I = new Runnable() { // from class: com.google.android.material.timepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f8537a.D();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    private static boolean C(View view) {
        return "skip".equals(view.getTag());
    }

    private void E() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.I);
            handler.post(this.I);
        }
    }

    private void x(List list, androidx.constraintlayout.widget.d dVar, int i10) {
        Iterator it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            dVar.g(((View) it.next()).getId(), u8.f.f28645c, i10, size);
            size += 360.0f / list.size();
        }
    }

    private Drawable y() {
        h hVar = new h();
        this.K = hVar;
        hVar.Z(new j(0.5f));
        this.K.c0(ColorStateList.valueOf(-1));
        return this.K;
    }

    public int A() {
        return this.J;
    }

    public void B(int i10) {
        this.J = i10;
        D();
    }

    protected void D() {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != u8.f.f28645c && !C(childAt)) {
                int i11 = (Integer) childAt.getTag(u8.f.f28653k);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            x((List) entry.getValue(), dVar, z(((Integer) entry.getKey()).intValue()));
        }
        dVar.c(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        E();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        D();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        E();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.K.c0(ColorStateList.valueOf(i10));
    }

    int z(int i10) {
        return i10 == 2 ? Math.round(this.J * 0.66f) : this.J;
    }
}
