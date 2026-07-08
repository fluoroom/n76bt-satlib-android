package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f3226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f3227b = new a();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3228a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f3230c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f3231d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3232e;

        a() {
        }

        void a(int i10) {
            this.f3228a = i10 | this.f3228a;
        }

        boolean b() {
            int i10 = this.f3228a;
            if ((i10 & 7) != 0 && (i10 & c(this.f3231d, this.f3229b)) == 0) {
                return false;
            }
            int i11 = this.f3228a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f3231d, this.f3230c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f3228a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f3232e, this.f3229b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f3228a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f3232e, this.f3230c) << 12)) != 0;
        }

        int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        void d() {
            this.f3228a = 0;
        }

        void e(int i10, int i11, int i12, int i13) {
            this.f3229b = i10;
            this.f3230c = i11;
            this.f3231d = i12;
            this.f3232e = i13;
        }
    }

    interface b {
        View a(int i10);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    o(b bVar) {
        this.f3226a = bVar;
    }

    View a(int i10, int i11, int i12, int i13) {
        int iC = this.f3226a.c();
        int iD = this.f3226a.d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewA = this.f3226a.a(i10);
            this.f3227b.e(iC, iD, this.f3226a.b(viewA), this.f3226a.e(viewA));
            if (i12 != 0) {
                this.f3227b.d();
                this.f3227b.a(i12);
                if (this.f3227b.b()) {
                    return viewA;
                }
            }
            if (i13 != 0) {
                this.f3227b.d();
                this.f3227b.a(i13);
                if (this.f3227b.b()) {
                    view = viewA;
                }
            }
            i10 += i14;
        }
        return view;
    }

    boolean b(View view, int i10) {
        this.f3227b.e(this.f3226a.c(), this.f3226a.d(), this.f3226a.b(view), this.f3226a.e(view));
        if (i10 == 0) {
            return false;
        }
        this.f3227b.d();
        this.f3227b.a(i10);
        return this.f3227b.b();
    }
}
