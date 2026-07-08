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
public class s extends gj.a implements n0 {

    public static class a implements n0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Pattern f32736a;

        public a() {
            StringBuilder sb2 = new StringBuilder("\\p{Blank}*(");
            for (n nVar : n.values()) {
                sb2.append(nVar.g());
                sb2.append("|");
            }
            sb2.delete(sb2.length() - 1, sb2.length());
            sb2.append(")");
            this.f32736a = Pattern.compile("^\\p{Blank}*\\p{Blank}*([-+]?\\p{Digit}+)" + sb2.toString() + "\\p{Blank}*([-+]?\\p{Digit}+)\\p{Blank}+=JD\\p{Blank}*([-+]?(?:\\p{Digit}+(?:\\.\\p{Digit}*)?|\\.\\p{Digit}+)(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+TAI-UTC=\\p{Blank}*([-+]?(?:\\p{Digit}+(?:\\.\\p{Digit}*)?|\\.\\p{Digit}+)(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+S\\p{Blank}+\\+\\p{Blank}+\\(MJD\\p{Blank}+-\\p{Blank}*([-+]?(?:\\p{Digit}+(?:\\.\\p{Digit}*)?|\\.\\p{Digit}+)(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}*\\)\\p{Blank}+X\\p{Blank}*([-+]?(?:\\p{Digit}+(?:\\.\\p{Digit}*)?|\\.\\p{Digit}+)(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}*S\\p{Blank}*$");
        }

        @Override // yj.n0.a
        public List a(InputStream inputStream, String str) throws Throwable {
            char c10;
            int i10;
            Throwable th2;
            ArrayList arrayList = new ArrayList();
            String line = null;
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                try {
                    i iVar = null;
                    line = bufferedReader.readLine();
                    i10 = 0;
                    while (line != null) {
                        i10++;
                        try {
                            Matcher matcher = this.f32736a.matcher(line);
                            if (matcher.matches()) {
                                i iVar2 = new i(Integer.parseInt(matcher.group(1)), n.h(matcher.group(2)), Integer.parseInt(matcher.group(3)));
                                c10 = 0;
                                try {
                                    i iVar3 = new i(i.f32660d, (int) aj.d.l(Double.parseDouble(matcher.group(4))));
                                    if (!iVar2.equals(iVar3)) {
                                        throw new hj.a(hj.f.INCONSISTENT_DATES_IN_IERS_FILE, str, Integer.valueOf(iVar2.i()), Integer.valueOf(iVar2.h()), Integer.valueOf(iVar2.d()), Integer.valueOf(iVar3.g()));
                                    }
                                    if (iVar != null && iVar2.compareTo(iVar) <= 0) {
                                        throw new hj.a(hj.f.NON_CHRONOLOGICAL_DATES_IN_FILE, str, Integer.valueOf(i10));
                                    }
                                    arrayList.add(new p(iVar2, (int) aj.d.M(Double.parseDouble(matcher.group(6))), y.N(matcher.group(5)), (int) (y.N(matcher.group(7)).v() / 86400000000000L)));
                                    iVar = iVar2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    line = line;
                                    th2 = th;
                                    try {
                                        try {
                                            bufferedReader.close();
                                            throw th2;
                                        } catch (NumberFormatException unused) {
                                            hj.f fVar = hj.f.UNABLE_TO_PARSE_LINE_IN_FILE;
                                            Object[] objArr = new Object[3];
                                            objArr[c10] = Integer.valueOf(i10);
                                            objArr[1] = str;
                                            objArr[2] = line;
                                            throw new hj.a(fVar, objArr);
                                        }
                                    } catch (Throwable th4) {
                                        th2.addSuppressed(th4);
                                        throw th2;
                                    }
                                }
                            }
                            line = bufferedReader.readLine();
                        } catch (Throwable th5) {
                            th = th5;
                            c10 = 0;
                        }
                    }
                    String str2 = line;
                    c10 = 0;
                    try {
                        bufferedReader.close();
                        if (arrayList.isEmpty()) {
                            throw new hj.a(hj.f.NO_ENTRIES_IN_IERS_UTC_TAI_HISTORY_FILE, str);
                        }
                        return arrayList;
                    } catch (NumberFormatException unused2) {
                        line = str2;
                        hj.f fVar2 = hj.f.UNABLE_TO_PARSE_LINE_IN_FILE;
                        Object[] objArr2 = new Object[3];
                        objArr2[c10] = Integer.valueOf(i10);
                        objArr2[1] = str;
                        objArr2[2] = line;
                        throw new hj.a(fVar2, objArr2);
                    }
                } catch (Throwable th6) {
                    c10 = 0;
                    th2 = th6;
                    i10 = 0;
                }
            } catch (NumberFormatException unused3) {
                c10 = 0;
                i10 = 0;
            }
        }
    }

    public s(String str, gj.g gVar) {
        super(str, gVar);
    }

    @Override // yj.n0
    public List c() {
        o0 o0Var = new o0(new a());
        d(o0Var);
        return o0Var.b();
    }
}
