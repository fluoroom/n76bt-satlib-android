package ib;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    static void a() {
        Context contextA = kb.f.a();
        if (contextA == null) {
            return;
        }
        contextA.deleteDatabase("sdk_report.db");
    }

    public static List d(String str) {
        return DesugarCollections.synchronizedList(new ArrayList());
    }

    public static void b(String str) {
    }

    public static void c(String str, List list) {
    }
}
