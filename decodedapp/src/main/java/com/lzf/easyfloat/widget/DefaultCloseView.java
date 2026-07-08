package com.lzf.easyfloat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import kotlin.Metadata;
import qa.b;
import rd.h;
import rd.m;
import za.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010(¨\u0006;"}, d2 = {"Lcom/lzf/easyfloat/widget/DefaultCloseView;", "Lza/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ldd/d0;", "a", "(Landroid/util/AttributeSet;)V", "b", "()V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "I", "normalColor", "inRangeColor", "c", "shapeType", "Landroid/graphics/Paint;", "d", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Path;", "e", "Landroid/graphics/Path;", "path", "", "f", "F", "width", "g", "height", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/Region;", "r", "Landroid/graphics/Region;", "region", "s", "totalRegion", "", "t", "Z", "inRange", "u", "zoomSize", "easyfloat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DefaultCloseView extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int normalColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int inRangeColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int shapeType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Paint paint;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Path path;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float width;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float height;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private RectF rectF;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Region region;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Region totalRegion;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean inRange;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private float zoomSize;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultCloseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        m.e(context, "context");
    }

    private final void a(AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, b.f24499b, 0, 0);
        this.normalColor = typedArrayObtainStyledAttributes.getColor(b.f24502e, this.normalColor);
        this.inRangeColor = typedArrayObtainStyledAttributes.getColor(b.f24501d, this.inRangeColor);
        this.shapeType = typedArrayObtainStyledAttributes.getInt(b.f24500c, this.shapeType);
        this.zoomSize = typedArrayObtainStyledAttributes.getDimension(b.f24503f, this.zoomSize);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void b() {
        Paint paint = new Paint();
        paint.setColor(this.normalColor);
        paint.setStrokeWidth(10.0f);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.paint = paint;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        m.e(canvas, "canvas");
        this.path.reset();
        Paint paint = null;
        if (this.inRange) {
            Paint paint2 = this.paint;
            if (paint2 == null) {
                m.o("paint");
                paint2 = null;
            }
            paint2.setColor(this.inRangeColor);
            int i10 = this.shapeType;
            if (i10 == 0) {
                this.rectF.set(getPaddingLeft(), 0.0f, this.width - getPaddingRight(), this.height * 2);
                this.path.addOval(this.rectF, Path.Direction.CW);
            } else if (i10 == 1) {
                this.rectF.set(getPaddingLeft(), 0.0f, this.width - getPaddingRight(), this.height);
                this.path.addRect(this.rectF, Path.Direction.CW);
            } else if (i10 == 2) {
                Path path = this.path;
                float f10 = this.width / 2;
                float f11 = this.height;
                path.addCircle(f10, f11, f11, Path.Direction.CW);
            }
        } else {
            Paint paint3 = this.paint;
            if (paint3 == null) {
                m.o("paint");
                paint3 = null;
            }
            paint3.setColor(this.normalColor);
            int i11 = this.shapeType;
            if (i11 == 0) {
                RectF rectF = this.rectF;
                float paddingLeft = getPaddingLeft();
                float f12 = this.zoomSize;
                float paddingRight = this.width - getPaddingRight();
                float f13 = this.zoomSize;
                rectF.set(paddingLeft + f12, f12, paddingRight - f13, (this.height - f13) * 2);
                this.path.addOval(this.rectF, Path.Direction.CW);
                Region region = this.totalRegion;
                int paddingLeft2 = getPaddingLeft();
                float f14 = this.zoomSize;
                region.set(paddingLeft2 + ((int) f14), (int) f14, (int) ((this.width - getPaddingRight()) - this.zoomSize), (int) this.height);
            } else if (i11 == 1) {
                this.rectF.set(getPaddingLeft(), this.zoomSize, this.width - getPaddingRight(), this.height);
                this.path.addRect(this.rectF, Path.Direction.CW);
                this.totalRegion.set(getPaddingLeft(), (int) this.zoomSize, ((int) this.width) - getPaddingRight(), (int) this.height);
            } else if (i11 == 2) {
                Path path2 = this.path;
                float f15 = this.width / 2;
                float f16 = this.height;
                path2.addCircle(f15, f16, f16 - this.zoomSize, Path.Direction.CW);
                this.totalRegion.set(0, (int) this.zoomSize, (int) this.width, (int) this.height);
            }
            this.region.setPath(this.path, this.totalRegion);
        }
        Path path3 = this.path;
        Paint paint4 = this.paint;
        if (paint4 == null) {
            m.o("paint");
        } else {
            paint = paint4;
        }
        canvas.drawPath(path3, paint);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        this.width = w10;
        this.height = h10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultCloseView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m.e(context, "context");
        this.normalColor = Color.parseColor("#99000000");
        this.inRangeColor = Color.parseColor("#99FF0000");
        this.path = new Path();
        this.rectF = new RectF();
        this.region = new Region();
        this.totalRegion = new Region();
        this.zoomSize = ya.b.f32457a.a(context, 4.0f);
        if (attributeSet != null) {
            a(attributeSet);
        }
        b();
        setWillNotDraw(false);
    }

    public /* synthetic */ DefaultCloseView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
