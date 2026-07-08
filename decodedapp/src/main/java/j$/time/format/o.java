package j$.time.format;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f17552f = new b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f17553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f17554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f17555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17557e;

    static {
        HashMap map = new HashMap();
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.h hVar = j$.time.temporal.j.f17620a;
        map.put('Q', hVar);
        map.put('q', hVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.l.f17627a);
    }

    public o() {
        this.f17553a = this;
        this.f17555c = new ArrayList();
        this.f17557e = -1;
        this.f17554b = null;
        this.f17556d = false;
    }

    public o(o oVar) {
        this.f17553a = this;
        this.f17555c = new ArrayList();
        this.f17557e = -1;
        this.f17554b = oVar;
        this.f17556d = true;
    }

    public final void g(j$.time.temporal.q qVar, int i10) {
        Objects.requireNonNull(qVar, "field");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i10);
        }
        f(new j(qVar, i10, i10, v.NOT_NEGATIVE));
    }

    public final void h(j$.time.temporal.q qVar, int i10, int i11, v vVar) {
        if (i10 == i11 && vVar == v.NOT_NEGATIVE) {
            g(qVar, i11);
            return;
        }
        Objects.requireNonNull(qVar, "field");
        Objects.requireNonNull(vVar, "signStyle");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i10);
        }
        if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i11);
        }
        if (i11 < i10) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
        }
        f(new j(qVar, i10, i11, vVar));
    }

    public final void f(j jVar) {
        j jVarA;
        o oVar = this.f17553a;
        int i10 = oVar.f17557e;
        if (i10 < 0) {
            oVar.f17557e = b(jVar);
            return;
        }
        j jVar2 = (j) ((ArrayList) oVar.f17555c).get(i10);
        int i11 = jVar.f17537b;
        int i12 = jVar.f17538c;
        if (i11 == i12 && jVar.f17539d == v.NOT_NEGATIVE) {
            jVarA = jVar2.b(i12);
            b(jVar.a());
            this.f17553a.f17557e = i10;
        } else {
            jVarA = jVar2.a();
            this.f17553a.f17557e = b(jVar);
        }
        ((ArrayList) this.f17553a.f17555c).set(i10, jVarA);
    }

    public final void e(j$.time.temporal.a aVar, Map map) {
        Objects.requireNonNull(aVar, "field");
        Objects.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        w wVar = w.FULL;
        b(new n(aVar, wVar, new c(new s(0, Collections.singletonMap(wVar, linkedHashMap)))));
    }

    public final void c(char c10) {
        b(new e(c10));
    }

    public final void d(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            b(new e(str.charAt(0)));
        } else {
            b(new m(str));
        }
    }

    public final void a(a aVar) {
        Objects.requireNonNull(aVar, "formatter");
        f fVar = aVar.f17522a;
        if (fVar.f17532b) {
            fVar = new f(fVar.f17531a, false);
        }
        b(fVar);
    }

    public final void j() {
        o oVar = this.f17553a;
        oVar.f17557e = -1;
        this.f17553a = new o(oVar);
    }

    public final void i() {
        o oVar = this.f17553a;
        if (oVar.f17554b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (((ArrayList) oVar.f17555c).size() > 0) {
            o oVar2 = this.f17553a;
            f fVar = new f(oVar2.f17555c, oVar2.f17556d);
            this.f17553a = this.f17553a.f17554b;
            b(fVar);
            return;
        }
        this.f17553a = this.f17553a.f17554b;
    }

    public final int b(g gVar) {
        Objects.requireNonNull(gVar, "pp");
        o oVar = this.f17553a;
        oVar.getClass();
        ((ArrayList) oVar.f17555c).add(gVar);
        this.f17553a.f17557e = -1;
        return ((ArrayList) r2.f17555c).size() - 1;
    }

    public final a k(u uVar, j$.time.chrono.m mVar) {
        return l(Locale.getDefault(), uVar, mVar);
    }

    public final a l(Locale locale, u uVar, j$.time.chrono.m mVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.f17553a.f17554b != null) {
            i();
        }
        f fVar = new f(this.f17555c, false);
        t tVar = t.f17566a;
        return new a(fVar, locale, uVar, mVar);
    }
}
