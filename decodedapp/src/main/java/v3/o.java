package v3;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f29590a;

    public static boolean a(Context context) {
        Boolean bool = f29590a;
        if (bool != null) {
            return bool.booleanValue();
        }
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        Boolean boolValueOf = Boolean.valueOf(context.getPackageManager().resolveActivity(intent, WXMediaMessage.THUMB_LENGTH_LIMIT) != null);
        f29590a = boolValueOf;
        return boolValueOf.booleanValue();
    }
}
