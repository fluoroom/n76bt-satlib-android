package v0;

import android.text.Editable;
import androidx.emoji2.text.n;

/* JADX INFO: loaded from: classes.dex */
final class b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f29460a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Editable.Factory f29461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class f29462c;

    private b() {
        try {
            f29462c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f29461b == null) {
            synchronized (f29460a) {
                try {
                    if (f29461b == null) {
                        f29461b = new b();
                    }
                } finally {
                }
            }
        }
        return f29461b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f29462c;
        return cls != null ? n.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
