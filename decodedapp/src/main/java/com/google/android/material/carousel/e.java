package com.google.android.material.carousel;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f7632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f7634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f7636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f7637f;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f7638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7639b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f7641d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f7642e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f7640c = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f7643f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f7644g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f7645h = 0.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f7646i = -1;

        public b(float f10, int i10) {
            this.f7638a = f10;
            this.f7639b = i10;
        }

        private static float j(float f10, float f11, int i10, int i11) {
            return (f10 - (i10 * f11)) + (i11 * f11);
        }

        public b a(float f10, float f11, float f12) {
            return d(f10, f11, f12, false, true);
        }

        public b b(float f10, float f11, float f12) {
            return c(f10, f11, f12, false);
        }

        public b c(float f10, float f11, float f12, boolean z10) {
            return d(f10, f11, f12, z10, false);
        }

        public b d(float f10, float f11, float f12, boolean z10, boolean z11) {
            b bVar;
            float f13;
            float f14;
            float f15;
            boolean z12;
            boolean z13;
            float f16;
            float fAbs;
            float f17 = f12 / 2.0f;
            float f18 = f10 - f17;
            float f19 = f17 + f10;
            int i10 = this.f7639b;
            if (f19 > i10) {
                fAbs = Math.abs(f19 - Math.max(f19 - f12, i10));
            } else {
                if (f18 >= 0.0f) {
                    bVar = this;
                    f13 = f10;
                    f14 = f11;
                    f15 = f12;
                    z12 = z10;
                    z13 = z11;
                    f16 = 0.0f;
                    return bVar.e(f13, f14, f15, z12, z13, f16);
                }
                fAbs = Math.abs(f18 - Math.min(f18 + f12, 0.0f));
            }
            bVar = this;
            f13 = f10;
            f14 = f11;
            f15 = f12;
            z12 = z10;
            z13 = z11;
            f16 = fAbs;
            return bVar.e(f13, f14, f15, z12, z13, f16);
        }

        public b e(float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
            return f(f10, f11, f12, z10, z11, f13, 0.0f, 0.0f);
        }

        public b f(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, float f15) {
            if (f12 <= 0.0f) {
                return this;
            }
            if (z11) {
                if (z10) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i10 = this.f7646i;
                if (i10 != -1 && i10 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f7646i = this.f7640c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f10, f11, f12, z11, f13, f14, f15);
            if (z10) {
                if (this.f7641d == null) {
                    this.f7641d = cVar;
                    this.f7643f = this.f7640c.size();
                }
                if (this.f7644g != -1 && this.f7640c.size() - this.f7644g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f7641d.f7650d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f7642e = cVar;
                this.f7644g = this.f7640c.size();
            } else {
                if (this.f7641d == null && cVar.f7650d < this.f7645h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f7642e != null && cVar.f7650d > this.f7645h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f7645h = cVar.f7650d;
            this.f7640c.add(cVar);
            return this;
        }

        public b g(float f10, float f11, float f12, int i10) {
            return h(f10, f11, f12, i10, false);
        }

        public b h(float f10, float f11, float f12, int i10, boolean z10) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    c((i11 * f12) + f10, f11, f12, z10);
                }
            }
            return this;
        }

        public e i() {
            if (this.f7641d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f7640c.size(); i10++) {
                c cVar = (c) this.f7640c.get(i10);
                arrayList.add(new c(j(this.f7641d.f7648b, this.f7638a, this.f7643f, i10), cVar.f7648b, cVar.f7649c, cVar.f7650d, cVar.f7651e, cVar.f7652f, cVar.f7653g, cVar.f7654h));
            }
            return new e(this.f7638a, arrayList, this.f7643f, this.f7644g, this.f7639b);
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f7647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f7648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f7649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final float f7650d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f7651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final float f7652f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final float f7653g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final float f7654h;

        c(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, 0.0f, 0.0f, 0.0f);
        }

        static c a(c cVar, c cVar2, float f10) {
            return new c(v8.a.a(cVar.f7647a, cVar2.f7647a, f10), v8.a.a(cVar.f7648b, cVar2.f7648b, f10), v8.a.a(cVar.f7649c, cVar2.f7649c, f10), v8.a.a(cVar.f7650d, cVar2.f7650d, f10));
        }

        c(float f10, float f11, float f12, float f13, boolean z10, float f14, float f15, float f16) {
            this.f7647a = f10;
            this.f7648b = f11;
            this.f7649c = f12;
            this.f7650d = f13;
            this.f7651e = z10;
            this.f7652f = f14;
            this.f7653g = f15;
            this.f7654h = f16;
        }
    }

    static e o(e eVar, e eVar2, float f10) {
        if (eVar.g() != eVar2.g()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List listH = eVar.h();
        List listH2 = eVar2.h();
        if (listH.size() != listH2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < eVar.h().size(); i10++) {
            arrayList.add(c.a((c) listH.get(i10), (c) listH2.get(i10), f10));
        }
        return new e(eVar.g(), arrayList, v8.a.c(eVar.c(), eVar2.c(), f10), v8.a.c(eVar.j(), eVar2.j(), f10), eVar.f7637f);
    }

    static e p(e eVar, int i10) {
        b bVar = new b(eVar.g(), i10);
        float f10 = (i10 - eVar.k().f7648b) - (eVar.k().f7650d / 2.0f);
        int size = eVar.h().size() - 1;
        while (size >= 0) {
            c cVar = (c) eVar.h().get(size);
            bVar.d((cVar.f7650d / 2.0f) + f10, cVar.f7649c, cVar.f7650d, size >= eVar.c() && size <= eVar.j(), cVar.f7651e);
            f10 += cVar.f7650d;
            size--;
        }
        return bVar.i();
    }

    int a() {
        return this.f7637f;
    }

    c b() {
        return (c) this.f7634c.get(this.f7635d);
    }

    int c() {
        return this.f7635d;
    }

    c d() {
        return (c) this.f7634c.get(0);
    }

    c e() {
        for (int i10 = 0; i10 < this.f7634c.size(); i10++) {
            c cVar = (c) this.f7634c.get(i10);
            if (!cVar.f7651e) {
                return cVar;
            }
        }
        return null;
    }

    List f() {
        return this.f7634c.subList(this.f7635d, this.f7636e + 1);
    }

    float g() {
        return this.f7632a;
    }

    List h() {
        return this.f7634c;
    }

    c i() {
        return (c) this.f7634c.get(this.f7636e);
    }

    int j() {
        return this.f7636e;
    }

    c k() {
        return (c) this.f7634c.get(r0.size() - 1);
    }

    c l() {
        for (int size = this.f7634c.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f7634c.get(size);
            if (!cVar.f7651e) {
                return cVar;
            }
        }
        return null;
    }

    int m() {
        Iterator it = this.f7634c.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((c) it.next()).f7651e) {
                i10++;
            }
        }
        return this.f7634c.size() - i10;
    }

    int n() {
        return this.f7633b;
    }

    private e(float f10, List list, int i10, int i11, int i12) {
        this.f7632a = f10;
        this.f7634c = DesugarCollections.unmodifiableList(list);
        this.f7635d = i10;
        this.f7636e = i11;
        while (i10 <= i11) {
            if (((c) list.get(i10)).f7652f == 0.0f) {
                this.f7633b++;
            }
            i10++;
        }
        this.f7637f = i12;
    }
}
