package dg;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import rg.q;

/* JADX INFO: loaded from: classes3.dex */
public class f implements dg.n {

    /* JADX INFO: renamed from: d */
    private static final String f11064d = q.V0(f.class.getCanonicalName(), ".", "");

    /* JADX INFO: renamed from: e */
    public static final dg.n f11065e = new a("NO_LOCKS", InterfaceC0148f.f11074a, dg.e.f11063b);

    /* JADX INFO: renamed from: a */
    protected final dg.k f11066a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0148f f11067b;

    /* JADX INFO: renamed from: c */
    private final String f11068c;

    static class a extends f {
        a(String str, InterfaceC0148f interfaceC0148f, dg.k kVar) {
            super(str, interfaceC0148f, kVar, null);
        }

        private static /* synthetic */ void j(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 1 ? 3 : 2];
            if (i10 != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i10 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // dg.f
        protected o p(String str, Object obj) {
            if (str == null) {
                j(0);
            }
            o oVarA = o.a();
            if (oVarA == null) {
                j(1);
            }
            return oVarA;
        }
    }

    class b extends j {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Object f11069d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar, qd.a aVar, Object obj) {
            super(fVar, aVar);
            this.f11069d = obj;
        }

        private static /* synthetic */ void b(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // dg.f.h
        protected o e(boolean z10) {
            o oVarD = o.d(this.f11069d);
            if (oVarD == null) {
                b(0);
            }
            return oVarD;
        }
    }

    class c extends k {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ qd.l f11071e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ qd.l f11072f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f fVar, qd.a aVar, qd.l lVar, qd.l lVar2) {
            super(fVar, aVar);
            this.f11071e = lVar;
            this.f11072f = lVar2;
        }

        private static /* synthetic */ void b(int i10) {
            String str = i10 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i10 != 2 ? 2 : 3];
            if (i10 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i10 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i10 == 2) {
                objArr[2] = "doPostCompute";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalArgumentException(str2);
            }
        }

        @Override // dg.f.h
        protected o e(boolean z10) {
            qd.l lVar = this.f11071e;
            if (lVar == null) {
                o oVarE = super.e(z10);
                if (oVarE == null) {
                    b(0);
                }
                return oVarE;
            }
            o oVarD = o.d(lVar.l(Boolean.valueOf(z10)));
            if (oVarD == null) {
                b(1);
            }
            return oVarD;
        }

        @Override // dg.f.i
        protected void g(Object obj) {
            if (obj == null) {
                b(2);
            }
            this.f11072f.l(obj);
        }
    }

    private static class d extends e implements dg.a {
        /* synthetic */ d(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void d(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "computation";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i10 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // dg.f.e, dg.a
        public Object b(Object obj, qd.a aVar) {
            if (aVar == null) {
                d(2);
            }
            Object objB = super.b(obj, aVar);
            if (objB == null) {
                d(3);
            }
            return objB;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private d(f fVar, ConcurrentMap concurrentMap) {
            super(fVar, concurrentMap, null);
            if (fVar == null) {
                d(0);
            }
            if (concurrentMap == null) {
                d(1);
            }
        }
    }

    private static class e extends l implements dg.b {

        class a implements qd.l {
            a() {
            }

            @Override // qd.l
            /* JADX INFO: renamed from: b */
            public Object l(g gVar) {
                return gVar.f11076b.a();
            }
        }

        /* synthetic */ e(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void d(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i10 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public Object b(Object obj, qd.a aVar) {
            if (aVar == null) {
                d(2);
            }
            return l(new g(obj, aVar));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private e(f fVar, ConcurrentMap concurrentMap) {
            super(fVar, concurrentMap, new a());
            if (fVar == null) {
                d(0);
            }
            if (concurrentMap == null) {
                d(1);
            }
        }
    }

    /* JADX INFO: renamed from: dg.f$f */
    public interface InterfaceC0148f {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC0148f f11074a = new a();

        /* JADX INFO: renamed from: dg.f$f$a */
        static class a implements InterfaceC0148f {
            a() {
            }

            private static /* synthetic */ void b(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // dg.f.InterfaceC0148f
            public RuntimeException a(Throwable th2) {
                if (th2 == null) {
                    b(0);
                }
                throw og.c.b(th2);
            }
        }

        RuntimeException a(Throwable th2);
    }

    private static class g {

        /* JADX INFO: renamed from: a */
        private final Object f11075a;

        /* JADX INFO: renamed from: b */
        private final qd.a f11076b;

        public g(Object obj, qd.a aVar) {
            this.f11075a = obj;
            this.f11076b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f11075a.equals(((g) obj).f11075a);
        }

        public int hashCode() {
            return this.f11075a.hashCode();
        }
    }

    private static abstract class i extends h {

        /* JADX INFO: renamed from: d */
        private volatile dg.l f11080d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(f fVar, qd.a aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                b(0);
            }
            if (aVar == null) {
                b(1);
            }
            this.f11080d = null;
        }

        private static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // dg.f.h, qd.a
        public Object a() {
            dg.l lVar = this.f11080d;
            return (lVar == null || !lVar.b()) ? super.a() : lVar.a();
        }

        @Override // dg.f.h
        protected final void d(Object obj) {
            this.f11080d = new dg.l(obj);
            try {
                g(obj);
            } finally {
                this.f11080d = null;
            }
        }

        protected abstract void g(Object obj);
    }

    private static class j extends h implements dg.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(f fVar, qd.a aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                b(0);
            }
            if (aVar == null) {
                b(1);
            }
        }

        private static /* synthetic */ void b(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // dg.f.h, qd.a
        public Object a() {
            Object objA = super.a();
            if (objA == null) {
                b(2);
            }
            return objA;
        }
    }

    private static abstract class k extends i implements dg.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(f fVar, qd.a aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                b(0);
            }
            if (aVar == null) {
                b(1);
            }
        }

        private static /* synthetic */ void b(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // dg.f.i, dg.f.h, qd.a
        public Object a() {
            Object objA = super.a();
            if (objA == null) {
                b(2);
            }
            return objA;
        }
    }

    private static class l implements dg.h {

        /* JADX INFO: renamed from: a */
        private final f f11081a;

        /* JADX INFO: renamed from: b */
        private final ConcurrentMap f11082b;

        /* JADX INFO: renamed from: c */
        private final qd.l f11083c;

        public l(f fVar, ConcurrentMap concurrentMap, qd.l lVar) {
            if (fVar == null) {
                d(0);
            }
            if (concurrentMap == null) {
                d(1);
            }
            if (lVar == null) {
                d(2);
            }
            this.f11081a = fVar;
            this.f11082b = concurrentMap;
            this.f11083c = lVar;
        }

        private static /* synthetic */ void d(int i10) {
            String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 == 3 || i10 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i10 != 3 && i10 != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 3 && i10 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        private AssertionError e(Object obj, Object obj2) {
            return (AssertionError) f.q(new AssertionError("Inconsistent key detected. " + n.COMPUTING + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + this.f11081a));
        }

        private AssertionError g(Object obj, Object obj2) {
            AssertionError assertionError = (AssertionError) f.q(new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f11081a));
            if (assertionError == null) {
                d(4);
            }
            return assertionError;
        }

        private AssertionError m(Object obj, Throwable th2) {
            return (AssertionError) f.q(new AssertionError("Unable to remove " + obj + " under " + this.f11081a, th2));
        }

        protected o i(Object obj, boolean z10) {
            o oVarP = this.f11081a.p("", obj);
            if (oVarP == null) {
                d(3);
            }
            return oVarP;
        }

        /* JADX WARN: Removed duplicated region for block: B:86:0x003e A[Catch: all -> 0x003b, PHI: r0
          0x003e: PHI (r0v8 java.lang.Object) = (r0v7 java.lang.Object), (r0v21 java.lang.Object) binds: [B:78:0x0020, B:80:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {all -> 0x003b, blocks: (B:77:0x0018, B:79:0x0022, B:81:0x002f, B:86:0x003e, B:88:0x0042, B:90:0x004d, B:92:0x0054, B:102:0x007f, B:105:0x008b, B:107:0x008f, B:108:0x0093, B:109:0x0094, B:110:0x0096, B:115:0x009f, B:117:0x00ad, B:118:0x00b1, B:119:0x00b2, B:120:0x00bc, B:122:0x00c2, B:123:0x00cc, B:125:0x00ce, B:126:0x00d2, B:112:0x0098, B:113:0x009c, B:104:0x0085, B:121:0x00bd, B:95:0x005a, B:99:0x0079, B:100:0x007d), top: B:131:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0052  */
        @Override // qd.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object l(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 219
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: dg.f.l.l(java.lang.Object):java.lang.Object");
        }

        @Override // dg.h
        public boolean r(Object obj) {
            Object obj2 = this.f11082b.get(obj);
            return (obj2 == null || obj2 == n.COMPUTING) ? false : true;
        }
    }

    private static class m extends l implements dg.g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(f fVar, ConcurrentMap concurrentMap, qd.l lVar) {
            super(fVar, concurrentMap, lVar);
            if (fVar == null) {
                d(0);
            }
            if (concurrentMap == null) {
                d(1);
            }
            if (lVar == null) {
                d(2);
            }
        }

        private static /* synthetic */ void d(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // dg.f.l, qd.l
        public Object l(Object obj) {
            Object objL = super.l(obj);
            if (objL == null) {
                d(3);
            }
            return objL;
        }
    }

    private enum n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    private static class o {

        /* JADX INFO: renamed from: a */
        private final Object f11088a;

        /* JADX INFO: renamed from: b */
        private final boolean f11089b;

        private o(Object obj, boolean z10) {
            this.f11088a = obj;
            this.f11089b = z10;
        }

        public static o a() {
            return new o(null, true);
        }

        public static o d(Object obj) {
            return new o(obj, false);
        }

        public Object b() {
            return this.f11088a;
        }

        public boolean c() {
            return this.f11089b;
        }

        public String toString() {
            return c() ? "FALL_THROUGH" : String.valueOf(this.f11088a);
        }
    }

    /* synthetic */ f(String str, InterfaceC0148f interfaceC0148f, dg.k kVar, a aVar) {
        this(str, interfaceC0148f, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void j(int r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dg.f.j(int):void");
    }

    private static ConcurrentMap m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    public static Throwable q(Throwable th2) {
        if (th2 == null) {
            j(36);
        }
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!stackTrace[i10].getClassName().startsWith(f11064d)) {
                break;
            }
            i10++;
        }
        List listSubList = Arrays.asList(stackTrace).subList(i10, length);
        th2.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
        return th2;
    }

    @Override // dg.n
    public dg.j a(qd.a aVar) {
        if (aVar == null) {
            j(30);
        }
        return new h(this, aVar);
    }

    @Override // dg.n
    public dg.b b() {
        return new e(this, m(), null);
    }

    @Override // dg.n
    public dg.a c() {
        return new d(this, m(), null);
    }

    @Override // dg.n
    public dg.i d(qd.a aVar) {
        if (aVar == null) {
            j(23);
        }
        return new j(this, aVar);
    }

    @Override // dg.n
    public dg.i e(qd.a aVar, Object obj) {
        if (aVar == null) {
            j(26);
        }
        if (obj == null) {
            j(27);
        }
        return new b(this, aVar, obj);
    }

    @Override // dg.n
    public dg.g f(qd.l lVar) {
        if (lVar == null) {
            j(9);
        }
        dg.g gVarN = n(lVar, m());
        if (gVarN == null) {
            j(10);
        }
        return gVarN;
    }

    @Override // dg.n
    public dg.i g(qd.a aVar, qd.l lVar, qd.l lVar2) {
        if (aVar == null) {
            j(28);
        }
        if (lVar2 == null) {
            j(29);
        }
        return new c(this, aVar, lVar, lVar2);
    }

    @Override // dg.n
    public dg.h h(qd.l lVar) {
        if (lVar == null) {
            j(19);
        }
        dg.h hVarO = o(lVar, m());
        if (hVarO == null) {
            j(20);
        }
        return hVarO;
    }

    @Override // dg.n
    public Object i(qd.a aVar) {
        if (aVar == null) {
            j(34);
        }
        this.f11066a.lock();
        try {
            return aVar.a();
        } finally {
        }
    }

    public dg.g n(qd.l lVar, ConcurrentMap concurrentMap) {
        if (lVar == null) {
            j(14);
        }
        if (concurrentMap == null) {
            j(15);
        }
        return new m(this, concurrentMap, lVar);
    }

    public dg.h o(qd.l lVar, ConcurrentMap concurrentMap) {
        if (lVar == null) {
            j(21);
        }
        if (concurrentMap == null) {
            j(22);
        }
        return new l(this, concurrentMap, lVar);
    }

    protected o p(String str, Object obj) {
        String str2;
        if (str == null) {
            j(35);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Recursion detected ");
        sb2.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb2.append(str2);
        sb2.append(" under ");
        sb2.append(this);
        throw ((AssertionError) q(new AssertionError(sb2.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f11068c + ")";
    }

    private f(String str, InterfaceC0148f interfaceC0148f, dg.k kVar) {
        if (str == null) {
            j(4);
        }
        if (interfaceC0148f == null) {
            j(5);
        }
        if (kVar == null) {
            j(6);
        }
        this.f11066a = kVar;
        this.f11067b = interfaceC0148f;
        this.f11068c = str;
    }

    public f(String str) {
        this(str, (Runnable) null, (qd.l) null);
    }

    public f(String str, Runnable runnable, qd.l lVar) {
        this(str, InterfaceC0148f.f11074a, dg.k.f11090a.a(runnable, lVar));
    }

    private static class h implements dg.j {

        /* JADX INFO: renamed from: a */
        private final f f11077a;

        /* JADX INFO: renamed from: b */
        private final qd.a f11078b;

        /* JADX INFO: renamed from: c */
        private volatile Object f11079c;

        public h(f fVar, qd.a aVar) {
            if (fVar == null) {
                b(0);
            }
            if (aVar == null) {
                b(1);
            }
            this.f11079c = n.NOT_COMPUTED;
            this.f11077a = fVar;
            this.f11078b = aVar;
        }

        private static /* synthetic */ void b(int i10) {
            String str = (i10 == 2 || i10 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 2 || i10 == 3) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 == 2 || i10 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i10 != 2 && i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x003e A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:49:0x0012, B:51:0x0018, B:56:0x0026, B:58:0x002a, B:60:0x0039, B:61:0x003e, B:63:0x0042, B:65:0x004d, B:66:0x0052, B:70:0x0061, B:72:0x0067, B:74:0x006d, B:75:0x0073, B:76:0x007d, B:77:0x007e, B:78:0x0084, B:67:0x0054), top: B:83:0x0012, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0052 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:49:0x0012, B:51:0x0018, B:56:0x0026, B:58:0x002a, B:60:0x0039, B:61:0x003e, B:63:0x0042, B:65:0x004d, B:66:0x0052, B:70:0x0061, B:72:0x0067, B:74:0x006d, B:75:0x0073, B:76:0x007d, B:77:0x007e, B:78:0x0084, B:67:0x0054), top: B:83:0x0012, inners: #0 }] */
        @Override // qd.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a() {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f11079c
                boolean r1 = r0 instanceof dg.f.n
                if (r1 != 0) goto Lb
                java.lang.Object r0 = og.l.f(r0)
                return r0
            Lb:
                dg.f r0 = r4.f11077a
                dg.k r0 = r0.f11066a
                r0.lock()
                java.lang.Object r0 = r4.f11079c     // Catch: java.lang.Throwable -> L24
                boolean r1 = r0 instanceof dg.f.n     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L26
                java.lang.Object r0 = og.l.f(r0)     // Catch: java.lang.Throwable -> L24
            L1c:
                dg.f r1 = r4.f11077a
                dg.k r1 = r1.f11066a
                r1.unlock()
                return r0
            L24:
                r0 = move-exception
                goto L85
            L26:
                dg.f$n r1 = dg.f.n.COMPUTING     // Catch: java.lang.Throwable -> L24
                if (r0 != r1) goto L3e
                dg.f$n r2 = dg.f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L24
                r4.f11079c = r2     // Catch: java.lang.Throwable -> L24
                r2 = 1
                dg.f$o r2 = r4.e(r2)     // Catch: java.lang.Throwable -> L24
                boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L24
                if (r3 != 0) goto L3e
                java.lang.Object r0 = r2.b()     // Catch: java.lang.Throwable -> L24
                goto L1c
            L3e:
                dg.f$n r2 = dg.f.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L24
                if (r0 != r2) goto L52
                r0 = 0
                dg.f$o r0 = r4.e(r0)     // Catch: java.lang.Throwable -> L24
                boolean r2 = r0.c()     // Catch: java.lang.Throwable -> L24
                if (r2 != 0) goto L52
                java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L24
                goto L1c
            L52:
                r4.f11079c = r1     // Catch: java.lang.Throwable -> L24
                qd.a r0 = r4.f11078b     // Catch: java.lang.Throwable -> L60
                java.lang.Object r0 = r0.a()     // Catch: java.lang.Throwable -> L60
                r4.d(r0)     // Catch: java.lang.Throwable -> L60
                r4.f11079c = r0     // Catch: java.lang.Throwable -> L60
                goto L1c
            L60:
                r0 = move-exception
                boolean r1 = og.c.a(r0)     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L7e
                java.lang.Object r1 = r4.f11079c     // Catch: java.lang.Throwable -> L24
                dg.f$n r2 = dg.f.n.COMPUTING     // Catch: java.lang.Throwable -> L24
                if (r1 != r2) goto L73
                java.lang.Object r1 = og.l.c(r0)     // Catch: java.lang.Throwable -> L24
                r4.f11079c = r1     // Catch: java.lang.Throwable -> L24
            L73:
                dg.f r1 = r4.f11077a     // Catch: java.lang.Throwable -> L24
                dg.f$f r1 = dg.f.k(r1)     // Catch: java.lang.Throwable -> L24
                java.lang.RuntimeException r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L24
                throw r0     // Catch: java.lang.Throwable -> L24
            L7e:
                dg.f$n r1 = dg.f.n.NOT_COMPUTED     // Catch: java.lang.Throwable -> L24
                r4.f11079c = r1     // Catch: java.lang.Throwable -> L24
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L24
                throw r0     // Catch: java.lang.Throwable -> L24
            L85:
                dg.f r1 = r4.f11077a
                dg.k r1 = r1.f11066a
                r1.unlock()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: dg.f.h.a():java.lang.Object");
        }

        protected o e(boolean z10) {
            o oVarP = this.f11077a.p("in a lazy value", null);
            if (oVarP == null) {
                b(2);
            }
            return oVarP;
        }

        public boolean j() {
            return (this.f11079c == n.NOT_COMPUTED || this.f11079c == n.COMPUTING) ? false : true;
        }

        protected void d(Object obj) {
        }
    }
}
