package com.dw.ht.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.dw.ht.l0;
import kotlin.Metadata;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010!\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010&\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/dw/ht/widget/StrokeTextView;", "Landroid/widget/TextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "Ldd/d0;", "a", "(Landroid/util/AttributeSet;I)V", "b", "()V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "I", "_strokeColor", "", "F", "_strokeSize", "Landroid/graphics/Paint;", "c", "Landroid/graphics/Paint;", "strokePaint", "value", "getStrokeColor", "()I", "setStrokeColor", "(I)V", "strokeColor", "getStrokeSize", "()F", "setStrokeSize", "(F)V", "strokeSize", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StrokeTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int _strokeColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float _strokeSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Paint strokePaint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrokeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.e(context, "context");
        m.e(attributeSet, "attrs");
        a(attributeSet, 0);
    }

    private final void a(AttributeSet attrs, int defStyle) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, l0.f6457r3, defStyle, 0);
        m.d(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this._strokeColor = typedArrayObtainStyledAttributes.getColor(0, get_strokeColor());
        this._strokeSize = typedArrayObtainStyledAttributes.getDimension(1, get_strokeSize());
        typedArrayObtainStyledAttributes.recycle();
        b();
    }

    private final void b() {
        if (this._strokeSize == 0.0f) {
            this.strokePaint = null;
            return;
        }
        Paint paint = this.strokePaint;
        if (paint == null) {
            paint = new Paint();
        }
        this.strokePaint = paint;
        TextPaint paint2 = getPaint();
        Paint paint3 = this.strokePaint;
        if (paint3 != null) {
            paint3.setColor(this._strokeColor);
            paint3.setStrokeWidth(this._strokeSize);
            paint3.setStyle(Paint.Style.STROKE);
            paint3.setTextSize(paint2.getTextSize());
            paint3.setTypeface(paint2.getTypeface());
            paint3.setAlpha(paint2.getAlpha());
            paint3.setFlags(paint2.getFlags());
        }
        invalidate();
    }

    /* JADX INFO: renamed from: getStrokeColor, reason: from getter */
    public final int get_strokeColor() {
        return this._strokeColor;
    }

    /* JADX INFO: renamed from: getStrokeSize, reason: from getter */
    public final float get_strokeSize() {
        return this._strokeSize;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        m.e(canvas, "canvas");
        Paint paint = this.strokePaint;
        if (paint != null) {
            String string = getText().toString();
            canvas.drawText(string, (getWidth() - paint.measureText(string)) / 2, getBaseline(), paint);
        }
        super.onDraw(canvas);
    }

    public final void setStrokeColor(int i10) {
        this._strokeColor = i10;
        b();
    }

    public final void setStrokeSize(float f10) {
        this._strokeSize = f10;
        b();
    }
}
