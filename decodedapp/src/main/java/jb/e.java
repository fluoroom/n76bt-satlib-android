package jb;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f18609a = 60;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f18610b = 60;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f18611c = "OpenSDK.Client.File.Tracer";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f18612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f18613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static long f18614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f18615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f18616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f18617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f18618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f18619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f18620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f18621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static long f18622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static String f18623o;

    static {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tencent");
        String str = File.separator;
        sb2.append(str);
        sb2.append("msflogs");
        sb2.append(str);
        sb2.append("com");
        sb2.append(str);
        sb2.append("tencent");
        sb2.append(str);
        sb2.append("mobileqq");
        sb2.append(str);
        f18612d = sb2.toString();
        f18613e = ".log";
        f18614f = 8388608L;
        f18615g = 262144;
        f18616h = WXMediaMessage.DESCRIPTION_LENGTH_LIMIT;
        f18617i = 10000;
        f18618j = "debug.file.blockcount";
        f18619k = "debug.file.keepperiod";
        f18620l = "debug.file.tracelevel";
        f18621m = 24;
        f18622n = 604800000L;
        f18623o = gb.b.f13765a + str + "logs";
    }
}
