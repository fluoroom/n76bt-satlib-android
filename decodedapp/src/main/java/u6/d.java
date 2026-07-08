package u6;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class d extends g0 {
    public d() {
        super(AtomicLong.class);
    }

    @Override // p6.l
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public AtomicLong e(e6.j jVar, p6.h hVar) {
        if (jVar.R0()) {
            return new AtomicLong(jVar.u0());
        }
        if (E0(jVar, hVar, AtomicLong.class) == null) {
            return null;
        }
        return new AtomicLong(r3.intValue());
    }

    @Override // p6.l
    public Object k(p6.h hVar) {
        return new AtomicLong();
    }

    @Override // u6.g0, p6.l
    public h7.c r() {
        return h7.c.Integer;
    }
}
