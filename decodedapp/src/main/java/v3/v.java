package v3;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class v extends androidx.fragment.app.i0 implements AbsListView.OnScrollListener, s {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private ArrayList f29601r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private ProgressDialog f29602s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private s f29603t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private c f29604u0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private com.dw.android.widget.a f29606w0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private BottomSheetBehavior f29608y0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    protected final z f29600q0 = new z();

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private long f29605v0 = -2;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    protected final Handler f29607x0 = new Handler();

    class a implements AdapterView.OnItemLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f29609a;

        a() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f29609a) {
                return false;
            }
            this.f29609a = true;
            view.showContextMenu();
            this.f29609a = false;
            return true;
        }
    }

    protected static class c extends a6.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private WeakReference f29612d;

        public c(v vVar) {
            this.f29612d = new WeakReference(vVar);
        }

        @Override // a6.b
        protected void b(int i10, Object obj) {
            v vVar = (v) this.f29612d.get();
            if (vVar == null || vVar.g2()) {
                return;
            }
            vVar.e4(i10, obj);
        }
    }

    private boolean V3() {
        if (!b4()) {
            return false;
        }
        for (androidx.fragment.app.o oVar : j1().v0()) {
            if ((oVar instanceof v) && ((v) oVar).V3()) {
                return true;
            }
        }
        return c4();
    }

    @Override // androidx.fragment.app.o
    public void H2() {
        this.f29600q0.c();
        super.H2();
    }

    @Override // androidx.fragment.app.o
    public void M2() {
        this.f29600q0.d();
        super.M2();
    }

    @Override // androidx.fragment.app.o
    public void M3(boolean z10) {
        super.M3(z10);
        if (z10) {
            return;
        }
        U3();
    }

    @Override // v3.s
    public boolean N(androidx.fragment.app.o oVar, int i10, int i11, int i12, Object obj) {
        if (b4()) {
            return f4(oVar, i10, i11, i12, obj);
        }
        return false;
    }

    @Override // androidx.fragment.app.o
    public void N2(Bundle bundle) {
        long j10 = this.f29605v0;
        if (j10 >= 0) {
            bundle.putLong("fragment_ex_key_session_id", j10);
        }
        super.N2(bundle);
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle bundle) {
        super.Q2(view, bundle);
        NestedScrollView nestedScrollView = (NestedScrollView) view.findViewById(k3.f.f19198r);
        if (nestedScrollView == null) {
            return;
        }
        BottomSheetBehavior bottomSheetBehaviorM0 = BottomSheetBehavior.m0(nestedScrollView);
        this.f29608y0 = bottomSheetBehaviorM0;
        bottomSheetBehaviorM0.S0(5);
        this.f29608y0.Y(new b());
    }

    protected void U3() {
        com.dw.android.widget.a aVar = this.f29606w0;
        if (aVar != null) {
            aVar.c();
            this.f29606w0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void W3() {
        androidx.fragment.app.p pVarE1 = e1();
        if (pVarE1 != null) {
            pVarE1.finish();
        }
    }

    public androidx.fragment.app.o X3(Class cls, boolean z10) {
        androidx.fragment.app.o oVarU1;
        if ((e1() instanceof i) && (oVarU1 = ((i) e1()).u1(cls, z10)) != null) {
            return oVarU1;
        }
        if (this.f29608y0 == null) {
            return null;
        }
        androidx.fragment.app.w wVarJ1 = j1();
        int i10 = k3.f.f19198r;
        androidx.fragment.app.o oVarI0 = wVarJ1.i0(i10);
        if (oVarI0 != null) {
            if (oVarI0.getClass() == cls) {
                return oVarI0;
            }
            if (z10) {
                wVarJ1.o().o(oVarI0).h();
            }
        }
        if (!z10) {
            return null;
        }
        androidx.fragment.app.o oVarY1 = androidx.fragment.app.o.Y1(k1(), cls.getName());
        wVarJ1.o().b(i10, oVarY1).h();
        return oVarY1;
    }

    protected c Y3() {
        if (this.f29604u0 == null) {
            this.f29604u0 = new c(this);
        }
        return this.f29604u0;
    }

    public void Z3() {
        ProgressDialog progressDialog = this.f29602s0;
        if (progressDialog != null) {
            try {
                progressDialog.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    protected void a4() {
        androidx.fragment.app.p pVarE1 = e1();
        if (pVarE1 == null) {
            return;
        }
        pVarE1.V0();
    }

    public boolean b4() {
        if (!S1()) {
            return false;
        }
        for (androidx.fragment.app.o oVarA1 = A1(); oVarA1 != null; oVarA1 = oVarA1.A1()) {
            if (!oVarA1.S1()) {
                return false;
            }
        }
        return true;
    }

    protected boolean c4() {
        return false;
    }

    protected void d4(int i10) {
        if (a2()) {
            for (androidx.fragment.app.o oVar : j1().v0()) {
                if (oVar instanceof v) {
                    ((v) oVar).d4(i10);
                }
            }
        }
    }

    protected boolean e4(int i10, Object obj) {
        return false;
    }

    protected boolean f4(androidx.fragment.app.o oVar, int i10, int i11, int i12, Object obj) {
        if (i10 == k3.f.U) {
            return V3();
        }
        return false;
    }

    public void g4(View view) {
        s3(view);
        if (view instanceof AbsListView) {
            ((AbsListView) view).setOnItemLongClickListener(new a());
        }
    }

    protected boolean h4(int i10, int i11, int i12, Object obj) {
        s sVar = this.f29603t0;
        if (sVar == null) {
            return false;
        }
        return sVar.N(this, i10, i11, i12, obj);
    }

    protected void i4(final int i10) {
        if (((e1() instanceof i) && ((i) e1()).K1(i10)) || this.f29608y0 == null || !a2()) {
            return;
        }
        View viewT1 = T1();
        if (viewT1 != null) {
            viewT1.post(new Runnable() { // from class: v3.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29598a.f29608y0.S0(i10);
                }
            });
        } else {
            this.f29608y0.S0(i10);
        }
    }

    public void j4() {
        if (this.f29602s0 == null) {
            ProgressDialog progressDialog = new ProgressDialog(e1());
            int i10 = k3.j.f19237e;
            progressDialog.setTitle(i10);
            progressDialog.setMessage(N1(i10));
            progressDialog.setCancelable(false);
            this.f29602s0 = progressDialog;
        }
        this.f29602s0.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.o
    public void n2(Activity activity) {
        super.n2(activity);
        if (activity instanceof t) {
            ((t) activity).x(this);
        }
        if (activity instanceof s) {
            this.f29603t0 = (s) activity;
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i10) {
        this.f29600q0.b(i10);
    }

    @Override // androidx.fragment.app.o
    public boolean q2(MenuItem menuItem) {
        if (super.q2(menuItem)) {
            return true;
        }
        Intent intent = menuItem.getIntent();
        if (intent == null) {
            return false;
        }
        j.e(e1(), intent);
        return true;
    }

    @Override // androidx.fragment.app.o
    public void r2(Bundle bundle) {
        super.r2(bundle);
        if (bundle != null) {
            this.f29605v0 = bundle.getLong("fragment_ex_key_session_id", -1L);
        }
        if (this.f29605v0 < -1) {
            this.f29605v0 = -1L;
        }
    }

    @Override // androidx.fragment.app.o
    public void w2() {
        this.f29600q0.a();
        ProgressDialog progressDialog = this.f29602s0;
        if (progressDialog != null) {
            try {
                if (progressDialog.isShowing()) {
                    this.f29602s0.dismiss();
                }
            } catch (Exception unused) {
            }
        }
        if (this.f29601r0 != null) {
            for (int i10 = 0; i10 < this.f29601r0.size(); i10++) {
                try {
                    Dialog dialog = (Dialog) this.f29601r0.get(i10);
                    if (dialog.isShowing()) {
                        dialog.dismiss();
                    }
                } catch (Exception unused2) {
                }
            }
        }
        super.w2();
    }

    @Override // androidx.fragment.app.o
    public void z2() {
        super.z2();
        d.k0 k0VarE1 = e1();
        if (k0VarE1 instanceof t) {
            ((t) k0VarE1).c(this);
        }
        this.f29603t0 = null;
    }

    class b extends BottomSheetBehavior.f {
        b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View view, int i10) {
            switch (i10) {
                case 1:
                    s3.b.b("FragmentEx", "BottomSheet:STATE_DRAGGING");
                    break;
                case 2:
                    s3.b.b("FragmentEx", "BottomSheet:STATE_SETTLING");
                    break;
                case 3:
                    s3.b.b("FragmentEx", "BottomSheet:STATE_EXPANDED");
                    break;
                case 4:
                    s3.b.b("FragmentEx", "BottomSheet:STATE_COLLAPSED");
                    break;
                case 5:
                    s3.b.b("FragmentEx", "BottomSheet:STATE_HIDDEN");
                    break;
                case 6:
                    s3.b.b("FragmentEx", "BottomSheet:STATE_HALF_EXPANDED");
                    break;
                default:
                    s3.b.b("FragmentEx", "BottomSheet:" + i10);
                    break;
            }
            v.this.d4(i10);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View view, float f10) {
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }
}
