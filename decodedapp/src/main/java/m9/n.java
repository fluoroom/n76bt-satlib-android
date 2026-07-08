package m9;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f21898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f21899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f21900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f21901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f21902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f21903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f21904g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f21905h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21906i;

    class a extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f21907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Matrix f21908d;

        a(List list, Matrix matrix) {
            this.f21907c = list;
            this.f21908d = matrix;
        }

        @Override // m9.n.g
        public void a(Matrix matrix, l9.a aVar, int i10, Canvas canvas) {
            Iterator it = this.f21907c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f21908d, aVar, i10, canvas);
            }
        }
    }

    static class b extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f21910c;

        public b(d dVar) {
            this.f21910c = dVar;
        }

        @Override // m9.n.g
        public void a(Matrix matrix, l9.a aVar, int i10, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f21910c.k(), this.f21910c.o(), this.f21910c.l(), this.f21910c.j()), i10, this.f21910c.m(), this.f21910c.n());
        }
    }

    static class c extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f21911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f21912d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f21913e;

        public c(e eVar, float f10, float f11) {
            this.f21911c = eVar;
            this.f21912d = f10;
            this.f21913e = f11;
        }

        @Override // m9.n.g
        public void a(Matrix matrix, l9.a aVar, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f21911c.f21922c - this.f21913e, this.f21911c.f21921b - this.f21912d), 0.0f);
            this.f21925a.set(matrix);
            this.f21925a.preTranslate(this.f21912d, this.f21913e);
            this.f21925a.preRotate(c());
            aVar.b(canvas, this.f21925a, rectF, i10);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f21911c.f21922c - this.f21913e) / (this.f21911c.f21921b - this.f21912d)));
        }
    }

    public static class d extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final RectF f21914h = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f21915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f21916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f21917d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f21918e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f21919f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f21920g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f21918e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f21915b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f21917d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f21919f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f21920g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f21916c;
        }

        private void p(float f10) {
            this.f21918e = f10;
        }

        private void q(float f10) {
            this.f21915b = f10;
        }

        private void r(float f10) {
            this.f21917d = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f10) {
            this.f21919f = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f10) {
            this.f21920g = f10;
        }

        private void u(float f10) {
            this.f21916c = f10;
        }

        @Override // m9.n.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f21923a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f21914h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    public static class e extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f21921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f21922c;

        @Override // m9.n.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f21923a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f21921b, this.f21922c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Matrix f21923a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    static abstract class g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Matrix f21924b = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f21925a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, l9.a aVar, int i10, Canvas canvas);

        public final void b(l9.a aVar, int i10, Canvas canvas) {
            a(f21924b, aVar, i10, canvas);
        }
    }

    public n() {
        n(0.0f, 0.0f);
    }

    private void b(float f10) {
        if (g() == f10) {
            return;
        }
        float fG = ((f10 - g()) + 360.0f) % 360.0f;
        if (fG > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(fG);
        this.f21905h.add(new b(dVar));
        p(f10);
    }

    private void c(g gVar, float f10, float f11) {
        b(f10);
        this.f21905h.add(gVar);
        p(f11);
    }

    private float g() {
        return this.f21902e;
    }

    private float h() {
        return this.f21903f;
    }

    private void p(float f10) {
        this.f21902e = f10;
    }

    private void q(float f10) {
        this.f21903f = f10;
    }

    private void r(float f10) {
        this.f21900c = f10;
    }

    private void s(float f10) {
        this.f21901d = f10;
    }

    private void t(float f10) {
        this.f21898a = f10;
    }

    private void u(float f10) {
        this.f21899b = f10;
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f21904g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f21904g.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f) this.f21904g.get(i10)).a(matrix, path);
        }
    }

    boolean e() {
        return this.f21906i;
    }

    g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f21905h), new Matrix(matrix));
    }

    float i() {
        return this.f21900c;
    }

    float j() {
        return this.f21901d;
    }

    float k() {
        return this.f21898a;
    }

    float l() {
        return this.f21899b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        eVar.f21921b = f10;
        eVar.f21922c = f11;
        this.f21904g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f10);
        s(f11);
    }

    public void n(float f10, float f11) {
        o(f10, f11, 270.0f, 0.0f);
    }

    public void o(float f10, float f11, float f12, float f13) {
        t(f10);
        u(f11);
        r(f10);
        s(f11);
        p(f12);
        q((f12 + f13) % 360.0f);
        this.f21904g.clear();
        this.f21905h.clear();
        this.f21906i = false;
    }
}
