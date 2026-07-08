package rb;

import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Logger f25807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Level f25808b;

    enum a {
        INBOUND,
        OUTBOUND
    }

    private enum b {
        HEADER_TABLE_SIZE(1),
        ENABLE_PUSH(2),
        MAX_CONCURRENT_STREAMS(4),
        MAX_FRAME_SIZE(5),
        MAX_HEADER_LIST_SIZE(6),
        INITIAL_WINDOW_SIZE(7);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f25819a;

        b(int i10) {
            this.f25819a = i10;
        }

        public int a() {
            return this.f25819a;
        }
    }

    k(Level level, Class cls) {
        this(level, Logger.getLogger(cls.getName()));
    }

    private boolean a() {
        return this.f25807a.isLoggable(this.f25808b);
    }

    private static String l(tb.i iVar) {
        EnumMap enumMap = new EnumMap(b.class);
        for (b bVar : b.values()) {
            if (iVar.d(bVar.a())) {
                enumMap.put(bVar, Integer.valueOf(iVar.a(bVar.a())));
            }
        }
        return enumMap.toString();
    }

    private static String m(vh.e eVar) {
        if (eVar.size() <= 64) {
            return eVar.z0().n();
        }
        return eVar.A0((int) Math.min(eVar.size(), 64L)).n() + "...";
    }

    void b(a aVar, int i10, vh.e eVar, int i11, boolean z10) {
        if (a()) {
            this.f25807a.log(this.f25808b, aVar + " DATA: streamId=" + i10 + " endStream=" + z10 + " length=" + i11 + " bytes=" + m(eVar));
        }
    }

    void c(a aVar, int i10, tb.a aVar2, vh.h hVar) {
        if (a()) {
            this.f25807a.log(this.f25808b, aVar + " GO_AWAY: lastStreamId=" + i10 + " errorCode=" + aVar2 + " length=" + hVar.Q() + " bytes=" + m(new vh.e().Z(hVar)));
        }
    }

    void d(a aVar, int i10, List list, boolean z10) {
        if (a()) {
            this.f25807a.log(this.f25808b, aVar + " HEADERS: streamId=" + i10 + " headers=" + list + " endStream=" + z10);
        }
    }

    void e(a aVar, long j10) {
        if (a()) {
            this.f25807a.log(this.f25808b, aVar + " PING: ack=false bytes=" + j10);
        }
    }

    void f(a aVar, long j10) {
        if (a()) {
            this.f25807a.log(this.f25808b, aVar + " PING: ack=true bytes=" + j10);
        }
    }

    void g(a aVar, int i10, int i11, List list) {
        if (a()) {
            this.f25807a.log(this.f25808b, aVar + " PUSH_PROMISE: streamId=" + i10 + " promisedStreamId=" + i11 + " headers=" + list);
        }
    }

    void h(a aVar, int i10, tb.a aVar2) {
        if (a()) {
            this.f25807a.log(this.f25808b, aVar + " RST_STREAM: streamId=" + i10 + " errorCode=" + aVar2);
        }
    }

    void i(a aVar, tb.i iVar) {
        if (a()) {
            this.f25807a.log(this.f25808b, aVar + " SETTINGS: ack=false settings=" + l(iVar));
        }
    }

    void j(a aVar) {
        if (a()) {
            this.f25807a.log(this.f25808b, aVar + " SETTINGS: ack=true");
        }
    }

    void k(a aVar, int i10, long j10) {
        if (a()) {
            this.f25807a.log(this.f25808b, aVar + " WINDOW_UPDATE: streamId=" + i10 + " windowSizeIncrement=" + j10);
        }
    }

    k(Level level, Logger logger) {
        this.f25808b = (Level) r9.l.o(level, "level");
        this.f25807a = (Logger) r9.l.o(logger, "logger");
    }
}
