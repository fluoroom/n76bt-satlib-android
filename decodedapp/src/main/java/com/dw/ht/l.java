package com.dw.ht;

import android.app.Service;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6362a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final mi.c f6363b = new mi.c();

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final void a() {
            b().m(b.f6364a);
        }

        public final mi.c b() {
            return l.f6363b;
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f6364a = new b("Exit", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ b[] f6365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ kd.a f6366c;

        static {
            b[] bVarArrA = a();
            f6365b = bVarArrA;
            f6366c = kd.b.a(bVarArrA);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f6364a};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f6365b.clone();
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6367a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f6364a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6367a = iArr;
        }
    }

    public static final void e() {
        f6362a.a();
    }

    public abstract void f();

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        f6363b.q(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        f6363b.t(this);
        f();
    }

    @mi.m(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(b bVar) {
        rd.m.e(bVar, "event");
        if (c.f6367a[bVar.ordinal()] != 1) {
            throw new dd.o();
        }
        stopSelf();
        f();
    }
}
