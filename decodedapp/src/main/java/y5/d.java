package y5;

import a6.k;
import a6.x;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f32430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources f32431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k f32432c;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SharedPreferences.Editor f32433a;

        public void a() {
            d.b(this.f32433a);
        }

        public a b(String str, byte[] bArr) {
            this.f32433a.putString(str, (bArr == null || bArr.length == 0) ? "null" : x.b(";", bArr));
            return this;
        }

        private a() {
            this.f32433a = d.this.f32430a.edit();
        }
    }

    public d(Context context, SharedPreferences sharedPreferences) {
        this.f32430a = sharedPreferences;
        this.f32431b = context.getResources();
        this.f32432c = new k(this.f32431b);
    }

    public static void b(SharedPreferences.Editor editor) {
        editor.apply();
    }

    public static Enum e(SharedPreferences sharedPreferences, String str, Enum r32) {
        try {
            return Enum.valueOf(r32.getClass(), sharedPreferences.getString(str, r32.name()));
        } catch (Exception unused) {
            return r32;
        }
    }

    public static int[] f(SharedPreferences sharedPreferences, String str) {
        return g(sharedPreferences.getString(str, null));
    }

    public static int[] g(String str) {
        if (str == null) {
            return null;
        }
        if ("null".equals(str)) {
            return d4.c.f10565e;
        }
        String[] strArrSplit = str.split(";");
        int[] iArr = new int[strArrSplit.length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            try {
                iArr[i10] = Integer.parseInt(strArrSplit[i10]);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return iArr;
    }

    public a c() {
        return new a();
    }

    public byte[] d(String str) {
        int[] iArrF = f(this.f32430a, str);
        if (iArrF == null) {
            return null;
        }
        byte[] bArr = new byte[iArrF.length];
        for (int i10 = 0; i10 < iArrF.length; i10++) {
            bArr[i10] = (byte) iArrF[i10];
        }
        return bArr;
    }
}
