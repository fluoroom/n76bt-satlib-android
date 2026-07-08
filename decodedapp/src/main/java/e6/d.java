package e6;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends IOException {
    protected d(String str) {
        super(str);
    }

    public abstract h a();

    public abstract String b();

    public abstract Object c();

    protected d(String str, Throwable th2) {
        super(str, th2);
    }
}
