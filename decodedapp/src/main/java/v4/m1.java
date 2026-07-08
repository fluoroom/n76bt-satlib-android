package v4;

/* JADX INFO: loaded from: classes.dex */
public enum m1 {
    AUTO,
    APRS,
    BSS;

    public static m1 d(int i10) {
        return (i10 < 0 || i10 >= values().length) ? AUTO : values()[i10];
    }
}
