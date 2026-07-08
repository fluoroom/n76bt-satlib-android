package kj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.SortedSet;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import zj.s;

/* JADX INFO: loaded from: classes3.dex */
class a0 extends kj.a implements d0 {
    a0(String str, gj.g gVar, Supplier supplier) {
        super(str, gVar, supplier);
    }

    @Override // kj.d0
    public void a(s.g gVar, SortedSet sortedSet) {
        e0 e0Var = new e0(new a(gVar, g()));
        d(e0Var);
        sortedSet.addAll(e0Var.b());
    }

    static class a extends kj.b {

        /* JADX INFO: renamed from: kj.a0$a$a, reason: collision with other inner class name */
        private abstract class AbstractC0269a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Pattern f19974a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Pattern f19975b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Pattern f19976c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final int f19977d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final int f19978e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final int f19979f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final int f19980g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final String f19981h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private w0 f19982i;

            protected AbstractC0269a(String str, String str2, String str3, int i10, int i11, int i12, int i13, String str4) {
                this.f19974a = Pattern.compile(str);
                this.f19975b = Pattern.compile(str2);
                this.f19976c = Pattern.compile(str3);
                this.f19977d = i10;
                this.f19978e = i11;
                this.f19979f = i12;
                this.f19980g = i13;
                this.f19981h = str4;
            }

            protected w0 a() {
                return this.f19982i;
            }

            protected abstract void b(Matcher matcher);

            public i c(String str) {
                Matcher matcher = this.f19976c.matcher(str);
                if (!matcher.matches()) {
                    return null;
                }
                yj.i iVar = new yj.i(Integer.parseInt(matcher.group(this.f19977d)), Integer.parseInt(matcher.group(this.f19978e)), Integer.parseInt(matcher.group(this.f19979f)));
                int i10 = Integer.parseInt(matcher.group(this.f19980g));
                if (iVar.g() == i10) {
                    return d(matcher, iVar);
                }
                throw new hj.a(hj.f.INCONSISTENT_DATES_IN_IERS_FILE, this.f19981h, Integer.valueOf(iVar.i()), Integer.valueOf(iVar.h()), Integer.valueOf(iVar.d()), Integer.valueOf(i10));
            }

            protected abstract i d(Matcher matcher, yj.i iVar);

            public boolean e(String str) {
                Matcher matcher = this.f19974a.matcher(str);
                if (!matcher.matches()) {
                    Matcher matcher2 = this.f19975b.matcher(str);
                    if (!matcher2.matches()) {
                        return false;
                    }
                    b(matcher2);
                    return true;
                }
                int i10 = Integer.parseInt(matcher.group(1));
                if (i10 == 5) {
                    this.f19982i = w0.ITRF_2005;
                } else if (i10 == 8) {
                    this.f19982i = w0.ITRF_2008;
                } else if (i10 == 14) {
                    this.f19982i = w0.ITRF_2014;
                } else {
                    if (i10 != 20) {
                        throw new hj.a(hj.f.NO_SUCH_ITRF_FRAME, matcher.group(1));
                    }
                    this.f19982i = w0.ITRF_2020;
                }
                return true;
            }
        }

        private class c extends AbstractC0269a {

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private boolean f19985k;

            c(String str) {
                super("^ +EOP +\\(IERS\\) +([0-9][0-9]) +C04.*", "^ *Date +MJD +x +y +UT1-UTC +LOD +((?:dPsi +dEps)|(?:dX +dY)) .*", "^(\\d+) +(\\d+) +(\\d+) +(\\d+) +(-?\\d+\\.\\d+) +(-?\\d+\\.\\d+) +(-?\\d+\\.\\d+) +(-?\\d+\\.\\d+) +(-?\\d+\\.\\d+) +(-?\\d+\\.\\d+)(?: +(-?\\d+\\.\\d+)){6}$", 1, 2, 3, 4, str);
            }

            @Override // kj.a0.a.AbstractC0269a
            protected void b(Matcher matcher) {
                this.f19985k = matcher.group(1).startsWith("dX");
            }

            @Override // kj.a0.a.AbstractC0269a
            protected i d(Matcher matcher, yj.i iVar) {
                double[] dArrB;
                double[] dArrA;
                yj.b bVar = new yj.b(iVar, a.this.d());
                double d10 = Double.parseDouble(matcher.group(5)) * 4.84813681109536E-6d;
                double d11 = Double.parseDouble(matcher.group(6)) * 4.84813681109536E-6d;
                double d12 = Double.parseDouble(matcher.group(7));
                double d13 = Double.parseDouble(matcher.group(8));
                if (this.f19985k) {
                    double[] dArr = {Double.parseDouble(matcher.group(9)) * 4.84813681109536E-6d, Double.parseDouble(matcher.group(10)) * 4.84813681109536E-6d};
                    dArrA = a.this.b().a(bVar, dArr[0], dArr[1]);
                    dArrB = dArr;
                } else {
                    double[] dArr2 = {Double.parseDouble(matcher.group(9)) * 4.84813681109536E-6d, Double.parseDouble(matcher.group(10)) * 4.84813681109536E-6d};
                    dArrB = a.this.b().b(bVar, dArr2[0], dArr2[1]);
                    dArrA = dArr2;
                }
                return new i(iVar.g(), d12, d13, d10, d11, Double.NaN, Double.NaN, dArrA[0], dArrA[1], dArrB[0], dArrB[1], a(), bVar);
            }
        }

        a(s.g gVar, yj.b0 b0Var) {
            super(gVar, null, b0Var);
        }

        @Override // kj.d0.a
        public Collection a(InputStream inputStream, String str) throws IOException {
            boolean z10;
            i iVarC;
            ArrayList arrayList = new ArrayList();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            try {
                AbstractC0269a[] abstractC0269aArr = {new c(str), new b(str)};
                AbstractC0269a abstractC0269a = null;
                boolean z11 = true;
                int i10 = 0;
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    i10++;
                    if (z11) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= 2) {
                                break;
                            }
                            AbstractC0269a abstractC0269a2 = abstractC0269aArr[i11];
                            if (abstractC0269a2.e(line)) {
                                abstractC0269a = abstractC0269a2;
                                break;
                            }
                            i11++;
                        }
                    }
                    if (abstractC0269a == null || (iVarC = abstractC0269a.c(line)) == null) {
                        z10 = false;
                    } else {
                        arrayList.add(iVarC);
                        z11 = false;
                        z10 = true;
                    }
                    if (!z11 && !z10) {
                        throw new hj.a(hj.f.UNABLE_TO_PARSE_LINE_IN_FILE, Integer.valueOf(i10), str, line);
                    }
                }
                if (z11) {
                    throw new hj.a(hj.f.NOT_A_SUPPORTED_IERS_DATA_FILE, str);
                }
                bufferedReader.close();
                return arrayList;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        private class b extends AbstractC0269a {
            b(String str) {
                super("^# +EOP +\\(IERS\\) +([0-9][0-9]) +C04.*", "^# +YR +MM +DD +H +MJD +x\\(\"\\) +y\\(\"\\) +UT1-UTC\\(s\\) +dX\\(\"\\) +dY\\(\"\\) +xrt\\(\"\\) +yrt\\'\"\\) +.*", "^(\\d+) +(\\d+) +(\\d+) +(\\d+) +(\\d+)\\.\\d+ +(-?\\d+\\.\\d+) +(-?\\d+\\.\\d+) +(-?\\d+\\.\\d+) +(-?\\d+\\.\\d+) +(-?\\d+\\.\\d+) +(-?\\d+\\.\\d+) +(-?\\d+\\.\\d+) +(-?\\d+\\.\\d+)(?: +(-?\\d+\\.\\d+)){8}$", 1, 2, 3, 5, str);
            }

            @Override // kj.a0.a.AbstractC0269a
            protected i d(Matcher matcher, yj.i iVar) {
                yj.b bVar = new yj.b(iVar, new yj.w(Integer.parseInt(matcher.group(4)), 0, 0.0d), a.this.d());
                double d10 = Double.parseDouble(matcher.group(6)) * 4.84813681109536E-6d;
                double d11 = Double.parseDouble(matcher.group(7)) * 4.84813681109536E-6d;
                double d12 = (Double.parseDouble(matcher.group(11)) * 4.84813681109536E-6d) / 86400.0d;
                double d13 = (Double.parseDouble(matcher.group(12)) * 4.84813681109536E-6d) / 86400.0d;
                double d14 = Double.parseDouble(matcher.group(8));
                double d15 = Double.parseDouble(matcher.group(13));
                double[] dArr = {Double.parseDouble(matcher.group(9)) * 4.84813681109536E-6d, Double.parseDouble(matcher.group(10)) * 4.84813681109536E-6d};
                double[] dArrA = a.this.b().a(bVar, dArr[0], dArr[1]);
                return new i(iVar.g(), d14, d15, d10, d11, d12, d13, dArrA[0], dArrA[1], dArr[0], dArr[1], a(), bVar);
            }

            @Override // kj.a0.a.AbstractC0269a
            protected void b(Matcher matcher) {
            }
        }
    }
}
