package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RemoteViews;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import java.util.ArrayList;
import m0.o0;

/* JADX INFO: loaded from: classes.dex */
@RemoteViews.RemoteView
public class FrameLayout extends android.widget.FrameLayout {
    private static final int DEFAULT_CHILD_GRAVITY = 8388659;

    @ViewDebug.ExportedProperty(category = "padding")
    private int mForegroundPaddingBottom;

    @ViewDebug.ExportedProperty(category = "padding")
    private int mForegroundPaddingLeft;

    @ViewDebug.ExportedProperty(category = "padding")
    private int mForegroundPaddingRight;

    @ViewDebug.ExportedProperty(category = "padding")
    private int mForegroundPaddingTop;
    private final ArrayList<View> mMatchParentChildren;

    @ViewDebug.ExportedProperty(category = "measurement")
    boolean mMeasureAllChildren;

    public FrameLayout(Context context) {
        super(context);
        this.mMeasureAllChildren = false;
        this.mForegroundPaddingLeft = 0;
        this.mForegroundPaddingTop = 0;
        this.mForegroundPaddingRight = 0;
        this.mForegroundPaddingBottom = 0;
        this.mMatchParentChildren = new ArrayList<>(1);
    }

    private int getPaddingBottomWithForeground() {
        return isForegroundInsidePadding() ? Math.max(getPaddingBottom(), this.mForegroundPaddingBottom) : getPaddingBottom() + this.mForegroundPaddingBottom;
    }

    private int getPaddingTopWithForeground() {
        return isForegroundInsidePadding() ? Math.max(getPaddingTop(), this.mForegroundPaddingTop) : getPaddingTop() + this.mForegroundPaddingTop;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return FrameLayout.class.getName();
    }

    @Override // android.widget.FrameLayout
    public boolean getMeasureAllChildren() {
        return this.mMeasureAllChildren;
    }

    int getPaddingLeftWithForeground() {
        return isForegroundInsidePadding() ? Math.max(getPaddingLeft(), this.mForegroundPaddingLeft) : getPaddingLeft() + this.mForegroundPaddingLeft;
    }

    int getPaddingRightWithForeground() {
        return isForegroundInsidePadding() ? Math.max(getPaddingRight(), this.mForegroundPaddingRight) : getPaddingRight() + this.mForegroundPaddingRight;
    }

    public boolean isForegroundInsidePadding() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void layoutChildren(int r10, int r11, int r12, int r13, boolean r14) {
        /*
            r9 = this;
            int r0 = r9.getChildCount()
            int r1 = r9.getPaddingLeftWithForeground()
            int r12 = r12 - r10
            int r10 = r9.getPaddingRightWithForeground()
            int r12 = r12 - r10
            int r10 = r9.getPaddingTopWithForeground()
            int r13 = r13 - r11
            int r11 = r9.getPaddingBottomWithForeground()
            int r13 = r13 - r11
            r11 = 0
        L19:
            if (r11 >= r0) goto L96
            android.view.View r2 = r9.getChildAt(r11)
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 == r4) goto L93
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r4 = r2.getMeasuredWidth()
            int r5 = r2.getMeasuredHeight()
            int r6 = r3.gravity
            r7 = -1
            if (r6 != r7) goto L3d
            r6 = 8388659(0x800033, float:1.1755015E-38)
        L3d:
            int r7 = m0.o0.C(r9)
            int r7 = m0.l.b(r6, r7)
            r6 = r6 & 112(0x70, float:1.57E-43)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L5c
            r8 = 5
            if (r7 == r8) goto L50
            goto L58
        L50:
            if (r14 != 0) goto L58
            int r7 = r12 - r4
            int r8 = r3.rightMargin
        L56:
            int r7 = r7 - r8
            goto L68
        L58:
            int r7 = r3.leftMargin
            int r7 = r7 + r1
            goto L68
        L5c:
            int r7 = r12 - r1
            int r7 = r7 - r4
            int r7 = r7 / 2
            int r7 = r7 + r1
            int r8 = r3.leftMargin
            int r7 = r7 + r8
            int r8 = r3.rightMargin
            goto L56
        L68:
            r8 = 16
            if (r6 == r8) goto L82
            r8 = 48
            if (r6 == r8) goto L7f
            r8 = 80
            if (r6 == r8) goto L78
            int r3 = r3.topMargin
        L76:
            int r3 = r3 + r10
            goto L8e
        L78:
            int r6 = r13 - r5
            int r3 = r3.bottomMargin
        L7c:
            int r3 = r6 - r3
            goto L8e
        L7f:
            int r3 = r3.topMargin
            goto L76
        L82:
            int r6 = r13 - r10
            int r6 = r6 - r5
            int r6 = r6 / 2
            int r6 = r6 + r10
            int r8 = r3.topMargin
            int r6 = r6 + r8
            int r3 = r3.bottomMargin
            goto L7c
        L8e:
            int r4 = r4 + r7
            int r5 = r5 + r3
            r2.layout(r7, r3, r4, r5)
        L93:
            int r11 = r11 + 1
            goto L19
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.FrameLayout.layoutChildren(int, int, int, int, boolean):void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        layoutChildren(i10, i11, i12, i13, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = (View.MeasureSpec.getMode(i10) == 1073741824 && View.MeasureSpec.getMode(i11) == 1073741824) ? false : true;
        this.mMatchParentChildren.clear();
        int iMax = 0;
        int iMax2 = 0;
        int iF = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (this.mMeasureAllChildren || childAt.getVisibility() != 8) {
                measureChildWithMargins(childAt, i10, 0, i11, 0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                iMax = Math.max(iMax, childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
                iMax2 = Math.max(iMax2, childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
                iF = o0.f(iF, o0.D(childAt));
                if (z10 && (layoutParams.width == -1 || layoutParams.height == -1)) {
                    this.mMatchParentChildren.add(childAt);
                }
            }
        }
        int paddingLeftWithForeground = iMax + getPaddingLeftWithForeground() + getPaddingRightWithForeground();
        int iMax3 = Math.max(iMax2 + getPaddingTopWithForeground() + getPaddingBottomWithForeground(), getSuggestedMinimumHeight());
        int iMax4 = Math.max(paddingLeftWithForeground, getSuggestedMinimumWidth());
        Drawable foreground = getForeground();
        if (foreground != null) {
            iMax3 = Math.max(iMax3, foreground.getMinimumHeight());
            iMax4 = Math.max(iMax4, foreground.getMinimumWidth());
        }
        setMeasuredDimension(o0.k0(iMax4, i10, iF), o0.k0(iMax3, i11, iF << 16));
        int size = this.mMatchParentChildren.size();
        if (size > 1) {
            for (int i13 = 0; i13 < size; i13++) {
                View view = this.mMatchParentChildren.get(i13);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                view.measure(marginLayoutParams.width == -1 ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (((getMeasuredWidth() - getPaddingLeftWithForeground()) - getPaddingRightWithForeground()) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin), WXVideoFileObject.FILE_SIZE_LIMIT) : ViewGroup.getChildMeasureSpec(i10, getPaddingLeftWithForeground() + getPaddingRightWithForeground() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width), marginLayoutParams.height == -1 ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (((getMeasuredHeight() - getPaddingTopWithForeground()) - getPaddingBottomWithForeground()) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin), WXVideoFileObject.FILE_SIZE_LIMIT) : ViewGroup.getChildMeasureSpec(i11, getPaddingTopWithForeground() + getPaddingBottomWithForeground() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void setForegroundGravity(int i10) {
        if (getForegroundGravity() != i10) {
            super.setForegroundGravity(i10);
            Drawable foreground = getForeground();
            if (getForegroundGravity() != 119 || foreground == null) {
                this.mForegroundPaddingLeft = 0;
                this.mForegroundPaddingTop = 0;
                this.mForegroundPaddingRight = 0;
                this.mForegroundPaddingBottom = 0;
            } else {
                Rect rect = new Rect();
                if (foreground.getPadding(rect)) {
                    this.mForegroundPaddingLeft = rect.left;
                    this.mForegroundPaddingTop = rect.top;
                    this.mForegroundPaddingRight = rect.right;
                    this.mForegroundPaddingBottom = rect.bottom;
                }
            }
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout
    public void setMeasureAllChildren(boolean z10) {
        this.mMeasureAllChildren = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public FrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mMeasureAllChildren = false;
        this.mForegroundPaddingLeft = 0;
        this.mForegroundPaddingTop = 0;
        this.mForegroundPaddingRight = 0;
        this.mForegroundPaddingBottom = 0;
        this.mMatchParentChildren = new ArrayList<>(1);
    }

    public FrameLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.mMeasureAllChildren = false;
        this.mForegroundPaddingLeft = 0;
        this.mForegroundPaddingTop = 0;
        this.mForegroundPaddingRight = 0;
        this.mForegroundPaddingBottom = 0;
        this.mMatchParentChildren = new ArrayList<>(1);
    }
}
