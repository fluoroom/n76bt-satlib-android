package om.sstvencoder.ColorPalette;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class ColorPaletteView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f23695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f23696b;

    public interface a {
        void D(View view);

        void O0(View view, int i10);

        void u(View view, int i10);
    }

    public ColorPaletteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23695a = new ArrayList();
        this.f23696b = new om.sstvencoder.ColorPalette.a(om.sstvencoder.ColorPalette.a.g(), getResources().getDisplayMetrics().density);
    }

    private void b() {
        Iterator it = this.f23695a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).D(this);
        }
    }

    private void c() {
        Iterator it = this.f23695a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).u(this, this.f23696b.d());
        }
    }

    private void d() {
        Iterator it = this.f23695a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).O0(this, this.f23696b.d());
        }
    }

    private void e(float f10, float f11) {
        if (this.f23696b.c(f10, f11)) {
            invalidate();
            c();
        }
    }

    public void a(a aVar) {
        this.f23695a.add(aVar);
    }

    public int getColor() {
        return this.f23696b.d();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f23696b.a(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f23696b.e(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == 0) goto L49
            if (r0 == r1) goto L15
            r2 = 2
            if (r0 == r2) goto L49
            boolean r4 = super.onTouchEvent(r4)
            if (r4 == 0) goto L13
            goto L54
        L13:
            r4 = 0
            return r4
        L15:
            float r0 = r4.getX()
            float r4 = r4.getY()
            int r2 = r3.getLeft()
            float r2 = (float) r2
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 > 0) goto L45
            int r2 = r3.getRight()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L45
            int r0 = r3.getTop()
            float r0 = (float) r0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L45
            int r0 = r3.getBottom()
            float r0 = (float) r0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 > 0) goto L45
            r3.d()
            goto L54
        L45:
            r3.b()
            goto L54
        L49:
            float r0 = r4.getX()
            float r4 = r4.getY()
            r3.e(r0, r4)
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: om.sstvencoder.ColorPalette.ColorPaletteView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setColor(int i10) {
        this.f23696b.b(i10);
    }
}
