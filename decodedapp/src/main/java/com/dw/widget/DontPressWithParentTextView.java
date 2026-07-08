package com.dw.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class DontPressWithParentTextView extends com.dw.android.widget.d {
    public DontPressWithParentTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (z10 && getParent() != null && ((View) getParent()).isPressed()) {
            return;
        }
        super.setPressed(z10);
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z10) {
        if (z10 && getParent() != null && ((View) getParent()).isSelected()) {
            return;
        }
        super.setSelected(z10);
    }
}
