package ie;

import eg.r0;
import he.g1;
import ie.c;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f16032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f16033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g1 f16034c;

    public d(r0 r0Var, Map map, g1 g1Var) {
        if (r0Var == null) {
            b(0);
        }
        if (map == null) {
            b(1);
        }
        if (g1Var == null) {
            b(2);
        }
        this.f16032a = r0Var;
        this.f16033b = map;
        this.f16034c = g1Var;
    }

    private static /* synthetic */ void b(int i10) {
        String str = (i10 == 3 || i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "valueArguments";
        } else if (i10 == 2) {
            objArr[0] = "source";
        } else if (i10 == 3 || i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i10 == 3) {
            objArr[1] = "getType";
        } else if (i10 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // ie.c
    public Map a() {
        Map map = this.f16033b;
        if (map == null) {
            b(4);
        }
        return map;
    }

    @Override // ie.c
    public mf.c d() {
        return c.a.a(this);
    }

    @Override // ie.c
    public g1 getSource() {
        g1 g1Var = this.f16034c;
        if (g1Var == null) {
            b(5);
        }
        return g1Var;
    }

    @Override // ie.c
    public r0 getType() {
        r0 r0Var = this.f16032a;
        if (r0Var == null) {
            b(3);
        }
        return r0Var;
    }

    public String toString() {
        return pf.n.f24180h.N(this, null);
    }
}
