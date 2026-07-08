package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.TintTypedArray;
import u8.l;

/* JADX INFO: loaded from: classes3.dex */
public class TabItem extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f8253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f8254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8255c;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, l.S5);
        this.f8253a = tintTypedArrayObtainStyledAttributes.getText(l.V5);
        this.f8254b = tintTypedArrayObtainStyledAttributes.getDrawable(l.T5);
        this.f8255c = tintTypedArrayObtainStyledAttributes.getResourceId(l.U5, 0);
        tintTypedArrayObtainStyledAttributes.recycle();
    }
}
