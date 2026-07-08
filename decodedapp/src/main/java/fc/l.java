package fc;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class l implements a, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f12930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f12931b;

    l(a aVar) {
        this.f12930a = new WeakReference(aVar);
    }

    @Override // fc.a
    public void Q0(Object obj) {
        a aVar = (a) this.f12930a.get();
        if (aVar != null) {
            aVar.Q0(obj);
        } else {
            this.f12931b.cancel();
        }
    }

    @Override // fc.g
    public a a() {
        return (a) this.f12930a.get();
    }

    public void b(d dVar) {
        this.f12931b = dVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        a aVar = (a) this.f12930a.get();
        if (aVar == null || aVar != ((l) obj).f12930a.get()) {
            return super.equals(obj);
        }
        return true;
    }

    public int hashCode() {
        a aVar = (a) this.f12930a.get();
        return aVar != null ? aVar.hashCode() : super.hashCode();
    }
}
