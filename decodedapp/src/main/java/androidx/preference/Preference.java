package androidx.preference;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActivityChooserView;
import c0.n;
import i1.c;
import i1.e;
import i1.g;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private int H;
    private int I;
    private List J;
    private b K;
    private final View.OnClickListener L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f2762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f2763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f2765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Intent f2766h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f2767r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f2768s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f2769t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f2770u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f2771v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Object f2772w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f2773x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f2774y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f2775z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.E(view);
        }
    }

    public interface b {
        CharSequence a(Preference preference);
    }

    public Preference(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2760b = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f2761c = 0;
        this.f2768s = true;
        this.f2769t = true;
        this.f2770u = true;
        this.f2773x = true;
        this.f2774y = true;
        this.f2775z = true;
        this.A = true;
        this.B = true;
        this.D = true;
        this.G = true;
        int i12 = e.f15676a;
        this.H = i12;
        this.L = new a();
        this.f2759a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.I, i10, i11);
        this.f2764f = n.n(typedArrayObtainStyledAttributes, g.f15696g0, g.J, 0);
        this.f2765g = n.o(typedArrayObtainStyledAttributes, g.f15702j0, g.P);
        this.f2762d = n.p(typedArrayObtainStyledAttributes, g.f15718r0, g.N);
        this.f2763e = n.p(typedArrayObtainStyledAttributes, g.f15716q0, g.Q);
        this.f2760b = n.d(typedArrayObtainStyledAttributes, g.f15706l0, g.R, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        this.f2767r = n.o(typedArrayObtainStyledAttributes, g.f15694f0, g.W);
        this.H = n.n(typedArrayObtainStyledAttributes, g.f15704k0, g.M, i12);
        this.I = n.n(typedArrayObtainStyledAttributes, g.f15720s0, g.S, 0);
        this.f2768s = n.b(typedArrayObtainStyledAttributes, g.f15691e0, g.L, true);
        this.f2769t = n.b(typedArrayObtainStyledAttributes, g.f15710n0, g.O, true);
        this.f2770u = n.b(typedArrayObtainStyledAttributes, g.f15708m0, g.K, true);
        this.f2771v = n.o(typedArrayObtainStyledAttributes, g.f15685c0, g.T);
        int i13 = g.Z;
        this.A = n.b(typedArrayObtainStyledAttributes, i13, i13, this.f2769t);
        int i14 = g.f15679a0;
        this.B = n.b(typedArrayObtainStyledAttributes, i14, i14, this.f2769t);
        int i15 = g.f15682b0;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            this.f2772w = B(typedArrayObtainStyledAttributes, i15);
        } else {
            int i16 = g.U;
            if (typedArrayObtainStyledAttributes.hasValue(i16)) {
                this.f2772w = B(typedArrayObtainStyledAttributes, i16);
            }
        }
        this.G = n.b(typedArrayObtainStyledAttributes, g.f15712o0, g.V, true);
        int i17 = g.f15714p0;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i17);
        this.C = zHasValue;
        if (zHasValue) {
            this.D = n.b(typedArrayObtainStyledAttributes, i17, g.X, true);
        }
        this.E = n.b(typedArrayObtainStyledAttributes, g.f15698h0, g.Y, false);
        int i18 = g.f15700i0;
        this.f2775z = n.b(typedArrayObtainStyledAttributes, i18, i18, true);
        int i19 = g.f15688d0;
        this.F = n.b(typedArrayObtainStyledAttributes, i19, i19, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void A(Preference preference, boolean z10) {
        if (this.f2773x == z10) {
            this.f2773x = !z10;
            x(J());
            w();
        }
    }

    protected Object B(TypedArray typedArray, int i10) {
        return null;
    }

    public void C(Preference preference, boolean z10) {
        if (this.f2774y == z10) {
            this.f2774y = !z10;
            x(J());
            w();
        }
    }

    public void D() {
        if (u() && v()) {
            y();
            m();
            if (this.f2766h != null) {
                e().startActivity(this.f2766h);
            }
        }
    }

    protected void E(View view) {
        D();
    }

    protected boolean F(boolean z10) {
        if (!K()) {
            return false;
        }
        if (z10 == i(!z10)) {
            return true;
        }
        l();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    protected boolean G(int i10) {
        if (!K()) {
            return false;
        }
        if (i10 == j(~i10)) {
            return true;
        }
        l();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    protected boolean H(String str) {
        if (!K()) {
            return false;
        }
        Object obj = null;
        if (TextUtils.equals(str, k(null))) {
            return true;
        }
        l();
        obj.getClass();
        throw null;
    }

    public final void I(b bVar) {
        this.K = bVar;
        w();
    }

    public boolean J() {
        return !u();
    }

    protected boolean K() {
        return false;
    }

    public boolean a(Object obj) {
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i10 = this.f2760b;
        int i11 = preference.f2760b;
        if (i10 != i11) {
            return i10 - i11;
        }
        CharSequence charSequence = this.f2762d;
        CharSequence charSequence2 = preference.f2762d;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f2762d.toString());
    }

    public Context e() {
        return this.f2759a;
    }

    StringBuilder f() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence charSequenceR = r();
        if (!TextUtils.isEmpty(charSequenceR)) {
            sb2.append(charSequenceR);
            sb2.append(' ');
        }
        CharSequence charSequenceN = n();
        if (!TextUtils.isEmpty(charSequenceN)) {
            sb2.append(charSequenceN);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2;
    }

    public String g() {
        return this.f2767r;
    }

    public Intent h() {
        return this.f2766h;
    }

    protected boolean i(boolean z10) {
        if (!K()) {
            return z10;
        }
        l();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    protected int j(int i10) {
        if (!K()) {
            return i10;
        }
        l();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    protected String k(String str) {
        if (!K()) {
            return str;
        }
        l();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public i1.a l() {
        return null;
    }

    public i1.b m() {
        return null;
    }

    public CharSequence n() {
        return q() != null ? q().a(this) : this.f2763e;
    }

    public final b q() {
        return this.K;
    }

    public CharSequence r() {
        return this.f2762d;
    }

    public boolean s() {
        return !TextUtils.isEmpty(this.f2765g);
    }

    public String toString() {
        return f().toString();
    }

    public boolean u() {
        return this.f2768s && this.f2773x && this.f2774y;
    }

    public boolean v() {
        return this.f2769t;
    }

    protected void w() {
    }

    public void x(boolean z10) {
        List list = this.J;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Preference) list.get(i10)).A(this, z10);
        }
    }

    protected void y() {
    }

    public Preference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n.a(context, c.f15671g, R.attr.preferenceStyle));
    }
}
