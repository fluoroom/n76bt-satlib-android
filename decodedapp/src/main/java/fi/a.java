package fi;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static Object[] a(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj instanceof Object[]) {
                    for (Object obj2 : a((Object[]) obj)) {
                        arrayList.add(obj2);
                    }
                } else {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList.toArray();
    }
}
