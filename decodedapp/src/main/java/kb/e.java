package kb;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f19594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f19595b;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static e f19596a = new e();
    }

    public static e a() {
        return b.f19596a;
    }

    public void b(Context context) {
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("device_info_file", 4);
        String str = this.f19595b;
        if (str == null || str.trim().isEmpty()) {
            this.f19595b = sharedPreferences.getString("build_model", "");
            jb.a.i("openSDK_LOG.DeviceInfoUtils", "init, model = " + this.f19595b);
        }
        String str2 = this.f19594a;
        if (str2 == null || str2.trim().isEmpty()) {
            this.f19594a = sharedPreferences.getString("build_device", "");
            jb.a.i("openSDK_LOG.DeviceInfoUtils", "init, device = " + this.f19594a);
        }
    }

    public String c() {
        return this.f19595b;
    }

    public String d(Context context) {
        return this.f19594a;
    }

    public String e() {
        return k.v(c());
    }

    private e() {
        this.f19594a = "";
        this.f19595b = "";
    }
}
