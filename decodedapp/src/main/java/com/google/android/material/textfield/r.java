package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
class r extends LinearLayout {
    private boolean A;
    private EditText B;
    private final AccessibilityManager C;
    private AccessibilityManager.TouchExplorationStateChangeListener D;
    private final TextWatcher E;
    private final TextInputLayout.g F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TextInputLayout f8416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FrameLayout f8417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CheckableImageButton f8418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorStateList f8419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PorterDuff.Mode f8420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View.OnLongClickListener f8421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CheckableImageButton f8422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f8423h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f8424r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final LinkedHashSet f8425s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorStateList f8426t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f8427u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f8428v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ImageView.ScaleType f8429w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private View.OnLongClickListener f8430x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CharSequence f8431y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final TextView f8432z;

    class a extends com.google.android.material.internal.l {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            r.this.m().a(editable);
        }

        @Override // com.google.android.material.internal.l, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            r.this.m().b(charSequence, i10, i11, i12);
        }
    }

    class b implements TextInputLayout.g {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout) {
            if (r.this.B == textInputLayout.getEditText()) {
                return;
            }
            if (r.this.B != null) {
                r.this.B.removeTextChangedListener(r.this.E);
                if (r.this.B.getOnFocusChangeListener() == r.this.m().e()) {
                    r.this.B.setOnFocusChangeListener(null);
                }
            }
            r.this.B = textInputLayout.getEditText();
            if (r.this.B != null) {
                r.this.B.addTextChangedListener(r.this.E);
            }
            r.this.m().n(r.this.B);
            r rVar = r.this;
            rVar.h0(rVar.m());
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            r.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            r.this.M();
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray f8436a = new SparseArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final r f8437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f8438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f8439d;

        d(r rVar, TintTypedArray tintTypedArray) {
            this.f8437b = rVar;
            this.f8438c = tintTypedArray.getResourceId(u8.l.f28787d7, 0);
            this.f8439d = tintTypedArray.getResourceId(u8.l.C7, 0);
        }

        private s b(int i10) {
            if (i10 == -1) {
                return new g(this.f8437b);
            }
            if (i10 == 0) {
                return new w(this.f8437b);
            }
            if (i10 == 1) {
                return new y(this.f8437b, this.f8439d);
            }
            if (i10 == 2) {
                return new f(this.f8437b);
            }
            if (i10 == 3) {
                return new p(this.f8437b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
        }

        s c(int i10) {
            s sVar = (s) this.f8436a.get(i10);
            if (sVar != null) {
                return sVar;
            }
            s sVarB = b(i10);
            this.f8436a.append(i10, sVarB);
            return sVarB;
        }
    }

    r(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.f8424r = 0;
        this.f8425s = new LinkedHashSet();
        this.E = new a();
        b bVar = new b();
        this.F = bVar;
        this.C = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f8416a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f8417b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonI = i(this, layoutInflaterFrom, u8.f.T);
        this.f8418c = checkableImageButtonI;
        CheckableImageButton checkableImageButtonI2 = i(frameLayout, layoutInflaterFrom, u8.f.S);
        this.f8422g = checkableImageButtonI2;
        this.f8423h = new d(this, tintTypedArray);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f8432z = appCompatTextView;
        C(tintTypedArray);
        B(tintTypedArray);
        D(tintTypedArray);
        frameLayout.addView(checkableImageButtonI2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonI);
        textInputLayout.j(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void B(TintTypedArray tintTypedArray) {
        int i10 = u8.l.D7;
        if (!tintTypedArray.hasValue(i10)) {
            int i11 = u8.l.f28823h7;
            if (tintTypedArray.hasValue(i11)) {
                this.f8426t = j9.c.b(getContext(), tintTypedArray, i11);
            }
            int i12 = u8.l.f28832i7;
            if (tintTypedArray.hasValue(i12)) {
                this.f8427u = com.google.android.material.internal.p.h(tintTypedArray.getInt(i12, -1), null);
            }
        }
        int i13 = u8.l.f28805f7;
        if (tintTypedArray.hasValue(i13)) {
            U(tintTypedArray.getInt(i13, 0));
            int i14 = u8.l.f28778c7;
            if (tintTypedArray.hasValue(i14)) {
                Q(tintTypedArray.getText(i14));
            }
            O(tintTypedArray.getBoolean(u8.l.f28769b7, true));
        } else if (tintTypedArray.hasValue(i10)) {
            int i15 = u8.l.E7;
            if (tintTypedArray.hasValue(i15)) {
                this.f8426t = j9.c.b(getContext(), tintTypedArray, i15);
            }
            int i16 = u8.l.F7;
            if (tintTypedArray.hasValue(i16)) {
                this.f8427u = com.google.android.material.internal.p.h(tintTypedArray.getInt(i16, -1), null);
            }
            U(tintTypedArray.getBoolean(i10, false) ? 1 : 0);
            Q(tintTypedArray.getText(u8.l.B7));
        }
        T(tintTypedArray.getDimensionPixelSize(u8.l.f28796e7, getResources().getDimensionPixelSize(u8.d.f28612p0)));
        int i17 = u8.l.f28814g7;
        if (tintTypedArray.hasValue(i17)) {
            X(t.b(tintTypedArray.getInt(i17, -1)));
        }
    }

    private void C(TintTypedArray tintTypedArray) {
        int i10 = u8.l.f28877n7;
        if (tintTypedArray.hasValue(i10)) {
            this.f8419d = j9.c.b(getContext(), tintTypedArray, i10);
        }
        int i11 = u8.l.f28886o7;
        if (tintTypedArray.hasValue(i11)) {
            this.f8420e = com.google.android.material.internal.p.h(tintTypedArray.getInt(i11, -1), null);
        }
        int i12 = u8.l.f28868m7;
        if (tintTypedArray.hasValue(i12)) {
            c0(tintTypedArray.getDrawable(i12));
        }
        this.f8418c.setContentDescription(getResources().getText(u8.j.f28704f));
        this.f8418c.setImportantForAccessibility(2);
        this.f8418c.setClickable(false);
        this.f8418c.setPressable(false);
        this.f8418c.setCheckable(false);
        this.f8418c.setFocusable(false);
    }

    private void D(TintTypedArray tintTypedArray) {
        this.f8432z.setVisibility(8);
        this.f8432z.setId(u8.f.Z);
        this.f8432z.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        this.f8432z.setAccessibilityLiveRegion(1);
        q0(tintTypedArray.getResourceId(u8.l.U7, 0));
        int i10 = u8.l.V7;
        if (tintTypedArray.hasValue(i10)) {
            r0(tintTypedArray.getColorStateList(i10));
        }
        p0(tintTypedArray.getText(u8.l.T7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.D;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.C) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.D == null || this.C == null || !isAttachedToWindow()) {
            return;
        }
        this.C.addTouchExplorationStateChangeListener(this.D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(s sVar) {
        if (this.B == null) {
            return;
        }
        if (sVar.e() != null) {
            this.B.setOnFocusChangeListener(sVar.e());
        }
        if (sVar.g() != null) {
            this.f8422g.setOnFocusChangeListener(sVar.g());
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(u8.h.f28678g, viewGroup, false);
        checkableImageButton.setId(i10);
        t.e(checkableImageButton);
        if (j9.c.k(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    private void j(int i10) {
        Iterator it = this.f8425s.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    private void s0(s sVar) {
        sVar.s();
        this.D = sVar.h();
        g();
    }

    private int t(s sVar) {
        int i10 = this.f8423h.f8438c;
        return i10 == 0 ? sVar.d() : i10;
    }

    private void t0(s sVar) {
        M();
        this.D = null;
        sVar.u();
    }

    private void u0(boolean z10) {
        if (!z10 || n() == null) {
            t.a(this.f8416a, this.f8422g, this.f8426t, this.f8427u);
            return;
        }
        Drawable drawableMutate = e0.a.r(n()).mutate();
        drawableMutate.setTint(this.f8416a.getErrorCurrentTextColors());
        this.f8422g.setImageDrawable(drawableMutate);
    }

    private void v0() {
        this.f8417b.setVisibility((this.f8422g.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || ((this.f8431y == null || this.A) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    private void w0() {
        this.f8418c.setVisibility(s() != null && this.f8416a.O() && this.f8416a.d0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.f8416a.p0();
    }

    private void y0() {
        int visibility = this.f8432z.getVisibility();
        int i10 = (this.f8431y == null || this.A) ? 8 : 0;
        if (visibility != i10) {
            m().q(i10 == 0);
        }
        v0();
        this.f8432z.setVisibility(i10);
        this.f8416a.p0();
    }

    boolean A() {
        return this.f8424r != 0;
    }

    boolean E() {
        return A() && this.f8422g.isChecked();
    }

    boolean F() {
        return this.f8417b.getVisibility() == 0 && this.f8422g.getVisibility() == 0;
    }

    boolean G() {
        return this.f8418c.getVisibility() == 0;
    }

    void H(boolean z10) {
        this.A = z10;
        y0();
    }

    void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f8416a.d0());
        }
    }

    void J() {
        t.d(this.f8416a, this.f8422g, this.f8426t);
    }

    void K() {
        t.d(this.f8416a, this.f8418c, this.f8419d);
    }

    void L(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean zIsChecked;
        s sVarM = m();
        boolean z12 = true;
        if (!sVarM.l() || (zIsChecked = this.f8422g.isChecked()) == sVarM.m()) {
            z11 = false;
        } else {
            this.f8422g.setChecked(!zIsChecked);
            z11 = true;
        }
        if (!sVarM.j() || (zIsActivated = this.f8422g.isActivated()) == sVarM.k()) {
            z12 = z11;
        } else {
            N(!zIsActivated);
        }
        if (z10 || z12) {
            J();
        }
    }

    void N(boolean z10) {
        this.f8422g.setActivated(z10);
    }

    void O(boolean z10) {
        this.f8422g.setCheckable(z10);
    }

    void P(int i10) {
        Q(i10 != 0 ? getResources().getText(i10) : null);
    }

    void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f8422g.setContentDescription(charSequence);
        }
    }

    void R(int i10) {
        S(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    void S(Drawable drawable) {
        this.f8422g.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f8416a, this.f8422g, this.f8426t, this.f8427u);
            J();
        }
    }

    void T(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != this.f8428v) {
            this.f8428v = i10;
            t.g(this.f8422g, i10);
            t.g(this.f8418c, i10);
        }
    }

    void U(int i10) {
        if (this.f8424r == i10) {
            return;
        }
        t0(m());
        int i11 = this.f8424r;
        this.f8424r = i10;
        j(i11);
        a0(i10 != 0);
        s sVarM = m();
        R(t(sVarM));
        P(sVarM.c());
        O(sVarM.l());
        if (!sVarM.i(this.f8416a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f8416a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        s0(sVarM);
        V(sVarM.f());
        EditText editText = this.B;
        if (editText != null) {
            sVarM.n(editText);
            h0(sVarM);
        }
        t.a(this.f8416a, this.f8422g, this.f8426t, this.f8427u);
        L(true);
    }

    void V(View.OnClickListener onClickListener) {
        t.h(this.f8422g, onClickListener, this.f8430x);
    }

    void W(View.OnLongClickListener onLongClickListener) {
        this.f8430x = onLongClickListener;
        t.i(this.f8422g, onLongClickListener);
    }

    void X(ImageView.ScaleType scaleType) {
        this.f8429w = scaleType;
        t.j(this.f8422g, scaleType);
        t.j(this.f8418c, scaleType);
    }

    void Y(ColorStateList colorStateList) {
        if (this.f8426t != colorStateList) {
            this.f8426t = colorStateList;
            t.a(this.f8416a, this.f8422g, colorStateList, this.f8427u);
        }
    }

    void Z(PorterDuff.Mode mode) {
        if (this.f8427u != mode) {
            this.f8427u = mode;
            t.a(this.f8416a, this.f8422g, this.f8426t, mode);
        }
    }

    void a0(boolean z10) {
        if (F() != z10) {
            this.f8422g.setVisibility(z10 ? 0 : 8);
            v0();
            x0();
            this.f8416a.p0();
        }
    }

    void b0(int i10) {
        c0(i10 != 0 ? i.a.b(getContext(), i10) : null);
        K();
    }

    void c0(Drawable drawable) {
        this.f8418c.setImageDrawable(drawable);
        w0();
        t.a(this.f8416a, this.f8418c, this.f8419d, this.f8420e);
    }

    void d0(View.OnClickListener onClickListener) {
        t.h(this.f8418c, onClickListener, this.f8421f);
    }

    void e0(View.OnLongClickListener onLongClickListener) {
        this.f8421f = onLongClickListener;
        t.i(this.f8418c, onLongClickListener);
    }

    void f0(ColorStateList colorStateList) {
        if (this.f8419d != colorStateList) {
            this.f8419d = colorStateList;
            t.a(this.f8416a, this.f8418c, colorStateList, this.f8420e);
        }
    }

    void g0(PorterDuff.Mode mode) {
        if (this.f8420e != mode) {
            this.f8420e = mode;
            t.a(this.f8416a, this.f8418c, this.f8419d, mode);
        }
    }

    void h() {
        this.f8422g.performClick();
        this.f8422g.jumpDrawablesToCurrentState();
    }

    void i0(int i10) {
        j0(i10 != 0 ? getResources().getText(i10) : null);
    }

    void j0(CharSequence charSequence) {
        this.f8422g.setContentDescription(charSequence);
    }

    CheckableImageButton k() {
        if (G()) {
            return this.f8418c;
        }
        if (A() && F()) {
            return this.f8422g;
        }
        return null;
    }

    void k0(int i10) {
        l0(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    CharSequence l() {
        return this.f8422g.getContentDescription();
    }

    void l0(Drawable drawable) {
        this.f8422g.setImageDrawable(drawable);
    }

    s m() {
        return this.f8423h.c(this.f8424r);
    }

    void m0(boolean z10) {
        if (z10 && this.f8424r != 1) {
            U(1);
        } else {
            if (z10) {
                return;
            }
            U(0);
        }
    }

    Drawable n() {
        return this.f8422g.getDrawable();
    }

    void n0(ColorStateList colorStateList) {
        this.f8426t = colorStateList;
        t.a(this.f8416a, this.f8422g, colorStateList, this.f8427u);
    }

    int o() {
        return this.f8428v;
    }

    void o0(PorterDuff.Mode mode) {
        this.f8427u = mode;
        t.a(this.f8416a, this.f8422g, this.f8426t, mode);
    }

    int p() {
        return this.f8424r;
    }

    void p0(CharSequence charSequence) {
        this.f8431y = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f8432z.setText(charSequence);
        y0();
    }

    ImageView.ScaleType q() {
        return this.f8429w;
    }

    void q0(int i10) {
        androidx.core.widget.j.m(this.f8432z, i10);
    }

    CheckableImageButton r() {
        return this.f8422g;
    }

    void r0(ColorStateList colorStateList) {
        this.f8432z.setTextColor(colorStateList);
    }

    Drawable s() {
        return this.f8418c.getDrawable();
    }

    CharSequence u() {
        return this.f8422g.getContentDescription();
    }

    Drawable v() {
        return this.f8422g.getDrawable();
    }

    CharSequence w() {
        return this.f8431y;
    }

    ColorStateList x() {
        return this.f8432z.getTextColors();
    }

    void x0() {
        if (this.f8416a.f8331e == null) {
            return;
        }
        this.f8432z.setPaddingRelative(getContext().getResources().getDimensionPixelSize(u8.d.V), this.f8416a.f8331e.getPaddingTop(), (F() || G()) ? 0 : this.f8416a.f8331e.getPaddingEnd(), this.f8416a.f8331e.getPaddingBottom());
    }

    int y() {
        return getPaddingEnd() + this.f8432z.getPaddingEnd() + ((F() || G()) ? this.f8422g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f8422g.getLayoutParams()).getMarginStart() : 0);
    }

    TextView z() {
        return this.f8432z;
    }
}
