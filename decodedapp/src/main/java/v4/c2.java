package v4;

import java.io.InputStream;
import java.io.OutputStream;
import v4.n0;

/* JADX INFO: loaded from: classes.dex */
public final class c2 extends t {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private InputStream f29822v;

    public c2(g2 g2Var, InputStream inputStream, OutputStream outputStream) {
        rd.m.e(g2Var, "link");
        rd.m.e(inputStream, "is");
        rd.m.e(outputStream, "os");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("USBConnect:");
        String name = g2Var.getName();
        rd.m.b(name);
        sb2.append(name);
        super(g2Var, sb2.toString());
        this.f29822v = inputStream;
        this.f30143h = outputStream;
    }

    @Override // v4.t, com.dw.util.concurrent.a
    protected void onCancel() {
        super.onCancel();
        a6.m.b(this.f29822v);
    }

    @Override // com.dw.util.concurrent.a
    protected boolean onInit() {
        y(n0.c.Connected);
        q1 q1Var = new q1(this.f30142g, this.f29822v);
        this.f30144r = q1Var;
        q1Var.start();
        return super.onInit();
    }

    @Override // v4.t, com.dw.util.concurrent.a
    protected void onStop() {
        a6.m.b(this.f29822v);
        super.onStop();
    }

    @Override // v4.t
    protected int u() {
        return 64;
    }
}
