package u6;

/* JADX INFO: loaded from: classes.dex */
public class a0 extends g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final p6.l f28194e;

    public static final class a {
    }

    public a0() {
        this(null);
    }

    public static p6.l e1(p6.h hVar) {
        return hVar == null ? new a0() : new a0(hVar.T(hVar.G(a.class)));
    }

    protected StackTraceElement f1(p6.h hVar, a aVar) {
        throw null;
    }

    @Override // p6.l
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public StackTraceElement e(e6.j jVar, p6.h hVar) throws p6.m {
        e6.m mVarN = jVar.n();
        if (mVarN == e6.m.START_OBJECT || mVarN == e6.m.FIELD_NAME) {
            p6.l lVar = this.f28194e;
            if (lVar == null) {
                android.support.v4.media.session.b.a(hVar.L0(jVar, a.class));
            } else {
                android.support.v4.media.session.b.a(lVar.e(jVar, hVar));
            }
            return f1(hVar, null);
        }
        if (mVarN != e6.m.START_ARRAY || !hVar.D0(p6.i.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            return (StackTraceElement) hVar.s0(this.f28200a, jVar);
        }
        jVar.X0();
        StackTraceElement stackTraceElementE = e(jVar, hVar);
        if (jVar.X0() != e6.m.END_ARRAY) {
            Z0(jVar, hVar);
        }
        return stackTraceElementE;
    }

    protected a0(p6.l lVar) {
        super(StackTraceElement.class);
        this.f28194e = lVar;
    }
}
