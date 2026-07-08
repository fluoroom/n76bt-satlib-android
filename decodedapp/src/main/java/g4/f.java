package g4;

import a6.o;
import a6.q;
import a6.x;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements Cloneable, Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private StringBuilder f13517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList f13518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList f13519c;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String[] f13520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f13521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long[] f13522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f13523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f13524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String[] f13525f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ArrayList f13526g;

        private void c(f fVar) {
            ArrayList arrayList = this.f13526g;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c) it.next()).a(fVar);
            }
        }

        private void d(f fVar) {
            if (this.f13522c == null || this.f13523d == null) {
                return;
            }
            fVar.h(new f(this.f13523d + " IN(" + x.c(",", this.f13522c) + ")"));
        }

        private boolean e(f fVar) {
            if (this.f13524e == null) {
                return false;
            }
            String[] strArr = this.f13525f;
            if (strArr == null || strArr.length == 0) {
                fVar.h(new f("0"));
                return true;
            }
            StringBuilder sb2 = new StringBuilder();
            String str = "PHONE_NUMBERS_EQUAL(" + this.f13524e + ",?,1)";
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (i10 != 0) {
                    sb2.append(" OR ");
                }
                sb2.append(str);
            }
            fVar.h(new f(sb2, o.b(strArr)));
            return false;
        }

        private void f(f fVar) {
            String[] strArr = this.f13520a;
            if (strArr == null || this.f13521b == null) {
                return;
            }
            int length = strArr.length;
            String[] strArr2 = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr2[i10] = this.f13520a[i10] + " LIKE (?)";
            }
            String strJoin = TextUtils.join(" OR ", strArr2);
            Arrays.fill(strArr2, "%" + this.f13521b + "%");
            fVar.h(new f(strJoin, strArr2));
        }

        public b a(String str, String[] strArr) {
            if (this.f13526g == null) {
                this.f13526g = o.a();
            }
            this.f13526g.add(new c(str, strArr, false));
            return this;
        }

        public b b(String str, String[] strArr) {
            if (this.f13526g == null) {
                this.f13526g = o.a();
            }
            this.f13526g.add(new c(str, strArr, true));
            return this;
        }

        public f g() {
            f fVar = new f();
            if (e(fVar)) {
                return fVar;
            }
            f(fVar);
            d(fVar);
            c(fVar);
            return fVar;
        }

        public b h(String str, String str2) {
            return a(str, new String[]{str2});
        }

        public b i(String str, ArrayList arrayList) {
            this.f13523d = str;
            this.f13522c = d4.b.b(arrayList);
            return this;
        }

        public b j(String str, long... jArr) {
            this.f13523d = str;
            this.f13522c = jArr;
            return this;
        }

        public b k(String str) {
            this.f13521b = str;
            return this;
        }

        public b l(String[] strArr) {
            this.f13520a = strArr;
            return this;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f13527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f13528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String[] f13529c;

        public c(String str, String[] strArr, boolean z10) {
            this.f13528b = str;
            this.f13529c = strArr;
            this.f13527a = z10;
        }

        public void a(f fVar) {
            if (this.f13527a) {
                if (this.f13529c.length == 1) {
                    fVar.h(new f(this.f13528b + "!=?", this.f13529c[0]));
                    return;
                }
                fVar.h(new f(this.f13528b + " NOT IN(" + x.a(",", "?", this.f13529c.length) + ")", this.f13529c));
                return;
            }
            if (this.f13529c.length == 1) {
                fVar.h(new f(this.f13528b + "=?", this.f13529c[0]));
                return;
            }
            fVar.h(new f(this.f13528b + " IN(" + x.a(",", "?", this.f13529c.length) + ")", this.f13529c));
        }
    }

    public f(StringBuilder sb2, ArrayList arrayList) {
        if (sb2 == null) {
            this.f13517a = new StringBuilder();
        } else {
            int iIndexOf = sb2.indexOf(") GROUP BY (");
            if (iIndexOf >= 0) {
                for (String str : sb2.substring(iIndexOf + 12).split("\\),\\(")) {
                    f(str);
                }
                sb2.delete(iIndexOf, sb2.length());
            }
            this.f13517a = sb2;
        }
        if (arrayList == null) {
            this.f13518b = o.a();
        } else {
            this.f13518b = arrayList;
        }
    }

    private f b(f fVar, String str) {
        if (fVar != null && !fVar.p()) {
            if (p()) {
                this.f13517a = new StringBuilder(fVar.f13517a);
                this.f13518b = (ArrayList) fVar.f13518b.clone();
                g(fVar.f13519c);
                return this;
            }
            if (this.f13517a.length() == 0) {
                this.f13517a.append((CharSequence) fVar.f13517a);
            } else if (fVar.f13517a.length() != 0) {
                this.f13517a.insert(0, "(");
                StringBuilder sb2 = this.f13517a;
                sb2.append(") ");
                sb2.append(str);
                sb2.append(" (");
                this.f13517a.append((CharSequence) fVar.f13517a);
                this.f13517a.append(")");
            }
            this.f13518b.addAll(fVar.f13518b);
            g(fVar.f13519c);
        }
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f13517a.toString().equals(fVar.f13517a.toString()) && q.e(this.f13518b, fVar.f13518b) && q.e(this.f13519c, fVar.f13519c)) {
                return true;
            }
        }
        return false;
    }

    public void f(String str) {
        if (this.f13519c == null) {
            this.f13519c = o.a();
        }
        this.f13519c.add(str);
    }

    public void g(List list) {
        if (list == null) {
            return;
        }
        if (this.f13519c == null) {
            this.f13519c = o.a();
        }
        this.f13519c.addAll(list);
    }

    public f h(f fVar) {
        return b(fVar, "AND");
    }

    public f i() {
        this.f13519c = null;
        return this;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public f clone() {
        try {
            f fVar = (f) super.clone();
            fVar.f13517a = new StringBuilder(this.f13517a);
            fVar.f13518b = (ArrayList) this.f13518b.clone();
            ArrayList arrayList = this.f13519c;
            if (arrayList != null) {
                fVar.f13519c = (ArrayList) arrayList.clone();
            }
            return fVar;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public String[] k() {
        return (String[]) this.f13518b.toArray(d4.c.f10567g);
    }

    public String m() {
        if (o()) {
            return TextUtils.join(",", this.f13519c);
        }
        return null;
    }

    public String n() {
        ArrayList arrayList = this.f13519c;
        if (arrayList == null || arrayList.isEmpty()) {
            return this.f13517a.toString();
        }
        StringBuilder sb2 = new StringBuilder(this.f13517a);
        if (sb2.length() == 0) {
            sb2.append("1");
        }
        sb2.append(") GROUP BY (");
        sb2.append(TextUtils.join("),(", this.f13519c));
        return sb2.toString();
    }

    public boolean o() {
        ArrayList arrayList = this.f13519c;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public boolean p() {
        if (this.f13517a.length() != 0) {
            return false;
        }
        ArrayList arrayList = this.f13519c;
        return arrayList == null || arrayList.isEmpty();
    }

    public f r(f fVar) {
        return b(fVar, "OR");
    }

    public String toString() {
        return ((Object) this.f13517a) + " : " + this.f13518b + " : " + this.f13519c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13517a.toString());
        parcel.writeStringList(this.f13518b);
        parcel.writeStringList(this.f13519c);
    }

    public f(String str, ArrayList arrayList) {
        this(str == null ? null : new StringBuilder(str), arrayList);
    }

    public f() {
        this((String) null, (String[]) null);
    }

    public f(String str) {
        this(str, (String[]) null);
    }

    public f(String str, String str2) {
        this(str, str2 == null ? null : o.b(str2));
    }

    public f(String str, String[] strArr) {
        this(str, o.b(strArr));
    }

    public f(Parcel parcel) {
        this.f13517a = new StringBuilder(parcel.readString());
        ArrayList arrayListA = o.a();
        this.f13518b = arrayListA;
        parcel.readStringList(arrayListA);
        ArrayList arrayListA2 = o.a();
        this.f13519c = arrayListA2;
        parcel.readStringList(arrayListA2);
    }
}
