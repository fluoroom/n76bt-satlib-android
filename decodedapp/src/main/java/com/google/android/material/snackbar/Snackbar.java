package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import u8.h;

/* JADX INFO: loaded from: classes3.dex */
public class Snackbar extends BaseTransientBottomBar {
    private static final int[] H;
    private static final int[] I;
    private final AccessibilityManager F;
    private boolean G;

    public static final class SnackbarLayout extends BaseTransientBottomBar.s {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, WXVideoFileObject.FILE_SIZE_LIMIT), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), WXVideoFileObject.FILE_SIZE_LIMIT));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        int i10 = u8.b.O;
        H = new int[]{i10};
        I = new int[]{i10, u8.b.Q};
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, a aVar) {
        super(context, viewGroup, view, aVar);
        this.F = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static /* synthetic */ void e0(Snackbar snackbar, View.OnClickListener onClickListener, View view) {
        snackbar.getClass();
        onClickListener.onClick(view);
        snackbar.y(1);
    }

    private static ViewGroup f0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private Button g0() {
        return h0().getActionView();
    }

    private SnackbarContentLayout h0() {
        return (SnackbarContentLayout) this.f8184i.getChildAt(0);
    }

    private TextView i0() {
        return h0().getMessageView();
    }

    private static boolean j0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(I);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    public static Snackbar k0(View view, int i10, int i11) {
        return l0(view, view.getResources().getText(i10), i11);
    }

    public static Snackbar l0(View view, CharSequence charSequence, int i10) {
        return m0(null, view, charSequence, i10);
    }

    private static Snackbar m0(Context context, View view, CharSequence charSequence, int i10) {
        ViewGroup viewGroupF0 = f0(view);
        if (viewGroupF0 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = viewGroupF0.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(j0(context) ? h.f28696y : h.f28674c, viewGroupF0, false);
        Snackbar snackbar = new Snackbar(context, viewGroupF0, snackbarContentLayout, snackbarContentLayout);
        snackbar.p0(charSequence);
        snackbar.S(i10);
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int C() {
        int iC = super.C();
        if (iC == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.F.getRecommendedTimeoutMillis(iC, (this.G ? 4 : 0) | 3);
        }
        if (this.G && this.F.isTouchExplorationEnabled()) {
            return -2;
        }
        return iC;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void W() {
        super.W();
    }

    public Snackbar n0(int i10, View.OnClickListener onClickListener) {
        return o0(B().getText(i10), onClickListener);
    }

    public Snackbar o0(CharSequence charSequence, final View.OnClickListener onClickListener) {
        Button buttonG0 = g0();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            buttonG0.setVisibility(8);
            buttonG0.setOnClickListener(null);
            this.G = false;
            return this;
        }
        this.G = true;
        buttonG0.setVisibility(0);
        buttonG0.setText(charSequence);
        buttonG0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.snackbar.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Snackbar.e0(this.f8236a, onClickListener, view);
            }
        });
        return this;
    }

    public Snackbar p0(CharSequence charSequence) {
        i0().setText(charSequence);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void x() {
        super.x();
    }
}
