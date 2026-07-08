package com.dw.ht;

import a0.k;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.IBinder;
import com.benshikj.ht.R;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import tg.p0;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0003J)\u0010\u000f\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/dw/ht/RadioService;", "Lcom/dw/ht/l;", "<init>", "()V", "Ldd/d0;", "i", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onCreate", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "f", "Lv4/u$c;", "event", "onMessageEvent", "(Lv4/u$c;)V", "Lv4/u;", "c", "Lv4/u;", "cm", "Lv4/c0;", "d", "Lv4/c0;", "currentLink", "e", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RadioService extends l {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    private static boolean f5566f;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final v4.u cm;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private v4.c0 currentLink;

    /* JADX INFO: renamed from: com.dw.ht.RadioService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: com.dw.ht.RadioService$a$a */
        static final class C0083a extends jd.m implements qd.p {

            /* JADX INFO: renamed from: e */
            int f5569e;

            C0083a(hd.e eVar) {
                super(2, eVar);
            }

            @Override // jd.a
            public final hd.e g(Object obj, hd.e eVar) {
                return new C0083a(eVar);
            }

            @Override // jd.a
            public final Object o(Object obj) {
                id.b.e();
                if (this.f5569e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dd.s.b(obj);
                s3.b.h("RadioService", "onSettingsChanged");
                boolean z10 = v4.u.w().q() != null;
                Companion companion = RadioService.INSTANCE;
                if (z10 == companion.a()) {
                    return dd.d0.f10897a;
                }
                s3.b.h("RadioService", "running " + companion.a() + " -> " + z10);
                Main main = Main.f5555g;
                rd.m.d(main, "sMain");
                Intent intent = new Intent(main, (Class<?>) RadioService.class);
                if (v4.u.w().q() != null) {
                    companion.c(l3.f.e(main, intent) != null);
                } else {
                    main.stopService(intent);
                    companion.c(false);
                }
                return dd.d0.f10897a;
            }

            @Override // qd.p
            /* JADX INFO: renamed from: t */
            public final Object s(tg.d0 d0Var, hd.e eVar) {
                return ((C0083a) g(d0Var, eVar)).o(dd.d0.f10897a);
            }
        }

        public /* synthetic */ Companion(rd.h hVar) {
            this();
        }

        public final boolean a() {
            return RadioService.f5566f;
        }

        public final void b() {
            tg.g.b(tg.e0.a(p0.c()), null, null, new C0083a(null), 3, null);
        }

        public final void c(boolean z10) {
            RadioService.f5566f = z10;
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5570a;

        static {
            int[] iArr = new int[u.c.values().length];
            try {
                iArr[u.c.CurrentLinkChanged.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f5570a = iArr;
        }
    }

    public RadioService() {
        v4.u uVarW = v4.u.w();
        rd.m.d(uVarW, "getInstance(...)");
        this.cm = uVarW;
    }

    private final void i() {
        k.d dVarS = new k.d(this, l3.e.f20374b).q(-2).i(PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) BTActivity.class), 67108864)).k(getString(R.string.radioIntercom)).s(R.drawable.ic_stat_radio);
        rd.m.d(dVarS, "setSmallIcon(...)");
        v4.c0 c0Var = this.currentLink;
        String name = c0Var != null ? c0Var.getName() : null;
        if (!a6.w.b(name)) {
            dVarS.j(name);
        }
        Notification notificationC = dVarS.c();
        rd.m.d(notificationC, "build(...)");
        try {
            startForeground(R.string.radioIntercom, notificationC);
        } catch (Exception e10) {
            s3.b.c("RadioService", "showStatus", e10);
        }
    }

    @Override // com.dw.ht.l
    public void f() {
        s3.b.h("RadioService", "onDestroy");
        mi.c.e().t(this);
        f5566f = false;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        rd.m.e(intent, "intent");
        return null;
    }

    @Override // com.dw.ht.l, android.app.Service
    public void onCreate() {
        s3.b.h("RadioService", "onCreate");
        super.onCreate();
        this.currentLink = this.cm.q();
        i();
        mi.c.e().q(this);
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(u.c event) {
        rd.m.e(event, "event");
        if (b.f5570a[event.ordinal()] != 1 || rd.m.a(this.currentLink, this.cm.q())) {
            return;
        }
        this.currentLink = this.cm.q();
        i();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        s3.b.h("RadioService", "onStartCommand");
        return 1;
    }
}
