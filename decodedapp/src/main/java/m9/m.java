package m9;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n[] f21880a = new n[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix[] f21881b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix[] f21882c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PointF f21883d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Path f21884e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Path f21885f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n f21886g = new n();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f21887h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f21888i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f21889j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Path f21890k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f21891l = true;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final m f21892a = new m();
    }

    public interface b {
        void a(n nVar, Matrix matrix, int i10);

        void b(n nVar, Matrix matrix, int i10);
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f21893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f21894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RectF f21895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f21896d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f21897e;

        c(l lVar, float f10, RectF rectF, b bVar, Path path) {
            this.f21896d = bVar;
            this.f21893a = lVar;
            this.f21897e = f10;
            this.f21895c = rectF;
            this.f21894b = path;
        }
    }

    public m() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f21880a[i10] = new n();
            this.f21881b[i10] = new Matrix();
            this.f21882c[i10] = new Matrix();
        }
    }

    private float a(int i10) {
        return ((i10 + 1) % 4) * 90;
    }

    private void b(c cVar, int i10) {
        this.f21887h[0] = this.f21880a[i10].k();
        this.f21887h[1] = this.f21880a[i10].l();
        this.f21881b[i10].mapPoints(this.f21887h);
        if (i10 == 0) {
            Path path = cVar.f21894b;
            float[] fArr = this.f21887h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f21894b;
            float[] fArr2 = this.f21887h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f21880a[i10].d(this.f21881b[i10], cVar.f21894b);
        b bVar = cVar.f21896d;
        if (bVar != null) {
            bVar.a(this.f21880a[i10], this.f21881b[i10], i10);
        }
    }

    private void c(c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f21887h[0] = this.f21880a[i10].i();
        this.f21887h[1] = this.f21880a[i10].j();
        this.f21881b[i10].mapPoints(this.f21887h);
        this.f21888i[0] = this.f21880a[i11].k();
        this.f21888i[1] = this.f21880a[i11].l();
        this.f21881b[i11].mapPoints(this.f21888i);
        float f10 = this.f21887h[0];
        float[] fArr = this.f21888i;
        float fMax = Math.max(((float) Math.hypot(f10 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fJ = j(cVar.f21895c, i10);
        this.f21886g.n(0.0f, 0.0f);
        g gVarK = k(i10, cVar.f21893a);
        gVarK.b(fMax, fJ, cVar.f21897e, this.f21886g);
        this.f21889j.reset();
        this.f21886g.d(this.f21882c[i10], this.f21889j);
        if (this.f21891l && (gVarK.a() || m(this.f21889j, i10) || m(this.f21889j, i11))) {
            Path path = this.f21889j;
            path.op(path, this.f21885f, Path.Op.DIFFERENCE);
            this.f21887h[0] = this.f21886g.k();
            this.f21887h[1] = this.f21886g.l();
            this.f21882c[i10].mapPoints(this.f21887h);
            Path path2 = this.f21884e;
            float[] fArr2 = this.f21887h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f21886g.d(this.f21882c[i10], this.f21884e);
        } else {
            this.f21886g.d(this.f21882c[i10], cVar.f21894b);
        }
        b bVar = cVar.f21896d;
        if (bVar != null) {
            bVar.b(this.f21886g, this.f21882c[i10], i10);
        }
    }

    private void g(int i10, RectF rectF, PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private e i(int i10, l lVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? lVar.s() : lVar.q() : lVar.i() : lVar.k();
    }

    private float j(RectF rectF, int i10) {
        float[] fArr = this.f21887h;
        n nVar = this.f21880a[i10];
        fArr[0] = nVar.f21900c;
        fArr[1] = nVar.f21901d;
        this.f21881b[i10].mapPoints(fArr);
        return (i10 == 1 || i10 == 3) ? Math.abs(rectF.centerX() - this.f21887h[0]) : Math.abs(rectF.centerY() - this.f21887h[1]);
    }

    private g k(int i10, l lVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? lVar.o() : lVar.p() : lVar.n() : lVar.h();
    }

    public static m l() {
        return a.f21892a;
    }

    private boolean m(Path path, int i10) {
        this.f21890k.reset();
        this.f21880a[i10].d(this.f21881b[i10], this.f21890k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f21890k.computeBounds(rectF, true);
        path.op(this.f21890k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    private void n(c cVar, int i10, float[] fArr) {
        i(i10, cVar.f21893a).b(this.f21880a[i10], 90.0f, cVar.f21897e, cVar.f21895c, fArr == null ? h(i10, cVar.f21893a) : new m9.c(fArr[i10]));
        float fA = a(i10);
        this.f21881b[i10].reset();
        g(i10, cVar.f21895c, this.f21883d);
        Matrix matrix = this.f21881b[i10];
        PointF pointF = this.f21883d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f21881b[i10].preRotate(fA);
    }

    private void o(int i10) {
        this.f21887h[0] = this.f21880a[i10].i();
        this.f21887h[1] = this.f21880a[i10].j();
        this.f21881b[i10].mapPoints(this.f21887h);
        float fA = a(i10);
        this.f21882c[i10].reset();
        Matrix matrix = this.f21882c[i10];
        float[] fArr = this.f21887h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f21882c[i10].preRotate(fA);
    }

    public void d(l lVar, float f10, RectF rectF, Path path) {
        e(lVar, f10, rectF, null, path);
    }

    public void e(l lVar, float f10, RectF rectF, b bVar, Path path) {
        f(lVar, null, f10, rectF, bVar, path);
    }

    public void f(l lVar, float[] fArr, float f10, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f21884e.rewind();
        this.f21885f.rewind();
        this.f21885f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(lVar, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            n(cVar, i10, fArr);
            o(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f21884e.close();
        if (this.f21884e.isEmpty()) {
            return;
        }
        path.op(this.f21884e, Path.Op.UNION);
    }

    d h(int i10, l lVar) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? lVar.t() : lVar.r() : lVar.j() : lVar.l();
    }
}
