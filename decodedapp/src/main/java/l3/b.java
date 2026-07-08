package l3;

import a6.y;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.o;
import com.dw.android.widget.SearchBar;
import k3.g;
import l1.i;
import v3.d0;
import v3.e0;
import v3.m0;
import v3.n0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends v3.b implements d0 {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private o f20371i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private int f20372j0;

    @Override // v3.d0
    public void G(e0 e0Var) {
        if (e0Var == this.f29540d0) {
            this.f29540d0 = null;
        }
        a2();
    }

    @Override // v3.i, v3.s
    public boolean N(o oVar, int i10, int i11, int i12, Object obj) {
        o oVar2;
        if (i10 != k3.f.V || oVar != (oVar2 = this.f20371i0)) {
            return super.N(oVar, i10, i11, i12, obj);
        }
        c2(oVar, (CharSequence) obj, oVar2 instanceof m0 ? ((m0) oVar2).s4() : null);
        return true;
    }

    @Override // v3.b
    protected SearchBar S1() {
        View viewFindViewById = findViewById(k3.f.D);
        if (viewFindViewById == null) {
            return null;
        }
        SearchBar searchBar = (SearchBar) ((ViewStub) viewFindViewById).inflate();
        searchBar.setBackOnClickListener(new View.OnClickListener() { // from class: l3.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20370a.onBackPressed();
            }
        });
        return searchBar;
    }

    @Override // v3.b
    protected boolean T1() {
        i iVar = this.f20371i0;
        if ((iVar instanceof n0) && ((n0) iVar).R0()) {
            return true;
        }
        return super.T1();
    }

    @Override // v3.b
    protected void X1() {
        i iVar = this.f20371i0;
        if ((iVar instanceof n0) && ((n0) iVar).D0()) {
            return;
        }
        super.X1();
    }

    protected abstract o Z1();

    public void a2() {
        SearchBar searchBarN1;
        X1();
        if (P1() && (searchBarN1 = N1()) != null) {
            searchBarN1.setVisibility(8);
            searchBarN1.j();
        }
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

    /* JADX WARN: Multi-variable type inference failed */
    protected void c2(o oVar, CharSequence charSequence, Integer num) {
        androidx.appcompat.app.a aVarY0;
        if (oVar == 0 || oVar != this.f20371i0 || (aVarY0 = Y0()) == null || !(oVar instanceof n0)) {
            return;
        }
        n0 n0Var = (n0) oVar;
        CharSequence title = n0Var.getTitle();
        if (title != null) {
            charSequence = title;
        }
        setTitle(charSequence);
        aVarY0.w(n0Var.getSubtitle());
        Drawable drawableL = n0Var.L();
        if (drawableL != null) {
            aVarY0.s(drawableL);
        } else {
            if (this.f20372j0 == 0) {
                this.f20372j0 = y.f(this, k3.b.f19158f);
            }
            aVarY0.r(this.f20372j0);
        }
        if (num == null) {
            U1();
        } else {
            W1(num.intValue());
        }
        if (n0Var.D0()) {
            O1();
        } else {
            if (P1()) {
                return;
            }
            X1();
        }
    }

    @Override // v3.b, androidx.fragment.app.p, d.q, a0.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f19224r);
        androidx.appcompat.app.a aVarY0 = Y0();
        if (aVarY0 != null) {
            aVarY0.o(true);
        }
        if (bundle == null) {
            o oVarZ1 = Z1();
            this.f20371i0 = oVarZ1;
            if (oVarZ1 == null) {
                finish();
                return;
            }
            N0().o().c(k3.f.f19197q, this.f20371i0, "c").h();
        } else {
            this.f20371i0 = N0().i0(k3.f.f19197q);
        }
        o oVar = this.f20371i0;
        if (oVar == null) {
            finish();
        } else if (oVar instanceof n0) {
            CharSequence title = getTitle();
            o oVar2 = this.f20371i0;
            c2(oVar, title, oVar2 instanceof m0 ? ((m0) oVar2).s4() : null);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        i iVar = this.f20371i0;
        e0 searchable = (iVar == null || !(iVar instanceof e0)) ? null : ((e0) iVar).getSearchable();
        if (searchable == null) {
            return false;
        }
        if (searchable.m0()) {
            searchable.p0();
            return false;
        }
        searchable.Q();
        return false;
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
}
