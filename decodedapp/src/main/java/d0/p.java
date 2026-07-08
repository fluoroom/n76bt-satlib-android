package d0;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.text.TextUtils;
import android.util.Log;
import j0.j;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class p extends o {
    private static Typeface o(String str) {
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }

    @Override // d0.o
    protected Font m(j.b bVar) {
        Typeface typefaceO;
        Font fontJ;
        String strC = bVar.c();
        if (strC == null || (typefaceO = o(strC)) == null || (fontJ = j.j(typefaceO)) == null) {
            return null;
        }
        if (TextUtils.isEmpty(bVar.f())) {
            return fontJ;
        }
        try {
            return new Font.Builder(fontJ).setFontVariationSettings(bVar.f()).build();
        } catch (IOException unused) {
            Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
            return null;
        }
    }
}
