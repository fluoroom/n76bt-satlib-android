package j$.time.chrono;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f17456a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f17457b = new ConcurrentHashMap();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return h().compareTo(((m) obj).h());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    public static m i(m mVar, String str) {
        String strN;
        m mVar2 = (m) f17456a.putIfAbsent(str, mVar);
        if (mVar2 == null && (strN = mVar.n()) != null) {
            f17457b.putIfAbsent(strN, mVar);
        }
        return mVar2;
    }

    @Override // j$.time.chrono.m
    public e u(j$.time.i iVar) {
        try {
            return t(iVar).y(j$.time.k.E(iVar));
        } catch (j$.time.b e10) {
            throw new j$.time.b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + j$.time.i.class, e10);
        }
    }

    @Override // j$.time.chrono.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && h().compareTo(((a) obj).h()) == 0;
    }

    @Override // j$.time.chrono.m
    public final int hashCode() {
        return getClass().hashCode() ^ h().hashCode();
    }

    @Override // j$.time.chrono.m
    public final String toString() {
        return h();
    }
}
