package kj;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.RtlSpacingHelper;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class x0 implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f20259b = new b("", w0.ITRF_2014, RtlSpacingHelper.UNDEFINED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f20260a = new ArrayList();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f20261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final w0 f20262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f20263c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f20264d;

        public b(String str, w0 w0Var, int i10, int i11) {
            this.f20261a = str;
            this.f20262b = w0Var;
            this.f20263c = i10;
            this.f20264d = i11;
        }

        public boolean a(String str) {
            return str.startsWith(this.f20261a, aj.d.C(str.lastIndexOf("/"), str.lastIndexOf("\\")) + 1);
        }

        public w0 b() {
            return this.f20262b;
        }

        public boolean c(int i10) {
            return this.f20263c <= i10 && i10 < this.f20264d;
        }
    }

    private class c implements gj.e {
        private c() {
        }

        @Override // gj.e
        public void a(InputStream inputStream, String str) throws Throwable {
            char c10;
            int i10;
            Throwable th2;
            String strGroup;
            w0 w0VarD;
            int iG;
            int iG2;
            Pattern patternCompile = Pattern.compile("^(\\S+)\\s+-+\\s+-+\\s+([Ii][Tt][Rr][Ff][-_ ]?[0-9]{2,4})$");
            Pattern patternCompile2 = Pattern.compile("^(\\S+)\\s+-+\\s+(\\d\\d\\d\\d)-(\\d\\d)-(\\d\\d)\\s+([Ii][Tt][Rr][Ff][-_ ]?[0-9]{2,4})$");
            Pattern patternCompile3 = Pattern.compile("^(\\S+)\\s+(\\d\\d\\d\\d)-(\\d\\d)-(\\d\\d)\\s+-+\\s+([Ii][Tt][Rr][Ff][-_ ]?[0-9]{2,4})$");
            Pattern patternCompile4 = Pattern.compile("^(\\S+)\\s+(\\d\\d\\d\\d)-(\\d\\d)-(\\d\\d)\\s+(\\d\\d\\d\\d)-(\\d\\d)-(\\d\\d)\\s+([Ii][Tt][Rr][Ff][-_ ]?[0-9]{2,4})$");
            int i11 = 3;
            String line = null;
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                    try {
                        line = bufferedReader.readLine();
                        i10 = 0;
                        while (line != null) {
                            i10++;
                            try {
                                line = line.trim();
                                if (!line.startsWith("#") && !line.isEmpty()) {
                                    Matcher matcher = patternCompile.matcher(line);
                                    if (matcher.matches()) {
                                        try {
                                            strGroup = matcher.group(1);
                                            w0VarD = w0.d(matcher.group(2));
                                            iG = RtlSpacingHelper.UNDEFINED;
                                            iG2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                                            c10 = 0;
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            c10 = 0;
                                            try {
                                                bufferedReader.close();
                                                throw th2;
                                            } catch (Throwable th4) {
                                                th2.addSuppressed(th4);
                                                throw th2;
                                            }
                                        }
                                    } else {
                                        Matcher matcher2 = patternCompile2.matcher(line);
                                        c10 = 0;
                                        if (matcher2.matches()) {
                                            strGroup = matcher2.group(1);
                                            iG2 = new yj.i(Integer.parseInt(matcher2.group(2)), Integer.parseInt(matcher2.group(i11)), Integer.parseInt(matcher2.group(4))).g();
                                            w0VarD = w0.d(matcher2.group(5));
                                            iG = RtlSpacingHelper.UNDEFINED;
                                        } else {
                                            Matcher matcher3 = patternCompile3.matcher(line);
                                            if (matcher3.matches()) {
                                                strGroup = matcher3.group(1);
                                                iG = new yj.i(Integer.parseInt(matcher3.group(2)), Integer.parseInt(matcher3.group(3)), Integer.parseInt(matcher3.group(4))).g();
                                                w0VarD = w0.d(matcher3.group(5));
                                                iG2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                                            } else {
                                                Matcher matcher4 = patternCompile4.matcher(line);
                                                if (!matcher4.matches()) {
                                                    throw new hj.a(hj.f.UNABLE_TO_PARSE_LINE_IN_FILE, Integer.valueOf(i10), str, line);
                                                }
                                                strGroup = matcher4.group(1);
                                                iG = new yj.i(Integer.parseInt(matcher4.group(2)), Integer.parseInt(matcher4.group(3)), Integer.parseInt(matcher4.group(4))).g();
                                                iG2 = new yj.i(Integer.parseInt(matcher4.group(5)), Integer.parseInt(matcher4.group(6)), Integer.parseInt(matcher4.group(7))).g();
                                                w0VarD = w0.d(matcher4.group(8));
                                            }
                                        }
                                    }
                                    if (!strGroup.contains("\\")) {
                                        try {
                                            if (!strGroup.contains("/")) {
                                                try {
                                                    x0.this.f20260a.add(new b(strGroup, w0VarD, iG, iG2));
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    th2 = th;
                                                    bufferedReader.close();
                                                    throw th2;
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                        }
                                    }
                                    hj.f fVar = hj.f.ITRF_VERSIONS_PREFIX_ONLY;
                                    Object[] objArr = new Object[1];
                                    objArr[c10] = strGroup;
                                    throw new hj.a(fVar, objArr);
                                }
                                line = bufferedReader.readLine();
                                i11 = 3;
                            } catch (Throwable th7) {
                                th = th7;
                                c10 = 0;
                            }
                        }
                        bufferedReader.close();
                    } catch (Throwable th8) {
                        c10 = 0;
                        th2 = th8;
                        i10 = 0;
                    }
                } catch (IllegalArgumentException e10) {
                    e = e10;
                    hj.f fVar2 = hj.f.UNABLE_TO_PARSE_LINE_IN_FILE;
                    Object[] objArr2 = new Object[3];
                    objArr2[c10] = Integer.valueOf(i10);
                    objArr2[1] = str;
                    objArr2[2] = line;
                    throw new hj.a(e, fVar2, objArr2);
                }
            } catch (IllegalArgumentException e11) {
                e = e11;
                c10 = 0;
                i10 = 0;
                hj.f fVar22 = hj.f.UNABLE_TO_PARSE_LINE_IN_FILE;
                Object[] objArr22 = new Object[3];
                objArr22[c10] = Integer.valueOf(i10);
                objArr22[1] = str;
                objArr22[2] = line;
                throw new hj.a(e, fVar22, objArr22);
            }
        }

        @Override // gj.e
        public boolean c() {
            return x0.this.f20260a.isEmpty();
        }
    }

    public x0(String str, gj.g gVar) {
        gVar.d(str, new c());
    }

    @Override // kj.z0
    public b a(String str, int i10) {
        for (b bVar : this.f20260a) {
            if (bVar.a(str) && bVar.c(i10)) {
                return bVar;
            }
        }
        return f20259b;
    }
}
