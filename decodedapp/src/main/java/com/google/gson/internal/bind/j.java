package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import com.google.gson.w;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import z9.z;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final y f8718c = f(v.f8834a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.gson.f f8719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f8720b;

    class a implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f8721a;

        a(w wVar) {
            this.f8721a = wVar;
        }

        @Override // com.google.gson.y
        public x a(com.google.gson.f fVar, TypeToken typeToken) {
            a aVar = null;
            if (typeToken.c() == Object.class) {
                return new j(fVar, this.f8721a, aVar);
            }
            return null;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8722a;

        static {
            int[] iArr = new int[ca.b.values().length];
            f8722a = iArr;
            try {
                iArr[ca.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8722a[ca.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8722a[ca.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8722a[ca.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8722a[ca.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8722a[ca.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* synthetic */ j(com.google.gson.f fVar, w wVar, a aVar) {
        this(fVar, wVar);
    }

    public static y e(w wVar) {
        return wVar == v.f8834a ? f8718c : f(wVar);
    }

    private static y f(w wVar) {
        return new a(wVar);
    }

    private Object g(ca.a aVar, ca.b bVar) throws IOException {
        int i10 = b.f8722a[bVar.ordinal()];
        if (i10 == 3) {
            return aVar.y0();
        }
        if (i10 == 4) {
            return this.f8720b.a(aVar);
        }
        if (i10 == 5) {
            return Boolean.valueOf(aVar.X());
        }
        if (i10 == 6) {
            aVar.w0();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    private Object h(ca.a aVar, ca.b bVar) throws IOException {
        int i10 = b.f8722a[bVar.ordinal()];
        if (i10 == 1) {
            aVar.c();
            return new ArrayList();
        }
        if (i10 != 2) {
            return null;
        }
        aVar.e();
        return new z();
    }

    @Override // com.google.gson.x
    public Object b(ca.a aVar) throws IOException {
        ca.b bVarA0 = aVar.A0();
        Object objH = h(aVar, bVarA0);
        if (objH == null) {
            return g(aVar, bVarA0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.H()) {
                String strU0 = objH instanceof Map ? aVar.u0() : null;
                ca.b bVarA02 = aVar.A0();
                Object objH2 = h(aVar, bVarA02);
                boolean z10 = objH2 != null;
                if (objH2 == null) {
                    objH2 = g(aVar, bVarA02);
                }
                if (objH instanceof List) {
                    ((List) objH).add(objH2);
                } else {
                    ((Map) objH).put(strU0, objH2);
                }
                if (z10) {
                    arrayDeque.addLast(objH);
                    objH = objH2;
                }
            } else {
                if (objH instanceof List) {
                    aVar.q();
                } else {
                    aVar.r();
                }
                if (arrayDeque.isEmpty()) {
                    return objH;
                }
                objH = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.x
    public void d(ca.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.S();
            return;
        }
        x xVarM = this.f8719a.m(obj.getClass());
        if (!(xVarM instanceof j)) {
            xVarM.d(cVar, obj);
        } else {
            cVar.l();
            cVar.r();
        }
    }

    private j(com.google.gson.f fVar, w wVar) {
        this.f8719a = fVar;
        this.f8720b = wVar;
    }
}
