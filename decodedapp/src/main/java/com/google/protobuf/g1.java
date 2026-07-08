package com.google.protobuf;

import com.google.protobuf.a1;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class g1 implements e1 {
    g1() {
    }

    private static int h(int i10, Object obj, Object obj2) {
        c1 c1Var = (c1) obj;
        android.support.v4.media.session.b.a(obj2);
        if (c1Var.isEmpty()) {
            return 0;
        }
        Iterator it = c1Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    private static c1 i(Object obj, Object obj2) {
        c1 c1VarR = (c1) obj;
        c1 c1Var = (c1) obj2;
        if (!c1Var.isEmpty()) {
            if (!c1VarR.n()) {
                c1VarR = c1VarR.r();
            }
            c1VarR.p(c1Var);
        }
        return c1VarR;
    }

    @Override // com.google.protobuf.e1
    public Object a(Object obj, Object obj2) {
        return i(obj, obj2);
    }

    @Override // com.google.protobuf.e1
    public Object b(Object obj) {
        ((c1) obj).o();
        return obj;
    }

    @Override // com.google.protobuf.e1
    public a1.a c(Object obj) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.protobuf.e1
    public Map d(Object obj) {
        return (c1) obj;
    }

    @Override // com.google.protobuf.e1
    public Object e(Object obj) {
        return c1.h().r();
    }

    @Override // com.google.protobuf.e1
    public int f(int i10, Object obj, Object obj2) {
        return h(i10, obj, obj2);
    }

    @Override // com.google.protobuf.e1
    public boolean g(Object obj) {
        return !((c1) obj).n();
    }
}
