package k7;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    public interface a {
        void a(Context context, String[] strArr, String str, File file, d dVar);
    }

    public interface b {
        String a(String str);

        void b(String str);

        String c(String str);

        String[] d();

        void e(String str);
    }

    /* JADX INFO: renamed from: k7.c$c, reason: collision with other inner class name */
    public interface InterfaceC0255c {
        void a();

        void b(Throwable th2);
    }

    public static void a(Context context, String str, String str2, InterfaceC0255c interfaceC0255c) {
        new d().f(context, str, str2, interfaceC0255c);
    }

    public static void b(Context context, String str, InterfaceC0255c interfaceC0255c) {
        a(context, str, null, interfaceC0255c);
    }
}
