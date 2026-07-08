package m0;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f20852a;

    private static class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Window f20853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i0 f20854b;

        a(Window window, i0 i0Var) {
            this.f20853a = window;
            this.f20854b = i0Var;
        }

        private void f(int i10) {
            if (i10 == 1) {
                g(4);
                h(WXMediaMessage.DESCRIPTION_LENGTH_LIMIT);
            } else if (i10 == 2) {
                g(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f20854b.a();
            }
        }

        @Override // m0.m1.g
        void c(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    f(i11);
                }
            }
        }

        protected void d(int i10) {
            View decorView = this.f20853a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void e(int i10) {
            this.f20853a.addFlags(i10);
        }

        protected void g(int i10) {
            View decorView = this.f20853a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        protected void h(int i10) {
            this.f20853a.clearFlags(i10);
        }
    }

    private static class b extends a {
        b(Window window, i0 i0Var) {
            super(window, i0Var);
        }

        @Override // m0.m1.g
        public void b(boolean z10) {
            if (!z10) {
                g(8192);
                return;
            }
            h(67108864);
            e(RtlSpacingHelper.UNDEFINED);
            d(8192);
        }
    }

    private static class c extends b {
        c(Window window, i0 i0Var) {
            super(window, i0Var);
        }

        @Override // m0.m1.g
        public void a(boolean z10) {
            if (!z10) {
                g(16);
                return;
            }
            h(134217728);
            e(RtlSpacingHelper.UNDEFINED);
            d(16);
        }
    }

    private static class e extends d {
        e(Window window, m1 m1Var, i0 i0Var) {
            super(window, m1Var, i0Var);
        }

        e(WindowInsetsController windowInsetsController, m1 m1Var, i0 i0Var) {
            super(windowInsetsController, m1Var, i0Var);
        }
    }

    private static class f extends e {
        f(Window window, m1 m1Var, i0 i0Var) {
            super(window, m1Var, i0Var);
        }

        f(WindowInsetsController windowInsetsController, m1 m1Var, i0 i0Var) {
            super(windowInsetsController, m1Var, i0Var);
        }
    }

    private m1(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f20852a = new f(windowInsetsController, this, new i0(windowInsetsController));
        } else {
            this.f20852a = new d(windowInsetsController, this, new i0(windowInsetsController));
        }
    }

    public static m1 d(WindowInsetsController windowInsetsController) {
        return new m1(windowInsetsController);
    }

    public void a(boolean z10) {
        this.f20852a.a(z10);
    }

    public void b(boolean z10) {
        this.f20852a.b(z10);
    }

    public void c(int i10) {
        this.f20852a.c(i10);
    }

    private static class d extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final m1 f20855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WindowInsetsController f20856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final i0 f20857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.collection.i f20858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected Window f20859e;

        d(Window window, m1 m1Var, i0 i0Var) {
            this(window.getInsetsController(), m1Var, i0Var);
            this.f20859e = window;
        }

        @Override // m0.m1.g
        public void a(boolean z10) {
            if (z10) {
                if (this.f20859e != null) {
                    d(16);
                }
                this.f20856b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f20859e != null) {
                    e(16);
                }
                this.f20856b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // m0.m1.g
        public void b(boolean z10) {
            if (z10) {
                if (this.f20859e != null) {
                    d(8192);
                }
                this.f20856b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f20859e != null) {
                    e(8192);
                }
                this.f20856b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // m0.m1.g
        void c(int i10) {
            if ((i10 & 8) != 0) {
                this.f20857c.a();
            }
            this.f20856b.show(i10 & (-9));
        }

        protected void d(int i10) {
            View decorView = this.f20859e.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void e(int i10) {
            View decorView = this.f20859e.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, m1 m1Var, i0 i0Var) {
            this.f20858d = new androidx.collection.i();
            this.f20856b = windowInsetsController;
            this.f20855a = m1Var;
            this.f20857c = i0Var;
        }
    }

    public m1(Window window, View view) {
        i0 i0Var = new i0(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            this.f20852a = new f(window, this, i0Var);
            return;
        }
        if (i10 >= 30) {
            this.f20852a = new d(window, this, i0Var);
            return;
        }
        if (i10 >= 26) {
            this.f20852a = new c(window, i0Var);
        } else if (i10 >= 23) {
            this.f20852a = new b(window, i0Var);
        } else {
            this.f20852a = new a(window, i0Var);
        }
    }

    private static class g {
        g() {
        }

        abstract void c(int i10);

        public void a(boolean z10) {
        }

        public void b(boolean z10) {
        }
    }
}
