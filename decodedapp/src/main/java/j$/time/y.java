package j$.time;

import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y implements Serializable {
    private static final long serialVersionUID = 8352817235686L;

    public abstract j$.time.zone.f C();

    public abstract void F(DataOutput dataOutput);

    public abstract String h();

    static {
        Map.Entry[] entryArr = {j$.com.android.tools.r8.a.u("ACT", "Australia/Darwin"), j$.com.android.tools.r8.a.u("AET", "Australia/Sydney"), j$.com.android.tools.r8.a.u("AGT", "America/Argentina/Buenos_Aires"), j$.com.android.tools.r8.a.u("ART", "Africa/Cairo"), j$.com.android.tools.r8.a.u("AST", "America/Anchorage"), j$.com.android.tools.r8.a.u("BET", "America/Sao_Paulo"), j$.com.android.tools.r8.a.u("BST", "Asia/Dhaka"), j$.com.android.tools.r8.a.u("CAT", "Africa/Harare"), j$.com.android.tools.r8.a.u("CNT", "America/St_Johns"), j$.com.android.tools.r8.a.u("CST", "America/Chicago"), j$.com.android.tools.r8.a.u("CTT", "Asia/Shanghai"), j$.com.android.tools.r8.a.u("EAT", "Africa/Addis_Ababa"), j$.com.android.tools.r8.a.u("ECT", "Europe/Paris"), j$.com.android.tools.r8.a.u("IET", "America/Indiana/Indianapolis"), j$.com.android.tools.r8.a.u("IST", "Asia/Kolkata"), j$.com.android.tools.r8.a.u("JST", "Asia/Tokyo"), j$.com.android.tools.r8.a.u("MIT", "Pacific/Apia"), j$.com.android.tools.r8.a.u("NET", "Asia/Yerevan"), j$.com.android.tools.r8.a.u("NST", "Pacific/Auckland"), j$.com.android.tools.r8.a.u("PLT", "Asia/Karachi"), j$.com.android.tools.r8.a.u("PNT", "America/Phoenix"), j$.com.android.tools.r8.a.u("PRT", "America/Puerto_Rico"), j$.com.android.tools.r8.a.u("PST", "America/Los_Angeles"), j$.com.android.tools.r8.a.u("SST", "Pacific/Guadalcanal"), j$.com.android.tools.r8.a.u("VST", "Asia/Ho_Chi_Minh"), j$.com.android.tools.r8.a.u("EST", "-05:00"), j$.com.android.tools.r8.a.u("MST", "-07:00"), j$.com.android.tools.r8.a.u("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i10 = 0; i10 < 28; i10++) {
            Map.Entry entry = entryArr[i10];
            Object objRequireNonNull = Objects.requireNonNull(entry.getKey());
            if (map.put(objRequireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + objRequireNonNull);
            }
        }
        Collections.unmodifiableMap(map);
    }

    public static y D(String str, z zVar) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zVar, "offset");
        if (str.isEmpty()) {
            return zVar;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zVar.f17655a != 0) {
            str = str.concat(zVar.f17656b);
        }
        return new a0(str, zVar.C());
    }

    public static y E(String str, int i10) {
        String strSubstring = str.substring(0, i10);
        if (str.length() == i10) {
            return D(strSubstring, z.f17652e);
        }
        if (str.charAt(i10) != '+' && str.charAt(i10) != '-') {
            return a0.G(str);
        }
        try {
            z zVarG = z.G(str.substring(i10));
            if (zVarG == z.f17652e) {
                return D(strSubstring, zVarG);
            }
            return D(strSubstring, zVarG);
        } catch (b e10) {
            throw new b("Invalid ID for offset-based ZoneId: ".concat(str), e10);
        }
    }

    public y() {
        if (getClass() != z.class && getClass() != a0.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return h().equals(((y) obj).h());
        }
        return false;
    }

    public int hashCode() {
        return h().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return h();
    }

    private Object writeReplace() {
        return new t((byte) 7, this);
    }
}
