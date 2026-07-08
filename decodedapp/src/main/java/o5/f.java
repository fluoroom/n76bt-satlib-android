package o5;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.benshikj.ht.R;
import com.dw.ht.activitys.MessageListActivity;
import com.dw.ht.activitys.PictureSendActivity;
import com.dw.ht.channels.ChannelEditorFragment;
import com.dw.ht.entitys.IIChannel;
import java.io.File;
import java.util.Locale;
import v4.m1;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static void a(Context context, d5.a aVar) {
        v3.j.e(context, ChannelEditorFragment.L4(context, aVar));
    }

    public static void b(Context context, String str, double d10, double d11) {
        v3.j.e(context, Intent.createChooser(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.ENGLISH, "geo:0,0?q=%f,%f(%s)", Double.valueOf(d10), Double.valueOf(d11), str))), null));
    }

    public static void c(Context context, String str, Location location) {
        v3.j.e(context, Intent.createChooser(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.ENGLISH, "geo:0,0?q=%f,%f(%s)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()), str))), null));
    }

    public static void d(Context context, d5.g gVar) {
        String str = gVar.f10614p == 3 ? gVar.f10600b : gVar.f10599a;
        if (context instanceof v3.b) {
            boolean zN = ((v3.b) context).N(null, gVar.f10609k == 0 ? R.id.send_aprs_message : R.id.send_bss_message, 0, 0, str);
            str = str;
            if (zN) {
                return;
            }
        }
        MessageListActivity.INSTANCE.a(context, str, gVar.f10609k == 0 ? m1.APRS : m1.BSS, 0L);
    }

    public static void e(Context context, File file) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setClass(context, PictureSendActivity.class);
        intent.putExtra("android.intent.extra.STREAM", FileProvider.h(context, "com.benshikj.ht.files", file));
        intent.setType("image/*");
        v3.j.e(context, intent);
    }

    public static void f(Context context, IIChannel iIChannel) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", Uri.parse(context.getString(R.string.ii_ch_share_uri)).buildUpon().appendQueryParameter("cid", String.valueOf(iIChannel.getChannelId())).appendQueryParameter("name", iIChannel.k()).build().toString());
        v3.j.e(context, Intent.createChooser(intent, null));
    }
}
