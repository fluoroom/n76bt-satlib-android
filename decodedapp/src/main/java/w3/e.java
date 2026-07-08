package w3;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static short a(double d10) {
        if (d10 >= 32767.0d) {
            return Short.MAX_VALUE;
        }
        if (d10 <= -32768.0d) {
            return Short.MIN_VALUE;
        }
        return (short) d10;
    }
}
