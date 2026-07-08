package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {
    public static final com.google.gson.x A;
    public static final com.google.gson.x B;
    public static final com.google.gson.y C;
    public static final com.google.gson.x D;
    public static final com.google.gson.y E;
    public static final com.google.gson.x F;
    public static final com.google.gson.y G;
    public static final com.google.gson.x H;
    public static final com.google.gson.y I;
    public static final com.google.gson.x J;
    public static final com.google.gson.y K;
    public static final com.google.gson.x L;
    public static final com.google.gson.y M;
    public static final com.google.gson.x N;
    public static final com.google.gson.y O;
    public static final com.google.gson.x P;
    public static final com.google.gson.y Q;
    public static final com.google.gson.x R;
    public static final com.google.gson.y S;
    public static final com.google.gson.x T;
    public static final com.google.gson.y U;
    public static final com.google.gson.x V;
    public static final com.google.gson.y W;
    public static final com.google.gson.y X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.gson.x f8763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.gson.y f8764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.gson.x f8765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.google.gson.y f8766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.google.gson.x f8767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.gson.x f8768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.google.gson.y f8769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.gson.x f8770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.google.gson.y f8771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final com.google.gson.x f8772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.google.gson.y f8773k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final com.google.gson.x f8774l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final com.google.gson.y f8775m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final com.google.gson.x f8776n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final com.google.gson.y f8777o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final com.google.gson.x f8778p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final com.google.gson.y f8779q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final com.google.gson.x f8780r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final com.google.gson.y f8781s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final com.google.gson.x f8782t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final com.google.gson.x f8783u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final com.google.gson.x f8784v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final com.google.gson.x f8785w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final com.google.gson.y f8786x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final com.google.gson.x f8787y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final com.google.gson.x f8788z;

    class a extends com.google.gson.x {
        a() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray b(ca.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.c();
            while (aVar.H()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.p0()));
                } catch (NumberFormatException e10) {
                    throw new com.google.gson.r(e10);
                }
            }
            aVar.q();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.k();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.y0(atomicIntegerArray.get(i10));
            }
            cVar.q();
        }
    }

    class a0 extends com.google.gson.x {
        a0() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(ca.a aVar) throws IOException {
            ca.b bVarA0 = aVar.A0();
            if (bVarA0 != ca.b.NULL) {
                return bVarA0 == ca.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.y0())) : Boolean.valueOf(aVar.X());
            }
            aVar.w0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, Boolean bool) throws IOException {
            cVar.z0(bool);
        }
    }

    class b extends com.google.gson.x {
        b() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(ca.a aVar) throws IOException {
            if (aVar.A0() == ca.b.NULL) {
                aVar.w0();
                return null;
            }
            try {
                return Long.valueOf(aVar.t0());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.r(e10);
            }
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.S();
            } else {
                cVar.y0(number.longValue());
            }
        }
    }

    class b0 extends com.google.gson.x {
        b0() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(ca.a aVar) throws IOException {
            if (aVar.A0() != ca.b.NULL) {
                return Boolean.valueOf(aVar.y0());
            }
            aVar.w0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, Boolean bool) throws IOException {
            cVar.B0(bool == null ? "null" : bool.toString());
        }
    }

    class c extends com.google.gson.x {
        c() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(ca.a aVar) throws IOException {
            if (aVar.A0() != ca.b.NULL) {
                return Float.valueOf((float) aVar.h0());
            }
            aVar.w0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.S();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            cVar.A0(number);
        }
    }

    class c0 extends com.google.gson.x {
        c0() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(ca.a aVar) throws IOException {
            if (aVar.A0() == ca.b.NULL) {
                aVar.w0();
                return null;
            }
            try {
                int iP0 = aVar.p0();
                if (iP0 <= 255 && iP0 >= -128) {
                    return Byte.valueOf((byte) iP0);
                }
                throw new com.google.gson.r("Lossy conversion from " + iP0 + " to byte; at path " + aVar.x());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.r(e10);
            }
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.S();
            } else {
                cVar.y0(number.byteValue());
            }
        }
    }

    class d extends com.google.gson.x {
        d() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(ca.a aVar) throws IOException {
            if (aVar.A0() != ca.b.NULL) {
                return Double.valueOf(aVar.h0());
            }
            aVar.w0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.S();
            } else {
                cVar.x0(number.doubleValue());
            }
        }
    }

    class d0 extends com.google.gson.x {
        d0() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(ca.a aVar) throws IOException {
            if (aVar.A0() == ca.b.NULL) {
                aVar.w0();
                return null;
            }
            try {
                int iP0 = aVar.p0();
                if (iP0 <= 65535 && iP0 >= -32768) {
                    return Short.valueOf((short) iP0);
                }
                throw new com.google.gson.r("Lossy conversion from " + iP0 + " to short; at path " + aVar.x());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.r(e10);
            }
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.S();
            } else {
                cVar.y0(number.shortValue());
            }
        }
    }

    class e extends com.google.gson.x {
        e() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Character b(ca.a aVar) throws IOException {
            if (aVar.A0() == ca.b.NULL) {
                aVar.w0();
                return null;
            }
            String strY0 = aVar.y0();
            if (strY0.length() == 1) {
                return Character.valueOf(strY0.charAt(0));
            }
            throw new com.google.gson.r("Expecting character, got: " + strY0 + "; at " + aVar.x());
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, Character ch2) throws IOException {
            cVar.B0(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    class e0 extends com.google.gson.x {
        e0() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(ca.a aVar) throws IOException {
            if (aVar.A0() == ca.b.NULL) {
                aVar.w0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.p0());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.r(e10);
            }
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.S();
            } else {
                cVar.y0(number.intValue());
            }
        }
    }

    class f extends com.google.gson.x {
        f() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String b(ca.a aVar) throws IOException {
            ca.b bVarA0 = aVar.A0();
            if (bVarA0 != ca.b.NULL) {
                return bVarA0 == ca.b.BOOLEAN ? Boolean.toString(aVar.X()) : aVar.y0();
            }
            aVar.w0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, String str) throws IOException {
            cVar.B0(str);
        }
    }

    class f0 extends com.google.gson.x {
        f0() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicInteger b(ca.a aVar) {
            try {
                return new AtomicInteger(aVar.p0());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.r(e10);
            }
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.y0(atomicInteger.get());
        }
    }

    class g extends com.google.gson.x {
        g() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigDecimal b(ca.a aVar) throws IOException {
            if (aVar.A0() == ca.b.NULL) {
                aVar.w0();
                return null;
            }
            String strY0 = aVar.y0();
            try {
                return z9.a0.b(strY0);
            } catch (NumberFormatException e10) {
                throw new com.google.gson.r("Failed parsing '" + strY0 + "' as BigDecimal; at path " + aVar.x(), e10);
            }
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.A0(bigDecimal);
        }
    }

    class g0 extends com.google.gson.x {
        g0() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean b(ca.a aVar) {
            return new AtomicBoolean(aVar.X());
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.C0(atomicBoolean.get());
        }
    }

    class h extends com.google.gson.x {
        h() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigInteger b(ca.a aVar) throws IOException {
            if (aVar.A0() == ca.b.NULL) {
                aVar.w0();
                return null;
            }
            String strY0 = aVar.y0();
            try {
                return z9.a0.c(strY0);
            } catch (NumberFormatException e10) {
                throw new com.google.gson.r("Failed parsing '" + strY0 + "' as BigInteger; at path " + aVar.x(), e10);
            }
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, BigInteger bigInteger) throws IOException {
            cVar.A0(bigInteger);
        }
    }

    class i extends com.google.gson.x {
        i() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public z9.y b(ca.a aVar) throws IOException {
            if (aVar.A0() != ca.b.NULL) {
                return new z9.y(aVar.y0());
            }
            aVar.w0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, z9.y yVar) throws IOException {
            cVar.A0(yVar);
        }
    }

    class j extends com.google.gson.x {
        j() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuilder b(ca.a aVar) throws IOException {
            if (aVar.A0() != ca.b.NULL) {
                return new StringBuilder(aVar.y0());
            }
            aVar.w0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, StringBuilder sb2) throws IOException {
            cVar.B0(sb2 == null ? null : sb2.toString());
        }
    }

    class k extends com.google.gson.x {
        k() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Class b(ca.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + z9.g0.a("java-lang-class-unsupported"));
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?\nSee " + z9.g0.a("java-lang-class-unsupported"));
        }
    }

    class l extends com.google.gson.x {
        l() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuffer b(ca.a aVar) throws IOException {
            if (aVar.A0() != ca.b.NULL) {
                return new StringBuffer(aVar.y0());
            }
            aVar.w0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, StringBuffer stringBuffer) throws IOException {
            cVar.B0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    class m extends com.google.gson.x {
        m() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URL b(ca.a aVar) throws IOException {
            if (aVar.A0() == ca.b.NULL) {
                aVar.w0();
                return null;
            }
            String strY0 = aVar.y0();
            if (strY0.equals("null")) {
                return null;
            }
            return new URL(strY0);
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, URL url) throws IOException {
            cVar.B0(url == null ? null : url.toExternalForm());
        }
    }

    class n extends com.google.gson.x {
        n() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URI b(ca.a aVar) throws IOException {
            if (aVar.A0() == ca.b.NULL) {
                aVar.w0();
                return null;
            }
            try {
                String strY0 = aVar.y0();
                if (strY0.equals("null")) {
                    return null;
                }
                return new URI(strY0);
            } catch (URISyntaxException e10) {
                throw new com.google.gson.l(e10);
            }
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, URI uri) throws IOException {
            cVar.B0(uri == null ? null : uri.toASCIIString());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.o$o, reason: collision with other inner class name */
    class C0129o extends com.google.gson.x {
        C0129o() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public InetAddress b(ca.a aVar) throws IOException {
            if (aVar.A0() != ca.b.NULL) {
                return InetAddress.getByName(aVar.y0());
            }
            aVar.w0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, InetAddress inetAddress) throws IOException {
            cVar.B0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    class p extends com.google.gson.x {
        p() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public UUID b(ca.a aVar) throws IOException {
            if (aVar.A0() == ca.b.NULL) {
                aVar.w0();
                return null;
            }
            String strY0 = aVar.y0();
            try {
                return UUID.fromString(strY0);
            } catch (IllegalArgumentException e10) {
                throw new com.google.gson.r("Failed parsing '" + strY0 + "' as UUID; at path " + aVar.x(), e10);
            }
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, UUID uuid) throws IOException {
            cVar.B0(uuid == null ? null : uuid.toString());
        }
    }

    class q extends com.google.gson.x {
        q() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Currency b(ca.a aVar) throws IOException {
            String strY0 = aVar.y0();
            try {
                return Currency.getInstance(strY0);
            } catch (IllegalArgumentException e10) {
                throw new com.google.gson.r("Failed parsing '" + strY0 + "' as Currency; at path " + aVar.x(), e10);
            }
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, Currency currency) throws IOException {
            cVar.B0(currency.getCurrencyCode());
        }
    }

    class r extends com.google.gson.x {
        r() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Calendar b(ca.a aVar) throws IOException {
            int iP0;
            if (aVar.A0() == ca.b.NULL) {
                aVar.w0();
                return null;
            }
            aVar.e();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (aVar.A0() != ca.b.END_OBJECT) {
                String strU0 = aVar.u0();
                iP0 = aVar.p0();
                strU0.getClass();
                switch (strU0) {
                    case "dayOfMonth":
                        i12 = iP0;
                        break;
                    case "minute":
                        i14 = iP0;
                        break;
                    case "second":
                        i15 = iP0;
                        break;
                    case "year":
                        i10 = iP0;
                        break;
                    case "month":
                        i11 = iP0;
                        break;
                    case "hourOfDay":
                        i13 = iP0;
                        break;
                }
            }
            aVar.r();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                cVar.S();
                return;
            }
            cVar.l();
            cVar.G("year");
            cVar.y0(calendar.get(1));
            cVar.G("month");
            cVar.y0(calendar.get(2));
            cVar.G("dayOfMonth");
            cVar.y0(calendar.get(5));
            cVar.G("hourOfDay");
            cVar.y0(calendar.get(11));
            cVar.G("minute");
            cVar.y0(calendar.get(12));
            cVar.G("second");
            cVar.y0(calendar.get(13));
            cVar.r();
        }
    }

    class s extends com.google.gson.x {
        s() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Locale b(ca.a aVar) throws IOException {
            if (aVar.A0() == ca.b.NULL) {
                aVar.w0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.y0(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, Locale locale) throws IOException {
            cVar.B0(locale == null ? null : locale.toString());
        }
    }

    class t implements com.google.gson.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TypeToken f8789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.gson.x f8790b;

        t(TypeToken typeToken, com.google.gson.x xVar) {
            this.f8789a = typeToken;
            this.f8790b = xVar;
        }

        @Override // com.google.gson.y
        public com.google.gson.x a(com.google.gson.f fVar, TypeToken typeToken) {
            if (typeToken.equals(this.f8789a)) {
                return this.f8790b;
            }
            return null;
        }
    }

    class u implements com.google.gson.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f8791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.gson.x f8792b;

        u(Class cls, com.google.gson.x xVar) {
            this.f8791a = cls;
            this.f8792b = xVar;
        }

        @Override // com.google.gson.y
        public com.google.gson.x a(com.google.gson.f fVar, TypeToken typeToken) {
            if (typeToken.c() == this.f8791a) {
                return this.f8792b;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f8791a.getName() + ",adapter=" + this.f8792b + "]";
        }
    }

    class v extends com.google.gson.x {
        v() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BitSet b(ca.a aVar) throws IOException {
            BitSet bitSet = new BitSet();
            aVar.c();
            ca.b bVarA0 = aVar.A0();
            int i10 = 0;
            while (bVarA0 != ca.b.END_ARRAY) {
                int i11 = z.f8803a[bVarA0.ordinal()];
                boolean zX = true;
                if (i11 == 1 || i11 == 2) {
                    int iP0 = aVar.p0();
                    if (iP0 == 0) {
                        zX = false;
                    } else if (iP0 != 1) {
                        throw new com.google.gson.r("Invalid bitset value " + iP0 + ", expected 0 or 1; at path " + aVar.x());
                    }
                } else {
                    if (i11 != 3) {
                        throw new com.google.gson.r("Invalid bitset value type: " + bVarA0 + "; at path " + aVar.v());
                    }
                    zX = aVar.X();
                }
                if (zX) {
                    bitSet.set(i10);
                }
                i10++;
                bVarA0 = aVar.A0();
            }
            aVar.q();
            return bitSet;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, BitSet bitSet) throws IOException {
            cVar.k();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.y0(bitSet.get(i10) ? 1L : 0L);
            }
            cVar.q();
        }
    }

    class w implements com.google.gson.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f8793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f8794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.gson.x f8795c;

        w(Class cls, Class cls2, com.google.gson.x xVar) {
            this.f8793a = cls;
            this.f8794b = cls2;
            this.f8795c = xVar;
        }

        @Override // com.google.gson.y
        public com.google.gson.x a(com.google.gson.f fVar, TypeToken typeToken) {
            Class clsC = typeToken.c();
            if (clsC == this.f8793a || clsC == this.f8794b) {
                return this.f8795c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f8794b.getName() + "+" + this.f8793a.getName() + ",adapter=" + this.f8795c + "]";
        }
    }

    class x implements com.google.gson.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f8796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f8797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.gson.x f8798c;

        x(Class cls, Class cls2, com.google.gson.x xVar) {
            this.f8796a = cls;
            this.f8797b = cls2;
            this.f8798c = xVar;
        }

        @Override // com.google.gson.y
        public com.google.gson.x a(com.google.gson.f fVar, TypeToken typeToken) {
            Class clsC = typeToken.c();
            if (clsC == this.f8796a || clsC == this.f8797b) {
                return this.f8798c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f8796a.getName() + "+" + this.f8797b.getName() + ",adapter=" + this.f8798c + "]";
        }
    }

    class y implements com.google.gson.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f8799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.gson.x f8800b;

        class a extends com.google.gson.x {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Class f8801a;

            a(Class cls) {
                this.f8801a = cls;
            }

            @Override // com.google.gson.x
            public Object b(ca.a aVar) {
                Object objB = y.this.f8800b.b(aVar);
                if (objB == null || this.f8801a.isInstance(objB)) {
                    return objB;
                }
                throw new com.google.gson.r("Expected a " + this.f8801a.getName() + " but was " + objB.getClass().getName() + "; at path " + aVar.x());
            }

            @Override // com.google.gson.x
            public void d(ca.c cVar, Object obj) {
                y.this.f8800b.d(cVar, obj);
            }
        }

        y(Class cls, com.google.gson.x xVar) {
            this.f8799a = cls;
            this.f8800b = xVar;
        }

        @Override // com.google.gson.y
        public com.google.gson.x a(com.google.gson.f fVar, TypeToken typeToken) {
            Class<?> clsC = typeToken.c();
            if (this.f8799a.isAssignableFrom(clsC)) {
                return new a(clsC);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f8799a.getName() + ",adapter=" + this.f8800b + "]";
        }
    }

    static /* synthetic */ class z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8803a;

        static {
            int[] iArr = new int[ca.b.values().length];
            f8803a = iArr;
            try {
                iArr[ca.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8803a[ca.b.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8803a[ca.b.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        com.google.gson.x xVarA = new k().a();
        f8763a = xVarA;
        f8764b = b(Class.class, xVarA);
        com.google.gson.x xVarA2 = new v().a();
        f8765c = xVarA2;
        f8766d = b(BitSet.class, xVarA2);
        a0 a0Var = new a0();
        f8767e = a0Var;
        f8768f = new b0();
        f8769g = c(Boolean.TYPE, Boolean.class, a0Var);
        c0 c0Var = new c0();
        f8770h = c0Var;
        f8771i = c(Byte.TYPE, Byte.class, c0Var);
        d0 d0Var = new d0();
        f8772j = d0Var;
        f8773k = c(Short.TYPE, Short.class, d0Var);
        e0 e0Var = new e0();
        f8774l = e0Var;
        f8775m = c(Integer.TYPE, Integer.class, e0Var);
        com.google.gson.x xVarA3 = new f0().a();
        f8776n = xVarA3;
        f8777o = b(AtomicInteger.class, xVarA3);
        com.google.gson.x xVarA4 = new g0().a();
        f8778p = xVarA4;
        f8779q = b(AtomicBoolean.class, xVarA4);
        com.google.gson.x xVarA5 = new a().a();
        f8780r = xVarA5;
        f8781s = b(AtomicIntegerArray.class, xVarA5);
        f8782t = new b();
        f8783u = new c();
        f8784v = new d();
        e eVar = new e();
        f8785w = eVar;
        f8786x = c(Character.TYPE, Character.class, eVar);
        f fVar = new f();
        f8787y = fVar;
        f8788z = new g();
        A = new h();
        B = new i();
        C = b(String.class, fVar);
        j jVar = new j();
        D = jVar;
        E = b(StringBuilder.class, jVar);
        l lVar = new l();
        F = lVar;
        G = b(StringBuffer.class, lVar);
        m mVar = new m();
        H = mVar;
        I = b(URL.class, mVar);
        n nVar = new n();
        J = nVar;
        K = b(URI.class, nVar);
        C0129o c0129o = new C0129o();
        L = c0129o;
        M = e(InetAddress.class, c0129o);
        p pVar = new p();
        N = pVar;
        O = b(UUID.class, pVar);
        com.google.gson.x xVarA6 = new q().a();
        P = xVarA6;
        Q = b(Currency.class, xVarA6);
        r rVar = new r();
        R = rVar;
        S = d(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        T = sVar;
        U = b(Locale.class, sVar);
        com.google.gson.internal.bind.f fVar2 = com.google.gson.internal.bind.f.f8703a;
        V = fVar2;
        W = e(com.google.gson.k.class, fVar2);
        X = com.google.gson.internal.bind.d.f8695d;
    }

    public static com.google.gson.y a(TypeToken typeToken, com.google.gson.x xVar) {
        return new t(typeToken, xVar);
    }

    public static com.google.gson.y b(Class cls, com.google.gson.x xVar) {
        return new u(cls, xVar);
    }

    public static com.google.gson.y c(Class cls, Class cls2, com.google.gson.x xVar) {
        return new w(cls, cls2, xVar);
    }

    public static com.google.gson.y d(Class cls, Class cls2, com.google.gson.x xVar) {
        return new x(cls, cls2, xVar);
    }

    public static com.google.gson.y e(Class cls, com.google.gson.x xVar) {
        return new y(cls, xVar);
    }
}
