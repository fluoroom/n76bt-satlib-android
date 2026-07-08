package hj;

import java.text.MessageFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class a extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ui.c f15462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f15463b;

    public a(ui.c cVar, Object... objArr) {
        this.f15462a = cVar;
        this.f15463b = objArr == null ? new Object[0] : (Object[]) objArr.clone();
    }

    private String a(Locale locale) {
        ui.c cVar = this.f15462a;
        if (cVar == null) {
            return "";
        }
        try {
            String strM = cVar.m(locale);
            return strM == null ? "" : new MessageFormat(strM, locale).format(this.f15463b);
        } catch (Throwable th2) {
            addSuppressed(th2);
            return this.f15462a.F();
        }
    }

    public static a c(ui.g gVar) {
        for (Throwable cause = gVar; cause != null; cause = cause.getCause()) {
            if (cause instanceof a) {
                return (a) cause;
            }
        }
        return new a(gVar);
    }

    public String b(Locale locale) {
        return a(locale);
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return b(Locale.getDefault());
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return b(Locale.US);
    }

    public a(a aVar) {
        super(aVar);
        this.f15462a = aVar.f15462a;
        this.f15463b = (Object[]) aVar.f15463b.clone();
    }

    public a(ui.c cVar, Throwable th2) {
        super(th2);
        this.f15462a = cVar;
        this.f15463b = new Object[0];
    }

    public a(Throwable th2, ui.c cVar, Object... objArr) {
        super(th2);
        this.f15462a = cVar;
        this.f15463b = objArr == null ? new Object[0] : (Object[]) objArr.clone();
    }

    public a(ui.g gVar) {
        super(gVar);
        this.f15462a = gVar.d();
        this.f15463b = gVar.c();
    }
}
