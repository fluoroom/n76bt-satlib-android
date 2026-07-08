package androidx.collection;

import java.util.Arrays;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public class f implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f1372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f1373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f1374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f1375d;

    public f() {
        this(0, 1, null);
    }

    public void a(long j10, Object obj) {
        int i10 = this.f1375d;
        if (i10 != 0 && j10 <= this.f1373b[i10 - 1]) {
            j(j10, obj);
            return;
        }
        if (this.f1372a) {
            long[] jArr = this.f1373b;
            if (i10 >= jArr.length) {
                Object[] objArr = this.f1374c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj2 = objArr[i12];
                    if (obj2 != g.f1376a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj2;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f1372a = false;
                this.f1375d = i11;
            }
        }
        int i13 = this.f1375d;
        if (i13 >= this.f1373b.length) {
            int iF = r.a.f(i13 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f1373b, iF);
            m.d(jArrCopyOf, "copyOf(this, newSize)");
            this.f1373b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f1374c, iF);
            m.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f1374c = objArrCopyOf;
        }
        this.f1373b[i13] = j10;
        this.f1374c[i13] = obj;
        this.f1375d = i13 + 1;
    }

    public void b() {
        int i10 = this.f1375d;
        Object[] objArr = this.f1374c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f1375d = 0;
        this.f1372a = false;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public f clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        m.c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        f fVar = (f) objClone;
        fVar.f1373b = (long[]) this.f1373b.clone();
        fVar.f1374c = (Object[]) this.f1374c.clone();
        return fVar;
    }

    public Object f(long j10) {
        int iB = r.a.b(this.f1373b, this.f1375d, j10);
        if (iB < 0 || this.f1374c[iB] == g.f1376a) {
            return null;
        }
        return this.f1374c[iB];
    }

    public Object g(long j10, Object obj) {
        int iB = r.a.b(this.f1373b, this.f1375d, j10);
        return (iB < 0 || this.f1374c[iB] == g.f1376a) ? obj : this.f1374c[iB];
    }

    public int h(long j10) {
        if (this.f1372a) {
            int i10 = this.f1375d;
            long[] jArr = this.f1373b;
            Object[] objArr = this.f1374c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != g.f1376a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f1372a = false;
            this.f1375d = i11;
        }
        return r.a.b(this.f1373b, this.f1375d, j10);
    }

    public long i(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f1375d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        if (this.f1372a) {
            long[] jArr = this.f1373b;
            Object[] objArr = this.f1374c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != g.f1376a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f1372a = false;
            this.f1375d = i12;
        }
        return this.f1373b[i10];
    }

    public void j(long j10, Object obj) {
        int iB = r.a.b(this.f1373b, this.f1375d, j10);
        if (iB >= 0) {
            this.f1374c[iB] = obj;
            return;
        }
        int i10 = ~iB;
        if (i10 < this.f1375d && this.f1374c[i10] == g.f1376a) {
            this.f1373b[i10] = j10;
            this.f1374c[i10] = obj;
            return;
        }
        if (this.f1372a) {
            int i11 = this.f1375d;
            long[] jArr = this.f1373b;
            if (i11 >= jArr.length) {
                Object[] objArr = this.f1374c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj2 = objArr[i13];
                    if (obj2 != g.f1376a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj2;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f1372a = false;
                this.f1375d = i12;
                i10 = ~r.a.b(this.f1373b, i12, j10);
            }
        }
        int i14 = this.f1375d;
        if (i14 >= this.f1373b.length) {
            int iF = r.a.f(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f1373b, iF);
            m.d(jArrCopyOf, "copyOf(this, newSize)");
            this.f1373b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f1374c, iF);
            m.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f1374c = objArrCopyOf;
        }
        int i15 = this.f1375d;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.f1373b;
            int i16 = i10 + 1;
            ed.j.i(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = this.f1374c;
            ed.j.j(objArr2, objArr2, i16, i10, this.f1375d);
        }
        this.f1373b[i10] = j10;
        this.f1374c[i10] = obj;
        this.f1375d++;
    }

    public void k(long j10) {
        int iB = r.a.b(this.f1373b, this.f1375d, j10);
        if (iB < 0 || this.f1374c[iB] == g.f1376a) {
            return;
        }
        this.f1374c[iB] = g.f1376a;
        this.f1372a = true;
    }

    public void m(int i10) {
        if (this.f1374c[i10] != g.f1376a) {
            this.f1374c[i10] = g.f1376a;
            this.f1372a = true;
        }
    }

    public int n() {
        if (this.f1372a) {
            int i10 = this.f1375d;
            long[] jArr = this.f1373b;
            Object[] objArr = this.f1374c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != g.f1376a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f1372a = false;
            this.f1375d = i11;
        }
        return this.f1375d;
    }

    public Object o(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f1375d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        if (this.f1372a) {
            long[] jArr = this.f1373b;
            Object[] objArr = this.f1374c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != g.f1376a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f1372a = false;
            this.f1375d = i12;
        }
        return this.f1374c[i10];
    }

    public String toString() {
        if (n() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f1375d * 28);
        sb2.append('{');
        int i10 = this.f1375d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(i(i11));
            sb2.append('=');
            Object objO = o(i11);
            if (objO != sb2) {
                sb2.append(objO);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        m.d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public f(int i10) {
        if (i10 == 0) {
            this.f1373b = r.a.f25264b;
            this.f1374c = r.a.f25265c;
        } else {
            int iF = r.a.f(i10);
            this.f1373b = new long[iF];
            this.f1374c = new Object[iF];
        }
    }

    public /* synthetic */ f(int i10, int i11, rd.h hVar) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
