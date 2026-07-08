package i7;

import com.facebook.stetho.websocket.CloseCodes;
import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class a0 extends DateFormat {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final Pattern f15824g = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static final Pattern f15825h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected static final String[] f15826r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected static final TimeZone f15827s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected static final Locale f15828t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected static final DateFormat f15829u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a0 f15830v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected static final Calendar f15831w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected transient TimeZone f15832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Locale f15833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Boolean f15834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Calendar f15835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient DateFormat f15836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f15837f;

    static {
        try {
            f15825h = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
            f15826r = new String[]{"yyyy-MM-dd'T'HH:mm:ss.SSSX", "yyyy-MM-dd'T'HH:mm:ss.SSS", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"};
            TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
            f15827s = timeZone;
            Locale locale = Locale.US;
            f15828t = locale;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", locale);
            f15829u = simpleDateFormat;
            simpleDateFormat.setTimeZone(timeZone);
            f15830v = new a0();
            f15831w = new GregorianCalendar(timeZone, locale);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public a0() {
        this.f15837f = true;
        this.f15833b = f15828t;
    }

    private static final DateFormat b(DateFormat dateFormat, String str, TimeZone timeZone, Locale locale, Boolean bool) {
        DateFormat simpleDateFormat;
        if (locale.equals(f15828t)) {
            simpleDateFormat = (DateFormat) dateFormat.clone();
            if (timeZone != null) {
                simpleDateFormat.setTimeZone(timeZone);
            }
        } else {
            simpleDateFormat = new SimpleDateFormat(str, locale);
            if (timeZone == null) {
                timeZone = f15827s;
            }
            simpleDateFormat.setTimeZone(timeZone);
        }
        if (bool != null) {
            simpleDateFormat.setLenient(bool.booleanValue());
        }
        return simpleDateFormat;
    }

    protected static boolean d(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return obj != null && obj.equals(obj2);
    }

    private static int i(String str, int i10) {
        return ((str.charAt(i10) - '0') * 10) + (str.charAt(i10 + 1) - '0');
    }

    private static int j(String str, int i10) {
        return ((str.charAt(i10) - '0') * CloseCodes.NORMAL_CLOSURE) + ((str.charAt(i10 + 1) - '0') * 100) + ((str.charAt(i10 + 2) - '0') * 10) + (str.charAt(i10 + 3) - '0');
    }

    private Date o(String str, ParsePosition parsePosition) throws ParseException {
        try {
            return new Date(i6.i.m(str));
        } catch (NumberFormatException unused) {
            throw new ParseException(String.format("Timestamp value %s out of 64-bit value range", str), parsePosition.getErrorIndex());
        }
    }

    private static void t(StringBuffer stringBuffer, int i10) {
        int i11 = i10 / 10;
        if (i11 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i11 + 48));
            i10 -= i11 * 10;
        }
        stringBuffer.append((char) (i10 + 48));
    }

    private static void v(StringBuffer stringBuffer, int i10) {
        int i11 = i10 / 100;
        if (i11 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i11 + 48));
            i10 -= i11 * 100;
        }
        t(stringBuffer, i10);
    }

    private static void w(StringBuffer stringBuffer, int i10) {
        int i11 = i10 / 100;
        if (i11 == 0) {
            stringBuffer.append('0');
            stringBuffer.append('0');
        } else {
            if (i11 > 99) {
                stringBuffer.append(i11);
            } else {
                t(stringBuffer, i11);
            }
            i10 -= i11 * 100;
        }
        t(stringBuffer, i10);
    }

    public String A() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("[one of: '");
        sb2.append("yyyy-MM-dd'T'HH:mm:ss.SSSX");
        sb2.append("', '");
        sb2.append("EEE, dd MMM yyyy HH:mm:ss zzz");
        sb2.append("' (");
        sb2.append(Boolean.FALSE.equals(this.f15834c) ? "strict" : "lenient");
        sb2.append(")]");
        return sb2.toString();
    }

    public a0 C(Boolean bool) {
        return d(bool, this.f15834c) ? this : new a0(this.f15832a, this.f15833b, bool, this.f15837f);
    }

    public a0 D(Locale locale) {
        return locale.equals(this.f15833b) ? this : new a0(this.f15832a, locale, this.f15834c, this.f15837f);
    }

    public a0 G(TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = f15827s;
        }
        TimeZone timeZone2 = this.f15832a;
        return (timeZone == timeZone2 || timeZone.equals(timeZone2)) ? this : new a0(timeZone, this.f15833b, this.f15834c, this.f15837f);
    }

    protected void a() {
        this.f15836e = null;
    }

    @Override // java.text.DateFormat
    public boolean equals(Object obj) {
        return obj == this;
    }

    protected void f(TimeZone timeZone, Locale locale, Date date, StringBuffer stringBuffer) {
        Calendar calendarH = h(timeZone);
        calendarH.setTime(date);
        int i10 = calendarH.get(1);
        if (calendarH.get(0) == 0) {
            g(stringBuffer, i10);
        } else {
            if (i10 > 9999) {
                stringBuffer.append('+');
            }
            w(stringBuffer, i10);
        }
        stringBuffer.append('-');
        t(stringBuffer, calendarH.get(2) + 1);
        stringBuffer.append('-');
        t(stringBuffer, calendarH.get(5));
        stringBuffer.append('T');
        t(stringBuffer, calendarH.get(11));
        stringBuffer.append(':');
        t(stringBuffer, calendarH.get(12));
        stringBuffer.append(':');
        t(stringBuffer, calendarH.get(13));
        stringBuffer.append('.');
        v(stringBuffer, calendarH.get(14));
        int offset = timeZone.getOffset(calendarH.getTimeInMillis());
        if (offset == 0) {
            if (this.f15837f) {
                stringBuffer.append("+00:00");
                return;
            } else {
                stringBuffer.append("+0000");
                return;
            }
        }
        int i11 = offset / 60000;
        int iAbs = Math.abs(i11 / 60);
        int iAbs2 = Math.abs(i11 % 60);
        stringBuffer.append(offset < 0 ? '-' : '+');
        t(stringBuffer, iAbs);
        if (this.f15837f) {
            stringBuffer.append(':');
        }
        t(stringBuffer, iAbs2);
    }

    @Override // java.text.DateFormat
    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        TimeZone timeZone = this.f15832a;
        if (timeZone == null) {
            timeZone = f15827s;
        }
        f(timeZone, this.f15833b, date, stringBuffer);
        return stringBuffer;
    }

    protected void g(StringBuffer stringBuffer, int i10) {
        if (i10 == 1) {
            stringBuffer.append("+0000");
        } else {
            stringBuffer.append('-');
            w(stringBuffer, i10 - 1);
        }
    }

    @Override // java.text.DateFormat
    public TimeZone getTimeZone() {
        return this.f15832a;
    }

    protected Calendar h(TimeZone timeZone) {
        Calendar calendar = this.f15835d;
        if (calendar == null) {
            calendar = (Calendar) f15831w.clone();
            this.f15835d = calendar;
        }
        if (!calendar.getTimeZone().equals(timeZone)) {
            calendar.setTimeZone(timeZone);
        }
        calendar.setLenient(isLenient());
        return calendar;
    }

    @Override // java.text.DateFormat
    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // java.text.DateFormat
    public boolean isLenient() {
        Boolean bool = this.f15834c;
        return bool == null || bool.booleanValue();
    }

    protected Date k(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        int length = str.length();
        TimeZone timeZone = f15827s;
        if (this.f15832a != null && 'Z' != str.charAt(length - 1)) {
            timeZone = this.f15832a;
        }
        Calendar calendarH = h(timeZone);
        calendarH.clear();
        int iCharAt = 0;
        if (length > 10) {
            Matcher matcher = f15825h.matcher(str);
            if (matcher.matches()) {
                int iStart = matcher.start(2);
                int iEnd = matcher.end(2);
                int i10 = iEnd - iStart;
                if (i10 > 1) {
                    int i11 = i(str, iStart + 1) * 3600;
                    if (i10 >= 5) {
                        i11 += i(str, iEnd - 2) * 60;
                    }
                    calendarH.set(15, str.charAt(iStart) == '-' ? i11 * (-1000) : i11 * CloseCodes.NORMAL_CLOSURE);
                    calendarH.set(16, 0);
                }
                calendarH.set(j(str, 0), i(str, 5) - 1, i(str, 8), i(str, 11), i(str, 14), (length <= 16 || str.charAt(16) != ':') ? 0 : i(str, 17));
                int iStart2 = matcher.start(1);
                int i12 = iStart2 + 1;
                int iEnd2 = matcher.end(1);
                if (i12 >= iEnd2) {
                    calendarH.set(14, 0);
                } else {
                    int i13 = iEnd2 - i12;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 != 2) {
                                if (i13 != 3 && i13 > 9) {
                                    throw new ParseException(String.format("Cannot parse date \"%s\": invalid fractional seconds '%s'; can use at most 9 digits", str, matcher.group(1).substring(1)), i12);
                                }
                                iCharAt = str.charAt(iStart2 + 3) - '0';
                            }
                            iCharAt += (str.charAt(iStart2 + 2) - '0') * 10;
                        }
                        iCharAt += (str.charAt(i12) - '0') * 100;
                    }
                    calendarH.set(14, iCharAt);
                }
                return calendarH.getTime();
            }
            str2 = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
        } else {
            if (f15824g.matcher(str).matches()) {
                calendarH.set(j(str, 0), i(str, 5) - 1, i(str, 8), 0, 0, 0);
                calendarH.set(14, 0);
                return calendarH.getTime();
            }
            str2 = "yyyy-MM-dd";
        }
        throw new ParseException(String.format("Cannot parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)", str, str2, this.f15834c), 0);
    }

    protected Date n(String str, ParsePosition parsePosition) {
        if (r(str)) {
            return x(str, parsePosition);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt < '0' || cCharAt > '9') {
                if (length > 0 || cCharAt != '-') {
                    break;
                }
            }
        }
        return (length >= 0 || !(str.charAt(0) == '-' || i6.i.a(str, false))) ? z(str, parsePosition) : o(str, parsePosition);
    }

    @Override // java.text.DateFormat, java.text.Format
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public a0 clone() {
        return new a0(this.f15832a, this.f15833b, this.f15834c, this.f15837f);
    }

    @Override // java.text.DateFormat
    public Date parse(String str) throws ParseException {
        String strTrim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date dateN = n(strTrim, parsePosition);
        if (dateN != null) {
            return dateN;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f15826r) {
            if (sb2.length() > 0) {
                sb2.append("\", \"");
            } else {
                sb2.append('\"');
            }
            sb2.append(str2);
        }
        sb2.append('\"');
        throw new ParseException(String.format("Cannot parse date \"%s\": not compatible with any of standard forms (%s)", strTrim, sb2.toString()), parsePosition.getErrorIndex());
    }

    protected boolean r(String str) {
        return str.length() >= 7 && Character.isDigit(str.charAt(0)) && Character.isDigit(str.charAt(3)) && str.charAt(4) == '-' && Character.isDigit(str.charAt(5));
    }

    @Override // java.text.DateFormat
    public void setLenient(boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        if (d(boolValueOf, this.f15834c)) {
            return;
        }
        this.f15834c = boolValueOf;
        a();
    }

    @Override // java.text.DateFormat
    public void setTimeZone(TimeZone timeZone) {
        if (timeZone.equals(this.f15832a)) {
            return;
        }
        a();
        this.f15832a = timeZone;
    }

    public String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", getClass().getName(), this.f15832a, this.f15833b, this.f15834c);
    }

    protected Date x(String str, ParsePosition parsePosition) throws ParseException {
        try {
            return k(str, parsePosition);
        } catch (IllegalArgumentException e10) {
            throw new ParseException(String.format("Cannot parse date \"%s\", problem: %s", str, e10.getMessage()), parsePosition.getErrorIndex());
        }
    }

    protected Date z(String str, ParsePosition parsePosition) {
        if (this.f15836e == null) {
            this.f15836e = b(f15829u, "EEE, dd MMM yyyy HH:mm:ss zzz", this.f15832a, this.f15833b, this.f15834c);
        }
        return this.f15836e.parse(str, parsePosition);
    }

    protected a0(TimeZone timeZone, Locale locale, Boolean bool, boolean z10) {
        this.f15832a = timeZone;
        this.f15833b = locale;
        this.f15834c = bool;
        this.f15837f = z10;
    }

    @Override // java.text.DateFormat
    public Date parse(String str, ParsePosition parsePosition) {
        try {
            return n(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }
}
