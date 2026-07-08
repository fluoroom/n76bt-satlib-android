package v3;

import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.view.b;

/* JADX INFO: loaded from: classes.dex */
public class c extends f0 {
    private androidx.appcompat.view.b I0;

    private class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b.a f29546a;

        public a(b.a aVar) {
            this.f29546a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            this.f29546a.a(bVar);
            c.this.I4(bVar);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f29546a.b(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f29546a.c(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f29546a.d(bVar, menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void F4() {
        androidx.appcompat.view.b bVar = this.I0;
        this.I0 = null;
        if (bVar == null) {
            return;
        }
        bVar.finish();
    }

    protected androidx.appcompat.view.b G4() {
        return this.I0;
    }

    protected boolean H4() {
        return this.I0 != null;
    }

    protected void I4(androidx.appcompat.view.b bVar) {
        if (bVar == this.I0) {
            this.I0 = null;
        }
    }

    protected void J4(String str) {
        K4(str, null);
    }

    protected void K4(String str, String str2) {
        androidx.appcompat.view.b bVar = this.I0;
        if (bVar != null) {
            bVar.setTitle(str);
            this.I0.setSubtitle(str2);
        }
    }

    protected boolean L4(b.a aVar) {
        return M4(aVar, false);
    }

    protected boolean M4(b.a aVar, boolean z10) {
        if (!z10 && this.I0 != null) {
            return true;
        }
        androidx.fragment.app.p pVarE1 = e1();
        if (pVarE1 == null || !(pVarE1 instanceof androidx.appcompat.app.d)) {
            return false;
        }
        this.I0 = ((androidx.appcompat.app.d) pVarE1).i1(new a(aVar));
        return true;
    }
}
