package rg;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface l {

    public static final class a {
        public static b a(l lVar) {
            return new b(lVar);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l f26066a;

        public b(l lVar) {
            rd.m.e(lVar, "match");
            this.f26066a = lVar;
        }

        public final l a() {
            return this.f26066a;
        }
    }

    b a();

    List b();

    k c();

    xd.c d();
}
