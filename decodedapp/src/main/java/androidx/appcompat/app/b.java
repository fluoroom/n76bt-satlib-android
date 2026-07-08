package androidx.appcompat.app;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements DrawerLayout.e {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0016b f826a;

    /* JADX INFO: renamed from: b */
    private final DrawerLayout f827b;

    /* JADX INFO: renamed from: c */
    private androidx.appcompat.graphics.drawable.d f828c;

    /* JADX INFO: renamed from: d */
    private boolean f829d;

    /* JADX INFO: renamed from: e */
    private Drawable f830e;

    /* JADX INFO: renamed from: f */
    boolean f831f;

    /* JADX INFO: renamed from: g */
    private boolean f832g;

    /* JADX INFO: renamed from: h */
    private final int f833h;

    /* JADX INFO: renamed from: i */
    private final int f834i;

    /* JADX INFO: renamed from: j */
    View.OnClickListener f835j;

    /* JADX INFO: renamed from: k */
    private boolean f836k;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b bVar = b.this;
            if (bVar.f831f) {
                bVar.l();
                return;
            }
            View.OnClickListener onClickListener = bVar.f835j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.b$b */
    public interface InterfaceC0016b {
        boolean a();

        Context b();

        void c(Drawable drawable, int i10);

        Drawable d();

        void e(int i10);
    }

    public interface c {
        InterfaceC0016b f();
    }

    private static class d implements InterfaceC0016b {

        /* JADX INFO: renamed from: a */
        private final Activity f838a;

        d(Activity activity) {
            this.f838a = activity;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0016b
        public boolean a() {
            ActionBar actionBar = this.f838a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0016b
        public Context b() {
            ActionBar actionBar = this.f838a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f838a;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0016b
        public void c(Drawable drawable, int i10) {
            ActionBar actionBar = this.f838a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i10);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0016b
        public Drawable d() {
            TypedArray typedArrayObtainStyledAttributes = b().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            typedArrayObtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0016b
        public void e(int i10) {
            ActionBar actionBar = this.f838a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i10);
            }
        }
    }

    static class e implements InterfaceC0016b {

        /* JADX INFO: renamed from: a */
        final Toolbar f839a;

        /* JADX INFO: renamed from: b */
        final Drawable f840b;

        /* JADX INFO: renamed from: c */
        final CharSequence f841c;

        e(Toolbar toolbar) {
            this.f839a = toolbar;
            this.f840b = toolbar.getNavigationIcon();
            this.f841c = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.b.InterfaceC0016b
        public boolean a() {
            return true;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0016b
        public Context b() {
            return this.f839a.getContext();
        }

        @Override // androidx.appcompat.app.b.InterfaceC0016b
        public void c(Drawable drawable, int i10) {
            this.f839a.setNavigationIcon(drawable);
            e(i10);
        }

        @Override // androidx.appcompat.app.b.InterfaceC0016b
        public Drawable d() {
            return this.f840b;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0016b
        public void e(int i10) {
            if (i10 == 0) {
                this.f839a.setNavigationContentDescription(this.f841c);
            } else {
                this.f839a.setNavigationContentDescription(i10);
            }
        }
    }

    public b(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i10, int i11) {
        this(activity, toolbar, drawerLayout, null, i10, i11);
    }

    private void j(float f10) {
        if (f10 == 1.0f) {
            this.f828c.g(true);
        } else if (f10 == 0.0f) {
            this.f828c.g(false);
        }
        this.f828c.e(f10);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void a(View view) {
        j(1.0f);
        if (this.f831f) {
            h(this.f834i);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void b(View view) {
        j(0.0f);
        if (this.f831f) {
            h(this.f833h);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void c(int i10) {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void d(View view, float f10) {
        if (this.f829d) {
            j(Math.min(1.0f, Math.max(0.0f, f10)));
        } else {
            j(0.0f);
        }
    }

    Drawable e() {
        return this.f826a.d();
    }

    public void f(Configuration configuration) {
        if (!this.f832g) {
            this.f830e = e();
        }
        k();
    }

    public boolean g(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f831f) {
            return false;
        }
        l();
        return true;
    }

    void h(int i10) {
        this.f826a.e(i10);
    }

    void i(Drawable drawable, int i10) {
        if (!this.f836k && !this.f826a.a()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f836k = true;
        }
        this.f826a.c(drawable, i10);
    }

    public void k() {
        if (this.f827b.C(8388611)) {
            j(1.0f);
        } else {
            j(0.0f);
        }
        if (this.f831f) {
            i(this.f828c, this.f827b.C(8388611) ? this.f834i : this.f833h);
        }
    }

    void l() {
        int iQ = this.f827b.q(8388611);
        if (this.f827b.F(8388611) && iQ != 2) {
            this.f827b.d(8388611);
        } else if (iQ != 1) {
            this.f827b.K(8388611);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, androidx.appcompat.graphics.drawable.d dVar, int i10, int i11) {
        this.f829d = true;
        this.f831f = true;
        this.f836k = false;
        if (toolbar != null) {
            this.f826a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new a());
        } else if (activity instanceof c) {
            this.f826a = ((c) activity).f();
        } else {
            this.f826a = new d(activity);
        }
        this.f827b = drawerLayout;
        this.f833h = i10;
        this.f834i = i11;
        if (dVar == null) {
            this.f828c = new androidx.appcompat.graphics.drawable.d(this.f826a.b());
        } else {
            this.f828c = dVar;
        }
        this.f830e = e();
    }
}
