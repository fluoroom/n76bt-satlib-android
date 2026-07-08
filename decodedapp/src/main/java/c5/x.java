package c5;

/* JADX INFO: loaded from: classes.dex */
public enum x {
    DISABLE,
    NORMAL,
    FOLLOWING,
    LOCATION_ROTATE;

    public static x e(int i10) {
        return (i10 < 0 || values().length <= i10) ? NORMAL : values()[i10];
    }

    public boolean d() {
        return this == FOLLOWING || this == LOCATION_ROTATE;
    }
}
