package yj;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class g implements Comparator, Serializable {
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(g0 g0Var, g0 g0Var2) {
        return g0Var.getDate().compareTo(g0Var2.getDate());
    }
}
