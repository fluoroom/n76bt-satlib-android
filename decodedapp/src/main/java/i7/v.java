package i7;

import java.lang.reflect.Array;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q f15927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private q f15928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object[] f15930d;

    protected final void a(Object obj, int i10, Object[] objArr, int i11) {
        int i12 = 0;
        for (q qVarB = this.f15927a; qVarB != null; qVarB = qVarB.b()) {
            Object[] objArr2 = (Object[]) qVarB.c();
            int length = objArr2.length;
            System.arraycopy(objArr2, 0, obj, i12, length);
            i12 += length;
        }
        System.arraycopy(objArr, 0, obj, i12, i11);
        int i13 = i12 + i11;
        if (i13 == i10) {
            return;
        }
        throw new IllegalStateException("Should have gotten " + i10 + " entries, got " + i13);
    }

    protected void b() {
        q qVar = this.f15928b;
        if (qVar != null) {
            this.f15930d = (Object[]) qVar.c();
        }
        this.f15928b = null;
        this.f15927a = null;
        this.f15929c = 0;
    }

    public Object[] c(Object[] objArr) {
        q qVar = new q(objArr, null);
        if (this.f15927a == null) {
            this.f15928b = qVar;
            this.f15927a = qVar;
        } else {
            this.f15928b.a(qVar);
            this.f15928b = qVar;
        }
        int length = objArr.length;
        this.f15929c += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public int d() {
        return this.f15929c;
    }

    public void e(Object[] objArr, int i10, List list) {
        int i11;
        q qVarB = this.f15927a;
        while (true) {
            i11 = 0;
            if (qVarB == null) {
                break;
            }
            Object[] objArr2 = (Object[]) qVarB.c();
            int length = objArr2.length;
            while (i11 < length) {
                list.add(objArr2[i11]);
                i11++;
            }
            qVarB = qVarB.b();
        }
        while (i11 < i10) {
            list.add(objArr[i11]);
            i11++;
        }
        b();
    }

    public Object[] f(Object[] objArr, int i10) {
        int i11 = this.f15929c + i10;
        Object[] objArr2 = new Object[i11];
        a(objArr2, i11, objArr, i10);
        b();
        return objArr2;
    }

    public Object[] g(Object[] objArr, int i10, Class cls) {
        int i11 = this.f15929c + i10;
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) cls, i11);
        a(objArr2, i11, objArr, i10);
        b();
        return objArr2;
    }

    public int h() {
        Object[] objArr = this.f15930d;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public Object[] i() {
        b();
        Object[] objArr = this.f15930d;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[12];
        this.f15930d = objArr2;
        return objArr2;
    }

    public Object[] j(Object[] objArr, int i10) {
        b();
        Object[] objArr2 = this.f15930d;
        if (objArr2 == null || objArr2.length < i10) {
            this.f15930d = new Object[Math.max(12, i10)];
        }
        System.arraycopy(objArr, 0, this.f15930d, 0, i10);
        return this.f15930d;
    }
}
