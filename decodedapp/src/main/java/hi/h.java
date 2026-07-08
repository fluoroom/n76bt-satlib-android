package hi;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class h implements Closeable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f15441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f15442d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f15439a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f15440b = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f15444f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f15445g = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f15443e = 0;

    protected h(d dVar, int i10) {
        this.f15441c = dVar;
        this.f15442d = i10;
    }

    private i k(boolean z10) {
        if (this.f15445g.size() != 0 && !z10) {
            return (i) this.f15445g.get(r6.size() - 1);
        }
        int i10 = this.f15442d;
        int i11 = this.f15443e;
        this.f15443e = i11 + 1;
        i iVar = new i(i10, i11);
        long j10 = this.f15444f;
        if (j10 > 0) {
            iVar.o(j10);
        }
        this.f15445g.add(iVar);
        return iVar;
    }

    public void a(e eVar) {
        c(eVar, this.f15444f);
    }

    public void c(e eVar, long j10) {
        if (this.f15439a) {
            throw new IllegalStateException("Can't buffer packets on a closed stream!");
        }
        if (!this.f15440b) {
            eVar.f();
            this.f15440b = true;
        }
        int length = eVar.a().length;
        boolean z10 = length == 0;
        i iVarK = k(false);
        int iF = 0;
        while (true) {
            if (iF >= length && !z10) {
                this.f15444f = j10;
                eVar.h(iVarK);
                return;
            }
            iF = iVarK.f(eVar, iF);
            if (iF < length) {
                i iVarK2 = k(true);
                iVarK2.p();
                iVarK = iVarK2;
            }
            iVarK.o(j10);
            z10 = false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f15445g.size() > 0) {
            ArrayList arrayList = this.f15445g;
            ((i) arrayList.get(arrayList.size() - 1)).q();
        } else {
            e eVar = new e(new byte[0]);
            eVar.g();
            a(eVar);
        }
        flush();
        this.f15439a = true;
    }

    public void e(e eVar, boolean z10) {
        a(eVar);
        if (z10) {
            flush();
        }
    }

    public void flush() {
        if (this.f15439a) {
            throw new IllegalStateException("Can't flush packets on a closed stream!");
        }
        ArrayList arrayList = this.f15445g;
        this.f15441c.l((i[]) arrayList.toArray(new i[arrayList.size()]));
        this.f15445g.clear();
    }

    public int l() {
        return this.f15442d;
    }

    public int n() {
        Iterator it = this.f15445g.iterator();
        int iH = 0;
        while (it.hasNext()) {
            iH += ((i) it.next()).h();
        }
        return iH;
    }

    public void q(long j10) {
        this.f15444f = j10;
        Iterator it = this.f15445g.iterator();
        while (it.hasNext()) {
            ((i) it.next()).o(j10);
        }
    }
}
