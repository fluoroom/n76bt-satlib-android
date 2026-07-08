package bi;

import android.graphics.Canvas;
import android.graphics.Rect;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f4089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f4090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e f4091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f4092f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4087a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f4088b = new LinkedList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f4093g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f4094h = 0.0f;

    private class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f4095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f4096b;

        a(float f10, float f11) {
            this.f4095a = f10;
            this.f4096b = f11;
        }

        float a() {
            return this.f4096b;
        }

        float b() {
            return this.f4095a;
        }
    }

    private void a(e eVar) {
        if (this.f4088b.size() == 0) {
            this.f4088b.add(eVar);
        } else {
            this.f4088b.add(0, eVar);
        }
    }

    private e f(float f10, float f11) {
        for (e eVar : this.f4088b) {
            if (eVar.a(f10, f11)) {
                return eVar;
            }
        }
        return null;
    }

    public void b(Canvas canvas) {
        Iterator it = this.f4088b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).b(canvas);
        }
        e eVar = this.f4091e;
        if (eVar != null) {
            eVar.d(canvas);
        }
    }

    public void c(Canvas canvas, Rect rect, Rect rect2) {
        Iterator it = this.f4088b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).c(canvas, rect, rect2);
        }
    }

    public c d(float f10, float f11) {
        e eVarF = f(f10, f11);
        this.f4092f = eVarF;
        if (eVarF == null) {
            e eVar = new e(new c());
            this.f4092f = eVar;
            eVar.g(f10, f11);
        }
        return this.f4092f.e();
    }

    public void e(c cVar) {
        if (this.f4092f != null && cVar != null) {
            if (!"".equals(cVar.j().trim())) {
                if (!this.f4088b.contains(this.f4092f)) {
                    this.f4088b.add(this.f4092f);
                }
                this.f4092f.j(cVar);
                this.f4092f.k(this.f4090d, this.f4089c.b(), this.f4089c.a());
            } else if (this.f4088b.contains(this.f4092f)) {
                this.f4088b.remove(this.f4092f);
            }
        }
        this.f4092f = null;
    }

    public void g(float f10, float f11) {
        this.f4091e.g(f10 - this.f4093g, f11 - this.f4094h);
        this.f4091e.k(this.f4090d, this.f4089c.b(), this.f4089c.a());
        this.f4093g = f10;
        this.f4094h = f11;
    }

    public boolean h(float f10, float f11) {
        e eVarF = f(f10, f11);
        this.f4091e = eVarF;
        if (eVarF == null) {
            return false;
        }
        this.f4088b.remove(eVarF);
        this.f4093g = f10;
        this.f4094h = f11;
        this.f4091e.f(this.f4090d, this.f4089c.b(), this.f4089c.a());
        return true;
    }

    public void i() {
        this.f4088b.add(this.f4091e);
        this.f4091e = null;
        this.f4093g = 0.0f;
        this.f4094h = 0.0f;
    }

    public boolean j(bi.a aVar) {
        aVar.a();
        if (aVar.readInt() != this.f4087a) {
            return false;
        }
        float f10 = aVar.readFloat();
        float f11 = aVar.readFloat();
        float f12 = aVar.readFloat();
        aVar.f();
        while (aVar.hasNext()) {
            e eVar = new e(new c());
            eVar.h(aVar);
            a(eVar);
        }
        aVar.d();
        k(f10, f11, f12);
        aVar.b();
        return true;
    }

    public void k(float f10, float f11, float f12) {
        a aVar = this.f4089c;
        if (aVar != null) {
            float fB = (f10 - aVar.b()) / 2.0f;
            float fA = (f11 - this.f4089c.a()) / 2.0f;
            Iterator it = this.f4088b.iterator();
            while (it.hasNext()) {
                ((e) it.next()).g(fB, fA);
            }
        }
        this.f4089c = new a(f10, f11);
        this.f4090d = f12;
        Iterator it2 = this.f4088b.iterator();
        while (it2.hasNext()) {
            ((e) it2.next()).k(this.f4090d, f10, f11);
        }
    }

    public void l(b bVar) {
        bVar.a();
        bVar.f("version", this.f4087a);
        bVar.h("width", this.f4089c.b());
        bVar.h("height", this.f4089c.a());
        bVar.h("factor", this.f4090d);
        bVar.g("labels");
        Iterator it = this.f4088b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).l(bVar);
        }
        bVar.d();
        bVar.b();
    }
}
