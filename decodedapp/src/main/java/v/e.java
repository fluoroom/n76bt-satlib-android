package v;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import v.d;
import w.n;
import w.p;

/* JADX INFO: loaded from: classes.dex */
public class e {
    public static float K0 = 0.5f;
    int A0;
    boolean B0;
    boolean C0;
    public float[] D0;
    protected e[] E0;
    protected e[] F0;
    e G0;
    e H0;
    public int I0;
    public int J0;
    private boolean K;
    public d V;
    public d[] W;
    protected ArrayList X;
    private boolean[] Y;
    public b[] Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public e f29337a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    int f29339b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w.c f29340c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    int f29341c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w.c f29342d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f29343d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    protected int f29345e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    protected int f29347f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    protected int f29349g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    int f29351h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    int f29353i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    protected int f29355j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    protected int f29357k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    int f29359l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    protected int f29361m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    protected int f29363n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f29364o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    float f29365o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    float f29367p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private Object f29369q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f29371r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f29373s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f29375t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private String f29377u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private String f29379v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    boolean f29381w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    boolean f29383x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    boolean f29385y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    int f29387z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f29336a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p[] f29338b = new p[2];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w.l f29344e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n f29346f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean[] f29348g = {true, true};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f29350h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f29352i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f29354j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f29356k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f29358l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f29360m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u.a f29362n = new u.a(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f29366p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f29368q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f29370r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f29372s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f29374t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f29376u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f29378v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f29380w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f29382x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int[] f29384y = new int[2];

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f29386z = 0;
    public int A = 0;
    public float B = 1.0f;
    public int C = 0;
    public int D = 0;
    public float E = 1.0f;
    int F = -1;
    float G = 1.0f;
    private int[] H = {ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED};
    public float I = Float.NaN;
    private boolean J = false;
    private boolean L = false;
    private int M = 0;
    private int N = 0;
    public d O = new d(this, d.a.LEFT);
    public d P = new d(this, d.a.TOP);
    public d Q = new d(this, d.a.RIGHT);
    public d R = new d(this, d.a.BOTTOM);
    public d S = new d(this, d.a.BASELINE);
    d T = new d(this, d.a.CENTER_X);
    d U = new d(this, d.a.CENTER_Y);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29388a;

        static {
            int[] iArr = new int[d.a.values().length];
            f29388a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29388a[d.a.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29388a[d.a.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29388a[d.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29388a[d.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29388a[d.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29388a[d.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29388a[d.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29388a[d.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.a.CENTER);
        this.V = dVar;
        this.W = new d[]{this.O, this.Q, this.P, this.R, this.S, dVar};
        this.X = new ArrayList();
        this.Y = new boolean[2];
        b bVar = b.FIXED;
        this.Z = new b[]{bVar, bVar};
        this.f29337a0 = null;
        this.f29339b0 = 0;
        this.f29341c0 = 0;
        this.f29343d0 = 0.0f;
        this.f29345e0 = -1;
        this.f29347f0 = 0;
        this.f29349g0 = 0;
        this.f29351h0 = 0;
        this.f29353i0 = 0;
        this.f29355j0 = 0;
        this.f29357k0 = 0;
        this.f29359l0 = 0;
        float f10 = K0;
        this.f29365o0 = f10;
        this.f29367p0 = f10;
        this.f29371r0 = 0;
        this.f29373s0 = 0;
        this.f29375t0 = false;
        this.f29377u0 = null;
        this.f29379v0 = null;
        this.f29385y0 = false;
        this.f29387z0 = 0;
        this.A0 = 0;
        this.D0 = new float[]{-1.0f, -1.0f};
        this.E0 = new e[]{null, null};
        this.F0 = new e[]{null, null};
        this.G0 = null;
        this.H0 = null;
        this.I0 = -1;
        this.J0 = -1;
        d();
    }

    private void A0(StringBuilder sb2, String str, float f10, int i10) {
        if (f10 == 0.0f) {
            return;
        }
        sb2.append(str);
        sb2.append(" :  [");
        sb2.append(f10);
        sb2.append(",");
        sb2.append(i10);
        sb2.append("");
        sb2.append("],\n");
    }

    private void P(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, int i15, float f10, b bVar, float f11) {
        sb2.append(str);
        sb2.append(" :  {\n");
        z0(sb2, "      behavior", bVar.toString(), b.FIXED.toString());
        y0(sb2, "      size", i10, 0);
        y0(sb2, "      min", i11, 0);
        y0(sb2, "      max", i12, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        y0(sb2, "      matchMin", i14, 0);
        y0(sb2, "      matchDef", i15, 0);
        x0(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    private void Q(StringBuilder sb2, String str, d dVar) {
        if (dVar.f29322f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(dVar.f29322f);
        sb2.append("'");
        if (dVar.f29324h != Integer.MIN_VALUE || dVar.f29323g != 0) {
            sb2.append(",");
            sb2.append(dVar.f29323g);
            if (dVar.f29324h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(dVar.f29324h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    private void d() {
        this.X.add(this.O);
        this.X.add(this.P);
        this.X.add(this.Q);
        this.X.add(this.R);
        this.X.add(this.T);
        this.X.add(this.U);
        this.X.add(this.V);
        this.X.add(this.S);
    }

    private boolean f0(int i10) {
        d dVar;
        d dVar2;
        int i11 = i10 * 2;
        d[] dVarArr = this.W;
        d dVar3 = dVarArr[i11];
        d dVar4 = dVar3.f29322f;
        return (dVar4 == null || dVar4.f29322f == dVar3 || (dVar2 = (dVar = dVarArr[i11 + 1]).f29322f) == null || dVar2.f29322f != dVar) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:363:0x0563  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i(s.d r31, boolean r32, boolean r33, boolean r34, boolean r35, s.i r36, s.i r37, v.e.b r38, boolean r39, v.d r40, v.d r41, int r42, int r43, int r44, int r45, float r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            Method dump skipped, instruction units count: 1387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.e.i(s.d, boolean, boolean, boolean, boolean, s.i, s.i, v.e$b, boolean, v.d, v.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private void x0(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    private void y0(StringBuilder sb2, String str, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    private void z0(StringBuilder sb2, String str, String str2, String str3) {
        if (str3.equals(str2)) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(str2);
        sb2.append(",\n");
    }

    public b A() {
        return this.Z[0];
    }

    public int B() {
        d dVar = this.O;
        int i10 = dVar != null ? dVar.f29323g : 0;
        d dVar2 = this.Q;
        return dVar2 != null ? i10 + dVar2.f29323g : i10;
    }

    public void B0(int i10) {
        this.f29359l0 = i10;
        this.J = i10 > 0;
    }

    public int C() {
        return this.M;
    }

    public void C0(Object obj) {
        this.f29369q0 = obj;
    }

    public int D() {
        return this.N;
    }

    public void D0(String str) {
        this.f29377u0 = str;
    }

    public int E(int i10) {
        if (i10 == 0) {
            return W();
        }
        if (i10 == 1) {
            return x();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0087 A[PHI: r0
      0x0087: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:39:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0087 -> B:41:0x0088). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void E0(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L91
            int r1 = r9.length()
            if (r1 != 0) goto Lb
            goto L91
        Lb:
            int r1 = r9.length()
            r2 = 44
            int r2 = r9.indexOf(r2)
            r3 = 0
            r4 = 1
            r5 = -1
            if (r2 <= 0) goto L39
            int r6 = r1 + (-1)
            if (r2 >= r6) goto L39
            java.lang.String r6 = r9.substring(r3, r2)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L2b
            goto L36
        L2b:
            java.lang.String r3 = "H"
            boolean r3 = r6.equalsIgnoreCase(r3)
            if (r3 == 0) goto L35
            r3 = 1
            goto L36
        L35:
            r3 = -1
        L36:
            int r2 = r2 + r4
            r5 = r3
            r3 = r2
        L39:
            r2 = 58
            int r2 = r9.indexOf(r2)
            if (r2 < 0) goto L77
            int r1 = r1 - r4
            if (r2 >= r1) goto L77
            java.lang.String r1 = r9.substring(r3, r2)
            int r2 = r2 + r4
            java.lang.String r9 = r9.substring(r2)
            int r2 = r1.length()
            if (r2 <= 0) goto L87
            int r2 = r9.length()
            if (r2 <= 0) goto L87
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L86
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L86
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L87
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L87
            if (r5 != r4) goto L71
            float r9 = r9 / r1
            float r9 = java.lang.Math.abs(r9)     // Catch: java.lang.NumberFormatException -> L86
            goto L88
        L71:
            float r1 = r1 / r9
            float r9 = java.lang.Math.abs(r1)     // Catch: java.lang.NumberFormatException -> L86
            goto L88
        L77:
            java.lang.String r9 = r9.substring(r3)
            int r1 = r9.length()
            if (r1 <= 0) goto L87
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L86
            goto L88
        L86:
        L87:
            r9 = 0
        L88:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L90
            r8.f29343d0 = r9
            r8.f29345e0 = r5
        L90:
            return
        L91:
            r8.f29343d0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.e.E0(java.lang.String):void");
    }

    public int F() {
        return this.H[1];
    }

    public void F0(int i10) {
        if (this.J) {
            int i11 = i10 - this.f29359l0;
            int i12 = this.f29341c0 + i11;
            this.f29349g0 = i11;
            this.P.t(i11);
            this.R.t(i12);
            this.S.t(i10);
            this.f29368q = true;
        }
    }

    public int G() {
        return this.H[0];
    }

    public void G0(int i10, int i11) {
        if (this.f29366p) {
            return;
        }
        this.O.t(i10);
        this.Q.t(i11);
        this.f29347f0 = i10;
        this.f29339b0 = i11 - i10;
        this.f29366p = true;
    }

    public int H() {
        return this.f29363n0;
    }

    public void H0(int i10) {
        this.O.t(i10);
        this.f29347f0 = i10;
    }

    public int I() {
        return this.f29361m0;
    }

    public void I0(int i10) {
        this.P.t(i10);
        this.f29349g0 = i10;
    }

    public e J(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.R).f29322f) != null && dVar2.f29322f == dVar) {
                return dVar2.f29320d;
            }
            return null;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f29322f;
        if (dVar4 == null || dVar4.f29322f != dVar3) {
            return null;
        }
        return dVar4.f29320d;
    }

    public void J0(int i10, int i11) {
        if (this.f29368q) {
            return;
        }
        this.P.t(i10);
        this.R.t(i11);
        this.f29349g0 = i10;
        this.f29341c0 = i11 - i10;
        if (this.J) {
            this.S.t(i10 + this.f29359l0);
        }
        this.f29368q = true;
    }

    public e K() {
        return this.f29337a0;
    }

    public void K0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f29347f0 = i10;
        this.f29349g0 = i11;
        if (this.f29373s0 == 8) {
            this.f29339b0 = 0;
            this.f29341c0 = 0;
            return;
        }
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i16 < (i15 = this.f29339b0)) {
            i16 = i15;
        }
        if (bVarArr[1] == bVar2 && i17 < (i14 = this.f29341c0)) {
            i17 = i14;
        }
        this.f29339b0 = i16;
        this.f29341c0 = i17;
        int i18 = this.f29363n0;
        if (i17 < i18) {
            this.f29341c0 = i18;
        }
        int i19 = this.f29361m0;
        if (i16 < i19) {
            this.f29339b0 = i19;
        }
        int i20 = this.A;
        if (i20 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.f29339b0 = Math.min(this.f29339b0, i20);
        }
        int i21 = this.D;
        if (i21 > 0 && this.Z[1] == b.MATCH_CONSTRAINT) {
            this.f29341c0 = Math.min(this.f29341c0, i21);
        }
        int i22 = this.f29339b0;
        if (i16 != i22) {
            this.f29358l = i22;
        }
        int i23 = this.f29341c0;
        if (i17 != i23) {
            this.f29360m = i23;
        }
    }

    public e L(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.P).f29322f) != null && dVar2.f29322f == dVar) {
                return dVar2.f29320d;
            }
            return null;
        }
        d dVar3 = this.O;
        d dVar4 = dVar3.f29322f;
        if (dVar4 == null || dVar4.f29322f != dVar3) {
            return null;
        }
        return dVar4.f29320d;
    }

    public void L0(boolean z10) {
        this.J = z10;
    }

    public int M() {
        return X() + this.f29339b0;
    }

    public void M0(int i10) {
        this.f29341c0 = i10;
        int i11 = this.f29363n0;
        if (i10 < i11) {
            this.f29341c0 = i11;
        }
    }

    public p N(int i10) {
        if (i10 == 0) {
            return this.f29344e;
        }
        if (i10 == 1) {
            return this.f29346f;
        }
        return null;
    }

    public void N0(float f10) {
        this.f29365o0 = f10;
    }

    public void O(StringBuilder sb2) {
        sb2.append("  " + this.f29364o + ":{\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("    actualWidth:");
        sb3.append(this.f29339b0);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.f29341c0);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f29347f0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f29349g0);
        sb2.append("\n");
        Q(sb2, "left", this.O);
        Q(sb2, "top", this.P);
        Q(sb2, "right", this.Q);
        Q(sb2, "bottom", this.R);
        Q(sb2, "baseline", this.S);
        Q(sb2, "centerX", this.T);
        Q(sb2, "centerY", this.U);
        P(sb2, "    width", this.f29339b0, this.f29361m0, this.H[0], this.f29358l, this.f29386z, this.f29380w, this.B, this.Z[0], this.D0[0]);
        P(sb2, "    height", this.f29341c0, this.f29363n0, this.H[1], this.f29360m, this.C, this.f29382x, this.E, this.Z[1], this.D0[1]);
        A0(sb2, "    dimensionRatio", this.f29343d0, this.f29345e0);
        x0(sb2, "    horizontalBias", this.f29365o0, K0);
        x0(sb2, "    verticalBias", this.f29367p0, K0);
        y0(sb2, "    horizontalChainStyle", this.f29387z0, 0);
        y0(sb2, "    verticalChainStyle", this.A0, 0);
        sb2.append("  }");
    }

    public void O0(int i10) {
        this.f29387z0 = i10;
    }

    public void P0(int i10, int i11) {
        this.f29347f0 = i10;
        int i12 = i11 - i10;
        this.f29339b0 = i12;
        int i13 = this.f29361m0;
        if (i12 < i13) {
            this.f29339b0 = i13;
        }
    }

    public void Q0(b bVar) {
        this.Z[0] = bVar;
    }

    public float R() {
        return this.f29367p0;
    }

    public void R0(int i10, int i11, int i12, float f10) {
        this.f29380w = i10;
        this.f29386z = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.A = i12;
        this.B = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f29380w = 2;
    }

    public int S() {
        return this.A0;
    }

    public void S0(float f10) {
        this.D0[0] = f10;
    }

    public b T() {
        return this.Z[1];
    }

    protected void T0(int i10, boolean z10) {
        this.Y[i10] = z10;
    }

    public int U() {
        int i10 = this.O != null ? this.P.f29323g : 0;
        return this.Q != null ? i10 + this.R.f29323g : i10;
    }

    public void U0(boolean z10) {
        this.K = z10;
    }

    public int V() {
        return this.f29373s0;
    }

    public void V0(boolean z10) {
        this.L = z10;
    }

    public int W() {
        if (this.f29373s0 == 8) {
            return 0;
        }
        return this.f29339b0;
    }

    public void W0(int i10, int i11) {
        this.M = i10;
        this.N = i11;
        Z0(false);
    }

    public int X() {
        e eVar = this.f29337a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f29347f0 : ((f) eVar).S0 + this.f29347f0;
    }

    public void X0(int i10) {
        this.H[1] = i10;
    }

    public int Y() {
        e eVar = this.f29337a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f29349g0 : ((f) eVar).T0 + this.f29349g0;
    }

    public void Y0(int i10) {
        this.H[0] = i10;
    }

    public boolean Z() {
        return this.J;
    }

    public void Z0(boolean z10) {
        this.f29352i = z10;
    }

    public boolean a0(int i10) {
        if (i10 == 0) {
            return (this.O.f29322f != null ? 1 : 0) + (this.Q.f29322f != null ? 1 : 0) < 2;
        }
        return ((this.P.f29322f != null ? 1 : 0) + (this.R.f29322f != null ? 1 : 0)) + (this.S.f29322f != null ? 1 : 0) < 2;
    }

    public void a1(int i10) {
        if (i10 < 0) {
            this.f29363n0 = 0;
        } else {
            this.f29363n0 = i10;
        }
    }

    public boolean b0() {
        int size = this.X.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((d) this.X.get(i10)).m()) {
                return true;
            }
        }
        return false;
    }

    public void b1(int i10) {
        if (i10 < 0) {
            this.f29361m0 = 0;
        } else {
            this.f29361m0 = i10;
        }
    }

    public boolean c0() {
        return (this.f29358l == -1 && this.f29360m == -1) ? false : true;
    }

    public void c1(int i10, int i11) {
        this.f29347f0 = i10;
        this.f29349g0 = i11;
    }

    public boolean d0(int i10, int i11) {
        d dVar;
        d dVar2;
        if (i10 == 0) {
            d dVar3 = this.O.f29322f;
            return dVar3 != null && dVar3.n() && (dVar2 = this.Q.f29322f) != null && dVar2.n() && (this.Q.f29322f.e() - this.Q.f()) - (this.O.f29322f.e() + this.O.f()) >= i11;
        }
        d dVar4 = this.P.f29322f;
        if (dVar4 != null && dVar4.n() && (dVar = this.R.f29322f) != null && dVar.n() && (this.R.f29322f.e() - this.R.f()) - (this.P.f29322f.e() + this.P.f()) >= i11) {
            return true;
        }
        return false;
    }

    public void d1(e eVar) {
        this.f29337a0 = eVar;
    }

    public void e(f fVar, s.d dVar, HashSet hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            k.a(fVar, dVar, this);
            hashSet.remove(this);
            g(dVar, fVar.V1(64));
        }
        if (i10 == 0) {
            HashSet hashSetD = this.O.d();
            if (hashSetD != null) {
                Iterator it = hashSetD.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f29320d.e(fVar, dVar, hashSet, i10, true);
                }
            }
            HashSet hashSetD2 = this.Q.d();
            if (hashSetD2 != null) {
                Iterator it2 = hashSetD2.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).f29320d.e(fVar, dVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet hashSetD3 = this.P.d();
        if (hashSetD3 != null) {
            Iterator it3 = hashSetD3.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).f29320d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet hashSetD4 = this.R.d();
        if (hashSetD4 != null) {
            Iterator it4 = hashSetD4.iterator();
            while (it4.hasNext()) {
                ((d) it4.next()).f29320d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet hashSetD5 = this.S.d();
        if (hashSetD5 != null) {
            Iterator it5 = hashSetD5.iterator();
            while (it5.hasNext()) {
                ((d) it5.next()).f29320d.e(fVar, dVar, hashSet, i10, true);
            }
        }
    }

    public void e0(d.a aVar, e eVar, d.a aVar2, int i10, int i11) {
        o(aVar).b(eVar.o(aVar2), i10, i11, true);
    }

    public void e1(float f10) {
        this.f29367p0 = f10;
    }

    boolean f() {
        return (this instanceof l) || (this instanceof h);
    }

    public void f1(int i10) {
        this.A0 = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r13 != 3) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0566  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(s.d r51, boolean r52) {
        /*
            Method dump skipped, instruction units count: 1418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.e.g(s.d, boolean):void");
    }

    public boolean g0() {
        return this.f29370r;
    }

    public void g1(int i10, int i11) {
        this.f29349g0 = i10;
        int i12 = i11 - i10;
        this.f29341c0 = i12;
        int i13 = this.f29363n0;
        if (i12 < i13) {
            this.f29341c0 = i13;
        }
    }

    public boolean h() {
        return this.f29373s0 != 8;
    }

    public boolean h0(int i10) {
        return this.Y[i10];
    }

    public void h1(b bVar) {
        this.Z[1] = bVar;
    }

    public boolean i0() {
        d dVar = this.O;
        d dVar2 = dVar.f29322f;
        if (dVar2 != null && dVar2.f29322f == dVar) {
            return true;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f29322f;
        return dVar4 != null && dVar4.f29322f == dVar3;
    }

    public void i1(int i10, int i11, int i12, float f10) {
        this.f29382x = i10;
        this.C = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.D = i12;
        this.E = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f29382x = 2;
    }

    public void j(d.a aVar, e eVar, d.a aVar2, int i10) {
        d.a aVar3;
        d.a aVar4;
        boolean z10;
        d.a aVar5 = d.a.CENTER;
        if (aVar == aVar5) {
            if (aVar2 != aVar5) {
                d.a aVar6 = d.a.LEFT;
                if (aVar2 == aVar6 || aVar2 == d.a.RIGHT) {
                    j(aVar6, eVar, aVar2, 0);
                    j(d.a.RIGHT, eVar, aVar2, 0);
                    o(aVar5).a(eVar.o(aVar2), 0);
                    return;
                }
                d.a aVar7 = d.a.TOP;
                if (aVar2 == aVar7 || aVar2 == d.a.BOTTOM) {
                    j(aVar7, eVar, aVar2, 0);
                    j(d.a.BOTTOM, eVar, aVar2, 0);
                    o(aVar5).a(eVar.o(aVar2), 0);
                    return;
                }
                return;
            }
            d.a aVar8 = d.a.LEFT;
            d dVarO = o(aVar8);
            d.a aVar9 = d.a.RIGHT;
            d dVarO2 = o(aVar9);
            d.a aVar10 = d.a.TOP;
            d dVarO3 = o(aVar10);
            d.a aVar11 = d.a.BOTTOM;
            d dVarO4 = o(aVar11);
            boolean z11 = true;
            if ((dVarO == null || !dVarO.o()) && (dVarO2 == null || !dVarO2.o())) {
                j(aVar8, eVar, aVar8, 0);
                j(aVar9, eVar, aVar9, 0);
                z10 = true;
            } else {
                z10 = false;
            }
            if ((dVarO3 == null || !dVarO3.o()) && (dVarO4 == null || !dVarO4.o())) {
                j(aVar10, eVar, aVar10, 0);
                j(aVar11, eVar, aVar11, 0);
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                o(aVar5).a(eVar.o(aVar5), 0);
                return;
            }
            if (z10) {
                d.a aVar12 = d.a.CENTER_X;
                o(aVar12).a(eVar.o(aVar12), 0);
                return;
            } else {
                if (z11) {
                    d.a aVar13 = d.a.CENTER_Y;
                    o(aVar13).a(eVar.o(aVar13), 0);
                    return;
                }
                return;
            }
        }
        d.a aVar14 = d.a.CENTER_X;
        if (aVar == aVar14 && (aVar2 == (aVar4 = d.a.LEFT) || aVar2 == d.a.RIGHT)) {
            d dVarO5 = o(aVar4);
            d dVarO6 = eVar.o(aVar2);
            d dVarO7 = o(d.a.RIGHT);
            dVarO5.a(dVarO6, 0);
            dVarO7.a(dVarO6, 0);
            o(aVar14).a(dVarO6, 0);
            return;
        }
        d.a aVar15 = d.a.CENTER_Y;
        if (aVar == aVar15 && (aVar2 == (aVar3 = d.a.TOP) || aVar2 == d.a.BOTTOM)) {
            d dVarO8 = eVar.o(aVar2);
            o(aVar3).a(dVarO8, 0);
            o(d.a.BOTTOM).a(dVarO8, 0);
            o(aVar15).a(dVarO8, 0);
            return;
        }
        if (aVar == aVar14 && aVar2 == aVar14) {
            d.a aVar16 = d.a.LEFT;
            o(aVar16).a(eVar.o(aVar16), 0);
            d.a aVar17 = d.a.RIGHT;
            o(aVar17).a(eVar.o(aVar17), 0);
            o(aVar14).a(eVar.o(aVar2), 0);
            return;
        }
        if (aVar == aVar15 && aVar2 == aVar15) {
            d.a aVar18 = d.a.TOP;
            o(aVar18).a(eVar.o(aVar18), 0);
            d.a aVar19 = d.a.BOTTOM;
            o(aVar19).a(eVar.o(aVar19), 0);
            o(aVar15).a(eVar.o(aVar2), 0);
            return;
        }
        d dVarO9 = o(aVar);
        d dVarO10 = eVar.o(aVar2);
        if (dVarO9.p(dVarO10)) {
            d.a aVar20 = d.a.BASELINE;
            if (aVar == aVar20) {
                d dVarO11 = o(d.a.TOP);
                d dVarO12 = o(d.a.BOTTOM);
                if (dVarO11 != null) {
                    dVarO11.q();
                }
                if (dVarO12 != null) {
                    dVarO12.q();
                }
            } else if (aVar == d.a.TOP || aVar == d.a.BOTTOM) {
                d dVarO13 = o(aVar20);
                if (dVarO13 != null) {
                    dVarO13.q();
                }
                d dVarO14 = o(aVar5);
                if (dVarO14.j() != dVarO10) {
                    dVarO14.q();
                }
                d dVarG = o(aVar).g();
                d dVarO15 = o(aVar15);
                if (dVarO15.o()) {
                    dVarG.q();
                    dVarO15.q();
                }
            } else if (aVar == d.a.LEFT || aVar == d.a.RIGHT) {
                d dVarO16 = o(aVar5);
                if (dVarO16.j() != dVarO10) {
                    dVarO16.q();
                }
                d dVarG2 = o(aVar).g();
                d dVarO17 = o(aVar14);
                if (dVarO17.o()) {
                    dVarG2.q();
                    dVarO17.q();
                }
            }
            dVarO9.a(dVarO10, i10);
        }
    }

    public boolean j0() {
        return this.K;
    }

    public void j1(float f10) {
        this.D0[1] = f10;
    }

    public void k(d dVar, d dVar2, int i10) {
        if (dVar.h() == this) {
            j(dVar.k(), dVar2.h(), dVar2.k(), i10);
        }
    }

    public boolean k0() {
        d dVar = this.P;
        d dVar2 = dVar.f29322f;
        if (dVar2 != null && dVar2.f29322f == dVar) {
            return true;
        }
        d dVar3 = this.R;
        d dVar4 = dVar3.f29322f;
        return dVar4 != null && dVar4.f29322f == dVar3;
    }

    public void k1(int i10) {
        this.f29373s0 = i10;
    }

    public void l(e eVar, float f10, int i10) {
        d.a aVar = d.a.CENTER;
        e0(aVar, eVar, aVar, i10, 0);
        this.I = f10;
    }

    public boolean l0() {
        return this.L;
    }

    public void l1(int i10) {
        this.f29339b0 = i10;
        int i11 = this.f29361m0;
        if (i10 < i11) {
            this.f29339b0 = i11;
        }
    }

    public void m(s.d dVar) {
        dVar.q(this.O);
        dVar.q(this.P);
        dVar.q(this.Q);
        dVar.q(this.R);
        if (this.f29359l0 > 0) {
            dVar.q(this.S);
        }
    }

    public boolean m0() {
        return this.f29352i && this.f29373s0 != 8;
    }

    public void m1(int i10) {
        if (i10 < 0 || i10 > 3) {
            return;
        }
        this.f29378v = i10;
    }

    public void n() {
        if (this.f29344e == null) {
            this.f29344e = new w.l(this);
        }
        if (this.f29346f == null) {
            this.f29346f = new n(this);
        }
    }

    public boolean n0() {
        if (this.f29366p) {
            return true;
        }
        return this.O.n() && this.Q.n();
    }

    public void n1(int i10) {
        this.f29347f0 = i10;
    }

    public d o(d.a aVar) {
        switch (a.f29388a[aVar.ordinal()]) {
            case 1:
                return this.O;
            case 2:
                return this.P;
            case 3:
                return this.Q;
            case 4:
                return this.R;
            case 5:
                return this.S;
            case 6:
                return this.V;
            case 7:
                return this.T;
            case 8:
                return this.U;
            case 9:
                return null;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public boolean o0() {
        if (this.f29368q) {
            return true;
        }
        return this.P.n() && this.R.n();
    }

    public void o1(int i10) {
        this.f29349g0 = i10;
    }

    public int p() {
        return this.f29359l0;
    }

    public boolean p0() {
        return this.f29372s;
    }

    public void p1(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.F == -1) {
            if (z12 && !z13) {
                this.F = 0;
            } else if (!z12 && z13) {
                this.F = 1;
                if (this.f29345e0 == -1) {
                    this.G = 1.0f / this.G;
                }
            }
        }
        if (this.F == 0 && (!this.P.o() || !this.R.o())) {
            this.F = 1;
        } else if (this.F == 1 && (!this.O.o() || !this.Q.o())) {
            this.F = 0;
        }
        if (this.F == -1 && (!this.P.o() || !this.R.o() || !this.O.o() || !this.Q.o())) {
            if (this.P.o() && this.R.o()) {
                this.F = 0;
            } else if (this.O.o() && this.Q.o()) {
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
        if (this.F == -1) {
            int i10 = this.f29386z;
            if (i10 > 0 && this.C == 0) {
                this.F = 0;
            } else {
                if (i10 != 0 || this.C <= 0) {
                    return;
                }
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
    }

    public float q(int i10) {
        if (i10 == 0) {
            return this.f29365o0;
        }
        if (i10 == 1) {
            return this.f29367p0;
        }
        return -1.0f;
    }

    public void q0() {
        this.f29370r = true;
    }

    public void q1(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean zK = z10 & this.f29344e.k();
        boolean zK2 = z11 & this.f29346f.k();
        w.l lVar = this.f29344e;
        int i12 = lVar.f30966h.f30913g;
        n nVar = this.f29346f;
        int i13 = nVar.f30966h.f30913g;
        int i14 = lVar.f30967i.f30913g;
        int i15 = nVar.f30967i.f30913g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (zK) {
            this.f29347f0 = i12;
        }
        if (zK2) {
            this.f29349g0 = i13;
        }
        if (this.f29373s0 == 8) {
            this.f29339b0 = 0;
            this.f29341c0 = 0;
            return;
        }
        if (zK) {
            if (this.Z[0] == b.FIXED && i17 < (i11 = this.f29339b0)) {
                i17 = i11;
            }
            this.f29339b0 = i17;
            int i19 = this.f29361m0;
            if (i17 < i19) {
                this.f29339b0 = i19;
            }
        }
        if (zK2) {
            if (this.Z[1] == b.FIXED && i18 < (i10 = this.f29341c0)) {
                i18 = i10;
            }
            this.f29341c0 = i18;
            int i20 = this.f29363n0;
            if (i18 < i20) {
                this.f29341c0 = i20;
            }
        }
    }

    public int r() {
        return Y() + this.f29341c0;
    }

    public void r0() {
        this.f29372s = true;
    }

    public void r1(s.d dVar, boolean z10) {
        n nVar;
        w.l lVar;
        int iY = dVar.y(this.O);
        int iY2 = dVar.y(this.P);
        int iY3 = dVar.y(this.Q);
        int iY4 = dVar.y(this.R);
        if (z10 && (lVar = this.f29344e) != null) {
            w.f fVar = lVar.f30966h;
            if (fVar.f30916j) {
                w.f fVar2 = lVar.f30967i;
                if (fVar2.f30916j) {
                    iY = fVar.f30913g;
                    iY3 = fVar2.f30913g;
                }
            }
        }
        if (z10 && (nVar = this.f29346f) != null) {
            w.f fVar3 = nVar.f30966h;
            if (fVar3.f30916j) {
                w.f fVar4 = nVar.f30967i;
                if (fVar4.f30916j) {
                    iY2 = fVar3.f30913g;
                    iY4 = fVar4.f30913g;
                }
            }
        }
        int i10 = iY4 - iY2;
        if (iY3 - iY < 0 || i10 < 0 || iY == Integer.MIN_VALUE || iY == Integer.MAX_VALUE || iY2 == Integer.MIN_VALUE || iY2 == Integer.MAX_VALUE || iY3 == Integer.MIN_VALUE || iY3 == Integer.MAX_VALUE || iY4 == Integer.MIN_VALUE || iY4 == Integer.MAX_VALUE) {
            iY = 0;
            iY4 = 0;
            iY2 = 0;
            iY3 = 0;
        }
        K0(iY, iY2, iY3, iY4);
    }

    public Object s() {
        return this.f29369q0;
    }

    public boolean s0() {
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public String t() {
        return this.f29377u0;
    }

    public void t0() {
        this.O.q();
        this.P.q();
        this.Q.q();
        this.R.q();
        this.S.q();
        this.T.q();
        this.U.q();
        this.V.q();
        this.f29337a0 = null;
        this.I = Float.NaN;
        this.f29339b0 = 0;
        this.f29341c0 = 0;
        this.f29343d0 = 0.0f;
        this.f29345e0 = -1;
        this.f29347f0 = 0;
        this.f29349g0 = 0;
        this.f29355j0 = 0;
        this.f29357k0 = 0;
        this.f29359l0 = 0;
        this.f29361m0 = 0;
        this.f29363n0 = 0;
        float f10 = K0;
        this.f29365o0 = f10;
        this.f29367p0 = f10;
        b[] bVarArr = this.Z;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f29369q0 = null;
        this.f29371r0 = 0;
        this.f29373s0 = 0;
        this.f29379v0 = null;
        this.f29381w0 = false;
        this.f29383x0 = false;
        this.f29387z0 = 0;
        this.A0 = 0;
        this.B0 = false;
        this.C0 = false;
        float[] fArr = this.D0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f29374t = -1;
        this.f29376u = -1;
        int[] iArr = this.H;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f29380w = 0;
        this.f29382x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.D = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f29386z = 0;
        this.C = 0;
        this.f29350h = false;
        this.F = -1;
        this.G = 1.0f;
        this.f29385y0 = false;
        boolean[] zArr = this.f29348g;
        zArr[0] = true;
        zArr[1] = true;
        this.L = false;
        boolean[] zArr2 = this.Y;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f29352i = true;
        int[] iArr2 = this.f29384y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f29358l = -1;
        this.f29360m = -1;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.f29379v0 != null) {
            str = "type: " + this.f29379v0 + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f29377u0 != null) {
            str2 = "id: " + this.f29377u0 + " ";
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.f29347f0);
        sb2.append(", ");
        sb2.append(this.f29349g0);
        sb2.append(") - (");
        sb2.append(this.f29339b0);
        sb2.append(" x ");
        sb2.append(this.f29341c0);
        sb2.append(")");
        return sb2.toString();
    }

    public b u(int i10) {
        if (i10 == 0) {
            return A();
        }
        if (i10 == 1) {
            return T();
        }
        return null;
    }

    public void u0() {
        e eVarK = K();
        if (eVarK != null && (eVarK instanceof f) && ((f) K()).N1()) {
            return;
        }
        int size = this.X.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) this.X.get(i10)).q();
        }
    }

    public float v() {
        return this.f29343d0;
    }

    public void v0() {
        this.f29366p = false;
        this.f29368q = false;
        this.f29370r = false;
        this.f29372s = false;
        int size = this.X.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) this.X.get(i10)).r();
        }
    }

    public int w() {
        return this.f29345e0;
    }

    public void w0(s.c cVar) {
        this.O.s(cVar);
        this.P.s(cVar);
        this.Q.s(cVar);
        this.R.s(cVar);
        this.S.s(cVar);
        this.V.s(cVar);
        this.T.s(cVar);
        this.U.s(cVar);
    }

    public int x() {
        if (this.f29373s0 == 8) {
            return 0;
        }
        return this.f29341c0;
    }

    public float y() {
        return this.f29365o0;
    }

    public int z() {
        return this.f29387z0;
    }
}
