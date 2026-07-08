package io.grpc.internal;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f16602a = Logger.getLogger(g1.class.getName());

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16603a;

        static {
            int[] iArr = new int[ca.b.values().length];
            f16603a = iArr;
            try {
                iArr[ca.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16603a[ca.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16603a[ca.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16603a[ca.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16603a[ca.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16603a[ca.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static Object a(String str) {
        ca.a aVar = new ca.a(new StringReader(str));
        try {
            Object objE = e(aVar);
            try {
                return objE;
            } catch (IOException e10) {
                return objE;
            }
        } finally {
            try {
                aVar.close();
            } catch (IOException e102) {
                f16602a.log(Level.WARNING, "Failed to close", (Throwable) e102);
            }
        }
    }

    private static List b(ca.a aVar) throws IOException {
        aVar.c();
        ArrayList arrayList = new ArrayList();
        while (aVar.H()) {
            arrayList.add(e(aVar));
        }
        r9.l.u(aVar.A0() == ca.b.END_ARRAY, "Bad token: " + aVar.v());
        aVar.q();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private static Void c(ca.a aVar) throws IOException {
        aVar.w0();
        return null;
    }

    private static Map d(ca.a aVar) throws IOException {
        aVar.e();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!aVar.H()) {
                break;
            }
            String strU0 = aVar.u0();
            r9.l.j(true ^ linkedHashMap.containsKey(strU0), "Duplicate key found: %s", strU0);
            linkedHashMap.put(strU0, e(aVar));
        }
        r9.l.u(aVar.A0() == ca.b.END_OBJECT, "Bad token: " + aVar.v());
        aVar.r();
        return DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    private static Object e(ca.a aVar) {
        r9.l.u(aVar.H(), "unexpected end of JSON");
        switch (a.f16603a[aVar.A0().ordinal()]) {
            case 1:
                return b(aVar);
            case 2:
                return d(aVar);
            case 3:
                return aVar.y0();
            case 4:
                return Double.valueOf(aVar.h0());
            case 5:
                return Boolean.valueOf(aVar.X());
            case 6:
                return c(aVar);
            default:
                throw new IllegalStateException("Bad token: " + aVar.v());
        }
    }
}
