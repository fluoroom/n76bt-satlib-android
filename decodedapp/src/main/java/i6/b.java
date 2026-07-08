package i6;

import com.facebook.stetho.websocket.CloseCodes;
import j6.v;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static BigInteger a(String str) {
        try {
            return v.a(str);
        } catch (NumberFormatException e10) {
            if (str.length() > 1000) {
                str = str.substring(0, CloseCodes.NORMAL_CLOSURE) + " [truncated]";
            }
            throw new NumberFormatException("Value \"" + str + "\" can not be represented as `java.math.BigInteger`, reason: " + e10.getMessage());
        }
    }
}
