package hj;

import java.text.MessageFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class d extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ui.c f15468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f15469b;

    public d(ui.c cVar, Object... objArr) {
        this.f15468a = cVar;
        this.f15469b = objArr == null ? new Object[0] : (Object[]) objArr.clone();
    }

    private String a(Locale locale) {
        return this.f15468a == null ? "" : new MessageFormat(this.f15468a.m(locale), locale).format(this.f15469b);
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
