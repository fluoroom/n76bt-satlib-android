package qb;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static p f24697d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f24698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f24699b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24700c = 0;

    p() {
    }

    public static synchronized p b() {
        try {
            if (f24697d == null) {
                f24697d = new p();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24697d;
    }

    public synchronized List a() {
        try {
            if (!this.f24698a) {
                this.f24700c++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f24699b;
    }

    public synchronized boolean c() {
        return this.f24698a;
    }
}
