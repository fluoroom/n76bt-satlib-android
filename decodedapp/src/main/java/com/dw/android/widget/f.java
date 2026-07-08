package com.dw.android.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.dw.android.widget.b;

/* JADX INFO: loaded from: classes.dex */
class f extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Paint f5432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f5433g;

    f(b bVar) {
        super(bVar);
    }

    @Override // com.dw.android.widget.e
    public void b(Canvas canvas) {
        RectF rectF = this.f5427a.f5414d;
        int iSaveLayer = canvas.saveLayer(rectF, this.f5432f, 31);
        ((b.a) this.f5427a.f5415e).b(canvas);
        this.f5427a.b(canvas);
        canvas.saveLayer(rectF, this.f5433g, 31);
        int i10 = this.f5428b;
        canvas.drawRoundRect(rectF, i10, i10, this.f5432f);
        if ((this.f5429c & 48) != 48) {
            this.f5430d.offsetTo(rectF.left, rectF.top);
            canvas.drawRect(this.f5430d, this.f5432f);
            this.f5430d.offset(rectF.width() - this.f5430d.width(), 0.0f);
            canvas.drawRect(this.f5430d, this.f5432f);
        }
        if ((this.f5429c & 80) != 80) {
            RectF rectF2 = this.f5430d;
            rectF2.offsetTo(rectF.left, rectF.bottom - rectF2.height());
            canvas.drawRect(this.f5430d, this.f5432f);
            this.f5430d.offset(rectF.width() - this.f5430d.width(), 0.0f);
            canvas.drawRect(this.f5430d, this.f5432f);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // com.dw.android.widget.e
    public void i() {
        super.i();
        if (this.f5431e) {
            this.f5427a.f5415e.setWillNotDraw(false);
            if (this.f5433g == null) {
                Paint paint = new Paint();
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                this.f5433g = paint;
                this.f5432f = new Paint(1);
            }
        } else {
            this.f5433g = null;
            this.f5432f = null;
        }
        this.f5427a.f5415e.invalidate();
    }
}
