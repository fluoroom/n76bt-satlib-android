package kj;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public class d1 {

    /* JADX INFO: renamed from: a */
    private final gj.g f20049a;

    /* JADX INFO: renamed from: b */
    private final Map f20050b = new HashMap();

    /* JADX INFO: renamed from: c */
    private double f20051c = 432000.0d;

    /* JADX INFO: renamed from: d */
    private int f20052d = 3;

    public d1(gj.g gVar) {
        this.f20049a = gVar;
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6, Supplier supplier) {
        if (str == null) {
            str = "^finals\\.[^.]*$";
        }
        zj.s sVar = zj.s.f33452a;
        c(sVar, new o1(false, str, this.f20049a, supplier));
        if (str2 == null) {
            str2 = "^(:finals|eopc04_\\d\\d)\\..*\\.xml$";
        }
        c(sVar, new f0(str2, this.f20049a, supplier));
        if (str3 == null) {
            str3 = "^eopc04(_\\d\\d)?\\.\\d\\d$";
        }
        c(sVar, new a0(str3, this.f20049a, supplier));
        if (str4 == null) {
            str4 = "^bulletinb(_IAU1980)?((-\\d\\d\\d\\.txt)|(\\.\\d\\d\\d))$";
        }
        c(sVar, new e(str4, this.f20049a, supplier));
        if (str5 == null) {
            str5 = "^bulletina-[ivxlcdm]+-\\d\\d\\d\\.txt$";
        }
        c(sVar, new d(str5, this.f20049a, supplier));
        if (str6 == null) {
            str6 = "^(?:eopc04|bulletina|bulletinb).*\\.csv$";
        }
        c(sVar, new b0(str6, this.f20049a, supplier));
    }

    public void b(String str, String str2, String str3, String str4, String str5, String str6, Supplier supplier) {
        if (str == null) {
            str = "^finals2000A\\.[^.]*$";
        }
        zj.s sVar = zj.s.f33453b;
        c(sVar, new o1(true, str, this.f20049a, supplier));
        zj.s sVar2 = zj.s.f33454c;
        c(sVar2, new o1(true, str, this.f20049a, supplier));
        if (str2 == null) {
            str2 = "^(:finals2000A|eopc04_\\d\\d_IAU2000)\\..*\\.xml$";
        }
        c(sVar, new f0(str2, this.f20049a, supplier));
        c(sVar2, new f0(str2, this.f20049a, supplier));
        if (str3 == null) {
            str3 = "^eopc04(_\\d\\d_IAU2000)?\\.\\d\\d$";
        }
        c(sVar, new a0(str3, this.f20049a, supplier));
        c(sVar2, new a0(str3, this.f20049a, supplier));
        if (str4 == null) {
            str4 = "^bulletinb(_IAU2000)?((-\\d\\d\\d\\.txt)|(\\.\\d\\d\\d))$";
        }
        c(sVar, new e(str4, this.f20049a, supplier));
        c(sVar2, new e(str4, this.f20049a, supplier));
        if (str5 == null) {
            str5 = "^bulletina-[ivxlcdm]+-\\d\\d\\d\\.txt$";
        }
        c(sVar, new d(str5, this.f20049a, supplier));
        c(sVar2, new d(str5, this.f20049a, supplier));
        if (str6 == null) {
            str6 = "^(?:eopc04|bulletina|bulletinb).*\\.csv$";
        }
        c(sVar, new b0(str6, this.f20049a, supplier));
        c(sVar2, new b0(str6, this.f20049a, supplier));
    }

    public void c(zj.s sVar, d0 d0Var) {
        synchronized (this.f20050b) {
            try {
                if (!this.f20050b.containsKey(sVar)) {
                    this.f20050b.put(sVar, new ArrayList());
                }
                ((List) this.f20050b.get(sVar)).add(d0Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public gj.g d() {
        return this.f20049a;
    }

    public z e(zj.s sVar, boolean z10, final yj.c0 c0Var) throws Throwable {
        d1 d1Var;
        synchronized (this.f20050b) {
            try {
                try {
                    if (this.f20050b.isEmpty()) {
                        Objects.requireNonNull(c0Var);
                        Supplier supplier = new Supplier() { // from class: kj.c1
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return c0Var.e();
                            }
                        };
                        b(null, null, null, null, null, null, supplier);
                        d1Var = this;
                        d1Var.a(null, null, null, null, null, null, supplier);
                    } else {
                        d1Var = this;
                    }
                    TreeSet treeSet = new TreeSet(new yj.g());
                    hj.a aVar = null;
                    if (d1Var.f20050b.containsKey(sVar)) {
                        Iterator it = ((List) d1Var.f20050b.get(sVar)).iterator();
                        while (it.hasNext()) {
                            try {
                                ((d0) it.next()).a(sVar.n(c0Var), treeSet);
                            } catch (hj.a e10) {
                                aVar = e10;
                            }
                        }
                    }
                    if (treeSet.isEmpty() && aVar != null) {
                        throw aVar;
                    }
                    z zVar = new z(sVar, d1Var.f20052d, treeSet, z10, c0Var);
                    zVar.f(d1Var.f20051c);
                    return zVar;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }
}
