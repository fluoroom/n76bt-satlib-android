package sf;

import eg.c1;
import he.h0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends r {
    public e(char c10) {
        super(Character.valueOf(c10));
    }

    private final String c(char c10) {
        switch (c10) {
            case '\b':
                return "\\b";
            case '\t':
                return "\\t";
            case '\n':
                return "\\n";
            case 11:
            default:
                return e(c10) ? String.valueOf(c10) : "?";
            case '\f':
                return "\\f";
            case '\r':
                return "\\r";
        }
    }

    private final boolean e(char c10) {
        byte type = (byte) Character.getType(c10);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // sf.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c1 a(h0 h0Var) {
        rd.m.e(h0Var, "module");
        c1 c1VarV = h0Var.o().v();
        rd.m.d(c1VarV, "getCharType(...)");
        return c1VarV;
    }

    @Override // sf.g
    public String toString() {
        String str = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(((Character) b()).charValue()), c(((Character) b()).charValue())}, 2));
        rd.m.d(str, "format(...)");
        return str;
    }
}
