package v2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import e3.k;
import i2.l;
import java.nio.ByteBuffer;
import java.util.List;
import v2.g;

/* JADX INFO: loaded from: classes.dex */
public class c extends Drawable implements g.b, Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f29494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f29497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f29498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f29499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f29500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f29501h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Paint f29502r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Rect f29503s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f29504t;

    static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final g f29505a;

        a(g gVar) {
            this.f29505a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new c(this);
        }
    }

    public c(Context context, h2.a aVar, l lVar, int i10, int i11, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.c.c(context), aVar, i10, i11, lVar, bitmap)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.f29503s == null) {
            this.f29503s = new Rect();
        }
        return this.f29503s;
    }

    private Paint h() {
        if (this.f29502r == null) {
            this.f29502r = new Paint(2);
        }
        return this.f29502r;
    }

    private void j() {
        List list = this.f29504t;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) this.f29504t.get(i10)).b(this);
            }
        }
    }

    private void l() {
        this.f29499f = 0;
    }

    private void n() {
        k.b(!this.f29497d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f29494a.f29505a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f29495b) {
                return;
            }
            this.f29495b = true;
            this.f29494a.f29505a.r(this);
            invalidateSelf();
        }
    }

    private void o() {
        this.f29495b = false;
        this.f29494a.f29505a.s(this);
    }

    @Override // v2.g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f29499f++;
        }
        int i10 = this.f29500g;
        if (i10 == -1 || this.f29499f < i10) {
            return;
        }
        stop();
        j();
    }

    public ByteBuffer c() {
        return this.f29494a.f29505a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f29497d) {
            return;
        }
        if (this.f29501h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.f29501h = false;
        }
        canvas.drawBitmap(this.f29494a.f29505a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f29494a.f29505a.e();
    }

    public int f() {
        return this.f29494a.f29505a.f();
    }

    public int g() {
        return this.f29494a.f29505a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f29494a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f29494a.f29505a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f29494a.f29505a.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.f29494a.f29505a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f29495b;
    }

    public void k() {
        this.f29497d = true;
        this.f29494a.f29505a.a();
    }

    public void m(l lVar, Bitmap bitmap) {
        this.f29494a.f29505a.o(lVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f29501h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        h().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        k.b(!this.f29497d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f29498e = z10;
        if (!z10) {
            o();
        } else if (this.f29496c) {
            n();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f29496c = true;
        l();
        if (this.f29498e) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f29496c = false;
        o();
    }

    c(a aVar) {
        this.f29498e = true;
        this.f29500g = -1;
        this.f29494a = (a) k.e(aVar);
    }
}
