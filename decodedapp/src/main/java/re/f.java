package re;

import dd.b0;
import dd.o;
import dd.q;
import dd.w;
import dd.x;
import dd.y;
import dd.z;
import ed.k0;
import gf.b;
import java.util.ArrayList;
import java.util.List;
import qe.f;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25988a;

        static {
            int[] iArr = new int[b.C0197b.c.EnumC0200c.values().length];
            try {
                iArr[b.C0197b.c.EnumC0200c.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.LONG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f25988a = iArr;
        }
    }

    public static final String a(jf.d dVar, int i10) {
        m.e(dVar, "<this>");
        String strA = dVar.a(i10);
        if (!dVar.b(i10)) {
            return strA;
        }
        return '.' + strA;
    }

    public static final qe.e b(gf.b bVar, jf.d dVar) {
        m.e(bVar, "<this>");
        m.e(dVar, "strings");
        String strA = a(dVar, bVar.w());
        List<b.C0197b> listT = bVar.t();
        m.d(listT, "getArgumentList(...)");
        ArrayList arrayList = new ArrayList();
        for (b.C0197b c0197b : listT) {
            b.C0197b.c cVarS = c0197b.s();
            m.d(cVarS, "getValue(...)");
            qe.f fVarC = c(cVarS, dVar);
            q qVarA = fVarC != null ? w.a(dVar.getString(c0197b.r()), fVarC) : null;
            if (qVarA != null) {
                arrayList.add(qVarA);
            }
        }
        return new qe.e(strA, k0.r(arrayList));
    }

    public static final qe.f c(b.C0197b.c cVar, jf.d dVar) {
        m.e(cVar, "<this>");
        m.e(dVar, "strings");
        if (jf.b.P.d(cVar.T()).booleanValue()) {
            b.C0197b.c.EnumC0200c enumC0200cZ = cVar.Z();
            int i10 = enumC0200cZ != null ? a.f25988a[enumC0200cZ.ordinal()] : -1;
            if (i10 == 1) {
                return new f.p(x.d((byte) cVar.X()), null);
            }
            if (i10 == 2) {
                return new f.s(b0.d((short) cVar.X()), null);
            }
            if (i10 == 3) {
                return new f.q(y.d((int) cVar.X()), null);
            }
            if (i10 == 4) {
                return new f.r(z.d(cVar.X()), null);
            }
            throw new IllegalStateException(("Cannot read value of unsigned type: " + cVar.Z()).toString());
        }
        b.C0197b.c.EnumC0200c enumC0200cZ2 = cVar.Z();
        switch (enumC0200cZ2 != null ? a.f25988a[enumC0200cZ2.ordinal()] : -1) {
            case -1:
                return null;
            case 0:
            default:
                throw new o();
            case 1:
                return new f.e((byte) cVar.X());
            case 2:
                return new f.n((short) cVar.X());
            case 3:
                return new f.j((int) cVar.X());
            case 4:
                return new f.m(cVar.X());
            case 5:
                return new f.C0342f((char) cVar.X());
            case 6:
                return new f.i(cVar.W());
            case 7:
                return new f.g(cVar.Q());
            case 8:
                return new f.d(cVar.X() != 0);
            case 9:
                return new f.o(dVar.getString(cVar.Y()));
            case 10:
                String strA = a(dVar, cVar.N());
                return cVar.G() == 0 ? new f.k(strA) : new f.b(strA, cVar.G());
            case 11:
                return new f.h(a(dVar, cVar.N()), dVar.getString(cVar.R()));
            case 12:
                gf.b bVarD = cVar.D();
                m.d(bVarD, "getAnnotation(...)");
                return new f.a(b(bVarD, dVar));
            case 13:
                List<b.C0197b.c> listL = cVar.L();
                m.d(listL, "getArrayElementList(...)");
                ArrayList arrayList = new ArrayList();
                for (b.C0197b.c cVar2 : listL) {
                    m.b(cVar2);
                    qe.f fVarC = c(cVar2, dVar);
                    if (fVarC != null) {
                        arrayList.add(fVarC);
                    }
                }
                return new f.c(arrayList);
        }
    }
}
