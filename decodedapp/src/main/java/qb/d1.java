package qb;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class d1 {
    public static void a(e1 e1Var, t0 t0Var, long j10, List list, List list2) {
        boolean z10 = false;
        r9.l.h(list != null && list.size() == t0Var.c().size(), "Incorrect number of required labels provided. Expected: %s", t0Var.c().size());
        if (list2 != null && list2.size() == t0Var.b().size()) {
            z10 = true;
        }
        r9.l.h(z10, "Incorrect number of optional labels provided. Expected: %s", t0Var.b().size());
    }

    public static void b(e1 e1Var, u0 u0Var, long j10, List list, List list2) {
        boolean z10 = false;
        r9.l.h(list != null && list.size() == u0Var.c().size(), "Incorrect number of required labels provided. Expected: %s", u0Var.c().size());
        if (list2 != null && list2.size() == u0Var.b().size()) {
            z10 = true;
        }
        r9.l.h(z10, "Incorrect number of optional labels provided. Expected: %s", u0Var.b().size());
    }
}
