package ie;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public static final h a(h hVar, h hVar2) {
        rd.m.e(hVar, "first");
        rd.m.e(hVar2, "second");
        return hVar.isEmpty() ? hVar2 : hVar2.isEmpty() ? hVar : new o(hVar, hVar2);
    }
}
