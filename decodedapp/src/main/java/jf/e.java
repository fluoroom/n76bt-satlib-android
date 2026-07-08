package jf;

import dd.o;
import dd.v;
import gf.p;
import gf.q;
import java.util.LinkedList;
import java.util.List;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a */
    private final q f18694a;

    /* JADX INFO: renamed from: b */
    private final p f18695b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18696a;

        static {
            int[] iArr = new int[p.c.EnumC0202c.values().length];
            try {
                iArr[p.c.EnumC0202c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.c.EnumC0202c.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.c.EnumC0202c.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f18696a = iArr;
        }
    }

    public e(q qVar, p pVar) {
        m.e(qVar, "strings");
        m.e(pVar, "qualifiedNames");
        this.f18694a = qVar;
        this.f18695b = pVar;
    }

    private final v c(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i10 != -1) {
            p.c cVarQ = this.f18695b.q(i10);
            String strQ = this.f18694a.q(cVarQ.v());
            p.c.EnumC0202c enumC0202cS = cVarQ.s();
            m.b(enumC0202cS);
            int i11 = a.f18696a[enumC0202cS.ordinal()];
            if (i11 == 1) {
                linkedList2.addFirst(strQ);
            } else if (i11 == 2) {
                linkedList.addFirst(strQ);
            } else {
                if (i11 != 3) {
                    throw new o();
                }
                linkedList2.addFirst(strQ);
                z10 = true;
            }
            i10 = cVarQ.t();
        }
        return new v(linkedList, linkedList2, Boolean.valueOf(z10));
    }

    @Override // jf.d
    public String a(int i10) {
        v vVarC = c(i10);
        List list = (List) vVarC.a();
        String strI0 = ed.q.i0((List) vVarC.b(), ".", null, null, 0, null, null, 62, null);
        if (list.isEmpty()) {
            return strI0;
        }
        return ed.q.i0(list, "/", null, null, 0, null, null, 62, null) + '/' + strI0;
    }

    @Override // jf.d
    public boolean b(int i10) {
        return ((Boolean) c(i10).f()).booleanValue();
    }

    @Override // jf.d
    public String getString(int i10) {
        String strQ = this.f18694a.q(i10);
        m.d(strQ, "getString(...)");
        return strQ;
    }
}
