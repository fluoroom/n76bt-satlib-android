package lg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f20584a;

    protected e(c cVar) {
        rd.m.e(cVar, "arrayMap");
        this.f20584a = cVar;
    }

    private final String f(c cVar, int i10, String str) {
        Object next;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Race condition happened, the size of ArrayMap is " + i10 + " but it isn't an `" + str + '`');
        sb2.append('\n');
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Type: ");
        sb3.append(cVar.getClass());
        sb2.append(sb3.toString());
        sb2.append('\n');
        StringBuilder sb4 = new StringBuilder();
        Map mapB = c().b();
        sb4.append("[");
        sb4.append('\n');
        ArrayList arrayList = new ArrayList(ed.q.v(cVar, 10));
        int i11 = 0;
        for (Object obj : cVar) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                ed.q.u();
            }
            Iterator it = mapB.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Number) ((Map.Entry) next).getValue()).intValue() == i11) {
                    break;
                }
            }
            sb4.append("  " + ((Map.Entry) next) + '[' + i11 + "]: " + obj);
            sb4.append('\n');
            arrayList.add(sb4);
            i11 = i12;
        }
        sb4.append("]");
        sb4.append('\n');
        sb2.append("Content: " + sb4.toString());
        sb2.append('\n');
        return sb2.toString();
    }

    @Override // lg.a
    protected final c b() {
        return this.f20584a;
    }

    @Override // lg.a
    protected final void d(String str, Object obj) {
        rd.m.e(str, "keyQualifiedName");
        rd.m.e(obj, "value");
        int iE = c().e(str);
        int iB = this.f20584a.b();
        if (iB == 0) {
            c cVar = this.f20584a;
            if (!(cVar instanceof i)) {
                throw new IllegalStateException(f(cVar, 0, "EmptyArrayMap"));
            }
            this.f20584a = new o(obj, iE);
            return;
        }
        if (iB == 1) {
            c cVar2 = this.f20584a;
            try {
                rd.m.c(cVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                o oVar = (o) cVar2;
                if (oVar.getIndex() == iE) {
                    this.f20584a = new o(obj, iE);
                    return;
                } else {
                    d dVar = new d();
                    dVar.c(oVar.getIndex(), oVar.d());
                    this.f20584a = dVar;
                }
            } catch (ClassCastException e10) {
                throw new IllegalStateException(f(cVar2, 1, "OneElementArrayMap"), e10);
            }
        }
        this.f20584a.c(iE, obj);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e() {
        i iVar = i.f20597a;
        rd.m.c(iVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this(iVar);
    }
}
