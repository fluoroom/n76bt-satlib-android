package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.d0;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m0.b0;
import m0.i1;
import m0.o0;

/* JADX INFO: loaded from: classes3.dex */
public class k<S> extends androidx.fragment.app.n {

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    static final Object f7783g1 = "CONFIRM_BUTTON_TAG";

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    static final Object f7784h1 = "CANCEL_BUTTON_TAG";

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    static final Object f7785i1 = "TOGGLE_BUTTON_TAG";
    private final LinkedHashSet E0 = new LinkedHashSet();
    private final LinkedHashSet F0 = new LinkedHashSet();
    private final LinkedHashSet G0 = new LinkedHashSet();
    private final LinkedHashSet H0 = new LinkedHashSet();
    private int I0;
    private q J0;
    private com.google.android.material.datepicker.a K0;
    private i L0;
    private int M0;
    private CharSequence N0;
    private boolean O0;
    private int P0;
    private int Q0;
    private CharSequence R0;
    private int S0;
    private CharSequence T0;
    private int U0;
    private CharSequence V0;
    private int W0;
    private CharSequence X0;
    private TextView Y0;
    private TextView Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private CheckableImageButton f7786a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private m9.h f7787b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private Button f7788c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private boolean f7789d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private CharSequence f7790e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private CharSequence f7791f1;

    class a implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f7793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7794c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7795d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f7796e;

        a(int i10, View view, int i11, int i12, int i13) {
            this.f7792a = i10;
            this.f7793b = view;
            this.f7794c = i11;
            this.f7795d = i12;
            this.f7796e = i13;
        }

        @Override // m0.b0
        public i1 a(View view, i1 i1Var) {
            d0.b bVarF = i1Var.f(i1.q.d());
            if (this.f7792a >= 0) {
                this.f7793b.getLayoutParams().height = this.f7792a + bVarF.f10511b;
                View view2 = this.f7793b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f7793b;
            view3.setPadding(this.f7794c + bVarF.f10510a, this.f7795d + bVarF.f10511b, this.f7796e + bVarF.f10512c, view3.getPaddingBottom());
            return i1Var;
        }
    }

    class b extends p {
        b() {
        }
    }

    public static /* synthetic */ void h4(k kVar, View view) {
        kVar.k4();
        throw null;
    }

    private static Drawable i4(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, i.a.b(context, u8.e.f28633b));
        stateListDrawable.addState(new int[0], i.a.b(context, u8.e.f28634c));
        return stateListDrawable;
    }

    private void j4(Window window) {
        if (this.f7789d1) {
            return;
        }
        View viewFindViewById = z3().findViewById(u8.f.f28649g);
        com.google.android.material.internal.c.a(window, true, com.google.android.material.internal.p.d(viewFindViewById), null);
        int paddingTop = viewFindViewById.getPaddingTop();
        o0.y0(viewFindViewById, new a(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingLeft(), paddingTop, viewFindViewById.getPaddingRight()));
        this.f7789d1 = true;
    }

    private d k4() {
        android.support.v4.media.session.b.a(i1().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    private static CharSequence l4(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    private String m4() {
        k4();
        x3();
        throw null;
    }

    private static int o4(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(u8.d.f28586c0);
        int i10 = m.h().f7805d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(u8.d.f28590e0) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(u8.d.f28596h0));
    }

    private int p4(Context context) {
        int i10 = this.I0;
        if (i10 != 0) {
            return i10;
        }
        k4();
        throw null;
    }

    private void q4(Context context) {
        this.f7786a1.setTag(f7785i1);
        this.f7786a1.setImageDrawable(i4(context));
        this.f7786a1.setChecked(this.P0 != 0);
        o0.n0(this.f7786a1, null);
        y4(this.f7786a1);
        this.f7786a1.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.h4(this.f7782a, view);
            }
        });
    }

    static boolean r4(Context context) {
        return u4(context, R.attr.windowFullscreen);
    }

    private boolean s4() {
        return H1().getConfiguration().orientation == 2;
    }

    static boolean t4(Context context) {
        return u4(context, u8.b.L);
    }

    static boolean u4(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(j9.b.f(context, u8.b.f28562r, i.class.getCanonicalName()), new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    private void v4() {
        int iP4 = p4(x3());
        k4();
        i iVarK4 = i.k4(null, iP4, this.K0, null);
        this.L0 = iVarK4;
        q qVarU3 = iVarK4;
        if (this.P0 == 1) {
            k4();
            qVarU3 = l.U3(null, iP4, this.K0);
        }
        this.J0 = qVarU3;
        x4();
        w4(n4());
        d0 d0VarO = j1().o();
        d0VarO.p(u8.f.f28666x, this.J0);
        d0VarO.j();
        this.J0.S3(new b());
    }

    private void x4() {
        this.Y0.setText((this.P0 == 1 && s4()) ? this.f7791f1 : this.f7790e1);
    }

    private void y4(CheckableImageButton checkableImageButton) {
        this.f7786a1.setContentDescription(this.P0 == 1 ? checkableImageButton.getContext().getString(u8.j.f28721w) : checkableImageButton.getContext().getString(u8.j.f28723y));
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.o
    public final void N2(Bundle bundle) {
        super.N2(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.I0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        a.b bVar = new a.b(this.K0);
        i iVar = this.L0;
        m mVarF4 = iVar == null ? null : iVar.f4();
        if (mVarF4 != null) {
            bVar.b(mVarF4.f7807f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.M0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.N0);
        bundle.putInt("INPUT_MODE_KEY", this.P0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.Q0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.R0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.S0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.T0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.U0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.V0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.W0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.X0);
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.o
    public void O2() {
        super.O2();
        Window window = d4().getWindow();
        if (this.O0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f7787b1);
            j4(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = H1().getDimensionPixelOffset(u8.d.f28594g0);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f7787b1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new d9.a(d4(), rect));
        }
        v4();
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.o
    public void P2() {
        this.J0.T3();
        super.P2();
    }

    @Override // androidx.fragment.app.n
    public final Dialog Z3(Bundle bundle) {
        Dialog dialog = new Dialog(x3(), p4(x3()));
        Context context = dialog.getContext();
        this.O0 = r4(context);
        int i10 = u8.b.f28562r;
        int i11 = u8.k.f28747w;
        this.f7787b1 = new m9.h(context, null, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, u8.l.Z2, i10, i11);
        int color = typedArrayObtainStyledAttributes.getColor(u8.l.f28755a3, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f7787b1.Q(context);
        this.f7787b1.c0(ColorStateList.valueOf(color));
        this.f7787b1.b0(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    public String n4() {
        k4();
        k1();
        throw null;
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.G0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.H0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) T1();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.o
    public final void r2(Bundle bundle) {
        super.r2(bundle);
        if (bundle == null) {
            bundle = i1();
        }
        this.I0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        android.support.v4.media.session.b.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.K0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        android.support.v4.media.session.b.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.M0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.N0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.P0 = bundle.getInt("INPUT_MODE_KEY");
        this.Q0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.R0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.S0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.T0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.U0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.V0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.W0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.X0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.N0;
        if (text == null) {
            text = x3().getResources().getText(this.M0);
        }
        this.f7790e1 = text;
        this.f7791f1 = l4(text);
    }

    @Override // androidx.fragment.app.o
    public final View v2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.O0 ? u8.h.A : u8.h.f28697z, viewGroup);
        Context context = viewInflate.getContext();
        if (this.O0) {
            viewInflate.findViewById(u8.f.f28666x).setLayoutParams(new LinearLayout.LayoutParams(o4(context), -2));
        } else {
            viewInflate.findViewById(u8.f.f28667y).setLayoutParams(new LinearLayout.LayoutParams(o4(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(u8.f.D);
        this.Z0 = textView;
        textView.setAccessibilityLiveRegion(1);
        this.f7786a1 = (CheckableImageButton) viewInflate.findViewById(u8.f.E);
        this.Y0 = (TextView) viewInflate.findViewById(u8.f.F);
        q4(context);
        this.f7788c1 = (Button) viewInflate.findViewById(u8.f.f28646d);
        k4();
        throw null;
    }

    void w4(String str) {
        this.Z0.setContentDescription(m4());
        this.Z0.setText(str);
    }
}
