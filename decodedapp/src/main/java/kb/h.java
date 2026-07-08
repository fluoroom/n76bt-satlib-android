package kb;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.facebook.stetho.common.Utf8Charset;
import j$.util.DesugarCollections;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Map f19599g = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f19600h = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f19601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f19602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f19603c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f19604d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19605e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19606f = true;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f19607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f19608b;

        a(h hVar, Map map) {
            this.f19607a = map;
            this.f19608b = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                hb.g gVarC = hb.f.a().c("https://cgi.connect.qq.com/qqconnectopen/openapi/policy_conf", this.f19607a);
                String strA = gVarC.a();
                jb.a.i("openSDK_LOG.OpenConfig", "update: get config statusCode " + gVarC.d());
                this.f19608b.g(k.p(strA));
            } catch (Exception e10) {
                jb.a.g("openSDK_LOG.OpenConfig", "get config error ", e10);
            }
            this.f19608b.f19605e = 0;
        }
    }

    private h(Context context, String str) {
        this.f19601a = null;
        this.f19602b = null;
        this.f19601a = context.getApplicationContext();
        this.f19602b = str;
        d();
        h();
    }

    public static h c(Context context, String str) {
        h hVar;
        synchronized (f19599g) {
            try {
                jb.a.j("openSDK_LOG.OpenConfig", "getInstance begin");
                if (str != null) {
                    f19600h = str;
                }
                if (str == null && (str = f19600h) == null) {
                    str = "0";
                }
                hVar = (h) f19599g.get(str);
                if (hVar == null) {
                    hVar = new h(context, str);
                    f19599g.put(str, hVar);
                }
                jb.a.j("openSDK_LOG.OpenConfig", "getInstance end");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    private void d() {
        try {
            this.f19603c = new JSONObject(j("com.tencent.open.config.json"));
        } catch (JSONException unused) {
            this.f19603c = new JSONObject();
        }
    }

    private void e(String str, String str2) {
        try {
            if (this.f19602b != null) {
                str = str + "." + this.f19602b;
            }
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f19601a.openFileOutput(str, 0), Charset.forName(Utf8Charset.NAME));
            outputStreamWriter.write(str2);
            outputStreamWriter.flush();
            outputStreamWriter.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(JSONObject jSONObject) {
        l("cgi back, do update");
        this.f19603c = jSONObject;
        e("com.tencent.open.config.json", jSONObject.toString());
        this.f19604d = SystemClock.elapsedRealtime();
    }

    private void h() {
        if (this.f19605e != 0) {
            l("update thread is running, return");
            return;
        }
        this.f19605e = 1;
        HashMap map = new HashMap();
        map.put("appid", this.f19602b);
        map.put("status_os", Build.VERSION.RELEASE);
        map.put("status_machine", e.a().e());
        map.put("status_version", Build.VERSION.SDK);
        map.put("sdkv", "3.5.17.lite");
        map.put("sdkp", "a");
        j.a(new a(this, map));
    }

    private String j(String str) {
        InputStream inputStreamOpen;
        String str2;
        String string = "";
        try {
            try {
                if (this.f19602b != null) {
                    str2 = str + "." + this.f19602b;
                } else {
                    str2 = str;
                }
                inputStreamOpen = this.f19601a.openFileInput(str2);
            } catch (FileNotFoundException unused) {
                inputStreamOpen = this.f19601a.getAssets().open(str);
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charset.forName(Utf8Charset.NAME)));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                try {
                    try {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            stringBuffer.append(line);
                        } catch (Throwable th2) {
                            try {
                                inputStreamOpen.close();
                                bufferedReader.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                            throw th2;
                        }
                    } catch (IOException e11) {
                        e11.printStackTrace();
                        inputStreamOpen.close();
                    }
                    bufferedReader.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
                return string;
            }
            string = stringBuffer.toString();
            inputStreamOpen.close();
            bufferedReader.close();
            return string;
        } catch (IOException e13) {
            e13.printStackTrace();
            return "";
        }
    }

    private void k() {
        int iOptInt = this.f19603c.optInt("Common_frequency");
        if (iOptInt == 0) {
            iOptInt = 1;
        }
        if (SystemClock.elapsedRealtime() - this.f19604d >= iOptInt * 3600000) {
            h();
        }
    }

    private void l(String str) {
        if (this.f19606f) {
            jb.a.j("openSDK_LOG.OpenConfig", str + "; appid: " + this.f19602b);
        }
    }

    public int a(String str) {
        l("get " + str);
        k();
        return this.f19603c.optInt(str);
    }

    public boolean i(String str) {
        l("get " + str);
        k();
        Object objOpt = this.f19603c.opt(str);
        if (objOpt == null) {
            return false;
        }
        if (objOpt instanceof Integer) {
            return !objOpt.equals(0);
        }
        if (objOpt instanceof Boolean) {
            return ((Boolean) objOpt).booleanValue();
        }
        return false;
    }
}
