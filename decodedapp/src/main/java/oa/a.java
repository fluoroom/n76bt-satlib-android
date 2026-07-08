package oa;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f23334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Drawable f23335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23336c = -1;

    public a(Context context) {
        this.f23335b = b0.b.d(context, da.a.f10873a);
        this.f23334a = b0.b.d(context, da.a.f10874b);
    }

    public void a(int i10) {
        this.f23336c = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f23335b.draw(canvas);
        canvas.drawColor(this.f23336c, PorterDuff.Mode.SRC_IN);
        this.f23334a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f23335b.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        this.f23335b.setBounds(i10, i11, i12, i13);
        this.f23334a.setBounds(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        this.f23335b.setBounds(rect);
        this.f23334a.setBounds(rect);
    }
}
