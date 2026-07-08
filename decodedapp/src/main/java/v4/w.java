package v4;

/* JADX INFO: loaded from: classes.dex */
public enum w {
    UNKNOWN,
    BATTERY_LEVEL,
    BATTERY_VOLTAGE,
    RC_BATTERY_LEVEL,
    BATTERY_LEVEL_AS_PERCENTAGE;

    public static w d(int i10) {
        return (i10 < 0 || i10 >= values().length) ? UNKNOWN : values()[i10];
    }
}
