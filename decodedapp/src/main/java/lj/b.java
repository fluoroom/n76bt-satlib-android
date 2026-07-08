package lj;

import hj.c;
import hj.f;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public enum b {
    USER_DEFINED_A('A', null),
    USER_DEFINED_B('B', null),
    BEIDOU('C', a.f20692e),
    USER_DEFINED_D('D', null),
    GALILEO('E', a.f20689b),
    USER_DEFINED_F('F', null),
    GPS('G', a.f20688a),
    USER_DEFINED_H('H', null),
    NAVIC('I', a.f20693f),
    QZSS('J', a.f20691d),
    USER_DEFINED_K('K', null),
    USER_DEFINED_L('L', null),
    MIXED('M', null),
    USER_DEFINED_N('N', null),
    USER_DEFINED_O('O', null),
    USER_DEFINED_P('P', null),
    USER_DEFINED_Q('Q', null),
    GLONASS('R', a.f20690c),
    SBAS('S', null),
    USER_DEFINED_T('T', null),
    USER_DEFINED_U('U', null),
    USER_DEFINED_V('V', null),
    USER_DEFINED_W('W', null),
    USER_DEFINED_X('X', null),
    USER_DEFINED_Y('Y', null),
    USER_DEFINED_Z('Z', null);

    private static final Map L = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f20710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f20711b;

    static {
        for (b bVar : values()) {
            L.put(Character.valueOf(bVar.a()), bVar);
        }
    }

    b(char c10, a aVar) {
        this.f20710a = c10;
        this.f20711b = aVar;
    }

    public static b d(String str) {
        b bVar = (b) L.get(Character.valueOf(str.charAt(0)));
        if (bVar != null) {
            return bVar;
        }
        throw new c(f.UNKNOWN_SATELLITE_SYSTEM, Character.valueOf(str.charAt(0)));
    }

    public char a() {
        return this.f20710a;
    }
}
