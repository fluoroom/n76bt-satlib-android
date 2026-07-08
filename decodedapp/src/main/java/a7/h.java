package a7;

import d6.e0;
import e6.m;
import n6.c;
import o6.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f364a;

        static {
            int[] iArr = new int[e0.a.values().length];
            f364a = iArr;
            try {
                iArr[e0.a.EXISTING_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f364a[e0.a.EXTERNAL_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f364a[e0.a.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f364a[e0.a.WRAPPER_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f364a[e0.a.WRAPPER_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public abstract h a(p6.d dVar);

    public abstract String b();

    public abstract e0.a c();

    public n6.c d(Object obj, m mVar) {
        n6.c cVar = new n6.c(obj, mVar);
        int i10 = a.f364a[c().ordinal()];
        if (i10 == 1) {
            cVar.f22550e = c.a.PAYLOAD_PROPERTY;
            cVar.f22549d = b();
            return cVar;
        }
        if (i10 == 2) {
            cVar.f22550e = c.a.PARENT_PROPERTY;
            cVar.f22549d = b();
            return cVar;
        }
        if (i10 == 3) {
            cVar.f22550e = c.a.METADATA_PROPERTY;
            cVar.f22549d = b();
            return cVar;
        }
        if (i10 == 4) {
            cVar.f22550e = c.a.WRAPPER_ARRAY;
            return cVar;
        }
        if (i10 != 5) {
            r.a();
            return cVar;
        }
        cVar.f22550e = c.a.WRAPPER_OBJECT;
        return cVar;
    }

    public n6.c e(Object obj, m mVar, Object obj2) {
        n6.c cVarD = d(obj, mVar);
        cVarD.f22548c = obj2;
        return cVarD;
    }

    public n6.c f(Object obj, Class cls, m mVar) {
        n6.c cVarD = d(obj, mVar);
        cVarD.f22547b = cls;
        return cVarD;
    }

    public abstract n6.c g(e6.g gVar, n6.c cVar);

    public abstract n6.c h(e6.g gVar, n6.c cVar);
}
