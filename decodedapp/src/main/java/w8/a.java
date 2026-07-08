package w8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.internal.j;
import com.google.android.material.internal.m;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import m9.h;
import m9.l;
import u8.k;
import w8.c;

/* JADX INFO: loaded from: classes3.dex */
public class a extends Drawable implements j.b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f31327w = k.f28738n;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f31328x = u8.b.f28544b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f31329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f31330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f31331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f31332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f31333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f31334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f31335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f31336h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f31337r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f31338s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f31339t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private WeakReference f31340u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private WeakReference f31341v;

    private a(Context context, int i10, int i11, int i12, c.a aVar) {
        this.f31329a = new WeakReference(context);
        m.c(context);
        this.f31332d = new Rect();
        j jVar = new j(this);
        this.f31331c = jVar;
        jVar.g().setTextAlign(Paint.Align.CENTER);
        c cVar = new c(context, i10, i11, i12, aVar);
        this.f31333e = cVar;
        this.f31330b = new h(l.b(context, B() ? cVar.m() : cVar.i(), B() ? cVar.l() : cVar.h()).m());
        N();
    }

    private int A() {
        int iC = this.f31333e.C();
        if (B()) {
            iC = this.f31333e.B();
            Context context = (Context) this.f31329a.get();
            if (context != null) {
                iC = v8.a.c(iC, iC - this.f31333e.t(), v8.a.b(0.0f, 1.0f, 0.3f, 1.0f, j9.c.f(context) - 1.0f));
            }
        }
        if (this.f31333e.f31352k == 0) {
            iC -= Math.round(this.f31339t);
        }
        return iC + this.f31333e.c();
    }

    private boolean B() {
        return D() || C();
    }

    private void E() {
        this.f31331c.g().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void F() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f31333e.e());
        if (this.f31330b.B() != colorStateListValueOf) {
            this.f31330b.c0(colorStateListValueOf);
            invalidateSelf();
        }
    }

    private void G() {
        this.f31331c.l(true);
        I();
        R();
        invalidateSelf();
    }

    private void H() {
        WeakReference weakReference = this.f31340u;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f31340u.get();
        WeakReference weakReference2 = this.f31341v;
        Q(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
    }

    private void I() {
        Context context = (Context) this.f31329a.get();
        if (context == null) {
            return;
        }
        this.f31330b.setShapeAppearanceModel(l.b(context, B() ? this.f31333e.m() : this.f31333e.i(), B() ? this.f31333e.l() : this.f31333e.h()).m());
        invalidateSelf();
    }

    private void J() {
        j9.d dVar;
        Context context = (Context) this.f31329a.get();
        if (context == null || this.f31331c.e() == (dVar = new j9.d(context, this.f31333e.A()))) {
            return;
        }
        this.f31331c.k(dVar, context);
        K();
        R();
        invalidateSelf();
    }

    private void K() {
        this.f31331c.g().setColor(this.f31333e.j());
        invalidateSelf();
    }

    private void L() {
        S();
        this.f31331c.l(true);
        R();
        invalidateSelf();
    }

    private void M() {
        setVisible(this.f31333e.G(), false);
    }

    private void N() {
        I();
        J();
        L();
        G();
        E();
        F();
        K();
        H();
        R();
        M();
    }

    private static void P(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void R() {
        Context context = (Context) this.f31329a.get();
        WeakReference weakReference = this.f31340u;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f31332d);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference weakReference2 = this.f31341v;
        ViewGroup viewGroup = weakReference2 != null ? (ViewGroup) weakReference2.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        d(rect2, view);
        d.g(this.f31332d, this.f31334f, this.f31335g, this.f31338s, this.f31339t);
        float f10 = this.f31337r;
        if (f10 != -1.0f) {
            this.f31330b.Y(f10);
        }
        if (rect.equals(this.f31332d)) {
            return;
        }
        this.f31330b.setBounds(this.f31332d);
    }

    private void S() {
        if (o() != -2) {
            this.f31336h = ((int) Math.pow(10.0d, ((double) o()) - 1.0d)) - 1;
        } else {
            this.f31336h = p();
        }
    }

    private void b(View view) {
        ViewParent viewParentK = k();
        if (viewParentK == null) {
            viewParentK = view.getParent();
        }
        if ((viewParentK instanceof View) && (viewParentK.getParent() instanceof View)) {
            c(view, (View) viewParentK.getParent());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c(View view, View view2) {
        float y10;
        float x10;
        ViewParent parent;
        boolean z10;
        FrameLayout frameLayoutK = k();
        if (frameLayoutK == null) {
            float y11 = view.getY();
            x10 = view.getX();
            parent = view.getParent();
            y10 = y11;
        } else {
            y10 = 0.0f;
            x10 = 0.0f;
            parent = frameLayoutK;
        }
        while (true) {
            z10 = parent instanceof View;
            if (!z10 || parent == view2) {
                break;
            }
            ViewParent parent2 = parent.getParent();
            if (!(parent2 instanceof ViewGroup) || ((ViewGroup) parent2).getClipChildren()) {
                break;
            }
            View view3 = (View) parent;
            y10 += view3.getY();
            x10 += view3.getX();
            parent = parent.getParent();
        }
        if (z10) {
            float fY = y(y10);
            float fN = n(x10);
            View view4 = (View) parent;
            float fI = i(view4.getHeight(), y10);
            float fT = t(view4.getWidth(), x10);
            if (fY < 0.0f) {
                this.f31335g += Math.abs(fY);
            }
            if (fN < 0.0f) {
                this.f31334f += Math.abs(fN);
            }
            if (fI > 0.0f) {
                this.f31335g -= Math.abs(fI);
            }
            if (fT > 0.0f) {
                this.f31334f -= Math.abs(fT);
            }
        }
    }

    private void d(Rect rect, View view) {
        float f10 = B() ? this.f31333e.f31345d : this.f31333e.f31344c;
        this.f31337r = f10;
        if (f10 != -1.0f) {
            this.f31338s = f10;
            this.f31339t = f10;
        } else {
            this.f31338s = Math.round((B() ? this.f31333e.f31348g : this.f31333e.f31346e) / 2.0f);
            this.f31339t = Math.round((B() ? this.f31333e.f31349h : this.f31333e.f31347f) / 2.0f);
        }
        if (B()) {
            String strH = h();
            this.f31338s = Math.max(this.f31338s, (this.f31331c.h(strH) / 2.0f) + this.f31333e.g());
            float fMax = Math.max(this.f31339t, (this.f31331c.f(strH) / 2.0f) + this.f31333e.k());
            this.f31339t = fMax;
            this.f31338s = Math.max(this.f31338s, fMax);
        }
        int iA = A();
        int iF = this.f31333e.f();
        if (iF == 8388691 || iF == 8388693) {
            this.f31335g = rect.bottom - iA;
        } else {
            this.f31335g = rect.top + iA;
        }
        int iZ = z();
        int iF2 = this.f31333e.f();
        if (iF2 == 8388659 || iF2 == 8388691) {
            this.f31334f = this.f31333e.f31353l == 0 ? view.getLayoutDirection() == 0 ? (rect.left + this.f31338s) - ((this.f31339t * 2.0f) - iZ) : (rect.right - this.f31338s) + ((this.f31339t * 2.0f) - iZ) : view.getLayoutDirection() == 0 ? (rect.left - this.f31338s) + iZ : (rect.right + this.f31338s) - iZ;
        } else {
            this.f31334f = this.f31333e.f31353l == 0 ? view.getLayoutDirection() == 0 ? (rect.right + this.f31338s) - iZ : (rect.left - this.f31338s) + iZ : view.getLayoutDirection() == 0 ? (rect.right - this.f31338s) + ((this.f31339t * 2.0f) - iZ) : (rect.left + this.f31338s) - ((this.f31339t * 2.0f) - iZ);
        }
        if (this.f31333e.F()) {
            b(view);
        } else {
            c(view, null);
        }
    }

    public static a e(Context context) {
        return new a(context, 0, f31328x, f31327w, null);
    }

    static a f(Context context, c.a aVar) {
        return new a(context, 0, f31328x, f31327w, aVar);
    }

    private void g(Canvas canvas) {
        String strH = h();
        if (strH != null) {
            Rect rect = new Rect();
            this.f31331c.g().getTextBounds(strH, 0, strH.length(), rect);
            float fExactCenterY = this.f31335g - rect.exactCenterY();
            canvas.drawText(strH, this.f31334f, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), this.f31331c.g());
        }
    }

    private String h() {
        if (D()) {
            return w();
        }
        if (C()) {
            return r();
        }
        return null;
    }

    private float i(float f10, float f11) {
        return ((this.f31335g + this.f31339t) - f10) + f11;
    }

    private CharSequence l() {
        return this.f31333e.p();
    }

    private float n(float f10) {
        return (this.f31334f - this.f31338s) + f10;
    }

    private String r() {
        if (this.f31336h == -2 || q() <= this.f31336h) {
            return NumberFormat.getInstance(this.f31333e.x()).format(q());
        }
        Context context = (Context) this.f31329a.get();
        return context == null ? "" : String.format(this.f31333e.x(), context.getString(u8.j.f28714p), Integer.valueOf(this.f31336h), "+");
    }

    private String s() {
        Context context;
        if (this.f31333e.q() == 0 || (context = (Context) this.f31329a.get()) == null) {
            return null;
        }
        return (this.f31336h == -2 || q() <= this.f31336h) ? context.getResources().getQuantityString(this.f31333e.q(), q(), Integer.valueOf(q())) : context.getString(this.f31333e.n(), Integer.valueOf(this.f31336h));
    }

    private float t(float f10, float f11) {
        return ((this.f31334f + this.f31338s) - f10) + f11;
    }

    private String w() {
        String strV = v();
        int iO = o();
        if (iO == -2 || strV == null || strV.length() <= iO) {
            return strV;
        }
        Context context = (Context) this.f31329a.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(u8.j.f28707i), strV.substring(0, iO - 1), "…");
    }

    private CharSequence x() {
        CharSequence charSequenceO = this.f31333e.o();
        return charSequenceO != null ? charSequenceO : v();
    }

    private float y(float f10) {
        return (this.f31335g - this.f31339t) + f10;
    }

    private int z() {
        int iR = B() ? this.f31333e.r() : this.f31333e.s();
        if (this.f31333e.f31352k == 1) {
            iR += B() ? this.f31333e.f31351j : this.f31333e.f31350i;
        }
        return iR + this.f31333e.b();
    }

    public boolean C() {
        return !this.f31333e.E() && this.f31333e.D();
    }

    public boolean D() {
        return this.f31333e.E();
    }

    public void O(int i10) {
        c cVar = this.f31333e;
        if (cVar.f31353l != i10) {
            cVar.f31353l = i10;
            R();
        }
    }

    public void Q(View view, FrameLayout frameLayout) {
        this.f31340u = new WeakReference(view);
        this.f31341v = new WeakReference(frameLayout);
        P(view);
        R();
        invalidateSelf();
    }

    @Override // com.google.android.material.internal.j.b
    public void a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f31330b.draw(canvas);
        if (B()) {
            g(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f31333e.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f31332d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f31332d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public CharSequence j() {
        if (isVisible()) {
            return D() ? x() : C() ? s() : l();
        }
        return null;
    }

    public FrameLayout k() {
        WeakReference weakReference = this.f31341v;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public int m() {
        return this.f31333e.s();
    }

    public int o() {
        return this.f31333e.u();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.j.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public int p() {
        return this.f31333e.v();
    }

    public int q() {
        if (this.f31333e.D()) {
            return this.f31333e.w();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f31333e.I(i10);
        E();
    }

    c.a u() {
        return this.f31333e.y();
    }

    public String v() {
        return this.f31333e.z();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
