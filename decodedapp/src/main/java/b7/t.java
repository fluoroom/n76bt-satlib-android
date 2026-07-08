package b7;

import com.fasterxml.jackson.databind.JavaType;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public class t extends s implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final r6.q f3729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final ConcurrentHashMap f3730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final Map f3731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final boolean f3732f;

    protected t(r6.q qVar, JavaType javaType, ConcurrentHashMap concurrentHashMap, HashMap map) {
        super(javaType, qVar.D());
        this.f3729c = qVar;
        this.f3730d = concurrentHashMap;
        this.f3731e = map;
        this.f3732f = qVar.L(p6.r.ACCEPT_CASE_INSENSITIVE_VALUES);
    }

    protected static String g(Class cls) {
        String name = cls.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf < 0 ? name : name.substring(iLastIndexOf + 1);
    }

    public static t i(r6.q qVar, JavaType javaType, Collection collection, boolean z10, boolean z11) {
        HashMap map;
        ConcurrentHashMap concurrentHashMap;
        if (z10 == z11) {
            throw new IllegalArgumentException();
        }
        if (z10) {
            concurrentHashMap = new ConcurrentHashMap();
            map = null;
        } else {
            map = new HashMap();
            concurrentHashMap = new ConcurrentHashMap(4);
        }
        boolean zL = qVar.L(p6.r.ACCEPT_CASE_INSENSITIVE_VALUES);
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                a7.b bVar = (a7.b) it.next();
                Class clsB = bVar.b();
                String strA = bVar.c() ? bVar.a() : g(clsB);
                if (z10) {
                    concurrentHashMap.put(clsB.getName(), strA);
                }
                if (z11) {
                    if (zL) {
                        strA = strA.toLowerCase();
                    }
                    JavaType javaType2 = (JavaType) map.get(strA);
                    if (javaType2 == null || !clsB.isAssignableFrom(javaType2.r())) {
                        map.put(strA, qVar.e(clsB));
                    }
                }
            }
        }
        return new t(qVar, javaType, concurrentHashMap, map);
    }

    @Override // a7.f
    public String a(Object obj) {
        return j(obj.getClass());
    }

    @Override // a7.f
    public String b() {
        TreeSet treeSet = new TreeSet();
        for (Map.Entry entry : this.f3731e.entrySet()) {
            if (((JavaType) entry.getValue()).K()) {
                treeSet.add(entry.getKey());
            }
        }
        return treeSet.toString();
    }

    @Override // a7.f
    public JavaType d(p6.e eVar, String str) {
        return h(str);
    }

    @Override // a7.f
    public String e(Object obj, Class cls) {
        return obj == null ? j(cls) : a(obj);
    }

    protected JavaType h(String str) {
        if (this.f3732f) {
            str = str.toLowerCase();
        }
        return (JavaType) this.f3731e.get(str);
    }

    protected String j(Class cls) {
        if (cls == null) {
            return null;
        }
        String name = cls.getName();
        String strG = (String) this.f3730d.get(name);
        if (strG == null) {
            Class clsR = this.f3727a.R(cls).r();
            if (this.f3729c.K()) {
                strG = this.f3729c.g().o0(this.f3729c.H(clsR).s());
            }
            if (strG == null) {
                strG = g(clsR);
            }
            this.f3730d.put(name, strG);
        }
        return strG;
    }

    public String toString() {
        return String.format("[%s; id-to-type=%s]", getClass().getName(), this.f3731e);
    }
}
