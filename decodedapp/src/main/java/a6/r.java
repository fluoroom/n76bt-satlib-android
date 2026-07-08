package a6;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Log;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f340a = ".files";

    public static void a(Intent intent, int i10) {
        b(intent, 1, 1, i10, i10);
    }

    public static void b(Intent intent, int i10, int i11, int i12, int i13) {
        intent.putExtra("crop", "true");
        intent.putExtra("scale", true);
        intent.putExtra("scaleUpIfNeeded", true);
        intent.putExtra("aspectX", i10);
        intent.putExtra("aspectY", i11);
        intent.putExtra("outputX", i12);
        intent.putExtra("outputY", i13);
        intent.putExtra("outputFormat", "PNG");
    }

    public static void c(Intent intent, Uri uri) {
        intent.putExtra("output", uri);
        intent.addFlags(3);
        intent.setClipData(ClipData.newRawUri("output", uri));
    }

    public static Uri d(Context context) {
        return FileProvider.h(context, context.getPackageName() + f340a, new File(i(context, e())));
    }

    private static String e() {
        Date date = new Date(System.currentTimeMillis());
        return "Photo-" + new SimpleDateFormat("'IMG'_yyyyMMdd_HHmmss", Locale.US).format(date) + "-cropped.jpg";
    }

    public static Uri f(Context context) {
        return FileProvider.h(context, context.getPackageName() + f340a, new File(i(context, g())));
    }

    private static String g() {
        Date date = new Date(System.currentTimeMillis());
        return "Photo-" + new SimpleDateFormat("'IMG'_yyyyMMdd_HHmmss", Locale.US).format(date) + ".jpg";
    }

    public static Bitmap h(Context context, Uri uri) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        try {
            return BitmapFactory.decodeStream(inputStreamOpenInputStream);
        } finally {
            d.b(inputStreamOpenInputStream);
        }
    }

    private static String i(Context context, String str) {
        File cacheDir = context.getCacheDir();
        cacheDir.mkdirs();
        return new File(cacheDir, str).getAbsolutePath();
    }

    public static boolean j(Context context, Uri uri, Uri uri2, boolean z10) throws Throwable {
        FileOutputStream fileOutputStreamCreateOutputStream;
        InputStream inputStreamOpenInputStream;
        byte[] bArr;
        int i10;
        try {
            fileOutputStreamCreateOutputStream = context.getContentResolver().openAssetFileDescriptor(uri2, "rw").createOutputStream();
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            } catch (Exception e10) {
                e = e10;
                inputStreamOpenInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                inputStreamOpenInputStream = null;
            }
        } catch (Exception e11) {
            e = e11;
            fileOutputStreamCreateOutputStream = null;
            inputStreamOpenInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStreamCreateOutputStream = null;
            inputStreamOpenInputStream = null;
        }
        try {
            try {
                bArr = new byte[16384];
                i10 = 0;
            } catch (Throwable th4) {
                th = th4;
            }
            while (true) {
                int i11 = inputStreamOpenInputStream.read(bArr);
                if (i11 <= 0) {
                    break;
                }
                fileOutputStreamCreateOutputStream.write(bArr, 0, i11);
                i10 += i11;
                th = th4;
                d.b(inputStreamOpenInputStream);
                d.b(fileOutputStreamCreateOutputStream);
                if (z10) {
                    context.getContentResolver().delete(uri, null, null);
                }
                throw th;
            }
            Log.v("PhotoUtils", "Wrote " + i10 + " bytes for photo " + uri.toString());
            d.b(inputStreamOpenInputStream);
            d.b(fileOutputStreamCreateOutputStream);
            if (!z10) {
                return true;
            }
            context.getContentResolver().delete(uri, null, null);
            return true;
        } catch (Exception e12) {
            e = e12;
            Log.e("PhotoUtils", "Failed to write photo: " + uri.toString() + " because: " + e);
            d.b(inputStreamOpenInputStream);
            d.b(fileOutputStreamCreateOutputStream);
            if (z10) {
                context.getContentResolver().delete(uri, null, null);
            }
            return false;
        }
    }
}
