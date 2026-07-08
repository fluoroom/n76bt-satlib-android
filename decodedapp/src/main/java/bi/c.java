package bi;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes3.dex */
public class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f4077a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f4078b = 2.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f4080d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4081e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4082f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f4084h = -16777216;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f4085r = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f4083g = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f4079c = 0.05f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f4086s = -1;

    public int a() {
        return this.f4085r;
    }

    public boolean b() {
        return this.f4081e;
    }

    public c c() {
        c cVar = new c();
        try {
            for (Field field : getClass().getDeclaredFields()) {
                if (!Modifier.isFinal(field.getModifiers())) {
                    field.set(cVar, field.get(this));
                }
            }
        } catch (Exception unused) {
        }
        return cVar;
    }

    public String d() {
        return this.f4080d;
    }

    public int e() {
        return this.f4084h;
    }

    public boolean f() {
        return this.f4082f;
    }

    public boolean g() {
        return this.f4083g;
    }

    public int h() {
        return this.f4086s;
    }

    public float i() {
        return this.f4079c;
    }

    public String j() {
        return this.f4077a;
    }

    public float k() {
        return this.f4078b;
    }

    public void l(int i10) {
        this.f4085r = i10;
    }

    public void n(boolean z10) {
        this.f4081e = z10;
    }

    public void o(String str) {
        this.f4080d = str;
    }

    public void p(int i10) {
        this.f4084h = i10;
    }

    public void q(boolean z10) {
        this.f4082f = z10;
    }

    public void r(boolean z10) {
        this.f4083g = z10;
    }

    public void s(int i10) {
        this.f4086s = i10;
    }

    public void t(float f10) {
        this.f4079c = f10;
    }

    public void v(String str) {
        if (str != null) {
            this.f4077a = str;
        }
    }

    public void w(float f10) {
        if (f10 > 0.0f) {
            this.f4078b = f10;
        }
    }
}
