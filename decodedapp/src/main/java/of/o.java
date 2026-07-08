package of;

import java.io.IOException;
import java.io.OutputStream;
import java.util.NoSuchElementException;
import of.d;

/* JADX INFO: loaded from: classes3.dex */
class o extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final byte[] f23484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23485c = 0;

    private class b implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f23487b;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(b());
        }

        @Override // of.d.a
        public byte b() {
            try {
                byte[] bArr = o.this.f23484b;
                int i10 = this.f23486a;
                this.f23486a = i10 + 1;
                return bArr[i10];
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new NoSuchElementException(e10.getMessage());
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23486a < this.f23487b;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            this.f23486a = 0;
            this.f23487b = o.this.size();
        }
    }

    o(byte[] bArr) {
        this.f23484b = bArr;
    }

    static int D(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    @Override // of.d
    void A(OutputStream outputStream, int i10, int i11) throws IOException {
        outputStream.write(this.f23484b, C() + i10, i11);
    }

    boolean B(o oVar, int i10, int i11) {
        if (i11 > oVar.size()) {
            int size = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 + i11 > oVar.size()) {
            int size2 = oVar.size();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(size2);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.f23484b;
        byte[] bArr2 = oVar.f23484b;
        int iC = C() + i11;
        int iC2 = C();
        int iC3 = oVar.C() + i10;
        while (iC2 < iC) {
            if (bArr[iC2] != bArr2[iC3]) {
                return false;
            }
            iC2++;
            iC3++;
        }
        return true;
    }

    protected int C() {
        return 0;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public d.a iterator() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d) || size() != ((d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof o) {
            return B((o) obj, 0, size());
        }
        if (obj instanceof t) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
        sb2.append("Has a new type of ByteString been created? Found ");
        sb2.append(strValueOf);
        throw new IllegalArgumentException(sb2.toString());
    }

    public int hashCode() {
        int iP = this.f23485c;
        if (iP == 0) {
            int size = size();
            iP = p(size, 0, size);
            if (iP == 0) {
                iP = 1;
            }
            this.f23485c = iP;
        }
        return iP;
    }

    @Override // of.d
    protected void i(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f23484b, i10, bArr, i11, i12);
    }

    @Override // of.d
    protected int j() {
        return 0;
    }

    @Override // of.d
    protected boolean l() {
        return true;
    }

    @Override // of.d
    public boolean m() {
        int iC = C();
        return x.f(this.f23484b, iC, size() + iC);
    }

    @Override // of.d
    protected int p(int i10, int i11, int i12) {
        return D(i10, this.f23484b, C() + i11, i12);
    }

    @Override // of.d
    protected int q(int i10, int i11, int i12) {
        int iC = C() + i11;
        return x.g(i10, this.f23484b, iC, i12 + iC);
    }

    @Override // of.d
    protected int s() {
        return this.f23485c;
    }

    @Override // of.d
    public int size() {
        return this.f23484b.length;
    }

    @Override // of.d
    public String u(String str) {
        return new String(this.f23484b, C(), size(), str);
    }
}
