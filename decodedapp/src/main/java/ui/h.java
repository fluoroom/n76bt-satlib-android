package ui;

import java.text.MessageFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class h extends NullPointerException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f29252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f29253b;

    public h() {
        this(d.NULL_NOT_ALLOWED, new Object[0]);
    }

    private static String a(Locale locale, c cVar, Object... objArr) {
        return cVar == null ? "" : new MessageFormat(cVar.m(locale), locale).format(objArr);
    }

    public String b(Locale locale) {
        return a(locale, this.f29252a, this.f29253b);
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return b(Locale.getDefault());
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return b(Locale.US);
    }

    public h(c cVar, Object... objArr) {
        this.f29252a = cVar;
        this.f29253b = objArr == null ? new Object[0] : (Object[]) objArr.clone();
    }
}
