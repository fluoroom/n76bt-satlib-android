package fh;

import ed.q;

/* JADX INFO: loaded from: classes3.dex */
final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yd.c f13097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f13098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f13099c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yd.c cVar, Object obj, f fVar) {
        super(null);
        rd.m.e(cVar, "key");
        rd.m.e(obj, "value");
        rd.m.e(fVar, "next");
        this.f13097a = cVar;
        this.f13098b = obj;
        this.f13099c = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e e(e eVar) {
        rd.m.e(eVar, "it");
        f fVar = eVar.f13099c;
        if (fVar instanceof e) {
            return (e) fVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence f(e eVar) {
        rd.m.e(eVar, "it");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(eVar.f13097a);
        sb2.append('=');
        sb2.append(eVar.f13098b);
        return sb2.toString();
    }

    @Override // fh.f
    public Object a(yd.c cVar) {
        rd.m.e(cVar, "key");
        return rd.m.a(cVar, this.f13097a) ? pd.a.b(cVar).cast(this.f13098b) : this.f13099c.a(cVar);
    }

    @Override // fh.f
    public f b(yd.c cVar, Object obj) {
        f eVar;
        rd.m.e(cVar, "key");
        if (rd.m.a(cVar, this.f13097a)) {
            eVar = this.f13099c;
        } else {
            f fVarB = this.f13099c.b(cVar, null);
            eVar = fVarB == this.f13099c ? this : new e(this.f13097a, this.f13098b, fVarB);
        }
        return obj != null ? new e(cVar, obj, eVar) : eVar;
    }

    public String toString() {
        return q.i0(q.u0(qg.k.O(qg.k.n(this, new qd.l() { // from class: fh.c
            @Override // qd.l
            public final Object l(Object obj) {
                return e.e((e) obj);
            }
        }))), null, "{", "}", 0, null, new qd.l() { // from class: fh.d
            @Override // qd.l
            public final Object l(Object obj) {
                return e.f((e) obj);
            }
        }, 25, null);
    }
}
