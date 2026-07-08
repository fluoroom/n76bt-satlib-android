package z2;

import i2.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32877a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f32878b = new HashMap();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f32879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class f32880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final j f32881c;

        public a(Class cls, Class cls2, j jVar) {
            this.f32879a = cls;
            this.f32880b = cls2;
            this.f32881c = jVar;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f32879a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f32880b);
        }
    }

    private synchronized List c(String str) {
        List arrayList;
        try {
            if (!this.f32877a.contains(str)) {
                this.f32877a.add(str);
            }
            arrayList = (List) this.f32878b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f32878b.put(str, arrayList);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public synchronized void a(String str, j jVar, Class cls, Class cls2) {
        c(str).add(new a(cls, cls2, jVar));
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f32877a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f32878b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f32881c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized List d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f32877a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f32878b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f32880b)) {
                        arrayList.add(aVar.f32880b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(List list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f32877a);
            this.f32877a.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f32877a.add((String) it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f32877a.add(str);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
