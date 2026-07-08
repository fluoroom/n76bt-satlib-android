package o5;

import android.content.Context;
import android.location.Location;
import com.dw.ht.Cfg;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class g extends r5.a {

    /* JADX INFO: renamed from: s */
    public static final a f23195s = new a(null);

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public static /* synthetic */ Location c(a aVar, Context context, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                context = null;
            }
            return aVar.b(context);
        }

        public static /* synthetic */ Location e(a aVar, Location location, r5.a aVar2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                aVar2 = null;
            }
            return aVar.d(location, aVar2);
        }

        public final Location a(Context context) {
            Cfg.Settings settingsO = Cfg.O();
            return settingsO.getAprsLocationSource() == 1 ? settingsO.getAprsLocation() : b(context);
        }

        public final Location b(Context context) {
            return r5.a.f25458j.g(context);
        }

        public final Location d(Location location, r5.a aVar) {
            return r5.a.f25458j.r(location, aVar);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, r5.c cVar) {
        super(context, cVar);
        m.e(context, "context");
        r5.a.f25458j.q(false);
    }

    public static final Location B(Context context) {
        return f23195s.a(context);
    }

    public static final Location C(Context context) {
        return f23195s.b(context);
    }
}
