package k2;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f19020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f19021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w2.e f19022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l0.d f19023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f19024e;

    interface a {
        v a(v vVar);
    }

    public i(Class cls, Class cls2, Class cls3, List list, w2.e eVar, l0.d dVar) {
        this.f19020a = cls;
        this.f19021b = list;
        this.f19022c = eVar;
        this.f19023d = dVar;
        this.f19024e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v b(com.bumptech.glide.load.data.e eVar, int i10, int i11, i2.h hVar) {
        List list = (List) e3.k.e((List) this.f19023d.b());
        try {
            return c(eVar, i10, i11, hVar, list);
        } finally {
            this.f19023d.a(list);
        }
    }

    private v c(com.bumptech.glide.load.data.e eVar, int i10, int i11, i2.h hVar, List list) throws q {
        int size = this.f19021b.size();
        v vVarB = null;
        for (int i12 = 0; i12 < size; i12++) {
            i2.j jVar = (i2.j) this.f19021b.get(i12);
            try {
                if (jVar.a(eVar.a(), hVar)) {
                    vVarB = jVar.b(eVar.a(), i10, i11, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e10);
                }
                list.add(e10);
            }
            if (vVarB != null) {
                break;
            }
        }
        if (vVarB != null) {
            return vVarB;
        }
        throw new q(this.f19024e, new ArrayList(list));
    }

    public v a(com.bumptech.glide.load.data.e eVar, int i10, int i11, i2.h hVar, a aVar) {
        return this.f19022c.a(aVar.a(b(eVar, i10, i11, hVar)), hVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f19020a + ", decoders=" + this.f19021b + ", transcoder=" + this.f19022c + '}';
    }
}
