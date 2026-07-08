package me;

import ed.q;
import ef.n;
import ef.w;
import ef.x;
import ff.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ke.p;
import mf.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f21959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f21960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap f21961c;

    public a(n nVar, g gVar) {
        rd.m.e(nVar, "resolver");
        rd.m.e(gVar, "kotlinClassFinder");
        this.f21959a = nVar;
        this.f21960b = gVar;
        this.f21961c = new ConcurrentHashMap();
    }

    public final xf.k a(f fVar) {
        Collection collectionE;
        rd.m.e(fVar, "fileClass");
        ConcurrentHashMap concurrentHashMap = this.f21961c;
        mf.b bVarH = fVar.h();
        Object obj = concurrentHashMap.get(bVarH);
        if (obj == null) {
            mf.c cVarF = fVar.h().f();
            if (fVar.a().c() == a.EnumC0182a.f13030h) {
                List<String> listF = fVar.a().f();
                collectionE = new ArrayList();
                for (String str : listF) {
                    b.a aVar = mf.b.f21989d;
                    mf.c cVarE = vf.d.d(str).e();
                    rd.m.d(cVarE, "getFqNameForTopLevelClassMaybeWithDollars(...)");
                    x xVarB = w.b(this.f21960b, aVar.c(cVarE), this.f21959a.f().g().g());
                    if (xVarB != null) {
                        collectionE.add(xVarB);
                    }
                }
            } else {
                collectionE = q.e(fVar);
            }
            p pVar = new p(this.f21959a.f().q(), cVarF);
            ArrayList arrayList = new ArrayList();
            Iterator it = collectionE.iterator();
            while (it.hasNext()) {
                xf.k kVarC = this.f21959a.c(pVar, (x) it.next());
                if (kVarC != null) {
                    arrayList.add(kVarC);
                }
            }
            List listH0 = q.H0(arrayList);
            xf.k kVarA = xf.b.f32032d.a("package " + cVarF + " (" + fVar + ')', listH0);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(bVarH, kVarA);
            obj = objPutIfAbsent == null ? kVarA : objPutIfAbsent;
        }
        rd.m.d(obj, "getOrPut(...)");
        return (xf.k) obj;
    }
}
