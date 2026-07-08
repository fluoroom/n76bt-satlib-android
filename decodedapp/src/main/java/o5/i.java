package o5;

import android.content.Context;
import android.content.Intent;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import com.benshikj.ht.R;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static String a(File file) {
        int iLastIndexOf = file.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(file.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    public static void b(Context context, d5.a aVar) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", context.getString(R.string.copy_and_start_app, context.getString(R.string.app_name), aVar.N().toString()));
        v3.j.e(context, Intent.createChooser(intent, context.getString(R.string.share_s, context.getString(R.string.channel))));
    }

    public static void c(Context context, d5.e eVar) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", context.getString(R.string.copy_and_start_app, context.getString(R.string.app_name), eVar.w()));
        v3.j.e(context, Intent.createChooser(intent, context.getString(R.string.share_s, context.getString(R.string.region))));
    }

    public static void d(Context context, File file) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", FileProvider.h(context, "com.benshikj.ht.files", file));
        intent.setType(a(file));
        intent.addFlags(1);
        v3.j.e(context, Intent.createChooser(intent, null));
    }
}
