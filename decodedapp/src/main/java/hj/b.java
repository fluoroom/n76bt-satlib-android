package hj;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class b extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ui.c f15464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f15465b;

    public b(ui.c cVar, Object... objArr) {
        this.f15464a = cVar;
        this.f15465b = objArr == null ? new Object[0] : (Object[]) objArr.clone();
    }

    private String a(Locale locale) {
        return this.f15464a == null ? "" : new MessageFormat(this.f15464a.m(locale), locale).format(this.f15465b);
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
