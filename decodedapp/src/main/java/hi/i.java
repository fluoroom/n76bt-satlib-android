package hi;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f15446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f15448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f15449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f15450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f15451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f15452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f15453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte[] f15454i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte[] f15455j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ByteArrayOutputStream f15456k;

    protected class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f f15457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f15458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f15459c;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f next() {
            f eVar;
            boolean z10 = false;
            int i10 = 0;
            int i11 = 0;
            boolean z11 = false;
            for (int i12 = this.f15458b; i12 < i.this.f15453h; i12++) {
                int iO = c.o(i.this.f15454i[i12]);
                i10 += iO;
                i11++;
                if (iO < 255) {
                    break;
                }
                if (i12 == i.this.f15453h - 1 && iO == 255) {
                    z11 = true;
                }
            }
            byte[] bArr = new byte[i10];
            for (int i13 = this.f15458b; i13 < this.f15458b + i11; i13++) {
                int iO2 = c.o(i.this.f15454i[i13]);
                int i14 = (i13 - this.f15458b) * 255;
                System.arraycopy(i.this.f15455j, this.f15459c + i14, bArr, i14, iO2);
            }
            f fVar = this.f15457a;
            if (fVar != null) {
                int length = fVar.a().length;
                byte[] bArr2 = new byte[length + i10];
                System.arraycopy(this.f15457a.a(), 0, bArr2, 0, length);
                System.arraycopy(bArr, 0, bArr2, length, i10);
                this.f15457a = null;
                bArr = bArr2;
            }
            if (z11) {
                eVar = new f(bArr);
            } else {
                boolean z12 = i.this.f15450e && this.f15458b == 0;
                if (i.this.f15451f && this.f15458b + i11 == i.this.f15453h) {
                    z10 = true;
                }
                eVar = new e(i.this, bArr, z12, z10);
            }
            int i15 = this.f15458b + i11;
            this.f15458b = i15;
            this.f15459c += i10;
            if (i15 == 0) {
                this.f15458b = 1;
            }
            return eVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f15458b < i.this.f15453h) {
                return true;
            }
            return this.f15458b == 0 && i.this.f15453h == 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException("Remove not supported");
        }

        private b(f fVar) {
            this.f15458b = 0;
            this.f15459c = 0;
            this.f15457a = fVar;
        }
    }

    protected i(int i10, int i11) {
        this.f15453h = 0;
        this.f15454i = new byte[255];
        this.f15446a = i10;
        this.f15447b = i11;
        this.f15456k = new ByteArrayOutputStream();
    }

    protected int f(e eVar, int i10) {
        if (eVar.d()) {
            this.f15450e = true;
        }
        if (eVar.e()) {
            this.f15451f = true;
        }
        int length = eVar.a().length;
        for (int i11 = this.f15453h; i11 < 255; i11++) {
            int i12 = length - i10;
            if (i12 >= 255) {
                i12 = 255;
            }
            this.f15454i[i11] = c.b(i12);
            this.f15456k.write(eVar.a(), i10, i12);
            this.f15453h++;
            i10 += i12;
            if (i12 < 255) {
                return i10;
            }
        }
        return i10;
    }

    public byte[] g() {
        ByteArrayOutputStream byteArrayOutputStream = this.f15456k;
        if (byteArrayOutputStream != null && (this.f15455j == null || byteArrayOutputStream.size() != this.f15455j.length)) {
            this.f15455j = this.f15456k.toByteArray();
        }
        return this.f15455j;
    }

    public int h() {
        int iO = 0;
        for (int i10 = 0; i10 < this.f15453h; i10++) {
            iO += c.o(this.f15454i[i10]);
        }
        return iO;
    }

    public long i() {
        return this.f15449d;
    }

    protected byte[] j() {
        byte[] bArr = new byte[this.f15453h + 27];
        bArr[0] = 79;
        bArr[1] = 103;
        bArr[2] = 103;
        bArr[3] = 83;
        bArr[4] = 0;
        byte b10 = this.f15452g ? (byte) 1 : (byte) 0;
        if (this.f15450e) {
            b10 = (byte) (b10 + 2);
        }
        if (this.f15451f) {
            b10 = (byte) (b10 + 4);
        }
        bArr[5] = b10;
        c.k(bArr, 6, this.f15449d);
        c.j(bArr, 14, this.f15446a);
        c.j(bArr, 18, this.f15447b);
        bArr[26] = c.b(this.f15453h);
        System.arraycopy(this.f15454i, 0, bArr, 27, this.f15453h);
        return bArr;
    }

    public b k(f fVar) {
        return new b(fVar);
    }

    public int l() {
        return this.f15447b;
    }

    public int m() {
        return this.f15446a;
    }

    public boolean n() {
        if (this.f15448c == 0) {
            return true;
        }
        int iA = hi.a.a(j());
        byte[] bArr = this.f15455j;
        if (bArr != null && bArr.length > 0) {
            iA = hi.a.b(bArr, iA);
        }
        return this.f15448c == ((long) iA);
    }

    protected void o(long j10) {
        this.f15449d = j10;
    }

    protected void p() {
        this.f15452g = true;
    }

    protected void q() {
        this.f15451f = true;
    }

    public void r(OutputStream outputStream) throws IOException {
        byte[] bArrJ = j();
        g();
        int iA = hi.a.a(bArrJ);
        byte[] bArr = this.f15455j;
        if (bArr != null && bArr.length > 0) {
            iA = hi.a.b(bArr, iA);
        }
        long j10 = iA;
        c.j(bArrJ, 22, j10);
        this.f15448c = j10;
        outputStream.write(bArrJ);
    }

    public String toString() {
        return "Ogg Page - " + m() + " @ " + l() + " - " + this.f15453h + " LVs";
    }

    protected i(InputStream inputStream) throws IOException {
        this.f15453h = 0;
        this.f15454i = new byte[255];
        int iN = c.n(inputStream);
        if (iN == 0) {
            int iN2 = c.n(inputStream);
            if ((iN2 & 1) == 1) {
                this.f15452g = true;
            }
            if ((iN2 & 2) == 2) {
                this.f15450e = true;
            }
            if ((iN2 & 4) == 4) {
                this.f15451f = true;
            }
            this.f15449d = c.e(c.n(inputStream), c.n(inputStream), c.n(inputStream), c.n(inputStream), c.n(inputStream), c.n(inputStream), c.n(inputStream), c.n(inputStream));
            this.f15446a = (int) c.d(c.n(inputStream), c.n(inputStream), c.n(inputStream), c.n(inputStream));
            this.f15447b = (int) c.d(c.n(inputStream), c.n(inputStream), c.n(inputStream), c.n(inputStream));
            this.f15448c = c.d(c.n(inputStream), c.n(inputStream), c.n(inputStream), c.n(inputStream));
            int iN3 = c.n(inputStream);
            this.f15453h = iN3;
            byte[] bArr = new byte[iN3];
            this.f15454i = bArr;
            c.l(inputStream, bArr);
            byte[] bArr2 = new byte[h()];
            this.f15455j = bArr2;
            c.l(inputStream, bArr2);
            return;
        }
        throw new UnsupportedOperationException("Found Ogg page in format " + iN + " but we only support version 0");
    }
}
