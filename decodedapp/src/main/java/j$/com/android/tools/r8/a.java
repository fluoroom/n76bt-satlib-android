package j$.com.android.tools.r8;

import j$.time.c;
import j$.time.chrono.b0;
import j$.time.chrono.h0;
import j$.time.chrono.i;
import j$.time.chrono.j;
import j$.time.chrono.m;
import j$.time.chrono.n;
import j$.time.chrono.p;
import j$.time.chrono.t;
import j$.time.chrono.w;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.time.z;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.l;
import j$.util.function.b;
import j$.util.function.d;
import j$.util.function.e;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import org.simpleframework.xml.strategy.Name;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ long t(long j10, long j11) {
        long j12 = j10 + j11;
        if (((j11 ^ j10) < 0) || ((j10 ^ j12) >= 0)) {
            return j12;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ Map.Entry u(Object obj, Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(obj), Objects.requireNonNull(obj2));
    }

    public static /* synthetic */ boolean v(Unsafe unsafe, Object obj, long j10, l lVar) {
        while (true) {
            Unsafe unsafe2 = unsafe;
            Object obj2 = obj;
            long j11 = j10;
            l lVar2 = lVar;
            if (unsafe2.compareAndSwapObject(obj2, j11, (Object) null, lVar2)) {
                return true;
            }
            if (unsafe2.getObject(obj2, j11) != null) {
                return false;
            }
            unsafe = unsafe2;
            obj = obj2;
            j10 = j11;
            lVar = lVar2;
        }
    }

    public static /* synthetic */ long w(long j10, long j11) {
        long j12 = j10 % j11;
        if (j12 == 0) {
            return 0L;
        }
        return (((j10 ^ j11) >> 63) | 1) > 0 ? j12 : j12 + j11;
    }

    public static /* synthetic */ long x(long j10, long j11) {
        long j12 = j10 / j11;
        return (j10 - (j11 * j12) != 0 && (((j10 ^ j11) >> 63) | 1) < 0) ? j12 - 1 : j12;
    }

    public static /* synthetic */ long y(long j10, long j11) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10);
        if (iNumberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        if (iNumberOfLeadingZeros >= 64) {
            if ((j10 >= 0) | (j11 != Long.MIN_VALUE)) {
                long j12 = j10 * j11;
                if (j10 == 0 || j12 / j10 == j11) {
                    return j12;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long z(long j10, long j11) {
        long j12 = j10 - j11;
        if (((j11 ^ j10) >= 0) || ((j10 ^ j12) >= 0)) {
            return j12;
        }
        throw new ArithmeticException();
    }

    public static b b(DoubleConsumer doubleConsumer, DoubleConsumer doubleConsumer2) {
        Objects.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: j$.util.function.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ DoubleConsumer f17808b;

            public /* synthetic */ b(DoubleConsumer doubleConsumer22) {
                doubleConsumer = doubleConsumer22;
            }

            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.com.android.tools.r8.a.b(this, doubleConsumer3);
            }

            @Override // java.util.function.DoubleConsumer
            public final void accept(double d10) {
                doubleConsumer.accept(d10);
                doubleConsumer.accept(d10);
            }
        };
    }

    public static d c(IntConsumer intConsumer, IntConsumer intConsumer2) {
        Objects.requireNonNull(intConsumer2);
        return new IntConsumer() { // from class: j$.util.function.d

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ IntConsumer f17813b;

            public /* synthetic */ d(IntConsumer intConsumer22) {
                intConsumer = intConsumer22;
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer3) {
                return j$.com.android.tools.r8.a.c(this, intConsumer3);
            }

            @Override // java.util.function.IntConsumer
            public final void accept(int i10) {
                intConsumer.accept(i10);
                intConsumer.accept(i10);
            }
        };
    }

    public static e d(LongConsumer longConsumer, LongConsumer longConsumer2) {
        Objects.requireNonNull(longConsumer2);
        return new LongConsumer() { // from class: j$.util.function.e

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LongConsumer f17815b;

            public /* synthetic */ e(LongConsumer longConsumer22) {
                longConsumer = longConsumer22;
            }

            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return j$.com.android.tools.r8.a.d(this, longConsumer3);
            }

            @Override // java.util.function.LongConsumer
            public final void accept(long j10) {
                longConsumer.accept(j10);
                longConsumer.accept(j10);
            }
        };
    }

    public static String A(Object obj, Object obj2) {
        String string;
        String string2;
        String str = "null";
        if (obj == null || (string = obj.toString()) == null) {
            string = "null";
        }
        int length = string.length();
        if (obj2 != null && (string2 = obj2.toString()) != null) {
            str = string2;
        }
        int length2 = str.length();
        char[] cArr = new char[length + length2 + 1];
        string.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }

    public static boolean l(n nVar, q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.ERA : qVar != null && qVar.i(nVar);
    }

    public static m s(j$.time.temporal.n nVar) {
        Objects.requireNonNull(nVar, "temporal");
        Object objRequireNonNull = (m) nVar.l(r.f17631b);
        t tVar = t.f17501c;
        if (objRequireNonNull == null) {
            objRequireNonNull = Objects.requireNonNull(tVar, "defaultObj");
        }
        return (m) objRequireNonNull;
    }

    public static int h(j jVar, q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i10 = i.f17476a[((j$.time.temporal.a) qVar).ordinal()];
            if (i10 == 1) {
                throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 != 2) {
                return jVar.p().i(qVar);
            }
            return jVar.g().f17655a;
        }
        return r.a(jVar, qVar);
    }

    public static int i(n nVar, q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return nVar.getValue();
        }
        return r.a(nVar, qVar);
    }

    public static long j(n nVar, q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return nVar.getValue();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
        return qVar.l(nVar);
    }

    public static m B(String str) {
        ConcurrentHashMap concurrentHashMap = j$.time.chrono.a.f17456a;
        Objects.requireNonNull(str, Name.MARK);
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = j$.time.chrono.a.f17456a;
            m mVar = (m) concurrentHashMap2.get(str);
            if (mVar == null) {
                mVar = (m) j$.time.chrono.a.f17457b.get(str);
            }
            if (mVar != null) {
                return mVar;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                for (m mVar2 : ServiceLoader.load(m.class)) {
                    if (str.equals(mVar2.h()) || str.equals(mVar2.n())) {
                        return mVar2;
                    }
                }
                throw new j$.time.b("Unknown chronology: " + str);
            }
            p pVar = p.f17485l;
            pVar.getClass();
            j$.time.chrono.a.i(pVar, "Hijrah-umalqura");
            w wVar = w.f17504c;
            wVar.getClass();
            j$.time.chrono.a.i(wVar, "Japanese");
            b0 b0Var = b0.f17459c;
            b0Var.getClass();
            j$.time.chrono.a.i(b0Var, "Minguo");
            h0 h0Var = h0.f17475c;
            h0Var.getClass();
            j$.time.chrono.a.i(h0Var, "ThaiBuddhist");
            try {
                for (j$.time.chrono.a aVar : Arrays.asList(new j$.time.chrono.a[0])) {
                    if (!aVar.h().equals("ISO")) {
                        j$.time.chrono.a.i(aVar, aVar.h());
                    }
                }
                t tVar = t.f17501c;
                tVar.getClass();
                j$.time.chrono.a.i(tVar, "ISO");
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        }
    }

    public static Object p(n nVar, j$.time.format.b bVar) {
        if (bVar == r.f17632c) {
            return j$.time.temporal.b.ERAS;
        }
        return r.c(nVar, bVar);
    }

    public static Object n(j$.time.chrono.e eVar, j$.time.format.b bVar) {
        if (bVar == r.f17630a || bVar == r.f17634e || bVar == r.f17633d) {
            return null;
        }
        if (bVar == r.f17636g) {
            return eVar.b();
        }
        if (bVar == r.f17631b) {
            return eVar.a();
        }
        if (bVar == r.f17632c) {
            return j$.time.temporal.b.NANOS;
        }
        return bVar.a(eVar);
    }

    public static boolean k(j$.time.chrono.b bVar, q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).isDateBased();
        }
        return qVar != null && qVar.i(bVar);
    }

    public static long q(j$.time.chrono.e eVar, z zVar) {
        Objects.requireNonNull(zVar, "offset");
        return ((eVar.f().x() * 86400) + ((long) eVar.b().O())) - ((long) zVar.f17655a);
    }

    public static Object o(j jVar, j$.time.format.b bVar) {
        if (bVar == r.f17634e || bVar == r.f17630a) {
            return jVar.v();
        }
        if (bVar == r.f17633d) {
            return jVar.g();
        }
        if (bVar == r.f17636g) {
            return jVar.b();
        }
        if (bVar == r.f17631b) {
            return jVar.a();
        }
        if (bVar == r.f17632c) {
            return j$.time.temporal.b.NANOS;
        }
        return bVar.a(jVar);
    }

    public static int f(j$.time.chrono.e eVar, j$.time.chrono.e eVar2) {
        int iCompareTo = eVar.f().compareTo(eVar2.f());
        return (iCompareTo == 0 && (iCompareTo = eVar.b().compareTo(eVar2.b())) == 0) ? ((j$.time.chrono.a) eVar.a()).h().compareTo(eVar2.a().h()) : iCompareTo;
    }

    public static Object m(j$.time.chrono.b bVar, j$.time.format.b bVar2) {
        if (bVar2 == r.f17630a || bVar2 == r.f17634e || bVar2 == r.f17633d || bVar2 == r.f17636g) {
            return null;
        }
        if (bVar2 == r.f17631b) {
            return bVar.a();
        }
        if (bVar2 == r.f17632c) {
            return j$.time.temporal.b.DAYS;
        }
        return bVar2.a(bVar);
    }

    public static j$.time.temporal.m a(j$.time.chrono.b bVar, j$.time.temporal.m mVar) {
        return mVar.c(bVar.x(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static long r(j jVar) {
        return ((jVar.f().x() * 86400) + ((long) jVar.b().O())) - ((long) jVar.g().f17655a);
    }

    public static int g(j jVar, j jVar2) {
        int iCompare = Long.compare(jVar.B(), jVar2.B());
        return (iCompare == 0 && (iCompare = jVar.b().f17589d - jVar2.b().f17589d) == 0 && (iCompare = jVar.p().compareTo(jVar2.p())) == 0 && (iCompare = jVar.v().h().compareTo(jVar2.v().h())) == 0) ? ((j$.time.chrono.a) jVar.a()).h().compareTo(jVar2.a().h()) : iCompare;
    }

    public static int e(j$.time.chrono.b bVar, j$.time.chrono.b bVar2) {
        int iCompare = Long.compare(bVar.x(), bVar2.x());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((j$.time.chrono.a) bVar.a()).h().compareTo(bVar2.a().h());
    }
}
