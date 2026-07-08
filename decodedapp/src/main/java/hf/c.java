package hf;

import dd.q;
import dd.w;
import gf.n;
import java.io.IOException;
import java.io.InputStream;
import of.g;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final q a(InputStream inputStream) throws IOException {
        n nVarD0;
        m.e(inputStream, "<this>");
        try {
            a aVarA = a.f15342g.a(inputStream);
            if (aVarA.h()) {
                g gVarD = g.d();
                b.a(gVarD);
                nVarD0 = n.d0(inputStream, gVarD);
            } else {
                nVarD0 = null;
            }
            q qVarA = w.a(nVarD0, aVarA);
            od.a.a(inputStream, null);
            return qVarA;
        } finally {
        }
    }
}
