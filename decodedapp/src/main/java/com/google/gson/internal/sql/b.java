package com.google.gson.internal.sql;

import com.google.gson.f;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
final class b extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final y f8806b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DateFormat f8807a;

    class a implements y {
        a() {
        }

        @Override // com.google.gson.y
        public x a(f fVar, TypeToken typeToken) {
            a aVar = null;
            if (typeToken.c() == Time.class) {
                return new b(aVar);
            }
            return null;
        }
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Time b(ca.a aVar) throws IOException {
        Time time;
        if (aVar.A0() == ca.b.NULL) {
            aVar.w0();
            return null;
        }
        String strY0 = aVar.y0();
        synchronized (this) {
            TimeZone timeZone = this.f8807a.getTimeZone();
            try {
                try {
                    time = new Time(this.f8807a.parse(strY0).getTime());
                } catch (ParseException e10) {
                    throw new r("Failed parsing '" + strY0 + "' as SQL Time; at path " + aVar.x(), e10);
                }
            } finally {
                this.f8807a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(ca.c cVar, Time time) throws IOException {
        String str;
        if (time == null) {
            cVar.S();
            return;
        }
        synchronized (this) {
            str = this.f8807a.format((Date) time);
        }
        cVar.B0(str);
    }

    private b() {
        this.f8807a = new SimpleDateFormat("hh:mm:ss a");
    }
}
