package ka;

import android.graphics.Color;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public class o extends ia.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f19583h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19581f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f19582g = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f19585j = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f19579d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet f19580e = new HashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f19584i = 1.0d;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f19589n = 0.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f19586k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f19587l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f19588m = false;

    o() {
    }

    public static int f(int i10) {
        Random random = new Random();
        int iRed = Color.red(i10);
        int iGreen = Color.green(i10);
        int iBlue = Color.blue(i10);
        if (iRed != 0) {
            iRed = random.nextInt(iRed);
        }
        if (iBlue != 0) {
            iBlue = random.nextInt(iBlue);
        }
        if (iGreen != 0) {
            iGreen = random.nextInt(iGreen);
        }
        return Color.rgb(iRed, iGreen, iBlue);
    }

    private static String g(String str) {
        String strTrim = str.trim();
        if (strTrim.length() <= 6) {
            return strTrim.substring(4, 6) + strTrim.substring(2, 4) + strTrim.substring(0, 2);
        }
        return strTrim.substring(0, 2) + strTrim.substring(6, 8) + strTrim.substring(4, 6) + strTrim.substring(2, 4);
    }

    private static q8.j h(q8.j jVar, boolean z10, float f10) {
        q8.j jVar2 = new q8.j();
        jVar2.u(jVar.l());
        jVar2.b(jVar.f(), jVar.g());
        if (z10) {
            jVar.p(q8.c.a(l(f((int) f10))));
        }
        jVar2.p(jVar.h());
        return jVar2;
    }

    private static q8.m i(q8.m mVar, boolean z10, boolean z11) {
        float fM;
        q8.m mVar2 = new q8.m();
        if (z10) {
            mVar2.g(mVar.h());
        }
        if (z11) {
            mVar2.r(mVar.j());
            fM = mVar.m();
        } else {
            fM = 0.0f;
        }
        mVar2.s(fM);
        mVar2.f(mVar.o());
        return mVar2;
    }

    private static q8.o j(q8.o oVar) {
        q8.o oVar2 = new q8.o();
        oVar2.f(oVar.h());
        oVar2.t(oVar.n());
        oVar2.e(oVar.p());
        return oVar2;
    }

    private static float l(int i10) {
        float[] fArr = new float[3];
        Color.colorToHSV(i10, fArr);
        return fArr[0];
    }

    void A(String str) {
        d(Color.parseColor("#" + g(str)));
        this.f19580e.add("fillColor");
    }

    void B(float f10) {
        c(f10);
        this.f19580e.add("heading");
    }

    void C(float f10, float f11, String str, String str2) {
        b(f10, f11, str, str2);
        this.f19580e.add("hotSpot");
    }

    void D(String str) {
        this.f19586k = str.equals("random");
        this.f19580e.add("iconColorMode");
    }

    void E(double d10) {
        this.f19584i = d10;
        this.f19580e.add("iconScale");
    }

    void F(String str) {
        this.f19583h = str;
        this.f19580e.add("iconUrl");
    }

    void G(String str) {
        this.f19579d.put("text", str);
    }

    void H(String str) {
        this.f19587l = str.equals("random");
        this.f19580e.add("lineColorMode");
    }

    void I(String str) {
        float fL = l(Color.parseColor("#" + g(str)));
        this.f19589n = fL;
        this.f15984a.p(q8.c.a(fL));
        this.f19580e.add("markerColor");
    }

    void J(boolean z10) {
        this.f19582g = z10;
        this.f19580e.add("outline");
    }

    void K(String str) {
        this.f15985b.f(Color.parseColor("#" + g(str)));
        this.f15986c.r(Color.parseColor("#" + g(str)));
        this.f19580e.add("outlineColor");
    }

    void L(String str) {
        this.f19588m = str.equals("random");
        this.f19580e.add("polyColorMode");
    }

    void M(String str) {
        this.f19585j = str;
    }

    void N(Float f10) {
        a(f10.floatValue());
        e(f10.floatValue());
        this.f19580e.add("width");
    }

    public HashMap k() {
        return this.f19579d;
    }

    public double m() {
        return this.f19584i;
    }

    public String n() {
        return this.f19583h;
    }

    public q8.j o() {
        return h(this.f15984a, v(), this.f19589n);
    }

    public q8.m p() {
        return i(this.f15986c, this.f19581f, this.f19582g);
    }

    public q8.o q() {
        return j(this.f15985b);
    }

    String r() {
        return this.f19585j;
    }

    public boolean s() {
        return this.f19579d.size() > 0;
    }

    public boolean t() {
        return this.f19581f;
    }

    public String toString() {
        return "Style{\n balloon options=" + this.f19579d + ",\n fill=" + this.f19581f + ",\n outline=" + this.f19582g + ",\n icon url=" + this.f19583h + ",\n scale=" + this.f19584i + ",\n style id=" + this.f19585j + "\n}\n";
    }

    public boolean u() {
        return this.f19582g;
    }

    boolean v() {
        return this.f19586k;
    }

    public boolean w() {
        return this.f19587l;
    }

    public boolean x() {
        return this.f19588m;
    }

    public boolean y(String str) {
        return this.f19580e.contains(str);
    }

    public void z(boolean z10) {
        this.f19581f = z10;
    }
}
