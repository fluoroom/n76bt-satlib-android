package androidx.lifecycle;

import androidx.lifecycle.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import m.b;

/* JADX INFO: loaded from: classes.dex */
public class v extends m {

    /* JADX INFO: renamed from: k */
    public static final a f2685k = new a(null);

    /* JADX INFO: renamed from: b */
    private final boolean f2686b;

    /* JADX INFO: renamed from: c */
    private m.a f2687c;

    /* JADX INFO: renamed from: d */
    private m.b f2688d;

    /* JADX INFO: renamed from: e */
    private final WeakReference f2689e;

    /* JADX INFO: renamed from: f */
    private int f2690f;

    /* JADX INFO: renamed from: g */
    private boolean f2691g;

    /* JADX INFO: renamed from: h */
    private boolean f2692h;

    /* JADX INFO: renamed from: i */
    private ArrayList f2693i;

    /* JADX INFO: renamed from: j */
    private final vg.a f2694j;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final m.b a(m.b bVar, m.b bVar2) {
            rd.m.e(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a */
        private m.b f2695a;

        /* JADX INFO: renamed from: b */
        private q f2696b;

        public b(s sVar, m.b bVar) {
            rd.m.e(bVar, "initialState");
            rd.m.b(sVar);
            this.f2696b = y.f(sVar);
            this.f2695a = bVar;
        }

        public final void a(t tVar, m.a aVar) {
            rd.m.e(aVar, "event");
            m.b bVarE = aVar.e();
            this.f2695a = v.f2685k.a(this.f2695a, bVarE);
            q qVar = this.f2696b;
            rd.m.b(tVar);
            qVar.k(tVar, aVar);
            this.f2695a = bVarE;
        }

        public final m.b b() {
            return this.f2695a;
        }
    }

    private v(t tVar, boolean z10) {
        this.f2686b = z10;
        this.f2687c = new m.a();
        m.b bVar = m.b.f2652b;
        this.f2688d = bVar;
        this.f2693i = new ArrayList();
        this.f2689e = new WeakReference(tVar);
        this.f2694j = vg.c.a(bVar);
    }

    private final void e(t tVar) {
        Iterator itDescendingIterator = this.f2687c.descendingIterator();
        rd.m.d(itDescendingIterator, "descendingIterator(...)");
        while (itDescendingIterator.hasNext() && !this.f2692h) {
            Map.Entry entry = (Map.Entry) itDescendingIterator.next();
            rd.m.b(entry);
            s sVar = (s) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f2688d) > 0 && !this.f2692h && this.f2687c.contains(sVar)) {
                m.a aVarA = m.a.Companion.a(bVar.b());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                m(aVarA.e());
                bVar.a(tVar, aVarA);
                l();
            }
        }
    }

    private final m.b f(s sVar) {
        b bVar;
        Map.Entry entryI = this.f2687c.i(sVar);
        m.b bVar2 = null;
        m.b bVarB = (entryI == null || (bVar = (b) entryI.getValue()) == null) ? null : bVar.b();
        if (!this.f2693i.isEmpty()) {
            bVar2 = (m.b) this.f2693i.get(r0.size() - 1);
        }
        a aVar = f2685k;
        return aVar.a(aVar.a(this.f2688d, bVarB), bVar2);
    }

    private final void g(String str) {
        if (!this.f2686b || x.a()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void h(t tVar) {
        b.d dVarD = this.f2687c.d();
        rd.m.d(dVarD, "iteratorWithAdditions(...)");
        while (dVarD.hasNext() && !this.f2692h) {
            Map.Entry entry = (Map.Entry) dVarD.next();
            s sVar = (s) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f2688d) < 0 && !this.f2692h && this.f2687c.contains(sVar)) {
                m(bVar.b());
                m.a aVarB = m.a.Companion.b(bVar.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(tVar, aVarB);
                l();
            }
        }
    }

    private final boolean j() {
        if (this.f2687c.size() == 0) {
            return true;
        }
        Map.Entry entryB = this.f2687c.b();
        rd.m.b(entryB);
        m.b bVarB = ((b) entryB.getValue()).b();
        Map.Entry entryE = this.f2687c.e();
        rd.m.b(entryE);
        m.b bVarB2 = ((b) entryE.getValue()).b();
        return bVarB == bVarB2 && this.f2688d == bVarB2;
    }

    private final void k(m.b bVar) {
        if (this.f2688d == bVar) {
            return;
        }
        w.a((t) this.f2689e.get(), this.f2688d, bVar);
        this.f2688d = bVar;
        if (this.f2691g || this.f2690f != 0) {
            this.f2692h = true;
            return;
        }
        this.f2691g = true;
        o();
        this.f2691g = false;
        if (this.f2688d == m.b.f2651a) {
            this.f2687c = new m.a();
        }
    }

    private final void l() {
        this.f2693i.remove(r0.size() - 1);
    }

    private final void m(m.b bVar) {
        this.f2693i.add(bVar);
    }

    private final void o() {
        t tVar = (t) this.f2689e.get();
        if (tVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!j()) {
            this.f2692h = false;
            m.b bVar = this.f2688d;
            Map.Entry entryB = this.f2687c.b();
            rd.m.b(entryB);
            if (bVar.compareTo(((b) entryB.getValue()).b()) < 0) {
                e(tVar);
            }
            Map.Entry entryE = this.f2687c.e();
            if (!this.f2692h && entryE != null && this.f2688d.compareTo(((b) entryE.getValue()).b()) > 0) {
                h(tVar);
            }
        }
        this.f2692h = false;
        this.f2694j.setValue(b());
    }

    @Override // androidx.lifecycle.m
    public void a(s sVar) {
        t tVar;
        rd.m.e(sVar, "observer");
        g("addObserver");
        m.b bVar = this.f2688d;
        m.b bVar2 = m.b.f2651a;
        if (bVar != bVar2) {
            bVar2 = m.b.f2652b;
        }
        b bVar3 = new b(sVar, bVar2);
        if (((b) this.f2687c.g(sVar, bVar3)) == null && (tVar = (t) this.f2689e.get()) != null) {
            boolean z10 = this.f2690f != 0 || this.f2691g;
            m.b bVarF = f(sVar);
            this.f2690f++;
            while (bVar3.b().compareTo(bVarF) < 0 && this.f2687c.contains(sVar)) {
                m(bVar3.b());
                m.a aVarB = m.a.Companion.b(bVar3.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(tVar, aVarB);
                l();
                bVarF = f(sVar);
            }
            if (!z10) {
                o();
            }
            this.f2690f--;
        }
    }

    @Override // androidx.lifecycle.m
    public m.b b() {
        return this.f2688d;
    }

    @Override // androidx.lifecycle.m
    public void d(s sVar) {
        rd.m.e(sVar, "observer");
        g("removeObserver");
        this.f2687c.h(sVar);
    }

    public void i(m.a aVar) {
        rd.m.e(aVar, "event");
        g("handleLifecycleEvent");
        k(aVar.e());
    }

    public void n(m.b bVar) {
        rd.m.e(bVar, "state");
        g("setCurrentState");
        k(bVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(t tVar) {
        this(tVar, true);
        rd.m.e(tVar, "provider");
    }
}
