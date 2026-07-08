package ag;

import eg.c1;

/* JADX INFO: loaded from: classes3.dex */
public interface x {

    public static final class a implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f606a = new a();

        private a() {
        }

        @Override // ag.x
        public eg.r0 a(gf.r rVar, String str, c1 c1Var, c1 c1Var2) {
            rd.m.e(rVar, "proto");
            rd.m.e(str, "flexibleId");
            rd.m.e(c1Var, "lowerBound");
            rd.m.e(c1Var2, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    eg.r0 a(gf.r rVar, String str, c1 c1Var, c1 c1Var2);
}
