package p6;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    public static abstract class a extends p {
    }

    public abstract Class c();

    public boolean d(d0 d0Var, Object obj) {
        return obj == null;
    }

    public boolean e() {
        return false;
    }

    public abstract void f(Object obj, e6.g gVar, d0 d0Var);

    public void g(Object obj, e6.g gVar, d0 d0Var, a7.h hVar) {
        Class<?> clsC = c();
        if (clsC == null) {
            clsC = obj.getClass();
        }
        d0Var.r(clsC, String.format("Type id handling not implemented for type %s (by serializer of type %s)", clsC.getName(), getClass().getName()));
    }

    public boolean i() {
        return false;
    }

    public p h(i7.s sVar) {
        return this;
    }
}
