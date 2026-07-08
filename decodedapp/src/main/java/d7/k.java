package d7;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p6.d0;
import p6.o;
import p6.w;

/* JADX INFO: loaded from: classes.dex */
abstract class k {

    /* JADX INFO: renamed from: a */
    private static final z6.a f10826a;

    /* JADX INFO: renamed from: b */
    private static final w f10827b;

    /* JADX INFO: renamed from: c */
    private static final w f10828c;

    /* JADX INFO: renamed from: d */
    private static final p6.v f10829d;

    static final class a {

        /* JADX INFO: renamed from: a */
        private Iterator[] f10830a;

        /* JADX INFO: renamed from: b */
        private int f10831b;

        /* JADX INFO: renamed from: c */
        private int f10832c;

        public Iterator a() {
            int i10 = this.f10831b;
            if (i10 == 0) {
                return null;
            }
            Iterator[] itArr = this.f10830a;
            int i11 = i10 - 1;
            this.f10831b = i11;
            return itArr[i11];
        }

        public void b(Iterator it) {
            int i10 = this.f10831b;
            int i11 = this.f10832c;
            if (i10 < i11) {
                Iterator[] itArr = this.f10830a;
                this.f10831b = i10 + 1;
                itArr[i10] = it;
                return;
            }
            if (this.f10830a == null) {
                this.f10832c = 10;
                this.f10830a = new Iterator[10];
            } else {
                int iMin = i11 + Math.min(4000, Math.max(20, i11 >> 1));
                this.f10832c = iMin;
                this.f10830a = (Iterator[]) Arrays.copyOf(this.f10830a, iMin);
            }
            Iterator[] itArr2 = this.f10830a;
            int i12 = this.f10831b;
            this.f10831b = i12 + 1;
            itArr2[i12] = it;
        }
    }

    protected static class b extends o.a {

        /* JADX INFO: renamed from: a */
        protected final d7.b f10833a;

        /* JADX INFO: renamed from: b */
        protected d0 f10834b;

        public b(d7.b bVar) {
            this.f10833a = bVar;
        }

        @Override // p6.o
        public void d(e6.g gVar, d0 d0Var) {
            this.f10834b = d0Var;
            h(gVar, this.f10833a);
        }

        @Override // p6.o
        public void e(e6.g gVar, d0 d0Var, a7.h hVar) {
            d(gVar, d0Var);
        }

        protected void g(e6.g gVar, a aVar, Iterator it) {
            p6.n nVar;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) next;
                        gVar.D0((String) entry.getKey());
                        nVar = (p6.n) entry.getValue();
                    } else {
                        nVar = (p6.n) next;
                    }
                    if (nVar instanceof r) {
                        aVar.b(it);
                        it = nVar.z();
                        gVar.b1(nVar, nVar.size());
                    } else if (nVar instanceof d7.a) {
                        aVar.b(it);
                        it = nVar.t();
                        gVar.Y0(nVar, nVar.size());
                    } else if (nVar instanceof s) {
                        try {
                            nVar.d(gVar, this.f10834b);
                        } catch (IOException | RuntimeException e10) {
                            gVar.d1(String.format("[ERROR: (%s) %s]", e10.getClass().getName(), e10.getMessage()));
                        }
                    } else {
                        nVar.d(gVar, this.f10834b);
                    }
                } else {
                    if (gVar.s().h()) {
                        gVar.z0();
                    } else {
                        gVar.A0();
                    }
                    it = aVar.a();
                    if (it == null) {
                        return;
                    }
                }
            }
        }

        protected void h(e6.g gVar, p6.n nVar) {
            if (nVar instanceof r) {
                gVar.b1(this, nVar.size());
                g(gVar, new a(), nVar.z());
            } else if (!(nVar instanceof d7.a)) {
                nVar.d(gVar, this.f10834b);
            } else {
                gVar.Y0(this, nVar.size());
                g(gVar, new a(), nVar.t());
            }
        }
    }

    static {
        z6.a aVar = new z6.a();
        f10826a = aVar;
        f10827b = aVar.L();
        f10828c = aVar.L().i();
        f10829d = aVar.z(p6.n.class);
    }

    private static p6.o a(d7.b bVar) {
        return new b(bVar);
    }

    public static String b(d7.b bVar) {
        try {
            return f10827b.j(a(bVar));
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
