package v4;

import android.bluetooth.BluetoothSocket;
import java.io.IOException;
import v4.n0;

/* JADX INFO: loaded from: classes.dex */
public class m extends t {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private BluetoothSocket f29989v;

    m(o oVar, BluetoothSocket bluetoothSocket) {
        super(oVar, "BTConnect:" + oVar.getName());
        this.f29989v = bluetoothSocket;
    }

    @Override // v4.t, com.dw.util.concurrent.a
    protected void onCancel() {
        super.onCancel();
        a6.m.b(this.f29989v);
    }

    @Override // com.dw.util.concurrent.a
    protected boolean onInit() {
        boolean z10 = t.f30139u;
        if (z10) {
            s3.b.b("ConnectThread", "onInit " + getName());
        }
        try {
            if (this.f29989v == null) {
                this.f29989v = ((o) this.f30142g).a3().createRfcommSocketToServiceRecord(o.O0);
                ((o) this.f30142g).J0.cancelDiscovery();
                if (z10) {
                    s3.b.b("ConnectThread", "start connect " + getName());
                }
                this.f29989v.connect();
                if (z10) {
                    s3.b.b("ConnectThread", "connected " + getName());
                }
            }
            y(n0.c.Connected);
            q1 q1Var = new q1(this.f30142g, this.f29989v.getInputStream());
            this.f30144r = q1Var;
            q1Var.start();
            this.f30143h = this.f29989v.getOutputStream();
            return super.onInit();
        } catch (IOException e10) {
            s3.b.c("ConnectThread", "onInit", e10);
            return false;
        }
    }

    @Override // v4.t, com.dw.util.concurrent.a
    protected void onStop() {
        a6.m.b(this.f29989v);
        super.onStop();
    }
}
