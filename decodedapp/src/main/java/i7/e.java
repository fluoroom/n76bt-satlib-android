package i7;

import com.fasterxml.jackson.databind.JavaType;
import d6.r;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static String a(JavaType javaType) {
        String str;
        String str2;
        String name = javaType.r().getName();
        if (c(name)) {
            if (name.indexOf(46, 10) >= 0) {
                return null;
            }
            str = "Java 8 date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310";
        } else {
            if (!d(name)) {
                return null;
            }
            str = "Joda date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-joda";
        }
        return String.format("%s type %s not supported by default: add Module \"%s\" to enable handling", str, h.G(javaType), str2);
    }

    public static Object b(JavaType javaType) {
        Class clsR = javaType.r();
        Class clsC0 = h.c0(clsR);
        if (clsC0 != null) {
            return h.m(clsC0);
        }
        if (javaType.L() || javaType.b()) {
            return r.a.NON_EMPTY;
        }
        if (clsR == String.class) {
            return "";
        }
        if (javaType.Z(Date.class)) {
            return new Date(0L);
        }
        if (!javaType.Z(Calendar.class)) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(0L);
        return gregorianCalendar;
    }

    private static boolean c(String str) {
        return str.startsWith("java.time.");
    }

    private static boolean d(String str) {
        return str.startsWith("org.joda.time.");
    }
}
