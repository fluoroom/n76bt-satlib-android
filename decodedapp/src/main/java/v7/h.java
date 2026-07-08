package v7;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import t7.a;
import t7.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends c implements a.f {
    private final e O;
    private final Set P;
    private final Account Q;

    protected h(Context context, Looper looper, int i10, e eVar, g.a aVar, g.b bVar) {
        this(context, looper, i10, eVar, (u7.d) aVar, (u7.m) bVar);
    }

    private final Set j0(Set set) {
        Set setI0 = i0(set);
        Iterator it = setI0.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setI0;
    }

    @Override // v7.c
    protected final Set B() {
        return this.P;
    }

    @Override // t7.a.f
    public Set d() {
        return o() ? this.P : Collections.EMPTY_SET;
    }

    protected final e h0() {
        return this.O;
    }

    @Override // v7.c
    public final Account t() {
        return this.Q;
    }

    @Override // v7.c
    protected Executor v() {
        return null;
    }

    protected h(Context context, Looper looper, int i10, e eVar, u7.d dVar, u7.m mVar) {
        this(context, looper, i.a(context), s7.d.l(), i10, eVar, (u7.d) q.i(dVar), (u7.m) q.i(mVar));
    }

    protected h(Context context, Looper looper, i iVar, s7.d dVar, int i10, e eVar, u7.d dVar2, u7.m mVar) {
        super(context, looper, iVar, dVar, i10, dVar2 == null ? null : new f0(dVar2), mVar != null ? new g0(mVar) : null, eVar.j());
        this.O = eVar;
        this.Q = eVar.a();
        this.P = j0(eVar.d());
    }

    protected Set i0(Set set) {
        return set;
    }
}
