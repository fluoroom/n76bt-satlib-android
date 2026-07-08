package wh;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import vh.e0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static final void a(vh.k kVar, e0 e0Var, boolean z10) {
        rd.m.e(kVar, "<this>");
        rd.m.e(e0Var, "dir");
        ed.i iVar = new ed.i();
        for (e0 e0VarI = e0Var; e0VarI != null && !kVar.v(e0VarI); e0VarI = e0VarI.i()) {
            iVar.addFirst(e0VarI);
        }
        if (z10 && iVar.isEmpty()) {
            throw new IOException(e0Var + " already exists.");
        }
        Iterator<E> it = iVar.iterator();
        while (it.hasNext()) {
            vh.k.q(kVar, (e0) it.next(), false, 2, null);
        }
    }

    public static final boolean b(vh.k kVar, e0 e0Var) {
        rd.m.e(kVar, "<this>");
        rd.m.e(e0Var, "path");
        return kVar.G(e0Var) != null;
    }

    public static final vh.j c(vh.k kVar, e0 e0Var) throws FileNotFoundException {
        rd.m.e(kVar, "<this>");
        rd.m.e(e0Var, "path");
        vh.j jVarG = kVar.G(e0Var);
        if (jVarG != null) {
            return jVarG;
        }
        throw new FileNotFoundException("no such file: " + e0Var);
    }
}
