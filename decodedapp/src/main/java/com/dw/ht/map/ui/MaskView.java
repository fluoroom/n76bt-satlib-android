package com.dw.ht.map.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.dw.ht.l0;
import kotlin.Metadata;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010#\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001eR$\u0010)\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010.\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00101\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u0011\u00105\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00107\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b6\u00104¨\u00068"}, d2 = {"Lcom/dw/ht/map/ui/MaskView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "Ldd/d0;", "a", "(Landroid/util/AttributeSet;I)V", "c", "()V", "b", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "maskPaint", "framePaint", "I", "_maskColor", "d", "_frameColor", "", "e", "F", "_frameWidth", "f", "_hollowWidth", "g", "_hollowHeight", "value", "getMaskColor", "()I", "setMaskColor", "(I)V", "maskColor", "getHollowWidth", "()F", "setHollowWidth", "(F)V", "hollowWidth", "getHollowHeight", "setHollowHeight", "hollowHeight", "Landroid/graphics/Rect;", "getHollowOnScreen", "()Landroid/graphics/Rect;", "hollowOnScreen", "getHollow", "hollow", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MaskView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Paint maskPaint;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Paint framePaint;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int _maskColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int _frameColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float _frameWidth;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float _hollowWidth;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float _hollowHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.e(context, "context");
        m.e(attributeSet, "attrs");
        this._maskColor = -65536;
        this._frameColor = -16711936;
        this._frameWidth = 8.0f;
        this._hollowWidth = 40.0f;
        this._hollowHeight = 40.0f;
        a(attributeSet, 0);
    }

    private final void a(AttributeSet attrs, int defStyle) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, l0.f6400g1, defStyle, 0);
        m.d(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this._maskColor = typedArrayObtainStyledAttributes.getColor(4, get_maskColor());
        this._hollowHeight = typedArrayObtainStyledAttributes.getDimension(2, this._hollowHeight);
        this._hollowWidth = typedArrayObtainStyledAttributes.getDimension(3, this._hollowWidth);
        this._frameColor = typedArrayObtainStyledAttributes.getColor(0, this._frameColor);
        this._frameWidth = typedArrayObtainStyledAttributes.getDimension(1, this._frameWidth);
        typedArrayObtainStyledAttributes.recycle();
        TextPaint textPaint = new TextPaint();
        textPaint.setFlags(1);
        this.maskPaint = textPaint;
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setFlags(1);
        textPaint2.setStyle(Paint.Style.STROKE);
        this.framePaint = textPaint2;
        c();
        b();
    }

    private final void b() {
        Paint paint = this.framePaint;
        if (paint == null) {
            m.o("framePaint");
            paint = null;
        }
        paint.setColor(this._frameColor);
        paint.setStrokeWidth(this._frameWidth);
        invalidate();
    }

    private final void c() {
        Paint paint = this.maskPaint;
        if (paint == null) {
            m.o("maskPaint");
            paint = null;
        }
        paint.setColor(this._maskColor);
        invalidate();
    }

    public final Rect getHollow() {
        int[] iArr = {0, 0};
        iArr[0] = (getWidth() - ((int) this._hollowWidth)) / 2;
        iArr[1] = iArr[1] + ((getHeight() - ((int) this._hollowHeight)) / 2);
        int i10 = iArr[0];
        int i11 = iArr[1];
        return new Rect(i10, i11, ((int) this._hollowWidth) + i10, ((int) this._hollowHeight) + i11);
    }

    /* JADX INFO: renamed from: getHollowHeight, reason: from getter */
    public final float get_hollowHeight() {
        return this._hollowHeight;
    }

    public final Rect getHollowOnScreen() {
        int[] iArr = {0, 0};
        getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + ((getWidth() - ((int) this._hollowWidth)) / 2);
        iArr[1] = iArr[1] + ((getHeight() - ((int) this._hollowHeight)) / 2);
        int i10 = iArr[0];
        int i11 = iArr[1];
        return new Rect(i10, i11, ((int) this._hollowWidth) + i10, ((int) this._hollowHeight) + i11);
    }

    /* JADX INFO: renamed from: getHollowWidth, reason: from getter */
    public final float get_hollowWidth() {
        return this._hollowWidth;
    }

    /* JADX INFO: renamed from: getMaskColor, reason: from getter */
    public final int get_maskColor() {
        return this._maskColor;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f10;
        float f11;
        Paint paint;
        float f12;
        float f13;
        Canvas canvas2;
        Paint paint2;
        float f14;
        float f15;
        float f16;
        float f17;
        Canvas canvas3;
        m.e(canvas, "canvas");
        super.onDraw(canvas);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int width = (getWidth() - paddingLeft) - paddingRight;
        int height = (getHeight() - paddingTop) - paddingBottom;
        float f18 = width;
        float f19 = this._hollowWidth;
        float f20 = 2;
        float f21 = paddingLeft;
        float f22 = ((f18 - f19) / f20) + f21;
        float f23 = height;
        float f24 = this._hollowHeight;
        float f25 = (f23 - f24) / f20;
        float f26 = paddingTop;
        float f27 = f25 + f26;
        float f28 = f19 + f22;
        float f29 = f24 + f27;
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(f22, f27, f28, f29);
            f11 = f29;
            f10 = f28;
        } else {
            canvas.clipRect(f22, f27, f28, f29, Region.Op.DIFFERENCE);
            f10 = f28;
            f11 = f29;
        }
        float f30 = f21 + f18;
        float f31 = f26 + f23;
        Paint paint3 = this.maskPaint;
        if (paint3 == null) {
            m.o("maskPaint");
            paint = null;
            canvas2 = canvas;
            f12 = f26;
            f13 = f21;
        } else {
            paint = paint3;
            f12 = f26;
            f13 = f21;
            canvas2 = canvas;
        }
        canvas2.drawRect(f13, f12, f30, f31, paint);
        canvas.restore();
        Paint paint4 = this.framePaint;
        if (paint4 == null) {
            m.o("framePaint");
            paint2 = null;
            canvas3 = canvas;
            f14 = f22;
            f15 = f27;
            f16 = f10;
            f17 = f11;
        } else {
            paint2 = paint4;
            f14 = f22;
            f15 = f27;
            f16 = f10;
            f17 = f11;
            canvas3 = canvas;
        }
        canvas3.drawRect(f14, f15, f16, f17, paint2);
    }

    public final void setHollowHeight(float f10) {
        this._hollowHeight = f10;
        invalidate();
    }

    public final void setHollowWidth(float f10) {
        this._hollowWidth = f10;
        invalidate();
    }

    public final void setMaskColor(int i10) {
        this._maskColor = i10;
        c();
    }
}
