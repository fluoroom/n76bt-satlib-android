package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import h.j;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f1087a;

    private a(Context context) {
        this.f1087a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f1087a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f1087a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f1087a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 <= 480 || i11 <= 640) {
            return i10 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f1087a.getResources().getDimensionPixelSize(h.d.f14800b);
    }

    public int f() {
        TypedArray typedArrayObtainStyledAttributes = this.f1087a.obtainStyledAttributes(null, j.f14913a, h.a.f14742c, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(j.f14966j, 0);
        Resources resources = this.f1087a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(h.d.f14799a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f1087a.getResources().getBoolean(h.b.f14790a);
    }

    public boolean h() {
        return true;
    }
}
