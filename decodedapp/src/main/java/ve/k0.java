package ve;

import ee.o;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a */
    private static final mf.c f30622a;

    /* JADX INFO: renamed from: b */
    private static final mf.c f30623b;

    /* JADX INFO: renamed from: c */
    private static final mf.c f30624c;

    /* JADX INFO: renamed from: d */
    private static final mf.c f30625d;

    /* JADX INFO: renamed from: e */
    private static final mf.c f30626e;

    /* JADX INFO: renamed from: f */
    private static final mf.c f30627f;

    /* JADX INFO: renamed from: g */
    private static final mf.c f30628g;

    /* JADX INFO: renamed from: h */
    private static final mf.c f30629h;

    /* JADX INFO: renamed from: i */
    private static final mf.c f30630i;

    /* JADX INFO: renamed from: j */
    private static final mf.c f30631j;

    /* JADX INFO: renamed from: k */
    private static final mf.c f30632k;

    /* JADX INFO: renamed from: l */
    private static final mf.c f30633l;

    /* JADX INFO: renamed from: m */
    private static final mf.c f30634m;

    /* JADX INFO: renamed from: n */
    private static final mf.c f30635n;

    /* JADX INFO: renamed from: o */
    private static final mf.c f30636o;

    /* JADX INFO: renamed from: p */
    private static final mf.c f30637p;

    /* JADX INFO: renamed from: q */
    private static final Set f30638q;

    /* JADX INFO: renamed from: r */
    private static final Set f30639r;

    /* JADX INFO: renamed from: s */
    private static final Set f30640s;

    /* JADX INFO: renamed from: t */
    private static final Set f30641t;

    /* JADX INFO: renamed from: u */
    private static final Set f30642u;

    /* JADX INFO: renamed from: v */
    private static final Set f30643v;

    /* JADX INFO: renamed from: w */
    private static final Set f30644w;

    /* JADX INFO: renamed from: x */
    private static final Map f30645x;

    /* JADX INFO: renamed from: y */
    private static final mf.c f30646y;

    static {
        mf.c cVar = new mf.c("org.jspecify.nullness.Nullable");
        f30622a = cVar;
        mf.c cVar2 = new mf.c("org.jspecify.nullness.NullMarked");
        f30623b = cVar2;
        mf.c cVar3 = new mf.c("org.jspecify.nullness.NullnessUnspecified");
        f30624c = cVar3;
        mf.c cVar4 = new mf.c("org.jspecify.annotations.NonNull");
        f30625d = cVar4;
        mf.c cVar5 = new mf.c("org.jspecify.annotations.Nullable");
        f30626e = cVar5;
        mf.c cVar6 = new mf.c("org.jspecify.annotations.NullMarked");
        f30627f = cVar6;
        mf.c cVar7 = new mf.c("org.jspecify.annotations.NullnessUnspecified");
        f30628g = cVar7;
        mf.c cVar8 = new mf.c("org.jspecify.annotations.NullUnmarked");
        f30629h = cVar8;
        f30630i = new mf.c("javax.annotation.meta.TypeQualifier");
        f30631j = new mf.c("javax.annotation.meta.TypeQualifierNickname");
        f30632k = new mf.c("javax.annotation.meta.TypeQualifierDefault");
        mf.c cVar9 = new mf.c("javax.annotation.Nonnull");
        f30633l = cVar9;
        mf.c cVar10 = new mf.c("javax.annotation.Nullable");
        f30634m = cVar10;
        mf.c cVar11 = new mf.c("javax.annotation.CheckForNull");
        f30635n = cVar11;
        f30636o = new mf.c("javax.annotation.ParametersAreNonnullByDefault");
        f30637p = new mf.c("javax.annotation.ParametersAreNullableByDefault");
        f30638q = ed.r0.g(cVar9, cVar11);
        Set setG = ed.r0.g(j0.f30610l, cVar4, new mf.c("android.annotation.NonNull"), new mf.c("androidx.annotation.NonNull"), new mf.c("androidx.annotation.RecentlyNonNull"), new mf.c("androidx.annotation.NonNull"), new mf.c("com.android.annotations.NonNull"), new mf.c("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new mf.c("org.checkerframework.checker.nullness.qual.NonNull"), new mf.c("edu.umd.cs.findbugs.annotations.NonNull"), new mf.c("io.reactivex.annotations.NonNull"), new mf.c("io.reactivex.rxjava3.annotations.NonNull"), new mf.c("org.eclipse.jdt.annotation.NonNull"), new mf.c("lombok.NonNull"), new mf.c("jakarta.annotation.Nonnull"));
        f30639r = setG;
        Set setG2 = ed.r0.g(j0.f30611m, cVar, cVar5, cVar10, cVar11, new mf.c("android.annotation.Nullable"), new mf.c("androidx.annotation.Nullable"), new mf.c("androidx.annotation.RecentlyNullable"), new mf.c("androidx.annotation.Nullable"), new mf.c("com.android.annotations.Nullable"), new mf.c("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new mf.c("org.checkerframework.checker.nullness.qual.Nullable"), new mf.c("edu.umd.cs.findbugs.annotations.Nullable"), new mf.c("edu.umd.cs.findbugs.annotations.PossiblyNull"), new mf.c("edu.umd.cs.findbugs.annotations.CheckForNull"), new mf.c("io.reactivex.annotations.Nullable"), new mf.c("io.reactivex.rxjava3.annotations.Nullable"), new mf.c("org.eclipse.jdt.annotation.Nullable"), new mf.c("jakarta.annotation.Nullable"));
        f30640s = setG2;
        f30641t = ed.r0.g(cVar3, cVar7);
        f30642u = ed.r0.k(ed.r0.k(ed.r0.k(ed.r0.k(ed.r0.j(ed.r0.j(new LinkedHashSet(), setG), setG2), cVar9), cVar2), cVar6), cVar8);
        f30643v = ed.r0.g(j0.f30613o, j0.f30614p);
        f30644w = ed.r0.g(j0.f30612n, j0.f30615q);
        f30645x = ed.k0.l(dd.w.a(j0.f30602d, o.a.H), dd.w.a(j0.f30604f, o.a.L), dd.w.a(j0.f30606h, o.a.f11909y), dd.w.a(j0.f30607i, o.a.P));
        f30646y = new mf.c("kotlin.annotations.jvm.UnderMigration");
    }

    public static final Set a() {
        return f30638q;
    }

    public static final Set b() {
        return f30641t;
    }

    public static final mf.c c() {
        return f30633l;
    }

    public static final mf.c d() {
        return f30636o;
    }

    public static final mf.c e() {
        return f30637p;
    }

    public static final mf.c f() {
        return f30630i;
    }

    public static final mf.c g() {
        return f30632k;
    }

    public static final mf.c h() {
        return f30631j;
    }

    public static final mf.c i() {
        return f30627f;
    }

    public static final mf.c j() {
        return f30629h;
    }

    public static final mf.c k() {
        return f30623b;
    }

    public static final Set l() {
        return f30644w;
    }

    public static final Set m() {
        return f30639r;
    }

    public static final Set n() {
        return f30640s;
    }

    public static final Set o() {
        return f30643v;
    }

    public static final mf.c p() {
        return f30646y;
    }
}
