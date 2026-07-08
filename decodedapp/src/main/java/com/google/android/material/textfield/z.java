package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes3.dex */
class z extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextInputLayout f8492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f8493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CharSequence f8494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CheckableImageButton f8495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ColorStateList f8496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PorterDuff.Mode f8497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView.ScaleType f8499h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private View.OnLongClickListener f8500r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f8501s;

    z(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.f8492a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(u8.h.f28679h, (ViewGroup) this, false);
        this.f8495d = checkableImageButton;
        t.e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f8493b = appCompatTextView;
        j(tintTypedArray);
        i(tintTypedArray);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void C() {
        int i10 = (this.f8494c == null || this.f8501s) ? 8 : 0;
        setVisibility((this.f8495d.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f8493b.setVisibility(i10);
        this.f8492a.p0();
    }

    private void i(TintTypedArray tintTypedArray) {
        this.f8493b.setVisibility(8);
        this.f8493b.setId(u8.f.Y);
        this.f8493b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f8493b.setAccessibilityLiveRegion(1);
        o(tintTypedArray.getResourceId(u8.l.K7, 0));
        int i10 = u8.l.L7;
        if (tintTypedArray.hasValue(i10)) {
            p(tintTypedArray.getColorStateList(i10));
        }
        n(tintTypedArray.getText(u8.l.J7));
    }

    private void j(TintTypedArray tintTypedArray) {
        if (j9.c.k(getContext())) {
            ((ViewGroup.MarginLayoutParams) this.f8495d.getLayoutParams()).setMarginEnd(0);
        }
        u(null);
        v(null);
        int i10 = u8.l.R7;
        if (tintTypedArray.hasValue(i10)) {
            this.f8496e = j9.c.b(getContext(), tintTypedArray, i10);
        }
        int i11 = u8.l.S7;
        if (tintTypedArray.hasValue(i11)) {
            this.f8497f = com.google.android.material.internal.p.h(tintTypedArray.getInt(i11, -1), null);
        }
        int i12 = u8.l.O7;
        if (tintTypedArray.hasValue(i12)) {
            s(tintTypedArray.getDrawable(i12));
            int i13 = u8.l.N7;
            if (tintTypedArray.hasValue(i13)) {
                r(tintTypedArray.getText(i13));
            }
            q(tintTypedArray.getBoolean(u8.l.M7, true));
        }
        t(tintTypedArray.getDimensionPixelSize(u8.l.P7, getResources().getDimensionPixelSize(u8.d.f28612p0)));
        int i14 = u8.l.Q7;
        if (tintTypedArray.hasValue(i14)) {
            w(t.b(tintTypedArray.getInt(i14, -1)));
        }
    }

    void A(n0.x xVar) {
        if (this.f8493b.getVisibility() != 0) {
            xVar.V0(this.f8495d);
        } else {
            xVar.G0(this.f8493b);
            xVar.V0(this.f8493b);
        }
    }

    void B() {
        EditText editText = this.f8492a.f8331e;
        if (editText == null) {
            return;
        }
        this.f8493b.setPaddingRelative(k() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(u8.d.V), editText.getCompoundPaddingBottom());
    }

    CharSequence a() {
        return this.f8494c;
    }

    ColorStateList b() {
        return this.f8493b.getTextColors();
    }

    int c() {
        return getPaddingStart() + this.f8493b.getPaddingStart() + (k() ? this.f8495d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f8495d.getLayoutParams()).getMarginEnd() : 0);
    }

    TextView d() {
        return this.f8493b;
    }

    CharSequence e() {
        return this.f8495d.getContentDescription();
    }

    Drawable f() {
        return this.f8495d.getDrawable();
    }

    int g() {
        return this.f8498g;
    }

    ImageView.ScaleType h() {
        return this.f8499h;
    }

    boolean k() {
        return this.f8495d.getVisibility() == 0;
    }

    void l(boolean z10) {
        this.f8501s = z10;
        C();
    }

    void m() {
        t.d(this.f8492a, this.f8495d, this.f8496e);
    }

    void n(CharSequence charSequence) {
        this.f8494c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f8493b.setText(charSequence);
        C();
    }

    void o(int i10) {
        androidx.core.widget.j.m(this.f8493b, i10);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        B();
    }

    void p(ColorStateList colorStateList) {
        this.f8493b.setTextColor(colorStateList);
    }

    void q(boolean z10) {
        this.f8495d.setCheckable(z10);
    }

    void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.f8495d.setContentDescription(charSequence);
        }
    }

    void s(Drawable drawable) {
        this.f8495d.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f8492a, this.f8495d, this.f8496e, this.f8497f);
            z(true);
            m();
        } else {
            z(false);
            u(null);
            v(null);
            r(null);
        }
    }

    void t(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != this.f8498g) {
            this.f8498g = i10;
            t.g(this.f8495d, i10);
        }
    }

    void u(View.OnClickListener onClickListener) {
        t.h(this.f8495d, onClickListener, this.f8500r);
    }

    void v(View.OnLongClickListener onLongClickListener) {
        this.f8500r = onLongClickListener;
        t.i(this.f8495d, onLongClickListener);
    }

    void w(ImageView.ScaleType scaleType) {
        this.f8499h = scaleType;
        t.j(this.f8495d, scaleType);
    }

    void x(ColorStateList colorStateList) {
        if (this.f8496e != colorStateList) {
            this.f8496e = colorStateList;
            t.a(this.f8492a, this.f8495d, colorStateList, this.f8497f);
        }
    }

    void y(PorterDuff.Mode mode) {
        if (this.f8497f != mode) {
            this.f8497f = mode;
            t.a(this.f8492a, this.f8495d, this.f8496e, mode);
        }
    }

    void z(boolean z10) {
        if (k() != z10) {
            this.f8495d.setVisibility(z10 ? 0 : 8);
            B();
            C();
        }
    }
}
