package zh;

import android.graphics.Color;

/* JADX INFO: loaded from: classes3.dex */
abstract class f {
    private static int a(double d10) {
        if (d10 < 0.0d) {
            return 0;
        }
        if (d10 > 255.0d) {
            return 255;
        }
        return (int) d10;
    }

    static int b(int i10) {
        return a((((((double) Color.red(i10)) * (-37.945d)) + (((double) Color.green(i10)) * (-74.494d)) + (((double) Color.blue(i10)) * 112.439d)) * 0.003906d) + 128.0d);
    }

    static int c(int i10) {
        return a((((((double) Color.red(i10)) * 112.439d) + (((double) Color.green(i10)) * (-94.154d)) + (((double) Color.blue(i10)) * (-18.285d))) * 0.003906d) + 128.0d);
    }

    static int d(int i10) {
        return a((((((double) Color.red(i10)) * 65.738d) + (((double) Color.green(i10)) * 129.057d) + (((double) Color.blue(i10)) * 25.064d)) * 0.003906d) + 16.0d);
    }
}
