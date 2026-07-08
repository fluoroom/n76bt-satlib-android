package qb;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static c1 f24573e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f24574a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f24575b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b1[] f24576c = new b1[5];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f24577d;

    c1() {
    }

    public static synchronized c1 a() {
        try {
            if (f24573e == null) {
                f24573e = new c1();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24573e;
    }

    private void d() {
        b1[] b1VarArr = this.f24576c;
        this.f24576c = (b1[]) Arrays.copyOf(b1VarArr, b1VarArr.length + 5);
    }

    public t0 b(String str, String str2, String str3, List list, List list2, boolean z10) {
        t0 t0Var;
        r9.l.e(!r9.p.b(str), "missing metric name");
        r9.l.o(str2, "description");
        r9.l.o(str3, "unit");
        r9.l.o(list, "requiredLabelKeys");
        r9.l.o(list2, "optionalLabelKeys");
        synchronized (this.f24574a) {
            try {
                if (this.f24575b.contains(str)) {
                    throw new IllegalStateException("Metric with name " + str + " already exists");
                }
                int i10 = this.f24577d;
                if (i10 + 1 == this.f24576c.length) {
                    d();
                }
                t0Var = new t0(i10, str, str2, str3, list, list2, z10);
                this.f24576c[i10] = t0Var;
                this.f24575b.add(str);
                this.f24577d++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t0Var;
    }

    public u0 c(String str, String str2, String str3, List list, List list2, boolean z10) {
        u0 u0Var;
        r9.l.e(!r9.p.b(str), "missing metric name");
        r9.l.o(str2, "description");
        r9.l.o(str3, "unit");
        r9.l.o(list, "requiredLabelKeys");
        r9.l.o(list2, "optionalLabelKeys");
        synchronized (this.f24574a) {
            try {
                if (this.f24575b.contains(str)) {
                    throw new IllegalStateException("Metric with name " + str + " already exists");
                }
                int i10 = this.f24577d;
                if (i10 + 1 == this.f24576c.length) {
                    d();
                }
                u0Var = new u0(i10, str, str2, str3, list, list2, z10);
                this.f24576c[i10] = u0Var;
                this.f24575b.add(str);
                this.f24577d++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return u0Var;
    }
}
