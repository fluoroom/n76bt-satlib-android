package com.google.gson.internal.sql;

import com.google.gson.f;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
final class a extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final y f8804b = new C0130a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DateFormat f8805a;

    /* JADX INFO: renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    class C0130a implements y {
        C0130a() {
        }

        @Override // com.google.gson.y
        public x a(f fVar, TypeToken typeToken) {
            C0130a c0130a = null;
            if (typeToken.c() == Date.class) {
                return new a(c0130a);
            }
            return null;
        }
    }

    /* synthetic */ a(C0130a c0130a) {
        this();
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Date b(ca.a aVar) throws IOException {
        Date date;
        if (aVar.A0() == ca.b.NULL) {
            aVar.w0();
            return null;
        }
        String strY0 = aVar.y0();
        synchronized (this) {
            TimeZone timeZone = this.f8805a.getTimeZone();
            try {
                try {
                    date = new Date(this.f8805a.parse(strY0).getTime());
                } catch (ParseException e10) {
                    throw new r("Failed parsing '" + strY0 + "' as SQL Date; at path " + aVar.x(), e10);
                }
            } finally {
                this.f8805a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(ca.c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.S();
            return;
        }
        synchronized (this) {
            str = this.f8805a.format((java.util.Date) date);
        }
        cVar.B0(str);
    }

    private a() {
        this.f8805a = new SimpleDateFormat("MMM d, yyyy");
    }
}
