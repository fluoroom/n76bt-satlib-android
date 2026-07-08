package ke;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f19632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f19633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f19634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f19635d;

    public c0(List list, Set set, List list2, Set set2) {
        rd.m.e(list, "allDependencies");
        rd.m.e(set, "modulesWhoseInternalsAreVisible");
        rd.m.e(list2, "directExpectedByDependencies");
        rd.m.e(set2, "allExpectedByDependencies");
        this.f19632a = list;
        this.f19633b = set;
        this.f19634c = list2;
        this.f19635d = set2;
    }

    @Override // ke.b0
    public List a() {
        return this.f19632a;
    }

    @Override // ke.b0
    public Set b() {
        return this.f19633b;
    }

    @Override // ke.b0
    public List c() {
        return this.f19634c;
    }
}
