package w1;

import e6.n;
import j$.time.Instant;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class f implements x1.d, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f31058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Instant f31059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Instant f31060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Instant f31061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f31062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f31063h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final n f31064r;

    f(String str, String str2, List list, Instant instant, Instant instant2, Instant instant3, String str3, Map map, n nVar) {
        this.f31056a = str;
        this.f31057b = str2;
        this.f31058c = list != null ? DesugarCollections.unmodifiableList(list) : null;
        this.f31059d = instant;
        this.f31060e = instant2;
        this.f31061f = instant3;
        this.f31062g = str3;
        this.f31063h = map != null ? DesugarCollections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.f31064r = nVar;
    }

    @Override // x1.d
    public x1.a a(String str) {
        return d.b(str, this.f31063h, this.f31064r);
    }
}
