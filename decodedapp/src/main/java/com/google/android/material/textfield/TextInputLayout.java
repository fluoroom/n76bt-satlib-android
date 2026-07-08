package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m0.o0;
import m9.l;

/* JADX INFO: loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final int M0 = u8.k.f28735k;
    private static final int[][] N0 = {new int[]{R.attr.state_pressed}, new int[0]};
    private int A;
    private int A0;
    private CharSequence B;
    private int B0;
    private boolean C;
    private int C0;
    private TextView D;
    int D0;
    private ColorStateList E;
    private boolean E0;
    private int F;
    final com.google.android.material.internal.a F0;
    private androidx.transition.c G;
    private boolean G0;
    private androidx.transition.c H;
    private boolean H0;
    private ColorStateList I;
    private ValueAnimator I0;
    private ColorStateList J;
    private boolean J0;
    private ColorStateList K;
    private boolean K0;
    private ColorStateList L;
    private boolean L0;
    private boolean M;
    private CharSequence N;
    private boolean O;
    private m9.h P;
    private m9.h Q;
    private StateListDrawable R;
    private boolean S;
    private m9.h T;
    private m9.h U;
    private m9.l V;
    private boolean W;

    /* JADX INFO: renamed from: a */
    private final FrameLayout f8323a;

    /* JADX INFO: renamed from: a0 */
    private final int f8324a0;

    /* JADX INFO: renamed from: b */
    private final z f8325b;

    /* JADX INFO: renamed from: b0 */
    private int f8326b0;

    /* JADX INFO: renamed from: c */
    private final r f8327c;

    /* JADX INFO: renamed from: c0 */
    private int f8328c0;

    /* JADX INFO: renamed from: d */
    private final int f8329d;

    /* JADX INFO: renamed from: d0 */
    private int f8330d0;

    /* JADX INFO: renamed from: e */
    EditText f8331e;

    /* JADX INFO: renamed from: e0 */
    private int f8332e0;

    /* JADX INFO: renamed from: f */
    private CharSequence f8333f;

    /* JADX INFO: renamed from: f0 */
    private int f8334f0;

    /* JADX INFO: renamed from: g */
    private int f8335g;

    /* JADX INFO: renamed from: g0 */
    private int f8336g0;

    /* JADX INFO: renamed from: h */
    private int f8337h;

    /* JADX INFO: renamed from: h0 */
    private int f8338h0;

    /* JADX INFO: renamed from: i0 */
    private final Rect f8339i0;

    /* JADX INFO: renamed from: j0 */
    private final Rect f8340j0;

    /* JADX INFO: renamed from: k0 */
    private final RectF f8341k0;

    /* JADX INFO: renamed from: l0 */
    private Typeface f8342l0;

    /* JADX INFO: renamed from: m0 */
    private Drawable f8343m0;

    /* JADX INFO: renamed from: n0 */
    private int f8344n0;

    /* JADX INFO: renamed from: o0 */
    private final LinkedHashSet f8345o0;

    /* JADX INFO: renamed from: p0 */
    private Drawable f8346p0;

    /* JADX INFO: renamed from: q0 */
    private int f8347q0;

    /* JADX INFO: renamed from: r */
    private int f8348r;

    /* JADX INFO: renamed from: r0 */
    private Drawable f8349r0;

    /* JADX INFO: renamed from: s */
    private int f8350s;

    /* JADX INFO: renamed from: s0 */
    private ColorStateList f8351s0;

    /* JADX INFO: renamed from: t */
    private final u f8352t;

    /* JADX INFO: renamed from: t0 */
    private ColorStateList f8353t0;

    /* JADX INFO: renamed from: u */
    boolean f8354u;

    /* JADX INFO: renamed from: u0 */
    private int f8355u0;

    /* JADX INFO: renamed from: v */
    private int f8356v;

    /* JADX INFO: renamed from: v0 */
    private int f8357v0;

    /* JADX INFO: renamed from: w */
    private boolean f8358w;

    /* JADX INFO: renamed from: w0 */
    private int f8359w0;

    /* JADX INFO: renamed from: x */
    private f f8360x;

    /* JADX INFO: renamed from: x0 */
    private ColorStateList f8361x0;

    /* JADX INFO: renamed from: y */
    private TextView f8362y;

    /* JADX INFO: renamed from: y0 */
    private int f8363y0;

    /* JADX INFO: renamed from: z */
    private int f8364z;

    /* JADX INFO: renamed from: z0 */
    private int f8365z0;

    class a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        int f8366a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ EditText f8367b;

        a(EditText editText) {
            this.f8367b = editText;
            this.f8366a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.w0(!r0.K0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f8354u) {
                textInputLayout.l0(editable);
            }
            if (TextInputLayout.this.C) {
                TextInputLayout.this.A0(editable);
            }
            int lineCount = this.f8367b.getLineCount();
            int i10 = this.f8366a;
            if (lineCount != i10) {
                if (lineCount < i10) {
                    int minimumHeight = this.f8367b.getMinimumHeight();
                    int i11 = TextInputLayout.this.D0;
                    if (minimumHeight != i11) {
                        this.f8367b.setMinimumHeight(i11);
                    }
                }
                this.f8366a = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    class b extends m0.a {
        b() {
        }

        @Override // m0.a
        public void g(View view, n0.x xVar) {
            super.g(view, xVar);
            xVar.W0(false);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f8327c.h();
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.F0.j0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends m0.a {

        /* JADX INFO: renamed from: d */
        private final TextInputLayout f8372d;

        public e(TextInputLayout textInputLayout) {
            this.f8372d = textInputLayout;
        }

        @Override // m0.a
        public void g(View view, n0.x xVar) {
            super.g(view, xVar);
            EditText editText = this.f8372d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f8372d.getHint();
            CharSequence error = this.f8372d.getError();
            CharSequence placeholderText = this.f8372d.getPlaceholderText();
            int counterMaxLength = this.f8372d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f8372d.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zQ = this.f8372d.Q();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z10 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            this.f8372d.f8325b.A(xVar);
            if (!zIsEmpty) {
                xVar.U0(text);
            } else if (!TextUtils.isEmpty(string)) {
                xVar.U0(string);
                if (!zQ && placeholderText != null) {
                    xVar.U0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                xVar.U0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    xVar.F0(string);
                } else {
                    if (!zIsEmpty) {
                        string = ((Object) text) + ", " + string;
                    }
                    xVar.U0(string);
                }
                xVar.Q0(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            xVar.H0(counterMaxLength);
            if (z10) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                xVar.A0(error);
            }
            View viewT = this.f8372d.f8352t.t();
            if (viewT != null) {
                xVar.G0(viewT);
            }
            this.f8372d.f8327c.m().o(view, xVar);
        }

        @Override // m0.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f8372d.f8327c.m().p(view, accessibilityEvent);
        }
    }

    public interface f {
        int a(Editable editable);
    }

    public interface g {
        void a(TextInputLayout textInputLayout);
    }

    static class h extends q0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        CharSequence f8373a;

        /* JADX INFO: renamed from: b */
        boolean f8374b;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f8373a) + "}";
        }

        @Override // q0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f8373a, parcel, i10);
            parcel.writeInt(this.f8374b ? 1 : 0);
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8373a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f8374b = parcel.readInt() == 1;
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u8.b.f28545b0);
    }

    private void A(boolean z10) {
        ValueAnimator valueAnimator = this.I0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.I0.cancel();
        }
        if (z10 && this.H0) {
            m(1.0f);
        } else {
            this.F0.j0(1.0f);
        }
        this.E0 = false;
        if (C()) {
            W();
        }
        z0();
        this.f8325b.l(false);
        this.f8327c.H(false);
    }

    public void A0(Editable editable) {
        if (this.f8360x.a(editable) != 0 || this.E0) {
            M();
        } else {
            g0();
        }
    }

    private androidx.transition.c B() {
        androidx.transition.c cVar = new androidx.transition.c();
        cVar.m0(h9.d.f(getContext(), u8.b.B, 87));
        cVar.o0(h9.d.g(getContext(), u8.b.H, v8.a.f30492a));
        return cVar;
    }

    private void B0(boolean z10, boolean z11) {
        int defaultColor = this.f8361x0.getDefaultColor();
        int colorForState = this.f8361x0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f8361x0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.f8336g0 = colorForState2;
        } else if (z11) {
            this.f8336g0 = colorForState;
        } else {
            this.f8336g0 = defaultColor;
        }
    }

    private boolean C() {
        return this.M && !TextUtils.isEmpty(this.N) && (this.P instanceof com.google.android.material.textfield.h);
    }

    private void D() {
        Iterator it = this.f8345o0.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this);
        }
    }

    private void E(Canvas canvas) {
        m9.h hVar;
        if (this.U == null || (hVar = this.T) == null) {
            return;
        }
        hVar.draw(canvas);
        if (this.f8331e.isFocused()) {
            Rect bounds = this.U.getBounds();
            Rect bounds2 = this.T.getBounds();
            float fB = this.F0.B();
            int iCenterX = bounds2.centerX();
            bounds.left = v8.a.c(iCenterX, bounds2.left, fB);
            bounds.right = v8.a.c(iCenterX, bounds2.right, fB);
            this.U.draw(canvas);
        }
    }

    private void F(Canvas canvas) {
        if (this.M) {
            this.F0.k(canvas);
        }
    }

    private void G(boolean z10) {
        ValueAnimator valueAnimator = this.I0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.I0.cancel();
        }
        if (z10 && this.H0) {
            m(0.0f);
        } else {
            this.F0.j0(0.0f);
        }
        if (C() && ((com.google.android.material.textfield.h) this.P).v0()) {
            z();
        }
        this.E0 = true;
        M();
        this.f8325b.l(true);
        this.f8327c.H(true);
    }

    private m9.h H(boolean z10) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(u8.d.f28618s0);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f8331e;
        float popupElevation = editText instanceof v ? ((v) editText).getPopupElevation() : getResources().getDimensionPixelOffset(u8.d.D);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(u8.d.f28608n0);
        m9.l lVarM = m9.l.a().C(f10).G(f10).u(dimensionPixelOffset).y(dimensionPixelOffset).m();
        EditText editText2 = this.f8331e;
        m9.h hVarR = m9.h.r(getContext(), popupElevation, editText2 instanceof v ? ((v) editText2).getDropDownBackgroundTintList() : null);
        hVarR.setShapeAppearanceModel(lVarM);
        hVarR.f0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return hVarR;
    }

    private static Drawable I(m9.h hVar, int i10, int i11, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{c9.a.k(i11, i10, 0.1f), i10}), hVar, hVar);
    }

    private int J(int i10, boolean z10) {
        return i10 + ((z10 || getPrefixText() == null) ? (!z10 || getSuffixText() == null) ? this.f8331e.getCompoundPaddingLeft() : this.f8327c.y() : this.f8325b.c());
    }

    private int K(int i10, boolean z10) {
        return i10 - ((z10 || getSuffixText() == null) ? (!z10 || getPrefixText() == null) ? this.f8331e.getCompoundPaddingRight() : this.f8325b.c() : this.f8327c.y());
    }

    private static Drawable L(Context context, m9.h hVar, int i10, int[][] iArr) {
        int iC = c9.a.c(context, u8.b.f28552h, "TextInputLayout");
        m9.h hVar2 = new m9.h(hVar.H());
        int iK = c9.a.k(i10, iC, 0.1f);
        hVar2.c0(new ColorStateList(iArr, new int[]{iK, 0}));
        hVar2.setTint(iC);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iK, iC});
        m9.h hVar3 = new m9.h(hVar.H());
        hVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, hVar2, hVar3), hVar});
    }

    private void M() {
        TextView textView = this.D;
        if (textView == null || !this.C) {
            return;
        }
        textView.setText((CharSequence) null);
        androidx.transition.u.a(this.f8323a, this.H);
        this.D.setVisibility(4);
    }

    private boolean R() {
        return getHintMaxLines() == 1;
    }

    private boolean S() {
        if (d0()) {
            return true;
        }
        return this.f8362y != null && this.f8358w;
    }

    private boolean U() {
        return this.f8326b0 == 1 && this.f8331e.getMinLines() <= 1;
    }

    private void V() {
        q();
        s0();
        C0();
        h0();
        l();
        if (this.f8326b0 != 0) {
            v0();
        }
        b0();
    }

    private void W() {
        if (C()) {
            RectF rectF = this.f8341k0;
            this.F0.o(rectF, this.f8331e.getWidth(), this.f8331e.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            p(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f8330d0);
            rectF.top = 0.0f;
            ((com.google.android.material.textfield.h) this.P).y0(rectF);
        }
    }

    private void X() {
        if (!C() || this.E0) {
            return;
        }
        z();
        W();
    }

    private static void Y(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                Y((ViewGroup) childAt, z10);
            }
        }
    }

    private void a0() {
        TextView textView = this.D;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public static /* synthetic */ void b(TextInputLayout textInputLayout, StaticLayout.Builder builder) {
        if (Build.VERSION.SDK_INT >= 23) {
            builder.setBreakStrategy(textInputLayout.D.getBreakStrategy());
        } else {
            textInputLayout.getClass();
        }
    }

    private void b0() {
        EditText editText = this.f8331e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i10 = this.f8326b0;
                if (i10 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i10 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public static /* synthetic */ int c(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private boolean e0() {
        return (this.f8327c.G() || ((this.f8327c.A() && N()) || this.f8327c.w() != null)) && this.f8327c.getMeasuredWidth() > 0;
    }

    private boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f8325b.getMeasuredWidth() > 0;
    }

    private void g0() {
        if (this.D == null || !this.C || TextUtils.isEmpty(this.B)) {
            return;
        }
        this.D.setText(this.B);
        androidx.transition.u.a(this.f8323a, this.G);
        this.D.setVisibility(0);
        this.D.bringToFront();
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f8331e;
        if (!(editText instanceof AutoCompleteTextView) || q.a(editText)) {
            return this.P;
        }
        int iD = c9.a.d(this.f8331e, h.a.J);
        int i10 = this.f8326b0;
        if (i10 == 2) {
            return L(getContext(), this.P, iD, N0);
        }
        if (i10 == 1) {
            return I(this.P, this.f8338h0, iD, N0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.R == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.R = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.R.addState(new int[0], H(false));
        }
        return this.R;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.Q == null) {
            this.Q = H(true);
        }
        return this.Q;
    }

    private void h0() {
        if (this.f8326b0 == 1) {
            if (j9.c.l(getContext())) {
                this.f8328c0 = getResources().getDimensionPixelSize(u8.d.R);
            } else if (j9.c.k(getContext())) {
                this.f8328c0 = getResources().getDimensionPixelSize(u8.d.Q);
            }
        }
    }

    private void i0(Rect rect) {
        m9.h hVar = this.T;
        if (hVar != null) {
            int i10 = rect.bottom;
            hVar.setBounds(rect.left, i10 - this.f8332e0, rect.right, i10);
        }
        m9.h hVar2 = this.U;
        if (hVar2 != null) {
            int i11 = rect.bottom;
            hVar2.setBounds(rect.left, i11 - this.f8334f0, rect.right, i11);
        }
    }

    private void j0(int i10) {
        this.F0.s0(i10);
        Rect rect = this.f8339i0;
        com.google.android.material.internal.b.a(this, this.f8331e, rect);
        this.F0.S(s(rect));
        v0();
        l();
        t0(i10);
    }

    private void k() {
        TextView textView = this.D;
        if (textView != null) {
            this.f8323a.addView(textView);
            this.D.setVisibility(0);
        }
    }

    private void k0() {
        if (this.f8362y != null) {
            EditText editText = this.f8331e;
            l0(editText == null ? null : editText.getText());
        }
    }

    private void l() {
        if (this.f8331e == null || this.f8326b0 != 1) {
            return;
        }
        if (!R()) {
            EditText editText = this.f8331e;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.F0.q() + this.f8329d), this.f8331e.getPaddingEnd(), getResources().getDimensionPixelSize(u8.d.M));
        } else if (j9.c.l(getContext())) {
            EditText editText2 = this.f8331e;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(u8.d.P), this.f8331e.getPaddingEnd(), getResources().getDimensionPixelSize(u8.d.O));
        } else if (j9.c.k(getContext())) {
            EditText editText3 = this.f8331e;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(u8.d.N), this.f8331e.getPaddingEnd(), getResources().getDimensionPixelSize(u8.d.M));
        }
    }

    private static void m0(Context context, TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? u8.j.f28701c : u8.j.f28700b, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void n() {
        m9.h hVar = this.P;
        if (hVar == null) {
            return;
        }
        m9.l lVarH = hVar.H();
        m9.l lVar = this.V;
        if (lVarH != lVar) {
            this.P.setShapeAppearanceModel(lVar);
        }
        if (x()) {
            this.P.i0(this.f8330d0, this.f8336g0);
        }
        int iR = r();
        this.f8338h0 = iR;
        this.P.c0(ColorStateList.valueOf(iR));
        o();
        s0();
    }

    private void n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f8362y;
        if (textView != null) {
            c0(textView, this.f8358w ? this.f8364z : this.A);
            if (!this.f8358w && (colorStateList2 = this.I) != null) {
                this.f8362y.setTextColor(colorStateList2);
            }
            if (!this.f8358w || (colorStateList = this.J) == null) {
                return;
            }
            this.f8362y.setTextColor(colorStateList);
        }
    }

    private void o() {
        if (this.T == null || this.U == null) {
            return;
        }
        if (y()) {
            this.T.c0(this.f8331e.isFocused() ? ColorStateList.valueOf(this.f8355u0) : ColorStateList.valueOf(this.f8336g0));
            this.U.c0(ColorStateList.valueOf(this.f8336g0));
        }
        invalidate();
    }

    private void o0() {
        ColorStateList colorStateList;
        ColorStateList colorStateListH = this.K;
        if (colorStateListH == null) {
            colorStateListH = c9.a.h(getContext(), h.a.I);
        }
        EditText editText = this.f8331e;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = e0.a.r(this.f8331e.getTextCursorDrawable()).mutate();
        if (S() && (colorStateList = this.L) != null) {
            colorStateListH = colorStateList;
        }
        drawableMutate.setTintList(colorStateListH);
    }

    private void p(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.f8324a0;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    private void q() {
        int i10 = this.f8326b0;
        if (i10 == 0) {
            this.P = null;
            this.T = null;
            this.U = null;
            return;
        }
        if (i10 == 1) {
            this.P = new m9.h(this.V);
            this.T = new m9.h();
            this.U = new m9.h();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(this.f8326b0 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.M || (this.P instanceof com.google.android.material.textfield.h)) {
                this.P = new m9.h(this.V);
            } else {
                this.P = com.google.android.material.textfield.h.u0(this.V);
            }
            this.T = null;
            this.U = null;
        }
    }

    private int r() {
        return this.f8326b0 == 1 ? c9.a.j(c9.a.e(this, u8.b.f28552h, 0), this.f8338h0) : this.f8338h0;
    }

    private void r0() {
        this.f8331e.setBackground(getEditTextBoxBackground());
    }

    private Rect s(Rect rect) {
        if (this.f8331e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f8340j0;
        boolean zG = com.google.android.material.internal.p.g(this);
        rect2.bottom = rect.bottom;
        int i10 = this.f8326b0;
        if (i10 == 1) {
            rect2.left = J(rect.left, zG);
            rect2.top = rect.top + this.f8328c0;
            rect2.right = K(rect.right, zG);
            return rect2;
        }
        if (i10 != 2) {
            rect2.left = J(rect.left, zG);
            rect2.top = getPaddingTop();
            rect2.right = K(rect.right, zG);
            return rect2;
        }
        rect2.left = rect.left + this.f8331e.getPaddingLeft();
        rect2.top = rect.top - w();
        rect2.right = rect.right - this.f8331e.getPaddingRight();
        return rect2;
    }

    private void setEditText(EditText editText) {
        if (this.f8331e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f8331e = editText;
        int i10 = this.f8335g;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f8348r);
        }
        int i11 = this.f8337h;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f8350s);
        }
        this.S = false;
        V();
        setTextInputAccessibilityDelegate(new e(this));
        this.F0.p0(this.f8331e.getTypeface());
        this.F0.h0(this.f8331e.getTextSize());
        this.F0.d0(this.f8331e.getLetterSpacing());
        int gravity = this.f8331e.getGravity();
        this.F0.X((gravity & (-113)) | 48);
        this.F0.g0(gravity);
        this.D0 = editText.getMinimumHeight();
        this.f8331e.addTextChangedListener(new a(editText));
        if (this.f8351s0 == null) {
            this.f8351s0 = this.f8331e.getHintTextColors();
        }
        if (this.M) {
            if (TextUtils.isEmpty(this.N)) {
                CharSequence hint = this.f8331e.getHint();
                this.f8333f = hint;
                setHint(hint);
                this.f8331e.setHint((CharSequence) null);
            }
            this.O = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            o0();
        }
        if (this.f8362y != null) {
            l0(this.f8331e.getText());
        }
        q0();
        this.f8352t.f();
        this.f8325b.bringToFront();
        this.f8327c.bringToFront();
        D();
        this.f8327c.x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        x0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.N)) {
            return;
        }
        this.N = charSequence;
        this.F0.n0(charSequence);
        if (this.E0) {
            return;
        }
        W();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.C == z10) {
            return;
        }
        if (z10) {
            k();
        } else {
            a0();
            this.D = null;
        }
        this.C = z10;
    }

    private int t(Rect rect, Rect rect2, float f10) {
        return U() ? (int) (rect2.top + f10) : rect.bottom - this.f8331e.getCompoundPaddingBottom();
    }

    private void t0(int i10) {
        if (this.f8331e == null) {
            return;
        }
        float fZ = this.F0.z();
        float height = 0.0f;
        if (this.B != null) {
            TextPaint textPaint = new TextPaint(129);
            textPaint.set(this.D.getPaint());
            textPaint.setTextSize(this.D.getTextSize());
            textPaint.setTypeface(this.D.getTypeface());
            textPaint.setLetterSpacing(this.D.getLetterSpacing());
            try {
                height = com.google.android.material.internal.h.c(this.B, textPaint, i10).h(getLayoutDirection() == 1).g(true).i(this.D.getLineSpacingExtra(), this.D.getLineSpacingMultiplier()).k(new com.google.android.material.internal.i() { // from class: com.google.android.material.textfield.c0
                    @Override // com.google.android.material.internal.i
                    public final void a(StaticLayout.Builder builder) {
                        TextInputLayout.b(this.f8379a, builder);
                    }
                }).a().getHeight() + (this.f8326b0 == 1 ? this.F0.q() + this.f8328c0 + this.f8329d : 0.0f);
            } catch (h.a e10) {
                Log.e("TextInputLayout", e10.getCause().getMessage(), e10);
            }
        }
        float fMax = Math.max(fZ, height);
        if (this.f8331e.getMeasuredHeight() < fMax) {
            this.f8331e.setMinimumHeight(Math.round(fMax));
        }
    }

    private int u(Rect rect, float f10) {
        if (U()) {
            return (int) (rect.centerY() - (f10 / 2.0f));
        }
        return (rect.top + this.f8331e.getCompoundPaddingTop()) - ((this.f8326b0 != 0 || R()) ? 0 : (int) (this.F0.A() / 2.0f));
    }

    private boolean u0() {
        int iMax;
        if (this.f8331e == null || this.f8331e.getMeasuredHeight() >= (iMax = Math.max(this.f8327c.getMeasuredHeight(), this.f8325b.getMeasuredHeight()))) {
            return false;
        }
        this.f8331e.setMinimumHeight(iMax);
        return true;
    }

    private Rect v(Rect rect) {
        if (this.f8331e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f8340j0;
        float fA = R() ? this.F0.A() : this.F0.y() * this.F0.w();
        rect2.left = rect.left + this.f8331e.getCompoundPaddingLeft();
        rect2.top = u(rect, fA);
        rect2.right = rect.right - this.f8331e.getCompoundPaddingRight();
        rect2.bottom = t(rect, rect2, fA);
        return rect2;
    }

    private void v0() {
        if (this.f8326b0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8323a.getLayoutParams();
            int iW = w();
            if (iW != layoutParams.topMargin) {
                layoutParams.topMargin = iW;
                this.f8323a.requestLayout();
            }
        }
    }

    private int w() {
        if (!this.M) {
            return 0;
        }
        int i10 = this.f8326b0;
        if (i10 == 0) {
            return (int) this.F0.q();
        }
        if (i10 != 2) {
            return 0;
        }
        return R() ? (int) (this.F0.q() / 2.0f) : Math.max(0, (int) (this.F0.q() - (this.F0.n() / 2.0f)));
    }

    private boolean x() {
        return this.f8326b0 == 2 && y();
    }

    private void x0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f8331e;
        boolean z12 = false;
        boolean z13 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f8331e;
        if (editText2 != null && editText2.hasFocus()) {
            z12 = true;
        }
        ColorStateList colorStateList2 = this.f8351s0;
        if (colorStateList2 != null) {
            this.F0.Q(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f8351s0;
            this.F0.Q(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.C0) : this.C0));
        } else if (d0()) {
            this.F0.Q(this.f8352t.r());
        } else if (this.f8358w && (textView = this.f8362y) != null) {
            this.F0.Q(textView.getTextColors());
        } else if (z12 && (colorStateList = this.f8353t0) != null) {
            this.F0.W(colorStateList);
        }
        if (z13 || !this.G0 || (isEnabled() && z12)) {
            if (z11 || this.E0) {
                A(z10);
                return;
            }
            return;
        }
        if (z11 || !this.E0) {
            G(z10);
        }
    }

    private boolean y() {
        return this.f8330d0 > -1 && this.f8336g0 != 0;
    }

    private void y0() {
        EditText editText;
        if (this.D == null || (editText = this.f8331e) == null) {
            return;
        }
        this.D.setGravity(editText.getGravity());
        this.D.setPadding(this.f8331e.getCompoundPaddingLeft(), this.f8331e.getCompoundPaddingTop(), this.f8331e.getCompoundPaddingRight(), this.f8331e.getCompoundPaddingBottom());
    }

    private void z() {
        if (C()) {
            ((com.google.android.material.textfield.h) this.P).w0();
        }
    }

    private void z0() {
        EditText editText = this.f8331e;
        A0(editText == null ? null : editText.getText());
    }

    void C0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.P == null || this.f8326b0 == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f8331e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f8331e) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.f8336g0 = this.C0;
        } else if (d0()) {
            if (this.f8361x0 != null) {
                B0(z11, z10);
            } else {
                this.f8336g0 = getErrorCurrentTextColors();
            }
        } else if (!this.f8358w || (textView = this.f8362y) == null) {
            if (z11) {
                this.f8336g0 = this.f8359w0;
            } else if (z10) {
                this.f8336g0 = this.f8357v0;
            } else {
                this.f8336g0 = this.f8355u0;
            }
        } else if (this.f8361x0 != null) {
            B0(z11, z10);
        } else {
            this.f8336g0 = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            o0();
        }
        this.f8327c.I();
        Z();
        if (this.f8326b0 == 2) {
            int i10 = this.f8330d0;
            if (z11 && isEnabled()) {
                this.f8330d0 = this.f8334f0;
            } else {
                this.f8330d0 = this.f8332e0;
            }
            if (this.f8330d0 != i10) {
                X();
            }
        }
        if (this.f8326b0 == 1) {
            if (!isEnabled()) {
                this.f8338h0 = this.f8365z0;
            } else if (z10 && !z11) {
                this.f8338h0 = this.B0;
            } else if (z11) {
                this.f8338h0 = this.A0;
            } else {
                this.f8338h0 = this.f8363y0;
            }
        }
        n();
    }

    public boolean N() {
        return this.f8327c.F();
    }

    public boolean O() {
        return this.f8352t.A();
    }

    public boolean P() {
        return this.f8352t.B();
    }

    final boolean Q() {
        return this.E0;
    }

    public boolean T() {
        return this.O;
    }

    public void Z() {
        this.f8325b.m();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f8323a.addView(view, layoutParams2);
        this.f8323a.setLayoutParams(layoutParams);
        v0();
        setEditText((EditText) view);
    }

    void c0(TextView textView, int i10) {
        try {
            androidx.core.widget.j.m(textView, i10);
            if (Build.VERSION.SDK_INT < 23) {
                return;
            }
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        androidx.core.widget.j.m(textView, h.i.f14908c);
        textView.setTextColor(b0.b.b(getContext(), u8.c.f28571a));
    }

    boolean d0() {
        return this.f8352t.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f8331e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f8333f != null) {
            boolean z10 = this.O;
            this.O = false;
            CharSequence hint = editText.getHint();
            this.f8331e.setHint(this.f8333f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f8331e.setHint(hint);
                this.O = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f8323a.getChildCount());
        for (int i11 = 0; i11 < this.f8323a.getChildCount(); i11++) {
            View childAt = this.f8323a.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f8331e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.K0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.K0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        F(canvas);
        E(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.J0) {
            return;
        }
        this.J0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.F0;
        boolean zM0 = aVar != null ? aVar.m0(drawableState) : false;
        if (this.f8331e != null) {
            w0(isLaidOut() && isEnabled());
        }
        q0();
        C0();
        if (zM0) {
            invalidate();
        }
        this.J0 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f8331e;
        return editText != null ? editText.getBaseline() + getPaddingTop() + w() : super.getBaseline();
    }

    m9.h getBoxBackground() {
        int i10 = this.f8326b0;
        if (i10 == 1 || i10 == 2) {
            return this.P;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f8338h0;
    }

    public int getBoxBackgroundMode() {
        return this.f8326b0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f8328c0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return com.google.android.material.internal.p.g(this) ? this.V.j().a(this.f8341k0) : this.V.l().a(this.f8341k0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return com.google.android.material.internal.p.g(this) ? this.V.l().a(this.f8341k0) : this.V.j().a(this.f8341k0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return com.google.android.material.internal.p.g(this) ? this.V.r().a(this.f8341k0) : this.V.t().a(this.f8341k0);
    }

    public float getBoxCornerRadiusTopStart() {
        return com.google.android.material.internal.p.g(this) ? this.V.t().a(this.f8341k0) : this.V.r().a(this.f8341k0);
    }

    public int getBoxStrokeColor() {
        return this.f8359w0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f8361x0;
    }

    public int getBoxStrokeWidth() {
        return this.f8332e0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f8334f0;
    }

    public int getCounterMaxLength() {
        return this.f8356v;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f8354u && this.f8358w && (textView = this.f8362y) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.J;
    }

    public ColorStateList getCounterTextColor() {
        return this.I;
    }

    public ColorStateList getCursorColor() {
        return this.K;
    }

    public ColorStateList getCursorErrorColor() {
        return this.L;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f8351s0;
    }

    public EditText getEditText() {
        return this.f8331e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f8327c.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f8327c.n();
    }

    public int getEndIconMinSize() {
        return this.f8327c.o();
    }

    public int getEndIconMode() {
        return this.f8327c.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f8327c.q();
    }

    CheckableImageButton getEndIconView() {
        return this.f8327c.r();
    }

    public CharSequence getError() {
        if (this.f8352t.A()) {
            return this.f8352t.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f8352t.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f8352t.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f8352t.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f8327c.s();
    }

    public CharSequence getHelperText() {
        if (this.f8352t.B()) {
            return this.f8352t.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f8352t.u();
    }

    public CharSequence getHint() {
        if (this.M) {
            return this.N;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.F0.q();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.F0.t();
    }

    public int getHintMaxLines() {
        return this.F0.x();
    }

    public ColorStateList getHintTextColor() {
        return this.f8353t0;
    }

    public f getLengthCounter() {
        return this.f8360x;
    }

    public int getMaxEms() {
        return this.f8337h;
    }

    public int getMaxWidth() {
        return this.f8350s;
    }

    public int getMinEms() {
        return this.f8335g;
    }

    public int getMinWidth() {
        return this.f8348r;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f8327c.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f8327c.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.C) {
            return this.B;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.F;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.E;
    }

    public CharSequence getPrefixText() {
        return this.f8325b.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f8325b.b();
    }

    public TextView getPrefixTextView() {
        return this.f8325b.d();
    }

    public m9.l getShapeAppearanceModel() {
        return this.V;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f8325b.e();
    }

    public Drawable getStartIconDrawable() {
        return this.f8325b.f();
    }

    public int getStartIconMinSize() {
        return this.f8325b.g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f8325b.h();
    }

    public CharSequence getSuffixText() {
        return this.f8327c.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f8327c.x();
    }

    public TextView getSuffixTextView() {
        return this.f8327c.z();
    }

    public Typeface getTypeface() {
        return this.f8342l0;
    }

    public void j(g gVar) {
        this.f8345o0.add(gVar);
        if (this.f8331e != null) {
            gVar.a(this);
        }
    }

    void l0(Editable editable) {
        int iA = this.f8360x.a(editable);
        boolean z10 = this.f8358w;
        int i10 = this.f8356v;
        if (i10 == -1) {
            this.f8362y.setText(String.valueOf(iA));
            this.f8362y.setContentDescription(null);
            this.f8358w = false;
        } else {
            this.f8358w = iA > i10;
            m0(getContext(), this.f8362y, iA, this.f8356v, this.f8358w);
            if (z10 != this.f8358w) {
                n0();
            }
            this.f8362y.setText(k0.a.c().j(getContext().getString(u8.j.f28702d, Integer.valueOf(iA), Integer.valueOf(this.f8356v))));
        }
        if (this.f8331e == null || z10 == this.f8358w) {
            return;
        }
        w0(false);
        C0();
        q0();
    }

    void m(float f10) {
        if (this.F0.B() == f10) {
            return;
        }
        if (this.I0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.I0 = valueAnimator;
            valueAnimator.setInterpolator(h9.d.g(getContext(), u8.b.G, v8.a.f30493b));
            this.I0.setDuration(h9.d.f(getContext(), u8.b.A, 167));
            this.I0.addUpdateListener(new d());
        }
        this.I0.setFloatValues(this.F0.B(), f10);
        this.I0.start();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.F0.L(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f8327c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.L0 = false;
        boolean zU0 = u0();
        boolean zP0 = p0();
        if (zU0 || zP0) {
            this.f8331e.post(new Runnable() { // from class: com.google.android.material.textfield.a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8376a.f8331e.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f8331e;
        if (editText != null) {
            Rect rect = this.f8339i0;
            com.google.android.material.internal.b.a(this, editText, rect);
            i0(rect);
            if (this.M) {
                this.F0.h0(this.f8331e.getTextSize());
                int gravity = this.f8331e.getGravity();
                this.F0.X((gravity & (-113)) | 48);
                this.F0.g0(gravity);
                this.F0.S(s(rect));
                this.F0.c0(v(rect));
                this.F0.N();
                if (!C() || this.E0) {
                    return;
                }
                W();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.L0) {
            this.f8327c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.L0 = true;
        }
        y0();
        this.f8327c.x0();
        if (R()) {
            return;
        }
        j0((this.f8331e.getMeasuredWidth() - this.f8331e.getCompoundPaddingLeft()) - this.f8331e.getCompoundPaddingRight());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        setError(hVar.f8373a);
        if (hVar.f8374b) {
            post(new c());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 1;
        if (z10 != this.W) {
            float fA = this.V.r().a(this.f8341k0);
            float fA2 = this.V.t().a(this.f8341k0);
            m9.l lVarM = m9.l.a().B(this.V.s()).F(this.V.q()).t(this.V.k()).x(this.V.i()).C(fA2).G(fA).u(this.V.l().a(this.f8341k0)).y(this.V.j().a(this.f8341k0)).m();
            this.W = z10;
            setShapeAppearanceModel(lVarM);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (d0()) {
            hVar.f8373a = getError();
        }
        hVar.f8374b = this.f8327c.E();
        return hVar;
    }

    boolean p0() {
        boolean z10;
        if (this.f8331e == null) {
            return false;
        }
        boolean z11 = true;
        if (f0()) {
            int measuredWidth = this.f8325b.getMeasuredWidth() - this.f8331e.getPaddingLeft();
            if (this.f8343m0 == null || this.f8344n0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f8343m0 = colorDrawable;
                this.f8344n0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.f8331e.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.f8343m0;
            if (drawable != drawable2) {
                this.f8331e.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.f8343m0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f8331e.getCompoundDrawablesRelative();
                this.f8331e.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f8343m0 = null;
                z10 = true;
            }
            z10 = false;
        }
        if (e0()) {
            int measuredWidth2 = this.f8327c.z().getMeasuredWidth() - this.f8331e.getPaddingRight();
            CheckableImageButton checkableImageButtonK = this.f8327c.k();
            if (checkableImageButtonK != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonK.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButtonK.getLayoutParams()).getMarginStart();
            }
            Drawable[] compoundDrawablesRelative3 = this.f8331e.getCompoundDrawablesRelative();
            Drawable drawable3 = this.f8346p0;
            if (drawable3 != null && this.f8347q0 != measuredWidth2) {
                this.f8347q0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f8331e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f8346p0, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.f8346p0 = colorDrawable2;
                this.f8347q0 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.f8346p0;
            if (drawable4 != drawable5) {
                this.f8349r0 = drawable4;
                this.f8331e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.f8346p0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f8331e.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.f8346p0) {
                this.f8331e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f8349r0, compoundDrawablesRelative4[3]);
            } else {
                z11 = z10;
            }
            this.f8346p0 = null;
            return z11;
        }
        return z10;
    }

    void q0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f8331e;
        if (editText == null || this.f8326b0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (DrawableUtils.canSafelyMutateDrawable(background)) {
            background = background.mutate();
        }
        if (d0()) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f8358w && (textView = this.f8362y) != null) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            e0.a.c(background);
            this.f8331e.refreshDrawableState();
        }
    }

    void s0() {
        EditText editText = this.f8331e;
        if (editText == null || this.P == null) {
            return;
        }
        if ((this.S || editText.getBackground() == null) && this.f8326b0 != 0) {
            r0();
            this.S = true;
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f8338h0 != i10) {
            this.f8338h0 = i10;
            this.f8363y0 = i10;
            this.A0 = i10;
            this.B0 = i10;
            n();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(b0.b.b(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f8363y0 = defaultColor;
        this.f8338h0 = defaultColor;
        this.f8365z0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.A0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.B0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        n();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f8326b0) {
            return;
        }
        this.f8326b0 = i10;
        if (this.f8331e != null) {
            V();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f8328c0 = i10;
    }

    public void setBoxCornerFamily(int i10) {
        this.V = this.V.w().A(i10, this.V.r()).E(i10, this.V.t()).s(i10, this.V.j()).w(i10, this.V.l()).m();
        n();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f8359w0 != i10) {
            this.f8359w0 = i10;
            C0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f8355u0 = colorStateList.getDefaultColor();
            this.C0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f8357v0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f8359w0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f8359w0 != colorStateList.getDefaultColor()) {
            this.f8359w0 = colorStateList.getDefaultColor();
        }
        C0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f8361x0 != colorStateList) {
            this.f8361x0 = colorStateList;
            C0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f8332e0 = i10;
        C0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f8334f0 = i10;
        C0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f8354u != z10) {
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f8362y = appCompatTextView;
                appCompatTextView.setId(u8.f.U);
                Typeface typeface = this.f8342l0;
                if (typeface != null) {
                    this.f8362y.setTypeface(typeface);
                }
                this.f8362y.setMaxLines(1);
                this.f8352t.e(this.f8362y, 2);
                ((ViewGroup.MarginLayoutParams) this.f8362y.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(u8.d.f28630y0));
                n0();
                k0();
            } else {
                this.f8352t.C(this.f8362y, 2);
                this.f8362y = null;
            }
            this.f8354u = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f8356v != i10) {
            if (i10 > 0) {
                this.f8356v = i10;
            } else {
                this.f8356v = -1;
            }
            if (this.f8354u) {
                k0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f8364z != i10) {
            this.f8364z = i10;
            n0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.J != colorStateList) {
            this.J = colorStateList;
            n0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.A != i10) {
            this.A = i10;
            n0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            n0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            o0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.L != colorStateList) {
            this.L = colorStateList;
            if (S()) {
                o0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f8351s0 = colorStateList;
        this.f8353t0 = colorStateList;
        if (this.f8331e != null) {
            w0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        Y(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f8327c.N(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f8327c.O(z10);
    }

    public void setEndIconContentDescription(int i10) {
        this.f8327c.P(i10);
    }

    public void setEndIconDrawable(int i10) {
        this.f8327c.R(i10);
    }

    public void setEndIconMinSize(int i10) {
        this.f8327c.T(i10);
    }

    public void setEndIconMode(int i10) {
        this.f8327c.U(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f8327c.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f8327c.W(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f8327c.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f8327c.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f8327c.Z(mode);
    }

    public void setEndIconVisible(boolean z10) {
        this.f8327c.a0(z10);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f8352t.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f8352t.w();
        } else {
            this.f8352t.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        this.f8352t.E(i10);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f8352t.F(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f8352t.G(z10);
    }

    public void setErrorIconDrawable(int i10) {
        this.f8327c.b0(i10);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f8327c.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f8327c.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f8327c.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f8327c.g0(mode);
    }

    public void setErrorTextAppearance(int i10) {
        this.f8352t.H(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f8352t.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.G0 != z10) {
            this.G0 = z10;
            w0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (P()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!P()) {
                setHelperTextEnabled(true);
            }
            this.f8352t.R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f8352t.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f8352t.K(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f8352t.J(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.M) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.H0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.M) {
            this.M = z10;
            if (z10) {
                CharSequence hint = this.f8331e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.N)) {
                        setHint(hint);
                    }
                    this.f8331e.setHint((CharSequence) null);
                }
                this.O = true;
            } else {
                this.O = false;
                if (!TextUtils.isEmpty(this.N) && TextUtils.isEmpty(this.f8331e.getHint())) {
                    this.f8331e.setHint(this.N);
                }
                setHintInternal(null);
            }
            if (this.f8331e != null) {
                v0();
            }
        }
    }

    public void setHintMaxLines(int i10) {
        this.F0.T(i10);
        this.F0.e0(i10);
        requestLayout();
    }

    public void setHintTextAppearance(int i10) {
        this.F0.U(i10);
        this.f8353t0 = this.F0.p();
        if (this.f8331e != null) {
            w0(false);
            v0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f8353t0 != colorStateList) {
            if (this.f8351s0 == null) {
                this.F0.W(colorStateList);
            }
            this.f8353t0 = colorStateList;
            if (this.f8331e != null) {
                w0(false);
            }
        }
    }

    public void setLengthCounter(f fVar) {
        this.f8360x = fVar;
    }

    public void setMaxEms(int i10) {
        this.f8337h = i10;
        EditText editText = this.f8331e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f8350s = i10;
        EditText editText = this.f8331e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f8335g = i10;
        EditText editText = this.f8331e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f8348r = i10;
        EditText editText = this.f8331e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        this.f8327c.i0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        this.f8327c.k0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        this.f8327c.m0(z10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f8327c.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f8327c.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.D == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.D = appCompatTextView;
            appCompatTextView.setId(u8.f.X);
            this.D.setImportantForAccessibility(1);
            this.D.setAccessibilityLiveRegion(1);
            androidx.transition.c cVarB = B();
            this.G = cVarB;
            cVarB.r0(67L);
            this.H = B();
            setPlaceholderTextAppearance(this.F);
            setPlaceholderTextColor(this.E);
            o0.n0(this.D, new b());
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.C) {
                setPlaceholderTextEnabled(true);
            }
            this.B = charSequence;
        }
        z0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.F = i10;
        TextView textView = this.D;
        if (textView != null) {
            androidx.core.widget.j.m(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            TextView textView = this.D;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f8325b.n(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.f8325b.o(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f8325b.p(colorStateList);
    }

    public void setShapeAppearanceModel(m9.l lVar) {
        m9.h hVar = this.P;
        if (hVar == null || hVar.H() == lVar) {
            return;
        }
        this.V = lVar;
        n();
    }

    public void setStartIconCheckable(boolean z10) {
        this.f8325b.q(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        this.f8325b.t(i10);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f8325b.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f8325b.v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f8325b.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f8325b.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f8325b.y(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f8325b.z(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f8327c.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i10) {
        this.f8327c.q0(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f8327c.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f8331e;
        if (editText != null) {
            o0.n0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f8342l0) {
            this.f8342l0 = typeface;
            this.F0.p0(typeface);
            this.f8352t.N(typeface);
            TextView textView = this.f8362y;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void w0(boolean z10) {
        x0(z10, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11 = M0;
        super(q9.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f8335g = -1;
        this.f8337h = -1;
        this.f8348r = -1;
        this.f8350s = -1;
        this.f8352t = new u(this);
        this.f8360x = new f() { // from class: com.google.android.material.textfield.b0
            @Override // com.google.android.material.textfield.TextInputLayout.f
            public final int a(Editable editable) {
                return TextInputLayout.c(editable);
            }
        };
        this.f8339i0 = new Rect();
        this.f8340j0 = new Rect();
        this.f8341k0 = new RectF();
        this.f8345o0 = new LinkedHashSet();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.F0 = aVar;
        this.L0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f8323a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = v8.a.f30492a;
        aVar.o0(timeInterpolator);
        aVar.l0(timeInterpolator);
        aVar.X(8388659);
        int[] iArr = u8.l.A6;
        int i12 = u8.l.X6;
        int i13 = u8.l.V6;
        int i14 = u8.l.f28895p7;
        int i15 = u8.l.f28940u7;
        int i16 = u8.l.f28985z7;
        TintTypedArray tintTypedArrayJ = com.google.android.material.internal.m.j(context2, attributeSet, iArr, i10, i11, i12, i13, i14, i15, i16);
        z zVar = new z(this, tintTypedArrayJ);
        this.f8325b = zVar;
        this.M = tintTypedArrayJ.getBoolean(u8.l.f28967x7, true);
        setHint(tintTypedArrayJ.getText(u8.l.F6));
        this.H0 = tintTypedArrayJ.getBoolean(u8.l.f28958w7, true);
        this.G0 = tintTypedArrayJ.getBoolean(u8.l.f28913r7, true);
        int i17 = u8.l.H6;
        if (tintTypedArrayJ.hasValue(i17)) {
            setMinEms(tintTypedArrayJ.getInt(i17, -1));
        } else {
            int i18 = u8.l.E6;
            if (tintTypedArrayJ.hasValue(i18)) {
                setMinWidth(tintTypedArrayJ.getDimensionPixelSize(i18, -1));
            }
        }
        int i19 = u8.l.G6;
        if (tintTypedArrayJ.hasValue(i19)) {
            setMaxEms(tintTypedArrayJ.getInt(i19, -1));
        } else {
            int i20 = u8.l.D6;
            if (tintTypedArrayJ.hasValue(i20)) {
                setMaxWidth(tintTypedArrayJ.getDimensionPixelSize(i20, -1));
            }
        }
        this.V = m9.l.e(context2, attributeSet, i10, i11).m();
        this.f8324a0 = context2.getResources().getDimensionPixelOffset(u8.d.f28624v0);
        this.f8328c0 = tintTypedArrayJ.getDimensionPixelOffset(u8.l.K6, 0);
        this.f8329d = getResources().getDimensionPixelSize(u8.d.E);
        this.f8332e0 = tintTypedArrayJ.getDimensionPixelSize(u8.l.R6, context2.getResources().getDimensionPixelSize(u8.d.f28626w0));
        this.f8334f0 = tintTypedArrayJ.getDimensionPixelSize(u8.l.S6, context2.getResources().getDimensionPixelSize(u8.d.f28628x0));
        this.f8330d0 = this.f8332e0;
        float dimension = tintTypedArrayJ.getDimension(u8.l.O6, -1.0f);
        float dimension2 = tintTypedArrayJ.getDimension(u8.l.N6, -1.0f);
        float dimension3 = tintTypedArrayJ.getDimension(u8.l.L6, -1.0f);
        float dimension4 = tintTypedArrayJ.getDimension(u8.l.M6, -1.0f);
        l.b bVarW = this.V.w();
        if (dimension >= 0.0f) {
            bVarW.C(dimension);
        }
        if (dimension2 >= 0.0f) {
            bVarW.G(dimension2);
        }
        if (dimension3 >= 0.0f) {
            bVarW.y(dimension3);
        }
        if (dimension4 >= 0.0f) {
            bVarW.u(dimension4);
        }
        this.V = bVarW.m();
        ColorStateList colorStateListB = j9.c.b(context2, tintTypedArrayJ, u8.l.I6);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.f8363y0 = defaultColor;
            this.f8338h0 = defaultColor;
            if (colorStateListB.isStateful()) {
                this.f8365z0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.A0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.B0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.A0 = this.f8363y0;
                ColorStateList colorStateListA = i.a.a(context2, u8.c.f28577g);
                this.f8365z0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.B0 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f8338h0 = 0;
            this.f8363y0 = 0;
            this.f8365z0 = 0;
            this.A0 = 0;
            this.B0 = 0;
        }
        int i21 = u8.l.C6;
        if (tintTypedArrayJ.hasValue(i21)) {
            ColorStateList colorStateList = tintTypedArrayJ.getColorStateList(i21);
            this.f8353t0 = colorStateList;
            this.f8351s0 = colorStateList;
        }
        int i22 = u8.l.P6;
        ColorStateList colorStateListB2 = j9.c.b(context2, tintTypedArrayJ, i22);
        this.f8359w0 = tintTypedArrayJ.getColor(i22, 0);
        this.f8355u0 = b0.b.b(context2, u8.c.f28578h);
        this.C0 = b0.b.b(context2, u8.c.f28579i);
        this.f8357v0 = b0.b.b(context2, u8.c.f28580j);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        int i23 = u8.l.Q6;
        if (tintTypedArrayJ.hasValue(i23)) {
            setBoxStrokeErrorColor(j9.c.b(context2, tintTypedArrayJ, i23));
        }
        if (tintTypedArrayJ.getResourceId(i16, -1) != -1) {
            setHintTextAppearance(tintTypedArrayJ.getResourceId(i16, 0));
        }
        this.K = tintTypedArrayJ.getColorStateList(u8.l.Z6);
        this.L = tintTypedArrayJ.getColorStateList(u8.l.f28759a7);
        int resourceId = tintTypedArrayJ.getResourceId(i14, 0);
        CharSequence text = tintTypedArrayJ.getText(u8.l.f28850k7);
        int i24 = tintTypedArrayJ.getInt(u8.l.f28841j7, 1);
        boolean z10 = tintTypedArrayJ.getBoolean(u8.l.f28859l7, false);
        int resourceId2 = tintTypedArrayJ.getResourceId(i15, 0);
        boolean z11 = tintTypedArrayJ.getBoolean(u8.l.f28931t7, false);
        CharSequence text2 = tintTypedArrayJ.getText(u8.l.f28922s7);
        int resourceId3 = tintTypedArrayJ.getResourceId(u8.l.H7, 0);
        CharSequence text3 = tintTypedArrayJ.getText(u8.l.G7);
        boolean z12 = tintTypedArrayJ.getBoolean(u8.l.T6, false);
        setCounterMaxLength(tintTypedArrayJ.getInt(u8.l.U6, -1));
        this.A = tintTypedArrayJ.getResourceId(i12, 0);
        this.f8364z = tintTypedArrayJ.getResourceId(i13, 0);
        setBoxBackgroundMode(tintTypedArrayJ.getInt(u8.l.J6, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i24);
        setCounterOverflowTextAppearance(this.f8364z);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.A);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        int i25 = u8.l.f28904q7;
        if (tintTypedArrayJ.hasValue(i25)) {
            setErrorTextColor(tintTypedArrayJ.getColorStateList(i25));
        }
        int i26 = u8.l.f28949v7;
        if (tintTypedArrayJ.hasValue(i26)) {
            setHelperTextColor(tintTypedArrayJ.getColorStateList(i26));
        }
        int i27 = u8.l.A7;
        if (tintTypedArrayJ.hasValue(i27)) {
            setHintTextColor(tintTypedArrayJ.getColorStateList(i27));
        }
        int i28 = u8.l.Y6;
        if (tintTypedArrayJ.hasValue(i28)) {
            setCounterTextColor(tintTypedArrayJ.getColorStateList(i28));
        }
        int i29 = u8.l.W6;
        if (tintTypedArrayJ.hasValue(i29)) {
            setCounterOverflowTextColor(tintTypedArrayJ.getColorStateList(i29));
        }
        int i30 = u8.l.I7;
        if (tintTypedArrayJ.hasValue(i30)) {
            setPlaceholderTextColor(tintTypedArrayJ.getColorStateList(i30));
        }
        r rVar = new r(this, tintTypedArrayJ);
        this.f8327c = rVar;
        boolean z13 = tintTypedArrayJ.getBoolean(u8.l.B6, true);
        setHintMaxLines(tintTypedArrayJ.getInt(u8.l.f28976y7, 1));
        tintTypedArrayJ.recycle();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(zVar);
        frameLayout.addView(rVar);
        addView(frameLayout);
        setEnabled(z13);
        setHelperTextEnabled(z11);
        setErrorEnabled(z10);
        setCounterEnabled(z12);
        setHelperText(text2);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f8327c.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f8327c.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f8327c.c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f8327c.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f8327c.l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f8325b.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f8325b.s(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }
}
