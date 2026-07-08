package mh;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22270a = a.f22272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f22271b = new a.C0290a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f22272a = new a();

        /* JADX INFO: renamed from: mh.y$a$a, reason: collision with other inner class name */
        private static final class C0290a implements y {
            @Override // mh.y
            public void a(int i10, b bVar) {
                rd.m.e(bVar, "errorCode");
            }

            @Override // mh.y
            public boolean b(int i10, vh.g gVar, int i11, boolean z10) {
                rd.m.e(gVar, "source");
                gVar.skip(i11);
                return true;
            }

            @Override // mh.y
            public boolean c(int i10, List list) {
                rd.m.e(list, "requestHeaders");
                return true;
            }

            @Override // mh.y
            public boolean d(int i10, List list, boolean z10) {
                rd.m.e(list, "responseHeaders");
                return true;
            }
        }

        private a() {
        }
    }

    void a(int i10, b bVar);

    boolean b(int i10, vh.g gVar, int i11, boolean z10);

    boolean c(int i10, List list);

    boolean d(int i10, List list, boolean z10);
}
