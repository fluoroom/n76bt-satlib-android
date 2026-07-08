package o6;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class k extends j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final e6.j[] f23245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final boolean f23246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f23247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f23248g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected k(boolean z10, e6.j[] jVarArr) {
        super(jVarArr[0]);
        boolean z11 = false;
        this.f23246e = z10;
        if (z10 && this.f23244c.L0()) {
            z11 = true;
        }
        this.f23248g = z11;
        this.f23245d = jVarArr;
        this.f23247f = 1;
    }

    public static k i1(boolean z10, e6.j jVar, e6.j jVar2) {
        boolean z11 = jVar instanceof k;
        if (!z11 && !(jVar2 instanceof k)) {
            return new k(z10, new e6.j[]{jVar, jVar2});
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            ((k) jVar).h1(arrayList);
        } else {
            arrayList.add(jVar);
        }
        if (jVar2 instanceof k) {
            ((k) jVar2).h1(arrayList);
        } else {
            arrayList.add(jVar2);
        }
        return new k(z10, (e6.j[]) arrayList.toArray(new e6.j[arrayList.size()]));
    }

    @Override // e6.j
    public e6.m X0() {
        e6.j jVar = this.f23244c;
        if (jVar == null) {
            return null;
        }
        if (this.f23248g) {
            this.f23248g = false;
            return jVar.n();
        }
        e6.m mVarX0 = jVar.X0();
        return mVarX0 == null ? j1() : mVarX0;
    }

    @Override // o6.j, e6.j, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        do {
            this.f23244c.close();
        } while (k1());
    }

    @Override // e6.j
    public e6.j f1() {
        if (this.f23244c.n() == e6.m.START_OBJECT || this.f23244c.n() == e6.m.START_ARRAY) {
            int i10 = 1;
            while (true) {
                e6.m mVarX0 = X0();
                if (mVarX0 == null) {
                    break;
                }
                if (!mVarX0.i()) {
                    if (mVarX0.h() && i10 - 1 == 0) {
                        break;
                    }
                } else {
                    i10++;
                }
            }
        }
        return this;
    }

    protected void h1(List list) {
        int length = this.f23245d.length;
        for (int i10 = this.f23247f - 1; i10 < length; i10++) {
            e6.j jVar = this.f23245d[i10];
            if (jVar instanceof k) {
                ((k) jVar).h1(list);
            } else {
                list.add(jVar);
            }
        }
    }

    protected e6.m j1() {
        e6.m mVarX0;
        do {
            int i10 = this.f23247f;
            e6.j[] jVarArr = this.f23245d;
            if (i10 >= jVarArr.length) {
                return null;
            }
            this.f23247f = i10 + 1;
            e6.j jVar = jVarArr[i10];
            this.f23244c = jVar;
            if (this.f23246e && jVar.L0()) {
                return this.f23244c.T();
            }
            mVarX0 = this.f23244c.X0();
        } while (mVarX0 == null);
        return mVarX0;
    }

    protected boolean k1() {
        int i10 = this.f23247f;
        e6.j[] jVarArr = this.f23245d;
        if (i10 >= jVarArr.length) {
            return false;
        }
        this.f23247f = i10 + 1;
        this.f23244c = jVarArr[i10];
        return true;
    }
}
