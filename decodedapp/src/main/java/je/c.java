package je;

import he.e;
import he.f1;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public interface c {

    public static final class a implements c {

        /* JADX INFO: renamed from: a */
        public static final a f18651a = new a();

        private a() {
        }

        @Override // je.c
        public boolean a(e eVar, f1 f1Var) {
            m.e(eVar, "classDescriptor");
            m.e(f1Var, "functionDescriptor");
            return true;
        }
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: a */
        public static final b f18652a = new b();

        private b() {
        }

        @Override // je.c
        public boolean a(e eVar, f1 f1Var) {
            m.e(eVar, "classDescriptor");
            m.e(f1Var, "functionDescriptor");
            return !f1Var.getAnnotations().H(d.a());
        }
    }

    boolean a(e eVar, f1 f1Var);
}
