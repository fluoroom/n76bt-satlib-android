package com.dw.ht.satellite;

import android.content.SharedPreferences;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.format.DateUtils;
import android.util.Log;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.Main;
import com.dw.ht.entitys.Satellite;
import com.dw.ht.entitys.SatelliteRadioConfiguration;
import com.dw.ht.j0;
import com.dw.ht.satellite.a;
import com.facebook.stetho.websocket.CloseCodes;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import d5.a;
import dd.d0;
import dd.s;
import ed.q;
import hd.e;
import io.grpc.stub.j;
import io.objectbox.query.QueryBuilder;
import j5.p;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import jd.l;
import nk.b;
import o5.g;
import rd.m;
import tg.a0;
import tg.e0;
import tg.f;
import tg.p0;
import v4.a0;
import v4.c0;
import v4.l1;
import v4.u;
import v4.v;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a */
    public static final b f6691a = new b();

    /* JADX INFO: renamed from: b */
    private static final HashMap f6692b;

    /* JADX INFO: renamed from: c */
    private static final HashMap f6693c;

    /* JADX INFO: renamed from: d */
    private static HashMap f6694d;

    /* JADX INFO: renamed from: e */
    private static boolean f6695e;

    /* JADX INFO: renamed from: f */
    private static final Handler f6696f;

    /* JADX INFO: renamed from: g */
    private static double f6697g;

    /* JADX INFO: renamed from: h */
    private static final Runnable f6698h;

    /* JADX INFO: renamed from: i */
    private static final Runnable f6699i;

    /* JADX INFO: renamed from: j */
    private static final Runnable f6700j;

    /* JADX INFO: renamed from: k */
    private static final boolean f6701k;

    /* JADX INFO: renamed from: l */
    private static int f6702l;

    /* JADX INFO: renamed from: m */
    private static int f6703m;

    public static final class a extends Enum {

        /* JADX INFO: renamed from: a */
        public static final a f6704a = new a("ShowTrackChanged", 0);

        /* JADX INFO: renamed from: b */
        public static final a f6705b = new a("StarredChanged", 1);

        /* JADX INFO: renamed from: c */
        public static final a f6706c = new a("ConnectedSatelliteChanged", 2);

        /* JADX INFO: renamed from: d */
        public static final a f6707d = new a("FollowingSatelliteChanged", 3);

        /* JADX INFO: renamed from: e */
        public static final a f6708e = new a("SatelliteListChanged", 4);

        /* JADX INFO: renamed from: f */
        private static final /* synthetic */ a[] f6709f;

        /* JADX INFO: renamed from: g */
        private static final /* synthetic */ kd.a f6710g;

        static {
            a[] aVarArrA = a();
            f6709f = aVarArrA;
            f6710g = kd.b.a(aVarArrA);
        }

        private a(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f6704a, f6705b, f6706c, f6707d, f6708e};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f6709f.clone();
        }
    }

    /* JADX INFO: renamed from: com.dw.ht.satellite.b$b */
    public static final class C0098b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return gd.a.d(((Satellite) obj).getName(), ((Satellite) obj2).getName());
        }
    }

    public static final class c implements j {
        c() {
        }

        @Override // io.grpc.stub.j
        /* JADX INFO: renamed from: a */
        public void onNext(b.d dVar) {
            Object obj;
            if (dVar == null) {
                b.f6695e = false;
                return;
            }
            HashMap map = new HashMap(b.f6694d);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<b.C0305b> listV = dVar.v();
            m.d(listV, "getGpList(...)");
            for (b.C0305b c0305b : listV) {
                Object obj2 = map.get(Integer.valueOf(c0305b.D()));
                if (obj2 != null) {
                    m.b(c0305b);
                    boolean zC = p.c((Satellite) obj2, c0305b);
                    obj = obj2;
                    if (zC) {
                        arrayList.add(obj2);
                        com.dw.ht.satellite.a aVar = (com.dw.ht.satellite.a) b.f6693c.get(Integer.valueOf(c0305b.D()));
                        obj = obj2;
                        if (aVar != null) {
                            aVar.q(null);
                            obj = obj2;
                        }
                    }
                } else {
                    m.b(c0305b);
                    Satellite satelliteB = p.b(c0305b);
                    arrayList.add(satelliteB);
                    map.put(Integer.valueOf(c0305b.D()), satelliteB);
                    String str = (String) b.f6692b.get(Integer.valueOf(satelliteB.getNoradCatID()));
                    obj = satelliteB;
                    if (str != null) {
                        satelliteB.y(str);
                        obj = satelliteB;
                    }
                }
                List<b.f> listH = c0305b.H();
                m.d(listH, "getRfList(...)");
                for (b.f fVar : listH) {
                    String name = fVar.getName();
                    m.d(name, "getName(...)");
                    int iD = c0305b.D();
                    int iG = fVar.G();
                    int iO = fVar.O();
                    int iL = fVar.L();
                    int iS = fVar.S();
                    a.d dVarD = a.d.d(fVar.H().ordinal());
                    m.d(dVarD, "valueOf(...)");
                    a.d dVarD2 = a.d.d(fVar.Q().ordinal());
                    m.d(dVarD2, "valueOf(...)");
                    SatelliteRadioConfiguration satelliteRadioConfiguration = new SatelliteRadioConfiguration(0L, name, iD, iG, iO, iL, iS, dVarD, dVarD2, fVar.getBandwidth(), false, WXMediaMessage.DESCRIPTION_LENGTH_LIMIT, null);
                    if (Satellite.N((Satellite) obj, satelliteRadioConfiguration, false, 2, null)) {
                        arrayList.add(obj);
                    }
                    arrayList2.add(satelliteRadioConfiguration);
                }
            }
            SharedPreferences sharedPreferencesK = Cfg.K();
            m.d(sharedPreferencesK, "getPref(...)");
            SharedPreferences.Editor editorEdit = sharedPreferencesK.edit();
            editorEdit.putLong("satellite_sync_at", dVar.w());
            editorEdit.apply();
            b bVar = b.f6691a;
            bVar.X(arrayList2);
            j0.f6341a.n().o(arrayList);
            b.f6694d = map;
            mi.c.e().m(a.f6708e);
            b.f6695e = false;
            b.Z(bVar, false, 1, null);
            Log.d("SatelliteManager", "loaded " + dVar.v().size() + " form server, all " + map.size() + " gp");
        }

        @Override // io.grpc.stub.j
        public void onCompleted() {
            b.f6695e = false;
        }

        @Override // io.grpc.stub.j
        public void onError(Throwable th2) {
            b.f6696f.removeCallbacks(b.f6698h);
            b.f6696f.postDelayed(b.f6698h, 30000L);
            if (th2 != null) {
                th2.printStackTrace();
            }
            b.f6695e = false;
        }
    }

    static final class d extends jd.m implements qd.p {

        /* JADX INFO: renamed from: e */
        Object f6711e;

        /* JADX INFO: renamed from: f */
        Object f6712f;

        /* JADX INFO: renamed from: g */
        int f6713g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ boolean f6714h;

        static final class a extends jd.m implements qd.p {

            /* JADX INFO: renamed from: e */
            int f6715e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ List f6716f;

            /* JADX INFO: renamed from: g */
            final /* synthetic */ Location f6717g;

            /* JADX INFO: renamed from: h */
            final /* synthetic */ boolean f6718h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list, Location location, boolean z10, e eVar) {
                super(2, eVar);
                this.f6716f = list;
                this.f6717g = location;
                this.f6718h = z10;
            }

            @Override // jd.a
            public final e g(Object obj, e eVar) {
                return new a(this.f6716f, this.f6717g, this.f6718h, eVar);
            }

            @Override // jd.a
            public final Object o(Object obj) {
                id.b.e();
                if (this.f6715e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                long jCurrentTimeMillis = System.currentTimeMillis() + ((long) 600000);
                List<Integer> list = this.f6716f;
                Location location = this.f6717g;
                boolean z10 = this.f6718h;
                long jMin = jCurrentTimeMillis;
                for (Integer num : list) {
                    m.b(num);
                    com.dw.ht.satellite.a aVarB = b.B(num.intValue());
                    if (aVarB != null) {
                        try {
                            a.b bVarR = aVarB.r(location, z10);
                            if (bVarR != null) {
                                jMin = Math.min(bVarR.b(), jMin);
                            }
                        } catch (Throwable th2) {
                            Log.e("SatelliteManager", "updateVisibility:" + aVarB, th2);
                        }
                    }
                }
                long jCurrentTimeMillis2 = jMin - System.currentTimeMillis();
                Log.d("SatelliteManager", "nextOrbitCalculationTime:" + ((Object) DateUtils.getRelativeDateTimeString(Main.f5555g, jMin, 1000L, 172800000L, 524289)));
                b.f6696f.removeCallbacks(b.f6699i);
                if (jCurrentTimeMillis2 < 0) {
                    jCurrentTimeMillis2 = 0;
                }
                b.f6696f.postDelayed(b.f6699i, jCurrentTimeMillis2);
                mi.c.e().m(a.f6708e);
                return d0.f10897a;
            }

            @Override // qd.p
            /* JADX INFO: renamed from: t */
            public final Object s(tg.d0 d0Var, e eVar) {
                return ((a) g(d0Var, eVar)).o(d0.f10897a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, e eVar) {
            super(2, eVar);
            this.f6714h = z10;
        }

        @Override // jd.a
        public final e g(Object obj, e eVar) {
            return new d(this.f6714h, eVar);
        }

        @Override // jd.a
        public final Object o(Object obj) {
            Object objE = id.b.e();
            int i10 = this.f6713g;
            if (i10 == 0) {
                s.b(obj);
                Location locationC = g.a.c(g.f23195s, null, 1, null);
                if (locationC == null) {
                    b.f6696f.removeCallbacks(b.f6699i);
                    b.f6696f.postDelayed(b.f6699i, 30000L);
                    return d0.f10897a;
                }
                Log.d("SatelliteManager", "updateVisibility");
                Set setKeySet = b.f6694d.keySet();
                m.d(setKeySet, "<get-keys>(...)");
                List listH0 = q.H0(setKeySet);
                a0 a0VarB = p0.b();
                a aVar = new a(listH0, locationC, this.f6714h, null);
                this.f6711e = l.a(locationC);
                this.f6712f = l.a(listH0);
                this.f6713g = 1;
                if (f.c(a0VarB, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: t */
        public final Object s(tg.d0 d0Var, e eVar) {
            return ((d) g(d0Var, eVar)).o(d0.f10897a);
        }
    }

    static {
        HashMap map = new HashMap();
        f6692b = map;
        f6693c = new HashMap();
        f6694d = new HashMap();
        f6696f = new Handler(Looper.getMainLooper());
        f6697g = 5.0d;
        f6698h = new Runnable() { // from class: j5.i
            @Override // java.lang.Runnable
            public final void run() {
                com.dw.ht.satellite.b.L();
            }
        };
        f6699i = new Runnable() { // from class: j5.j
            @Override // java.lang.Runnable
            public final void run() {
                com.dw.ht.satellite.b.a0();
            }
        };
        f6700j = new Runnable() { // from class: j5.k
            @Override // java.lang.Runnable
            public final void run() {
                com.dw.ht.satellite.b.V();
            }
        };
        boolean z10 = !Cfg.f5482d && Build.VERSION.SDK_INT >= 24;
        f6701k = z10;
        map.put(Integer.valueOf(j5.f.f18431b.d()), Main.f5555g.getString(R.string.tiangong));
        map.put(Integer.valueOf(j5.f.f18432c.d()), Main.f5555g.getString(R.string.iss));
        if (z10) {
            HashMap map2 = new HashMap();
            List<Satellite> listG = j0.f6341a.n().g();
            m.d(listG, "getAll(...)");
            for (Satellite satellite : listG) {
                map2.put(Integer.valueOf(satellite.getNoradCatID()), satellite);
            }
            f6694d = map2;
            f6697g = Cfg.O().getSatelliteMinElevationAngle();
            b bVar = f6691a;
            Z(bVar, false, 1, null);
            bVar.K();
        }
    }

    private b() {
    }

    public static final o4.d A(int i10) {
        o4.d dVarG;
        Satellite satellite = (Satellite) f6694d.get(Integer.valueOf(i10));
        return (satellite == null || (dVarG = satellite.g()) == null) ? new o4.d(0, 0, null, null, 0, 0, 0, 127, null) : dVarG;
    }

    public static final com.dw.ht.satellite.a B(int i10) {
        HashMap map = f6693c;
        com.dw.ht.satellite.a aVar = (com.dw.ht.satellite.a) map.get(Integer.valueOf(i10));
        if (aVar != null) {
            return aVar;
        }
        rj.e eVarH = H(i10);
        if (eVarH == null) {
            return null;
        }
        com.dw.ht.satellite.a aVar2 = new com.dw.ht.satellite.a(i10, eVarH, null, 4, null);
        map.put(Integer.valueOf(i10), aVar2);
        return aVar2;
    }

    public static final Satellite C(int i10) {
        Satellite satellite = (Satellite) f6694d.get(Integer.valueOf(i10));
        if (satellite != null) {
            return satellite;
        }
        return null;
    }

    public static final int[] E() {
        ArrayList arrayList = new ArrayList();
        Cfg.Settings settingsO = Cfg.O();
        Collection<Satellite> collectionValues = f6694d.values();
        m.d(collectionValues, "<get-values>(...)");
        for (Satellite satellite : collectionValues) {
            if (satellite.getStarred() || satellite.getShowTrack() || ((I(satellite.getNoradCatID()) && settingsO.isShowSpaceStation()) || ((!I(satellite.getNoradCatID()) && settingsO.isShowAmateurRadioSatellite()) || satellite.getNoradCatID() == f6703m || satellite.getNoradCatID() == f6702l))) {
                arrayList.add(Integer.valueOf(satellite.getNoradCatID()));
            }
        }
        return q.G0(arrayList);
    }

    public static final boolean F(int i10) {
        Satellite satellite = (Satellite) f6694d.get(Integer.valueOf(i10));
        if (satellite != null) {
            return satellite.getShowTrack();
        }
        return false;
    }

    public static final boolean G(int i10) {
        Satellite satellite = (Satellite) f6694d.get(Integer.valueOf(i10));
        if (satellite != null) {
            return satellite.getStarred();
        }
        return false;
    }

    public static final rj.e H(int i10) {
        Satellite satellite = (Satellite) f6694d.get(Integer.valueOf(i10));
        if (satellite == null || !j5.c.f18427a.g(satellite.getTleLine1(), satellite.getTleLine2())) {
            return null;
        }
        return new rj.e(satellite.getTleLine1(), satellite.getTleLine2());
    }

    public static final boolean I(int i10) {
        return i10 == j5.f.f18432c.d() || i10 == j5.f.f18431b.d();
    }

    private final void K() {
        Handler handler = f6696f;
        Runnable runnable = f6698h;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 3600000L);
        if (f6695e) {
            return;
        }
        f6695e = true;
        f5.d.f12792a.f().b(b.c.q().v(Cfg.K().getLong("satellite_sync_at", 0L)).build(), new c());
    }

    public static final void L() {
        f6691a.K();
    }

    private final HashMap M() {
        HashMap map = new HashMap();
        ArrayList arrayListB = d4.d.b();
        List<SatelliteRadioConfiguration> listG = j0.f6341a.o().g();
        m.d(listG, "getAll(...)");
        for (SatelliteRadioConfiguration satelliteRadioConfiguration : listG) {
            SatelliteRadioConfiguration satelliteRadioConfiguration2 = (SatelliteRadioConfiguration) map.remove(satelliteRadioConfiguration.f());
            if (satelliteRadioConfiguration2 != null) {
                arrayListB.add(satelliteRadioConfiguration2);
            }
            map.put(satelliteRadioConfiguration.f(), satelliteRadioConfiguration);
        }
        j0.f6341a.o().u(arrayListB);
        return map;
    }

    public static final ArrayList O(String str) {
        Satellite satellite;
        String name;
        com.dw.ht.satellite.a aVarB;
        m.e(str, "queryText");
        ArrayList arrayListB = d4.d.b();
        Collection<Satellite> collectionValues = f6694d.values();
        m.d(collectionValues, "<get-values>(...)");
        for (Satellite satellite2 : collectionValues) {
            if (rg.q.N(satellite2.getName(), str, true) && (aVarB = B(satellite2.getNoradCatID())) != null) {
                arrayListB.add(aVarB);
            }
        }
        for (Map.Entry entry : f6692b.entrySet()) {
            if (rg.q.N((CharSequence) entry.getValue(), str, true) && ((satellite = (Satellite) f6694d.get(entry.getKey())) == null || (name = satellite.getName()) == null || !rg.q.N(name, str, true))) {
                com.dw.ht.satellite.a aVarB2 = B(((Number) entry.getKey()).intValue());
                if (aVarB2 != null) {
                    arrayListB.add(aVarB2);
                }
            }
        }
        m.b(arrayListB);
        return arrayListB;
    }

    public static final void P(int i10) {
        if (f6702l == i10) {
            return;
        }
        f6702l = i10;
        f6691a.W();
        mi.c.e().m(a.f6706c);
    }

    public static final void Q(int i10) {
        if (f6703m == i10) {
            return;
        }
        f6703m = i10;
        mi.c.e().m(a.f6707d);
    }

    public static final void R(double d10) {
        if (d10 == f6697g) {
            return;
        }
        f6697g = d10;
        f6691a.Y(true);
    }

    public static final void S(int i10, o4.d dVar) {
        Satellite satellite = (Satellite) f6694d.get(Integer.valueOf(i10));
        if (satellite == null) {
            return;
        }
        if (dVar == null) {
            dVar = new o4.d(0, 0, null, null, 0, 0, 0, 127, null);
        }
        satellite.A(dVar);
        j0.f6341a.n().n(satellite);
        mi.c.e().m(a.f6705b);
    }

    public static final void T(int i10, boolean z10) {
        Satellite satellite = (Satellite) f6694d.get(Integer.valueOf(i10));
        if (satellite == null || satellite.getShowTrack() == z10) {
            return;
        }
        satellite.E(z10);
        j0.f6341a.n().n(satellite);
        mi.c.e().m(a.f6704a);
    }

    public static final void U(int i10, boolean z10) {
        Satellite satellite = (Satellite) f6694d.get(Integer.valueOf(i10));
        if (satellite == null || satellite.getStarred() == z10) {
            return;
        }
        satellite.F(z10);
        j0.f6341a.n().n(satellite);
        mi.c.e().m(a.f6705b);
    }

    public static final void V() {
        f6691a.W();
    }

    public final void X(ArrayList arrayList) {
        HashMap mapM = M();
        ArrayList arrayListB = d4.d.b();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SatelliteRadioConfiguration satelliteRadioConfiguration = (SatelliteRadioConfiguration) it.next();
            SatelliteRadioConfiguration satelliteRadioConfiguration2 = (SatelliteRadioConfiguration) mapM.get(satelliteRadioConfiguration.f());
            if (satelliteRadioConfiguration2 != null) {
                satelliteRadioConfiguration.o(satelliteRadioConfiguration2.getId());
                if (!m.a(satelliteRadioConfiguration2, satelliteRadioConfiguration)) {
                    arrayListB.add(satelliteRadioConfiguration);
                }
            } else {
                arrayListB.add(satelliteRadioConfiguration);
            }
        }
        j0.f6341a.o().o(arrayListB);
    }

    private final void Y(boolean z10) {
        tg.g.b(e0.a(p0.c()), null, null, new d(z10, null), 3, null);
    }

    static /* synthetic */ void Z(b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        bVar.Y(z10);
    }

    public static final void a0() {
        Z(f6691a, false, 1, null);
    }

    public static final Comparable h(Satellite satellite) {
        m.e(satellite, "it");
        return Integer.valueOf(satellite.getStarred() ? 0 : 1);
    }

    public static final Comparable i(Satellite satellite) {
        a.b bVarO;
        Long lC;
        m.e(satellite, "it");
        com.dw.ht.satellite.a aVarB = B(satellite.getNoradCatID());
        if (aVarB == null || (bVarO = aVarB.o()) == null || (lC = bVarO.c()) == null) {
            return Long.MAX_VALUE;
        }
        return lC;
    }

    public static final Comparable j(Satellite satellite) {
        a.b bVarO;
        m.e(satellite, "it");
        com.dw.ht.satellite.a aVarB = B(satellite.getNoradCatID());
        return Long.valueOf((aVarB == null || (bVarO = aVarB.o()) == null) ? Long.MAX_VALUE : bVarO.a());
    }

    public static final Comparable k(Collator collator, Satellite satellite) {
        m.e(satellite, "it");
        return collator.getCollationKey(satellite.getName());
    }

    public static final void v(int i10) {
        Satellite satellite = (Satellite) f6694d.get(Integer.valueOf(i10));
        if (satellite == null || satellite.getStarred()) {
            return;
        }
        Cfg.Settings settingsO = Cfg.O();
        if (I(satellite.getNoradCatID())) {
            if (settingsO.isShowSpaceStation()) {
                return;
            }
        } else if (settingsO.isShowAmateurRadioSatellite()) {
            return;
        }
        U(i10, true);
    }

    public static final int x() {
        return f6702l;
    }

    public static final double y() {
        return f6697g;
    }

    public static final String z(int i10) {
        String name;
        Satellite satellite = (Satellite) f6694d.get(Integer.valueOf(i10));
        if (satellite != null && (name = satellite.getName()) != null) {
            return name;
        }
        String str = (String) f6692b.get(Integer.valueOf(i10));
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('S');
        sb2.append(i10);
        return sb2.toString();
    }

    public final List D() {
        final Collator collator = Collator.getInstance(Locale.getDefault());
        Collection collectionValues = f6694d.values();
        m.d(collectionValues, "<get-values>(...)");
        return q.B0(q.H0(collectionValues), gd.a.b(new qd.l() { // from class: j5.l
            @Override // qd.l
            public final Object l(Object obj) {
                return com.dw.ht.satellite.b.h((Satellite) obj);
            }
        }, new qd.l() { // from class: j5.m
            @Override // qd.l
            public final Object l(Object obj) {
                return com.dw.ht.satellite.b.i((Satellite) obj);
            }
        }, new qd.l() { // from class: j5.n
            @Override // qd.l
            public final Object l(Object obj) {
                return com.dw.ht.satellite.b.j((Satellite) obj);
            }
        }, new qd.l() { // from class: j5.o
            @Override // qd.l
            public final Object l(Object obj) {
                return com.dw.ht.satellite.b.k(collator, (Satellite) obj);
            }
        }));
    }

    public final boolean J() {
        return f6701k;
    }

    public final void N(Satellite satellite) {
        m.e(satellite, "entity");
        Satellite satellite2 = (Satellite) f6694d.get(Integer.valueOf(satellite.getNoradCatID()));
        if (satellite2 != null) {
            satellite.x(satellite2.getId());
        }
        j0.f6341a.n().n(satellite);
        f6694d.put(Integer.valueOf(satellite.getNoradCatID()), satellite);
        f6693c.remove(Integer.valueOf(satellite.getNoradCatID()));
        Z(this, false, 1, null);
        mi.c.e().m(a.f6708e);
    }

    public final void W() {
        double d10;
        double dH;
        a.C0097a c0097aH;
        Satellite satellite = (Satellite) f6694d.get(Integer.valueOf(f6702l));
        o4.d dVarG = satellite != null ? satellite.g() : null;
        l1 l1VarR = u.w().r();
        c0 c0Var = l1VarR instanceof c0 ? (c0) l1VarR : null;
        if (c0Var == null) {
            return;
        }
        if (dVarG != null) {
            Handler handler = f6696f;
            Runnable runnable = f6700j;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 500L);
        }
        w4.d dVar = new w4.d();
        y4.a aVar = new y4.a();
        if (dVarG == null || dVarG.j()) {
            c0Var.b(v.FREQ_MODE_SET_PAR, aVar);
            return;
        }
        aVar.l(dVarG.d());
        aVar.o(dVarG.h());
        aVar.q(dVarG.f());
        aVar.n(dVarG.b());
        aVar.m(dVarG.e());
        aVar.p(dVarG.i());
        aVar.j(y4.c.f32402e);
        if (aVar.f() == 0) {
            aVar.n(aVar.h());
            aVar.l(aVar.g());
        }
        if (aVar.h() == 0) {
            aVar.q(aVar.f());
            aVar.o(aVar.d());
        }
        if (c0Var.Q.t(a0.d.SatelliteMode)) {
            aVar.j(y4.c.f32409u);
        } else {
            aVar.r(true);
        }
        aVar.i(dVarG.a());
        if (c0Var.X().b() == y4.c.f32399b) {
            aVar.k(y4.d.f32415d);
        }
        com.dw.ht.satellite.a aVarB = B(f6702l);
        if (aVarB != null) {
            Location locationB = g.f23195s.b(null);
            if (locationB == null || (c0097aH = aVarB.h(System.currentTimeMillis() + (500 / ((long) 2)))) == null) {
                d10 = 0.0d;
                dH = 0.0d;
            } else {
                dH = c0097aH.h(locationB) / 2.99792458E8d;
                xi.f fVarJ = c0097aH.j(locationB);
                dVar.f(td.a.a(j5.d.b(j5.d.d(fVarJ))));
                dVar.d(td.a.a(j5.d.b(j5.d.a(fVarJ))));
                double dC = j5.d.c(fVarJ);
                d10 = 0.0d;
                double d11 = CloseCodes.NORMAL_CLOSURE;
                dVar.e(td.a.a(dC / d11));
                dVar.c(td.a.a(c0097aH.a() / d11));
            }
            a.b bVarO = aVarB.o();
            dVar.h(bVarO != null ? bVarO.c() : null);
            dVar.g(aVarB.k());
        } else {
            d10 = 0.0d;
            dH = 0.0d;
        }
        if (dH != d10) {
            aVar.q(aVar.h() + ((int) (((double) aVar.h()) * dH)));
            aVar.n(aVar.f() + ((int) (((double) aVar.f()) * (-dH))));
        }
        if (c0Var.Q.t(a0.d.SatelliteInfo)) {
            c0Var.b(v.SET_SATELLITE_INFO, dVar);
        }
        if (c0Var.Y().f29914c || c0Var.Y().f29915d || c0Var.Y().f29913b) {
            y4.b bVarX = c0Var.X();
            m.d(bVarX, "getFreqModeStatus(...)");
            if (bVarX.b() == aVar.c() && bVarX.d() == aVar.e() && bVarX.c() == aVar.d() && Math.abs(bVarX.e() - aVar.f()) < 1000) {
                return;
            }
        }
        c0Var.b(v.FREQ_MODE_SET_PAR, aVar);
    }

    public final void u(Satellite satellite) {
        m.e(satellite, "entity");
        Satellite satellite2 = (Satellite) f6694d.remove(Integer.valueOf(satellite.getNoradCatID()));
        if (satellite2 != null) {
            j0 j0Var = j0.f6341a;
            QueryBuilder queryBuilderQ = j0Var.o().q();
            m.d(queryBuilderQ, "query(...)");
            io.objectbox.e eVar = com.dw.ht.entitys.g.f5800g;
            m.d(eVar, "noradCatID");
            QueryBuilder queryBuilderE = queryBuilderQ.e(eVar, satellite2.getNoradCatID());
            m.d(queryBuilderE, "equal(property, value.toLong())");
            queryBuilderE.a().S();
            j0Var.n().v(satellite2.getId());
            mi.c.e().m(a.f6708e);
        }
    }

    public final List w(String str) {
        m.e(str, "text");
        if (rg.q.e0(str)) {
            return D();
        }
        ArrayList arrayListB = d4.d.b();
        Collection<Satellite> collectionValues = f6694d.values();
        m.d(collectionValues, "<get-values>(...)");
        for (Satellite satellite : collectionValues) {
            if (rg.q.N(satellite.getName(), str, true) || rg.q.N(satellite.getTleLine1(), str, true) || rg.q.N(satellite.getTleLine2(), str, true)) {
                arrayListB.add(satellite);
            }
        }
        m.b(arrayListB);
        return q.B0(arrayListB, new C0098b());
    }
}
