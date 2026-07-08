package a0;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import b.a;
import com.facebook.stetho.websocket.CloseCodes;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f96d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static d f99g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NotificationManager f101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f95c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Set f97e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f98f = new Object();

    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    private static class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Notification f105d;

        b(String str, int i10, String str2, Notification notification) {
            this.f102a = str;
            this.f103b = i10;
            this.f104c = str2;
            this.f105d = notification;
        }

        @Override // a0.n.e
        public void a(b.a aVar) {
            aVar.m1(this.f102a, this.f103b, this.f104c, this.f105d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f102a + ", id:" + this.f103b + ", tag:" + this.f104c + "]";
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ComponentName f106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final IBinder f107b;

        c(ComponentName componentName, IBinder iBinder) {
            this.f106a = componentName;
            this.f107b = iBinder;
        }
    }

    private static class d implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HandlerThread f109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f111d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Set f112e = new HashSet();

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final ComponentName f113a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            b.a f115c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            boolean f114b = false;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            ArrayDeque f116d = new ArrayDeque();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f117e = 0;

            a(ComponentName componentName) {
                this.f113a = componentName;
            }
        }

        d(Context context) {
            this.f108a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f109b = handlerThread;
            handlerThread.start();
            this.f110c = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f114b) {
                return true;
            }
            boolean zBindService = this.f108a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f113a), this, 33);
            aVar.f114b = zBindService;
            if (zBindService) {
                aVar.f117e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f113a);
                this.f108a.unbindService(this);
            }
            return aVar.f114b;
        }

        private void b(a aVar) {
            if (aVar.f114b) {
                this.f108a.unbindService(this);
                aVar.f114b = false;
            }
            aVar.f115c = null;
        }

        private void c(e eVar) {
            j();
            for (a aVar : this.f111d.values()) {
                aVar.f116d.add(eVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = (a) this.f111d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = (a) this.f111d.get(componentName);
            if (aVar != null) {
                aVar.f115c = a.AbstractBinderC0052a.j(iBinder);
                aVar.f117e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = (a) this.f111d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f113a + ", " + aVar.f116d.size() + " queued tasks");
            }
            if (aVar.f116d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f115c == null) {
                i(aVar);
                return;
            }
            while (true) {
                e eVar = (e) aVar.f116d.peek();
                if (eVar == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + eVar);
                    }
                    eVar.a(aVar.f115c);
                    aVar.f116d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f113a);
                    }
                } catch (RemoteException e10) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f113a, e10);
                }
            }
            if (aVar.f116d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f110c.hasMessages(3, aVar.f113a)) {
                return;
            }
            int i10 = aVar.f117e;
            int i11 = i10 + 1;
            aVar.f117e = i11;
            if (i11 <= 6) {
                int i12 = (1 << i10) * CloseCodes.NORMAL_CLOSURE;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
                }
                this.f110c.sendMessageDelayed(this.f110c.obtainMessage(3, aVar.f113a), i12);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f116d.size() + " tasks to " + aVar.f113a + " after " + aVar.f117e + " retries");
            aVar.f116d.clear();
        }

        private void j() {
            Set setE = n.e(this.f108a);
            if (setE.equals(this.f112e)) {
                return;
            }
            this.f112e = setE;
            List<ResolveInfo> listQueryIntentServices = this.f108a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setE.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f111d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f111d.put(componentName2, new a(componentName2));
                }
            }
            Iterator it = this.f111d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    b((a) entry.getValue());
                    it.remove();
                }
            }
        }

        public void h(e eVar) {
            this.f110c.obtainMessage(0, eVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((e) message.obj);
                return true;
            }
            if (i10 == 1) {
                c cVar = (c) message.obj;
                e(cVar.f106a, cVar.f107b);
                return true;
            }
            if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f110c.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f110c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    private interface e {
        void a(b.a aVar);
    }

    private n(Context context) {
        this.f100a = context;
        this.f101b = (NotificationManager) context.getSystemService("notification");
    }

    public static n d(Context context) {
        return new n(context);
    }

    public static Set e(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f95c) {
            if (string != null) {
                try {
                    if (!string.equals(f96d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f97e = hashSet;
                        f96d = string;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            set = f97e;
        }
        return set;
    }

    private void h(e eVar) {
        synchronized (f98f) {
            try {
                if (f99g == null) {
                    f99g = new d(this.f100a.getApplicationContext());
                }
                f99g.h(eVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean i(Notification notification) {
        Bundle bundleA = k.a(notification);
        return bundleA != null && bundleA.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(this.f101b);
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f100a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f100a.getApplicationInfo();
        String packageName = this.f100a.getApplicationContext().getPackageName();
        int i10 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i10), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void b(int i10) {
        c(null, i10);
    }

    public void c(String str, int i10) {
        this.f101b.cancel(str, i10);
    }

    public void f(int i10, Notification notification) {
        g(null, i10, notification);
    }

    public void g(String str, int i10, Notification notification) {
        if (!i(notification)) {
            this.f101b.notify(str, i10, notification);
        } else {
            h(new b(this.f100a.getPackageName(), i10, str, notification));
            this.f101b.cancel(str, i10);
        }
    }
}
