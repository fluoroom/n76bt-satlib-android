package gj;

import gj.h;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes3.dex */
public class r implements d {
    public static /* synthetic */ InputStream b(h.b bVar) {
        return new GZIPInputStream(bVar.b());
    }

    @Override // gj.d
    public h a(h hVar) {
        String strA = hVar.a();
        final h.b bVarB = hVar.b();
        return strA.endsWith(".gz") ? new h(strA.substring(0, strA.length() - 3), new h.e() { // from class: gj.q
            @Override // gj.h.e
            public final InputStream a() {
                return r.b(bVarB);
            }
        }) : hVar;
    }
}
