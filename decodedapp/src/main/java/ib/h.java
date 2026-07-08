package ib;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import kb.j;
import kb.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static h f16005h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected HandlerThread f16009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Handler f16010e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Random f16006a = new SecureRandom();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected List f16008c = DesugarCollections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected List f16007b = DesugarCollections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Executor f16011f = j.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected Executor f16012g = j.b();

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1000) {
                h.this.g();
            } else if (i10 == 1001) {
                h.this.i();
            }
            super.handleMessage(message);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f16014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f16015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f16016c;

        b(h hVar, Bundle bundle, boolean z10) {
            this.f16014a = bundle;
            this.f16015b = z10;
            this.f16016c = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("uin", "1000");
                bundle.putString("platform", "1");
                bundle.putString("os_ver", Build.VERSION.RELEASE);
                bundle.putString("position", "");
                bundle.putString("network", ib.a.a(kb.f.a()));
                bundle.putString("language", d.a());
                bundle.putString("resolution", d.b(kb.f.a()));
                bundle.putString("apn", ib.a.b(kb.f.a()));
                bundle.putString("mn", kb.e.a().e());
                bundle.putString("timezone", TimeZone.getDefault().getID());
                bundle.putString("sdk_ver", "3.5.17.lite");
                bundle.putString("qz_ver", k.o(kb.f.a(), "com.qzone"));
                bundle.putString("qq_ver", k.n(kb.f.a(), "com.tencent.mobileqq"));
                bundle.putString("qua", k.q(kb.f.a(), kb.f.d()));
                bundle.putString("packagename", kb.f.d());
                bundle.putString("app_ver", k.o(kb.f.a(), kb.f.d()));
                Bundle bundle2 = this.f16014a;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                this.f16016c.f16008c.add(new ib.c(bundle));
                int size = this.f16016c.f16008c.size();
                int iA = kb.h.c(kb.f.a(), null).a("Agent_ReportTimeInterval");
                if (iA == 0) {
                    iA = 10000;
                }
                if (!this.f16016c.e("report_via", size) && !this.f16015b) {
                    if (this.f16016c.f16010e.hasMessages(1001)) {
                        return;
                    }
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1001;
                    this.f16016c.f16010e.sendMessageDelayed(messageObtain, iA);
                    return;
                }
                this.f16016c.i();
                this.f16016c.f16010e.removeMessages(1001);
            } catch (Exception e10) {
                jb.a.g("openSDK_LOG.ReportManager", "--> reporVia, exception in sub thread.", e10);
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
        
            r21 = r5;
            r27 = r8;
            r25 = r9;
            r23 = r14;
            r7 = true;
         */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00d6 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:79:? A[LOOP:0: B:8:0x002c->B:79:?, LOOP_END, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instruction units count: 295
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ib.h.c.run():void");
        }
    }

    private h() {
        this.f16009d = null;
        if (this.f16009d == null) {
            HandlerThread handlerThread = new HandlerThread("opensdk.report.handlerthread", 10);
            this.f16009d = handlerThread;
            handlerThread.start();
        }
        if (!this.f16009d.isAlive() || this.f16009d.getLooper() == null) {
            return;
        }
        this.f16010e = new a(this.f16009d.getLooper());
    }

    public static synchronized h b() {
        try {
            if (f16005h == null) {
                f16005h = new h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f16005h;
    }

    protected int a(int i10) {
        if (i10 == 0) {
            int iA = kb.h.c(kb.f.a(), null).a("Common_CGIReportFrequencySuccess");
            if (iA == 0) {
                return 10;
            }
            return iA;
        }
        int iA2 = kb.h.c(kb.f.a(), null).a("Common_CGIReportFrequencyFailed");
        if (iA2 == 0) {
            return 100;
        }
        return iA2;
    }

    public void c(Bundle bundle, String str, boolean z10) {
        if (bundle == null) {
            return;
        }
        jb.a.j("openSDK_LOG.ReportManager", "-->reportVia, bundle: " + bundle.toString());
        if (f("report_via", str) || z10) {
            this.f16011f.execute(new b(this, bundle, z10));
        }
    }

    public void d(String str, long j10, long j11, long j12, int i10, String str2, boolean z10) {
        jb.a.j("openSDK_LOG.ReportManager", "-->reportCgi, command: " + str + " | startTime: " + j10 + " | reqSize:" + j11 + " | rspSize: " + j12 + " | responseCode: " + i10 + " | detail: " + str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c A[PHI: r0
      0x001c: PHI (r0v9 int) = (r0v6 int), (r0v12 int) binds: [B:11:0x0034, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean e(java.lang.String r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = "report_cgi"
            boolean r0 = r5.equals(r0)
            r1 = 5
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L1e
            android.content.Context r0 = kb.f.a()
            kb.h r0 = kb.h.c(r0, r2)
            java.lang.String r2 = "Common_CGIReportMaxcount"
            int r0 = r0.a(r2)
            if (r0 != 0) goto L1c
            goto L38
        L1c:
            r1 = r0
            goto L38
        L1e:
            java.lang.String r0 = "report_via"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L37
            android.content.Context r0 = kb.f.a()
            kb.h r0 = kb.h.c(r0, r2)
            java.lang.String r2 = "Agent_ReportBatchCount"
            int r0 = r0.a(r2)
            if (r0 != 0) goto L1c
            goto L38
        L37:
            r1 = 0
        L38:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "-->availableCount, report: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = " | dataSize: "
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = " | maxcount: "
            r0.append(r5)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "openSDK_LOG.ReportManager"
            jb.a.j(r0, r5)
            if (r6 < r1) goto L62
            r5 = 1
            return r5
        L62:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ib.h.e(java.lang.String, int):boolean");
    }

    protected boolean f(String str, String str2) {
        int iA;
        jb.a.j("openSDK_LOG.ReportManager", "-->availableFrequency, report: " + str + " | ext: " + str2);
        boolean z10 = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i10 = 100;
        if (!str.equals("report_cgi")) {
            if (str.equals("report_via")) {
                iA = f.b(str2);
                if (this.f16006a.nextInt(100) < iA) {
                    i10 = iA;
                    z10 = true;
                }
            }
            jb.a.j("openSDK_LOG.ReportManager", "-->availableFrequency, result: " + z10 + " | frequency: " + i10);
            return z10;
        }
        try {
            iA = a(Integer.parseInt(str2));
            if (this.f16006a.nextInt(100) < iA) {
                z10 = true;
            }
        } catch (Exception unused) {
            return false;
        }
        i10 = iA;
        jb.a.j("openSDK_LOG.ReportManager", "-->availableFrequency, result: " + z10 + " | frequency: " + i10);
        return z10;
    }

    protected Map h() {
        List listD = g.d("report_via");
        if (listD != null) {
            this.f16008c.addAll(listD);
        }
        jb.a.j("openSDK_LOG.ReportManager", "-->prepareViaData, mViaList size: " + this.f16008c.size());
        if (this.f16008c.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Serializable serializable : this.f16008c) {
            JSONObject jSONObject = new JSONObject();
            ib.c cVar = (ib.c) serializable;
            for (String str : cVar.f16002a.keySet()) {
                try {
                    String str2 = (String) cVar.f16002a.get(str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject.put(str, str2);
                } catch (JSONException e10) {
                    jb.a.g("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e10);
                }
            }
            jSONArray.put(jSONObject);
        }
        jb.a.j("openSDK_LOG.ReportManager", "-->prepareViaData, JSONArray array: " + jSONArray.toString());
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("data", jSONArray);
            HashMap map = new HashMap();
            map.put("data", jSONObject2.toString());
            return map;
        } catch (JSONException e11) {
            jb.a.g("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e11);
            return null;
        }
    }

    protected void i() {
        if (k.m(kb.f.a())) {
            this.f16011f.execute(new c());
        }
    }

    protected void g() {
    }
}
