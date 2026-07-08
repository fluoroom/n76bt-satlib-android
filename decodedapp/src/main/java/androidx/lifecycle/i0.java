package androidx.lifecycle;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import l1.f;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f2635c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f2636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c1.b f2637b;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final i0 a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                return new i0();
            }
            ClassLoader classLoader = i0.class.getClassLoader();
            rd.m.b(classLoader);
            bundle.setClassLoader(classLoader);
            return new i0(l1.c.g(l1.c.a(bundle)));
        }

        private a() {
        }
    }

    public i0(Map map) {
        rd.m.e(map, "initialState");
        this.f2636a = new LinkedHashMap();
        this.f2637b = new c1.b(map);
    }

    public final f.b a() {
        return this.f2637b.b();
    }

    public i0() {
        this.f2636a = new LinkedHashMap();
        this.f2637b = new c1.b(null, 1, 0 == true ? 1 : 0);
    }
}
