package u6;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class c extends g0 {
    public c() {
        super(AtomicInteger.class);
    }

    @Override // p6.l
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public AtomicInteger e(e6.j jVar, p6.h hVar) {
        if (jVar.R0()) {
            return new AtomicInteger(jVar.t0());
        }
        Integer numC0 = C0(jVar, hVar, AtomicInteger.class);
        if (numC0 == null) {
            return null;
        }
        return new AtomicInteger(numC0.intValue());
    }

    @Override // p6.l
    public Object k(p6.h hVar) {
        return new AtomicInteger();
    }

    @Override // u6.g0, p6.l
    public h7.c r() {
        return h7.c.Integer;
    }
}
