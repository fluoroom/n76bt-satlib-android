package w;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: g */
    static int f30945g;

    /* JADX INFO: renamed from: b */
    int f30947b;

    /* JADX INFO: renamed from: d */
    int f30949d;

    /* JADX INFO: renamed from: a */
    ArrayList f30946a = new ArrayList();

    /* JADX INFO: renamed from: c */
    boolean f30948c = false;

    /* JADX INFO: renamed from: e */
    ArrayList f30950e = null;

    /* JADX INFO: renamed from: f */
    private int f30951f = -1;

    static class a {

        /* JADX INFO: renamed from: a */
        WeakReference f30952a;

        /* JADX INFO: renamed from: b */
        int f30953b;

        /* JADX INFO: renamed from: c */
        int f30954c;

        /* JADX INFO: renamed from: d */
        int f30955d;

        /* JADX INFO: renamed from: e */
        int f30956e;

        /* JADX INFO: renamed from: f */
        int f30957f;

        /* JADX INFO: renamed from: g */
        int f30958g;

        a(v.e eVar, s.d dVar, int i10) {
            this.f30952a = new WeakReference(eVar);
            this.f30953b = dVar.y(eVar.O);
            this.f30954c = dVar.y(eVar.P);
            this.f30955d = dVar.y(eVar.Q);
            this.f30956e = dVar.y(eVar.R);
            this.f30957f = dVar.y(eVar.S);
            this.f30958g = i10;
        }
    }

    public o(int i10) {
        int i11 = f30945g;
        f30945g = i11 + 1;
        this.f30947b = i11;
        this.f30949d = i10;
    }

    private String e() {
        int i10 = this.f30949d;
        return i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown";
    }

    private int j(s.d dVar, ArrayList arrayList, int i10) {
        int iY;
        int iY2;
        v.f fVar = (v.f) ((v.e) arrayList.get(0)).K();
        dVar.E();
        fVar.g(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((v.e) arrayList.get(i11)).g(dVar, false);
        }
        if (i10 == 0 && fVar.W0 > 0) {
            v.b.b(fVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.X0 > 0) {
            v.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.A();
        } catch (Exception e10) {
            System.err.println(e10.toString() + "\n" + Arrays.toString(e10.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f30950e = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f30950e.add(new a((v.e) arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            iY = dVar.y(fVar.O);
            iY2 = dVar.y(fVar.Q);
            dVar.E();
        } else {
            iY = dVar.y(fVar.P);
            iY2 = dVar.y(fVar.R);
            dVar.E();
        }
        return iY2 - iY;
    }

    public boolean a(v.e eVar) {
        if (this.f30946a.contains(eVar)) {
            return false;
        }
        this.f30946a.add(eVar);
        return true;
    }

    public void b(ArrayList arrayList) {
        int size = this.f30946a.size();
        if (this.f30951f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = (o) arrayList.get(i10);
                if (this.f30951f == oVar.f30947b) {
                    g(this.f30949d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f30947b;
    }

    public int d() {
        return this.f30949d;
    }

    public int f(s.d dVar, int i10) {
        if (this.f30946a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f30946a, i10);
    }

    public void g(int i10, o oVar) {
        for (v.e eVar : this.f30946a) {
            oVar.a(eVar);
            if (i10 == 0) {
                eVar.I0 = oVar.c();
            } else {
                eVar.J0 = oVar.c();
            }
        }
        this.f30951f = oVar.f30947b;
    }

    public void h(boolean z10) {
        this.f30948c = z10;
    }

    public void i(int i10) {
        this.f30949d = i10;
    }

    public String toString() {
        String str = e() + " [" + this.f30947b + "] <";
        Iterator it = this.f30946a.iterator();
        while (it.hasNext()) {
            str = str + " " + ((v.e) it.next()).t();
        }
        return str + " >";
    }
}
