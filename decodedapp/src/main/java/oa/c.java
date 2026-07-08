package oa;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public class c extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23347b;

    public c(Context context) {
        super(context);
        this.f23346a = 0;
        this.f23347b = 0;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.translate(this.f23347b / 2, this.f23346a / 2);
        super.draw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int iMax = Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.f23346a = measuredWidth - measuredHeight;
            this.f23347b = 0;
        } else {
            this.f23346a = 0;
            this.f23347b = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(iMax, iMax);
    }
}
