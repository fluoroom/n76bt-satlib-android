package ge;

import he.h0;
import java.util.List;
import ke.f0;
import rd.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends ee.i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final /* synthetic */ yd.j[] f13833k = {c0.f(new rd.w(k.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0))};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f13834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private qd.a f13835i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final dg.i f13836j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13837a = new a("FROM_DEPENDENCIES", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f13838b = new a("FROM_CLASS_LOADER", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f13839c = new a("FALLBACK", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f13840d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kd.a f13841e;

        static {
            a[] aVarArrA = a();
            f13840d = aVarArrA;
            f13841e = kd.b.a(aVarArrA);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f13837a, f13838b, f13839c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f13840d.clone();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h0 f13842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f13843b;

        public b(h0 h0Var, boolean z10) {
            rd.m.e(h0Var, "ownerModuleDescriptor");
            this.f13842a = h0Var;
            this.f13843b = z10;
        }

        public final h0 a() {
            return this.f13842a;
        }

        public final boolean b() {
            return this.f13843b;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13844a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f13837a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f13838b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f13839c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13844a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(dg.n nVar, a aVar) {
        super(nVar);
        rd.m.e(nVar, "storageManager");
        rd.m.e(aVar, "kind");
        this.f13834h = aVar;
        this.f13836j = nVar.d(new h(this, nVar));
        int i10 = c.f13844a[aVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                f(false);
            } else {
                if (i10 != 3) {
                    throw new dd.o();
                }
                f(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u J0(k kVar, dg.n nVar) {
        f0 f0VarS = kVar.s();
        rd.m.d(f0VarS, "getBuiltInsModule(...)");
        return new u(f0VarS, nVar, new j(kVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b K0(k kVar) {
        qd.a aVar = kVar.f13835i;
        if (aVar == null) {
            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
        }
        b bVar = (b) aVar.a();
        kVar.f13835i = null;
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b O0(h0 h0Var, boolean z10) {
        return new b(h0Var, z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ee.i
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public List w() {
        Iterable iterableW = super.w();
        rd.m.d(iterableW, "getClassDescriptorFactories(...)");
        dg.n nVarV = V();
        rd.m.d(nVarV, "getStorageManager(...)");
        f0 f0VarS = s();
        rd.m.d(f0VarS, "getBuiltInsModule(...)");
        return ed.q.r0(iterableW, new g(nVarV, f0VarS, null, 4, null));
    }

    public final u M0() {
        return (u) dg.m.a(this.f13836j, this, f13833k[0]);
    }

    @Override // ee.i
    protected je.c N() {
        return M0();
    }

    public final void N0(h0 h0Var, boolean z10) {
        rd.m.e(h0Var, "moduleDescriptor");
        P0(new i(h0Var, z10));
    }

    public final void P0(qd.a aVar) {
        rd.m.e(aVar, "computation");
        this.f13835i = aVar;
    }

    @Override // ee.i
    protected je.a g() {
        return M0();
    }
}
