package com.google.gson.internal.bind;

import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import j$.util.Objects;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import z9.c0;
import z9.w;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f8690c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f8691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f8692b;

    class a implements y {
        a() {
        }

        @Override // com.google.gson.y
        public x a(com.google.gson.f fVar, TypeToken typeToken) {
            a aVar = null;
            if (typeToken.c() != Date.class) {
                return null;
            }
            int i10 = 2;
            return new c(b.f8693b, i10, i10, aVar);
        }

        public String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f8693b = new a(Date.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f8694a;

        class a extends b {
            a(Class cls) {
                super(cls);
            }

            @Override // com.google.gson.internal.bind.c.b
            protected Date d(Date date) {
                return date;
            }
        }

        protected b(Class cls) {
            this.f8694a = cls;
        }

        private y c(c cVar) {
            return o.b(this.f8694a, cVar);
        }

        public final y a(int i10, int i11) {
            return c(new c(this, i10, i11, null));
        }

        public final y b(String str) {
            return c(new c(this, str, (a) null));
        }

        protected abstract Date d(Date date);
    }

    /* synthetic */ c(b bVar, int i10, int i11, a aVar) {
        this(bVar, i10, i11);
    }

    private Date e(ca.a aVar) throws IOException {
        String strY0 = aVar.y0();
        synchronized (this.f8692b) {
            try {
                for (DateFormat dateFormat : this.f8692b) {
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            return dateFormat.parse(strY0);
                        } catch (ParseException unused) {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } finally {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
                try {
                    return aa.a.c(strY0, new ParsePosition(0));
                } catch (ParseException e10) {
                    throw new r("Failed parsing '" + strY0 + "' as Date; at path " + aVar.x(), e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date b(ca.a aVar) throws IOException {
        if (aVar.A0() == ca.b.NULL) {
            aVar.w0();
            return null;
        }
        return this.f8691a.d(e(aVar));
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(ca.c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.S();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f8692b.get(0);
        synchronized (this.f8692b) {
            str = dateFormat.format(date);
        }
        cVar.B0(str);
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat) this.f8692b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    /* synthetic */ c(b bVar, String str, a aVar) {
        this(bVar, str);
    }

    private c(b bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f8692b = arrayList;
        Objects.requireNonNull(bVar);
        this.f8691a = bVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private c(b bVar, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f8692b = arrayList;
        Objects.requireNonNull(bVar);
        this.f8691a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (w.c()) {
            arrayList.add(c0.c(i10, i11));
        }
    }
}
