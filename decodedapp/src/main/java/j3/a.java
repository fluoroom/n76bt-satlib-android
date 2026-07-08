package j3;

/* JADX INFO: loaded from: classes.dex */
public enum a {
    DATA_TRANSFER,
    VALIDATION,
    TRANSFER_COMPLETE,
    IN_PROGRESS,
    COMMIT;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a[] f18411f = values();

    public static a d(int i10) {
        if (i10 < 0) {
            return null;
        }
        a[] aVarArr = f18411f;
        if (i10 >= aVarArr.length) {
            return null;
        }
        return aVarArr[i10];
    }
}
