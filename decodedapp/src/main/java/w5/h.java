package w5;

import java.util.Arrays;
import w5.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements e.a, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f31315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f31316b;

    public static h j(byte[] bArr, int i10, int i11) {
        return (bArr[i10] & 1) != 0 ? d.A(bArr, i10, i11) : c.u(bArr, i10, i11);
    }

    @Override // w5.e.a
    public long a() {
        h hVar = this.f31315a;
        if (hVar != null) {
            return hVar.a();
        }
        return 0L;
    }

    @Override // 
    /* JADX INFO: renamed from: b */
    public h clone() {
        h hVar = (h) super.clone();
        h hVar2 = this.f31315a;
        if (hVar2 != null) {
            hVar.f31315a = hVar2.clone();
        }
        h hVar3 = this.f31316b;
        if (hVar3 != null) {
            hVar.f31316b = hVar3.clone();
        }
        return hVar;
    }

    abstract int d();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            h hVar = (h) obj;
            int iD = d();
            if (iD != hVar.d()) {
                return false;
            }
            byte[] bArr = new byte[iD];
            byte[] bArr2 = new byte[iD];
            try {
                k(bArr, 0);
                hVar.k(bArr2, 0);
                return Arrays.equals(bArr, bArr2);
            } catch (f unused) {
            }
        }
        return false;
    }

    public final byte[] f() {
        byte[] bArr = new byte[i()];
        k(bArr, 0);
        return bArr;
    }

    public h g(Class cls) {
        h hVar = this;
        while (hVar.getClass() != cls) {
            hVar = hVar.f31315a;
            if (hVar == null) {
                h hVar2 = this;
                do {
                    hVar2 = hVar2.f31316b;
                    if (hVar2 == null) {
                        return null;
                    }
                } while (hVar2.getClass() != cls);
                return hVar2;
            }
        }
        return hVar;
    }

    abstract int h(byte[] bArr, int i10);

    public final int i() {
        h hVar = this.f31315a;
        return hVar != null ? hVar.i() : d();
    }

    public final int k(byte[] bArr, int i10) {
        h hVar = this.f31315a;
        return hVar != null ? hVar.k(bArr, i10) : h(bArr, i10);
    }
}
