package x6;

import com.fasterxml.jackson.databind.JavaType;
import d6.r;
import java.util.Iterator;
import p6.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class u implements i7.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final r.b f31818a = r.b.c();

    public abstract JavaType A();

    public abstract Class B();

    public abstract l C();

    public abstract p6.y D();

    public abstract boolean E();

    public abstract boolean F();

    public abstract boolean G(p6.y yVar);

    public abstract boolean H();

    public abstract boolean I();

    public abstract boolean J();

    public boolean K() {
        return false;
    }

    public abstract p6.y a();

    public abstract p6.x d();

    public boolean g() {
        return w() != null;
    }

    @Override // i7.t
    public abstract String getName();

    public boolean i() {
        return q() != null;
    }

    public abstract r.b j();

    public e0 k() {
        return null;
    }

    public String l() {
        b.a aVarM = m();
        if (aVarM == null) {
            return null;
        }
        return aVarM.b();
    }

    public b.a m() {
        return null;
    }

    public Class[] n() {
        return null;
    }

    public k q() {
        l lVarV = v();
        return lVarV == null ? u() : lVarV;
    }

    public abstract o r();

    public abstract Iterator s();

    public abstract i u();

    public abstract l v();

    public k w() {
        o oVarR = r();
        if (oVarR != null) {
            return oVarR;
        }
        l lVarC = C();
        return lVarC == null ? u() : lVarC;
    }

    public k x() {
        l lVarC = C();
        return lVarC == null ? u() : lVarC;
    }

    public abstract k y();
}
