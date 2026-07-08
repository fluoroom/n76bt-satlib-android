package f7;

import java.io.Serializable;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    private static final class a extends e7.c implements Serializable {
        protected final e7.c D;
        protected final Class[] E;

        protected a(e7.c cVar, Class[] clsArr) {
            super(cVar);
            this.D = cVar;
            this.E = clsArr;
        }

        private final boolean L(Class cls) {
            if (cls == null) {
                return true;
            }
            int length = this.E.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.E[i10].isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // e7.c
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public a w(i7.s sVar) {
            return new a(this.D.w(sVar), this.E);
        }

        @Override // e7.c
        public void k(p6.p pVar) {
            this.D.k(pVar);
        }

        @Override // e7.c
        public void l(p6.p pVar) {
            this.D.l(pVar);
        }

        @Override // e7.c
        public void x(Object obj, e6.g gVar, d0 d0Var) {
            if (L(d0Var.h0())) {
                this.D.x(obj, gVar, d0Var);
            } else {
                this.D.C(obj, gVar, d0Var);
            }
        }

        @Override // e7.c
        public void z(Object obj, e6.g gVar, d0 d0Var) {
            if (L(d0Var.h0())) {
                this.D.z(obj, gVar, d0Var);
            } else {
                this.D.A(obj, gVar, d0Var);
            }
        }
    }

    private static final class b extends e7.c implements Serializable {
        protected final e7.c D;
        protected final Class E;

        protected b(e7.c cVar, Class cls) {
            super(cVar);
            this.D = cVar;
            this.E = cls;
        }

        @Override // e7.c
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public b w(i7.s sVar) {
            return new b(this.D.w(sVar), this.E);
        }

        @Override // e7.c
        public void k(p6.p pVar) {
            this.D.k(pVar);
        }

        @Override // e7.c
        public void l(p6.p pVar) {
            this.D.l(pVar);
        }

        @Override // e7.c
        public void x(Object obj, e6.g gVar, d0 d0Var) {
            Class<?> clsH0 = d0Var.h0();
            if (clsH0 == null || this.E.isAssignableFrom(clsH0)) {
                this.D.x(obj, gVar, d0Var);
            } else {
                this.D.C(obj, gVar, d0Var);
            }
        }

        @Override // e7.c
        public void z(Object obj, e6.g gVar, d0 d0Var) {
            Class<?> clsH0 = d0Var.h0();
            if (clsH0 == null || this.E.isAssignableFrom(clsH0)) {
                this.D.z(obj, gVar, d0Var);
            } else {
                this.D.A(obj, gVar, d0Var);
            }
        }
    }

    public static e7.c a(e7.c cVar, Class[] clsArr) {
        return clsArr.length == 1 ? new b(cVar, clsArr[0]) : new a(cVar, clsArr);
    }
}
