package m9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import m9.l;
import m9.m;
import m9.n;

/* JADX INFO: loaded from: classes3.dex */
public class h extends Drawable implements e0.b, o {
    private static final String O = "h";
    static final l P = l.a().q(0, 0.0f).m();
    private static final Paint Q;
    private static final e[] R;
    private final m.b A;
    private final m B;
    private PorterDuffColorFilter C;
    private PorterDuffColorFilter D;
    private int E;
    private final RectF F;
    private boolean G;
    private boolean H;
    private l I;
    private t0.j J;
    t0.i[] K;
    private float[] L;
    private float[] M;
    private d N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l.c f21810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f21811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n.g[] f21812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n.g[] f21813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BitSet f21814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f21815f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21816g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Matrix f21817h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Path f21818r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Path f21819s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final RectF f21820t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final RectF f21821u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Region f21822v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Region f21823w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Paint f21824x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Paint f21825y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final l9.a f21826z;

    class a implements l.c {
        a() {
        }

        @Override // m9.l.c
        public m9.d a(m9.d dVar) {
            return dVar instanceof j ? dVar : new m9.b(-h.this.I(), dVar);
        }
    }

    class b implements m.b {
        b() {
        }

        @Override // m9.m.b
        public void a(n nVar, Matrix matrix, int i10) {
            h.this.f21814e.set(i10, nVar.e());
            h.this.f21812c[i10] = nVar.f(matrix);
        }

        @Override // m9.m.b
        public void b(n nVar, Matrix matrix, int i10) {
            h.this.f21814e.set(i10 + 4, nVar.e());
            h.this.f21813d[i10] = nVar.f(matrix);
        }
    }

    public interface d {
        void a(float f10);
    }

    private static class e extends t0.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21852b;

        e(int i10) {
            super("cornerSizeAtIndex" + i10);
            this.f21852b = i10;
        }

        @Override // t0.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(h hVar) {
            if (hVar.L != null) {
                return hVar.L[this.f21852b];
            }
            return 0.0f;
        }

        @Override // t0.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(h hVar, float f10) {
            if (hVar.L == null || hVar.L[this.f21852b] == f10) {
                return;
            }
            hVar.L[this.f21852b] = f10;
            if (hVar.N != null) {
                hVar.N.a(hVar.z());
            }
            hVar.invalidateSelf();
        }
    }

    static {
        int i10 = 0;
        Paint paint = new Paint(1);
        Q = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        R = new e[4];
        while (true) {
            e[] eVarArr = R;
            if (i10 >= eVarArr.length) {
                return;
            }
            eVarArr[i10] = new e(i10);
            i10++;
        }
    }

    public h() {
        this(new l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float I() {
        if (P()) {
            return this.f21825y.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean N() {
        c cVar = this.f21811b;
        int i10 = cVar.f21846r;
        if (i10 == 1 || cVar.f21847s <= 0) {
            return false;
        }
        return i10 == 2 || X();
    }

    private boolean O() {
        Paint.Style style = this.f21811b.f21851w;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean P() {
        Paint.Style style = this.f21811b.f21851w;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f21825y.getStrokeWidth() > 0.0f;
    }

    private void R() {
        super.invalidateSelf();
    }

    private void U(Canvas canvas) {
        if (N()) {
            canvas.save();
            W(canvas);
            if (!this.G) {
                s(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.F.width() - getBounds().width());
            int iHeight = (int) (this.F.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.F.width()) + (this.f21811b.f21847s * 2) + iWidth, ((int) this.F.height()) + (this.f21811b.f21847s * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f10 = (getBounds().left - this.f21811b.f21847s) - iWidth;
            float f11 = (getBounds().top - this.f21811b.f21847s) - iHeight;
            canvas2.translate(-f10, -f11);
            s(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f10, f11, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    private static int V(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    private void W(Canvas canvas) {
        canvas.translate(F(), G());
    }

    private PorterDuffColorFilter j(Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int iQ = q(color);
        this.E = iQ;
        if (iQ != color) {
            return new PorterDuffColorFilter(iQ, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void k(RectF rectF, Path path) {
        l(rectF, path);
        if (this.f21811b.f21839k != 1.0f) {
            this.f21817h.reset();
            Matrix matrix = this.f21817h;
            float f10 = this.f21811b.f21839k;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f21817h);
        }
        path.computeBounds(this.F, true);
    }

    private float m(RectF rectF, l lVar, float[] fArr) {
        if (fArr == null) {
            if (lVar.v(rectF)) {
                return lVar.r().a(rectF);
            }
            return -1.0f;
        }
        if (g9.a.a(fArr) && lVar.u()) {
            return fArr[0];
        }
        return -1.0f;
    }

    private boolean m0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f21811b.f21833e == null || color2 == (colorForState2 = this.f21811b.f21833e.getColorForState(iArr, (color2 = this.f21824x.getColor())))) {
            z10 = false;
        } else {
            this.f21824x.setColor(colorForState2);
            z10 = true;
        }
        if (this.f21811b.f21834f == null || color == (colorForState = this.f21811b.f21834f.getColorForState(iArr, (color = this.f21825y.getColor())))) {
            return z10;
        }
        this.f21825y.setColor(colorForState);
        return true;
    }

    private void n() {
        p0();
        this.B.f(this.I, this.M, this.f21811b.f21840l, y(), null, this.f21819s);
    }

    private void n0(int[] iArr) {
        o0(iArr, false);
    }

    private PorterDuffColorFilter o(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = q(colorForState);
        }
        this.E = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private void o0(int[] iArr, boolean z10) {
        RectF rectFX = x();
        if (this.f21811b.f21830b == null || rectFX.isEmpty()) {
            return;
        }
        boolean z11 = z10 | (this.J == null);
        if (this.L == null) {
            this.L = new float[4];
        }
        l lVarD = this.f21811b.f21830b.d(iArr);
        for (int i10 = 0; i10 < 4; i10++) {
            float fA = this.B.h(i10, lVarD).a(rectFX);
            if (z11) {
                this.L[i10] = fA;
            }
            t0.i iVar = this.K[i10];
            if (iVar != null) {
                iVar.t(fA);
                if (z11) {
                    this.K[i10].y();
                }
            }
        }
        if (z11) {
            invalidateSelf();
        }
    }

    private PorterDuffColorFilter p(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? j(paint, z10) : o(colorStateList, mode, z10);
    }

    private void p0() {
        this.I = H().z(this.f21810a);
        float[] fArr = this.L;
        if (fArr == null) {
            this.M = null;
            return;
        }
        if (this.M == null) {
            this.M = new float[fArr.length];
        }
        float fI = I();
        int i10 = 0;
        while (true) {
            float[] fArr2 = this.L;
            if (i10 >= fArr2.length) {
                return;
            }
            this.M[i10] = Math.max(0.0f, fArr2[i10] - fI);
            i10++;
        }
    }

    private boolean q0() {
        PorterDuffColorFilter porterDuffColorFilter = this.C;
        PorterDuffColorFilter porterDuffColorFilter2 = this.D;
        c cVar = this.f21811b;
        this.C = p(cVar.f21836h, cVar.f21837i, this.f21824x, true);
        c cVar2 = this.f21811b;
        this.D = p(cVar2.f21835g, cVar2.f21837i, this.f21825y, false);
        c cVar3 = this.f21811b;
        if (cVar3.f21850v) {
            this.f21826z.d(cVar3.f21836h.getColorForState(getState(), 0));
        }
        return (l0.b.a(porterDuffColorFilter, this.C) && l0.b.a(porterDuffColorFilter2, this.D)) ? false : true;
    }

    public static h r(Context context, float f10, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(c9.a.c(context, u8.b.f28552h, h.class.getSimpleName()));
        }
        h hVar = new h();
        hVar.Q(context);
        hVar.c0(colorStateList);
        hVar.b0(f10);
        return hVar;
    }

    private void r0() {
        float fM = M();
        this.f21811b.f21847s = (int) Math.ceil(0.75f * fM);
        this.f21811b.f21848t = (int) Math.ceil(fM * 0.25f);
        q0();
        R();
    }

    private void s(Canvas canvas) {
        if (this.f21814e.cardinality() > 0) {
            Log.w(O, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f21811b.f21848t != 0) {
            canvas.drawPath(this.f21818r, this.f21826z.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f21812c[i10].b(this.f21826z, this.f21811b.f21847s, canvas);
            this.f21813d[i10].b(this.f21826z, this.f21811b.f21847s, canvas);
        }
        if (this.G) {
            int iF = F();
            int iG = G();
            canvas.translate(-iF, -iG);
            canvas.drawPath(this.f21818r, Q);
            canvas.translate(iF, iG);
        }
    }

    private void t(Canvas canvas) {
        v(canvas, this.f21824x, this.f21818r, this.f21811b.f21829a, this.L, x());
    }

    private void v(Canvas canvas, Paint paint, Path path, l lVar, float[] fArr, RectF rectF) {
        float fM = m(rectF, lVar, fArr);
        if (fM < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f10 = fM * this.f21811b.f21840l;
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    private RectF y() {
        this.f21821u.set(x());
        float fI = I();
        this.f21821u.inset(fI, fI);
        return this.f21821u;
    }

    public float A() {
        return this.f21811b.f21844p;
    }

    public ColorStateList B() {
        return this.f21811b.f21833e;
    }

    public float C() {
        return this.f21811b.f21840l;
    }

    public float D() {
        return this.f21811b.f21843o;
    }

    public int E() {
        return this.E;
    }

    public int F() {
        return (int) (((double) this.f21811b.f21848t) * Math.sin(Math.toRadians(r0.f21849u)));
    }

    public int G() {
        return (int) (((double) this.f21811b.f21848t) * Math.cos(Math.toRadians(r0.f21849u)));
    }

    public l H() {
        return this.f21811b.f21829a;
    }

    public float J() {
        float[] fArr = this.L;
        return fArr != null ? fArr[3] : this.f21811b.f21829a.r().a(x());
    }

    public float K() {
        float[] fArr = this.L;
        return fArr != null ? fArr[0] : this.f21811b.f21829a.t().a(x());
    }

    public float L() {
        return this.f21811b.f21845q;
    }

    public float M() {
        return A() + L();
    }

    public void Q(Context context) {
        this.f21811b.f21831c = new e9.a(context);
        r0();
    }

    public boolean S() {
        e9.a aVar = this.f21811b.f21831c;
        return aVar != null && aVar.d();
    }

    public boolean T() {
        if (this.f21811b.f21829a.v(x())) {
            return true;
        }
        float[] fArr = this.L;
        return fArr != null && g9.a.a(fArr) && this.f21811b.f21829a.u();
    }

    public boolean X() {
        return (T() || this.f21818r.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void Y(float f10) {
        setShapeAppearanceModel(this.f21811b.f21829a.x(f10));
    }

    public void Z(m9.d dVar) {
        setShapeAppearanceModel(this.f21811b.f21829a.y(dVar));
    }

    public void a0(t0.j jVar) {
        if (this.J == jVar) {
            return;
        }
        this.J = jVar;
        int i10 = 0;
        while (true) {
            t0.i[] iVarArr = this.K;
            if (i10 >= iVarArr.length) {
                o0(getState(), true);
                invalidateSelf();
                return;
            } else {
                if (iVarArr[i10] == null) {
                    iVarArr[i10] = new t0.i(this, R[i10]);
                }
                this.K[i10].x(new t0.j().f(jVar.a()).h(jVar.c()));
                i10++;
            }
        }
    }

    public void b0(float f10) {
        c cVar = this.f21811b;
        if (cVar.f21844p != f10) {
            cVar.f21844p = f10;
            r0();
        }
    }

    public void c0(ColorStateList colorStateList) {
        c cVar = this.f21811b;
        if (cVar.f21833e != colorStateList) {
            cVar.f21833e = colorStateList;
            onStateChange(getState());
        }
    }

    public void d0(float f10) {
        c cVar = this.f21811b;
        if (cVar.f21840l != f10) {
            cVar.f21840l = f10;
            this.f21815f = true;
            this.f21816g = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f21824x.setColorFilter(this.C);
        int alpha = this.f21824x.getAlpha();
        this.f21824x.setAlpha(V(alpha, this.f21811b.f21842n));
        this.f21825y.setColorFilter(this.D);
        this.f21825y.setStrokeWidth(this.f21811b.f21841m);
        int alpha2 = this.f21825y.getAlpha();
        this.f21825y.setAlpha(V(alpha2, this.f21811b.f21842n));
        if (O()) {
            if (this.f21815f) {
                k(x(), this.f21818r);
                this.f21815f = false;
            }
            U(canvas);
            t(canvas);
        }
        if (P()) {
            if (this.f21816g) {
                n();
                this.f21816g = false;
            }
            w(canvas);
        }
        this.f21824x.setAlpha(alpha);
        this.f21825y.setAlpha(alpha2);
    }

    public void e0(d dVar) {
        this.N = dVar;
    }

    public void f0(int i10, int i11, int i12, int i13) {
        c cVar = this.f21811b;
        if (cVar.f21838j == null) {
            cVar.f21838j = new Rect();
        }
        this.f21811b.f21838j.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public void g0(float f10) {
        c cVar = this.f21811b;
        if (cVar.f21843o != f10) {
            cVar.f21843o = f10;
            r0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f21811b.f21842n;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f21811b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f21811b.f21846r == 2) {
            return;
        }
        RectF rectFX = x();
        if (rectFX.isEmpty()) {
            return;
        }
        float fM = m(rectFX, this.f21811b.f21829a, this.L);
        if (fM >= 0.0f) {
            outline.setRoundRect(getBounds(), fM * this.f21811b.f21840l);
            return;
        }
        if (this.f21815f) {
            k(rectFX, this.f21818r);
            this.f21815f = false;
        }
        com.google.android.material.drawable.c.j(outline, this.f21818r);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f21811b.f21838j;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f21822v.set(getBounds());
        k(x(), this.f21818r);
        this.f21823w.setPath(this.f21818r, this.f21822v);
        this.f21822v.op(this.f21823w, Region.Op.DIFFERENCE);
        return this.f21822v;
    }

    public void h0(q qVar) {
        c cVar = this.f21811b;
        if (cVar.f21830b != qVar) {
            cVar.f21830b = qVar;
            o0(getState(), true);
            invalidateSelf();
        }
    }

    public void i0(float f10, int i10) {
        l0(f10);
        k0(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f21815f = true;
        this.f21816g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f21811b.f21836h;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f21811b.f21835g;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f21811b.f21834f;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f21811b.f21833e;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        q qVar = this.f21811b.f21830b;
        return qVar != null && qVar.f();
    }

    public void j0(float f10, ColorStateList colorStateList) {
        l0(f10);
        k0(colorStateList);
    }

    public void k0(ColorStateList colorStateList) {
        c cVar = this.f21811b;
        if (cVar.f21834f != colorStateList) {
            cVar.f21834f = colorStateList;
            onStateChange(getState());
        }
    }

    protected final void l(RectF rectF, Path path) {
        m mVar = this.B;
        c cVar = this.f21811b;
        mVar.f(cVar.f21829a, this.L, cVar.f21840l, rectF, this.A, path);
    }

    public void l0(float f10) {
        this.f21811b.f21841m = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f21811b = new c(this.f21811b);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f21815f = true;
        this.f21816g = true;
        super.onBoundsChange(rect);
        if (this.f21811b.f21830b != null && !rect.isEmpty()) {
            o0(getState(), this.H);
        }
        this.H = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.j.b
    protected boolean onStateChange(int[] iArr) {
        if (this.f21811b.f21830b != null) {
            n0(iArr);
        }
        boolean z10 = m0(iArr) || q0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    protected int q(int i10) {
        float fM = M() + D();
        e9.a aVar = this.f21811b.f21831c;
        return aVar != null ? aVar.c(i10, fM) : i10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f21811b;
        if (cVar.f21842n != i10) {
            cVar.f21842n = i10;
            R();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f21811b.f21832d = colorFilter;
        R();
    }

    @Override // m9.o
    public void setShapeAppearanceModel(l lVar) {
        c cVar = this.f21811b;
        cVar.f21829a = lVar;
        cVar.f21830b = null;
        this.L = null;
        this.M = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f21811b.f21836h = colorStateList;
        q0();
        R();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f21811b;
        if (cVar.f21837i != mode) {
            cVar.f21837i = mode;
            q0();
            R();
        }
    }

    protected void u(Canvas canvas, Paint paint, Path path, RectF rectF) {
        v(canvas, paint, path, this.f21811b.f21829a, this.L, rectF);
    }

    protected void w(Canvas canvas) {
        v(canvas, this.f21825y, this.f21819s, this.I, this.M, y());
    }

    protected RectF x() {
        this.f21820t.set(getBounds());
        return this.f21820t;
    }

    public float z() {
        float fA;
        float fA2;
        float[] fArr = this.L;
        if (fArr != null) {
            fA = (fArr[3] + fArr[2]) - fArr[1];
            fA2 = fArr[0];
        } else {
            RectF rectFX = x();
            fA = (this.B.h(3, H()).a(rectFX) + this.B.h(2, H()).a(rectFX)) - this.B.h(1, H()).a(rectFX);
            fA2 = this.B.h(0, H()).a(rectFX);
        }
        return (fA - fA2) / 2.0f;
    }

    public h(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(l.e(context, attributeSet, i10, i11).m());
    }

    public h(l lVar) {
        this(new c(lVar, null));
    }

    protected h(c cVar) {
        m mVar;
        this.f21810a = new a();
        this.f21812c = new n.g[4];
        this.f21813d = new n.g[4];
        this.f21814e = new BitSet(8);
        this.f21817h = new Matrix();
        this.f21818r = new Path();
        this.f21819s = new Path();
        this.f21820t = new RectF();
        this.f21821u = new RectF();
        this.f21822v = new Region();
        this.f21823w = new Region();
        Paint paint = new Paint(1);
        this.f21824x = paint;
        Paint paint2 = new Paint(1);
        this.f21825y = paint2;
        this.f21826z = new l9.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = m.l();
        } else {
            mVar = new m();
        }
        this.B = mVar;
        this.F = new RectF();
        this.G = true;
        this.H = true;
        this.K = new t0.i[4];
        this.f21811b = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        q0();
        m0(getState());
        this.A = new b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        l f21829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        q f21830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e9.a f21831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ColorFilter f21832d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ColorStateList f21833e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ColorStateList f21834f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ColorStateList f21835g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ColorStateList f21836h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        PorterDuff.Mode f21837i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Rect f21838j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f21839k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f21840l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f21841m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f21842n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float f21843o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f21844p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        float f21845q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f21846r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f21847s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f21848t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f21849u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f21850v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Paint.Style f21851w;

        public c(l lVar, e9.a aVar) {
            this.f21833e = null;
            this.f21834f = null;
            this.f21835g = null;
            this.f21836h = null;
            this.f21837i = PorterDuff.Mode.SRC_IN;
            this.f21838j = null;
            this.f21839k = 1.0f;
            this.f21840l = 1.0f;
            this.f21842n = 255;
            this.f21843o = 0.0f;
            this.f21844p = 0.0f;
            this.f21845q = 0.0f;
            this.f21846r = 0;
            this.f21847s = 0;
            this.f21848t = 0;
            this.f21849u = 0;
            this.f21850v = false;
            this.f21851w = Paint.Style.FILL_AND_STROKE;
            this.f21829a = lVar;
            this.f21831c = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVar = new h(this);
            hVar.f21815f = true;
            hVar.f21816g = true;
            return hVar;
        }

        public c(c cVar) {
            this.f21833e = null;
            this.f21834f = null;
            this.f21835g = null;
            this.f21836h = null;
            this.f21837i = PorterDuff.Mode.SRC_IN;
            this.f21838j = null;
            this.f21839k = 1.0f;
            this.f21840l = 1.0f;
            this.f21842n = 255;
            this.f21843o = 0.0f;
            this.f21844p = 0.0f;
            this.f21845q = 0.0f;
            this.f21846r = 0;
            this.f21847s = 0;
            this.f21848t = 0;
            this.f21849u = 0;
            this.f21850v = false;
            this.f21851w = Paint.Style.FILL_AND_STROKE;
            this.f21829a = cVar.f21829a;
            this.f21830b = cVar.f21830b;
            this.f21831c = cVar.f21831c;
            this.f21841m = cVar.f21841m;
            this.f21832d = cVar.f21832d;
            this.f21833e = cVar.f21833e;
            this.f21834f = cVar.f21834f;
            this.f21837i = cVar.f21837i;
            this.f21836h = cVar.f21836h;
            this.f21842n = cVar.f21842n;
            this.f21839k = cVar.f21839k;
            this.f21848t = cVar.f21848t;
            this.f21846r = cVar.f21846r;
            this.f21850v = cVar.f21850v;
            this.f21840l = cVar.f21840l;
            this.f21843o = cVar.f21843o;
            this.f21844p = cVar.f21844p;
            this.f21845q = cVar.f21845q;
            this.f21847s = cVar.f21847s;
            this.f21849u = cVar.f21849u;
            this.f21835g = cVar.f21835g;
            this.f21851w = cVar.f21851w;
            if (cVar.f21838j != null) {
                this.f21838j = new Rect(cVar.f21838j);
            }
        }
    }
}
