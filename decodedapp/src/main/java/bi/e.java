package bi;

import android.graphics.Canvas;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes3.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f4098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f4099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f4100c = new g();

    e(c cVar) {
        this.f4098a = cVar;
        this.f4099b = new f(cVar);
    }

    private void i(a aVar, c cVar) {
        cVar.v(aVar.c());
        cVar.w(aVar.readFloat());
        cVar.o(aVar.c());
        cVar.n(aVar.readBoolean());
        cVar.q(aVar.readBoolean());
        cVar.p(aVar.readInt());
        cVar.l(aVar.readInt());
        cVar.r(aVar.readBoolean());
        cVar.t(aVar.readFloat());
        cVar.s(aVar.readInt());
    }

    private void m(b bVar, c cVar) {
        bVar.c("text", cVar.j());
        bVar.h("text_size", cVar.k());
        bVar.c("family_name", cVar.d());
        bVar.e("bold", cVar.b());
        bVar.e("italic", cVar.f());
        bVar.f("fore_color", cVar.e());
        bVar.f("back_color", cVar.a());
        bVar.e("outline", cVar.g());
        bVar.h("outline_size", cVar.i());
        bVar.f("outline_color", cVar.h());
    }

    boolean a(float f10, float f11) {
        return this.f4099b.f().contains(f10, f11);
    }

    void b(Canvas canvas) {
        this.f4099b.c(canvas);
    }

    void c(Canvas canvas, Rect rect, Rect rect2) {
        this.f4099b.d(canvas, rect, rect2);
    }

    void d(Canvas canvas) {
        this.f4099b.e(canvas);
    }

    c e() {
        return this.f4098a;
    }

    void f(float f10, float f11, float f12) {
        this.f4099b.i(f10, f11, f12, this.f4100c);
    }

    void g(float f10, float f11) {
        this.f4100c.c(f10, f11);
    }

    void h(a aVar) {
        aVar.a();
        this.f4100c.d(aVar.readFloat(), aVar.readFloat());
        aVar.e();
        i(aVar, this.f4098a);
        aVar.b();
        aVar.b();
    }

    void j(c cVar) {
        this.f4098a = cVar;
        this.f4099b.j(cVar);
    }

    void k(float f10, float f11, float f12) {
        this.f4099b.k(f10, f11, f12, this.f4100c);
    }

    void l(b bVar) {
        bVar.a();
        bVar.h("position_x", this.f4100c.a());
        bVar.h("position_y", this.f4100c.b());
        bVar.i("label");
        m(bVar, this.f4098a);
        bVar.b();
        bVar.b();
    }
}
