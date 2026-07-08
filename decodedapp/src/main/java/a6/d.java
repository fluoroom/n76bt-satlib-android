package a6;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Logger f327a = Logger.getLogger(d.class.getName());

    public static void a(Closeable closeable, boolean z10) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e10) {
            if (!z10) {
                throw e10;
            }
            f327a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e10);
        }
    }

    public static void b(Closeable closeable) {
        try {
            a(closeable, true);
        } catch (IOException e10) {
            f327a.log(Level.SEVERE, "IOException should not have been thrown.", (Throwable) e10);
        }
    }
}
