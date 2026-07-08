package u6;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class b extends g0 {
    public b() {
        super(AtomicBoolean.class);
    }

    @Override // p6.l
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public AtomicBoolean e(e6.j jVar, p6.h hVar) throws v6.f {
        e6.m mVarN = jVar.n();
        if (mVarN == e6.m.VALUE_TRUE) {
            return new AtomicBoolean(true);
        }
        if (mVarN == e6.m.VALUE_FALSE) {
            return new AtomicBoolean(false);
        }
        Boolean boolP0 = p0(jVar, hVar, AtomicBoolean.class);
        if (boolP0 == null) {
            return null;
        }
        return new AtomicBoolean(boolP0.booleanValue());
    }

    @Override // p6.l
    public Object k(p6.h hVar) {
        return new AtomicBoolean(false);
    }

    @Override // u6.g0, p6.l
    public h7.c r() {
        return h7.c.Boolean;
    }
}
