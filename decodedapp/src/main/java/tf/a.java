package tf;

import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        m.e(aVar, "other");
        int iCompareTo = d().compareTo(aVar.d());
        if (iCompareTo == 0 && !e() && aVar.e()) {
            return 1;
        }
        return iCompareTo;
    }

    public abstract b d();

    public abstract boolean e();
}
