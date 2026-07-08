package f7;

import com.fasterxml.jackson.databind.JavaType;
import java.util.Arrays;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final boolean f12855a;

    private static final class a extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f12856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class f12857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p6.p f12858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final p6.p f12859e;

        public a(k kVar, Class cls, p6.p pVar, Class cls2, p6.p pVar2) {
            super(kVar);
            this.f12856b = cls;
            this.f12858d = pVar;
            this.f12857c = cls2;
            this.f12859e = pVar2;
        }

        @Override // f7.k
        public k i(Class cls, p6.p pVar) {
            return new c(this, new f[]{new f(this.f12856b, this.f12858d), new f(this.f12857c, this.f12859e), new f(cls, pVar)});
        }

        @Override // f7.k
        public p6.p j(Class cls) {
            if (cls == this.f12856b) {
                return this.f12858d;
            }
            if (cls == this.f12857c) {
                return this.f12859e;
            }
            return null;
        }
    }

    private static final class b extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f12860b = new b(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f12861c = new b(true);

        protected b(boolean z10) {
            super(z10);
        }

        @Override // f7.k
        public k i(Class cls, p6.p pVar) {
            return new e(this, cls, pVar);
        }

        @Override // f7.k
        public p6.p j(Class cls) {
            return null;
        }
    }

    private static final class c extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f[] f12862b;

        public c(k kVar, f[] fVarArr) {
            super(kVar);
            this.f12862b = fVarArr;
        }

        @Override // f7.k
        public k i(Class cls, p6.p pVar) {
            f[] fVarArr = this.f12862b;
            int length = fVarArr.length;
            if (length == 8) {
                return this.f12855a ? new e(this, cls, pVar) : this;
            }
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, length + 1);
            fVarArr2[length] = new f(cls, pVar);
            return new c(this, fVarArr2);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0057 A[ORIG_RETURN, RETURN] */
        @Override // f7.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p6.p j(java.lang.Class r4) {
            /*
                r3 = this;
                f7.k$f[] r0 = r3.f12862b
                r1 = 0
                r1 = r0[r1]
                java.lang.Class r2 = r1.f12867a
                if (r2 != r4) goto Lc
                p6.p r4 = r1.f12868b
                return r4
            Lc:
                r1 = 1
                r1 = r0[r1]
                java.lang.Class r2 = r1.f12867a
                if (r2 != r4) goto L16
                p6.p r4 = r1.f12868b
                return r4
            L16:
                r1 = 2
                r1 = r0[r1]
                java.lang.Class r2 = r1.f12867a
                if (r2 != r4) goto L20
                p6.p r4 = r1.f12868b
                return r4
            L20:
                int r1 = r0.length
                switch(r1) {
                    case 4: goto L4d;
                    case 5: goto L43;
                    case 6: goto L39;
                    case 7: goto L2f;
                    case 8: goto L25;
                    default: goto L24;
                }
            L24:
                goto L57
            L25:
                r1 = 7
                r1 = r0[r1]
                java.lang.Class r2 = r1.f12867a
                if (r2 != r4) goto L2f
                p6.p r4 = r1.f12868b
                return r4
            L2f:
                r1 = 6
                r1 = r0[r1]
                java.lang.Class r2 = r1.f12867a
                if (r2 != r4) goto L39
                p6.p r4 = r1.f12868b
                return r4
            L39:
                r1 = 5
                r1 = r0[r1]
                java.lang.Class r2 = r1.f12867a
                if (r2 != r4) goto L43
                p6.p r4 = r1.f12868b
                return r4
            L43:
                r1 = 4
                r1 = r0[r1]
                java.lang.Class r2 = r1.f12867a
                if (r2 != r4) goto L4d
                p6.p r4 = r1.f12868b
                return r4
            L4d:
                r1 = 3
                r0 = r0[r1]
                java.lang.Class r1 = r0.f12867a
                if (r1 != r4) goto L57
                p6.p r4 = r0.f12868b
                return r4
            L57:
                r4 = 0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: f7.k.c.j(java.lang.Class):p6.p");
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p6.p f12863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k f12864b;

        public d(p6.p pVar, k kVar) {
            this.f12863a = pVar;
            this.f12864b = kVar;
        }
    }

    private static final class e extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f12865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p6.p f12866c;

        public e(k kVar, Class cls, p6.p pVar) {
            super(kVar);
            this.f12865b = cls;
            this.f12866c = pVar;
        }

        @Override // f7.k
        public k i(Class cls, p6.p pVar) {
            return new a(this, this.f12865b, this.f12866c, cls, pVar);
        }

        @Override // f7.k
        public p6.p j(Class cls) {
            if (cls == this.f12865b) {
                return this.f12866c;
            }
            return null;
        }
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f12867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p6.p f12868b;

        public f(Class cls, p6.p pVar) {
            this.f12867a = cls;
            this.f12868b = pVar;
        }
    }

    protected k(boolean z10) {
        this.f12855a = z10;
    }

    public static k c() {
        return b.f12860b;
    }

    public final d a(JavaType javaType, p6.p pVar) {
        return new d(pVar, i(javaType.r(), pVar));
    }

    public final d b(Class cls, p6.p pVar) {
        return new d(pVar, i(cls, pVar));
    }

    public final d d(Class cls, d0 d0Var, p6.d dVar) {
        p6.p pVarT = d0Var.T(cls, dVar);
        return new d(pVarT, i(cls, pVarT));
    }

    public final d e(JavaType javaType, d0 d0Var, p6.d dVar) {
        p6.p pVarZ = d0Var.Z(javaType, dVar);
        return new d(pVarZ, i(javaType.r(), pVarZ));
    }

    public final d f(Class cls, d0 d0Var, p6.d dVar) {
        p6.p pVarA0 = d0Var.a0(cls, dVar);
        return new d(pVarA0, i(cls, pVarA0));
    }

    public final d g(JavaType javaType, d0 d0Var, p6.d dVar) {
        p6.p pVarQ = d0Var.Q(javaType, dVar);
        return new d(pVarQ, i(javaType.r(), pVarQ));
    }

    public final d h(Class cls, d0 d0Var, p6.d dVar) {
        p6.p pVarR = d0Var.R(cls, dVar);
        return new d(pVarR, i(cls, pVarR));
    }

    public abstract k i(Class cls, p6.p pVar);

    public abstract p6.p j(Class cls);

    protected k(k kVar) {
        this.f12855a = kVar.f12855a;
    }
}
