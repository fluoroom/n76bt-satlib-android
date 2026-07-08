package com.dw.ht;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import org.greenrobot.eventbus.ThreadMode;
import v4.l1;
import z1.a;

/* JADX INFO: loaded from: classes.dex */
public class HTService extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile boolean f5525e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final b f5526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Messenger f5527d;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f5529b;

        static {
            int[] iArr = new int[a.b.values().length];
            f5529b = iArr;
            try {
                iArr[a.b.Audio.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5529b[a.b.Command.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[a.EnumC0443a.values().length];
            f5528a = iArr2;
            try {
                iArr2[a.EnumC0443a.RegisterCallback.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5528a[a.EnumC0443a.StartTransmission.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5528a[a.EnumC0443a.StopTransmission.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private static class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        m5.b f5530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private l1 f5531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Messenger f5532c;

        public b() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = a.f5529b[a.b.d(message.what).ordinal()];
            if (i10 == 1) {
                m5.b bVar = this.f5530a;
                if (bVar == null) {
                    return;
                }
                bVar.R(z1.a.b((Bundle) message.obj));
                return;
            }
            if (i10 == 2) {
                int i11 = a.f5528a[a.EnumC0443a.d(message.arg1).ordinal()];
                if (i11 == 1) {
                    this.f5532c = message.replyTo;
                    if (this.f5531b == null) {
                        this.f5531b = v4.u.w().r();
                    }
                } else if (i11 != 2) {
                    if (i11 == 3) {
                        if (this.f5530a == null) {
                            return;
                        }
                        this.f5531b.p1();
                        this.f5530a = null;
                    }
                } else {
                    if (this.f5530a != null) {
                        return;
                    }
                    if (this.f5531b == null) {
                        this.f5531b = v4.u.w().r();
                    }
                    if (this.f5531b != null) {
                        m5.b bVar2 = new m5.b(this.f5531b, "ex app send audio");
                        this.f5530a = bVar2;
                        this.f5531b.m1(bVar2);
                    }
                }
            }
            super.handleMessage(message);
        }
    }

    public HTService() {
        b bVar = new b();
        this.f5526c = bVar;
        this.f5527d = new Messenger(bVar);
    }

    public static boolean g() {
        return f5525e;
    }

    @Override // com.dw.ht.l
    public void f() {
        mi.c.e().t(this);
        f5525e = false;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (f5525e) {
            s3.b.b("HTService", "已经有一个绑定");
            return null;
        }
        f5525e = true;
        s3.b.b("HTService", "binding");
        return this.f5527d.getBinder();
    }

    @Override // com.dw.ht.l, android.app.Service
    public void onCreate() {
        super.onCreate();
        mi.c.e().q(this);
    }

    @mi.m(threadMode = ThreadMode.BACKGROUND)
    public void onMessageEvent(p4.b bVar) {
        Messenger messenger = this.f5526c.f5532c;
        if (messenger == null) {
            return;
        }
        int i10 = bVar.f23905b;
        Message messageObtain = null;
        if (i10 == 1) {
            messageObtain = Message.obtain(null, a.b.Command.ordinal(), a.EnumC0443a.StartTransmission.ordinal(), 0);
        } else if (i10 == 2) {
            messageObtain = Message.obtain(null, a.b.Command.ordinal(), a.EnumC0443a.StopTransmission.ordinal(), 0);
        } else if (i10 == 3 && bVar.f23906c != null) {
            messageObtain = Message.obtain(null, a.b.Audio.ordinal(), 0, 0, z1.a.a(bVar.f23904a, bVar.f23906c));
        }
        if (messageObtain != null) {
            try {
                messenger.send(messageObtain);
            } catch (RemoteException e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        f5525e = false;
        this.f5526c.f5532c = null;
        s3.b.b("HTService", "unbinding");
        return super.onUnbind(intent);
    }
}
