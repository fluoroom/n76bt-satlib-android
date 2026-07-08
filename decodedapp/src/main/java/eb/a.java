package eb;

import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public class a extends gb.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f11725c = "libwbsafeedit";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f11726d;

    static {
        f11726d = f11725c + ".so";
        String str = Build.CPU_ABI;
        if (str == null || str.equals("")) {
            f11725c = "libwbsafeedit";
            f11726d = f11725c + ".so";
            jb.a.i("openSDK_LOG.AuthAgent", "is arm(default) architecture");
            return;
        }
        if (str.equalsIgnoreCase("arm64-v8a")) {
            f11725c = "libwbsafeedit_64";
            f11726d = f11725c + ".so";
            jb.a.i("openSDK_LOG.AuthAgent", "is arm64-v8a architecture");
            return;
        }
        if (str.equalsIgnoreCase("x86")) {
            f11725c = "libwbsafeedit_x86";
            f11726d = f11725c + ".so";
            jb.a.i("openSDK_LOG.AuthAgent", "is x86 architecture");
            return;
        }
        if (str.equalsIgnoreCase("x86_64")) {
            f11725c = "libwbsafeedit_x86_64";
            f11726d = f11725c + ".so";
            jb.a.i("openSDK_LOG.AuthAgent", "is x86_64 architecture");
            return;
        }
        f11725c = "libwbsafeedit";
        f11726d = f11725c + ".so";
        jb.a.i("openSDK_LOG.AuthAgent", "is arm(default) architecture");
    }

    public a(b bVar) {
        super(bVar);
    }
}
