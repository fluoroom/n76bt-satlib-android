package lk;

import android.content.Context;
import android.os.Build;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import fk.c;
import fk.j;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static int a(Context context, int i10) {
        return context.getTheme().obtainStyledAttributes(new int[]{i10}).getResourceId(0, 0);
    }

    public static List b(Context context) {
        ArrayList arrayList = new ArrayList();
        for (File file : context.getExternalCacheDirs()) {
            if (file != null) {
                arrayList.add(file.getPath().split("/Android")[0]);
            }
        }
        return arrayList;
    }

    public static String c(String str) {
        int iLastIndexOf = str.lastIndexOf(".");
        return iLastIndexOf == -1 ? "" : str.substring(iLastIndexOf + 1, str.length()).toLowerCase(Locale.getDefault());
    }

    private static String d(Context context, String str) {
        StorageVolume storageVolume;
        File file = new File(str);
        String name = file.getName();
        return name.equals("0") ? context.getString(j.f13337h) : (name.length() == 9 && name.charAt(4) == '-') ? (Build.VERSION.SDK_INT < 24 || (storageVolume = ((StorageManager) context.getSystemService(StorageManager.class)).getStorageVolume(file)) == null) ? context.getString(j.f13332c, name) : context.getString(j.f13333d, storageVolume.getDescription(context), name) : name;
    }

    public static String e(Context context, long j10) {
        double d10;
        double d11;
        String[] stringArray = context.getResources().getStringArray(c.f13300a);
        int length = stringArray.length;
        do {
            length--;
            if (length < 0) {
                return j10 + " " + stringArray[0];
            }
            d10 = j10;
            d11 = length;
        } while (d10 < Math.pow(1024.0d, d11));
        return Math.round(d10 / Math.pow(1024.0d, d11)) + " " + stringArray[length];
    }

    public static LinkedHashMap f(Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : b(context)) {
            linkedHashMap.put(str, d(context, str));
        }
        return linkedHashMap;
    }
}
