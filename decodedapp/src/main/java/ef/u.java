package ef;

import ef.s;

/* JADX INFO: loaded from: classes3.dex */
final class u implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f12049a = new u();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12050a;

        static {
            int[] iArr = new int[ee.l.values().length];
            try {
                iArr[ee.l.f11807g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ee.l.f11808h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ee.l.f11809r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ee.l.f11810s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ee.l.f11811t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ee.l.f11812u.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ee.l.f11813v.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ee.l.f11814w.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f12050a = iArr;
        }
    }

    private u() {
    }

    @Override // ef.t
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public s e(s sVar) {
        rd.m.e(sVar, "possiblyPrimitiveType");
        if (!(sVar instanceof s.d)) {
            return sVar;
        }
        s.d dVar = (s.d) sVar;
        if (dVar.i() == null) {
            return sVar;
        }
        String strF = vf.d.c(dVar.i().i()).f();
        rd.m.d(strF, "getInternalName(...)");
        return d(strF);
    }

    @Override // ef.t
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public s c(String str) {
        vf.e eVar;
        rd.m.e(str, "representation");
        str.length();
        char cCharAt = str.charAt(0);
        vf.e[] eVarArrValues = vf.e.values();
        int length = eVarArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArrValues[i10];
            if (eVar.f().charAt(0) == cCharAt) {
                break;
            }
            i10++;
        }
        if (eVar != null) {
            return new s.d(eVar);
        }
        if (cCharAt == 'V') {
            return new s.d(null);
        }
        if (cCharAt == '[') {
            String strSubstring = str.substring(1);
            rd.m.d(strSubstring, "substring(...)");
            return new s.a(c(strSubstring));
        }
        if (cCharAt == 'L') {
            rg.q.S(str, ';', false, 2, null);
        }
        String strSubstring2 = str.substring(1, str.length() - 1);
        rd.m.d(strSubstring2, "substring(...)");
        return new s.c(strSubstring2);
    }

    @Override // ef.t
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public s.c d(String str) {
        rd.m.e(str, "internalName");
        return new s.c(str);
    }

    @Override // ef.t
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public s b(ee.l lVar) {
        rd.m.e(lVar, "primitiveType");
        switch (a.f12050a[lVar.ordinal()]) {
            case 1:
                return s.f12037a.a();
            case 2:
                return s.f12037a.c();
            case 3:
                return s.f12037a.b();
            case 4:
                return s.f12037a.h();
            case 5:
                return s.f12037a.f();
            case 6:
                return s.f12037a.e();
            case 7:
                return s.f12037a.g();
            case 8:
                return s.f12037a.d();
            default:
                throw new dd.o();
        }
    }

    @Override // ef.t
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public s f() {
        return d("java/lang/Class");
    }

    @Override // ef.t
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public String a(s sVar) {
        String strF;
        rd.m.e(sVar, "type");
        if (sVar instanceof s.a) {
            return '[' + a(((s.a) sVar).i());
        }
        if (sVar instanceof s.d) {
            vf.e eVarI = ((s.d) sVar).i();
            return (eVarI == null || (strF = eVarI.f()) == null) ? "V" : strF;
        }
        if (!(sVar instanceof s.c)) {
            throw new dd.o();
        }
        return 'L' + ((s.c) sVar).i() + ';';
    }
}
