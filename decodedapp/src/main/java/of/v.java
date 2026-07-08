package of;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class v extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f23518a;

    public v(p pVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f23518a = null;
    }

    public k a() {
        return new k(getMessage());
    }
}
