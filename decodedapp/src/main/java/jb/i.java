package jb;

import android.text.format.Time;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f18627a = new i();

    public final String a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? i10 != 16 ? i10 != 32 ? "-" : "A" : "E" : "W" : "I" : "D" : "V";
    }

    public String b(int i10, Thread thread, long j10, String str, String str2, Throwable th2) {
        long j11 = j10 % 1000;
        Time time = new Time();
        time.set(j10);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a(i10));
        sb2.append('/');
        sb2.append(time.format("%Y-%m-%d %H:%M:%S"));
        sb2.append('.');
        if (j11 < 10) {
            sb2.append("00");
        } else if (j11 < 100) {
            sb2.append('0');
        }
        sb2.append(j11);
        sb2.append(' ');
        sb2.append('[');
        if (thread == null) {
            sb2.append("N/A");
        } else {
            sb2.append(thread.getName());
        }
        sb2.append(']');
        sb2.append('[');
        sb2.append(str);
        sb2.append(']');
        sb2.append(' ');
        sb2.append(str2);
        sb2.append('\n');
        if (th2 != null) {
            sb2.append("* Exception : \n");
            sb2.append(Log.getStackTraceString(th2));
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
