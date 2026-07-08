package j$.time.format;

import j$.util.Objects;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: e */
    public static final a f17521e;

    /* JADX INFO: renamed from: a */
    public final f f17522a;

    /* JADX INFO: renamed from: b */
    public final Locale f17523b;

    /* JADX INFO: renamed from: c */
    public final t f17524c;

    /* JADX INFO: renamed from: d */
    public final j$.time.chrono.m f17525d;

    static {
        o oVar = new o();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        v vVar = v.EXCEEDS_PAD;
        oVar.h(aVar, 4, 10, vVar);
        oVar.c('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        oVar.g(aVar2, 2);
        oVar.c('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        oVar.g(aVar3, 2);
        u uVar = u.STRICT;
        j$.time.chrono.t tVar = j$.time.chrono.t.f17501c;
        a aVarK = oVar.k(uVar, tVar);
        o oVar2 = new o();
        l lVar = l.INSENSITIVE;
        oVar2.b(lVar);
        oVar2.a(aVarK);
        k kVar = k.f17542e;
        oVar2.b(kVar);
        oVar2.k(uVar, tVar);
        o oVar3 = new o();
        oVar3.b(lVar);
        oVar3.a(aVarK);
        oVar3.j();
        oVar3.b(kVar);
        oVar3.k(uVar, tVar);
        o oVar4 = new o();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        oVar4.g(aVar4, 2);
        oVar4.c(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        oVar4.g(aVar5, 2);
        oVar4.j();
        oVar4.c(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        oVar4.g(aVar6, 2);
        oVar4.j();
        j$.time.temporal.a aVar7 = j$.time.temporal.a.NANO_OF_SECOND;
        h hVar = new h(aVar7, 0, 9, true, 0);
        Objects.requireNonNull(aVar7, "field");
        j$.time.temporal.u uVar2 = aVar7.f17612b;
        if (uVar2.f17637a != uVar2.f17638b || uVar2.f17639c != uVar2.f17640d) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar7);
        }
        oVar4.b(hVar);
        a aVarK2 = oVar4.k(uVar, null);
        o oVar5 = new o();
        oVar5.b(lVar);
        oVar5.a(aVarK2);
        oVar5.b(kVar);
        oVar5.k(uVar, null);
        o oVar6 = new o();
        oVar6.b(lVar);
        oVar6.a(aVarK2);
        oVar6.j();
        oVar6.b(kVar);
        oVar6.k(uVar, null);
        o oVar7 = new o();
        oVar7.b(lVar);
        oVar7.a(aVarK);
        oVar7.c('T');
        oVar7.a(aVarK2);
        a aVarK3 = oVar7.k(uVar, tVar);
        o oVar8 = new o();
        oVar8.b(lVar);
        oVar8.a(aVarK3);
        l lVar2 = l.LENIENT;
        oVar8.b(lVar2);
        oVar8.b(kVar);
        l lVar3 = l.STRICT;
        oVar8.b(lVar3);
        a aVarK4 = oVar8.k(uVar, tVar);
        o oVar9 = new o();
        oVar9.a(aVarK4);
        oVar9.j();
        oVar9.c('[');
        l lVar4 = l.SENSITIVE;
        oVar9.b(lVar4);
        oVar9.b(new i(1));
        oVar9.c(']');
        oVar9.k(uVar, tVar);
        o oVar10 = new o();
        oVar10.a(aVarK3);
        oVar10.j();
        oVar10.b(kVar);
        oVar10.j();
        oVar10.c('[');
        oVar10.b(lVar4);
        oVar10.b(new i(1));
        oVar10.c(']');
        oVar10.k(uVar, tVar);
        o oVar11 = new o();
        oVar11.b(lVar);
        oVar11.h(aVar, 4, 10, vVar);
        oVar11.c('-');
        oVar11.g(j$.time.temporal.a.DAY_OF_YEAR, 3);
        oVar11.j();
        oVar11.b(kVar);
        oVar11.k(uVar, tVar);
        o oVar12 = new o();
        oVar12.b(lVar);
        oVar12.h(j$.time.temporal.j.f17622c, 4, 10, vVar);
        oVar12.d("-W");
        oVar12.g(j$.time.temporal.j.f17621b, 2);
        oVar12.c('-');
        j$.time.temporal.a aVar8 = j$.time.temporal.a.DAY_OF_WEEK;
        oVar12.g(aVar8, 1);
        oVar12.j();
        oVar12.b(kVar);
        oVar12.k(uVar, tVar);
        o oVar13 = new o();
        oVar13.b(lVar);
        oVar13.b(new i(0));
        f17521e = oVar13.k(uVar, null);
        o oVar14 = new o();
        oVar14.b(lVar);
        oVar14.g(aVar, 4);
        oVar14.g(aVar2, 2);
        oVar14.g(aVar3, 2);
        oVar14.j();
        oVar14.b(lVar2);
        oVar14.b(new k("+HHMMss", "Z"));
        oVar14.b(lVar3);
        oVar14.k(uVar, tVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        o oVar15 = new o();
        oVar15.b(lVar);
        oVar15.b(lVar2);
        oVar15.j();
        oVar15.e(aVar8, map);
        oVar15.d(", ");
        oVar15.i();
        oVar15.h(aVar3, 1, 2, v.NOT_NEGATIVE);
        oVar15.c(' ');
        oVar15.e(aVar2, map2);
        oVar15.c(' ');
        oVar15.g(aVar, 4);
        oVar15.c(' ');
        oVar15.g(aVar4, 2);
        oVar15.c(':');
        oVar15.g(aVar5, 2);
        oVar15.j();
        oVar15.c(':');
        oVar15.g(aVar6, 2);
        oVar15.i();
        oVar15.c(' ');
        oVar15.b(new k("+HHMM", "GMT"));
        oVar15.k(u.SMART, tVar);
    }

    public a(f fVar, Locale locale, u uVar, j$.time.chrono.m mVar) {
        t tVar = t.f17566a;
        this.f17522a = (f) Objects.requireNonNull(fVar, "printerParser");
        this.f17523b = (Locale) Objects.requireNonNull(locale, "locale");
        this.f17524c = (t) Objects.requireNonNull(tVar, "decimalStyle");
        this.f17525d = mVar;
    }

    public final String toString() {
        String string = this.f17522a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
