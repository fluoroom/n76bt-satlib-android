package u7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import t7.h;

/* JADX INFO: loaded from: classes.dex */
final class w implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f28528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f28529b;

    w(y yVar, BasePendingResult basePendingResult) {
        this.f28529b = yVar;
        this.f28528a = basePendingResult;
    }

    @Override // t7.h.a
    public final void a(Status status) {
        this.f28529b.f28534a.remove(this.f28528a);
    }
}
