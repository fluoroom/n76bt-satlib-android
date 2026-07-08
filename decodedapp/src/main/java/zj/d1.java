package zj;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33362a;

    public d1(int i10) {
        if (i10 < 1) {
            throw new hj.c(ui.d.NUMBER_TOO_SMALL, Integer.valueOf(i10), 1);
        }
        this.f33362a = i10;
    }

    private int a(yj.b bVar, List list) {
        int i10 = 0;
        double dE = bVar.e((yj.g0) list.get(0));
        if (dE < 0.0d) {
            return -1;
        }
        int size = list.size() - 1;
        double dE2 = bVar.e((yj.g0) list.get(list.size() - 1));
        if (dE2 > 0.0d) {
            return list.size();
        }
        while (size - i10 > 1) {
            int iC = aj.d.C(i10 + 1, aj.d.E((int) aj.d.M(((((double) i10) * dE2) - (((double) size) * dE)) / (dE2 - dE)), size - 1));
            double dX = bVar.X(((yj.g0) list.get(iC)).getDate());
            if (dX < 0.0d) {
                size = iC;
                dE2 = dX;
            } else {
                i10 = iC;
                dE = dX;
            }
        }
        return dE2 == 0.0d ? size : i10;
    }

    public List b(yj.b bVar, List list) {
        if (this.f33362a > list.size()) {
            throw new hj.a(hj.f.NOT_ENOUGH_DATA, Integer.valueOf(list.size()));
        }
        int iA = a(bVar, list);
        if (iA < 0) {
            yj.b date = ((yj.g0) list.get(0)).getDate();
            throw new hj.g(hj.f.UNABLE_TO_GENERATE_NEW_DATA_BEFORE, date, bVar, Double.valueOf(date.X(bVar)));
        }
        if (iA < list.size()) {
            int iE = aj.d.E(list.size(), aj.d.C(0, iA - ((this.f33362a - 1) / 2)) + this.f33362a);
            return list.subList(iE - this.f33362a, iE);
        }
        yj.b date2 = ((yj.g0) list.get(list.size() - 1)).getDate();
        throw new hj.g(hj.f.UNABLE_TO_GENERATE_NEW_DATA_AFTER, date2, bVar, Double.valueOf(bVar.X(date2)));
    }
}
