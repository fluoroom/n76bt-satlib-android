package a6;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    public static class a {
    }

    public static File a(File file, String str, long j10) {
        if (j10 < 1000) {
            return new File(file, str + j10);
        }
        return new File(a(file, str, j10 / 1000), str + (j10 % 1000));
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void c(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    public static int d(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT];
        int i10 = 0;
        while (true) {
            try {
                int i11 = inputStream.read(bArr);
                if (i11 < 0) {
                    return i10;
                }
                outputStream.write(bArr, 0, i11);
                i10 += i11;
            } finally {
                b(inputStream);
                b(outputStream);
            }
        }
    }

    public static void e(ContentResolver contentResolver, Uri uri, Uri uri2) throws Throwable {
        InputStream inputStreamOpenInputStream;
        OutputStream outputStreamOpenOutputStream = null;
        try {
            inputStreamOpenInputStream = contentResolver.openInputStream(uri);
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenInputStream = null;
        }
        try {
            outputStreamOpenOutputStream = contentResolver.openOutputStream(uri2);
            c(inputStreamOpenInputStream, outputStreamOpenOutputStream);
            b(outputStreamOpenOutputStream);
            b(inputStreamOpenInputStream);
        } catch (Throwable th3) {
            th = th3;
            b(outputStreamOpenOutputStream);
            b(inputStreamOpenInputStream);
            throw th;
        }
    }

    public static String f() {
        return g(System.currentTimeMillis());
    }

    public static String g(long j10) {
        return h().format(new Date(j10));
    }

    public static DateFormat h() {
        return new SimpleDateFormat("yyyyMMdd_HHmmss");
    }

    public static String i(Uri uri, Context context) {
        Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            String string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name")) : null;
            cursorQuery.close();
            return string;
        } catch (Throwable th2) {
            cursorQuery.close();
            throw th2;
        }
    }

    public static String j(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return null;
        }
        return new File(path).getName();
    }

    public static String k(Uri uri, Context context) {
        String scheme;
        if (uri == null || (scheme = uri.getScheme()) == null) {
            return null;
        }
        if (scheme.equals("content")) {
            return i(uri, context);
        }
        if (scheme.equals("file")) {
            return j(uri);
        }
        return null;
    }

    public static boolean l(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            return parentFile.mkdirs();
        }
        return true;
    }

    public static String m(String str, String str2) {
        return str.replaceAll("[<>/\\\\|:\"\\*\\?\n]", str2);
    }

    public static byte[] n(File file) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArrO = o(fileInputStream2);
                fileInputStream2.close();
                return bArrO;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static byte[] o(InputStream inputStream) throws IOException {
        byte[] bArrCopyOf = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
        int i10 = 0;
        while (true) {
            int i11 = inputStream.read(bArrCopyOf, i10, bArrCopyOf.length - i10);
            if (i11 < 0) {
                return Arrays.copyOf(bArrCopyOf, i10);
            }
            i10 += i11;
            if (bArrCopyOf.length - i10 < 65536) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
        }
    }

    public static String p(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf > 0 ? str.substring(0, iLastIndexOf) : str;
    }

    public static String q(long j10) {
        if (j10 >= 1000000000) {
            return String.format(Locale.getDefault(), "%.2f GB", Float.valueOf(j10 / 1.0E9f));
        }
        if (j10 >= 1000000) {
            return String.format(Locale.getDefault(), "%.2f MB", Float.valueOf(j10 / 1000000.0f));
        }
        if (j10 >= 1000) {
            return String.format(Locale.getDefault(), "%.2f KB", Float.valueOf(j10 / 1000.0f));
        }
        return j10 + " B";
    }
}
