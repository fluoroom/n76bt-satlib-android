package mh;

/* JADX INFO: loaded from: classes3.dex */
public interface c {

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22107a = new a();

        private a() {
        }

        @Override // mh.c
        public void a(nh.a aVar) {
            rd.m.e(aVar, "windowCounter");
        }

        @Override // mh.c
        public void b(int i10, nh.a aVar, long j10) {
            rd.m.e(aVar, "windowCounter");
        }
    }

    void a(nh.a aVar);

    void b(int i10, nh.a aVar, long j10);
}
