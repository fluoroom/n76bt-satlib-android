package v7;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m0 f30457a = new j0();

    public interface a {
        Object a(t7.k kVar);
    }

    public static t8.g a(t7.h hVar, a aVar) {
        m0 m0Var = f30457a;
        t8.h hVar2 = new t8.h();
        hVar.a(new k0(hVar, hVar2, aVar, m0Var));
        return hVar2.a();
    }

    public static t8.g b(t7.h hVar) {
        return a(hVar, new l0());
    }
}
