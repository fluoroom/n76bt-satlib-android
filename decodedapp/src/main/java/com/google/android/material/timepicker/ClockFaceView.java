package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import java.util.Arrays;
import m0.o0;
import n0.x;
import u8.h;
import u8.k;
import u8.l;

/* JADX INFO: loaded from: classes3.dex */
class ClockFaceView extends d implements ClockHandView.b {
    private final ClockHandView L;
    private final Rect M;
    private final RectF N;
    private final Rect O;
    private final SparseArray P;
    private final m0.a Q;
    private final int[] R;
    private final float[] S;
    private final int T;
    private final int U;
    private final int V;
    private final int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private String[] f8508a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private float f8509b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final ColorStateList f8510c0;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.B(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.L.i()) - ClockFaceView.this.T);
            return true;
        }
    }

    class b extends m0.a {
        b() {
        }

        @Override // m0.a
        public void g(View view, x xVar) {
            super.g(view, xVar);
            int iIntValue = ((Integer) view.getTag(u8.f.f28658p)).intValue();
            if (iIntValue > 0) {
                xVar.V0((View) ClockFaceView.this.P.get(iIntValue - 1));
            }
            xVar.w0(x.g.a(0, 1, iIntValue, 1, false, view.isSelected()));
            xVar.u0(true);
            xVar.b(x.a.f22372i);
        }

        @Override // m0.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.j(view, i10, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.M);
            float fCenterX = ClockFaceView.this.M.centerX();
            float fCenterY = ClockFaceView.this.M.centerY();
            ClockFaceView.this.L.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.L.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u8.b.f28563s);
    }

    private void J() {
        RectF rectFE = this.L.e();
        TextView textViewL = L(rectFE);
        for (int i10 = 0; i10 < this.P.size(); i10++) {
            TextView textView = (TextView) this.P.get(i10);
            if (textView != null) {
                textView.setSelected(textView == textViewL);
                textView.getPaint().setShader(K(rectFE, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient K(RectF rectF, TextView textView) {
        textView.getHitRect(this.M);
        this.N.set(this.M);
        textView.getLineBounds(0, this.O);
        RectF rectF2 = this.N;
        Rect rect = this.O;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.N)) {
            return new RadialGradient(rectF.centerX() - this.N.left, rectF.centerY() - this.N.top, rectF.width() * 0.5f, this.R, this.S, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private TextView L(RectF rectF) {
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i10 = 0; i10 < this.P.size(); i10++) {
            TextView textView2 = (TextView) this.P.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(this.M);
                this.N.set(this.M);
                this.N.union(rectF);
                float fWidth = this.N.width() * this.N.height();
                if (fWidth < f10) {
                    textView = textView2;
                    f10 = fWidth;
                }
            }
        }
        return textView;
    }

    private static float M(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    private void O(int i10) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.P.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.f8508a0.length, size); i11++) {
            TextView textView = (TextView) this.P.get(i11);
            if (i11 >= this.f8508a0.length) {
                removeView(textView);
                this.P.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(h.f28682k, (ViewGroup) this, false);
                    this.P.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.f8508a0[i11]);
                textView.setTag(u8.f.f28658p, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(u8.f.f28653k, Integer.valueOf(i12));
                if (i12 > 1) {
                    z10 = true;
                }
                o0.n0(textView, this.Q);
                textView.setTextColor(this.f8510c0);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.f8508a0[i11]));
                }
            }
        }
        this.L.q(z10);
    }

    @Override // com.google.android.material.timepicker.d
    public void B(int i10) {
        if (i10 != A()) {
            super.B(i10);
            this.L.m(A());
        }
    }

    @Override // com.google.android.material.timepicker.d
    protected void D() {
        super.D();
        for (int i10 = 0; i10 < this.P.size(); i10++) {
            ((TextView) this.P.get(i10)).setVisibility(0);
        }
    }

    public void N(String[] strArr, int i10) {
        this.f8508a0 = strArr;
        O(i10);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f10, boolean z10) {
        if (Math.abs(this.f8509b0 - f10) > 0.001f) {
            this.f8509b0 = f10;
            J();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        x.Y0(accessibilityNodeInfo).v0(x.f.a(1, this.f8508a0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        J();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iM = (int) (this.W / M(this.U / displayMetrics.heightPixels, this.V / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iM, WXVideoFileObject.FILE_SIZE_LIMIT);
        setMeasuredDimension(iM, iM);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.M = new Rect();
        this.N = new RectF();
        this.O = new Rect();
        this.P = new SparseArray();
        this.S = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f28898q1, i10, k.f28749y);
        Resources resources = getResources();
        ColorStateList colorStateListA = j9.c.a(context, typedArrayObtainStyledAttributes, l.f28916s1);
        this.f8510c0 = colorStateListA;
        LayoutInflater.from(context).inflate(h.f28683l, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(u8.f.f28652j);
        this.L = clockHandView;
        this.T = resources.getDimensionPixelSize(u8.d.I);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.R = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = i.a.a(context, u8.c.f28576f).getDefaultColor();
        ColorStateList colorStateListA2 = j9.c.a(context, typedArrayObtainStyledAttributes, l.f28907r1);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.Q = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        N(strArr, 0);
        this.U = resources.getDimensionPixelSize(u8.d.W);
        this.V = resources.getDimensionPixelSize(u8.d.X);
        this.W = resources.getDimensionPixelSize(u8.d.K);
    }
}
