package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f2648a = new c(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ kd.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final C0034a Companion;
        public static final a ON_CREATE = new a("ON_CREATE", 0);
        public static final a ON_START = new a("ON_START", 1);
        public static final a ON_RESUME = new a("ON_RESUME", 2);
        public static final a ON_PAUSE = new a("ON_PAUSE", 3);
        public static final a ON_STOP = new a("ON_STOP", 4);
        public static final a ON_DESTROY = new a("ON_DESTROY", 5);
        public static final a ON_ANY = new a("ON_ANY", 6);

        /* JADX INFO: renamed from: androidx.lifecycle.m$a$a, reason: collision with other inner class name */
        public static final class C0034a {

            /* JADX INFO: renamed from: androidx.lifecycle.m$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0035a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f2649a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.f2653c.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.f2654d.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.f2655e.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.f2651a.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.f2652b.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f2649a = iArr;
                }
            }

            public /* synthetic */ C0034a(rd.h hVar) {
                this();
            }

            public final a a(b bVar) {
                rd.m.e(bVar, "state");
                int i10 = C0035a.f2649a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_DESTROY;
                }
                if (i10 == 2) {
                    return a.ON_STOP;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public final a b(b bVar) {
                rd.m.e(bVar, "state");
                int i10 = C0035a.f2649a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_START;
                }
                if (i10 == 2) {
                    return a.ON_RESUME;
                }
                if (i10 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            public final a c(b bVar) {
                rd.m.e(bVar, "state");
                int i10 = C0035a.f2649a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_CREATE;
                }
                if (i10 == 2) {
                    return a.ON_START;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }

            private C0034a() {
            }
        }

        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2650a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f2650a = iArr;
            }
        }

        static {
            a[] aVarArrA = a();
            $VALUES = aVarArrA;
            $ENTRIES = kd.b.a(aVarArrA);
            Companion = new C0034a(null);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY};
        }

        public static final a d(b bVar) {
            return Companion.a(bVar);
        }

        public static final a f(b bVar) {
            return Companion.c(bVar);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final b e() {
            switch (b.f2650a[ordinal()]) {
                case 1:
                case 2:
                    return b.f2653c;
                case 3:
                case 4:
                    return b.f2654d;
                case 5:
                    return b.f2655e;
                case 6:
                    return b.f2651a;
                case 7:
                    throw new IllegalArgumentException(this + " has no target state");
                default:
                    throw new dd.o();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f2651a = new b("DESTROYED", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f2652b = new b("INITIALIZED", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f2653c = new b("CREATED", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f2654d = new b("STARTED", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f2655e = new b("RESUMED", 4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ b[] f2656f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ kd.a f2657g;

        static {
            b[] bVarArrA = a();
            f2656f = bVarArrA;
            f2657g = kd.b.a(bVarArrA);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f2651a, f2652b, f2653c, f2654d, f2655e};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f2656f.clone();
        }

        public final boolean d(b bVar) {
            rd.m.e(bVar, "state");
            return compareTo(bVar) >= 0;
        }
    }

    public abstract void a(s sVar);

    public abstract b b();

    public final c c() {
        return this.f2648a;
    }

    public abstract void d(s sVar);
}
