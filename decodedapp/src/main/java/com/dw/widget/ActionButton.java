package com.dw.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;
import c6.q;

/* JADX INFO: loaded from: classes.dex */
public class ActionButton extends AppCompatImageButton {
    public ActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k3.b.f19157e);
    }

    private void a() {
        setFocusable(true);
        setLongClickable(true);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ImageButton.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ImageButton.class.getName());
    }

    @Override // android.widget.ImageButton, android.view.View
    protected boolean onSetAlpha(int i10) {
        return false;
    }

    @Override // android.view.View
    public boolean performLongClick() {
        if (super.performLongClick()) {
            return true;
        }
        return q.g(this);
    }

    public ActionButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a();
    }
}
