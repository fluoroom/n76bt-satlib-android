package com.google.protobuf;

import com.google.protobuf.o0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
abstract class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final w0 f10131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final w0 f10132b;

    private static final class b extends w0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class f10133c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        private b() {
            super();
        }

        static List f(Object obj, long j10) {
            return (List) y2.G(obj, j10);
        }

        private static List g(Object obj, long j10, int i10) {
            List listF = f(obj, j10);
            if (listF.isEmpty()) {
                List u0Var = listF instanceof v0 ? new u0(i10) : ((listF instanceof a2) && (listF instanceof o0.j)) ? ((o0.j) listF).v(i10) : new ArrayList(i10);
                y2.X(obj, j10, u0Var);
                return u0Var;
            }
            if (f10133c.isAssignableFrom(listF.getClass())) {
                ArrayList arrayList = new ArrayList(listF.size() + i10);
                arrayList.addAll(listF);
                y2.X(obj, j10, arrayList);
                return arrayList;
            }
            if (listF instanceof x2) {
                u0 u0Var2 = new u0(listF.size() + i10);
                u0Var2.addAll((x2) listF);
                y2.X(obj, j10, u0Var2);
                return u0Var2;
            }
            if ((listF instanceof a2) && (listF instanceof o0.j)) {
                o0.j jVar = (o0.j) listF;
                if (!jVar.p0()) {
                    o0.j jVarV = jVar.v(listF.size() + i10);
                    y2.X(obj, j10, jVarV);
                    return jVarV;
                }
            }
            return listF;
        }

        @Override // com.google.protobuf.w0
        void c(Object obj, long j10) {
            Object objUnmodifiableList;
            List list = (List) y2.G(obj, j10);
            if (list instanceof v0) {
                objUnmodifiableList = ((v0) list).n();
            } else {
                if (f10133c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof a2) && (list instanceof o0.j)) {
                    o0.j jVar = (o0.j) list;
                    if (jVar.p0()) {
                        jVar.r();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = DesugarCollections.unmodifiableList(list);
            }
            y2.X(obj, j10, objUnmodifiableList);
        }

        @Override // com.google.protobuf.w0
        void d(Object obj, Object obj2, long j10) {
            List listF = f(obj2, j10);
            List listG = g(obj, j10, listF.size());
            int size = listG.size();
            int size2 = listF.size();
            if (size > 0 && size2 > 0) {
                listG.addAll(listF);
            }
            if (size > 0) {
                listF = listG;
            }
            y2.X(obj, j10, listF);
        }

        @Override // com.google.protobuf.w0
        List e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    private static final class c extends w0 {
        private c() {
            super();
        }

        static o0.j f(Object obj, long j10) {
            return (o0.j) y2.G(obj, j10);
        }

        @Override // com.google.protobuf.w0
        void c(Object obj, long j10) {
            f(obj, j10).r();
        }

        @Override // com.google.protobuf.w0
        void d(Object obj, Object obj2, long j10) {
            o0.j jVarF = f(obj, j10);
            o0.j jVarF2 = f(obj2, j10);
            int size = jVarF.size();
            int size2 = jVarF2.size();
            if (size > 0 && size2 > 0) {
                if (!jVarF.p0()) {
                    jVarF = jVarF.v(size2 + size);
                }
                jVarF.addAll(jVarF2);
            }
            if (size > 0) {
                jVarF2 = jVarF;
            }
            y2.X(obj, j10, jVarF2);
        }

        @Override // com.google.protobuf.w0
        List e(Object obj, long j10) {
            o0.j jVarF = f(obj, j10);
            if (jVarF.p0()) {
                return jVarF;
            }
            int size = jVarF.size();
            o0.j jVarV = jVarF.v(size == 0 ? 10 : size * 2);
            y2.X(obj, j10, jVarV);
            return jVarV;
        }
    }

    static {
        f10131a = new b();
        f10132b = new c();
    }

    static w0 a() {
        return f10131a;
    }

    static w0 b() {
        return f10132b;
    }

    abstract void c(Object obj, long j10);

    abstract void d(Object obj, Object obj2, long j10);

    abstract List e(Object obj, long j10);

    private w0() {
    }
}
