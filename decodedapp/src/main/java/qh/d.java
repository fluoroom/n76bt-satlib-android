package qh;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f25227a = new d();

    private d() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        m.e(logRecord, "record");
        c cVar = c.f25224a;
        String loggerName = logRecord.getLoggerName();
        m.d(loggerName, "getLoggerName(...)");
        int iB = e.b(logRecord);
        String message = logRecord.getMessage();
        m.d(message, "getMessage(...)");
        cVar.a(loggerName, iB, message, logRecord.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
