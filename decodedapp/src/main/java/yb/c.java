package yb;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bc.b f32470a = new bc.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f32471b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f32472c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f32473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Long f32474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f32475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f32476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Integer f32477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Long f32478i;

    public static class b extends AbstractC0439c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c f32479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f32480d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f32481e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f32482f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f32483g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Long f32484h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Integer f32485i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Long f32486j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f32487k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Integer f32488l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private d f32489m;

        private void f() {
            d dVar = this.f32489m;
            if (dVar != null) {
                this.f32481e.add(Integer.valueOf(dVar.c()));
                this.f32489m = null;
            }
        }

        @Override // yb.c.AbstractC0439c
        public int b(bc.b bVar) {
            int iN = bVar.n(this.f32480d);
            String str = this.f32487k;
            int iN2 = str != null ? bVar.n(str) : 0;
            int iD = this.f32479c.d(this.f32481e);
            int iD2 = this.f32482f.isEmpty() ? 0 : this.f32479c.d(this.f32482f);
            dc.c.i(bVar);
            dc.c.e(bVar, iN);
            dc.c.f(bVar, iD);
            if (iD2 != 0) {
                dc.c.g(bVar, iD2);
            }
            if (this.f32483g != null && this.f32484h != null) {
                dc.c.c(bVar, dc.a.a(bVar, r0.intValue(), this.f32484h.longValue()));
            }
            if (this.f32485i != null) {
                dc.c.d(bVar, dc.a.a(bVar, r0.intValue(), this.f32486j.longValue()));
            }
            if (iN2 != 0) {
                dc.c.a(bVar, iN2);
            }
            if (this.f32488l != null) {
                dc.c.b(bVar, r0.intValue());
            }
            return dc.c.h(bVar);
        }

        public c e() {
            a();
            f();
            this.f32479c.f32471b.add(Integer.valueOf(c()));
            return this.f32479c;
        }

        public b g(int i10) {
            this.f32488l = Integer.valueOf(i10);
            return this;
        }

        public b h(int i10, long j10) {
            a();
            this.f32483g = Integer.valueOf(i10);
            this.f32484h = Long.valueOf(j10);
            return this;
        }

        public b i(int i10, long j10) {
            a();
            this.f32485i = Integer.valueOf(i10);
            this.f32486j = Long.valueOf(j10);
            return this;
        }

        public d j(String str, int i10) {
            return k(str, null, i10);
        }

        public d k(String str, String str2, int i10) {
            return l(str, str2, null, i10);
        }

        public d l(String str, String str2, String str3, int i10) {
            a();
            f();
            d dVar = new d(d(), str, str2, str3, i10);
            this.f32489m = dVar;
            return dVar;
        }

        private b(c cVar, bc.b bVar, String str) {
            super(bVar);
            this.f32481e = new ArrayList();
            this.f32482f = new ArrayList();
            this.f32479c = cVar;
            this.f32480d = str;
        }
    }

    /* JADX INFO: renamed from: yb.c$c, reason: collision with other inner class name */
    static abstract class AbstractC0439c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final bc.b f32490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f32491b;

        AbstractC0439c(bc.b bVar) {
            this.f32490a = bVar;
        }

        void a() {
            if (this.f32491b) {
                throw new IllegalStateException("Already finished");
            }
        }

        public abstract int b(bc.b bVar);

        public final int c() {
            a();
            this.f32491b = true;
            return b(d());
        }

        bc.b d() {
            return this.f32490a;
        }
    }

    public static class d extends AbstractC0439c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f32492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f32493d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f32494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f32495f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f32496g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f32497h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f32498i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f32499j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f32500k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f32501l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f32502m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f32503n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f32504o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f32505p;

        @Override // yb.c.AbstractC0439c
        public int b(bc.b bVar) {
            dc.d.n(bVar);
            dc.d.h(bVar, this.f32492c);
            int i10 = this.f32493d;
            if (i10 != 0) {
                dc.d.j(bVar, i10);
            }
            int i11 = this.f32494e;
            if (i11 != 0) {
                dc.d.l(bVar, i11);
            }
            dc.d.k(bVar, this.f32495f);
            int i12 = this.f32496g;
            if (i12 != 0) {
                dc.d.i(bVar, i12);
            }
            int i13 = this.f32497h;
            if (i13 != 0) {
                dc.d.e(bVar, dc.a.a(bVar, i13, this.f32498i));
            }
            int i14 = this.f32499j;
            if (i14 != 0) {
                dc.d.f(bVar, dc.a.a(bVar, i14, this.f32500k));
            }
            int i15 = this.f32501l;
            if (i15 > 0) {
                dc.d.g(bVar, i15);
            }
            int i16 = this.f32502m;
            if (i16 != 0) {
                dc.d.a(bVar, i16);
            }
            int i17 = this.f32503n;
            if (i17 != 0) {
                dc.d.b(bVar, i17);
            }
            int i18 = this.f32504o;
            if (i18 != 0) {
                dc.d.d(bVar, i18);
            }
            int i19 = this.f32505p;
            if (i19 != 0) {
                dc.d.c(bVar, i19);
            }
            return dc.d.m(bVar);
        }

        public d e(int i10) {
            a();
            this.f32505p = i10;
            return this;
        }

        public d f(int i10, long j10) {
            a();
            this.f32497h = i10;
            this.f32498i = j10;
            return this;
        }

        public d g(int i10, long j10) {
            a();
            this.f32499j = i10;
            this.f32500k = j10;
            return this;
        }

        private d(bc.b bVar, String str, String str2, String str3, int i10) {
            super(bVar);
            this.f32492c = bVar.n(str);
            this.f32493d = str2 != null ? bVar.n(str2) : 0;
            this.f32494e = str3 != null ? bVar.n(str3) : 0;
            this.f32495f = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(List list) {
        int[] iArr = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr[i10] = ((Integer) list.get(i10)).intValue();
        }
        return this.f32470a.o(iArr);
    }

    public byte[] c() {
        int iN = this.f32470a.n("default");
        int iD = d(this.f32471b);
        dc.b.i(this.f32470a);
        dc.b.f(this.f32470a, iN);
        dc.b.e(this.f32470a, 2L);
        dc.b.g(this.f32470a, this.f32472c);
        dc.b.a(this.f32470a, iD);
        if (this.f32473d != null) {
            dc.b.b(this.f32470a, dc.a.a(this.f32470a, r0.intValue(), this.f32474e.longValue()));
        }
        if (this.f32475f != null) {
            dc.b.c(this.f32470a, dc.a.a(this.f32470a, r0.intValue(), this.f32476g.longValue()));
        }
        if (this.f32477h != null) {
            dc.b.d(this.f32470a, dc.a.a(this.f32470a, r0.intValue(), this.f32478i.longValue()));
        }
        this.f32470a.r(dc.b.h(this.f32470a));
        return this.f32470a.F();
    }

    public b e(String str) {
        return new b(this.f32470a, str);
    }

    public c f(int i10, long j10) {
        this.f32473d = Integer.valueOf(i10);
        this.f32474e = Long.valueOf(j10);
        return this;
    }

    public c g(int i10, long j10) {
        this.f32475f = Integer.valueOf(i10);
        this.f32476g = Long.valueOf(j10);
        return this;
    }

    public c h(int i10, long j10) {
        this.f32477h = Integer.valueOf(i10);
        this.f32478i = Long.valueOf(j10);
        return this;
    }
}
