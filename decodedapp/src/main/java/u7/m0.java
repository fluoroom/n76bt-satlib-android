package u7;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t7.f f28465c;

    public m0(t7.f fVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f28465c = fVar;
    }

    @Override // t7.g
    public final com.google.android.gms.common.api.internal.a a(com.google.android.gms.common.api.internal.a aVar) {
        return this.f28465c.l(aVar);
    }

    @Override // t7.g
    public final Looper c() {
        return this.f28465c.q();
    }
}
