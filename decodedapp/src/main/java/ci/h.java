package ci;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class h implements Cloneable, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f4906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f4907b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f4909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f4912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f4913h;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private char f4915s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f4908c = "arg";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List f4914r = new ArrayList();

    public h(String str, String str2, boolean z10, String str3) {
        this.f4912g = -1;
        j.c(str);
        this.f4906a = str;
        this.f4907b = str2;
        if (z10) {
            this.f4912g = 1;
        }
        this.f4909d = str3;
    }

    private void A(String str) {
        if (x()) {
            char cK = k();
            int iIndexOf = str.indexOf(cK);
            while (iIndexOf != -1 && this.f4914r.size() != this.f4912g - 1) {
                a(str.substring(0, iIndexOf));
                str = str.substring(iIndexOf + 1);
                iIndexOf = str.indexOf(cK);
            }
        }
        a(str);
    }

    private void a(String str) {
        if (this.f4912g > 0 && this.f4914r.size() > this.f4912g - 1) {
            throw new RuntimeException("Cannot add value, list full.");
        }
        this.f4914r.add(str);
    }

    private boolean v() {
        return this.f4914r.isEmpty();
    }

    void b(String str) {
        if (this.f4912g == -1) {
            throw new RuntimeException("NO_ARGS_ALLOWED");
        }
        A(str);
    }

    public Object clone() {
        try {
            h hVar = (h) super.clone();
            hVar.f4914r = new ArrayList(this.f4914r);
            return hVar;
        } catch (CloneNotSupportedException e10) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("A CloneNotSupportedException was thrown: ");
            stringBuffer.append(e10.getMessage());
            throw new RuntimeException(stringBuffer.toString());
        }
    }

    void d() {
        this.f4914r.clear();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.f4906a;
        if (str == null ? hVar.f4906a != null : !str.equals(hVar.f4906a)) {
            return false;
        }
        String str2 = this.f4907b;
        String str3 = hVar.f4907b;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    public String f() {
        return this.f4908c;
    }

    public String g() {
        return this.f4909d;
    }

    String h() {
        String str = this.f4906a;
        return str == null ? this.f4907b : str;
    }

    public int hashCode() {
        String str = this.f4906a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f4907b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String i() {
        return this.f4907b;
    }

    public String j() {
        return this.f4906a;
    }

    public char k() {
        return this.f4915s;
    }

    public String[] n() {
        if (v()) {
            return null;
        }
        List list = this.f4914r;
        return (String[]) list.toArray(new String[list.size()]);
    }

    public boolean o() {
        int i10 = this.f4912g;
        return i10 > 0 || i10 == -2;
    }

    public boolean p() {
        String str = this.f4908c;
        return str != null && str.length() > 0;
    }

    public boolean r() {
        int i10 = this.f4912g;
        return i10 > 1 || i10 == -2;
    }

    public boolean t() {
        return this.f4907b != null;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ option: ");
        stringBuffer.append(this.f4906a);
        if (this.f4907b != null) {
            stringBuffer.append(" ");
            stringBuffer.append(this.f4907b);
        }
        stringBuffer.append(" ");
        if (r()) {
            stringBuffer.append("[ARG...]");
        } else if (o()) {
            stringBuffer.append(" [ARG]");
        }
        stringBuffer.append(" :: ");
        stringBuffer.append(this.f4909d);
        if (this.f4913h != null) {
            stringBuffer.append(" :: ");
            stringBuffer.append(this.f4913h);
        }
        stringBuffer.append(" ]");
        return stringBuffer.toString();
    }

    public boolean w() {
        return this.f4911f;
    }

    public boolean x() {
        return this.f4915s > 0;
    }

    public boolean z() {
        return this.f4910e;
    }
}
