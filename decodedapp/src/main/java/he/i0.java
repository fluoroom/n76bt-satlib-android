package he;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f15283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f15284b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(List list) {
        super(null);
        rd.m.e(list, "underlyingPropertyNamesToTypes");
        this.f15283a = list;
        this.f15284b = ed.k0.r(c());
    }

    @Override // he.q1
    public boolean a(mf.f fVar) {
        rd.m.e(fVar, "name");
        return this.f15284b.containsKey(fVar);
    }

    public List c() {
        return this.f15283a;
    }

    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + c() + ')';
    }
}
