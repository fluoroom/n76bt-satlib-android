package jf;

import ed.q;
import gf.w;
import gf.x;
import java.util.List;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f18710b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j f18711c = new j(q.k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f18712a;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final j a(x xVar) {
            m.e(xVar, "table");
            if (xVar.q() == 0) {
                return b();
            }
            List listR = xVar.r();
            m.d(listR, "getRequirementList(...)");
            return new j(listR, null);
        }

        public final j b() {
            return j.f18711c;
        }

        private a() {
        }
    }

    public /* synthetic */ j(List list, rd.h hVar) {
        this(list);
    }

    public final w b(int i10) {
        return (w) q.c0(this.f18712a, i10);
    }

    private j(List list) {
        this.f18712a = list;
    }
}
