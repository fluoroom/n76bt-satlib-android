package d7;

import java.util.Arrays;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class d extends v {

    /* JADX INFO: renamed from: b */
    static final d f10810b = new d(new byte[0]);

    /* JADX INFO: renamed from: a */
    protected final byte[] f10811a;

    public d(byte[] bArr) {
        this.f10811a = bArr;
    }

    public static d a0(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return bArr.length == 0 ? f10810b : new d(bArr);
    }

    @Override // p6.n
    public m C() {
        return m.BINARY;
    }

    @Override // d7.v, e6.w
    public e6.m c() {
        return e6.m.VALUE_EMBEDDED_OBJECT;
    }

    @Override // d7.b, p6.o
    public final void d(e6.g gVar, d0 d0Var) {
        e6.a aVarH = d0Var.k().h();
        byte[] bArr = this.f10811a;
        gVar.v0(aVarH, bArr, 0, bArr.length);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof d)) {
            return Arrays.equals(((d) obj).f10811a, this.f10811a);
        }
        return false;
    }

    public int hashCode() {
        byte[] bArr = this.f10811a;
        if (bArr == null) {
            return -1;
        }
        return bArr.length;
    }

    @Override // p6.n
    public String i() {
        return e6.b.a().i(this.f10811a, false);
    }

    @Override // p6.n
    public byte[] o() {
        return this.f10811a;
    }
}
