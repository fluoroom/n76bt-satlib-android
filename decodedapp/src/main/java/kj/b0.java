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
import kj.x0;
import zj.s;

/* JADX INFO: loaded from: classes3.dex */
class b0 extends kj.a implements d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final bk.j f19994d = bk.j.k("as");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final bk.j f19995e = bk.j.k("as/day");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final bk.j f19996f = bk.j.k("s");

    class a extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final z0 f19997d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f19998e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f19999f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f20000g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f20001h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f20002i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f20003j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f20004k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f20005l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f20006m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f20007n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f20008o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f20009p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f20010q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f20011r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private x0.b f20012s;

        a(s.g gVar, yj.b0 b0Var) {
            super(gVar, null, b0Var);
            this.f19997d = new x0("itrf-versions.conf", b0.this.e());
        }

        private i e(String str, String str2) {
            String[] strArrSplit = str.split(";");
            yj.i iVar = new yj.i(Integer.parseInt(strArrSplit[this.f19999f]), Integer.parseInt(strArrSplit[this.f20000g]), Integer.parseInt(strArrSplit[this.f20001h]));
            int i10 = Integer.parseInt(strArrSplit[this.f19998e]);
            if (iVar.g() != i10) {
                throw new hj.a(hj.f.INCONSISTENT_DATES_IN_IERS_FILE, str2, Integer.valueOf(iVar.i()), Integer.valueOf(iVar.h()), Integer.valueOf(iVar.d()), Integer.valueOf(i10));
            }
            yj.b bVar = new yj.b(iVar, d());
            x0.b bVar2 = this.f20012s;
            if (bVar2 == null || !bVar2.c(i10)) {
                this.f20012s = this.f19997d.a(str2, i10);
            }
            double dF = f(strArrSplit, this.f20002i, b0.f19994d);
            double dF2 = f(strArrSplit, this.f20003j, b0.f19994d);
            double dF3 = f(strArrSplit, this.f20004k, b0.f19995e);
            double dF4 = f(strArrSplit, this.f20005l, b0.f19995e);
            double dF5 = f(strArrSplit, this.f20006m, b0.f19996f);
            double dF6 = f(strArrSplit, this.f20007n, b0.f19996f);
            int i11 = this.f20008o;
            if (i11 >= 0) {
                double dF7 = f(strArrSplit, i11, b0.f19994d);
                double dF8 = f(strArrSplit, this.f20009p, b0.f19994d);
                double[] dArrA = b().a(bVar, dF7, dF8);
                return new i(iVar.g(), dF5, dF6, dF, dF2, dF3, dF4, dArrA[0], dArrA[1], dF7, dF8, this.f20012s.b(), bVar);
            }
            double dF9 = f(strArrSplit, this.f20010q, b0.f19994d);
            double dF10 = f(strArrSplit, this.f20011r, b0.f19994d);
            double[] dArrB = b().b(bVar, dF9, dF10);
            return new i(iVar.g(), dF5, dF6, dF, dF2, dF3, dF4, dF9, dF10, dArrB[0], dArrB[1], this.f20012s.b(), bVar);
        }

        private double f(String[] strArr, int i10, bk.j jVar) {
            if (i10 < 0 || i10 >= strArr.length || strArr[i10].isEmpty()) {
                return Double.NaN;
            }
            return jVar.p(Double.parseDouble(strArr[i10]));
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private boolean g(java.lang.String r7) {
            /*
                Method dump skipped, instruction units count: 412
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kj.b0.a.g(java.lang.String):boolean");
        }

        @Override // kj.d0.a
        public Collection a(InputStream inputStream, String str) throws IOException {
            boolean zG;
            ArrayList arrayList = new ArrayList();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            try {
                this.f20012s = null;
                int i10 = 0;
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    i10++;
                    if (i10 == 1) {
                        zG = g(line);
                    } else {
                        arrayList.add(e(line, str));
                        zG = true;
                    }
                    if (!zG) {
                        throw new hj.a(hj.f.UNABLE_TO_PARSE_LINE_IN_FILE, Integer.valueOf(i10), str, line);
                    }
                }
                if (i10 < 2) {
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
    }

    b0(String str, gj.g gVar, Supplier supplier) {
        super(str, gVar, supplier);
    }

    @Override // kj.d0
    public void a(s.g gVar, SortedSet sortedSet) {
        e0 e0Var = new e0(new a(gVar, g()));
        d(e0Var);
        sortedSet.addAll(e0Var.b());
    }
}
