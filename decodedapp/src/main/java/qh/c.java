package qh;

import android.util.Log;
import ed.k0;
import eh.d0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import rd.m;
import rg.q;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f25224a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final CopyOnWriteArraySet f25225b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f25226c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = d0.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(d0.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(mh.f.class.getName(), "okhttp.Http2");
        linkedHashMap.put(ih.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f25226c = k0.t(linkedHashMap);
    }

    private c() {
    }

    private final void c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f25225b.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(d.f25227a);
        }
    }

    private final String d(String str) {
        String str2 = (String) f25226c.get(str);
        return str2 == null ? q.a1(str, 23) : str2;
    }

    public final void a(String str, int i10, String str2, Throwable th2) {
        int iMin;
        m.e(str, "loggerName");
        m.e(str2, "message");
        String strD = d(str);
        if (Log.isLoggable(strD, i10)) {
            if (th2 != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th2);
            }
            String str3 = str2;
            int length = str3.length();
            int i11 = 0;
            while (i11 < length) {
                int iB0 = q.b0(str3, '\n', i11, false, 4, null);
                if (iB0 == -1) {
                    iB0 = length;
                }
                while (true) {
                    iMin = Math.min(iB0, i11 + 4000);
                    String strSubstring = str3.substring(i11, iMin);
                    m.d(strSubstring, "substring(...)");
                    Log.println(i10, strD, strSubstring);
                    if (iMin >= iB0) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }

    public final void b() {
        try {
            for (Map.Entry entry : f25226c.entrySet()) {
                c((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e10) {
            System.err.println("Possibly running android unit test without robolectric");
            e10.printStackTrace();
        } catch (UnsatisfiedLinkError e11) {
            System.err.println("Possibly running android unit test without robolectric");
            e11.printStackTrace();
        }
    }
}
