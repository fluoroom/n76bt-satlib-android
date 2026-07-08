package of;

import java.util.NoSuchElementException;
import of.d;

/* JADX INFO: loaded from: classes3.dex */
class c extends o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f23419e;

    private class b implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f23421b;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(b());
        }

        @Override // of.d.a
        public byte b() {
            int i10 = this.f23420a;
            if (i10 >= this.f23421b) {
                throw new NoSuchElementException();
            }
            byte[] bArr = c.this.f23484b;
            this.f23420a = i10 + 1;
            return bArr[i10];
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23420a < this.f23421b;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            int iC = c.this.C();
            this.f23420a = iC;
            this.f23421b = iC + c.this.size();
        }
    }

    c(byte[] bArr, int i10, int i11) {
        super(bArr);
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Offset too small: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Length too small: ");
            sb3.append(i10);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (((long) i10) + ((long) i11) <= bArr.length) {
            this.f23418d = i10;
            this.f23419e = i11;
            return;
        }
        StringBuilder sb4 = new StringBuilder(48);
        sb4.append("Offset+Length too large: ");
        sb4.append(i10);
        sb4.append("+");
        sb4.append(i11);
        throw new IllegalArgumentException(sb4.toString());
    }

    @Override // of.o
    protected int C() {
        return this.f23418d;
    }

    @Override // of.o, java.lang.Iterable
    /* JADX INFO: renamed from: E */
    public d.a iterator() {
        return new b();
    }

    @Override // of.o, of.d
    protected void i(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f23484b, C() + i10, bArr, i11, i12);
    }

    @Override // of.o, of.d
    public int size() {
        return this.f23419e;
    }
}
