package k2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k2.i;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f19107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0.d f19108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f19109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f19110d;

    public t(Class cls, Class cls2, Class cls3, List list, l0.d dVar) {
        this.f19107a = cls;
        this.f19108b = dVar;
        this.f19109c = (List) e3.k.d(list);
        this.f19110d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v b(com.bumptech.glide.load.data.e eVar, i2.h hVar, int i10, int i11, i.a aVar, List list) throws q {
        int size = this.f19109c.size();
        v vVarA = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                vVarA = ((i) this.f19109c.get(i12)).a(eVar, i10, i11, hVar, aVar);
            } catch (q e10) {
                list.add(e10);
            }
            if (vVarA != null) {
                break;
            }
        }
        if (vVarA != null) {
            return vVarA;
        }
        throw new q(this.f19110d, new ArrayList(list));
    }

    public v a(com.bumptech.glide.load.data.e eVar, i2.h hVar, int i10, int i11, i.a aVar) {
        List list = (List) e3.k.e((List) this.f19108b.b());
        try {
            return b(eVar, hVar, i10, i11, aVar, list);
        } finally {
            this.f19108b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f19109c.toArray()) + '}';
    }
}
