package l1;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class e {
    public static final Void a(String str) {
        rd.m.e(str, "key");
        throw new IllegalArgumentException("No valid saved state was found for the key '" + str + "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly.");
    }
}
