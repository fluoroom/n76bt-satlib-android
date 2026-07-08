package com.google.protobuf;

import com.google.protobuf.j0;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f10148b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f10149c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile y f10150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final y f10151e = new y(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f10152a;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f10153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f10154b;

        a(Object obj, int i10) {
            this.f10153a = obj;
            this.f10154b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10153a == aVar.f10153a && this.f10154b == aVar.f10154b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f10153a) * 65535) + this.f10154b;
        }
    }

    y(y yVar) {
        if (yVar == f10151e) {
            this.f10152a = Collections.EMPTY_MAP;
        } else {
            this.f10152a = DesugarCollections.unmodifiableMap(yVar.f10152a);
        }
    }

    public static y b() {
        y yVarA;
        if (!f10149c) {
            return f10151e;
        }
        y yVar = f10150d;
        if (yVar != null) {
            return yVar;
        }
        synchronized (y.class) {
            try {
                yVarA = f10150d;
                if (yVarA == null) {
                    yVarA = x.a();
                    f10150d = yVarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yVarA;
    }

    public static boolean c() {
        return f10148b;
    }

    public j0.a a(l1 l1Var, int i10) {
        android.support.v4.media.session.b.a(this.f10152a.get(new a(l1Var, i10)));
        return null;
    }

    y(boolean z10) {
        this.f10152a = Collections.EMPTY_MAP;
    }
}
