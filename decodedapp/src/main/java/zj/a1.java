package zj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zj.e1;

/* JADX INFO: loaded from: classes3.dex */
public class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e1 f33335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f33336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f33337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f33338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f33339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private yj.b f33340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f33341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private e1 f33342i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f33343j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f33344k;

    public a1(String str, double d10, double d11, double d12, double d13) {
        if (aj.d.b(d11) <= aj.l.f682b) {
            throw new hj.a(hj.f.TOO_SMALL_SCALE_FOR_PARAMETER, str, Double.valueOf(d11));
        }
        this.f33334a = str;
        this.f33335b = new e1("Span" + str + 0);
        this.f33336c = d10;
        this.f33337d = d11;
        this.f33338e = d12;
        this.f33339f = d13;
        this.f33340g = null;
        this.f33342i = new e1(Double.valueOf(d10));
        this.f33343j = false;
        this.f33344k = new ArrayList();
        this.f33341h = false;
    }

    public String a() {
        return this.f33334a;
    }

    public int b() {
        return this.f33342i.h();
    }

    public yj.b[] c() {
        ArrayList arrayList = new ArrayList();
        for (e1.c cVarG = f().f().g(); cVarG != null; cVarG = cVarG.c()) {
            arrayList.add(cVarG.getDate());
        }
        return (yj.b[]) arrayList.toArray(new yj.b[0]);
    }

    public double d(yj.b bVar) {
        return this.f33341h ? e(bVar) : g(bVar);
    }

    public double e(yj.b bVar) {
        throw new UnsupportedOperationException();
    }

    public e1 f() {
        return this.f33342i;
    }

    public double g(yj.b bVar) {
        return ((Double) (b() == 1 ? this.f33342i.f().e() : this.f33342i.e(bVar))).doubleValue();
    }

    public boolean h() {
        return this.f33343j;
    }

    public void i(boolean z10) {
        h();
        this.f33343j = z10;
        Iterator it = this.f33344k.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    public String toString() {
        return this.f33334a + " = " + this.f33342i.e(yj.b.P);
    }
}
