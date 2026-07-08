package of;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import of.d;

/* JADX INFO: loaded from: classes3.dex */
class t extends of.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f23489h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final of.d f23491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final of.d f23492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f23493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f23494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23495g;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Stack f23496a;

        private b() {
            this.f23496a = new Stack();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public of.d b(of.d dVar, of.d dVar2) {
            c(dVar);
            c(dVar2);
            of.d tVar = (of.d) this.f23496a.pop();
            while (!this.f23496a.isEmpty()) {
                tVar = new t((of.d) this.f23496a.pop(), tVar);
            }
            return tVar;
        }

        private void c(of.d dVar) {
            if (dVar.l()) {
                e(dVar);
                return;
            }
            if (dVar instanceof t) {
                t tVar = (t) dVar;
                c(tVar.f23491c);
                c(tVar.f23492d);
            } else {
                String strValueOf = String.valueOf(dVar.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
                sb2.append("Has a new type of ByteString been created? Found ");
                sb2.append(strValueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        private int d(int i10) {
            int iBinarySearch = Arrays.binarySearch(t.f23489h, i10);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void e(of.d dVar) {
            int iD = d(dVar.size());
            int i10 = t.f23489h[iD + 1];
            if (this.f23496a.isEmpty() || ((of.d) this.f23496a.peek()).size() >= i10) {
                this.f23496a.push(dVar);
                return;
            }
            int i11 = t.f23489h[iD];
            of.d tVar = (of.d) this.f23496a.pop();
            while (true) {
                if (this.f23496a.isEmpty() || ((of.d) this.f23496a.peek()).size() >= i11) {
                    break;
                } else {
                    tVar = new t((of.d) this.f23496a.pop(), tVar);
                }
            }
            t tVar2 = new t(tVar, dVar);
            while (!this.f23496a.isEmpty()) {
                if (((of.d) this.f23496a.peek()).size() >= t.f23489h[d(tVar2.size()) + 1]) {
                    break;
                } else {
                    tVar2 = new t((of.d) this.f23496a.pop(), tVar2);
                }
            }
            this.f23496a.push(tVar2);
        }
    }

    private static class c implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Stack f23497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o f23498b;

        private o a(of.d dVar) {
            while (dVar instanceof t) {
                t tVar = (t) dVar;
                this.f23497a.push(tVar);
                dVar = tVar.f23491c;
            }
            return (o) dVar;
        }

        private o c() {
            while (!this.f23497a.isEmpty()) {
                o oVarA = a(((t) this.f23497a.pop()).f23492d);
                if (!oVarA.isEmpty()) {
                    return oVarA;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public o next() {
            o oVar = this.f23498b;
            if (oVar == null) {
                throw new NoSuchElementException();
            }
            this.f23498b = c();
            return oVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23498b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(of.d dVar) {
            this.f23497a = new Stack();
            this.f23498b = a(dVar);
        }
    }

    private class d implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f23499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private d.a f23500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f23501c;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(b());
        }

        @Override // of.d.a
        public byte b() {
            if (!this.f23500b.hasNext()) {
                this.f23500b = this.f23499a.next().iterator();
            }
            this.f23501c--;
            return this.f23500b.b();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23501c > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private d() {
            c cVar = new c(t.this);
            this.f23499a = cVar;
            this.f23500b = cVar.next().iterator();
            this.f23501c = t.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.valueOf(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED));
        f23489h = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = f23489h;
            if (i13 >= iArr.length) {
                return;
            }
            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }

    static of.d E(of.d dVar, of.d dVar2) {
        t tVar = dVar instanceof t ? (t) dVar : null;
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() == 0) {
            return dVar2;
        }
        int size = dVar.size() + dVar2.size();
        if (size < 128) {
            return F(dVar, dVar2);
        }
        if (tVar != null && tVar.f23492d.size() + dVar2.size() < 128) {
            return new t(tVar.f23491c, F(tVar.f23492d, dVar2));
        }
        if (tVar == null || tVar.f23491c.j() <= tVar.f23492d.j() || tVar.j() <= dVar2.j()) {
            return size >= f23489h[Math.max(dVar.j(), dVar2.j()) + 1] ? new t(dVar, dVar2) : new b().b(dVar, dVar2);
        }
        return new t(tVar.f23491c, new t(tVar.f23492d, dVar2));
    }

    private static o F(of.d dVar, of.d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[size + size2];
        dVar.h(bArr, 0, 0, size);
        dVar2.h(bArr, 0, size, size2);
        return new o(bArr);
    }

    private boolean I(of.d dVar) {
        c cVar = new c(this);
        o oVar = (o) cVar.next();
        c cVar2 = new c(dVar);
        o oVar2 = (o) cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = oVar.size() - i10;
            int size2 = oVar2.size() - i11;
            int iMin = Math.min(size, size2);
            if (!(i10 == 0 ? oVar.B(oVar2, i11, iMin) : oVar2.B(oVar, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f23490b;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                oVar = (o) cVar.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
            if (iMin == size2) {
                oVar2 = (o) cVar2.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
        }
    }

    @Override // of.d
    void A(OutputStream outputStream, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.f23493e;
        if (i12 <= i13) {
            this.f23491c.A(outputStream, i10, i11);
        } else {
            if (i10 >= i13) {
                this.f23492d.A(outputStream, i10 - i13, i11);
                return;
            }
            int i14 = i13 - i10;
            this.f23491c.A(outputStream, i10, i14);
            this.f23492d.A(outputStream, 0, i11 - i14);
        }
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public d.a iterator() {
        return new d();
    }

    public boolean equals(Object obj) {
        int iS;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof of.d)) {
            return false;
        }
        of.d dVar = (of.d) obj;
        if (this.f23490b != dVar.size()) {
            return false;
        }
        if (this.f23490b == 0) {
            return true;
        }
        if (this.f23495g == 0 || (iS = dVar.s()) == 0 || this.f23495g == iS) {
            return I(dVar);
        }
        return false;
    }

    public int hashCode() {
        int iP = this.f23495g;
        if (iP == 0) {
            int i10 = this.f23490b;
            iP = p(i10, 0, i10);
            if (iP == 0) {
                iP = 1;
            }
            this.f23495g = iP;
        }
        return iP;
    }

    @Override // of.d
    protected void i(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f23493e;
        if (i13 <= i14) {
            this.f23491c.i(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f23492d.i(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f23491c.i(bArr, i10, i11, i15);
            this.f23492d.i(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // of.d
    protected int j() {
        return this.f23494f;
    }

    @Override // of.d
    protected boolean l() {
        return this.f23490b >= f23489h[this.f23494f];
    }

    @Override // of.d
    public boolean m() {
        int iQ = this.f23491c.q(0, 0, this.f23493e);
        of.d dVar = this.f23492d;
        return dVar.q(iQ, 0, dVar.size()) == 0;
    }

    @Override // of.d
    protected int p(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f23493e;
        if (i13 <= i14) {
            return this.f23491c.p(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f23492d.p(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f23492d.p(this.f23491c.p(i10, i11, i15), 0, i12 - i15);
    }

    @Override // of.d
    protected int q(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f23493e;
        if (i13 <= i14) {
            return this.f23491c.q(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f23492d.q(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f23492d.q(this.f23491c.q(i10, i11, i15), 0, i12 - i15);
    }

    @Override // of.d
    protected int s() {
        return this.f23495g;
    }

    @Override // of.d
    public int size() {
        return this.f23490b;
    }

    @Override // of.d
    public String u(String str) {
        return new String(t(), str);
    }

    private t(of.d dVar, of.d dVar2) {
        this.f23495g = 0;
        this.f23491c = dVar;
        this.f23492d = dVar2;
        int size = dVar.size();
        this.f23493e = size;
        this.f23490b = size + dVar2.size();
        this.f23494f = Math.max(dVar.j(), dVar2.j()) + 1;
    }
}
