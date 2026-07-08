package hb;

import eh.h0;
import eh.i0;

/* JADX INFO: loaded from: classes3.dex */
class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h0 f15215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f15216b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f15218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f15219e;

    d(h0 h0Var, int i10) {
        this.f15215a = h0Var;
        this.f15218d = i10;
        this.f15217c = h0Var.n();
        i0 i0VarC = this.f15215a.c();
        if (i0VarC != null) {
            this.f15219e = (int) i0VarC.contentLength();
        } else {
            this.f15219e = 0;
        }
    }

    @Override // hb.g
    public String a() {
        if (this.f15216b == null) {
            i0 i0VarC = this.f15215a.c();
            if (i0VarC != null) {
                this.f15216b = i0VarC.string();
            }
            if (this.f15216b == null) {
                this.f15216b = "";
            }
        }
        return this.f15216b;
    }

    @Override // hb.g
    public int b() {
        return this.f15219e;
    }

    @Override // hb.g
    public int c() {
        return this.f15218d;
    }

    @Override // hb.g
    public int d() {
        return this.f15217c;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + hashCode() + this.f15216b + this.f15217c + this.f15218d + this.f15219e;
    }
}
