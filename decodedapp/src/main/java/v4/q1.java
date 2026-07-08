package v4;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class q1 extends s0 implements r0 {
    private final InputStream M;

    public q1(c0 c0Var, InputStream inputStream) {
        super(c0Var);
        this.M = inputStream;
    }

    @Override // v4.s0
    protected int r(byte[] bArr) {
        return this.M.read(bArr);
    }
}
