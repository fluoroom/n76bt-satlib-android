package bi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import om.sstvencoder.h;

/* JADX INFO: loaded from: classes3.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f4101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private bi.c f4102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f4103c;

    private interface b {
        void a(Canvas canvas);

        void b(Canvas canvas);

        void c(Canvas canvas, Rect rect, Rect rect2);

        RectF getBounds();
    }

    private class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f4104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f4105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f4106c;

        private Typeface f() {
            int i10 = (f.this.f4102b.b() && f.this.f4102b.f()) ? 3 : f.this.f4102b.b() ? 1 : f.this.f4102b.f() ? 2 : 0;
            return Typeface.create(Typeface.createFromFile(h.g(f.this.f4102b.d(), i10)), i10);
        }

        private void g(Canvas canvas, float f10, float f11) {
            if (f.this.f4102b.g()) {
                j();
                canvas.drawText(f.this.f4102b.j(), f10, f11, f.this.f4101a);
                n();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float h() {
            f.this.f4101a.getTextBounds("M", 0, 1, new Rect());
            return r0.width();
        }

        private Rect i() {
            Rect rect = new Rect();
            String strJ = f.this.f4102b.j();
            f.this.f4101a.getTextBounds(strJ, 0, strJ.length(), rect);
            return rect;
        }

        private void j() {
            f.this.f4101a.setStyle(Paint.Style.STROKE);
            f.this.f4101a.setColor(f.this.f4102b.h());
        }

        private void k(float f10) {
            f.this.f4101a.setAlpha(255);
            try {
                f.this.f4101a.setTypeface(f());
            } catch (Exception unused) {
            }
            n();
            m(f10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(float f10, float f11) {
            this.f4105b = f10;
            this.f4106c = f11;
        }

        private void m(float f10) {
            float fK = f.this.f4102b.k() * f10;
            f.this.f4101a.setTextSize(fK);
            f.this.f4101a.setStrokeWidth(f.this.f4102b.i() * fK);
        }

        private void n() {
            f.this.f4101a.setStyle(Paint.Style.FILL);
            f.this.f4101a.setColor(f.this.f4102b.e());
        }

        @Override // bi.f.b
        public void a(Canvas canvas) {
            g(canvas, this.f4105b, this.f4106c);
            canvas.drawText(f.this.f4102b.j(), this.f4105b, this.f4106c, f.this.f4101a);
        }

        @Override // bi.f.b
        public void b(Canvas canvas) {
            RectF rectF = new RectF(getBounds());
            f.this.f4101a.setStrokeWidth(0.0f);
            f.this.f4101a.setColor(-3355444);
            f.this.f4101a.setAlpha(100);
            f.this.f4101a.setStyle(Paint.Style.FILL);
            canvas.drawRoundRect(rectF, 10.0f, 10.0f, f.this.f4101a);
            f.this.f4101a.setAlpha(255);
            f.this.f4101a.setStyle(Paint.Style.STROKE);
            f.this.f4101a.setColor(-16776961);
            canvas.drawRoundRect(rectF, 10.0f, 10.0f, f.this.f4101a);
            f.this.f4101a.setColor(-16711936);
            rectF.inset(-1.0f, -1.0f);
            canvas.drawRoundRect(rectF, 10.0f, 10.0f, f.this.f4101a);
            f.this.f4101a.setColor(-65536);
            rectF.inset(-1.0f, -1.0f);
            canvas.drawRoundRect(rectF, 10.0f, 10.0f, f.this.f4101a);
            k(this.f4104a);
        }

        @Override // bi.f.b
        public void c(Canvas canvas, Rect rect, Rect rect2) {
            float fHeight = rect2.height() / rect.height();
            float f10 = (this.f4105b - rect.left) * fHeight;
            float f11 = (this.f4106c - rect.top) * fHeight;
            m(fHeight * this.f4104a);
            g(canvas, f10, f11);
            canvas.drawText(f.this.f4102b.j(), f10, f11, f.this.f4101a);
            m(this.f4104a);
        }

        @Override // bi.f.b
        public RectF getBounds() {
            RectF rectF = new RectF(i());
            rectF.offset(this.f4105b, this.f4106c);
            if (f.this.f4102b.g()) {
                float f10 = -(f.this.f4102b.i() * f.this.f4101a.getTextSize());
                rectF.inset(f10, f10);
            }
            return rectF;
        }

        private c(float f10, float f11, float f12) {
            this.f4104a = f10;
            l(f11, f12);
            k(this.f4104a);
        }
    }

    private class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Path f4108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RectF f4109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f4110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f4111d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f4112e;

        /* JADX INFO: Access modifiers changed from: private */
        public void h(RectF rectF, float f10, float f11) {
            float fMin = Math.min(Math.max(this.f4110c, rectF.left + (rectF.width() * 0.5f)), f10 - this.f4110c);
            this.f4111d = fMin;
            this.f4112e = f11;
            this.f4108a = i(fMin, f11, this.f4110c);
            float f12 = this.f4111d;
            float f13 = this.f4110c;
            float f14 = this.f4112e;
            this.f4109b = new RectF(f12 - f13, f14 - f13, f12 + f13, f14);
        }

        private Path i(float f10, float f11, float f12) {
            Path path = new Path();
            float f13 = f10 - f12;
            path.moveTo(f13, f11);
            path.lineTo(f10, f11 - (0.6f * f12));
            path.lineTo(f10 + f12, f11);
            path.lineTo(f13, f11);
            return path;
        }

        private Path j(float f10, float f11, float f12) {
            Path path = new Path();
            float f13 = f11 - f12;
            path.moveTo(f10, f13);
            path.lineTo(f10, f11 + f12);
            path.lineTo((f12 * 0.6f) + f10, f11);
            path.lineTo(f10, f13);
            return path;
        }

        private Path k(float f10, float f11, float f12) {
            Path path = new Path();
            float f13 = f11 - f12;
            path.moveTo(f10, f13);
            path.lineTo(f10 - (0.6f * f12), f11);
            path.lineTo(f10, f11 + f12);
            path.lineTo(f10, f13);
            return path;
        }

        private Path l(float f10, float f11, float f12) {
            Path path = new Path();
            float f13 = f10 - f12;
            path.moveTo(f13, f11);
            path.lineTo(f10, (0.6f * f12) + f11);
            path.lineTo(f10 + f12, f11);
            path.lineTo(f13, f11);
            return path;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(RectF rectF, float f10) {
            this.f4111d = 0.0f;
            float fMin = Math.min(Math.max(this.f4110c, rectF.top + (rectF.height() * 0.5f)), f10 - this.f4110c);
            this.f4112e = fMin;
            this.f4108a = j(this.f4111d, fMin, this.f4110c);
            float f11 = this.f4111d;
            float f12 = this.f4112e;
            float f13 = this.f4110c;
            this.f4109b = new RectF(f11, f12 - f13, f11 + f13, f12 + f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(RectF rectF, float f10, float f11) {
            this.f4111d = f10;
            float fMin = Math.min(Math.max(this.f4110c, rectF.top + (rectF.height() * 0.5f)), f11 - this.f4110c);
            this.f4112e = fMin;
            this.f4108a = k(this.f4111d, fMin, this.f4110c);
            float f12 = this.f4111d;
            float f13 = this.f4110c;
            float f14 = this.f4112e;
            this.f4109b = new RectF(f12 - f13, f14 - f13, f12, f14 + f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(RectF rectF, float f10) {
            float fMin = Math.min(Math.max(this.f4110c, rectF.left + (rectF.width() * 0.5f)), f10 - this.f4110c);
            this.f4111d = fMin;
            this.f4112e = 0.0f;
            this.f4108a = l(fMin, 0.0f, this.f4110c);
            float f11 = this.f4111d;
            float f12 = this.f4110c;
            float f13 = this.f4112e;
            this.f4109b = new RectF(f11 - f12, f13, f11 + (0.5f * f12), f12 + f13);
        }

        @Override // bi.f.b
        public void a(Canvas canvas) {
            f.this.f4101a.setColor(f.this.f4102b.e());
            f.this.f4101a.setStyle(Paint.Style.FILL);
            canvas.drawPath(this.f4108a, f.this.f4101a);
            f.this.f4101a.setColor(-1);
            f.this.f4101a.setStyle(Paint.Style.STROKE);
            canvas.drawPath(this.f4108a, f.this.f4101a);
        }

        @Override // bi.f.b
        public void b(Canvas canvas) {
            float f10 = this.f4110c * 2.0f;
            f.this.f4101a.setColor(-3355444);
            f.this.f4101a.setAlpha(100);
            f.this.f4101a.setStyle(Paint.Style.FILL);
            canvas.drawCircle(this.f4111d, this.f4112e, f10, f.this.f4101a);
            f.this.f4101a.setAlpha(255);
            f.this.f4101a.setStyle(Paint.Style.STROKE);
            f.this.f4101a.setColor(-65536);
            canvas.drawCircle(this.f4111d, this.f4112e, f10 + 1.0f, f.this.f4101a);
            f.this.f4101a.setColor(-16711936);
            canvas.drawCircle(this.f4111d, this.f4112e, f10, f.this.f4101a);
            f.this.f4101a.setColor(-16776961);
            canvas.drawCircle(this.f4111d, this.f4112e, f10 - 1.0f, f.this.f4101a);
        }

        @Override // bi.f.b
        public RectF getBounds() {
            return this.f4109b;
        }

        private d(float f10) {
            this.f4110c = f10 * 0.5f;
            f.this.f4101a.setAlpha(255);
            f.this.f4101a.setStrokeWidth(0.0f);
        }

        @Override // bi.f.b
        public void c(Canvas canvas, Rect rect, Rect rect2) {
        }
    }

    f(bi.c cVar) {
        this.f4102b = cVar;
        Paint paint = new Paint();
        this.f4101a = paint;
        paint.setAntiAlias(true);
    }

    private float g(float f10) {
        return f10 * 1.5f;
    }

    private boolean h() {
        return this.f4103c instanceof c;
    }

    void c(Canvas canvas) {
        this.f4103c.a(canvas);
    }

    void d(Canvas canvas, Rect rect, Rect rect2) {
        this.f4103c.c(canvas, rect, rect2);
    }

    void e(Canvas canvas) {
        this.f4103c.b(canvas);
        this.f4103c.a(canvas);
    }

    RectF f() {
        return this.f4103c.getBounds();
    }

    void i(float f10, float f11, float f12, g gVar) {
        if (h()) {
            return;
        }
        float fA = gVar.a();
        float fB = gVar.b();
        c cVar = new c(f10, fA, fB);
        RectF bounds = cVar.getBounds();
        float fMin = Math.min(g(f10), cVar.h());
        if (bounds.right < fMin) {
            fA = fMin - bounds.width();
        } else if (bounds.bottom < fMin) {
            fB = fMin;
        } else {
            float f13 = f11 - fMin;
            if (bounds.left > f13) {
                fA = f13;
            } else if (bounds.top > f12 - fMin) {
                fB = (f12 + bounds.height()) - fMin;
            }
        }
        cVar.l(fA, fB);
        this.f4103c = cVar;
        gVar.d(fA, fB);
    }

    void j(bi.c cVar) {
        this.f4102b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void k(float f10, float f11, float f12, g gVar) {
        d dVar;
        c cVar = new c(f10, gVar.a(), gVar.b());
        RectF bounds = cVar.getBounds();
        float fG = g(f10);
        float fMin = Math.min(fG, cVar.h());
        if (bounds.right < fMin) {
            d dVar2 = new d(fG);
            dVar2.m(bounds, f12);
            dVar = dVar2;
        } else if (bounds.bottom < fMin) {
            d dVar3 = new d(fG);
            dVar3.o(bounds, f11);
            dVar = dVar3;
        } else if (bounds.left > f11 - fMin) {
            dVar = new d(fG);
            dVar.n(bounds, f11, f12);
        } else if (bounds.top > f12 - fMin) {
            dVar = new d(fG);
            dVar.h(bounds, f11, f12);
        } else {
            dVar = null;
        }
        if (dVar != null) {
            cVar = dVar;
        }
        this.f4103c = cVar;
    }
}
