package kj;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class z1 implements zj.j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b2 f20297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f20298c;

    public z1(int i10, b2 b2Var, double d10) {
        this.f20296a = i10;
        this.f20297b = b2Var;
        this.f20298c = d10;
    }

    @Override // zj.j1
    public List b(yj.b bVar, yj.b bVar2) {
        ArrayList arrayList = new ArrayList();
        if (bVar == null) {
            for (int i10 = 0; i10 < this.f20296a; i10++) {
                arrayList.add(this.f20297b.b(bVar2.a(((double) i10) * this.f20298c)));
            }
        } else if (bVar2.compareTo(bVar) > 0) {
            do {
                bVar = bVar.a(this.f20298c);
                arrayList.add(arrayList.size(), this.f20297b.b(bVar));
            } while (bVar.compareTo(bVar2) <= 0);
        } else {
            do {
                bVar = bVar.a(-this.f20298c);
                arrayList.add(0, this.f20297b.b(bVar));
            } while (bVar.compareTo(bVar2) >= 0);
        }
        return arrayList;
    }
}
