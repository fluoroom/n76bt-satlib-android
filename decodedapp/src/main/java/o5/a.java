package o5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import com.benshikj.ht.R;
import com.dw.ht.Main;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: h */
    private static a f23178h;

    /* JADX INFO: renamed from: a */
    private final Context f23179a;

    /* JADX INFO: renamed from: b */
    private final Bitmap f23180b;

    /* JADX INFO: renamed from: d */
    private final int f23182d;

    /* JADX INFO: renamed from: e */
    private final Canvas f23183e;

    /* JADX INFO: renamed from: g */
    private final float f23185g;

    /* JADX INFO: renamed from: c */
    private final HashMap f23181c = new HashMap();

    /* JADX INFO: renamed from: f */
    private final Paint f23184f = new Paint();

    public a(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f23179a = applicationContext;
        Bitmap bitmap = ((BitmapDrawable) applicationContext.getResources().getDrawable(R.drawable.aprs_symbols_64px)).getBitmap();
        this.f23180b = bitmap;
        this.f23182d = bitmap.getWidth() / 16;
        this.f23185g = bitmap.getWidth() / 16.0f;
        this.f23183e = new Canvas();
    }

    private Bitmap a() {
        int i10 = this.f23182d;
        return Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_4444);
    }

    public static synchronized a b() {
        try {
            if (f23178h == null) {
                f23178h = new a(Main.f5555g);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f23178h;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x004a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap c(java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.a.c(java.lang.String):android.graphics.Bitmap");
    }
}
