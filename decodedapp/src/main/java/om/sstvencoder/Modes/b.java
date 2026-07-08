package om.sstvencoder.Modes;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static yh.a a(Class cls, Bitmap bitmap, ai.a aVar) {
        if (bitmap == null || aVar == null || !f(cls)) {
            return null;
        }
        yh.c cVar = (yh.c) cls.getAnnotation(yh.c.class);
        if (bitmap.getWidth() != cVar.width() || bitmap.getHeight() != cVar.height()) {
            return null;
        }
        try {
            return (Mode) cls.getDeclaredConstructor(Bitmap.class, ai.a.class).newInstance(bitmap, aVar);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class b() {
        return Robot36.class;
    }

    public static String c() {
        return new c(b()).c();
    }

    public static yh.b d(Class cls) {
        if (f(cls)) {
            return new c(cls);
        }
        return null;
    }

    public static yh.b[] e() {
        return new yh.b[]{new c(Martin1.class), new c(Martin2.class), new c(PD50.class), new c(PD90.class), new c(PD120.class), new c(PD160.class), new c(PD180.class), new c(PD240.class), new c(PD290.class), new c(Scottie1.class), new c(Scottie2.class), new c(ScottieDX.class), new c(Robot36.class), new c(Robot72.class), new c(Wraase.class)};
    }

    private static boolean f(Class cls) {
        return Mode.class.isAssignableFrom(cls) && cls.isAnnotationPresent(yh.c.class) && cls.isAnnotationPresent(a.class);
    }
}
