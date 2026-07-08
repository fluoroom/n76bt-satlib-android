package n4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.KeyEvent;
import androidx.appcompat.widget.ActivityChooserView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class l extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SharedPreferences f22471b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f22474e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f22470a = new f(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p4.c f22472c = new p4.c(0, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p4.c f22473d = new p4.c(0, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap f22475f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final HashMap f22476g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final HashMap f22477h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ArrayList f22478i = new ArrayList();

    public static final class b extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f22483e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3) {
            super(str, str2);
            rd.m.e(str, "name");
            rd.m.e(str2, "action");
            rd.m.e(str3, "extra");
            this.f22483e = str3;
        }

        @Override // n4.l.a
        public void i(Intent intent) {
            rd.m.e(intent, "intent");
            k(intent.getBooleanExtra(this.f22483e, false));
        }
    }

    public static final class c extends a {
        c() {
            super("Kodiak", "com.kodiak.intent.action.PTT_BUTTON");
        }

        @Override // n4.l.a
        public void i(Intent intent) {
            rd.m.e(intent, "intent");
            KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (keyEvent != null) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    k(true);
                } else if (keyEvent.getAction() == 1) {
                    k(false);
                }
            }
        }
    }

    public static final class d extends a {
        d() {
            super("PTT", "android.intent.action.PTT");
        }

        @Override // n4.l.a
        public void i(Intent intent) {
            rd.m.e(intent, "intent");
            int intExtra = intent.getIntExtra("keycode", -1);
            if (intExtra == 1) {
                k(true);
            } else {
                if (intExtra != 3) {
                    return;
                }
                k(false);
            }
        }
    }

    public static final class e extends a {
        e() {
            super("POCKEY", "com.pockey.keyeventt");
        }

        @Override // n4.l.a
        public void i(Intent intent) {
            rd.m.e(intent, "intent");
            if (intent.getIntExtra("key", 0) == 132) {
                k(intent.getBooleanExtra("isDown", false));
            }
        }
    }

    public static final class f {
        public /* synthetic */ f(rd.h hVar) {
            this();
        }

        public final ArrayList a() {
            return l.f22478i;
        }

        public final void b(Context context) {
            Set<String> stringSet;
            rd.m.e(context, "context");
            l.f22471b = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
            SharedPreferences sharedPreferences = l.f22471b;
            if (sharedPreferences != null && (stringSet = sharedPreferences.getStringSet("disable_ptt_actions", null)) != null) {
                Iterator it = l.f22470a.a().iterator();
                while (it.hasNext()) {
                    ((a) it.next()).j(!stringSet.contains(ed.j.S(r2.e(), null, null, null, 0, null, null, 63, null)));
                }
            }
            IntentFilter intentFilter = new IntentFilter();
            Iterator it2 = l.f22475f.entrySet().iterator();
            while (it2.hasNext()) {
                intentFilter.addAction((String) ((Map.Entry) it2.next()).getKey());
            }
            Iterator it3 = l.f22476g.entrySet().iterator();
            while (it3.hasNext()) {
                intentFilter.addAction((String) ((Map.Entry) it3.next()).getKey());
            }
            Iterator it4 = l.f22477h.entrySet().iterator();
            while (it4.hasNext()) {
                intentFilter.addAction((String) ((Map.Entry) it4.next()).getKey());
            }
            intentFilter.setPriority(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            b0.b.j(context, new l(), intentFilter, 2);
        }

        public final void c() {
            SharedPreferences sharedPreferences = l.f22471b;
            if (sharedPreferences != null) {
                HashSet hashSet = new HashSet();
                for (a aVar : l.f22470a.a()) {
                    if (!aVar.f()) {
                        hashSet.add(ed.j.S(aVar.e(), null, null, null, 0, null, null, 63, null));
                    }
                }
                sharedPreferences.edit().putStringSet("disable_ptt_actions", hashSet).apply();
            }
        }

        public final void d(boolean z10) {
            if (z10 == l.f22474e) {
                return;
            }
            l.f22474e = z10;
            mi.c.e().m(z10 ? l.f22472c : l.f22473d);
        }

        private f() {
        }
    }

    public static final class g extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f22484e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f22485f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, String str3) {
            super(str, null, 2, 0 == true ? 1 : 0);
            rd.m.e(str, "name");
            rd.m.e(str2, "down");
            rd.m.e(str3, "up");
            this.f22484e = str2;
            this.f22485f = str3;
        }

        @Override // n4.l.a
        public String[] e() {
            return new String[]{this.f22485f, this.f22484e};
        }

        public final String l() {
            return this.f22484e;
        }

        public final String m() {
            return this.f22485f;
        }

        public /* synthetic */ g(String str, String str2, String str3, String str4, int i10, rd.h hVar) {
            this(str, (i10 & 2) != 0 ? str : str2, (i10 & 4) != 0 ? "down" : str3, (i10 & 8) != 0 ? "up" : str4);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, String str3, String str4) {
            this(str, str2 + '.' + str3, str2 + '.' + str4);
            rd.m.e(str, "name");
            rd.m.e(str2, "prefix");
            rd.m.e(str3, "down");
            rd.m.e(str4, "up");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f22486a = new h("PTTStateChanged", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ h[] f22487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ kd.a f22488c;

        static {
            h[] hVarArrA = a();
            f22487b = hVarArrA;
            f22488c = kd.b.a(hVarArrA);
        }

        private h(String str, int i10) {
        }

        private static final /* synthetic */ h[] a() {
            return new h[]{f22486a};
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) f22487b.clone();
        }
    }

    public static final class i extends a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, String str2) {
            super(str, str2);
            rd.m.e(str, "name");
            rd.m.e(str2, "action");
        }

        @Override // n4.l.a
        public void i(Intent intent) {
            rd.m.e(intent, "intent");
            k(!g());
        }
    }

    static {
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        g[] gVarArr = {new g("Zello", "com.zello.ptt", null, str, 12, null), new g("Runbo PTT", "com.runbo.ptt.key", str, str2, 12, null), new g("Runbo POC", "com.runbo.poc.key", str2, str3, 12, null), new g("TDC", "com.android.action.tdcptt", str3, str4, 12, null), new g("AGOLD", "com.agold.hy.ptt", str4, str5, 12, null), new g("SDREAM", "com.sdream.ls.PTT", str5, str6, 12, null), new g("UNIPRO", "unipro.hotkey.ptt", str6, null, 12, null), new g("SONIM", "com.sonim.intent.action", "PTT_KEY_DOWN", "PTT_KEY_UP"), new g("SIDE KEY", "android.intent.action.side_key", "keydown.PTT", "keyup.PTT"), new g("android.intent.action", "android.intent.action", "PTT_KEYDOWN", "PTT_KEYUP"), new g("android.intent.action.PTT", 0 == true ? 1 : 0, str7, str8, 14, null), new g("com.android.intent.ptt", str7, str8, str9, 14, null), new g("PTT1", "com.ptt1.action.PTT", str9, str10, 12, null), new g("PTT2", "com.ptt2.action.PTT", str10, null, 12, null)};
        for (int i10 = 0; i10 < 14; i10++) {
            g gVar = gVarArr[i10];
            f22475f.put(gVar.l(), gVar);
            f22476g.put(gVar.m(), gVar);
            f22478i.add(gVar);
        }
        a[] aVarArr = {new b("FUN KEY", "android.intent.action.FUN_KEY", "keydown"), new b("OPEN_THIRDPARTY_PTT_APPLICATION", "com.android.action.OPEN_THIRDPARTY_PTT_APPLICATION", "fromPttDown"), new b("OPEN_THIRDPARTY_PTT_APPLICATION_P2", "com.android.action.OPEN_THIRDPARTY_PTT_APPLICATION_P2", "fromPttDown"), new b("OPEN_PTT_APPLICATION", "com.android.action.OPEN_PTT_APPLICATION", "fromPttDown"), new i("Zello Toggle", "com.zello.ptt.toggle"), new i("PTT LONGPRESS", "com.android.action.PTT_LONGPRESS"), new c(), new d(), new e()};
        for (int i11 = 0; i11 < 9; i11++) {
            a aVar = aVarArr[i11];
            f22477h.put(aVar.d(), aVar);
            f22478i.add(aVar);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        rd.m.e(context, "context");
        rd.m.e(intent, "intent");
        String action = intent.getAction();
        g gVar = (g) f22475f.get(action);
        if (gVar != null) {
            gVar.k(true);
            return;
        }
        g gVar2 = (g) f22476g.get(action);
        if (gVar2 != null) {
            gVar2.k(false);
            return;
        }
        a aVar = (a) f22477h.get(action);
        if (aVar != null) {
            aVar.i(intent);
        }
    }

    public static class a implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f22479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f22480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f22481c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f22482d;

        public a(String str, String str2) {
            rd.m.e(str, "name");
            rd.m.e(str2, "action");
            this.f22479a = str;
            this.f22480b = str2;
            this.f22481c = true;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            rd.m.e(aVar, "other");
            int iCompare = Boolean.compare(this.f22482d, aVar.f22482d);
            return iCompare != 0 ? -iCompare : h().compareTo(aVar.h());
        }

        public String d() {
            return this.f22480b;
        }

        public String[] e() {
            return new String[]{d()};
        }

        public final boolean f() {
            return this.f22481c;
        }

        public final boolean g() {
            return this.f22482d;
        }

        public final String h() {
            return this.f22479a.length() > 0 ? this.f22479a : d();
        }

        public void i(Intent intent) {
            rd.m.e(intent, "intent");
        }

        public final void j(boolean z10) {
            if (this.f22481c == z10) {
                return;
            }
            this.f22481c = z10;
            if (z10) {
                if (this.f22482d) {
                    l.f22470a.d(true);
                }
            } else if (this.f22482d) {
                l.f22470a.d(false);
            }
        }

        public final void k(boolean z10) {
            if (this.f22482d == z10) {
                return;
            }
            this.f22482d = z10;
            if (this.f22481c) {
                l.f22470a.d(z10);
            }
            mi.c.e().m(h.f22486a);
        }

        public /* synthetic */ a(String str, String str2, int i10, rd.h hVar) {
            this(str, (i10 & 2) != 0 ? "" : str2);
        }
    }
}
