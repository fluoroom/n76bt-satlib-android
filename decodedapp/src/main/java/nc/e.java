package nc;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends AtomicReference implements kc.b {
    public boolean a(kc.b bVar) {
        return b.f(this, bVar);
    }

    @Override // kc.b
    public boolean d() {
        return b.e((kc.b) get());
    }

    @Override // kc.b
    public void dispose() {
        b.a(this);
    }
}
