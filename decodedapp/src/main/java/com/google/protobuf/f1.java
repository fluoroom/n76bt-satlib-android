package com.google.protobuf;

import com.google.protobuf.a1;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class f1 implements e1 {
    f1() {
    }

    private static int h(int i10, Object obj, Object obj2) {
        if (obj == null) {
            return 0;
        }
        Map mapJ = ((b1) obj).j();
        android.support.v4.media.session.b.a(obj2);
        if (mapJ.isEmpty()) {
            return 0;
        }
        Iterator it = mapJ.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        o.W(i10);
        throw null;
    }

    private static Object i(Object obj, Object obj2) {
        b1 b1Var = (b1) obj;
        b1 b1Var2 = (b1) obj2;
        if (!b1Var.l()) {
            b1Var.i();
        }
        b1Var.n(b1Var2);
        return b1Var;
    }

    @Override // com.google.protobuf.e1
    public Object a(Object obj, Object obj2) {
        return i(obj, obj2);
    }

    @Override // com.google.protobuf.e1
    public Object b(Object obj) {
        ((b1) obj).m();
        return obj;
    }

    @Override // com.google.protobuf.e1
    public a1.a c(Object obj) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.protobuf.e1
    public Map d(Object obj) {
        return ((b1) obj).k();
    }

    @Override // com.google.protobuf.e1
    public Object e(Object obj) {
        android.support.v4.media.session.b.a(obj);
        return b1.o(null);
    }

    @Override // com.google.protobuf.e1
    public int f(int i10, Object obj, Object obj2) {
        return h(i10, obj, obj2);
    }

    @Override // com.google.protobuf.e1
    public boolean g(Object obj) {
        return !((b1) obj).l();
    }
}
