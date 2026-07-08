package lg;

import java.util.Arrays;
import java.util.Collection;
import lg.g;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mf.f f20589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rg.o f20590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Collection f20591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qd.l f20592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f[] f20593e;

    static final class a implements qd.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f20594a = new a();

        a() {
        }

        @Override // qd.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void l(he.z zVar) {
            rd.m.e(zVar, "<this>");
            return null;
        }
    }

    static final class b implements qd.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f20595a = new b();

        b() {
        }

        @Override // qd.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void l(he.z zVar) {
            rd.m.e(zVar, "<this>");
            return null;
        }
    }

    static final class c implements qd.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f20596a = new c();

        c() {
        }

        @Override // qd.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void l(he.z zVar) {
            rd.m.e(zVar, "<this>");
            return null;
        }
    }

    private h(mf.f fVar, rg.o oVar, Collection collection, qd.l lVar, f... fVarArr) {
        this.f20589a = fVar;
        this.f20590b = oVar;
        this.f20591c = collection;
        this.f20592d = lVar;
        this.f20593e = fVarArr;
    }

    public final g a(he.z zVar) {
        rd.m.e(zVar, "functionDescriptor");
        for (f fVar : this.f20593e) {
            String strC = fVar.c(zVar);
            if (strC != null) {
                return new g.b(strC);
            }
        }
        String str = (String) this.f20592d.l(zVar);
        return str != null ? new g.b(str) : g.c.f20588b;
    }

    public final boolean b(he.z zVar) {
        rd.m.e(zVar, "functionDescriptor");
        if (this.f20589a != null && !rd.m.a(zVar.getName(), this.f20589a)) {
            return false;
        }
        if (this.f20590b != null) {
            String strD = zVar.getName().d();
            rd.m.d(strD, "asString(...)");
            if (!this.f20590b.c(strD)) {
                return false;
            }
        }
        Collection collection = this.f20591c;
        return collection == null || collection.contains(zVar.getName());
    }

    public /* synthetic */ h(mf.f fVar, f[] fVarArr, qd.l lVar, int i10, rd.h hVar) {
        this(fVar, fVarArr, (i10 & 4) != 0 ? a.f20594a : lVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(mf.f fVar, f[] fVarArr, qd.l lVar) {
        this(fVar, (rg.o) null, (Collection) null, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        rd.m.e(fVar, "name");
        rd.m.e(fVarArr, "checks");
        rd.m.e(lVar, "additionalChecks");
    }

    public /* synthetic */ h(rg.o oVar, f[] fVarArr, qd.l lVar, int i10, rd.h hVar) {
        this(oVar, fVarArr, (i10 & 4) != 0 ? b.f20595a : lVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(rg.o oVar, f[] fVarArr, qd.l lVar) {
        this((mf.f) null, oVar, (Collection) null, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        rd.m.e(oVar, "regex");
        rd.m.e(fVarArr, "checks");
        rd.m.e(lVar, "additionalChecks");
    }

    public /* synthetic */ h(Collection collection, f[] fVarArr, qd.l lVar, int i10, rd.h hVar) {
        this(collection, fVarArr, (i10 & 4) != 0 ? c.f20596a : lVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Collection collection, f[] fVarArr, qd.l lVar) {
        this((mf.f) null, (rg.o) null, collection, lVar, (f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        rd.m.e(collection, "nameList");
        rd.m.e(fVarArr, "checks");
        rd.m.e(lVar, "additionalChecks");
    }
}
