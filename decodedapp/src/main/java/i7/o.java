package i7;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    public static final class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f15912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f15913b;

        private a(Set set, Set set2) {
            this.f15912a = set == null ? Collections.EMPTY_SET : set;
            this.f15913b = set2;
        }

        public static a a(Set set, Set set2) {
            return new a(set, set2);
        }

        public boolean b(Object obj) {
            Set set = this.f15913b;
            return !(set == null || set.contains(obj)) || this.f15912a.contains(obj);
        }
    }

    public static a a(Set set, Set set2) {
        if (set2 == null && (set == null || set.isEmpty())) {
            return null;
        }
        return a.a(set, set2);
    }

    public static Set b(Set set, Set set2) {
        if (set == null) {
            return set2;
        }
        if (set2 == null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (set.contains(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public static boolean c(Object obj, Collection collection, Collection collection2) {
        if (collection == null && collection2 == null) {
            return false;
        }
        return collection2 == null ? collection.contains(obj) : collection == null ? !collection2.contains(obj) : !collection2.contains(obj) || collection.contains(obj);
    }
}
