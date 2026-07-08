package hj;

import java.text.MessageFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class c extends IllegalArgumentException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ui.c f15466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f15467b;

    public c(ui.c cVar, Object... objArr) {
        this.f15466a = cVar;
        this.f15467b = objArr == null ? new Object[0] : (Object[]) objArr.clone();
    }

    private String a(Locale locale) {
        return this.f15466a == null ? "" : new MessageFormat(this.f15466a.m(locale), locale).format(this.f15467b);
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return a(Locale.getDefault());
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return a(Locale.US);
    }
}
