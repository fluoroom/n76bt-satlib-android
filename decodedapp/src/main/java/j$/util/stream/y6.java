package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class y6 {
    public static final y6 DISTINCT;
    public static final y6 ORDERED;
    public static final y6 SHORT_CIRCUIT;
    public static final y6 SIZED;
    public static final y6 SORTED;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f18257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f18258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f18259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f18260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f18261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f18262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f18263l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f18264m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f18265n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f18266o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f18267p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f18268q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f18269r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f18270s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f18271t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f18272u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ y6[] f18273v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f18274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18278e;

    public static y6 valueOf(String str) {
        return (y6) Enum.valueOf(y6.class, str);
    }

    public static y6[] values() {
        return (y6[]) f18273v.clone();
    }

    static {
        x6 x6Var = x6.SPLITERATOR;
        j$.time.format.s sVarO = o(x6Var);
        x6 x6Var2 = x6.STREAM;
        sVarO.b(x6Var2);
        x6 x6Var3 = x6.OP;
        ((EnumMap) sVarO.f17565a).put(x6Var3, 3);
        y6 y6Var = new y6("DISTINCT", 0, 0, sVarO);
        DISTINCT = y6Var;
        j$.time.format.s sVarO2 = o(x6Var);
        sVarO2.b(x6Var2);
        ((EnumMap) sVarO2.f17565a).put(x6Var3, 3);
        y6 y6Var2 = new y6("SORTED", 1, 1, sVarO2);
        SORTED = y6Var2;
        j$.time.format.s sVarO3 = o(x6Var);
        sVarO3.b(x6Var2);
        ((EnumMap) sVarO3.f17565a).put(x6Var3, 3);
        x6 x6Var4 = x6.TERMINAL_OP;
        ((EnumMap) sVarO3.f17565a).put(x6Var4, 2);
        x6 x6Var5 = x6.UPSTREAM_TERMINAL_OP;
        ((EnumMap) sVarO3.f17565a).put(x6Var5, 2);
        y6 y6Var3 = new y6("ORDERED", 2, 2, sVarO3);
        ORDERED = y6Var3;
        j$.time.format.s sVarO4 = o(x6Var);
        sVarO4.b(x6Var2);
        ((EnumMap) sVarO4.f17565a).put(x6Var3, 2);
        y6 y6Var4 = new y6("SIZED", 3, 3, sVarO4);
        SIZED = y6Var4;
        j$.time.format.s sVarO5 = o(x6Var3);
        sVarO5.b(x6Var4);
        int i10 = 0;
        y6 y6Var5 = new y6("SHORT_CIRCUIT", 4, 12, sVarO5);
        SHORT_CIRCUIT = y6Var5;
        f18273v = new y6[]{y6Var, y6Var2, y6Var3, y6Var4, y6Var5};
        f18257f = j(x6Var);
        f18258g = j(x6Var2);
        f18259h = j(x6Var3);
        j(x6Var4);
        j(x6Var5);
        for (y6 y6Var6 : values()) {
            i10 |= y6Var6.f18278e;
        }
        f18260i = i10;
        int i11 = f18258g;
        f18261j = i11;
        int i12 = i11 << 1;
        f18262k = i12;
        f18263l = i11 | i12;
        y6 y6Var7 = DISTINCT;
        f18264m = y6Var7.f18276c;
        f18265n = y6Var7.f18277d;
        y6 y6Var8 = SORTED;
        f18266o = y6Var8.f18276c;
        f18267p = y6Var8.f18277d;
        y6 y6Var9 = ORDERED;
        f18268q = y6Var9.f18276c;
        f18269r = y6Var9.f18277d;
        y6 y6Var10 = SIZED;
        f18270s = y6Var10.f18276c;
        f18271t = y6Var10.f18277d;
        f18272u = SHORT_CIRCUIT.f18276c;
    }

    public static j$.time.format.s o(x6 x6Var) {
        j$.time.format.s sVar = new j$.time.format.s(1, new EnumMap(x6.class));
        sVar.b(x6Var);
        return sVar;
    }

    public y6(String str, int i10, int i11, j$.time.format.s sVar) {
        for (x6 x6Var : x6.values()) {
            Map.EL.putIfAbsent(sVar.f17565a, x6Var, 0);
        }
        this.f18274a = sVar.f17565a;
        int i12 = i11 * 2;
        this.f18275b = i12;
        this.f18276c = 1 << i12;
        this.f18277d = 2 << i12;
        this.f18278e = 3 << i12;
    }

    public final boolean l(int i10) {
        return (i10 & this.f18278e) == this.f18276c;
    }

    public static int j(x6 x6Var) {
        int iIntValue = 0;
        for (y6 y6Var : values()) {
            iIntValue |= ((Integer) y6Var.f18274a.get(x6Var)).intValue() << y6Var.f18275b;
        }
        return iIntValue;
    }

    public static int i(int i10, int i11) {
        int i12;
        if (i10 == 0) {
            i12 = f18260i;
        } else {
            i12 = ~(((f18261j & i10) << 1) | i10 | ((f18262k & i10) >> 1));
        }
        return i10 | (i11 & i12);
    }

    public static int k(Spliterator spliterator) {
        int iCharacteristics = spliterator.characteristics();
        int i10 = iCharacteristics & 4;
        int i11 = f18257f;
        return (i10 == 0 || spliterator.getComparator() == null) ? iCharacteristics & i11 : iCharacteristics & i11 & (-5);
    }
}
