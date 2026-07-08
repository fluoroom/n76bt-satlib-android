package s7;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class k extends androidx.fragment.app.n {
    private Dialog E0;
    private DialogInterface.OnCancelListener F0;
    private Dialog G0;

    public static k h4(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        k kVar = new k();
        Dialog dialog2 = (Dialog) v7.q.j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        kVar.E0 = dialog2;
        if (onCancelListener != null) {
            kVar.F0 = onCancelListener;
        }
        return kVar;
    }

    @Override // androidx.fragment.app.n
    public Dialog Z3(Bundle bundle) {
        Dialog dialog = this.E0;
        if (dialog != null) {
            return dialog;
        }
        e4(false);
        if (this.G0 == null) {
            this.G0 = new AlertDialog.Builder((Context) v7.q.i(k1())).create();
        }
        return this.G0;
    }

    @Override // androidx.fragment.app.n
    public void g4(androidx.fragment.app.w wVar, String str) {
        super.g4(wVar, str);
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.F0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
