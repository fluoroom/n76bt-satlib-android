package om.sstvencoder;

import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f23809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f23810b = new Handler();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ai.d f23811a;

        a(ai.d dVar) {
            this.f23811a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f23809a.n1(this.f23811a);
        }
    }

    d(c cVar) {
        this.f23809a = cVar;
    }

    void b(ai.d dVar) {
        this.f23810b.post(new a(dVar));
    }

    public String c(int i10, Object... objArr) {
        return this.f23809a.getString(i10, objArr);
    }
}
