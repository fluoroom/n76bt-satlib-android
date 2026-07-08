package v3;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class p extends androidx.fragment.app.n implements s, DialogInterface.OnClickListener {
    private s E0;

    @Override // v3.s
    public boolean N(androidx.fragment.app.o oVar, int i10, int i11, int i12, Object obj) {
        return i4(oVar, i10, i11, i12, obj);
    }

    @Override // androidx.fragment.app.n
    public void g4(androidx.fragment.app.w wVar, String str) {
        try {
            super.g4(wVar, str);
        } catch (IllegalStateException e10) {
            Log.e("DialogFragmentEx", "show", e10);
        }
    }

    public Bundle h4() {
        Bundle bundleI1 = i1();
        if (bundleI1 == null) {
            bundleI1 = new Bundle();
        }
        E3(bundleI1);
        return bundleI1;
    }

    protected boolean i4(androidx.fragment.app.o oVar, int i10, int i11, int i12, Object obj) {
        return false;
    }

    protected boolean j4(int i10, int i11, int i12, Object obj) {
        s sVar = this.E0;
        if (sVar == null) {
            return false;
        }
        return sVar.N(this, i10, i11, i12, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.o
    public void n2(Activity activity) {
        super.n2(activity);
        if (activity instanceof t) {
            ((t) activity).x(this);
        }
        if (activity instanceof s) {
            this.E0 = (s) activity;
        }
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        j4(k3.f.S, 0, 0, null);
    }

    public void onClick(DialogInterface dialogInterface, int i10) {
        j4(k3.f.T, i10, 0, null);
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.o
    public void z2() {
        super.z2();
        d.k0 k0VarE1 = e1();
        if (k0VarE1 instanceof t) {
            ((t) k0VarE1).c(this);
        }
        this.E0 = null;
    }
}
