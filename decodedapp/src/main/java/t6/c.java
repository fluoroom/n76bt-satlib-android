package t6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class c implements Iterable, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final boolean f27469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object[] f27473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s6.u[] f27474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f27475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f27476h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Locale f27477r;

    public c(boolean z10, Collection collection, Map map, Locale locale) {
        this.f27469a = z10;
        this.f27474f = (s6.u[]) collection.toArray(new s6.u[collection.size()]);
        this.f27475g = map;
        this.f27477r = locale;
        this.f27476h = b(map, z10, locale);
        t(collection);
    }

    private Map b(Map map, boolean z10, Locale locale) {
        if (map == null || map.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            String lowerCase = (String) entry.getKey();
            if (z10) {
                lowerCase = lowerCase.toLowerCase(locale);
            }
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                String strC = ((p6.y) it.next()).c();
                if (z10) {
                    strC = strC.toLowerCase(locale);
                }
                map2.put(strC, lowerCase);
            }
        }
        return map2;
    }

    private final s6.u c(String str, int i10, Object obj) {
        if (obj == null) {
            return f((String) this.f27476h.get(str));
        }
        int i11 = this.f27470b + 1;
        int i12 = ((i10 >> 1) + i11) << 1;
        Object obj2 = this.f27473e[i12];
        if (str.equals(obj2)) {
            return (s6.u) this.f27473e[i12 + 1];
        }
        if (obj2 != null) {
            int i13 = (i11 + (i11 >> 1)) << 1;
            int i14 = this.f27472d + i13;
            while (i13 < i14) {
                Object obj3 = this.f27473e[i13];
                if (obj3 == str || str.equals(obj3)) {
                    return (s6.u) this.f27473e[i13 + 1];
                }
                i13 += 2;
            }
        }
        return f((String) this.f27476h.get(str));
    }

    private s6.u d(String str, int i10, Object obj) {
        int i11 = this.f27470b + 1;
        int i12 = ((i10 >> 1) + i11) << 1;
        Object obj2 = this.f27473e[i12];
        if (str.equals(obj2)) {
            return (s6.u) this.f27473e[i12 + 1];
        }
        if (obj2 == null) {
            return null;
        }
        int i13 = (i11 + (i11 >> 1)) << 1;
        int i14 = this.f27472d + i13;
        while (i13 < i14) {
            Object obj3 = this.f27473e[i13];
            if (obj3 == str || str.equals(obj3)) {
                return (s6.u) this.f27473e[i13 + 1];
            }
            i13 += 2;
        }
        return null;
    }

    private final int e(s6.u uVar) {
        int length = this.f27474f.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f27474f[i10] == uVar) {
                return i10;
            }
        }
        throw new IllegalStateException("Illegal state: property '" + uVar.getName() + "' missing from _propsInOrder");
    }

    private s6.u f(String str) {
        if (str == null) {
            return null;
        }
        int iG = g(str);
        int i10 = iG << 1;
        Object obj = this.f27473e[i10];
        if (str.equals(obj)) {
            return (s6.u) this.f27473e[i10 + 1];
        }
        if (obj == null) {
            return null;
        }
        return d(str, iG, obj);
    }

    private final int g(String str) {
        return str.hashCode() & this.f27470b;
    }

    private List h() {
        ArrayList arrayList = new ArrayList(this.f27471c);
        int length = this.f27473e.length;
        for (int i10 = 1; i10 < length; i10 += 2) {
            s6.u uVar = (s6.u) this.f27473e[i10];
            if (uVar != null) {
                arrayList.add(uVar);
            }
        }
        return arrayList;
    }

    public static c l(r6.q qVar, Collection collection, Map map, boolean z10) {
        return new c(z10, collection, map, qVar.x());
    }

    private static final int p(int i10) {
        if (i10 <= 5) {
            return 8;
        }
        if (i10 <= 12) {
            return 16;
        }
        int i11 = 32;
        while (i11 < i10 + (i10 >> 2)) {
            i11 += i11;
        }
        return i11;
    }

    public void A(s6.u uVar) {
        ArrayList arrayList = new ArrayList(this.f27471c);
        String strS = s(uVar);
        int length = this.f27473e.length;
        boolean zEquals = false;
        for (int i10 = 1; i10 < length; i10 += 2) {
            Object[] objArr = this.f27473e;
            s6.u uVar2 = (s6.u) objArr[i10];
            if (uVar2 != null) {
                if (zEquals || !(zEquals = strS.equals(objArr[i10 - 1]))) {
                    arrayList.add(uVar2);
                } else {
                    this.f27474f[e(uVar2)] = null;
                }
            }
        }
        if (zEquals) {
            t(arrayList);
            return;
        }
        throw new NoSuchElementException("No entry '" + uVar.getName() + "' found, can't remove");
    }

    public c C(i7.s sVar) {
        if (sVar == null || sVar == i7.s.f15919a) {
            return this;
        }
        int length = this.f27474f.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            s6.u uVar = this.f27474f[i10];
            if (uVar == null) {
                arrayList.add(uVar);
            } else {
                arrayList.add(i(uVar, sVar));
            }
        }
        return new c(this.f27469a, arrayList, this.f27475g, this.f27477r);
    }

    public void D(s6.u uVar, s6.u uVar2) {
        int length = this.f27473e.length;
        for (int i10 = 1; i10 < length; i10 += 2) {
            Object[] objArr = this.f27473e;
            if (objArr[i10] == uVar) {
                objArr[i10] = uVar2;
                this.f27474f[e(uVar)] = uVar2;
                return;
            }
        }
        throw new NoSuchElementException("No entry '" + uVar.getName() + "' found, can't replace");
    }

    public c K(boolean z10) {
        return this.f27469a == z10 ? this : new c(this, z10);
    }

    public c L(s6.u uVar) {
        String strS = s(uVar);
        int length = this.f27473e.length;
        for (int i10 = 1; i10 < length; i10 += 2) {
            s6.u uVar2 = (s6.u) this.f27473e[i10];
            if (uVar2 != null && uVar2.getName().equals(strS)) {
                return new c(this, uVar, i10, e(uVar2));
            }
        }
        return new c(this, uVar, strS, g(strS));
    }

    public c N(Collection collection, Collection collection2) {
        if ((collection == null || collection.isEmpty()) && collection2 == null) {
            return this;
        }
        int length = this.f27474f.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            s6.u uVar = this.f27474f[i10];
            if (uVar != null && !i7.o.c(uVar.getName(), collection, collection2)) {
                arrayList.add(uVar);
            }
        }
        return new c(this.f27469a, arrayList, this.f27475g, this.f27477r);
    }

    protected s6.u i(s6.u uVar, i7.s sVar) {
        p6.l lVarT;
        if (uVar == null) {
            return uVar;
        }
        s6.u uVarX = uVar.X(sVar.c(uVar.getName()));
        p6.l lVarX = uVarX.x();
        return (lVarX == null || (lVarT = lVarX.t(sVar)) == lVarX) ? uVarX : uVarX.Y(lVarT);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return h().iterator();
    }

    public c j() {
        int length = this.f27473e.length;
        int i10 = 0;
        for (int i11 = 1; i11 < length; i11 += 2) {
            s6.u uVar = (s6.u) this.f27473e[i11];
            if (uVar != null) {
                uVar.k(i10);
                i10++;
            }
        }
        return this;
    }

    public s6.u o(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Cannot pass null property name");
        }
        if (this.f27469a) {
            str = str.toLowerCase(this.f27477r);
        }
        int iHashCode = str.hashCode() & this.f27470b;
        int i10 = iHashCode << 1;
        Object obj = this.f27473e[i10];
        return (obj == str || str.equals(obj)) ? (s6.u) this.f27473e[i10 + 1] : c(str, iHashCode, obj);
    }

    public s6.u[] q() {
        return this.f27474f;
    }

    protected final String s(s6.u uVar) {
        boolean z10 = this.f27469a;
        String name = uVar.getName();
        return z10 ? name.toLowerCase(this.f27477r) : name;
    }

    public int size() {
        return this.f27471c;
    }

    protected void t(Collection collection) {
        int size = collection.size();
        this.f27471c = size;
        int iP = p(size);
        this.f27470b = iP - 1;
        int i10 = (iP >> 1) + iP;
        Object[] objArrCopyOf = new Object[i10 * 2];
        Iterator it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            s6.u uVar = (s6.u) it.next();
            if (uVar != null) {
                String strS = s(uVar);
                int iG = g(strS);
                int i12 = iG << 1;
                if (objArrCopyOf[i12] != null) {
                    i12 = ((iG >> 1) + iP) << 1;
                    if (objArrCopyOf[i12] != null) {
                        i12 = (i10 << 1) + i11;
                        i11 += 2;
                        if (i12 >= objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length + 4);
                        }
                    }
                }
                objArrCopyOf[i12] = strS;
                objArrCopyOf[i12 + 1] = uVar;
            }
        }
        this.f27473e = objArrCopyOf;
        this.f27472d = i11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Properties=[");
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            s6.u uVar = (s6.u) it.next();
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(uVar.getName());
            sb2.append('(');
            sb2.append(uVar.getType());
            sb2.append(')');
            i10 = i11;
        }
        sb2.append(']');
        if (!this.f27475g.isEmpty()) {
            sb2.append("(aliases: ");
            sb2.append(this.f27475g);
            sb2.append(")");
        }
        return sb2.toString();
    }

    public boolean z() {
        return this.f27469a;
    }

    private c(c cVar, s6.u uVar, int i10, int i11) {
        this.f27469a = cVar.f27469a;
        this.f27477r = cVar.f27477r;
        this.f27470b = cVar.f27470b;
        this.f27471c = cVar.f27471c;
        this.f27472d = cVar.f27472d;
        this.f27475g = cVar.f27475g;
        this.f27476h = cVar.f27476h;
        Object[] objArr = cVar.f27473e;
        this.f27473e = Arrays.copyOf(objArr, objArr.length);
        s6.u[] uVarArr = cVar.f27474f;
        s6.u[] uVarArr2 = (s6.u[]) Arrays.copyOf(uVarArr, uVarArr.length);
        this.f27474f = uVarArr2;
        this.f27473e[i10] = uVar;
        uVarArr2[i11] = uVar;
    }

    private c(c cVar, s6.u uVar, String str, int i10) {
        this.f27469a = cVar.f27469a;
        this.f27477r = cVar.f27477r;
        this.f27470b = cVar.f27470b;
        this.f27471c = cVar.f27471c;
        this.f27472d = cVar.f27472d;
        this.f27475g = cVar.f27475g;
        this.f27476h = cVar.f27476h;
        Object[] objArr = cVar.f27473e;
        this.f27473e = Arrays.copyOf(objArr, objArr.length);
        s6.u[] uVarArr = cVar.f27474f;
        int length = uVarArr.length;
        s6.u[] uVarArr2 = (s6.u[]) Arrays.copyOf(uVarArr, length + 1);
        this.f27474f = uVarArr2;
        uVarArr2[length] = uVar;
        int i11 = this.f27470b + 1;
        int i12 = i10 << 1;
        Object[] objArr2 = this.f27473e;
        if (objArr2[i12] != null) {
            i12 = ((i10 >> 1) + i11) << 1;
            if (objArr2[i12] != null) {
                int i13 = this.f27472d;
                i12 = ((i11 + (i11 >> 1)) << 1) + i13;
                this.f27472d = i13 + 2;
                if (i12 >= objArr2.length) {
                    this.f27473e = Arrays.copyOf(objArr2, objArr2.length + 4);
                }
            }
        }
        Object[] objArr3 = this.f27473e;
        objArr3[i12] = str;
        objArr3[i12 + 1] = uVar;
    }

    protected c(c cVar, boolean z10) {
        this.f27469a = z10;
        this.f27477r = cVar.f27477r;
        this.f27475g = cVar.f27475g;
        this.f27476h = cVar.f27476h;
        s6.u[] uVarArr = cVar.f27474f;
        s6.u[] uVarArr2 = (s6.u[]) Arrays.copyOf(uVarArr, uVarArr.length);
        this.f27474f = uVarArr2;
        t(Arrays.asList(uVarArr2));
    }
}
