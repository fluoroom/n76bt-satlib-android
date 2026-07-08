package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final InterfaceC0042b f3097a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f3101e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3100d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a f3098b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List f3099c = new ArrayList();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f3102a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        a f3103b;

        a() {
        }

        private void c() {
            if (this.f3103b == null) {
                this.f3103b = new a();
            }
        }

        void a(int i10) {
            if (i10 < 64) {
                this.f3102a &= ~(1 << i10);
                return;
            }
            a aVar = this.f3103b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        int b(int i10) {
            a aVar = this.f3103b;
            return aVar == null ? i10 >= 64 ? Long.bitCount(this.f3102a) : Long.bitCount(this.f3102a & ((1 << i10) - 1)) : i10 < 64 ? Long.bitCount(this.f3102a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f3102a);
        }

        boolean d(int i10) {
            if (i10 < 64) {
                return (this.f3102a & (1 << i10)) != 0;
            }
            c();
            return this.f3103b.d(i10 - 64);
        }

        void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f3103b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f3102a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f3102a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f3103b != null) {
                c();
                this.f3103b.e(0, z11);
            }
        }

        boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f3103b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f3102a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f3102a = j12;
            long j13 = j10 - 1;
            this.f3102a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f3103b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f3103b.f(0);
            }
            return z10;
        }

        void g() {
            this.f3102a = 0L;
            a aVar = this.f3103b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i10) {
            if (i10 < 64) {
                this.f3102a |= 1 << i10;
            } else {
                c();
                this.f3103b.h(i10 - 64);
            }
        }

        public String toString() {
            if (this.f3103b == null) {
                return Long.toBinaryString(this.f3102a);
            }
            return this.f3103b.toString() + "xx" + Long.toBinaryString(this.f3102a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    interface InterfaceC0042b {
        View a(int i10);

        void b(View view);

        int c();

        void d();

        int e(View view);

        RecyclerView.f0 f(View view);

        void g(int i10);

        void h(View view);

        void i(View view, int i10);

        void j(int i10);

        void k(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    b(InterfaceC0042b interfaceC0042b) {
        this.f3097a = interfaceC0042b;
    }

    private int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int iC = this.f3097a.c();
        int i11 = i10;
        while (i11 < iC) {
            int iB = i10 - (i11 - this.f3098b.b(i11));
            if (iB == 0) {
                while (this.f3098b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB;
        }
        return -1;
    }

    private void l(View view) {
        this.f3099c.add(view);
        this.f3097a.b(view);
    }

    private boolean t(View view) {
        if (!this.f3099c.remove(view)) {
            return false;
        }
        this.f3097a.h(view);
        return true;
    }

    void a(View view, int i10, boolean z10) {
        int iC = i10 < 0 ? this.f3097a.c() : h(i10);
        this.f3098b.e(iC, z10);
        if (z10) {
            l(view);
        }
        this.f3097a.i(view, iC);
    }

    void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int iC = i10 < 0 ? this.f3097a.c() : h(i10);
        this.f3098b.e(iC, z10);
        if (z10) {
            l(view);
        }
        this.f3097a.k(view, iC, layoutParams);
    }

    void d(int i10) {
        int iH = h(i10);
        this.f3098b.f(iH);
        this.f3097a.g(iH);
    }

    View e(int i10) {
        int size = this.f3099c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) this.f3099c.get(i11);
            RecyclerView.f0 f0VarF = this.f3097a.f(view);
            if (f0VarF.o() == i10 && !f0VarF.v() && !f0VarF.x()) {
                return view;
            }
        }
        return null;
    }

    View f(int i10) {
        return this.f3097a.a(h(i10));
    }

    int g() {
        return this.f3097a.c() - this.f3099c.size();
    }

    View i(int i10) {
        return this.f3097a.a(i10);
    }

    int j() {
        return this.f3097a.c();
    }

    void k(View view) {
        int iE = this.f3097a.e(view);
        if (iE >= 0) {
            this.f3098b.h(iE);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int iE = this.f3097a.e(view);
        if (iE == -1 || this.f3098b.d(iE)) {
            return -1;
        }
        return iE - this.f3098b.b(iE);
    }

    boolean n(View view) {
        return this.f3099c.contains(view);
    }

    void o() {
        this.f3098b.g();
        for (int size = this.f3099c.size() - 1; size >= 0; size--) {
            this.f3097a.h((View) this.f3099c.get(size));
            this.f3099c.remove(size);
        }
        this.f3097a.d();
    }

    void p(View view) {
        int i10 = this.f3100d;
        if (i10 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f3100d = 1;
            this.f3101e = view;
            int iE = this.f3097a.e(view);
            if (iE >= 0) {
                if (this.f3098b.f(iE)) {
                    t(view);
                }
                this.f3097a.j(iE);
            }
            this.f3100d = 0;
            this.f3101e = null;
        } catch (Throwable th2) {
            this.f3100d = 0;
            this.f3101e = null;
            throw th2;
        }
    }

    void q(int i10) {
        int i11 = this.f3100d;
        if (i11 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i11 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iH = h(i10);
            View viewA = this.f3097a.a(iH);
            if (viewA != null) {
                this.f3100d = 1;
                this.f3101e = viewA;
                if (this.f3098b.f(iH)) {
                    t(viewA);
                }
                this.f3097a.j(iH);
            }
            this.f3100d = 0;
            this.f3101e = null;
        } catch (Throwable th2) {
            this.f3100d = 0;
            this.f3101e = null;
            throw th2;
        }
    }

    boolean r(View view) {
        int i10 = this.f3100d;
        if (i10 == 1) {
            if (this.f3101e == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f3100d = 2;
            int iE = this.f3097a.e(view);
            if (iE == -1) {
                t(view);
                return true;
            }
            if (!this.f3098b.d(iE)) {
                return false;
            }
            this.f3098b.f(iE);
            t(view);
            this.f3097a.j(iE);
            return true;
        } finally {
            this.f3100d = 0;
        }
    }

    void s(View view) {
        int iE = this.f3097a.e(view);
        if (iE < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f3098b.d(iE)) {
            this.f3098b.a(iE);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f3098b.toString() + ", hidden list:" + this.f3099c.size();
    }
}
