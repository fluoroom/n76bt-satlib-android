package c1;

import android.os.Bundle;
import dd.q;
import dd.w;
import ed.k0;
import i0.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import l1.f;
import l1.j;
import rd.h;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f4276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f4277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f4278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f4279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f.b f4280e;

    public b(Map map) {
        m.e(map, "initialState");
        this.f4276a = k0.v(map);
        this.f4277b = new LinkedHashMap();
        this.f4278c = new LinkedHashMap();
        this.f4279d = new LinkedHashMap();
        this.f4280e = new f.b() { // from class: c1.a
            @Override // l1.f.b
            public final Bundle a() {
                return b.c(this.f4275a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle c(b bVar) {
        q[] qVarArr;
        for (Map.Entry entry : k0.t(bVar.f4279d).entrySet()) {
            bVar.d((String) entry.getKey(), ((vg.a) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : k0.t(bVar.f4277b).entrySet()) {
            bVar.d((String) entry2.getKey(), ((f.b) entry2.getValue()).a());
        }
        Map map = bVar.f4276a;
        if (map.isEmpty()) {
            qVarArr = new q[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry3 : map.entrySet()) {
                arrayList.add(w.a((String) entry3.getKey(), entry3.getValue()));
            }
            qVarArr = (q[]) arrayList.toArray(new q[0]);
        }
        Bundle bundleA = c.a((q[]) Arrays.copyOf(qVarArr, qVarArr.length));
        j.a(bundleA);
        return bundleA;
    }

    public final f.b b() {
        return this.f4280e;
    }

    public final void d(String str, Object obj) {
        m.e(str, "key");
        this.f4276a.put(str, obj);
        vg.a aVar = (vg.a) this.f4278c.get(str);
        if (aVar != null) {
            aVar.setValue(obj);
        }
        vg.a aVar2 = (vg.a) this.f4279d.get(str);
        if (aVar2 != null) {
            aVar2.setValue(obj);
        }
    }

    public /* synthetic */ b(Map map, int i10, h hVar) {
        this((i10 & 1) != 0 ? k0.i() : map);
    }
}
