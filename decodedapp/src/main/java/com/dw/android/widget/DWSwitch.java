package com.dw.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import kotlin.Metadata;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/dw/android/widget/DWSwitch;", "Landroidx/appcompat/widget/SwitchCompat;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "performClick", "()Z", "Landroid/view/MotionEvent;", "ev", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "checked", "Ldd/d0;", "setChecked", "(Z)V", "", "a", "I", "inUserAction", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "b", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "getOnUserChangeCheckedListener", "()Landroid/widget/CompoundButton$OnCheckedChangeListener;", "setOnUserChangeCheckedListener", "(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V", "onUserChangeCheckedListener", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DWSwitch extends SwitchCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int inUserAction;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private CompoundButton.OnCheckedChangeListener onUserChangeCheckedListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DWSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.e(context, "context");
        m.e(attributeSet, "attrs");
    }

    public final CompoundButton.OnCheckedChangeListener getOnUserChangeCheckedListener() {
        return this.onUserChangeCheckedListener;
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        this.inUserAction++;
        try {
            return super.onTouchEvent(ev);
        } finally {
            this.inUserAction--;
        }
    }

    @Override // android.widget.CompoundButton, android.view.View
    public boolean performClick() {
        this.inUserAction++;
        try {
            return super.performClick();
        } finally {
            this.inUserAction--;
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean checked) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        boolean zIsChecked = isChecked();
        super.setChecked(checked);
        if (this.inUserAction <= 0 || (onCheckedChangeListener = this.onUserChangeCheckedListener) == null || zIsChecked == isChecked()) {
            return;
        }
        onCheckedChangeListener.onCheckedChanged(this, isChecked());
    }

    public final void setOnUserChangeCheckedListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.onUserChangeCheckedListener = onCheckedChangeListener;
    }
}
