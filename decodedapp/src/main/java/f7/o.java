package f7;

import g7.b0;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import p6.c0;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class o extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f12882d = new o();

    protected o() {
        super(Collection.class);
    }

    private final void C(Collection collection, e6.g gVar, d0 d0Var) throws IOException {
        int i10 = 0;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str == null) {
                    d0Var.N(gVar);
                } else {
                    gVar.d1(str);
                }
                i10++;
            }
        } catch (Exception e10) {
            v(d0Var, e10, collection, i10);
        }
    }

    @Override // g7.i0, p6.p
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void f(Collection collection, e6.g gVar, d0 d0Var) throws IOException {
        int size = collection.size();
        if (size == 1 && ((this.f13573c == null && d0Var.y0(c0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.f13573c == Boolean.TRUE)) {
            C(collection, gVar, d0Var);
            return;
        }
        gVar.Y0(collection, size);
        C(collection, gVar, d0Var);
        gVar.z0();
    }

    @Override // p6.p
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void g(Collection collection, e6.g gVar, d0 d0Var, a7.h hVar) throws IOException {
        n6.c cVarG = hVar.g(gVar, hVar.d(collection, e6.m.START_ARRAY));
        gVar.H(collection);
        C(collection, gVar, d0Var);
        hVar.h(gVar, cVarG);
    }

    @Override // g7.b0
    public p6.p x(p6.d dVar, Boolean bool) {
        return new o(this, bool);
    }

    protected o(o oVar, Boolean bool) {
        super(oVar, bool);
    }
}
