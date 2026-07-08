package l1;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class l {
    public static final ArrayList a(Collection collection) {
        rd.m.e(collection, "<this>");
        return collection instanceof ArrayList ? (ArrayList) collection : new ArrayList(collection);
    }
}
