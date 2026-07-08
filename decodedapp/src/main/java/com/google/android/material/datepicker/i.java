package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import m0.o0;
import n0.x;

/* JADX INFO: loaded from: classes3.dex */
public final class i<S> extends q {
    static final Object C0 = "MONTHS_VIEW_GROUP_TAG";
    static final Object D0 = "NAVIGATION_PREV_TAG";
    static final Object E0 = "NAVIGATION_NEXT_TAG";
    static final Object F0 = "SELECTOR_TOGGLE_TAG";
    private MaterialButton A0;
    private AccessibilityManager B0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f7752p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private com.google.android.material.datepicker.a f7753q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private com.google.android.material.datepicker.m f7754r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private l f7755s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private com.google.android.material.datepicker.c f7756t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private RecyclerView f7757u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private RecyclerView f7758v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private View f7759w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private View f7760x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private View f7761y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private View f7762z0;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f7763a;

        a(o oVar) {
            this.f7763a = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.m4(this.f7763a.E(i.this.j4().f2() - 1));
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7765a;

        b(int i10) {
            this.f7765a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f7758v0.E1(this.f7765a);
        }
    }

    class c extends m0.a {
        c() {
        }

        @Override // m0.a
        public void g(View view, x xVar) {
            super.g(view, xVar);
            xVar.v0(null);
        }
    }

    class d extends r {
        final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.I = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void R1(RecyclerView.b0 b0Var, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = i.this.f7758v0.getWidth();
                iArr[1] = i.this.f7758v0.getWidth();
            } else {
                iArr[0] = i.this.f7758v0.getHeight();
                iArr[1] = i.this.f7758v0.getHeight();
            }
        }
    }

    class e implements m {
        e() {
        }

        @Override // com.google.android.material.datepicker.i.m
        public void a(long j10) {
            if (i.this.f7753q0.h().a(j10)) {
                i.W3(i.this);
                throw null;
            }
        }
    }

    class f extends m0.a {
        f() {
        }

        @Override // m0.a
        public void g(View view, x xVar) {
            super.g(view, xVar);
            xVar.O0(false);
        }
    }

    class g extends RecyclerView.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Calendar f7770a = u.k();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Calendar f7771b = u.k();

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            if ((recyclerView.getAdapter() instanceof v) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                i.W3(i.this);
                throw null;
            }
        }
    }

    class h extends m0.a {
        h() {
        }

        @Override // m0.a
        public void g(View view, x xVar) {
            super.g(view, xVar);
            xVar.b(new x.a(16, i.this.f7762z0.getVisibility() == 0 ? i.this.N1(u8.j.f28724z) : i.this.N1(u8.j.f28722x)));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.i$i, reason: collision with other inner class name */
    class C0116i extends RecyclerView.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f7774a;

        C0116i(o oVar) {
            this.f7774a = oVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            int iD2 = i10 < 0 ? i.this.j4().d2() : i.this.j4().f2();
            com.google.android.material.datepicker.m mVarE = this.f7774a.E(iD2);
            i.this.f7754r0 = mVarE;
            i.this.A0.setText(this.f7774a.F(iD2));
            i.this.q4(this.f7774a.G(mVarE));
        }
    }

    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.p4();
        }
    }

    class k implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f7777a;

        k(o oVar) {
            this.f7777a = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.m4(this.f7777a.E(i.this.j4().d2() + 1));
        }
    }

    enum l {
        DAY,
        YEAR
    }

    interface m {
        void a(long j10);
    }

    static /* synthetic */ com.google.android.material.datepicker.d W3(i iVar) {
        iVar.getClass();
        return null;
    }

    private void b4(View view, o oVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(u8.f.f28660r);
        this.A0 = materialButton;
        materialButton.setTag(F0);
        o0.n0(this.A0, new h());
        View viewFindViewById = view.findViewById(u8.f.f28662t);
        this.f7759w0 = viewFindViewById;
        viewFindViewById.setTag(D0);
        View viewFindViewById2 = view.findViewById(u8.f.f28661s);
        this.f7760x0 = viewFindViewById2;
        viewFindViewById2.setTag(E0);
        this.f7761y0 = view.findViewById(u8.f.A);
        this.f7762z0 = view.findViewById(u8.f.f28664v);
        n4(l.DAY);
        this.A0.setText(this.f7754r0.l());
        this.f7758v0.o(new C0116i(oVar));
        this.A0.setOnClickListener(new j());
        this.f7760x0.setOnClickListener(new k(oVar));
        this.f7759w0.setOnClickListener(new a(oVar));
        q4(oVar.G(this.f7754r0));
    }

    private RecyclerView.p c4() {
        return new g();
    }

    static int h4(Context context) {
        return context.getResources().getDimensionPixelSize(u8.d.f28588d0);
    }

    private static int i4(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(u8.d.f28602k0) + resources.getDimensionPixelOffset(u8.d.f28604l0) + resources.getDimensionPixelOffset(u8.d.f28600j0);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(u8.d.f28592f0);
        int i10 = n.f7809e;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(u8.d.f28588d0) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(u8.d.f28598i0)) + resources.getDimensionPixelOffset(u8.d.f28584b0);
    }

    public static i k4(com.google.android.material.datepicker.d dVar, int i10, com.google.android.material.datepicker.a aVar, com.google.android.material.datepicker.g gVar) {
        i iVar = new i();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", gVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.l());
        iVar.E3(bundle);
        return iVar;
    }

    private void l4(int i10) {
        this.f7758v0.post(new b(i10));
    }

    private void o4() {
        o0.n0(this.f7758v0, new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q4(int i10) {
        this.f7760x0.setEnabled(i10 + 1 < this.f7758v0.getAdapter().f());
        this.f7759w0.setEnabled(i10 - 1 >= 0);
    }

    @Override // androidx.fragment.app.o
    public void N2(Bundle bundle) {
        super.N2(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f7752p0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7753q0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f7754r0);
    }

    @Override // com.google.android.material.datepicker.q
    public boolean S3(p pVar) {
        return super.S3(pVar);
    }

    com.google.android.material.datepicker.a d4() {
        return this.f7753q0;
    }

    com.google.android.material.datepicker.c e4() {
        return this.f7756t0;
    }

    com.google.android.material.datepicker.m f4() {
        return this.f7754r0;
    }

    public com.google.android.material.datepicker.d g4() {
        return null;
    }

    LinearLayoutManager j4() {
        return (LinearLayoutManager) this.f7758v0.getLayoutManager();
    }

    void m4(com.google.android.material.datepicker.m mVar) {
        o oVar = (o) this.f7758v0.getAdapter();
        int iG = oVar.G(mVar);
        AccessibilityManager accessibilityManager = this.B0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iG2 = iG - oVar.G(this.f7754r0);
            boolean z10 = Math.abs(iG2) > 3;
            boolean z11 = iG2 > 0;
            this.f7754r0 = mVar;
            if (z10 && z11) {
                this.f7758v0.v1(iG - 3);
                l4(iG);
            } else if (z10) {
                this.f7758v0.v1(iG + 3);
                l4(iG);
            } else {
                l4(iG);
            }
        } else {
            this.f7754r0 = mVar;
            this.f7758v0.v1(iG);
        }
        q4(iG);
    }

    void n4(l lVar) {
        this.f7755s0 = lVar;
        if (lVar == l.YEAR) {
            this.f7757u0.getLayoutManager().C1(((v) this.f7757u0.getAdapter()).D(this.f7754r0.f7804c));
            this.f7761y0.setVisibility(0);
            this.f7762z0.setVisibility(8);
            this.f7759w0.setVisibility(8);
            this.f7760x0.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.f7761y0.setVisibility(8);
            this.f7762z0.setVisibility(0);
            this.f7759w0.setVisibility(0);
            this.f7760x0.setVisibility(0);
            m4(this.f7754r0);
        }
    }

    void p4() {
        l lVar = this.f7755s0;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            n4(l.DAY);
            this.f7758v0.announceForAccessibility(N1(u8.j.A));
        } else if (lVar == l.DAY) {
            n4(lVar2);
            this.f7757u0.announceForAccessibility(N1(u8.j.B));
        }
    }

    @Override // androidx.fragment.app.o
    public void r2(Bundle bundle) {
        super.r2(bundle);
        if (bundle == null) {
            bundle = i1();
        }
        this.f7752p0 = bundle.getInt("THEME_RES_ID_KEY");
        android.support.v4.media.session.b.a(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f7753q0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        android.support.v4.media.session.b.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f7754r0 = (com.google.android.material.datepicker.m) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(k1(), this.f7752p0);
        this.f7756t0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.B0 = (AccessibilityManager) x3().getSystemService("accessibility");
        com.google.android.material.datepicker.m mVarM = this.f7753q0.m();
        if (com.google.android.material.datepicker.k.r4(contextThemeWrapper)) {
            i10 = u8.h.f28693v;
            i11 = 1;
        } else {
            i10 = u8.h.f28691t;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        viewInflate.setMinimumHeight(i4(x3()));
        GridView gridView = (GridView) viewInflate.findViewById(u8.f.f28665w);
        o0.n0(gridView, new c());
        int iJ = this.f7753q0.j();
        gridView.setAdapter((ListAdapter) (iJ > 0 ? new com.google.android.material.datepicker.h(iJ) : new com.google.android.material.datepicker.h()));
        gridView.setNumColumns(mVarM.f7805d);
        gridView.setEnabled(false);
        this.f7758v0 = (RecyclerView) viewInflate.findViewById(u8.f.f28668z);
        this.f7758v0.setLayoutManager(new d(k1(), i11, false, i11));
        this.f7758v0.setTag(C0);
        o oVar = new o(contextThemeWrapper, null, this.f7753q0, null, new e());
        this.f7758v0.setAdapter(oVar);
        int integer = contextThemeWrapper.getResources().getInteger(u8.g.f28671c);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(u8.f.A);
        this.f7757u0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f7757u0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f7757u0.setAdapter(new v(this));
            this.f7757u0.l(c4());
        }
        if (viewInflate.findViewById(u8.f.f28660r) != null) {
            b4(viewInflate, oVar);
        }
        if (!com.google.android.material.datepicker.k.r4(contextThemeWrapper)) {
            new androidx.recyclerview.widget.j().b(this.f7758v0);
        }
        this.f7758v0.v1(oVar.G(this.f7754r0));
        o4();
        return viewInflate;
    }
}
