package wh;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f31501a = Logger.getLogger("okio.Okio");

    public static final boolean b(AssertionError assertionError) {
        rd.m.e(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? rg.q.P(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }
}
