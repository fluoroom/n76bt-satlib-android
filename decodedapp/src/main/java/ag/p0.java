package ag;

import he.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f577c;

        static {
            int[] iArr = new int[gf.k.values().length];
            try {
                iArr[gf.k.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gf.k.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gf.k.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[gf.k.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f575a = iArr;
            int[] iArr2 = new int[b.a.values().length];
            try {
                iArr2[b.a.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[b.a.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[b.a.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[b.a.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f576b = iArr2;
            int[] iArr3 = new int[gf.y.values().length];
            try {
                iArr3[gf.y.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[gf.y.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[gf.y.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[gf.y.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[gf.y.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[gf.y.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f577c = iArr3;
        }
    }

    public static final he.u a(o0 o0Var, gf.y yVar) {
        rd.m.e(o0Var, "<this>");
        switch (yVar == null ? -1 : a.f577c[yVar.ordinal()]) {
            case 1:
                he.u uVar = he.t.f15308d;
                rd.m.d(uVar, "INTERNAL");
                return uVar;
            case 2:
                he.u uVar2 = he.t.f15305a;
                rd.m.d(uVar2, "PRIVATE");
                return uVar2;
            case 3:
                he.u uVar3 = he.t.f15306b;
                rd.m.d(uVar3, "PRIVATE_TO_THIS");
                return uVar3;
            case 4:
                he.u uVar4 = he.t.f15307c;
                rd.m.d(uVar4, "PROTECTED");
                return uVar4;
            case 5:
                he.u uVar5 = he.t.f15309e;
                rd.m.d(uVar5, "PUBLIC");
                return uVar5;
            case 6:
                he.u uVar6 = he.t.f15310f;
                rd.m.d(uVar6, "LOCAL");
                return uVar6;
            default:
                he.u uVar7 = he.t.f15305a;
                rd.m.d(uVar7, "PRIVATE");
                return uVar7;
        }
    }

    public static final b.a b(o0 o0Var, gf.k kVar) {
        rd.m.e(o0Var, "<this>");
        int i10 = kVar == null ? -1 : a.f575a[kVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? b.a.DECLARATION : b.a.SYNTHESIZED : b.a.DELEGATION : b.a.FAKE_OVERRIDE : b.a.DECLARATION;
    }
}
