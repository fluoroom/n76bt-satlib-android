package dk;

import android.os.Build;
import dk.c;
import dk.w;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Executor f11257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final w f11258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final c f11259c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f11257a = null;
            f11258b = new w();
            f11259c = new c();
        } else {
            if (!property.equals("Dalvik")) {
                f11257a = null;
                f11258b = new w.b();
                f11259c = new c.a();
                return;
            }
            f11257a = new a();
            if (Build.VERSION.SDK_INT >= 24) {
                f11258b = new w.a();
                f11259c = new c.a();
            } else {
                f11258b = new w();
                f11259c = new c();
            }
        }
    }
}
