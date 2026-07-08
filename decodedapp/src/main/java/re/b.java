package re;

import java.util.List;
import jf.b;
import of.j;
import rd.m;
import yd.h;
import yd.j;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f25965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b.d f25966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kd.a f25967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f25968d;

    public b(h hVar, b.d dVar, kd.a aVar, List list) {
        m.e(hVar, "flags");
        m.e(dVar, "protoSet");
        m.e(aVar, "entries");
        m.e(list, "flagValues");
        this.f25965a = hVar;
        this.f25966b = dVar;
        this.f25967c = aVar;
        this.f25968d = list;
    }

    public final Enum a(Object obj, j jVar) {
        m.e(jVar, "property");
        return (Enum) this.f25967c.get(((j.a) this.f25966b.d(((Number) this.f25965a.get(obj)).intValue())).getNumber());
    }
}
