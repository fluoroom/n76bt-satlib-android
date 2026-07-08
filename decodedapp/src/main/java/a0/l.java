package a0;

import a0.k;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class l implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f84a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Notification.Builder f85b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k.d f86c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RemoteViews f87d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RemoteViews f88e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f89f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f90g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f91h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RemoteViews f92i;

    static class a {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i10, charSequence, pendingIntent);
        }

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        static Notification.Builder i(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class b {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    static class c {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    static class d {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class e {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    static class f {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    static class g {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }
    }

    static class h {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    static final class i {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.setShortCriticalText(str);
        }
    }

    l(k.d dVar) {
        int i10;
        Object obj;
        this.f86c = dVar;
        Context context = dVar.f43a;
        this.f84a = context;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            this.f85b = e.a(context, dVar.L);
        } else {
            this.f85b = new Notification.Builder(dVar.f43a);
        }
        Notification notification = dVar.S;
        this.f85b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f52j).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f47e).setContentText(dVar.f48f).setContentInfo(dVar.f54l).setContentIntent(dVar.f50h).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f51i, (notification.flags & 128) != 0).setNumber(dVar.f55m).setProgress(dVar.f63u, dVar.f64v, dVar.f65w);
        if (i11 < 23) {
            Notification.Builder builder = this.f85b;
            IconCompat iconCompat = dVar.f53k;
            builder.setLargeIcon(iconCompat == null ? null : iconCompat.c());
        } else {
            Notification.Builder builder2 = this.f85b;
            IconCompat iconCompat2 = dVar.f53k;
            c.b(builder2, iconCompat2 == null ? null : iconCompat2.m(context));
        }
        this.f85b.setSubText(dVar.f60r).setUsesChronometer(dVar.f58p).setPriority(dVar.f56n);
        Iterator it = dVar.f44b.iterator();
        while (it.hasNext()) {
            b((k.a) it.next());
        }
        Bundle bundle = dVar.E;
        if (bundle != null) {
            this.f90g.putAll(bundle);
        }
        int i12 = Build.VERSION.SDK_INT;
        this.f87d = dVar.I;
        this.f88e = dVar.J;
        this.f85b.setShowWhen(dVar.f57o);
        a.i(this.f85b, dVar.A);
        a.g(this.f85b, dVar.f66x);
        a.j(this.f85b, dVar.f68z);
        a.h(this.f85b, dVar.f67y);
        this.f91h = dVar.P;
        b.b(this.f85b, dVar.D);
        b.c(this.f85b, dVar.F);
        b.f(this.f85b, dVar.G);
        b.d(this.f85b, dVar.H);
        b.e(this.f85b, notification.sound, notification.audioAttributes);
        List listE = i12 < 28 ? e(f(dVar.f45c), dVar.V) : dVar.V;
        if (listE != null && !listE.isEmpty()) {
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                b.a(this.f85b, (String) it2.next());
            }
        }
        this.f92i = dVar.K;
        if (dVar.f46d.size() > 0) {
            Bundle bundle2 = dVar.e().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i13 = 0; i13 < dVar.f46d.size(); i13++) {
                bundle4.putBundle(Integer.toString(i13), m.a((k.a) dVar.f46d.get(i13)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            dVar.e().putBundle("android.car.EXTENSIONS", bundle2);
            this.f90g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 23 && (obj = dVar.U) != null) {
            c.c(this.f85b, obj);
        }
        if (i14 >= 24) {
            this.f85b.setExtras(dVar.E);
            d.e(this.f85b, dVar.f62t);
            RemoteViews remoteViews = dVar.I;
            if (remoteViews != null) {
                d.c(this.f85b, remoteViews);
            }
            RemoteViews remoteViews2 = dVar.J;
            if (remoteViews2 != null) {
                d.b(this.f85b, remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.K;
            if (remoteViews3 != null) {
                d.d(this.f85b, remoteViews3);
            }
        }
        if (i14 >= 26) {
            e.b(this.f85b, dVar.M);
            e.e(this.f85b, dVar.f61s);
            e.f(this.f85b, dVar.N);
            e.g(this.f85b, dVar.O);
            e.d(this.f85b, dVar.P);
            if (dVar.C) {
                e.c(this.f85b, dVar.B);
            }
            if (!TextUtils.isEmpty(dVar.L)) {
                this.f85b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i14 >= 28) {
            Iterator it3 = dVar.f45c.iterator();
            while (it3.hasNext()) {
                f.a(this.f85b, ((r) it3.next()).h());
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 29) {
            g.a(this.f85b, dVar.R);
            g.b(this.f85b, k.c.a(null));
        }
        if (i15 >= 31 && (i10 = dVar.Q) != 0) {
            h.b(this.f85b, i10);
        }
        if (i15 >= 36) {
            i.a(this.f85b, dVar.f49g);
        }
        if (dVar.T) {
            if (this.f86c.f67y) {
                this.f91h = 2;
            } else {
                this.f91h = 1;
            }
            this.f85b.setVibrate(null);
            this.f85b.setSound(null);
            int i16 = notification.defaults & (-4);
            notification.defaults = i16;
            this.f85b.setDefaults(i16);
            if (i15 >= 26) {
                if (TextUtils.isEmpty(this.f86c.f66x)) {
                    a.g(this.f85b, "silent");
                }
                e.d(this.f85b, this.f91h);
            }
        }
    }

    private void b(k.a aVar) {
        int i10 = Build.VERSION.SDK_INT;
        IconCompat iconCompatD = aVar.d();
        Notification.Action.Builder builderA = i10 >= 23 ? c.a(iconCompatD != null ? iconCompatD.l() : null, aVar.h(), aVar.a()) : a.e(iconCompatD != null ? iconCompatD.d() : 0, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : t.b(aVar.e())) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            d.a(builderA, aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i11 >= 28) {
            f.b(builderA, aVar.f());
        }
        if (i11 >= 29) {
            g.c(builderA, aVar.j());
        }
        if (i11 >= 31) {
            h.a(builderA, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(builderA, bundle);
        a.a(this.f85b, a.d(builderA));
    }

    private static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.b bVar = new androidx.collection.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List f(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((r) it.next()).g());
        }
        return arrayList;
    }

    private void g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // a0.j
    public Notification.Builder a() {
        return this.f85b;
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        k.f fVar = this.f86c.f59q;
        if (fVar != null) {
            fVar.b(this);
        }
        RemoteViews remoteViewsE = fVar != null ? fVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null) {
            notificationD.contentView = remoteViewsE;
        } else {
            RemoteViews remoteViews = this.f86c.I;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (fVar != null && (remoteViewsD = fVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (fVar != null && (remoteViewsF = this.f86c.f59q.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (fVar != null && (bundleA = k.a(notificationD)) != null) {
            fVar.a(bundleA);
        }
        return notificationD;
    }

    protected Notification d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return this.f85b.build();
        }
        if (i10 >= 24) {
            Notification notificationBuild = this.f85b.build();
            if (this.f91h != 0) {
                if (a.f(notificationBuild) != null && (notificationBuild.flags & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0 && this.f91h == 2) {
                    g(notificationBuild);
                }
                if (a.f(notificationBuild) != null && (notificationBuild.flags & WXMediaMessage.TITLE_LENGTH_LIMIT) == 0 && this.f91h == 1) {
                    g(notificationBuild);
                }
            }
            return notificationBuild;
        }
        this.f85b.setExtras(this.f90g);
        Notification notificationBuild2 = this.f85b.build();
        RemoteViews remoteViews = this.f87d;
        if (remoteViews != null) {
            notificationBuild2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f88e;
        if (remoteViews2 != null) {
            notificationBuild2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f92i;
        if (remoteViews3 != null) {
            notificationBuild2.headsUpContentView = remoteViews3;
        }
        if (this.f91h != 0) {
            if (a.f(notificationBuild2) != null && (notificationBuild2.flags & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0 && this.f91h == 2) {
                g(notificationBuild2);
            }
            if (a.f(notificationBuild2) != null && (notificationBuild2.flags & WXMediaMessage.TITLE_LENGTH_LIMIT) == 0 && this.f91h == 1) {
                g(notificationBuild2);
            }
        }
        return notificationBuild2;
    }
}
