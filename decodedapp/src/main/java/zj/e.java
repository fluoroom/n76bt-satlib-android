package zj;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import zj.f;

/* JADX INFO: loaded from: classes3.dex */
public class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f33363a;

    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f33364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f33365b;

        a(String str, Object obj) {
            this.f33364a = str;
            this.f33365b = obj;
        }

        public String a() {
            return this.f33364a;
        }

        public Object b() {
            Object obj = this.f33365b;
            return obj instanceof double[] ? ((double[]) obj).clone() : obj;
        }

        public void c(double d10, f.a aVar) {
            if (this.f33365b instanceof double[]) {
                for (int i10 = 0; i10 < aVar.b().length; i10++) {
                    double[] dArr = (double[]) this.f33365b;
                    dArr[i10] = dArr[i10] + (aVar.b()[i10] * d10);
                }
            }
        }
    }

    public e() {
        this(4);
    }

    public static String f(Map map) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        int i10 = 0;
        for (Map.Entry entry : map.entrySet()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append((String) entry.getKey());
            sb2.append('[');
            if (entry.getValue() instanceof double[]) {
                sb2.append(((double[]) entry.getValue()).length);
            } else {
                sb2.append(entry.getValue());
            }
            sb2.append(']');
            i10++;
        }
        sb2.append('}');
        return sb2.toString();
    }

    public List a() {
        return DesugarCollections.unmodifiableList(this.f33363a);
    }

    public a b(String str) {
        for (a aVar : this.f33363a) {
            if (aVar.a().equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    public void c(String str, Object obj) {
        d(str);
        this.f33363a.add(new a(str, obj));
    }

    public boolean d(String str) {
        Iterator it = this.f33363a.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).a().equals(str)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public Map e() {
        HashMap map = new HashMap(this.f33363a.size());
        for (a aVar : this.f33363a) {
            map.put(aVar.a(), aVar.b());
        }
        return map;
    }

    public String toString() {
        return f(e());
    }

    public e(int i10) {
        this.f33363a = new ArrayList(i10);
    }

    public e(e eVar) {
        this(eVar.a().size() + 4);
        for (a aVar : eVar.a()) {
            this.f33363a.add(new a(aVar.a(), aVar.b()));
        }
    }
}
