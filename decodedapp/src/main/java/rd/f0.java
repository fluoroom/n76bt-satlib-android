package rd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f25949a;

    public f0(int i10) {
        this.f25949a = new ArrayList(i10);
    }

    public void a(Object obj) {
        this.f25949a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList arrayList = this.f25949a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f25949a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f25949a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f25949a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f25949a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f25949a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f25949a.toArray(objArr);
    }
}
