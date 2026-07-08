package eg;

/* JADX INFO: loaded from: classes3.dex */
public class c2 extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m2 f12062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r0 f12063b;

    public c2(m2 m2Var, r0 r0Var) {
        if (m2Var == null) {
            c(0);
        }
        if (r0Var == null) {
            c(1);
        }
        this.f12062a = m2Var;
        this.f12063b = r0Var;
    }

    private static /* synthetic */ void c(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i10 == 3) {
            objArr[2] = "replaceType";
        } else if (i10 != 4 && i10 != 5) {
            if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // eg.a2
    public m2 a() {
        m2 m2Var = this.f12062a;
        if (m2Var == null) {
            c(4);
        }
        return m2Var;
    }

    @Override // eg.a2
    public boolean b() {
        return false;
    }

    @Override // eg.a2
    public r0 getType() {
        r0 r0Var = this.f12063b;
        if (r0Var == null) {
            c(5);
        }
        return r0Var;
    }

    @Override // eg.a2
    public a2 p(fg.g gVar) {
        if (gVar == null) {
            c(6);
        }
        return new c2(this.f12062a, gVar.a(this.f12063b));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c2(r0 r0Var) {
        this(m2.f12140e, r0Var);
        if (r0Var == null) {
            c(2);
        }
    }
}
