package o6;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f23271a = Pattern.compile("[-_./;:]");

    public static final void a() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }
}
