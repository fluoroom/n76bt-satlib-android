package eh;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12584a = a.f12586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f12585b = new a.C0172a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f12586a = new a();

        /* JADX INFO: renamed from: eh.o$a$a, reason: collision with other inner class name */
        private static final class C0172a implements o {
            @Override // eh.o
            public void a(z zVar, List list) {
                rd.m.e(zVar, "url");
                rd.m.e(list, "cookies");
            }

            @Override // eh.o
            public List b(z zVar) {
                rd.m.e(zVar, "url");
                return ed.q.k();
            }
        }

        private a() {
        }
    }

    void a(z zVar, List list);

    List b(z zVar);
}
