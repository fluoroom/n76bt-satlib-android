package hj;

import java.text.MessageFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class e extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ui.c f15470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f15471b;

    public e(Throwable th2) {
        super(th2);
        this.f15470a = f.INTERNAL_ERROR;
        this.f15471b = new String[]{"https://forum.orekit.org"};
    }

    private String a(Locale locale) {
        return new MessageFormat(this.f15470a.m(locale), locale).format(this.f15471b);
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
