package ve;

import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumMap f30578a;

    public f0(EnumMap enumMap) {
        rd.m.e(enumMap, "defaultQualifiers");
        this.f30578a = enumMap;
    }

    public final w a(c cVar) {
        return (w) this.f30578a.get(cVar);
    }

    public final EnumMap b() {
        return this.f30578a;
    }
}
