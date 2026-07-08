package hd;

import hd.i;
import java.io.Serializable;
import qd.p;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f15243a = new j();

    private j() {
    }

    @Override // hd.i
    public i.b a(i.c cVar) {
        m.e(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // hd.i
    public i k(i.c cVar) {
        m.e(cVar, "key");
        return this;
    }

    @Override // hd.i
    public i l(i iVar) {
        m.e(iVar, "context");
        return iVar;
    }

    @Override // hd.i
    public Object r(Object obj, p pVar) {
        m.e(pVar, "operation");
        return obj;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
