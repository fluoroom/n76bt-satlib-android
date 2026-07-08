package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.a1;
import androidx.lifecycle.z0;

/* JADX INFO: loaded from: classes.dex */
public class n extends o implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private boolean A0;
    private boolean B0;
    private boolean C0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private Handler f2355o0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private boolean f2364x0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private Dialog f2366z0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private Runnable f2356p0 = new a();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private DialogInterface.OnCancelListener f2357q0 = new b();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private DialogInterface.OnDismissListener f2358r0 = new c();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f2359s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f2360t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean f2361u0 = true;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private boolean f2362v0 = true;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f2363w0 = -1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private androidx.lifecycle.c0 f2365y0 = new d();
    private boolean D0 = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.f2358r0.onDismiss(n.this.f2366z0);
        }
    }

    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (n.this.f2366z0 != null) {
                n nVar = n.this;
                nVar.onCancel(nVar.f2366z0);
            }
        }
    }

    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (n.this.f2366z0 != null) {
                n nVar = n.this;
                nVar.onDismiss(nVar.f2366z0);
            }
        }
    }

    class d implements androidx.lifecycle.c0 {
        d() {
        }

        @Override // androidx.lifecycle.c0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(androidx.lifecycle.t tVar) {
            if (tVar == null || !n.this.f2362v0) {
                return;
            }
            View viewZ3 = n.this.z3();
            if (viewZ3.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (n.this.f2366z0 != null) {
                if (w.J0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + n.this.f2366z0);
                }
                n.this.f2366z0.setContentView(viewZ3);
            }
        }
    }

    class e extends y0.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y0.g f2371a;

        e(y0.g gVar) {
            this.f2371a = gVar;
        }

        @Override // y0.g
        public View c(int i10) {
            return this.f2371a.e() ? this.f2371a.c(i10) : n.this.a4(i10);
        }

        @Override // y0.g
        public boolean e() {
            return this.f2371a.e() || n.this.b4();
        }
    }

    private void W3(boolean z10, boolean z11, boolean z12) {
        if (this.B0) {
            return;
        }
        this.B0 = true;
        this.C0 = false;
        Dialog dialog = this.f2366z0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f2366z0.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f2355o0.getLooper()) {
                    onDismiss(this.f2366z0);
                } else {
                    this.f2355o0.post(this.f2356p0);
                }
            }
        }
        this.A0 = true;
        if (this.f2363w0 >= 0) {
            if (z12) {
                B1().Z0(this.f2363w0, 1);
            } else {
                B1().X0(this.f2363w0, 1, z10);
            }
            this.f2363w0 = -1;
            return;
        }
        d0 d0VarO = B1().o();
        d0VarO.t(true);
        d0VarO.o(this);
        if (z12) {
            d0VarO.j();
        } else if (z10) {
            d0VarO.i();
        } else {
            d0VarO.h();
        }
    }

    private void c4(Bundle bundle) {
        if (this.f2362v0 && !this.D0) {
            try {
                this.f2364x0 = true;
                Dialog dialogZ3 = Z3(bundle);
                this.f2366z0 = dialogZ3;
                if (this.f2362v0) {
                    f4(dialogZ3, this.f2359s0);
                    Context contextK1 = k1();
                    if (contextK1 instanceof Activity) {
                        this.f2366z0.setOwnerActivity((Activity) contextK1);
                    }
                    this.f2366z0.setCancelable(this.f2361u0);
                    this.f2366z0.setOnCancelListener(this.f2357q0);
                    this.f2366z0.setOnDismissListener(this.f2358r0);
                    this.D0 = true;
                } else {
                    this.f2366z0 = null;
                }
                this.f2364x0 = false;
            } catch (Throwable th2) {
                this.f2364x0 = false;
                throw th2;
            }
        }
    }

    @Override // androidx.fragment.app.o
    public LayoutInflater A2(Bundle bundle) {
        LayoutInflater layoutInflaterA2 = super.A2(bundle);
        if (this.f2362v0 && !this.f2364x0) {
            c4(bundle);
            if (w.J0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f2366z0;
            if (dialog != null) {
                return layoutInflaterA2.cloneInContext(dialog.getContext());
            }
        } else if (w.J0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f2362v0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterA2;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterA2;
    }

    @Override // androidx.fragment.app.o
    public void N2(Bundle bundle) {
        super.N2(bundle);
        Dialog dialog = this.f2366z0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i10 = this.f2359s0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f2360t0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f2361u0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f2362v0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f2363w0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.o
    public void O2() {
        super.O2();
        Dialog dialog = this.f2366z0;
        if (dialog != null) {
            this.A0 = false;
            dialog.show();
            View decorView = this.f2366z0.getWindow().getDecorView();
            z0.a(decorView, this);
            a1.a(decorView, this);
            l1.m.a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.o
    public void P2() {
        super.P2();
        Dialog dialog = this.f2366z0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.o
    public void R2(Bundle bundle) {
        Bundle bundle2;
        super.R2(bundle);
        if (this.f2366z0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2366z0.onRestoreInstanceState(bundle2);
    }

    public void V3() {
        W3(false, false, false);
    }

    public Dialog X3() {
        return this.f2366z0;
    }

    @Override // androidx.fragment.app.o
    void Y2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.Y2(layoutInflater, viewGroup, bundle);
        if (this.T != null || this.f2366z0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2366z0.onRestoreInstanceState(bundle2);
    }

    public int Y3() {
        return this.f2360t0;
    }

    @Override // androidx.fragment.app.o
    y0.g Z0() {
        return new e(super.Z0());
    }

    public Dialog Z3(Bundle bundle) {
        if (w.J0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new d.v(x3(), Y3());
    }

    View a4(int i10) {
        Dialog dialog = this.f2366z0;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    boolean b4() {
        return this.D0;
    }

    public final Dialog d4() {
        Dialog dialogX3 = X3();
        if (dialogX3 != null) {
            return dialogX3;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void e4(boolean z10) {
        this.f2362v0 = z10;
    }

    public void f4(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void g4(w wVar, String str) {
        this.B0 = false;
        this.C0 = true;
        d0 d0VarO = wVar.o();
        d0VarO.t(true);
        d0VarO.e(this, str);
        d0VarO.h();
    }

    @Override // androidx.fragment.app.o
    public void l2(Bundle bundle) {
        super.l2(bundle);
    }

    @Override // androidx.fragment.app.o
    public void o2(Context context) {
        super.o2(context);
        V1().i(this.f2365y0);
        if (this.C0) {
            return;
        }
        this.B0 = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.A0) {
            return;
        }
        if (w.J0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        W3(true, true, false);
    }

    @Override // androidx.fragment.app.o
    public void r2(Bundle bundle) {
        super.r2(bundle);
        this.f2355o0 = new Handler();
        this.f2362v0 = this.J == 0;
        if (bundle != null) {
            this.f2359s0 = bundle.getInt("android:style", 0);
            this.f2360t0 = bundle.getInt("android:theme", 0);
            this.f2361u0 = bundle.getBoolean("android:cancelable", true);
            this.f2362v0 = bundle.getBoolean("android:showsDialog", this.f2362v0);
            this.f2363w0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.o
    public void y2() {
        super.y2();
        Dialog dialog = this.f2366z0;
        if (dialog != null) {
            this.A0 = true;
            dialog.setOnDismissListener(null);
            this.f2366z0.dismiss();
            if (!this.B0) {
                onDismiss(this.f2366z0);
            }
            this.f2366z0 = null;
            this.D0 = false;
        }
    }

    @Override // androidx.fragment.app.o
    public void z2() {
        super.z2();
        if (!this.C0 && !this.B0) {
            this.B0 = true;
        }
        V1().m(this.f2365y0);
    }
}
