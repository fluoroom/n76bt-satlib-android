package androidx.collection;

import java.util.Arrays;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public class j implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f1380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f1381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f1382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f1383d;

    public j() {
        this(0, 1, null);
    }

    public void a(int i10, Object obj) {
        int i11 = this.f1383d;
        if (i11 != 0 && i10 <= this.f1381b[i11 - 1]) {
            j(i10, obj);
            return;
        }
        if (this.f1380a && i11 >= this.f1381b.length) {
            k.e(this);
        }
        int i12 = this.f1383d;
        if (i12 >= this.f1381b.length) {
            int iE = r.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f1381b, iE);
            m.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f1381b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f1382c, iE);
            m.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f1382c = objArrCopyOf;
        }
        this.f1381b[i12] = i10;
        this.f1382c[i12] = obj;
        this.f1383d = i12 + 1;
    }

    public void b() {
        int i10 = this.f1383d;
        Object[] objArr = this.f1382c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f1383d = 0;
        this.f1380a = false;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public j clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        m.c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        j jVar = (j) objClone;
        jVar.f1381b = (int[]) this.f1381b.clone();
        jVar.f1382c = (Object[]) this.f1382c.clone();
        return jVar;
    }

    public Object f(int i10) {
        return k.c(this, i10);
    }

    public Object g(int i10, Object obj) {
        return k.d(this, i10, obj);
    }

    public int h(Object obj) {
        if (this.f1380a) {
            k.e(this);
        }
        int i10 = this.f1383d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f1382c[i11] == obj) {
                return i11;
            }
        }
        return -1;
    }

    public int i(int i10) {
        if (this.f1380a) {
            k.e(this);
        }
        return this.f1381b[i10];
    }

    public void j(int i10, Object obj) {
        int iA = r.a.a(this.f1381b, this.f1383d, i10);
        if (iA >= 0) {
            this.f1382c[iA] = obj;
            return;
        }
        int i11 = ~iA;
        if (i11 < this.f1383d && this.f1382c[i11] == k.f1384a) {
            this.f1381b[i11] = i10;
            this.f1382c[i11] = obj;
            return;
        }
        if (this.f1380a && this.f1383d >= this.f1381b.length) {
            k.e(this);
            i11 = ~r.a.a(this.f1381b, this.f1383d, i10);
        }
        int i12 = this.f1383d;
        if (i12 >= this.f1381b.length) {
            int iE = r.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f1381b, iE);
            m.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f1381b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f1382c, iE);
            m.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f1382c = objArrCopyOf;
        }
        int i13 = this.f1383d;
        if (i13 - i11 != 0) {
            int[] iArr = this.f1381b;
            int i14 = i11 + 1;
            ed.j.h(iArr, iArr, i14, i11, i13);
            Object[] objArr = this.f1382c;
            ed.j.j(objArr, objArr, i14, i11, this.f1383d);
        }
        this.f1381b[i11] = i10;
        this.f1382c[i11] = obj;
        this.f1383d++;
    }

    public int k() {
        if (this.f1380a) {
            k.e(this);
        }
        return this.f1383d;
    }

    public Object m(int i10) {
        if (this.f1380a) {
            k.e(this);
        }
        return this.f1382c[i10];
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f1383d * 28);
        sb2.append('{');
        int i10 = this.f1383d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(i(i11));
            sb2.append('=');
            Object objM = m(i11);
            if (objM != this) {
                sb2.append(objM);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        m.d(string, "buffer.toString()");
        return string;
    }

    public j(int i10) {
        if (i10 == 0) {
            this.f1381b = r.a.f25263a;
            this.f1382c = r.a.f25265c;
        } else {
            int iE = r.a.e(i10);
            this.f1381b = new int[iE];
            this.f1382c = new Object[iE];
        }
    }

    public /* synthetic */ j(int i10, int i11, rd.h hVar) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
