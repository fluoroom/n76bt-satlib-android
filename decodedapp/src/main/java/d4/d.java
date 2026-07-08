package d4;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    private static int a(int i10) {
        return i10 + 5 + (i10 / 10);
    }

    public static ArrayList b() {
        return new ArrayList();
    }

    public static ArrayList c(Object... objArr) {
        ArrayList arrayList = new ArrayList(a(objArr == null ? 0 : objArr.length));
        if (objArr != null) {
            Collections.addAll(arrayList, objArr);
        }
        return arrayList;
    }
}
