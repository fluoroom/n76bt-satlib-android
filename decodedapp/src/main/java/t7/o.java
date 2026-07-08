package t7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes.dex */
final class o extends BasePendingResult {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final k f27603n;

    public o(g gVar, k kVar) {
        super(gVar);
        this.f27603n = kVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final k c(Status status) {
        return this.f27603n;
    }
}
