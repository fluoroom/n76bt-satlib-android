package yj;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import yj.n0;

/* JADX INFO: loaded from: classes3.dex */
public class l0 extends gj.a implements n0 {

    public static class a implements n0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Pattern f32689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Pattern f32690b;

        public a() {
            StringBuilder sb2 = new StringBuilder("\\p{Blank}+(");
            for (n nVar : n.values()) {
                sb2.append(nVar.a());
                sb2.append('|');
            }
            sb2.delete(sb2.length() - 1, sb2.length());
            sb2.append(")\\.?");
            String string = sb2.toString();
            this.f32689a = Pattern.compile("^\\p{Blank}*((?:\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit})|(?:    ))" + string + "\\p{Blank}+([ 0-9]+)\\.?\\p{Blank}*-\\p{Blank}+\\p{Blank}*((?:\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit})|(?:    ))" + string + "\\p{Blank}+([ 0-9]+)\\.?\\p{Blank}+(\\p{Digit}+)s\\p{Blank}*$");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("^\\p{Blank}*((?:\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit})|(?:    ))");
            sb3.append(string);
            sb3.append("\\p{Blank}+([ 0-9]+)\\.?");
            sb3.append("\\p{Blank}*-\\p{Blank}+");
            sb3.append("\\p{Blank}+(\\p{Digit}+)s");
            sb3.append("\\p{Blank}*$");
            this.f32690b = Pattern.compile(sb3.toString());
        }

        @Override // yj.n0.a
        public List a(InputStream inputStream, String str) throws Throwable {
            char c10;
            int i10;
            Throwable th2;
            i iVar;
            String strGroup;
            int i11;
            Matcher matcher;
            ArrayList arrayList = new ArrayList();
            int i12 = 3;
            char c11 = 0;
            String line = null;
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                    try {
                        iVar = null;
                        line = bufferedReader.readLine();
                        strGroup = "    ";
                        i10 = 0;
                        i11 = 0;
                    } catch (Throwable th3) {
                        c10 = 0;
                        th2 = th3;
                        i10 = 0;
                    }
                    while (line != null) {
                        i10++;
                        try {
                            matcher = this.f32689a.matcher(line);
                        } catch (Throwable th4) {
                            th = th4;
                            c10 = 0;
                        }
                        if (matcher.matches()) {
                            if (i11 > 0) {
                                hj.f fVar = hj.f.UNEXPECTED_DATA_AFTER_LINE_IN_FILE;
                                Integer numValueOf = Integer.valueOf(i11);
                                Object[] objArr = new Object[i12];
                                objArr[c11] = numValueOf;
                                objArr[1] = str;
                                objArr[2] = line;
                                throw new hj.a(fVar, objArr);
                            }
                            th2 = th;
                            c10 = 0;
                            try {
                                bufferedReader.close();
                                throw th2;
                            } catch (Throwable th5) {
                                th2.addSuppressed(th5);
                                throw th2;
                            }
                        }
                        matcher = this.f32690b.matcher(line);
                        if (matcher.matches()) {
                            i11 = i10;
                        }
                        if (matcher.matches()) {
                            String strGroup2 = matcher.group(1);
                            if ("    ".equals(strGroup2)) {
                                strGroup2 = strGroup;
                            }
                            if (i10 != i11) {
                                try {
                                    strGroup = "    ".equals(matcher.group(4)) ? strGroup2 : matcher.group(4);
                                } catch (Throwable th6) {
                                    th2 = th6;
                                    c10 = 0;
                                }
                            }
                            c10 = 0;
                            try {
                                i iVar2 = new i(Integer.parseInt(strGroup2.trim()), n.h(matcher.group(2)), Integer.parseInt(matcher.group(i12).trim()));
                                int i13 = Integer.parseInt(matcher.group(matcher.groupCount()));
                                if (iVar != null && iVar2.compareTo(iVar) <= 0) {
                                    throw new hj.a(hj.f.NON_CHRONOLOGICAL_DATES_IN_FILE, str, Integer.valueOf(i10));
                                }
                                arrayList.add(new p(iVar2, i13));
                                iVar = iVar2;
                            } catch (Throwable th7) {
                                th = th7;
                                th2 = th;
                                bufferedReader.close();
                                throw th2;
                            }
                        }
                        line = bufferedReader.readLine();
                        i12 = 3;
                        c11 = 0;
                    }
                    bufferedReader.close();
                    if (arrayList.isEmpty()) {
                        throw new hj.a(hj.f.NO_ENTRIES_IN_IERS_UTC_TAI_HISTORY_FILE, str);
                    }
                    return arrayList;
                } catch (NumberFormatException unused) {
                    c10 = 0;
                    i10 = 0;
                    hj.f fVar2 = hj.f.UNABLE_TO_PARSE_LINE_IN_FILE;
                    Object[] objArr2 = new Object[3];
                    objArr2[c10] = Integer.valueOf(i10);
                    objArr2[1] = str;
                    objArr2[2] = line;
                    throw new hj.a(fVar2, objArr2);
                }
            } catch (NumberFormatException unused2) {
                hj.f fVar22 = hj.f.UNABLE_TO_PARSE_LINE_IN_FILE;
                Object[] objArr22 = new Object[3];
                objArr22[c10] = Integer.valueOf(i10);
                objArr22[1] = str;
                objArr22[2] = line;
                throw new hj.a(fVar22, objArr22);
            }
        }
    }

    public l0(gj.g gVar) {
        super("^UTC-TAI\\.history$", gVar);
    }

    @Override // yj.n0
    public List c() {
        o0 o0Var = new o0(new a());
        d(o0Var);
        return o0Var.b();
    }
}
