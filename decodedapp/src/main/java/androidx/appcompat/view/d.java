package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Configuration f1088f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources.Theme f1090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f1091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Configuration f1092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Resources f1093e;

    public d(Context context, int i10) {
        super(context);
        this.f1089a = i10;
    }

    private Resources b() {
        if (this.f1093e == null) {
            Configuration configuration = this.f1092d;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) {
                this.f1093e = super.getResources();
            } else {
                this.f1093e = createConfigurationContext(this.f1092d).getResources();
            }
        }
        return this.f1093e;
    }

    private void d() {
        boolean z10 = this.f1090b == null;
        if (z10) {
            this.f1090b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1090b.setTo(theme);
            }
        }
        f(this.f1090b, this.f1089a, z10);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f1088f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f1088f = configuration2;
        }
        return configuration.equals(f1088f);
    }

    public void a(Configuration configuration) {
        if (this.f1093e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f1092d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f1092d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f1089a;
    }

    protected void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1091c == null) {
            this.f1091c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1091c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1090b;
        if (theme != null) {
            return theme;
        }
        if (this.f1089a == 0) {
            this.f1089a = h.i.f14911f;
        }
        d();
        return this.f1090b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f1089a != i10) {
            this.f1089a = i10;
            d();
        }
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f1090b = theme;
    }
}
