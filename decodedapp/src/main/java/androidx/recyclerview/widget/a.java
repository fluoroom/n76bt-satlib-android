package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class a implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l0.d f3085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f3086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList f3087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final InterfaceC0041a f3088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Runnable f3089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f3090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final h f3091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f3092h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC0041a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(int i10, int i11, Object obj);

        void d(b bVar);

        RecyclerView.f0 e(int i10);

        void f(int i10, int i11);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f3095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f3096d;

        b(int i10, int i11, int i12, Object obj) {
            this.f3093a = i10;
            this.f3094b = i11;
            this.f3096d = i12;
            this.f3095c = obj;
        }

        String a() {
            int i10 = this.f3093a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f3093a;
            if (i10 != bVar.f3093a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f3096d - this.f3094b) == 1 && this.f3096d == bVar.f3094b && this.f3094b == bVar.f3096d) {
                return true;
            }
            if (this.f3096d != bVar.f3096d || this.f3094b != bVar.f3094b) {
                return false;
            }
            Object obj2 = this.f3095c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f3095c)) {
                    return false;
                }
            } else if (bVar.f3095c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f3093a * 31) + this.f3094b) * 31) + this.f3096d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f3094b + "c:" + this.f3096d + ",p:" + this.f3095c + "]";
        }
    }

    a(InterfaceC0041a interfaceC0041a) {
        this(interfaceC0041a, false);
    }

    private void c(b bVar) {
        u(bVar);
    }

    private void d(b bVar) {
        u(bVar);
    }

    private void f(b bVar) {
        boolean z10;
        byte b10;
        int i10 = bVar.f3094b;
        int i11 = bVar.f3096d + i10;
        byte b11 = -1;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f3088d.e(i12) != null || h(i12)) {
                if (b11 == 0) {
                    k(b(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 1;
            } else {
                if (b11 == 1) {
                    u(b(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            b11 = b10;
        }
        if (i13 != bVar.f3096d) {
            a(bVar);
            bVar = b(2, i10, i13, null);
        }
        if (b11 == 0) {
            k(bVar);
        } else {
            u(bVar);
        }
    }

    private void g(b bVar) {
        int i10 = bVar.f3094b;
        int i11 = bVar.f3096d + i10;
        int i12 = i10;
        byte b10 = -1;
        int i13 = 0;
        while (i10 < i11) {
            if (this.f3088d.e(i10) != null || h(i10)) {
                if (b10 == 0) {
                    k(b(4, i12, i13, bVar.f3095c));
                    i12 = i10;
                    i13 = 0;
                }
                b10 = 1;
            } else {
                if (b10 == 1) {
                    u(b(4, i12, i13, bVar.f3095c));
                    i12 = i10;
                    i13 = 0;
                }
                b10 = 0;
            }
            i13++;
            i10++;
        }
        if (i13 != bVar.f3096d) {
            Object obj = bVar.f3095c;
            a(bVar);
            bVar = b(4, i12, i13, obj);
        }
        if (b10 == 0) {
            k(bVar);
        } else {
            u(bVar);
        }
    }

    private boolean h(int i10) {
        int size = this.f3087c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f3087c.get(i11);
            int i12 = bVar.f3093a;
            if (i12 == 8) {
                if (n(bVar.f3096d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f3094b;
                int i14 = bVar.f3096d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i10;
        int i11 = bVar.f3093a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iY = y(bVar.f3094b, i11);
        int i12 = bVar.f3094b;
        int i13 = bVar.f3093a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f3096d; i15++) {
            int iY2 = y(bVar.f3094b + (i10 * i15), bVar.f3093a);
            int i16 = bVar.f3093a;
            if (i16 == 2 ? iY2 != iY : !(i16 == 4 && iY2 == iY + 1)) {
                b bVarB = b(i16, iY, i14, bVar.f3095c);
                l(bVarB, i12);
                a(bVarB);
                if (bVar.f3093a == 4) {
                    i12 += i14;
                }
                iY = iY2;
                i14 = 1;
            } else {
                i14++;
            }
        }
        Object obj = bVar.f3095c;
        a(bVar);
        if (i14 > 0) {
            b bVarB2 = b(bVar.f3093a, iY, i14, obj);
            l(bVarB2, i12);
            a(bVarB2);
        }
    }

    private void u(b bVar) {
        this.f3087c.add(bVar);
        int i10 = bVar.f3093a;
        if (i10 == 1) {
            this.f3088d.g(bVar.f3094b, bVar.f3096d);
            return;
        }
        if (i10 == 2) {
            this.f3088d.f(bVar.f3094b, bVar.f3096d);
            return;
        }
        if (i10 == 4) {
            this.f3088d.c(bVar.f3094b, bVar.f3096d, bVar.f3095c);
        } else {
            if (i10 == 8) {
                this.f3088d.a(bVar.f3094b, bVar.f3096d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int y(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f3087c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f3087c.get(size);
            int i14 = bVar.f3093a;
            if (i14 == 8) {
                int i15 = bVar.f3094b;
                int i16 = bVar.f3096d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f3094b = i15 + 1;
                            bVar.f3096d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f3094b = i15 - 1;
                            bVar.f3096d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f3096d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f3096d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f3094b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f3094b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f3094b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f3096d;
                    } else if (i14 == 2) {
                        i10 += bVar.f3096d;
                    }
                } else if (i11 == 1) {
                    bVar.f3094b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f3094b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f3087c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f3087c.get(size2);
            if (bVar2.f3093a == 8) {
                int i18 = bVar2.f3096d;
                if (i18 == bVar2.f3094b || i18 < 0) {
                    this.f3087c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f3096d <= 0) {
                this.f3087c.remove(size2);
                a(bVar2);
            }
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.h.a
    public void a(b bVar) {
        if (this.f3090f) {
            return;
        }
        bVar.f3095c = null;
        this.f3085a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.h.a
    public b b(int i10, int i11, int i12, Object obj) {
        b bVar = (b) this.f3085a.b();
        if (bVar == null) {
            return new b(i10, i11, i12, obj);
        }
        bVar.f3093a = i10;
        bVar.f3094b = i11;
        bVar.f3096d = i12;
        bVar.f3095c = obj;
        return bVar;
    }

    public int e(int i10) {
        int size = this.f3086b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f3086b.get(i11);
            int i12 = bVar.f3093a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f3094b;
                    if (i13 <= i10) {
                        int i14 = bVar.f3096d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f3094b;
                    if (i15 == i10) {
                        i10 = bVar.f3096d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f3096d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f3094b <= i10) {
                i10 += bVar.f3096d;
            }
        }
        return i10;
    }

    void i() {
        int size = this.f3087c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3088d.d((b) this.f3087c.get(i10));
        }
        w(this.f3087c);
        this.f3092h = 0;
    }

    void j() {
        i();
        int size = this.f3086b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f3086b.get(i10);
            int i11 = bVar.f3093a;
            if (i11 == 1) {
                this.f3088d.d(bVar);
                this.f3088d.g(bVar.f3094b, bVar.f3096d);
            } else if (i11 == 2) {
                this.f3088d.d(bVar);
                this.f3088d.h(bVar.f3094b, bVar.f3096d);
            } else if (i11 == 4) {
                this.f3088d.d(bVar);
                this.f3088d.c(bVar.f3094b, bVar.f3096d, bVar.f3095c);
            } else if (i11 == 8) {
                this.f3088d.d(bVar);
                this.f3088d.a(bVar.f3094b, bVar.f3096d);
            }
            Runnable runnable = this.f3089e;
            if (runnable != null) {
                runnable.run();
            }
        }
        w(this.f3086b);
        this.f3092h = 0;
    }

    void l(b bVar, int i10) {
        this.f3088d.b(bVar);
        int i11 = bVar.f3093a;
        if (i11 == 2) {
            this.f3088d.h(i10, bVar.f3096d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f3088d.c(i10, bVar.f3096d, bVar.f3095c);
        }
    }

    int m(int i10) {
        return n(i10, 0);
    }

    int n(int i10, int i11) {
        int size = this.f3087c.size();
        while (i11 < size) {
            b bVar = (b) this.f3087c.get(i11);
            int i12 = bVar.f3093a;
            if (i12 == 8) {
                int i13 = bVar.f3094b;
                if (i13 == i10) {
                    i10 = bVar.f3096d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f3096d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f3094b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f3096d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f3096d;
                }
            }
            i11++;
        }
        return i10;
    }

    boolean o(int i10) {
        return (i10 & this.f3092h) != 0;
    }

    boolean p() {
        return this.f3086b.size() > 0;
    }

    boolean q() {
        return (this.f3087c.isEmpty() || this.f3086b.isEmpty()) ? false : true;
    }

    boolean r(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f3086b.add(b(4, i10, i11, obj));
        this.f3092h |= 4;
        return this.f3086b.size() == 1;
    }

    boolean s(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f3086b.add(b(1, i10, i11, null));
        this.f3092h |= 1;
        return this.f3086b.size() == 1;
    }

    boolean t(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f3086b.add(b(2, i10, i11, null));
        this.f3092h |= 2;
        return this.f3086b.size() == 1;
    }

    void v() {
        this.f3091g.b(this.f3086b);
        int size = this.f3086b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f3086b.get(i10);
            int i11 = bVar.f3093a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f3089e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f3086b.clear();
    }

    void w(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a((b) list.get(i10));
        }
        list.clear();
    }

    void x() {
        w(this.f3086b);
        w(this.f3087c);
        this.f3092h = 0;
    }

    a(InterfaceC0041a interfaceC0041a, boolean z10) {
        this.f3085a = new l0.e(30);
        this.f3086b = new ArrayList();
        this.f3087c = new ArrayList();
        this.f3092h = 0;
        this.f3088d = interfaceC0041a;
        this.f3090f = z10;
        this.f3091g = new h(this);
    }
}
