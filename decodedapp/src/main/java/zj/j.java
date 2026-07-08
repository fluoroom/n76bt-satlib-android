package zj;

import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes3.dex */
public class j implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f33400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f33402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f33403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j1 f33404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f33405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f33406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f33407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicInteger f33408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicInteger f33409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f33410k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ReadWriteLock f33411l;

    private final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f33412a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AtomicLong f33413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AtomicLong f33414c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private AtomicInteger f33415d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private AtomicLong f33416e;

        /* JADX INFO: renamed from: zj.j$a$a, reason: collision with other inner class name */
        private class C0451a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final yj.g0 f33418a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final long f33419b;

            C0451a(yj.g0 g0Var, long j10) {
                this.f33419b = j10;
                this.f33418a = g0Var;
            }

            public yj.g0 a() {
                return this.f33418a;
            }

            public long b() {
                return this.f33419b;
            }
        }

        a(yj.b bVar) {
            j.this.f33409j.incrementAndGet();
            for (yj.g0 g0Var : c(null, bVar)) {
                this.f33412a.add(new C0451a(g0Var, j.this.l(g0Var.getDate())));
            }
            this.f33413b = new AtomicLong(((C0451a) this.f33412a.get(0)).b());
            this.f33414c = new AtomicLong(((C0451a) this.f33412a.get(r1.size() - 1)).b());
            while (this.f33412a.size() < j.this.f33406g) {
                yj.b date = ((C0451a) this.f33412a.get(0)).a().getDate();
                yj.b date2 = ((C0451a) this.f33412a.get(r1.size() - 1)).a().getDate();
                j.this.f33409j.incrementAndGet();
                if (date2.getDate().X(bVar) <= bVar.X(date.getDate())) {
                    a(c(date2, date2.getDate().a(h() * ((double) (j.this.f33406g - this.f33412a.size())))), bVar);
                } else {
                    j(c(date, date.getDate().a((-h()) * ((double) (j.this.f33406g - this.f33412a.size())))), bVar);
                }
            }
            this.f33415d = new AtomicInteger(this.f33412a.size() / 2);
            this.f33416e = new AtomicLong(System.currentTimeMillis());
        }

        private void a(List list, yj.b bVar) {
            long j10 = this.f33414c.get();
            int size = this.f33412a.size();
            int size2 = list.size() - 1;
            boolean z10 = false;
            while (size2 >= 0) {
                long jL = j.this.l(((yj.g0) list.get(size2)).getDate());
                if (jL <= j10) {
                    break;
                }
                this.f33412a.add(size, new C0451a((yj.g0) list.get(size2), jL));
                size2--;
                z10 = true;
            }
            if (!z10) {
                List list2 = this.f33412a;
                yj.b date = ((C0451a) list2.get(list2.size() - 1)).a().getDate();
                throw new hj.g(hj.f.UNABLE_TO_GENERATE_NEW_DATA_AFTER, date, bVar, Double.valueOf(bVar.X(date)));
            }
            List list3 = this.f33412a;
            yj.b date2 = ((C0451a) list3.get(list3.size() - 1)).a().getDate();
            while (this.f33412a.size() > j.this.f33406g && date2.X(((C0451a) this.f33412a.get(0)).a().getDate()) > j.this.f33402c) {
                this.f33412a.remove(0);
            }
            this.f33413b.set(((C0451a) this.f33412a.get(0)).b());
            AtomicLong atomicLong = this.f33414c;
            List list4 = this.f33412a;
            atomicLong.set(((C0451a) list4.get(list4.size() - 1)).b());
        }

        private int b(yj.b bVar, long j10) {
            int i10 = this.f33415d.get();
            if (i10 > 0 && i10 < this.f33412a.size()) {
                if (((C0451a) this.f33412a.get(i10)).b() <= j10) {
                    int i11 = i10 + 1;
                    if (i11 < this.f33412a.size() && ((C0451a) this.f33412a.get(i11)).b() > j10) {
                        return i10;
                    }
                    int i12 = i10 + 2;
                    if (i12 < this.f33412a.size() && ((C0451a) this.f33412a.get(i12)).b() > j10) {
                        this.f33415d.set(i11);
                        return i11;
                    }
                } else if (i10 > 1) {
                    int i13 = i10 - 1;
                    if (((C0451a) this.f33412a.get(i13)).b() <= j10) {
                        this.f33415d.set(i13);
                        return i13;
                    }
                }
            }
            if (j10 < d()) {
                return -1;
            }
            if (j10 > g()) {
                return this.f33412a.size();
            }
            int i14 = 0;
            long jB = ((C0451a) this.f33412a.get(0)).b();
            int size = this.f33412a.size() - 1;
            long jB2 = ((C0451a) this.f33412a.get(size)).b();
            while (size - i14 > 0) {
                int iC = aj.d.C(i14 + 1, aj.d.E((int) (((((long) i14) * (jB2 - j10)) + (((long) size) * (j10 - jB))) / (jB2 - jB)), size));
                C0451a c0451a = (C0451a) this.f33412a.get(iC);
                if (j10 < c0451a.b()) {
                    size = iC - 1;
                } else {
                    if (j10 <= c0451a.b()) {
                        this.f33415d.set(iC);
                        return iC;
                    }
                    i14 = iC;
                }
            }
            this.f33415d.set(i14);
            return i14;
        }

        private List c(yj.b bVar, yj.b bVar2) {
            List listB = j.this.f33404e.b(bVar, bVar2);
            if (listB.isEmpty()) {
                throw new hj.g(hj.f.NO_DATA_GENERATED, bVar2);
            }
            for (int i10 = 1; i10 < listB.size(); i10++) {
                yj.b date = ((yj.g0) listB.get(i10 - 1)).getDate();
                yj.b date2 = ((yj.g0) listB.get(i10)).getDate();
                if (date2.compareTo(date) < 0) {
                    throw new hj.g(hj.f.NON_CHRONOLOGICALLY_SORTED_ENTRIES, date, date2, Double.valueOf(date.X(date2)));
                }
            }
            return listB;
        }

        private double h() {
            if (this.f33412a.size() < 2) {
                return 1.0d;
            }
            if (!Double.isNaN(j.this.f33405f)) {
                return j.this.f33405f;
            }
            return ((C0451a) this.f33412a.get(r1.size() - 1)).a().getDate().X(((C0451a) this.f33412a.get(0)).a().getDate()) / ((double) (this.f33412a.size() - 1));
        }

        private void j(List list, yj.b bVar) {
            long j10 = this.f33413b.get();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < list.size()) {
                long jL = j.this.l(((yj.g0) list.get(i10)).getDate());
                if (jL >= j10) {
                    break;
                }
                this.f33412a.add(i10, new C0451a((yj.g0) list.get(i10), jL));
                i10++;
                z10 = true;
            }
            if (!z10) {
                yj.b date = ((C0451a) this.f33412a.get(0)).a().getDate();
                throw new hj.g(hj.f.UNABLE_TO_GENERATE_NEW_DATA_BEFORE, date, bVar, Double.valueOf(date.X(bVar)));
            }
            yj.b date2 = ((C0451a) this.f33412a.get(0)).a().getDate();
            while (this.f33412a.size() > j.this.f33406g) {
                List list2 = this.f33412a;
                if (((C0451a) list2.get(list2.size() - 1)).a().getDate().X(date2) <= j.this.f33402c) {
                    break;
                }
                List list3 = this.f33412a;
                list3.remove(list3.size() - 1);
            }
            this.f33413b.set(((C0451a) this.f33412a.get(0)).b());
            AtomicLong atomicLong = this.f33414c;
            List list4 = this.f33412a;
            atomicLong.set(((C0451a) list4.get(list4.size() - 1)).b());
        }

        public long d() {
            return this.f33413b.get();
        }

        public long e() {
            return this.f33416e.get();
        }

        public yj.g0 f() {
            return ((C0451a) this.f33412a.get(r0.size() - 1)).a();
        }

        public long g() {
            return this.f33414c.get();
        }

        public Stream i(yj.b bVar, long j10, int i10) {
            yj.b date;
            yj.b bVarA;
            boolean z10;
            int i11 = i10 - 1;
            int iB = b(bVar, j10) - (i11 / 2);
            if (iB < 0 || iB + i10 > this.f33412a.size()) {
                j.this.f33411l.readLock().unlock();
                j.this.f33411l.writeLock().lock();
                boolean z11 = true;
                while (z11) {
                    try {
                        iB = b(bVar, j10) - (i11 / 2);
                        if (iB < 0 || iB + i10 > this.f33412a.size()) {
                            double dH = h();
                            if (iB < 0) {
                                date = ((C0451a) this.f33412a.get(0)).a().getDate();
                                bVarA = date.getDate().a(dH * ((double) iB));
                                z10 = date.getDate().compareTo(bVar) <= 0;
                            } else {
                                List list = this.f33412a;
                                date = ((C0451a) list.get(list.size() - 1)).a().getDate();
                                bVarA = date.getDate().a(dH * ((double) ((iB + i10) - this.f33412a.size())));
                                if (date.getDate().compareTo(bVar) >= 0) {
                                }
                            }
                            j.this.f33409j.incrementAndGet();
                            if (iB < 0) {
                                try {
                                    j(c(date, bVarA), bVar);
                                } catch (hj.g e10) {
                                    if (!z10) {
                                        throw e10;
                                    }
                                    z11 = false;
                                }
                            } else {
                                a(c(date, bVarA), bVar);
                            }
                        }
                        z11 = false;
                    } catch (Throwable th2) {
                        j.this.f33411l.readLock().lock();
                        j.this.f33411l.writeLock().unlock();
                        throw th2;
                    }
                }
                j.this.f33411l.readLock().lock();
                j.this.f33411l.writeLock().unlock();
            }
            if (iB + i10 > this.f33412a.size()) {
                iB = this.f33412a.size() - i10;
            }
            if (iB < 0) {
                iB = 0;
            }
            Stream.Builder builder = Stream.CC.builder();
            for (int i12 = 0; i12 < i10; i12++) {
                builder.n(((C0451a) this.f33412a.get(iB + i12)).a());
            }
            return builder.build();
        }
    }

    public j(int i10, int i11, double d10, double d11, j1 j1Var) {
        this(i10, i11, d10, d11, j1Var, Double.NaN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long l(yj.b bVar) {
        androidx.lifecycle.b.a(this.f33400a, null, bVar);
        return aj.d.N(bVar.X((yj.b) this.f33400a.get()) / 1.0E-6d);
    }

    private a m(yj.b bVar, long j10) {
        int iN = this.f33407h.isEmpty() ? 0 : n(j10);
        if (this.f33407h.isEmpty() || ((a) this.f33407h.get(iN)).d() > this.f33403d + j10 || ((a) this.f33407h.get(iN)).g() < j10 - this.f33403d) {
            this.f33411l.readLock().unlock();
            this.f33411l.writeLock().lock();
            try {
                iN = this.f33407h.isEmpty() ? 0 : n(j10);
                if (this.f33407h.isEmpty() || ((a) this.f33407h.get(iN)).d() > this.f33403d + j10 || ((a) this.f33407h.get(iN)).g() < j10 - this.f33403d) {
                    if (!this.f33407h.isEmpty() && ((a) this.f33407h.get(iN)).g() < j10 - this.f33403d) {
                        iN++;
                    }
                    if (this.f33407h.size() >= this.f33401b) {
                        int i10 = 0;
                        for (int i11 = 0; i11 < this.f33407h.size(); i11++) {
                            if (((a) this.f33407h.get(i11)).e() < ((a) this.f33407h.get(i10)).e()) {
                                i10 = i11;
                            }
                        }
                        this.f33410k.incrementAndGet();
                        this.f33407h.remove(i10);
                        if (i10 < iN) {
                            iN--;
                        }
                    }
                    this.f33407h.add(iN, new a(bVar));
                }
                this.f33411l.readLock().lock();
                this.f33411l.writeLock().unlock();
            } catch (Throwable th2) {
                this.f33411l.readLock().lock();
                this.f33411l.writeLock().unlock();
                throw th2;
            }
        }
        return (a) this.f33407h.get(iN);
    }

    private int n(long j10) {
        int iE = 0;
        long jD = ((a) this.f33407h.get(0)).d();
        int size = this.f33407h.size() - 1;
        long jG = ((a) this.f33407h.get(size)).g();
        while (size - iE > 0) {
            int iC = aj.d.C(iE, aj.d.E((int) (((((long) iE) * (jG - j10)) + (((long) size) * (j10 - jD))) / (jG - jD)), size));
            a aVar = (a) this.f33407h.get(iC);
            if (j10 < aVar.d()) {
                size = iC - 1;
            } else {
                if (j10 <= aVar.g()) {
                    return iC;
                }
                iE = aj.d.E(size, iC + 1);
            }
        }
        return iE;
    }

    @Override // zj.i1
    public int a() {
        return this.f33406g;
    }

    @Override // zj.i1
    public /* synthetic */ Stream b(yj.b bVar) {
        return h1.a(this, bVar);
    }

    @Override // zj.i1
    public Stream c(yj.b bVar, int i10) {
        if (i10 > this.f33406g) {
            throw new hj.a(hj.f.NOT_ENOUGH_DATA, Integer.valueOf(this.f33406g));
        }
        this.f33411l.readLock().lock();
        try {
            this.f33408i.incrementAndGet();
            long jL = l(bVar);
            return m(bVar, jL).i(bVar, jL, i10);
        } finally {
            this.f33411l.readLock().unlock();
        }
    }

    public yj.g0 k() {
        this.f33411l.readLock().lock();
        try {
            if (this.f33407h.isEmpty()) {
                throw new hj.d(hj.f.NO_CACHED_ENTRIES, new Object[0]);
            }
            return ((a) this.f33407h.get(r0.size() - 1)).f();
        } finally {
            this.f33411l.readLock().unlock();
        }
    }

    public j(int i10, int i11, double d10, double d11, j1 j1Var, double d12) {
        if (i11 < 1) {
            throw new hj.c(ui.d.NUMBER_TOO_SMALL, Integer.valueOf(i11), 1);
        }
        if (d12 <= 0.0d) {
            throw new hj.c(ui.d.NUMBER_TOO_SMALL_BOUND_EXCLUDED, Double.valueOf(d12), 0);
        }
        if (i10 < 2) {
            throw new hj.c(hj.f.NOT_ENOUGH_CACHED_NEIGHBORS, Integer.valueOf(i10), 2);
        }
        this.f33400a = new AtomicReference();
        this.f33401b = i11;
        this.f33402c = d10;
        this.f33403d = aj.d.N(d11 / 1.0E-6d);
        this.f33404e = j1Var;
        this.f33405f = d12;
        this.f33406g = i10;
        this.f33407h = new ArrayList(i11);
        this.f33408i = new AtomicInteger(0);
        this.f33409j = new AtomicInteger(0);
        this.f33410k = new AtomicInteger(0);
        this.f33411l = new ReentrantReadWriteLock();
    }
}
