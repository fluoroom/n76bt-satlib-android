package g8;

import com.google.android.gms.common.api.Status;
import j$.util.Objects;
import u7.u;

/* JADX INFO: loaded from: classes.dex */
final class c extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ t8.h f13671c;

    c(e eVar, t8.h hVar) {
        this.f13671c = hVar;
        Objects.requireNonNull(eVar);
    }

    @Override // g8.r
    public final void A(Status status, n7.b bVar) {
        u.a(status, bVar, this.f13671c);
    }
}
