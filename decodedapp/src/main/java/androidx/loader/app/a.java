package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.t;
import androidx.lifecycle.y0;
import g1.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.loader.app.a$a, reason: collision with other inner class name */
    public interface InterfaceC0037a {
        void K(c cVar, Object obj);

        c S(int i10, Bundle bundle);

        void t0(c cVar);
    }

    public static a b(t tVar) {
        return new b(tVar, ((y0) tVar).U());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract c c(int i10, Bundle bundle, InterfaceC0037a interfaceC0037a);

    public abstract void d();
}
