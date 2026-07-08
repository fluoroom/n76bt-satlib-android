package w8;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.internal.m;
import java.util.Locale;
import u8.i;
import u8.j;
import u8.k;
import u8.l;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f31342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f31343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final float f31344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final float f31345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final float f31346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final float f31347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final float f31348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f31349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f31350i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f31351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f31352k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f31353l;

    c(Context context, int i10, int i11, int i12, a aVar) {
        a aVar2 = new a();
        this.f31343b = aVar2;
        aVar = aVar == null ? new a() : aVar;
        if (i10 != 0) {
            aVar.f31354a = i10;
        }
        TypedArray typedArrayA = a(context, aVar.f31354a, i11, i12);
        Resources resources = context.getResources();
        this.f31344c = typedArrayA.getDimensionPixelSize(l.f28941v, -1);
        this.f31350i = context.getResources().getDimensionPixelSize(u8.d.Y);
        this.f31351j = context.getResources().getDimensionPixelSize(u8.d.f28582a0);
        this.f31345d = typedArrayA.getDimensionPixelSize(l.F, -1);
        int i13 = l.D;
        int i14 = u8.d.f28625w;
        this.f31346e = typedArrayA.getDimension(i13, resources.getDimension(i14));
        int i15 = l.I;
        int i16 = u8.d.f28627x;
        this.f31348g = typedArrayA.getDimension(i15, resources.getDimension(i16));
        this.f31347f = typedArrayA.getDimension(l.f28932u, resources.getDimension(i14));
        this.f31349h = typedArrayA.getDimension(l.E, resources.getDimension(i16));
        boolean z10 = true;
        this.f31352k = typedArrayA.getInt(l.P, 1);
        this.f31353l = typedArrayA.getInt(l.f28914s, 0);
        aVar2.f31362r = aVar.f31362r == -2 ? 255 : aVar.f31362r;
        if (aVar.f31364t != -2) {
            aVar2.f31364t = aVar.f31364t;
        } else {
            int i17 = l.O;
            if (typedArrayA.hasValue(i17)) {
                aVar2.f31364t = typedArrayA.getInt(i17, 0);
            } else {
                aVar2.f31364t = -1;
            }
        }
        if (aVar.f31363s != null) {
            aVar2.f31363s = aVar.f31363s;
        } else {
            int i18 = l.f28968y;
            if (typedArrayA.hasValue(i18)) {
                aVar2.f31363s = typedArrayA.getString(i18);
            }
        }
        aVar2.f31368x = aVar.f31368x;
        aVar2.f31369y = aVar.f31369y == null ? context.getString(j.f28708j) : aVar.f31369y;
        aVar2.f31370z = aVar.f31370z == 0 ? i.f28698a : aVar.f31370z;
        aVar2.A = aVar.A == 0 ? j.f28713o : aVar.A;
        if (aVar.C != null && !aVar.C.booleanValue()) {
            z10 = false;
        }
        aVar2.C = Boolean.valueOf(z10);
        aVar2.f31365u = aVar.f31365u == -2 ? typedArrayA.getInt(l.M, -2) : aVar.f31365u;
        aVar2.f31366v = aVar.f31366v == -2 ? typedArrayA.getInt(l.N, -2) : aVar.f31366v;
        aVar2.f31358e = Integer.valueOf(aVar.f31358e == null ? typedArrayA.getResourceId(l.f28950w, k.f28726b) : aVar.f31358e.intValue());
        aVar2.f31359f = Integer.valueOf(aVar.f31359f == null ? typedArrayA.getResourceId(l.f28959x, 0) : aVar.f31359f.intValue());
        aVar2.f31360g = Integer.valueOf(aVar.f31360g == null ? typedArrayA.getResourceId(l.G, k.f28726b) : aVar.f31360g.intValue());
        aVar2.f31361h = Integer.valueOf(aVar.f31361h == null ? typedArrayA.getResourceId(l.H, 0) : aVar.f31361h.intValue());
        aVar2.f31355b = Integer.valueOf(aVar.f31355b == null ? H(context, typedArrayA, l.f28905r) : aVar.f31355b.intValue());
        aVar2.f31357d = Integer.valueOf(aVar.f31357d == null ? typedArrayA.getResourceId(l.f28977z, k.f28728d) : aVar.f31357d.intValue());
        if (aVar.f31356c != null) {
            aVar2.f31356c = aVar.f31356c;
        } else {
            int i19 = l.A;
            if (typedArrayA.hasValue(i19)) {
                aVar2.f31356c = Integer.valueOf(H(context, typedArrayA, i19));
            } else {
                aVar2.f31356c = Integer.valueOf(new j9.d(context, aVar2.f31357d.intValue()).j().getDefaultColor());
            }
        }
        aVar2.B = Integer.valueOf(aVar.B == null ? typedArrayA.getInt(l.f28923t, 8388661) : aVar.B.intValue());
        aVar2.D = Integer.valueOf(aVar.D == null ? typedArrayA.getDimensionPixelSize(l.C, resources.getDimensionPixelSize(u8.d.Z)) : aVar.D.intValue());
        aVar2.E = Integer.valueOf(aVar.E == null ? typedArrayA.getDimensionPixelSize(l.B, resources.getDimensionPixelSize(u8.d.f28629y)) : aVar.E.intValue());
        aVar2.F = Integer.valueOf(aVar.F == null ? typedArrayA.getDimensionPixelOffset(l.J, 0) : aVar.F.intValue());
        aVar2.G = Integer.valueOf(aVar.G == null ? typedArrayA.getDimensionPixelOffset(l.Q, 0) : aVar.G.intValue());
        aVar2.H = Integer.valueOf(aVar.H == null ? typedArrayA.getDimensionPixelOffset(l.K, aVar2.F.intValue()) : aVar.H.intValue());
        aVar2.I = Integer.valueOf(aVar.I == null ? typedArrayA.getDimensionPixelOffset(l.R, aVar2.G.intValue()) : aVar.I.intValue());
        aVar2.L = Integer.valueOf(aVar.L == null ? typedArrayA.getDimensionPixelOffset(l.L, 0) : aVar.L.intValue());
        aVar2.J = Integer.valueOf(aVar.J == null ? 0 : aVar.J.intValue());
        aVar2.K = Integer.valueOf(aVar.K == null ? 0 : aVar.K.intValue());
        aVar2.M = Boolean.valueOf(aVar.M == null ? typedArrayA.getBoolean(l.f28896q, false) : aVar.M.booleanValue());
        typedArrayA.recycle();
        if (aVar.f31367w == null) {
            aVar2.f31367w = Build.VERSION.SDK_INT >= 24 ? Locale.getDefault(Locale.Category.FORMAT) : Locale.getDefault();
        } else {
            aVar2.f31367w = aVar.f31367w;
        }
        this.f31342a = aVar;
    }

    private static int H(Context context, TypedArray typedArray, int i10) {
        return j9.c.a(context, typedArray, i10).getDefaultColor();
    }

    private TypedArray a(Context context, int i10, int i11, int i12) {
        AttributeSet attributeSetI;
        int styleAttribute;
        if (i10 != 0) {
            attributeSetI = com.google.android.material.drawable.c.i(context, i10, "badge");
            styleAttribute = attributeSetI.getStyleAttribute();
        } else {
            attributeSetI = null;
            styleAttribute = 0;
        }
        return m.i(context, attributeSetI, l.f28887p, i11, styleAttribute == 0 ? i12 : styleAttribute, new int[0]);
    }

    int A() {
        return this.f31343b.f31357d.intValue();
    }

    int B() {
        return this.f31343b.I.intValue();
    }

    int C() {
        return this.f31343b.G.intValue();
    }

    boolean D() {
        return this.f31343b.f31364t != -1;
    }

    boolean E() {
        return this.f31343b.f31363s != null;
    }

    boolean F() {
        return this.f31343b.M.booleanValue();
    }

    boolean G() {
        return this.f31343b.C.booleanValue();
    }

    void I(int i10) {
        this.f31342a.f31362r = i10;
        this.f31343b.f31362r = i10;
    }

    int b() {
        return this.f31343b.J.intValue();
    }

    int c() {
        return this.f31343b.K.intValue();
    }

    int d() {
        return this.f31343b.f31362r;
    }

    int e() {
        return this.f31343b.f31355b.intValue();
    }

    int f() {
        return this.f31343b.B.intValue();
    }

    int g() {
        return this.f31343b.D.intValue();
    }

    int h() {
        return this.f31343b.f31359f.intValue();
    }

    int i() {
        return this.f31343b.f31358e.intValue();
    }

    int j() {
        return this.f31343b.f31356c.intValue();
    }

    int k() {
        return this.f31343b.E.intValue();
    }

    int l() {
        return this.f31343b.f31361h.intValue();
    }

    int m() {
        return this.f31343b.f31360g.intValue();
    }

    int n() {
        return this.f31343b.A;
    }

    CharSequence o() {
        return this.f31343b.f31368x;
    }

    CharSequence p() {
        return this.f31343b.f31369y;
    }

    int q() {
        return this.f31343b.f31370z;
    }

    int r() {
        return this.f31343b.H.intValue();
    }

    int s() {
        return this.f31343b.F.intValue();
    }

    int t() {
        return this.f31343b.L.intValue();
    }

    int u() {
        return this.f31343b.f31365u;
    }

    int v() {
        return this.f31343b.f31366v;
    }

    int w() {
        return this.f31343b.f31364t;
    }

    Locale x() {
        return this.f31343b.f31367w;
    }

    a y() {
        return this.f31342a;
    }

    String z() {
        return this.f31343b.f31363s;
    }

    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0418a();
        private int A;
        private Integer B;
        private Boolean C;
        private Integer D;
        private Integer E;
        private Integer F;
        private Integer G;
        private Integer H;
        private Integer I;
        private Integer J;
        private Integer K;
        private Integer L;
        private Boolean M;
        private Integer N;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f31354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f31355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f31356c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f31357d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f31358e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f31359f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f31360g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Integer f31361h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f31362r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private String f31363s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f31364t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f31365u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f31366v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private Locale f31367w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private CharSequence f31368x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private CharSequence f31369y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f31370z;

        /* JADX INFO: renamed from: w8.c$a$a, reason: collision with other inner class name */
        class C0418a implements Parcelable.Creator {
            C0418a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a() {
            this.f31362r = 255;
            this.f31364t = -2;
            this.f31365u = -2;
            this.f31366v = -2;
            this.C = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f31354a);
            parcel.writeSerializable(this.f31355b);
            parcel.writeSerializable(this.f31356c);
            parcel.writeSerializable(this.f31357d);
            parcel.writeSerializable(this.f31358e);
            parcel.writeSerializable(this.f31359f);
            parcel.writeSerializable(this.f31360g);
            parcel.writeSerializable(this.f31361h);
            parcel.writeInt(this.f31362r);
            parcel.writeString(this.f31363s);
            parcel.writeInt(this.f31364t);
            parcel.writeInt(this.f31365u);
            parcel.writeInt(this.f31366v);
            CharSequence charSequence = this.f31368x;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f31369y;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.f31370z);
            parcel.writeSerializable(this.B);
            parcel.writeSerializable(this.D);
            parcel.writeSerializable(this.E);
            parcel.writeSerializable(this.F);
            parcel.writeSerializable(this.G);
            parcel.writeSerializable(this.H);
            parcel.writeSerializable(this.I);
            parcel.writeSerializable(this.L);
            parcel.writeSerializable(this.J);
            parcel.writeSerializable(this.K);
            parcel.writeSerializable(this.C);
            parcel.writeSerializable(this.f31367w);
            parcel.writeSerializable(this.M);
            parcel.writeSerializable(this.N);
        }

        a(Parcel parcel) {
            this.f31362r = 255;
            this.f31364t = -2;
            this.f31365u = -2;
            this.f31366v = -2;
            this.C = Boolean.TRUE;
            this.f31354a = parcel.readInt();
            this.f31355b = (Integer) parcel.readSerializable();
            this.f31356c = (Integer) parcel.readSerializable();
            this.f31357d = (Integer) parcel.readSerializable();
            this.f31358e = (Integer) parcel.readSerializable();
            this.f31359f = (Integer) parcel.readSerializable();
            this.f31360g = (Integer) parcel.readSerializable();
            this.f31361h = (Integer) parcel.readSerializable();
            this.f31362r = parcel.readInt();
            this.f31363s = parcel.readString();
            this.f31364t = parcel.readInt();
            this.f31365u = parcel.readInt();
            this.f31366v = parcel.readInt();
            this.f31368x = parcel.readString();
            this.f31369y = parcel.readString();
            this.f31370z = parcel.readInt();
            this.B = (Integer) parcel.readSerializable();
            this.D = (Integer) parcel.readSerializable();
            this.E = (Integer) parcel.readSerializable();
            this.F = (Integer) parcel.readSerializable();
            this.G = (Integer) parcel.readSerializable();
            this.H = (Integer) parcel.readSerializable();
            this.I = (Integer) parcel.readSerializable();
            this.L = (Integer) parcel.readSerializable();
            this.J = (Integer) parcel.readSerializable();
            this.K = (Integer) parcel.readSerializable();
            this.C = (Boolean) parcel.readSerializable();
            this.f31367w = (Locale) parcel.readSerializable();
            this.M = (Boolean) parcel.readSerializable();
            this.N = (Integer) parcel.readSerializable();
        }
    }
}
