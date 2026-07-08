package lf;

import ed.q;
import ed.r0;
import java.util.List;
import java.util.Set;
import kf.a;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a.e f20562h;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(a.e eVar, String[] strArr) {
        Set setM0;
        m.e(eVar, "types");
        m.e(strArr, "strings");
        List listS = eVar.s();
        if (listS.isEmpty()) {
            setM0 = r0.d();
        } else {
            m.b(listS);
            setM0 = q.M0(listS);
        }
        List listT = eVar.t();
        m.d(listT, "getRecordList(...)");
        super(strArr, setM0, g.a(listT));
        this.f20562h = eVar;
    }
}
