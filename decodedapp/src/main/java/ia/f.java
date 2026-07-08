package ia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f15958a = "MultiGeometry";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f15959b;

    public f(List list) {
        if (list == null) {
            throw new IllegalArgumentException("Geometries cannot be null");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((c) it.next());
        }
        this.f15959b = arrayList;
    }

    @Override // ia.c
    public String a() {
        return this.f15958a;
    }

    public List d() {
        return this.f15959b;
    }
}
