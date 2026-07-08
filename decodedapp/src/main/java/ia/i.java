package ia;

import android.util.Log;
import java.util.Observable;
import q8.j;
import q8.m;
import q8.o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected j f15984a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected o f15985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected m f15986c;

    public i() {
        o oVar = new o();
        this.f15985b = oVar;
        oVar.e(true);
        m mVar = new m();
        this.f15986c = mVar;
        mVar.f(true);
    }

    public void a(float f10) {
        this.f15985b.t(f10);
    }

    public void b(float f10, float f11, String str, String str2) {
        if (!str.equals("fraction")) {
            Log.w("Style", "Hotspot xUnits other than \"fraction\" are not supported.");
            f10 = 0.5f;
        }
        if (!str2.equals("fraction")) {
            Log.w("Style", "Hotspot yUnits other than \"fraction\" are not supported.");
            f11 = 1.0f;
        }
        this.f15984a.b(f10, f11);
    }

    public void c(float f10) {
        this.f15984a.u(f10);
    }

    public void d(int i10) {
        this.f15986c.g(i10);
    }

    public void e(float f10) {
        this.f15986c.s(f10);
    }
}
