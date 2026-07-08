package gj;

import gj.b0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class z {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f14724k = Pattern.compile("[.,]");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f14725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f14726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f14728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f14729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f14730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f14731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f14732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f14733i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final double[] f14734j;

    private z(b0 b0Var, String[] strArr, int i10, int i11, int i12, int i13, int i14, int i15, int[] iArr, double[] dArr) {
        this.f14725a = b0Var;
        this.f14726b = strArr;
        this.f14727c = i10;
        this.f14728d = i11;
        this.f14729e = i12;
        this.f14730f = i13;
        this.f14731g = i14;
        this.f14732h = i15;
        this.f14733i = iArr;
        this.f14734j = dArr;
    }

    private static String[] a(int i10) {
        String[] strArr = new String[i10];
        f(strArr, 1, i10, "\\S+");
        return strArr;
    }

    private int b(int i10, int i11, int i12, int i13, int i14, int i15) {
        return c(i10, i10 + i11 + i13 + i14, i12 - i14, -i11, i13 - i15, -i12);
    }

    private int c(int i10, int i11, int i12, int i13, int i14, int i15) {
        return (((((((((i10 * 10) + i11 + 5) * 10) + i12 + 5) * 10) + i13 + 5) * 10) + i14 + 5) * 10) + i15 + 5;
    }

    private double e(Matcher matcher, int i10, double d10) {
        if (i10 < 0) {
            return 0.0d;
        }
        return d10 * Double.parseDouble(matcher.group(i10));
    }

    private static void f(String[] strArr, int i10, int i11, String str) {
        if (i10 > 0) {
            int i12 = i10 - 1;
            Arrays.fill(strArr, i12, i11 + i12, str);
        }
    }

    public y d(InputStream inputStream, String str) {
        Pattern pattern;
        double[] dArrE;
        int i10;
        int i11;
        Matcher matcher;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        c0 c0Var;
        int i20;
        z zVar = this;
        int i21 = 1;
        char c10 = 0;
        if (inputStream == null) {
            throw new hj.a(hj.f.UNABLE_TO_FIND_FILE, str);
        }
        Pattern patternCompile = Pattern.compile("^\\p{Space}*j\\p{Space}*=\\p{Space}*(\\p{Digit}+)[\\p{Alpha}\\p{Space}]+=\\p{Space}*(\\p{Digit}+)\\p{Space}*$");
        StringBuilder sb2 = new StringBuilder("^\\p{Space}*");
        int i22 = 0;
        while (i22 < zVar.f14726b.length) {
            sb2.append("(");
            sb2.append(zVar.f14726b[i22]);
            sb2.append(")");
            sb2.append(i22 < zVar.f14726b.length - 1 ? "\\p{Space}+" : "\\p{Space}*$");
            i22++;
        }
        Pattern patternCompile2 = Pattern.compile(sb2.toString());
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            try {
                a0 a0Var = zVar.f14725a == null ? new a0(new double[0]) : null;
                HashMap map = new HashMap();
                String line = bufferedReader.readLine();
                int i23 = 0;
                int i24 = 0;
                int i25 = -1;
                int i26 = -1;
                int i27 = 0;
                while (line != null) {
                    String strReplace = line.replace((char) 8722, '-');
                    int i28 = i23 + 1;
                    Matcher matcher2 = patternCompile2.matcher(strReplace);
                    if (matcher2.matches()) {
                        if (i26 > 0 && Integer.parseInt(matcher2.group(i21)) != i26) {
                            hj.f fVar = hj.f.UNABLE_TO_PARSE_LINE_IN_FILE;
                            Integer numValueOf = Integer.valueOf(i28);
                            String strGroup = matcher2.group();
                            Object[] objArr = new Object[3];
                            objArr[c10] = numValueOf;
                            objArr[i21] = str;
                            objArr[2] = strGroup;
                            throw new hj.a(fVar, objArr);
                        }
                        int i29 = zVar.f14729e;
                        int i30 = i29 < 0 ? 0 : Integer.parseInt(matcher2.group(i29));
                        int i31 = zVar.f14729e;
                        int i32 = i31 < 0 ? 0 : Integer.parseInt(matcher2.group(i31 + 1));
                        int i33 = zVar.f14729e;
                        int i34 = i33 < 0 ? 0 : Integer.parseInt(matcher2.group(i33 + 2));
                        int i35 = zVar.f14729e;
                        int i36 = i35 < 0 ? 0 : Integer.parseInt(matcher2.group(i35 + 3));
                        int i37 = zVar.f14729e;
                        int i38 = i37 < 0 ? 0 : Integer.parseInt(matcher2.group(i37 + 4));
                        int i39 = zVar.f14729e;
                        int i40 = i39 < 0 ? 0 : Integer.parseInt(matcher2.group(i39 + 5));
                        int i41 = i30;
                        int i42 = zVar.f14730f;
                        if (i42 < 0) {
                            i10 = i24;
                            i11 = 0;
                        } else {
                            i10 = i24;
                            i11 = Integer.parseInt(f14724k.matcher(matcher2.group(i42)).replaceAll(""));
                        }
                        int i43 = zVar.f14728d;
                        int i44 = i43 < 0 ? 0 : Integer.parseInt(matcher2.group(i43));
                        int i45 = i11;
                        int i46 = Integer.parseInt(matcher2.group(zVar.f14731g));
                        int i47 = i44;
                        int i48 = Integer.parseInt(matcher2.group(zVar.f14731g + 1));
                        int i49 = i32;
                        int i50 = Integer.parseInt(matcher2.group(zVar.f14731g + 2));
                        int i51 = i34;
                        int i52 = Integer.parseInt(matcher2.group(zVar.f14731g + 3));
                        int i53 = i36;
                        int i54 = Integer.parseInt(matcher2.group(zVar.f14731g + 4));
                        int i55 = i38;
                        int i56 = zVar.f14732h;
                        int i57 = i56 < 0 ? 0 : Integer.parseInt(matcher2.group(i56));
                        int i58 = zVar.f14732h;
                        int i59 = i58 < 0 ? 0 : Integer.parseInt(matcher2.group(i58 + 1));
                        int i60 = zVar.f14732h;
                        int i61 = i60 < 0 ? 0 : Integer.parseInt(matcher2.group(i60 + 2));
                        int i62 = zVar.f14732h;
                        int i63 = i62 < 0 ? 0 : Integer.parseInt(matcher2.group(i62 + 3));
                        int i64 = zVar.f14732h;
                        int i65 = i64 < 0 ? 0 : Integer.parseInt(matcher2.group(i64 + 4));
                        int i66 = zVar.f14732h;
                        int i67 = i66 < 0 ? 0 : Integer.parseInt(matcher2.group(i66 + 5));
                        int i68 = zVar.f14732h;
                        int i69 = i68 < 0 ? 0 : Integer.parseInt(matcher2.group(i68 + 6));
                        int i70 = zVar.f14732h;
                        int i71 = i70 < 0 ? 0 : Integer.parseInt(matcher2.group(i70 + 7));
                        int i72 = zVar.f14732h;
                        int i73 = i72 < 0 ? 0 : Integer.parseInt(matcher2.group(i72 + 8));
                        if (i45 > 0) {
                            int i74 = -i46;
                            int i75 = -i48;
                            int i76 = -i50;
                            int i77 = -i52;
                            int i78 = -i54;
                            matcher = matcher2;
                            int i79 = i40;
                            i12 = i10;
                            pattern = patternCompile2;
                            if (i45 == zVar.c(i41, i49, i51, i53, i55, i79)) {
                                zVar = this;
                                if (i45 == zVar.b(i41, i74, i75, i76, i77, i78)) {
                                    i14 = i41;
                                    i13 = i74;
                                    i16 = i75;
                                    i17 = i76;
                                    i18 = i77;
                                    i19 = i78;
                                    i15 = 2;
                                }
                            }
                            throw new hj.a(hj.f.UNABLE_TO_PARSE_LINE_IN_FILE, Integer.valueOf(i28), str, matcher.group());
                        }
                        matcher = matcher2;
                        pattern = patternCompile2;
                        i12 = i10;
                        i13 = i46;
                        i14 = i47;
                        i15 = 2;
                        i16 = i48;
                        i17 = i50;
                        i18 = i52;
                        i19 = i54;
                        long jC = w.c(i14, i13, i16, i17, i18, i19, i57, i59, i61, i63, i65, i67, i69, i71, i73);
                        c0 c0VarD = map.containsKey(Long.valueOf(jC)) ? (c0) map.get(Long.valueOf(jC)) : c0.d(i14, i13, i16, i17, i18, i19, i57, i59, i61, i63, i65, i67, i69, i71, i73);
                        boolean z10 = false;
                        int i80 = 0;
                        while (true) {
                            int[] iArr = zVar.f14733i;
                            if (i80 >= iArr.length / i15) {
                                break;
                            }
                            int i81 = i80 * 2;
                            long j10 = jC;
                            Matcher matcher3 = matcher;
                            double dE = zVar.e(matcher3, iArr[i81], zVar.f14734j[i81]);
                            int i82 = i81 + 1;
                            int i83 = i12;
                            double dE2 = zVar.e(matcher3, zVar.f14733i[i82], zVar.f14734j[i82]);
                            int i84 = i80;
                            boolean z11 = z10;
                            if (aj.l.b(dE, 0.0d, 0) && aj.l.b(dE2, 0.0d, 0)) {
                                i20 = i83;
                                c0Var = c0VarD;
                            } else {
                                c0VarD.a(0, i27 + i84, dE, dE2);
                                c0Var = c0VarD;
                                i20 = i83 + 1;
                                z11 = true;
                            }
                            i80 = i84 + 1;
                            c0VarD = c0Var;
                            i12 = i20;
                            matcher = matcher3;
                            z10 = z11;
                            jC = j10;
                            i15 = 2;
                        }
                        boolean z12 = z10;
                        long j11 = jC;
                        int i85 = i12;
                        c0 c0Var2 = c0VarD;
                        if (z12) {
                            map.put(Long.valueOf(j11), c0Var2);
                        }
                        if (i26 > 0) {
                            i26++;
                        }
                        i24 = i85;
                    } else {
                        int i86 = i24;
                        pattern = patternCompile2;
                        Matcher matcher4 = patternCompile.matcher(strReplace);
                        if (matcher4.matches()) {
                            int i87 = Integer.parseInt(matcher4.group(1));
                            int i88 = i27 + 1;
                            if (i87 != i88 && (i27 != 0 || i87 != 0)) {
                                throw new hj.a(hj.f.MISSING_SERIE_J_IN_FILE, Integer.valueOf(i88), str, Integer.valueOf(i28));
                            }
                            if (i87 == 0) {
                                i26 = 1;
                            }
                            if (i87 > 0 && i86 != i25) {
                                throw new hj.a(hj.f.NOT_A_SUPPORTED_IERS_DATA_FILE, str);
                            }
                            i27 = i87;
                            i25 = Integer.parseInt(matcher4.group(2));
                            i24 = 0;
                        } else {
                            if (a0Var == null && (dArrE = zVar.f14725a.e(strReplace)) != null) {
                                a0Var = new a0(dArrE);
                            }
                            i24 = i86;
                        }
                    }
                    line = bufferedReader.readLine();
                    i23 = i28;
                    patternCompile2 = pattern;
                    i21 = 1;
                    c10 = 0;
                }
                int i89 = i24;
                if (a0Var == null || map.isEmpty()) {
                    throw new hj.a(hj.f.NOT_A_SUPPORTED_IERS_DATA_FILE, str);
                }
                if (i25 > 0 && i89 != i25) {
                    throw new hj.a(hj.f.NOT_A_SUPPORTED_IERS_DATA_FILE, str);
                }
                y yVar = new y(a0Var, map);
                bufferedReader.close();
                return yVar;
            } finally {
            }
        } catch (IOException e10) {
            throw new hj.a(e10, new ui.a(e10.getMessage()), new Object[0]);
        }
    }

    public z g(int i10) {
        String[] strArr = (String[]) this.f14726b.clone();
        f(strArr, this.f14731g, 5, "\\S+");
        f(strArr, i10, 5, "[-+]?\\p{Digit}+");
        return new z(this.f14725a, strArr, this.f14727c, this.f14728d, this.f14729e, this.f14730f, i10, this.f14732h, this.f14733i, this.f14734j);
    }

    public z h(int i10) {
        String[] strArr = (String[]) this.f14726b.clone();
        f(strArr, this.f14732h, 9, "\\S+");
        f(strArr, i10, 9, "[-+]?\\p{Digit}+");
        return new z(this.f14725a, strArr, this.f14727c, this.f14728d, this.f14729e, this.f14730f, this.f14731g, i10, this.f14733i, this.f14734j);
    }

    public z i(int i10) {
        if (this.f14729e > 0 && i10 > 0) {
            throw new hj.a(hj.f.CANNOT_PARSE_BOTH_TAU_AND_GAMMA, new Object[0]);
        }
        String[] strArr = (String[]) this.f14726b.clone();
        f(strArr, this.f14728d, 1, "\\S+");
        f(strArr, i10, 1, "[-+]?\\p{Digit}+");
        return new z(this.f14725a, strArr, this.f14727c, i10, this.f14729e, this.f14730f, this.f14731g, this.f14732h, this.f14733i, this.f14734j);
    }

    public z j(int i10) {
        String[] strArr = (String[]) this.f14726b.clone();
        f(strArr, this.f14727c, 1, "\\S+");
        f(strArr, i10, 1, "\\S*");
        return new z(this.f14725a, strArr, i10, this.f14728d, this.f14729e, this.f14730f, this.f14731g, this.f14732h, this.f14733i, this.f14734j);
    }

    public z k(char c10, b0.a aVar) {
        return new z(new b0(c10, aVar), this.f14726b, this.f14727c, this.f14728d, this.f14729e, this.f14730f, this.f14731g, this.f14732h, this.f14733i, this.f14734j);
    }

    public z l(int i10, int i11, double d10, int i12, double d11) {
        int iC = (aj.d.C(i10, (this.f14733i.length / 2) - 1) + 1) * 2;
        int[] iArr = new int[iC];
        Arrays.fill(iArr, -1);
        int[] iArr2 = this.f14733i;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        int i13 = i10 * 2;
        iArr[i13] = i11;
        int i14 = i13 + 1;
        iArr[i14] = i12;
        double[] dArr = new double[iC];
        Arrays.fill(dArr, Double.NaN);
        double[] dArr2 = this.f14734j;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        dArr[i13] = d10;
        dArr[i14] = d11;
        String[] strArr = (String[]) this.f14726b.clone();
        int[] iArr3 = this.f14733i;
        if (i13 < iArr3.length) {
            f(strArr, iArr3[i13], 1, "\\S+");
        }
        f(strArr, i11, 1, "[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?");
        int[] iArr4 = this.f14733i;
        if (i14 < iArr4.length) {
            f(strArr, iArr4[i14], 1, "\\S+");
        }
        f(strArr, i12, 1, "[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?");
        return new z(this.f14725a, strArr, this.f14727c, this.f14728d, this.f14729e, this.f14730f, this.f14731g, this.f14732h, iArr, dArr);
    }

    public z(int i10) {
        this(null, a(i10), -1, -1, -1, -1, -1, -1, new int[0], new double[0]);
    }
}
