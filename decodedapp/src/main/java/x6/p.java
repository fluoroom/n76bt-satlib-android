package x6;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final r[] f31787c;

    protected p(j0 j0Var, r rVar, r[] rVarArr) {
        super(j0Var, rVar);
        this.f31787c = rVarArr;
    }

    public abstract Class A(int i10);

    protected o C(int i10, r rVar) {
        this.f31787c[i10] = rVar;
        return v(i10);
    }

    public abstract Object r();

    public abstract Object s(Object[] objArr);

    public abstract Object t(Object obj);

    public final o v(int i10) {
        return new o(this, z(i10), this.f31764a, w(i10), i10);
    }

    public final r w(int i10) {
        r[] rVarArr = this.f31787c;
        if (rVarArr == null || i10 < 0 || i10 >= rVarArr.length) {
            return null;
        }
        return rVarArr[i10];
    }

    public abstract int x();

    public abstract JavaType z(int i10);
}
