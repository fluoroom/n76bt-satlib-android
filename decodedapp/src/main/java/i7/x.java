package i7;

/* JADX INFO: loaded from: classes.dex */
public class x implements p6.o {

    /* JADX INFO: renamed from: a */
    protected Object f15938a;

    public x(String str) {
        this.f15938a = str;
    }

    protected void a(e6.g gVar) {
        Object obj = this.f15938a;
        if (obj instanceof e6.p) {
            gVar.U0((e6.p) obj);
        } else {
            gVar.V0(String.valueOf(obj));
        }
    }

    @Override // p6.o
    public void d(e6.g gVar, p6.d0 d0Var) {
        Object obj = this.f15938a;
        if (obj instanceof p6.o) {
            ((p6.o) obj).d(gVar, d0Var);
        } else {
            a(gVar);
        }
    }

    @Override // p6.o
    public void e(e6.g gVar, p6.d0 d0Var, a7.h hVar) {
        Object obj = this.f15938a;
        if (obj instanceof p6.o) {
            ((p6.o) obj).e(gVar, d0Var, hVar);
        } else if (obj instanceof e6.p) {
            d(gVar, d0Var);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        Object obj2 = this.f15938a;
        Object obj3 = ((x) obj).f15938a;
        if (obj2 == obj3) {
            return true;
        }
        return obj2 != null && obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.f15938a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return String.format("[RawValue of type %s]", h.h(this.f15938a));
    }
}
