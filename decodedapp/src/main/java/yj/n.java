package yj;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public enum n {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    private static final Map B = new HashMap();
    private static final Map C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f32727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f32728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f32729f;

    static {
        for (n nVar : values()) {
            Map map = B;
            map.put(nVar.e(), nVar);
            map.put(nVar.d(), nVar);
        }
        C = new HashMap();
        for (n nVar2 : values()) {
            C.put(Integer.valueOf(nVar2.getNumber()), nVar2);
        }
    }

    n(int i10) {
        this.f32724a = i10;
        String lowerCase = toString().toLowerCase();
        this.f32725b = lowerCase;
        String str = toString().charAt(0) + lowerCase.substring(1);
        this.f32726c = str;
        this.f32727d = toString().substring(0, 3);
        this.f32728e = lowerCase.substring(0, 3);
        this.f32729f = str.substring(0, 3);
    }

    public static n f(int i10) {
        n nVar = (n) C.get(Integer.valueOf(i10));
        if (nVar != null) {
            return nVar;
        }
        throw new hj.c(hj.f.UNKNOWN_MONTH, Integer.valueOf(i10));
    }

    public static n h(String str) {
        String lowerCase = str.trim().toLowerCase();
        n nVar = (n) B.get(lowerCase);
        if (nVar != null) {
            return nVar;
        }
        try {
            return f(Integer.parseInt(lowerCase));
        } catch (NumberFormatException unused) {
            throw new hj.c(hj.f.UNKNOWN_MONTH, str);
        }
    }

    public String a() {
        return this.f32729f;
    }

    public String d() {
        return this.f32728e;
    }

    public String e() {
        return this.f32725b;
    }

    public String g() {
        return this.f32727d;
    }

    public int getNumber() {
        return this.f32724a;
    }
}
