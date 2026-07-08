package ye;

import cf.y;
import cf.z;
import he.l1;
import java.util.Map;
import ze.b1;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f32589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final he.m f32590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f32591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f32592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dg.h f32593e;

    public m(k kVar, he.m mVar, z zVar, int i10) {
        rd.m.e(kVar, "c");
        rd.m.e(mVar, "containingDeclaration");
        rd.m.e(zVar, "typeParameterOwner");
        this.f32589a = kVar;
        this.f32590b = mVar;
        this.f32591c = i10;
        this.f32592d = og.a.d(zVar.getTypeParameters());
        this.f32593e = kVar.e().h(new l(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b1 c(m mVar, y yVar) {
        rd.m.e(yVar, "typeParameter");
        Integer num = (Integer) mVar.f32592d.get(yVar);
        if (num == null) {
            return null;
        }
        return new b1(c.k(c.d(mVar.f32589a, mVar), mVar.f32590b.getAnnotations()), yVar, mVar.f32591c + num.intValue(), mVar.f32590b);
    }

    @Override // ye.p
    public l1 a(y yVar) {
        rd.m.e(yVar, "javaTypeParameter");
        b1 b1Var = (b1) this.f32593e.l(yVar);
        return b1Var != null ? b1Var : this.f32589a.f().a(yVar);
    }
}
