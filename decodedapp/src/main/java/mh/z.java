package mh;

import androidx.appcompat.widget.ActivityChooserView;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f22273c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f22275b = new int[10];

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public final int a(int i10) {
        return this.f22275b[i10];
    }

    public final int b() {
        if ((this.f22274a & 2) != 0) {
            return this.f22275b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.f22274a & 16) != 0) {
            return this.f22275b[4];
        }
        return 65535;
    }

    public final int d() {
        return (this.f22274a & 8) != 0 ? this.f22275b[3] : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    public final int e(int i10) {
        return (this.f22274a & 32) != 0 ? this.f22275b[5] : i10;
    }

    public final boolean f(int i10) {
        return ((1 << i10) & this.f22274a) != 0;
    }

    public final void g(z zVar) {
        rd.m.e(zVar, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (zVar.f(i10)) {
                h(i10, zVar.a(i10));
            }
        }
    }

    public final z h(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f22275b;
            if (i10 < iArr.length) {
                this.f22274a = (1 << i10) | this.f22274a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.f22274a);
    }
}
