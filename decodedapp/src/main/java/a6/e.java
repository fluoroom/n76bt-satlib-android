package a6;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import androidx.appcompat.app.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static void a(Context context, CharSequence charSequence, String str, String[] strArr) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(strArr == null ? ClipData.newPlainText(str, charSequence) : new ClipData(str, strArr, new ClipData.Item(charSequence)));
    }

    public static c.a b(c.a aVar, int i10) {
        return i10 != 17301543 ? aVar.f(i10) : aVar.h(R.attr.alertDialogIcon);
    }
}
