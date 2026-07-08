package q7;

import com.google.android.gms.common.api.Status;
import t7.a;

/* JADX INFO: loaded from: classes.dex */
final class m extends n {
    m(t7.g gVar) {
        super(gVar);
    }

    @Override // com.google.android.gms.common.api.internal.a
    protected final /* bridge */ /* synthetic */ void k(a.b bVar) {
        i iVar = (i) bVar;
        ((u) iVar.C()).v1(new l(this), iVar.k0());
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ t7.k c(Status status) {
        return status;
    }
}
