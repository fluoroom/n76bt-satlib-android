package bg;

import of.g;
import of.i;
import rd.m;
import rg.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends zf.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f4041r = new a();

    /* JADX WARN: Illegal instructions before constructor call */
    private a() {
        g gVarD = g.d();
        hf.b.a(gVarD);
        m.d(gVarD, "apply(...)");
        i.f fVar = hf.b.f15345a;
        m.d(fVar, "packageFqName");
        i.f fVar2 = hf.b.f15347c;
        m.d(fVar2, "constructorAnnotation");
        i.f fVar3 = hf.b.f15346b;
        m.d(fVar3, "classAnnotation");
        i.f fVar4 = hf.b.f15348d;
        m.d(fVar4, "functionAnnotation");
        i.f fVar5 = hf.b.f15349e;
        m.d(fVar5, "propertyAnnotation");
        i.f fVar6 = hf.b.f15350f;
        m.d(fVar6, "propertyGetterAnnotation");
        i.f fVar7 = hf.b.f15351g;
        m.d(fVar7, "propertySetterAnnotation");
        i.f fVar8 = hf.b.f15353i;
        m.d(fVar8, "enumEntryAnnotation");
        i.f fVar9 = hf.b.f15352h;
        m.d(fVar9, "compileTimeValue");
        i.f fVar10 = hf.b.f15354j;
        m.d(fVar10, "parameterAnnotation");
        i.f fVar11 = hf.b.f15355k;
        m.d(fVar11, "typeAnnotation");
        i.f fVar12 = hf.b.f15356l;
        m.d(fVar12, "typeParameterAnnotation");
        super(gVarD, fVar, fVar2, fVar3, fVar4, null, fVar5, fVar6, fVar7, null, null, null, fVar8, fVar9, fVar10, fVar11, fVar12);
    }

    private final String s(mf.c cVar) {
        if (cVar.c()) {
            return "default-package";
        }
        String strD = cVar.f().d();
        m.d(strD, "asString(...)");
        return strD;
    }

    public final String q(mf.c cVar) {
        m.e(cVar, "fqName");
        return s(cVar) + ".kotlin_builtins";
    }

    public final String r(mf.c cVar) {
        m.e(cVar, "fqName");
        return q.E(cVar.a(), '.', '/', false, 4, null) + '/' + q(cVar);
    }
}
