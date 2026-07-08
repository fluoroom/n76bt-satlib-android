package v7;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import t7.h;
import v7.p;

/* JADX INFO: loaded from: classes.dex */
final class k0 implements h.a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ t7.h f30422a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ t8.h f30423b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ p.a f30424c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ m0 f30425d;

    k0(t7.h hVar, t8.h hVar2, p.a aVar, m0 m0Var) {
        this.f30422a = hVar;
        this.f30423b = hVar2;
        this.f30424c = aVar;
        this.f30425d = m0Var;
    }

    @Override // t7.h.a
    public final void a(Status status) {
        if (!status.g()) {
            this.f30423b.b(b.a(status));
        } else {
            this.f30423b.c(this.f30424c.a(this.f30422a.b(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
