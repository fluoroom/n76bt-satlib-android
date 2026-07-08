package qe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f25049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f25050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f25051c;

    public q(String str) {
        rd.m.e(str, "name");
        this.f25049a = str;
        this.f25050b = new ArrayList(0);
        List listC = se.n.f27327a.c();
        ArrayList arrayList = new ArrayList();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            ((se.n) it.next()).d();
        }
        this.f25051c = arrayList;
    }

    public final List a() {
        return this.f25050b;
    }

    public String toString() {
        return this.f25049a;
    }
}
