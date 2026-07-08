package qg;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f25172a;

    public a(h hVar) {
        rd.m.e(hVar, "sequence");
        this.f25172a = new AtomicReference(hVar);
    }

    @Override // qg.h
    public Iterator iterator() {
        h hVar = (h) this.f25172a.getAndSet(null);
        if (hVar != null) {
            return hVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
