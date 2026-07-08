package com.dw.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.HeaderViewListAdapter;
import android.widget.SectionIndexer;
import java.util.ArrayList;
import k3.e;
import u3.v;

/* JADX INFO: loaded from: classes.dex */
class b {
    private static int D = 4;
    private static boolean E = true;
    private static boolean F;
    private boolean A;
    private int C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f7028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f7029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RectF f7033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AbsListView f7036i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f7037j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f7038k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Paint f7039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f7040m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f7042o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Object[] f7043p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f7044q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f7045r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private a f7046s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f7047t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private BaseAdapter f7049v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private SectionIndexer f7050w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f7051x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Bitmap f7052y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f7053z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f7041n = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Handler f7048u = new Handler();
    private boolean B = true;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f7054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f7055b;

        public a() {
        }

        int a() {
            if (b.this.e() != 4) {
                return 208;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j10 = this.f7054a;
            long j11 = this.f7055b;
            if (jUptimeMillis > j10 + j11) {
                return 0;
            }
            return (int) (208 - (((jUptimeMillis - j10) * 208) / j11));
        }

        void b() {
            this.f7055b = 200L;
            this.f7054a = SystemClock.uptimeMillis();
            b.this.q(4);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.e() != 4) {
                b();
            } else if (a() > 0) {
                b.this.f7036i.invalidate();
            } else {
                b.this.q(0);
            }
        }
    }

    public b(Context context, AbsListView absListView) {
        this.f7036i = absListView;
        f(context);
    }

    private void b() {
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        this.f7036i.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private void d() {
        Object adapter = this.f7036i.getAdapter();
        this.f7050w = null;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            this.f7040m = headerViewListAdapter.getHeadersCount();
            adapter = headerViewListAdapter.getWrappedAdapter();
        }
        if (adapter instanceof SectionIndexer) {
            this.f7049v = (BaseAdapter) adapter;
            SectionIndexer sectionIndexer = (SectionIndexer) adapter;
            this.f7050w = sectionIndexer;
            this.f7043p = sectionIndexer.getSections();
        } else {
            this.f7049v = (BaseAdapter) adapter;
            this.f7043p = new String[]{" "};
        }
        s(this.f7036i.getWidth(), this.f7036i.getHeight());
    }

    private void f(Context context) {
        Resources resources = context.getResources();
        u(context, resources.getDrawable(e.f19180e));
        this.f7029b = resources.getDrawable(e.f19179d);
        this.f7053z = context.getResources().getDimensionPixelSize(k3.d.f19170d);
        this.f7037j = true;
        d();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(k3.d.f19171e);
        this.f7034g = dimensionPixelSize;
        this.f7035h = dimensionPixelSize;
        this.f7033f = new RectF();
        this.f7046s = new a();
        Paint paint = new Paint();
        this.f7039l = paint;
        paint.setAntiAlias(true);
        this.f7039l.setTextAlign(Paint.Align.CENTER);
        this.f7039l.setTextSize(this.f7034g / 2);
        this.f7039l.setColor(-1);
        this.f7039l.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f7047t = 0;
    }

    private void l() {
        int width = this.f7036i.getWidth();
        this.f7028a.setBounds(width - this.f7031d, 0, width, this.f7030c);
        this.f7028a.setAlpha(208);
        this.f7029b.setAlpha(208);
        this.f7039l.setAlpha(255);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m(float r17) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dw.widget.b.m(float):void");
    }

    private void s(int i10, int i11) {
        Canvas canvas;
        int i12;
        Bitmap bitmapCreateBitmap = this.f7052y;
        this.f7052y = null;
        Object[] array = this.f7043p;
        if (!this.B || i10 <= 0 || i11 <= 0 || array == null || array.length < 2) {
            if (bitmapCreateBitmap != null) {
                bitmapCreateBitmap.recycle();
                return;
            }
            return;
        }
        int i13 = this.f7053z;
        int size = this.C;
        float f10 = i11;
        int i14 = (int) (f10 / (i13 / 3));
        if (i14 == 0) {
            if (bitmapCreateBitmap != null) {
                bitmapCreateBitmap.recycle();
                return;
            }
            return;
        }
        if (array.length > i14) {
            if (size != 0) {
                size = -1;
            }
            int length = (((array.length + i14) - 1) / i14) * 2;
            ArrayList arrayList = new ArrayList(((array.length / length) * 2) + 1);
            arrayList.add(array[0]);
            int i15 = length;
            while (i15 < array.length) {
                arrayList.add("·");
                arrayList.add(array[i15]);
                if (size == -1 && i15 >= (i12 = this.C)) {
                    size = i15 == i12 ? arrayList.size() - 1 : arrayList.size() - 2;
                }
                i15 += length;
            }
            if ((i15 - length) + 1 != array.length) {
                arrayList.add("·");
            }
            array = arrayList.toArray(new Object[0]);
            if (size == -1) {
                size = arrayList.size() - 1;
            }
        }
        if (bitmapCreateBitmap != null && bitmapCreateBitmap.getWidth() == i13 && bitmapCreateBitmap.getHeight() == i11) {
            canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        } else {
            if (bitmapCreateBitmap != null) {
                bitmapCreateBitmap.recycle();
            }
            bitmapCreateBitmap = Bitmap.createBitmap(i13, i11, Bitmap.Config.ARGB_8888);
            canvas = new Canvas(bitmapCreateBitmap);
        }
        Canvas canvas2 = canvas;
        float length2 = f10 / array.length;
        float f11 = i13 / 2;
        float f12 = i13;
        float f13 = length2 > f12 ? f12 : length2;
        Paint paint = new Paint();
        paint.setColor(-16777216);
        paint.setAlpha(180);
        canvas2.drawRect(0.0f, 0.0f, f12, f10, paint);
        paint.setAlpha(0);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(f13);
        float f14 = 0.8f * length2;
        for (int i16 = 0; i16 < array.length; i16++) {
            if (i16 == size) {
                paint.setColor(v.f28037b);
            } else {
                paint.setColor(-1);
            }
            canvas2.drawText(array[i16].toString(), f11, (i16 * length2) + f14, paint);
        }
        this.f7052y = bitmapCreateBitmap;
    }

    private void t(int i10, int i11) {
        RectF rectF = this.f7033f;
        int i12 = this.f7035h;
        float f10 = (i10 - i12) / 2;
        rectF.left = f10;
        float f11 = i12 + f10;
        rectF.right = f11;
        float f12 = i11 / 10;
        rectF.top = f12;
        float f13 = this.f7034g + f12;
        rectF.bottom = f13;
        Drawable drawable = this.f7029b;
        if (drawable != null) {
            drawable.setBounds((int) f10, (int) f12, (int) f11, (int) f13);
        }
    }

    private void u(Context context, Drawable drawable) {
        this.f7028a = drawable;
        this.f7031d = context.getResources().getDimensionPixelSize(k3.d.f19173g);
        this.f7030c = context.getResources().getDimensionPixelSize(k3.d.f19172f);
        this.f7051x = true;
    }

    public void c(Canvas canvas) {
        int iA;
        if (this.f7047t == 0) {
            return;
        }
        int i10 = this.f7032e;
        int width = this.f7036i.getWidth();
        a aVar = this.f7046s;
        if (this.f7047t == 4) {
            iA = aVar.a();
            if (iA < 104) {
                this.f7028a.setAlpha(iA * 2);
            }
            this.f7029b.setAlpha(iA);
            this.f7039l.setAlpha(iA);
            this.f7028a.setBounds(width - ((this.f7031d * iA) / 208), 0, width, this.f7030c);
            this.f7051x = true;
        } else {
            iA = -1;
        }
        canvas.translate(0.0f, i10);
        if (!E || this.A) {
            this.f7028a.draw(canvas);
        } else {
            float f10 = width / 2;
            float f11 = this.f7030c / 2;
            canvas.scale(-1.0f, 1.0f, f10, f11);
            this.f7028a.draw(canvas);
            canvas.scale(-1.0f, 1.0f, f10, f11);
        }
        canvas.translate(0.0f, -i10);
        if (this.f7044q != null && F) {
            this.f7029b.draw(canvas);
            Paint paint = this.f7039l;
            float fDescent = paint.descent();
            RectF rectF = this.f7033f;
            canvas.drawText(this.f7044q, ((int) (rectF.left + rectF.right)) / 2, ((((int) (rectF.bottom + rectF.top)) / 2) + (this.f7034g / 4)) - fDescent, paint);
        }
        int i11 = this.f7047t;
        if (i11 == 3 && this.f7045r) {
            if (!F) {
                this.f7029b.draw(canvas);
                Paint paint2 = this.f7039l;
                float fDescent2 = paint2.descent();
                RectF rectF2 = this.f7033f;
                canvas.drawText(this.f7044q, ((int) (rectF2.left + rectF2.right)) / 2, ((((int) (rectF2.bottom + rectF2.top)) / 2) + (this.f7034g / 4)) - fDescent2, paint2);
            }
            Bitmap bitmap = this.f7052y;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, this.A ? 0 : width - this.f7053z, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        if (i11 == 4) {
            if (iA == 0) {
                q(0);
                return;
            }
            this.f7036i.invalidate(width - this.f7031d, i10, width, this.f7030c + i10);
            if (E) {
                this.f7036i.invalidate(0, i10, width, this.f7030c + i10);
            }
            if (this.f7044q == null || !F) {
                return;
            }
            this.f7036i.invalidate(this.f7029b.getBounds());
        }
    }

    public int e() {
        return this.f7047t;
    }

    boolean g(float f10, float f11) {
        if (f11 >= this.f7032e && f11 <= r0 + this.f7030c) {
            if (E) {
                return this.A ? f10 > ((float) (this.f7036i.getWidth() - this.f7031d)) : f10 < ((float) this.f7031d);
            }
            if (f10 > this.f7036i.getWidth() - this.f7031d) {
                return true;
            }
        }
        return false;
    }

    boolean h(MotionEvent motionEvent) {
        if (this.f7047t <= 0 || motionEvent.getAction() != 0) {
            this.A = motionEvent.getX() > ((float) (this.f7036i.getWidth() / 2));
        } else if (g(motionEvent.getX(), motionEvent.getY())) {
            q(3);
            return true;
        }
        return false;
    }

    void i(AbsListView absListView, int i10, int i11, int i12) {
        Object[] objArr;
        if (this.f7041n != i12 && i11 > 0) {
            this.f7041n = i12;
            this.f7042o = i12 / i11 >= D;
        }
        if (!this.f7042o) {
            if (this.f7047t != 0) {
                q(0);
                return;
            }
            return;
        }
        int i13 = i12 - i11;
        if (i13 > 0 && this.f7047t != 3) {
            if (this.f7049v == null && this.f7036i != null) {
                d();
            }
            SectionIndexer sectionIndexer = this.f7050w;
            if (sectionIndexer == null || (objArr = this.f7043p) == null || objArr.length <= 1) {
                this.f7032e = ((this.f7036i.getHeight() - this.f7030c) * i10) / i13;
            } else {
                int i14 = i10 - this.f7040m;
                if (i14 < 0) {
                    i14 = 0;
                }
                this.f7032e = ((this.f7036i.getHeight() - this.f7030c) * sectionIndexer.getSectionForPosition(i14)) / (this.f7043p.length - 1);
            }
            if (this.f7051x) {
                l();
                this.f7051x = false;
            }
        }
        this.f7037j = true;
        if (i10 == this.f7038k) {
            return;
        }
        this.f7038k = i10;
        if (this.f7047t != 3) {
            q(2);
            this.f7048u.postDelayed(this.f7046s, 800L);
            if (F && this.f7049v == null && this.f7036i != null) {
                d();
            }
        }
    }

    void j(int i10, int i11, int i12, int i13) {
        Drawable drawable = this.f7028a;
        if (drawable != null) {
            drawable.setBounds(i10 - this.f7031d, 0, i10, this.f7030c);
        }
        t(i10, i11);
        s(i10, i11);
    }

    boolean k(MotionEvent motionEvent) {
        if (this.f7047t == 0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            if (g(motionEvent.getX(), motionEvent.getY())) {
                q(3);
                if (this.f7049v == null && this.f7036i != null) {
                    d();
                }
                AbsListView absListView = this.f7036i;
                if (absListView != null) {
                    absListView.requestDisallowInterceptTouchEvent(true);
                    AbsListView absListView2 = this.f7036i;
                    if (absListView2 instanceof ListViewEx) {
                        ((ListViewEx) absListView2).a(1);
                    } else if (absListView2 instanceof GridViewEx) {
                        ((GridViewEx) absListView2).a(1);
                    }
                }
                b();
                return true;
            }
        } else if (action == 1) {
            if (this.f7047t == 3) {
                AbsListView absListView3 = this.f7036i;
                if (absListView3 != null) {
                    absListView3.requestDisallowInterceptTouchEvent(false);
                    AbsListView absListView4 = this.f7036i;
                    if (absListView4 instanceof ListViewEx) {
                        ((ListViewEx) absListView4).a(0);
                    } else if (absListView4 instanceof GridViewEx) {
                        ((GridViewEx) absListView4).a(0);
                    }
                }
                q(0);
                return true;
            }
        } else if (action == 2 && this.f7047t == 3) {
            int height = this.f7036i.getHeight();
            int y10 = (int) motionEvent.getY();
            int i10 = this.f7030c;
            int i11 = y10 - (i10 / 2);
            int i12 = i11 >= 0 ? i11 + i10 > height ? height - i10 : i11 : 0;
            if (Math.abs(this.f7032e - i12) < 2) {
                return true;
            }
            this.f7032e = i12;
            if (this.f7037j) {
                m(i12 / (height - this.f7030c));
            }
            return true;
        }
        return false;
    }

    public void n(float f10) {
        o((int) (this.f7035h * f10));
    }

    public void o(int i10) {
        if (i10 == this.f7035h) {
            return;
        }
        this.f7035h = i10;
        t(this.f7036i.getWidth(), this.f7036i.getHeight());
    }

    public void p(boolean z10) {
        this.B = z10;
    }

    public void q(int i10) {
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        int width = this.f7036i.getWidth();
                        AbsListView absListView = this.f7036i;
                        int i11 = width - this.f7031d;
                        int i12 = this.f7032e;
                        absListView.invalidate(i11, i12, width, this.f7030c + i12);
                    }
                }
            } else if (this.f7047t != 2) {
                l();
            }
            this.f7048u.removeCallbacks(this.f7046s);
        } else {
            this.f7048u.removeCallbacks(this.f7046s);
            this.f7036i.invalidate();
        }
        if (this.f7047t == i10) {
            return;
        }
        this.f7047t = i10;
    }

    void r() {
        q(0);
    }
}
