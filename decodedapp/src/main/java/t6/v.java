package t6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f27545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final s6.w f27546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashMap f27547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final s6.u[] f27548d;

    static class a extends HashMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Locale f27549a;

        public a(Locale locale) {
            this.f27549a = locale;
        }

        public static a a(Locale locale) {
            return new a(locale);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s6.u get(Object obj) {
            return (s6.u) super.get(((String) obj).toLowerCase(this.f27549a));
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public s6.u put(String str, s6.u uVar) {
            return (s6.u) super.put(str.toLowerCase(this.f27549a), uVar);
        }
    }

    protected v(p6.h hVar, s6.w wVar, s6.u[] uVarArr, boolean z10, boolean z11) {
        this.f27546b = wVar;
        if (z10) {
            this.f27547c = a.a(hVar.k().x());
        } else {
            this.f27547c = new HashMap();
        }
        int length = uVarArr.length;
        this.f27545a = length;
        this.f27548d = new s6.u[length];
        if (z11) {
            p6.g gVarK = hVar.k();
            for (s6.u uVar : uVarArr) {
                if (!uVar.G()) {
                    List listB = uVar.b(gVarK);
                    if (!listB.isEmpty()) {
                        Iterator it = listB.iterator();
                        while (it.hasNext()) {
                            this.f27547c.put(((p6.y) it.next()).c(), uVar);
                        }
                    }
                }
            }
        }
        for (int i10 = 0; i10 < length; i10++) {
            s6.u uVar2 = uVarArr[i10];
            this.f27548d[i10] = uVar2;
            if (!uVar2.G()) {
                this.f27547c.put(uVar2.getName(), uVar2);
            }
        }
    }

    public static v b(p6.h hVar, s6.w wVar, s6.u[] uVarArr, c cVar) {
        int length = uVarArr.length;
        s6.u[] uVarArr2 = new s6.u[length];
        for (int i10 = 0; i10 < length; i10++) {
            s6.u uVarY = uVarArr[i10];
            if (!uVarY.A() && !uVarY.H()) {
                uVarY = uVarY.Y(hVar.Q(uVarY.getType(), uVarY));
            }
            uVarArr2[i10] = uVarY;
        }
        return new v(hVar, wVar, uVarArr2, cVar.z(), true);
    }

    public static v c(p6.h hVar, s6.w wVar, s6.u[] uVarArr, boolean z10) {
        int length = uVarArr.length;
        s6.u[] uVarArr2 = new s6.u[length];
        for (int i10 = 0; i10 < length; i10++) {
            s6.u uVarY = uVarArr[i10];
            if (!uVarY.A()) {
                uVarY = uVarY.Y(hVar.Q(uVarY.getType(), uVarY));
            }
            uVarArr2[i10] = uVarY;
        }
        return new v(hVar, wVar, uVarArr2, z10, false);
    }

    public Object a(p6.h hVar, y yVar) {
        Object objW = this.f27546b.w(hVar, this.f27548d, yVar);
        if (objW == null) {
            return objW;
        }
        Object objH = yVar.h(hVar, objW);
        for (x xVarF = yVar.f(); xVarF != null; xVarF = xVarF.f27550a) {
            xVarF.a(objH);
        }
        return objH;
    }

    public s6.u d(String str) {
        return (s6.u) this.f27547c.get(str);
    }

    public y e(e6.j jVar, p6.h hVar, s sVar) {
        return new y(jVar, hVar, this.f27545a, sVar);
    }
}
