package v7;

import android.content.Context;
import android.util.SparseIntArray;
import t7.a;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseIntArray f30406a = new SparseIntArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s7.e f30407b;

    public h0(s7.e eVar) {
        q.i(eVar);
        this.f30407b = eVar;
    }

    public final int a(Context context, int i10) {
        return this.f30406a.get(i10, -1);
    }

    public final int b(Context context, a.f fVar) {
        q.i(context);
        q.i(fVar);
        int iG = 0;
        if (!fVar.j()) {
            return 0;
        }
        int iK = fVar.k();
        int iA = a(context, iK);
        if (iA != -1) {
            return iA;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.f30406a.size()) {
                iG = -1;
                break;
            }
            int iKeyAt = this.f30406a.keyAt(i10);
            if (iKeyAt > iK && this.f30406a.get(iKeyAt) == 0) {
                break;
            }
            i10++;
        }
        if (iG == -1) {
            iG = this.f30407b.g(context, iK);
        }
        this.f30406a.put(iK, iG);
        return iG;
    }

    public final void c() {
        this.f30406a.clear();
    }
}
