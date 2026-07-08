package e4;

import android.content.Context;
import android.content.Intent;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import java.io.File;
import v3.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static String a(File file) {
        return b(file.getName());
    }

    public static String b(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    public static void c(Context context, File file) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", FileProvider.h(context, context.getPackageName() + ".files", file));
        intent.setType(a(file));
        intent.addFlags(1);
        j.e(context, Intent.createChooser(intent, null));
    }
}
