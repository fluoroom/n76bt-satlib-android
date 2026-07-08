package ef;

import he.g1;

/* JADX INFO: loaded from: classes3.dex */
public interface x {

    public interface a {
        void a();

        b b(mf.f fVar);

        void c(mf.f fVar, Object obj);

        void d(mf.f fVar, mf.b bVar, mf.f fVar2);

        a e(mf.f fVar, mf.b bVar);

        void f(mf.f fVar, sf.f fVar2);
    }

    public interface b {
        void a();

        a b(mf.b bVar);

        void c(Object obj);

        void d(mf.b bVar, mf.f fVar);

        void e(sf.f fVar);
    }

    public interface c {
        void a();

        a c(mf.b bVar, g1 g1Var);
    }

    public interface d {
        e a(mf.f fVar, String str);

        c b(mf.f fVar, String str, Object obj);
    }

    public interface e extends c {
        a b(int i10, mf.b bVar, g1 g1Var);
    }

    ff.a a();

    void b(c cVar, byte[] bArr);

    void c(d dVar, byte[] bArr);

    String getLocation();

    mf.b h();
}
