package kj;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.RtlSpacingHelper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kj.x0;
import zj.s;

/* JADX INFO: loaded from: classes3.dex */
class e extends kj.a implements d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f20053d = Pattern.compile("^ +1 - (\\p{Upper}+) \\p{Upper}+ \\p{Upper}+.*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f20054e = Pattern.compile("^ +2 - SMOOTHED \\p{Upper}+ \\p{Upper}+.*((?:DPSI, DEPSILON)|(?:dX, dY)).*");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f20055f = Pattern.compile("^ +3 - \\p{Upper}+ \\p{Upper}+ \\p{Upper}+.*");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f20056g = Pattern.compile("^\\p{Blank}+Final( Bulletin B)? values.*");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f20057h = Pattern.compile("^\\p{Blank}+Preliminary extension.*");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f20058i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f20059j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f20060k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f20061l;

    static class a extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private x0.b f20062d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f20063e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Map f20064f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f20065g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f20066h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f20067i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f20068j;

        a(s.g gVar, z0 z0Var, yj.b0 b0Var) {
            super(gVar, z0Var, b0Var);
            this.f20064f = new HashMap();
            this.f20065g = 0;
            this.f20067i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            this.f20068j = RtlSpacingHelper.UNDEFINED;
        }

        private void e(boolean z10, BufferedReader bufferedReader, String str) {
            int i10;
            char c10;
            double[] dArrB;
            double[] dArrA;
            this.f20066h = bufferedReader.readLine();
            while (this.f20066h != null) {
                this.f20065g++;
                Matcher matcher = e.f20059j.matcher(this.f20066h);
                if (matcher.matches()) {
                    int i11 = Integer.parseInt(matcher.group(1));
                    double d10 = Double.parseDouble(matcher.group(2)) * 4.84813681109536E-6d;
                    double d11 = Double.parseDouble(matcher.group(3)) * 4.84813681109536E-6d;
                    double d12 = Double.parseDouble(matcher.group(4));
                    double dA = bk.k.f4182h.a(Double.parseDouble(matcher.group(5)));
                    if (i11 >= this.f20067i) {
                        yj.b bVar = new yj.b(new yj.i(yj.i.f32661e, i11), d());
                        if (z10) {
                            c10 = 1;
                            bk.k kVar = bk.k.f4181g;
                            i10 = i11;
                            dArrB = new double[]{kVar.a(Double.parseDouble(matcher.group(6))), kVar.a(Double.parseDouble(matcher.group(7)))};
                            dArrA = b().a(bVar, dArrB[0], dArrB[1]);
                        } else {
                            i10 = i11;
                            c10 = 1;
                            bk.k kVar2 = bk.k.f4181g;
                            double[] dArr = {kVar2.a(Double.parseDouble(matcher.group(6))), kVar2.a(Double.parseDouble(matcher.group(7)))};
                            dArrB = b().b(bVar, dArr[0], dArr[1]);
                            dArrA = dArr;
                        }
                        x0.b bVar2 = this.f20062d;
                        int i12 = i10;
                        if (bVar2 == null || !bVar2.c(i12)) {
                            this.f20062d = c().a(str, i12);
                        }
                        this.f20063e.add(new i(i12, d12, dA, d10, d11, Double.NaN, Double.NaN, dArrA[0], dArrA[c10], dArrB[0], dArrB[c10], this.f20062d.b(), bVar));
                        this.f20066h = i12 < this.f20068j ? bufferedReader.readLine() : null;
                    } else {
                        this.f20066h = bufferedReader.readLine();
                    }
                } else {
                    this.f20066h = bufferedReader.readLine();
                }
            }
        }

        private void f(BufferedReader bufferedReader, String str) {
            this.f20066h = bufferedReader.readLine();
            while (this.f20066h != null) {
                this.f20065g++;
                Matcher matcher = e.f20061l.matcher(this.f20066h);
                if (matcher.matches()) {
                    int i10 = Integer.parseInt(matcher.group(1));
                    if (i10 >= this.f20067i) {
                        double dA = bk.k.f4182h.a(Double.parseDouble(matcher.group(2)));
                        double[] dArr = (double[]) this.f20064f.get(Integer.valueOf(i10));
                        if (dArr == null) {
                            throw i(str);
                        }
                        dArr[1] = dA;
                        this.f20066h = i10 >= this.f20068j ? null : bufferedReader.readLine();
                    } else {
                        this.f20066h = bufferedReader.readLine();
                    }
                } else {
                    this.f20066h = bufferedReader.readLine();
                }
            }
        }

        private void g(BufferedReader bufferedReader, String str) {
            this.f20066h = bufferedReader.readLine();
            boolean z10 = false;
            while (this.f20066h != null) {
                this.f20065g++;
                if (e.f20056g.matcher(this.f20066h).matches()) {
                    z10 = true;
                } else if (z10) {
                    Matcher matcher = e.f20058i.matcher(this.f20066h);
                    if (matcher.matches()) {
                        int i10 = Integer.parseInt(matcher.group(1));
                        this.f20067i = aj.d.E(this.f20067i, i10);
                        this.f20068j = aj.d.C(this.f20068j, i10);
                    } else if (e.f20057h.matcher(this.f20066h).matches()) {
                        return;
                    }
                } else {
                    continue;
                }
                this.f20066h = bufferedReader.readLine();
            }
            throw new hj.a(hj.f.UNEXPECTED_END_OF_FILE_AFTER_LINE, str, Integer.valueOf(this.f20065g));
        }

        private void h(BufferedReader bufferedReader, String str) {
            boolean z10;
            this.f20066h = bufferedReader.readLine();
            boolean z11 = false;
            while (this.f20066h != null) {
                this.f20065g++;
                if (e.f20056g.matcher(this.f20066h).matches()) {
                    this.f20066h = bufferedReader.readLine();
                    z11 = true;
                } else {
                    if (z11) {
                        Matcher matcher = e.f20060k.matcher(this.f20066h);
                        if (matcher.matches()) {
                            int i10 = Integer.parseInt(matcher.group(1));
                            int i11 = Integer.parseInt(matcher.group(2));
                            int i12 = Integer.parseInt(matcher.group(3));
                            int i13 = Integer.parseInt(matcher.group(4));
                            if (new yj.i(i10, i11, i12).g() != i13) {
                                throw new hj.a(hj.f.INCONSISTENT_DATES_IN_IERS_FILE, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
                            }
                            this.f20067i = aj.d.E(this.f20067i, i13);
                            this.f20068j = aj.d.C(this.f20068j, i13);
                            bk.k kVar = bk.k.f4181g;
                            z10 = z11;
                            this.f20064f.put(Integer.valueOf(i13), new double[]{bk.k.f4182h.a(Double.parseDouble(matcher.group(7))), Double.NaN, kVar.a(Double.parseDouble(matcher.group(5))), kVar.a(Double.parseDouble(matcher.group(6))), kVar.a(Double.parseDouble(matcher.group(8))), kVar.a(Double.parseDouble(matcher.group(9)))});
                            this.f20066h = bufferedReader.readLine();
                        } else {
                            z10 = z11;
                            this.f20066h = e.f20057h.matcher(this.f20066h).matches() ? null : bufferedReader.readLine();
                        }
                    } else {
                        z10 = z11;
                        this.f20066h = bufferedReader.readLine();
                    }
                    z11 = z10;
                }
            }
        }

        private hj.a i(String str) {
            String name = e.class.getName();
            return new hj.a(hj.f.UNEXPECTED_FILE_FORMAT_ERROR_FOR_LOADER, str, name.substring(name.lastIndexOf(46) + 1));
        }

        private Matcher j(Pattern pattern, BufferedReader bufferedReader, String str) {
            Matcher matcher;
            do {
                this.f20066h = bufferedReader.readLine();
                String str2 = this.f20066h;
                if (str2 == null) {
                    throw new hj.a(hj.f.UNEXPECTED_END_OF_FILE_AFTER_LINE, str, Integer.valueOf(this.f20065g));
                }
                this.f20065g++;
                matcher = pattern.matcher(str2);
            } while (!matcher.matches());
            return matcher;
        }

        @Override // kj.d0.a
        public Collection a(InputStream inputStream, String str) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            try {
                this.f20064f.clear();
                this.f20065g = 0;
                this.f20067i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                this.f20068j = RtlSpacingHelper.UNDEFINED;
                this.f20063e = new ArrayList();
                this.f20062d = null;
                if ("EARTH".equals(j(e.f20053d, bufferedReader, str).group(1))) {
                    g(bufferedReader, str);
                    e(j(e.f20054e, bufferedReader, str).group(1).startsWith("dX"), bufferedReader, str);
                } else {
                    h(bufferedReader, str);
                    j(e.f20055f, bufferedReader, str);
                    f(bufferedReader, str);
                    for (Map.Entry entry : this.f20064f.entrySet()) {
                        int iIntValue = ((Integer) entry.getKey()).intValue();
                        double[] dArr = (double[]) entry.getValue();
                        if (Double.isNaN(dArr[0] + dArr[1] + dArr[2] + dArr[3] + dArr[4] + dArr[5])) {
                            throw i(str);
                        }
                        yj.b bVar = new yj.b(new yj.i(yj.i.f32661e, iIntValue), d());
                        double[] dArrA = b().a(bVar, dArr[4], dArr[5]);
                        x0.b bVar2 = this.f20062d;
                        if (bVar2 == null || !bVar2.c(iIntValue)) {
                            this.f20062d = c().a(str, iIntValue);
                        }
                        this.f20063e.add(new i(iIntValue, dArr[0], dArr[1], dArr[2], dArr[3], Double.NaN, Double.NaN, dArrA[0], dArrA[1], dArr[4], dArr[5], this.f20062d.b(), bVar));
                    }
                }
                bufferedReader.close();
                return this.f20063e;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        }
    }

    static {
        StringBuilder sb2 = new StringBuilder("^\\p{Blank}+(?:");
        for (yj.n nVar : yj.n.values()) {
            sb2.append(nVar.g());
            sb2.append('|');
        }
        sb2.delete(sb2.length() - 1, sb2.length());
        sb2.append(")");
        String string = sb2.toString();
        f20058i = Pattern.compile(string + "\\p{Blank}*[-+]?\\p{Digit}+\\p{Blank}+(\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit})\\p{Blank}+[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?\\p{Blank}+[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?\\p{Blank}+[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?\\p{Blank}+[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?\\p{Blank}+[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?\\p{Blank}+[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?\\p{Blank}*$");
        f20059j = Pattern.compile(string + "\\p{Blank}*[-+]?\\p{Digit}+\\p{Blank}+(\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit})\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}*$");
        f20060k = Pattern.compile("\\p{Blank}*([-+]?\\p{Digit}+)\\p{Blank}*([-+]?\\p{Digit}+)\\p{Blank}*([-+]?\\p{Digit}+)\\p{Blank}+(\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit})\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?\\p{Blank}+[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?\\p{Blank}+[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?\\p{Blank}+[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?\\p{Blank}+[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?\\p{Blank}*$");
        f20061l = Pattern.compile("\\p{Blank}*[-+]?\\p{Digit}+\\p{Blank}*[-+]?\\p{Digit}+\\p{Blank}*[-+]?\\p{Digit}+\\p{Blank}+(\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit})\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?\\p{Blank}+[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?\\p{Blank}+[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?\\p{Blank}*$");
    }

    e(String str, gj.g gVar, Supplier supplier) {
        super(str, gVar, supplier);
    }

    @Override // kj.d0
    public void a(s.g gVar, SortedSet sortedSet) {
        e0 e0Var = new e0(new a(gVar, new x0("itrf-versions.conf", e()), g()));
        d(e0Var);
        sortedSet.addAll(e0Var.b());
    }
}
