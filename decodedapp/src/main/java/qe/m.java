package qe;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p f25029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o f25030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f25031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private n f25032d;

    public m(p pVar, o oVar) {
        rd.m.e(pVar, "type");
        this.f25029a = pVar;
        this.f25030b = oVar;
        this.f25031c = new ArrayList(1);
    }

    public final List a() {
        return this.f25031c;
    }

    public final void b(n nVar) {
        this.f25032d = nVar;
    }
}
