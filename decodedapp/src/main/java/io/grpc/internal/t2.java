package io.grpc.internal;

import io.grpc.internal.m2;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import qb.g1;
import qb.u1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t2 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f17147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f17148b;

        public a(String str, Map map) {
            this.f17147a = (String) r9.l.o(str, "policyName");
            this.f17148b = (Map) r9.l.o(map, "rawConfigValue");
        }

        public String a() {
            return this.f17147a;
        }

        public Map b() {
            return this.f17148b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f17147a.equals(aVar.f17147a) && this.f17148b.equals(aVar.f17148b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return r9.h.b(this.f17147a, this.f17148b);
        }

        public String toString() {
            return r9.g.b(this).d("policyName", this.f17147a).d("rawConfigValue", this.f17148b).toString();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final qb.r0 f17149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f17150b;

        public b(qb.r0 r0Var, Object obj) {
            this.f17149a = (qb.r0) r9.l.o(r0Var, "provider");
            this.f17150b = obj;
        }

        public Object a() {
            return this.f17150b;
        }

        public qb.r0 b() {
            return this.f17149a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (r9.h.a(this.f17149a, bVar.f17149a) && r9.h.a(this.f17150b, bVar.f17150b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return r9.h.b(this.f17149a, this.f17150b);
        }

        public String toString() {
            return r9.g.b(this).d("provider", this.f17149a).d("config", this.f17150b).toString();
        }
    }

    public static List A(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(z((Map) it.next()));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    static Double a(Map map) {
        return h1.h(map, "backoffMultiplier");
    }

    public static Map b(Map map) {
        if (map == null) {
            return null;
        }
        return h1.j(map, "healthCheckConfig");
    }

    static Long c(Map map) {
        return h1.l(map, "hedgingDelay");
    }

    static Map d(Map map) {
        return h1.j(map, "hedgingPolicy");
    }

    static Long e(Map map) {
        return h1.l(map, "initialBackoff");
    }

    private static Set f(Map map, String str) {
        List listE = h1.e(map, str);
        if (listE == null) {
            return null;
        }
        return u(listE);
    }

    public static List g(Map map) {
        String strK;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            arrayList.addAll(h1.f(map, "loadBalancingConfig"));
        }
        if (arrayList.isEmpty() && (strK = h1.k(map, "loadBalancingPolicy")) != null) {
            arrayList.add(Collections.singletonMap(strK.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    static Integer h(Map map) {
        return h1.i(map, "maxAttempts");
    }

    static Integer i(Map map) {
        return h1.i(map, "maxAttempts");
    }

    static Long j(Map map) {
        return h1.l(map, "maxBackoff");
    }

    static Integer k(Map map) {
        return h1.i(map, "maxRequestMessageBytes");
    }

    static Integer l(Map map) {
        return h1.i(map, "maxResponseMessageBytes");
    }

    static List m(Map map) {
        return h1.f(map, "methodConfig");
    }

    static String n(Map map) {
        return h1.k(map, "method");
    }

    static List o(Map map) {
        return h1.f(map, "name");
    }

    static Set p(Map map) {
        Set setF = f(map, "nonFatalStatusCodes");
        if (setF == null) {
            return DesugarCollections.unmodifiableSet(EnumSet.noneOf(u1.b.class));
        }
        r9.u.a(!setF.contains(u1.b.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return setF;
    }

    static Long q(Map map) {
        return h1.l(map, "perAttemptRecvTimeout");
    }

    static Map r(Map map) {
        return h1.j(map, "retryPolicy");
    }

    static Set s(Map map) {
        Set setF = f(map, "retryableStatusCodes");
        r9.u.a(setF != null, "%s is required in retry policy", "retryableStatusCodes");
        r9.u.a(true ^ setF.contains(u1.b.OK), "%s must not contain OK", "retryableStatusCodes");
        return setF;
    }

    static String t(Map map) {
        return h1.k(map, "service");
    }

    private static Set u(List list) {
        u1.b bVarValueOf;
        EnumSet enumSetNoneOf = EnumSet.noneOf(u1.b.class);
        for (Object obj : list) {
            if (obj instanceof Double) {
                Double d10 = (Double) obj;
                int iIntValue = d10.intValue();
                r9.u.a(((double) iIntValue) == d10.doubleValue(), "Status code %s is not integral", obj);
                bVarValueOf = qb.u1.j(iIntValue).o();
                r9.u.a(bVarValueOf.e() == d10.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new r9.v("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
                }
                try {
                    bVarValueOf = u1.b.valueOf((String) obj);
                } catch (IllegalArgumentException e10) {
                    throw new r9.v("Status code " + obj + " is not valid", e10);
                }
            }
            enumSetNoneOf.add(bVarValueOf);
        }
        return DesugarCollections.unmodifiableSet(enumSetNoneOf);
    }

    static m2.d0 v(Map map) {
        Map mapJ;
        if (map == null || (mapJ = h1.j(map, "retryThrottling")) == null) {
            return null;
        }
        float fFloatValue = h1.h(mapJ, "maxTokens").floatValue();
        float fFloatValue2 = h1.h(mapJ, "tokenRatio").floatValue();
        r9.l.u(fFloatValue > 0.0f, "maxToken should be greater than zero");
        r9.l.u(fFloatValue2 > 0.0f, "tokenRatio should be greater than zero");
        return new m2.d0(fFloatValue, fFloatValue2);
    }

    static Long w(Map map) {
        return h1.l(map, "timeout");
    }

    static Boolean x(Map map) {
        return h1.d(map, "waitForReady");
    }

    public static g1.b y(List list, qb.s0 s0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            String strA = aVar.a();
            qb.r0 r0VarD = s0Var.d(strA);
            if (r0VarD != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(t2.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                g1.b bVarE = r0VarD.e(aVar.b());
                return bVarE.d() != null ? bVarE : g1.b.a(new b(r0VarD, bVarE.c()));
            }
            arrayList.add(strA);
        }
        return g1.b.b(qb.u1.f24771g.s("None of " + arrayList + " specified by Service Config are available."));
    }

    public static a z(Map map) {
        if (map.size() == 1) {
            String str = (String) ((Map.Entry) map.entrySet().iterator().next()).getKey();
            return new a(str, h1.j(map, str));
        }
        throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
    }
}
