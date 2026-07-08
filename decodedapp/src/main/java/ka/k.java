package ka;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class k extends ia.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f19566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o f19567e;

    public k(ia.c cVar, String str, o oVar, Map map) {
        super(cVar, str, map);
        this.f19566d = str;
        this.f19567e = oVar;
    }

    public o f() {
        return this.f19567e;
    }

    public q8.j g() {
        o oVar = this.f19567e;
        if (oVar == null) {
            return null;
        }
        return oVar.o();
    }

    public q8.m h() {
        o oVar = this.f19567e;
        if (oVar == null) {
            return null;
        }
        return oVar.p();
    }

    public q8.o i() {
        o oVar = this.f19567e;
        if (oVar == null) {
            return null;
        }
        return oVar.q();
    }

    public String toString() {
        return "Placemark{\n style id=" + this.f19566d + ",\n inline style=" + this.f19567e + "\n}\n";
    }
}
