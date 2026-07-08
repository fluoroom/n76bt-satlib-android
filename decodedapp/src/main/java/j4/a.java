package j4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AbsListView;
import androidx.appcompat.widget.Toolbar;
import com.benshikj.ht.R;
import com.dw.android.widget.SearchBar;
import v3.d0;
import v3.e0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends v3.b implements d0 {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f18413i0;

    @Override // v3.d0
    public void G(e0 e0Var) {
        if (e0Var == this.f29540d0) {
            this.f29540d0 = null;
        }
        Y1();
    }

    @Override // v3.b
    public void O1() {
        super.O1();
    }

    @Override // v3.b
    public void X1() {
        if (this.f18413i0) {
            return;
        }
        super.X1();
    }

    public void Y1() {
        SearchBar searchBarN1;
        X1();
        if (P1() && (searchBarN1 = N1()) != null) {
            searchBarN1.setVisibility(8);
            searchBarN1.j();
            searchBarN1.p();
        }
    }

    protected void a2() {
        Y1();
    }

    public void b2() {
        SearchBar searchBarN1 = N1();
        if (searchBarN1 == null) {
            return;
        }
        O1();
        if (P1()) {
            return;
        }
        searchBarN1.setVisibility(0);
        searchBarN1.requestFocus();
    }

    @Override // androidx.appcompat.app.d
    public void h1(Toolbar toolbar) {
        androidx.appcompat.app.a aVarY0;
        super.h1(toolbar);
        if (Q1() || (aVarY0 = Y0()) == null) {
            return;
        }
        aVarY0.f();
    }

    @Override // v3.b, androidx.fragment.app.p, d.q, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
    }

    @Override // v3.b, v3.i, d.q, android.app.Activity
    public void onBackPressed() {
        if (N(null, R.id.what_on_back_pressed, 0, 0, null)) {
            return;
        }
        if (P1()) {
            Y1();
        } else {
            super.onBackPressed();
        }
    }

    @Override // v3.b, v3.i, androidx.fragment.app.p, android.app.Activity
    protected void onResume() {
        if (isChild()) {
            Intent intent = getParent().getIntent();
            if (intent.getBooleanExtra("com.dw.app.CActivity.EXTRA_IS_NEW_INTENT", false)) {
                String str = "com.dw.app.CActivity.EXTRA_IS_NEW_INTENT@" + Integer.toHexString(hashCode());
                if (intent.getBooleanExtra(str, true)) {
                    Z1();
                    intent.putExtra(str, false);
                }
            }
            if (intent.getBooleanExtra("com.dw.app.CActivity.EXTRA_IS_RESTART_FROM_APP_ICON", false)) {
                String str2 = "com.dw.app.CActivity.EXTRA_IS_RESTART_FROM_APP_ICON@" + Integer.toHexString(hashCode());
                if (intent.getBooleanExtra(str2, true)) {
                    a2();
                    intent.putExtra(str2, false);
                }
            }
        }
        super.onResume();
    }

    @Override // d.q, a0.g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.dw.app.CActivity.EXTRA_IN_SEARCH", P1());
        super.onSaveInstanceState(bundle);
    }

    @Override // v3.d0
    public boolean v(e0 e0Var) {
        if (!P1()) {
            b2();
        }
        this.f29540d0 = e0Var;
        SearchBar searchBarN1 = N1();
        if (searchBarN1 != null) {
            searchBarN1.setShowAppIcon(e0Var.s0());
            searchBarN1.setSearchText(e0Var.getQueryText());
        }
        return P1();
    }

    private void Z1() {
    }

    @Override // v3.b, android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }
}
