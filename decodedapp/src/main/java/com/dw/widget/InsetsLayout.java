package com.dw.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import k3.l;
import kotlin.Metadata;
import rd.h;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0015¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/dw/widget/InsetsLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "Ldd/d0;", "a", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/graphics/Rect;", "insets", "", "fitSystemWindows", "(Landroid/graphics/Rect;)Z", "Landroid/view/WindowInsets;", "onApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "I", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InsetsLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int insets;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InsetsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        m.e(context, "context");
    }

    public static /* synthetic */ void b(InsetsLayout insetsLayout, Context context, AttributeSet attributeSet, int i10, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        insetsLayout.a(context, attributeSet, i10, i11);
    }

    public final void a(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        m.e(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, l.W0, defStyleAttr, defStyleRes);
        m.d(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.insets = typedArrayObtainStyledAttributes.getInt(l.X0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect insets) {
        m.e(insets, "insets");
        int i10 = this.insets;
        setPadding((i10 & 3) == 3 ? insets.left : 0, (i10 & 48) == 48 ? insets.top : 0, (i10 & 5) == 5 ? insets.right : 0, (i10 & 80) == 80 ? insets.bottom : 0);
        return false;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        m.e(insets, "insets");
        setPadding((this.insets & 3) == 3 ? insets.getSystemWindowInsetLeft() : 0, (this.insets & 48) == 48 ? insets.getSystemWindowInsetTop() : 0, (this.insets & 5) == 5 ? insets.getSystemWindowInsetRight() : 0, (this.insets & 80) == 80 ? insets.getSystemWindowInsetBottom() : 0);
        return insets;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsetsLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m.e(context, "context");
        b(this, context, attributeSet, i10, 0, 8, null);
    }

    public /* synthetic */ InsetsLayout(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
