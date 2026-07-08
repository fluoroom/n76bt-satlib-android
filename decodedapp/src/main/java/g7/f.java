package g7;

/* JADX INFO: loaded from: classes.dex */
public class f extends i0 {
    public f() {
        super(byte[].class);
    }

    @Override // p6.p
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void g(byte[] bArr, e6.g gVar, p6.d0 d0Var, a7.h hVar) {
        n6.c cVarG = hVar.g(gVar, hVar.d(bArr, e6.m.VALUE_EMBEDDED_OBJECT));
        gVar.v0(d0Var.k().h(), bArr, 0, bArr.length);
        hVar.h(gVar, cVarG);
    }

    @Override // p6.p
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public boolean d(p6.d0 d0Var, byte[] bArr) {
        return bArr.length == 0;
    }

    @Override // g7.i0, p6.p
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void f(byte[] bArr, e6.g gVar, p6.d0 d0Var) {
        gVar.v0(d0Var.k().h(), bArr, 0, bArr.length);
    }
}
