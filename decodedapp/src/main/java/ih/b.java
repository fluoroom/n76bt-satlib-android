package ih;

import com.facebook.stetho.server.http.HttpStatus;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.Arrays;
import java.util.logging.Logger;
import rd.g0;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final String b(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - ((long) HttpStatus.HTTP_INTERNAL_SERVER_ERROR)) / ((long) CloseCodes.NORMAL_CLOSURE)) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + ((long) HttpStatus.HTTP_INTERNAL_SERVER_ERROR)) / ((long) CloseCodes.NORMAL_CLOSURE)) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j10 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        g0 g0Var = g0.f25951a;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        m.d(str2, "format(...)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Logger logger, a aVar, c cVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.h());
        sb2.append(' ');
        g0 g0Var = g0.f25951a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        m.d(str2, "format(...)");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(aVar.b());
        logger.fine(sb2.toString());
    }
}
