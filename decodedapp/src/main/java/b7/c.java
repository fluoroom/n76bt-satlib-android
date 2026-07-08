package b7;

import com.fasterxml.jackson.databind.JavaType;
import i7.b0;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c extends h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final BitSet f3694w = new BitSet(0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Map f3695u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Map f3696v;

    public c(JavaType javaType, a7.f fVar, JavaType javaType2, p6.g gVar, Collection collection) {
        super(javaType, fVar, null, false, javaType2, null, true);
        this.f3695u = new HashMap();
        this.f3696v = C(gVar, collection);
    }

    private static void D(List list, int i10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((BitSet) it.next()).get(i10)) {
                it.remove();
            }
        }
    }

    protected Map C(p6.g gVar, Collection collection) {
        boolean zL = gVar.L(p6.r.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        HashMap map = new HashMap();
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            a7.b bVar = (a7.b) it.next();
            List listN = gVar.u0(gVar.D().R(bVar.b())).n();
            BitSet bitSet = new BitSet(listN.size() + i10);
            Iterator it2 = listN.iterator();
            while (it2.hasNext()) {
                String name = ((x6.u) it2.next()).getName();
                if (zL) {
                    name = name.toLowerCase();
                }
                Integer numValueOf = (Integer) this.f3695u.get(name);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(i10);
                    this.f3695u.put(name, Integer.valueOf(i10));
                    i10++;
                }
                bitSet.set(numValueOf.intValue());
            }
            String str = (String) map.put(bitSet, bVar.b().getName());
            if (str != null) {
                throw new IllegalStateException(String.format("Subtypes %s and %s have the same signature and cannot be uniquely deduced.", str, bVar.b().getName()));
            }
        }
        return map;
    }

    @Override // b7.h, b7.a, a7.e
    public Object e(e6.j jVar, p6.h hVar) {
        String str;
        e6.m mVarN = jVar.n();
        if (mVarN == e6.m.START_OBJECT) {
            mVarN = jVar.X0();
        } else if (mVarN != e6.m.FIELD_NAME) {
            return A(jVar, hVar, null, "Unexpected input");
        }
        if (mVarN == e6.m.END_OBJECT && (str = (String) this.f3696v.get(f3694w)) != null) {
            return z(jVar, hVar, null, str);
        }
        LinkedList linkedList = new LinkedList(this.f3696v.keySet());
        b0 b0VarZ = hVar.z(jVar);
        boolean zE0 = hVar.E0(p6.r.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (mVarN == e6.m.FIELD_NAME) {
            String strL = jVar.l();
            if (zE0) {
                strL = strL.toLowerCase();
            }
            b0VarZ.z1(jVar);
            Integer num = (Integer) this.f3695u.get(strL);
            if (num != null) {
                D(linkedList, num.intValue());
                if (linkedList.size() == 1) {
                    return z(jVar, hVar, b0VarZ, (String) this.f3696v.get(linkedList.get(0)));
                }
            }
            mVarN = jVar.X0();
        }
        return A(jVar, hVar, b0VarZ, String.format("Cannot deduce unique subtype of %s (%d candidates match)", i7.h.G(this.f3720b), Integer.valueOf(linkedList.size())));
    }

    @Override // b7.h, b7.a, a7.e
    public a7.e g(p6.d dVar) {
        return dVar == this.f3721c ? this : new c(this, dVar);
    }

    public c(c cVar, p6.d dVar) {
        super(cVar, dVar);
        this.f3695u = cVar.f3695u;
        this.f3696v = cVar.f3696v;
    }
}
