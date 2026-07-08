package jb;

import android.text.TextUtils;
import androidx.appcompat.widget.ActivityChooserView;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import jb.f;
import kb.k;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static SimpleDateFormat f18600i = f.b.a("yy.MM.dd.HH");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f18601a = "Tracer.File";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18602b = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18603c = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18604d = 4096;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f18605e = 10000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18606f = 10;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f18607g = ".log";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f18608h = Long.MAX_VALUE;

    public d(int i10, int i11, int i12, String str, long j10, int i13, String str2, long j11) {
        f(i10);
        c(i11);
        k(i12);
        d(str);
        g(j10);
        o(i13);
        h(str2);
        l(j11);
    }

    public static String b(long j10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j10);
        return new SimpleDateFormat("yy.MM.dd.HH").format(calendar.getTime());
    }

    private String j(String str) {
        return "com.tencent.mobileqq_connectSdk." + str + ".log";
    }

    private File n(long j10) {
        String strJ = j(b(j10));
        String strK = k.k();
        if (TextUtils.isEmpty(strK) && strK == null) {
            return null;
        }
        try {
            File file = new File(strK, e.f18623o);
            if (!file.exists()) {
                file.mkdirs();
            }
            return new File(file, strJ);
        } catch (Exception e10) {
            a.g("openSDK_LOG", "getWorkFile,get app specific file exception:", e10);
            return null;
        }
    }

    public File a() {
        return n(System.currentTimeMillis());
    }

    public void c(int i10) {
        this.f18602b = i10;
    }

    public void d(String str) {
        this.f18601a = str;
    }

    public String e() {
        return this.f18601a;
    }

    public void f(int i10) {
        this.f18603c = i10;
    }

    public void g(long j10) {
        this.f18605e = j10;
    }

    public void h(String str) {
        this.f18607g = str;
    }

    public int i() {
        return this.f18604d;
    }

    public void k(int i10) {
        this.f18604d = i10;
    }

    public void l(long j10) {
        this.f18608h = j10;
    }

    public int m() {
        return this.f18606f;
    }

    public void o(int i10) {
        this.f18606f = i10;
    }
}
