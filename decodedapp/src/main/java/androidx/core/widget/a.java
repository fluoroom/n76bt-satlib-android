package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.facebook.stetho.server.http.HttpStatus;
import m0.o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    private static final int A = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final View f1950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f1951d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1955h;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f1959u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f1960v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f1961w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f1962x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f1963y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f1964z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C0026a f1948a = new C0026a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Interpolator f1949b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f1952e = {0.0f, 0.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f1953f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float[] f1956r = {0.0f, 0.0f};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float[] f1957s = {0.0f, 0.0f};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float[] f1958t = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0026a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f1967c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f1968d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f1974j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f1975k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f1969e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f1973i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f1970f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f1971g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f1972h = 0;

        C0026a() {
        }

        private float e(long j10) {
            if (j10 < this.f1969e) {
                return 0.0f;
            }
            long j11 = this.f1973i;
            if (j11 < 0 || j10 < j11) {
                return a.e((j10 - r0) / this.f1965a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f1974j;
            return (1.0f - f10) + (f10 * a.e((j10 - j11) / this.f1975k, 0.0f, 1.0f));
        }

        private float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f1970f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j10 = jCurrentAnimationTimeMillis - this.f1970f;
            this.f1970f = jCurrentAnimationTimeMillis;
            float f10 = j10 * fG;
            this.f1971g = (int) (this.f1967c * f10);
            this.f1972h = (int) (f10 * this.f1968d);
        }

        public int b() {
            return this.f1971g;
        }

        public int c() {
            return this.f1972h;
        }

        public int d() {
            float f10 = this.f1967c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f1968d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f1973i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1973i + ((long) this.f1975k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1975k = a.f((int) (jCurrentAnimationTimeMillis - this.f1969e), 0, this.f1966b);
            this.f1974j = e(jCurrentAnimationTimeMillis);
            this.f1973i = jCurrentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f1966b = i10;
        }

        public void k(int i10) {
            this.f1965a = i10;
        }

        public void l(float f10, float f11) {
            this.f1967c = f10;
            this.f1968d = f11;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1969e = jCurrentAnimationTimeMillis;
            this.f1973i = -1L;
            this.f1970f = jCurrentAnimationTimeMillis;
            this.f1974j = 0.5f;
            this.f1971g = 0;
            this.f1972h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f1962x) {
                if (aVar.f1960v) {
                    aVar.f1960v = false;
                    aVar.f1948a.m();
                }
                C0026a c0026a = a.this.f1948a;
                if (c0026a.h() || !a.this.u()) {
                    a.this.f1962x = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f1961w) {
                    aVar2.f1961w = false;
                    aVar2.c();
                }
                c0026a.a();
                a.this.j(c0026a.b(), c0026a.c());
                o0.e0(a.this.f1950c, this);
            }
        }
    }

    public a(View view) {
        this.f1950c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(A);
        r(HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
        q(HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float fH = h(this.f1952e[i10], f11, this.f1953f[i10], f10);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f1956r[i10];
        float f14 = this.f1957s[i10];
        float f15 = this.f1958t[i10];
        float f16 = f13 * f12;
        return fH > 0.0f ? e(fH * f16, f14, f15) : -e((-fH) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f1954g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f1962x && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    private float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float fE = e(f10 * f11, 0.0f, f12);
        float fG = g(f11 - f13, fE) - g(f13, fE);
        if (fG < 0.0f) {
            interpolation = -this.f1949b.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f1949b.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f1960v) {
            this.f1962x = false;
        } else {
            this.f1948a.i();
        }
    }

    private void v() {
        int i10;
        if (this.f1951d == null) {
            this.f1951d = new b();
        }
        this.f1962x = true;
        this.f1960v = true;
        if (this.f1959u || (i10 = this.f1955h) <= 0) {
            this.f1951d.run();
        } else {
            o0.f0(this.f1950c, this.f1951d, i10);
        }
        this.f1959u = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1950c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f1955h = i10;
        return this;
    }

    public a l(int i10) {
        this.f1954g = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f1963y && !z10) {
            i();
        }
        this.f1963y = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f1953f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f1958t;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f1963y
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.f1961w = r2
            r5.f1959u = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1950c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1950c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f1948a
            r7.l(r0, r6)
            boolean r6 = r5.f1962x
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.f1964z
            if (r6 == 0) goto L61
            boolean r6 = r5.f1962x
            if (r6 == 0) goto L61
            return r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f1957s;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f1948a.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f1948a.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f1952e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f1956r;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    boolean u() {
        C0026a c0026a = this.f1948a;
        int iF = c0026a.f();
        int iD = c0026a.d();
        if (iF == 0 || !b(iF)) {
            return iD != 0 && a(iD);
        }
        return true;
    }
}
