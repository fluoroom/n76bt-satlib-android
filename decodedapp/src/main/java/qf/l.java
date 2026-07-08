package qf;

import he.k1;
import he.y0;
import he.z;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class l implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f25141a = new l();

    private l() {
    }

    private static Integer b(he.m mVar, he.m mVar2) {
        int iC = c(mVar2) - c(mVar);
        if (iC != 0) {
            return Integer.valueOf(iC);
        }
        if (i.B(mVar) && i.B(mVar2)) {
            return 0;
        }
        int iCompareTo = mVar.getName().compareTo(mVar2.getName());
        if (iCompareTo != 0) {
            return Integer.valueOf(iCompareTo);
        }
        return null;
    }

    private static int c(he.m mVar) {
        if (i.B(mVar)) {
            return 8;
        }
        if (mVar instanceof he.l) {
            return 7;
        }
        if (mVar instanceof y0) {
            return ((y0) mVar).l0() == null ? 6 : 5;
        }
        if (mVar instanceof z) {
            return ((z) mVar).l0() == null ? 4 : 3;
        }
        if (mVar instanceof he.e) {
            return 2;
        }
        return mVar instanceof k1 ? 1 : 0;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(he.m mVar, he.m mVar2) {
        Integer numB = b(mVar, mVar2);
        if (numB != null) {
            return numB.intValue();
        }
        return 0;
    }
}
