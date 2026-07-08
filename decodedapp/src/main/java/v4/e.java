package v4;

import java.io.IOException;
import java.util.Arrays;
import v4.n0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends t {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f29845v;

    public e(g2 g2Var, int i10) {
        rd.m.e(g2Var, "link");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AudioConnect:");
        String name = g2Var.getName();
        rd.m.b(name);
        sb2.append(name);
        super(g2Var, sb2.toString());
        this.f29845v = i10;
    }

    @Override // v4.t
    public boolean A(byte[] bArr, int i10, int i11) {
        rd.m.e(bArr, "b");
        if (i11 == 10) {
            return true;
        }
        if (i10 == 0 && bArr.length == i11) {
            this.f30142g.W0(c1.TX_AUDIO, Arrays.copyOf(bArr, bArr.length));
        } else {
            c0 c0Var = this.f30142g;
            c1 c1Var = c1.TX_AUDIO;
            byte[] bArrN = ed.j.n(bArr, i10, i11 + i10);
            c0Var.W0(c1Var, Arrays.copyOf(bArrN, bArrN.length));
        }
        return true;
    }

    @Override // v4.t, com.dw.util.concurrent.a
    public void doInBackground() {
        while (!isCancelled()) {
            try {
                this.f30140e.i(1, 0L);
                this.f30140e.e();
            } catch (IOException e10) {
                e10.printStackTrace();
                return;
            }
        }
    }

    @Override // v4.t, com.dw.util.concurrent.a
    protected void onCancel() {
        super.onCancel();
    }

    @Override // com.dw.util.concurrent.a
    protected boolean onInit() {
        y(n0.c.Connected);
        f0 f0Var = new f0(this.f30142g);
        this.f30144r = f0Var;
        f0Var.start();
        return super.onInit();
    }

    @Override // v4.t, com.dw.util.concurrent.a
    protected void onStop() {
        f0 f0Var = (f0) this.f30144r;
        if (f0Var != null) {
            f0Var.u();
        }
        super.onStop();
    }

    @Override // v4.t
    protected int u() {
        return this.f29845v;
    }
}
