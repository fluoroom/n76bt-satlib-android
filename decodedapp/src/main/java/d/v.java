package d;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.m;
import androidx.lifecycle.z0;

/* JADX INFO: loaded from: classes.dex */
public class v extends Dialog implements androidx.lifecycle.t, k0, l1.i {

    /* JADX INFO: renamed from: a */
    private androidx.lifecycle.v f10496a;

    /* JADX INFO: renamed from: b */
    private final l1.h f10497b;

    /* JADX INFO: renamed from: c */
    private final j0 f10498c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, int i10) {
        super(context, i10);
        rd.m.e(context, "context");
        this.f10497b = l1.h.f20328c.b(this);
        this.f10498c = new j0(new Runnable() { // from class: d.u
            @Override // java.lang.Runnable
            public final void run() {
                v.f(this.f10495a);
            }
        });
    }

    private final androidx.lifecycle.v b() {
        androidx.lifecycle.v vVar = this.f10496a;
        if (vVar != null) {
            return vVar;
        }
        androidx.lifecycle.v vVar2 = new androidx.lifecycle.v(this);
        this.f10496a = vVar2;
        return vVar2;
    }

    public static final void f(v vVar) {
        super.onBackPressed();
    }

    @Override // androidx.lifecycle.t
    public androidx.lifecycle.m S0() {
        return b();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        rd.m.e(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public void c() {
        Window window = getWindow();
        rd.m.b(window);
        View decorView = window.getDecorView();
        rd.m.d(decorView, "getDecorView(...)");
        z0.a(decorView, this);
        Window window2 = getWindow();
        rd.m.b(window2);
        View decorView2 = window2.getDecorView();
        rd.m.d(decorView2, "getDecorView(...)");
        n0.a(decorView2, this);
        Window window3 = getWindow();
        rd.m.b(window3);
        View decorView3 = window3.getDecorView();
        rd.m.d(decorView3, "getDecorView(...)");
        l1.m.a(decorView3, this);
    }

    @Override // d.k0
    public final j0 d() {
        return this.f10498c;
    }

    @Override // l1.i
    public l1.f e0() {
        return this.f10497b.b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f10498c.r();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            j0 j0Var = this.f10498c;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            rd.m.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            j0Var.u(onBackInvokedDispatcher);
        }
        this.f10497b.d(bundle);
        b().i(m.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        rd.m.d(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.f10497b.e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        b().i(m.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        b().i(m.a.ON_DESTROY);
        this.f10496a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        c();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        rd.m.e(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        rd.m.e(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
