package ui;

import java.text.MessageFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class g extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f29250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f29251b;

    public g(c cVar, Object... objArr) {
        this.f29250a = cVar;
        this.f29251b = objArr == null ? new Object[0] : (Object[]) objArr.clone();
    }

    private String a(Locale locale) {
        if (this.f29250a == null) {
            return "";
        }
        try {
            return new MessageFormat(this.f29250a.m(locale), locale).format(this.f29251b);
        } catch (Exception e10) {
            addSuppressed(e10);
            return this.f29250a.F();
        }
    }

    public String b(Locale locale) {
        return a(locale);
    }

    public Object[] c() {
        return (Object[]) this.f29251b.clone();
    }

    public c d() {
        return this.f29250a;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return b(Locale.getDefault());
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return b(Locale.US);
    }

    public g(Throwable th2, c cVar, Object... objArr) {
        super(th2);
        this.f29250a = cVar;
        this.f29251b = objArr == null ? new Object[0] : (Object[]) objArr.clone();
    }
}
