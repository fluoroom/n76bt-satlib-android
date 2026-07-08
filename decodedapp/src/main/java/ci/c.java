package ci;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class c extends m {
    @Override // ci.m
    protected String[] c(k kVar, String[] strArr, boolean z10) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z11 = false;
        while (i10 < strArr.length) {
            String str = strArr[i10];
            if ("--".equals(str)) {
                arrayList.add("--");
                z11 = true;
            } else if ("-".equals(str)) {
                arrayList.add("-");
            } else if (str.startsWith("-")) {
                String strB = o.b(str);
                if (kVar.e(strB)) {
                    arrayList.add(str);
                } else if (strB.indexOf(61) != -1 && kVar.e(strB.substring(0, strB.indexOf(61)))) {
                    arrayList.add(str.substring(0, str.indexOf(61)));
                    arrayList.add(str.substring(str.indexOf(61) + 1));
                } else if (kVar.e(str.substring(0, 2))) {
                    arrayList.add(str.substring(0, 2));
                    arrayList.add(str.substring(2));
                } else {
                    arrayList.add(str);
                    z11 = z10;
                }
            } else {
                arrayList.add(str);
            }
            if (z11) {
                while (true) {
                    i10++;
                    if (i10 < strArr.length) {
                        arrayList.add(strArr[i10]);
                    }
                }
            }
            i10++;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
