package com.dw.ht;

import android.app.IntentService;
import com.dw.ht.l;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends IntentService {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6348a;

        static {
            int[] iArr = new int[l.b.values().length];
            try {
                iArr[l.b.f6364a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6348a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str) {
        super(str);
        rd.m.e(str, "name");
    }

    public abstract void a();

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        l.f6362a.b().q(this);
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        l.f6362a.b().t(this);
        a();
    }

    @mi.m(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(l.b bVar) {
        rd.m.e(bVar, "event");
        if (a.f6348a[bVar.ordinal()] != 1) {
            throw new dd.o();
        }
        stopSelf();
        a();
    }
}
