package o2;

import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e3.h f23116a;

    class a extends e3.h {
        a(long j10) {
            super(j10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // e3.h
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(b bVar, Object obj) {
            bVar.c();
        }
    }

    static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Queue f23118d = e3.l.f(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f23121c;

        private b() {
        }

        static b a(Object obj, int i10, int i11) {
            b bVar;
            Queue queue = f23118d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.b(obj, i10, i11);
            return bVar;
        }

        private void b(Object obj, int i10, int i11) {
            this.f23121c = obj;
            this.f23120b = i10;
            this.f23119a = i11;
        }

        public void c() {
            Queue queue = f23118d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f23120b == bVar.f23120b && this.f23119a == bVar.f23119a && this.f23121c.equals(bVar.f23121c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f23119a * 31) + this.f23120b) * 31) + this.f23121c.hashCode();
        }
    }

    public m(long j10) {
        this.f23116a = new a(j10);
    }

    public Object a(Object obj, int i10, int i11) {
        b bVarA = b.a(obj, i10, i11);
        Object objG = this.f23116a.g(bVarA);
        bVarA.c();
        return objG;
    }

    public void b(Object obj, int i10, int i11, Object obj2) {
        this.f23116a.k(b.a(obj, i10, i11), obj2);
    }
}
