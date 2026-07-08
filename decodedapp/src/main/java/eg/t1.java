package eg;

import java.util.ArrayDeque;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f12182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f12183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f12184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f12185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ig.r f12186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final q f12187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r f12188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f12189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f12190i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayDeque f12191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Set f12192k;

    public interface a {

        /* JADX INFO: renamed from: eg.t1$a$a, reason: collision with other inner class name */
        public static final class C0165a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f12193a;

            @Override // eg.t1.a
            public void a(qd.a aVar) {
                rd.m.e(aVar, "block");
                if (this.f12193a) {
                    return;
                }
                this.f12193a = ((Boolean) aVar.a()).booleanValue();
            }

            public final boolean b() {
                return this.f12193a;
            }
        }

        void a(qd.a aVar);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12194a = new b("CHECK_ONLY_LOWER", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f12195b = new b("CHECK_SUBTYPE_AND_LOWER", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f12196c = new b("SKIP_LOWER", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f12197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kd.a f12198e;

        static {
            b[] bVarArrA = a();
            f12197d = bVarArrA;
            f12198e = kd.b.a(bVarArrA);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f12194a, f12195b, f12196c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f12197d.clone();
        }
    }

    public static abstract class c {

        public static abstract class a extends c {
            public a() {
                super(null);
            }
        }

        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f12199a = new b();

            private b() {
                super(null);
            }

            @Override // eg.t1.c
            public ig.j a(t1 t1Var, ig.i iVar) {
                rd.m.e(t1Var, "state");
                rd.m.e(iVar, "type");
                return t1Var.j().C(iVar);
            }
        }

        /* JADX INFO: renamed from: eg.t1$c$c, reason: collision with other inner class name */
        public static final class C0166c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0166c f12200a = new C0166c();

            private C0166c() {
                super(null);
            }

            @Override // eg.t1.c
            public /* bridge */ /* synthetic */ ig.j a(t1 t1Var, ig.i iVar) {
                return (ig.j) b(t1Var, iVar);
            }

            public Void b(t1 t1Var, ig.i iVar) {
                rd.m.e(t1Var, "state");
                rd.m.e(iVar, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        public static final class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f12201a = new d();

            private d() {
                super(null);
            }

            @Override // eg.t1.c
            public ig.j a(t1 t1Var, ig.i iVar) {
                rd.m.e(t1Var, "state");
                rd.m.e(iVar, "type");
                return t1Var.j().N(iVar);
            }
        }

        public /* synthetic */ c(rd.h hVar) {
            this();
        }

        public abstract ig.j a(t1 t1Var, ig.i iVar);

        private c() {
        }
    }

    public t1(boolean z10, boolean z11, boolean z12, boolean z13, ig.r rVar, q qVar, r rVar2) {
        rd.m.e(rVar, "typeSystemContext");
        rd.m.e(qVar, "kotlinTypePreparator");
        rd.m.e(rVar2, "kotlinTypeRefiner");
        this.f12182a = z10;
        this.f12183b = z11;
        this.f12184c = z12;
        this.f12185d = z13;
        this.f12186e = rVar;
        this.f12187f = qVar;
        this.f12188g = rVar2;
    }

    public static /* synthetic */ Boolean d(t1 t1Var, ig.i iVar, ig.i iVar2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return t1Var.c(iVar, iVar2, z10);
    }

    public Boolean c(ig.i iVar, ig.i iVar2, boolean z10) {
        rd.m.e(iVar, "subType");
        rd.m.e(iVar2, "superType");
        return null;
    }

    public final void e() {
        ArrayDeque arrayDeque = this.f12191j;
        rd.m.b(arrayDeque);
        arrayDeque.clear();
        Set set = this.f12192k;
        rd.m.b(set);
        set.clear();
        this.f12190i = false;
    }

    public boolean f(ig.i iVar, ig.i iVar2) {
        rd.m.e(iVar, "subType");
        rd.m.e(iVar2, "superType");
        return true;
    }

    public b g(ig.j jVar, ig.d dVar) {
        rd.m.e(jVar, "subType");
        rd.m.e(dVar, "superType");
        return b.f12195b;
    }

    public final ArrayDeque h() {
        return this.f12191j;
    }

    public final Set i() {
        return this.f12192k;
    }

    public final ig.r j() {
        return this.f12186e;
    }

    public final void k() {
        this.f12190i = true;
        if (this.f12191j == null) {
            this.f12191j = new ArrayDeque(4);
        }
        if (this.f12192k == null) {
            this.f12192k = og.k.f23578c.a();
        }
    }

    public final boolean l(ig.i iVar) {
        rd.m.e(iVar, "type");
        return this.f12185d && this.f12186e.W(iVar);
    }

    public final boolean m() {
        return this.f12184c;
    }

    public final boolean n() {
        return this.f12182a;
    }

    public final boolean o() {
        return this.f12183b;
    }

    public final ig.i p(ig.i iVar) {
        rd.m.e(iVar, "type");
        return this.f12187f.a(iVar);
    }

    public final ig.i q(ig.i iVar) {
        rd.m.e(iVar, "type");
        return this.f12188g.a(iVar);
    }

    public boolean r(qd.l lVar) {
        rd.m.e(lVar, "block");
        a.C0165a c0165a = new a.C0165a();
        lVar.l(c0165a);
        return c0165a.b();
    }
}
