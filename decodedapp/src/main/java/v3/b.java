package v3;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import com.dw.android.widget.SearchBar;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends i implements AbsListView.OnScrollListener, s, t {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final a f29537h0 = new a(null);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    protected SearchBar f29539c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    protected e0 f29540d0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private Integer f29542f0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final View.OnClickListener f29538b0 = new View.OnClickListener() { // from class: v3.a
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.R1(this.f29536a, view);
        }
    };

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final z f29541e0 = new z();

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f29543g0 = true;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: v3.b$b, reason: collision with other inner class name */
    public static final class C0403b implements SearchBar.g {
        C0403b() {
        }

        @Override // com.dw.android.widget.SearchBar.g
        public void a(SearchBar searchBar, String str) {
            rd.m.e(searchBar, "v");
            rd.m.e(str, "text");
            e0 e0Var = b.this.f29540d0;
            if (e0Var != null) {
                e0Var.h(str);
            }
        }

        @Override // com.dw.android.widget.SearchBar.g
        public boolean b(SearchBar searchBar) {
            rd.m.e(searchBar, "v");
            e0 e0Var = b.this.f29540d0;
            if (e0Var != null) {
                return e0Var.T0();
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R1(b bVar, View view) {
        e0 e0Var = bVar.f29540d0;
        if (e0Var != null) {
            rd.m.b(e0Var);
            e0Var.f0();
        }
    }

    private final void V1(SearchBar searchBar) {
        this.f29539c0 = searchBar;
        if (searchBar != null) {
            Integer num = this.f29542f0;
            if (num != null) {
                searchBar.setBackgroundColor(num.intValue());
            }
            searchBar.setActionListener(new C0403b());
            searchBar.n(this, 65534);
            searchBar.setAppIcon(a6.y.d(this, k3.b.f19159g));
            searchBar.setAppIconContentDescription(getString(k3.j.f19236d));
            searchBar.setAppIconOnClickListener(this.f29538b0);
            e0 e0Var = this.f29540d0;
            searchBar.setShowAppIcon(e0Var != null ? e0Var.s0() : false);
        }
    }

    protected z M1() {
        return this.f29541e0;
    }

    protected final SearchBar N1() {
        if (this.f29539c0 == null) {
            V1(S1());
        }
        return this.f29539c0;
    }

    protected void O1() {
        this.f29543g0 = false;
        androidx.appcompat.app.a aVarY0 = Y0();
        if (aVarY0 != null) {
            aVarY0.f();
        }
    }

    public final boolean P1() {
        SearchBar searchBar = this.f29539c0;
        return searchBar != null && searchBar.getVisibility() == 0;
    }

    protected final boolean Q1() {
        return this.f29543g0;
    }

    protected SearchBar S1() {
        return null;
    }

    protected boolean T1() {
        onBackPressed();
        return true;
    }

    public void U1() {
        this.f29542f0 = null;
    }

    public void W1(int i10) {
        SearchBar searchBarN1 = N1();
        if (searchBarN1 != null) {
            searchBarN1.setBackgroundColor(i10);
        }
        Integer num = this.f29542f0;
        if (num == null || num == null || i10 != num.intValue()) {
            this.f29542f0 = Integer.valueOf(i10);
            androidx.appcompat.app.a aVarY0 = Y0();
            if (aVarY0 != null) {
                Drawable drawableD = a6.y.d(this, k3.b.f19165m);
                aVarY0.m(drawableD == null ? new ColorDrawable(i10) : new LayerDrawable(new Drawable[]{new ColorDrawable(i10), drawableD}));
            }
            float[] fArr = {0.0f, 0.0f, f - (f / 5)};
            Color.colorToHSV(i10, fArr);
            float f10 = fArr[2];
            getWindow().setStatusBarColor(Color.HSVToColor(Color.alpha(i10), fArr));
        }
    }

    protected void X1() {
        this.f29543g0 = true;
        androidx.appcompat.app.a aVarY0 = Y0();
        if (aVarY0 != null) {
            aVarY0.A();
        }
    }

    @Override // androidx.fragment.app.p, d.q, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        SearchBar searchBarN1;
        super.onActivityResult(i10, i11, intent);
        if (i10 != 65534 || (searchBarN1 = N1()) == null) {
            return;
        }
        searchBarN1.o(intent);
    }

    @Override // v3.i, d.q, android.app.Activity
    public void onBackPressed() {
        if (N(null, k3.f.U, 0, 0, null)) {
            return;
        }
        try {
            super.onBackPressed();
        } catch (IllegalStateException e10) {
            if (a6.f.f328a) {
                throw e10;
            }
            finish();
            Log.e("ActionBarActivityEx", "java.lang.IllegalStateException in onBackPressed", e10);
        }
    }

    @Override // androidx.fragment.app.p, d.q, a0.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        if (a6.f.f328a) {
            Log.i("ActionBarActivityEx", "onCreate@" + this);
        }
        super.onCreate(bundle);
        androidx.appcompat.app.a aVarY0 = Y0();
        if (aVarY0 != null) {
            boolean z10 = !isTaskRoot();
            aVarY0.o(z10);
            aVarY0.p(z10);
        }
    }

    @Override // v3.i, androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    protected void onDestroy() {
        if (a6.f.f328a) {
            Log.i("ActionBarActivityEx", "onDestroy@" + this);
        }
        M1().a();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        rd.m.e(menuItem, "item");
        if (super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return menuItem.getItemId() == 16908332 && T1();
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    protected void onPause() {
        if (a6.f.f328a) {
            Log.i("ActionBarActivityEx", "onPause@" + this);
        }
        M1().c();
        super.onPause();
    }

    @Override // v3.i, androidx.fragment.app.p, d.q, android.app.Activity, a0.b.e
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        rd.m.e(strArr, "permissions");
        rd.m.e(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        mi.c.e().m(new c0(i10, strArr, iArr));
    }

    @Override // v3.i, androidx.fragment.app.p, android.app.Activity
    protected void onResume() {
        if (a6.f.f328a) {
            Log.i("ActionBarActivityEx", "onResume@" + this);
        }
        M1().d();
        super.onResume();
    }

    public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        rd.m.e(absListView, "view");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i10) {
        rd.m.e(absListView, "view");
        M1().b(i10);
    }

    @Override // androidx.appcompat.app.d, android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        androidx.appcompat.app.a aVarY0 = Y0();
        if (aVarY0 == null) {
            return;
        }
        if (i10 != 0) {
            charSequence = z5.a.e(charSequence, i10);
        }
        aVarY0.y(charSequence);
    }
}
