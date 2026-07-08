package ej;

import ej.j;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import kj.r0;
import yj.c0;

/* JADX INFO: loaded from: classes3.dex */
public class m implements b {

    /* JADX INFO: renamed from: a */
    private final gj.g f12704a;

    /* JADX INFO: renamed from: b */
    private final c0 f12705b;

    /* JADX INFO: renamed from: c */
    private final r0 f12706c;

    /* JADX INFO: renamed from: d */
    private final Map f12707d = new HashMap();

    /* JADX INFO: renamed from: e */
    private final Map f12708e = new HashMap();

    public m(gj.g gVar, c0 c0Var, r0 r0Var) {
        this.f12704a = gVar;
        this.f12705b = c0Var;
        this.f12706c = r0Var;
    }

    public static /* synthetic */ List b(String str) {
        return new ArrayList();
    }

    @Override // ej.b
    public c a() {
        return e("solar system barycenter");
    }

    public void c(String str, d dVar) {
        synchronized (this.f12707d) {
            ((List) Map.EL.computeIfAbsent(this.f12707d, str, new Function() { // from class: ej.l
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return m.b((String) obj);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            })).add(dVar);
        }
    }

    public void d(String str, String str2) {
        j jVar;
        j jVar2;
        if (str.equalsIgnoreCase("solar system barycenter")) {
            jVar = new j(str2, j.e.SOLAR_SYSTEM_BARYCENTER, this.f12704a, this.f12705b, this.f12706c);
        } else {
            if (str.equalsIgnoreCase("Sun")) {
                jVar2 = new j(str2, j.e.SUN, this.f12704a, this.f12705b, this.f12706c);
            } else if (str.equalsIgnoreCase("Mercury")) {
                jVar2 = new j(str2, j.e.MERCURY, this.f12704a, this.f12705b, this.f12706c);
            } else if (str.equalsIgnoreCase("Venus")) {
                jVar2 = new j(str2, j.e.VENUS, this.f12704a, this.f12705b, this.f12706c);
            } else if (str.equalsIgnoreCase("Earth-Moon barycenter")) {
                jVar2 = new j(str2, j.e.EARTH_MOON, this.f12704a, this.f12705b, this.f12706c);
            } else if (str.equalsIgnoreCase("Earth")) {
                jVar2 = new j(str2, j.e.EARTH, this.f12704a, this.f12705b, this.f12706c);
            } else if (str.equalsIgnoreCase("Moon")) {
                jVar2 = new j(str2, j.e.MOON, this.f12704a, this.f12705b, this.f12706c);
            } else if (str.equalsIgnoreCase("Mars")) {
                jVar2 = new j(str2, j.e.MARS, this.f12704a, this.f12705b, this.f12706c);
            } else if (str.equalsIgnoreCase("Jupiter")) {
                jVar2 = new j(str2, j.e.JUPITER, this.f12704a, this.f12705b, this.f12706c);
            } else if (str.equalsIgnoreCase("Saturn")) {
                jVar2 = new j(str2, j.e.SATURN, this.f12704a, this.f12705b, this.f12706c);
            } else if (str.equalsIgnoreCase("Uranus")) {
                jVar2 = new j(str2, j.e.URANUS, this.f12704a, this.f12705b, this.f12706c);
            } else if (str.equalsIgnoreCase("Neptune")) {
                jVar2 = new j(str2, j.e.NEPTUNE, this.f12704a, this.f12705b, this.f12706c);
            } else if (str.equalsIgnoreCase("Pluto")) {
                jVar2 = new j(str2, j.e.PLUTO, this.f12704a, this.f12705b, this.f12706c);
            } else {
                jVar = null;
            }
            jVar = jVar2;
        }
        if (jVar != null) {
            c(str, jVar);
        }
    }

    public c e(String str) {
        c cVarB;
        synchronized (this.f12708e) {
            cVarB = (c) this.f12708e.get(str);
            if (cVarB == null) {
                synchronized (this.f12707d) {
                    try {
                        List list = (List) this.f12707d.get(str);
                        if (list == null || list.isEmpty()) {
                            d(str, "^[lu]nx([mp](\\d\\d\\d\\d))+\\.(?:4\\d\\d)$");
                            d(str, "^inpop.*\\.dat$");
                            list = (List) this.f12707d.get(str);
                        }
                        Iterator it = list.iterator();
                        hj.a e10 = null;
                        while (it.hasNext()) {
                            try {
                                cVarB = ((d) it.next()).b(str);
                            } catch (hj.a e11) {
                                e10 = e11;
                            }
                            if (cVarB != null) {
                                break;
                            }
                        }
                        if (cVarB == null) {
                            if (e10 != null) {
                                throw e10;
                            }
                            throw new hj.a(hj.f.NO_DATA_LOADED_FOR_CELESTIAL_BODY, str);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f12708e.put(str, cVarB);
            }
        }
        return cVarB;
    }
}
