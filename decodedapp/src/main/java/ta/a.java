package ta;

import android.view.View;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import dd.q;
import java.util.LinkedHashSet;
import java.util.Set;
import rd.h;
import rd.m;
import va.b;
import va.c;
import va.d;
import va.f;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private c A;
    private b B;
    private final Set C;
    private boolean D;
    private boolean E;
    private int F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f27658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f27659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f27661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f27663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f27664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f27665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f27666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f27667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f27668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f27669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f27670m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f27671n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ua.b f27672o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ua.a f27673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f27674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f27675r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f27676s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private q f27677t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private q f27678u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f27679v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f27680w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f27681x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f27682y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private d f27683z;

    public a(Integer num, View view, String str, boolean z10, int i10, boolean z11, float f10, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i11, ua.b bVar, ua.a aVar, boolean z18, boolean z19, int i12, q qVar, q qVar2, int i13, int i14, int i15, int i16, f fVar, d dVar, va.a aVar2, c cVar, b bVar2, Set set, boolean z20, boolean z21, int i17) {
        m.e(bVar, "sidePattern");
        m.e(aVar, "showPattern");
        m.e(qVar, "offsetPair");
        m.e(qVar2, "locationPair");
        m.e(bVar2, "displayHeight");
        m.e(set, "filterSet");
        this.f27658a = num;
        this.f27659b = view;
        this.f27660c = str;
        this.f27661d = z10;
        this.f27662e = i10;
        this.f27663f = z11;
        this.f27664g = f10;
        this.f27665h = z12;
        this.f27666i = z13;
        this.f27667j = z14;
        this.f27668k = z15;
        this.f27669l = z16;
        this.f27670m = z17;
        this.f27671n = i11;
        this.f27672o = bVar;
        this.f27673p = aVar;
        this.f27674q = z18;
        this.f27675r = z19;
        this.f27676s = i12;
        this.f27677t = qVar;
        this.f27678u = qVar2;
        this.f27679v = i13;
        this.f27680w = i14;
        this.f27681x = i15;
        this.f27682y = i16;
        this.f27683z = dVar;
        this.A = cVar;
        this.B = bVar2;
        this.C = set;
        this.D = z20;
        this.E = z21;
        this.F = i17;
    }

    public final int A() {
        return this.f27662e;
    }

    public final boolean B() {
        return this.f27674q;
    }

    public final boolean C() {
        return this.f27666i;
    }

    public final boolean D() {
        return this.f27665h;
    }

    public final boolean E() {
        return this.f27670m;
    }

    public final boolean F() {
        return this.f27663f;
    }

    public final void G(boolean z10) {
        this.f27666i = z10;
    }

    public final void H(d dVar) {
        this.f27683z = dVar;
    }

    public final void I(boolean z10) {
        this.f27665h = z10;
    }

    public final void J(boolean z10) {
        this.D = z10;
    }

    public final void K(c cVar) {
        this.A = cVar;
    }

    public final void L(String str) {
        this.f27660c = str;
    }

    public final void M(int i10) {
        this.f27676s = i10;
    }

    public final void O(View view) {
        this.f27659b = view;
    }

    public final void P(boolean z10) {
        this.E = z10;
    }

    public final void Q(q qVar) {
        m.e(qVar, "<set-?>");
        this.f27677t = qVar;
    }

    public final void R(boolean z10) {
        this.f27667j = z10;
    }

    public final void S(ua.a aVar) {
        m.e(aVar, "<set-?>");
        this.f27673p = aVar;
    }

    public final void T(int i10) {
        this.f27662e = i10;
    }

    public final float a() {
        return this.f27664g;
    }

    public final int b() {
        return this.f27682y;
    }

    public final d c() {
        return this.f27683z;
    }

    public final boolean d() {
        return this.f27661d;
    }

    public final boolean e() {
        return this.D;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f27658a, aVar.f27658a) && m.a(this.f27659b, aVar.f27659b) && m.a(this.f27660c, aVar.f27660c) && this.f27661d == aVar.f27661d && this.f27662e == aVar.f27662e && this.f27663f == aVar.f27663f && Float.compare(this.f27664g, aVar.f27664g) == 0 && this.f27665h == aVar.f27665h && this.f27666i == aVar.f27666i && this.f27667j == aVar.f27667j && this.f27668k == aVar.f27668k && this.f27669l == aVar.f27669l && this.f27670m == aVar.f27670m && this.f27671n == aVar.f27671n && this.f27672o == aVar.f27672o && this.f27673p == aVar.f27673p && this.f27674q == aVar.f27674q && this.f27675r == aVar.f27675r && this.f27676s == aVar.f27676s && m.a(this.f27677t, aVar.f27677t) && m.a(this.f27678u, aVar.f27678u) && this.f27679v == aVar.f27679v && this.f27680w == aVar.f27680w && this.f27681x == aVar.f27681x && this.f27682y == aVar.f27682y && m.a(null, null) && m.a(this.f27683z, aVar.f27683z) && m.a(null, null) && m.a(this.A, aVar.A) && m.a(this.B, aVar.B) && m.a(this.C, aVar.C) && this.D == aVar.D && this.E == aVar.E && this.F == aVar.F;
    }

    public final Set f() {
        return this.C;
    }

    public final c g() {
        return this.A;
    }

    public final va.a h() {
        return null;
    }

    public int hashCode() {
        Integer num = this.f27658a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        View view = this.f27659b;
        int iHashCode2 = (iHashCode + (view == null ? 0 : view.hashCode())) * 31;
        String str = this.f27660c;
        int iHashCode3 = (((((((((((((((((((((((((((((((((((((((((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + o4.b.a(this.f27661d)) * 31) + this.f27662e) * 31) + o4.b.a(this.f27663f)) * 31) + Float.floatToIntBits(this.f27664g)) * 31) + o4.b.a(this.f27665h)) * 31) + o4.b.a(this.f27666i)) * 31) + o4.b.a(this.f27667j)) * 31) + o4.b.a(this.f27668k)) * 31) + o4.b.a(this.f27669l)) * 31) + o4.b.a(this.f27670m)) * 31) + this.f27671n) * 31) + this.f27672o.hashCode()) * 31) + this.f27673p.hashCode()) * 31) + o4.b.a(this.f27674q)) * 31) + o4.b.a(this.f27675r)) * 31) + this.f27676s) * 31) + this.f27677t.hashCode()) * 31) + this.f27678u.hashCode()) * 31) + this.f27679v) * 31) + this.f27680w) * 31) + this.f27681x) * 31) + this.f27682y) * 961;
        d dVar = this.f27683z;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 961;
        c cVar = this.A;
        return ((((((((((iHashCode4 + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + o4.b.a(this.D)) * 31) + o4.b.a(this.E)) * 31) + this.F;
    }

    public final String i() {
        return this.f27660c;
    }

    public final int j() {
        return this.f27676s;
    }

    public final boolean k() {
        return this.f27668k;
    }

    public final boolean l() {
        return this.f27675r;
    }

    public final boolean m() {
        return this.f27669l;
    }

    public final f n() {
        return null;
    }

    public final int o() {
        return this.F;
    }

    public final Integer p() {
        return this.f27658a;
    }

    public final View q() {
        return this.f27659b;
    }

    public final int r() {
        return this.f27679v;
    }

    public final int s() {
        return this.f27671n;
    }

    public final q t() {
        return this.f27678u;
    }

    public String toString() {
        return "FloatConfig(layoutId=" + this.f27658a + ", layoutView=" + this.f27659b + ", floatTag=" + this.f27660c + ", dragEnable=" + this.f27661d + ", touchSlop=" + this.f27662e + ", isNotTouchable=" + this.f27663f + ", alpha=" + this.f27664g + ", isDrag=" + this.f27665h + ", isAnim=" + this.f27666i + ", isShow=" + this.f27667j + ", hasEditText=" + this.f27668k + ", immersionStatusBar=" + this.f27669l + ", isGlobalAnim=" + this.f27670m + ", level=" + this.f27671n + ", sidePattern=" + this.f27672o + ", showPattern=" + this.f27673p + ", widthMatch=" + this.f27674q + ", heightMatch=" + this.f27675r + ", gravity=" + this.f27676s + ", offsetPair=" + this.f27677t + ", locationPair=" + this.f27678u + ", leftBorder=" + this.f27679v + ", topBorder=" + this.f27680w + ", rightBorder=" + this.f27681x + ", bottomBorder=" + this.f27682y + ", invokeView=" + ((Object) null) + ", callbacks=" + this.f27683z + ", floatCallbacks=" + ((Object) null) + ", floatAnimator=" + this.A + ", displayHeight=" + this.B + ", filterSet=" + this.C + ", filterSelf=" + this.D + ", needShow=" + this.E + ", layoutChangedGravity=" + this.F + ')';
    }

    public final boolean u() {
        return this.E;
    }

    public final q v() {
        return this.f27677t;
    }

    public final int w() {
        return this.f27681x;
    }

    public final ua.a x() {
        return this.f27673p;
    }

    public final ua.b y() {
        return this.f27672o;
    }

    public final int z() {
        return this.f27680w;
    }

    public final void N(f fVar) {
    }

    public /* synthetic */ a(Integer num, View view, String str, boolean z10, int i10, boolean z11, float f10, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i11, ua.b bVar, ua.a aVar, boolean z18, boolean z19, int i12, q qVar, q qVar2, int i13, int i14, int i15, int i16, f fVar, d dVar, va.a aVar2, c cVar, b bVar2, Set set, boolean z20, boolean z21, int i17, int i18, int i19, h hVar) {
        ua.b bVar3;
        int i20;
        c cVar2;
        Integer num2 = (i18 & 1) != 0 ? null : num;
        View view2 = (i18 & 2) != 0 ? null : view;
        String str2 = (i18 & 4) != 0 ? null : str;
        boolean z22 = (i18 & 8) != 0 ? true : z10;
        int i21 = (i18 & 16) != 0 ? 9 : i10;
        boolean z23 = (i18 & 32) != 0 ? false : z11;
        float f11 = (i18 & 64) != 0 ? 1.0f : f10;
        boolean z24 = (i18 & 128) != 0 ? false : z12;
        boolean z25 = (i18 & 256) != 0 ? false : z13;
        boolean z26 = (i18 & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0 ? false : z14;
        boolean z27 = (i18 & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0 ? false : z15;
        boolean z28 = (i18 & 2048) != 0 ? false : z16;
        boolean z29 = (i18 & 4096) != 0 ? true : z17;
        int i22 = (i18 & 8192) != 0 ? 0 : i11;
        boolean z30 = z28;
        ua.b bVar4 = (i18 & 16384) != 0 ? ua.b.f29005a : bVar;
        ua.a aVar3 = (i18 & 32768) != 0 ? ua.a.f28999a : aVar;
        boolean z31 = (i18 & WXMediaMessage.THUMB_LENGTH_LIMIT) != 0 ? false : z18;
        boolean z32 = (i18 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0 ? false : z19;
        int i23 = (i18 & 262144) != 0 ? 0 : i12;
        q qVar3 = (i18 & 524288) != 0 ? new q(0, 0) : qVar;
        q qVar4 = (i18 & 1048576) != 0 ? new q(0, 0) : qVar2;
        int i24 = (i18 & 2097152) != 0 ? 0 : i13;
        int i25 = (i18 & 4194304) != 0 ? -999 : i14;
        int i26 = (i18 & 8388608) != 0 ? 9999 : i15;
        int i27 = (i18 & 16777216) == 0 ? i16 : 9999;
        f fVar2 = (i18 & 33554432) != 0 ? null : fVar;
        d dVar2 = (i18 & 67108864) != 0 ? null : dVar;
        va.a aVar4 = (i18 & 134217728) != 0 ? null : aVar2;
        q qVar5 = qVar4;
        if ((i18 & 268435456) != 0) {
            bVar3 = bVar4;
            i20 = i24;
            cVar2 = new ra.c(300L);
        } else {
            bVar3 = bVar4;
            i20 = i24;
            cVar2 = cVar;
        }
        this(num2, view2, str2, z22, i21, z23, f11, z24, z25, z26, z27, z30, z29, i22, bVar3, aVar3, z31, z32, i23, qVar3, qVar5, i20, i25, i26, i27, fVar2, dVar2, aVar4, cVar2, (i18 & 536870912) != 0 ? new ya.a() : bVar2, (i18 & WXVideoFileObject.FILE_SIZE_LIMIT) != 0 ? new LinkedHashSet() : set, (i18 & RtlSpacingHelper.UNDEFINED) != 0 ? false : z20, (i19 & 1) != 0 ? true : z21, (i19 & 2) != 0 ? 8388659 : i17);
    }
}
