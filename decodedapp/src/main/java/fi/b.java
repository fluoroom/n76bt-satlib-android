package fi;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Throwable f13111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f13112b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f13113c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f13114d = new HashMap();

    public b(Throwable th2) {
        this.f13111a = th2;
    }

    private String b(Locale locale, String str) {
        StringBuilder sb2 = new StringBuilder();
        int size = this.f13112b.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = (c) this.f13112b.get(i11);
            sb2.append(new MessageFormat(cVar.m(locale), locale).format((Object[]) this.f13113c.get(i11)));
            i10++;
            if (i10 < size) {
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public void a(c cVar, Object... objArr) {
        this.f13112b.add(cVar);
        this.f13113c.add(a.a(objArr));
    }

    public String c() {
        return e(Locale.getDefault());
    }

    public String d() {
        return e(Locale.US);
    }

    public String e(Locale locale) {
        return b(locale, ": ");
    }
}
