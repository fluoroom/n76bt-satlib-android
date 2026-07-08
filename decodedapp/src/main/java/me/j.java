package me;

import ag.w;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f21974b = new j();

    private j() {
    }

    @Override // ag.w
    public void a(he.b bVar) {
        rd.m.e(bVar, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + bVar);
    }

    @Override // ag.w
    public void b(he.e eVar, List list) {
        rd.m.e(eVar, "descriptor");
        rd.m.e(list, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + eVar.getName() + ", unresolved classes " + list);
    }
}
