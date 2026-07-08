package vh;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a */
    private final boolean f30816a;

    /* JADX INFO: renamed from: b */
    private final boolean f30817b;

    /* JADX INFO: renamed from: c */
    private final e0 f30818c;

    /* JADX INFO: renamed from: d */
    private final Long f30819d;

    /* JADX INFO: renamed from: e */
    private final Long f30820e;

    /* JADX INFO: renamed from: f */
    private final Long f30821f;

    /* JADX INFO: renamed from: g */
    private final Long f30822g;

    /* JADX INFO: renamed from: h */
    private final Map f30823h;

    public j(boolean z10, boolean z11, e0 e0Var, Long l10, Long l11, Long l12, Long l13, Map map) {
        rd.m.e(map, "extras");
        this.f30816a = z10;
        this.f30817b = z11;
        this.f30818c = e0Var;
        this.f30819d = l10;
        this.f30820e = l11;
        this.f30821f = l12;
        this.f30822g = l13;
        this.f30823h = ed.k0.t(map);
    }

    public static /* synthetic */ j b(j jVar, boolean z10, boolean z11, e0 e0Var, Long l10, Long l11, Long l12, Long l13, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = jVar.f30816a;
        }
        if ((i10 & 2) != 0) {
            z11 = jVar.f30817b;
        }
        if ((i10 & 4) != 0) {
            e0Var = jVar.f30818c;
        }
        if ((i10 & 8) != 0) {
            l10 = jVar.f30819d;
        }
        if ((i10 & 16) != 0) {
            l11 = jVar.f30820e;
        }
        if ((i10 & 32) != 0) {
            l12 = jVar.f30821f;
        }
        if ((i10 & 64) != 0) {
            l13 = jVar.f30822g;
        }
        if ((i10 & 128) != 0) {
            map = jVar.f30823h;
        }
        Long l14 = l13;
        Map map2 = map;
        Long l15 = l11;
        Long l16 = l12;
        return jVar.a(z10, z11, e0Var, l10, l15, l16, l14, map2);
    }

    public final j a(boolean z10, boolean z11, e0 e0Var, Long l10, Long l11, Long l12, Long l13, Map map) {
        rd.m.e(map, "extras");
        return new j(z10, z11, e0Var, l10, l11, l12, l13, map);
    }

    public final Long c() {
        return this.f30819d;
    }

    public final e0 d() {
        return this.f30818c;
    }

    public final boolean e() {
        return this.f30817b;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f30816a) {
            arrayList.add("isRegularFile");
        }
        if (this.f30817b) {
            arrayList.add("isDirectory");
        }
        if (this.f30819d != null) {
            arrayList.add("byteCount=" + this.f30819d.longValue());
        }
        if (this.f30820e != null) {
            arrayList.add("createdAt=" + this.f30820e.longValue());
        }
        if (this.f30821f != null) {
            arrayList.add("lastModifiedAt=" + this.f30821f.longValue());
        }
        if (this.f30822g != null) {
            arrayList.add("lastAccessedAt=" + this.f30822g.longValue());
        }
        if (!this.f30823h.isEmpty()) {
            arrayList.add("extras=" + this.f30823h);
        }
        return ed.q.i0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public /* synthetic */ j(boolean z10, boolean z11, e0 e0Var, Long l10, Long l11, Long l12, Long l13, Map map, int i10, rd.h hVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? null : e0Var, (i10 & 8) != 0 ? null : l10, (i10 & 16) != 0 ? null : l11, (i10 & 32) != 0 ? null : l12, (i10 & 64) != 0 ? null : l13, (i10 & 128) != 0 ? ed.k0.i() : map);
    }
}
