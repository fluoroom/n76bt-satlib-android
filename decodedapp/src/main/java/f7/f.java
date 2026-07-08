package f7;

import g7.b0;
import java.io.IOException;
import java.util.List;
import p6.c0;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f12835d = new f();

    protected f() {
        super(List.class);
    }

    private final void C(List list, e6.g gVar, d0 d0Var, int i10) throws IOException {
        for (int i11 = 0; i11 < i10; i11++) {
            try {
                String str = (String) list.get(i11);
                if (str == null) {
                    d0Var.N(gVar);
                } else {
                    gVar.d1(str);
                }
            } catch (Exception e10) {
                v(d0Var, e10, list, i11);
                return;
            }
        }
    }

    @Override // g7.i0, p6.p
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void f(List list, e6.g gVar, d0 d0Var) throws IOException {
        int size = list.size();
        if (size == 1 && ((this.f13573c == null && d0Var.y0(c0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.f13573c == Boolean.TRUE)) {
            C(list, gVar, d0Var, 1);
            return;
        }
        gVar.Y0(list, size);
        C(list, gVar, d0Var, size);
        gVar.z0();
    }

    @Override // p6.p
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void g(List list, e6.g gVar, d0 d0Var, a7.h hVar) throws IOException {
        n6.c cVarG = hVar.g(gVar, hVar.d(list, e6.m.START_ARRAY));
        gVar.H(list);
        C(list, gVar, d0Var, list.size());
        hVar.h(gVar, cVarG);
    }

    @Override // g7.b0
    public p6.p x(p6.d dVar, Boolean bool) {
        return new f(this, bool);
    }

    public f(f fVar, Boolean bool) {
        super(fVar, bool);
    }
}
