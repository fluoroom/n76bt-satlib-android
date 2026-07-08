package s4;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import androidx.appcompat.app.c;
import com.benshikj.ht.R;
import kotlin.Metadata;
import r5.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J)\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u0003R\"\u0010\u0015\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014¨\u0006\u001a"}, d2 = {"Ls4/f0;", "Lv3/m0;", "<init>", "()V", "Ldd/d0;", "M2", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "m2", "(IILandroid/content/Intent;)V", "E4", "", "F0", "Z", "D4", "()Z", "I4", "(Z)V", "requireBluetooth", "G0", "C4", "H4", "requireBleScan", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class f0 extends v3.m0 {

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private boolean requireBluetooth;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    private boolean requireBleScan;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F4(f0 f0Var, DialogInterface dialogInterface, int i10) {
        androidx.fragment.app.p pVarE1 = f0Var.e1();
        if (pVarE1 != null) {
            pVarE1.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G4(f0 f0Var, DialogInterface dialogInterface, int i10) {
        a.C0352a c0352a = r5.a.f25458j;
        androidx.fragment.app.p pVarV3 = f0Var.v3();
        rd.m.d(pVarV3, "requireActivity(...)");
        c0352a.i(pVarV3);
    }

    /* JADX INFO: renamed from: C4, reason: from getter */
    public boolean getRequireBleScan() {
        return this.requireBleScan;
    }

    /* JADX INFO: renamed from: D4, reason: from getter */
    public boolean getRequireBluetooth() {
        return this.requireBluetooth;
    }

    public void H4(boolean z10) {
        this.requireBleScan = z10;
    }

    public void I4(boolean z10) {
        this.requireBluetooth = z10;
    }

    @Override // v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        BluetoothAdapter defaultAdapter;
        super.M2();
        if (getRequireBluetooth() && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null && !defaultAdapter.isEnabled()) {
            startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 3);
            return;
        }
        if (Build.VERSION.SDK_INT < 23 || !getRequireBleScan()) {
            return;
        }
        a.C0352a c0352a = r5.a.f25458j;
        Context contextX3 = x3();
        rd.m.d(contextX3, "requireContext(...)");
        if (c0352a.m(contextX3)) {
            return;
        }
        androidx.fragment.app.p pVarV3 = v3();
        v3.i iVar = pVarV3 instanceof v3.i ? (v3.i) pVarV3 : null;
        if (iVar == null || iVar.s1(new String[]{"android.permission.ACCESS_FINE_LOCATION"})) {
            new c.a(x3()).k(N1(R.string.ble_location_service_description)).m(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: s4.d0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    f0.F4(this.f26398a, dialogInterface, i10);
                }
            }).t(R.string.settings, new DialogInterface.OnClickListener() { // from class: s4.e0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    f0.G4(this.f26408a, dialogInterface, i10);
                }
            }).C();
        } else {
            iVar.G1(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 0, null, false, iVar.getString(R.string.ble_location_permission_description));
        }
    }

    @Override // androidx.fragment.app.o
    public void m2(int requestCode, int resultCode, Intent data) {
        super.m2(requestCode, resultCode, data);
        if (requestCode == 3) {
            if (resultCode == -1) {
                E4();
                return;
            }
            androidx.fragment.app.p pVarE1 = e1();
            if (pVarE1 != null) {
                pVarE1.finish();
            }
        }
    }

    protected void E4() {
    }
}
