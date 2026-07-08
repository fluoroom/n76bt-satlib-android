package com.lzf.easyfloat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import kotlin.Metadata;
import rd.h;
import rd.m;
import za.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010 ¨\u0006/"}, d2 = {"Lcom/lzf/easyfloat/widget/DefaultAddView;", "Lza/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ldd/d0;", "a", "()V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Path;", "b", "Landroid/graphics/Path;", "path", "", "c", "F", "width", "d", "height", "Landroid/graphics/Region;", "e", "Landroid/graphics/Region;", "region", "f", "totalRegion", "", "g", "Z", "inRange", "zoomSize", "easyfloat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DefaultAddView extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Paint paint;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Path path;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float width;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float height;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Region region;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Region totalRegion;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean inRange;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float zoomSize;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultAddView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        m.e(context, "context");
    }

    private final void a() {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#AA000000"));
        paint.setStrokeWidth(10.0f);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.paint = paint;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        m.e(canvas, "canvas");
        this.path.reset();
        if (this.inRange) {
            Path path = this.path;
            float f10 = this.width;
            float f11 = this.height;
            path.addCircle(f10, f11, Math.min(f10, f11), Path.Direction.CW);
        } else {
            Path path2 = this.path;
            float f12 = this.width;
            float f13 = this.height;
            path2.addCircle(f12, f13, Math.min(f12, f13) - this.zoomSize, Path.Direction.CW);
            Region region = this.totalRegion;
            float f14 = this.zoomSize;
            region.set((int) f14, (int) f14, (int) this.width, (int) this.height);
            this.region.setPath(this.path, this.totalRegion);
        }
        Path path3 = this.path;
        Paint paint = this.paint;
        if (paint == null) {
            m.o("paint");
            paint = null;
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
    public DefaultAddView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m.e(context, "context");
        this.path = new Path();
        this.region = new Region();
        this.totalRegion = new Region();
        this.zoomSize = 18.0f;
        a();
        setWillNotDraw(false);
    }

    public /* synthetic */ DefaultAddView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
