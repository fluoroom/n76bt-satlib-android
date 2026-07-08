package ka;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class h extends ia.f {
    public h(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // ia.f
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ArrayList d() {
        return new ArrayList(super.d());
    }

    public String toString() {
        return a() + "{\n geometries=" + d() + "\n}\n";
    }
}
