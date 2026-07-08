package u6;

import d6.k;
import java.lang.reflect.Constructor;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashSet f28263a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28264a;

        static {
            int[] iArr = new int[r6.b.values().length];
            f28264a = iArr;
            try {
                iArr[r6.b.AsEmpty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28264a[r6.b.AsNull.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28264a[r6.b.TryConvert.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class d extends c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final d f28268g = new d();

        public d() {
            super(Date.class);
        }

        @Override // u6.k.c, s6.i
        public /* bridge */ /* synthetic */ p6.l d(p6.h hVar, p6.d dVar) {
            return super.d(hVar, dVar);
        }

        @Override // p6.l
        /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
        public Date e(e6.j jVar, p6.h hVar) {
            return s0(jVar, hVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.k.c
        /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
        public d e1(DateFormat dateFormat, String str) {
            return new d(this, dateFormat, str);
        }

        @Override // p6.l
        public Object k(p6.h hVar) {
            return new Date(0L);
        }

        @Override // u6.k.c, u6.g0, p6.l
        public /* bridge */ /* synthetic */ h7.c r() {
            return super.r();
        }

        public d(d dVar, DateFormat dateFormat, String str) {
            super(dVar, dateFormat, str);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f28263a = hashSet;
        hashSet.add("java.util.Calendar");
        hashSet.add("java.util.GregorianCalendar");
        hashSet.add("java.util.Date");
    }

    public static p6.l a(Class cls, String str) {
        if (!f28263a.contains(str)) {
            return null;
        }
        if (cls == Calendar.class) {
            return new b();
        }
        if (cls == Date.class) {
            return d.f28268g;
        }
        if (cls == GregorianCalendar.class) {
            return new b(GregorianCalendar.class);
        }
        return null;
    }

    public static class b extends c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected final Constructor f28265g;

        public b() {
            super(Calendar.class);
            this.f28265g = null;
        }

        @Override // u6.k.c, s6.i
        public /* bridge */ /* synthetic */ p6.l d(p6.h hVar, p6.d dVar) {
            return super.d(hVar, dVar);
        }

        @Override // p6.l
        /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
        public Calendar e(e6.j jVar, p6.h hVar) {
            Date dateS0 = s0(jVar, hVar);
            if (dateS0 == null) {
                return null;
            }
            Constructor constructor = this.f28265g;
            if (constructor == null) {
                return hVar.C(dateS0);
            }
            try {
                Calendar calendar = (Calendar) constructor.newInstance(null);
                calendar.setTimeInMillis(dateS0.getTime());
                TimeZone timeZoneJ0 = hVar.j0();
                if (timeZoneJ0 == null) {
                    return calendar;
                }
                calendar.setTimeZone(timeZoneJ0);
                return calendar;
            } catch (Exception e10) {
                return (Calendar) hVar.l0(p(), dateS0, e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // u6.k.c
        /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
        public b e1(DateFormat dateFormat, String str) {
            return new b(this, dateFormat, str);
        }

        @Override // p6.l
        public Object k(p6.h hVar) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(0L);
            return gregorianCalendar;
        }

        @Override // u6.k.c, u6.g0, p6.l
        public /* bridge */ /* synthetic */ h7.c r() {
            return super.r();
        }

        public b(Class cls) {
            super(cls);
            this.f28265g = i7.h.q(cls, false);
        }

        public b(b bVar, DateFormat dateFormat, String str) {
            super(bVar, dateFormat, str);
            this.f28265g = bVar.f28265g;
        }
    }

    protected static abstract class c extends g0 implements s6.i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final DateFormat f28266e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected final String f28267f;

        protected c(Class cls) {
            super(cls);
            this.f28266e = null;
            this.f28267f = null;
        }

        public p6.l d(p6.h hVar, p6.d dVar) {
            DateFormat dateFormat;
            DateFormat dateFormatC;
            k.d dVarU0 = U0(hVar, dVar, p());
            if (dVarU0 != null) {
                TimeZone timeZoneJ = dVarU0.j();
                Boolean boolF = dVarU0.f();
                if (dVarU0.n()) {
                    String strH = dVarU0.h();
                    DateFormat simpleDateFormat = new SimpleDateFormat(strH, dVarU0.l() ? dVarU0.g() : hVar.g0());
                    if (timeZoneJ == null) {
                        timeZoneJ = hVar.j0();
                    }
                    simpleDateFormat.setTimeZone(timeZoneJ);
                    if (boolF != null) {
                        simpleDateFormat.setLenient(boolF.booleanValue());
                    }
                    return e1(simpleDateFormat, strH);
                }
                if (timeZoneJ != null) {
                    DateFormat dateFormatK = hVar.k().k();
                    if (dateFormatK.getClass() == i7.a0.class) {
                        i7.a0 a0VarD = ((i7.a0) dateFormatK).G(timeZoneJ).D(dVarU0.l() ? dVarU0.g() : hVar.g0());
                        dateFormatC = a0VarD;
                        if (boolF != null) {
                            dateFormatC = a0VarD.C(boolF);
                        }
                    } else {
                        DateFormat dateFormat2 = (DateFormat) dateFormatK.clone();
                        dateFormat2.setTimeZone(timeZoneJ);
                        dateFormatC = dateFormat2;
                        if (boolF != null) {
                            dateFormat2.setLenient(boolF.booleanValue());
                            dateFormatC = dateFormat2;
                        }
                    }
                    return e1(dateFormatC, this.f28267f);
                }
                if (boolF != null) {
                    DateFormat dateFormatK2 = hVar.k().k();
                    String strA = this.f28267f;
                    if (dateFormatK2.getClass() == i7.a0.class) {
                        i7.a0 a0VarC = ((i7.a0) dateFormatK2).C(boolF);
                        strA = a0VarC.A();
                        dateFormat = a0VarC;
                    } else {
                        DateFormat dateFormat3 = (DateFormat) dateFormatK2.clone();
                        dateFormat3.setLenient(boolF.booleanValue());
                        boolean z10 = dateFormat3 instanceof SimpleDateFormat;
                        dateFormat = dateFormat3;
                        if (z10) {
                            ((SimpleDateFormat) dateFormat3).toPattern();
                            dateFormat = dateFormat3;
                        }
                    }
                    if (strA == null) {
                        strA = "[unknown]";
                    }
                    return e1(dateFormat, strA);
                }
            }
            return this;
        }

        protected abstract c e1(DateFormat dateFormat, String str);

        @Override // u6.g0, p6.l
        public h7.c r() {
            return h7.c.DateTime;
        }

        @Override // u6.c0
        protected Date s0(e6.j jVar, p6.h hVar) {
            Date date;
            if (this.f28266e == null || !jVar.N0(e6.m.VALUE_STRING)) {
                return super.s0(jVar, hVar);
            }
            String strTrim = jVar.C0().trim();
            if (strTrim.isEmpty()) {
                if (a.f28264a[G(hVar, strTrim).ordinal()] != 1) {
                    return null;
                }
                return new Date(0L);
            }
            synchronized (this.f28266e) {
                try {
                    try {
                        date = this.f28266e.parse(strTrim);
                    } catch (ParseException unused) {
                        return (Date) hVar.z0(p(), strTrim, "expected format \"%s\"", this.f28267f);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return date;
        }

        protected c(c cVar, DateFormat dateFormat, String str) {
            super(cVar.f28200a);
            this.f28266e = dateFormat;
            this.f28267f = str;
        }
    }
}
