package i5;

import android.content.res.AssetManager;
import dd.d0;
import gj.f;
import gj.g;
import gj.h;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Pattern;
import qd.p;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class d implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AssetManager f15769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15770c;

    public d(AssetManager assetManager, String str) {
        m.e(assetManager, "asset");
        m.e(str, "root");
        this.f15769b = assetManager;
        this.f15770c = str;
    }

    private final boolean e(Pattern pattern, gj.e eVar, g gVar, String str) throws IOException {
        boolean z10;
        String[] list = this.f15769b.list(str);
        if (list == null) {
            throw new hj.a(hj.f.NOT_A_DIRECTORY, str);
        }
        final p pVar = new p() { // from class: i5.a
            @Override // qd.p
            public final Object s(Object obj, Object obj2) {
                return Integer.valueOf(d.f((String) obj, (String) obj2));
            }
        };
        Arrays.sort(list, new Comparator() { // from class: i5.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return d.g(pVar, obj, obj2);
            }
        });
        hj.a e10 = null;
        boolean z11 = false;
        for (String str2 : list) {
            final String str3 = str + '/' + str2;
            try {
                if (eVar.c()) {
                    h hVarB = gVar.e().b(new h(str2, new h.e() { // from class: i5.c
                        @Override // gj.h.e
                        public final InputStream a() {
                            return d.h(this.f15767a, str3);
                        }
                    }));
                    m.d(hVarB, "applyRelevantFilters(...)");
                    if (pattern.matcher(hVarB.a()).matches()) {
                        InputStream inputStreamB = hVarB.b().b();
                        try {
                            eVar.a(inputStreamB, str3);
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = z11;
                        }
                        try {
                            d0 d0Var = d0.f10897a;
                            try {
                                od.a.a(inputStreamB, null);
                            } catch (hj.a e11) {
                                e10 = e11;
                            }
                            z11 = true;
                        } catch (Throwable th3) {
                            th = th3;
                            z10 = true;
                            Throwable th4 = th;
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                try {
                                    od.a.a(inputStreamB, th4);
                                    throw th5;
                                } catch (hj.a e12) {
                                    e10 = e12;
                                    z11 = z10;
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            } catch (hj.a e13) {
                e10 = e13;
            }
        }
        if (z11 || e10 == null) {
            return z11;
        }
        throw e10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(String str, String str2) {
        m.e(str, "obj");
        m.e(str2, "file");
        return str.compareTo(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(p pVar, Object obj, Object obj2) {
        return ((Number) pVar.s(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputStream h(d dVar, String str) {
        return dVar.f15769b.open(str);
    }

    @Override // gj.f
    public boolean a(Pattern pattern, gj.e eVar, g gVar) {
        m.e(pattern, "supported");
        m.e(eVar, "visitor");
        m.e(gVar, "manager");
        try {
            return e(pattern, eVar, gVar, this.f15770c);
        } catch (IOException e10) {
            throw new hj.a(e10, new ui.a(e10.getMessage()), new Object[0]);
        } catch (ParseException e11) {
            throw new hj.a(e11, new ui.a(e11.getMessage()), new Object[0]);
        }
    }

    public /* synthetic */ d(AssetManager assetManager, String str, int i10, rd.h hVar) {
        this(assetManager, (i10 & 2) != 0 ? "orekit-data" : str);
    }
}
