package ib;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kb.i;
import kb.j;
import kb.k;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: l */
    private static b f15988l;

    /* JADX INFO: renamed from: a */
    private String f15989a = "";

    /* JADX INFO: renamed from: b */
    private String f15990b = "";

    /* JADX INFO: renamed from: c */
    private String f15991c = "";

    /* JADX INFO: renamed from: d */
    private String f15992d = "";

    /* JADX INFO: renamed from: e */
    private String f15993e = "";

    /* JADX INFO: renamed from: f */
    private String f15994f = "";

    /* JADX INFO: renamed from: g */
    private String f15995g = "";

    /* JADX INFO: renamed from: h */
    private List f15996h = DesugarCollections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: i */
    private List f15997i = DesugarCollections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: j */
    private Executor f15998j = j.b();

    /* JADX INFO: renamed from: k */
    private boolean f15999k;

    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ c f16000a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ b f16001b;

        a(b bVar, c cVar) {
            this.f16000a = cVar;
            this.f16001b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16001b.f15996h.add(this.f16000a);
            if (k.m(kb.f.a())) {
                try {
                    this.f16001b.o();
                    return;
                } catch (Exception e10) {
                    jb.a.g("AttaReporter", "Exception", e10);
                    return;
                }
            }
            jb.a.j("AttaReporter", "attaReport net disconnect, " + this.f16000a);
        }
    }

    private b() {
    }

    public static synchronized b a() {
        try {
            if (f15988l == null) {
                f15988l = new b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f15988l;
    }

    private void c(c cVar) {
        this.f15998j.execute(new a(this, cVar));
    }

    private c j(String str, String str2, Object obj, Map map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map2 = new HashMap();
        map2.put("attaid", "09400051119");
        map2.put("token", "9389887874");
        map2.put("time_appid_openid", jCurrentTimeMillis + "_" + this.f15989a + "_" + this.f15991c);
        map2.put("time", String.valueOf(jCurrentTimeMillis));
        map2.put("openid", this.f15991c);
        map2.put("appid", this.f15989a);
        map2.put("app_name", this.f15990b);
        map2.put("app_ver", this.f15992d);
        map2.put("pkg_name", this.f15993e);
        map2.put("os", "AND");
        map2.put("os_ver", Build.VERSION.RELEASE);
        map2.put("sdk_ver", "3.5.17.lite");
        map2.put("mn", kb.e.a().e());
        map2.put("interface_name", str);
        map2.put("interface_data", str2);
        map2.put("interface_result", obj == null ? "" : obj.toString());
        map2.put("qq_install", this.f15994f);
        map2.put("qq_ver", this.f15995g);
        if (map != null && !map.isEmpty()) {
            Object obj2 = map.get("reserve1");
            map2.put("reserve1", obj2 == null ? "" : obj2.toString());
            Object obj3 = map.get("reserve2");
            map2.put("reserve2", obj3 == null ? "" : obj3.toString());
            Object obj4 = map.get("reserve3");
            map2.put("reserve3", obj4 == null ? "" : obj4.toString());
            Object obj5 = map.get("reserve4");
            map2.put("reserve4", obj5 != null ? obj5.toString() : "");
        }
        return new c(map2);
    }

    public static String k() {
        return a().f15989a;
    }

    private boolean m(c cVar) {
        int i10 = 0;
        do {
            i10++;
            try {
                jb.a.j("AttaReporter", "doAttaReportItem post " + cVar);
                return hb.f.a().f("https://h.trace.qq.com/kv", cVar.f16002a).d() == 200;
            } catch (Exception e10) {
                jb.a.k("AttaReporter", "Exception", e10);
            }
        } while (i10 < 2);
        return false;
    }

    private void n() {
        while (!this.f15997i.isEmpty()) {
            c cVar = (c) this.f15997i.remove(0);
            cVar.f16002a.put("appid", this.f15989a);
            cVar.f16002a.put("app_name", this.f15990b);
            cVar.f16002a.put("app_ver", this.f15992d);
            cVar.f16002a.put("pkg_name", this.f15993e);
            cVar.f16002a.put("qq_install", this.f15994f);
            cVar.f16002a.put("qq_ver", this.f15995g);
            cVar.f16002a.put("openid", this.f15991c);
            cVar.f16002a.put("time_appid_openid", ((String) cVar.f16002a.get("time")) + "_" + this.f15989a + "_" + this.f15991c);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("fixDirtyData--------------------------");
            sb2.append(cVar);
            jb.a.j("AttaReporter", sb2.toString());
            this.f15996h.add(cVar);
        }
    }

    public void o() {
        jb.a.j("AttaReporter", "attaReportAtSubThread");
        if (!this.f15999k) {
            List listD = g.d("report_atta");
            this.f15999k = listD.isEmpty();
            this.f15996h.addAll(listD);
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                jb.a.j("AttaReporter", "attaReportAtSubThread from db = " + ((Serializable) it.next()));
            }
        }
        ArrayList arrayList = new ArrayList();
        while (!this.f15996h.isEmpty()) {
            c cVar = (c) this.f15996h.remove(0);
            if (!m(cVar)) {
                arrayList.add(cVar);
            }
        }
        if (arrayList.isEmpty()) {
            if (this.f15999k) {
                return;
            }
            jb.a.j("AttaReporter", "attaReportAtSubThread clear db");
            g.b("report_atta");
            this.f15999k = true;
            return;
        }
        jb.a.j("AttaReporter", "attaReportAtSubThread fail size=" + arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            jb.a.j("AttaReporter", "attaReportAtSubThread fail cache to db, " + ((c) ((Serializable) it2.next())));
        }
        g.c("report_atta", arrayList);
        this.f15999k = false;
    }

    public void d(String str) {
        jb.a.j("AttaReporter", "updateOpenId");
        if (str == null) {
            str = "";
        }
        this.f15991c = str;
    }

    public void e(String str, Context context) {
        jb.a.j("AttaReporter", "init");
        this.f15989a = str;
        this.f15990b = i.c(context);
        this.f15992d = k.o(context, kb.f.d());
        this.f15993e = kb.f.d();
        this.f15994f = i.e(context) ? "1" : "0";
        this.f15995g = k.n(context, "com.tencent.mobileqq");
        n();
        g.a();
    }

    public void f(String str, Object obj) {
        h(str, "", obj, null);
    }

    public void g(String str, String str2) {
        i(str, str2, null);
    }

    public void h(String str, String str2, Object obj, Map map) {
        c cVarJ = j(str, str2, obj, map);
        if (!TextUtils.isEmpty(this.f15989a) && !TextUtils.isEmpty(this.f15990b) && kb.f.a() != null) {
            c(cVarJ);
            return;
        }
        jb.a.j("AttaReporter", "attaReport cancel appid=" + this.f15989a + ", mAppName=" + this.f15990b + ", context=" + kb.f.a() + ", " + cVarJ);
        this.f15997i.add(cVarJ);
    }

    public void i(String str, String str2, Map map) {
        h(str, str2, "", map);
    }
}
