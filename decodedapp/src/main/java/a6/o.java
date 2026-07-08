package a6;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static ArrayList a() {
        return new ArrayList();
    }

    public static ArrayList b(Object... objArr) {
        if (objArr == null) {
            return a();
        }
        ArrayList arrayList = new ArrayList(((objArr.length * 110) / 100) + 5);
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }
}
