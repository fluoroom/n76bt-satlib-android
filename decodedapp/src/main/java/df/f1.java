package df;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q1 f10967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f10968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f10969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f1 f10970d;

    public f1(q1 q1Var, List list, String str) {
        rd.m.e(list, "parametersInfo");
        this.f10967a = q1Var;
        this.f10968b = list;
        this.f10969c = str;
        f1 f1Var = null;
        if (str != null) {
            q1 q1VarA = q1Var != null ? q1Var.a() : null;
            ArrayList arrayList = new ArrayList(ed.q.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                q1 q1Var2 = (q1) it.next();
                arrayList.add(q1Var2 != null ? q1Var2.a() : null);
            }
            f1Var = new f1(q1VarA, arrayList, null);
        }
        this.f10970d = f1Var;
    }

    public final String a() {
        return this.f10969c;
    }

    public final List b() {
        return this.f10968b;
    }

    public final q1 c() {
        return this.f10967a;
    }

    public final f1 d() {
        return this.f10970d;
    }
}
