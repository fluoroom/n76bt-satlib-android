package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.a;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1914a = aVar.p(iconCompat.f1914a, 1);
        iconCompat.f1916c = aVar.j(iconCompat.f1916c, 2);
        iconCompat.f1917d = aVar.r(iconCompat.f1917d, 3);
        iconCompat.f1918e = aVar.p(iconCompat.f1918e, 4);
        iconCompat.f1919f = aVar.p(iconCompat.f1919f, 5);
        iconCompat.f1920g = (ColorStateList) aVar.r(iconCompat.f1920g, 6);
        iconCompat.f1922i = aVar.t(iconCompat.f1922i, 7);
        iconCompat.f1923j = aVar.t(iconCompat.f1923j, 8);
        iconCompat.i();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.x(true, true);
        iconCompat.j(aVar.f());
        int i10 = iconCompat.f1914a;
        if (-1 != i10) {
            aVar.F(i10, 1);
        }
        byte[] bArr = iconCompat.f1916c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1917d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i11 = iconCompat.f1918e;
        if (i11 != 0) {
            aVar.F(i11, 4);
        }
        int i12 = iconCompat.f1919f;
        if (i12 != 0) {
            aVar.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f1920g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f1922i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f1923j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
