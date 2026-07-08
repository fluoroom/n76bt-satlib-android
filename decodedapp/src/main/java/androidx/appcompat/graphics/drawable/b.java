package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f1032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Rect f1033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f1034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f1035d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1037f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1039h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Runnable f1040r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f1041s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f1042t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private c f1043u;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1036e = 255;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1038g = -1;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.graphics.drawable.b$b, reason: collision with other inner class name */
    private static class C0019b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    static class c implements Drawable.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable.Callback f1045a;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f1045a;
            this.f1045a = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f1045a = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f1045a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f1045a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    static abstract class d extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b f1046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Resources f1047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1049d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1050e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        SparseArray f1051f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Drawable[] f1052g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f1053h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f1054i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f1055j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Rect f1056k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f1057l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f1058m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f1059n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f1060o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f1061p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f1062q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f1063r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f1064s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f1065t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f1066u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f1067v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        boolean f1068w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        boolean f1069x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        boolean f1070y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f1071z;

        d(d dVar, b bVar, Resources resources) {
            this.f1054i = false;
            this.f1057l = false;
            this.f1069x = true;
            this.A = 0;
            this.B = 0;
            this.f1046a = bVar;
            this.f1047b = resources != null ? resources : dVar != null ? dVar.f1047b : null;
            int iF = b.f(resources, dVar != null ? dVar.f1048c : 0);
            this.f1048c = iF;
            if (dVar == null) {
                this.f1052g = new Drawable[10];
                this.f1053h = 0;
                return;
            }
            this.f1049d = dVar.f1049d;
            this.f1050e = dVar.f1050e;
            this.f1067v = true;
            this.f1068w = true;
            this.f1054i = dVar.f1054i;
            this.f1057l = dVar.f1057l;
            this.f1069x = dVar.f1069x;
            this.f1070y = dVar.f1070y;
            this.f1071z = dVar.f1071z;
            this.A = dVar.A;
            this.B = dVar.B;
            this.C = dVar.C;
            this.D = dVar.D;
            this.E = dVar.E;
            this.F = dVar.F;
            this.G = dVar.G;
            this.H = dVar.H;
            this.I = dVar.I;
            if (dVar.f1048c == iF) {
                if (dVar.f1055j) {
                    this.f1056k = dVar.f1056k != null ? new Rect(dVar.f1056k) : null;
                    this.f1055j = true;
                }
                if (dVar.f1058m) {
                    this.f1059n = dVar.f1059n;
                    this.f1060o = dVar.f1060o;
                    this.f1061p = dVar.f1061p;
                    this.f1062q = dVar.f1062q;
                    this.f1058m = true;
                }
            }
            if (dVar.f1063r) {
                this.f1064s = dVar.f1064s;
                this.f1063r = true;
            }
            if (dVar.f1065t) {
                this.f1066u = dVar.f1066u;
                this.f1065t = true;
            }
            Drawable[] drawableArr = dVar.f1052g;
            this.f1052g = new Drawable[drawableArr.length];
            this.f1053h = dVar.f1053h;
            SparseArray sparseArray = dVar.f1051f;
            if (sparseArray != null) {
                this.f1051f = sparseArray.clone();
            } else {
                this.f1051f = new SparseArray(this.f1053h);
            }
            int i10 = this.f1053h;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f1051f.put(i11, constantState);
                    } else {
                        this.f1052g[i11] = drawableArr[i11];
                    }
                }
            }
        }

        private void e() {
            SparseArray sparseArray = this.f1051f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f1052g[this.f1051f.keyAt(i10)] = s(((Drawable.ConstantState) this.f1051f.valueAt(i10)).newDrawable(this.f1047b));
                }
                this.f1051f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                e0.a.m(drawable, this.f1071z);
            }
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.f1046a);
            return drawableMutate;
        }

        public final int a(Drawable drawable) {
            int i10 = this.f1053h;
            if (i10 >= this.f1052g.length) {
                o(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f1046a);
            this.f1052g[i10] = drawable;
            this.f1053h++;
            this.f1050e = drawable.getChangingConfigurations() | this.f1050e;
            p();
            this.f1056k = null;
            this.f1055j = false;
            this.f1058m = false;
            this.f1067v = false;
            return i10;
        }

        final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i10 = this.f1053h;
                Drawable[] drawableArr = this.f1052g;
                for (int i11 = 0; i11 < i10; i11++) {
                    Drawable drawable = drawableArr[i11];
                    if (drawable != null && e0.a.b(drawable)) {
                        e0.a.a(drawableArr[i11], theme);
                        this.f1050e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                y(C0019b.c(theme));
            }
        }

        public boolean c() {
            if (this.f1067v) {
                return this.f1068w;
            }
            e();
            this.f1067v = true;
            int i10 = this.f1053h;
            Drawable[] drawableArr = this.f1052g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f1068w = false;
                    return false;
                }
            }
            this.f1068w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i10 = this.f1053h;
            Drawable[] drawableArr = this.f1052g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f1051f.get(i11);
                    if (constantState != null && C0019b.a(constantState)) {
                        return true;
                    }
                } else if (e0.a.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        protected void d() {
            this.f1058m = true;
            e();
            int i10 = this.f1053h;
            Drawable[] drawableArr = this.f1052g;
            this.f1060o = -1;
            this.f1059n = -1;
            this.f1062q = 0;
            this.f1061p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f1059n) {
                    this.f1059n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f1060o) {
                    this.f1060o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f1061p) {
                    this.f1061p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f1062q) {
                    this.f1062q = minimumHeight;
                }
            }
        }

        final int f() {
            return this.f1052g.length;
        }

        public final Drawable g(int i10) {
            int iIndexOfKey;
            Drawable drawable = this.f1052g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f1051f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable drawableS = s(((Drawable.ConstantState) this.f1051f.valueAt(iIndexOfKey)).newDrawable(this.f1047b));
            this.f1052g[i10] = drawableS;
            this.f1051f.removeAt(iIndexOfKey);
            if (this.f1051f.size() == 0) {
                this.f1051f = null;
            }
            return drawableS;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1049d | this.f1050e;
        }

        public final int h() {
            return this.f1053h;
        }

        public final int i() {
            if (!this.f1058m) {
                d();
            }
            return this.f1060o;
        }

        public final int j() {
            if (!this.f1058m) {
                d();
            }
            return this.f1062q;
        }

        public final int k() {
            if (!this.f1058m) {
                d();
            }
            return this.f1061p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f1054i) {
                return null;
            }
            Rect rect2 = this.f1056k;
            if (rect2 != null || this.f1055j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i10 = this.f1053h;
            Drawable[] drawableArr = this.f1052g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i12 = rect3.left;
                    if (i12 > rect.left) {
                        rect.left = i12;
                    }
                    int i13 = rect3.top;
                    if (i13 > rect.top) {
                        rect.top = i13;
                    }
                    int i14 = rect3.right;
                    if (i14 > rect.right) {
                        rect.right = i14;
                    }
                    int i15 = rect3.bottom;
                    if (i15 > rect.bottom) {
                        rect.bottom = i15;
                    }
                }
            }
            this.f1055j = true;
            this.f1056k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f1058m) {
                d();
            }
            return this.f1059n;
        }

        public final int n() {
            if (this.f1063r) {
                return this.f1064s;
            }
            e();
            int i10 = this.f1053h;
            Drawable[] drawableArr = this.f1052g;
            int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            this.f1064s = opacity;
            this.f1063r = true;
            return opacity;
        }

        public void o(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f1052g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f1052g = drawableArr;
        }

        void p() {
            this.f1063r = false;
            this.f1065t = false;
        }

        public final boolean q() {
            return this.f1057l;
        }

        abstract void r();

        public final void t(boolean z10) {
            this.f1057l = z10;
        }

        public final void u(int i10) {
            this.A = i10;
        }

        public final void v(int i10) {
            this.B = i10;
        }

        final boolean w(int i10, int i11) {
            int i12 = this.f1053h;
            Drawable[] drawableArr = this.f1052g;
            boolean z10 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    boolean zM = Build.VERSION.SDK_INT >= 23 ? e0.a.m(drawable, i10) : false;
                    if (i13 == i11) {
                        z10 = zM;
                    }
                }
            }
            this.f1071z = i10;
            return z10;
        }

        public final void x(boolean z10) {
            this.f1054i = z10;
        }

        final void y(Resources resources) {
            if (resources != null) {
                this.f1047b = resources;
                int iF = b.f(resources, this.f1048c);
                int i10 = this.f1048c;
                this.f1048c = iF;
                if (i10 != iF) {
                    this.f1058m = false;
                    this.f1055j = false;
                }
            }
        }
    }

    private void d(Drawable drawable) {
        if (this.f1043u == null) {
            this.f1043u = new c();
        }
        drawable.setCallback(this.f1043u.b(drawable.getCallback()));
        try {
            if (this.f1032a.A <= 0 && this.f1037f) {
                drawable.setAlpha(this.f1036e);
            }
            d dVar = this.f1032a;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    e0.a.o(drawable, dVar.F);
                }
                d dVar2 = this.f1032a;
                if (dVar2.I) {
                    e0.a.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f1032a.f1069x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                e0.a.m(drawable, e0.a.f(this));
            }
            e0.a.j(drawable, this.f1032a.C);
            Rect rect = this.f1033b;
            if (rect != null) {
                e0.a.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.f1043u.a());
        } catch (Throwable th2) {
            drawable.setCallback(this.f1043u.a());
            throw th2;
        }
    }

    private boolean e() {
        return isAutoMirrored() && e0.a.f(this) == 1;
    }

    static int f(Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        if (i10 == 0) {
            return 160;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f1037f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f1034c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L38
            long r9 = r13.f1041s
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f1036e
            r3.setAlpha(r9)
            r13.f1041s = r6
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            androidx.appcompat.graphics.drawable.b$d r9 = r13.f1032a
            int r9 = r9.A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f1036e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.f1041s = r6
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.f1035d
            if (r9 == 0) goto L65
            long r10 = r13.f1042t
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f1035d = r0
            r13.f1042t = r6
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            androidx.appcompat.graphics.drawable.b$d r4 = r13.f1032a
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f1036e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.f1042t = r6
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            java.lang.Runnable r14 = r13.f1040r
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f1032a.b(theme);
    }

    abstract d b();

    int c() {
        return this.f1038g;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f1032a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f1034c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f1035d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f1038g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f1032a
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f1035d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f1034c
            if (r0 == 0) goto L29
            r9.f1035d = r0
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f1032a
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f1042t = r0
            goto L35
        L29:
            r9.f1035d = r4
            r9.f1042t = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f1034c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f1032a
            int r1 = r0.f1053h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f1034c = r0
            r9.f1038g = r10
            if (r0 == 0) goto L5a
            androidx.appcompat.graphics.drawable.b$d r10 = r9.f1032a
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f1041s = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f1034c = r4
            r10 = -1
            r9.f1038g = r10
        L5a:
            long r0 = r9.f1041s
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f1042t
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f1040r
            if (r0 != 0) goto L73
            androidx.appcompat.graphics.drawable.b$a r0 = new androidx.appcompat.graphics.drawable.b$a
            r0.<init>()
            r9.f1040r = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.b.g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1036e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f1032a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f1032a.c()) {
            return null;
        }
        this.f1032a.f1049d = getChangingConfigurations();
        return this.f1032a;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f1034c;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f1033b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f1032a.q()) {
            return this.f1032a.i();
        }
        Drawable drawable = this.f1034c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f1032a.q()) {
            return this.f1032a.m();
        }
        Drawable drawable = this.f1034c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f1032a.q()) {
            return this.f1032a.j();
        }
        Drawable drawable = this.f1034c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f1032a.q()) {
            return this.f1032a.k();
        }
        Drawable drawable = this.f1034c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f1034c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f1032a.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f1034c;
        if (drawable != null) {
            C0019b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect rectL = this.f1032a.l();
        if (rectL != null) {
            rect.set(rectL);
            padding = (rectL.right | ((rectL.left | rectL.top) | rectL.bottom)) != 0;
        } else {
            Drawable drawable = this.f1034c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (e()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return padding;
    }

    void h(d dVar) {
        this.f1032a = dVar;
        int i10 = this.f1038g;
        if (i10 >= 0) {
            Drawable drawableG = dVar.g(i10);
            this.f1034c = drawableG;
            if (drawableG != null) {
                d(drawableG);
            }
        }
        this.f1035d = null;
    }

    final void i(Resources resources) {
        this.f1032a.y(resources);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f1032a;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable != this.f1034c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f1032a.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f1035d;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f1035d = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f1034c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f1037f) {
                this.f1034c.setAlpha(this.f1036e);
            }
        }
        if (this.f1042t != 0) {
            this.f1042t = 0L;
            z10 = true;
        }
        if (this.f1041s != 0) {
            this.f1041s = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f1039h && super.mutate() == this) {
            d dVarB = b();
            dVarB.r();
            h(dVarB);
            this.f1039h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1035d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f1034c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return this.f1032a.w(i10, c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f1035d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f1034c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable != this.f1034c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f1037f && this.f1036e == i10) {
            return;
        }
        this.f1037f = true;
        this.f1036e = i10;
        Drawable drawable = this.f1034c;
        if (drawable != null) {
            if (this.f1041s == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        d dVar = this.f1032a;
        if (dVar.C != z10) {
            dVar.C = z10;
            Drawable drawable = this.f1034c;
            if (drawable != null) {
                e0.a.j(drawable, z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f1032a;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f1034c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        d dVar = this.f1032a;
        if (dVar.f1069x != z10) {
            dVar.f1069x = z10;
            Drawable drawable = this.f1034c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f1034c;
        if (drawable != null) {
            e0.a.k(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f1033b;
        if (rect == null) {
            this.f1033b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f1034c;
        if (drawable != null) {
            e0.a.l(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f1032a;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            e0.a.o(this.f1034c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f1032a;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            e0.a.p(this.f1034c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f1035d;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f1034c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f1034c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
