package om.sstvencoder;

import android.graphics.Rect;
import android.os.Environment;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    static int a(int i10) {
        if (i10 == 3) {
            return 180;
        }
        if (i10 != 6) {
            return i10 != 8 ? 0 : 270;
        }
        return 90;
    }

    private static String b() {
        return new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
    }

    static String c() {
        return b() + ".wav";
    }

    static Rect d(int i10, int i11, int i12, int i13) {
        int i14 = (i10 * 9) / 10;
        int i15 = (i11 * 9) / 10;
        int i16 = i12 * i15;
        int i17 = i14 * i13;
        if (i16 < i17) {
            int i18 = i16 / i13;
            Rect rect = new Rect(0, 0, i18, i15);
            rect.offset((i10 - i18) / 2, (i11 - i15) / 2);
            return rect;
        }
        int i19 = i17 / i12;
        Rect rect2 = new Rect(0, 0, i14, i19);
        rect2.offset((i10 - i14) / 2, (i11 - i19) / 2);
        return rect2;
    }

    private static List e(String str) {
        File[] fileArrListFiles;
        ArrayList arrayList = new ArrayList();
        File file = new File("/system/fonts");
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    String absolutePath = file2.getAbsolutePath();
                    if (absolutePath.contains(str)) {
                        arrayList.add(absolutePath);
                    }
                }
            }
        }
        return arrayList;
    }

    private static String f(String str) {
        int length = str.length() - 1;
        int iIndexOf = str.indexOf(45);
        if (iIndexOf > 0 && iIndexOf < length) {
            return str.substring(0, iIndexOf);
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return (iLastIndexOf <= 0 || iLastIndexOf >= length) ? str : str.substring(0, iLastIndexOf);
    }

    public static String g(String str, int i10) {
        List<String> listE = e(str);
        String str2 = (String) listE.get(0);
        String strH = h(i10);
        if (!strH.isEmpty()) {
            for (String str3 : listE) {
                if (str3.contains(strH)) {
                    return str3;
                }
            }
        }
        return str2;
    }

    private static String h(int i10) {
        return i10 == 0 ? "-Regular" : i10 == 3 ? "-BoldItalic" : i10 == 1 ? "-Bold" : i10 == 2 ? "-Italic" : "";
    }

    static List i() {
        File[] fileArrListFiles;
        ArrayList arrayList = new ArrayList();
        File file = new File("/system/fonts");
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                String name = file2.getName();
                if (file2.isFile() && l(name)) {
                    String strF = f(name);
                    if (!arrayList.contains(strF)) {
                        arrayList.add(strF);
                    }
                }
            }
        }
        arrayList.add(0, "Default");
        return arrayList;
    }

    static float j(int i10, int i11) {
        return d(i10, i11, 320, 240).height() * 0.1f;
    }

    static boolean k() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    private static boolean l(String str) {
        return str.endsWith(".ttf") || str.endsWith(".otf");
    }
}
