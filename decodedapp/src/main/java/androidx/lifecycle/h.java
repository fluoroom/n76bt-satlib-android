package androidx.lifecycle;

import androidx.lifecycle.m;

/* JADX INFO: loaded from: classes.dex */
public final class h implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f2630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f2631b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2632a;

        static {
            int[] iArr = new int[m.a.values().length];
            try {
                iArr[m.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[m.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[m.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f2632a = iArr;
        }
    }

    public h(g gVar, q qVar) {
        rd.m.e(gVar, "defaultLifecycleObserver");
        this.f2630a = gVar;
        this.f2631b = qVar;
    }

    @Override // androidx.lifecycle.q
    public void k(t tVar, m.a aVar) {
        rd.m.e(tVar, "source");
        rd.m.e(aVar, "event");
        switch (a.f2632a[aVar.ordinal()]) {
            case 1:
                this.f2630a.e(tVar);
                break;
            case 2:
                this.f2630a.onStart(tVar);
                break;
            case 3:
                this.f2630a.c(tVar);
                break;
            case 4:
                this.f2630a.l(tVar);
                break;
            case 5:
                this.f2630a.onStop(tVar);
                break;
            case 6:
                this.f2630a.onDestroy(tVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new dd.o();
        }
        q qVar = this.f2631b;
        if (qVar != null) {
            qVar.k(tVar, aVar);
        }
    }
}
