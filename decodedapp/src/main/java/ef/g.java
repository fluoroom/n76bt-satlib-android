package ef;

import ef.e;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f11966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f11967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f11968c;

    public g(Map map, Map map2, Map map3) {
        rd.m.e(map, "memberAnnotations");
        rd.m.e(map2, "propertyConstants");
        rd.m.e(map3, "annotationParametersDefaultValues");
        this.f11966a = map;
        this.f11967b = map2;
        this.f11968c = map3;
    }

    @Override // ef.e.a
    public Map a() {
        return this.f11966a;
    }

    public final Map b() {
        return this.f11968c;
    }

    public final Map c() {
        return this.f11967b;
    }
}
