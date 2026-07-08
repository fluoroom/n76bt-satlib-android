package ne;

import java.util.ArrayList;
import java.util.List;
import ne.h;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends h implements cf.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f22705c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(mf.f fVar, Object[] objArr) {
        super(fVar, null);
        rd.m.e(objArr, "values");
        this.f22705c = objArr;
    }

    @Override // cf.e
    public List getElements() {
        Object[] objArr = this.f22705c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            h.a aVar = h.f22699b;
            rd.m.b(obj);
            arrayList.add(aVar.a(obj, null));
        }
        return arrayList;
    }
}
