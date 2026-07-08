package qb;

import java.util.Map;
import qb.g1;
import qb.q0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r0 extends q0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g1.b f24739a = g1.b.a(new a());

    private static final class a {
        a() {
        }

        public String toString() {
            return "service config is unused";
        }
    }

    public abstract String b();

    public abstract int c();

    public abstract boolean d();

    public abstract g1.b e(Map map);

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        return r9.g.b(this).d("policy", b()).b("priority", c()).e("available", d()).toString();
    }
}
